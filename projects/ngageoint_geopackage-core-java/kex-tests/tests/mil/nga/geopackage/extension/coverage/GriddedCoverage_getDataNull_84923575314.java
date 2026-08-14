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

public class GriddedCoverage_getDataNull_84923575314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3523;

    public GriddedCoverage_getDataNull_84923575314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3569 = new Double(1.0);
        Double term3571 = new Double(0.16988691727397487);
        term3523 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        Object term3525 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setLongField(term3523, term3523.getClass(), "id", 414749984815662075L);
        setField(term3525, term3525.getClass(), "contents", null);
        setField(term3525, term3525.getClass(), "tableName", "SJiQaLvSKv");
        setField(term3525, term3525.getClass(), "srs", null);
        setLongField(term3525, term3525.getClass(), "srsId", 463622836963501975L);
        setDoubleField(term3525, term3525.getClass(), "minX", 0.16988691727397487);
        setDoubleField(term3525, term3525.getClass(), "minY", 0.39286935532362843);
        setDoubleField(term3525, term3525.getClass(), "maxX", 0.11577948268926874);
        setDoubleField(term3525, term3525.getClass(), "maxY", 0.5617009352394552);
        setField(term3523, term3523.getClass(), "tileMatrixSet", term3525);
        setField(term3523, term3523.getClass(), "tileMatrixSetName", "OEXDRUKcFl");
        setField(term3523, term3523.getClass(), "datatype", "RYdKCNNMBR");
        setDoubleField(term3523, term3523.getClass(), "scale", 1.0);
        setDoubleField(term3523, term3523.getClass(), "offset", 0.09067063848644474);
        setField(term3523, term3523.getClass(), "precision", term3569);
        setField(term3523, term3523.getClass(), "dataNull", term3571);
        setField(term3523, term3523.getClass(), "gridCellEncoding", "yGtHPyvYiQ");
        setField(term3523, term3523.getClass(), "uom", "MvRIxilFMJ");
        setField(term3523, term3523.getClass(), "fieldName", "iNwOJRBEjp");
        setField(term3523, term3523.getClass(), "quantityDefinition", "XylxrMBraH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataNull", argTypes, term3523, args);
    }

};


