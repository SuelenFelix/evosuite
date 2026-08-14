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

public class UserCustomColumns_updateColumns_2860403727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123209;

    public UserCustomColumns_updateColumns_2860403727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term123210 = new ArrayList();
        ArrayList term123335 = new ArrayList();
        HashMap term123340 = new HashMap();
        term123209 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns"));
        Object[] term123226 = (Object[]) newArray("java.lang.String", 9);
        setField(term123209, term123209.getClass(), "requiredColumns", term123210);
        setField(term123209, term123209.getClass(), "tableName", "YNXNgIokRz");
        setElement(term123226, 0, "XRDgUBBIlB");
        setElement(term123226, 1, "kWMQGdvKwx");
        setElement(term123226, 2, "zRwnGNjqEc");
        setElement(term123226, 3, "PadBNsKGSM");
        setElement(term123226, 4, "BqLgONTWcn");
        setElement(term123226, 5, "QyyvfuUsSl");
        setElement(term123226, 6, "urXLfQoyuc");
        setElement(term123226, 7, "KoWkwRBvcY");
        setElement(term123226, 8, "kqDHOsurKa");
        setField(term123209, term123209.getClass(), "columnNames", term123226);
        setField(term123209, term123209.getClass(), "columns", term123335);
        setBooleanField(term123209, term123209.getClass(), "custom", true);
        setField(term123209, term123209.getClass(), "nameToIndex", term123340);
        setIntField(term123209, term123209.getClass(), "pkIndex", 808203320);
        setBooleanField(term123209, term123209.getClass(), "pkModifiable", false);
        setBooleanField(term123209, term123209.getClass(), "valueValidation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateColumns", argTypes, term123209, args);
    }

};


