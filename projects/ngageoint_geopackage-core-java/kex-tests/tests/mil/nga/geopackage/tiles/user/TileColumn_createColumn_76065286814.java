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

public class TileColumn_createColumn_76065286814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6766;
     Object term6772;

    public TileColumn_createColumn_76065286814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6766 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumn"));
        setIntField(term6766, term6766.getClass(), "index", 0);
        setField(term6766, term6766.getClass(), "name", null);
        setField(term6766, term6766.getClass(), "max", null);
        setBooleanField(term6766, term6766.getClass(), "notNull", false);
        setField(term6766, term6766.getClass(), "defaultValue", null);
        setBooleanField(term6766, term6766.getClass(), "primaryKey", false);
        setBooleanField(term6766, term6766.getClass(), "autoincrement", false);
        setBooleanField(term6766, term6766.getClass(), "unique", false);
        setField(term6766, term6766.getClass(), "type", null);
        setField(term6766, term6766.getClass(), "dataType", null);
        setField(term6766, term6766.getClass(), "constraints", null);
        setField(term6766, term6766.getClass(), "schema", null);
        term6772 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumn");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.db.GeoPackageDataType");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term6772;
        callMethod(klass, "createColumn", argTypes, term6766, args);
    }

};


