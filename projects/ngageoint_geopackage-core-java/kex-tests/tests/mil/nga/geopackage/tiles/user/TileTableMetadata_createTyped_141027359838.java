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
import java.lang.Long;

public class TileTableMetadata_createTyped_141027359838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6521;
     Object term6524;
     Object term6526;

    public TileTableMetadata_createTyped_141027359838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6521 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata"));
        setField(term6521, term6521.getClass(), "contentsBoundingBox", null);
        setField(term6521, term6521.getClass(), "contentsSrsId", null);
        setField(term6521, term6521.getClass(), "tileBoundingBox", null);
        setLongField(term6521, term6521.getClass(), "tileSrsId", 0L);
        setField(term6521, term6521.getClass(), "tableName", null);
        setField(term6521, term6521.getClass(), "dataType", null);
        setField(term6521, term6521.getClass(), "identifier", null);
        setField(term6521, term6521.getClass(), "description", null);
        setField(term6521, term6521.getClass(), "idColumnName", null);
        setBooleanField(term6521, term6521.getClass(), "autoincrement", false);
        setField(term6521, term6521.getClass(), "additionalColumns", null);
        setField(term6521, term6521.getClass(), "columns", null);
        term6524 = new Boolean(false);
        term6526 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("mil.nga.geopackage.BoundingBox");
        argTypes[4] = long.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term6524;
        args[3] = null;
        args[4] = term6526;
        callMethod(klass, "createTyped", argTypes, term6521, args);
    }

};


