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

public class TileColumn_createTileDataColumn_37897832737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7499;

    public TileColumn_createTileDataColumn_37897832737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7499 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumn"));
        setIntField(term7499, term7499.getClass(), "index", 0);
        setField(term7499, term7499.getClass(), "name", null);
        setField(term7499, term7499.getClass(), "max", null);
        setBooleanField(term7499, term7499.getClass(), "notNull", false);
        setField(term7499, term7499.getClass(), "defaultValue", null);
        setBooleanField(term7499, term7499.getClass(), "primaryKey", false);
        setBooleanField(term7499, term7499.getClass(), "autoincrement", false);
        setBooleanField(term7499, term7499.getClass(), "unique", false);
        setField(term7499, term7499.getClass(), "type", null);
        setField(term7499, term7499.getClass(), "dataType", null);
        setField(term7499, term7499.getClass(), "constraints", null);
        setField(term7499, term7499.getClass(), "schema", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumn");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createTileDataColumn", argTypes, term7499, args);
    }

};


