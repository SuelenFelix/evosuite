package mil.nga.geopackage.tiles.user;

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
import static mil.nga.geopackage.tiles.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;

public class TileDaoUtils_getMapZoomRange_68686199117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4338;
     Object term4356;

    public TileDaoUtils_getMapZoomRange_68686199117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4338 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setField(term4338, term4338.getClass(), "contents", null);
        setField(term4338, term4338.getClass(), "tableName", "onQLVONGuf");
        setField(term4338, term4338.getClass(), "srs", null);
        setLongField(term4338, term4338.getClass(), "srsId", -1000830646340880796L);
        setDoubleField(term4338, term4338.getClass(), "minX", 0.2889811903417371);
        setDoubleField(term4338, term4338.getClass(), "minY", 0.7856101337088763);
        setDoubleField(term4338, term4338.getClass(), "maxX", 0.1782857269567425);
        setDoubleField(term4338, term4338.getClass(), "maxY", 0.17829386444171214);
        term4356 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileDaoUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term4338;
        args[1] = term4356;
        callMethod(klass, "getMapZoomRange", argTypes, null, args);
    }

};


