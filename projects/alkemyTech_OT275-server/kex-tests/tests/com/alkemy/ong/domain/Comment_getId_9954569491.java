package com.alkemy.ong.domain;

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
import static com.alkemy.ong.domain.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;

public class Comment_getId_9954569491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6724;

    public Comment_getId_9954569491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term6725 = new Long(5671808784468963649L);
        Long term6740 = new Long(2297097306706899827L);
        Long term6803 = new Long(-900457279156388404L);
        Long term6842 = new Long(1084801489398441516L);
        Long term6881 = new Long(6273754186658578034L);
        Long term6922 = new Long(3620247240684476031L);
        Object term6921 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        setField(term6921, term6921.getClass(), "id", term6922);
        setField(term6921, term6921.getClass(), "body", null);
        setField(term6921, term6921.getClass(), "createdBy", null);
        setField(term6921, term6921.getClass(), "associatedNews", null);
        setField(term6921, term6921.getClass(), "createTimestamp", null);
        ArrayList term6919 = new ArrayList();
        ((ArrayList) term6919).add(term6921);
        term6724 = newInstance(Class.forName("com.alkemy.ong.domain.Comment"));
        Object term6739 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term6802 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        Object term6841 = newInstance(Class.forName("com.alkemy.ong.domain.News"));
        Object term6880 = newInstance(Class.forName("com.alkemy.ong.domain.Category"));
        Object term6926 = newInstance(Class.forName("java.sql.Timestamp"));
        setField(term6724, term6724.getClass(), "id", term6725);
        setField(term6724, term6724.getClass(), "body", "ecHEQufXoq");
        setField(term6739, term6739.getClass(), "id", term6740);
        setField(term6739, term6739.getClass(), "firstName", "btBLMvHzJg");
        setField(term6739, term6739.getClass(), "lastName", "JdOMfNWgLP");
        setField(term6739, term6739.getClass(), "email", "uWqXrwAsDU");
        setField(term6739, term6739.getClass(), "password", "hgFbWAUtsu");
        setField(term6739, term6739.getClass(), "imageUrl", "HqoTWlkbwF");
        setField(term6802, term6802.getClass(), "id", term6803);
        setField(term6802, term6802.getClass(), "name", "CwNELDTAPP");
        setField(term6802, term6802.getClass(), "description", "GSzQdbHLHw");
        setField(term6739, term6739.getClass(), "role", term6802);
        setField(term6739, term6739.getClass(), "token", "IkfarsYNJO");
        setField(term6724, term6724.getClass(), "createdBy", term6739);
        setField(term6841, term6841.getClass(), "id", term6842);
        setField(term6841, term6841.getClass(), "name", "aZKOWhHMEh");
        setField(term6841, term6841.getClass(), "content", "YfkhviKZwl");
        setField(term6841, term6841.getClass(), "imageUrl", "DcOhhAfJTI");
        setField(term6880, term6880.getClass(), "id", term6881);
        setField(term6880, term6880.getClass(), "name", "gYTIkBFOoS");
        setField(term6880, term6880.getClass(), "description", "xmzSoVgiED");
        setField(term6880, term6880.getClass(), "imageUrl", "pdSvedKgPq");
        setField(term6841, term6841.getClass(), "category", term6880);
        setField(term6841, term6841.getClass(), "comments", term6919);
        setField(term6724, term6724.getClass(), "associatedNews", term6841);
        setIntField(term6926, term6926.getClass(), "nanos", 302000000);
        setLongField(term6926, term6926.getClass(), "fastTime", 1442628765000L);
        setField(term6926, term6926.getClass(), "cdate", null);
        setField(term6724, term6724.getClass(), "createTimestamp", term6926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.domain.Comment");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term6724, args);
    }

};


