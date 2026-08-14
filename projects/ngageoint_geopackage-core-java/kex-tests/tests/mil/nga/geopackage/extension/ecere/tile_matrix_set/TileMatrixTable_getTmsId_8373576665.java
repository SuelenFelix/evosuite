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

public class TileMatrixTable_getTmsId_8373576665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term521;

    public TileMatrixTable_getTmsId_8373576665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term572 = new Double(0.4569171842750229);
        Double term574 = new Double(0.8598297828918529);
        Double term576 = new Double(0.43692187681405226);
        Double term578 = new Double(0.7633268466829064);
        Long term580 = new Long(6967924379644551255L);
        Long term582 = new Long(-2813493605142626659L);
        term521 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixTable"));
        Object term534 = newInstance(Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.ExtTileMatrixSet"));
        setField(term521, term521.getClass(), "tableName", "hNxWaHcfhY");
        setLongField(term534, term534.getClass(), "id", 2535595959091595249L);
        setField(term534, term534.getClass(), "tms", "RkybSrpybU");
        setField(term534, term534.getClass(), "description", "xOEqzGAmDU");
        setField(term534, term534.getClass(), "uri", "eZFUvlxvGV");
        setField(term534, term534.getClass(), "minX", term572);
        setField(term534, term534.getClass(), "minY", term574);
        setField(term534, term534.getClass(), "maxX", term576);
        setField(term534, term534.getClass(), "maxY", term578);
        setField(term534, term534.getClass(), "srs", null);
        setField(term534, term534.getClass(), "srsId", term580);
        setField(term521, term521.getClass(), "tms", term534);
        setField(term521, term521.getClass(), "tmsId", term582);
        setLongField(term521, term521.getClass(), "maxLevel", -5476826692763582090L);
        setLongField(term521, term521.getClass(), "minLevel", -872011222785455006L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.ecere.tile_matrix_set.TileMatrixTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTmsId", argTypes, term521, args);
    }

};


