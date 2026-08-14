package mil.nga.geopackage.extension.nga.scale;

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
import static mil.nga.geopackage.extension.nga.scale.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class TileScaling_setTileMatrixSet_2918116585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1202;
     Object term1231;

    public TileScaling_setTileMatrixSet_2918116585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1227 = new Long(-7237588299778557629L);
        Long term1229 = new Long(6967924379644551255L);
        term1202 = newInstance(Class.forName("mil.nga.geopackage.extension.nga.scale.TileScaling"));
        setField(term1202, term1202.getClass(), "tableName", "jJCZpVmanW");
        setField(term1202, term1202.getClass(), "scalingType", "EGtDIRbSSb");
        setField(term1202, term1202.getClass(), "zoomIn", term1227);
        setField(term1202, term1202.getClass(), "zoomOut", term1229);
        term1231 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setField(term1231, term1231.getClass(), "contents", null);
        setField(term1231, term1231.getClass(), "tableName", "SzjVpOQTyS");
        setField(term1231, term1231.getClass(), "srs", null);
        setLongField(term1231, term1231.getClass(), "srsId", 6375119433582206027L);
        setDoubleField(term1231, term1231.getClass(), "minX", 0.28570734989730284);
        setDoubleField(term1231, term1231.getClass(), "minY", 0.40176586625454525);
        setDoubleField(term1231, term1231.getClass(), "maxX", 0.2641345529914265);
        setDoubleField(term1231, term1231.getClass(), "maxY", 0.36923381893433327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.scale.TileScaling");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet");
        Object[] args = new Object[1];
        args[0] = term1231;
        callMethod(klass, "setTileMatrixSet", argTypes, term1202, args);
    }

};


