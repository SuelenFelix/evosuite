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

public class UserCustomColumns_copy_20319281406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122876;

    public UserCustomColumns_copy_20319281406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term122877 = new ArrayList();
        ((ArrayList) term122877).add("BMskFMPoeb");
        ((ArrayList) term122877).add("LdfzgJfEqK");
        ((ArrayList) term122877).add("YdzBhsGATX");
        ((ArrayList) term122877).add("IxrOGCWNvM");
        ((ArrayList) term122877).add("ixwssTuJbB");
        ((ArrayList) term122877).add("IXdiuaFyFC");
        ArrayList term123050 = new ArrayList();
        HashMap term123055 = new HashMap();
        term122876 = newInstance(Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns"));
        Object[] term122965 = (Object[]) newArray("java.lang.String", 7);
        setField(term122876, term122876.getClass(), "requiredColumns", term122877);
        setField(term122876, term122876.getClass(), "tableName", "CLVzSrhOjS");
        setElement(term122965, 0, "OrrgHDCMip");
        setElement(term122965, 1, "mEYsXJvgdv");
        setElement(term122965, 2, "JKbmIUKwNm");
        setElement(term122965, 3, "rftaOUctkN");
        setElement(term122965, 4, "BqodsrSZso");
        setElement(term122965, 5, "APQYHLBKit");
        setElement(term122965, 6, "tIucnzigbY");
        setField(term122876, term122876.getClass(), "columnNames", term122965);
        setField(term122876, term122876.getClass(), "columns", term123050);
        setBooleanField(term122876, term122876.getClass(), "custom", false);
        setField(term122876, term122876.getClass(), "nameToIndex", term123055);
        setIntField(term122876, term122876.getClass(), "pkIndex", 1988605357);
        setBooleanField(term122876, term122876.getClass(), "pkModifiable", true);
        setBooleanField(term122876, term122876.getClass(), "valueValidation", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.user.custom.UserCustomColumns");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term122876, args);
    }

};


