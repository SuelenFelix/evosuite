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

public class PostBO_setText_42579208712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16625;

    public PostBO_setText_42579208712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term16626 = new Long(3086974592680165932L);
        Long term16628 = new Long(-532956263280568707L);
        Class<? extends Object> term16700 = Class.forName((String) "net.jaggerwang.sbip.entity.PostBO$Type");
        Field term16699 = ((Class) term16700).getDeclaredField((String) "IMAGE");
        ((Field) term16699).setAccessible(true);
        Object enum45 = ((Field) term16699).get((Object) null);
        Long term16653 = new Long(6073193746616629086L);
        Long term16655 = new Long(-2463629530824341661L);
        Long term16657 = new Long(7800835025296877231L);
        Long term16659 = new Long(-187772971269812453L);
        Long term16661 = new Long(468487103823886117L);
        ArrayList term16651 = new ArrayList();
        ((ArrayList) term16651).add(term16653);
        ((ArrayList) term16651).add(term16655);
        ((ArrayList) term16651).add(term16657);
        ((ArrayList) term16651).add(term16659);
        ((ArrayList) term16651).add(term16661);
        Long term16665 = new Long(4139034517298316285L);
        term16625 = newInstance(Class.forName("net.jaggerwang.sbip.entity.PostBO"));
        Object term16667 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16668 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16672 = newInstance(Class.forName("java.time.LocalTime"));
        Object term16677 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term16678 = newInstance(Class.forName("java.time.LocalDate"));
        Object term16682 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term16625, term16625.getClass(), "id", term16626);
        setField(term16625, term16625.getClass(), "userId", term16628);
        setField(term16625, term16625.getClass(), "type", enum45);
        setField(term16625, term16625.getClass(), "text", "OYbzXylRWW");
        setField(term16625, term16625.getClass(), "imageIds", term16651);
        setField(term16625, term16625.getClass(), "videoId", term16665);
        setIntField(term16668, term16668.getClass(), "year", 2023);
        setShortField(term16668, term16668.getClass(), "month", (short) 7);
        setShortField(term16668, term16668.getClass(), "day", (short) 27);
        setField(term16667, term16667.getClass(), "date", term16668);
        setByteField(term16672, term16672.getClass(), "hour", (byte) 4);
        setByteField(term16672, term16672.getClass(), "minute", (byte) 25);
        setByteField(term16672, term16672.getClass(), "second", (byte) 46);
        setIntField(term16672, term16672.getClass(), "nano", 646465452);
        setField(term16667, term16667.getClass(), "time", term16672);
        setField(term16625, term16625.getClass(), "createdAt", term16667);
        setIntField(term16678, term16678.getClass(), "year", 2022);
        setShortField(term16678, term16678.getClass(), "month", (short) 11);
        setShortField(term16678, term16678.getClass(), "day", (short) 2);
        setField(term16677, term16677.getClass(), "date", term16678);
        setByteField(term16682, term16682.getClass(), "hour", (byte) 4);
        setByteField(term16682, term16682.getClass(), "minute", (byte) 14);
        setByteField(term16682, term16682.getClass(), "second", (byte) 5);
        setIntField(term16682, term16682.getClass(), "nano", 604465127);
        setField(term16677, term16677.getClass(), "time", term16682);
        setField(term16625, term16625.getClass(), "updatedAt", term16677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.jaggerwang.sbip.entity.PostBO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DSNsTGYXDF";
        callMethod(klass, "setText", argTypes, term16625, args);
    }

};


