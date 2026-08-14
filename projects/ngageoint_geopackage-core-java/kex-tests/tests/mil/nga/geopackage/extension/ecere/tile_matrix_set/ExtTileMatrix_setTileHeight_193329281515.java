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

public class ExtTileMatrix_setTileHeight_193329281515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3844;
     Object term3907;

    public ExtTileMatrix_setTileHeight_193329281515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3884 = new Double(0.9957585718901875);
        Double term3886 = new Double(0.16755811343784477);
        Double term3888 = new Double(0.9090793968999221);
        Double term3890 = new Double(0.25997329921466494);
        Long term3892 = new Long(682356318767179819L);
        Long term3894 = new Long(-7291743527973326814L);
        Double term3905 = new Double(0.7814864708383836);
        term3844 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term3846 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term3844, term3844.getClass(), "id", -8469818909085103606L);
        setLongField(term3846, term3846.getClass(), "id", 11315815278355083L);
        setField(term3846, term3846.getClass(), "tms", "AdxvLJhNLe");
        setField(term3846, term3846.getClass(), "description", "lHfTrWKMPk");
        setField(term3846, term3846.getClass(), "uri", "JDaAnsVTGV");
        setField(term3846, term3846.getClass(), "minX", term3884);
        setField(term3846, term3846.getClass(), "minY", term3886);
        setField(term3846, term3846.getClass(), "maxX", term3888);
        setField(term3846, term3846.getClass(), "maxY", term3890);
        setField(term3846, term3846.getClass(), "srs", null);
        setField(term3846, term3846.getClass(), "srsId", term3892);
        setField(term3844, term3844.getClass(), "tms", term3846);
        setField(term3844, term3844.getClass(), "tmsId", term3894);
        setLongField(term3844, term3844.getClass(), "zoomLevel", 7735460540091431012L);
        setLongField(term3844, term3844.getClass(), "matrixWidth", 1346299551708610248L);
        setLongField(term3844, term3844.getClass(), "matrixHeight", -7191625829563442696L);
        setLongField(term3844, term3844.getClass(), "tileWidth", 1463379874413441830L);
        setLongField(term3844, term3844.getClass(), "tileHeight", 7998051124369147543L);
        setDoubleField(term3844, term3844.getClass(), "pixelXSize", 0.7865909711092062);
        setDoubleField(term3844, term3844.getClass(), "pixelYSize", 0.06587158449170749);
        setDoubleField(term3844, term3844.getClass(), "top", 0.0865998004187658);
        setDoubleField(term3844, term3844.getClass(), "left", 0.9628647861255637);
        setField(term3844, term3844.getClass(), "scaleDenominator", term3905);
        term3907 = new Long(-1481367303699139651L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3907;
        callMethod(klass, "setTileHeight", argTypes, term3844, args);
    }

};


