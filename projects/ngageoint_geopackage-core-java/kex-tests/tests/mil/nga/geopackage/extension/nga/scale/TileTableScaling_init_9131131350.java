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

public class TileTableScaling_init_9131131350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2287;

    public TileTableScaling_init_9131131350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2287 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet"));
        setField(term2287, term2287.getClass(), "contents", null);
        setField(term2287, term2287.getClass(), "tableName", "SbAoxhfrkn");
        setField(term2287, term2287.getClass(), "srs", null);
        setLongField(term2287, term2287.getClass(), "srsId", -8257434502486459194L);
        setDoubleField(term2287, term2287.getClass(), "minX", 0.6076495596892013);
        setDoubleField(term2287, term2287.getClass(), "minY", 0.37773193782763337);
        setDoubleField(term2287, term2287.getClass(), "maxX", 0.8474802076607362);
        setDoubleField(term2287, term2287.getClass(), "maxY", 0.5183269973490326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.scale.TileTableScaling");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("mil.nga.geopackage.GeoPackageCore");
        argTypes[1] = Class.forName("mil.nga.geopackage.tiles.matrixset.TileMatrixSet");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2287;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


