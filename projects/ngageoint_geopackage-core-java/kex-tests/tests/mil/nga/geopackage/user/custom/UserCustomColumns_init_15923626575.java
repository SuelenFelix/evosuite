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

public class UserCustomColumns_init_15923626575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122609;

    public UserCustomColumns_init_15923626575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term122610 = new ArrayList();
        ((ArrayList) term122610).add("wKOfSnwiZS");
        ((ArrayList) term122610).add("oIlPhWewqE");
        ((ArrayList) term122610).add("IfOJiWUkHp");
        ((ArrayList) term122610).add("YQNWnfnWil");
        ArrayList term122747 = new ArrayList();
        HashMap term122752 = new HashMap();
        term122609 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns"));
        Object[] term122674 = (Object[]) newArray("java.lang.String", 6);
        setField(term122609, term122609.getClass(), "requiredColumns", term122610);
        setField(term122609, term122609.getClass(), "tableName", "ChmRdUmCnQ");
        setElement(term122674, 0, "WbDSdFiKLp");
        setElement(term122674, 1, "DNeKwjPiYD");
        setElement(term122674, 2, "jxryzEuKJL");
        setElement(term122674, 3, "EPCordSkfF");
        setElement(term122674, 4, "TdSezgsZkW");
        setElement(term122674, 5, "aJlxWEbXVP");
        setField(term122609, term122609.getClass(), "columnNames", term122674);
        setField(term122609, term122609.getClass(), "columns", term122747);
        setBooleanField(term122609, term122609.getClass(), "custom", false);
        setField(term122609, term122609.getClass(), "nameToIndex", term122752);
        setIntField(term122609, term122609.getClass(), "pkIndex", 301401782);
        setBooleanField(term122609, term122609.getClass(), "pkModifiable", true);
        setBooleanField(term122609, term122609.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns");
        Object[] args = new Object[1];
        args[0] = term122609;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


