package com.scaleguard.server.db;

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
import static com.scaleguard.server.db.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DBModelSystem_setStatus_9085453012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2099;

    public DBModelSystem_setStatus_9085453012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2099 = newInstance(Class.forName("com.scaleguard.server.db.DBModelSystem"));
        setField(term2099, term2099.getClass(), "id", "xOcJIiQQDu");
        setField(term2099, term2099.getClass(), "name", "GVizqqzXpy");
        setField(term2099, term2099.getClass(), "groupId", "JqXGgAhZPl");
        setField(term2099, term2099.getClass(), "status", "jiKYgYHqIS");
        setField(term2099, term2099.getClass(), "payload", "DfISiziTgG");
        setLongField(term2099, term2099.getClass(), "mts", 5262507301787091109L);
        setLongField(term2099, term2099.getClass(), "uts", -6823727938421990489L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DBModelSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XqgfKFvPSD";
        callMethod(klass, "setStatus", argTypes, term2099, args);
    }

};


