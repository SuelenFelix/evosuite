package mil.nga.geopackage.user;

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
import static mil.nga.geopackage.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class UserColumn_addConstraints_194418856741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1616;

    public UserColumn_addConstraints_194418856741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1630 = new ArrayList();
        HashMap term1634 = new HashMap();
        term1616 = newInstance(Class.forName("mil.nga.geopackage.db.table.ColumnConstraints"));
        Object term1629 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term1616, term1616.getClass(), "name", "hRNSzYYIrc");
        setField(term1629, term1629.getClass(), "constraints", term1630);
        setField(term1629, term1629.getClass(), "typedContraints", term1634);
        setField(term1616, term1616.getClass(), "constraints", term1629);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.UserColumn");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.table.ColumnConstraints");
        Object[] args = new Object[1];
        args[0] = term1616;
        callMethod(klass, "addConstraints", argTypes, null, args);
    }

};


