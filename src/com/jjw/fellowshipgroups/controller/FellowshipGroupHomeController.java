package com.jjw.fellowshipgroups.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FellowshipGroupHomeController extends FellowshipGroupControllerAbs
{
    Logger LOG = Logger.getLogger(FellowshipGroupHomeController.class);

    @RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
    public String showHomePage(Map<String, Object> model)
    {
        LOG.info("Handling request in HomeController");
        model.put(FELLOWSHIP_GROUPS, myFellowshipGroupDao.getGroups());

        return HOME;
    }
}
