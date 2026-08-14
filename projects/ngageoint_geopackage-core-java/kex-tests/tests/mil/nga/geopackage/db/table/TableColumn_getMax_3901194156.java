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

public class TableColumn_getMax_3901194156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9044;

    public TableColumn_getMax_3901194156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9044 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableColumn"));
        setIntField(term9044, term9044.getClass(), "index", 0);
        setField(term9044, term9044.getClass(), "name", null);
        setField(term9044, term9044.getClass(), "type", null);
        setField(term9044, term9044.getClass(), "dataType", null);
        setField(term9044, term9044.getClass(), "max", null);
        setBooleanField(term9044, term9044.getClass(), "notNull", false);
        setField(term9044, term9044.getClass(), "defaultValueString", null);
        setField(term9044, term9044.getClass(), "defaultValue", null);
        setBooleanField(term9044, term9044.getClass(), "primarykey", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.TableColumn");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMax", argTypes, term9044, args);
    }

};


