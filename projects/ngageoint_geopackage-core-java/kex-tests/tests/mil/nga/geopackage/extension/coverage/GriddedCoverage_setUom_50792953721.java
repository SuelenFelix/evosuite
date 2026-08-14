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

public class GriddedCoverage_setUom_50792953721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5187;

    public GriddedCoverage_setUom_50792953721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term5233 = new Double(1.0);
        Double term5235 = new Double(0.5644914462415626);
        term5187 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage"));
        Object term5189 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setLongField(term5187, term5187.getClass(), "id", 5510783420697225605L);
        setField(term5189, term5189.getClass(), "contents", null);
        setField(term5189, term5189.getClass(), "tableName", "aWYOWZFyaX");
        setField(term5189, term5189.getClass(), "srs", null);
        setLongField(term5189, term5189.getClass(), "srsId", 6005241913654469005L);
        setDoubleField(term5189, term5189.getClass(), "minX", 0.6512870939318848);
        setDoubleField(term5189, term5189.getClass(), "minY", 0.8777038609128434);
        setDoubleField(term5189, term5189.getClass(), "maxX", 0.008025683154629148);
        setDoubleField(term5189, term5189.getClass(), "maxY", 0.40598298281353484);
        setField(term5187, term5187.getClass(), "tileMatrixSet", term5189);
        setField(term5187, term5187.getClass(), "tileMatrixSetName", "BRIVNtfUWU");
        setField(term5187, term5187.getClass(), "datatype", "DbiCVtPPCT");
        setDoubleField(term5187, term5187.getClass(), "scale", 1.0);
        setDoubleField(term5187, term5187.getClass(), "offset", 0.3710067290060264);
        setField(term5187, term5187.getClass(), "precision", term5233);
        setField(term5187, term5187.getClass(), "dataNull", term5235);
        setField(term5187, term5187.getClass(), "gridCellEncoding", "WzFopsaDuG");
        setField(term5187, term5187.getClass(), "uom", "PapWxkhEWe");
        setField(term5187, term5187.getClass(), "fieldName", "smnHEqRFRx");
        setField(term5187, term5187.getClass(), "quantityDefinition", "XYtryyobou");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.GriddedCoverage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "OYbzXylRWW";
        callMethod(klass, "setUom", argTypes, term5187, args);
    }

};


