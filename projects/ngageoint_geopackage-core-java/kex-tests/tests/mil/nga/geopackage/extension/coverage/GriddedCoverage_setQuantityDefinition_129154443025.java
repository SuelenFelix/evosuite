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

public class GriddedCoverage_setQuantityDefinition_129154443025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5903;

    public GriddedCoverage_setQuantityDefinition_129154443025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term5949 = new Double(1.0);
        Double term5951 = new Double(0.12764449157430724);
        term5903 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        Object term5905 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setLongField(term5903, term5903.getClass(), "id", -8876856890348836498L);
        setField(term5905, term5905.getClass(), "contents", null);
        setField(term5905, term5905.getClass(), "tableName", "sZdUNdggUW");
        setField(term5905, term5905.getClass(), "srs", null);
        setLongField(term5905, term5905.getClass(), "srsId", 846579494941632714L);
        setDoubleField(term5905, term5905.getClass(), "minX", 0.29172553321356776);
        setDoubleField(term5905, term5905.getClass(), "minY", 0.9276995636844321);
        setDoubleField(term5905, term5905.getClass(), "maxX", 0.7636130748477434);
        setDoubleField(term5905, term5905.getClass(), "maxY", 0.07901636960861558);
        setField(term5903, term5903.getClass(), "tileMatrixSet", term5905);
        setField(term5903, term5903.getClass(), "tileMatrixSetName", "OqbwYQfvAe");
        setField(term5903, term5903.getClass(), "datatype", "tRxZafjqIx");
        setDoubleField(term5903, term5903.getClass(), "scale", 1.0);
        setDoubleField(term5903, term5903.getClass(), "offset", 0.18717846301066243);
        setField(term5903, term5903.getClass(), "precision", term5949);
        setField(term5903, term5903.getClass(), "dataNull", term5951);
        setField(term5903, term5903.getClass(), "gridCellEncoding", "DhjNLmRMCu");
        setField(term5903, term5903.getClass(), "uom", "PgPzMSEjjX");
        setField(term5903, term5903.getClass(), "fieldName", "wzsPSPcRdj");
        setField(term5903, term5903.getClass(), "quantityDefinition", "kGMQdqJYyB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XJJNClzHRf";
        callMethod(klass, "setQuantityDefinition", argTypes, term5903, args);
    }

};


