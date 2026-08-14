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

public class TileTable_getZoomLevelColumn_8035790088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3404;

    public TileTable_getZoomLevelColumn_8035790088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3406 = new ArrayList();
        HashMap term3410 = new HashMap();
        term3404 = newInstance(Class.forName("mil.nga.geopackage.tiles.user.TileTable"));
        Object term3405 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term3404, term3404.getClass(), "columns", null);
        setField(term3405, term3405.getClass(), "constraints", term3406);
        setField(term3405, term3405.getClass(), "typedContraints", term3410);
        setField(term3404, term3404.getClass(), "constraints", term3405);
        setField(term3404, term3404.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.tiles.user.TileTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZoomLevelColumn", argTypes, term3404, args);
    }

};


