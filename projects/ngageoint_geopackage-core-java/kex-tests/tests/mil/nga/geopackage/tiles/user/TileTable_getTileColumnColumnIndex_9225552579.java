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

public class TileTable_getTileColumnColumnIndex_9225552579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3415;

    public TileTable_getTileColumnColumnIndex_9225552579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3417 = new ArrayList();
        HashMap term3421 = new HashMap();
        term3415 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTable"));
        Object term3416 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term3415, term3415.getClass(), "columns", null);
        setField(term3416, term3416.getClass(), "constraints", term3417);
        setField(term3416, term3416.getClass(), "typedContraints", term3421);
        setField(term3415, term3415.getClass(), "constraints", term3416);
        setField(term3415, term3415.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileColumnColumnIndex", argTypes, term3415, args);
    }

};


