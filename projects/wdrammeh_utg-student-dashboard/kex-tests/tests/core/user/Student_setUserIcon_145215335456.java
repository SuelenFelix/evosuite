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

public class Student_setUserIcon_145215335456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297448;

    public Student_setUserIcon_145215335456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term297448 = newInstance(Class.forName("javax.swing.ImageIcon"));
        Object term297461 = newInstance(Class.forName("java.net.URL"));
        Object term297506 = newInstance(Class.forName("sun.net.www.protocol.https.Handler"));
        Object term297524 = newInstance(Class.forName("javax.swing.ImageIcon$AccessibleImageIcon"));
        Object term297549 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term297550 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term297551 = newInstance(Class.forName("java.lang.Object"));
        Object term297552 = newInstance(Class.forName("javax.accessibility.AccessibleRelationSet"));
        Object term297553 = newInstance(Class.forName("java.util.Vector"));
        Object[] term297554 = (Object[]) newArray("java.lang.Object", 10);
        Object term297558 = newInstance(Class.forName("java.lang.Object"));
        setField(term297448, term297448.getClass(), "filename", "COhzwXcfds");
        setField(term297461, term297461.getClass(), "protocol", "https");
        setField(term297461, term297461.getClass(), "host", "www.github.com");
        setIntField(term297461, term297461.getClass(), "port", -1);
        setField(term297461, term297461.getClass(), "file", "");
        setField(term297461, term297461.getClass(), "query", null);
        setField(term297461, term297461.getClass(), "authority", "www.github.com");
        setField(term297461, term297461.getClass(), "path", "");
        setField(term297461, term297461.getClass(), "userInfo", null);
        setField(term297461, term297461.getClass(), "ref", null);
        setField(term297461, term297461.getClass(), "hostAddress", null);
        setField(term297506, term297506.getClass(), "proxy", null);
        setIntField(term297506, term297506.getClass(), "proxyPort", -1);
        setField(term297461, term297461.getClass(), "handler", term297506);
        setField(term297461, term297461.getClass(), "tempState", null);
        setField(term297448, term297448.getClass(), "location", term297461);
        setField(term297448, term297448.getClass(), "image", null);
        setIntField(term297448, term297448.getClass(), "loadStatus", 98801346);
        setField(term297448, term297448.getClass(), "imageObserver", null);
        setField(term297448, term297448.getClass(), "description", "anncJTnzrg");
        setIntField(term297448, term297448.getClass(), "width", -1);
        setIntField(term297448, term297448.getClass(), "height", -1);
        setField(term297524, term297524.getClass(), "this$0", null);
        setField(term297524, term297524.getClass(), "targetAppContext", null);
        setField(term297524, term297524.getClass(), "accessibleParent", null);
        setField(term297524, term297524.getClass(), "accessibleName", "GMylOocLnB");
        setField(term297524, term297524.getClass(), "accessibleDescription", "spOehuHwSl");
        setField(term297550, term297550.getClass(), "map", null);
        setField(term297549, term297549.getClass(), "map", term297550);
        setField(term297549, term297549.getClass(), "source", term297551);
        setField(term297524, term297524.getClass(), "accessibleChangeSupport", term297549);
        setField(term297553, term297553.getClass(), "elementData", term297554);
        setIntField(term297553, term297553.getClass(), "elementCount", 5);
        setIntField(term297553, term297553.getClass(), "capacityIncrement", 0);
        setIntField(term297553, term297553.getClass(), "modCount", 5);
        setField(term297552, term297552.getClass(), "relations", term297553);
        setField(term297524, term297524.getClass(), "relationSet", term297552);
        setField(term297524, term297524.getClass(), "nativeAXResource", term297558);
        setField(term297448, term297448.getClass(), "accessibleContext", term297524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.user.Student");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.ImageIcon");
        Object[] args = new Object[1];
        args[0] = term297448;
        callMethod(klass, "setUserIcon", argTypes, null, args);
    }

};


