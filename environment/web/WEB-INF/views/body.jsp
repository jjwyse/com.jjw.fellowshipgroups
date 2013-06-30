<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript"
	src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCtn9azISRL41czGLC815R_2-ARMgExbzI&sensor=false"></script>

<div>
	<script type="text/javascript">
      /**
       * Initializes our Google Map
       */
      var geocoder;
      var map;
      function initialize()
      {
         var map_canvas = document.getElementById('map_canvas');
         geocoder = new google.maps.Geocoder();

         // Create an array of styles.
         var styles = [
         {
            stylers : [
            {
               hue : "#C01D2E"
            },
            {
               saturation : -20
            } ]
         },
         {
            featureType : "road",
            elementType : "geometry",
            stylers : [
            {
               lightness : 100
            },
            {
               visibility : "simplified"
            } ]
         },
         {
            featureType : "road",
            elementType : "labels",
            stylers : [
            {
               lightness : 50
            },
            {
               visibility : "simplified"
            } ]
         },
         {
            featureType : "poi.business",
            elementType : "labels",
            stylers : [
            {
               visibility : "off"
            } ]
         }
         ];

         // Create a new StyledMapType object, passing it the array of styles,
         // as well as the name to be displayed on the map type control.
         var fgMap = new google.maps.StyledMapType(styles,
         {
            name : "FG Map"
         });

         // The different maps that will show up in our drop down in the top right corner
         var types = [ 'map_fg', google.maps.MapTypeId.ROADMAP, google.maps.MapTypeId.HYBRID ];
         var map_options =
         {
            center : new google.maps.LatLng(39.7392, -104.9842),
            zoom : 13,
            mapTypeId : google.maps.MapTypeId.ROADMAP,
            mapTypeControl : true,
            mapTypeControlOptions :
            {
               style : google.maps.MapTypeControlStyle.DROPDOWN_MENU,
               mapTypeIds : types
            }
         };
         map = new google.maps.Map(map_canvas, map_options);

         //Associate the styled map with the MapTypeId and set it to display.
         map.mapTypes.set('map_fg', fgMap);
         map.setMapTypeId('map_fg');
      }

      /**
       * Adds a popup message to the marker
       */
      function attachInfoPopup(marker, message)
      {
         var infoWindow = new google.maps.InfoWindow(
         {
            content : '<div class="infoWindow">' + message + '</div>',
            size : new google.maps.Size(50, 50)
         });
         google.maps.event.addListener(marker, 'click', function()
         {
            infoWindow.open(map, marker);
         });
      }

      function addAllFellowshipGroups()
      {
         <c:forEach var="fellowshipGroup" items="${fellowshipGroups}">
         addFellowshipGroupMarker("${fellowshipGroup.address}", "${fellowshipGroup.leaders}", "${fellowshipGroup.day}",
               "${fellowshipGroup.time}");
         </c:forEach>
      }

      function addFellowshipGroupMarker(address, leaders, day, time)
      {
         geocoder.geocode(
         {
            'address' : address
         }, function(results, status)
         {
            if (status == google.maps.GeocoderStatus.OK)
            {
               var fgMarker = new google.maps.Marker(
               {
                  map : map,
                  position : results[0].geometry.location,
                  title : leaders
               });
               attachInfoPopup(fgMarker, leaders + "<br/>" + day + "<br/>" + time);
            }
            else
            {
               alert('Geocode was not successful for the following reason: ' + status);
            }
         });
      }

      // Initialize map on window load and setup fellowship groups
      google.maps.event.addDomListener(window, 'load', initialize);
      google.maps.event.addDomListener(window, 'load', addAllFellowshipGroups);
   </script>
</div>
