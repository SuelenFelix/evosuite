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
import java.lang.Double;

public class Customer_setDiscountRate_3771491001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67;
     Object term92;

    public Customer_setDiscountRate_3771491001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67 = newInstance(Class.forName("refactoring.app.chapter08.moveField.Customer"));
        Object term80 = newInstance(Class.forName("refactoring.app.chapter08.moveField.CustomerContract"));
        Object term81 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term82 = newInstance(Class.forName("java.time.LocalDate"));
        Object term86 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term67, term67.getClass(), "name", "sjlJAEtRrb");
        setIntField(term82, term82.getClass(), "year", 2015);
        setShortField(term82, term82.getClass(), "month", (short) 4);
        setShortField(term82, term82.getClass(), "day", (short) 14);
        setField(term81, term81.getClass(), "date", term82);
        setByteField(term86, term86.getClass(), "hour", (byte) 18);
        setByteField(term86, term86.getClass(), "minute", (byte) 24);
        setByteField(term86, term86.getClass(), "second", (byte) 32);
        setIntField(term86, term86.getClass(), "nano", 369233818);
        setField(term81, term81.getClass(), "time", term86);
        setField(term80, term80.getClass(), "startDate", term81);
        setDoubleField(term80, term80.getClass(), "discountRate", 0.28570734989730284);
        setField(term67, term67.getClass(), "customerContract", term80);
        term92 = new Double(0.40176586625454525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter08.moveField.Customer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term92;
        callMethod(klass, "setDiscountRate", argTypes, term67, args);
    }

};


