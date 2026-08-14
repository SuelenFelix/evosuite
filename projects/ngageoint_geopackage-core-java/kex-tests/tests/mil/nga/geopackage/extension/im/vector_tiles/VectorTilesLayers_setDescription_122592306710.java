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

public class VectorTilesLayers_setDescription_122592306710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1431;

    public VectorTilesLayers_setDescription_122592306710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1431 = newInstance(Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers"));
        setLongField(term1431, term1431.getClass(), "id", -5788180182343976541L);
        setField(term1431, term1431.getClass(), "tableName", "ieCtQFdkii");
        setField(term1431, term1431.getClass(), "name", "dEnhdmILtU");
        setField(term1431, term1431.getClass(), "description", "hoicvmsovO");
        setLongField(term1431, term1431.getClass(), "minZoom", 2936323121573284007L);
        setLongField(term1431, term1431.getClass(), "maxZoom", -1154553077993834885L);
        setField(term1431, term1431.getClass(), "attributesTableName", "eqJfYWRaEL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fhkbdRViHi";
        callMethod(klass, "setDescription", argTypes, term1431, args);
    }

};


