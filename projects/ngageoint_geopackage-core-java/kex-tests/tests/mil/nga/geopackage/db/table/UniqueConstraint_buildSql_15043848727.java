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

public class UniqueConstraint_buildSql_15043848727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9590;

    public UniqueConstraint_buildSql_15043848727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9591 = new ArrayList();
        Class<? extends Object> term9630 = Class.forName((String) "mil.nga.geopackage.db.table.ConstraintType");
        Field term9629 = ((Class) term9630).getDeclaredField((String) "UNIQUE");
        ((Field) term9629).setAccessible(true);
        Object enum32 = ((Field) term9629).get((Object) null);
        Integer term9617 = new Integer(-883034806);
        term9590 = newInstance(Class.forName("mil.nga.geopackage.db.table.UniqueConstraint"));
        setField(term9590, term9590.getClass(), "columns", term9591);
        setField(term9590, term9590.getClass(), "name", "SPBstwKFVr");
        setField(term9590, term9590.getClass(), "type", enum32);
        setField(term9590, term9590.getClass(), "order", term9617);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.UniqueConstraint");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "buildSql", argTypes, term9590, args);
    }

};


