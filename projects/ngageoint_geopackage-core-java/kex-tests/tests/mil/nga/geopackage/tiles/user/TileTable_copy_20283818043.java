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

public class TileTable_copy_20283818043 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3346;

    public TileTable_copy_20283818043() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3348 = new ArrayList();
        HashMap term3352 = new HashMap();
        term3346 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTable"));
        Object term3347 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term3346, term3346.getClass(), "columns", null);
        setField(term3347, term3347.getClass(), "constraints", term3348);
        setField(term3347, term3347.getClass(), "typedContraints", term3352);
        setField(term3346, term3346.getClass(), "constraints", term3347);
        setField(term3346, term3346.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term3346, args);
    }

};


