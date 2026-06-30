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

public class PremiumBookingDelegate_extendPrice_2896648322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term237;

    public PremiumBookingDelegate_extendPrice_2896648322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term237 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.PremiumBookingDelegate"));
        Object term238 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Extras"));
        Object term241 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking"));
        Object term242 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show"));
        Object term245 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term246 = newInstance(Class.forName("java.time.LocalDate"));
        Object term250 = newInstance(Class.forName("java.time.LocalTime"));
        Object term255 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.PremiumBookingDelegate"));
        Object term256 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Extras"));
        Object term259 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking"));
        Object term260 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show"));
        Object term263 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term264 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.PremiumBookingDelegate"));
        setIntField(term238, term238.getClass(), "premiumFee", -184153539);
        setBooleanField(term238, term238.getClass(), "dinner", true);
        setField(term237, term237.getClass(), "extras", term238);
        setBooleanField(term242, term242.getClass(), "talkback", false);
        setIntField(term242, term242.getClass(), "price", 493620644);
        setField(term241, term241.getClass(), "show", term242);
        setIntField(term246, term246.getClass(), "year", 2012);
        setShortField(term246, term246.getClass(), "month", (short) 8);
        setShortField(term246, term246.getClass(), "day", (short) 25);
        setField(term245, term245.getClass(), "date", term246);
        setByteField(term250, term250.getClass(), "hour", (byte) 19);
        setByteField(term250, term250.getClass(), "minute", (byte) 49);
        setByteField(term250, term250.getClass(), "second", (byte) 8);
        setIntField(term250, term250.getClass(), "nano", 912685024);
        setField(term245, term245.getClass(), "time", term250);
        setField(term241, term241.getClass(), "date", term245);
        setIntField(term256, term256.getClass(), "premiumFee", 1328271830);
        setBooleanField(term256, term256.getClass(), "dinner", false);
        setField(term255, term255.getClass(), "extras", term256);
        setBooleanField(term260, term260.getClass(), "talkback", false);
        setIntField(term260, term260.getClass(), "price", 1596070772);
        setField(term259, term259.getClass(), "show", term260);
        setField(term263, term263.getClass(), "date", null);
        setField(term263, term263.getClass(), "time", null);
        setField(term259, term259.getClass(), "date", term263);
        setField(term264, term264.getClass(), "extras", null);
        setField(term264, term264.getClass(), "booking", null);
        setField(term259, term259.getClass(), "premiumDelegate", term264);
        setField(term255, term255.getClass(), "booking", term259);
        setField(term241, term241.getClass(), "premiumDelegate", term255);
        setField(term237, term237.getClass(), "booking", term241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.PremiumBookingDelegate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "extendPrice", argTypes, term237, args);
    }

};


