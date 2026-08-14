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

public class TileTable_getTileDataColumn_204811220514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3470;

    public TileTable_getTileDataColumn_204811220514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3472 = new ArrayList();
        HashMap term3476 = new HashMap();
        term3470 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTable"));
        Object term3471 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term3470, term3470.getClass(), "columns", null);
        setField(term3471, term3471.getClass(), "constraints", term3472);
        setField(term3471, term3471.getClass(), "typedContraints", term3476);
        setField(term3470, term3470.getClass(), "constraints", term3471);
        setField(term3470, term3470.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileDataColumn", argTypes, term3470, args);
    }

};


