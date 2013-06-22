<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

<div>
	<table>
		<tr>
			<th class="menuBtn" id="sundayBtn">Sunday</th>
			<th class="menuBtn" id="mondayBtn">Monday</th>
			<th class="menuBtn" id="tuesdayBtn">Tuesday</th>
			<th class="menuBtn" id="wednesdayBtn">Wednesday</th>
			<th class="menuBtn" id="thursdayBtn">Thursday</th>
			<th class="menuBtn" id="fridayBtn">Friday</th>
			<th class="menuBtn" id="saturdayBtn">Saturday</th>
		</tr>
	</table>
</div>
<script>
   $(document).ready(function()
   {
      $(".menuBtn").click(function()
      {
         $(this).toggleClass("unclicked");
      });
   });
</script>
