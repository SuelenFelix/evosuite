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

public class TableConstraints_getColumnConstraints_180137878512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8371;

    public TableConstraints_getColumnConstraints_180137878512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8373 = new ArrayList();
        HashMap term8377 = new HashMap();
        LinkedHashMap term8382 = new LinkedHashMap();
        term8371 = newInstance(Class.forName("mil.nga.geopackage.db.table.TableConstraints"));
        Object term8372 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term8372, term8372.getClass(), "constraints", term8373);
        setField(term8372, term8372.getClass(), "typedContraints", term8377);
        setField(term8371, term8371.getClass(), "constraints", term8372);
        setField(term8371, term8371.getClass(), "columnConstraints", term8382);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.TableConstraints");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColumnConstraints", argTypes, term8371, args);
    }

};


