package mil.nga.geopackage.tiles.user;

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
import static mil.nga.geopackage.tiles.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.Double;

public class TileDaoUtils_getApproximateZoomLevel_20608618912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4170;
     Object term4179;
     Object term4264;

    public TileDaoUtils_getApproximateZoomLevel_20608618912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4170 = (double[]) newDoubleArray(8);
        setDoubleElement(term4170, 0, 0.5310967137636303);
        setDoubleElement(term4170, 1, 0.6054109236809134);
        setDoubleElement(term4170, 2, 0.9165240441138934);
        setDoubleElement(term4170, 3, 0.22227423914231126);
        setDoubleElement(term4170, 4, 0.06480976831423468);
        setDoubleElement(term4170, 5, 0.8490790645379176);
        setDoubleElement(term4170, 6, 0.23129126164078717);
        setDoubleElement(term4170, 7, 0.6047138318674447);
        Object term4182 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term4182, term4182.getClass(), "contents", null);
        setField(term4182, term4182.getClass(), "tableName", "CGOpQSZZwI");
        setLongField(term4182, term4182.getClass(), "zoomLevel", -4360569253593381888L);
        setLongField(term4182, term4182.getClass(), "matrixWidth", 1457594663983990440L);
        setLongField(term4182, term4182.getClass(), "matrixHeight", 3452833434644634217L);
        setLongField(term4182, term4182.getClass(), "tileWidth", -8603648071751666348L);
        setLongField(term4182, term4182.getClass(), "tileHeight", -7884871963229073324L);
        setDoubleField(term4182, term4182.getClass(), "pixelXSize", 0.5597136413549945);
        setDoubleField(term4182, term4182.getClass(), "pixelYSize", 0.28292420012823627);
        Object term4203 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term4203, term4203.getClass(), "contents", null);
        setField(term4203, term4203.getClass(), "tableName", "");
        setLongField(term4203, term4203.getClass(), "zoomLevel", -8649738738252714180L);
        setLongField(term4203, term4203.getClass(), "matrixWidth", -7278883608542636188L);
        setLongField(term4203, term4203.getClass(), "matrixHeight", -1539859611880912454L);
        setLongField(term4203, term4203.getClass(), "tileWidth", 4100236067313034103L);
        setLongField(term4203, term4203.getClass(), "tileHeight", 1195529027276497124L);
        setDoubleField(term4203, term4203.getClass(), "pixelXSize", 0.5407563152320285);
        setDoubleField(term4203, term4203.getClass(), "pixelYSize", 0.9485929668765458);
        Object term4213 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term4213, term4213.getClass(), "contents", null);
        setField(term4213, term4213.getClass(), "tableName", null);
        setLongField(term4213, term4213.getClass(), "zoomLevel", -2783999800714825789L);
        setLongField(term4213, term4213.getClass(), "matrixWidth", 4266570509071948633L);
        setLongField(term4213, term4213.getClass(), "matrixHeight", -7291742736502427077L);
        setLongField(term4213, term4213.getClass(), "tileWidth", -8121849829073967555L);
        setLongField(term4213, term4213.getClass(), "tileHeight", 5219030281405653303L);
        setDoubleField(term4213, term4213.getClass(), "pixelXSize", 0.5179319342588155);
        setDoubleField(term4213, term4213.getClass(), "pixelYSize", 0.25025774487844066);
        term4179 = new LinkedList();
        ((LinkedList) term4179).add(term4182);
        ((LinkedList) term4179).add(term4203);
        ((LinkedList) term4179).add(term4213);
        ((LinkedList) term4179).add((Object)null);
        ((LinkedList) term4179).add((Object)null);
        ((LinkedList) term4179).add((Object)null);
        ((LinkedList) term4179).add((Object)null);
        ((LinkedList) term4179).add((Object)null);
        term4264 = new Double(0.16755811343784477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileDaoUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term4170;
        args[1] = term4179;
        args[2] = term4264;
        callMethod(klass, "getApproximateZoomLevel", argTypes, null, args);
    }

};


