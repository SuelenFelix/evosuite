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

public class Post_toBO_2168850831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4818;

    public Post_toBO_2168850831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4819 = new Long(-7291742736502427077L);
        Long term4821 = new Long(-8121849829073967555L);
        Class<? extends Object> term4879 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term4878 = ((Class) term4879).getDeclaredField((String) "VIDEO");
        ((Field) term4878).setAccessible(true);
        Object enum11 = ((Field) term4878).get((Object) null);
        Long term4846 = new Long(5219030281405653303L);
        Long term4848 = new Long(-8471550651709805183L);
        Long term4850 = new Long(-948292411727204525L);
        Long term4852 = new Long(-8892586408602479513L);
        ArrayList term4844 = new ArrayList();
        ((ArrayList) term4844).add(term4846);
        ((ArrayList) term4844).add(term4848);
        ((ArrayList) term4844).add(term4850);
        ((ArrayList) term4844).add(term4852);
        Long term4856 = new Long(4616440478358528406L);
        term4818 = newInstance(Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post"));
        Object term4858 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4859 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4863 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4868 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4869 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4873 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term4818, term4818.getClass(), "id", term4819);
        setField(term4818, term4818.getClass(), "userId", term4821);
        setField(term4818, term4818.getClass(), "type", enum11);
        setField(term4818, term4818.getClass(), "text", "GzFkzHGYFt");
        setField(term4818, term4818.getClass(), "imageIds", term4844);
        setField(term4818, term4818.getClass(), "videoId", term4856);
        setIntField(term4859, term4859.getClass(), "year", 2020);
        setShortField(term4859, term4859.getClass(), "month", (short) 5);
        setShortField(term4859, term4859.getClass(), "day", (short) 12);
        setField(term4858, term4858.getClass(), "date", term4859);
        setByteField(term4863, term4863.getClass(), "hour", (byte) 0);
        setByteField(term4863, term4863.getClass(), "minute", (byte) 15);
        setByteField(term4863, term4863.getClass(), "second", (byte) 24);
        setIntField(term4863, term4863.getClass(), "nano", 250257744);
        setField(term4858, term4858.getClass(), "time", term4863);
        setField(term4818, term4818.getClass(), "createdAt", term4858);
        setIntField(term4869, term4869.getClass(), "year", 2013);
        setShortField(term4869, term4869.getClass(), "month", (short) 9);
        setShortField(term4869, term4869.getClass(), "day", (short) 19);
        setField(term4868, term4868.getClass(), "date", term4869);
        setByteField(term4873, term4873.getClass(), "hour", (byte) 12);
        setByteField(term4873, term4873.getClass(), "minute", (byte) 29);
        setByteField(term4873, term4873.getClass(), "second", (byte) 28);
        setIntField(term4873, term4873.getClass(), "nano", 244069764);
        setField(term4868, term4868.getClass(), "time", term4873);
        setField(term4818, term4818.getClass(), "updatedAt", term4868);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.adapter.dao.jpa.entity.Post");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBO", argTypes, term4818, args);
    }

};


