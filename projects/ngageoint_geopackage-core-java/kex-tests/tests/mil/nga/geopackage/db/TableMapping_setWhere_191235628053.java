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

public class TableMapping_setWhere_191235628053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10594;

    public TableMapping_setWhere_191235628053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10594 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term10594, term10594.getClass(), "fromTable", null);
        setField(term10594, term10594.getClass(), "toTable", null);
        setBooleanField(term10594, term10594.getClass(), "transferContent", false);
        setField(term10594, term10594.getClass(), "columns", null);
        setField(term10594, term10594.getClass(), "droppedColumns", null);
        setField(term10594, term10594.getClass(), "where", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.TableMapping");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setWhere", argTypes, term10594, args);
    }

};


