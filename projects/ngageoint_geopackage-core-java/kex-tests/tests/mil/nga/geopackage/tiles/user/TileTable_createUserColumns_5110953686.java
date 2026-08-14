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
import java.util.LinkedList;

public class TileTable_createUserColumns_5110953686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3379;
     Object term3390;

    public TileTable_createUserColumns_5110953686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3381 = new ArrayList();
        HashMap term3385 = new HashMap();
        term3379 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTable"));
        Object term3380 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term3379, term3379.getClass(), "columns", null);
        setField(term3380, term3380.getClass(), "constraints", term3381);
        setField(term3380, term3380.getClass(), "typedContraints", term3385);
        setField(term3379, term3379.getClass(), "constraints", term3380);
        setField(term3379, term3379.getClass(), "contents", null);
        term3390 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term3390;
        callMethod(klass, "createUserColumns", argTypes, term3379, args);
    }

};


