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

public class TableColumn_getName_10824459832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8835;

    public TableColumn_getName_10824459832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8835 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableColumn"));
        setIntField(term8835, term8835.getClass(), "index", 0);
        setField(term8835, term8835.getClass(), "name", null);
        setField(term8835, term8835.getClass(), "type", null);
        setField(term8835, term8835.getClass(), "dataType", null);
        setField(term8835, term8835.getClass(), "max", null);
        setBooleanField(term8835, term8835.getClass(), "notNull", false);
        setField(term8835, term8835.getClass(), "defaultValueString", null);
        setField(term8835, term8835.getClass(), "defaultValue", null);
        setBooleanField(term8835, term8835.getClass(), "primarykey", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.TableColumn");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term8835, args);
    }

};


