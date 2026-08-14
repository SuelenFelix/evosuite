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

public class GriddedCoverage_setGridCellEncoding_203363524319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4829;

    public GriddedCoverage_setGridCellEncoding_203363524319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term4875 = new Double(1.0);
        Double term4877 = new Double(0.7171972879282721);
        term4829 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        Object term4831 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setLongField(term4829, term4829.getClass(), "id", -5963439350418910964L);
        setField(term4831, term4831.getClass(), "contents", null);
        setField(term4831, term4831.getClass(), "tableName", "UfQtPRyWRC");
        setField(term4831, term4831.getClass(), "srs", null);
        setLongField(term4831, term4831.getClass(), "srsId", 9013624480170062917L);
        setDoubleField(term4831, term4831.getClass(), "minX", 0.6059734092898602);
        setDoubleField(term4831, term4831.getClass(), "minY", 0.3074693824288357);
        setDoubleField(term4831, term4831.getClass(), "maxX", 0.1245258965512791);
        setDoubleField(term4831, term4831.getClass(), "maxY", 0.9511861072660375);
        setField(term4829, term4829.getClass(), "tileMatrixSet", term4831);
        setField(term4829, term4829.getClass(), "tileMatrixSetName", "FPvxVzzSvD");
        setField(term4829, term4829.getClass(), "datatype", "WHcwFgsGFC");
        setDoubleField(term4829, term4829.getClass(), "scale", 1.0);
        setDoubleField(term4829, term4829.getClass(), "offset", 0.05880719443135807);
        setField(term4829, term4829.getClass(), "precision", term4875);
        setField(term4829, term4829.getClass(), "dataNull", term4877);
        setField(term4829, term4829.getClass(), "gridCellEncoding", "HzqpegHiRq");
        setField(term4829, term4829.getClass(), "uom", "jwsfVjMoJT");
        setField(term4829, term4829.getClass(), "fieldName", "ZfdXfCCFDf");
        setField(term4829, term4829.getClass(), "quantityDefinition", "MwwjNtdOFT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VYkqXKVlAJ";
        callMethod(klass, "setGridCellEncoding", argTypes, term4829, args);
    }

};


