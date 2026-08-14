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

public class GriddedCoverage_getTileMatrixSetName_19499653985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1616;

    public GriddedCoverage_getTileMatrixSetName_19499653985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1662 = new Double(1.0);
        Double term1664 = new Double(0.53094494792755);
        term1616 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        Object term1618 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setLongField(term1616, term1616.getClass(), "id", -4443169559037975007L);
        setField(term1618, term1618.getClass(), "contents", null);
        setField(term1618, term1618.getClass(), "tableName", "xLbjWUgOIL");
        setField(term1618, term1618.getClass(), "srs", null);
        setLongField(term1618, term1618.getClass(), "srsId", -3842548265506930260L);
        setDoubleField(term1618, term1618.getClass(), "minX", 0.2192450926212024);
        setDoubleField(term1618, term1618.getClass(), "minY", 0.7591353014991907);
        setDoubleField(term1618, term1618.getClass(), "maxX", 0.791695029600875);
        setDoubleField(term1618, term1618.getClass(), "maxY", 0.6862221294683138);
        setField(term1616, term1616.getClass(), "tileMatrixSet", term1618);
        setField(term1616, term1616.getClass(), "tileMatrixSetName", "jDtqGUpnZN");
        setField(term1616, term1616.getClass(), "datatype", "nGKItKLYNC");
        setDoubleField(term1616, term1616.getClass(), "scale", 1.0);
        setDoubleField(term1616, term1616.getClass(), "offset", 0.15917839663695388);
        setField(term1616, term1616.getClass(), "precision", term1662);
        setField(term1616, term1616.getClass(), "dataNull", term1664);
        setField(term1616, term1616.getClass(), "gridCellEncoding", "UiUYnPrcCi");
        setField(term1616, term1616.getClass(), "uom", "UoYtihxVaS");
        setField(term1616, term1616.getClass(), "fieldName", "JDswTTCZHV");
        setField(term1616, term1616.getClass(), "quantityDefinition", "onpbIeEKoi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileMatrixSetName", argTypes, term1616, args);
    }

};


