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
import java.util.ArrayList;

public class Scroll_getTitle_2837218802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term564;

    public Scroll_getTitle_2837218802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term565 = new Long(6967924379644551255L);
        Long term568 = new Long(-2813493605142626659L);
        ArrayList term582 = new ArrayList();
        term564 = newInstance(Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.Scroll"));
        Object term567 = newInstance(Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.CatalogItem"));
        Object term586 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term587 = newInstance(Class.forName("java.time.LocalDate"));
        Object term591 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term564, term564.getClass(), "id", term565);
        setField(term567, term567.getClass(), "id", term568);
        setField(term567, term567.getClass(), "title", "TEParAifyi");
        setField(term567, term567.getClass(), "tags", term582);
        setField(term564, term564.getClass(), "catalogItem", term567);
        setIntField(term587, term587.getClass(), "year", 2015);
        setShortField(term587, term587.getClass(), "month", (short) 9);
        setShortField(term587, term587.getClass(), "day", (short) 19);
        setField(term586, term586.getClass(), "date", term587);
        setByteField(term591, term591.getClass(), "hour", (byte) 9);
        setByteField(term591, term591.getClass(), "minute", (byte) 4);
        setByteField(term591, term591.getClass(), "second", (byte) 10);
        setIntField(term591, term591.getClass(), "nano", 401765865);
        setField(term586, term586.getClass(), "time", term591);
        setField(term564, term564.getClass(), "lastCleaned", term586);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.Scroll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitle", argTypes, term564, args);
    }

};


