package refactoring.app.chapter10.decomposeConditional;

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
import static refactoring.app.chapter10.decomposeConditional.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Example_isSummer_16473673502 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38;
     Object term41;
     Object term51;

    public Example_isSummer_16473673502() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38 = newInstance(Class.forName("refactoring.app.chapter10.decomposeConditional.Example"));
        setIntField(term38, term38.getClass(), "quantity", 391863371);
        setIntField(term38, term38.getClass(), "charge", -1922583790);
        term41 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term42 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term42, term42.getClass(), "year", 2015);
        setShortField(term42, term42.getClass(), "month", (short) 4);
        setShortField(term42, term42.getClass(), "day", (short) 14);
        setField(term41, term41.getClass(), "date", term42);
        setByteField(term46, term46.getClass(), "hour", (byte) 18);
        setByteField(term46, term46.getClass(), "minute", (byte) 24);
        setByteField(term46, term46.getClass(), "second", (byte) 32);
        setIntField(term46, term46.getClass(), "nano", 369233818);
        setField(term41, term41.getClass(), "time", term46);
        term51 = newInstance(Class.forName("refactoring.app.chapter10.decomposeConditional.Plan"));
        Object term52 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57 = newInstance(Class.forName("java.time.LocalTime"));
        Object term62 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term63 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term53, term53.getClass(), "year", 2022);
        setShortField(term53, term53.getClass(), "month", (short) 2);
        setShortField(term53, term53.getClass(), "day", (short) 26);
        setField(term52, term52.getClass(), "date", term53);
        setByteField(term57, term57.getClass(), "hour", (byte) 11);
        setByteField(term57, term57.getClass(), "minute", (byte) 42);
        setByteField(term57, term57.getClass(), "second", (byte) 15);
        setIntField(term57, term57.getClass(), "nano", 377731937);
        setField(term52, term52.getClass(), "time", term57);
        setField(term51, term51.getClass(), "summerStart", term52);
        setIntField(term63, term63.getClass(), "year", 2026);
        setShortField(term63, term63.getClass(), "month", (short) 12);
        setShortField(term63, term63.getClass(), "day", (short) 14);
        setField(term62, term62.getClass(), "date", term63);
        setByteField(term67, term67.getClass(), "hour", (byte) 16);
        setByteField(term67, term67.getClass(), "minute", (byte) 34);
        setByteField(term67, term67.getClass(), "second", (byte) 9);
        setIntField(term67, term67.getClass(), "nano", 518326996);
        setField(term62, term62.getClass(), "time", term67);
        setField(term51, term51.getClass(), "summerEnd", term62);
        setDoubleField(term51, term51.getClass(), "summerRate", 0.5523635872663106);
        setDoubleField(term51, term51.getClass(), "regularRate", 0.544608645520025);
        setIntField(term51, term51.getClass(), "regularServiceCharge", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter10.decomposeConditional.Example");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        argTypes[1] = Class.forName("refactoring.app.chapter10.decomposeConditional.Plan");
        Object[] args = new Object[2];
        args[0] = term41;
        args[1] = term51;
        callMethod(klass, "isSummer", argTypes, term38, args);
    }

};


