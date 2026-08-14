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
import java.lang.Integer;

public class TableInfo_getColumn_4087831898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7199;
     Object term7200;

    public TableInfo_getColumn_4087831898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7199 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableInfo"));
        setField(term7199, term7199.getClass(), "tableName", null);
        setField(term7199, term7199.getClass(), "columns", null);
        setField(term7199, term7199.getClass(), "namesToColumns", null);
        setField(term7199, term7199.getClass(), "primaryKeys", null);
        term7200 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.TableInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7200;
        callMethod(klass, "getColumn", argTypes, term7199, args);
    }

};


