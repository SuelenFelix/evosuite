package mil.nga.geopackage.user.custom;

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
import static mil.nga.geopackage.user.custom.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;

public class UserCustomTable_getRequiredColumns_11701848339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6309;

    public UserCustomTable_getRequiredColumns_11701848339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6311 = new ArrayList();
        HashMap term6315 = new HashMap();
        term6309 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomTable"));
        Object term6310 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term6309, term6309.getClass(), "columns", null);
        setField(term6310, term6310.getClass(), "constraints", term6311);
        setField(term6310, term6310.getClass(), "typedContraints", term6315);
        setField(term6309, term6309.getClass(), "constraints", term6310);
        setField(term6309, term6309.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequiredColumns", argTypes, term6309, args);
    }

};


