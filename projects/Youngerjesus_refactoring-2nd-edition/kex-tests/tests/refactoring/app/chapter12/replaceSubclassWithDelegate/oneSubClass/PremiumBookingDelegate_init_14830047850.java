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

public class PremiumBookingDelegate_init_14830047850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term169;
     Object term172;

    public PremiumBookingDelegate_init_14830047850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term169 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Extras"));
        setIntField(term169, term169.getClass(), "premiumFee", -1145578966);
        setBooleanField(term169, term169.getClass(), "dinner", true);
        term172 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking"));
        Object term173 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show"));
        Object term176 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term177 = newInstance(Class.forName("java.time.LocalDate"));
        Object term181 = newInstance(Class.forName("java.time.LocalTime"));
        Object term186 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.PremiumBookingDelegate"));
        Object term187 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Extras"));
        Object term190 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking"));
        Object term191 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show"));
        Object term194 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term195 = newInstance(Class.forName("java.time.LocalDate"));
        Object term199 = newInstance(Class.forName("java.time.LocalTime"));
        Object term204 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.PremiumBookingDelegate"));
        Object term205 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Extras"));
        Object term208 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking"));
        setBooleanField(term173, term173.getClass(), "talkback", false);
        setIntField(term173, term173.getClass(), "price", 679763016);
        setField(term172, term172.getClass(), "show", term173);
        setIntField(term177, term177.getClass(), "year", 2023);
        setShortField(term177, term177.getClass(), "month", (short) 3);
        setShortField(term177, term177.getClass(), "day", (short) 7);
        setField(term176, term176.getClass(), "date", term177);
        setByteField(term181, term181.getClass(), "hour", (byte) 21);
        setByteField(term181, term181.getClass(), "minute", (byte) 15);
        setByteField(term181, term181.getClass(), "second", (byte) 43);
        setIntField(term181, term181.getClass(), "nano", 639721472);
        setField(term176, term176.getClass(), "time", term181);
        setField(term172, term172.getClass(), "date", term176);
        setIntField(term187, term187.getClass(), "premiumFee", 1962444399);
        setBooleanField(term187, term187.getClass(), "dinner", false);
        setField(term186, term186.getClass(), "extras", term187);
        setBooleanField(term191, term191.getClass(), "talkback", false);
        setIntField(term191, term191.getClass(), "price", 767834723);
        setField(term190, term190.getClass(), "show", term191);
        setIntField(term195, term195.getClass(), "year", 2015);
        setShortField(term195, term195.getClass(), "month", (short) 3);
        setShortField(term195, term195.getClass(), "day", (short) 10);
        setField(term194, term194.getClass(), "date", term195);
        setByteField(term199, term199.getClass(), "hour", (byte) 23);
        setByteField(term199, term199.getClass(), "minute", (byte) 34);
        setByteField(term199, term199.getClass(), "second", (byte) 44);
        setIntField(term199, term199.getClass(), "nano", 587322824);
        setField(term194, term194.getClass(), "time", term199);
        setField(term190, term190.getClass(), "date", term194);
        setIntField(term205, term205.getClass(), "premiumFee", -602026508);
        setBooleanField(term205, term205.getClass(), "dinner", true);
        setField(term204, term204.getClass(), "extras", term205);
        setField(term208, term208.getClass(), "show", null);
        setField(term208, term208.getClass(), "date", null);
        setField(term208, term208.getClass(), "premiumDelegate", null);
        setField(term204, term204.getClass(), "booking", term208);
        setField(term190, term190.getClass(), "premiumDelegate", term204);
        setField(term186, term186.getClass(), "booking", term190);
        setField(term172, term172.getClass(), "premiumDelegate", term186);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.PremiumBookingDelegate");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Extras");
        argTypes[1] = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking");
        Object[] args = new Object[2];
        args[0] = term169;
        args[1] = term172;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


