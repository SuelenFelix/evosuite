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

public class UserCustomColumns_getRequiredColumns_4570024507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5209;

    public UserCustomColumns_getRequiredColumns_4570024507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5210 = new ArrayList();
        ((ArrayList) term5210).add("PqtVXXZMqK");
        ((ArrayList) term5210).add("rYbtIDVdnd");
        ArrayList term5335 = new ArrayList();
        HashMap term5340 = new HashMap();
        term5209 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns"));
        Object[] term5250 = (Object[]) newArray("java.lang.String", 7);
        setField(term5209, term5209.getClass(), "requiredColumns", term5210);
        setField(term5209, term5209.getClass(), "tableName", "UKAReurpHG");
        setElement(term5250, 0, "WVRMUmrljA");
        setElement(term5250, 1, "NTlKJDDWlk");
        setElement(term5250, 2, "vOuMEpOQAg");
        setElement(term5250, 3, "SIODFGaQhr");
        setElement(term5250, 4, "qYzsiuXOgS");
        setElement(term5250, 5, "bxrCBbrrct");
        setElement(term5250, 6, "CKWpJaaaxX");
        setField(term5209, term5209.getClass(), "columnNames", term5250);
        setField(term5209, term5209.getClass(), "columns", term5335);
        setBooleanField(term5209, term5209.getClass(), "custom", true);
        setField(term5209, term5209.getClass(), "nameToIndex", term5340);
        setIntField(term5209, term5209.getClass(), "pkIndex", 1962444399);
        setBooleanField(term5209, term5209.getClass(), "pkModifiable", true);
        setBooleanField(term5209, term5209.getClass(), "valueValidation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequiredColumns", argTypes, term5209, args);
    }

};


