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

public class ModuleHandler_ModuleYear_add_18938442506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114220;

    public ModuleHandler_ModuleYear_add_18938442506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114220 = newInstance(Class.forName("core.module.ModuleHandler$ModuleYear"));
        setField(term114220, term114220.getClass(), "yearName", null);
        setField(term114220, term114220.getClass(), "table1", null);
        setField(term114220, term114220.getClass(), "table2", null);
        setField(term114220, term114220.getClass(), "focusTable", null);
        setField(term114220, term114220.getClass(), "model1", null);
        setField(term114220, term114220.getClass(), "model2", null);
        setField(term114220, term114220.getClass(), "focusModel", null);
        setField(term114220, term114220.getClass(), "detailsItem", null);
        setField(term114220, term114220.getClass(), "editItem", null);
        setField(term114220, term114220.getClass(), "removeItem", null);
        setField(term114220, term114220.getClass(), "confirmItem", null);
        setField(term114220, term114220.getClass(), "newItem", null);
        setField(term114220, term114220.getClass(), "popupMenu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleHandler$ModuleYear");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("core.module.Course");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term114220, args);
    }

};


