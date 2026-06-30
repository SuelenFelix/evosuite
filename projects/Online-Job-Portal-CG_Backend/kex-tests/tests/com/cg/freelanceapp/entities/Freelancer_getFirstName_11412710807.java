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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;

public class Freelancer_getFirstName_11412710807 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48462;

    public Freelancer_getFirstName_11412710807() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term48463 = new Long(1215808904367462472L);
        Long term48516 = new Long(-704693644895739566L);
        Long term48519 = new Long(-1313457120498071668L);
        Boolean term48521 = new Boolean(true);
        Object term48515 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term48518 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term48523 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term48524 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term48515, term48515.getClass(), "id", term48516);
        setField(term48518, term48518.getClass(), "id", term48519);
        setField(term48518, term48518.getClass(), "jobTitle", null);
        setField(term48518, term48518.getClass(), "jobDescription", null);
        setField(term48518, term48518.getClass(), "skill", null);
        setField(term48518, term48518.getClass(), "postedBy", null);
        setField(term48518, term48518.getClass(), "postedDate", null);
        setField(term48518, term48518.getClass(), "awardedTo", null);
        setField(term48518, term48518.getClass(), "jobApplications", null);
        setField(term48518, term48518.getClass(), "active", term48521);
        setField(term48515, term48515.getClass(), "job", term48518);
        setField(term48523, term48523.getClass(), "id", null);
        setField(term48523, term48523.getClass(), "userName", null);
        setField(term48523, term48523.getClass(), "firstName", null);
        setField(term48523, term48523.getClass(), "lastName", null);
        setField(term48523, term48523.getClass(), "password", null);
        setField(term48523, term48523.getClass(), "appliedJobs", null);
        setField(term48523, term48523.getClass(), "feedbacks", null);
        setField(term48523, term48523.getClass(), "skills", null);
        setField(term48523, term48523.getClass(), "bookmarkedJobs", null);
        setField(term48515, term48515.getClass(), "freelancer", term48523);
        setField(term48524, term48524.getClass(), "date", null);
        setField(term48524, term48524.getClass(), "time", null);
        setField(term48515, term48515.getClass(), "appliedDate", term48524);
        setField(term48515, term48515.getClass(), "coverLetter", "");
        Long term48527 = new Long(-1364659077154729258L);
        Object term48526 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term48529 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term48530 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term48526, term48526.getClass(), "id", term48527);
        setField(term48529, term48529.getClass(), "id", null);
        setField(term48529, term48529.getClass(), "jobTitle", null);
        setField(term48529, term48529.getClass(), "jobDescription", null);
        setField(term48529, term48529.getClass(), "skill", null);
        setField(term48529, term48529.getClass(), "postedBy", null);
        setField(term48529, term48529.getClass(), "postedDate", null);
        setField(term48529, term48529.getClass(), "awardedTo", null);
        setField(term48529, term48529.getClass(), "jobApplications", null);
        setField(term48529, term48529.getClass(), "active", null);
        setField(term48526, term48526.getClass(), "job", term48529);
        setField(term48526, term48526.getClass(), "freelancer", term48523);
        setField(term48530, term48530.getClass(), "date", null);
        setField(term48530, term48530.getClass(), "time", null);
        setField(term48526, term48526.getClass(), "appliedDate", term48530);
        setField(term48526, term48526.getClass(), "coverLetter", "");
        ArrayList term48513 = new ArrayList();
        ((ArrayList) term48513).add(term48515);
        ((ArrayList) term48513).add(term48526);
        Object term48536 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term48536, term48536.getClass(), "id", null);
        setField(term48536, term48536.getClass(), "ranges", null);
        setField(term48536, term48536.getClass(), "comments", null);
        setField(term48536, term48536.getClass(), "createdBy", null);
        setField(term48536, term48536.getClass(), "createdFor", null);
        Object term48537 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term48537, term48537.getClass(), "id", null);
        setField(term48537, term48537.getClass(), "ranges", null);
        setField(term48537, term48537.getClass(), "comments", null);
        setField(term48537, term48537.getClass(), "createdBy", null);
        setField(term48537, term48537.getClass(), "createdFor", null);
        Object term48538 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term48538, term48538.getClass(), "id", null);
        setField(term48538, term48538.getClass(), "ranges", null);
        setField(term48538, term48538.getClass(), "comments", null);
        setField(term48538, term48538.getClass(), "createdBy", null);
        setField(term48538, term48538.getClass(), "createdFor", null);
        Object term48539 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term48539, term48539.getClass(), "id", null);
        setField(term48539, term48539.getClass(), "ranges", null);
        setField(term48539, term48539.getClass(), "comments", null);
        setField(term48539, term48539.getClass(), "createdBy", null);
        setField(term48539, term48539.getClass(), "createdFor", null);
        Object term48540 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term48540, term48540.getClass(), "id", null);
        setField(term48540, term48540.getClass(), "ranges", null);
        setField(term48540, term48540.getClass(), "comments", null);
        setField(term48540, term48540.getClass(), "createdBy", null);
        setField(term48540, term48540.getClass(), "createdFor", null);
        ArrayList term48534 = new ArrayList();
        ((ArrayList) term48534).add(term48536);
        ((ArrayList) term48534).add(term48537);
        ((ArrayList) term48534).add(term48538);
        ((ArrayList) term48534).add(term48539);
        ((ArrayList) term48534).add(term48537);
        ((ArrayList) term48534).add(term48540);
        Object term48545 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term48545, term48545.getClass(), "id", null);
        setField(term48545, term48545.getClass(), "skill", null);
        setField(term48545, term48545.getClass(), "years", null);
        setField(term48545, term48545.getClass(), "freelancer", null);
        ArrayList term48543 = new ArrayList();
        ((ArrayList) term48543).add(term48545);
        ArrayList term48548 = new ArrayList();
        term48462 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term48462, term48462.getClass(), "id", term48463);
        setField(term48462, term48462.getClass(), "userName", "XWfTNLgUUn");
        setField(term48462, term48462.getClass(), "firstName", "gsUmKVKOac");
        setField(term48462, term48462.getClass(), "lastName", "TXxuyKOVBs");
        setField(term48462, term48462.getClass(), "password", "ZdokwWCVab");
        setField(term48462, term48462.getClass(), "appliedJobs", term48513);
        setField(term48462, term48462.getClass(), "feedbacks", term48534);
        setField(term48462, term48462.getClass(), "skills", term48543);
        setField(term48462, term48462.getClass(), "bookmarkedJobs", term48548);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Freelancer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term48462, args);
    }

};


