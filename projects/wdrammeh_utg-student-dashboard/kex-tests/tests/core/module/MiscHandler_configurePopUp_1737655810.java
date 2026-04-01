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

public class MiscHandler_configurePopUp_1737655810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123482;

    public MiscHandler_configurePopUp_1737655810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123482 = newInstance(Class.forName("core.module.MiscHandler"));
        setField(term123482, term123482.getClass(), "detailsItem", null);
        setField(term123482, term123482.getClass(), "editItem", null);
        setField(term123482, term123482.getClass(), "removeItem", null);
        setField(term123482, term123482.getClass(), "confirmItem", null);
        setField(term123482, term123482.getClass(), "newItem", null);
        setField(term123482, term123482.getClass(), "popupMenu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.MiscHandler");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "configurePopUp", argTypes, term123482, args);
    }

};


