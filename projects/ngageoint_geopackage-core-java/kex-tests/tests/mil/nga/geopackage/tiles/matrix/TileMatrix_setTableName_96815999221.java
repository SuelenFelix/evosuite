package mil.nga.geopackage.tiles.matrix;

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
import static mil.nga.geopackage.tiles.matrix.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TileMatrix_setTableName_96815999221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term639;

    public TileMatrix_setTableName_96815999221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term639 = newInstance(Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix"));
        setField(term639, term639.getClass(), "contents", null);
        setField(term639, term639.getClass(), "tableName", "RkybSrpybU");
        setLongField(term639, term639.getClass(), "zoomLevel", 2354625302846375590L);
        setLongField(term639, term639.getClass(), "matrixWidth", 7276637106827860087L);
        setLongField(term639, term639.getClass(), "matrixHeight", -3936701866695933852L);
        setLongField(term639, term639.getClass(), "tileWidth", 1215116475929634177L);
        setLongField(term639, term639.getClass(), "tileHeight", 1597484336218508869L);
        setDoubleField(term639, term639.getClass(), "pixelXSize", 0.6588948704887806);
        setDoubleField(term639, term639.getClass(), "pixelYSize", 0.6397214730945112);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.matrix.TileMatrix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xOEqzGAmDU";
        callMethod(klass, "setTableName", argTypes, term639, args);
    }

};


