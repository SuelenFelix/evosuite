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

public class ExtTileMatrix_getZoomLevel_17632541156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2999;

    public ExtTileMatrix_getZoomLevel_17632541156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3039 = new Double(0.7818620200430967);
        Double term3041 = new Double(0.04640022995603543);
        Double term3043 = new Double(0.9123572866833729);
        Double term3045 = new Double(0.40635376375558196);
        Long term3047 = new Long(-7738503207562305297L);
        Long term3049 = new Long(3825396310311739952L);
        Double term3060 = new Double(0.4772043271031934);
        term2999 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term3001 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term2999, term2999.getClass(), "id", 3238645206498300107L);
        setLongField(term3001, term3001.getClass(), "id", -1592696983130738594L);
        setField(term3001, term3001.getClass(), "tms", "JiVRgTZvKc");
        setField(term3001, term3001.getClass(), "description", "XPKmummaqg");
        setField(term3001, term3001.getClass(), "uri", "BKLfkLiZTH");
        setField(term3001, term3001.getClass(), "minX", term3039);
        setField(term3001, term3001.getClass(), "minY", term3041);
        setField(term3001, term3001.getClass(), "maxX", term3043);
        setField(term3001, term3001.getClass(), "maxY", term3045);
        setField(term3001, term3001.getClass(), "srs", null);
        setField(term3001, term3001.getClass(), "srsId", term3047);
        setField(term2999, term2999.getClass(), "tms", term3001);
        setField(term2999, term2999.getClass(), "tmsId", term3049);
        setLongField(term2999, term2999.getClass(), "zoomLevel", 6902365338255307910L);
        setLongField(term2999, term2999.getClass(), "matrixWidth", -8019730974733786399L);
        setLongField(term2999, term2999.getClass(), "matrixHeight", 394960377236392159L);
        setLongField(term2999, term2999.getClass(), "tileWidth", -2955854401507097864L);
        setLongField(term2999, term2999.getClass(), "tileHeight", 329213208496958131L);
        setDoubleField(term2999, term2999.getClass(), "pixelXSize", 0.0022646783892913414);
        setDoubleField(term2999, term2999.getClass(), "pixelYSize", 0.36226058076369927);
        setDoubleField(term2999, term2999.getClass(), "top", 0.03699061125289671);
        setDoubleField(term2999, term2999.getClass(), "left", 0.6047137830113202);
        setField(term2999, term2999.getClass(), "scaleDenominator", term3060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZoomLevel", argTypes, term2999, args);
    }

};


