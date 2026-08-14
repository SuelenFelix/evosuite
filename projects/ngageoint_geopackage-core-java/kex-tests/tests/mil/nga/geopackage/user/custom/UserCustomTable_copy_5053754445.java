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

public class UserCustomTable_copy_5053754445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6262;

    public UserCustomTable_copy_5053754445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6264 = new ArrayList();
        HashMap term6268 = new HashMap();
        term6262 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomTable"));
        Object term6263 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term6262, term6262.getClass(), "columns", null);
        setField(term6263, term6263.getClass(), "constraints", term6264);
        setField(term6263, term6263.getClass(), "typedContraints", term6268);
        setField(term6262, term6262.getClass(), "constraints", term6263);
        setField(term6262, term6262.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term6262, args);
    }

};


