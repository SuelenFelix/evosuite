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

public class TableConstraints_addColumnConstraint_7159210136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8160;

    public TableConstraints_addColumnConstraint_7159210136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8162 = new ArrayList();
        HashMap term8166 = new HashMap();
        LinkedHashMap term8171 = new LinkedHashMap();
        term8160 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableConstraints"));
        Object term8161 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term8161, term8161.getClass(), "constraints", term8162);
        setField(term8161, term8161.getClass(), "typedContraints", term8166);
        setField(term8160, term8160.getClass(), "constraints", term8161);
        setField(term8160, term8160.getClass(), "columnConstraints", term8171);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.TableConstraints");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("mil.nga.geopackage.db.table.Constraint");
        Object[] args = new Object[2];
        args[0] = "ypEdrstygY";
        args[1] = null;
        callMethod(klass, "addColumnConstraint", argTypes, term8160, args);
    }

};


