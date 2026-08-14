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

public class TileTableMetadata_createTyped_46387598539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6528;
     Object term6531;

    public TileTableMetadata_createTyped_46387598539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6528 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata"));
        setField(term6528, term6528.getClass(), "contentsBoundingBox", null);
        setField(term6528, term6528.getClass(), "contentsSrsId", null);
        setField(term6528, term6528.getClass(), "tileBoundingBox", null);
        setLongField(term6528, term6528.getClass(), "tileSrsId", 0L);
        setField(term6528, term6528.getClass(), "tableName", null);
        setField(term6528, term6528.getClass(), "dataType", null);
        setField(term6528, term6528.getClass(), "identifier", null);
        setField(term6528, term6528.getClass(), "description", null);
        setField(term6528, term6528.getClass(), "idColumnName", null);
        setBooleanField(term6528, term6528.getClass(), "autoincrement", false);
        setField(term6528, term6528.getClass(), "additionalColumns", null);
        setField(term6528, term6528.getClass(), "columns", null);
        term6531 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("mil.nga.geopackage.BoundingBox");
        argTypes[3] = Class.forName("mil.nga.geopackage.BoundingBox");
        argTypes[4] = long.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term6531;
        callMethod(klass, "createTyped", argTypes, term6528, args);
    }

};


