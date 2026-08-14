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

public class TileTable_getUserColumns_17939757545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3368;

    public TileTable_getUserColumns_17939757545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3370 = new ArrayList();
        HashMap term3374 = new HashMap();
        term3368 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTable"));
        Object term3369 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term3368, term3368.getClass(), "columns", null);
        setField(term3369, term3369.getClass(), "constraints", term3370);
        setField(term3369, term3369.getClass(), "typedContraints", term3374);
        setField(term3368, term3368.getClass(), "constraints", term3369);
        setField(term3368, term3368.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserColumns", argTypes, term3368, args);
    }

};


