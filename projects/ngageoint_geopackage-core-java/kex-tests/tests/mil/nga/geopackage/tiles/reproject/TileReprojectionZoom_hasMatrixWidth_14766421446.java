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

public class TileReprojectionZoom_hasMatrixWidth_14766421446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221;

    public TileReprojectionZoom_hasMatrixWidth_14766421446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term223 = new Long(-8708192233349544946L);
        Long term225 = new Long(5907001541142728739L);
        Long term227 = new Long(4178434741742309755L);
        Long term229 = new Long(-2068172595987555756L);
        Long term231 = new Long(-6292278961887936280L);
        term221 = newInstance(Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom"));
        setLongField(term221, term221.getClass(), "zoom", -6823727938421990489L);
        setField(term221, term221.getClass(), "toZoom", term223);
        setField(term221, term221.getClass(), "matrixWidth", term225);
        setField(term221, term221.getClass(), "matrixHeight", term227);
        setField(term221, term221.getClass(), "tileWidth", term229);
        setField(term221, term221.getClass(), "tileHeight", term231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasMatrixWidth", argTypes, term221, args);
    }

};


