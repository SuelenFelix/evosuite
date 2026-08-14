package mil.nga.geopackage.db.master;

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
import static mil.nga.geopackage.db.master.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;

public class SQLiteMaster_getColumnIndex_104475605312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2746;
     Object enum9;

    public SQLiteMaster_getColumnIndex_104475605312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2747 = new ArrayList();
        HashMap term2751 = new HashMap();
        term2746 = newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMaster"));
        setField(term2746, term2746.getClass(), "results", term2747);
        setField(term2746, term2746.getClass(), "columns", term2751);
        setIntField(term2746, term2746.getClass(), "count", 1048535127);
        Class<? extends Object> term2765 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term2764 = ((Class) term2765).getDeclaredField((String) "TYPE");
        ((Field) term2764).setAccessible(true);
        enum9 = ((Field) term2764).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMaster");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Object[] args = new Object[1];
        args[0] = enum9;
        callMethod(klass, "getColumnIndex", argTypes, term2746, args);
    }

};


