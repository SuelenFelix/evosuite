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

public class RawConstraint_setTypeFromSql_4246446899 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5229;

    public RawConstraint_setTypeFromSql_4246446899() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5300 = Class.forName((String) "mil.nga.geopackage.db.table.ConstraintType");
        Field term5299 = ((Class) term5300).getDeclaredField((String) "DEFAULT");
        ((Field) term5299).setAccessible(true);
        Object enum18 = ((Field) term5299).get((Object) null);
        Integer term5265 = new Integer(-1955890973);
        term5229 = newInstance(Class.forName("mil.nga.geopackage.db.table.RawConstraint"));
        setField(term5229, term5229.getClass(), "sql", "BYqFIqCKAV");
        setField(term5229, term5229.getClass(), "name", "vrQLuWIDJX");
        setField(term5229, term5229.getClass(), "type", enum18);
        setField(term5229, term5229.getClass(), "order", term5265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.RawConstraint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "flxyYxBRtu";
        callMethod(klass, "setTypeFromSql", argTypes, term5229, args);
    }

};


