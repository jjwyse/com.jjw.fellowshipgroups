package com.jjw.fellowshipgroups.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.jjw.fellowshipgroups.FellowshipGroup;
import com.jjw.fellowshipgroups.FellowshipGroupConstants;
import com.jjw.fellowshipgroups.dao.FellowshipGroupDao;

public class FellowshipGroupDaoImpl implements FellowshipGroupDao, FellowshipGroupConstants
{
    Logger LOG = Logger.getLogger(FellowshipGroupDaoImpl.class);

    @Autowired
    JdbcTemplate myJdbcTemplate;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<FellowshipGroup> getGroups()
    {
        LOG.info("Retrieving all of the current Fellowship Groups");

        String sql = "SELECT * FROM FDC_FELLOWSHIP_GROUPS";
        LOG.trace(sql);

        List<FellowshipGroup> fellowshipGroups = myJdbcTemplate.query(sql, new FellowshipGroupRowMapper());
        if (LOG.isDebugEnabled())
        {
            for (FellowshipGroup fg : fellowshipGroups)
            {
                LOG.debug("FellowshipGroup: " + fg);
            }
        }

        return fellowshipGroups;
    }

    /**
     * Maps our FellowshipGroup object to our SQL query
     * 
     * @author jjwyse
     * 
     */
    private static final class FellowshipGroupRowMapper implements RowMapper<FellowshipGroup>
    {
        @Override
        public FellowshipGroup mapRow(ResultSet resultSet, int rowNumber) throws SQLException
        {
            FellowshipGroup fg = new FellowshipGroup();
            fg.setLeaders(resultSet.getString(LEADERS_ROW));
            fg.setAddress(resultSet.getString(ADDRESS_ROW));
            fg.setCity(resultSet.getString(CITY_ROW));
            fg.setState(resultSet.getString(STATE_ROW));
            fg.setZipCode(resultSet.getString(ZIP_CODE_ROW));
            fg.setTime(resultSet.getString(TIME_ROW));
            fg.setDay(resultSet.getString(DAY_ROW));
            fg.setDescription(resultSet.getString(DESCRIPTION_ROW));
            return fg;
        }
    }
}
