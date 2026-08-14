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

public class ExtTileMatrixSet_getSrs_99769062717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6512;

    public ExtTileMatrixSet_getSrs_99769062717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term6550 = new Double(0.34234234602085223);
        Double term6552 = new Double(0.8355624480198577);
        Double term6554 = new Double(0.8303221706066055);
        Double term6556 = new Double(0.7102687477135848);
        Long term6558 = new Long(-6950146046121430355L);
        term6512 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term6512, term6512.getClass(), "id", 1442167273909860961L);
        setField(term6512, term6512.getClass(), "tms", "RMsXuyzKJV");
        setField(term6512, term6512.getClass(), "description", "FwPbDZcHmB");
        setField(term6512, term6512.getClass(), "uri", "hOncybyCAH");
        setField(term6512, term6512.getClass(), "minX", term6550);
        setField(term6512, term6512.getClass(), "minY", term6552);
        setField(term6512, term6512.getClass(), "maxX", term6554);
        setField(term6512, term6512.getClass(), "maxY", term6556);
        setField(term6512, term6512.getClass(), "srs", null);
        setField(term6512, term6512.getClass(), "srsId", term6558);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSrs", argTypes, term6512, args);
    }

};


