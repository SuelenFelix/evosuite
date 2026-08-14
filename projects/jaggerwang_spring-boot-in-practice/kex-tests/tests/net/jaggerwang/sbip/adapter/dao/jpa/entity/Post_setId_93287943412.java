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

public class Post_setId_93287943412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7622;
     Object term7683;

    public Post_setId_93287943412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term7623 = new Long(21047099434645581L);
        Long term7625 = new Long(-8862087040734407227L);
        Class<? extends Object> term7686 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term7685 = ((Class) term7686).getDeclaredField((String) "TEXT");
        ((Field) term7685).setAccessible(true);
        Object enum21 = ((Field) term7685).get((Object) null);
        Long term7649 = new Long(-6394943900800506753L);
        Long term7651 = new Long(-4867941246533901410L);
        Long term7653 = new Long(1044883697493326351L);
        Long term7655 = new Long(-7406618974062419277L);
        Long term7657 = new Long(868503089567085985L);
        ArrayList term7647 = new ArrayList();
        ((ArrayList) term7647).add(term7649);
        ((ArrayList) term7647).add(term7651);
        ((ArrayList) term7647).add(term7653);
        ((ArrayList) term7647).add(term7655);
        ((ArrayList) term7647).add(term7657);
        Long term7661 = new Long(-3277773415369003529L);
        term7622 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post"));
        Object term7663 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7664 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7668 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7673 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7674 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7678 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7622, term7622.getClass(), "id", term7623);
        setField(term7622, term7622.getClass(), "userId", term7625);
        setField(term7622, term7622.getClass(), "type", enum21);
        setField(term7622, term7622.getClass(), "text", "YRHGsAkhxb");
        setField(term7622, term7622.getClass(), "imageIds", term7647);
        setField(term7622, term7622.getClass(), "videoId", term7661);
        setIntField(term7664, term7664.getClass(), "year", 2013);
        setShortField(term7664, term7664.getClass(), "month", (short) 7);
        setShortField(term7664, term7664.getClass(), "day", (short) 26);
        setField(term7663, term7663.getClass(), "date", term7664);
        setByteField(term7668, term7668.getClass(), "hour", (byte) 14);
        setByteField(term7668, term7668.getClass(), "minute", (byte) 45);
        setByteField(term7668, term7668.getClass(), "second", (byte) 33);
        setIntField(term7668, term7668.getClass(), "nano", 547995853);
        setField(term7663, term7663.getClass(), "time", term7668);
        setField(term7622, term7622.getClass(), "createdAt", term7663);
        setIntField(term7674, term7674.getClass(), "year", 2016);
        setShortField(term7674, term7674.getClass(), "month", (short) 12);
        setShortField(term7674, term7674.getClass(), "day", (short) 20);
        setField(term7673, term7673.getClass(), "date", term7674);
        setByteField(term7678, term7678.getClass(), "hour", (byte) 8);
        setByteField(term7678, term7678.getClass(), "minute", (byte) 46);
        setByteField(term7678, term7678.getClass(), "second", (byte) 16);
        setIntField(term7678, term7678.getClass(), "nano", 10071864);
        setField(term7673, term7673.getClass(), "time", term7678);
        setField(term7622, term7622.getClass(), "updatedAt", term7673);
        term7683 = new Long(1253549421411622358L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term7683;
        callMethod(klass, "setId", argTypes, term7622, args);
    }

};


