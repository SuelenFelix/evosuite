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

public class CoverageDataResults_getTileMatrix_4936957742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9882;

    public CoverageDataResults_getTileMatrix_4936957742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term9885 = new Double(0.45069204793711093);
        Double term9887 = new Double(0.9341364461850963);
        Double term9889 = new Double(0.9022041121474429);
        Double term9891 = new Double(0.6512870939318848);
        Double term9893 = new Double(0.8777038609128434);
        Double term9895 = new Double(0.008025683154629148);
        term9882 = newInstance(Class.forName("mil.nga.geopackage.extension.coverage.CoverageDataResults"));
        Object[] term9883 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Double"), 0).getClass(), 1);
        Object[] term9884 = (Object[]) newArray("java.lang.Double", 6);
        Object term9897 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setElement(term9884, 0, term9885);
        setElement(term9884, 1, term9887);
        setElement(term9884, 2, term9889);
        setElement(term9884, 3, term9891);
        setElement(term9884, 4, term9893);
        setElement(term9884, 5, term9895);
        setElement(term9883, 0, term9884);
        setField(term9882, term9882.getClass(), "values", term9883);
        setField(term9897, term9897.getClass(), "contents", null);
        setField(term9897, term9897.getClass(), "tableName", "AZdLeSugwv");
        setLongField(term9897, term9897.getClass(), "zoomLevel", -5216789073301458893L);
        setLongField(term9897, term9897.getClass(), "matrixWidth", -1832940336320585644L);
        setLongField(term9897, term9897.getClass(), "matrixHeight", -8033714905181142681L);
        setLongField(term9897, term9897.getClass(), "tileWidth", -9040825890007374809L);
        setLongField(term9897, term9897.getClass(), "tileHeight", 1368340889161782793L);
        setDoubleField(term9897, term9897.getClass(), "pixelXSize", 0.9165240441138934);
        setDoubleField(term9897, term9897.getClass(), "pixelYSize", 0.22227423914231126);
        setField(term9882, term9882.getClass(), "tileMatrix", term9897);
        setIntField(term9882, term9882.getClass(), "height", -2068769794);
        setIntField(term9882, term9882.getClass(), "width", -117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.CoverageDataResults");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileMatrix", argTypes, term9882, args);
    }

};


