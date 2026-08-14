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

public class ExtTileMatrix_setMatrixHeight_211215120237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4995;
     Object term5006;

    public ExtTileMatrix_setMatrixHeight_211215120237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4995 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        setLongField(term4995, term4995.getClass(), "id", 0L);
        setField(term4995, term4995.getClass(), "tms", null);
        setField(term4995, term4995.getClass(), "tmsId", null);
        setLongField(term4995, term4995.getClass(), "zoomLevel", 0L);
        setLongField(term4995, term4995.getClass(), "matrixWidth", 0L);
        setLongField(term4995, term4995.getClass(), "matrixHeight", 0L);
        setLongField(term4995, term4995.getClass(), "tileWidth", 0L);
        setLongField(term4995, term4995.getClass(), "tileHeight", 0L);
        setDoubleField(term4995, term4995.getClass(), "pixelXSize", 0.0);
        setDoubleField(term4995, term4995.getClass(), "pixelYSize", 0.0);
        setDoubleField(term4995, term4995.getClass(), "top", 0.0);
        setDoubleField(term4995, term4995.getClass(), "left", 0.0);
        setField(term4995, term4995.getClass(), "scaleDenominator", null);
        term5006 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term5006;
        callMethod(klass, "setMatrixHeight", argTypes, term4995, args);
    }

};


