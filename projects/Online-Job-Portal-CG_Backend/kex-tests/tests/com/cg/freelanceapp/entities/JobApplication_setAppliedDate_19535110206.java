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

public class JobApplication_setAppliedDate_19535110206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23635;
     Object term23789;

    public JobApplication_setAppliedDate_19535110206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23636 = new Long(-7560431579053662981L);
        Long term23639 = new Long(-2661716358705218539L);
        Long term23666 = new Long(-7527835270984650383L);
        Long term23693 = new Long(-8146697214903197715L);
        ArrayList term23743 = new ArrayList();
        ((ArrayList) term23743).add((Object)null);
        ((ArrayList) term23743).add((Object)null);
        ((ArrayList) term23743).add((Object)null);
        ((ArrayList) term23743).add((Object)null);
        ((ArrayList) term23743).add((Object)null);
        ((ArrayList) term23743).add((Object)null);
        ((ArrayList) term23743).add((Object)null);
        ((ArrayList) term23743).add((Object)null);
        ((ArrayList) term23743).add((Object)null);
        ArrayList term23747 = new ArrayList();
        ((ArrayList) term23747).add((Object)null);
        ((ArrayList) term23747).add((Object)null);
        ((ArrayList) term23747).add((Object)null);
        ((ArrayList) term23747).add((Object)null);
        ((ArrayList) term23747).add((Object)null);
        ((ArrayList) term23747).add((Object)null);
        ArrayList term23751 = new ArrayList();
        ArrayList term23760 = new ArrayList();
        Boolean term23764 = new Boolean(true);
        term23635 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term23638 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term23665 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term23692 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term23755 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23759 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term23766 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term23767 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23768 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23772 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23635, term23635.getClass(), "id", term23636);
        setField(term23638, term23638.getClass(), "id", term23639);
        setField(term23638, term23638.getClass(), "jobTitle", "mjbtnEEDoD");
        setField(term23638, term23638.getClass(), "jobDescription", "HkXhPRkQYt");
        setField(term23665, term23665.getClass(), "id", term23666);
        setField(term23665, term23665.getClass(), "name", "tLRwmbFiCA");
        setField(term23665, term23665.getClass(), "description", "VASBLRBXui");
        setField(term23638, term23638.getClass(), "skill", term23665);
        setField(term23692, term23692.getClass(), "id", term23693);
        setField(term23692, term23692.getClass(), "userName", "stiYhZjwjf");
        setField(term23692, term23692.getClass(), "firstName", "eNhTkzISMP");
        setField(term23692, term23692.getClass(), "lastName", "TOoaOPcTTB");
        setField(term23692, term23692.getClass(), "password", "fdqPCobvDf");
        setField(term23692, term23692.getClass(), "postedJobs", term23743);
        setField(term23692, term23692.getClass(), "feedbacks", term23747);
        setField(term23692, term23692.getClass(), "freelancers", term23751);
        setField(term23638, term23638.getClass(), "postedBy", term23692);
        setIntField(term23755, term23755.getClass(), "year", 2026);
        setShortField(term23755, term23755.getClass(), "month", (short) 8);
        setShortField(term23755, term23755.getClass(), "day", (short) 11);
        setField(term23638, term23638.getClass(), "postedDate", term23755);
        setField(term23759, term23759.getClass(), "id", null);
        setField(term23759, term23759.getClass(), "userName", null);
        setField(term23759, term23759.getClass(), "firstName", null);
        setField(term23759, term23759.getClass(), "lastName", null);
        setField(term23759, term23759.getClass(), "password", null);
        setField(term23759, term23759.getClass(), "appliedJobs", null);
        setField(term23759, term23759.getClass(), "feedbacks", null);
        setField(term23759, term23759.getClass(), "skills", null);
        setField(term23759, term23759.getClass(), "bookmarkedJobs", null);
        setField(term23638, term23638.getClass(), "awardedTo", term23759);
        setField(term23638, term23638.getClass(), "jobApplications", term23760);
        setField(term23638, term23638.getClass(), "active", term23764);
        setField(term23635, term23635.getClass(), "job", term23638);
        setField(term23766, term23766.getClass(), "id", null);
        setField(term23766, term23766.getClass(), "userName", null);
        setField(term23766, term23766.getClass(), "firstName", null);
        setField(term23766, term23766.getClass(), "lastName", null);
        setField(term23766, term23766.getClass(), "password", null);
        setField(term23766, term23766.getClass(), "appliedJobs", null);
        setField(term23766, term23766.getClass(), "feedbacks", null);
        setField(term23766, term23766.getClass(), "skills", null);
        setField(term23766, term23766.getClass(), "bookmarkedJobs", null);
        setField(term23635, term23635.getClass(), "freelancer", term23766);
        setIntField(term23768, term23768.getClass(), "year", 2026);
        setShortField(term23768, term23768.getClass(), "month", (short) 8);
        setShortField(term23768, term23768.getClass(), "day", (short) 11);
        setField(term23767, term23767.getClass(), "date", term23768);
        setByteField(term23772, term23772.getClass(), "hour", (byte) 13);
        setByteField(term23772, term23772.getClass(), "minute", (byte) 51);
        setByteField(term23772, term23772.getClass(), "second", (byte) 23);
        setIntField(term23772, term23772.getClass(), "nano", 96704000);
        setField(term23767, term23767.getClass(), "time", term23772);
        setField(term23635, term23635.getClass(), "appliedDate", term23767);
        setField(term23635, term23635.getClass(), "coverLetter", "KhhKtlPkUq");
        term23789 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term23790 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23794 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term23790, term23790.getClass(), "year", 2021);
        setShortField(term23790, term23790.getClass(), "month", (short) 1);
        setShortField(term23790, term23790.getClass(), "day", (short) 18);
        setField(term23789, term23789.getClass(), "date", term23790);
        setByteField(term23794, term23794.getClass(), "hour", (byte) 13);
        setByteField(term23794, term23794.getClass(), "minute", (byte) 38);
        setByteField(term23794, term23794.getClass(), "second", (byte) 26);
        setIntField(term23794, term23794.getClass(), "nano", 544608644);
        setField(term23789, term23789.getClass(), "time", term23794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.JobApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term23789;
        callMethod(klass, "setAppliedDate", argTypes, term23635, args);
    }

};


