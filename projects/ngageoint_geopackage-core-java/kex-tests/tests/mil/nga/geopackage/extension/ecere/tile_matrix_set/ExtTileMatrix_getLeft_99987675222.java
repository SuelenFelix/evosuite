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

public class ExtTileMatrix_getLeft_99987675222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4503;

    public ExtTileMatrix_getLeft_99987675222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term4543 = new Double(0.1187814206908886);
        Double term4545 = new Double(0.04662501176438627);
        Double term4547 = new Double(0.17512426723256447);
        Double term4549 = new Double(0.9379214810416256);
        Long term4551 = new Long(-8876856890348836498L);
        Long term4553 = new Long(846579494941632714L);
        Double term4564 = new Double(0.10807577760679721);
        term4503 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term4505 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term4503, term4503.getClass(), "id", -9147545274054597570L);
        setLongField(term4505, term4505.getClass(), "id", -8398381579707958144L);
        setField(term4505, term4505.getClass(), "tms", "EeBVbzjcCI");
        setField(term4505, term4505.getClass(), "description", "UfQtPRyWRC");
        setField(term4505, term4505.getClass(), "uri", "FPvxVzzSvD");
        setField(term4505, term4505.getClass(), "minX", term4543);
        setField(term4505, term4505.getClass(), "minY", term4545);
        setField(term4505, term4505.getClass(), "maxX", term4547);
        setField(term4505, term4505.getClass(), "maxY", term4549);
        setField(term4505, term4505.getClass(), "srs", null);
        setField(term4505, term4505.getClass(), "srsId", term4551);
        setField(term4503, term4503.getClass(), "tms", term4505);
        setField(term4503, term4503.getClass(), "tmsId", term4553);
        setLongField(term4503, term4503.getClass(), "zoomLevel", -2195061939206930224L);
        setLongField(term4503, term4503.getClass(), "matrixWidth", 4525924047960478347L);
        setLongField(term4503, term4503.getClass(), "matrixHeight", -3225860270104198596L);
        setLongField(term4503, term4503.getClass(), "tileWidth", -1164342036939643746L);
        setLongField(term4503, term4503.getClass(), "tileHeight", -7013378340043571457L);
        setDoubleField(term4503, term4503.getClass(), "pixelXSize", 0.2446504549754045);
        setDoubleField(term4503, term4503.getClass(), "pixelYSize", 0.6142723998707854);
        setDoubleField(term4503, term4503.getClass(), "top", 0.4355627280318103);
        setDoubleField(term4503, term4503.getClass(), "left", 0.841460835734741);
        setField(term4503, term4503.getClass(), "scaleDenominator", term4564);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLeft", argTypes, term4503, args);
    }

};


