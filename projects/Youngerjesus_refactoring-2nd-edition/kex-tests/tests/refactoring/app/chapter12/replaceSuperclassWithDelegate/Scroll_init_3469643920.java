package refactoring.app.chapter12.replaceSuperclassWithDelegate;

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
import static refactoring.app.chapter12.replaceSuperclassWithDelegate.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.HashMap;

public class Scroll_init_3469643920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term497;
     Object term499;
     Object term509;
     Object term515;

    public Scroll_init_3469643920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term497 = new Long(7411271909051562686L);
        term499 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term500 = newInstance(Class.forName("java.time.LocalDate"));
        Object term504 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term500, term500.getClass(), "year", 2012);
        setShortField(term500, term500.getClass(), "month", (short) 8);
        setShortField(term500, term500.getClass(), "day", (short) 25);
        setField(term499, term499.getClass(), "date", term500);
        setByteField(term504, term504.getClass(), "hour", (byte) 5);
        setByteField(term504, term504.getClass(), "minute", (byte) 20);
        setByteField(term504, term504.getClass(), "second", (byte) 50);
        setIntField(term504, term504.getClass(), "nano", 345595912);
        setField(term499, term499.getClass(), "time", term504);
        HashMap term510 = new HashMap();
        term509 = newInstance(Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.CatalogRepository"));
        setField(term509, term509.getClass(), "map", term510);
        term515 = new Long(4872422362414183754L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.Scroll");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.Long");
        argTypes[1] = Class.forName("java.time.LocalDateTime");
        argTypes[2] = Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.CatalogRepository");
        argTypes[3] = Class.forName("java.lang.Long");
        Object[] args = new Object[4];
        args[0] = term497;
        args[1] = term499;
        args[2] = term509;
        args[3] = term515;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


