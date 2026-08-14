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
import java.lang.Long;

public class TileTableMetadata_create_28017929633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6488;
     Object term6491;

    public TileTableMetadata_create_28017929633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6488 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata"));
        setField(term6488, term6488.getClass(), "contentsBoundingBox", null);
        setField(term6488, term6488.getClass(), "contentsSrsId", null);
        setField(term6488, term6488.getClass(), "tileBoundingBox", null);
        setLongField(term6488, term6488.getClass(), "tileSrsId", 0L);
        setField(term6488, term6488.getClass(), "tableName", null);
        setField(term6488, term6488.getClass(), "dataType", null);
        setField(term6488, term6488.getClass(), "identifier", null);
        setField(term6488, term6488.getClass(), "description", null);
        setField(term6488, term6488.getClass(), "idColumnName", null);
        setBooleanField(term6488, term6488.getClass(), "autoincrement", false);
        setField(term6488, term6488.getClass(), "additionalColumns", null);
        setField(term6488, term6488.getClass(), "columns", null);
        term6491 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.BoundingBox");
        argTypes[2] = Class.forName("mil.nga.geopackage.BoundingBox");
        argTypes[3] = long.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term6491;
        callMethod(klass, "create", argTypes, term6488, args);
    }

};


