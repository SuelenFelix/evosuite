package mil.nga.geopackage.tiles.reproject;

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
import static mil.nga.geopackage.tiles.reproject.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class TileReprojectionZoom_getZoom_13550517421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159;

    public TileReprojectionZoom_getZoom_13550517421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term161 = new Long(-4325723315152823407L);
        Long term163 = new Long(2535595959091595249L);
        Long term165 = new Long(-5476826692763582090L);
        Long term167 = new Long(-872011222785455006L);
        Long term169 = new Long(-316468845751588286L);
        term159 = newInstance(Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom"));
        setLongField(term159, term159.getClass(), "zoom", 1967728129628047933L);
        setField(term159, term159.getClass(), "toZoom", term161);
        setField(term159, term159.getClass(), "matrixWidth", term163);
        setField(term159, term159.getClass(), "matrixHeight", term165);
        setField(term159, term159.getClass(), "tileWidth", term167);
        setField(term159, term159.getClass(), "tileHeight", term169);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZoom", argTypes, term159, args);
    }

};


