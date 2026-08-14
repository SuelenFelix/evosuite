package com.cg.freelanceapp.entities;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.cg.freelanceapp.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Boolean;

public class JobApplication_getAppliedDate_19509587803 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42510;

    public JobApplication_getAppliedDate_19509587803() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term42511 = new Long(1005731301559613328L);
        Long term42514 = new Long(4436561124357681867L);
        Long term42541 = new Long(7785246707179468138L);
        Long term42568 = new Long(-8533120697864087610L);
        ArrayList term42618 = new ArrayList();
        ((ArrayList) term42618).add((Object)null);
        ArrayList term42622 = new ArrayList();
        ((ArrayList) term42622).add((Object)null);
        ((ArrayList) term42622).add((Object)null);
        ((ArrayList) term42622).add((Object)null);
        ((ArrayList) term42622).add((Object)null);
        ((ArrayList) term42622).add((Object)null);
        ((ArrayList) term42622).add((Object)null);
        ((ArrayList) term42622).add((Object)null);
        ((ArrayList) term42622).add((Object)null);
        ArrayList term42626 = new ArrayList();
        ((ArrayList) term42626).add((Object)null);
        ((ArrayList) term42626).add((Object)null);
        ((ArrayList) term42626).add((Object)null);
        ArrayList term42635 = new ArrayList();
        Boolean term42639 = new Boolean(false);
        term42510 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term42513 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term42540 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term42567 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term42630 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42634 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term42641 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term42642 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term42643 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42647 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term42510, term42510.getClass(), "id", term42511);
        setField(term42513, term42513.getClass(), "id", term42514);
        setField(term42513, term42513.getClass(), "jobTitle", "IDmKgcRPdh");
        setField(term42513, term42513.getClass(), "jobDescription", "caxOjNGwiL");
        setField(term42540, term42540.getClass(), "id", term42541);
        setField(term42540, term42540.getClass(), "name", "JtJYkiGrDe");
        setField(term42540, term42540.getClass(), "description", "vkcceVjOTT");
        setField(term42513, term42513.getClass(), "skill", term42540);
        setField(term42567, term42567.getClass(), "id", term42568);
        setField(term42567, term42567.getClass(), "userName", "CYxqKIxVOo");
        setField(term42567, term42567.getClass(), "firstName", "YlBXwuYBDH");
        setField(term42567, term42567.getClass(), "lastName", "dxtSyZnIlU");
        setField(term42567, term42567.getClass(), "password", "REmxEjNVMr");
        setField(term42567, term42567.getClass(), "postedJobs", term42618);
        setField(term42567, term42567.getClass(), "feedbacks", term42622);
        setField(term42567, term42567.getClass(), "freelancers", term42626);
        setField(term42513, term42513.getClass(), "postedBy", term42567);
        setIntField(term42630, term42630.getClass(), "year", 2026);
        setShortField(term42630, term42630.getClass(), "month", (short) 8);
        setShortField(term42630, term42630.getClass(), "day", (short) 11);
        setField(term42513, term42513.getClass(), "postedDate", term42630);
        setField(term42634, term42634.getClass(), "id", null);
        setField(term42634, term42634.getClass(), "userName", null);
        setField(term42634, term42634.getClass(), "firstName", null);
        setField(term42634, term42634.getClass(), "lastName", null);
        setField(term42634, term42634.getClass(), "password", null);
        setField(term42634, term42634.getClass(), "appliedJobs", null);
        setField(term42634, term42634.getClass(), "feedbacks", null);
        setField(term42634, term42634.getClass(), "skills", null);
        setField(term42634, term42634.getClass(), "bookmarkedJobs", null);
        setField(term42513, term42513.getClass(), "awardedTo", term42634);
        setField(term42513, term42513.getClass(), "jobApplications", term42635);
        setField(term42513, term42513.getClass(), "active", term42639);
        setField(term42510, term42510.getClass(), "job", term42513);
        setField(term42641, term42641.getClass(), "id", null);
        setField(term42641, term42641.getClass(), "userName", null);
        setField(term42641, term42641.getClass(), "firstName", null);
        setField(term42641, term42641.getClass(), "lastName", null);
        setField(term42641, term42641.getClass(), "password", null);
        setField(term42641, term42641.getClass(), "appliedJobs", null);
        setField(term42641, term42641.getClass(), "feedbacks", null);
        setField(term42641, term42641.getClass(), "skills", null);
        setField(term42641, term42641.getClass(), "bookmarkedJobs", null);
        setField(term42510, term42510.getClass(), "freelancer", term42641);
        setIntField(term42643, term42643.getClass(), "year", 2026);
        setShortField(term42643, term42643.getClass(), "month", (short) 8);
        setShortField(term42643, term42643.getClass(), "day", (short) 11);
        setField(term42642, term42642.getClass(), "date", term42643);
        setByteField(term42647, term42647.getClass(), "hour", (byte) 13);
        setByteField(term42647, term42647.getClass(), "minute", (byte) 42);
        setByteField(term42647, term42647.getClass(), "second", (byte) 10);
        setIntField(term42647, term42647.getClass(), "nano", 134945000);
        setField(term42642, term42642.getClass(), "time", term42647);
        setField(term42510, term42510.getClass(), "appliedDate", term42642);
        setField(term42510, term42510.getClass(), "coverLetter", "WfovQKooYd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.JobApplication");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAppliedDate", argTypes, term42510, args);
    }

};


