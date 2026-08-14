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

public class ExportPane_3_done_10304642643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48911;

    public ExportPane_3_done_10304642643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48911 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane$3"));
        Object term48912 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term48927 = (byte[]) newByteArray(9);
        Object term48939 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term48940 = (Object[]) newArray("java.security.ProtectionDomain", 7);
        Object term48941 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term48944 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term48947 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term48950 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term48953 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term48956 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term48959 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term48964 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term48974 = newInstance(Class.forName("java.lang.Object"));
        Object term48976 = newInstance(Class.forName("javax.swing.SwingWorker$StateValue"));
        Object term48984 = newInstance(Class.forName("java.util.concurrent.FutureTask"));
        Object term48986 = newInstance(Class.forName("java.beans.PropertyChangeSupport"));
        setField(term48912, term48912.getClass(), "actionCommand", "yVMkkQhvmN");
        setLongField(term48912, term48912.getClass(), "when", 4872422362414183754L);
        setIntField(term48912, term48912.getClass(), "modifiers", 1358829571);
        setByteElement(term48927, 0, (byte) 87);
        setByteElement(term48927, 1, (byte) 121);
        setByteElement(term48927, 2, (byte) -99);
        setByteElement(term48927, 3, (byte) -2);
        setByteElement(term48927, 4, (byte) -16);
        setByteElement(term48927, 5, (byte) -112);
        setByteElement(term48927, 6, (byte) -111);
        setByteElement(term48927, 7, (byte) 23);
        setByteElement(term48927, 8, (byte) -15);
        setField(term48912, term48912.getClass(), "bdata", term48927);
        setIntField(term48912, term48912.getClass(), "id", 991356662);
        setBooleanField(term48912, term48912.getClass(), "consumed", true);
        setField(term48941, term48941.getClass(), "codesource", null);
        setField(term48941, term48941.getClass(), "classloader", null);
        setField(term48941, term48941.getClass(), "principals", null);
        setField(term48941, term48941.getClass(), "permissions", null);
        setBooleanField(term48941, term48941.getClass(), "hasAllPerm", false);
        setBooleanField(term48941, term48941.getClass(), "staticPermissions", false);
        setField(term48941, term48941.getClass(), "key", null);
        setElement(term48940, 0, term48941);
        setField(term48944, term48944.getClass(), "codesource", null);
        setField(term48944, term48944.getClass(), "classloader", null);
        setField(term48944, term48944.getClass(), "principals", null);
        setField(term48944, term48944.getClass(), "permissions", null);
        setBooleanField(term48944, term48944.getClass(), "hasAllPerm", false);
        setBooleanField(term48944, term48944.getClass(), "staticPermissions", false);
        setField(term48944, term48944.getClass(), "key", null);
        setElement(term48940, 1, term48944);
        setField(term48947, term48947.getClass(), "codesource", null);
        setField(term48947, term48947.getClass(), "classloader", null);
        setField(term48947, term48947.getClass(), "principals", null);
        setField(term48947, term48947.getClass(), "permissions", null);
        setBooleanField(term48947, term48947.getClass(), "hasAllPerm", false);
        setBooleanField(term48947, term48947.getClass(), "staticPermissions", false);
        setField(term48947, term48947.getClass(), "key", null);
        setElement(term48940, 2, term48947);
        setField(term48950, term48950.getClass(), "codesource", null);
        setField(term48950, term48950.getClass(), "classloader", null);
        setField(term48950, term48950.getClass(), "principals", null);
        setField(term48950, term48950.getClass(), "permissions", null);
        setBooleanField(term48950, term48950.getClass(), "hasAllPerm", false);
        setBooleanField(term48950, term48950.getClass(), "staticPermissions", false);
        setField(term48950, term48950.getClass(), "key", null);
        setElement(term48940, 3, term48950);
        setField(term48953, term48953.getClass(), "codesource", null);
        setField(term48953, term48953.getClass(), "classloader", null);
        setField(term48953, term48953.getClass(), "principals", null);
        setField(term48953, term48953.getClass(), "permissions", null);
        setBooleanField(term48953, term48953.getClass(), "hasAllPerm", false);
        setBooleanField(term48953, term48953.getClass(), "staticPermissions", false);
        setField(term48953, term48953.getClass(), "key", null);
        setElement(term48940, 4, term48953);
        setField(term48956, term48956.getClass(), "codesource", null);
        setField(term48956, term48956.getClass(), "classloader", null);
        setField(term48956, term48956.getClass(), "principals", null);
        setField(term48956, term48956.getClass(), "permissions", null);
        setBooleanField(term48956, term48956.getClass(), "hasAllPerm", false);
        setBooleanField(term48956, term48956.getClass(), "staticPermissions", false);
        setField(term48956, term48956.getClass(), "key", null);
        setElement(term48940, 5, term48956);
        setField(term48959, term48959.getClass(), "codesource", null);
        setField(term48959, term48959.getClass(), "classloader", null);
        setField(term48959, term48959.getClass(), "principals", null);
        setField(term48959, term48959.getClass(), "permissions", null);
        setBooleanField(term48959, term48959.getClass(), "hasAllPerm", false);
        setBooleanField(term48959, term48959.getClass(), "staticPermissions", false);
        setField(term48959, term48959.getClass(), "key", null);
        setElement(term48940, 6, term48959);
        setField(term48939, term48939.getClass(), "context", term48940);
        setBooleanField(term48939, term48939.getClass(), "isPrivileged", false);
        setBooleanField(term48939, term48939.getClass(), "isAuthorized", false);
        setField(term48964, term48964.getClass(), "context", null);
        setBooleanField(term48964, term48964.getClass(), "isPrivileged", false);
        setBooleanField(term48964, term48964.getClass(), "isAuthorized", false);
        setField(term48964, term48964.getClass(), "privilegedContext", null);
        setField(term48964, term48964.getClass(), "combiner", null);
        setField(term48964, term48964.getClass(), "permissions", null);
        setField(term48964, term48964.getClass(), "parent", null);
        setBooleanField(term48964, term48964.getClass(), "isWrapped", false);
        setBooleanField(term48964, term48964.getClass(), "isLimited", false);
        setField(term48964, term48964.getClass(), "limitedContext", null);
        setField(term48939, term48939.getClass(), "privilegedContext", term48964);
        setField(term48939, term48939.getClass(), "combiner", null);
        setField(term48939, term48939.getClass(), "permissions", null);
        setField(term48939, term48939.getClass(), "parent", null);
        setBooleanField(term48939, term48939.getClass(), "isWrapped", false);
        setBooleanField(term48939, term48939.getClass(), "isLimited", false);
        setField(term48939, term48939.getClass(), "limitedContext", null);
        setField(term48912, term48912.getClass(), "acc", term48939);
        setBooleanField(term48912, term48912.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term48912, term48912.getClass(), "isPosted", true);
        setBooleanField(term48912, term48912.getClass(), "isSystemGenerated", true);
        setField(term48912, term48912.getClass(), "source", term48974);
        setField(term48911, term48911.getClass(), "val$e", term48912);
        setField(term48911, term48911.getClass(), "this$0", null);
        setIntField(term48911, term48911.getClass(), "progress", -1896376975);
        setField(term48976, term48976.getClass(), "name", "DONE");
        setIntField(term48976, term48976.getClass(), "ordinal", 2);
        setField(term48911, term48911.getClass(), "state", term48976);
        setIntField(term48984, term48984.getClass(), "state", 729658803);
        setField(term48984, term48984.getClass(), "callable", null);
        setField(term48984, term48984.getClass(), "outcome", null);
        setField(term48984, term48984.getClass(), "runner", null);
        setField(term48984, term48984.getClass(), "waiters", null);
        setField(term48911, term48911.getClass(), "future", term48984);
        setField(term48986, term48986.getClass(), "map", null);
        setField(term48986, term48986.getClass(), "source", null);
        setField(term48911, term48911.getClass(), "propertyChangeSupport", term48986);
        setField(term48911, term48911.getClass(), "doProcess", null);
        setField(term48911, term48911.getClass(), "doNotifyProgressChange", null);
        setField(term48911, term48911.getClass(), "doSubmit", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane$3");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "done", argTypes, term48911, args);
    }

};


