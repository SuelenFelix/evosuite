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

public class User_UserBuilder_intro_10614132087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12913;

    public User_UserBuilder_intro_10614132087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term12914 = new Long(-3806202176947356197L);
        Long term12964 = new Long(-5534222035915952617L);
        term12913 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User$UserBuilder"));
        Object term12978 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12979 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12983 = newInstance(Class.forName("java.time.LocalTime"));
        Object term12988 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term12989 = newInstance(Class.forName("java.time.LocalDate"));
        Object term12993 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term12913, term12913.getClass(), "id", term12914);
        setField(term12913, term12913.getClass(), "username", "vjxIhXHxGR");
        setField(term12913, term12913.getClass(), "password", "QXzGXbEXMu");
        setField(term12913, term12913.getClass(), "mobile", "qxSDVejjiY");
        setField(term12913, term12913.getClass(), "email", "xBsXSDjXYK");
        setField(term12913, term12913.getClass(), "avatarId", term12964);
        setField(term12913, term12913.getClass(), "intro", "sEnIVFtZuQ");
        setIntField(term12979, term12979.getClass(), "year", 2019);
        setShortField(term12979, term12979.getClass(), "month", (short) 7);
        setShortField(term12979, term12979.getClass(), "day", (short) 4);
        setField(term12978, term12978.getClass(), "date", term12979);
        setByteField(term12983, term12983.getClass(), "hour", (byte) 19);
        setByteField(term12983, term12983.getClass(), "minute", (byte) 20);
        setByteField(term12983, term12983.getClass(), "second", (byte) 59);
        setIntField(term12983, term12983.getClass(), "nano", 246784352);
        setField(term12978, term12978.getClass(), "time", term12983);
        setField(term12913, term12913.getClass(), "createdAt", term12978);
        setIntField(term12989, term12989.getClass(), "year", 2023);
        setShortField(term12989, term12989.getClass(), "month", (short) 7);
        setShortField(term12989, term12989.getClass(), "day", (short) 1);
        setField(term12988, term12988.getClass(), "date", term12989);
        setByteField(term12993, term12993.getClass(), "hour", (byte) 4);
        setByteField(term12993, term12993.getClass(), "minute", (byte) 33);
        setByteField(term12993, term12993.getClass(), "second", (byte) 9);
        setIntField(term12993, term12993.getClass(), "nano", 94365310);
        setField(term12988, term12988.getClass(), "time", term12993);
        setField(term12913, term12913.getClass(), "updatedAt", term12988);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.User$UserBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZVecLZMLHF";
        callMethod(klass, "intro", argTypes, term12913, args);
    }

};


