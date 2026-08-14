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

public class ExtTileMatrixSet_setSrs_66827219538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6782;

    public ExtTileMatrixSet_setSrs_66827219538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6782 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term6782, term6782.getClass(), "id", 0L);
        setField(term6782, term6782.getClass(), "tms", null);
        setField(term6782, term6782.getClass(), "description", null);
        setField(term6782, term6782.getClass(), "uri", null);
        setField(term6782, term6782.getClass(), "minX", null);
        setField(term6782, term6782.getClass(), "minY", null);
        setField(term6782, term6782.getClass(), "maxX", null);
        setField(term6782, term6782.getClass(), "maxY", null);
        setField(term6782, term6782.getClass(), "srs", null);
        setField(term6782, term6782.getClass(), "srsId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.srs.SpatialReferenceSystem");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSrs", argTypes, term6782, args);
    }

};


