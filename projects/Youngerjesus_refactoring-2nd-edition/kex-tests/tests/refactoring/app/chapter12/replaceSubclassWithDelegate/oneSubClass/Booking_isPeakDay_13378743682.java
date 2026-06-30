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

public class Booking_isPeakDay_13378743682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51;

    public Booking_isPeakDay_13378743682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking"));
        Object term52 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show"));
        Object term55 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term56 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60 = newInstance(Class.forName("java.time.LocalTime"));
        Object term65 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.PremiumBookingDelegate"));
        Object term66 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Extras"));
        Object term69 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking"));
        Object term70 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show"));
        Object term73 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term74 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78 = newInstance(Class.forName("java.time.LocalTime"));
        Object term83 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.PremiumBookingDelegate"));
        Object term84 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Extras"));
        Object term87 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking"));
        setBooleanField(term52, term52.getClass(), "talkback", false);
        setIntField(term52, term52.getClass(), "price", 1725571209);
        setField(term51, term51.getClass(), "show", term52);
        setIntField(term56, term56.getClass(), "year", 2025);
        setShortField(term56, term56.getClass(), "month", (short) 4);
        setShortField(term56, term56.getClass(), "day", (short) 24);
        setField(term55, term55.getClass(), "date", term56);
        setByteField(term60, term60.getClass(), "hour", (byte) 18);
        setByteField(term60, term60.getClass(), "minute", (byte) 11);
        setByteField(term60, term60.getClass(), "second", (byte) 40);
        setIntField(term60, term60.getClass(), "nano", 137454929);
        setField(term55, term55.getClass(), "time", term60);
        setField(term51, term51.getClass(), "date", term55);
        setIntField(term66, term66.getClass(), "premiumFee", -522618178);
        setBooleanField(term66, term66.getClass(), "dinner", true);
        setField(term65, term65.getClass(), "extras", term66);
        setBooleanField(term70, term70.getClass(), "talkback", false);
        setIntField(term70, term70.getClass(), "price", 1134449235);
        setField(term69, term69.getClass(), "show", term70);
        setIntField(term74, term74.getClass(), "year", 2024);
        setShortField(term74, term74.getClass(), "month", (short) 1);
        setShortField(term74, term74.getClass(), "day", (short) 24);
        setField(term73, term73.getClass(), "date", term74);
        setByteField(term78, term78.getClass(), "hour", (byte) 20);
        setByteField(term78, term78.getClass(), "minute", (byte) 28);
        setByteField(term78, term78.getClass(), "second", (byte) 39);
        setIntField(term78, term78.getClass(), "nano", 952728177);
        setField(term73, term73.getClass(), "time", term78);
        setField(term69, term69.getClass(), "date", term73);
        setIntField(term84, term84.getClass(), "premiumFee", -883034806);
        setBooleanField(term84, term84.getClass(), "dinner", true);
        setField(term83, term83.getClass(), "extras", term84);
        setField(term87, term87.getClass(), "show", null);
        setField(term87, term87.getClass(), "date", null);
        setField(term87, term87.getClass(), "premiumDelegate", null);
        setField(term83, term83.getClass(), "booking", term87);
        setField(term69, term69.getClass(), "premiumDelegate", term83);
        setField(term65, term65.getClass(), "booking", term69);
        setField(term51, term51.getClass(), "premiumDelegate", term65);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPeakDay", argTypes, term51, args);
    }

};


