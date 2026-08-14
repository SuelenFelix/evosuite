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

public class TableConstraints_hasTableConstraints_208996533919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8575;

    public TableConstraints_hasTableConstraints_208996533919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8577 = new ArrayList();
        HashMap term8581 = new HashMap();
        LinkedHashMap term8586 = new LinkedHashMap();
        term8575 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableConstraints"));
        Object term8576 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term8576, term8576.getClass(), "constraints", term8577);
        setField(term8576, term8576.getClass(), "typedContraints", term8581);
        setField(term8575, term8575.getClass(), "constraints", term8576);
        setField(term8575, term8575.getClass(), "columnConstraints", term8586);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.TableConstraints");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasTableConstraints", argTypes, term8575, args);
    }

};


