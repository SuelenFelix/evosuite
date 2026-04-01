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

public class TableUtils_createColumn_79488512123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term381788;
     Object term381789;
     Object term381791;

    public TableUtils_createColumn_79488512123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term381788 = newInstance(Class.forName("net.byteseek.swing.treetable.TableUtils"));
        term381789 = new Integer(0);
        term381791 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TableUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("javax.swing.table.TableCellRenderer");
        Object[] args = new Object[4];
        args[0] = term381789;
        args[1] = null;
        args[2] = term381791;
        args[3] = null;
        callMethod(klass, "createColumn", argTypes, term381788, args);
    }

};


