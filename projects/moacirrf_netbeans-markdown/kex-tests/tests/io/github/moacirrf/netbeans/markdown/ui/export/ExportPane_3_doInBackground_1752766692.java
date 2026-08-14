package io.github.moacirrf.netbeans.markdown.ui.export;

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
import static io.github.moacirrf.netbeans.markdown.ui.export.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExportPane_3_doInBackground_1752766692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48827;

    public ExportPane_3_doInBackground_1752766692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48827 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane$3"));
        Object term48828 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term48843 = (byte[]) newByteArray(6);
        Object term48852 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term48853 = (Object[]) newArray("java.security.ProtectionDomain", 2);
        Object term48854 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term48857 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term48862 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term48872 = newInstance(Class.forName("java.lang.Object"));
        Object term48874 = newInstance(Class.forName("javax.swing.SwingWorker$StateValue"));
        Object term48885 = newInstance(Class.forName("java.util.concurrent.FutureTask"));
        Object term48887 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        setField(term48828, term48828.getClass(), "actionCommand", "ZzIujlwVsw");
        setLongField(term48828, term48828.getClass(), "when", 7411271909051562686L);
        setIntField(term48828, term48828.getClass(), "modifiers", -601863069);
        setByteElement(term48843, 0, (byte) 74);
        setByteElement(term48843, 1, (byte) -71);
        setByteElement(term48843, 2, (byte) 49);
        setByteElement(term48843, 3, (byte) -54);
        setByteElement(term48843, 4, (byte) 67);
        setByteElement(term48843, 5, (byte) 78);
        setField(term48828, term48828.getClass(), "bdata", term48843);
        setIntField(term48828, term48828.getClass(), "id", 663292551);
        setBooleanField(term48828, term48828.getClass(), "consumed", true);
        setField(term48854, term48854.getClass(), "codesource", null);
        setField(term48854, term48854.getClass(), "classloader", null);
        setField(term48854, term48854.getClass(), "principals", null);
        setField(term48854, term48854.getClass(), "permissions", null);
        setBooleanField(term48854, term48854.getClass(), "hasAllPerm", false);
        setBooleanField(term48854, term48854.getClass(), "staticPermissions", false);
        setField(term48854, term48854.getClass(), "key", null);
        setElement(term48853, 0, term48854);
        setField(term48857, term48857.getClass(), "codesource", null);
        setField(term48857, term48857.getClass(), "classloader", null);
        setField(term48857, term48857.getClass(), "principals", null);
        setField(term48857, term48857.getClass(), "permissions", null);
        setBooleanField(term48857, term48857.getClass(), "hasAllPerm", false);
        setBooleanField(term48857, term48857.getClass(), "staticPermissions", false);
        setField(term48857, term48857.getClass(), "key", null);
        setElement(term48853, 1, term48857);
        setField(term48852, term48852.getClass(), "context", term48853);
        setBooleanField(term48852, term48852.getClass(), "isPrivileged", false);
        setBooleanField(term48852, term48852.getClass(), "isAuthorized", true);
        setField(term48862, term48862.getClass(), "context", null);
        setBooleanField(term48862, term48862.getClass(), "isPrivileged", false);
        setBooleanField(term48862, term48862.getClass(), "isAuthorized", false);
        setField(term48862, term48862.getClass(), "privilegedContext", null);
        setField(term48862, term48862.getClass(), "combiner", null);
        setField(term48862, term48862.getClass(), "permissions", null);
        setField(term48862, term48862.getClass(), "parent", null);
        setBooleanField(term48862, term48862.getClass(), "isWrapped", false);
        setBooleanField(term48862, term48862.getClass(), "isLimited", false);
        setField(term48862, term48862.getClass(), "limitedContext", null);
        setField(term48852, term48852.getClass(), "privilegedContext", term48862);
        setField(term48852, term48852.getClass(), "combiner", null);
        setField(term48852, term48852.getClass(), "permissions", null);
        setField(term48852, term48852.getClass(), "parent", null);
        setBooleanField(term48852, term48852.getClass(), "isWrapped", false);
        setBooleanField(term48852, term48852.getClass(), "isLimited", false);
        setField(term48852, term48852.getClass(), "limitedContext", null);
        setField(term48828, term48828.getClass(), "acc", term48852);
        setBooleanField(term48828, term48828.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term48828, term48828.getClass(), "isPosted", true);
        setBooleanField(term48828, term48828.getClass(), "isSystemGenerated", false);
        setField(term48828, term48828.getClass(), "source", term48872);
        setField(term48827, term48827.getClass(), "val$e", term48828);
        setField(term48827, term48827.getClass(), "this$0", null);
        setIntField(term48827, term48827.getClass(), "progress", -1239406390);
        setField(term48874, term48874.getClass(), "name", "STARTED");
        setIntField(term48874, term48874.getClass(), "ordinal", 1);
        setField(term48827, term48827.getClass(), "state", term48874);
        setIntField(term48885, term48885.getClass(), "state", 1557431527);
        setField(term48885, term48885.getClass(), "callable", null);
        setField(term48885, term48885.getClass(), "outcome", null);
        setField(term48885, term48885.getClass(), "runner", null);
        setField(term48885, term48885.getClass(), "waiters", null);
        setField(term48827, term48827.getClass(), "future", term48885);
        setField(term48887, term48887.getClass(), "map", null);
        setField(term48887, term48887.getClass(), "source", null);
        setField(term48827, term48827.getClass(), "propertyChangeSupport", term48887);
        setField(term48827, term48827.getClass(), "doProcess", null);
        setField(term48827, term48827.getClass(), "doNotifyProgressChange", null);
        setField(term48827, term48827.getClass(), "doSubmit", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane$3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doInBackground", argTypes, term48827, args);
    }

};


