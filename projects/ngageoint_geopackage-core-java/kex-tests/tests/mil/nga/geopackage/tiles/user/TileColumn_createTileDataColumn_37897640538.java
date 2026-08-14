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

public class TileColumn_createTileDataColumn_37897640538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7505;
     Object term7511;

    public TileColumn_createTileDataColumn_37897640538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7505 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileColumn"));
        setIntField(term7505, term7505.getClass(), "index", 0);
        setField(term7505, term7505.getClass(), "name", null);
        setField(term7505, term7505.getClass(), "max", null);
        setBooleanField(term7505, term7505.getClass(), "notNull", false);
        setField(term7505, term7505.getClass(), "defaultValue", null);
        setBooleanField(term7505, term7505.getClass(), "primaryKey", false);
        setBooleanField(term7505, term7505.getClass(), "autoincrement", false);
        setBooleanField(term7505, term7505.getClass(), "unique", false);
        setField(term7505, term7505.getClass(), "type", null);
        setField(term7505, term7505.getClass(), "dataType", null);
        setField(term7505, term7505.getClass(), "constraints", null);
        setField(term7505, term7505.getClass(), "schema", null);
        term7511 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileColumn");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7511;
        callMethod(klass, "createTileDataColumn", argTypes, term7505, args);
    }

};


