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

public class ColumnConstraints_getName_7984500191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12517;

    public ColumnConstraints_getName_7984500191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term12531 = new ArrayList();
        HashMap term12535 = new HashMap();
        term12517 = newInstance(Class.forName("mil.nga.geopackage.db.table.ColumnConstraints"));
        Object term12530 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term12517, term12517.getClass(), "name", "GPSEWEDSTo");
        setField(term12530, term12530.getClass(), "constraints", term12531);
        setField(term12530, term12530.getClass(), "typedContraints", term12535);
        setField(term12517, term12517.getClass(), "constraints", term12530);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.ColumnConstraints");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term12517, args);
    }

};


