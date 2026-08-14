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

public class PostBO_PostBOBuilder_id_2073675961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21344;
     Object term21405;

    public PostBO_PostBOBuilder_id_2073675961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term21345 = new Long(-3231440836116263235L);
        Long term21347 = new Long(8010417010297313651L);
        Class<? extends Object> term21408 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term21407 = ((Class) term21408).getDeclaredField((String) "TEXT");
        ((Field) term21407).setAccessible(true);
        Object enum59 = ((Field) term21407).get((Object) null);
        Long term21371 = new Long(5845993504299821981L);
        Long term21373 = new Long(-1528017371096319990L);
        Long term21375 = new Long(-1526328443223793465L);
        Long term21377 = new Long(-412186147449928821L);
        Long term21379 = new Long(-1449569009562240465L);
        ArrayList term21369 = new ArrayList();
        ((ArrayList) term21369).add(term21371);
        ((ArrayList) term21369).add(term21373);
        ((ArrayList) term21369).add(term21375);
        ((ArrayList) term21369).add(term21377);
        ((ArrayList) term21369).add(term21379);
        Long term21383 = new Long(2287449183416662404L);
        term21344 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO$PostBOBuilder"));
        Object term21385 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21386 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21390 = newInstance(Class.forName("java.time.LocalTime"));
        Object term21395 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term21396 = newInstance(Class.forName("java.time.LocalDate"));
        Object term21400 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term21344, term21344.getClass(), "id", term21345);
        setField(term21344, term21344.getClass(), "userId", term21347);
        setField(term21344, term21344.getClass(), "type", enum59);
        setField(term21344, term21344.getClass(), "text", "iikZEapDlu");
        setField(term21344, term21344.getClass(), "imageIds", term21369);
        setField(term21344, term21344.getClass(), "videoId", term21383);
        setIntField(term21386, term21386.getClass(), "year", 2022);
        setShortField(term21386, term21386.getClass(), "month", (short) 8);
        setShortField(term21386, term21386.getClass(), "day", (short) 30);
        setField(term21385, term21385.getClass(), "date", term21386);
        setByteField(term21390, term21390.getClass(), "hour", (byte) 3);
        setByteField(term21390, term21390.getClass(), "minute", (byte) 13);
        setByteField(term21390, term21390.getClass(), "second", (byte) 34);
        setIntField(term21390, term21390.getClass(), "nano", 69286341);
        setField(term21385, term21385.getClass(), "time", term21390);
        setField(term21344, term21344.getClass(), "createdAt", term21385);
        setIntField(term21396, term21396.getClass(), "year", 2013);
        setShortField(term21396, term21396.getClass(), "month", (short) 5);
        setShortField(term21396, term21396.getClass(), "day", (short) 14);
        setField(term21395, term21395.getClass(), "date", term21396);
        setByteField(term21400, term21400.getClass(), "hour", (byte) 12);
        setByteField(term21400, term21400.getClass(), "minute", (byte) 8);
        setByteField(term21400, term21400.getClass(), "second", (byte) 12);
        setIntField(term21400, term21400.getClass(), "nano", 597594916);
        setField(term21395, term21395.getClass(), "time", term21400);
        setField(term21344, term21344.getClass(), "updatedAt", term21395);
        term21405 = new Long(-1223573843683081410L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO$PostBOBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term21405;
        callMethod(klass, "id", argTypes, term21344, args);
    }

};


