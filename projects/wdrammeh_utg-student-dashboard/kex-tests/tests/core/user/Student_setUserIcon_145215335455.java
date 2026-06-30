package core.user;

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
import static core.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Student_setUserIcon_145215335455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2243;

    public Student_setUserIcon_145215335455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2243 = newInstance(Class.forName("javax.swing.ImageIcon"));
        Object term2256 = newInstance(Class.forName("java.net.URL"));
        Object term2300 = newInstance(Class.forName("sun.net.www.protocol.http.Handler"));
        Object term2317 = newInstance(Class.forName("javax.swing.ImageIcon$AccessibleImageIcon"));
        Object term2342 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term2343 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term2344 = newInstance(Class.forName("java.lang.Object"));
        Object term2345 = newInstance(Class.forName("javax.accessibility.AccessibleRelationSet"));
        Object term2346 = newInstance(Class.forName("java.util.Vector"));
        Object[] term2347 = (Object[]) newArray("java.lang.Object", 10);
        Object term2351 = newInstance(Class.forName("java.lang.Object"));
        setField(term2243, term2243.getClass(), "filename", "IoAlmYsBwc");
        setField(term2256, term2256.getClass(), "protocol", "http");
        setField(term2256, term2256.getClass(), "host", "www.oracle.com");
        setIntField(term2256, term2256.getClass(), "port", -1);
        setField(term2256, term2256.getClass(), "file", "");
        setField(term2256, term2256.getClass(), "query", null);
        setField(term2256, term2256.getClass(), "authority", "www.oracle.com");
        setField(term2256, term2256.getClass(), "path", "");
        setField(term2256, term2256.getClass(), "userInfo", null);
        setField(term2256, term2256.getClass(), "ref", null);
        setField(term2256, term2256.getClass(), "hostAddress", null);
        setField(term2300, term2300.getClass(), "proxy", null);
        setIntField(term2300, term2300.getClass(), "proxyPort", -1);
        setField(term2256, term2256.getClass(), "handler", term2300);
        setField(term2256, term2256.getClass(), "tempState", null);
        setField(term2243, term2243.getClass(), "location", term2256);
        setField(term2243, term2243.getClass(), "image", null);
        setIntField(term2243, term2243.getClass(), "loadStatus", -1145578966);
        setField(term2243, term2243.getClass(), "imageObserver", null);
        setField(term2243, term2243.getClass(), "description", "TEParAifyi");
        setIntField(term2243, term2243.getClass(), "width", -1);
        setIntField(term2243, term2243.getClass(), "height", -1);
        setField(term2317, term2317.getClass(), "this$0", null);
        setField(term2317, term2317.getClass(), "targetAppContext", null);
        setField(term2317, term2317.getClass(), "accessibleParent", null);
        setField(term2317, term2317.getClass(), "accessibleName", "OWDIEULEFu");
        setField(term2317, term2317.getClass(), "accessibleDescription", "dWRymuLBtr");
        setField(term2343, term2343.getClass(), "map", null);
        setField(term2342, term2342.getClass(), "map", term2343);
        setField(term2342, term2342.getClass(), "source", term2344);
        setField(term2317, term2317.getClass(), "accessibleChangeSupport", term2342);
        setField(term2346, term2346.getClass(), "elementData", term2347);
        setIntField(term2346, term2346.getClass(), "elementCount", 4);
        setIntField(term2346, term2346.getClass(), "capacityIncrement", 0);
        setIntField(term2346, term2346.getClass(), "modCount", 4);
        setField(term2345, term2345.getClass(), "relations", term2346);
        setField(term2317, term2317.getClass(), "relationSet", term2345);
        setField(term2317, term2317.getClass(), "nativeAXResource", term2351);
        setField(term2243, term2243.getClass(), "accessibleContext", term2317);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.user.Student");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.ImageIcon");
        Object[] args = new Object[1];
        args[0] = term2243;
        callMethod(klass, "setUserIcon", argTypes, null, args);
    }

};


