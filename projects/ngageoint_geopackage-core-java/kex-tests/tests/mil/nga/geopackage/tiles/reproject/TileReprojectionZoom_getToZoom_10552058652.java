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

public class TileReprojectionZoom_getToZoom_10552058652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171;

    public TileReprojectionZoom_getToZoom_10552058652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term173 = new Long(5127676408959197577L);
        Long term175 = new Long(-6573104506744284592L);
        Long term177 = new Long(-4920224193275732920L);
        Long term179 = new Long(8428634514691209827L);
        Long term181 = new Long(-2585684163342970173L);
        term171 = newInstance(Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom"));
        setLongField(term171, term171.getClass(), "zoom", 2120084523938730454L);
        setField(term171, term171.getClass(), "toZoom", term173);
        setField(term171, term171.getClass(), "matrixWidth", term175);
        setField(term171, term171.getClass(), "matrixHeight", term177);
        setField(term171, term171.getClass(), "tileWidth", term179);
        setField(term171, term171.getClass(), "tileHeight", term181);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToZoom", argTypes, term171, args);
    }

};


