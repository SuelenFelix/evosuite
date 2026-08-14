package mil.nga.geopackage.extension.im.portrayal;

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
import static mil.nga.geopackage.extension.im.portrayal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Symbols_resetId_14777844762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1943;

    public Symbols_resetId_14777844762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1943 = newInstance(Class.forName("mil.nga.geopackage.extension.im.portrayal.Symbols"));
        setLongField(term1943, term1943.getClass(), "id", -7310273014364148916L);
        setField(term1943, term1943.getClass(), "symbol", "ffYhPOzlUs");
        setField(term1943, term1943.getClass(), "description", "MLqYREekMl");
        setField(term1943, term1943.getClass(), "uri", "ytSBIKXogI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.portrayal.Symbols");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "resetId", argTypes, term1943, args);
    }

};


