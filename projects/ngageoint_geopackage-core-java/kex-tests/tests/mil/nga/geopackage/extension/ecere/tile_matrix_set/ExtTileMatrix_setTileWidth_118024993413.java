package mil.nga.geopackage.extension.ecere.tile_matrix_set;

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
import static mil.nga.geopackage.extension.ecere.tile_matrix_set.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;
import java.lang.Long;

public class ExtTileMatrix_setTileWidth_118024993413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3656;
     Object term3719;

    public ExtTileMatrix_setTileWidth_118024993413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3696 = new Double(0.25025774487844066);
        Double term3698 = new Double(0.1858089882752998);
        Double term3700 = new Double(0.2440697646709713);
        Double term3702 = new Double(0.7977455176064363);
        Long term3704 = new Long(-5248475803419977214L);
        Long term3706 = new Long(-6723783499250797216L);
        Double term3717 = new Double(0.5329919447422633);
        term3656 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term3658 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term3656, term3656.getClass(), "id", -2951854704066477061L);
        setLongField(term3658, term3658.getClass(), "id", 174253963298276221L);
        setField(term3658, term3658.getClass(), "tms", "pORebkoRdD");
        setField(term3658, term3658.getClass(), "description", "mXGCWJDOqA");
        setField(term3658, term3658.getClass(), "uri", "dpNsDgfPso");
        setField(term3658, term3658.getClass(), "minX", term3696);
        setField(term3658, term3658.getClass(), "minY", term3698);
        setField(term3658, term3658.getClass(), "maxX", term3700);
        setField(term3658, term3658.getClass(), "maxY", term3702);
        setField(term3658, term3658.getClass(), "srs", null);
        setField(term3658, term3658.getClass(), "srsId", term3704);
        setField(term3656, term3656.getClass(), "tms", term3658);
        setField(term3656, term3656.getClass(), "tmsId", term3706);
        setLongField(term3656, term3656.getClass(), "zoomLevel", 3713624957161771816L);
        setLongField(term3656, term3656.getClass(), "matrixWidth", 6130232388739280211L);
        setLongField(term3656, term3656.getClass(), "matrixHeight", 3423965054378869855L);
        setLongField(term3656, term3656.getClass(), "tileWidth", -593735869267672817L);
        setLongField(term3656, term3656.getClass(), "tileHeight", 6041374912351843923L);
        setDoubleField(term3656, term3656.getClass(), "pixelXSize", 0.7171972879282721);
        setDoubleField(term3656, term3656.getClass(), "pixelYSize", 0.9006361024877096);
        setDoubleField(term3656, term3656.getClass(), "top", 0.5644914462415626);
        setDoubleField(term3656, term3656.getClass(), "left", 0.509895859167191);
        setField(term3656, term3656.getClass(), "scaleDenominator", term3717);
        term3719 = new Long(2535970782317488741L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term3719;
        callMethod(klass, "setTileWidth", argTypes, term3656, args);
    }

};


