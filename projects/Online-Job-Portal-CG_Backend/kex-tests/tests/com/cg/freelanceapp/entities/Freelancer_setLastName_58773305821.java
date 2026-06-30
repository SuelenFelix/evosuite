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

public class Freelancer_setLastName_58773305821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28360;

    public Freelancer_setLastName_58773305821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28361 = new Long(-4478220735678972814L);
        Long term28414 = new Long(-4676429852031489895L);
        Long term28417 = new Long(8184501842173410052L);
        Boolean term28419 = new Boolean(false);
        Long term28422 = new Long(1123295401008598438L);
        Object term28413 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term28416 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term28421 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term28424 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28413, term28413.getClass(), "id", term28414);
        setField(term28416, term28416.getClass(), "id", term28417);
        setField(term28416, term28416.getClass(), "jobTitle", null);
        setField(term28416, term28416.getClass(), "jobDescription", null);
        setField(term28416, term28416.getClass(), "skill", null);
        setField(term28416, term28416.getClass(), "postedBy", null);
        setField(term28416, term28416.getClass(), "postedDate", null);
        setField(term28416, term28416.getClass(), "awardedTo", null);
        setField(term28416, term28416.getClass(), "jobApplications", null);
        setField(term28416, term28416.getClass(), "active", term28419);
        setField(term28413, term28413.getClass(), "job", term28416);
        setField(term28421, term28421.getClass(), "id", term28422);
        setField(term28421, term28421.getClass(), "userName", null);
        setField(term28421, term28421.getClass(), "firstName", null);
        setField(term28421, term28421.getClass(), "lastName", null);
        setField(term28421, term28421.getClass(), "password", null);
        setField(term28421, term28421.getClass(), "appliedJobs", null);
        setField(term28421, term28421.getClass(), "feedbacks", null);
        setField(term28421, term28421.getClass(), "skills", null);
        setField(term28421, term28421.getClass(), "bookmarkedJobs", null);
        setField(term28413, term28413.getClass(), "freelancer", term28421);
        setField(term28424, term28424.getClass(), "date", null);
        setField(term28424, term28424.getClass(), "time", null);
        setField(term28413, term28413.getClass(), "appliedDate", term28424);
        setField(term28413, term28413.getClass(), "coverLetter", "");
        Object term28426 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term28427 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28426, term28426.getClass(), "id", null);
        setField(term28426, term28426.getClass(), "job", null);
        setField(term28426, term28426.getClass(), "freelancer", null);
        setField(term28427, term28427.getClass(), "date", null);
        setField(term28427, term28427.getClass(), "time", null);
        setField(term28426, term28426.getClass(), "appliedDate", term28427);
        setField(term28426, term28426.getClass(), "coverLetter", null);
        ArrayList term28411 = new ArrayList();
        ((ArrayList) term28411).add(term28413);
        ((ArrayList) term28411).add(term28426);
        Object term28432 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term28432, term28432.getClass(), "id", null);
        setField(term28432, term28432.getClass(), "ranges", null);
        setField(term28432, term28432.getClass(), "comments", null);
        setField(term28432, term28432.getClass(), "createdBy", null);
        setField(term28432, term28432.getClass(), "createdFor", null);
        Object term28433 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term28433, term28433.getClass(), "id", null);
        setField(term28433, term28433.getClass(), "ranges", null);
        setField(term28433, term28433.getClass(), "comments", null);
        setField(term28433, term28433.getClass(), "createdBy", null);
        setField(term28433, term28433.getClass(), "createdFor", null);
        Object term28434 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term28434, term28434.getClass(), "id", null);
        setField(term28434, term28434.getClass(), "ranges", null);
        setField(term28434, term28434.getClass(), "comments", null);
        setField(term28434, term28434.getClass(), "createdBy", null);
        setField(term28434, term28434.getClass(), "createdFor", null);
        Object term28435 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term28435, term28435.getClass(), "id", null);
        setField(term28435, term28435.getClass(), "ranges", null);
        setField(term28435, term28435.getClass(), "comments", null);
        setField(term28435, term28435.getClass(), "createdBy", null);
        setField(term28435, term28435.getClass(), "createdFor", null);
        Object term28436 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term28436, term28436.getClass(), "id", null);
        setField(term28436, term28436.getClass(), "ranges", null);
        setField(term28436, term28436.getClass(), "comments", null);
        setField(term28436, term28436.getClass(), "createdBy", null);
        setField(term28436, term28436.getClass(), "createdFor", null);
        ArrayList term28430 = new ArrayList();
        ((ArrayList) term28430).add(term28432);
        ((ArrayList) term28430).add(term28433);
        ((ArrayList) term28430).add(term28434);
        ((ArrayList) term28430).add(term28435);
        ((ArrayList) term28430).add(term28435);
        ((ArrayList) term28430).add(term28436);
        ArrayList term28439 = new ArrayList();
        ArrayList term28443 = new ArrayList();
        term28360 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term28360, term28360.getClass(), "id", term28361);
        setField(term28360, term28360.getClass(), "userName", "IXQAKAMGZv");
        setField(term28360, term28360.getClass(), "firstName", "gNywlVTWoX");
        setField(term28360, term28360.getClass(), "lastName", "YurkNSyZwK");
        setField(term28360, term28360.getClass(), "password", "nHiRqjNeSG");
        setField(term28360, term28360.getClass(), "appliedJobs", term28411);
        setField(term28360, term28360.getClass(), "feedbacks", term28430);
        setField(term28360, term28360.getClass(), "skills", term28439);
        setField(term28360, term28360.getClass(), "bookmarkedJobs", term28443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Freelancer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NgJJQVugOQ";
        callMethod(klass, "setLastName", argTypes, term28360, args);
    }

};


