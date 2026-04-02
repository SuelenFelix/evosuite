package util;

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
import static util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class DoubleListNode_insertAtPosition_17046149305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term846;
     Object term864;
     Object term882;
     Object term884;

    public DoubleListNode_insertAtPosition_17046149305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term846 = newInstance(Class.forName("util.DoubleListNode"));
        Object term848 = newInstance(Class.forName("util.DoubleListNode"));
        Object term850 = newInstance(Class.forName("util.DoubleListNode"));
        Object term852 = newInstance(Class.forName("util.DoubleListNode"));
        Object term854 = newInstance(Class.forName("util.DoubleListNode"));
        Object term856 = newInstance(Class.forName("util.DoubleListNode"));
        Object term858 = newInstance(Class.forName("util.DoubleListNode"));
        Object term860 = newInstance(Class.forName("util.DoubleListNode"));
        Object term862 = newInstance(Class.forName("util.DoubleListNode"));
        setIntField(term846, term846.getClass(), "val", -1972436591);
        setIntField(term848, term848.getClass(), "val", 68922753);
        setIntField(term850, term850.getClass(), "val", -220791533);
        setIntField(term852, term852.getClass(), "val", 1741500243);
        setIntField(term854, term854.getClass(), "val", -2070466617);
        setField(term854, term854.getClass(), "prev", null);
        setField(term854, term854.getClass(), "next", term848);
        setField(term852, term852.getClass(), "prev", term854);
        setIntField(term856, term856.getClass(), "val", 533197381);
        setField(term856, term856.getClass(), "prev", null);
        setField(term856, term856.getClass(), "next", null);
        setField(term852, term852.getClass(), "next", term856);
        setField(term850, term850.getClass(), "prev", term852);
        setIntField(term858, term858.getClass(), "val", -146054762);
        setIntField(term860, term860.getClass(), "val", 798043553);
        setField(term860, term860.getClass(), "prev", term856);
        setField(term860, term860.getClass(), "next", term846);
        setField(term858, term858.getClass(), "prev", term860);
        setIntField(term862, term862.getClass(), "val", -1127721881);
        setField(term862, term862.getClass(), "prev", null);
        setField(term862, term862.getClass(), "next", term848);
        setField(term858, term858.getClass(), "next", term862);
        setField(term850, term850.getClass(), "next", term858);
        setField(term848, term848.getClass(), "prev", term850);
        setField(term848, term848.getClass(), "next", term858);
        setField(term846, term846.getClass(), "prev", term848);
        setField(term846, term846.getClass(), "next", term854);
        term864 = newInstance(Class.forName("util.DoubleListNode"));
        Object term866 = newInstance(Class.forName("util.DoubleListNode"));
        Object term868 = newInstance(Class.forName("util.DoubleListNode"));
        Object term870 = newInstance(Class.forName("util.DoubleListNode"));
        Object term872 = newInstance(Class.forName("util.DoubleListNode"));
        Object term874 = newInstance(Class.forName("util.DoubleListNode"));
        Object term876 = newInstance(Class.forName("util.DoubleListNode"));
        Object term878 = newInstance(Class.forName("util.DoubleListNode"));
        Object term880 = newInstance(Class.forName("util.DoubleListNode"));
        setIntField(term864, term864.getClass(), "val", 1048271679);
        setIntField(term866, term866.getClass(), "val", -1529797673);
        setIntField(term868, term868.getClass(), "val", -868676396);
        setIntField(term870, term870.getClass(), "val", 1922684808);
        setIntField(term872, term872.getClass(), "val", -2005784375);
        setField(term872, term872.getClass(), "prev", null);
        setField(term872, term872.getClass(), "next", term866);
        setField(term870, term870.getClass(), "prev", term872);
        setIntField(term874, term874.getClass(), "val", 1774507971);
        setField(term874, term874.getClass(), "prev", null);
        setField(term874, term874.getClass(), "next", null);
        setField(term870, term870.getClass(), "next", term874);
        setField(term868, term868.getClass(), "prev", term870);
        setIntField(term876, term876.getClass(), "val", 877649659);
        setIntField(term878, term878.getClass(), "val", -1332748804);
        setField(term878, term878.getClass(), "prev", term874);
        setField(term878, term878.getClass(), "next", term864);
        setField(term876, term876.getClass(), "prev", term878);
        setIntField(term880, term880.getClass(), "val", -288604325);
        setField(term880, term880.getClass(), "prev", null);
        setField(term880, term880.getClass(), "next", term866);
        setField(term876, term876.getClass(), "next", term880);
        setField(term868, term868.getClass(), "next", term876);
        setField(term866, term866.getClass(), "prev", term868);
        setField(term866, term866.getClass(), "next", term876);
        setField(term864, term864.getClass(), "prev", term866);
        setField(term864, term864.getClass(), "next", term872);
        term882 = new Integer(-1420269858);
        term884 = new Integer(-2119545015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.DoubleListNode");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("util.DoubleListNode");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term864;
        args[1] = term882;
        args[2] = term884;
        callMethod(klass, "insertAtPosition", argTypes, term846, args);
    }

};


