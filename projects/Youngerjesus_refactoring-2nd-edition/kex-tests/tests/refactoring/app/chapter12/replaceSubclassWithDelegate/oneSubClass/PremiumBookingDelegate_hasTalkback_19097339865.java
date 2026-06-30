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

public class PremiumBookingDelegate_hasTalkback_19097339865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293;

    public PremiumBookingDelegate_hasTalkback_19097339865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.PremiumBookingDelegate"));
        setField(term293, term293.getClass(), "extras", null);
        setField(term293, term293.getClass(), "booking", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.PremiumBookingDelegate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasTalkback", argTypes, term293, args);
    }

};


