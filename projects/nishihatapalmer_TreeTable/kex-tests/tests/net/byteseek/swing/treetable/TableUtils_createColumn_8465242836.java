package net.byteseek.swing.treetable;

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
import static net.byteseek.swing.treetable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class TableUtils_createColumn_8465242836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369872;
     Object term369874;
     Object term369875;

    public TableUtils_createColumn_8465242836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term369872 = new Integer(505327656);
        term369874 = newInstance(Class.forName("java.lang.Object"));
        term369875 = new Integer(1779734830);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TableUtils");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("javax.swing.table.TableCellRenderer");
        argTypes[4] = Class.forName("javax.swing.table.TableCellEditor");
        Object[] args = new Object[5];
        args[0] = term369872;
        args[1] = term369874;
        args[2] = term369875;
        args[3] = null;
        args[4] = null;
        callMethod(klass, "createColumn", argTypes, null, args);
    }

};


