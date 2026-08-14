package mil.nga.geopackage.dgiwg;

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
import static mil.nga.geopackage.dgiwg.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class DGIWGValidationError_getPrimaryKeys_109782213515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13437;

    public DGIWGValidationError_getPrimaryKeys_109782213515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13601 = Class.forName((String) "mil.nga.geopackage.dgiwg.DGIWGRequirement");
        Field term13600 = ((Class) term13601).getDeclaredField((String) "CRS_2D_VECTOR");
        ((Field) term13600).setAccessible(true);
        Object enum34 = ((Field) term13600).get((Object) null);
        Object term13549 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term13549, term13549.getClass(), "column", "");
        setField(term13549, term13549.getClass(), "value", "");
        Object term13552 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term13552, term13552.getClass(), "column", "");
        setField(term13552, term13552.getClass(), "value", "");
        Object term13555 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term13555, term13555.getClass(), "column", "");
        setField(term13555, term13555.getClass(), "value", "");
        ArrayList term13547 = new ArrayList();
        ((ArrayList) term13547).add(term13549);
        ((ArrayList) term13547).add(term13552);
        ((ArrayList) term13547).add(term13555);
        term13437 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError"));
        setField(term13437, term13437.getClass(), "table", "xIeFjkHkOe");
        setField(term13437, term13437.getClass(), "column", "SdCKLMIYnX");
        setField(term13437, term13437.getClass(), "value", "OJJtVNPyKZ");
        setField(term13437, term13437.getClass(), "constraint", "AKNapTAfmD");
        setField(term13437, term13437.getClass(), "requirement", enum34);
        setField(term13437, term13437.getClass(), "primaryKeys", term13547);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPrimaryKeys", argTypes, term13437, args);
    }

};


