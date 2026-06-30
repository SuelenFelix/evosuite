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

public class Client_example2_15036204302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310;
     Object term311;
     Object term314;
     Object term324;

    public Client_example2_15036204302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term310 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Client"));
        term311 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show"));
        setBooleanField(term311, term311.getClass(), "talkback", true);
        setIntField(term311, term311.getClass(), "price", -2027534003);
        term314 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term315 = newInstance(Class.forName("java.time.LocalDate"));
        Object term319 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term315, term315.getClass(), "year", 2020);
        setShortField(term315, term315.getClass(), "month", (short) 8);
        setShortField(term315, term315.getClass(), "day", (short) 15);
        setField(term314, term314.getClass(), "date", term315);
        setByteField(term319, term319.getClass(), "hour", (byte) 2);
        setByteField(term319, term319.getClass(), "minute", (byte) 0);
        setByteField(term319, term319.getClass(), "second", (byte) 38);
        setIntField(term319, term319.getClass(), "nano", 146431486);
        setField(term314, term314.getClass(), "time", term319);
        term324 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Extras"));
        setIntField(term324, term324.getClass(), "premiumFee", 1063420942);
        setBooleanField(term324, term324.getClass(), "dinner", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Client");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show");
        argTypes[1] = Class.forName("java.time.LocalDateTime");
        argTypes[2] = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Extras");
        Object[] args = new Object[3];
        args[0] = term311;
        args[1] = term314;
        args[2] = term324;
        callMethod(klass, "example2", argTypes, term310, args);
    }

};


