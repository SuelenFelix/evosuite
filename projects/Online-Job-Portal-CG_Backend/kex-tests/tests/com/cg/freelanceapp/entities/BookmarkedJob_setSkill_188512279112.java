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

public class BookmarkedJob_setSkill_188512279112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13017;
     Object term13182;

    public BookmarkedJob_setSkill_188512279112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13018 = new Long(-1131029419147589872L);
        Long term13021 = new Long(-5753794060274661933L);
        Long term13048 = new Long(-631692052300282581L);
        Long term13075 = new Long(-2145666439433256886L);
        Long term13102 = new Long(4364197754861747163L);
        ArrayList term13152 = new ArrayList();
        ((ArrayList) term13152).add((Object)null);
        ((ArrayList) term13152).add((Object)null);
        ((ArrayList) term13152).add((Object)null);
        ArrayList term13156 = new ArrayList();
        ((ArrayList) term13156).add((Object)null);
        ((ArrayList) term13156).add((Object)null);
        ((ArrayList) term13156).add((Object)null);
        ((ArrayList) term13156).add((Object)null);
        ((ArrayList) term13156).add((Object)null);
        ((ArrayList) term13156).add((Object)null);
        ArrayList term13160 = new ArrayList();
        ((ArrayList) term13160).add((Object)null);
        ((ArrayList) term13160).add((Object)null);
        ((ArrayList) term13160).add((Object)null);
        Long term13172 = new Long(4601901314293570056L);
        Object term13171 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        setField(term13171, term13171.getClass(), "id", term13172);
        setField(term13171, term13171.getClass(), "job", null);
        setField(term13171, term13171.getClass(), "freelancer", null);
        setField(term13171, term13171.getClass(), "appliedDate", null);
        setField(term13171, term13171.getClass(), "coverLetter", null);
        Long term13175 = new Long(-2619427369277959894L);
        Object term13174 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        setField(term13174, term13174.getClass(), "id", term13175);
        setField(term13174, term13174.getClass(), "job", null);
        setField(term13174, term13174.getClass(), "freelancer", null);
        setField(term13174, term13174.getClass(), "appliedDate", null);
        setField(term13174, term13174.getClass(), "coverLetter", null);
        ArrayList term13169 = new ArrayList();
        ((ArrayList) term13169).add(term13171);
        ((ArrayList) term13169).add(term13174);
        Boolean term13179 = new Boolean(true);
        term13017 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        Object term13020 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term13047 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term13074 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term13101 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term13164 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13168 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term13181 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term13017, term13017.getClass(), "id", term13018);
        setField(term13020, term13020.getClass(), "id", term13021);
        setField(term13020, term13020.getClass(), "name", "IqzRlGAXKQ");
        setField(term13020, term13020.getClass(), "description", "XiytdmxGYa");
        setField(term13017, term13017.getClass(), "skill", term13020);
        setField(term13047, term13047.getClass(), "id", term13048);
        setField(term13047, term13047.getClass(), "jobTitle", "xuWbTDWaJN");
        setField(term13047, term13047.getClass(), "jobDescription", "LvZCXbeNaa");
        setField(term13074, term13074.getClass(), "id", term13075);
        setField(term13074, term13074.getClass(), "name", "CaxKtuZUJI");
        setField(term13074, term13074.getClass(), "description", "wokzuoOQRu");
        setField(term13047, term13047.getClass(), "skill", term13074);
        setField(term13101, term13101.getClass(), "id", term13102);
        setField(term13101, term13101.getClass(), "userName", "jIVcJcAtbp");
        setField(term13101, term13101.getClass(), "firstName", "eugajHLhOv");
        setField(term13101, term13101.getClass(), "lastName", "sCSkTLnMUp");
        setField(term13101, term13101.getClass(), "password", "MGfUFAWSlA");
        setField(term13101, term13101.getClass(), "postedJobs", term13152);
        setField(term13101, term13101.getClass(), "feedbacks", term13156);
        setField(term13101, term13101.getClass(), "freelancers", term13160);
        setField(term13047, term13047.getClass(), "postedBy", term13101);
        setIntField(term13164, term13164.getClass(), "year", 2026);
        setShortField(term13164, term13164.getClass(), "month", (short) 8);
        setShortField(term13164, term13164.getClass(), "day", (short) 11);
        setField(term13047, term13047.getClass(), "postedDate", term13164);
        setField(term13168, term13168.getClass(), "id", null);
        setField(term13168, term13168.getClass(), "userName", null);
        setField(term13168, term13168.getClass(), "firstName", null);
        setField(term13168, term13168.getClass(), "lastName", null);
        setField(term13168, term13168.getClass(), "password", null);
        setField(term13168, term13168.getClass(), "appliedJobs", null);
        setField(term13168, term13168.getClass(), "feedbacks", null);
        setField(term13168, term13168.getClass(), "skills", null);
        setField(term13168, term13168.getClass(), "bookmarkedJobs", null);
        setField(term13047, term13047.getClass(), "awardedTo", term13168);
        setField(term13047, term13047.getClass(), "jobApplications", term13169);
        setField(term13047, term13047.getClass(), "active", term13179);
        setField(term13017, term13017.getClass(), "job", term13047);
        setField(term13181, term13181.getClass(), "id", null);
        setField(term13181, term13181.getClass(), "userName", null);
        setField(term13181, term13181.getClass(), "firstName", null);
        setField(term13181, term13181.getClass(), "lastName", null);
        setField(term13181, term13181.getClass(), "password", null);
        setField(term13181, term13181.getClass(), "appliedJobs", null);
        setField(term13181, term13181.getClass(), "feedbacks", null);
        setField(term13181, term13181.getClass(), "skills", null);
        setField(term13181, term13181.getClass(), "bookmarkedJobs", null);
        setField(term13017, term13017.getClass(), "freelancer", term13181);
        Long term13183 = new Long(6501798712124759765L);
        term13182 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        setField(term13182, term13182.getClass(), "id", term13183);
        setField(term13182, term13182.getClass(), "name", "scTfhtEKVY");
        setField(term13182, term13182.getClass(), "description", "stIuzWhyLn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.BookmarkedJob");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cg.freelanceapp.entities.Skill");
        Object[] args = new Object[1];
        args[0] = term13182;
        callMethod(klass, "setSkill", argTypes, term13017, args);
    }

};


