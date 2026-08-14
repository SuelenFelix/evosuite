package net.jaggerwang.sbip.entity;

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
import static net.jaggerwang.sbip.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserBO_UserBOBuilder_intro_11901397047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29077;

    public UserBO_UserBOBuilder_intro_11901397047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term29078 = new Long(-3724162247917461536L);
        Long term29128 = new Long(7893661350133453338L);
        term29077 = newInstance(Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder"));
        Object term29142 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29143 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29147 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29152 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29153 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29157 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term29077, term29077.getClass(), "id", term29078);
        setField(term29077, term29077.getClass(), "username", "eOJfbiZLnb");
        setField(term29077, term29077.getClass(), "password", "nKZKnxWYCK");
        setField(term29077, term29077.getClass(), "mobile", "JOqQxuzRuZ");
        setField(term29077, term29077.getClass(), "email", "RSaoipUlsg");
        setField(term29077, term29077.getClass(), "avatarId", term29128);
        setField(term29077, term29077.getClass(), "intro", "cSHGbqKqlN");
        setIntField(term29143, term29143.getClass(), "year", 2014);
        setShortField(term29143, term29143.getClass(), "month", (short) 2);
        setShortField(term29143, term29143.getClass(), "day", (short) 18);
        setField(term29142, term29142.getClass(), "date", term29143);
        setByteField(term29147, term29147.getClass(), "hour", (byte) 4);
        setByteField(term29147, term29147.getClass(), "minute", (byte) 16);
        setByteField(term29147, term29147.getClass(), "second", (byte) 8);
        setIntField(term29147, term29147.getClass(), "nano", 486006871);
        setField(term29142, term29142.getClass(), "time", term29147);
        setField(term29077, term29077.getClass(), "createdAt", term29142);
        setIntField(term29153, term29153.getClass(), "year", 2024);
        setShortField(term29153, term29153.getClass(), "month", (short) 10);
        setShortField(term29153, term29153.getClass(), "day", (short) 8);
        setField(term29152, term29152.getClass(), "date", term29153);
        setByteField(term29157, term29157.getClass(), "hour", (byte) 19);
        setByteField(term29157, term29157.getClass(), "minute", (byte) 31);
        setByteField(term29157, term29157.getClass(), "second", (byte) 10);
        setIntField(term29157, term29157.getClass(), "nano", 930417883);
        setField(term29152, term29152.getClass(), "time", term29157);
        setField(term29077, term29077.getClass(), "updatedAt", term29152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.UserBO$UserBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pFAfANnxup";
        callMethod(klass, "intro", argTypes, term29077, args);
    }

};


