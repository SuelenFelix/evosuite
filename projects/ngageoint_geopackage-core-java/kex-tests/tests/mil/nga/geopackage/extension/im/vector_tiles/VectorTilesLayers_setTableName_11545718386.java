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

public class VectorTilesLayers_setTableName_11545718386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1019;

    public VectorTilesLayers_setTableName_11545718386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1019 = newInstance(Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers"));
        setLongField(term1019, term1019.getClass(), "id", -8708192233349544946L);
        setField(term1019, term1019.getClass(), "tableName", "gGSMzuGICf");
        setField(term1019, term1019.getClass(), "name", "hxCBltsObl");
        setField(term1019, term1019.getClass(), "description", "BndsHwAFMv");
        setLongField(term1019, term1019.getClass(), "minZoom", 5907001541142728739L);
        setLongField(term1019, term1019.getClass(), "maxZoom", 4178434741742309755L);
        setField(term1019, term1019.getClass(), "attributesTableName", "GzFkzHGYFt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "tShwQLRGNe";
        callMethod(klass, "setTableName", argTypes, term1019, args);
    }

};


