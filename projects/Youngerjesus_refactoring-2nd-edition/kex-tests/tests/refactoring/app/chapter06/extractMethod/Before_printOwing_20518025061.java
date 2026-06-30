package refactoring.app.chapter06.extractMethod;

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
import static refactoring.app.chapter06.extractMethod.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Before_printOwing_20518025061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210;
     Object term211;

    public Before_printOwing_20518025061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210 = newInstance(Class.forName("refactoring.app.chapter06.extractMethod.Before"));
        ArrayList term212 = new ArrayList();
        term211 = newInstance(Class.forName("refactoring.app.chapter06.extractMethod.Invoice"));
        Object term216 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term217 = newInstance(Class.forName("java.time.LocalDate"));
        Object term221 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term211, term211.getClass(), "orders", term212);
        setIntField(term217, term217.getClass(), "year", 2026);
        setShortField(term217, term217.getClass(), "month", (short) 12);
        setShortField(term217, term217.getClass(), "day", (short) 14);
        setField(term216, term216.getClass(), "date", term217);
        setByteField(term221, term221.getClass(), "hour", (byte) 16);
        setByteField(term221, term221.getClass(), "minute", (byte) 34);
        setByteField(term221, term221.getClass(), "second", (byte) 9);
        setIntField(term221, term221.getClass(), "nano", 518326996);
        setField(term216, term216.getClass(), "time", term221);
        setField(term211, term211.getClass(), "dueDate", term216);
        setField(term211, term211.getClass(), "customer", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter06.extractMethod.Before");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter06.extractMethod.Invoice");
        Object[] args = new Object[1];
        args[0] = term211;
        callMethod(klass, "printOwing", argTypes, term210, args);
    }

};


