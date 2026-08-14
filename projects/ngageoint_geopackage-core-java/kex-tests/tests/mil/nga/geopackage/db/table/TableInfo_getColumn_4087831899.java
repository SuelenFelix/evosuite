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

public class TableInfo_getColumn_4087831899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141132;
     Object term141133;

    public TableInfo_getColumn_4087831899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141132 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableInfo"));
        setField(term141132, term141132.getClass(), "tableName", null);
        setField(term141132, term141132.getClass(), "columns", null);
        setField(term141132, term141132.getClass(), "namesToColumns", null);
        setField(term141132, term141132.getClass(), "primaryKeys", null);
        term141133 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.TableInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term141133;
        callMethod(klass, "getColumn", argTypes, term141132, args);
    }

};


