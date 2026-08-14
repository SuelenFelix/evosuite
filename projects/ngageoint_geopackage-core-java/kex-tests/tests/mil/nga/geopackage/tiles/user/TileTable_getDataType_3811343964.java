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

public class TileTable_getDataType_3811343964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3357;

    public TileTable_getDataType_3811343964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3359 = new ArrayList();
        HashMap term3363 = new HashMap();
        term3357 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTable"));
        Object term3358 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term3357, term3357.getClass(), "columns", null);
        setField(term3358, term3358.getClass(), "constraints", term3359);
        setField(term3358, term3358.getClass(), "typedContraints", term3363);
        setField(term3357, term3357.getClass(), "constraints", term3358);
        setField(term3357, term3357.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataType", argTypes, term3357, args);
    }

};


