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

public class Scroll_needsCleaning_9018546964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term679;
     Object term711;

    public Scroll_needsCleaning_9018546964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term680 = new Long(2535595959091595249L);
        Long term683 = new Long(-5476826692763582090L);
        ArrayList term697 = new ArrayList();
        term679 = newInstance(Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.Scroll"));
        Object term682 = newInstance(Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.CatalogItem"));
        Object term701 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term702 = newInstance(Class.forName("java.time.LocalDate"));
        Object term706 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term679, term679.getClass(), "id", term680);
        setField(term682, term682.getClass(), "id", term683);
        setField(term682, term682.getClass(), "title", "UlajhuVLaP");
        setField(term682, term682.getClass(), "tags", term697);
        setField(term679, term679.getClass(), "catalogItem", term682);
        setIntField(term702, term702.getClass(), "year", 2022);
        setShortField(term702, term702.getClass(), "month", (short) 2);
        setShortField(term702, term702.getClass(), "day", (short) 26);
        setField(term701, term701.getClass(), "date", term702);
        setByteField(term706, term706.getClass(), "hour", (byte) 11);
        setByteField(term706, term706.getClass(), "minute", (byte) 42);
        setByteField(term706, term706.getClass(), "second", (byte) 15);
        setIntField(term706, term706.getClass(), "nano", 377731937);
        setField(term701, term701.getClass(), "time", term706);
        setField(term679, term679.getClass(), "lastCleaned", term701);
        term711 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term712 = newInstance(Class.forName("java.time.LocalDate"));
        Object term716 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term712, term712.getClass(), "year", 2026);
        setShortField(term712, term712.getClass(), "month", (short) 12);
        setShortField(term712, term712.getClass(), "day", (short) 14);
        setField(term711, term711.getClass(), "date", term712);
        setByteField(term716, term716.getClass(), "hour", (byte) 16);
        setByteField(term716, term716.getClass(), "minute", (byte) 34);
        setByteField(term716, term716.getClass(), "second", (byte) 9);
        setIntField(term716, term716.getClass(), "nano", 518326996);
        setField(term711, term711.getClass(), "time", term716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.Scroll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term711;
        callMethod(klass, "needsCleaning", argTypes, term679, args);
    }

};


