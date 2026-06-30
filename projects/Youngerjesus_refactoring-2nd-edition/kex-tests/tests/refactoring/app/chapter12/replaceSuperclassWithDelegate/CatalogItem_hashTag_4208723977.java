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

public class CatalogItem_hashTag_4208723977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term487;

    public CatalogItem_hashTag_4208723977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term487 = newInstance(Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.CatalogItem"));
        setField(term487, term487.getClass(), "id", null);
        setField(term487, term487.getClass(), "title", null);
        setField(term487, term487.getClass(), "tags", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("refactoring.app.chapter12.replaceSuperclassWithDelegate.CatalogItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "hashTag", argTypes, term487, args);
    }

};


