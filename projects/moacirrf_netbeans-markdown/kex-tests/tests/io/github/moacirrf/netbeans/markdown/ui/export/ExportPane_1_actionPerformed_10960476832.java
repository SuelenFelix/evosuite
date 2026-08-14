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

public class ExportPane_1_actionPerformed_10960476832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52913;
     Object term52914;

    public ExportPane_1_actionPerformed_10960476832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52913 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane$1"));
        setField(term52913, term52913.getClass(), "this$0", null);
        term52914 = newInstance(Class.forName("java.awt.event.ActionEvent"));
        byte[] term52929 = (byte[]) newByteArray(1);
        Object term52933 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term52934 = (Object[]) newArray("java.security.ProtectionDomain", 0);
        Object term52937 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term52938 = (Object[]) newArray("java.security.ProtectionDomain", 1);
        Object term52939 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term52944 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term52956 = newInstance(Class.forName("java.lang.Object"));
        setField(term52914, term52914.getClass(), "actionCommand", "VYkqXKVlAJ");
        setLongField(term52914, term52914.getClass(), "when", 6811161968424632369L);
        setIntField(term52914, term52914.getClass(), "modifiers", 1102721075);
        setByteElement(term52929, 0, (byte) 36);
        setField(term52914, term52914.getClass(), "bdata", term52929);
        setIntField(term52914, term52914.getClass(), "id", -426764678);
        setBooleanField(term52914, term52914.getClass(), "consumed", false);
        setField(term52933, term52933.getClass(), "context", term52934);
        setBooleanField(term52933, term52933.getClass(), "isPrivileged", true);
        setBooleanField(term52933, term52933.getClass(), "isAuthorized", false);
        setField(term52939, term52939.getClass(), "codesource", null);
        setField(term52939, term52939.getClass(), "classloader", null);
        setField(term52939, term52939.getClass(), "principals", null);
        setField(term52939, term52939.getClass(), "permissions", null);
        setBooleanField(term52939, term52939.getClass(), "hasAllPerm", false);
        setBooleanField(term52939, term52939.getClass(), "staticPermissions", false);
        setField(term52939, term52939.getClass(), "key", null);
        setElement(term52938, 0, term52939);
        setField(term52937, term52937.getClass(), "context", term52938);
        setBooleanField(term52937, term52937.getClass(), "isPrivileged", false);
        setBooleanField(term52937, term52937.getClass(), "isAuthorized", true);
        setField(term52944, term52944.getClass(), "context", null);
        setBooleanField(term52944, term52944.getClass(), "isPrivileged", false);
        setBooleanField(term52944, term52944.getClass(), "isAuthorized", false);
        setField(term52944, term52944.getClass(), "privilegedContext", null);
        setField(term52944, term52944.getClass(), "combiner", null);
        setField(term52944, term52944.getClass(), "permissions", null);
        setField(term52944, term52944.getClass(), "parent", null);
        setBooleanField(term52944, term52944.getClass(), "isWrapped", false);
        setBooleanField(term52944, term52944.getClass(), "isLimited", false);
        setField(term52944, term52944.getClass(), "limitedContext", null);
        setField(term52937, term52937.getClass(), "privilegedContext", term52944);
        setField(term52937, term52937.getClass(), "combiner", null);
        setField(term52937, term52937.getClass(), "permissions", null);
        setField(term52937, term52937.getClass(), "parent", null);
        setBooleanField(term52937, term52937.getClass(), "isWrapped", false);
        setBooleanField(term52937, term52937.getClass(), "isLimited", false);
        setField(term52937, term52937.getClass(), "limitedContext", null);
        setField(term52933, term52933.getClass(), "privilegedContext", term52937);
        setField(term52933, term52933.getClass(), "combiner", null);
        setField(term52933, term52933.getClass(), "permissions", null);
        setField(term52933, term52933.getClass(), "parent", null);
        setBooleanField(term52933, term52933.getClass(), "isWrapped", false);
        setBooleanField(term52933, term52933.getClass(), "isLimited", false);
        setField(term52933, term52933.getClass(), "limitedContext", null);
        setField(term52914, term52914.getClass(), "acc", term52933);
        setBooleanField(term52914, term52914.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term52914, term52914.getClass(), "isPosted", false);
        setBooleanField(term52914, term52914.getClass(), "isSystemGenerated", false);
        setField(term52914, term52914.getClass(), "source", term52956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.export.ExportPane$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = term52914;
        callMethod(klass, "actionPerformed", argTypes, term52913, args);
    }

};


