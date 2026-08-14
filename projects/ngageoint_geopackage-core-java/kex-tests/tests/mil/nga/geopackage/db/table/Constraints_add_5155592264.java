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
import java.util.HashMap;

public class Constraints_add_5155592264 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1985;
     Object term1995;

    public Constraints_add_5155592264() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1986 = new ArrayList();
        HashMap term1990 = new HashMap();
        term1985 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term1985, term1985.getClass(), "constraints", term1986);
        setField(term1985, term1985.getClass(), "typedContraints", term1990);
        ArrayList term1996 = new ArrayList();
        HashMap term2000 = new HashMap();
        term1995 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term1995, term1995.getClass(), "constraints", term1996);
        setField(term1995, term1995.getClass(), "typedContraints", term2000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.db.table.Constraints");
        Object[] args = new Object[1];
        args[0] = term1995;
        callMethod(klass, "add", argTypes, term1985, args);
    }

};


