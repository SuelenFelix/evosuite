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

public class BookmarkedJob_getFreelancer_16585844972 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10572;

    public BookmarkedJob_getFreelancer_16585844972() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term10573 = new Long(-8579515460152917650L);
        Long term10576 = new Long(-3033236171719733686L);
        Long term10603 = new Long(2458513029160061715L);
        Long term10630 = new Long(8528564099162820842L);
        Long term10657 = new Long(-1931621459457925623L);
        ArrayList term10707 = new ArrayList();
        ((ArrayList) term10707).add((Object)null);
        ((ArrayList) term10707).add((Object)null);
        ArrayList term10711 = new ArrayList();
        ((ArrayList) term10711).add((Object)null);
        ((ArrayList) term10711).add((Object)null);
        ((ArrayList) term10711).add((Object)null);
        ((ArrayList) term10711).add((Object)null);
        ((ArrayList) term10711).add((Object)null);
        ((ArrayList) term10711).add((Object)null);
        ArrayList term10715 = new ArrayList();
        ((ArrayList) term10715).add((Object)null);
        ((ArrayList) term10715).add((Object)null);
        ((ArrayList) term10715).add((Object)null);
        ((ArrayList) term10715).add((Object)null);
        ((ArrayList) term10715).add((Object)null);
        ((ArrayList) term10715).add((Object)null);
        ((ArrayList) term10715).add((Object)null);
        Object term10726 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        setField(term10726, term10726.getClass(), "id", null);
        setField(term10726, term10726.getClass(), "job", null);
        setField(term10726, term10726.getClass(), "freelancer", null);
        setField(term10726, term10726.getClass(), "appliedDate", null);
        setField(term10726, term10726.getClass(), "coverLetter", null);
        Object term10727 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        setField(term10727, term10727.getClass(), "id", null);
        setField(term10727, term10727.getClass(), "job", null);
        setField(term10727, term10727.getClass(), "freelancer", null);
        setField(term10727, term10727.getClass(), "appliedDate", null);
        setField(term10727, term10727.getClass(), "coverLetter", null);
        ArrayList term10724 = new ArrayList();
        ((ArrayList) term10724).add(term10726);
        ((ArrayList) term10724).add(term10727);
        Boolean term10730 = new Boolean(true);
        term10572 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        Object term10575 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term10602 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term10629 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term10656 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term10719 = newInstance(Class.forName("java.time.LocalDate"));
        Object term10723 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term10732 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term10572, term10572.getClass(), "id", term10573);
        setField(term10575, term10575.getClass(), "id", term10576);
        setField(term10575, term10575.getClass(), "name", "RqVPcaMpxk");
        setField(term10575, term10575.getClass(), "description", "zOsnJKDwhL");
        setField(term10572, term10572.getClass(), "skill", term10575);
        setField(term10602, term10602.getClass(), "id", term10603);
        setField(term10602, term10602.getClass(), "jobTitle", "VCOuRNQveV");
        setField(term10602, term10602.getClass(), "jobDescription", "wOBUMePcSQ");
        setField(term10629, term10629.getClass(), "id", term10630);
        setField(term10629, term10629.getClass(), "name", "SkfJvbcpSy");
        setField(term10629, term10629.getClass(), "description", "NQVfrHmuUQ");
        setField(term10602, term10602.getClass(), "skill", term10629);
        setField(term10656, term10656.getClass(), "id", term10657);
        setField(term10656, term10656.getClass(), "userName", "BxUEPMTBxW");
        setField(term10656, term10656.getClass(), "firstName", "OkwcYhqTPO");
        setField(term10656, term10656.getClass(), "lastName", "XeHaPiTvPt");
        setField(term10656, term10656.getClass(), "password", "GsyGZIlHgo");
        setField(term10656, term10656.getClass(), "postedJobs", term10707);
        setField(term10656, term10656.getClass(), "feedbacks", term10711);
        setField(term10656, term10656.getClass(), "freelancers", term10715);
        setField(term10602, term10602.getClass(), "postedBy", term10656);
        setIntField(term10719, term10719.getClass(), "year", 2026);
        setShortField(term10719, term10719.getClass(), "month", (short) 6);
        setShortField(term10719, term10719.getClass(), "day", (short) 29);
        setField(term10602, term10602.getClass(), "postedDate", term10719);
        setField(term10723, term10723.getClass(), "id", null);
        setField(term10723, term10723.getClass(), "userName", null);
        setField(term10723, term10723.getClass(), "firstName", null);
        setField(term10723, term10723.getClass(), "lastName", null);
        setField(term10723, term10723.getClass(), "password", null);
        setField(term10723, term10723.getClass(), "appliedJobs", null);
        setField(term10723, term10723.getClass(), "feedbacks", null);
        setField(term10723, term10723.getClass(), "skills", null);
        setField(term10723, term10723.getClass(), "bookmarkedJobs", null);
        setField(term10602, term10602.getClass(), "awardedTo", term10723);
        setField(term10602, term10602.getClass(), "jobApplications", term10724);
        setField(term10602, term10602.getClass(), "active", term10730);
        setField(term10572, term10572.getClass(), "job", term10602);
        setField(term10732, term10732.getClass(), "id", null);
        setField(term10732, term10732.getClass(), "userName", null);
        setField(term10732, term10732.getClass(), "firstName", null);
        setField(term10732, term10732.getClass(), "lastName", null);
        setField(term10732, term10732.getClass(), "password", null);
        setField(term10732, term10732.getClass(), "appliedJobs", null);
        setField(term10732, term10732.getClass(), "feedbacks", null);
        setField(term10732, term10732.getClass(), "skills", null);
        setField(term10732, term10732.getClass(), "bookmarkedJobs", null);
        setField(term10572, term10572.getClass(), "freelancer", term10732);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.BookmarkedJob");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFreelancer", argTypes, term10572, args);
    }

};


