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

public class Booking_bePremium_20327548934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125;
     Object term162;

    public Booking_bePremium_20327548934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking"));
        Object term126 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show"));
        Object term129 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term130 = newInstance(Class.forName("java.time.LocalDate"));
        Object term134 = newInstance(Class.forName("java.time.LocalTime"));
        Object term139 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.PremiumBookingDelegate"));
        Object term140 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Extras"));
        Object term143 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking"));
        Object term144 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Show"));
        Object term147 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term148 = newInstance(Class.forName("java.time.LocalDate"));
        Object term152 = newInstance(Class.forName("java.time.LocalTime"));
        Object term157 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.PremiumBookingDelegate"));
        Object term158 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Extras"));
        Object term161 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking"));
        setBooleanField(term126, term126.getClass(), "talkback", true);
        setIntField(term126, term126.getClass(), "price", -1275173084);
        setField(term125, term125.getClass(), "show", term126);
        setIntField(term130, term130.getClass(), "year", 2015);
        setShortField(term130, term130.getClass(), "month", (short) 9);
        setShortField(term130, term130.getClass(), "day", (short) 16);
        setField(term129, term129.getClass(), "date", term130);
        setByteField(term134, term134.getClass(), "hour", (byte) 6);
        setByteField(term134, term134.getClass(), "minute", (byte) 19);
        setByteField(term134, term134.getClass(), "second", (byte) 42);
        setIntField(term134, term134.getClass(), "nano", 630084975);
        setField(term129, term129.getClass(), "time", term134);
        setField(term125, term125.getClass(), "date", term129);
        setIntField(term140, term140.getClass(), "premiumFee", -244121226);
        setBooleanField(term140, term140.getClass(), "dinner", true);
        setField(term139, term139.getClass(), "extras", term140);
        setBooleanField(term144, term144.getClass(), "talkback", true);
        setIntField(term144, term144.getClass(), "price", -203030934);
        setField(term143, term143.getClass(), "show", term144);
        setIntField(term148, term148.getClass(), "year", 2029);
        setShortField(term148, term148.getClass(), "month", (short) 6);
        setShortField(term148, term148.getClass(), "day", (short) 23);
        setField(term147, term147.getClass(), "date", term148);
        setByteField(term152, term152.getClass(), "hour", (byte) 21);
        setByteField(term152, term152.getClass(), "minute", (byte) 55);
        setByteField(term152, term152.getClass(), "second", (byte) 27);
        setIntField(term152, term152.getClass(), "nano", 66889274);
        setField(term147, term147.getClass(), "time", term152);
        setField(term143, term143.getClass(), "date", term147);
        setIntField(term158, term158.getClass(), "premiumFee", -1179120542);
        setBooleanField(term158, term158.getClass(), "dinner", true);
        setField(term157, term157.getClass(), "extras", term158);
        setField(term161, term161.getClass(), "show", null);
        setField(term161, term161.getClass(), "date", null);
        setField(term161, term161.getClass(), "premiumDelegate", null);
        setField(term157, term157.getClass(), "booking", term161);
        setField(term143, term143.getClass(), "premiumDelegate", term157);
        setField(term139, term139.getClass(), "booking", term143);
        setField(term125, term125.getClass(), "premiumDelegate", term139);
        term162 = newInstance(Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Extras"));
        setIntField(term162, term162.getClass(), "premiumFee", -469968304);
        setBooleanField(term162, term162.getClass(), "dinner", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Booking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("refactoring.app.chapter12.replaceSubclassWithDelegate.oneSubClass.Extras");
        Object[] args = new Object[1];
        args[0] = term162;
        callMethod(klass, "bePremium", argTypes, term125, args);
    }

};


