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

public class TileGrid_setMaxY_11134631948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6147;
     Object term6152;

    public TileGrid_setMaxY_11134631948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6147 = newInstance(Class.forName("mil.nga.geopackage.tiles.TileGrid"));
        setLongField(term6147, term6147.getClass(), "minX", -629491722907628764L);
        setLongField(term6147, term6147.getClass(), "maxX", -5552123402871285352L);
        setLongField(term6147, term6147.getClass(), "minY", -5587528177305224828L);
        setLongField(term6147, term6147.getClass(), "maxY", 7950532649535587877L);
        term6152 = new Long(7799452759993694308L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.TileGrid");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term6152;
        callMethod(klass, "setMaxY", argTypes, term6147, args);
    }

};


