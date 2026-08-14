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

public class TableConstraints_getOrCreateColumnConstraints_19210674919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8250;

    public TableConstraints_getOrCreateColumnConstraints_19210674919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8252 = new ArrayList();
        HashMap term8256 = new HashMap();
        LinkedHashMap term8261 = new LinkedHashMap();
        term8250 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableConstraints"));
        Object term8251 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term8251, term8251.getClass(), "constraints", term8252);
        setField(term8251, term8251.getClass(), "typedContraints", term8256);
        setField(term8250, term8250.getClass(), "constraints", term8251);
        setField(term8250, term8250.getClass(), "columnConstraints", term8261);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.TableConstraints");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WVbxuoDBcn";
        callMethod(klass, "getOrCreateColumnConstraints", argTypes, term8250, args);
    }

};


