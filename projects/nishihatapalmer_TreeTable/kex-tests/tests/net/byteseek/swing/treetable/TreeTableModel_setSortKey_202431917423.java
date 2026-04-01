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

public class TreeTableModel_setSortKey_202431917423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98985;
     Object term98987;

    public TreeTableModel_setSortKey_202431917423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98985 = new Integer(178847646);
        term98987 = newInstance(Class.forName("javax.swing.SortOrder"));
        setField(term98987, term98987.getClass(), "name", "DESCENDING");
        setIntField(term98987, term98987.getClass(), "ordinal", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TreeTableModel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("javax.swing.SortOrder");
        Object[] args = new Object[2];
        args[0] = term98985;
        args[1] = term98987;
        callMethod(klass, "setSortKey", argTypes, null, args);
    }

};


