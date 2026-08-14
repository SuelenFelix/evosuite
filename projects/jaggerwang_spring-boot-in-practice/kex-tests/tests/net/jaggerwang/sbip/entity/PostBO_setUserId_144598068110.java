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

public class PostBO_setUserId_144598068110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15840;
     Object term15903;

    public PostBO_setUserId_144598068110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15841 = new Long(-1964501434345816975L);
        Long term15843 = new Long(4689907154423223972L);
        Class<? extends Object> term15906 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term15905 = ((Class) term15906).getDeclaredField((String) "TEXT");
        ((Field) term15905).setAccessible(true);
        Object enum42 = ((Field) term15905).get((Object) null);
        Long term15867 = new Long(8512025621149521819L);
        Long term15869 = new Long(2022482096970820459L);
        Long term15871 = new Long(6315101499811179240L);
        Long term15873 = new Long(-3033337370154155851L);
        Long term15875 = new Long(-3130003589475815807L);
        Long term15877 = new Long(-5344598381371854750L);
        ArrayList term15865 = new ArrayList();
        ((ArrayList) term15865).add(term15867);
        ((ArrayList) term15865).add(term15869);
        ((ArrayList) term15865).add(term15871);
        ((ArrayList) term15865).add(term15873);
        ((ArrayList) term15865).add(term15875);
        ((ArrayList) term15865).add(term15877);
        Long term15881 = new Long(-3718250311794019732L);
        term15840 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        Object term15883 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15884 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15888 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15893 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15894 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15898 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term15840, term15840.getClass(), "id", term15841);
        setField(term15840, term15840.getClass(), "userId", term15843);
        setField(term15840, term15840.getClass(), "type", enum42);
        setField(term15840, term15840.getClass(), "text", "smnHEqRFRx");
        setField(term15840, term15840.getClass(), "imageIds", term15865);
        setField(term15840, term15840.getClass(), "videoId", term15881);
        setIntField(term15884, term15884.getClass(), "year", 2015);
        setShortField(term15884, term15884.getClass(), "month", (short) 2);
        setShortField(term15884, term15884.getClass(), "day", (short) 1);
        setField(term15883, term15883.getClass(), "date", term15884);
        setByteField(term15888, term15888.getClass(), "hour", (byte) 11);
        setByteField(term15888, term15888.getClass(), "minute", (byte) 31);
        setByteField(term15888, term15888.getClass(), "second", (byte) 24);
        setIntField(term15888, term15888.getClass(), "nano", 461437823);
        setField(term15883, term15883.getClass(), "time", term15888);
        setField(term15840, term15840.getClass(), "createdAt", term15883);
        setIntField(term15894, term15894.getClass(), "year", 2012);
        setShortField(term15894, term15894.getClass(), "month", (short) 3);
        setShortField(term15894, term15894.getClass(), "day", (short) 12);
        setField(term15893, term15893.getClass(), "date", term15894);
        setByteField(term15898, term15898.getClass(), "hour", (byte) 0);
        setByteField(term15898, term15898.getClass(), "minute", (byte) 32);
        setByteField(term15898, term15898.getClass(), "second", (byte) 14);
        setIntField(term15898, term15898.getClass(), "nano", 342342345);
        setField(term15893, term15893.getClass(), "time", term15898);
        setField(term15840, term15840.getClass(), "updatedAt", term15893);
        term15903 = new Long(-5935517391653614345L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term15903;
        callMethod(klass, "setUserId", argTypes, term15840, args);
    }

};


