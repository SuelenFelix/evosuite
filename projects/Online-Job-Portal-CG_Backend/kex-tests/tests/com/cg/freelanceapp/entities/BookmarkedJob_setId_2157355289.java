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

public class BookmarkedJob_setId_2157355289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12141;
     Object term12300;

    public BookmarkedJob_setId_2157355289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12142 = new Long(-4450089717153471904L);
        Long term12145 = new Long(8555372807363389523L);
        Long term12172 = new Long(4135693817001955957L);
        Long term12199 = new Long(-3822804973679381574L);
        Long term12226 = new Long(8503915599730893579L);
        ArrayList term12276 = new ArrayList();
        ((ArrayList) term12276).add((Object)null);
        ((ArrayList) term12276).add((Object)null);
        ((ArrayList) term12276).add((Object)null);
        ((ArrayList) term12276).add((Object)null);
        ((ArrayList) term12276).add((Object)null);
        ((ArrayList) term12276).add((Object)null);
        ((ArrayList) term12276).add((Object)null);
        ArrayList term12280 = new ArrayList();
        ((ArrayList) term12280).add((Object)null);
        ((ArrayList) term12280).add((Object)null);
        ((ArrayList) term12280).add((Object)null);
        ((ArrayList) term12280).add((Object)null);
        ((ArrayList) term12280).add((Object)null);
        ((ArrayList) term12280).add((Object)null);
        ArrayList term12284 = new ArrayList();
        ((ArrayList) term12284).add((Object)null);
        ((ArrayList) term12284).add((Object)null);
        ((ArrayList) term12284).add((Object)null);
        ((ArrayList) term12284).add((Object)null);
        ((ArrayList) term12284).add((Object)null);
        ((ArrayList) term12284).add((Object)null);
        ArrayList term12293 = new ArrayList();
        Boolean term12297 = new Boolean(true);
        term12141 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        Object term12144 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term12171 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term12198 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term12225 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term12288 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12292 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term12299 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term12141, term12141.getClass(), "id", term12142);
        setField(term12144, term12144.getClass(), "id", term12145);
        setField(term12144, term12144.getClass(), "name", "LklQRqbChE");
        setField(term12144, term12144.getClass(), "description", "wxbPKcvjhX");
        setField(term12141, term12141.getClass(), "skill", term12144);
        setField(term12171, term12171.getClass(), "id", term12172);
        setField(term12171, term12171.getClass(), "jobTitle", "RmyltMpQEu");
        setField(term12171, term12171.getClass(), "jobDescription", "ozlDkmzKuq");
        setField(term12198, term12198.getClass(), "id", term12199);
        setField(term12198, term12198.getClass(), "name", "oGDeaReDRG");
        setField(term12198, term12198.getClass(), "description", "DjDquUkDJf");
        setField(term12171, term12171.getClass(), "skill", term12198);
        setField(term12225, term12225.getClass(), "id", term12226);
        setField(term12225, term12225.getClass(), "userName", "SszlMxumKX");
        setField(term12225, term12225.getClass(), "firstName", "FhbYnMXUCk");
        setField(term12225, term12225.getClass(), "lastName", "MMUzzZjmHQ");
        setField(term12225, term12225.getClass(), "password", "NSPCJaizlC");
        setField(term12225, term12225.getClass(), "postedJobs", term12276);
        setField(term12225, term12225.getClass(), "feedbacks", term12280);
        setField(term12225, term12225.getClass(), "freelancers", term12284);
        setField(term12171, term12171.getClass(), "postedBy", term12225);
        setIntField(term12288, term12288.getClass(), "year", 2026);
        setShortField(term12288, term12288.getClass(), "month", (short) 8);
        setShortField(term12288, term12288.getClass(), "day", (short) 11);
        setField(term12171, term12171.getClass(), "postedDate", term12288);
        setField(term12292, term12292.getClass(), "id", null);
        setField(term12292, term12292.getClass(), "userName", null);
        setField(term12292, term12292.getClass(), "firstName", null);
        setField(term12292, term12292.getClass(), "lastName", null);
        setField(term12292, term12292.getClass(), "password", null);
        setField(term12292, term12292.getClass(), "appliedJobs", null);
        setField(term12292, term12292.getClass(), "feedbacks", null);
        setField(term12292, term12292.getClass(), "skills", null);
        setField(term12292, term12292.getClass(), "bookmarkedJobs", null);
        setField(term12171, term12171.getClass(), "awardedTo", term12292);
        setField(term12171, term12171.getClass(), "jobApplications", term12293);
        setField(term12171, term12171.getClass(), "active", term12297);
        setField(term12141, term12141.getClass(), "job", term12171);
        setField(term12299, term12299.getClass(), "id", null);
        setField(term12299, term12299.getClass(), "userName", null);
        setField(term12299, term12299.getClass(), "firstName", null);
        setField(term12299, term12299.getClass(), "lastName", null);
        setField(term12299, term12299.getClass(), "password", null);
        setField(term12299, term12299.getClass(), "appliedJobs", null);
        setField(term12299, term12299.getClass(), "feedbacks", null);
        setField(term12299, term12299.getClass(), "skills", null);
        setField(term12299, term12299.getClass(), "bookmarkedJobs", null);
        setField(term12141, term12141.getClass(), "freelancer", term12299);
        term12300 = new Long(-5040671346926017489L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.BookmarkedJob");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term12300;
        callMethod(klass, "setId", argTypes, term12141, args);
    }

};


