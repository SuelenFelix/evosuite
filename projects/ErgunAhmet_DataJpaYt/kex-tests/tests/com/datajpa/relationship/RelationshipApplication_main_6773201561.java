package com.datajpa.relationship;

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
import static com.datajpa.relationship.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RelationshipApplication_main_6773201561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7457;

    public RelationshipApplication_main_6773201561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7457 = (Object[]) newArray("java.lang.String", 8);
        setElement(term7457, 0, "IBpaxltauX");
        setElement(term7457, 1, "hePqROaplw");
        setElement(term7457, 2, "PJcSNDruWd");
        setElement(term7457, 3, "VVNNlAePXF");
        setElement(term7457, 4, "jnwVnmKAFv");
        setElement(term7457, 5, "TXyHhqeCjR");
        setElement(term7457, 6, "lZIgPZPgTu");
        setElement(term7457, 7, "iuCxnHGMoW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.datajpa.relationship.RelationshipApplication");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term7457;
        callMethod(klass, "main", argTypes, null, args);
    }

};


