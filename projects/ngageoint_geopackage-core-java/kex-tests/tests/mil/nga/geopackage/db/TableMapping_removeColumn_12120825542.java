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

public class TableMapping_removeColumn_12120825542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10572;

    public TableMapping_removeColumn_12120825542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10572 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term10572, term10572.getClass(), "fromTable", null);
        setField(term10572, term10572.getClass(), "toTable", null);
        setBooleanField(term10572, term10572.getClass(), "transferContent", false);
        setField(term10572, term10572.getClass(), "columns", null);
        setField(term10572, term10572.getClass(), "droppedColumns", null);
        setField(term10572, term10572.getClass(), "where", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.TableMapping");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeColumn", argTypes, term10572, args);
    }

};


