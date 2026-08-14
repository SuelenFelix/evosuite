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

public class TileTable_validateContents_57736680019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3489;

    public TileTable_validateContents_57736680019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3491 = new ArrayList();
        HashMap term3495 = new HashMap();
        term3489 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTable"));
        Object term3490 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term3489, term3489.getClass(), "columns", null);
        setField(term3490, term3490.getClass(), "constraints", term3491);
        setField(term3490, term3490.getClass(), "typedContraints", term3495);
        setField(term3489, term3489.getClass(), "constraints", term3490);
        setField(term3489, term3489.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.contents.Contents");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "validateContents", argTypes, term3489, args);
    }

};


