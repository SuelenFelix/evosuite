package mil.nga.geopackage.extension.nga.scale;

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
import static mil.nga.geopackage.extension.nga.scale.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TileTableScaling_init_8422204391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2315;

    public TileTableScaling_init_8422204391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2315 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term2315, term2315.getClass(), "contents", null);
        setField(term2315, term2315.getClass(), "tableName", "kuTXqwMtDB");
        setLongField(term2315, term2315.getClass(), "zoomLevel", -8400487765614892086L);
        setLongField(term2315, term2315.getClass(), "matrixWidth", 5270370404989704783L);
        setLongField(term2315, term2315.getClass(), "matrixHeight", 7411271909051562686L);
        setLongField(term2315, term2315.getClass(), "tileWidth", 4872422362414183754L);
        setLongField(term2315, term2315.getClass(), "tileHeight", 6811161968424632369L);
        setDoubleField(term2315, term2315.getClass(), "pixelXSize", 0.7655020693602768);
        setDoubleField(term2315, term2315.getClass(), "pixelYSize", 0.1374549299694151);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.nga.scale.TileTableScaling");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("mil.nga.geopackage.GeoPackageCore");
        argTypes[1] = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2315;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


