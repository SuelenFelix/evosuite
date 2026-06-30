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

public class ModuleHandler_ModuleYear_setupTable2_19248759544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41091;

    public ModuleHandler_ModuleYear_setupTable2_19248759544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41091 = newInstance(Class.forName("core.module.ModuleHandler$ModuleYear"));
        setField(term41091, term41091.getClass(), "yearName", null);
        setField(term41091, term41091.getClass(), "table1", null);
        setField(term41091, term41091.getClass(), "table2", null);
        setField(term41091, term41091.getClass(), "focusTable", null);
        setField(term41091, term41091.getClass(), "model1", null);
        setField(term41091, term41091.getClass(), "model2", null);
        setField(term41091, term41091.getClass(), "focusModel", null);
        setField(term41091, term41091.getClass(), "detailsItem", null);
        setField(term41091, term41091.getClass(), "editItem", null);
        setField(term41091, term41091.getClass(), "removeItem", null);
        setField(term41091, term41091.getClass(), "confirmItem", null);
        setField(term41091, term41091.getClass(), "newItem", null);
        setField(term41091, term41091.getClass(), "popupMenu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleHandler$ModuleYear");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setupTable2", argTypes, term41091, args);
    }

};


