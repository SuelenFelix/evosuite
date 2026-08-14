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

public class ExtTileMatrixSet_getSrs_99769062737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6780;

    public ExtTileMatrixSet_getSrs_99769062737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6780 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term6780, term6780.getClass(), "id", 0L);
        setField(term6780, term6780.getClass(), "tms", null);
        setField(term6780, term6780.getClass(), "description", null);
        setField(term6780, term6780.getClass(), "uri", null);
        setField(term6780, term6780.getClass(), "minX", null);
        setField(term6780, term6780.getClass(), "minY", null);
        setField(term6780, term6780.getClass(), "maxX", null);
        setField(term6780, term6780.getClass(), "maxY", null);
        setField(term6780, term6780.getClass(), "srs", null);
        setField(term6780, term6780.getClass(), "srsId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSrs", argTypes, term6780, args);
    }

};


