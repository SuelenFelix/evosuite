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

public class ExtTileMatrixSet_setMaxX_141505523314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6274;
     Object term6322;

    public ExtTileMatrixSet_setMaxX_141505523314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term6312 = new Double(0.6213122016266206);
        Double term6314 = new Double(0.540850203722707);
        Double term6316 = new Double(6.134294677928587E-4);
        Double term6318 = new Double(0.41934015614685227);
        Long term6320 = new Long(1215116475929634177L);
        term6274 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term6274, term6274.getClass(), "id", 8073378116544724166L);
        setField(term6274, term6274.getClass(), "tms", "HDaezxQfQR");
        setField(term6274, term6274.getClass(), "description", "iikZEapDlu");
        setField(term6274, term6274.getClass(), "uri", "nhoHrZfnIN");
        setField(term6274, term6274.getClass(), "minX", term6312);
        setField(term6274, term6274.getClass(), "minY", term6314);
        setField(term6274, term6274.getClass(), "maxX", term6316);
        setField(term6274, term6274.getClass(), "maxY", term6318);
        setField(term6274, term6274.getClass(), "srs", null);
        setField(term6274, term6274.getClass(), "srsId", term6320);
        term6322 = new Double(0.07298304401683597);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term6322;
        callMethod(klass, "setMaxX", argTypes, term6274, args);
    }

};


