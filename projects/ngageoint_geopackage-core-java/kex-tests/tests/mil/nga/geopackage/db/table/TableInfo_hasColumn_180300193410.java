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

public class TableInfo_hasColumn_180300193410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7376;

    public TableInfo_hasColumn_180300193410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7376 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableInfo"));
        setField(term7376, term7376.getClass(), "tableName", null);
        setField(term7376, term7376.getClass(), "columns", null);
        setField(term7376, term7376.getClass(), "namesToColumns", null);
        setField(term7376, term7376.getClass(), "primaryKeys", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.TableInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "hasColumn", argTypes, term7376, args);
    }

};


