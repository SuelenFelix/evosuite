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
import java.lang.Long;

public class TileMatrixVariableWidths_setTmsId_131581395519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2404;
     Object term2410;

    public TileMatrixVariableWidths_setTmsId_131581395519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2404 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths"));
        setLongField(term2404, term2404.getClass(), "id", 0L);
        setField(term2404, term2404.getClass(), "tm", null);
        setLongField(term2404, term2404.getClass(), "tmsId", 0L);
        setLongField(term2404, term2404.getClass(), "maxRow", 0L);
        setLongField(term2404, term2404.getClass(), "minRow", 0L);
        setLongField(term2404, term2404.getClass(), "coalesce", 0L);
        term2410 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2410;
        callMethod(klass, "setTmsId", argTypes, term2404, args);
    }

};


