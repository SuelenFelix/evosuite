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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;

public class Recruiter_init_1753807021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15222;
     Object term15225;
     Object term15228;

    public Recruiter_init_1753807021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15222 = new LinkedList();
        term15225 = new LinkedList();
        Long term15232 = new Long(-1059614177994496314L);
        Long term15235 = new Long(6226372791837550337L);
        ArrayList term15241 = new ArrayList();
        ((ArrayList) term15241).add((Object)null);
        ((ArrayList) term15241).add((Object)null);
        ((ArrayList) term15241).add((Object)null);
        ArrayList term15244 = new ArrayList();
        ((ArrayList) term15244).add((Object)null);
        ((ArrayList) term15244).add((Object)null);
        ArrayList term15247 = new ArrayList();
        ((ArrayList) term15247).add((Object)null);
        ((ArrayList) term15247).add((Object)null);
        ((ArrayList) term15247).add((Object)null);
        ((ArrayList) term15247).add((Object)null);
        ((ArrayList) term15247).add((Object)null);
        ((ArrayList) term15247).add((Object)null);
        ((ArrayList) term15247).add((Object)null);
        ((ArrayList) term15247).add((Object)null);
        ((ArrayList) term15247).add((Object)null);
        ArrayList term15250 = new ArrayList();
        ((ArrayList) term15250).add((Object)null);
        ((ArrayList) term15250).add((Object)null);
        ((ArrayList) term15250).add((Object)null);
        ((ArrayList) term15250).add((Object)null);
        ((ArrayList) term15250).add((Object)null);
        ((ArrayList) term15250).add((Object)null);
        ((ArrayList) term15250).add((Object)null);
        Long term15254 = new Long(4297489130688944583L);
        ArrayList term15260 = new ArrayList();
        ((ArrayList) term15260).add((Object)null);
        ((ArrayList) term15260).add((Object)null);
        ((ArrayList) term15260).add((Object)null);
        ((ArrayList) term15260).add((Object)null);
        ((ArrayList) term15260).add((Object)null);
        ((ArrayList) term15260).add((Object)null);
        ((ArrayList) term15260).add((Object)null);
        ((ArrayList) term15260).add((Object)null);
        ((ArrayList) term15260).add((Object)null);
        ArrayList term15263 = new ArrayList();
        ((ArrayList) term15263).add((Object)null);
        ((ArrayList) term15263).add((Object)null);
        ((ArrayList) term15263).add((Object)null);
        ((ArrayList) term15263).add((Object)null);
        ArrayList term15266 = new ArrayList();
        Object term15231 = newInstance(Class.forName("com.cg.freelanceapp.entities.BookmarkedFreelancer"));
        Object term15234 = newInstance(Class.forName("com.cg.freelanceapp.entities.Freelancer"));
        Object term15253 = newInstance(Class.forName("com.cg.freelanceapp.entities.Recruiter"));
        setField(term15231, term15231.getClass(), "id", term15232);
        setField(term15234, term15234.getClass(), "id", term15235);
        setField(term15234, term15234.getClass(), "userName", "");
        setField(term15234, term15234.getClass(), "firstName", "");
        setField(term15234, term15234.getClass(), "lastName", "");
        setField(term15234, term15234.getClass(), "password", "");
        setField(term15234, term15234.getClass(), "appliedJobs", term15241);
        setField(term15234, term15234.getClass(), "feedbacks", term15244);
        setField(term15234, term15234.getClass(), "skills", term15247);
        setField(term15234, term15234.getClass(), "bookmarkedJobs", term15250);
        setField(term15231, term15231.getClass(), "freelancer", term15234);
        setField(term15253, term15253.getClass(), "id", term15254);
        setField(term15253, term15253.getClass(), "userName", "");
        setField(term15253, term15253.getClass(), "firstName", "");
        setField(term15253, term15253.getClass(), "lastName", "");
        setField(term15253, term15253.getClass(), "password", "");
        setField(term15253, term15253.getClass(), "postedJobs", term15260);
        setField(term15253, term15253.getClass(), "feedbacks", term15263);
        setField(term15253, term15253.getClass(), "freelancers", term15266);
        setField(term15231, term15231.getClass(), "bookmarkedBy", term15253);
        term15228 = new LinkedList();
        ((LinkedList) term15228).add(term15231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.entities.Recruiter");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.util.List");
        argTypes[4] = Class.forName("java.util.List");
        argTypes[5] = Class.forName("java.util.List");
        argTypes[6] = Class.forName("java.lang.String");
        Object[] args = new Object[7];
        args[0] = "IsOpDBwqZb";
        args[1] = "GBSKSryDNr";
        args[2] = "lewYJfdwbu";
        args[3] = term15222;
        args[4] = term15225;
        args[5] = term15228;
        args[6] = "utuhuXZwKw";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


