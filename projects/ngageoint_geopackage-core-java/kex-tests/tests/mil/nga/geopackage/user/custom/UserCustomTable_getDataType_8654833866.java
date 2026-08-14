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

public class UserCustomTable_getDataType_8654833866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6273;

    public UserCustomTable_getDataType_8654833866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6275 = new ArrayList();
        HashMap term6279 = new HashMap();
        term6273 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomTable"));
        Object term6274 = newInstance(Class.forName("mil.nga.geopackage.db.table.Constraints"));
        setField(term6273, term6273.getClass(), "columns", null);
        setField(term6274, term6274.getClass(), "constraints", term6275);
        setField(term6274, term6274.getClass(), "typedContraints", term6279);
        setField(term6273, term6273.getClass(), "constraints", term6274);
        setField(term6273, term6273.getClass(), "contents", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomTable");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataType", argTypes, term6273, args);
    }

};


