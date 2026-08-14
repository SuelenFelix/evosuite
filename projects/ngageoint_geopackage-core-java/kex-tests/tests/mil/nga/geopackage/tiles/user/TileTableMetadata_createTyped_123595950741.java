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

public class TileTableMetadata_createTyped_123595950741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6540;
     Object term6543;
     Object term6545;

    public TileTableMetadata_createTyped_123595950741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6540 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata"));
        setField(term6540, term6540.getClass(), "contentsBoundingBox", null);
        setField(term6540, term6540.getClass(), "contentsSrsId", null);
        setField(term6540, term6540.getClass(), "tileBoundingBox", null);
        setLongField(term6540, term6540.getClass(), "tileSrsId", 0L);
        setField(term6540, term6540.getClass(), "tableName", null);
        setField(term6540, term6540.getClass(), "dataType", null);
        setField(term6540, term6540.getClass(), "identifier", null);
        setField(term6540, term6540.getClass(), "description", null);
        setField(term6540, term6540.getClass(), "idColumnName", null);
        setBooleanField(term6540, term6540.getClass(), "autoincrement", false);
        setField(term6540, term6540.getClass(), "additionalColumns", null);
        setField(term6540, term6540.getClass(), "columns", null);
        term6543 = new Long(0L);
        term6545 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("mil.nga.geopackage.BoundingBox");
        argTypes[3] = long.class;
        argTypes[4] = Class.forName("mil.nga.geopackage.BoundingBox");
        argTypes[5] = long.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = term6543;
        args[4] = null;
        args[5] = term6545;
        callMethod(klass, "createTyped", argTypes, term6540, args);
    }

};


