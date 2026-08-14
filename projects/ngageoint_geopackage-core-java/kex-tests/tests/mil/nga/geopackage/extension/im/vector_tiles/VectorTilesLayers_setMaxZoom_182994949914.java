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
import java.lang.Long;

public class VectorTilesLayers_setMaxZoom_182994949914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1823;
     Object term1875;

    public VectorTilesLayers_setMaxZoom_182994949914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1823 = newInstance(Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers"));
        setLongField(term1823, term1823.getClass(), "id", -1610676979013636850L);
        setField(term1823, term1823.getClass(), "tableName", "vQVyKLdtaz");
        setField(term1823, term1823.getClass(), "name", "OWKQODBLzb");
        setField(term1823, term1823.getClass(), "description", "wGmYcqUkgE");
        setLongField(term1823, term1823.getClass(), "minZoom", 2062173786000223358L);
        setLongField(term1823, term1823.getClass(), "maxZoom", -8658027316505137504L);
        setField(term1823, term1823.getClass(), "attributesTableName", "idgaQsnJpQ");
        term1875 = new Long(414749984815662075L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1875;
        callMethod(klass, "setMaxZoom", argTypes, term1823, args);
    }

};


