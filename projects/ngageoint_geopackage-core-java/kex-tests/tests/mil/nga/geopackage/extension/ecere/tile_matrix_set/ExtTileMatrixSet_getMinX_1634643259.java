package mil.nga.geopackage.extension.ecere.tile_matrix_set;

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
import static mil.nga.geopackage.extension.ecere.tile_matrix_set.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;
import java.lang.Long;

public class ExtTileMatrixSet_getMinX_1634643259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5880;

    public ExtTileMatrixSet_getMinX_1634643259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term5918 = new Double(0.39416780533640805);
        Double term5920 = new Double(0.5384156574050297);
        Double term5922 = new Double(0.28813953022653416);
        Double term5924 = new Double(0.6221715730666386);
        Long term5926 = new Long(1368340889161782793L);
        term5880 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term5880, term5880.getClass(), "id", -8692119547314358088L);
        setField(term5880, term5880.getClass(), "tms", "RbVQXSpxXy");
        setField(term5880, term5880.getClass(), "description", "YpJbIgJWWv");
        setField(term5880, term5880.getClass(), "uri", "JppkknKVOw");
        setField(term5880, term5880.getClass(), "minX", term5918);
        setField(term5880, term5880.getClass(), "minY", term5920);
        setField(term5880, term5880.getClass(), "maxX", term5922);
        setField(term5880, term5880.getClass(), "maxY", term5924);
        setField(term5880, term5880.getClass(), "srs", null);
        setField(term5880, term5880.getClass(), "srsId", term5926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinX", argTypes, term5880, args);
    }

};


