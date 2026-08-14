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

public class ExtTileMatrixSet_setMinY_142214645212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6116;
     Object term6164;

    public ExtTileMatrixSet_setMinY_142214645212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term6154 = new Double(0.9678135126533798);
        Double term6156 = new Double(0.3275035827937727);
        Double term6158 = new Double(0.13747524521333288);
        Double term6160 = new Double(0.7149120009558162);
        Long term6162 = new Long(7276637106827860087L);
        term6116 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term6116, term6116.getClass(), "id", -3806202176947356197L);
        setField(term6116, term6116.getClass(), "tms", "tRxZafjqIx");
        setField(term6116, term6116.getClass(), "description", "DhjNLmRMCu");
        setField(term6116, term6116.getClass(), "uri", "PgPzMSEjjX");
        setField(term6116, term6116.getClass(), "minX", term6154);
        setField(term6116, term6116.getClass(), "minY", term6156);
        setField(term6116, term6116.getClass(), "maxX", term6158);
        setField(term6116, term6116.getClass(), "maxY", term6160);
        setField(term6116, term6116.getClass(), "srs", null);
        setField(term6116, term6116.getClass(), "srsId", term6162);
        term6164 = new Double(0.0013046823258857643);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term6164;
        callMethod(klass, "setMinY", argTypes, term6116, args);
    }

};


