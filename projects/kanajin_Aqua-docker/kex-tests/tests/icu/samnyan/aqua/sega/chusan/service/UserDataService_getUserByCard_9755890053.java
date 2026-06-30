package icu.samnyan.aqua.sega.chusan.service;

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
import static icu.samnyan.aqua.sega.chusan.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class UserDataService_getUserByCard_9755890053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1185;

    public UserDataService_getUserByCard_9755890053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1187 = new Long(-8257434502486459194L);
        term1185 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1201 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1202 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1206 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1211 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1212 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1216 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1185, term1185.getClass(), "id", 2486810210675247493L);
        setField(term1185, term1185.getClass(), "extId", term1187);
        setField(term1185, term1185.getClass(), "luid", "UlajhuVLaP");
        setIntField(term1202, term1202.getClass(), "year", 2012);
        setShortField(term1202, term1202.getClass(), "month", (short) 9);
        setShortField(term1202, term1202.getClass(), "day", (short) 11);
        setField(term1201, term1201.getClass(), "date", term1202);
        setByteField(term1206, term1206.getClass(), "hour", (byte) 22);
        setByteField(term1206, term1206.getClass(), "minute", (byte) 10);
        setByteField(term1206, term1206.getClass(), "second", (byte) 8);
        setIntField(term1206, term1206.getClass(), "nano", 380008862);
        setField(term1201, term1201.getClass(), "time", term1206);
        setField(term1185, term1185.getClass(), "registerTime", term1201);
        setIntField(term1212, term1212.getClass(), "year", 2021);
        setShortField(term1212, term1212.getClass(), "month", (short) 9);
        setShortField(term1212, term1212.getClass(), "day", (short) 7);
        setField(term1211, term1211.getClass(), "date", term1212);
        setByteField(term1216, term1216.getClass(), "hour", (byte) 5);
        setByteField(term1216, term1216.getClass(), "minute", (byte) 25);
        setByteField(term1216, term1216.getClass(), "second", (byte) 7);
        setIntField(term1216, term1216.getClass(), "nano", 755924076);
        setField(term1211, term1211.getClass(), "time", term1216);
        setField(term1185, term1185.getClass(), "accessTime", term1211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.service.UserDataService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Object[] args = new Object[1];
        args[0] = term1185;
        callMethod(klass, "getUserByCard", argTypes, null, args);
    }

};


