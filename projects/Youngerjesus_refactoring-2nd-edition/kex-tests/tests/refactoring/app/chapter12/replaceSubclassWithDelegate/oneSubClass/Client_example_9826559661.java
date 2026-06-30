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

public class Client_example_9826559661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296;
     Object term297;
     Object term300;

    public Client_example_9826559661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Client"));
        term297 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show"));
        setBooleanField(term297, term297.getClass(), "talkback", false);
        setIntField(term297, term297.getClass(), "price", 1551099402);
        term300 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term301 = newInstance(Class.forName("java.time.LocalDate"));
        Object term305 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term301, term301.getClass(), "year", 2027);
        setShortField(term301, term301.getClass(), "month", (short) 11);
        setShortField(term301, term301.getClass(), "day", (short) 8);
        setField(term300, term300.getClass(), "date", term301);
        setByteField(term305, term305.getClass(), "hour", (byte) 11);
        setByteField(term305, term305.getClass(), "minute", (byte) 59);
        setByteField(term305, term305.getClass(), "second", (byte) 14);
        setIntField(term305, term305.getClass(), "nano", 322375591);
        setField(term300, term300.getClass(), "time", term305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Client");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show");
        argTypes[1] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[2];
        args[0] = term297;
        args[1] = term300;
        callMethod(klass, "example", argTypes, term296, args);
    }

};


