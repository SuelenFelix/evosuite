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

public class GriddedCoverage_setOffset_131644984711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3015;
     Object term3113;

    public GriddedCoverage_setOffset_131644984711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3061 = new Double(1.0);
        Double term3063 = new Double(0.3626177854778667);
        term3015 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        Object term3017 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setLongField(term3015, term3015.getClass(), "id", 5953383087795962419L);
        setField(term3017, term3017.getClass(), "contents", null);
        setField(term3017, term3017.getClass(), "tableName", "swZVeJAxjt");
        setField(term3017, term3017.getClass(), "srs", null);
        setLongField(term3017, term3017.getClass(), "srsId", 7994303628307559416L);
        setDoubleField(term3017, term3017.getClass(), "minX", 0.426231085465289);
        setDoubleField(term3017, term3017.getClass(), "minY", 0.0027299293098262956);
        setDoubleField(term3017, term3017.getClass(), "maxX", 0.29874017652881824);
        setDoubleField(term3017, term3017.getClass(), "maxY", 0.32554480512985284);
        setField(term3015, term3015.getClass(), "tileMatrixSet", term3017);
        setField(term3015, term3015.getClass(), "tileMatrixSetName", "xOcJIiQQDu");
        setField(term3015, term3015.getClass(), "datatype", "GVizqqzXpy");
        setDoubleField(term3015, term3015.getClass(), "scale", 1.0);
        setDoubleField(term3015, term3015.getClass(), "offset", 0.8924855581421237);
        setField(term3015, term3015.getClass(), "precision", term3061);
        setField(term3015, term3015.getClass(), "dataNull", term3063);
        setField(term3015, term3015.getClass(), "gridCellEncoding", "JqXGgAhZPl");
        setField(term3015, term3015.getClass(), "uom", "jiKYgYHqIS");
        setField(term3015, term3015.getClass(), "fieldName", "DfISiziTgG");
        setField(term3015, term3015.getClass(), "quantityDefinition", "XqgfKFvPSD");
        term3113 = new Double(0.32237559209193944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term3113;
        callMethod(klass, "setOffset", argTypes, term3015, args);
    }

};


