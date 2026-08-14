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

public class ExtTileMatrix_setTms_141780946130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4914;

    public ExtTileMatrix_setTms_141780946130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4914 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        setLongField(term4914, term4914.getClass(), "id", 0L);
        setField(term4914, term4914.getClass(), "tms", null);
        setField(term4914, term4914.getClass(), "tmsId", null);
        setLongField(term4914, term4914.getClass(), "zoomLevel", 0L);
        setLongField(term4914, term4914.getClass(), "matrixWidth", 0L);
        setLongField(term4914, term4914.getClass(), "matrixHeight", 0L);
        setLongField(term4914, term4914.getClass(), "tileWidth", 0L);
        setLongField(term4914, term4914.getClass(), "tileHeight", 0L);
        setDoubleField(term4914, term4914.getClass(), "pixelXSize", 0.0);
        setDoubleField(term4914, term4914.getClass(), "pixelYSize", 0.0);
        setDoubleField(term4914, term4914.getClass(), "top", 0.0);
        setDoubleField(term4914, term4914.getClass(), "left", 0.0);
        setField(term4914, term4914.getClass(), "scaleDenominator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTms", argTypes, term4914, args);
    }

};


