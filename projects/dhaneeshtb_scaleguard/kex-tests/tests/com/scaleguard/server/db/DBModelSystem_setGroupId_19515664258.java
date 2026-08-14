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

public class DBModelSystem_setGroupId_19515664258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2843;

    public DBModelSystem_setGroupId_19515664258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2843 = newInstance(Class.forName("com.scaleguard.server.db.DBModelSystem"));
        setField(term2843, term2843.getClass(), "id", "AdxvLJhNLe");
        setField(term2843, term2843.getClass(), "name", "lHfTrWKMPk");
        setField(term2843, term2843.getClass(), "groupId", "JDaAnsVTGV");
        setField(term2843, term2843.getClass(), "status", "mLUZFTfjle");
        setField(term2843, term2843.getClass(), "payload", "xIeFjkHkOe");
        setLongField(term2843, term2843.getClass(), "mts", 4784595517102746672L);
        setLongField(term2843, term2843.getClass(), "uts", -7612550318181586304L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.DBModelSystem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SdCKLMIYnX";
        callMethod(klass, "setGroupId", argTypes, term2843, args);
    }

};


