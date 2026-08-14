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

public class TileReprojectionZoom_setToZoom_15235253014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195;
     Object term207;

    public TileReprojectionZoom_setToZoom_15235253014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term197 = new Long(-4502405999831680926L);
        Long term199 = new Long(1967728129628047933L);
        Long term201 = new Long(2120084523938730454L);
        Long term203 = new Long(6855071767938501807L);
        Long term205 = new Long(-5892135042702373494L);
        term195 = newInstance(Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom"));
        setLongField(term195, term195.getClass(), "zoom", -5892135042702373494L);
        setField(term195, term195.getClass(), "toZoom", term197);
        setField(term195, term195.getClass(), "matrixWidth", term199);
        setField(term195, term195.getClass(), "matrixHeight", term201);
        setField(term195, term195.getClass(), "tileWidth", term203);
        setField(term195, term195.getClass(), "tileHeight", term205);
        term207 = new Long(5262507301787091109L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term207;
        callMethod(klass, "setToZoom", argTypes, term195, args);
    }

};


