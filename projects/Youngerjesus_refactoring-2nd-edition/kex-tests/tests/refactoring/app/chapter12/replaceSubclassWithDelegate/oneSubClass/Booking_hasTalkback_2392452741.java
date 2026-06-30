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

public class Booking_hasTalkback_2392452741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14;

    public Booking_hasTalkback_2392452741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking"));
        Object term15 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show"));
        Object term18 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term19 = newInstance(Class.forName("java.time.LocalDate"));
        Object term23 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.PremiumBookingDelegate"));
        Object term29 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Extras"));
        Object term32 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking"));
        Object term33 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show"));
        Object term36 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41 = newInstance(Class.forName("java.time.LocalTime"));
        Object term46 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.PremiumBookingDelegate"));
        Object term47 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Extras"));
        Object term50 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking"));
        setBooleanField(term15, term15.getClass(), "talkback", false);
        setIntField(term15, term15.getClass(), "price", 1162663216);
        setField(term14, term14.getClass(), "show", term15);
        setIntField(term19, term19.getClass(), "year", 2021);
        setShortField(term19, term19.getClass(), "month", (short) 1);
        setShortField(term19, term19.getClass(), "day", (short) 18);
        setField(term18, term18.getClass(), "date", term19);
        setByteField(term23, term23.getClass(), "hour", (byte) 13);
        setByteField(term23, term23.getClass(), "minute", (byte) 38);
        setByteField(term23, term23.getClass(), "second", (byte) 26);
        setIntField(term23, term23.getClass(), "nano", 544608644);
        setField(term18, term18.getClass(), "time", term23);
        setField(term14, term14.getClass(), "date", term18);
        setIntField(term29, term29.getClass(), "premiumFee", 1484323161);
        setBooleanField(term29, term29.getClass(), "dinner", false);
        setField(term28, term28.getClass(), "extras", term29);
        setBooleanField(term33, term33.getClass(), "talkback", false);
        setIntField(term33, term33.getClass(), "price", 391863371);
        setField(term32, term32.getClass(), "show", term33);
        setIntField(term37, term37.getClass(), "year", 2015);
        setShortField(term37, term37.getClass(), "month", (short) 9);
        setShortField(term37, term37.getClass(), "day", (short) 19);
        setField(term36, term36.getClass(), "date", term37);
        setByteField(term41, term41.getClass(), "hour", (byte) 9);
        setByteField(term41, term41.getClass(), "minute", (byte) 4);
        setByteField(term41, term41.getClass(), "second", (byte) 10);
        setIntField(term41, term41.getClass(), "nano", 401765865);
        setField(term36, term36.getClass(), "time", term41);
        setField(term32, term32.getClass(), "date", term36);
        setIntField(term47, term47.getClass(), "premiumFee", -1922583790);
        setBooleanField(term47, term47.getClass(), "dinner", true);
        setField(term46, term46.getClass(), "extras", term47);
        setField(term50, term50.getClass(), "show", null);
        setField(term50, term50.getClass(), "date", null);
        setField(term50, term50.getClass(), "premiumDelegate", null);
        setField(term46, term46.getClass(), "booking", term50);
        setField(term32, term32.getClass(), "premiumDelegate", term46);
        setField(term28, term28.getClass(), "booking", term32);
        setField(term14, term14.getClass(), "premiumDelegate", term28);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasTalkback", argTypes, term14, args);
    }

};


