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

public class ExtTileMatrixSet_setMaxY_141505619416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6432;
     Object term6480;

    public ExtTileMatrixSet_setMaxY_141505619416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term6470 = new Double(0.5820770579753712);
        Double term6472 = new Double(0.8935041663395363);
        Double term6474 = new Double(0.2542403704113868);
        Double term6476 = new Double(0.4614378239284842);
        Long term6478 = new Long(-685023850445639859L);
        term6432 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term6432, term6432.getClass(), "id", 6853972830905120647L);
        setField(term6432, term6432.getClass(), "tms", "vGiuZVPJNH");
        setField(term6432, term6432.getClass(), "description", "tlzpzIjMib");
        setField(term6432, term6432.getClass(), "uri", "AZdLeSugwv");
        setField(term6432, term6432.getClass(), "minX", term6470);
        setField(term6432, term6432.getClass(), "minY", term6472);
        setField(term6432, term6432.getClass(), "maxX", term6474);
        setField(term6432, term6432.getClass(), "maxY", term6476);
        setField(term6432, term6432.getClass(), "srs", null);
        setField(term6432, term6432.getClass(), "srsId", term6478);
        term6480 = new Double(0.10963898027157926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term6480;
        callMethod(klass, "setMaxY", argTypes, term6432, args);
    }

};


