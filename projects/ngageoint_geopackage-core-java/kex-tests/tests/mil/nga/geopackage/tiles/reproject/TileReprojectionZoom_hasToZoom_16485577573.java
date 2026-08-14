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

public class TileReprojectionZoom_hasToZoom_16485577573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183;

    public TileReprojectionZoom_hasToZoom_16485577573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term185 = new Long(8059786003080744426L);
        Long term187 = new Long(-4365849114644724155L);
        Long term189 = new Long(2486810210675247493L);
        Long term191 = new Long(7009926388951271268L);
        Long term193 = new Long(-7672528020740371001L);
        term183 = newInstance(Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom"));
        setLongField(term183, term183.getClass(), "zoom", 6855071767938501807L);
        setField(term183, term183.getClass(), "toZoom", term185);
        setField(term183, term183.getClass(), "matrixWidth", term187);
        setField(term183, term183.getClass(), "matrixHeight", term189);
        setField(term183, term183.getClass(), "tileWidth", term191);
        setField(term183, term183.getClass(), "tileHeight", term193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasToZoom", argTypes, term183, args);
    }

};


