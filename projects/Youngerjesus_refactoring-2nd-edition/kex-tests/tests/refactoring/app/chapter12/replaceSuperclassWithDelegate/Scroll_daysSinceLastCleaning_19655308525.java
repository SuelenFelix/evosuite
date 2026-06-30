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

public class Scroll_daysSinceLastCleaning_19655308525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term731;
     Object term772;

    public Scroll_daysSinceLastCleaning_19655308525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term732 = new Long(-872011222785455006L);
        Long term735 = new Long(-316468845751588286L);
        ArrayList term749 = new ArrayList();
        ((ArrayList) term749).add("");
        ((ArrayList) term749).add("");
        ((ArrayList) term749).add("");
        ((ArrayList) term749).add("");
        ((ArrayList) term749).add("");
        ((ArrayList) term749).add("");
        ((ArrayList) term749).add("");
        ((ArrayList) term749).add("");
        ((ArrayList) term749).add("");
        term731 = newInstance(Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.Scroll"));
        Object term734 = newInstance(Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.CatalogItem"));
        Object term762 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term763 = newInstance(Class.forName("java.time.LocalDate"));
        Object term767 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term731, term731.getClass(), "id", term732);
        setField(term734, term734.getClass(), "id", term735);
        setField(term734, term734.getClass(), "title", "gGSMzuGICf");
        setField(term734, term734.getClass(), "tags", term749);
        setField(term731, term731.getClass(), "catalogItem", term734);
        setIntField(term763, term763.getClass(), "year", 2025);
        setShortField(term763, term763.getClass(), "month", (short) 4);
        setShortField(term763, term763.getClass(), "day", (short) 24);
        setField(term762, term762.getClass(), "date", term763);
        setByteField(term767, term767.getClass(), "hour", (byte) 18);
        setByteField(term767, term767.getClass(), "minute", (byte) 11);
        setByteField(term767, term767.getClass(), "second", (byte) 40);
        setIntField(term767, term767.getClass(), "nano", 137454929);
        setField(term762, term762.getClass(), "time", term767);
        setField(term731, term731.getClass(), "lastCleaned", term762);
        term772 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term773 = newInstance(Class.forName("java.time.LocalDate"));
        Object term777 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term773, term773.getClass(), "year", 2024);
        setShortField(term773, term773.getClass(), "month", (short) 1);
        setShortField(term773, term773.getClass(), "day", (short) 24);
        setField(term772, term772.getClass(), "date", term773);
        setByteField(term777, term777.getClass(), "hour", (byte) 20);
        setByteField(term777, term777.getClass(), "minute", (byte) 28);
        setByteField(term777, term777.getClass(), "second", (byte) 39);
        setIntField(term777, term777.getClass(), "nano", 952728177);
        setField(term772, term772.getClass(), "time", term777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.Scroll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term772;
        callMethod(klass, "daysSinceLastCleaning", argTypes, term731, args);
    }

};


