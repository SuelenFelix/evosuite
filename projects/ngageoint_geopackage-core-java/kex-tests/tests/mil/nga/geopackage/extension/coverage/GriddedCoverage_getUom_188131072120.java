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

public class GriddedCoverage_getUom_188131072120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5019;

    public GriddedCoverage_getUom_188131072120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term5065 = new Double(1.0);
        Double term5067 = new Double(0.9006361024877096);
        term5019 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        Object term5021 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setLongField(term5019, term5019.getClass(), "id", 7862575738391801707L);
        setField(term5021, term5021.getClass(), "contents", null);
        setField(term5021, term5021.getClass(), "tableName", "XkIoWJRNwN");
        setField(term5021, term5021.getClass(), "srs", null);
        setLongField(term5021, term5021.getClass(), "srsId", 50358265865610362L);
        setDoubleField(term5021, term5021.getClass(), "minX", 0.34010089048558567);
        setDoubleField(term5021, term5021.getClass(), "minY", 0.19625398866403143);
        setDoubleField(term5021, term5021.getClass(), "maxX", 0.45069204793711093);
        setDoubleField(term5021, term5021.getClass(), "maxY", 0.9341364461850963);
        setField(term5019, term5019.getClass(), "tileMatrixSet", term5021);
        setField(term5019, term5019.getClass(), "tileMatrixSetName", "aNWLJdrZMq");
        setField(term5019, term5019.getClass(), "datatype", "HHmNoYxIGj");
        setDoubleField(term5019, term5019.getClass(), "scale", 1.0);
        setDoubleField(term5019, term5019.getClass(), "offset", 0.9022041121474429);
        setField(term5019, term5019.getClass(), "precision", term5065);
        setField(term5019, term5019.getClass(), "dataNull", term5067);
        setField(term5019, term5019.getClass(), "gridCellEncoding", "PtirvZmsGt");
        setField(term5019, term5019.getClass(), "uom", "HWkpTmtlrc");
        setField(term5019, term5019.getClass(), "fieldName", "hMmaoREuCK");
        setField(term5019, term5019.getClass(), "quantityDefinition", "VeDtgDzGAN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUom", argTypes, term5019, args);
    }

};


