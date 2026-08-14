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

public class TileTable_getTileColumnColumnIndex_92255525710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4975;

    public TileTable_getTileColumnColumnIndex_92255525710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4977 = new ArrayList();
        HashMap term4981 = new HashMap();
        term4975 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTable"));
        Object term4976 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term4975, term4975.getClass(), "columns", null);
        setField(term4976, term4976.getClass(), "constraints", term4977);
        setField(term4976, term4976.getClass(), "typedContraints", term4981);
        setField(term4975, term4975.getClass(), "constraints", term4976);
        setField(term4975, term4975.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileColumnColumnIndex", argTypes, term4975, args);
    }

};


