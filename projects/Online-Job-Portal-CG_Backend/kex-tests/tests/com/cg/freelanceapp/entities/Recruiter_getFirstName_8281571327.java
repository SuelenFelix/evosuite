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

public class Recruiter_getFirstName_8281571327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16004;

    public Recruiter_getFirstName_8281571327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16005 = new Long(-8028700724672913769L);
        Long term16058 = new Long(4968282128824824030L);
        Long term16063 = new Long(8639639803357659892L);
        Long term16066 = new Long(-6699045864427523717L);
        ArrayList term16073 = new ArrayList();
        ((ArrayList) term16073).add((Object)null);
        ((ArrayList) term16073).add((Object)null);
        ((ArrayList) term16073).add((Object)null);
        Boolean term16076 = new Boolean(true);
        Object term16057 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term16062 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term16065 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term16068 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16072 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term16057, term16057.getClass(), "id", term16058);
        setField(term16057, term16057.getClass(), "jobTitle", "");
        setField(term16057, term16057.getClass(), "jobDescription", "");
        setField(term16062, term16062.getClass(), "id", term16063);
        setField(term16062, term16062.getClass(), "name", null);
        setField(term16062, term16062.getClass(), "description", null);
        setField(term16057, term16057.getClass(), "skill", term16062);
        setField(term16065, term16065.getClass(), "id", term16066);
        setField(term16065, term16065.getClass(), "userName", null);
        setField(term16065, term16065.getClass(), "firstName", null);
        setField(term16065, term16065.getClass(), "lastName", null);
        setField(term16065, term16065.getClass(), "password", null);
        setField(term16065, term16065.getClass(), "postedJobs", null);
        setField(term16065, term16065.getClass(), "feedbacks", null);
        setField(term16065, term16065.getClass(), "freelancers", null);
        setField(term16057, term16057.getClass(), "postedBy", term16065);
        setIntField(term16068, term16068.getClass(), "year", 2026);
        setShortField(term16068, term16068.getClass(), "month", (short) 4);
        setShortField(term16068, term16068.getClass(), "day", (short) 2);
        setField(term16057, term16057.getClass(), "postedDate", term16068);
        setField(term16072, term16072.getClass(), "id", null);
        setField(term16072, term16072.getClass(), "userName", null);
        setField(term16072, term16072.getClass(), "firstName", null);
        setField(term16072, term16072.getClass(), "lastName", null);
        setField(term16072, term16072.getClass(), "password", null);
        setField(term16072, term16072.getClass(), "appliedJobs", null);
        setField(term16072, term16072.getClass(), "feedbacks", null);
        setField(term16072, term16072.getClass(), "skills", null);
        setField(term16072, term16072.getClass(), "bookmarkedJobs", null);
        setField(term16057, term16057.getClass(), "awardedTo", term16072);
        setField(term16057, term16057.getClass(), "jobApplications", term16073);
        setField(term16057, term16057.getClass(), "active", term16076);
        Long term16079 = new Long(3506568970076223101L);
        Long term16084 = new Long(-2397817278487988239L);
        Long term16087 = new Long(1618391554363715092L);
        ArrayList term16094 = new ArrayList();
        ((ArrayList) term16094).add((Object)null);
        ((ArrayList) term16094).add((Object)null);
        ((ArrayList) term16094).add((Object)null);
        ((ArrayList) term16094).add((Object)null);
        ((ArrayList) term16094).add((Object)null);
        ((ArrayList) term16094).add((Object)null);
        ((ArrayList) term16094).add((Object)null);
        ((ArrayList) term16094).add((Object)null);
        Boolean term16097 = new Boolean(false);
        Object term16078 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term16083 = newInstance(Class.forName("com.cg.freelanceapp.entities.Skill"));
        Object term16086 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term16089 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16093 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term16078, term16078.getClass(), "id", term16079);
        setField(term16078, term16078.getClass(), "jobTitle", "");
        setField(term16078, term16078.getClass(), "jobDescription", "");
        setField(term16083, term16083.getClass(), "id", term16084);
        setField(term16083, term16083.getClass(), "name", null);
        setField(term16083, term16083.getClass(), "description", null);
        setField(term16078, term16078.getClass(), "skill", term16083);
        setField(term16086, term16086.getClass(), "id", term16087);
        setField(term16086, term16086.getClass(), "userName", null);
        setField(term16086, term16086.getClass(), "firstName", null);
        setField(term16086, term16086.getClass(), "lastName", null);
        setField(term16086, term16086.getClass(), "password", null);
        setField(term16086, term16086.getClass(), "postedJobs", null);
        setField(term16086, term16086.getClass(), "feedbacks", null);
        setField(term16086, term16086.getClass(), "freelancers", null);
        setField(term16078, term16078.getClass(), "postedBy", term16086);
        setIntField(term16089, term16089.getClass(), "year", 2026);
        setShortField(term16089, term16089.getClass(), "month", (short) 4);
        setShortField(term16089, term16089.getClass(), "day", (short) 2);
        setField(term16078, term16078.getClass(), "postedDate", term16089);
        setField(term16093, term16093.getClass(), "id", null);
        setField(term16093, term16093.getClass(), "userName", null);
        setField(term16093, term16093.getClass(), "firstName", null);
        setField(term16093, term16093.getClass(), "lastName", null);
        setField(term16093, term16093.getClass(), "password", null);
        setField(term16093, term16093.getClass(), "appliedJobs", null);
        setField(term16093, term16093.getClass(), "feedbacks", null);
        setField(term16093, term16093.getClass(), "skills", null);
        setField(term16093, term16093.getClass(), "bookmarkedJobs", null);
        setField(term16078, term16078.getClass(), "awardedTo", term16093);
        setField(term16078, term16078.getClass(), "jobApplications", term16094);
        setField(term16078, term16078.getClass(), "active", term16097);
        ArrayList term16055 = new ArrayList();
        ((ArrayList) term16055).add(term16057);
        ((ArrayList) term16055).add(term16078);
        ArrayList term16101 = new ArrayList();
        Long term16108 = new Long(-8439940175231511654L);
        Object term16107 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedFreelancer"));
        Object term16110 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term16107, term16107.getClass(), "id", term16108);
        setField(term16110, term16110.getClass(), "id", null);
        setField(term16110, term16110.getClass(), "userName", null);
        setField(term16110, term16110.getClass(), "firstName", null);
        setField(term16110, term16110.getClass(), "lastName", null);
        setField(term16110, term16110.getClass(), "password", null);
        setField(term16110, term16110.getClass(), "appliedJobs", null);
        setField(term16110, term16110.getClass(), "feedbacks", null);
        setField(term16110, term16110.getClass(), "skills", null);
        setField(term16110, term16110.getClass(), "bookmarkedJobs", null);
        setField(term16107, term16107.getClass(), "freelancer", term16110);
        setField(term16107, term16107.getClass(), "bookmarkedBy", term16065);
        ArrayList term16105 = new ArrayList();
        ((ArrayList) term16105).add(term16107);
        term16004 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        setField(term16004, term16004.getClass(), "id", term16005);
        setField(term16004, term16004.getClass(), "userName", "fIeNSTsisH");
        setField(term16004, term16004.getClass(), "firstName", "rsKcNOWfZH");
        setField(term16004, term16004.getClass(), "lastName", "NwcJhozXMr");
        setField(term16004, term16004.getClass(), "password", "nEgtuqAlLm");
        setField(term16004, term16004.getClass(), "postedJobs", term16055);
        setField(term16004, term16004.getClass(), "feedbacks", term16101);
        setField(term16004, term16004.getClass(), "freelancers", term16105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Recruiter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term16004, args);
    }

};


