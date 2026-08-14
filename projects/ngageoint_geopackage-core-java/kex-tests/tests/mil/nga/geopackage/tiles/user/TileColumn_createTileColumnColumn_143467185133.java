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

public class TileColumn_createTileColumnColumn_143467185133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7471;

    public TileColumn_createTileColumnColumn_143467185133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7471 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumn"));
        setIntField(term7471, term7471.getClass(), "index", 0);
        setField(term7471, term7471.getClass(), "name", null);
        setField(term7471, term7471.getClass(), "max", null);
        setBooleanField(term7471, term7471.getClass(), "notNull", false);
        setField(term7471, term7471.getClass(), "defaultValue", null);
        setBooleanField(term7471, term7471.getClass(), "primaryKey", false);
        setBooleanField(term7471, term7471.getClass(), "autoincrement", false);
        setBooleanField(term7471, term7471.getClass(), "unique", false);
        setField(term7471, term7471.getClass(), "type", null);
        setField(term7471, term7471.getClass(), "dataType", null);
        setField(term7471, term7471.getClass(), "constraints", null);
        setField(term7471, term7471.getClass(), "schema", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumn");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createTileColumnColumn", argTypes, term7471, args);
    }

};


