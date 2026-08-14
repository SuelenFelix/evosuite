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

public class UserCustomTable_createUserColumns_17481587287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2864;
     Object term2875;

    public UserCustomTable_createUserColumns_17481587287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2866 = new ArrayList();
        HashMap term2870 = new HashMap();
        term2864 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomTable"));
        Object term2865 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term2864, term2864.getClass(), "columns", null);
        setField(term2865, term2865.getClass(), "constraints", term2866);
        setField(term2865, term2865.getClass(), "typedContraints", term2870);
        setField(term2864, term2864.getClass(), "constraints", term2865);
        setField(term2864, term2864.getClass(), "contents", null);
        term2875 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2875;
        callMethod(klass, "createUserColumns", argTypes, term2864, args);
    }

};


