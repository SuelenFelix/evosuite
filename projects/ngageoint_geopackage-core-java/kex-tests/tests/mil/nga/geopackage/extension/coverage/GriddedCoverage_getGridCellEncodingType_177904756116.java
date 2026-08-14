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

public class GriddedCoverage_getGridCellEncodingType_177904756116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3861;

    public GriddedCoverage_getGridCellEncodingType_177904756116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3907 = new Double(1.0);
        Double term3909 = new Double(0.5617009352394552);
        term3861 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        Object term3863 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setLongField(term3861, term3861.getClass(), "id", -5248475803419977214L);
        setField(term3863, term3863.getClass(), "contents", null);
        setField(term3863, term3863.getClass(), "tableName", "lHfTrWKMPk");
        setField(term3863, term3863.getClass(), "srs", null);
        setLongField(term3863, term3863.getClass(), "srsId", -6723783499250797216L);
        setDoubleField(term3863, term3863.getClass(), "minX", 0.07417792024383196);
        setDoubleField(term3863, term3863.getClass(), "minY", 0.686293604788188);
        setDoubleField(term3863, term3863.getClass(), "maxX", 0.12764449157430724);
        setDoubleField(term3863, term3863.getClass(), "maxY", 0.39446728256884744);
        setField(term3861, term3861.getClass(), "tileMatrixSet", term3863);
        setField(term3861, term3861.getClass(), "tileMatrixSetName", "JDaAnsVTGV");
        setField(term3861, term3861.getClass(), "datatype", "mLUZFTfjle");
        setDoubleField(term3861, term3861.getClass(), "scale", 1.0);
        setDoubleField(term3861, term3861.getClass(), "offset", 0.7865909711092062);
        setField(term3861, term3861.getClass(), "precision", term3907);
        setField(term3861, term3861.getClass(), "dataNull", term3909);
        setField(term3861, term3861.getClass(), "gridCellEncoding", "xIeFjkHkOe");
        setField(term3861, term3861.getClass(), "uom", "SdCKLMIYnX");
        setField(term3861, term3861.getClass(), "fieldName", "OJJtVNPyKZ");
        setField(term3861, term3861.getClass(), "quantityDefinition", "AKNapTAfmD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGridCellEncodingType", argTypes, term3861, args);
    }

};


