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

public class JobApplication_setCoverLetter_3630183267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23889;

    public JobApplication_setCoverLetter_3630183267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term23890 = new Long(-4250525757325272766L);
        Long term23893 = new Long(-4598924338147045508L);
        Long term23920 = new Long(-7798512476724848724L);
        Long term23947 = new Long(-6636305539248410003L);
        ArrayList term23997 = new ArrayList();
        ((ArrayList) term23997).add((Object)null);
        ((ArrayList) term23997).add((Object)null);
        ((ArrayList) term23997).add((Object)null);
        ((ArrayList) term23997).add((Object)null);
        ArrayList term24001 = new ArrayList();
        ((ArrayList) term24001).add((Object)null);
        ((ArrayList) term24001).add((Object)null);
        ((ArrayList) term24001).add((Object)null);
        ((ArrayList) term24001).add((Object)null);
        ((ArrayList) term24001).add((Object)null);
        ((ArrayList) term24001).add((Object)null);
        ((ArrayList) term24001).add((Object)null);
        ((ArrayList) term24001).add((Object)null);
        ((ArrayList) term24001).add((Object)null);
        ArrayList term24005 = new ArrayList();
        ((ArrayList) term24005).add((Object)null);
        ((ArrayList) term24005).add((Object)null);
        ((ArrayList) term24005).add((Object)null);
        ((ArrayList) term24005).add((Object)null);
        ((ArrayList) term24005).add((Object)null);
        ((ArrayList) term24005).add((Object)null);
        ArrayList term24014 = new ArrayList();
        Boolean term24018 = new Boolean(false);
        term23889 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term23892 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term23919 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term23946 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term24009 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24013 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term24020 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term24021 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term24022 = newInstance(Class.forName("java.time.LocalDate"));
        Object term24026 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term23889, term23889.getClass(), "id", term23890);
        setField(term23892, term23892.getClass(), "id", term23893);
        setField(term23892, term23892.getClass(), "jobTitle", "GfrUvQyuXI");
        setField(term23892, term23892.getClass(), "jobDescription", "PLhGFeYSpm");
        setField(term23919, term23919.getClass(), "id", term23920);
        setField(term23919, term23919.getClass(), "name", "VGBjXtYbqH");
        setField(term23919, term23919.getClass(), "description", "ANFGUfOYmw");
        setField(term23892, term23892.getClass(), "skill", term23919);
        setField(term23946, term23946.getClass(), "id", term23947);
        setField(term23946, term23946.getClass(), "userName", "NUUMwMAxia");
        setField(term23946, term23946.getClass(), "firstName", "aQGVzRXubV");
        setField(term23946, term23946.getClass(), "lastName", "LgLQoNmiDg");
        setField(term23946, term23946.getClass(), "password", "bbYPwbDjdW");
        setField(term23946, term23946.getClass(), "postedJobs", term23997);
        setField(term23946, term23946.getClass(), "feedbacks", term24001);
        setField(term23946, term23946.getClass(), "freelancers", term24005);
        setField(term23892, term23892.getClass(), "postedBy", term23946);
        setIntField(term24009, term24009.getClass(), "year", 2026);
        setShortField(term24009, term24009.getClass(), "month", (short) 4);
        setShortField(term24009, term24009.getClass(), "day", (short) 2);
        setField(term23892, term23892.getClass(), "postedDate", term24009);
        setField(term24013, term24013.getClass(), "id", null);
        setField(term24013, term24013.getClass(), "userName", null);
        setField(term24013, term24013.getClass(), "firstName", null);
        setField(term24013, term24013.getClass(), "lastName", null);
        setField(term24013, term24013.getClass(), "password", null);
        setField(term24013, term24013.getClass(), "appliedJobs", null);
        setField(term24013, term24013.getClass(), "feedbacks", null);
        setField(term24013, term24013.getClass(), "skills", null);
        setField(term24013, term24013.getClass(), "bookmarkedJobs", null);
        setField(term23892, term23892.getClass(), "awardedTo", term24013);
        setField(term23892, term23892.getClass(), "jobApplications", term24014);
        setField(term23892, term23892.getClass(), "active", term24018);
        setField(term23889, term23889.getClass(), "job", term23892);
        setField(term24020, term24020.getClass(), "id", null);
        setField(term24020, term24020.getClass(), "userName", null);
        setField(term24020, term24020.getClass(), "firstName", null);
        setField(term24020, term24020.getClass(), "lastName", null);
        setField(term24020, term24020.getClass(), "password", null);
        setField(term24020, term24020.getClass(), "appliedJobs", null);
        setField(term24020, term24020.getClass(), "feedbacks", null);
        setField(term24020, term24020.getClass(), "skills", null);
        setField(term24020, term24020.getClass(), "bookmarkedJobs", null);
        setField(term23889, term23889.getClass(), "freelancer", term24020);
        setIntField(term24022, term24022.getClass(), "year", 2026);
        setShortField(term24022, term24022.getClass(), "month", (short) 4);
        setShortField(term24022, term24022.getClass(), "day", (short) 1);
        setField(term24021, term24021.getClass(), "date", term24022);
        setByteField(term24026, term24026.getClass(), "hour", (byte) 19);
        setByteField(term24026, term24026.getClass(), "minute", (byte) 39);
        setByteField(term24026, term24026.getClass(), "second", (byte) 26);
        setIntField(term24026, term24026.getClass(), "nano", 246031000);
        setField(term24021, term24021.getClass(), "time", term24026);
        setField(term23889, term23889.getClass(), "appliedDate", term24021);
        setField(term23889, term23889.getClass(), "coverLetter", "ZaJQogOfKZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.JobApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OiUMzYeuet";
        callMethod(klass, "setCoverLetter", argTypes, term23889, args);
    }

};


