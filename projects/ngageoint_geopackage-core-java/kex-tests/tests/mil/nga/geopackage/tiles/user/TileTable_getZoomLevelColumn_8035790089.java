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

public class TileTable_getZoomLevelColumn_8035790089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4964;

    public TileTable_getZoomLevelColumn_8035790089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4966 = new ArrayList();
        HashMap term4970 = new HashMap();
        term4964 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTable"));
        Object term4965 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term4964, term4964.getClass(), "columns", null);
        setField(term4965, term4965.getClass(), "constraints", term4966);
        setField(term4965, term4965.getClass(), "typedContraints", term4970);
        setField(term4964, term4964.getClass(), "constraints", term4965);
        setField(term4964, term4964.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZoomLevelColumn", argTypes, term4964, args);
    }

};


