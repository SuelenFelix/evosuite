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
import java.lang.Integer;
import java.util.LinkedList;

public class Recruiter_setFreelancers_165829028014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17344;
     Object term17426;

    public Recruiter_setFreelancers_165829028014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term17345 = new Long(8192919049584536731L);
        ArrayList term17395 = new ArrayList();
        Long term17402 = new Long(661658911296323350L);
        Integer term17404 = new Integer(897010381);
        Long term17408 = new Long(2352206876218352319L);
        Object term17401 = newInstance(Class.forName("com.cg.freelanceapp.entities.Feedback"));
        Object term17407 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        Object term17410 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term17401, term17401.getClass(), "id", term17402);
        setField(term17401, term17401.getClass(), "ranges", term17404);
        setField(term17401, term17401.getClass(), "comments", "");
        setField(term17407, term17407.getClass(), "id", term17408);
        setField(term17407, term17407.getClass(), "userName", null);
        setField(term17407, term17407.getClass(), "firstName", null);
        setField(term17407, term17407.getClass(), "lastName", null);
        setField(term17407, term17407.getClass(), "password", null);
        setField(term17407, term17407.getClass(), "postedJobs", null);
        setField(term17407, term17407.getClass(), "feedbacks", null);
        setField(term17407, term17407.getClass(), "freelancers", null);
        setField(term17401, term17401.getClass(), "createdBy", term17407);
        setField(term17410, term17410.getClass(), "id", null);
        setField(term17410, term17410.getClass(), "userName", null);
        setField(term17410, term17410.getClass(), "firstName", null);
        setField(term17410, term17410.getClass(), "lastName", null);
        setField(term17410, term17410.getClass(), "password", null);
        setField(term17410, term17410.getClass(), "appliedJobs", null);
        setField(term17410, term17410.getClass(), "feedbacks", null);
        setField(term17410, term17410.getClass(), "skills", null);
        setField(term17410, term17410.getClass(), "bookmarkedJobs", null);
        setField(term17401, term17401.getClass(), "createdFor", term17410);
        ArrayList term17399 = new ArrayList();
        ((ArrayList) term17399).add(term17401);
        Long term17416 = new Long(1482362208900211503L);
        Object term17415 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedFreelancer"));
        Object term17418 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        setField(term17415, term17415.getClass(), "id", term17416);
        setField(term17418, term17418.getClass(), "id", null);
        setField(term17418, term17418.getClass(), "userName", null);
        setField(term17418, term17418.getClass(), "firstName", null);
        setField(term17418, term17418.getClass(), "lastName", null);
        setField(term17418, term17418.getClass(), "password", null);
        setField(term17418, term17418.getClass(), "appliedJobs", null);
        setField(term17418, term17418.getClass(), "feedbacks", null);
        setField(term17418, term17418.getClass(), "skills", null);
        setField(term17418, term17418.getClass(), "bookmarkedJobs", null);
        setField(term17415, term17415.getClass(), "freelancer", term17418);
        setField(term17415, term17415.getClass(), "bookmarkedBy", term17407);
        Long term17420 = new Long(-712231978771147321L);
        Object term17419 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedFreelancer"));
        Object term17422 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term17423 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        setField(term17419, term17419.getClass(), "id", term17420);
        setField(term17422, term17422.getClass(), "id", null);
        setField(term17422, term17422.getClass(), "userName", null);
        setField(term17422, term17422.getClass(), "firstName", null);
        setField(term17422, term17422.getClass(), "lastName", null);
        setField(term17422, term17422.getClass(), "password", null);
        setField(term17422, term17422.getClass(), "appliedJobs", null);
        setField(term17422, term17422.getClass(), "feedbacks", null);
        setField(term17422, term17422.getClass(), "skills", null);
        setField(term17422, term17422.getClass(), "bookmarkedJobs", null);
        setField(term17419, term17419.getClass(), "freelancer", term17422);
        setField(term17423, term17423.getClass(), "id", null);
        setField(term17423, term17423.getClass(), "userName", null);
        setField(term17423, term17423.getClass(), "firstName", null);
        setField(term17423, term17423.getClass(), "lastName", null);
        setField(term17423, term17423.getClass(), "password", null);
        setField(term17423, term17423.getClass(), "postedJobs", null);
        setField(term17423, term17423.getClass(), "feedbacks", null);
        setField(term17423, term17423.getClass(), "freelancers", null);
        setField(term17419, term17419.getClass(), "bookmarkedBy", term17423);
        ArrayList term17413 = new ArrayList();
        ((ArrayList) term17413).add(term17415);
        ((ArrayList) term17413).add(term17419);
        term17344 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        setField(term17344, term17344.getClass(), "id", term17345);
        setField(term17344, term17344.getClass(), "userName", "zMTUAmZToL");
        setField(term17344, term17344.getClass(), "firstName", "lnDYutrxeh");
        setField(term17344, term17344.getClass(), "lastName", "cTHQspxtSw");
        setField(term17344, term17344.getClass(), "password", "RkPKoKjNWD");
        setField(term17344, term17344.getClass(), "postedJobs", term17395);
        setField(term17344, term17344.getClass(), "feedbacks", term17399);
        setField(term17344, term17344.getClass(), "freelancers", term17413);
        term17426 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Recruiter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term17426;
        callMethod(klass, "setFreelancers", argTypes, term17344, args);
    }

};


