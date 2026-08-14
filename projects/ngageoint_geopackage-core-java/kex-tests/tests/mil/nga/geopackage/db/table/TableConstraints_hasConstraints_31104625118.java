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

public class TableConstraints_hasConstraints_31104625118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8558;

    public TableConstraints_hasConstraints_31104625118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8560 = new ArrayList();
        HashMap term8564 = new HashMap();
        LinkedHashMap term8569 = new LinkedHashMap();
        term8558 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableConstraints"));
        Object term8559 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term8559, term8559.getClass(), "constraints", term8560);
        setField(term8559, term8559.getClass(), "typedContraints", term8564);
        setField(term8558, term8558.getClass(), "constraints", term8559);
        setField(term8558, term8558.getClass(), "columnConstraints", term8569);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.TableConstraints");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasConstraints", argTypes, term8558, args);
    }

};


