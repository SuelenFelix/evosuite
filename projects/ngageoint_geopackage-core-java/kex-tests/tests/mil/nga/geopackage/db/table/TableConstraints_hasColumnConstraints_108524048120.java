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
import java.util.LinkedHashMap;

public class TableConstraints_hasColumnConstraints_108524048120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8592;

    public TableConstraints_hasColumnConstraints_108524048120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8594 = new ArrayList();
        HashMap term8598 = new HashMap();
        LinkedHashMap term8603 = new LinkedHashMap();
        term8592 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableConstraints"));
        Object term8593 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term8593, term8593.getClass(), "constraints", term8594);
        setField(term8593, term8593.getClass(), "typedContraints", term8598);
        setField(term8592, term8592.getClass(), "constraints", term8593);
        setField(term8592, term8592.getClass(), "columnConstraints", term8603);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.TableConstraints");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasColumnConstraints", argTypes, term8592, args);
    }

};


