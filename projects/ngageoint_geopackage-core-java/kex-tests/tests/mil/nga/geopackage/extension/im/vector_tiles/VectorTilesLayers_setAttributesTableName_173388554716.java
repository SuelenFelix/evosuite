package mil.nga.geopackage.extension.im.vector_tiles;

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
import static mil.nga.geopackage.extension.im.vector_tiles.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class VectorTilesLayers_setAttributesTableName_173388554716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2009;

    public VectorTilesLayers_setAttributesTableName_173388554716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2009 = newInstance(Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers"));
        setLongField(term2009, term2009.getClass(), "id", -5248475803419977214L);
        setField(term2009, term2009.getClass(), "tableName", "LvJFtLBaxj");
        setField(term2009, term2009.getClass(), "name", "PHvxnGHptP");
        setField(term2009, term2009.getClass(), "description", "TimdotUuNC");
        setLongField(term2009, term2009.getClass(), "minZoom", -6723783499250797216L);
        setLongField(term2009, term2009.getClass(), "maxZoom", 41775768178052008L);
        setField(term2009, term2009.getClass(), "attributesTableName", "PkWMRdJcBb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jSpAteRute";
        callMethod(klass, "setAttributesTableName", argTypes, term2009, args);
    }

};


