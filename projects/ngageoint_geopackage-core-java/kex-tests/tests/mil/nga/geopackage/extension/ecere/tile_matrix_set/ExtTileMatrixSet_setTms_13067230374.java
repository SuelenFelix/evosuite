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

public class ExtTileMatrixSet_setTms_13067230374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5424;

    public ExtTileMatrixSet_setTms_13067230374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term5462 = new Double(0.9963416078314885);
        Double term5464 = new Double(0.3147638130628596);
        Double term5466 = new Double(0.24810335047389354);
        Double term5468 = new Double(0.9113409083257852);
        Long term5470 = new Long(4949335493504695457L);
        term5424 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term5424, term5424.getClass(), "id", -7983954942068142191L);
        setField(term5424, term5424.getClass(), "tms", "smnHEqRFRx");
        setField(term5424, term5424.getClass(), "description", "XYtryyobou");
        setField(term5424, term5424.getClass(), "uri", "OYbzXylRWW");
        setField(term5424, term5424.getClass(), "minX", term5462);
        setField(term5424, term5424.getClass(), "minY", term5464);
        setField(term5424, term5424.getClass(), "maxX", term5466);
        setField(term5424, term5424.getClass(), "maxY", term5468);
        setField(term5424, term5424.getClass(), "srs", null);
        setField(term5424, term5424.getClass(), "srsId", term5470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DSNsTGYXDF";
        callMethod(klass, "setTms", argTypes, term5424, args);
    }

};


