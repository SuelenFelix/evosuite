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

public class PostBO_getUpdatedAt_3262502868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15282;

    public PostBO_getUpdatedAt_3262502868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term15283 = new Long(24067105862153728L);
        Long term15285 = new Long(-8477368071089201577L);
        Class<? extends Object> term15348 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term15347 = ((Class) term15348).getDeclaredField((String) "TEXT");
        ((Field) term15347).setAccessible(true);
        Object enum40 = ((Field) term15347).get((Object) null);
        Long term15309 = new Long(-1526729287349763895L);
        Long term15311 = new Long(7017605765544766728L);
        Long term15313 = new Long(-6078481855513028760L);
        Long term15315 = new Long(-6985556670871089725L);
        Long term15317 = new Long(-8469818909085103606L);
        Long term15319 = new Long(11315815278355083L);
        Long term15321 = new Long(7735460540091431012L);
        ArrayList term15307 = new ArrayList();
        ((ArrayList) term15307).add(term15309);
        ((ArrayList) term15307).add(term15311);
        ((ArrayList) term15307).add(term15313);
        ((ArrayList) term15307).add(term15315);
        ((ArrayList) term15307).add(term15317);
        ((ArrayList) term15307).add(term15319);
        ((ArrayList) term15307).add(term15321);
        Long term15325 = new Long(1346299551708610248L);
        term15282 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        Object term15327 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15328 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15332 = newInstance(Class.forName("java.time.LocalTime"));
        Object term15337 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term15338 = newInstance(Class.forName("java.time.LocalDate"));
        Object term15342 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term15282, term15282.getClass(), "id", term15283);
        setField(term15282, term15282.getClass(), "userId", term15285);
        setField(term15282, term15282.getClass(), "type", enum40);
        setField(term15282, term15282.getClass(), "text", "WzFopsaDuG");
        setField(term15282, term15282.getClass(), "imageIds", term15307);
        setField(term15282, term15282.getClass(), "videoId", term15325);
        setIntField(term15328, term15328.getClass(), "year", 2018);
        setShortField(term15328, term15328.getClass(), "month", (short) 5);
        setShortField(term15328, term15328.getClass(), "day", (short) 22);
        setField(term15327, term15327.getClass(), "date", term15328);
        setByteField(term15332, term15332.getClass(), "hour", (byte) 16);
        setByteField(term15332, term15332.getClass(), "minute", (byte) 46);
        setByteField(term15332, term15332.getClass(), "second", (byte) 48);
        setIntField(term15332, term15332.getClass(), "nano", 72983043);
        setField(term15327, term15327.getClass(), "time", term15332);
        setField(term15282, term15282.getClass(), "createdAt", term15327);
        setIntField(term15338, term15338.getClass(), "year", 2022);
        setShortField(term15338, term15338.getClass(), "month", (short) 3);
        setShortField(term15338, term15338.getClass(), "day", (short) 16);
        setField(term15337, term15337.getClass(), "date", term15338);
        setByteField(term15342, term15342.getClass(), "hour", (byte) 16);
        setByteField(term15342, term15342.getClass(), "minute", (byte) 35);
        setByteField(term15342, term15342.getClass(), "second", (byte) 38);
        setIntField(term15342, term15342.getClass(), "nano", 79329968);
        setField(term15337, term15337.getClass(), "time", term15342);
        setField(term15282, term15282.getClass(), "updatedAt", term15337);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUpdatedAt", argTypes, term15282, args);
    }

};


