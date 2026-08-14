package mil.nga.geopackage.extension.coverage;

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
import static mil.nga.geopackage.extension.coverage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class GriddedCoverage_setPrecision_25557743013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3353;
     Object term3451;

    public GriddedCoverage_setPrecision_25557743013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3399 = new Double(1.0);
        Double term3401 = new Double(0.8819646072665548);
        term3353 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        Object term3355 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setLongField(term3353, term3353.getClass(), "id", 2062173786000223358L);
        setField(term3355, term3355.getClass(), "contents", null);
        setField(term3355, term3355.getClass(), "tableName", "QXzGXbEXMu");
        setField(term3355, term3355.getClass(), "srs", null);
        setLongField(term3355, term3355.getClass(), "srsId", -8658027316505137504L);
        setDoubleField(term3355, term3355.getClass(), "minX", 0.045893173090043815);
        setDoubleField(term3355, term3355.getClass(), "minY", 0.3626177854778667);
        setDoubleField(term3355, term3355.getClass(), "maxX", 0.3163771663728089);
        setDoubleField(term3355, term3355.getClass(), "maxY", 0.8819646072665548);
        setField(term3353, term3353.getClass(), "tileMatrixSet", term3355);
        setField(term3353, term3353.getClass(), "tileMatrixSetName", "qxSDVejjiY");
        setField(term3353, term3353.getClass(), "datatype", "xBsXSDjXYK");
        setDoubleField(term3353, term3353.getClass(), "scale", 1.0);
        setDoubleField(term3353, term3353.getClass(), "offset", 0.5412182593116958);
        setField(term3353, term3353.getClass(), "precision", term3399);
        setField(term3353, term3353.getClass(), "dataNull", term3401);
        setField(term3353, term3353.getClass(), "gridCellEncoding", "sEnIVFtZuQ");
        setField(term3353, term3353.getClass(), "uom", "ZVecLZMLHF");
        setField(term3353, term3353.getClass(), "fieldName", "fztQhjqwdP");
        setField(term3353, term3353.getClass(), "quantityDefinition", "eVpkWxjuki");
        term3451 = new Double(0.5412182593116958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term3451;
        callMethod(klass, "setPrecision", argTypes, term3353, args);
    }

};


