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

public class TileReprojectionZoom_getMatrixWidth_8749044285 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209;

    public TileReprojectionZoom_getMatrixWidth_8749044285() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term211 = new Long(-6823727938421990489L);
        Long term213 = new Long(-484994522244390100L);
        Long term215 = new Long(1233889271256172047L);
        Long term217 = new Long(6617340557564669657L);
        Long term219 = new Long(1439298019805881866L);
        term209 = newInstance(Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom"));
        setLongField(term209, term209.getClass(), "zoom", 5262507301787091109L);
        setField(term209, term209.getClass(), "toZoom", term211);
        setField(term209, term209.getClass(), "matrixWidth", term213);
        setField(term209, term209.getClass(), "matrixHeight", term215);
        setField(term209, term209.getClass(), "tileWidth", term217);
        setField(term209, term209.getClass(), "tileHeight", term219);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMatrixWidth", argTypes, term209, args);
    }

};


