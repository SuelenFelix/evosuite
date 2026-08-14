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

public class TileColumn_createColumn_52886412920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7085;
     Object term7091;

    public TileColumn_createColumn_52886412920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7085 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumn"));
        setIntField(term7085, term7085.getClass(), "index", 0);
        setField(term7085, term7085.getClass(), "name", null);
        setField(term7085, term7085.getClass(), "max", null);
        setBooleanField(term7085, term7085.getClass(), "notNull", false);
        setField(term7085, term7085.getClass(), "defaultValue", null);
        setBooleanField(term7085, term7085.getClass(), "primaryKey", false);
        setBooleanField(term7085, term7085.getClass(), "autoincrement", false);
        setBooleanField(term7085, term7085.getClass(), "unique", false);
        setField(term7085, term7085.getClass(), "type", null);
        setField(term7085, term7085.getClass(), "dataType", null);
        setField(term7085, term7085.getClass(), "constraints", null);
        setField(term7085, term7085.getClass(), "schema", null);
        term7091 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumn");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.db.GeoPackageDataType");
        argTypes[2] = Class.forName("java.lang.Long");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("java.lang.Object");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term7091;
        args[4] = null;
        callMethod(klass, "createColumn", argTypes, term7085, args);
    }

};


