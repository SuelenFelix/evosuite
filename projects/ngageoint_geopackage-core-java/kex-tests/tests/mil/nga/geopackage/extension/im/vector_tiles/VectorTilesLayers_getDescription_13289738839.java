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

public class VectorTilesLayers_getDescription_13289738839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1339;

    public VectorTilesLayers_getDescription_13289738839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1339 = newInstance(Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers"));
        setLongField(term1339, term1339.getClass(), "id", 4044358158040652353L);
        setField(term1339, term1339.getClass(), "tableName", "ffYhPOzlUs");
        setField(term1339, term1339.getClass(), "name", "MLqYREekMl");
        setField(term1339, term1339.getClass(), "description", "ytSBIKXogI");
        setLongField(term1339, term1339.getClass(), "minZoom", -4443169559037975007L);
        setLongField(term1339, term1339.getClass(), "maxZoom", -3842548265506930260L);
        setField(term1339, term1339.getClass(), "attributesTableName", "nHXjMycHlU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term1339, args);
    }

};


