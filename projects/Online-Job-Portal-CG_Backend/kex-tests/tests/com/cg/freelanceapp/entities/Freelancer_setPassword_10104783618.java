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
import java.lang.Integer;

public class Freelancer_setPassword_10104783618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50214;

    public Freelancer_setPassword_10104783618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term50215 = new Long(4917355461922151401L);
        Long term50268 = new Long(5126048982960271034L);
        Long term50271 = new Long(-4488468552292064158L);
        Boolean term50273 = new Boolean(true);
        Object term50267 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term50270 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term50275 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term50276 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term50267, term50267.getClass(), "id", term50268);
        setField(term50270, term50270.getClass(), "id", term50271);
        setField(term50270, term50270.getClass(), "jobTitle", null);
        setField(term50270, term50270.getClass(), "jobDescription", null);
        setField(term50270, term50270.getClass(), "skill", null);
        setField(term50270, term50270.getClass(), "postedBy", null);
        setField(term50270, term50270.getClass(), "postedDate", null);
        setField(term50270, term50270.getClass(), "awardedTo", null);
        setField(term50270, term50270.getClass(), "jobApplications", null);
        setField(term50270, term50270.getClass(), "active", term50273);
        setField(term50267, term50267.getClass(), "job", term50270);
        setField(term50275, term50275.getClass(), "id", null);
        setField(term50275, term50275.getClass(), "userName", null);
        setField(term50275, term50275.getClass(), "firstName", null);
        setField(term50275, term50275.getClass(), "lastName", null);
        setField(term50275, term50275.getClass(), "password", null);
        setField(term50275, term50275.getClass(), "appliedJobs", null);
        setField(term50275, term50275.getClass(), "feedbacks", null);
        setField(term50275, term50275.getClass(), "skills", null);
        setField(term50275, term50275.getClass(), "bookmarkedJobs", null);
        setField(term50267, term50267.getClass(), "freelancer", term50275);
        setField(term50276, term50276.getClass(), "date", null);
        setField(term50276, term50276.getClass(), "time", null);
        setField(term50267, term50267.getClass(), "appliedDate", term50276);
        setField(term50267, term50267.getClass(), "coverLetter", "");
        ArrayList term50265 = new ArrayList();
        ((ArrayList) term50265).add(term50267);
        Object term50282 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term50282, term50282.getClass(), "id", null);
        setField(term50282, term50282.getClass(), "ranges", null);
        setField(term50282, term50282.getClass(), "comments", null);
        setField(term50282, term50282.getClass(), "createdBy", null);
        setField(term50282, term50282.getClass(), "createdFor", null);
        Object term50283 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term50283, term50283.getClass(), "id", null);
        setField(term50283, term50283.getClass(), "ranges", null);
        setField(term50283, term50283.getClass(), "comments", null);
        setField(term50283, term50283.getClass(), "createdBy", null);
        setField(term50283, term50283.getClass(), "createdFor", null);
        Object term50284 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term50284, term50284.getClass(), "id", null);
        setField(term50284, term50284.getClass(), "ranges", null);
        setField(term50284, term50284.getClass(), "comments", null);
        setField(term50284, term50284.getClass(), "createdBy", null);
        setField(term50284, term50284.getClass(), "createdFor", null);
        Object term50285 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term50285, term50285.getClass(), "id", null);
        setField(term50285, term50285.getClass(), "ranges", null);
        setField(term50285, term50285.getClass(), "comments", null);
        setField(term50285, term50285.getClass(), "createdBy", null);
        setField(term50285, term50285.getClass(), "createdFor", null);
        ArrayList term50280 = new ArrayList();
        ((ArrayList) term50280).add(term50282);
        ((ArrayList) term50280).add(term50282);
        ((ArrayList) term50280).add(term50283);
        ((ArrayList) term50280).add(term50284);
        ((ArrayList) term50280).add(term50285);
        Object term50290 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term50290, term50290.getClass(), "id", null);
        setField(term50290, term50290.getClass(), "skill", null);
        setField(term50290, term50290.getClass(), "years", null);
        setField(term50290, term50290.getClass(), "freelancer", null);
        Long term50292 = new Long(9062896455418114747L);
        Long term50295 = new Long(-8086388453710964051L);
        Integer term50297 = new Integer(-1473876284);
        Long term50300 = new Long(-3750581829569626962L);
        Object term50291 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        Object term50294 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term50299 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term50291, term50291.getClass(), "id", term50292);
        setField(term50294, term50294.getClass(), "id", term50295);
        setField(term50294, term50294.getClass(), "name", null);
        setField(term50294, term50294.getClass(), "description", null);
        setField(term50291, term50291.getClass(), "skill", term50294);
        setField(term50291, term50291.getClass(), "years", term50297);
        setField(term50299, term50299.getClass(), "id", term50300);
        setField(term50299, term50299.getClass(), "userName", null);
        setField(term50299, term50299.getClass(), "firstName", null);
        setField(term50299, term50299.getClass(), "lastName", null);
        setField(term50299, term50299.getClass(), "password", null);
        setField(term50299, term50299.getClass(), "appliedJobs", null);
        setField(term50299, term50299.getClass(), "feedbacks", null);
        setField(term50299, term50299.getClass(), "skills", null);
        setField(term50299, term50299.getClass(), "bookmarkedJobs", null);
        setField(term50291, term50291.getClass(), "freelancer", term50299);
        Object term50302 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term50302, term50302.getClass(), "id", null);
        setField(term50302, term50302.getClass(), "skill", null);
        setField(term50302, term50302.getClass(), "years", null);
        setField(term50302, term50302.getClass(), "freelancer", null);
        Object term50303 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term50303, term50303.getClass(), "id", null);
        setField(term50303, term50303.getClass(), "skill", null);
        setField(term50303, term50303.getClass(), "years", null);
        setField(term50303, term50303.getClass(), "freelancer", null);
        ArrayList term50288 = new ArrayList();
        ((ArrayList) term50288).add(term50290);
        ((ArrayList) term50288).add(term50291);
        ((ArrayList) term50288).add(term50302);
        ((ArrayList) term50288).add(term50303);
        ((ArrayList) term50288).add(term50302);
        ((ArrayList) term50288).add(term50302);
        ArrayList term50306 = new ArrayList();
        term50214 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term50214, term50214.getClass(), "id", term50215);
        setField(term50214, term50214.getClass(), "userName", "gIhnDwhYPA");
        setField(term50214, term50214.getClass(), "firstName", "CHKxCaDYeL");
        setField(term50214, term50214.getClass(), "lastName", "pltMgQSnCb");
        setField(term50214, term50214.getClass(), "password", "RiGoJoBvZO");
        setField(term50214, term50214.getClass(), "appliedJobs", term50265);
        setField(term50214, term50214.getClass(), "feedbacks", term50280);
        setField(term50214, term50214.getClass(), "skills", term50288);
        setField(term50214, term50214.getClass(), "bookmarkedJobs", term50306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Freelancer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "blJZUhevsA";
        callMethod(klass, "setPassword", argTypes, term50214, args);
    }

};


