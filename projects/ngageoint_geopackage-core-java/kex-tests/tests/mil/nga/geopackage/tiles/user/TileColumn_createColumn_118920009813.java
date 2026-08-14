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

public class TileColumn_createColumn_118920009813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6715;
     Object term6721;

    public TileColumn_createColumn_118920009813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6715 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumn"));
        setIntField(term6715, term6715.getClass(), "index", 0);
        setField(term6715, term6715.getClass(), "name", null);
        setField(term6715, term6715.getClass(), "max", null);
        setBooleanField(term6715, term6715.getClass(), "notNull", false);
        setField(term6715, term6715.getClass(), "defaultValue", null);
        setBooleanField(term6715, term6715.getClass(), "primaryKey", false);
        setBooleanField(term6715, term6715.getClass(), "autoincrement", false);
        setBooleanField(term6715, term6715.getClass(), "unique", false);
        setField(term6715, term6715.getClass(), "type", null);
        setField(term6715, term6715.getClass(), "dataType", null);
        setField(term6715, term6715.getClass(), "constraints", null);
        setField(term6715, term6715.getClass(), "schema", null);
        term6721 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumn");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("mil.nga.geopackage.db.GeoPackageDataType");
        Object[] args = new Object[3];
        args[0] = term6721;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "createColumn", argTypes, term6715, args);
    }

};


