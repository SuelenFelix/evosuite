package mil.nga.geopackage.db.table;

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
import static mil.nga.geopackage.db.table.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class ColumnConstraints_addConstraints_20265651469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12783;
     Object term12806;

    public ColumnConstraints_addConstraints_20265651469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12797 = new ArrayList();
        HashMap term12801 = new HashMap();
        term12783 = newInstance(Class.forName("mil.nga.geopackage.db.table.ColumnConstraints"));
        Object term12796 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term12783, term12783.getClass(), "name", "xClUIcPECX");
        setField(term12796, term12796.getClass(), "constraints", term12797);
        setField(term12796, term12796.getClass(), "typedContraints", term12801);
        setField(term12783, term12783.getClass(), "constraints", term12796);
        ArrayList term12820 = new ArrayList();
        HashMap term12824 = new HashMap();
        term12806 = newInstance(Class.forName("mil.nga.geopackage.db.table.ColumnConstraints"));
        Object term12819 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term12806, term12806.getClass(), "name", "avhRaGZaBF");
        setField(term12819, term12819.getClass(), "constraints", term12820);
        setField(term12819, term12819.getClass(), "typedContraints", term12824);
        setField(term12806, term12806.getClass(), "constraints", term12819);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.ColumnConstraints");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.table.ColumnConstraints");
        Object[] args = new Object[1];
        args[0] = term12806;
        callMethod(klass, "addConstraints", argTypes, term12783, args);
    }

};


