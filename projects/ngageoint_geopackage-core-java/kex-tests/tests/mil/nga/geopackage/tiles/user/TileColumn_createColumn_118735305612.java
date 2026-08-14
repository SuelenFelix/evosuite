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

public class TileColumn_createColumn_118735305612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6661;

    public TileColumn_createColumn_118735305612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6661 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumn"));
        setIntField(term6661, term6661.getClass(), "index", 0);
        setField(term6661, term6661.getClass(), "name", null);
        setField(term6661, term6661.getClass(), "max", null);
        setBooleanField(term6661, term6661.getClass(), "notNull", false);
        setField(term6661, term6661.getClass(), "defaultValue", null);
        setBooleanField(term6661, term6661.getClass(), "primaryKey", false);
        setBooleanField(term6661, term6661.getClass(), "autoincrement", false);
        setBooleanField(term6661, term6661.getClass(), "unique", false);
        setField(term6661, term6661.getClass(), "type", null);
        setField(term6661, term6661.getClass(), "dataType", null);
        setField(term6661, term6661.getClass(), "constraints", null);
        setField(term6661, term6661.getClass(), "schema", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumn");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.db.GeoPackageDataType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "createColumn", argTypes, term6661, args);
    }

};


