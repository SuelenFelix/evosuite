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

public class TableColumn_isPrimarykey_65748454410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9240;

    public TableColumn_isPrimarykey_65748454410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9240 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableColumn"));
        setIntField(term9240, term9240.getClass(), "index", 0);
        setField(term9240, term9240.getClass(), "name", null);
        setField(term9240, term9240.getClass(), "type", null);
        setField(term9240, term9240.getClass(), "dataType", null);
        setField(term9240, term9240.getClass(), "max", null);
        setBooleanField(term9240, term9240.getClass(), "notNull", false);
        setField(term9240, term9240.getClass(), "defaultValueString", null);
        setField(term9240, term9240.getClass(), "defaultValue", null);
        setBooleanField(term9240, term9240.getClass(), "primarykey", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.TableColumn");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrimarykey", argTypes, term9240, args);
    }

};


