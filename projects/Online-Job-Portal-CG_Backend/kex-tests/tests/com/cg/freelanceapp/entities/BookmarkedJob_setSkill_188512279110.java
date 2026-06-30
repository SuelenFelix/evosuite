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
     Object term13015;
     Object term13180;

    public BookmarkedJob_setSkill_188512279110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13016 = new Long(-1131029419147589872L);
        Long term13019 = new Long(-5753794060274661933L);
        Long term13046 = new Long(-631692052300282581L);
        Long term13073 = new Long(-2145666439433256886L);
        Long term13100 = new Long(4364197754861747163L);
        ArrayList term13150 = new ArrayList();
        ((ArrayList) term13150).add((Object)null);
        ((ArrayList) term13150).add((Object)null);
        ((ArrayList) term13150).add((Object)null);
        ArrayList term13154 = new ArrayList();
        ((ArrayList) term13154).add((Object)null);
        ((ArrayList) term13154).add((Object)null);
        ((ArrayList) term13154).add((Object)null);
        ((ArrayList) term13154).add((Object)null);
        ((ArrayList) term13154).add((Object)null);
        ((ArrayList) term13154).add((Object)null);
        ArrayList term13158 = new ArrayList();
        ((ArrayList) term13158).add((Object)null);
        ((ArrayList) term13158).add((Object)null);
        ((ArrayList) term13158).add((Object)null);
        Long term13170 = new Long(4601901314293570056L);
        Object term13169 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        setField(term13169, term13169.getClass(), "id", term13170);
        setField(term13169, term13169.getClass(), "job", null);
        setField(term13169, term13169.getClass(), "freelancer", null);
        setField(term13169, term13169.getClass(), "appliedDate", null);
        setField(term13169, term13169.getClass(), "coverLetter", null);
        Long term13173 = new Long(-2619427369277959894L);
        Object term13172 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        setField(term13172, term13172.getClass(), "id", term13173);
        setField(term13172, term13172.getClass(), "job", null);
        setField(term13172, term13172.getClass(), "freelancer", null);
        setField(term13172, term13172.getClass(), "appliedDate", null);
        setField(term13172, term13172.getClass(), "coverLetter", null);
        ArrayList term13167 = new ArrayList();
        ((ArrayList) term13167).add(term13169);
        ((ArrayList) term13167).add(term13172);
        Boolean term13177 = new Boolean(true);
        term13015 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        Object term13018 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term13045 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term13072 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term13099 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term13162 = newInstance(Class.forName("java.time.LocalDate"));
        Object term13166 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term13179 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term13015, term13015.getClass(), "id", term13016);
        setField(term13018, term13018.getClass(), "id", term13019);
        setField(term13018, term13018.getClass(), "name", "IqzRlGAXKQ");
        setField(term13018, term13018.getClass(), "description", "XiytdmxGYa");
        setField(term13015, term13015.getClass(), "skill", term13018);
        setField(term13045, term13045.getClass(), "id", term13046);
        setField(term13045, term13045.getClass(), "jobTitle", "xuWbTDWaJN");
        setField(term13045, term13045.getClass(), "jobDescription", "LvZCXbeNaa");
        setField(term13072, term13072.getClass(), "id", term13073);
        setField(term13072, term13072.getClass(), "name", "CaxKtuZUJI");
        setField(term13072, term13072.getClass(), "description", "wokzuoOQRu");
        setField(term13045, term13045.getClass(), "skill", term13072);
        setField(term13099, term13099.getClass(), "id", term13100);
        setField(term13099, term13099.getClass(), "userName", "jIVcJcAtbp");
        setField(term13099, term13099.getClass(), "firstName", "eugajHLhOv");
        setField(term13099, term13099.getClass(), "lastName", "sCSkTLnMUp");
        setField(term13099, term13099.getClass(), "password", "MGfUFAWSlA");
        setField(term13099, term13099.getClass(), "postedJobs", term13150);
        setField(term13099, term13099.getClass(), "feedbacks", term13154);
        setField(term13099, term13099.getClass(), "freelancers", term13158);
        setField(term13045, term13045.getClass(), "postedBy", term13099);
        setIntField(term13162, term13162.getClass(), "year", 2026);
        setShortField(term13162, term13162.getClass(), "month", (short) 6);
        setShortField(term13162, term13162.getClass(), "day", (short) 29);
        setField(term13045, term13045.getClass(), "postedDate", term13162);
        setField(term13166, term13166.getClass(), "id", null);
        setField(term13166, term13166.getClass(), "userName", null);
        setField(term13166, term13166.getClass(), "firstName", null);
        setField(term13166, term13166.getClass(), "lastName", null);
        setField(term13166, term13166.getClass(), "password", null);
        setField(term13166, term13166.getClass(), "appliedJobs", null);
        setField(term13166, term13166.getClass(), "feedbacks", null);
        setField(term13166, term13166.getClass(), "skills", null);
        setField(term13166, term13166.getClass(), "bookmarkedJobs", null);
        setField(term13045, term13045.getClass(), "awardedTo", term13166);
        setField(term13045, term13045.getClass(), "jobApplications", term13167);
        setField(term13045, term13045.getClass(), "active", term13177);
        setField(term13015, term13015.getClass(), "job", term13045);
        setField(term13179, term13179.getClass(), "id", null);
        setField(term13179, term13179.getClass(), "userName", null);
        setField(term13179, term13179.getClass(), "firstName", null);
        setField(term13179, term13179.getClass(), "lastName", null);
        setField(term13179, term13179.getClass(), "password", null);
        setField(term13179, term13179.getClass(), "appliedJobs", null);
        setField(term13179, term13179.getClass(), "feedbacks", null);
        setField(term13179, term13179.getClass(), "skills", null);
        setField(term13179, term13179.getClass(), "bookmarkedJobs", null);
        setField(term13015, term13015.getClass(), "freelancer", term13179);
        Long term13181 = new Long(6501798712124759765L);
        term13180 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        setField(term13180, term13180.getClass(), "id", term13181);
        setField(term13180, term13180.getClass(), "name", "scTfhtEKVY");
        setField(term13180, term13180.getClass(), "description", "stIuzWhyLn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.BookmarkedJob");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.cg.freelanceapp.entities.Skill");
        Object[] args = new Object[1];
        args[0] = term13180;
        callMethod(klass, "setSkill", argTypes, term13015, args);
    }

};


