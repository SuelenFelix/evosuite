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

public class TileColumn_createColumn_203225470517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6926;
     Object term6932;
     Object term6934;

    public TileColumn_createColumn_203225470517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6926 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumn"));
        setIntField(term6926, term6926.getClass(), "index", 0);
        setField(term6926, term6926.getClass(), "name", null);
        setField(term6926, term6926.getClass(), "max", null);
        setBooleanField(term6926, term6926.getClass(), "notNull", false);
        setField(term6926, term6926.getClass(), "defaultValue", null);
        setBooleanField(term6926, term6926.getClass(), "primaryKey", false);
        setBooleanField(term6926, term6926.getClass(), "autoincrement", false);
        setBooleanField(term6926, term6926.getClass(), "unique", false);
        setField(term6926, term6926.getClass(), "type", null);
        setField(term6926, term6926.getClass(), "dataType", null);
        setField(term6926, term6926.getClass(), "constraints", null);
        setField(term6926, term6926.getClass(), "schema", null);
        term6932 = new Integer(0);
        term6934 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumn");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("mil.nga.geopackage.db.GeoPackageDataType");
        argTypes[3] = boolean.class;
        argTypes[4] = Class.forName("java.lang.Object");
        Object[] args = new Object[5];
        args[0] = term6932;
        args[1] = null;
        args[2] = null;
        args[3] = term6934;
        args[4] = null;
        callMethod(klass, "createColumn", argTypes, term6926, args);
    }

};


