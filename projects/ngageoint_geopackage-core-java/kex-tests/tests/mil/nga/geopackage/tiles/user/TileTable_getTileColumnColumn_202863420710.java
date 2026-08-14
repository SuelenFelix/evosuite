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

public class TileTable_getTileColumnColumn_202863420710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3426;

    public TileTable_getTileColumnColumn_202863420710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3428 = new ArrayList();
        HashMap term3432 = new HashMap();
        term3426 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTable"));
        Object term3427 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term3426, term3426.getClass(), "columns", null);
        setField(term3427, term3427.getClass(), "constraints", term3428);
        setField(term3427, term3427.getClass(), "typedContraints", term3432);
        setField(term3426, term3426.getClass(), "constraints", term3427);
        setField(term3426, term3426.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTileColumnColumn", argTypes, term3426, args);
    }

};


