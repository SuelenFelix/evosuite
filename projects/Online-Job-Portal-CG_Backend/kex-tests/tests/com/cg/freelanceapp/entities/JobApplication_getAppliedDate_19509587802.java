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

public class JobApplication_getAppliedDate_19509587802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22646;

    public JobApplication_getAppliedDate_19509587802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22647 = new Long(-7704912290524056833L);
        Long term22650 = new Long(-7964141454757798019L);
        Long term22677 = new Long(-8108561590335594741L);
        Long term22704 = new Long(-3640864148845613238L);
        ArrayList term22754 = new ArrayList();
        ((ArrayList) term22754).add((Object)null);
        ((ArrayList) term22754).add((Object)null);
        ((ArrayList) term22754).add((Object)null);
        ArrayList term22758 = new ArrayList();
        ArrayList term22762 = new ArrayList();
        ((ArrayList) term22762).add((Object)null);
        ((ArrayList) term22762).add((Object)null);
        ((ArrayList) term22762).add((Object)null);
        ((ArrayList) term22762).add((Object)null);
        ((ArrayList) term22762).add((Object)null);
        Object term22773 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        setField(term22773, term22773.getClass(), "id", null);
        setField(term22773, term22773.getClass(), "job", null);
        setField(term22773, term22773.getClass(), "freelancer", null);
        setField(term22773, term22773.getClass(), "appliedDate", null);
        setField(term22773, term22773.getClass(), "coverLetter", null);
        Object term22774 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        setField(term22774, term22774.getClass(), "id", null);
        setField(term22774, term22774.getClass(), "job", null);
        setField(term22774, term22774.getClass(), "freelancer", null);
        setField(term22774, term22774.getClass(), "appliedDate", null);
        setField(term22774, term22774.getClass(), "coverLetter", null);
        ArrayList term22771 = new ArrayList();
        ((ArrayList) term22771).add(term22773);
        ((ArrayList) term22771).add(term22774);
        Boolean term22777 = new Boolean(true);
        term22646 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term22649 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term22676 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term22703 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term22766 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22770 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term22779 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term22780 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22781 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22785 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term22646, term22646.getClass(), "id", term22647);
        setField(term22649, term22649.getClass(), "id", term22650);
        setField(term22649, term22649.getClass(), "jobTitle", "SqNOfacBZj");
        setField(term22649, term22649.getClass(), "jobDescription", "dbxoYBTgGN");
        setField(term22676, term22676.getClass(), "id", term22677);
        setField(term22676, term22676.getClass(), "name", "adxRdfXsVs");
        setField(term22676, term22676.getClass(), "description", "oqJIiLGVuh");
        setField(term22649, term22649.getClass(), "skill", term22676);
        setField(term22703, term22703.getClass(), "id", term22704);
        setField(term22703, term22703.getClass(), "userName", "DxDRAaptzI");
        setField(term22703, term22703.getClass(), "firstName", "kZUSkAgsvX");
        setField(term22703, term22703.getClass(), "lastName", "JpNgFUEtkd");
        setField(term22703, term22703.getClass(), "password", "HAvelKHpob");
        setField(term22703, term22703.getClass(), "postedJobs", term22754);
        setField(term22703, term22703.getClass(), "feedbacks", term22758);
        setField(term22703, term22703.getClass(), "freelancers", term22762);
        setField(term22649, term22649.getClass(), "postedBy", term22703);
        setIntField(term22766, term22766.getClass(), "year", 2026);
        setShortField(term22766, term22766.getClass(), "month", (short) 4);
        setShortField(term22766, term22766.getClass(), "day", (short) 2);
        setField(term22649, term22649.getClass(), "postedDate", term22766);
        setField(term22770, term22770.getClass(), "id", null);
        setField(term22770, term22770.getClass(), "userName", null);
        setField(term22770, term22770.getClass(), "firstName", null);
        setField(term22770, term22770.getClass(), "lastName", null);
        setField(term22770, term22770.getClass(), "password", null);
        setField(term22770, term22770.getClass(), "appliedJobs", null);
        setField(term22770, term22770.getClass(), "feedbacks", null);
        setField(term22770, term22770.getClass(), "skills", null);
        setField(term22770, term22770.getClass(), "bookmarkedJobs", null);
        setField(term22649, term22649.getClass(), "awardedTo", term22770);
        setField(term22649, term22649.getClass(), "jobApplications", term22771);
        setField(term22649, term22649.getClass(), "active", term22777);
        setField(term22646, term22646.getClass(), "job", term22649);
        setField(term22779, term22779.getClass(), "id", null);
        setField(term22779, term22779.getClass(), "userName", null);
        setField(term22779, term22779.getClass(), "firstName", null);
        setField(term22779, term22779.getClass(), "lastName", null);
        setField(term22779, term22779.getClass(), "password", null);
        setField(term22779, term22779.getClass(), "appliedJobs", null);
        setField(term22779, term22779.getClass(), "feedbacks", null);
        setField(term22779, term22779.getClass(), "skills", null);
        setField(term22779, term22779.getClass(), "bookmarkedJobs", null);
        setField(term22646, term22646.getClass(), "freelancer", term22779);
        setIntField(term22781, term22781.getClass(), "year", 2026);
        setShortField(term22781, term22781.getClass(), "month", (short) 4);
        setShortField(term22781, term22781.getClass(), "day", (short) 1);
        setField(term22780, term22780.getClass(), "date", term22781);
        setByteField(term22785, term22785.getClass(), "hour", (byte) 19);
        setByteField(term22785, term22785.getClass(), "minute", (byte) 39);
        setByteField(term22785, term22785.getClass(), "second", (byte) 26);
        setIntField(term22785, term22785.getClass(), "nano", 25694000);
        setField(term22780, term22780.getClass(), "time", term22785);
        setField(term22646, term22646.getClass(), "appliedDate", term22780);
        setField(term22646, term22646.getClass(), "coverLetter", "qZySZAtlWw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.JobApplication");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAppliedDate", argTypes, term22646, args);
    }

};


