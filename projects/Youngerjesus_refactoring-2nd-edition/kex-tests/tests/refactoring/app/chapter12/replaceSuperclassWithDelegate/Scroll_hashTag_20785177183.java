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

public class Scroll_hashTag_20785177183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term606;

    public Scroll_hashTag_20785177183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term607 = new Long(-8885298608300233488L);
        Long term610 = new Long(-4325723315152823407L);
        ArrayList term624 = new ArrayList();
        ((ArrayList) term624).add("");
        ((ArrayList) term624).add("");
        ((ArrayList) term624).add("");
        ((ArrayList) term624).add("");
        ((ArrayList) term624).add("");
        ((ArrayList) term624).add("");
        ((ArrayList) term624).add("");
        ((ArrayList) term624).add("");
        ((ArrayList) term624).add("");
        term606 = newInstance(Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.Scroll"));
        Object term609 = newInstance(Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.CatalogItem"));
        Object term637 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term638 = newInstance(Class.forName("java.time.LocalDate"));
        Object term642 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term606, term606.getClass(), "id", term607);
        setField(term609, term609.getClass(), "id", term610);
        setField(term609, term609.getClass(), "title", "OWDIEULEFu");
        setField(term609, term609.getClass(), "tags", term624);
        setField(term606, term606.getClass(), "catalogItem", term609);
        setIntField(term638, term638.getClass(), "year", 2015);
        setShortField(term638, term638.getClass(), "month", (short) 4);
        setShortField(term638, term638.getClass(), "day", (short) 14);
        setField(term637, term637.getClass(), "date", term638);
        setByteField(term642, term642.getClass(), "hour", (byte) 18);
        setByteField(term642, term642.getClass(), "minute", (byte) 24);
        setByteField(term642, term642.getClass(), "second", (byte) 32);
        setIntField(term642, term642.getClass(), "nano", 369233818);
        setField(term637, term637.getClass(), "time", term642);
        setField(term606, term606.getClass(), "lastCleaned", term637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.Scroll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wSQxaModmm";
        callMethod(klass, "hashTag", argTypes, term606, args);
    }

};


