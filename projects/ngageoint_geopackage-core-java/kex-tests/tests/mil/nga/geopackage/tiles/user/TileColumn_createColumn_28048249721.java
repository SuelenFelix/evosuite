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
import java.lang.Integer;
import java.lang.Boolean;

public class TileColumn_createColumn_28048249721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7140;
     Object term7146;
     Object term7148;

    public TileColumn_createColumn_28048249721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7140 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumn"));
        setIntField(term7140, term7140.getClass(), "index", 0);
        setField(term7140, term7140.getClass(), "name", null);
        setField(term7140, term7140.getClass(), "max", null);
        setBooleanField(term7140, term7140.getClass(), "notNull", false);
        setField(term7140, term7140.getClass(), "defaultValue", null);
        setBooleanField(term7140, term7140.getClass(), "primaryKey", false);
        setBooleanField(term7140, term7140.getClass(), "autoincrement", false);
        setBooleanField(term7140, term7140.getClass(), "unique", false);
        setField(term7140, term7140.getClass(), "type", null);
        setField(term7140, term7140.getClass(), "dataType", null);
        setField(term7140, term7140.getClass(), "constraints", null);
        setField(term7140, term7140.getClass(), "schema", null);
        term7146 = new Integer(0);
        term7148 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumn");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("mil.nga.geopackage.db.GeoPackageDataType");
        argTypes[3] = Class.forName("java.lang.Long");
        argTypes[4] = boolean.class;
        argTypes[5] = Class.forName("java.lang.Object");
        Object[] args = new Object[6];
        args[0] = term7146;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term7148;
        args[5] = null;
        callMethod(klass, "createColumn", argTypes, term7140, args);
    }

};


