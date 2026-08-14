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
import java.lang.Object;
import java.lang.String;

public class SQLiteMaster_columns_183286297614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3038;

    public SQLiteMaster_columns_183286297614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3055 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term3054 = ((Class) term3055).getDeclaredField((String) "SQL");
        ((Field) term3054).setAccessible(true);
        Object enum10 = ((Field) term3054).get((Object) null);
        Class<? extends Object> term3306 = Class.forName((String) "mil.nga.geopackage.db.master.SQLiteMasterColumn");
        Field term3305 = ((Class) term3306).getDeclaredField((String) "NAME");
        ((Field) term3305).setAccessible(true);
        Object enum11 = ((Field) term3305).get((Object) null);
        term3038 = (Object[]) newArray("mil.nga.geopackage.db.master.SQLiteMasterColumn", 5);
        setElement(term3038, 0, enum10);
        setElement(term3038, 1, enum10);
        setElement(term3038, 2, enum11);
        setElement(term3038, 3, enum11);
        setElement(term3038, 4, enum11);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.master.SQLiteMaster");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("mil.nga.geopackage.db.master.SQLiteMasterColumn"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3038;
        callMethod(klass, "columns", argTypes, null, args);
    }

};


