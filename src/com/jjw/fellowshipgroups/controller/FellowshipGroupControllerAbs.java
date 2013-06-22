package com.jjw.fellowshipgroups.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.jjw.fellowshipgroups.FellowshipGroupConstants;
import com.jjw.fellowshipgroups.dao.FellowshipGroupDao;

public abstract class FellowshipGroupControllerAbs implements FellowshipGroupConstants
{
    @Autowired
    protected FellowshipGroupDao myFellowshipGroupDao;
}
