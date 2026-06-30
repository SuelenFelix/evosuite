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

public class Scroll_hashTag_20785177189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term794;

    public Scroll_hashTag_20785177189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term794 = newInstance(Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.Scroll"));
        setField(term794, term794.getClass(), "id", null);
        setField(term794, term794.getClass(), "catalogItem", null);
        setField(term794, term794.getClass(), "lastCleaned", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.Scroll");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "hashTag", argTypes, term794, args);
    }

};


