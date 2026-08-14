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

public class GriddedCoverage_getGridCellEncoding_185789793918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4661;

    public GriddedCoverage_getGridCellEncoding_185789793918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term4707 = new Double(1.0);
        Double term4709 = new Double(0.268304014379393);
        term4661 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        Object term4663 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setLongField(term4661, term4661.getClass(), "id", 682356318767179819L);
        setField(term4663, term4663.getClass(), "contents", null);
        setField(term4663, term4663.getClass(), "tableName", "ZzIujlwVsw");
        setField(term4663, term4663.getClass(), "srs", null);
        setLongField(term4663, term4663.getClass(), "srsId", -7291743527973326814L);
        setDoubleField(term4663, term4663.getClass(), "minX", 0.6561919196821765);
        setDoubleField(term4663, term4663.getClass(), "minY", 0.7330178886612495);
        setDoubleField(term4663, term4663.getClass(), "maxX", 0.7618164754425794);
        setDoubleField(term4663, term4663.getClass(), "maxY", 0.7385589312559342);
        setField(term4661, term4661.getClass(), "tileMatrixSet", term4663);
        setField(term4661, term4661.getClass(), "tileMatrixSetName", "LWyEaeIyAo");
        setField(term4661, term4661.getClass(), "datatype", "yVMkkQhvmN");
        setDoubleField(term4661, term4661.getClass(), "scale", 1.0);
        setDoubleField(term4661, term4661.getClass(), "offset", 0.7080134263823477);
        setField(term4661, term4661.getClass(), "precision", term4707);
        setField(term4661, term4661.getClass(), "dataNull", term4709);
        setField(term4661, term4661.getClass(), "gridCellEncoding", "mvrkADEgpp");
        setField(term4661, term4661.getClass(), "uom", "pXOkjyeIRb");
        setField(term4661, term4661.getClass(), "fieldName", "GgZWSjxjyE");
        setField(term4661, term4661.getClass(), "quantityDefinition", "EeBVbzjcCI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGridCellEncoding", argTypes, term4661, args);
    }

};


