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

public class ExtTileMatrix_getMatrixWidth_16967751198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3187;

    public ExtTileMatrix_getMatrixWidth_16967751198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3227 = new Double(0.6428742553484879);
        Double term3229 = new Double(0.6584165706677267);
        Double term3231 = new Double(0.44268490778872205);
        Double term3233 = new Double(0.7507333108648018);
        Long term3235 = new Long(5953383087795962419L);
        Long term3237 = new Long(7994303628307559416L);
        Double term3248 = new Double(0.007493740494434409);
        term3187 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term3189 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term3187, term3187.getClass(), "id", -7406618974062419277L);
        setLongField(term3189, term3189.getClass(), "id", 868503089567085985L);
        setField(term3189, term3189.getClass(), "tms", "vjxIhXHxGR");
        setField(term3189, term3189.getClass(), "description", "QXzGXbEXMu");
        setField(term3189, term3189.getClass(), "uri", "qxSDVejjiY");
        setField(term3189, term3189.getClass(), "minX", term3227);
        setField(term3189, term3189.getClass(), "minY", term3229);
        setField(term3189, term3189.getClass(), "maxX", term3231);
        setField(term3189, term3189.getClass(), "maxY", term3233);
        setField(term3189, term3189.getClass(), "srs", null);
        setField(term3189, term3189.getClass(), "srsId", term3235);
        setField(term3187, term3187.getClass(), "tms", term3189);
        setField(term3187, term3187.getClass(), "tmsId", term3237);
        setLongField(term3187, term3187.getClass(), "zoomLevel", -3277773415369003529L);
        setLongField(term3187, term3187.getClass(), "matrixWidth", 1253549421411622358L);
        setLongField(term3187, term3187.getClass(), "matrixHeight", 3666226122807672448L);
        setLongField(term3187, term3187.getClass(), "tileWidth", 3108750145697087661L);
        setLongField(term3187, term3187.getClass(), "tileHeight", 3752337209837437327L);
        setDoubleField(term3187, term3187.getClass(), "pixelXSize", 0.29874017652881824);
        setDoubleField(term3187, term3187.getClass(), "pixelYSize", 0.32554480512985284);
        setDoubleField(term3187, term3187.getClass(), "top", 0.8924855581421237);
        setDoubleField(term3187, term3187.getClass(), "left", 0.32237559209193944);
        setField(term3187, term3187.getClass(), "scaleDenominator", term3248);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatrixWidth", argTypes, term3187, args);
    }

};


