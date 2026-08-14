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
import java.lang.Object;
import java.lang.Double;
import java.lang.Long;

public class TileMatrixVariableWidths_setMaxRow_7094997108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1871;
     Object term1940;

    public TileMatrixVariableWidths_setMaxRow_7094997108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1913 = new Double(0.29874017652881824);
        Double term1915 = new Double(0.32554480512985284);
        Double term1917 = new Double(0.8924855581421237);
        Double term1919 = new Double(0.32237559209193944);
        Long term1921 = new Long(1233889271256172047L);
        Long term1923 = new Long(6617340557564669657L);
        Double term1934 = new Double(0.53094494792755);
        term1871 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths"));
        Object term1873 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term1875 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term1871, term1871.getClass(), "id", 1084801489398441516L);
        setLongField(term1873, term1873.getClass(), "id", 6273754186658578034L);
        setLongField(term1875, term1875.getClass(), "id", 3620247240684476031L);
        setField(term1875, term1875.getClass(), "tms", "fhkbdRViHi");
        setField(term1875, term1875.getClass(), "description", "uWHnvSvaPl");
        setField(term1875, term1875.getClass(), "uri", "kBdSllIBVz");
        setField(term1875, term1875.getClass(), "minX", term1913);
        setField(term1875, term1875.getClass(), "minY", term1915);
        setField(term1875, term1875.getClass(), "maxX", term1917);
        setField(term1875, term1875.getClass(), "maxY", term1919);
        setField(term1875, term1875.getClass(), "srs", null);
        setField(term1875, term1875.getClass(), "srsId", term1921);
        setField(term1873, term1873.getClass(), "tms", term1875);
        setField(term1873, term1873.getClass(), "tmsId", term1923);
        setLongField(term1873, term1873.getClass(), "zoomLevel", 8313800941204938919L);
        setLongField(term1873, term1873.getClass(), "matrixWidth", -1214968196781083707L);
        setLongField(term1873, term1873.getClass(), "matrixHeight", -1804015692891701666L);
        setLongField(term1873, term1873.getClass(), "tileWidth", -6432617521836576658L);
        setLongField(term1873, term1873.getClass(), "tileHeight", -2255965562447970862L);
        setDoubleField(term1873, term1873.getClass(), "pixelXSize", 0.2852810965221698);
        setDoubleField(term1873, term1873.getClass(), "pixelYSize", 0.6300849762307866);
        setDoubleField(term1873, term1873.getClass(), "top", 0.9737083944266686);
        setDoubleField(term1873, term1873.getClass(), "left", 0.0668892744806211);
        setField(term1873, term1873.getClass(), "scaleDenominator", term1934);
        setField(term1871, term1871.getClass(), "tm", term1873);
        setLongField(term1871, term1871.getClass(), "tmsId", 148047808219672941L);
        setLongField(term1871, term1871.getClass(), "maxRow", 7489064039921396098L);
        setLongField(term1871, term1871.getClass(), "minRow", 6843866297465638866L);
        setLongField(term1871, term1871.getClass(), "coalesce", -4023935540989049732L);
        term1940 = new Long(855932984568615096L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1940;
        callMethod(klass, "setMaxRow", argTypes, term1871, args);
    }

};


