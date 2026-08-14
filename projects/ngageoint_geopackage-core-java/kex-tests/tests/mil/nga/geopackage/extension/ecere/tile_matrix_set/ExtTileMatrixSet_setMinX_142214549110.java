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
import java.lang.Double;
import java.lang.Long;

public class ExtTileMatrixSet_setMinX_142214549110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5958;
     Object term6006;

    public ExtTileMatrixSet_setMinX_142214549110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term5996 = new Double(0.6375926466054153);
        Double term5998 = new Double(0.6933516214415875);
        Double term6000 = new Double(0.7039847711405768);
        Double term6002 = new Double(0.7157998497507287);
        Long term6004 = new Long(-5786861555969446503L);
        term5958 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term5958, term5958.getClass(), "id", -2083524977884307536L);
        setField(term5958, term5958.getClass(), "tms", "iljANwuEjk");
        setField(term5958, term5958.getClass(), "description", "kNqaJKIATy");
        setField(term5958, term5958.getClass(), "uri", "vKQukfbJUd");
        setField(term5958, term5958.getClass(), "minX", term5996);
        setField(term5958, term5958.getClass(), "minY", term5998);
        setField(term5958, term5958.getClass(), "maxX", term6000);
        setField(term5958, term5958.getClass(), "maxY", term6002);
        setField(term5958, term5958.getClass(), "srs", null);
        setField(term5958, term5958.getClass(), "srsId", term6004);
        term6006 = new Double(0.8399796378537906);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term6006;
        callMethod(klass, "setMinX", argTypes, term5958, args);
    }

};


