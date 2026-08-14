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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedList;

public class PostBO_setImageIds_159295436813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16931;
     Object term16986;

    public PostBO_setImageIds_159295436813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16932 = new Long(5797412846146719084L);
        Long term16934 = new Long(5319740127125920367L);
        Class<? extends Object> term16990 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term16989 = ((Class) term16990).getDeclaredField((String) "TEXT");
        ((Field) term16989).setAccessible(true);
        Object enum46 = ((Field) term16989).get((Object) null);
        Long term16958 = new Long(6465987664600701876L);
        Long term16960 = new Long(-136372844051852955L);
        ArrayList term16956 = new ArrayList();
        ((ArrayList) term16956).add(term16958);
        ((ArrayList) term16956).add(term16960);
        Long term16964 = new Long(-7632759764262745126L);
        term16931 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        Object term16966 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16967 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16971 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16976 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16977 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16981 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term16931, term16931.getClass(), "id", term16932);
        setField(term16931, term16931.getClass(), "userId", term16934);
        setField(term16931, term16931.getClass(), "type", enum46);
        setField(term16931, term16931.getClass(), "text", "sQvGcVjdEx");
        setField(term16931, term16931.getClass(), "imageIds", term16956);
        setField(term16931, term16931.getClass(), "videoId", term16964);
        setIntField(term16967, term16967.getClass(), "year", 2020);
        setShortField(term16967, term16967.getClass(), "month", (short) 5);
        setShortField(term16967, term16967.getClass(), "day", (short) 12);
        setField(term16966, term16966.getClass(), "date", term16967);
        setByteField(term16971, term16971.getClass(), "hour", (byte) 22);
        setByteField(term16971, term16971.getClass(), "minute", (byte) 7);
        setByteField(term16971, term16971.getClass(), "second", (byte) 49);
        setIntField(term16971, term16971.getClass(), "nano", 677355362);
        setField(term16966, term16966.getClass(), "time", term16971);
        setField(term16931, term16931.getClass(), "createdAt", term16966);
        setIntField(term16977, term16977.getClass(), "year", 2010);
        setShortField(term16977, term16977.getClass(), "month", (short) 11);
        setShortField(term16977, term16977.getClass(), "day", (short) 1);
        setField(term16976, term16976.getClass(), "date", term16977);
        setByteField(term16981, term16981.getClass(), "hour", (byte) 5);
        setByteField(term16981, term16981.getClass(), "minute", (byte) 32);
        setByteField(term16981, term16981.getClass(), "second", (byte) 8);
        setIntField(term16981, term16981.getClass(), "nano", 918832231);
        setField(term16976, term16976.getClass(), "time", term16981);
        setField(term16931, term16931.getClass(), "updatedAt", term16976);
        term16986 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term16986;
        callMethod(klass, "setImageIds", argTypes, term16931, args);
    }

};


