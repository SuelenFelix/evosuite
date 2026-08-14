package mil.nga.geopackage.extension.related.simple;

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
import static mil.nga.geopackage.extension.related.simple.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class SimpleAttributesTable_getIdColumn_65503069821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term536;

    public SimpleAttributesTable_getIdColumn_65503069821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term562 = new ArrayList();
        HashMap term566 = new HashMap();
        term536 = newInstance(Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTable"));
        Object term561 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term536, term536.getClass(), "relationName", "RkybSrpybU");
        setField(term536, term536.getClass(), "dataType", "xOEqzGAmDU");
        setField(term536, term536.getClass(), "columns", null);
        setField(term561, term561.getClass(), "constraints", term562);
        setField(term561, term561.getClass(), "typedContraints", term566);
        setField(term536, term536.getClass(), "constraints", term561);
        setField(term536, term536.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.extension.related.simple.SimpleAttributesTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIdColumn", argTypes, term536, args);
    }

};


