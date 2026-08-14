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

public class GriddedCoverage_getOffset_176952384910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2847;

    public GriddedCoverage_getOffset_176952384910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term2893 = new Double(1.0);
        Double term2895 = new Double(0.045893173090043815);
        term2847 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        Object term2849 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setLongField(term2847, term2847.getClass(), "id", -3838084482494604218L);
        setField(term2849, term2849.getClass(), "contents", null);
        setField(term2849, term2849.getClass(), "tableName", "bWWfajKbEX");
        setField(term2849, term2849.getClass(), "srs", null);
        setLongField(term2849, term2849.getClass(), "srsId", 3892018155439224435L);
        setDoubleField(term2849, term2849.getClass(), "minX", 0.36226058076369927);
        setDoubleField(term2849, term2849.getClass(), "minY", 0.03699061125289671);
        setDoubleField(term2849, term2849.getClass(), "maxX", 0.6047137830113202);
        setDoubleField(term2849, term2849.getClass(), "maxY", 0.6767213143579776);
        setField(term2847, term2847.getClass(), "tileMatrixSet", term2849);
        setField(term2847, term2847.getClass(), "tileMatrixSetName", "cAPeiZHKGJ");
        setField(term2847, term2847.getClass(), "datatype", "LvJFtLBaxj");
        setDoubleField(term2847, term2847.getClass(), "scale", 1.0);
        setDoubleField(term2847, term2847.getClass(), "offset", 0.48862955528902696);
        setField(term2847, term2847.getClass(), "precision", term2893);
        setField(term2847, term2847.getClass(), "dataNull", term2895);
        setField(term2847, term2847.getClass(), "gridCellEncoding", "PHvxnGHptP");
        setField(term2847, term2847.getClass(), "uom", "TimdotUuNC");
        setField(term2847, term2847.getClass(), "fieldName", "PkWMRdJcBb");
        setField(term2847, term2847.getClass(), "quantityDefinition", "jSpAteRute");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOffset", argTypes, term2847, args);
    }

};


