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

public class TileReprojectionZoom_setTileWidth_49165892713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309;
     Object term321;

    public TileReprojectionZoom_setTileWidth_49165892713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term311 = new Long(-7291743527973326814L);
        Long term313 = new Long(-5963439350418910964L);
        Long term315 = new Long(9013624480170062917L);
        Long term317 = new Long(7862575738391801707L);
        Long term319 = new Long(50358265865610362L);
        term309 = newInstance(Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom"));
        setLongField(term309, term309.getClass(), "zoom", 4178434741742309755L);
        setField(term309, term309.getClass(), "toZoom", term311);
        setField(term309, term309.getClass(), "matrixWidth", term313);
        setField(term309, term309.getClass(), "matrixHeight", term315);
        setField(term309, term309.getClass(), "tileWidth", term317);
        setField(term309, term309.getClass(), "tileHeight", term319);
        term321 = new Long(5510783420697225605L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term321;
        callMethod(klass, "setTileWidth", argTypes, term309, args);
    }

};


