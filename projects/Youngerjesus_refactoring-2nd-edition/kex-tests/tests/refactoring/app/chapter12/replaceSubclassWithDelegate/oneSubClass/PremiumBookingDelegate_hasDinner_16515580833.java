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

public class PremiumBookingDelegate_hasDinner_16515580833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265;

    public PremiumBookingDelegate_hasDinner_16515580833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.PremiumBookingDelegate"));
        Object term266 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Extras"));
        Object term269 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking"));
        Object term270 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show"));
        Object term273 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term274 = newInstance(Class.forName("java.time.LocalDate"));
        Object term278 = newInstance(Class.forName("java.time.LocalTime"));
        Object term283 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.PremiumBookingDelegate"));
        Object term284 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Extras"));
        Object term287 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking"));
        Object term288 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show"));
        Object term291 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term292 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.PremiumBookingDelegate"));
        setIntField(term266, term266.getClass(), "premiumFee", -1588772968);
        setBooleanField(term266, term266.getClass(), "dinner", true);
        setField(term265, term265.getClass(), "extras", term266);
        setBooleanField(term270, term270.getClass(), "talkback", true);
        setIntField(term270, term270.getClass(), "price", -93135961);
        setField(term269, term269.getClass(), "show", term270);
        setIntField(term274, term274.getClass(), "year", 2010);
        setShortField(term274, term274.getClass(), "month", (short) 1);
        setShortField(term274, term274.getClass(), "day", (short) 17);
        setField(term273, term273.getClass(), "date", term274);
        setByteField(term278, term278.getClass(), "hour", (byte) 13);
        setByteField(term278, term278.getClass(), "minute", (byte) 5);
        setByteField(term278, term278.getClass(), "second", (byte) 51);
        setIntField(term278, term278.getClass(), "nano", 362260580);
        setField(term273, term273.getClass(), "time", term278);
        setField(term269, term269.getClass(), "date", term273);
        setIntField(term284, term284.getClass(), "premiumFee", -112921587);
        setBooleanField(term284, term284.getClass(), "dinner", true);
        setField(term283, term283.getClass(), "extras", term284);
        setBooleanField(term288, term288.getClass(), "talkback", false);
        setIntField(term288, term288.getClass(), "price", 933028652);
        setField(term287, term287.getClass(), "show", term288);
        setField(term291, term291.getClass(), "date", null);
        setField(term291, term291.getClass(), "time", null);
        setField(term287, term287.getClass(), "date", term291);
        setField(term292, term292.getClass(), "extras", null);
        setField(term292, term292.getClass(), "booking", null);
        setField(term287, term287.getClass(), "premiumDelegate", term292);
        setField(term283, term283.getClass(), "booking", term287);
        setField(term269, term269.getClass(), "premiumDelegate", term283);
        setField(term265, term265.getClass(), "booking", term269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.PremiumBookingDelegate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasDinner", argTypes, term265, args);
    }

};


