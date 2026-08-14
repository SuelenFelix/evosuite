package mil.nga.geopackage.db.table;

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
import static mil.nga.geopackage.db.table.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class ColumnConstraints_getConstraints_11093432536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12682;

    public ColumnConstraints_getConstraints_11093432536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12696 = new ArrayList();
        HashMap term12700 = new HashMap();
        term12682 = newInstance(Class.forName("mil.nga.geopackage.db.table.ColumnConstraints"));
        Object term12695 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term12682, term12682.getClass(), "name", "RxbhrFBjkO");
        setField(term12695, term12695.getClass(), "constraints", term12696);
        setField(term12695, term12695.getClass(), "typedContraints", term12700);
        setField(term12682, term12682.getClass(), "constraints", term12695);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.ColumnConstraints");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConstraints", argTypes, term12682, args);
    }

};


