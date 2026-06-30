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

public class JobApplication_getCoverLetter_4660691424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42754;

    public JobApplication_getCoverLetter_4660691424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term42755 = new Long(3836862422152000358L);
        Long term42758 = new Long(2979885618631780227L);
        Long term42785 = new Long(-1040543263100611755L);
        Long term42812 = new Long(4584995128924595032L);
        ArrayList term42862 = new ArrayList();
        ((ArrayList) term42862).add((Object)null);
        ((ArrayList) term42862).add((Object)null);
        ((ArrayList) term42862).add((Object)null);
        ArrayList term42866 = new ArrayList();
        ArrayList term42870 = new ArrayList();
        ((ArrayList) term42870).add((Object)null);
        ((ArrayList) term42870).add((Object)null);
        ((ArrayList) term42870).add((Object)null);
        Object term42881 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        setField(term42881, term42881.getClass(), "id", null);
        setField(term42881, term42881.getClass(), "job", null);
        setField(term42881, term42881.getClass(), "freelancer", null);
        setField(term42881, term42881.getClass(), "appliedDate", null);
        setField(term42881, term42881.getClass(), "coverLetter", null);
        Object term42882 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        setField(term42882, term42882.getClass(), "id", null);
        setField(term42882, term42882.getClass(), "job", null);
        setField(term42882, term42882.getClass(), "freelancer", null);
        setField(term42882, term42882.getClass(), "appliedDate", null);
        setField(term42882, term42882.getClass(), "coverLetter", null);
        ArrayList term42879 = new ArrayList();
        ((ArrayList) term42879).add(term42881);
        ((ArrayList) term42879).add(term42882);
        Boolean term42885 = new Boolean(false);
        term42754 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term42757 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term42784 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term42811 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term42874 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42878 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term42887 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term42888 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term42889 = newInstance(Class.forName("java.time.LocalDate"));
        Object term42893 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term42754, term42754.getClass(), "id", term42755);
        setField(term42757, term42757.getClass(), "id", term42758);
        setField(term42757, term42757.getClass(), "jobTitle", "rGPyIinCpj");
        setField(term42757, term42757.getClass(), "jobDescription", "IaOmsLcrtn");
        setField(term42784, term42784.getClass(), "id", term42785);
        setField(term42784, term42784.getClass(), "name", "ORKzUipLcn");
        setField(term42784, term42784.getClass(), "description", "BogHZveAYL");
        setField(term42757, term42757.getClass(), "skill", term42784);
        setField(term42811, term42811.getClass(), "id", term42812);
        setField(term42811, term42811.getClass(), "userName", "burBurEYAD");
        setField(term42811, term42811.getClass(), "firstName", "EjzJWaQxzV");
        setField(term42811, term42811.getClass(), "lastName", "yKOwtIGejO");
        setField(term42811, term42811.getClass(), "password", "eKWlJDvRzQ");
        setField(term42811, term42811.getClass(), "postedJobs", term42862);
        setField(term42811, term42811.getClass(), "feedbacks", term42866);
        setField(term42811, term42811.getClass(), "freelancers", term42870);
        setField(term42757, term42757.getClass(), "postedBy", term42811);
        setIntField(term42874, term42874.getClass(), "year", 2026);
        setShortField(term42874, term42874.getClass(), "month", (short) 6);
        setShortField(term42874, term42874.getClass(), "day", (short) 29);
        setField(term42757, term42757.getClass(), "postedDate", term42874);
        setField(term42878, term42878.getClass(), "id", null);
        setField(term42878, term42878.getClass(), "userName", null);
        setField(term42878, term42878.getClass(), "firstName", null);
        setField(term42878, term42878.getClass(), "lastName", null);
        setField(term42878, term42878.getClass(), "password", null);
        setField(term42878, term42878.getClass(), "appliedJobs", null);
        setField(term42878, term42878.getClass(), "feedbacks", null);
        setField(term42878, term42878.getClass(), "skills", null);
        setField(term42878, term42878.getClass(), "bookmarkedJobs", null);
        setField(term42757, term42757.getClass(), "awardedTo", term42878);
        setField(term42757, term42757.getClass(), "jobApplications", term42879);
        setField(term42757, term42757.getClass(), "active", term42885);
        setField(term42754, term42754.getClass(), "job", term42757);
        setField(term42887, term42887.getClass(), "id", null);
        setField(term42887, term42887.getClass(), "userName", null);
        setField(term42887, term42887.getClass(), "firstName", null);
        setField(term42887, term42887.getClass(), "lastName", null);
        setField(term42887, term42887.getClass(), "password", null);
        setField(term42887, term42887.getClass(), "appliedJobs", null);
        setField(term42887, term42887.getClass(), "feedbacks", null);
        setField(term42887, term42887.getClass(), "skills", null);
        setField(term42887, term42887.getClass(), "bookmarkedJobs", null);
        setField(term42754, term42754.getClass(), "freelancer", term42887);
        setIntField(term42889, term42889.getClass(), "year", 2026);
        setShortField(term42889, term42889.getClass(), "month", (short) 6);
        setShortField(term42889, term42889.getClass(), "day", (short) 28);
        setField(term42888, term42888.getClass(), "date", term42889);
        setByteField(term42893, term42893.getClass(), "hour", (byte) 22);
        setByteField(term42893, term42893.getClass(), "minute", (byte) 18);
        setByteField(term42893, term42893.getClass(), "second", (byte) 45);
        setIntField(term42893, term42893.getClass(), "nano", 115763000);
        setField(term42888, term42888.getClass(), "time", term42893);
        setField(term42754, term42754.getClass(), "appliedDate", term42888);
        setField(term42754, term42754.getClass(), "coverLetter", "CpZsTbPacH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.JobApplication");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCoverLetter", argTypes, term42754, args);
    }

};


