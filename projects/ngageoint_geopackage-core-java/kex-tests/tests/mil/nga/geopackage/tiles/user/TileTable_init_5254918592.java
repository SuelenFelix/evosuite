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

public class TileTable_init_5254918592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3335;

    public TileTable_init_5254918592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3337 = new ArrayList();
        HashMap term3341 = new HashMap();
        term3335 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTable"));
        Object term3336 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term3335, term3335.getClass(), "columns", null);
        setField(term3336, term3336.getClass(), "constraints", term3337);
        setField(term3336, term3336.getClass(), "typedContraints", term3341);
        setField(term3335, term3335.getClass(), "constraints", term3336);
        setField(term3335, term3335.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.tiles.user.TileTable");
        Object[] args = new Object[1];
        args[0] = term3335;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


