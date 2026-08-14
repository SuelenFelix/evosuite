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

public class ExtTileMatrixSet_getMaxY_17055362215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6354;

    public ExtTileMatrixSet_getMaxY_17055362215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term6392 = new Double(0.6101411757610665);
        Double term6394 = new Double(0.07932996853888874);
        Double term6396 = new Double(0.4335752168808029);
        Double term6398 = new Double(0.9196949182738653);
        Long term6400 = new Long(1597484336218508869L);
        term6354 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term6354, term6354.getClass(), "id", -8303973304709662279L);
        setField(term6354, term6354.getClass(), "tms", "ZkMALXpEAZ");
        setField(term6354, term6354.getClass(), "description", "tXfQjSqDzN");
        setField(term6354, term6354.getClass(), "uri", "BjugTaMcxJ");
        setField(term6354, term6354.getClass(), "minX", term6392);
        setField(term6354, term6354.getClass(), "minY", term6394);
        setField(term6354, term6354.getClass(), "maxX", term6396);
        setField(term6354, term6354.getClass(), "maxY", term6398);
        setField(term6354, term6354.getClass(), "srs", null);
        setField(term6354, term6354.getClass(), "srsId", term6400);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxY", argTypes, term6354, args);
    }

};


