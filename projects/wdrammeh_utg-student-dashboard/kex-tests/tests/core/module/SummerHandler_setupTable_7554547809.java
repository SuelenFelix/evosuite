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

public class SummerHandler_setupTable_7554547809 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33395;

    public SummerHandler_setupTable_7554547809() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33395 = newInstance(Class.forName("core.module.SummerHandler"));
        setField(term33395, term33395.getClass(), "detailsItem", null);
        setField(term33395, term33395.getClass(), "editItem", null);
        setField(term33395, term33395.getClass(), "removeItem", null);
        setField(term33395, term33395.getClass(), "confirmItem", null);
        setField(term33395, term33395.getClass(), "newItem", null);
        setField(term33395, term33395.getClass(), "popupMenu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SummerHandler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setupTable", argTypes, term33395, args);
    }

};


