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

public class ModuleHandler_ModuleYear_semesterHead_16274950614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120155;

    public ModuleHandler_ModuleYear_semesterHead_16274950614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120155 = newInstance(Class.forName("core.module.ModuleHandler$ModuleYear"));
        setField(term120155, term120155.getClass(), "yearName", null);
        setField(term120155, term120155.getClass(), "table1", null);
        setField(term120155, term120155.getClass(), "table2", null);
        setField(term120155, term120155.getClass(), "focusTable", null);
        setField(term120155, term120155.getClass(), "model1", null);
        setField(term120155, term120155.getClass(), "model2", null);
        setField(term120155, term120155.getClass(), "focusModel", null);
        setField(term120155, term120155.getClass(), "detailsItem", null);
        setField(term120155, term120155.getClass(), "editItem", null);
        setField(term120155, term120155.getClass(), "removeItem", null);
        setField(term120155, term120155.getClass(), "confirmItem", null);
        setField(term120155, term120155.getClass(), "newItem", null);
        setField(term120155, term120155.getClass(), "popupMenu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleHandler$ModuleYear");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "semesterHead", argTypes, term120155, args);
    }

};


