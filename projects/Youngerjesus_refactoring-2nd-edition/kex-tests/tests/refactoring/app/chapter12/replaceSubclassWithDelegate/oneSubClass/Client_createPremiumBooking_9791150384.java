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

public class Client_createPremiumBooking_9791150384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341;
     Object term342;
     Object term345;
     Object term355;

    public Client_createPremiumBooking_9791150384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term341 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Client"));
        term342 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show"));
        setBooleanField(term342, term342.getClass(), "talkback", true);
        setIntField(term342, term342.getClass(), "price", -478195677);
        term345 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term346 = newInstance(Class.forName("java.time.LocalDate"));
        Object term350 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term346, term346.getClass(), "year", 2020);
        setShortField(term346, term346.getClass(), "month", (short) 5);
        setShortField(term346, term346.getClass(), "day", (short) 18);
        setField(term345, term345.getClass(), "date", term346);
        setByteField(term350, term350.getClass(), "hour", (byte) 5);
        setByteField(term350, term350.getClass(), "minute", (byte) 46);
        setByteField(term350, term350.getClass(), "second", (byte) 13);
        setIntField(term350, term350.getClass(), "nano", 45893173);
        setField(term345, term345.getClass(), "time", term350);
        term355 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Extras"));
        setIntField(term355, term355.getClass(), "premiumFee", 972867650);
        setBooleanField(term355, term355.getClass(), "dinner", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Client");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show");
        argTypes[1] = Class.forName("java.time.LocalDateTime");
        argTypes[2] = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Extras");
        Object[] args = new Object[3];
        args[0] = term342;
        args[1] = term345;
        args[2] = term355;
        callMethod(klass, "createPremiumBooking", argTypes, term341, args);
    }

};


