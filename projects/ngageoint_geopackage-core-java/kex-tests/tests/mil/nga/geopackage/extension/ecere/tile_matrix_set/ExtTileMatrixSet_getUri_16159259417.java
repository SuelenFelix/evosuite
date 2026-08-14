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

public class ExtTileMatrixSet_getUri_16159259417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5702;

    public ExtTileMatrixSet_getUri_16159259417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term5740 = new Double(0.8814078959581401);
        Double term5742 = new Double(0.47210750955444725);
        Double term5744 = new Double(0.8381176594884352);
        Double term5746 = new Double(0.23070800524236523);
        Long term5748 = new Long(-8033714905181142681L);
        term5702 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term5702, term5702.getClass(), "id", -1465819833800717311L);
        setField(term5702, term5702.getClass(), "tms", "JmcmxoGhIK");
        setField(term5702, term5702.getClass(), "description", "jXzmYyrnnT");
        setField(term5702, term5702.getClass(), "uri", "igCAtimmYB");
        setField(term5702, term5702.getClass(), "minX", term5740);
        setField(term5702, term5702.getClass(), "minY", term5742);
        setField(term5702, term5702.getClass(), "maxX", term5744);
        setField(term5702, term5702.getClass(), "maxY", term5746);
        setField(term5702, term5702.getClass(), "srs", null);
        setField(term5702, term5702.getClass(), "srsId", term5748);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUri", argTypes, term5702, args);
    }

};


