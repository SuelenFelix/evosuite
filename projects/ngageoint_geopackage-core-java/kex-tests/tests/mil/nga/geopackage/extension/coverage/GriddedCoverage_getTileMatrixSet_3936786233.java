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

public class GriddedCoverage_getTileMatrixSet_3936786233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1252;

    public GriddedCoverage_getTileMatrixSet_3936786233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1298 = new Double(1.0);
        Double term1300 = new Double(0.8924855581421237);
        term1252 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        Object term1254 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setLongField(term1252, term1252.getClass(), "id", -6645965768855543712L);
        setField(term1254, term1254.getClass(), "contents", null);
        setField(term1254, term1254.getClass(), "tableName", "SbAoxhfrkn");
        setField(term1254, term1254.getClass(), "srs", null);
        setLongField(term1254, term1254.getClass(), "srsId", 4784595517102746672L);
        setDoubleField(term1254, term1254.getClass(), "minX", 0.6300849762307866);
        setDoubleField(term1254, term1254.getClass(), "minY", 0.9737083944266686);
        setDoubleField(term1254, term1254.getClass(), "maxX", 0.0668892744806211);
        setDoubleField(term1254, term1254.getClass(), "maxY", 0.3587267442738795);
        setField(term1252, term1252.getClass(), "tileMatrixSet", term1254);
        setField(term1252, term1252.getClass(), "tileMatrixSetName", "kuTXqwMtDB");
        setField(term1252, term1252.getClass(), "datatype", "Ghbwtircqb");
        setDoubleField(term1252, term1252.getClass(), "scale", 1.0);
        setDoubleField(term1252, term1252.getClass(), "offset", 0.07802449704920456);
        setField(term1252, term1252.getClass(), "precision", term1298);
        setField(term1252, term1252.getClass(), "dataNull", term1300);
        setField(term1252, term1252.getClass(), "gridCellEncoding", "xrwlQZdwCp");
        setField(term1252, term1252.getClass(), "uom", "IDCWpPLRkE");
        setField(term1252, term1252.getClass(), "fieldName", "nyiiPDVjAc");
        setField(term1252, term1252.getClass(), "quantityDefinition", "aKnKipADSo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileMatrixSet", argTypes, term1252, args);
    }

};


