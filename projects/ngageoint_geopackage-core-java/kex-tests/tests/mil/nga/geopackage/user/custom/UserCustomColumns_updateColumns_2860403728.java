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

public class UserCustomColumns_updateColumns_2860403728 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2150;

    public UserCustomColumns_updateColumns_2860403728() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2151 = new ArrayList();
        ((ArrayList) term2151).add("lFRJFUMVbx");
        ((ArrayList) term2151).add("sZdUNdggUW");
        ((ArrayList) term2151).add("OqbwYQfvAe");
        ((ArrayList) term2151).add("tRxZafjqIx");
        ((ArrayList) term2151).add("DhjNLmRMCu");
        ((ArrayList) term2151).add("PgPzMSEjjX");
        ((ArrayList) term2151).add("wzsPSPcRdj");
        ((ArrayList) term2151).add("kGMQdqJYyB");
        ((ArrayList) term2151).add("XJJNClzHRf");
        ArrayList term2312 = new ArrayList();
        HashMap term2317 = new HashMap();
        term2150 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns"));
        Object[] term2275 = (Object[]) newArray("java.lang.String", 3);
        setField(term2150, term2150.getClass(), "requiredColumns", term2151);
        setField(term2150, term2150.getClass(), "tableName", "HDaezxQfQR");
        setElement(term2275, 0, "iikZEapDlu");
        setElement(term2275, 1, "nhoHrZfnIN");
        setElement(term2275, 2, "ZkMALXpEAZ");
        setField(term2150, term2150.getClass(), "columnNames", term2275);
        setField(term2150, term2150.getClass(), "columns", term2312);
        setBooleanField(term2150, term2150.getClass(), "custom", true);
        setField(term2150, term2150.getClass(), "nameToIndex", term2317);
        setIntField(term2150, term2150.getClass(), "pkIndex", -1275173084);
        setBooleanField(term2150, term2150.getClass(), "pkModifiable", false);
        setBooleanField(term2150, term2150.getClass(), "valueValidation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateColumns", argTypes, term2150, args);
    }

};


