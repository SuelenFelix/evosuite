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

public class BookmarkedJob_setSkill_188512279110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16101;
     Object term16266;

    public BookmarkedJob_setSkill_188512279110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16102 = new Long(-4502190204332677735L);
        Long term16105 = new Long(4165201970048882126L);
        Long term16132 = new Long(1713132989163348687L);
        Long term16159 = new Long(4782360695691953108L);
        Long term16186 = new Long(5499210513338318618L);
        ArrayList term16236 = new ArrayList();
        ((ArrayList) term16236).add((Object)null);
        ((ArrayList) term16236).add((Object)null);
        ((ArrayList) term16236).add((Object)null);
        ArrayList term16240 = new ArrayList();
        ((ArrayList) term16240).add((Object)null);
        ((ArrayList) term16240).add((Object)null);
        ((ArrayList) term16240).add((Object)null);
        ((ArrayList) term16240).add((Object)null);
        ((ArrayList) term16240).add((Object)null);
        ((ArrayList) term16240).add((Object)null);
        ArrayList term16244 = new ArrayList();
        ((ArrayList) term16244).add((Object)null);
        ((ArrayList) term16244).add((Object)null);
        ((ArrayList) term16244).add((Object)null);
        Long term16256 = new Long(-8891224677821082964L);
        Object term16255 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        setField(term16255, term16255.getClass(), "id", term16256);
        setField(term16255, term16255.getClass(), "job", null);
        setField(term16255, term16255.getClass(), "freelancer", null);
        setField(term16255, term16255.getClass(), "appliedDate", null);
        setField(term16255, term16255.getClass(), "coverLetter", null);
        Long term16259 = new Long(6501798712124759765L);
        Object term16258 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        setField(term16258, term16258.getClass(), "id", term16259);
        setField(term16258, term16258.getClass(), "job", null);
        setField(term16258, term16258.getClass(), "freelancer", null);
        setField(term16258, term16258.getClass(), "appliedDate", null);
        setField(term16258, term16258.getClass(), "coverLetter", null);
        ArrayList term16253 = new ArrayList();
        ((ArrayList) term16253).add(term16255);
        ((ArrayList) term16253).add(term16258);
        Boolean term16263 = new Boolean(true);
        term16101 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        Object term16104 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term16131 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term16158 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term16185 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term16248 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16252 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term16265 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term16101, term16101.getClass(), "id", term16102);
        setField(term16104, term16104.getClass(), "id", term16105);
        setField(term16104, term16104.getClass(), "name", "fHyUJhfoxR");
        setField(term16104, term16104.getClass(), "description", "CgnkREXVNP");
        setField(term16101, term16101.getClass(), "skill", term16104);
        setField(term16131, term16131.getClass(), "id", term16132);
        setField(term16131, term16131.getClass(), "jobTitle", "mBAKehIGeW");
        setField(term16131, term16131.getClass(), "jobDescription", "tmiPUgRXrn");
        setField(term16158, term16158.getClass(), "id", term16159);
        setField(term16158, term16158.getClass(), "name", "VuZmwqnade");
        setField(term16158, term16158.getClass(), "description", "ohZrjboUnX");
        setField(term16131, term16131.getClass(), "skill", term16158);
        setField(term16185, term16185.getClass(), "id", term16186);
        setField(term16185, term16185.getClass(), "userName", "rwlrpQuNrG");
        setField(term16185, term16185.getClass(), "firstName", "fctYGLXetS");
        setField(term16185, term16185.getClass(), "lastName", "UPbgrEUWQD");
        setField(term16185, term16185.getClass(), "password", "HABnTZidNp");
        setField(term16185, term16185.getClass(), "postedJobs", term16236);
        setField(term16185, term16185.getClass(), "feedbacks", term16240);
        setField(term16185, term16185.getClass(), "freelancers", term16244);
        setField(term16131, term16131.getClass(), "postedBy", term16185);
        setIntField(term16248, term16248.getClass(), "year", 2026);
        setShortField(term16248, term16248.getClass(), "month", (short) 8);
        setShortField(term16248, term16248.getClass(), "day", (short) 11);
        setField(term16131, term16131.getClass(), "postedDate", term16248);
        setField(term16252, term16252.getClass(), "id", null);
        setField(term16252, term16252.getClass(), "userName", null);
        setField(term16252, term16252.getClass(), "firstName", null);
        setField(term16252, term16252.getClass(), "lastName", null);
        setField(term16252, term16252.getClass(), "password", null);
        setField(term16252, term16252.getClass(), "appliedJobs", null);
        setField(term16252, term16252.getClass(), "feedbacks", null);
        setField(term16252, term16252.getClass(), "skills", null);
        setField(term16252, term16252.getClass(), "bookmarkedJobs", null);
        setField(term16131, term16131.getClass(), "awardedTo", term16252);
        setField(term16131, term16131.getClass(), "jobApplications", term16253);
        setField(term16131, term16131.getClass(), "active", term16263);
        setField(term16101, term16101.getClass(), "job", term16131);
        setField(term16265, term16265.getClass(), "id", null);
        setField(term16265, term16265.getClass(), "userName", null);
        setField(term16265, term16265.getClass(), "firstName", null);
        setField(term16265, term16265.getClass(), "lastName", null);
        setField(term16265, term16265.getClass(), "password", null);
        setField(term16265, term16265.getClass(), "appliedJobs", null);
        setField(term16265, term16265.getClass(), "feedbacks", null);
        setField(term16265, term16265.getClass(), "skills", null);
        setField(term16265, term16265.getClass(), "bookmarkedJobs", null);
        setField(term16101, term16101.getClass(), "freelancer", term16265);
        Long term16267 = new Long(4538748174903798169L);
        term16266 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        setField(term16266, term16266.getClass(), "id", term16267);
        setField(term16266, term16266.getClass(), "name", "tyyoVDzJBp");
        setField(term16266, term16266.getClass(), "description", "tbFDmscmBa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.BookmarkedJob");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cg.freelanceapp.entities.Skill");
        Object[] args = new Object[1];
        args[0] = term16266;
        callMethod(klass, "setSkill", argTypes, term16101, args);
    }

};


