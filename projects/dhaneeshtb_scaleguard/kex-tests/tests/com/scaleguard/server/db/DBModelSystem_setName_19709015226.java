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

public class DBModelSystem_setName_19709015226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2595;

    public DBModelSystem_setName_19709015226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2595 = newInstance(Class.forName("com.scaleguard.server.db.DBModelSystem"));
        setField(term2595, term2595.getClass(), "id", "RYdKCNNMBR");
        setField(term2595, term2595.getClass(), "name", "yGtHPyvYiQ");
        setField(term2595, term2595.getClass(), "groupId", "MvRIxilFMJ");
        setField(term2595, term2595.getClass(), "status", "iNwOJRBEjp");
        setField(term2595, term2595.getClass(), "payload", "XylxrMBraH");
        setLongField(term2595, term2595.getClass(), "mts", 4178434741742309755L);
        setLongField(term2595, term2595.getClass(), "uts", -2068172595987555756L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DBModelSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pORebkoRdD";
        callMethod(klass, "setName", argTypes, term2595, args);
    }

};


