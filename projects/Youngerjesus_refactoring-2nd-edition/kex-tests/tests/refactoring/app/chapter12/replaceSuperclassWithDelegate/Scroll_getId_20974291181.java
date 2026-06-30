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

public class Scroll_getId_20974291181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term517;

    public Scroll_getId_20974291181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term518 = new Long(6811161968424632369L);
        Long term521 = new Long(-7237588299778557629L);
        ArrayList term535 = new ArrayList();
        ((ArrayList) term535).add("");
        ((ArrayList) term535).add("");
        ((ArrayList) term535).add("");
        ((ArrayList) term535).add("");
        ((ArrayList) term535).add("");
        term517 = newInstance(Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.Scroll"));
        Object term520 = newInstance(Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.CatalogItem"));
        Object term544 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term545 = newInstance(Class.forName("java.time.LocalDate"));
        Object term549 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term517, term517.getClass(), "id", term518);
        setField(term520, term520.getClass(), "id", term521);
        setField(term520, term520.getClass(), "title", "eZFUvlxvGV");
        setField(term520, term520.getClass(), "tags", term535);
        setField(term517, term517.getClass(), "catalogItem", term520);
        setIntField(term545, term545.getClass(), "year", 2021);
        setShortField(term545, term545.getClass(), "month", (short) 1);
        setShortField(term545, term545.getClass(), "day", (short) 18);
        setField(term544, term544.getClass(), "date", term545);
        setByteField(term549, term549.getClass(), "hour", (byte) 13);
        setByteField(term549, term549.getClass(), "minute", (byte) 38);
        setByteField(term549, term549.getClass(), "second", (byte) 26);
        setIntField(term549, term549.getClass(), "nano", 544608644);
        setField(term544, term544.getClass(), "time", term549);
        setField(term517, term517.getClass(), "lastCleaned", term544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.Scroll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term517, args);
    }

};


