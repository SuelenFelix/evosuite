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
import java.util.LinkedList;

public class UserCustomTable_createUserColumns_17481587288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6295;
     Object term6306;

    public UserCustomTable_createUserColumns_17481587288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6297 = new ArrayList();
        HashMap term6301 = new HashMap();
        term6295 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomTable"));
        Object term6296 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term6295, term6295.getClass(), "columns", null);
        setField(term6296, term6296.getClass(), "constraints", term6297);
        setField(term6296, term6296.getClass(), "typedContraints", term6301);
        setField(term6295, term6295.getClass(), "constraints", term6296);
        setField(term6295, term6295.getClass(), "contents", null);
        term6306 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term6306;
        callMethod(klass, "createUserColumns", argTypes, term6295, args);
    }

};


