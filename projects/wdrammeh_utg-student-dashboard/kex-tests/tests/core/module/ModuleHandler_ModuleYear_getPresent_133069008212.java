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

public class ModuleHandler_ModuleYear_getPresent_133069008212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47203;

    public ModuleHandler_ModuleYear_getPresent_133069008212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47203 = newInstance(Class.forName("core.module.ModuleHandler$ModuleYear"));
        setField(term47203, term47203.getClass(), "yearName", null);
        setField(term47203, term47203.getClass(), "table1", null);
        setField(term47203, term47203.getClass(), "table2", null);
        setField(term47203, term47203.getClass(), "focusTable", null);
        setField(term47203, term47203.getClass(), "model1", null);
        setField(term47203, term47203.getClass(), "model2", null);
        setField(term47203, term47203.getClass(), "focusModel", null);
        setField(term47203, term47203.getClass(), "detailsItem", null);
        setField(term47203, term47203.getClass(), "editItem", null);
        setField(term47203, term47203.getClass(), "removeItem", null);
        setField(term47203, term47203.getClass(), "confirmItem", null);
        setField(term47203, term47203.getClass(), "newItem", null);
        setField(term47203, term47203.getClass(), "popupMenu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleHandler$ModuleYear");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPresent", argTypes, term47203, args);
    }

};


