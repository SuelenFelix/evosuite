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

public class ExtTileMatrixSet_setId_5750144512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5266;
     Object term5314;

    public ExtTileMatrixSet_setId_5750144512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term5304 = new Double(0.04708163975594959);
        Double term5306 = new Double(0.8223115496053149);
        Double term5308 = new Double(0.06795505641704636);
        Double term5310 = new Double(0.198746516614277);
        Long term5312 = new Long(-8085190702504231560L);
        term5266 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term5266, term5266.getClass(), "id", 7950532649535587877L);
        setField(term5266, term5266.getClass(), "tms", "VeDtgDzGAN");
        setField(term5266, term5266.getClass(), "description", "aWYOWZFyaX");
        setField(term5266, term5266.getClass(), "uri", "BRIVNtfUWU");
        setField(term5266, term5266.getClass(), "minX", term5304);
        setField(term5266, term5266.getClass(), "minY", term5306);
        setField(term5266, term5266.getClass(), "maxX", term5308);
        setField(term5266, term5266.getClass(), "maxY", term5310);
        setField(term5266, term5266.getClass(), "srs", null);
        setField(term5266, term5266.getClass(), "srsId", term5312);
        term5314 = new Long(7799452759993694308L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term5314;
        callMethod(klass, "setId", argTypes, term5266, args);
    }

};


