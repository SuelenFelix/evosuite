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

public class TileDaoUtils_getMapMaxZoom_32800492219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4482;
     Object term4500;

    public TileDaoUtils_getMapMaxZoom_32800492219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4482 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setField(term4482, term4482.getClass(), "contents", null);
        setField(term4482, term4482.getClass(), "tableName", "NHbOFFjyVK");
        setField(term4482, term4482.getClass(), "srs", null);
        setLongField(term4482, term4482.getClass(), "srsId", 3238645206498300107L);
        setDoubleField(term4482, term4482.getClass(), "minX", 0.3741779691002205);
        setDoubleField(term4482, term4482.getClass(), "minY", 0.5652495059647745);
        setDoubleField(term4482, term4482.getClass(), "maxX", 0.021410850431387685);
        setDoubleField(term4482, term4482.getClass(), "maxY", 0.8397628091272534);
        term4500 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileDaoUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = term4482;
        args[1] = term4500;
        callMethod(klass, "getMapMaxZoom", argTypes, null, args);
    }

};


