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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class UniqueConstraint_copy_18180157008 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9864;

    public UniqueConstraint_copy_18180157008() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9865 = new ArrayList();
        Class<? extends Object> term9904 = Class.forName((String) "mil.nga.geopackage.db.table.ConstraintType");
        Field term9903 = ((Class) term9904).getDeclaredField((String) "UNIQUE");
        ((Field) term9903).setAccessible(true);
        Object enum33 = ((Field) term9903).get((Object) null);
        Integer term9891 = new Integer(1585847225);
        term9864 = newInstance(Class.forName("mil.nga.geopackage.db.table.UniqueConstraint"));
        setField(term9864, term9864.getClass(), "columns", term9865);
        setField(term9864, term9864.getClass(), "name", "WxYUTuqmIq");
        setField(term9864, term9864.getClass(), "type", enum33);
        setField(term9864, term9864.getClass(), "order", term9891);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.UniqueConstraint");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term9864, args);
    }

};


