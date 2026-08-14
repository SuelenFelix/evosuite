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

public class VectorTilesLayers_getName_1366145927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1133;

    public VectorTilesLayers_getName_1366145927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1133 = newInstance(Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers"));
        setLongField(term1133, term1133.getClass(), "id", -2068172595987555756L);
        setField(term1133, term1133.getClass(), "tableName", "LvtrsXUliU");
        setField(term1133, term1133.getClass(), "name", "xLbjWUgOIL");
        setField(term1133, term1133.getClass(), "description", "jDtqGUpnZN");
        setLongField(term1133, term1133.getClass(), "minZoom", -6292278961887936280L);
        setLongField(term1133, term1133.getClass(), "maxZoom", -6645965768855543712L);
        setField(term1133, term1133.getClass(), "attributesTableName", "nGKItKLYNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term1133, args);
    }

};


