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

public class VectorTilesLayers_getMinZoom_168487552911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1545;

    public VectorTilesLayers_getMinZoom_168487552911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1545 = newInstance(Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers"));
        setLongField(term1545, term1545.getClass(), "id", -2850532706972744550L);
        setField(term1545, term1545.getClass(), "tableName", "uWHnvSvaPl");
        setField(term1545, term1545.getClass(), "name", "kBdSllIBVz");
        setField(term1545, term1545.getClass(), "description", "TJmVBGfTML");
        setLongField(term1545, term1545.getClass(), "minZoom", -2644215923136513282L);
        setLongField(term1545, term1545.getClass(), "maxZoom", -1468719814009985452L);
        setField(term1545, term1545.getClass(), "attributesTableName", "tPlsykYBqO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.im.vector_tiles.VectorTilesLayers");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinZoom", argTypes, term1545, args);
    }

};


