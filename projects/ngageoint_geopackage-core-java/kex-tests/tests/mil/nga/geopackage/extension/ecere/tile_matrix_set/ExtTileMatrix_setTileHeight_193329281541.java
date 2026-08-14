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

public class ExtTileMatrix_setTileHeight_193329281541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5043;
     Object term5054;

    public ExtTileMatrix_setTileHeight_193329281541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5043 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        setLongField(term5043, term5043.getClass(), "id", 0L);
        setField(term5043, term5043.getClass(), "tms", null);
        setField(term5043, term5043.getClass(), "tmsId", null);
        setLongField(term5043, term5043.getClass(), "zoomLevel", 0L);
        setLongField(term5043, term5043.getClass(), "matrixWidth", 0L);
        setLongField(term5043, term5043.getClass(), "matrixHeight", 0L);
        setLongField(term5043, term5043.getClass(), "tileWidth", 0L);
        setLongField(term5043, term5043.getClass(), "tileHeight", 0L);
        setDoubleField(term5043, term5043.getClass(), "pixelXSize", 0.0);
        setDoubleField(term5043, term5043.getClass(), "pixelYSize", 0.0);
        setDoubleField(term5043, term5043.getClass(), "top", 0.0);
        setDoubleField(term5043, term5043.getClass(), "left", 0.0);
        setField(term5043, term5043.getClass(), "scaleDenominator", null);
        term5054 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term5054;
        callMethod(klass, "setTileHeight", argTypes, term5043, args);
    }

};


