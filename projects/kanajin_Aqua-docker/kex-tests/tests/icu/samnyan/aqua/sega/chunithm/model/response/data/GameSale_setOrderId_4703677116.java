package icu.samnyan.aqua.sega.chunithm.model.response.data;

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
import static icu.samnyan.aqua.sega.chunithm.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class GameSale_setOrderId_4703677116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151;
     Object term176;

    public GameSale_setOrderId_4703677116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale"));
        Object term156 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term157 = newInstance(Class.forName("java.time.LocalDate"));
        Object term161 = newInstance(Class.forName("java.time.LocalTime"));
        Object term166 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term167 = newInstance(Class.forName("java.time.LocalDate"));
        Object term171 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term151, term151.getClass(), "orderId", -1007160944);
        setIntField(term151, term151.getClass(), "type", 1135664017);
        setIntField(term151, term151.getClass(), "id", 590364439);
        setIntField(term151, term151.getClass(), "rate", 865208305);
        setIntField(term157, term157.getClass(), "year", 2012);
        setShortField(term157, term157.getClass(), "month", (short) 9);
        setShortField(term157, term157.getClass(), "day", (short) 11);
        setField(term156, term156.getClass(), "date", term157);
        setByteField(term161, term161.getClass(), "hour", (byte) 22);
        setByteField(term161, term161.getClass(), "minute", (byte) 10);
        setByteField(term161, term161.getClass(), "second", (byte) 8);
        setIntField(term161, term161.getClass(), "nano", 380008862);
        setField(term156, term156.getClass(), "time", term161);
        setField(term151, term151.getClass(), "startDate", term156);
        setIntField(term167, term167.getClass(), "year", 2021);
        setShortField(term167, term167.getClass(), "month", (short) 9);
        setShortField(term167, term167.getClass(), "day", (short) 7);
        setField(term166, term166.getClass(), "date", term167);
        setByteField(term171, term171.getClass(), "hour", (byte) 5);
        setByteField(term171, term171.getClass(), "minute", (byte) 25);
        setByteField(term171, term171.getClass(), "second", (byte) 7);
        setIntField(term171, term171.getClass(), "nano", 755924076);
        setField(term166, term166.getClass(), "time", term171);
        setField(term151, term151.getClass(), "endDate", term166);
        term176 = new Integer(-1275173084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSale");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term176;
        callMethod(klass, "setOrderId", argTypes, term151, args);
    }

};


