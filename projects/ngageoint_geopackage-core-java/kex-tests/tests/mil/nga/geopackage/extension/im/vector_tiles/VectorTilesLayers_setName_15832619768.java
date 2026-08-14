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

public class VectorTilesLayers_setName_15832619768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1225;

    public VectorTilesLayers_setName_15832619768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1225 = newInstance(Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers"));
        setLongField(term1225, term1225.getClass(), "id", 4784595517102746672L);
        setField(term1225, term1225.getClass(), "tableName", "UiUYnPrcCi");
        setField(term1225, term1225.getClass(), "name", "UoYtihxVaS");
        setField(term1225, term1225.getClass(), "description", "JDswTTCZHV");
        setLongField(term1225, term1225.getClass(), "minZoom", -7612550318181586304L);
        setLongField(term1225, term1225.getClass(), "maxZoom", -2170847986967241072L);
        setField(term1225, term1225.getClass(), "attributesTableName", "onpbIeEKoi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YRHGsAkhxb";
        callMethod(klass, "setName", argTypes, term1225, args);
    }

};


