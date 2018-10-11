package com.company.service.handlers;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;
import org.springframework.stereotype.Component;

@Component("MyTask")
public class MyTaskWorkItemHandler implements WorkItemHandler {

    @Override
    public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
        System.out.println("Work item being executed " + workItem);
        manager.completeWorkItem(workItem.getId(), null);
    }

    @Override
    public void abortWorkItem(WorkItem workItem, WorkItemManager manager) {

    }

}
