package com.wei.scheduler.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.wei.scheduler.domain.AnotherBean;
 
 
public class ScheduleJob extends QuartzJobBean{
 
     
    private AnotherBean anotherBean; 
     
     
    @Override
    protected void executeInternal(JobExecutionContext arg0)
            throws JobExecutionException {
        anotherBean.printAnotherMessage();
    }
 
    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }
}
