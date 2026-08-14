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

public class ExtTileMatrixSet_setDescription_7975768276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5602;

    public ExtTileMatrixSet_setDescription_7975768276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term5640 = new Double(0.9952003100858836);
        Double term5642 = new Double(0.22059525284415726);
        Double term5644 = new Double(0.281059649526194);
        Double term5646 = new Double(0.049786419821445604);
        Long term5648 = new Long(-1832940336320585644L);
        term5602 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term5602, term5602.getClass(), "id", 1353683663053784647L);
        setField(term5602, term5602.getClass(), "tms", "vwbEQQNQrx");
        setField(term5602, term5602.getClass(), "description", "xtftXXMbem");
        setField(term5602, term5602.getClass(), "uri", "cudZvLMQon");
        setField(term5602, term5602.getClass(), "minX", term5640);
        setField(term5602, term5602.getClass(), "minY", term5642);
        setField(term5602, term5602.getClass(), "maxX", term5644);
        setField(term5602, term5602.getClass(), "maxY", term5646);
        setField(term5602, term5602.getClass(), "srs", null);
        setField(term5602, term5602.getClass(), "srsId", term5648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lihXWlGDxk";
        callMethod(klass, "setDescription", argTypes, term5602, args);
    }

};


