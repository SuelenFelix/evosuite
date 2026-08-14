package mil.nga.geopackage.extension.ecere.tile_matrix_set;

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
import static mil.nga.geopackage.extension.ecere.tile_matrix_set.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;
import java.lang.Long;

public class TileMatrixVariableWidths_setTm_13731317364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1380;
     Object term1449;

    public TileMatrixVariableWidths_setTm_13731317364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1422 = new Double(0.9203805380592256);
        Double term1424 = new Double(0.5804948995371725);
        Double term1426 = new Double(0.20737514139742264);
        Double term1428 = new Double(0.7919370314903882);
        Long term1430 = new Long(7009926388951271268L);
        Long term1432 = new Long(-7672528020740371001L);
        Double term1443 = new Double(0.2109867221632754);
        term1380 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths"));
        Object term1382 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term1384 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term1380, term1380.getClass(), "id", 463622836963501975L);
        setLongField(term1382, term1382.getClass(), "id", 305759998609888272L);
        setLongField(term1384, term1384.getClass(), "id", -8654565919063661957L);
        setField(term1384, term1384.getClass(), "tms", "jDtqGUpnZN");
        setField(term1384, term1384.getClass(), "description", "nGKItKLYNC");
        setField(term1384, term1384.getClass(), "uri", "UiUYnPrcCi");
        setField(term1384, term1384.getClass(), "minX", term1422);
        setField(term1384, term1384.getClass(), "minY", term1424);
        setField(term1384, term1384.getClass(), "maxX", term1426);
        setField(term1384, term1384.getClass(), "maxY", term1428);
        setField(term1384, term1384.getClass(), "srs", null);
        setField(term1384, term1384.getClass(), "srsId", term1430);
        setField(term1382, term1382.getClass(), "tms", term1384);
        setField(term1382, term1382.getClass(), "tmsId", term1432);
        setLongField(term1382, term1382.getClass(), "zoomLevel", -5248475803419977214L);
        setLongField(term1382, term1382.getClass(), "matrixWidth", -6723783499250797216L);
        setLongField(term1382, term1382.getClass(), "matrixHeight", 41775768178052008L);
        setLongField(term1382, term1382.getClass(), "tileWidth", 6682528376118987775L);
        setLongField(term1382, term1382.getClass(), "tileHeight", 682356318767179819L);
        setDoubleField(term1382, term1382.getClass(), "pixelXSize", 0.7655020693602768);
        setDoubleField(term1382, term1382.getClass(), "pixelYSize", 0.1374549299694151);
        setDoubleField(term1382, term1382.getClass(), "top", 0.7031006357544823);
        setDoubleField(term1382, term1382.getClass(), "left", 0.9527281779865117);
        setField(term1382, term1382.getClass(), "scaleDenominator", term1443);
        setField(term1380, term1380.getClass(), "tm", term1382);
        setLongField(term1380, term1380.getClass(), "tmsId", -7291743527973326814L);
        setLongField(term1380, term1380.getClass(), "maxRow", -5963439350418910964L);
        setLongField(term1380, term1380.getClass(), "minRow", 9013624480170062917L);
        setLongField(term1380, term1380.getClass(), "coalesce", 7862575738391801707L);
        Double term1489 = new Double(0.3227335400819148);
        Double term1491 = new Double(0.43337207054070237);
        Double term1493 = new Double(0.13246999699526574);
        Double term1495 = new Double(0.9126850255993704);
        Long term1497 = new Long(-4502405999831680926L);
        Long term1499 = new Long(1967728129628047933L);
        Double term1510 = new Double(0.11179067076100713);
        term1449 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix"));
        Object term1451 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term1449, term1449.getClass(), "id", 50358265865610362L);
        setLongField(term1451, term1451.getClass(), "id", 5510783420697225605L);
        setField(term1451, term1451.getClass(), "tms", "UoYtihxVaS");
        setField(term1451, term1451.getClass(), "description", "JDswTTCZHV");
        setField(term1451, term1451.getClass(), "uri", "onpbIeEKoi");
        setField(term1451, term1451.getClass(), "minX", term1489);
        setField(term1451, term1451.getClass(), "minY", term1491);
        setField(term1451, term1451.getClass(), "maxX", term1493);
        setField(term1451, term1451.getClass(), "maxY", term1495);
        setField(term1451, term1451.getClass(), "srs", null);
        setField(term1451, term1451.getClass(), "srsId", term1497);
        setField(term1449, term1449.getClass(), "tms", term1451);
        setField(term1449, term1449.getClass(), "tmsId", term1499);
        setLongField(term1449, term1449.getClass(), "zoomLevel", 6005241913654469005L);
        setLongField(term1449, term1449.getClass(), "matrixWidth", -1983291584002806658L);
        setLongField(term1449, term1449.getClass(), "matrixHeight", 5946780097489996391L);
        setLongField(term1449, term1449.getClass(), "tileWidth", -8652538484981166496L);
        setLongField(term1449, term1449.getClass(), "tileHeight", 2701184207686293431L);
        setDoubleField(term1449, term1449.getClass(), "pixelXSize", 0.9828442029246764);
        setDoubleField(term1449, term1449.getClass(), "pixelYSize", 0.2779719046761513);
        setDoubleField(term1449, term1449.getClass(), "top", 0.6436713023569729);
        setDoubleField(term1449, term1449.getClass(), "left", 0.7332741045694002);
        setField(term1449, term1449.getClass(), "scaleDenominator", term1510);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixVariableWidths");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrix");
        Object[] args = new Object[1];
        args[0] = term1449;
        callMethod(klass, "setTm", argTypes, term1380, args);
    }

};


