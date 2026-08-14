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

public class ExtTileMatrixSet_getTms_16148630753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5346;

    public ExtTileMatrixSet_getTms_16148630753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term5384 = new Double(0.16852568658760048);
        Double term5386 = new Double(0.20341461558365515);
        Double term5388 = new Double(0.10087360265456191);
        Double term5390 = new Double(0.5957631946929023);
        Long term5392 = new Long(1672578078364590450L);
        term5346 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term5346, term5346.getClass(), "id", -1571034605670661708L);
        setField(term5346, term5346.getClass(), "tms", "DbiCVtPPCT");
        setField(term5346, term5346.getClass(), "description", "WzFopsaDuG");
        setField(term5346, term5346.getClass(), "uri", "PapWxkhEWe");
        setField(term5346, term5346.getClass(), "minX", term5384);
        setField(term5346, term5346.getClass(), "minY", term5386);
        setField(term5346, term5346.getClass(), "maxX", term5388);
        setField(term5346, term5346.getClass(), "maxY", term5390);
        setField(term5346, term5346.getClass(), "srs", null);
        setField(term5346, term5346.getClass(), "srsId", term5392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTms", argTypes, term5346, args);
    }

};


