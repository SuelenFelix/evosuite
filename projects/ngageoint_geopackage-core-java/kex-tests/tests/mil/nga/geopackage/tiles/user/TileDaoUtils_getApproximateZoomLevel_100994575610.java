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

public class TileDaoUtils_getApproximateZoomLevel_100994575610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3978;
     Object term3979;
     Object term3984;
     Object term4027;

    public TileDaoUtils_getApproximateZoomLevel_100994575610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3978 = (double[]) newDoubleArray(0);
        term3979 = (double[]) newDoubleArray(4);
        setDoubleElement(term3979, 0, 0.623231822150205);
        setDoubleElement(term3979, 1, 0.09037487793444521);
        setDoubleElement(term3979, 2, 0.6561919196821765);
        setDoubleElement(term3979, 3, 0.7330178886612495);
        Object term3987 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term3987, term3987.getClass(), "contents", null);
        setField(term3987, term3987.getClass(), "tableName", "UKAReurpHG");
        setLongField(term3987, term3987.getClass(), "zoomLevel", 5836128569274066678L);
        setLongField(term3987, term3987.getClass(), "matrixWidth", -2177368829816872572L);
        setLongField(term3987, term3987.getClass(), "matrixHeight", -8463029266761149071L);
        setLongField(term3987, term3987.getClass(), "tileWidth", 3133860696238261492L);
        setLongField(term3987, term3987.getClass(), "tileHeight", 7247160664318067468L);
        setDoubleField(term3987, term3987.getClass(), "pixelXSize", 0.7618164754425794);
        setDoubleField(term3987, term3987.getClass(), "pixelYSize", 0.7385589312559342);
        Object term4008 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term4008, term4008.getClass(), "contents", null);
        setField(term4008, term4008.getClass(), "tableName", "");
        setLongField(term4008, term4008.getClass(), "zoomLevel", 2135754395358000892L);
        setLongField(term4008, term4008.getClass(), "matrixWidth", -8085190702504231560L);
        setLongField(term4008, term4008.getClass(), "matrixHeight", 1672578078364590450L);
        setLongField(term4008, term4008.getClass(), "tileWidth", 4949335493504695457L);
        setLongField(term4008, term4008.getClass(), "tileHeight", -5216789073301458893L);
        setDoubleField(term4008, term4008.getClass(), "pixelXSize", 0.7080134263823477);
        setDoubleField(term4008, term4008.getClass(), "pixelYSize", 0.6059734092898602);
        Object term4018 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term4018, term4018.getClass(), "contents", null);
        setField(term4018, term4018.getClass(), "tableName", null);
        setLongField(term4018, term4018.getClass(), "zoomLevel", -1832940336320585644L);
        setLongField(term4018, term4018.getClass(), "matrixWidth", -8033714905181142681L);
        setLongField(term4018, term4018.getClass(), "matrixHeight", -9040825890007374809L);
        setLongField(term4018, term4018.getClass(), "tileWidth", 1368340889161782793L);
        setLongField(term4018, term4018.getClass(), "tileHeight", -5786861555969446503L);
        setDoubleField(term4018, term4018.getClass(), "pixelXSize", 0.3074693824288357);
        setDoubleField(term4018, term4018.getClass(), "pixelYSize", 0.1245258965512791);
        term3984 = new LinkedList();
        ((LinkedList) term3984).add(term3987);
        ((LinkedList) term3984).add(term4008);
        ((LinkedList) term3984).add(term4018);
        term4027 = new Double(0.9511861072660375);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileDaoUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = term3978;
        args[1] = term3979;
        args[2] = term3984;
        args[3] = term4027;
        callMethod(klass, "getApproximateZoomLevel", argTypes, null, args);
    }

};


