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

public class TableConstraints_numColumnConstraints_180406689616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8485;

    public TableConstraints_numColumnConstraints_180406689616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8487 = new ArrayList();
        HashMap term8491 = new HashMap();
        LinkedHashMap term8496 = new LinkedHashMap();
        term8485 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableConstraints"));
        Object term8486 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term8486, term8486.getClass(), "constraints", term8487);
        setField(term8486, term8486.getClass(), "typedContraints", term8491);
        setField(term8485, term8485.getClass(), "constraints", term8486);
        setField(term8485, term8485.getClass(), "columnConstraints", term8496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.TableConstraints");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SPtPatHeOm";
        callMethod(klass, "numColumnConstraints", argTypes, term8485, args);
    }

};


