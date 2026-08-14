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

public class TileMatrixTable_setTms_3624747564 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338;
     Object term403;

    public TileMatrixTable_setTms_3624747564() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term389 = new Double(0.7655020693602768);
        Double term391 = new Double(0.1374549299694151);
        Double term393 = new Double(0.7031006357544823);
        Double term395 = new Double(0.9527281779865117);
        Long term397 = new Long(4872422362414183754L);
        Long term399 = new Long(6811161968424632369L);
        term338 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixTable"));
        Object term351 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setField(term338, term338.getClass(), "tableName", "LQFpaHEwXR");
        setLongField(term351, term351.getClass(), "id", 6967924379644551255L);
        setField(term351, term351.getClass(), "tms", "oVcInYnLWB");
        setField(term351, term351.getClass(), "description", "aJlieCFVtF");
        setField(term351, term351.getClass(), "uri", "ZiaGIbnzTs");
        setField(term351, term351.getClass(), "minX", term389);
        setField(term351, term351.getClass(), "minY", term391);
        setField(term351, term351.getClass(), "maxX", term393);
        setField(term351, term351.getClass(), "maxY", term395);
        setField(term351, term351.getClass(), "srs", null);
        setField(term351, term351.getClass(), "srsId", term397);
        setField(term338, term338.getClass(), "tms", term351);
        setField(term338, term338.getClass(), "tmsId", term399);
        setLongField(term338, term338.getClass(), "maxLevel", -2813493605142626659L);
        setLongField(term338, term338.getClass(), "minLevel", -8885298608300233488L);
        Double term441 = new Double(0.9828442029246764);
        Double term443 = new Double(0.2779719046761513);
        Double term445 = new Double(0.6436713023569729);
        Double term447 = new Double(0.7332741045694002);
        Long term449 = new Long(-7237588299778557629L);
        term403 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setLongField(term403, term403.getClass(), "id", -4325723315152823407L);
        setField(term403, term403.getClass(), "tms", "tbcdzjIfER");
        setField(term403, term403.getClass(), "description", "HyxfbSQYBe");
        setField(term403, term403.getClass(), "uri", "pCTimMblYc");
        setField(term403, term403.getClass(), "minX", term441);
        setField(term403, term403.getClass(), "minY", term443);
        setField(term403, term403.getClass(), "maxX", term445);
        setField(term403, term403.getClass(), "maxY", term447);
        setField(term403, term403.getClass(), "srs", null);
        setField(term403, term403.getClass(), "srsId", term449);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet");
        Object[] args = new Object[1];
        args[0] = term403;
        callMethod(klass, "setTms", argTypes, term338, args);
    }

};


