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

public class TileReprojectionCore_setConfig_210221599313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11;

    public TileReprojectionCore_setConfig_210221599313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term13 = new Long(-8257434502486459194L);
        Long term15 = new Long(-8400487765614892086L);
        Long term17 = new Long(5270370404989704783L);
        Long term19 = new Long(7411271909051562686L);
        Long term21 = new Long(4872422362414183754L);
        term11 = newInstance(Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom"));
        setLongField(term11, term11.getClass(), "zoom", -8257434502486459194L);
        setField(term11, term11.getClass(), "toZoom", term13);
        setField(term11, term11.getClass(), "matrixWidth", term15);
        setField(term11, term11.getClass(), "matrixHeight", term17);
        setField(term11, term11.getClass(), "tileWidth", term19);
        setField(term11, term11.getClass(), "tileHeight", term21);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionCore");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.tiles.reproject.TileReprojectionZoom");
        Object[] args = new Object[1];
        args[0] = term11;
        callMethod(klass, "setConfig", argTypes, null, args);
    }

};


