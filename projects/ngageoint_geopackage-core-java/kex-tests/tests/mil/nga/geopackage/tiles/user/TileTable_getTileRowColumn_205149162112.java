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

public class TileTable_getTileRowColumn_205149162112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3448;

    public TileTable_getTileRowColumn_205149162112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3450 = new ArrayList();
        HashMap term3454 = new HashMap();
        term3448 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTable"));
        Object term3449 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term3448, term3448.getClass(), "columns", null);
        setField(term3449, term3449.getClass(), "constraints", term3450);
        setField(term3449, term3449.getClass(), "typedContraints", term3454);
        setField(term3448, term3448.getClass(), "constraints", term3449);
        setField(term3448, term3448.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileRowColumn", argTypes, term3448, args);
    }

};


