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

public class ExtTileMatrix_getMatrixHeight_124629148810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3375;

    public ExtTileMatrix_getMatrixHeight_124629148810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3415 = new Double(0.5335953039331021);
        Double term3417 = new Double(0.5725602309856443);
        Double term3419 = new Double(0.5310967137636303);
        Double term3421 = new Double(0.6054109236809134);
        Long term3423 = new Long(2062173786000223358L);
        Long term3425 = new Long(-8658027316505137504L);
        Double term3436 = new Double(0.9165240441138934);
        term3375 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term3377 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term3375, term3375.getClass(), "id", -9204303423581447271L);
        setLongField(term3377, term3377.getClass(), "id", 6248239231585852341L);
        setField(term3377, term3377.getClass(), "tms", "fztQhjqwdP");
        setField(term3377, term3377.getClass(), "description", "eVpkWxjuki");
        setField(term3377, term3377.getClass(), "uri", "SJiQaLvSKv");
        setField(term3377, term3377.getClass(), "minX", term3415);
        setField(term3377, term3377.getClass(), "minY", term3417);
        setField(term3377, term3377.getClass(), "maxX", term3419);
        setField(term3377, term3377.getClass(), "maxY", term3421);
        setField(term3377, term3377.getClass(), "srs", null);
        setField(term3377, term3377.getClass(), "srsId", term3423);
        setField(term3375, term3375.getClass(), "tms", term3377);
        setField(term3375, term3375.getClass(), "tmsId", term3425);
        setLongField(term3375, term3375.getClass(), "zoomLevel", -88538481937688851L);
        setLongField(term3375, term3375.getClass(), "matrixWidth", 4069264186851023313L);
        setLongField(term3375, term3375.getClass(), "matrixHeight", 5184635470881147510L);
        setLongField(term3375, term3375.getClass(), "tileWidth", 918397384129253729L);
        setLongField(term3375, term3375.getClass(), "tileHeight", -2187638136407967948L);
        setDoubleField(term3375, term3375.getClass(), "pixelXSize", 0.5187846213101265);
        setDoubleField(term3375, term3375.getClass(), "pixelYSize", 0.045893173090043815);
        setDoubleField(term3375, term3375.getClass(), "top", 0.3626177854778667);
        setDoubleField(term3375, term3375.getClass(), "left", 0.3163771663728089);
        setField(term3375, term3375.getClass(), "scaleDenominator", term3436);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatrixHeight", argTypes, term3375, args);
    }

};


