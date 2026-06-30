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

public class Freelancer_setPassword_10104783622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28509;

    public Freelancer_setPassword_10104783622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28510 = new Long(3420854384214643170L);
        Long term28563 = new Long(-8695606846865602184L);
        Long term28566 = new Long(3825080985088376106L);
        Boolean term28568 = new Boolean(true);
        Long term28571 = new Long(7140439527813222384L);
        Object term28562 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term28565 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term28570 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term28573 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28562, term28562.getClass(), "id", term28563);
        setField(term28565, term28565.getClass(), "id", term28566);
        setField(term28565, term28565.getClass(), "jobTitle", null);
        setField(term28565, term28565.getClass(), "jobDescription", null);
        setField(term28565, term28565.getClass(), "skill", null);
        setField(term28565, term28565.getClass(), "postedBy", null);
        setField(term28565, term28565.getClass(), "postedDate", null);
        setField(term28565, term28565.getClass(), "awardedTo", null);
        setField(term28565, term28565.getClass(), "jobApplications", null);
        setField(term28565, term28565.getClass(), "active", term28568);
        setField(term28562, term28562.getClass(), "job", term28565);
        setField(term28570, term28570.getClass(), "id", term28571);
        setField(term28570, term28570.getClass(), "userName", null);
        setField(term28570, term28570.getClass(), "firstName", null);
        setField(term28570, term28570.getClass(), "lastName", null);
        setField(term28570, term28570.getClass(), "password", null);
        setField(term28570, term28570.getClass(), "appliedJobs", null);
        setField(term28570, term28570.getClass(), "feedbacks", null);
        setField(term28570, term28570.getClass(), "skills", null);
        setField(term28570, term28570.getClass(), "bookmarkedJobs", null);
        setField(term28562, term28562.getClass(), "freelancer", term28570);
        setField(term28573, term28573.getClass(), "date", null);
        setField(term28573, term28573.getClass(), "time", null);
        setField(term28562, term28562.getClass(), "appliedDate", term28573);
        setField(term28562, term28562.getClass(), "coverLetter", "");
        Object term28575 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term28576 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28575, term28575.getClass(), "id", null);
        setField(term28575, term28575.getClass(), "job", null);
        setField(term28575, term28575.getClass(), "freelancer", null);
        setField(term28576, term28576.getClass(), "date", null);
        setField(term28576, term28576.getClass(), "time", null);
        setField(term28575, term28575.getClass(), "appliedDate", term28576);
        setField(term28575, term28575.getClass(), "coverLetter", null);
        Long term28578 = new Long(2950768168445402516L);
        Object term28577 = newInstance(Class.forName("com.cg.freelanceapp.entities.JobApplication"));
        Object term28580 = newInstance(Class.forName("com.cg.freelanceapp.entities.Job"));
        Object term28581 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term28582 = newInstance(Class.forName("java.time.LocalDateTime"));
        setField(term28577, term28577.getClass(), "id", term28578);
        setField(term28580, term28580.getClass(), "id", null);
        setField(term28580, term28580.getClass(), "jobTitle", null);
        setField(term28580, term28580.getClass(), "jobDescription", null);
        setField(term28580, term28580.getClass(), "skill", null);
        setField(term28580, term28580.getClass(), "postedBy", null);
        setField(term28580, term28580.getClass(), "postedDate", null);
        setField(term28580, term28580.getClass(), "awardedTo", null);
        setField(term28580, term28580.getClass(), "jobApplications", null);
        setField(term28580, term28580.getClass(), "active", null);
        setField(term28577, term28577.getClass(), "job", term28580);
        setField(term28581, term28581.getClass(), "id", null);
        setField(term28581, term28581.getClass(), "userName", null);
        setField(term28581, term28581.getClass(), "firstName", null);
        setField(term28581, term28581.getClass(), "lastName", null);
        setField(term28581, term28581.getClass(), "password", null);
        setField(term28581, term28581.getClass(), "appliedJobs", null);
        setField(term28581, term28581.getClass(), "feedbacks", null);
        setField(term28581, term28581.getClass(), "skills", null);
        setField(term28581, term28581.getClass(), "bookmarkedJobs", null);
        setField(term28577, term28577.getClass(), "freelancer", term28581);
        setField(term28582, term28582.getClass(), "date", null);
        setField(term28582, term28582.getClass(), "time", null);
        setField(term28577, term28577.getClass(), "appliedDate", term28582);
        setField(term28577, term28577.getClass(), "coverLetter", "");
        ArrayList term28560 = new ArrayList();
        ((ArrayList) term28560).add(term28562);
        ((ArrayList) term28560).add(term28575);
        ((ArrayList) term28560).add(term28577);
        Object term28588 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term28588, term28588.getClass(), "id", null);
        setField(term28588, term28588.getClass(), "ranges", null);
        setField(term28588, term28588.getClass(), "comments", null);
        setField(term28588, term28588.getClass(), "createdBy", null);
        setField(term28588, term28588.getClass(), "createdFor", null);
        Object term28589 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        setField(term28589, term28589.getClass(), "id", null);
        setField(term28589, term28589.getClass(), "ranges", null);
        setField(term28589, term28589.getClass(), "comments", null);
        setField(term28589, term28589.getClass(), "createdBy", null);
        setField(term28589, term28589.getClass(), "createdFor", null);
        ArrayList term28586 = new ArrayList();
        ((ArrayList) term28586).add(term28588);
        ((ArrayList) term28586).add(term28589);
        ((ArrayList) term28586).add(term28588);
        Object term28594 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term28594, term28594.getClass(), "id", null);
        setField(term28594, term28594.getClass(), "skill", null);
        setField(term28594, term28594.getClass(), "years", null);
        setField(term28594, term28594.getClass(), "freelancer", null);
        Object term28595 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term28595, term28595.getClass(), "id", null);
        setField(term28595, term28595.getClass(), "skill", null);
        setField(term28595, term28595.getClass(), "years", null);
        setField(term28595, term28595.getClass(), "freelancer", null);
        Object term28596 = newInstance(Class.forName("com.cg.freelanceapp.entities.SkillExperience"));
        setField(term28596, term28596.getClass(), "id", null);
        setField(term28596, term28596.getClass(), "skill", null);
        setField(term28596, term28596.getClass(), "years", null);
        setField(term28596, term28596.getClass(), "freelancer", null);
        ArrayList term28592 = new ArrayList();
        ((ArrayList) term28592).add(term28594);
        ((ArrayList) term28592).add(term28594);
        ((ArrayList) term28592).add(term28595);
        ((ArrayList) term28592).add(term28596);
        Object term28601 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        setField(term28601, term28601.getClass(), "id", null);
        setField(term28601, term28601.getClass(), "skill", null);
        setField(term28601, term28601.getClass(), "job", null);
        setField(term28601, term28601.getClass(), "freelancer", null);
        Object term28602 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        setField(term28602, term28602.getClass(), "id", null);
        setField(term28602, term28602.getClass(), "skill", null);
        setField(term28602, term28602.getClass(), "job", null);
        setField(term28602, term28602.getClass(), "freelancer", null);
        Object term28603 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedJob"));
        setField(term28603, term28603.getClass(), "id", null);
        setField(term28603, term28603.getClass(), "skill", null);
        setField(term28603, term28603.getClass(), "job", null);
        setField(term28603, term28603.getClass(), "freelancer", null);
        ArrayList term28599 = new ArrayList();
        ((ArrayList) term28599).add(term28601);
        ((ArrayList) term28599).add(term28602);
        ((ArrayList) term28599).add(term28603);
        term28509 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term28509, term28509.getClass(), "id", term28510);
        setField(term28509, term28509.getClass(), "userName", "yavShYfpzp");
        setField(term28509, term28509.getClass(), "firstName", "wMZoTYqRWV");
        setField(term28509, term28509.getClass(), "lastName", "IPZjpMvLsa");
        setField(term28509, term28509.getClass(), "password", "MOtWhQGbIj");
        setField(term28509, term28509.getClass(), "appliedJobs", term28560);
        setField(term28509, term28509.getClass(), "feedbacks", term28586);
        setField(term28509, term28509.getClass(), "skills", term28592);
        setField(term28509, term28509.getClass(), "bookmarkedJobs", term28599);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Freelancer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "biqUFWRvGE";
        callMethod(klass, "setPassword", argTypes, term28509, args);
    }

};


