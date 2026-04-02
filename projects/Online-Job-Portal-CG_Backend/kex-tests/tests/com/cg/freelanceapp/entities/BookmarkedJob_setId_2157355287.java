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
     Object term12139;
     Object term12298;

    public BookmarkedJob_setId_2157355287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12140 = new Long(-4450089717153471904L);
        Long term12143 = new Long(8555372807363389523L);
        Long term12170 = new Long(4135693817001955957L);
        Long term12197 = new Long(-3822804973679381574L);
        Long term12224 = new Long(8503915599730893579L);
        ArrayList term12274 = new ArrayList();
        ((ArrayList) term12274).add((Object)null);
        ((ArrayList) term12274).add((Object)null);
        ((ArrayList) term12274).add((Object)null);
        ((ArrayList) term12274).add((Object)null);
        ((ArrayList) term12274).add((Object)null);
        ((ArrayList) term12274).add((Object)null);
        ((ArrayList) term12274).add((Object)null);
        ArrayList term12278 = new ArrayList();
        ((ArrayList) term12278).add((Object)null);
        ((ArrayList) term12278).add((Object)null);
        ((ArrayList) term12278).add((Object)null);
        ((ArrayList) term12278).add((Object)null);
        ((ArrayList) term12278).add((Object)null);
        ((ArrayList) term12278).add((Object)null);
        ArrayList term12282 = new ArrayList();
        ((ArrayList) term12282).add((Object)null);
        ((ArrayList) term12282).add((Object)null);
        ((ArrayList) term12282).add((Object)null);
        ((ArrayList) term12282).add((Object)null);
        ((ArrayList) term12282).add((Object)null);
        ((ArrayList) term12282).add((Object)null);
        ArrayList term12291 = new ArrayList();
        Boolean term12295 = new Boolean(true);
        term12139 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        Object term12142 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term12169 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term12196 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term12223 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term12286 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12290 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term12297 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term12139, term12139.getClass(), "id", term12140);
        setField(term12142, term12142.getClass(), "id", term12143);
        setField(term12142, term12142.getClass(), "name", "LklQRqbChE");
        setField(term12142, term12142.getClass(), "description", "wxbPKcvjhX");
        setField(term12139, term12139.getClass(), "skill", term12142);
        setField(term12169, term12169.getClass(), "id", term12170);
        setField(term12169, term12169.getClass(), "jobTitle", "RmyltMpQEu");
        setField(term12169, term12169.getClass(), "jobDescription", "ozlDkmzKuq");
        setField(term12196, term12196.getClass(), "id", term12197);
        setField(term12196, term12196.getClass(), "name", "oGDeaReDRG");
        setField(term12196, term12196.getClass(), "description", "DjDquUkDJf");
        setField(term12169, term12169.getClass(), "skill", term12196);
        setField(term12223, term12223.getClass(), "id", term12224);
        setField(term12223, term12223.getClass(), "userName", "SszlMxumKX");
        setField(term12223, term12223.getClass(), "firstName", "FhbYnMXUCk");
        setField(term12223, term12223.getClass(), "lastName", "MMUzzZjmHQ");
        setField(term12223, term12223.getClass(), "password", "NSPCJaizlC");
        setField(term12223, term12223.getClass(), "postedJobs", term12274);
        setField(term12223, term12223.getClass(), "feedbacks", term12278);
        setField(term12223, term12223.getClass(), "freelancers", term12282);
        setField(term12169, term12169.getClass(), "postedBy", term12223);
        setIntField(term12286, term12286.getClass(), "year", 2026);
        setShortField(term12286, term12286.getClass(), "month", (short) 4);
        setShortField(term12286, term12286.getClass(), "day", (short) 2);
        setField(term12169, term12169.getClass(), "postedDate", term12286);
        setField(term12290, term12290.getClass(), "id", null);
        setField(term12290, term12290.getClass(), "userName", null);
        setField(term12290, term12290.getClass(), "firstName", null);
        setField(term12290, term12290.getClass(), "lastName", null);
        setField(term12290, term12290.getClass(), "password", null);
        setField(term12290, term12290.getClass(), "appliedJobs", null);
        setField(term12290, term12290.getClass(), "feedbacks", null);
        setField(term12290, term12290.getClass(), "skills", null);
        setField(term12290, term12290.getClass(), "bookmarkedJobs", null);
        setField(term12169, term12169.getClass(), "awardedTo", term12290);
        setField(term12169, term12169.getClass(), "jobApplications", term12291);
        setField(term12169, term12169.getClass(), "active", term12295);
        setField(term12139, term12139.getClass(), "job", term12169);
        setField(term12297, term12297.getClass(), "id", null);
        setField(term12297, term12297.getClass(), "userName", null);
        setField(term12297, term12297.getClass(), "firstName", null);
        setField(term12297, term12297.getClass(), "lastName", null);
        setField(term12297, term12297.getClass(), "password", null);
        setField(term12297, term12297.getClass(), "appliedJobs", null);
        setField(term12297, term12297.getClass(), "feedbacks", null);
        setField(term12297, term12297.getClass(), "skills", null);
        setField(term12297, term12297.getClass(), "bookmarkedJobs", null);
        setField(term12139, term12139.getClass(), "freelancer", term12297);
        term12298 = new Long(-5040671346926017489L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.BookmarkedJob");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term12298;
        callMethod(klass, "setId", argTypes, term12139, args);
    }

};


