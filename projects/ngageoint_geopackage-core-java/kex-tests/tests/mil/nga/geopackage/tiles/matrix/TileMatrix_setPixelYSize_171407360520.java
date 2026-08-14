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

public class TileMatrix_setPixelYSize_171407360520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term607;
     Object term627;

    public TileMatrix_setPixelYSize_171407360520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term607 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term607, term607.getClass(), "contents", null);
        setField(term607, term607.getClass(), "tableName", "hNxWaHcfhY");
        setLongField(term607, term607.getClass(), "zoomLevel", -1832940336320585644L);
        setLongField(term607, term607.getClass(), "matrixWidth", -8033714905181142681L);
        setLongField(term607, term607.getClass(), "matrixHeight", -9040825890007374809L);
        setLongField(term607, term607.getClass(), "tileWidth", 1368340889161782793L);
        setLongField(term607, term607.getClass(), "tileHeight", -5786861555969446503L);
        setDoubleField(term607, term607.getClass(), "pixelXSize", 0.3202192021706908);
        setDoubleField(term607, term607.getClass(), "pixelYSize", 0.22651340641904605);
        term627 = new Double(0.8878841294187743);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term627;
        callMethod(klass, "setPixelYSize", argTypes, term607, args);
    }

};


