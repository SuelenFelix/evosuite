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

public class TileTableMetadata_getDefaultDataType_28581816648 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6568;

    public TileTableMetadata_getDefaultDataType_28581816648() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6568 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata"));
        setField(term6568, term6568.getClass(), "contentsBoundingBox", null);
        setField(term6568, term6568.getClass(), "contentsSrsId", null);
        setField(term6568, term6568.getClass(), "tileBoundingBox", null);
        setLongField(term6568, term6568.getClass(), "tileSrsId", 0L);
        setField(term6568, term6568.getClass(), "tableName", null);
        setField(term6568, term6568.getClass(), "dataType", null);
        setField(term6568, term6568.getClass(), "identifier", null);
        setField(term6568, term6568.getClass(), "description", null);
        setField(term6568, term6568.getClass(), "idColumnName", null);
        setBooleanField(term6568, term6568.getClass(), "autoincrement", false);
        setField(term6568, term6568.getClass(), "additionalColumns", null);
        setField(term6568, term6568.getClass(), "columns", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTableMetadata");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDefaultDataType", argTypes, term6568, args);
    }

};


