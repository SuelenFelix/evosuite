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

public class TileReprojectionZoom_getTileHeight_184078276814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323;

    public TileReprojectionZoom_getTileHeight_184078276814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term325 = new Long(6005241913654469005L);
        Long term327 = new Long(-1983291584002806658L);
        Long term329 = new Long(5946780097489996391L);
        Long term331 = new Long(-8652538484981166496L);
        Long term333 = new Long(2701184207686293431L);
        term323 = newInstance(Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom"));
        setLongField(term323, term323.getClass(), "zoom", -2068172595987555756L);
        setField(term323, term323.getClass(), "toZoom", term325);
        setField(term323, term323.getClass(), "matrixWidth", term327);
        setField(term323, term323.getClass(), "matrixHeight", term329);
        setField(term323, term323.getClass(), "tileWidth", term331);
        setField(term323, term323.getClass(), "tileHeight", term333);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileHeight", argTypes, term323, args);
    }

};


