package mil.nga.geopackage.db;

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
import static mil.nga.geopackage.db.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TableMapping_setFromTable_198389021935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10556;

    public TableMapping_setFromTable_198389021935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10556 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term10556, term10556.getClass(), "fromTable", null);
        setField(term10556, term10556.getClass(), "toTable", null);
        setBooleanField(term10556, term10556.getClass(), "transferContent", false);
        setField(term10556, term10556.getClass(), "columns", null);
        setField(term10556, term10556.getClass(), "droppedColumns", null);
        setField(term10556, term10556.getClass(), "where", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.TableMapping");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFromTable", argTypes, term10556, args);
    }

};


