package edu.cooper.model;

import java.util.*;

public class Group {
    private final String gname;
    private final Long gid;
    private static Long count = 0L;
    private Long adminid;
    private List<Long> uidList;
    private List<Event> eventList;

    public Group(String gname, Long adminid){
        this.gname = gname;
        this.gid = ++count;
        this.adminid = adminid;
        this.uidList = new ArrayList<>();
        this.eventList = new ArrayList<>();
    }

    public Long getGid() {return gid;}

    public String getGname() {return gname;}

    public Long getAdminid() {return adminid;}

    public List<Event> getEventList() {return eventList;}

    public void setAdminid(Long adminid) {
        this.adminid = adminid;
    }

    public void addEvent2Group(Event event){
        this.eventList.add(event);
    }

    public String toString(){
        return Long.toString(gid) + " " + gname + " " + adminid + "\r\n";
    }

    public void addUser(Long uid) {uidList.add(uid);}

    public Event getEventByEname(String ename){
        Iterator<Event> itr = eventList.iterator();
        while(itr.hasNext()){
            Event etemp = itr.next();
            if(ename.compareTo(etemp.getEname()) == 0)
                return etemp;

        }
        return null;

    }
}
