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
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class RawConstraint_copy_13708868012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6173;

    public RawConstraint_copy_13708868012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6232 = Class.forName((String) "mil.nga.geopackage.db.table.ConstraintType");
        Field term6231 = ((Class) term6232).getDeclaredField((String) "COLLATE");
        ((Field) term6231).setAccessible(true);
        Object enum21 = ((Field) term6231).get((Object) null);
        Integer term6209 = new Integer(-1339778481);
        term6173 = newInstance(Class.forName("mil.nga.geopackage.db.table.RawConstraint"));
        setField(term6173, term6173.getClass(), "sql", "AijpHYOFuy");
        setField(term6173, term6173.getClass(), "name", "SbAoxhfrkn");
        setField(term6173, term6173.getClass(), "type", enum21);
        setField(term6173, term6173.getClass(), "order", term6209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.RawConstraint");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term6173, args);
    }

};


