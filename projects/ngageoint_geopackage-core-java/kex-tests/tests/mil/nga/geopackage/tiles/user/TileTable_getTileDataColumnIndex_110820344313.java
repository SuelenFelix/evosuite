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

public class TileTable_getTileDataColumnIndex_110820344313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3459;

    public TileTable_getTileDataColumnIndex_110820344313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3461 = new ArrayList();
        HashMap term3465 = new HashMap();
        term3459 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTable"));
        Object term3460 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term3459, term3459.getClass(), "columns", null);
        setField(term3460, term3460.getClass(), "constraints", term3461);
        setField(term3460, term3460.getClass(), "typedContraints", term3465);
        setField(term3459, term3459.getClass(), "constraints", term3460);
        setField(term3459, term3459.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileDataColumnIndex", argTypes, term3459, args);
    }

};


