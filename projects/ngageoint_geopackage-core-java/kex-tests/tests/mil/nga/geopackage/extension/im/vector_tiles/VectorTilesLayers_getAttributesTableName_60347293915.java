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

public class VectorTilesLayers_getAttributesTableName_60347293915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1917;

    public VectorTilesLayers_getAttributesTableName_60347293915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1917 = newInstance(Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers"));
        setLongField(term1917, term1917.getClass(), "id", 463622836963501975L);
        setField(term1917, term1917.getClass(), "tableName", "VgZnGoIFwQ");
        setField(term1917, term1917.getClass(), "name", "jUbSRrkrYZ");
        setField(term1917, term1917.getClass(), "description", "bWWfajKbEX");
        setLongField(term1917, term1917.getClass(), "minZoom", 305759998609888272L);
        setLongField(term1917, term1917.getClass(), "maxZoom", -8654565919063661957L);
        setField(term1917, term1917.getClass(), "attributesTableName", "cAPeiZHKGJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAttributesTableName", argTypes, term1917, args);
    }

};


