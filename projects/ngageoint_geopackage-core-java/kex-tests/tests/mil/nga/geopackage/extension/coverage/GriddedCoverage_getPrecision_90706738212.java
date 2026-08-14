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

public class GriddedCoverage_getPrecision_90706738212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3185;

    public GriddedCoverage_getPrecision_90706738212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3231 = new Double(1.0);
        Double term3233 = new Double(0.3163771663728089);
        term3185 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        Object term3187 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setLongField(term3185, term3185.getClass(), "id", 2443640364875054177L);
        setField(term3187, term3187.getClass(), "contents", null);
        setField(term3187, term3187.getClass(), "tableName", "JiVRgTZvKc");
        setField(term3187, term3187.getClass(), "srs", null);
        setLongField(term3187, term3187.getClass(), "srsId", -1610676979013636850L);
        setDoubleField(term3187, term3187.getClass(), "minX", 0.53094494792755);
        setDoubleField(term3187, term3187.getClass(), "minY", 0.146431486357265);
        setDoubleField(term3187, term3187.getClass(), "maxX", 0.24259014218848696);
        setDoubleField(term3187, term3187.getClass(), "maxY", 0.1544348383112728);
        setField(term3185, term3185.getClass(), "tileMatrixSet", term3187);
        setField(term3185, term3185.getClass(), "tileMatrixSetName", "XPKmummaqg");
        setField(term3185, term3185.getClass(), "datatype", "BKLfkLiZTH");
        setDoubleField(term3185, term3185.getClass(), "scale", 1.0);
        setDoubleField(term3185, term3185.getClass(), "offset", 0.5187846213101265);
        setField(term3185, term3185.getClass(), "precision", term3231);
        setField(term3185, term3185.getClass(), "dataNull", term3233);
        setField(term3185, term3185.getClass(), "gridCellEncoding", "SPpkrGcPRr");
        setField(term3185, term3185.getClass(), "uom", "sEccwbJKYE");
        setField(term3185, term3185.getClass(), "fieldName", "AWRooQKkdW");
        setField(term3185, term3185.getClass(), "quantityDefinition", "vjxIhXHxGR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrecision", argTypes, term3185, args);
    }

};


