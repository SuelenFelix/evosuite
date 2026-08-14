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

public class ExtTileMatrix_setScaleDenominator_63407380751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5163;

    public ExtTileMatrix_setScaleDenominator_63407380751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5163 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        setLongField(term5163, term5163.getClass(), "id", 0L);
        setField(term5163, term5163.getClass(), "tms", null);
        setField(term5163, term5163.getClass(), "tmsId", null);
        setLongField(term5163, term5163.getClass(), "zoomLevel", 0L);
        setLongField(term5163, term5163.getClass(), "matrixWidth", 0L);
        setLongField(term5163, term5163.getClass(), "matrixHeight", 0L);
        setLongField(term5163, term5163.getClass(), "tileWidth", 0L);
        setLongField(term5163, term5163.getClass(), "tileHeight", 0L);
        setDoubleField(term5163, term5163.getClass(), "pixelXSize", 0.0);
        setDoubleField(term5163, term5163.getClass(), "pixelYSize", 0.0);
        setDoubleField(term5163, term5163.getClass(), "top", 0.0);
        setDoubleField(term5163, term5163.getClass(), "left", 0.0);
        setField(term5163, term5163.getClass(), "scaleDenominator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setScaleDenominator", argTypes, term5163, args);
    }

};


