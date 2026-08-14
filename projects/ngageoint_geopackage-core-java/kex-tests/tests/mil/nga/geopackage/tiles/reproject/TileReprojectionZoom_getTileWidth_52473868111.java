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

public class TileReprojectionZoom_getTileWidth_52473868111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285;

    public TileReprojectionZoom_getTileWidth_52473868111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term287 = new Long(-8658027316505137504L);
        Long term289 = new Long(414749984815662075L);
        Long term291 = new Long(463622836963501975L);
        Long term293 = new Long(305759998609888272L);
        Long term295 = new Long(-8654565919063661957L);
        term285 = newInstance(Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom"));
        setLongField(term285, term285.getClass(), "zoom", -8708192233349544946L);
        setField(term285, term285.getClass(), "toZoom", term287);
        setField(term285, term285.getClass(), "matrixWidth", term289);
        setField(term285, term285.getClass(), "matrixHeight", term291);
        setField(term285, term285.getClass(), "tileWidth", term293);
        setField(term285, term285.getClass(), "tileHeight", term295);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileWidth", argTypes, term285, args);
    }

};


