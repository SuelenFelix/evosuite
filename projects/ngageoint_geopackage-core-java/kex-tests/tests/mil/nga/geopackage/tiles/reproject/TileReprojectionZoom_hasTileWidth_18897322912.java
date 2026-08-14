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

public class TileReprojectionZoom_hasTileWidth_18897322912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297;

    public TileReprojectionZoom_hasTileWidth_18897322912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term299 = new Long(-5248475803419977214L);
        Long term301 = new Long(-6723783499250797216L);
        Long term303 = new Long(41775768178052008L);
        Long term305 = new Long(6682528376118987775L);
        Long term307 = new Long(682356318767179819L);
        term297 = newInstance(Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom"));
        setLongField(term297, term297.getClass(), "zoom", 5907001541142728739L);
        setField(term297, term297.getClass(), "toZoom", term299);
        setField(term297, term297.getClass(), "matrixWidth", term301);
        setField(term297, term297.getClass(), "matrixHeight", term303);
        setField(term297, term297.getClass(), "tileWidth", term305);
        setField(term297, term297.getClass(), "tileHeight", term307);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasTileWidth", argTypes, term297, args);
    }

};


