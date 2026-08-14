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

public class DGIWGValidationError_getConstraint_9247819313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12608;

    public DGIWGValidationError_getConstraint_9247819313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12774 = Class.forName((String) "mil.nga.geopackage.dgiwg.DGIWGRequirement");
        Field term12773 = ((Class) term12774).getDeclaredField((String) "BBOX_CRS");
        ((Field) term12773).setAccessible(true);
        Object enum32 = ((Field) term12773).get((Object) null);
        Object term12716 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term12716, term12716.getClass(), "column", "");
        setField(term12716, term12716.getClass(), "value", "");
        Object term12719 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term12719, term12719.getClass(), "column", "");
        setField(term12719, term12719.getClass(), "value", "");
        Object term12722 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term12722, term12722.getClass(), "column", "");
        setField(term12722, term12722.getClass(), "value", "");
        Object term12725 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term12725, term12725.getClass(), "column", "");
        setField(term12725, term12725.getClass(), "value", "");
        Object term12728 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationKey"));
        setField(term12728, term12728.getClass(), "column", "");
        setField(term12728, term12728.getClass(), "value", "");
        ArrayList term12714 = new ArrayList();
        ((ArrayList) term12714).add(term12716);
        ((ArrayList) term12714).add(term12719);
        ((ArrayList) term12714).add(term12722);
        ((ArrayList) term12714).add(term12725);
        ((ArrayList) term12714).add(term12728);
        term12608 = newInstance(Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError"));
        setField(term12608, term12608.getClass(), "table", "xBsXSDjXYK");
        setField(term12608, term12608.getClass(), "column", "sEnIVFtZuQ");
        setField(term12608, term12608.getClass(), "value", "ZVecLZMLHF");
        setField(term12608, term12608.getClass(), "constraint", "fztQhjqwdP");
        setField(term12608, term12608.getClass(), "requirement", enum32);
        setField(term12608, term12608.getClass(), "primaryKeys", term12714);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("mil.nga.geopackage.dgiwg.DGIWGValidationError");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConstraint", argTypes, term12608, args);
    }

};


