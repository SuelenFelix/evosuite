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

public class TileTableMetadata_createTyped_164430484342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6547;
     Object term6550;
     Object term6552;
     Object term6554;

    public TileTableMetadata_createTyped_164430484342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6547 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata"));
        setField(term6547, term6547.getClass(), "contentsBoundingBox", null);
        setField(term6547, term6547.getClass(), "contentsSrsId", null);
        setField(term6547, term6547.getClass(), "tileBoundingBox", null);
        setLongField(term6547, term6547.getClass(), "tileSrsId", 0L);
        setField(term6547, term6547.getClass(), "tableName", null);
        setField(term6547, term6547.getClass(), "dataType", null);
        setField(term6547, term6547.getClass(), "identifier", null);
        setField(term6547, term6547.getClass(), "description", null);
        setField(term6547, term6547.getClass(), "idColumnName", null);
        setBooleanField(term6547, term6547.getClass(), "autoincrement", false);
        setField(term6547, term6547.getClass(), "additionalColumns", null);
        setField(term6547, term6547.getClass(), "columns", null);
        term6550 = new Boolean(false);
        term6552 = new Long(0L);
        term6554 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("mil.nga.geopackage.BoundingBox");
        argTypes[4] = long.class;
        argTypes[5] = Class.forName("mil.nga.geopackage.BoundingBox");
        argTypes[6] = long.class;
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = null;
        args[2] = term6550;
        args[3] = null;
        args[4] = term6552;
        args[5] = null;
        args[6] = term6554;
        callMethod(klass, "createTyped", argTypes, term6547, args);
    }

};


