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
import java.lang.Integer;

public class TileDaoUtils_getTileMatrixAtLengthIndex_13569825959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3901;
     Object term3966;

    public TileDaoUtils_getTileMatrixAtLengthIndex_13569825959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3904 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term3904, term3904.getClass(), "contents", null);
        setField(term3904, term3904.getClass(), "tableName", "iIRsCSYqXH");
        setLongField(term3904, term3904.getClass(), "zoomLevel", 414749984815662075L);
        setLongField(term3904, term3904.getClass(), "matrixWidth", 463622836963501975L);
        setLongField(term3904, term3904.getClass(), "matrixHeight", 305759998609888272L);
        setLongField(term3904, term3904.getClass(), "tileWidth", -8654565919063661957L);
        setLongField(term3904, term3904.getClass(), "tileHeight", -5248475803419977214L);
        setDoubleField(term3904, term3904.getClass(), "pixelXSize", 0.5644914462415626);
        setDoubleField(term3904, term3904.getClass(), "pixelYSize", 0.509895859167191);
        Object term3925 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term3925, term3925.getClass(), "contents", null);
        setField(term3925, term3925.getClass(), "tableName", "");
        setLongField(term3925, term3925.getClass(), "zoomLevel", -6723783499250797216L);
        setLongField(term3925, term3925.getClass(), "matrixWidth", 41775768178052008L);
        setLongField(term3925, term3925.getClass(), "matrixHeight", 6682528376118987775L);
        setLongField(term3925, term3925.getClass(), "tileWidth", 682356318767179819L);
        setLongField(term3925, term3925.getClass(), "tileHeight", -7291743527973326814L);
        setDoubleField(term3925, term3925.getClass(), "pixelXSize", 0.07417792024383196);
        setDoubleField(term3925, term3925.getClass(), "pixelYSize", 0.686293604788188);
        Object term3935 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term3935, term3935.getClass(), "contents", null);
        setField(term3935, term3935.getClass(), "tableName", null);
        setLongField(term3935, term3935.getClass(), "zoomLevel", -5963439350418910964L);
        setLongField(term3935, term3935.getClass(), "matrixWidth", 9013624480170062917L);
        setLongField(term3935, term3935.getClass(), "matrixHeight", 7862575738391801707L);
        setLongField(term3935, term3935.getClass(), "tileWidth", 50358265865610362L);
        setLongField(term3935, term3935.getClass(), "tileHeight", 5510783420697225605L);
        setDoubleField(term3935, term3935.getClass(), "pixelXSize", 0.12764449157430724);
        setDoubleField(term3935, term3935.getClass(), "pixelYSize", 0.39446728256884744);
        term3901 = new LinkedList();
        ((LinkedList) term3901).add(term3904);
        ((LinkedList) term3901).add(term3925);
        ((LinkedList) term3901).add(term3935);
        ((LinkedList) term3901).add((Object)null);
        ((LinkedList) term3901).add((Object)null);
        term3966 = new Integer(691577392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileDaoUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3901;
        args[1] = term3966;
        callMethod(klass, "getTileMatrixAtLengthIndex", argTypes, null, args);
    }

};


