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
     Object term297462;

    public Student_setUserIcon_145215335456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term297462 = newInstance(Class.forName("javax.swing.ImageIcon"));
        Object term297475 = newInstance(Class.forName("java.net.URL"));
        Object term297520 = newInstance(Class.forName("sun.net.www.protocol.https.Handler"));
        Object term297538 = newInstance(Class.forName("javax.swing.ImageIcon$AccessibleImageIcon"));
        Object term297563 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        Object term297564 = newInstance(Class.forName("java.beans.PropertyChangeSupport$PropertyChangeListenerMap"));
        Object term297565 = newInstance(Class.forName("java.lang.Object"));
        Object term297566 = newInstance(Class.forName("javax.accessibility.AccessibleRelationSet"));
        Object term297567 = newInstance(Class.forName("java.util.Vector"));
        Object[] term297568 = (Object[]) newArray("java.lang.Object", 10);
        Object term297572 = newInstance(Class.forName("java.lang.Object"));
        setField(term297462, term297462.getClass(), "filename", "COhzwXcfds");
        setField(term297475, term297475.getClass(), "protocol", "https");
        setField(term297475, term297475.getClass(), "host", "www.github.com");
        setIntField(term297475, term297475.getClass(), "port", -1);
        setField(term297475, term297475.getClass(), "file", "");
        setField(term297475, term297475.getClass(), "query", null);
        setField(term297475, term297475.getClass(), "authority", "www.github.com");
        setField(term297475, term297475.getClass(), "path", "");
        setField(term297475, term297475.getClass(), "userInfo", null);
        setField(term297475, term297475.getClass(), "ref", null);
        setField(term297475, term297475.getClass(), "hostAddress", null);
        setField(term297520, term297520.getClass(), "proxy", null);
        setIntField(term297520, term297520.getClass(), "proxyPort", -1);
        setField(term297475, term297475.getClass(), "handler", term297520);
        setField(term297475, term297475.getClass(), "tempState", null);
        setField(term297462, term297462.getClass(), "location", term297475);
        setField(term297462, term297462.getClass(), "image", null);
        setIntField(term297462, term297462.getClass(), "loadStatus", 98801346);
        setField(term297462, term297462.getClass(), "imageObserver", null);
        setField(term297462, term297462.getClass(), "description", "anncJTnzrg");
        setIntField(term297462, term297462.getClass(), "width", -1);
        setIntField(term297462, term297462.getClass(), "height", -1);
        setField(term297538, term297538.getClass(), "this$0", null);
        setField(term297538, term297538.getClass(), "targetAppContext", null);
        setField(term297538, term297538.getClass(), "accessibleParent", null);
        setField(term297538, term297538.getClass(), "accessibleName", "GMylOocLnB");
        setField(term297538, term297538.getClass(), "accessibleDescription", "spOehuHwSl");
        setField(term297564, term297564.getClass(), "map", null);
        setField(term297563, term297563.getClass(), "map", term297564);
        setField(term297563, term297563.getClass(), "source", term297565);
        setField(term297538, term297538.getClass(), "accessibleChangeSupport", term297563);
        setField(term297567, term297567.getClass(), "elementData", term297568);
        setIntField(term297567, term297567.getClass(), "elementCount", 5);
        setIntField(term297567, term297567.getClass(), "capacityIncrement", 0);
        setIntField(term297567, term297567.getClass(), "modCount", 5);
        setField(term297566, term297566.getClass(), "relations", term297567);
        setField(term297538, term297538.getClass(), "relationSet", term297566);
        setField(term297538, term297538.getClass(), "nativeAXResource", term297572);
        setField(term297462, term297462.getClass(), "accessibleContext", term297538);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.user.Student");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.ImageIcon");
        Object[] args = new Object[1];
        args[0] = term297462;
        callMethod(klass, "setUserIcon", argTypes, null, args);
    }

};


