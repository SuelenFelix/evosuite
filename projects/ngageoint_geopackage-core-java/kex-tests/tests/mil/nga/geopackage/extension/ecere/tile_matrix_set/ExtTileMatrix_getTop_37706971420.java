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

public class ExtTileMatrix_getTop_37706971420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4315;

    public ExtTileMatrix_getTop_37706971420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term4355 = new Double(0.1941255640189572);
        Double term4357 = new Double(0.2889811903417371);
        Double term4359 = new Double(0.7856101337088763);
        Double term4361 = new Double(0.1782857269567425);
        Long term4363 = new Long(-8652538484981166496L);
        Long term4365 = new Long(2701184207686293431L);
        Double term4376 = new Double(0.17829386444171214);
        term4315 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term4317 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term4315, term4315.getClass(), "id", 5319740127125920367L);
        setLongField(term4317, term4317.getClass(), "id", 6465987664600701876L);
        setField(term4317, term4317.getClass(), "tms", "ZzIujlwVsw");
        setField(term4317, term4317.getClass(), "description", "LWyEaeIyAo");
        setField(term4317, term4317.getClass(), "uri", "yVMkkQhvmN");
        setField(term4317, term4317.getClass(), "minX", term4355);
        setField(term4317, term4317.getClass(), "minY", term4357);
        setField(term4317, term4317.getClass(), "maxX", term4359);
        setField(term4317, term4317.getClass(), "maxY", term4361);
        setField(term4317, term4317.getClass(), "srs", null);
        setField(term4317, term4317.getClass(), "srsId", term4363);
        setField(term4315, term4315.getClass(), "tms", term4317);
        setField(term4315, term4315.getClass(), "tmsId", term4365);
        setLongField(term4315, term4315.getClass(), "zoomLevel", -136372844051852955L);
        setLongField(term4315, term4315.getClass(), "matrixWidth", -7632759764262745126L);
        setLongField(term4315, term4315.getClass(), "matrixHeight", 3746481521207337771L);
        setLongField(term4315, term4315.getClass(), "tileWidth", 4341016500855678917L);
        setLongField(term4315, term4315.getClass(), "tileHeight", -5871746020807491998L);
        setDoubleField(term4315, term4315.getClass(), "pixelXSize", 0.8777038609128434);
        setDoubleField(term4315, term4315.getClass(), "pixelYSize", 0.008025683154629148);
        setDoubleField(term4315, term4315.getClass(), "top", 0.40598298281353484);
        setDoubleField(term4315, term4315.getClass(), "left", 0.3710067290060264);
        setField(term4315, term4315.getClass(), "scaleDenominator", term4376);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTop", argTypes, term4315, args);
    }

};


