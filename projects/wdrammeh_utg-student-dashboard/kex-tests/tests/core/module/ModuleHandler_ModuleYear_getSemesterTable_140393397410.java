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

public class ModuleHandler_ModuleYear_getSemesterTable_140393397410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117454;

    public ModuleHandler_ModuleYear_getSemesterTable_140393397410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117454 = newInstance(Class.forName("core.module.ModuleHandler$ModuleYear"));
        setField(term117454, term117454.getClass(), "yearName", null);
        setField(term117454, term117454.getClass(), "table1", null);
        setField(term117454, term117454.getClass(), "table2", null);
        setField(term117454, term117454.getClass(), "focusTable", null);
        setField(term117454, term117454.getClass(), "model1", null);
        setField(term117454, term117454.getClass(), "model2", null);
        setField(term117454, term117454.getClass(), "focusModel", null);
        setField(term117454, term117454.getClass(), "detailsItem", null);
        setField(term117454, term117454.getClass(), "editItem", null);
        setField(term117454, term117454.getClass(), "removeItem", null);
        setField(term117454, term117454.getClass(), "confirmItem", null);
        setField(term117454, term117454.getClass(), "newItem", null);
        setField(term117454, term117454.getClass(), "popupMenu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleHandler$ModuleYear");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("proto.KTableModel");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getSemesterTable", argTypes, term117454, args);
    }

};


