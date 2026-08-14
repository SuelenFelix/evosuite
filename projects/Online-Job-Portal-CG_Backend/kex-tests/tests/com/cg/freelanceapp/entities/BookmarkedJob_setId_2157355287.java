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

public class BookmarkedJob_setId_2157355287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15225;
     Object term15384;

    public BookmarkedJob_setId_2157355287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15226 = new Long(1915067600167472834L);
        Long term15229 = new Long(-5052214162065838650L);
        Long term15256 = new Long(-94222650078853780L);
        Long term15283 = new Long(-2164399567942958295L);
        Long term15310 = new Long(6485127487584904536L);
        ArrayList term15360 = new ArrayList();
        ((ArrayList) term15360).add((Object)null);
        ((ArrayList) term15360).add((Object)null);
        ((ArrayList) term15360).add((Object)null);
        ((ArrayList) term15360).add((Object)null);
        ((ArrayList) term15360).add((Object)null);
        ((ArrayList) term15360).add((Object)null);
        ((ArrayList) term15360).add((Object)null);
        ArrayList term15364 = new ArrayList();
        ((ArrayList) term15364).add((Object)null);
        ((ArrayList) term15364).add((Object)null);
        ((ArrayList) term15364).add((Object)null);
        ((ArrayList) term15364).add((Object)null);
        ((ArrayList) term15364).add((Object)null);
        ((ArrayList) term15364).add((Object)null);
        ArrayList term15368 = new ArrayList();
        ((ArrayList) term15368).add((Object)null);
        ((ArrayList) term15368).add((Object)null);
        ((ArrayList) term15368).add((Object)null);
        ((ArrayList) term15368).add((Object)null);
        ((ArrayList) term15368).add((Object)null);
        ((ArrayList) term15368).add((Object)null);
        ArrayList term15377 = new ArrayList();
        Boolean term15381 = new Boolean(true);
        term15225 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        Object term15228 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term15255 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term15282 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term15309 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term15372 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15376 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term15383 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term15225, term15225.getClass(), "id", term15226);
        setField(term15228, term15228.getClass(), "id", term15229);
        setField(term15228, term15228.getClass(), "name", "xXscNmBGLP");
        setField(term15228, term15228.getClass(), "description", "DOvWosNzCd");
        setField(term15225, term15225.getClass(), "skill", term15228);
        setField(term15255, term15255.getClass(), "id", term15256);
        setField(term15255, term15255.getClass(), "jobTitle", "bIZNWEzBTe");
        setField(term15255, term15255.getClass(), "jobDescription", "CVhsNqYDrO");
        setField(term15282, term15282.getClass(), "id", term15283);
        setField(term15282, term15282.getClass(), "name", "dMpUbtHwly");
        setField(term15282, term15282.getClass(), "description", "bxEEJVIcPG");
        setField(term15255, term15255.getClass(), "skill", term15282);
        setField(term15309, term15309.getClass(), "id", term15310);
        setField(term15309, term15309.getClass(), "userName", "UttOGDGpEr");
        setField(term15309, term15309.getClass(), "firstName", "aPScTdSsoS");
        setField(term15309, term15309.getClass(), "lastName", "CZYngwdoHw");
        setField(term15309, term15309.getClass(), "password", "ZbWZNiPrBA");
        setField(term15309, term15309.getClass(), "postedJobs", term15360);
        setField(term15309, term15309.getClass(), "feedbacks", term15364);
        setField(term15309, term15309.getClass(), "freelancers", term15368);
        setField(term15255, term15255.getClass(), "postedBy", term15309);
        setIntField(term15372, term15372.getClass(), "year", 2026);
        setShortField(term15372, term15372.getClass(), "month", (short) 8);
        setShortField(term15372, term15372.getClass(), "day", (short) 11);
        setField(term15255, term15255.getClass(), "postedDate", term15372);
        setField(term15376, term15376.getClass(), "id", null);
        setField(term15376, term15376.getClass(), "userName", null);
        setField(term15376, term15376.getClass(), "firstName", null);
        setField(term15376, term15376.getClass(), "lastName", null);
        setField(term15376, term15376.getClass(), "password", null);
        setField(term15376, term15376.getClass(), "appliedJobs", null);
        setField(term15376, term15376.getClass(), "feedbacks", null);
        setField(term15376, term15376.getClass(), "skills", null);
        setField(term15376, term15376.getClass(), "bookmarkedJobs", null);
        setField(term15255, term15255.getClass(), "awardedTo", term15376);
        setField(term15255, term15255.getClass(), "jobApplications", term15377);
        setField(term15255, term15255.getClass(), "active", term15381);
        setField(term15225, term15225.getClass(), "job", term15255);
        setField(term15383, term15383.getClass(), "id", null);
        setField(term15383, term15383.getClass(), "userName", null);
        setField(term15383, term15383.getClass(), "firstName", null);
        setField(term15383, term15383.getClass(), "lastName", null);
        setField(term15383, term15383.getClass(), "password", null);
        setField(term15383, term15383.getClass(), "appliedJobs", null);
        setField(term15383, term15383.getClass(), "feedbacks", null);
        setField(term15383, term15383.getClass(), "skills", null);
        setField(term15383, term15383.getClass(), "bookmarkedJobs", null);
        setField(term15225, term15225.getClass(), "freelancer", term15383);
        term15384 = new Long(6370524950953117569L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.BookmarkedJob");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term15384;
        callMethod(klass, "setId", argTypes, term15225, args);
    }

};


