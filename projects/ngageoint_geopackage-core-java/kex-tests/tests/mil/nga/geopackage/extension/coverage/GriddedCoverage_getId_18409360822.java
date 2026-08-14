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

public class GriddedCoverage_getId_18409360822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1084;

    public GriddedCoverage_getId_18409360822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1130 = new Double(1.0);
        Double term1132 = new Double(0.32554480512985284);
        term1084 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        Object term1086 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setLongField(term1084, term1084.getClass(), "id", -2068172595987555756L);
        setField(term1086, term1086.getClass(), "contents", null);
        setField(term1086, term1086.getClass(), "tableName", "flxyYxBRtu");
        setField(term1086, term1086.getClass(), "srs", null);
        setLongField(term1086, term1086.getClass(), "srsId", -6292278961887936280L);
        setDoubleField(term1086, term1086.getClass(), "minX", 0.10667076642995188);
        setDoubleField(term1086, term1086.getClass(), "minY", 0.11493000848982304);
        setDoubleField(term1086, term1086.getClass(), "maxX", 0.37161417339133307);
        setDoubleField(term1086, term1086.getClass(), "maxY", 0.6805867182029153);
        setField(term1084, term1084.getClass(), "tileMatrixSet", term1086);
        setField(term1084, term1084.getClass(), "tileMatrixSetName", "OclPbYPkcH");
        setField(term1084, term1084.getClass(), "datatype", "IoAlmYsBwc");
        setDoubleField(term1084, term1084.getClass(), "scale", 1.0);
        setDoubleField(term1084, term1084.getClass(), "offset", 0.2852810965221698);
        setField(term1084, term1084.getClass(), "precision", term1130);
        setField(term1084, term1084.getClass(), "dataNull", term1132);
        setField(term1084, term1084.getClass(), "gridCellEncoding", "TEParAifyi");
        setField(term1084, term1084.getClass(), "uom", "OWDIEULEFu");
        setField(term1084, term1084.getClass(), "fieldName", "dWRymuLBtr");
        setField(term1084, term1084.getClass(), "quantityDefinition", "AijpHYOFuy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1084, args);
    }

};


