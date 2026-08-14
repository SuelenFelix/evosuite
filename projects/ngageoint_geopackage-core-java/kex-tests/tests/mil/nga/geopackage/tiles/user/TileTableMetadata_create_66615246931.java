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

public class TileTableMetadata_create_66615246931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6476;
     Object term6479;

    public TileTableMetadata_create_66615246931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6476 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata"));
        setField(term6476, term6476.getClass(), "contentsBoundingBox", null);
        setField(term6476, term6476.getClass(), "contentsSrsId", null);
        setField(term6476, term6476.getClass(), "tileBoundingBox", null);
        setLongField(term6476, term6476.getClass(), "tileSrsId", 0L);
        setField(term6476, term6476.getClass(), "tableName", null);
        setField(term6476, term6476.getClass(), "dataType", null);
        setField(term6476, term6476.getClass(), "identifier", null);
        setField(term6476, term6476.getClass(), "description", null);
        setField(term6476, term6476.getClass(), "idColumnName", null);
        setBooleanField(term6476, term6476.getClass(), "autoincrement", false);
        setField(term6476, term6476.getClass(), "additionalColumns", null);
        setField(term6476, term6476.getClass(), "columns", null);
        term6479 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.BoundingBox");
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term6479;
        callMethod(klass, "create", argTypes, term6476, args);
    }

};


