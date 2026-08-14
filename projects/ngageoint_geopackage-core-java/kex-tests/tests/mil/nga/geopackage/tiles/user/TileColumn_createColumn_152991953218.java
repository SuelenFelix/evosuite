package mil.nga.geopackage.tiles.user;

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
import static mil.nga.geopackage.tiles.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TileColumn_createColumn_152991953218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6979;

    public TileColumn_createColumn_152991953218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6979 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumn"));
        setIntField(term6979, term6979.getClass(), "index", 0);
        setField(term6979, term6979.getClass(), "name", null);
        setField(term6979, term6979.getClass(), "max", null);
        setBooleanField(term6979, term6979.getClass(), "notNull", false);
        setField(term6979, term6979.getClass(), "defaultValue", null);
        setBooleanField(term6979, term6979.getClass(), "primaryKey", false);
        setBooleanField(term6979, term6979.getClass(), "autoincrement", false);
        setBooleanField(term6979, term6979.getClass(), "unique", false);
        setField(term6979, term6979.getClass(), "type", null);
        setField(term6979, term6979.getClass(), "dataType", null);
        setField(term6979, term6979.getClass(), "constraints", null);
        setField(term6979, term6979.getClass(), "schema", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumn");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.db.GeoPackageDataType");
        argTypes[2] = Class.forName("java.lang.Long");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "createColumn", argTypes, term6979, args);
    }

};


