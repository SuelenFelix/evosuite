package net.jaggerwang.sbip.adapter.dao.jpa.entity;

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
import static net.jaggerwang.sbip.adapter.dao.jpa.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class User_setAvatarId_97416653618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29856;
     Object term29941;

    public User_setAvatarId_97416653618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29857 = new Long(-1237494311441603673L);
        Long term29907 = new Long(3550928874058758597L);
        term29856 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User"));
        Object term29921 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29922 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29926 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29931 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29932 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29936 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29856, term29856.getClass(), "id", term29857);
        setField(term29856, term29856.getClass(), "username", "lgQkrXANyI");
        setField(term29856, term29856.getClass(), "password", "MeTmRZXErV");
        setField(term29856, term29856.getClass(), "mobile", "jNxbVmoZgq");
        setField(term29856, term29856.getClass(), "email", "PvmBHIXaMY");
        setField(term29856, term29856.getClass(), "avatarId", term29907);
        setField(term29856, term29856.getClass(), "intro", "hulYxtowxw");
        setIntField(term29922, term29922.getClass(), "year", 2019);
        setShortField(term29922, term29922.getClass(), "month", (short) 2);
        setShortField(term29922, term29922.getClass(), "day", (short) 19);
        setField(term29921, term29921.getClass(), "date", term29922);
        setByteField(term29926, term29926.getClass(), "hour", (byte) 9);
        setByteField(term29926, term29926.getClass(), "minute", (byte) 3);
        setByteField(term29926, term29926.getClass(), "second", (byte) 19);
        setIntField(term29926, term29926.getClass(), "nano", 646336873);
        setField(term29921, term29921.getClass(), "time", term29926);
        setField(term29856, term29856.getClass(), "createdAt", term29921);
        setIntField(term29932, term29932.getClass(), "year", 2017);
        setShortField(term29932, term29932.getClass(), "month", (short) 2);
        setShortField(term29932, term29932.getClass(), "day", (short) 10);
        setField(term29931, term29931.getClass(), "date", term29932);
        setByteField(term29936, term29936.getClass(), "hour", (byte) 13);
        setByteField(term29936, term29936.getClass(), "minute", (byte) 52);
        setByteField(term29936, term29936.getClass(), "second", (byte) 4);
        setIntField(term29936, term29936.getClass(), "nano", 660576536);
        setField(term29931, term29931.getClass(), "time", term29936);
        setField(term29856, term29856.getClass(), "updatedAt", term29931);
        term29941 = new Long(987797117310260031L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term29941;
        callMethod(klass, "setAvatarId", argTypes, term29856, args);
    }

};


