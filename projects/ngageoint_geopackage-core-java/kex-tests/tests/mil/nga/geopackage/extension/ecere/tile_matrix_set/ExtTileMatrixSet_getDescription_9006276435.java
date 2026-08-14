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

public class ExtTileMatrixSet_getDescription_9006276435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5524;

    public ExtTileMatrixSet_getDescription_9006276435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term5562 = new Double(0.7444535250398684);
        Double term5564 = new Double(0.37439559220953034);
        Double term5566 = new Double(0.5010337159337968);
        Double term5568 = new Double(0.33871772875627537);
        Long term5570 = new Long(-5216789073301458893L);
        term5524 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term5524, term5524.getClass(), "id", 2274723545906746965L);
        setField(term5524, term5524.getClass(), "tms", "sQvGcVjdEx");
        setField(term5524, term5524.getClass(), "description", "rLHAoqXgPh");
        setField(term5524, term5524.getClass(), "uri", "zUlRdimJtU");
        setField(term5524, term5524.getClass(), "minX", term5562);
        setField(term5524, term5524.getClass(), "minY", term5564);
        setField(term5524, term5524.getClass(), "maxX", term5566);
        setField(term5524, term5524.getClass(), "maxY", term5568);
        setField(term5524, term5524.getClass(), "srs", null);
        setField(term5524, term5524.getClass(), "srsId", term5570);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term5524, args);
    }

};


