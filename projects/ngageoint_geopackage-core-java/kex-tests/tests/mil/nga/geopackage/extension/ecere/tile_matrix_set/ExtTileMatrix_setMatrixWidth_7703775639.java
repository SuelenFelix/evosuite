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

public class ExtTileMatrix_setMatrixWidth_7703775639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3280;
     Object term3343;

    public ExtTileMatrix_setMatrixWidth_7703775639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3320 = new Double(0.29172553321356776);
        Double term3322 = new Double(0.9276995636844321);
        Double term3324 = new Double(0.7636130748477434);
        Double term3326 = new Double(0.07901636960861558);
        Long term3328 = new Long(2443640364875054177L);
        Long term3330 = new Long(-1610676979013636850L);
        Double term3341 = new Double(0.18717846301066243);
        term3280 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term3282 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term3280, term3280.getClass(), "id", 1860789353508856614L);
        setLongField(term3282, term3282.getClass(), "id", -7456852906235966771L);
        setField(term3282, term3282.getClass(), "tms", "xBsXSDjXYK");
        setField(term3282, term3282.getClass(), "description", "sEnIVFtZuQ");
        setField(term3282, term3282.getClass(), "uri", "ZVecLZMLHF");
        setField(term3282, term3282.getClass(), "minX", term3320);
        setField(term3282, term3282.getClass(), "minY", term3322);
        setField(term3282, term3282.getClass(), "maxX", term3324);
        setField(term3282, term3282.getClass(), "maxY", term3326);
        setField(term3282, term3282.getClass(), "srs", null);
        setField(term3282, term3282.getClass(), "srsId", term3328);
        setField(term3280, term3280.getClass(), "tms", term3282);
        setField(term3280, term3280.getClass(), "tmsId", term3330);
        setLongField(term3280, term3280.getClass(), "zoomLevel", -67485388932970712L);
        setLongField(term3280, term3280.getClass(), "matrixWidth", 5806367330808555223L);
        setLongField(term3280, term3280.getClass(), "matrixHeight", 4576699120365923235L);
        setLongField(term3280, term3280.getClass(), "tileWidth", -1635471392209071620L);
        setLongField(term3280, term3280.getClass(), "tileHeight", -4714000263923324167L);
        setDoubleField(term3280, term3280.getClass(), "pixelXSize", 0.53094494792755);
        setDoubleField(term3280, term3280.getClass(), "pixelYSize", 0.146431486357265);
        setDoubleField(term3280, term3280.getClass(), "top", 0.24259014218848696);
        setDoubleField(term3280, term3280.getClass(), "left", 0.1544348383112728);
        setField(term3280, term3280.getClass(), "scaleDenominator", term3341);
        term3343 = new Long(6906379511067694917L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3343;
        callMethod(klass, "setMatrixWidth", argTypes, term3280, args);
    }

};


