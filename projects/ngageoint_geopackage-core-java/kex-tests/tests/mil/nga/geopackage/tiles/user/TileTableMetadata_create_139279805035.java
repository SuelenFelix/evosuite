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

public class TileTableMetadata_create_139279805035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6500;
     Object term6503;
     Object term6505;

    public TileTableMetadata_create_139279805035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6500 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata"));
        setField(term6500, term6500.getClass(), "contentsBoundingBox", null);
        setField(term6500, term6500.getClass(), "contentsSrsId", null);
        setField(term6500, term6500.getClass(), "tileBoundingBox", null);
        setLongField(term6500, term6500.getClass(), "tileSrsId", 0L);
        setField(term6500, term6500.getClass(), "tableName", null);
        setField(term6500, term6500.getClass(), "dataType", null);
        setField(term6500, term6500.getClass(), "identifier", null);
        setField(term6500, term6500.getClass(), "description", null);
        setField(term6500, term6500.getClass(), "idColumnName", null);
        setBooleanField(term6500, term6500.getClass(), "autoincrement", false);
        setField(term6500, term6500.getClass(), "additionalColumns", null);
        setField(term6500, term6500.getClass(), "columns", null);
        term6503 = new Long(0L);
        term6505 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.BoundingBox");
        argTypes[2] = long.class;
        argTypes[3] = Class.forName("mil.nga.geopackage.BoundingBox");
        argTypes[4] = long.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term6503;
        args[3] = null;
        args[4] = term6505;
        callMethod(klass, "create", argTypes, term6500, args);
    }

};


