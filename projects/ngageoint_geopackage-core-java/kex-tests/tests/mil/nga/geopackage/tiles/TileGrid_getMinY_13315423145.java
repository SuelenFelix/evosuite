package mil.nga.geopackage.tiles;

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
import static mil.nga.geopackage.tiles.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TileGrid_getMinY_13315423145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6130;

    public TileGrid_getMinY_13315423145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6130 = newInstance(Class.forName("mil.nga.geopackage.tiles.TileGrid"));
        setLongField(term6130, term6130.getClass(), "minX", 6150186973473930616L);
        setLongField(term6130, term6130.getClass(), "maxX", -3850323135468805420L);
        setLongField(term6130, term6130.getClass(), "minY", -5207216109884759743L);
        setLongField(term6130, term6130.getClass(), "maxY", 8765880103547975810L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.TileGrid");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinY", argTypes, term6130, args);
    }

};


