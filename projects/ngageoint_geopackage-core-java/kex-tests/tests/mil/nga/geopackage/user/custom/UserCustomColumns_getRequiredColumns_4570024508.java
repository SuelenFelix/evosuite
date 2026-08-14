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

public class UserCustomColumns_getRequiredColumns_4570024508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123454;

    public UserCustomColumns_getRequiredColumns_4570024508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term123455 = new ArrayList();
        ((ArrayList) term123455).add("eFSnWGCXQK");
        ((ArrayList) term123455).add("GrrqChmbDB");
        ((ArrayList) term123455).add("AOUZgesZGu");
        ((ArrayList) term123455).add("RApShxzpug");
        ((ArrayList) term123455).add("aygFZPbIko");
        ((ArrayList) term123455).add("hUhlDCVWIF");
        ((ArrayList) term123455).add("GjzKvoPaBR");
        ((ArrayList) term123455).add("VZRLekBSXz");
        ((ArrayList) term123455).add("XfdYCOWEXZ");
        ArrayList term123580 = new ArrayList();
        HashMap term123585 = new HashMap();
        term123454 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns"));
        Object[] term123579 = (Object[]) newArray("java.lang.String", 0);
        setField(term123454, term123454.getClass(), "requiredColumns", term123455);
        setField(term123454, term123454.getClass(), "tableName", "aPbJKoMxFL");
        setField(term123454, term123454.getClass(), "columnNames", term123579);
        setField(term123454, term123454.getClass(), "columns", term123580);
        setBooleanField(term123454, term123454.getClass(), "custom", true);
        setField(term123454, term123454.getClass(), "nameToIndex", term123585);
        setIntField(term123454, term123454.getClass(), "pkIndex", -544382127);
        setBooleanField(term123454, term123454.getClass(), "pkModifiable", false);
        setBooleanField(term123454, term123454.getClass(), "valueValidation", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequiredColumns", argTypes, term123454, args);
    }

};


