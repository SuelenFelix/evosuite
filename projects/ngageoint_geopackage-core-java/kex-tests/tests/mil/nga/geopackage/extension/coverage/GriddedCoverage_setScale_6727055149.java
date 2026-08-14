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

public class GriddedCoverage_setScale_6727055149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2677;
     Object term2775;

    public GriddedCoverage_setScale_6727055149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term2723 = new Double(1.0);
        Double term2725 = new Double(0.5187846213101265);
        term2677 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        Object term2679 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setLongField(term2677, term2677.getClass(), "id", -7738503207562305297L);
        setField(term2679, term2679.getClass(), "contents", null);
        setField(term2679, term2679.getClass(), "tableName", "oVgzLbrsFr");
        setField(term2679, term2679.getClass(), "srs", null);
        setLongField(term2679, term2679.getClass(), "srsId", 3825396310311739952L);
        setDoubleField(term2679, term2679.getClass(), "minX", 0.025133051616627267);
        setDoubleField(term2679, term2679.getClass(), "minY", 0.016575281023182953);
        setDoubleField(term2679, term2679.getClass(), "maxX", 0.5308350402051779);
        setDoubleField(term2679, term2679.getClass(), "maxY", 0.7154795600170818);
        setField(term2677, term2677.getClass(), "tileMatrixSet", term2679);
        setField(term2677, term2677.getClass(), "tileMatrixSetName", "vQVyKLdtaz");
        setField(term2677, term2677.getClass(), "datatype", "OWKQODBLzb");
        setDoubleField(term2677, term2677.getClass(), "scale", 1.0);
        setDoubleField(term2677, term2677.getClass(), "offset", 0.6355029654528058);
        setField(term2677, term2677.getClass(), "precision", term2723);
        setField(term2677, term2677.getClass(), "dataNull", term2725);
        setField(term2677, term2677.getClass(), "gridCellEncoding", "wGmYcqUkgE");
        setField(term2677, term2677.getClass(), "uom", "idgaQsnJpQ");
        setField(term2677, term2677.getClass(), "fieldName", "VgZnGoIFwQ");
        setField(term2677, term2677.getClass(), "quantityDefinition", "jUbSRrkrYZ");
        term2775 = new Double(0.0022646783892913414);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term2775;
        callMethod(klass, "setScale", argTypes, term2677, args);
    }

};


