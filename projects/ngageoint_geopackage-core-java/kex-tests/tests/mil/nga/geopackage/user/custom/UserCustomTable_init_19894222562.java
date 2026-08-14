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
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;

public class UserCustomTable_init_19894222562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2575;

    public UserCustomTable_init_19894222562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2576 = new ArrayList();
        ((ArrayList) term2576).add("GZdcJyZntS");
        ((ArrayList) term2576).add("OIHoJeysUi");
        ((ArrayList) term2576).add("WXMWFDGcLB");
        ((ArrayList) term2576).add("wKWbJssZuG");
        ((ArrayList) term2576).add("NzBMMhkhpT");
        ArrayList term2701 = new ArrayList();
        HashMap term2706 = new HashMap();
        term2575 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns"));
        Object[] term2652 = (Object[]) newArray("java.lang.String", 4);
        setField(term2575, term2575.getClass(), "requiredColumns", term2576);
        setField(term2575, term2575.getClass(), "tableName", "qCpEbQDHdF");
        setElement(term2652, 0, "AHbZyFOmlo");
        setElement(term2652, 1, "TwfWVQGiIj");
        setElement(term2652, 2, "gUvcueTURF");
        setElement(term2652, 3, "EwQBhZjCIT");
        setField(term2575, term2575.getClass(), "columnNames", term2652);
        setField(term2575, term2575.getClass(), "columns", term2701);
        setBooleanField(term2575, term2575.getClass(), "custom", true);
        setField(term2575, term2575.getClass(), "nameToIndex", term2706);
        setIntField(term2575, term2575.getClass(), "pkIndex", -1179120542);
        setBooleanField(term2575, term2575.getClass(), "pkModifiable", false);
        setBooleanField(term2575, term2575.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomTable");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns");
        Object[] args = new Object[1];
        args[0] = term2575;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


