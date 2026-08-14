package mil.nga.geopackage.extension.coverage;

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
import static mil.nga.geopackage.extension.coverage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class CoverageDataResults_init_6101082140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9776;
     Object term9790;

    public CoverageDataResults_init_6101082140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term9778 = new Double(0.39446728256884744);
        Double term9780 = new Double(0.7865909711092062);
        Double term9782 = new Double(0.06587158449170749);
        Double term9784 = new Double(0.0865998004187658);
        Double term9786 = new Double(0.9628647861255637);
        Double term9788 = new Double(0.623231822150205);
        term9776 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Double"), 0).getClass(), 1);
        Object[] term9777 = (Object[]) newArray("java.lang.Double", 6);
        setElement(term9777, 0, term9778);
        setElement(term9777, 1, term9780);
        setElement(term9777, 2, term9782);
        setElement(term9777, 3, term9784);
        setElement(term9777, 4, term9786);
        setElement(term9777, 5, term9788);
        setElement(term9776, 0, term9777);
        term9790 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term9790, term9790.getClass(), "contents", null);
        setField(term9790, term9790.getClass(), "tableName", "vGiuZVPJNH");
        setLongField(term9790, term9790.getClass(), "zoomLevel", 6689117472719450333L);
        setLongField(term9790, term9790.getClass(), "matrixWidth", 5836128569274066678L);
        setLongField(term9790, term9790.getClass(), "matrixHeight", -2177368829816872572L);
        setLongField(term9790, term9790.getClass(), "tileWidth", -8463029266761149071L);
        setLongField(term9790, term9790.getClass(), "tileHeight", 3133860696238261492L);
        setDoubleField(term9790, term9790.getClass(), "pixelXSize", 0.5335953039331021);
        setDoubleField(term9790, term9790.getClass(), "pixelYSize", 0.5725602309856443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.coverage.CoverageDataResults");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(Class.forName("java.lang.Double"), 0).getClass(), 0).getClass();
        argTypes[1] = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Object[] args = new Object[2];
        args[0] = term9776;
        args[1] = term9790;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


