package refactoring.app.chapter08.moveField;

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
import static refactoring.app.chapter08.moveField.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Customer_applyAmount_13849538124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174;
     Object term199;

    public Customer_applyAmount_13849538124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174 = newInstance(Class.forName("refactoring.app.chapter08.moveField.Customer"));
        Object term187 = newInstance(Class.forName("refactoring.app.chapter08.moveField.CustomerContract"));
        Object term188 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term189 = newInstance(Class.forName("java.time.LocalDate"));
        Object term193 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term174, term174.getClass(), "name", "jJCZpVmanW");
        setIntField(term189, term189.getClass(), "year", 2025);
        setShortField(term189, term189.getClass(), "month", (short) 4);
        setShortField(term189, term189.getClass(), "day", (short) 24);
        setField(term188, term188.getClass(), "date", term189);
        setByteField(term193, term193.getClass(), "hour", (byte) 18);
        setByteField(term193, term193.getClass(), "minute", (byte) 11);
        setByteField(term193, term193.getClass(), "second", (byte) 40);
        setIntField(term193, term193.getClass(), "nano", 137454929);
        setField(term188, term188.getClass(), "time", term193);
        setField(term187, term187.getClass(), "startDate", term188);
        setDoubleField(term187, term187.getClass(), "discountRate", 0.6076495596892013);
        setField(term174, term174.getClass(), "customerContract", term187);
        term199 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter08.moveField.Customer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term199;
        callMethod(klass, "applyAmount", argTypes, term174, args);
    }

};


