package refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass;

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
import static refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Client_createBooking_6998833753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327;
     Object term328;
     Object term331;

    public Client_createBooking_6998833753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term327 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Client"));
        term328 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show"));
        setBooleanField(term328, term328.getClass(), "talkback", false);
        setIntField(term328, term328.getClass(), "price", 1375330971);
        term331 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term332 = newInstance(Class.forName("java.time.LocalDate"));
        Object term336 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term332, term332.getClass(), "year", 2014);
        setShortField(term332, term332.getClass(), "month", (short) 11);
        setShortField(term332, term332.getClass(), "day", (short) 8);
        setField(term331, term331.getClass(), "date", term332);
        setByteField(term336, term336.getClass(), "hour", (byte) 8);
        setByteField(term336, term336.getClass(), "minute", (byte) 43);
        setByteField(term336, term336.getClass(), "second", (byte) 32);
        setIntField(term336, term336.getClass(), "nano", 154434838);
        setField(term331, term331.getClass(), "time", term336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Client");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show");
        argTypes[1] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[2];
        args[0] = term328;
        args[1] = term331;
        callMethod(klass, "createBooking", argTypes, term327, args);
    }

};


