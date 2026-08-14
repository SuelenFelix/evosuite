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

public class ExtTileMatrix_setPixelXSize_5968886817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4032;
     Object term4095;

    public ExtTileMatrix_setPixelXSize_5968886817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term4072 = new Double(0.9765248027281291);
        Double term4074 = new Double(0.9184034277897645);
        Double term4076 = new Double(0.9457448635091538);
        Double term4078 = new Double(0.3238255203811462);
        Long term4080 = new Long(7862575738391801707L);
        Long term4082 = new Long(50358265865610362L);
        Double term4093 = new Double(0.2843894095932772);
        term4032 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term4034 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term4032, term4032.getClass(), "id", -3130003589475815807L);
        setLongField(term4034, term4034.getClass(), "id", -5344598381371854750L);
        setField(term4034, term4034.getClass(), "tms", "OJJtVNPyKZ");
        setField(term4034, term4034.getClass(), "description", "AKNapTAfmD");
        setField(term4034, term4034.getClass(), "uri", "xJgPlLxpgC");
        setField(term4034, term4034.getClass(), "minX", term4072);
        setField(term4034, term4034.getClass(), "minY", term4074);
        setField(term4034, term4034.getClass(), "maxX", term4076);
        setField(term4034, term4034.getClass(), "maxY", term4078);
        setField(term4034, term4034.getClass(), "srs", null);
        setField(term4034, term4034.getClass(), "srsId", term4080);
        setField(term4032, term4032.getClass(), "tms", term4034);
        setField(term4032, term4032.getClass(), "tmsId", term4082);
        setLongField(term4032, term4032.getClass(), "zoomLevel", -3718250311794019732L);
        setLongField(term4032, term4032.getClass(), "matrixWidth", -5935517391653614345L);
        setLongField(term4032, term4032.getClass(), "matrixHeight", -6521561238735301071L);
        setLongField(term4032, term4032.getClass(), "tileWidth", -6609679920238945303L);
        setLongField(term4032, term4032.getClass(), "tileHeight", -7296330380944173376L);
        setDoubleField(term4032, term4032.getClass(), "pixelXSize", 0.7618164754425794);
        setDoubleField(term4032, term4032.getClass(), "pixelYSize", 0.7385589312559342);
        setDoubleField(term4032, term4032.getClass(), "top", 0.7080134263823477);
        setDoubleField(term4032, term4032.getClass(), "left", 0.6059734092898602);
        setField(term4032, term4032.getClass(), "scaleDenominator", term4093);
        term4095 = new Double(0.3074693824288357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term4095;
        callMethod(klass, "setPixelXSize", argTypes, term4032, args);
    }

};


