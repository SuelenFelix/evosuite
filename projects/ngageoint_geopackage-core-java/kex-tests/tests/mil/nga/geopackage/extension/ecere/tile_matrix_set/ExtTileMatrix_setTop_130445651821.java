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

public class ExtTileMatrix_setTop_130445651821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4408;
     Object term4471;

    public ExtTileMatrix_setTop_130445651821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term4448 = new Double(0.547995853732519);
        Double term4450 = new Double(0.3483938514131425);
        Double term4452 = new Double(0.0100718646868041);
        Double term4454 = new Double(0.58265008665336);
        Long term4456 = new Long(4474998035090263139L);
        Long term4458 = new Long(2848819812340321742L);
        Double term4469 = new Double(0.1163034938203874);
        term4408 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term4410 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term4408, term4408.getClass(), "id", 4742108233936970770L);
        setLongField(term4410, term4410.getClass(), "id", 2722004046017350471L);
        setField(term4410, term4410.getClass(), "tms", "mvrkADEgpp");
        setField(term4410, term4410.getClass(), "description", "pXOkjyeIRb");
        setField(term4410, term4410.getClass(), "uri", "GgZWSjxjyE");
        setField(term4410, term4410.getClass(), "minX", term4448);
        setField(term4410, term4410.getClass(), "minY", term4450);
        setField(term4410, term4410.getClass(), "maxX", term4452);
        setField(term4410, term4410.getClass(), "maxY", term4454);
        setField(term4410, term4410.getClass(), "srs", null);
        setField(term4410, term4410.getClass(), "srsId", term4456);
        setField(term4408, term4408.getClass(), "tms", term4410);
        setField(term4408, term4408.getClass(), "tmsId", term4458);
        setLongField(term4408, term4408.getClass(), "zoomLevel", 6636235983121346803L);
        setLongField(term4408, term4408.getClass(), "matrixWidth", 146749226579788091L);
        setLongField(term4408, term4408.getClass(), "matrixHeight", -1279670138064751276L);
        setLongField(term4408, term4408.getClass(), "tileWidth", -7205236974351118210L);
        setLongField(term4408, term4408.getClass(), "tileHeight", -2136893352275781569L);
        setDoubleField(term4408, term4408.getClass(), "pixelXSize", 0.7818620200430967);
        setDoubleField(term4408, term4408.getClass(), "pixelYSize", 0.04640022995603543);
        setDoubleField(term4408, term4408.getClass(), "top", 0.9123572866833729);
        setDoubleField(term4408, term4408.getClass(), "left", 0.40635376375558196);
        setField(term4408, term4408.getClass(), "scaleDenominator", term4469);
        term4471 = new Double(0.4772043271031934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term4471;
        callMethod(klass, "setTop", argTypes, term4408, args);
    }

};


