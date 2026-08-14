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

public class TileColumn_createZoomLevelColumn_110436650832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7463;
     Object term7469;

    public TileColumn_createZoomLevelColumn_110436650832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7463 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumn"));
        setIntField(term7463, term7463.getClass(), "index", 0);
        setField(term7463, term7463.getClass(), "name", null);
        setField(term7463, term7463.getClass(), "max", null);
        setBooleanField(term7463, term7463.getClass(), "notNull", false);
        setField(term7463, term7463.getClass(), "defaultValue", null);
        setBooleanField(term7463, term7463.getClass(), "primaryKey", false);
        setBooleanField(term7463, term7463.getClass(), "autoincrement", false);
        setBooleanField(term7463, term7463.getClass(), "unique", false);
        setField(term7463, term7463.getClass(), "type", null);
        setField(term7463, term7463.getClass(), "dataType", null);
        setField(term7463, term7463.getClass(), "constraints", null);
        setField(term7463, term7463.getClass(), "schema", null);
        term7469 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumn");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7469;
        callMethod(klass, "createZoomLevelColumn", argTypes, term7463, args);
    }

};


