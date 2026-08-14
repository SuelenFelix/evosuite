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

public class ExtTileMatrixSet_getMinY_16346336411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6038;

    public ExtTileMatrixSet_getMinY_16346336411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term6076 = new Double(0.009446329384675933);
        Double term6078 = new Double(0.20131600000037786);
        Double term6080 = new Double(0.332320568233212);
        Double term6082 = new Double(0.18561351983828822);
        Long term6084 = new Long(2354625302846375590L);
        term6038 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term6038, term6038.getClass(), "id", -2691996476200751382L);
        setField(term6038, term6038.getClass(), "tms", "lFRJFUMVbx");
        setField(term6038, term6038.getClass(), "description", "sZdUNdggUW");
        setField(term6038, term6038.getClass(), "uri", "OqbwYQfvAe");
        setField(term6038, term6038.getClass(), "minX", term6076);
        setField(term6038, term6038.getClass(), "minY", term6078);
        setField(term6038, term6038.getClass(), "maxX", term6080);
        setField(term6038, term6038.getClass(), "maxY", term6082);
        setField(term6038, term6038.getClass(), "srs", null);
        setField(term6038, term6038.getClass(), "srsId", term6084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinY", argTypes, term6038, args);
    }

};


