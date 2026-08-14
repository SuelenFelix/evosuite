package mil.nga.geopackage.dgiwg;

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
import static mil.nga.geopackage.dgiwg.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DGIWGValidate_primaryKeys_127393133817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32610;

    public DGIWGValidate_primaryKeys_127393133817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32610 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term32610, term32610.getClass(), "contents", null);
        setField(term32610, term32610.getClass(), "tableName", "iMsqJaKlDC");
        setLongField(term32610, term32610.getClass(), "zoomLevel", 2535595959091595249L);
        setLongField(term32610, term32610.getClass(), "matrixWidth", -5476826692763582090L);
        setLongField(term32610, term32610.getClass(), "matrixHeight", -872011222785455006L);
        setLongField(term32610, term32610.getClass(), "tileWidth", -316468845751588286L);
        setLongField(term32610, term32610.getClass(), "tileHeight", 5127676408959197577L);
        setDoubleField(term32610, term32610.getClass(), "pixelXSize", 0.28570734989730284);
        setDoubleField(term32610, term32610.getClass(), "pixelYSize", 0.40176586625454525);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Object[] args = new Object[1];
        args[0] = term32610;
        callMethod(klass, "primaryKeys", argTypes, null, args);
    }

};


