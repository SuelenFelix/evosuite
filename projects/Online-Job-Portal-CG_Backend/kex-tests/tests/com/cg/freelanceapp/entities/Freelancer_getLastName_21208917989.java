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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Boolean;

public class Freelancer_getLastName_21208917989 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48759;

    public Freelancer_getLastName_21208917989() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term48760 = new Long(2293536094393567614L);
        Long term48813 = new Long(6153327149150677857L);
        Long term48816 = new Long(-9071491057399251543L);
        Boolean term48818 = new Boolean(true);
        Long term48821 = new Long(-926571219505623909L);
        Object term48812 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term48815 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term48820 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term48823 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term48812, term48812.getClass(), "id", term48813);
        setField(term48815, term48815.getClass(), "id", term48816);
        setField(term48815, term48815.getClass(), "jobTitle", null);
        setField(term48815, term48815.getClass(), "jobDescription", null);
        setField(term48815, term48815.getClass(), "skill", null);
        setField(term48815, term48815.getClass(), "postedBy", null);
        setField(term48815, term48815.getClass(), "postedDate", null);
        setField(term48815, term48815.getClass(), "awardedTo", null);
        setField(term48815, term48815.getClass(), "jobApplications", null);
        setField(term48815, term48815.getClass(), "active", term48818);
        setField(term48812, term48812.getClass(), "job", term48815);
        setField(term48820, term48820.getClass(), "id", term48821);
        setField(term48820, term48820.getClass(), "userName", null);
        setField(term48820, term48820.getClass(), "firstName", null);
        setField(term48820, term48820.getClass(), "lastName", null);
        setField(term48820, term48820.getClass(), "password", null);
        setField(term48820, term48820.getClass(), "appliedJobs", null);
        setField(term48820, term48820.getClass(), "feedbacks", null);
        setField(term48820, term48820.getClass(), "skills", null);
        setField(term48820, term48820.getClass(), "bookmarkedJobs", null);
        setField(term48812, term48812.getClass(), "freelancer", term48820);
        setField(term48823, term48823.getClass(), "date", null);
        setField(term48823, term48823.getClass(), "time", null);
        setField(term48812, term48812.getClass(), "appliedDate", term48823);
        setField(term48812, term48812.getClass(), "coverLetter", "");
        Object term48825 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term48826 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term48825, term48825.getClass(), "id", null);
        setField(term48825, term48825.getClass(), "job", null);
        setField(term48825, term48825.getClass(), "freelancer", null);
        setField(term48826, term48826.getClass(), "date", null);
        setField(term48826, term48826.getClass(), "time", null);
        setField(term48825, term48825.getClass(), "appliedDate", term48826);
        setField(term48825, term48825.getClass(), "coverLetter", null);
        Object term48827 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term48828 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term48827, term48827.getClass(), "id", null);
        setField(term48827, term48827.getClass(), "job", null);
        setField(term48827, term48827.getClass(), "freelancer", null);
        setField(term48828, term48828.getClass(), "date", null);
        setField(term48828, term48828.getClass(), "time", null);
        setField(term48827, term48827.getClass(), "appliedDate", term48828);
        setField(term48827, term48827.getClass(), "coverLetter", null);
        ArrayList term48810 = new ArrayList();
        ((ArrayList) term48810).add(term48812);
        ((ArrayList) term48810).add(term48825);
        ((ArrayList) term48810).add(term48827);
        ((ArrayList) term48810).add(term48812);
        Object term48833 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term48833, term48833.getClass(), "id", null);
        setField(term48833, term48833.getClass(), "ranges", null);
        setField(term48833, term48833.getClass(), "comments", null);
        setField(term48833, term48833.getClass(), "createdBy", null);
        setField(term48833, term48833.getClass(), "createdFor", null);
        Object term48834 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term48834, term48834.getClass(), "id", null);
        setField(term48834, term48834.getClass(), "ranges", null);
        setField(term48834, term48834.getClass(), "comments", null);
        setField(term48834, term48834.getClass(), "createdBy", null);
        setField(term48834, term48834.getClass(), "createdFor", null);
        Object term48835 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term48835, term48835.getClass(), "id", null);
        setField(term48835, term48835.getClass(), "ranges", null);
        setField(term48835, term48835.getClass(), "comments", null);
        setField(term48835, term48835.getClass(), "createdBy", null);
        setField(term48835, term48835.getClass(), "createdFor", null);
        Object term48836 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term48836, term48836.getClass(), "id", null);
        setField(term48836, term48836.getClass(), "ranges", null);
        setField(term48836, term48836.getClass(), "comments", null);
        setField(term48836, term48836.getClass(), "createdBy", null);
        setField(term48836, term48836.getClass(), "createdFor", null);
        Object term48837 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term48837, term48837.getClass(), "id", null);
        setField(term48837, term48837.getClass(), "ranges", null);
        setField(term48837, term48837.getClass(), "comments", null);
        setField(term48837, term48837.getClass(), "createdBy", null);
        setField(term48837, term48837.getClass(), "createdFor", null);
        ArrayList term48831 = new ArrayList();
        ((ArrayList) term48831).add(term48833);
        ((ArrayList) term48831).add(term48834);
        ((ArrayList) term48831).add(term48835);
        ((ArrayList) term48831).add(term48833);
        ((ArrayList) term48831).add(term48835);
        ((ArrayList) term48831).add(term48836);
        ((ArrayList) term48831).add(term48837);
        ArrayList term48840 = new ArrayList();
        Object term48846 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        setField(term48846, term48846.getClass(), "id", null);
        setField(term48846, term48846.getClass(), "skill", null);
        setField(term48846, term48846.getClass(), "job", null);
        setField(term48846, term48846.getClass(), "freelancer", null);
        Object term48847 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        setField(term48847, term48847.getClass(), "id", null);
        setField(term48847, term48847.getClass(), "skill", null);
        setField(term48847, term48847.getClass(), "job", null);
        setField(term48847, term48847.getClass(), "freelancer", null);
        Object term48848 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        setField(term48848, term48848.getClass(), "id", null);
        setField(term48848, term48848.getClass(), "skill", null);
        setField(term48848, term48848.getClass(), "job", null);
        setField(term48848, term48848.getClass(), "freelancer", null);
        ArrayList term48844 = new ArrayList();
        ((ArrayList) term48844).add(term48846);
        ((ArrayList) term48844).add(term48847);
        ((ArrayList) term48844).add(term48848);
        term48759 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term48759, term48759.getClass(), "id", term48760);
        setField(term48759, term48759.getClass(), "userName", "aNcXIRUToO");
        setField(term48759, term48759.getClass(), "firstName", "nBABxWLGOf");
        setField(term48759, term48759.getClass(), "lastName", "jdlTBcTsNZ");
        setField(term48759, term48759.getClass(), "password", "fZOYubmjQr");
        setField(term48759, term48759.getClass(), "appliedJobs", term48810);
        setField(term48759, term48759.getClass(), "feedbacks", term48831);
        setField(term48759, term48759.getClass(), "skills", term48840);
        setField(term48759, term48759.getClass(), "bookmarkedJobs", term48844);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Freelancer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term48759, args);
    }

};


