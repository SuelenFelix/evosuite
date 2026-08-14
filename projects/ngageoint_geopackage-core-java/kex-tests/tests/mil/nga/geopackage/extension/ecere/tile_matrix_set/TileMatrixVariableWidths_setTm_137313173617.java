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

public class TileMatrixVariableWidths_setTm_137313173617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2392;

    public TileMatrixVariableWidths_setTm_137313173617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2392 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths"));
        setLongField(term2392, term2392.getClass(), "id", 0L);
        setField(term2392, term2392.getClass(), "tm", null);
        setLongField(term2392, term2392.getClass(), "tmsId", 0L);
        setLongField(term2392, term2392.getClass(), "maxRow", 0L);
        setLongField(term2392, term2392.getClass(), "minRow", 0L);
        setLongField(term2392, term2392.getClass(), "coalesce", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTm", argTypes, term2392, args);
    }

};


