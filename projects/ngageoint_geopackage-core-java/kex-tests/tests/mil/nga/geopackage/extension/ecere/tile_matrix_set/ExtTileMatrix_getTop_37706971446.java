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

public class ExtTileMatrix_getTop_37706971446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5104;

    public ExtTileMatrix_getTop_37706971446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5104 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        setLongField(term5104, term5104.getClass(), "id", 0L);
        setField(term5104, term5104.getClass(), "tms", null);
        setField(term5104, term5104.getClass(), "tmsId", null);
        setLongField(term5104, term5104.getClass(), "zoomLevel", 0L);
        setLongField(term5104, term5104.getClass(), "matrixWidth", 0L);
        setLongField(term5104, term5104.getClass(), "matrixHeight", 0L);
        setLongField(term5104, term5104.getClass(), "tileWidth", 0L);
        setLongField(term5104, term5104.getClass(), "tileHeight", 0L);
        setDoubleField(term5104, term5104.getClass(), "pixelXSize", 0.0);
        setDoubleField(term5104, term5104.getClass(), "pixelYSize", 0.0);
        setDoubleField(term5104, term5104.getClass(), "top", 0.0);
        setDoubleField(term5104, term5104.getClass(), "left", 0.0);
        setField(term5104, term5104.getClass(), "scaleDenominator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTop", argTypes, term5104, args);
    }

};


