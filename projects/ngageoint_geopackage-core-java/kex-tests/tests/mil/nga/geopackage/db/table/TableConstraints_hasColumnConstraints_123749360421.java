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

public class TableConstraints_hasColumnConstraints_123749360421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8609;

    public TableConstraints_hasColumnConstraints_123749360421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8611 = new ArrayList();
        HashMap term8615 = new HashMap();
        LinkedHashMap term8620 = new LinkedHashMap();
        term8609 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableConstraints"));
        Object term8610 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term8610, term8610.getClass(), "constraints", term8611);
        setField(term8610, term8610.getClass(), "typedContraints", term8615);
        setField(term8609, term8609.getClass(), "constraints", term8610);
        setField(term8609, term8609.getClass(), "columnConstraints", term8620);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.TableConstraints");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ywmcuThdfL";
        callMethod(klass, "hasColumnConstraints", argTypes, term8609, args);
    }

};


