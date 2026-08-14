package mil.nga.geopackage.extension.im.vector_tiles;

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
import static mil.nga.geopackage.extension.im.vector_tiles.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class VectorTilesLayers_setId_10033606913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term741;
     Object term793;

    public VectorTilesLayers_setId_10033606913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term741 = newInstance(Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers"));
        setLongField(term741, term741.getClass(), "id", 1967728129628047933L);
        setField(term741, term741.getClass(), "tableName", "OWDIEULEFu");
        setField(term741, term741.getClass(), "name", "dWRymuLBtr");
        setField(term741, term741.getClass(), "description", "AijpHYOFuy");
        setLongField(term741, term741.getClass(), "minZoom", 2120084523938730454L);
        setLongField(term741, term741.getClass(), "maxZoom", 6855071767938501807L);
        setField(term741, term741.getClass(), "attributesTableName", "SbAoxhfrkn");
        term793 = new Long(-5892135042702373494L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term793;
        callMethod(klass, "setId", argTypes, term741, args);
    }

};


