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

public class TileReprojectionZoom_setTileHeight_26138395416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term347;
     Object term359;

    public TileReprojectionZoom_setTileHeight_26138395416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term349 = new Long(5836128569274066678L);
        Long term351 = new Long(-2177368829816872572L);
        Long term353 = new Long(-8463029266761149071L);
        Long term355 = new Long(3133860696238261492L);
        Long term357 = new Long(7247160664318067468L);
        term347 = newInstance(Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom"));
        setLongField(term347, term347.getClass(), "zoom", -6645965768855543712L);
        setField(term347, term347.getClass(), "toZoom", term349);
        setField(term347, term347.getClass(), "matrixWidth", term351);
        setField(term347, term347.getClass(), "matrixHeight", term353);
        setField(term347, term347.getClass(), "tileWidth", term355);
        setField(term347, term347.getClass(), "tileHeight", term357);
        term359 = new Long(2135754395358000892L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term359;
        callMethod(klass, "setTileHeight", argTypes, term347, args);
    }

};


