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

public class TileColumn_createIdColumn_7630519828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7431;
     Object term7437;

    public TileColumn_createIdColumn_7630519828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7431 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumn"));
        setIntField(term7431, term7431.getClass(), "index", 0);
        setField(term7431, term7431.getClass(), "name", null);
        setField(term7431, term7431.getClass(), "max", null);
        setBooleanField(term7431, term7431.getClass(), "notNull", false);
        setField(term7431, term7431.getClass(), "defaultValue", null);
        setBooleanField(term7431, term7431.getClass(), "primaryKey", false);
        setBooleanField(term7431, term7431.getClass(), "autoincrement", false);
        setBooleanField(term7431, term7431.getClass(), "unique", false);
        setField(term7431, term7431.getClass(), "type", null);
        setField(term7431, term7431.getClass(), "dataType", null);
        setField(term7431, term7431.getClass(), "constraints", null);
        setField(term7431, term7431.getClass(), "schema", null);
        term7437 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumn");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term7437;
        callMethod(klass, "createIdColumn", argTypes, term7431, args);
    }

};


