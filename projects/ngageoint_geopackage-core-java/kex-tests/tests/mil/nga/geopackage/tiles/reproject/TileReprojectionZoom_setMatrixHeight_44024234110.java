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

public class TileReprojectionZoom_setMatrixHeight_44024234110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271;
     Object term283;

    public TileReprojectionZoom_setMatrixHeight_44024234110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term273 = new Long(3892018155439224435L);
        Long term275 = new Long(5953383087795962419L);
        Long term277 = new Long(7994303628307559416L);
        Long term279 = new Long(2443640364875054177L);
        Long term281 = new Long(-1610676979013636850L);
        term271 = newInstance(Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom"));
        setLongField(term271, term271.getClass(), "zoom", 1439298019805881866L);
        setField(term271, term271.getClass(), "toZoom", term273);
        setField(term271, term271.getClass(), "matrixWidth", term275);
        setField(term271, term271.getClass(), "matrixHeight", term277);
        setField(term271, term271.getClass(), "tileWidth", term279);
        setField(term271, term271.getClass(), "tileHeight", term281);
        term283 = new Long(2062173786000223358L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term283;
        callMethod(klass, "setMatrixHeight", argTypes, term271, args);
    }

};


