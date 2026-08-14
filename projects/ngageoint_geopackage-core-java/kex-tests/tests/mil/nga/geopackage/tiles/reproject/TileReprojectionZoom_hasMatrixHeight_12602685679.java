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

public class TileReprojectionZoom_hasMatrixHeight_12602685679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259;

    public TileReprojectionZoom_hasMatrixHeight_12602685679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term261 = new Long(-2644215923136513282L);
        Long term263 = new Long(-1468719814009985452L);
        Long term265 = new Long(-7738503207562305297L);
        Long term267 = new Long(3825396310311739952L);
        Long term269 = new Long(-3838084482494604218L);
        term259 = newInstance(Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom"));
        setLongField(term259, term259.getClass(), "zoom", 6617340557564669657L);
        setField(term259, term259.getClass(), "toZoom", term261);
        setField(term259, term259.getClass(), "matrixWidth", term263);
        setField(term259, term259.getClass(), "matrixHeight", term265);
        setField(term259, term259.getClass(), "tileWidth", term267);
        setField(term259, term259.getClass(), "tileHeight", term269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasMatrixHeight", argTypes, term259, args);
    }

};


