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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class TileTable_getZoomLevelColumnIndex_5757857227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3393;

    public TileTable_getZoomLevelColumnIndex_5757857227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3395 = new ArrayList();
        HashMap term3399 = new HashMap();
        term3393 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTable"));
        Object term3394 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term3393, term3393.getClass(), "columns", null);
        setField(term3394, term3394.getClass(), "constraints", term3395);
        setField(term3394, term3394.getClass(), "typedContraints", term3399);
        setField(term3393, term3393.getClass(), "constraints", term3394);
        setField(term3393, term3393.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZoomLevelColumnIndex", argTypes, term3393, args);
    }

};


