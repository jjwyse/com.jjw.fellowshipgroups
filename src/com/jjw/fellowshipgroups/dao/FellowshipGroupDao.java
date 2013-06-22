package com.jjw.fellowshipgroups.dao;

import java.util.List;

import com.jjw.fellowshipgroups.FellowshipGroup;

public interface FellowshipGroupDao
{
    /**
     * Returns all of the fellowship groups we have stored
     * 
     * @return All of the fellowship groups in our data store
     */
    public List<FellowshipGroup> getGroups();
}
