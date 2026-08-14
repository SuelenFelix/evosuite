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

public class ExtTileMatrixSet_getMaxX_17055458313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6196;

    public ExtTileMatrixSet_getMaxX_17055458313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term6234 = new Double(0.5404409545293147);
        Double term6236 = new Double(0.9172358414700745);
        Double term6238 = new Double(0.3804251745476508);
        Double term6240 = new Double(0.6704848280926606);
        Long term6242 = new Long(-3936701866695933852L);
        term6196 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term6196, term6196.getClass(), "id", -5534222035915952617L);
        setField(term6196, term6196.getClass(), "tms", "wzsPSPcRdj");
        setField(term6196, term6196.getClass(), "description", "kGMQdqJYyB");
        setField(term6196, term6196.getClass(), "uri", "XJJNClzHRf");
        setField(term6196, term6196.getClass(), "minX", term6234);
        setField(term6196, term6196.getClass(), "minY", term6236);
        setField(term6196, term6196.getClass(), "maxX", term6238);
        setField(term6196, term6196.getClass(), "maxY", term6240);
        setField(term6196, term6196.getClass(), "srs", null);
        setField(term6196, term6196.getClass(), "srsId", term6242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxX", argTypes, term6196, args);
    }

};


