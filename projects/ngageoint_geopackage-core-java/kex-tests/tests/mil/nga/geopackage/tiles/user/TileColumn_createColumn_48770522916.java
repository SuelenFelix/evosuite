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
import java.lang.Boolean;

public class TileColumn_createColumn_48770522916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6873;
     Object term6879;

    public TileColumn_createColumn_48770522916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6873 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumn"));
        setIntField(term6873, term6873.getClass(), "index", 0);
        setField(term6873, term6873.getClass(), "name", null);
        setField(term6873, term6873.getClass(), "max", null);
        setBooleanField(term6873, term6873.getClass(), "notNull", false);
        setField(term6873, term6873.getClass(), "defaultValue", null);
        setBooleanField(term6873, term6873.getClass(), "primaryKey", false);
        setBooleanField(term6873, term6873.getClass(), "autoincrement", false);
        setBooleanField(term6873, term6873.getClass(), "unique", false);
        setField(term6873, term6873.getClass(), "type", null);
        setField(term6873, term6873.getClass(), "dataType", null);
        setField(term6873, term6873.getClass(), "constraints", null);
        setField(term6873, term6873.getClass(), "schema", null);
        term6879 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumn");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.db.GeoPackageDataType");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("java.lang.Object");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term6879;
        args[3] = null;
        callMethod(klass, "createColumn", argTypes, term6873, args);
    }

};


