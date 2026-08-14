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

public class TableConstraints_addColumnConstraints_165338734210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8289;
     Object term8306;

    public TableConstraints_addColumnConstraints_165338734210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8291 = new ArrayList();
        HashMap term8295 = new HashMap();
        LinkedHashMap term8300 = new LinkedHashMap();
        term8289 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableConstraints"));
        Object term8290 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term8290, term8290.getClass(), "constraints", term8291);
        setField(term8290, term8290.getClass(), "typedContraints", term8295);
        setField(term8289, term8289.getClass(), "constraints", term8290);
        setField(term8289, term8289.getClass(), "columnConstraints", term8300);
        term8306 = new LinkedHashMap();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.TableConstraints");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term8306;
        callMethod(klass, "addColumnConstraints", argTypes, term8289, args);
    }

};


