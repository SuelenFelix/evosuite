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

public class ExtTileMatrixSet_setSrs_66827219518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6590;

    public ExtTileMatrixSet_setSrs_66827219518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term6628 = new Double(0.7984332537471793);
        Double term6630 = new Double(0.6782349539183316);
        Double term6632 = new Double(0.6464654528667407);
        Double term6634 = new Double(0.6416885379658445);
        Long term6636 = new Long(1667122142089513324L);
        term6590 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term6590, term6590.getClass(), "id", 6895382576300001141L);
        setField(term6590, term6590.getClass(), "tms", "QduALnDSVo");
        setField(term6590, term6590.getClass(), "description", "izPpKDErnQ");
        setField(term6590, term6590.getClass(), "uri", "NnpwZBUTvx");
        setField(term6590, term6590.getClass(), "minX", term6628);
        setField(term6590, term6590.getClass(), "minY", term6630);
        setField(term6590, term6590.getClass(), "maxX", term6632);
        setField(term6590, term6590.getClass(), "maxY", term6634);
        setField(term6590, term6590.getClass(), "srs", null);
        setField(term6590, term6590.getClass(), "srsId", term6636);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.srs.SpatialReferenceSystem");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setSrs", argTypes, term6590, args);
    }

};


