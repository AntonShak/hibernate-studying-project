package com.shakov.listener;

import com.shakov.entity.Revision;
import org.hibernate.envers.RevisionListener;

public class DmdevRevisionListener implements RevisionListener {

    @Override
    public void newRevision(Object revisionEntity) {
//        SecurityContext.getUser().getId()
        ((Revision) revisionEntity).setUsername("dmdev");
    }
}
