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

public class JobApplication_getJob_516837325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23389;

    public JobApplication_getJob_516837325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23390 = new Long(-1992975559583541654L);
        Long term23393 = new Long(-1078931920551242838L);
        Long term23420 = new Long(-8575958299651392724L);
        Long term23447 = new Long(-9145745451304744888L);
        ArrayList term23497 = new ArrayList();
        ((ArrayList) term23497).add((Object)null);
        ((ArrayList) term23497).add((Object)null);
        ((ArrayList) term23497).add((Object)null);
        ((ArrayList) term23497).add((Object)null);
        ((ArrayList) term23497).add((Object)null);
        ((ArrayList) term23497).add((Object)null);
        ((ArrayList) term23497).add((Object)null);
        ArrayList term23501 = new ArrayList();
        ((ArrayList) term23501).add((Object)null);
        ArrayList term23505 = new ArrayList();
        ((ArrayList) term23505).add((Object)null);
        ((ArrayList) term23505).add((Object)null);
        ((ArrayList) term23505).add((Object)null);
        ((ArrayList) term23505).add((Object)null);
        ((ArrayList) term23505).add((Object)null);
        ((ArrayList) term23505).add((Object)null);
        ((ArrayList) term23505).add((Object)null);
        ((ArrayList) term23505).add((Object)null);
        ((ArrayList) term23505).add((Object)null);
        Object term23516 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        setField(term23516, term23516.getClass(), "id", null);
        setField(term23516, term23516.getClass(), "job", null);
        setField(term23516, term23516.getClass(), "freelancer", null);
        setField(term23516, term23516.getClass(), "appliedDate", null);
        setField(term23516, term23516.getClass(), "coverLetter", null);
        Object term23517 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        setField(term23517, term23517.getClass(), "id", null);
        setField(term23517, term23517.getClass(), "job", null);
        setField(term23517, term23517.getClass(), "freelancer", null);
        setField(term23517, term23517.getClass(), "appliedDate", null);
        setField(term23517, term23517.getClass(), "coverLetter", null);
        ArrayList term23514 = new ArrayList();
        ((ArrayList) term23514).add(term23516);
        ((ArrayList) term23514).add(term23517);
        Boolean term23520 = new Boolean(true);
        term23389 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term23392 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term23419 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term23446 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term23509 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23513 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term23522 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term23523 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23524 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23528 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23389, term23389.getClass(), "id", term23390);
        setField(term23392, term23392.getClass(), "id", term23393);
        setField(term23392, term23392.getClass(), "jobTitle", "ItCoFoogyQ");
        setField(term23392, term23392.getClass(), "jobDescription", "nepnhlILBS");
        setField(term23419, term23419.getClass(), "id", term23420);
        setField(term23419, term23419.getClass(), "name", "huaIuyRHxW");
        setField(term23419, term23419.getClass(), "description", "ogERhHtdmR");
        setField(term23392, term23392.getClass(), "skill", term23419);
        setField(term23446, term23446.getClass(), "id", term23447);
        setField(term23446, term23446.getClass(), "userName", "ChbSEsWapt");
        setField(term23446, term23446.getClass(), "firstName", "bQISZgxxwm");
        setField(term23446, term23446.getClass(), "lastName", "GTtXOBrgdi");
        setField(term23446, term23446.getClass(), "password", "YYhXdHIurl");
        setField(term23446, term23446.getClass(), "postedJobs", term23497);
        setField(term23446, term23446.getClass(), "feedbacks", term23501);
        setField(term23446, term23446.getClass(), "freelancers", term23505);
        setField(term23392, term23392.getClass(), "postedBy", term23446);
        setIntField(term23509, term23509.getClass(), "year", 2026);
        setShortField(term23509, term23509.getClass(), "month", (short) 8);
        setShortField(term23509, term23509.getClass(), "day", (short) 11);
        setField(term23392, term23392.getClass(), "postedDate", term23509);
        setField(term23513, term23513.getClass(), "id", null);
        setField(term23513, term23513.getClass(), "userName", null);
        setField(term23513, term23513.getClass(), "firstName", null);
        setField(term23513, term23513.getClass(), "lastName", null);
        setField(term23513, term23513.getClass(), "password", null);
        setField(term23513, term23513.getClass(), "appliedJobs", null);
        setField(term23513, term23513.getClass(), "feedbacks", null);
        setField(term23513, term23513.getClass(), "skills", null);
        setField(term23513, term23513.getClass(), "bookmarkedJobs", null);
        setField(term23392, term23392.getClass(), "awardedTo", term23513);
        setField(term23392, term23392.getClass(), "jobApplications", term23514);
        setField(term23392, term23392.getClass(), "active", term23520);
        setField(term23389, term23389.getClass(), "job", term23392);
        setField(term23522, term23522.getClass(), "id", null);
        setField(term23522, term23522.getClass(), "userName", null);
        setField(term23522, term23522.getClass(), "firstName", null);
        setField(term23522, term23522.getClass(), "lastName", null);
        setField(term23522, term23522.getClass(), "password", null);
        setField(term23522, term23522.getClass(), "appliedJobs", null);
        setField(term23522, term23522.getClass(), "feedbacks", null);
        setField(term23522, term23522.getClass(), "skills", null);
        setField(term23522, term23522.getClass(), "bookmarkedJobs", null);
        setField(term23389, term23389.getClass(), "freelancer", term23522);
        setIntField(term23524, term23524.getClass(), "year", 2026);
        setShortField(term23524, term23524.getClass(), "month", (short) 8);
        setShortField(term23524, term23524.getClass(), "day", (short) 11);
        setField(term23523, term23523.getClass(), "date", term23524);
        setByteField(term23528, term23528.getClass(), "hour", (byte) 13);
        setByteField(term23528, term23528.getClass(), "minute", (byte) 51);
        setByteField(term23528, term23528.getClass(), "second", (byte) 23);
        setIntField(term23528, term23528.getClass(), "nano", 51743000);
        setField(term23523, term23523.getClass(), "time", term23528);
        setField(term23389, term23389.getClass(), "appliedDate", term23523);
        setField(term23389, term23389.getClass(), "coverLetter", "EjLCKTHFYE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.JobApplication");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJob", argTypes, term23389, args);
    }

};


