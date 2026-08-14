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

public class TileReprojectionZoom_hasTileHeight_116579955615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335;

    public TileReprojectionZoom_hasTileHeight_116579955615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term337 = new Long(4474998035090263139L);
        Long term339 = new Long(2848819812340321742L);
        Long term341 = new Long(-8876856890348836498L);
        Long term343 = new Long(846579494941632714L);
        Long term345 = new Long(6689117472719450333L);
        term335 = newInstance(Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom"));
        setLongField(term335, term335.getClass(), "zoom", -6292278961887936280L);
        setField(term335, term335.getClass(), "toZoom", term337);
        setField(term335, term335.getClass(), "matrixWidth", term339);
        setField(term335, term335.getClass(), "matrixHeight", term341);
        setField(term335, term335.getClass(), "tileWidth", term343);
        setField(term335, term335.getClass(), "tileHeight", term345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasTileHeight", argTypes, term335, args);
    }

};


