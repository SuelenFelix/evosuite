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

public class TableMapping_isNewTable_101254403838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10562;

    public TableMapping_isNewTable_101254403838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10562 = newInstance(Class.forName("mil.nga.geopackage.db.TableMapping"));
        setField(term10562, term10562.getClass(), "fromTable", null);
        setField(term10562, term10562.getClass(), "toTable", null);
        setBooleanField(term10562, term10562.getClass(), "transferContent", false);
        setField(term10562, term10562.getClass(), "columns", null);
        setField(term10562, term10562.getClass(), "droppedColumns", null);
        setField(term10562, term10562.getClass(), "where", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.TableMapping");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNewTable", argTypes, term10562, args);
    }

};


