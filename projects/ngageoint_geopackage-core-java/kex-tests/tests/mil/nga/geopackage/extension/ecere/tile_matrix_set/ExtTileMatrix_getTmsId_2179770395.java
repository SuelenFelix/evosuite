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

public class ExtTileMatrix_getTmsId_2179770395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2906;

    public ExtTileMatrix_getTmsId_2179770395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term2946 = new Double(0.6512870939318848);
        Double term2948 = new Double(0.8777038609128434);
        Double term2950 = new Double(0.008025683154629148);
        Double term2952 = new Double(0.40598298281353484);
        Long term2954 = new Long(-2644215923136513282L);
        Long term2956 = new Long(-1468719814009985452L);
        Double term2967 = new Double(0.3710067290060264);
        term2906 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term2908 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term2906, term2906.getClass(), "id", 3230472384687362867L);
        setLongField(term2908, term2908.getClass(), "id", -1145146470850585022L);
        setField(term2908, term2908.getClass(), "tms", "jiKYgYHqIS");
        setField(term2908, term2908.getClass(), "description", "DfISiziTgG");
        setField(term2908, term2908.getClass(), "uri", "XqgfKFvPSD");
        setField(term2908, term2908.getClass(), "minX", term2946);
        setField(term2908, term2908.getClass(), "minY", term2948);
        setField(term2908, term2908.getClass(), "maxX", term2950);
        setField(term2908, term2908.getClass(), "maxY", term2952);
        setField(term2908, term2908.getClass(), "srs", null);
        setField(term2908, term2908.getClass(), "srsId", term2954);
        setField(term2906, term2906.getClass(), "tms", term2908);
        setField(term2906, term2906.getClass(), "tmsId", term2956);
        setLongField(term2906, term2906.getClass(), "zoomLevel", 1993646237353405740L);
        setLongField(term2906, term2906.getClass(), "matrixWidth", -4043093655001688454L);
        setLongField(term2906, term2906.getClass(), "matrixHeight", -419800263764810394L);
        setLongField(term2906, term2906.getClass(), "tileWidth", 5904678961906211249L);
        setLongField(term2906, term2906.getClass(), "tileHeight", -1820639665251914495L);
        setDoubleField(term2906, term2906.getClass(), "pixelXSize", 0.016575281023182953);
        setDoubleField(term2906, term2906.getClass(), "pixelYSize", 0.5308350402051779);
        setDoubleField(term2906, term2906.getClass(), "top", 0.7154795600170818);
        setDoubleField(term2906, term2906.getClass(), "left", 0.6355029654528058);
        setField(term2906, term2906.getClass(), "scaleDenominator", term2967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTmsId", argTypes, term2906, args);
    }

};


