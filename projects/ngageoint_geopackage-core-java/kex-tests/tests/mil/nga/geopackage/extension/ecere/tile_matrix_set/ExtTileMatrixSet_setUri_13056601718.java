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

public class ExtTileMatrixSet_setUri_13056601718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5780;

    public ExtTileMatrixSet_setUri_13056601718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term5818 = new Double(0.4337266793917268);
        Double term5820 = new Double(0.11979392765421404);
        Double term5822 = new Double(0.4555542221910589);
        Double term5824 = new Double(0.9938727080758785);
        Long term5826 = new Long(-9040825890007374809L);
        term5780 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term5780, term5780.getClass(), "id", -8306611953768020559L);
        setField(term5780, term5780.getClass(), "tms", "DyiXbeYIaN");
        setField(term5780, term5780.getClass(), "description", "VGizxZnyHX");
        setField(term5780, term5780.getClass(), "uri", "kVEZMHmRtR");
        setField(term5780, term5780.getClass(), "minX", term5818);
        setField(term5780, term5780.getClass(), "minY", term5820);
        setField(term5780, term5780.getClass(), "maxX", term5822);
        setField(term5780, term5780.getClass(), "maxY", term5824);
        setField(term5780, term5780.getClass(), "srs", null);
        setField(term5780, term5780.getClass(), "srsId", term5826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ekxGuOYIwi";
        callMethod(klass, "setUri", argTypes, term5780, args);
    }

};


