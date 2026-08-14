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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Post_setCreatedAt_153954314118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9540;
     Object term9601;

    public Post_setCreatedAt_153954314118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term9541 = new Long(-6685235643232255177L);
        Long term9543 = new Long(-5656664340499957324L);
        Class<? extends Object> term9612 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term9611 = ((Class) term9612).getDeclaredField((String) "TEXT");
        ((Field) term9611).setAccessible(true);
        Object enum28 = ((Field) term9611).get((Object) null);
        Long term9567 = new Long(-5460517064177800852L);
        Long term9569 = new Long(-5242567610844514867L);
        Long term9571 = new Long(-2951854704066477061L);
        Long term9573 = new Long(174253963298276221L);
        Long term9575 = new Long(3713624957161771816L);
        ArrayList term9565 = new ArrayList();
        ((ArrayList) term9565).add(term9567);
        ((ArrayList) term9565).add(term9569);
        ((ArrayList) term9565).add(term9571);
        ((ArrayList) term9565).add(term9573);
        ((ArrayList) term9565).add(term9575);
        Long term9579 = new Long(6130232388739280211L);
        term9540 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post"));
        Object term9581 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9582 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9586 = newInstance(Class.forName("java.time.LocalTime"));
        Object term9591 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9592 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9596 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term9540, term9540.getClass(), "id", term9541);
        setField(term9540, term9540.getClass(), "userId", term9543);
        setField(term9540, term9540.getClass(), "type", enum28);
        setField(term9540, term9540.getClass(), "text", "hoicvmsovO");
        setField(term9540, term9540.getClass(), "imageIds", term9565);
        setField(term9540, term9540.getClass(), "videoId", term9579);
        setIntField(term9582, term9582.getClass(), "year", 2022);
        setShortField(term9582, term9582.getClass(), "month", (short) 11);
        setShortField(term9582, term9582.getClass(), "day", (short) 5);
        setField(term9581, term9581.getClass(), "date", term9582);
        setByteField(term9586, term9586.getClass(), "hour", (byte) 0);
        setByteField(term9586, term9586.getClass(), "minute", (byte) 51);
        setByteField(term9586, term9586.getClass(), "second", (byte) 23);
        setIntField(term9586, term9586.getClass(), "nano", 1140962);
        setField(term9581, term9581.getClass(), "time", term9586);
        setField(term9540, term9540.getClass(), "createdAt", term9581);
        setIntField(term9592, term9592.getClass(), "year", 2020);
        setShortField(term9592, term9592.getClass(), "month", (short) 5);
        setShortField(term9592, term9592.getClass(), "day", (short) 24);
        setField(term9591, term9591.getClass(), "date", term9592);
        setByteField(term9596, term9596.getClass(), "hour", (byte) 2);
        setByteField(term9596, term9596.getClass(), "minute", (byte) 9);
        setByteField(term9596, term9596.getClass(), "second", (byte) 52);
        setIntField(term9596, term9596.getClass(), "nano", 653329393);
        setField(term9591, term9591.getClass(), "time", term9596);
        setField(term9540, term9540.getClass(), "updatedAt", term9591);
        term9601 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term9602 = newInstance(Class.forName("java.time.LocalDate"));
        Object term9606 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term9602, term9602.getClass(), "year", 2024);
        setShortField(term9602, term9602.getClass(), "month", (short) 9);
        setShortField(term9602, term9602.getClass(), "day", (short) 22);
        setField(term9601, term9601.getClass(), "date", term9602);
        setByteField(term9606, term9606.getClass(), "hour", (byte) 0);
        setByteField(term9606, term9606.getClass(), "minute", (byte) 11);
        setByteField(term9606, term9606.getClass(), "second", (byte) 7);
        setIntField(term9606, term9606.getClass(), "nano", 56643259);
        setField(term9601, term9601.getClass(), "time", term9606);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term9601;
        callMethod(klass, "setCreatedAt", argTypes, term9540, args);
    }

};


