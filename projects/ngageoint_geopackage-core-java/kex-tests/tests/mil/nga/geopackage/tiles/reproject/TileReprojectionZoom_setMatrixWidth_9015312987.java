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

public class TileReprojectionZoom_setMatrixWidth_9015312987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233;
     Object term245;

    public TileReprojectionZoom_setMatrixWidth_9015312987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term235 = new Long(-6645965768855543712L);
        Long term237 = new Long(4784595517102746672L);
        Long term239 = new Long(-7612550318181586304L);
        Long term241 = new Long(-2170847986967241072L);
        Long term243 = new Long(4044358158040652353L);
        term233 = newInstance(Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom"));
        setLongField(term233, term233.getClass(), "zoom", -484994522244390100L);
        setField(term233, term233.getClass(), "toZoom", term235);
        setField(term233, term233.getClass(), "matrixWidth", term237);
        setField(term233, term233.getClass(), "matrixHeight", term239);
        setField(term233, term233.getClass(), "tileWidth", term241);
        setField(term233, term233.getClass(), "tileHeight", term243);
        term245 = new Long(-4443169559037975007L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term245;
        callMethod(klass, "setMatrixWidth", argTypes, term233, args);
    }

};


