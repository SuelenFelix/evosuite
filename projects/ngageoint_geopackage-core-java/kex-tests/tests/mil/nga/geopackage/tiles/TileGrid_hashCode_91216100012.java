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

public class TileGrid_hashCode_91216100012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6169;

    public TileGrid_hashCode_91216100012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6169 = newInstance(Class.forName("mil.nga.geopackage.tiles.TileGrid"));
        setLongField(term6169, term6169.getClass(), "minX", -8303973304709662279L);
        setLongField(term6169, term6169.getClass(), "maxX", 6853972830905120647L);
        setLongField(term6169, term6169.getClass(), "minY", 1442167273909860961L);
        setLongField(term6169, term6169.getClass(), "maxY", 6895382576300001141L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.TileGrid");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term6169, args);
    }

};


