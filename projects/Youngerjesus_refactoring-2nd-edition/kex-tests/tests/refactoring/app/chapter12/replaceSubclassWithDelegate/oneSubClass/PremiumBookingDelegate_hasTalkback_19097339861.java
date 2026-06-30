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

public class PremiumBookingDelegate_hasTalkback_19097339861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209;

    public PremiumBookingDelegate_hasTalkback_19097339861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.PremiumBookingDelegate"));
        Object term210 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Extras"));
        Object term213 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking"));
        Object term214 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show"));
        Object term217 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term218 = newInstance(Class.forName("java.time.LocalDate"));
        Object term222 = newInstance(Class.forName("java.time.LocalTime"));
        Object term227 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.PremiumBookingDelegate"));
        Object term228 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Extras"));
        Object term231 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking"));
        Object term232 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show"));
        Object term235 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term236 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.PremiumBookingDelegate"));
        setIntField(term210, term210.getClass(), "premiumFee", 579005622);
        setBooleanField(term210, term210.getClass(), "dinner", false);
        setField(term209, term209.getClass(), "extras", term210);
        setBooleanField(term214, term214.getClass(), "talkback", true);
        setIntField(term214, term214.getClass(), "price", -14890619);
        setField(term213, term213.getClass(), "show", term214);
        setIntField(term218, term218.getClass(), "year", 2028);
        setShortField(term218, term218.getClass(), "month", (short) 10);
        setShortField(term218, term218.getClass(), "day", (short) 1);
        setField(term217, term217.getClass(), "date", term218);
        setByteField(term222, term222.getClass(), "hour", (byte) 17);
        setByteField(term222, term222.getClass(), "minute", (byte) 29);
        setByteField(term222, term222.getClass(), "second", (byte) 30);
        setIntField(term222, term222.getClass(), "nano", 845472306);
        setField(term217, term217.getClass(), "time", term222);
        setField(term213, term213.getClass(), "date", term217);
        setIntField(term228, term228.getClass(), "premiumFee", 1632125673);
        setBooleanField(term228, term228.getClass(), "dinner", false);
        setField(term227, term227.getClass(), "extras", term228);
        setBooleanField(term232, term232.getClass(), "talkback", false);
        setIntField(term232, term232.getClass(), "price", 454281060);
        setField(term231, term231.getClass(), "show", term232);
        setField(term235, term235.getClass(), "date", null);
        setField(term235, term235.getClass(), "time", null);
        setField(term231, term231.getClass(), "date", term235);
        setField(term236, term236.getClass(), "extras", null);
        setField(term236, term236.getClass(), "booking", null);
        setField(term231, term231.getClass(), "premiumDelegate", term236);
        setField(term227, term227.getClass(), "booking", term231);
        setField(term213, term213.getClass(), "premiumDelegate", term227);
        setField(term209, term209.getClass(), "booking", term213);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.PremiumBookingDelegate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasTalkback", argTypes, term209, args);
    }

};


