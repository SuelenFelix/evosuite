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

public class JobApplication_setId_19332539538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24155;
     Object term24312;

    public JobApplication_setId_19332539538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term24156 = new Long(7337740023273342727L);
        Long term24159 = new Long(5100914994140818113L);
        Long term24186 = new Long(1399778523078780919L);
        Long term24213 = new Long(-8298604862992870049L);
        ArrayList term24263 = new ArrayList();
        ((ArrayList) term24263).add((Object)null);
        ArrayList term24267 = new ArrayList();
        ((ArrayList) term24267).add((Object)null);
        ((ArrayList) term24267).add((Object)null);
        ((ArrayList) term24267).add((Object)null);
        ((ArrayList) term24267).add((Object)null);
        ((ArrayList) term24267).add((Object)null);
        ((ArrayList) term24267).add((Object)null);
        ((ArrayList) term24267).add((Object)null);
        ((ArrayList) term24267).add((Object)null);
        ArrayList term24271 = new ArrayList();
        ((ArrayList) term24271).add((Object)null);
        ((ArrayList) term24271).add((Object)null);
        ((ArrayList) term24271).add((Object)null);
        ((ArrayList) term24271).add((Object)null);
        ((ArrayList) term24271).add((Object)null);
        ((ArrayList) term24271).add((Object)null);
        Object term24282 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        setField(term24282, term24282.getClass(), "id", null);
        setField(term24282, term24282.getClass(), "job", null);
        setField(term24282, term24282.getClass(), "freelancer", null);
        setField(term24282, term24282.getClass(), "appliedDate", null);
        setField(term24282, term24282.getClass(), "coverLetter", null);
        Object term24283 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        setField(term24283, term24283.getClass(), "id", null);
        setField(term24283, term24283.getClass(), "job", null);
        setField(term24283, term24283.getClass(), "freelancer", null);
        setField(term24283, term24283.getClass(), "appliedDate", null);
        setField(term24283, term24283.getClass(), "coverLetter", null);
        Object term24284 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        setField(term24284, term24284.getClass(), "id", null);
        setField(term24284, term24284.getClass(), "job", null);
        setField(term24284, term24284.getClass(), "freelancer", null);
        setField(term24284, term24284.getClass(), "appliedDate", null);
        setField(term24284, term24284.getClass(), "coverLetter", null);
        ArrayList term24280 = new ArrayList();
        ((ArrayList) term24280).add(term24155);
        ((ArrayList) term24280).add(term24282);
        ((ArrayList) term24280).add(term24283);
        ((ArrayList) term24280).add(term24283);
        ((ArrayList) term24280).add(term24155);
        ((ArrayList) term24280).add(term24284);
        Boolean term24287 = new Boolean(true);
        term24155 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term24158 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term24185 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term24212 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term24275 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24279 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term24289 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term24290 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24291 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24295 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term24155, term24155.getClass(), "id", term24156);
        setField(term24158, term24158.getClass(), "id", term24159);
        setField(term24158, term24158.getClass(), "jobTitle", "ESBgigMjFA");
        setField(term24158, term24158.getClass(), "jobDescription", "rdAMzcSTeH");
        setField(term24185, term24185.getClass(), "id", term24186);
        setField(term24185, term24185.getClass(), "name", "GhNJNopkXp");
        setField(term24185, term24185.getClass(), "description", "BuDMkCZWXA");
        setField(term24158, term24158.getClass(), "skill", term24185);
        setField(term24212, term24212.getClass(), "id", term24213);
        setField(term24212, term24212.getClass(), "userName", "CsezPlAELx");
        setField(term24212, term24212.getClass(), "firstName", "YTzeIhnRJF");
        setField(term24212, term24212.getClass(), "lastName", "PtKdjHiCdR");
        setField(term24212, term24212.getClass(), "password", "DhqiNYcpwz");
        setField(term24212, term24212.getClass(), "postedJobs", term24263);
        setField(term24212, term24212.getClass(), "feedbacks", term24267);
        setField(term24212, term24212.getClass(), "freelancers", term24271);
        setField(term24158, term24158.getClass(), "postedBy", term24212);
        setIntField(term24275, term24275.getClass(), "year", 2026);
        setShortField(term24275, term24275.getClass(), "month", (short) 6);
        setShortField(term24275, term24275.getClass(), "day", (short) 29);
        setField(term24158, term24158.getClass(), "postedDate", term24275);
        setField(term24279, term24279.getClass(), "id", null);
        setField(term24279, term24279.getClass(), "userName", null);
        setField(term24279, term24279.getClass(), "firstName", null);
        setField(term24279, term24279.getClass(), "lastName", null);
        setField(term24279, term24279.getClass(), "password", null);
        setField(term24279, term24279.getClass(), "appliedJobs", null);
        setField(term24279, term24279.getClass(), "feedbacks", null);
        setField(term24279, term24279.getClass(), "skills", null);
        setField(term24279, term24279.getClass(), "bookmarkedJobs", null);
        setField(term24158, term24158.getClass(), "awardedTo", term24279);
        setField(term24158, term24158.getClass(), "jobApplications", term24280);
        setField(term24158, term24158.getClass(), "active", term24287);
        setField(term24155, term24155.getClass(), "job", term24158);
        setField(term24289, term24289.getClass(), "id", null);
        setField(term24289, term24289.getClass(), "userName", null);
        setField(term24289, term24289.getClass(), "firstName", null);
        setField(term24289, term24289.getClass(), "lastName", null);
        setField(term24289, term24289.getClass(), "password", null);
        setField(term24289, term24289.getClass(), "appliedJobs", null);
        setField(term24289, term24289.getClass(), "feedbacks", null);
        setField(term24289, term24289.getClass(), "skills", null);
        setField(term24289, term24289.getClass(), "bookmarkedJobs", null);
        setField(term24155, term24155.getClass(), "freelancer", term24289);
        setIntField(term24291, term24291.getClass(), "year", 2026);
        setShortField(term24291, term24291.getClass(), "month", (short) 6);
        setShortField(term24291, term24291.getClass(), "day", (short) 28);
        setField(term24290, term24290.getClass(), "date", term24291);
        setByteField(term24295, term24295.getClass(), "hour", (byte) 22);
        setByteField(term24295, term24295.getClass(), "minute", (byte) 27);
        setByteField(term24295, term24295.getClass(), "second", (byte) 53);
        setIntField(term24295, term24295.getClass(), "nano", 464761000);
        setField(term24290, term24290.getClass(), "time", term24295);
        setField(term24155, term24155.getClass(), "appliedDate", term24290);
        setField(term24155, term24155.getClass(), "coverLetter", "RxhYQyihmS");
        term24312 = new Long(4454588796716170496L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.JobApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term24312;
        callMethod(klass, "setId", argTypes, term24155, args);
    }

};


