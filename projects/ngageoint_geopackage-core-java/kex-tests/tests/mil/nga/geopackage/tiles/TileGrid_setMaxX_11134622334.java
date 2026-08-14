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
import java.lang.Long;

public class TileGrid_setMaxX_11134622334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6123;
     Object term6128;

    public TileGrid_setMaxX_11134622334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6123 = newInstance(Class.forName("mil.nga.geopackage.tiles.TileGrid"));
        setLongField(term6123, term6123.getClass(), "minX", -6490254947459640565L);
        setLongField(term6123, term6123.getClass(), "maxX", -7001094993638840490L);
        setLongField(term6123, term6123.getClass(), "minY", 3077284143733577490L);
        setLongField(term6123, term6123.getClass(), "maxY", 4458302820344896046L);
        term6128 = new Long(-432424084523104253L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.TileGrid");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6128;
        callMethod(klass, "setMaxX", argTypes, term6123, args);
    }

};


