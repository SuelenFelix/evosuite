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

public class Booking_basePrice_5305349393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88;

    public Booking_basePrice_5305349393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking"));
        Object term89 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show"));
        Object term92 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term93 = newInstance(Class.forName("java.time.LocalDate"));
        Object term97 = newInstance(Class.forName("java.time.LocalTime"));
        Object term102 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.PremiumBookingDelegate"));
        Object term103 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Extras"));
        Object term106 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking"));
        Object term107 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show"));
        Object term110 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111 = newInstance(Class.forName("java.time.LocalDate"));
        Object term115 = newInstance(Class.forName("java.time.LocalTime"));
        Object term120 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.PremiumBookingDelegate"));
        Object term121 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Extras"));
        Object term124 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking"));
        setBooleanField(term89, term89.getClass(), "talkback", false);
        setIntField(term89, term89.getClass(), "price", 1048535127);
        setField(term88, term88.getClass(), "show", term89);
        setIntField(term93, term93.getClass(), "year", 2018);
        setShortField(term93, term93.getClass(), "month", (short) 9);
        setShortField(term93, term93.getClass(), "day", (short) 28);
        setField(term92, term92.getClass(), "date", term93);
        setByteField(term97, term97.getClass(), "hour", (byte) 3);
        setByteField(term97, term97.getClass(), "minute", (byte) 37);
        setByteField(term97, term97.getClass(), "second", (byte) 46);
        setIntField(term97, term97.getClass(), "nano", 763326845);
        setField(term92, term92.getClass(), "time", term97);
        setField(term88, term88.getClass(), "date", term92);
        setIntField(term103, term103.getClass(), "premiumFee", -655067527);
        setBooleanField(term103, term103.getClass(), "dinner", true);
        setField(term102, term102.getClass(), "extras", term103);
        setBooleanField(term107, term107.getClass(), "talkback", true);
        setIntField(term107, term107.getClass(), "price", -6029667);
        setField(term106, term106.getClass(), "show", term107);
        setIntField(term111, term111.getClass(), "year", 2012);
        setShortField(term111, term111.getClass(), "month", (short) 9);
        setShortField(term111, term111.getClass(), "day", (short) 11);
        setField(term110, term110.getClass(), "date", term111);
        setByteField(term115, term115.getClass(), "hour", (byte) 22);
        setByteField(term115, term115.getClass(), "minute", (byte) 10);
        setByteField(term115, term115.getClass(), "second", (byte) 8);
        setIntField(term115, term115.getClass(), "nano", 380008862);
        setField(term110, term110.getClass(), "time", term115);
        setField(term106, term106.getClass(), "date", term110);
        setIntField(term121, term121.getClass(), "premiumFee", -2068769794);
        setBooleanField(term121, term121.getClass(), "dinner", true);
        setField(term120, term120.getClass(), "extras", term121);
        setField(term124, term124.getClass(), "show", null);
        setField(term124, term124.getClass(), "date", null);
        setField(term124, term124.getClass(), "premiumDelegate", null);
        setField(term120, term120.getClass(), "booking", term124);
        setField(term106, term106.getClass(), "premiumDelegate", term120);
        setField(term102, term102.getClass(), "booking", term106);
        setField(term88, term88.getClass(), "premiumDelegate", term102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "basePrice", argTypes, term88, args);
    }

};


