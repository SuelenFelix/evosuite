package core.module;

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
import static core.module.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SummerHandler_getPresent_52996803611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39723;

    public SummerHandler_getPresent_52996803611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39723 = newInstance(Class.forName("core.module.SummerHandler"));
        setField(term39723, term39723.getClass(), "detailsItem", null);
        setField(term39723, term39723.getClass(), "editItem", null);
        setField(term39723, term39723.getClass(), "removeItem", null);
        setField(term39723, term39723.getClass(), "confirmItem", null);
        setField(term39723, term39723.getClass(), "newItem", null);
        setField(term39723, term39723.getClass(), "popupMenu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SummerHandler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPresent", argTypes, term39723, args);
    }

};


