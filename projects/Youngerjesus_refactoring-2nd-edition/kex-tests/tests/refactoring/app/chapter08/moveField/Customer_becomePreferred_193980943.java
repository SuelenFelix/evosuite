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

public class Customer_becomePreferred_193980943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139;

    public Customer_becomePreferred_193980943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term139 = newInstance(Class.forName("refactoring.app.chapter08.moveField.Customer"));
        Object term152 = newInstance(Class.forName("refactoring.app.chapter08.moveField.CustomerContract"));
        Object term153 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term154 = newInstance(Class.forName("java.time.LocalDate"));
        Object term158 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term139, term139.getClass(), "name", "xxtlPwDYFs");
        setIntField(term154, term154.getClass(), "year", 2026);
        setShortField(term154, term154.getClass(), "month", (short) 12);
        setShortField(term154, term154.getClass(), "day", (short) 14);
        setField(term153, term153.getClass(), "date", term154);
        setByteField(term158, term158.getClass(), "hour", (byte) 16);
        setByteField(term158, term158.getClass(), "minute", (byte) 34);
        setByteField(term158, term158.getClass(), "second", (byte) 9);
        setIntField(term158, term158.getClass(), "nano", 518326996);
        setField(term153, term153.getClass(), "time", term158);
        setField(term152, term152.getClass(), "startDate", term153);
        setDoubleField(term152, term152.getClass(), "discountRate", 0.36923381893433327);
        setField(term139, term139.getClass(), "customerContract", term152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter08.moveField.Customer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "becomePreferred", argTypes, term139, args);
    }

};


