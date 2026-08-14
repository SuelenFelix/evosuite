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

public class ExtTileMatrix_getScaleDenominator_67554435950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5152;

    public ExtTileMatrix_getScaleDenominator_67554435950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5152 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        setLongField(term5152, term5152.getClass(), "id", 0L);
        setField(term5152, term5152.getClass(), "tms", null);
        setField(term5152, term5152.getClass(), "tmsId", null);
        setLongField(term5152, term5152.getClass(), "zoomLevel", 0L);
        setLongField(term5152, term5152.getClass(), "matrixWidth", 0L);
        setLongField(term5152, term5152.getClass(), "matrixHeight", 0L);
        setLongField(term5152, term5152.getClass(), "tileWidth", 0L);
        setLongField(term5152, term5152.getClass(), "tileHeight", 0L);
        setDoubleField(term5152, term5152.getClass(), "pixelXSize", 0.0);
        setDoubleField(term5152, term5152.getClass(), "pixelYSize", 0.0);
        setDoubleField(term5152, term5152.getClass(), "top", 0.0);
        setDoubleField(term5152, term5152.getClass(), "left", 0.0);
        setField(term5152, term5152.getClass(), "scaleDenominator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScaleDenominator", argTypes, term5152, args);
    }

};


