package com.jjw.fellowshipgroups;

public class FellowshipGroup
{
    private String myLeaders;
    private String myAddress;
    private String myCity;
    private String myState;
    private String myZipCode;
    private String myTime;
    private String myDay;
    private String myDescription;

    /**
     * @return the leaders
     */
    public String getLeaders()
    {
        return myLeaders;
    }

    /**
     * @param leaders
     *            the leaders to set
     */
    public void setLeaders(String leaders)
    {
        myLeaders = leaders;
    }

    /**
     * @return the address
     */
    public String getAddress()
    {
        return myAddress;
    }

    /**
     * @param address
     *            the address to set
     */
    public void setAddress(String address)
    {
        myAddress = address;
    }

    /**
     * @return the city
     */
    public String getCity()
    {
        return myCity;
    }

    /**
     * @param city
     *            the city to set
     */
    public void setCity(String city)
    {
        myCity = city;
    }

    /**
     * @return the state
     */
    public String getState()
    {
        return myState;
    }

    /**
     * @param state
     *            the state to set
     */
    public void setState(String state)
    {
        myState = state;
    }

    /**
     * @return the zipCode
     */
    public String getZipCode()
    {
        return myZipCode;
    }

    /**
     * @param zipCode
     *            the zipCode to set
     */
    public void setZipCode(String zipCode)
    {
        myZipCode = zipCode;
    }

    /**
     * @return the time
     */
    public String getTime()
    {
        return myTime;
    }

    /**
     * @param time
     *            the time to set
     */
    public void setTime(String time)
    {
        myTime = time;
    }

    /**
     * @return the day
     */
    public String getDay()
    {
        return myDay;
    }

    /**
     * @param day
     *            the day to set
     */
    public void setDay(String day)
    {
        myDay = day;
    }

    /**
     * @return the description
     */
    public String getDescription()
    {
        return myDescription;
    }

    /**
     * @param description
     *            the description to set
     */
    public void setDescription(String description)
    {
        myDescription = description;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(myLeaders + "|");
        stringBuilder.append(myAddress + "|");
        stringBuilder.append(myCity + "|");
        stringBuilder.append(myState + "|");
        stringBuilder.append(myZipCode + "|");
        stringBuilder.append(myTime + "|");
        stringBuilder.append(myDay + "|");
        stringBuilder.append(myDescription);
        return stringBuilder.toString();
    }
}
