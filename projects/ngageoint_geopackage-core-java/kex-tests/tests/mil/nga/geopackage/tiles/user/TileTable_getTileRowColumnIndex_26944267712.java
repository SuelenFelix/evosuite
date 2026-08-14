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

public class TileTable_getTileRowColumnIndex_26944267712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4997;

    public TileTable_getTileRowColumnIndex_26944267712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4999 = new ArrayList();
        HashMap term5003 = new HashMap();
        term4997 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTable"));
        Object term4998 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term4997, term4997.getClass(), "columns", null);
        setField(term4998, term4998.getClass(), "constraints", term4999);
        setField(term4998, term4998.getClass(), "typedContraints", term5003);
        setField(term4997, term4997.getClass(), "constraints", term4998);
        setField(term4997, term4997.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileRowColumnIndex", argTypes, term4997, args);
    }

};


