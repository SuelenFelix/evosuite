package mil.nga.geopackage.tiles.matrix;

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
import static mil.nga.geopackage.tiles.matrix.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class TileMatrix_setPixelXSize_169339001018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545;
     Object term565;

    public TileMatrix_setPixelXSize_169339001018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term545, term545.getClass(), "contents", null);
        setField(term545, term545.getClass(), "tableName", "HyxfbSQYBe");
        setLongField(term545, term545.getClass(), "zoomLevel", 5836128569274066678L);
        setLongField(term545, term545.getClass(), "matrixWidth", -2177368829816872572L);
        setLongField(term545, term545.getClass(), "matrixHeight", -8463029266761149071L);
        setLongField(term545, term545.getClass(), "tileWidth", 3133860696238261492L);
        setLongField(term545, term545.getClass(), "tileHeight", 7247160664318067468L);
        setDoubleField(term545, term545.getClass(), "pixelXSize", 0.9737083944266686);
        setDoubleField(term545, term545.getClass(), "pixelYSize", 0.0668892744806211);
        term565 = new Double(0.3587267442738795);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term565;
        callMethod(klass, "setPixelXSize", argTypes, term545, args);
    }

};


