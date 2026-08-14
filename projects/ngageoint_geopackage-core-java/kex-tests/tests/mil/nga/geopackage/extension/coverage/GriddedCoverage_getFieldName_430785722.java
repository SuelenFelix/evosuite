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

public class GriddedCoverage_getFieldName_430785722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5377;

    public GriddedCoverage_getFieldName_430785722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term5423 = new Double(1.0);
        Double term5425 = new Double(0.509895859167191);
        term5377 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        Object term5379 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setLongField(term5377, term5377.getClass(), "id", -1983291584002806658L);
        setField(term5379, term5379.getClass(), "contents", null);
        setField(term5379, term5379.getClass(), "tableName", "DSNsTGYXDF");
        setField(term5379, term5379.getClass(), "srs", null);
        setLongField(term5379, term5379.getClass(), "srsId", 5946780097489996391L);
        setDoubleField(term5379, term5379.getClass(), "minX", 0.7818620200430967);
        setDoubleField(term5379, term5379.getClass(), "minY", 0.04640022995603543);
        setDoubleField(term5379, term5379.getClass(), "maxX", 0.9123572866833729);
        setDoubleField(term5379, term5379.getClass(), "maxY", 0.40635376375558196);
        setField(term5377, term5377.getClass(), "tileMatrixSet", term5379);
        setField(term5377, term5377.getClass(), "tileMatrixSetName", "sQvGcVjdEx");
        setField(term5377, term5377.getClass(), "datatype", "rLHAoqXgPh");
        setDoubleField(term5377, term5377.getClass(), "scale", 1.0);
        setDoubleField(term5377, term5377.getClass(), "offset", 0.4772043271031934);
        setField(term5377, term5377.getClass(), "precision", term5423);
        setField(term5377, term5377.getClass(), "dataNull", term5425);
        setField(term5377, term5377.getClass(), "gridCellEncoding", "zUlRdimJtU");
        setField(term5377, term5377.getClass(), "uom", "vwbEQQNQrx");
        setField(term5377, term5377.getClass(), "fieldName", "xtftXXMbem");
        setField(term5377, term5377.getClass(), "quantityDefinition", "cudZvLMQon");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFieldName", argTypes, term5377, args);
    }

};


