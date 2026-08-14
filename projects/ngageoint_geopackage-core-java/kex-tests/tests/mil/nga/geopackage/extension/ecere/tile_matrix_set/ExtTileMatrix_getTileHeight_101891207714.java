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

public class ExtTileMatrix_getTileHeight_101891207714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3751;

    public ExtTileMatrix_getTileHeight_101891207714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3791 = new Double(0.7046974927834232);
        Double term3793 = new Double(0.6896952303224777);
        Double term3795 = new Double(0.6693176553622628);
        Double term3797 = new Double(0.2962868255626906);
        Long term3799 = new Long(41775768178052008L);
        Long term3801 = new Long(6682528376118987775L);
        Double term3812 = new Double(0.25474180574060834);
        term3751 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term3753 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term3751, term3751.getClass(), "id", -5258945362776941718L);
        setLongField(term3753, term3753.getClass(), "id", 24067105862153728L);
        setField(term3753, term3753.getClass(), "tms", "hCWPJQKpdc");
        setField(term3753, term3753.getClass(), "description", "WzMEhMXkKx");
        setField(term3753, term3753.getClass(), "uri", "XOiDvlDhdc");
        setField(term3753, term3753.getClass(), "minX", term3791);
        setField(term3753, term3753.getClass(), "minY", term3793);
        setField(term3753, term3753.getClass(), "maxX", term3795);
        setField(term3753, term3753.getClass(), "maxY", term3797);
        setField(term3753, term3753.getClass(), "srs", null);
        setField(term3753, term3753.getClass(), "srsId", term3799);
        setField(term3751, term3751.getClass(), "tms", term3753);
        setField(term3751, term3751.getClass(), "tmsId", term3801);
        setLongField(term3751, term3751.getClass(), "zoomLevel", -8477368071089201577L);
        setLongField(term3751, term3751.getClass(), "matrixWidth", -1526729287349763895L);
        setLongField(term3751, term3751.getClass(), "matrixHeight", 7017605765544766728L);
        setLongField(term3751, term3751.getClass(), "tileWidth", -6078481855513028760L);
        setLongField(term3751, term3751.getClass(), "tileHeight", -6985556670871089725L);
        setDoubleField(term3751, term3751.getClass(), "pixelXSize", 0.07417792024383196);
        setDoubleField(term3751, term3751.getClass(), "pixelYSize", 0.686293604788188);
        setDoubleField(term3751, term3751.getClass(), "top", 0.12764449157430724);
        setDoubleField(term3751, term3751.getClass(), "left", 0.39446728256884744);
        setField(term3751, term3751.getClass(), "scaleDenominator", term3812);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileHeight", argTypes, term3751, args);
    }

};


