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

public class UserCustomColumns_updateColumns_2860403726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5140;

    public UserCustomColumns_updateColumns_2860403726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5141 = new ArrayList();
        ArrayList term5170 = new ArrayList();
        HashMap term5175 = new HashMap();
        term5140 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns"));
        Object[] term5157 = (Object[]) newArray("java.lang.String", 1);
        setField(term5140, term5140.getClass(), "requiredColumns", term5141);
        setField(term5140, term5140.getClass(), "tableName", "iIRsCSYqXH");
        setElement(term5157, 0, "nghfqDXyCG");
        setField(term5140, term5140.getClass(), "columnNames", term5157);
        setField(term5140, term5140.getClass(), "columns", term5170);
        setBooleanField(term5140, term5140.getClass(), "custom", true);
        setField(term5140, term5140.getClass(), "nameToIndex", term5175);
        setIntField(term5140, term5140.getClass(), "pkIndex", 679763016);
        setBooleanField(term5140, term5140.getClass(), "pkModifiable", false);
        setBooleanField(term5140, term5140.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateColumns", argTypes, term5140, args);
    }

};


