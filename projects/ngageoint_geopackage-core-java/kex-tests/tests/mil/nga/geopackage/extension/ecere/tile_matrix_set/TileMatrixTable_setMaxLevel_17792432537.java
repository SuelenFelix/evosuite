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

public class TileMatrixTable_setMaxLevel_17792432537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term731;
     Object term796;

    public TileMatrixTable_setMaxLevel_17792432537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term782 = new Double(0.10667076642995188);
        Double term784 = new Double(0.11493000848982304);
        Double term786 = new Double(0.37161417339133307);
        Double term788 = new Double(0.6805867182029153);
        Long term790 = new Long(2535595959091595249L);
        Long term792 = new Long(-5476826692763582090L);
        term731 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixTable"));
        Object term744 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setField(term731, term731.getClass(), "tableName", "IoAlmYsBwc");
        setLongField(term744, term744.getClass(), "id", -4920224193275732920L);
        setField(term744, term744.getClass(), "tms", "TEParAifyi");
        setField(term744, term744.getClass(), "description", "OWDIEULEFu");
        setField(term744, term744.getClass(), "uri", "dWRymuLBtr");
        setField(term744, term744.getClass(), "minX", term782);
        setField(term744, term744.getClass(), "minY", term784);
        setField(term744, term744.getClass(), "maxX", term786);
        setField(term744, term744.getClass(), "maxY", term788);
        setField(term744, term744.getClass(), "srs", null);
        setField(term744, term744.getClass(), "srsId", term790);
        setField(term731, term731.getClass(), "tms", term744);
        setField(term731, term731.getClass(), "tmsId", term792);
        setLongField(term731, term731.getClass(), "maxLevel", 8428634514691209827L);
        setLongField(term731, term731.getClass(), "minLevel", -2585684163342970173L);
        term796 = new Long(8059786003080744426L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term796;
        callMethod(klass, "setMaxLevel", argTypes, term731, args);
    }

};


