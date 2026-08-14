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

public class PostBO_getImageIds_15223493065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14436;

    public PostBO_getImageIds_15223493065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14437 = new Long(-2986201902216133814L);
        Long term14439 = new Long(4255811647459029682L);
        Class<? extends Object> term14500 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term14499 = ((Class) term14500).getDeclaredField((String) "TEXT");
        ((Field) term14499).setAccessible(true);
        Object enum37 = ((Field) term14499).get((Object) null);
        Long term14463 = new Long(8000844860910174690L);
        Long term14465 = new Long(2209808079059619773L);
        Long term14467 = new Long(8403492202041709902L);
        Long term14469 = new Long(-113028659747841511L);
        Long term14471 = new Long(7271112616766426991L);
        Long term14473 = new Long(-8514728180792822493L);
        ArrayList term14461 = new ArrayList();
        ((ArrayList) term14461).add(term14463);
        ((ArrayList) term14461).add(term14465);
        ((ArrayList) term14461).add(term14467);
        ((ArrayList) term14461).add(term14469);
        ((ArrayList) term14461).add(term14471);
        ((ArrayList) term14461).add(term14473);
        Long term14477 = new Long(5315236285592892506L);
        term14436 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        Object term14479 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14480 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14484 = newInstance(Class.forName("java.time.LocalTime"));
        Object term14489 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term14490 = newInstance(Class.forName("java.time.LocalDate"));
        Object term14494 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term14436, term14436.getClass(), "id", term14437);
        setField(term14436, term14436.getClass(), "userId", term14439);
        setField(term14436, term14436.getClass(), "type", enum37);
        setField(term14436, term14436.getClass(), "text", "aWYOWZFyaX");
        setField(term14436, term14436.getClass(), "imageIds", term14461);
        setField(term14436, term14436.getClass(), "videoId", term14477);
        setIntField(term14480, term14480.getClass(), "year", 2029);
        setShortField(term14480, term14480.getClass(), "month", (short) 5);
        setShortField(term14480, term14480.getClass(), "day", (short) 11);
        setField(term14479, term14479.getClass(), "date", term14480);
        setByteField(term14484, term14484.getClass(), "hour", (byte) 20);
        setByteField(term14484, term14484.getClass(), "minute", (byte) 17);
        setByteField(term14484, term14484.getClass(), "second", (byte) 32);
        setIntField(term14484, term14484.getClass(), "nano", 327503582);
        setField(term14479, term14479.getClass(), "time", term14484);
        setField(term14436, term14436.getClass(), "createdAt", term14479);
        setIntField(term14490, term14490.getClass(), "year", 2012);
        setShortField(term14490, term14490.getClass(), "month", (short) 10);
        setShortField(term14490, term14490.getClass(), "day", (short) 1);
        setField(term14489, term14489.getClass(), "date", term14490);
        setByteField(term14494, term14494.getClass(), "hour", (byte) 9);
        setByteField(term14494, term14494.getClass(), "minute", (byte) 27);
        setByteField(term14494, term14494.getClass(), "second", (byte) 33);
        setIntField(term14494, term14494.getClass(), "nano", 714912000);
        setField(term14489, term14489.getClass(), "time", term14494);
        setField(term14436, term14436.getClass(), "updatedAt", term14489);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageIds", argTypes, term14436, args);
    }

};


