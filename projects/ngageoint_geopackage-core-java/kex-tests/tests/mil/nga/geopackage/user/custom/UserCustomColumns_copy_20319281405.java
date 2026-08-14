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

public class UserCustomColumns_copy_20319281405 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4829;

    public UserCustomColumns_copy_20319281405() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4830 = new ArrayList();
        ((ArrayList) term4830).add("AHbZyFOmlo");
        ((ArrayList) term4830).add("TwfWVQGiIj");
        ((ArrayList) term4830).add("gUvcueTURF");
        ((ArrayList) term4830).add("EwQBhZjCIT");
        ((ArrayList) term4830).add("aSkmSwTnEw");
        ((ArrayList) term4830).add("xvkbvaEGYd");
        ((ArrayList) term4830).add("HBGNxdNURv");
        ((ArrayList) term4830).add("mfCpTPPQQm");
        ((ArrayList) term4830).add("OcJCIDNIXA");
        ArrayList term4991 = new ArrayList();
        HashMap term4996 = new HashMap();
        term4829 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns"));
        Object[] term4954 = (Object[]) newArray("java.lang.String", 3);
        setField(term4829, term4829.getClass(), "requiredColumns", term4830);
        setField(term4829, term4829.getClass(), "tableName", "XfRABIFVEp");
        setElement(term4954, 0, "MHGKyEnwKc");
        setElement(term4954, 1, "ShIELyuULw");
        setElement(term4954, 2, "IpQuOGMgmj");
        setField(term4829, term4829.getClass(), "columnNames", term4954);
        setField(term4829, term4829.getClass(), "columns", term4991);
        setBooleanField(term4829, term4829.getClass(), "custom", true);
        setField(term4829, term4829.getClass(), "nameToIndex", term4996);
        setIntField(term4829, term4829.getClass(), "pkIndex", -1145578966);
        setBooleanField(term4829, term4829.getClass(), "pkModifiable", true);
        setBooleanField(term4829, term4829.getClass(), "valueValidation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term4829, args);
    }

};


