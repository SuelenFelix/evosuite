package core.module;

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
import static core.module.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SemesterActivity_2_mousePressed_19105254422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320165;
     Object term320166;

    public SemesterActivity_2_mousePressed_19105254422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term320165 = newInstance(Class.forName("core.module.SemesterActivity$2"));
        setField(term320165, term320165.getClass(), "this$0", null);
        term320166 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term320179 = (byte[]) newByteArray(0);
        Object term320182 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term320183 = (Object[]) newArray("java.security.ProtectionDomain", 8);
        Object term320184 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term320185 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term320186 = (Object[]) newArray("java.security.Principal", 4);
        Object term320189 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term320192 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term320195 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term320198 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term320201 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term320204 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term320207 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term320212 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term320222 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term320166, term320166.getClass(), "x", -1012640616);
        setIntField(term320166, term320166.getClass(), "y", -552664740);
        setIntField(term320166, term320166.getClass(), "xAbs", -1639838200);
        setIntField(term320166, term320166.getClass(), "yAbs", -60462175);
        setIntField(term320166, term320166.getClass(), "clickCount", 1315997028);
        setBooleanField(term320166, term320166.getClass(), "causedByTouchEvent", true);
        setIntField(term320166, term320166.getClass(), "button", 1268210239);
        setBooleanField(term320166, term320166.getClass(), "popupTrigger", true);
        setBooleanField(term320166, term320166.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term320166, term320166.getClass(), "when", -7001094993638840490L);
        setIntField(term320166, term320166.getClass(), "modifiers", -697986260);
        setBooleanField(term320166, term320166.getClass(), "canAccessSystemClipboard", true);
        setField(term320166, term320166.getClass(), "bdata", term320179);
        setIntField(term320166, term320166.getClass(), "id", -672315403);
        setBooleanField(term320166, term320166.getClass(), "consumed", false);
        setField(term320185, term320185.getClass(), "location", null);
        setField(term320185, term320185.getClass(), "signers", null);
        setField(term320185, term320185.getClass(), "certs", null);
        setField(term320185, term320185.getClass(), "sp", null);
        setField(term320185, term320185.getClass(), "factory", null);
        setField(term320185, term320185.getClass(), "locationNoFragString", null);
        setField(term320184, term320184.getClass(), "codesource", term320185);
        setField(term320184, term320184.getClass(), "classloader", null);
        setField(term320184, term320184.getClass(), "principals", term320186);
        setField(term320184, term320184.getClass(), "permissions", null);
        setBooleanField(term320184, term320184.getClass(), "hasAllPerm", false);
        setBooleanField(term320184, term320184.getClass(), "staticPermissions", false);
        setField(term320184, term320184.getClass(), "key", null);
        setElement(term320183, 0, term320184);
        setField(term320189, term320189.getClass(), "codesource", null);
        setField(term320189, term320189.getClass(), "classloader", null);
        setField(term320189, term320189.getClass(), "principals", null);
        setField(term320189, term320189.getClass(), "permissions", null);
        setBooleanField(term320189, term320189.getClass(), "hasAllPerm", false);
        setBooleanField(term320189, term320189.getClass(), "staticPermissions", false);
        setField(term320189, term320189.getClass(), "key", null);
        setElement(term320183, 1, term320189);
        setField(term320192, term320192.getClass(), "codesource", null);
        setField(term320192, term320192.getClass(), "classloader", null);
        setField(term320192, term320192.getClass(), "principals", null);
        setField(term320192, term320192.getClass(), "permissions", null);
        setBooleanField(term320192, term320192.getClass(), "hasAllPerm", false);
        setBooleanField(term320192, term320192.getClass(), "staticPermissions", false);
        setField(term320192, term320192.getClass(), "key", null);
        setElement(term320183, 2, term320192);
        setField(term320195, term320195.getClass(), "codesource", null);
        setField(term320195, term320195.getClass(), "classloader", null);
        setField(term320195, term320195.getClass(), "principals", null);
        setField(term320195, term320195.getClass(), "permissions", null);
        setBooleanField(term320195, term320195.getClass(), "hasAllPerm", false);
        setBooleanField(term320195, term320195.getClass(), "staticPermissions", false);
        setField(term320195, term320195.getClass(), "key", null);
        setElement(term320183, 3, term320195);
        setField(term320198, term320198.getClass(), "codesource", null);
        setField(term320198, term320198.getClass(), "classloader", null);
        setField(term320198, term320198.getClass(), "principals", null);
        setField(term320198, term320198.getClass(), "permissions", null);
        setBooleanField(term320198, term320198.getClass(), "hasAllPerm", false);
        setBooleanField(term320198, term320198.getClass(), "staticPermissions", false);
        setField(term320198, term320198.getClass(), "key", null);
        setElement(term320183, 4, term320198);
        setField(term320201, term320201.getClass(), "codesource", null);
        setField(term320201, term320201.getClass(), "classloader", null);
        setField(term320201, term320201.getClass(), "principals", null);
        setField(term320201, term320201.getClass(), "permissions", null);
        setBooleanField(term320201, term320201.getClass(), "hasAllPerm", false);
        setBooleanField(term320201, term320201.getClass(), "staticPermissions", false);
        setField(term320201, term320201.getClass(), "key", null);
        setElement(term320183, 5, term320201);
        setField(term320204, term320204.getClass(), "codesource", null);
        setField(term320204, term320204.getClass(), "classloader", null);
        setField(term320204, term320204.getClass(), "principals", null);
        setField(term320204, term320204.getClass(), "permissions", null);
        setBooleanField(term320204, term320204.getClass(), "hasAllPerm", false);
        setBooleanField(term320204, term320204.getClass(), "staticPermissions", false);
        setField(term320204, term320204.getClass(), "key", null);
        setElement(term320183, 6, term320204);
        setField(term320207, term320207.getClass(), "codesource", null);
        setField(term320207, term320207.getClass(), "classloader", null);
        setField(term320207, term320207.getClass(), "principals", null);
        setField(term320207, term320207.getClass(), "permissions", null);
        setBooleanField(term320207, term320207.getClass(), "hasAllPerm", false);
        setBooleanField(term320207, term320207.getClass(), "staticPermissions", false);
        setField(term320207, term320207.getClass(), "key", null);
        setElement(term320183, 7, term320207);
        setField(term320182, term320182.getClass(), "context", term320183);
        setBooleanField(term320182, term320182.getClass(), "isPrivileged", false);
        setBooleanField(term320182, term320182.getClass(), "isAuthorized", true);
        setField(term320212, term320212.getClass(), "context", null);
        setBooleanField(term320212, term320212.getClass(), "isPrivileged", false);
        setBooleanField(term320212, term320212.getClass(), "isAuthorized", false);
        setField(term320212, term320212.getClass(), "privilegedContext", null);
        setField(term320212, term320212.getClass(), "combiner", null);
        setField(term320212, term320212.getClass(), "permissions", null);
        setField(term320212, term320212.getClass(), "parent", null);
        setBooleanField(term320212, term320212.getClass(), "isWrapped", false);
        setBooleanField(term320212, term320212.getClass(), "isLimited", false);
        setField(term320212, term320212.getClass(), "limitedContext", null);
        setField(term320182, term320182.getClass(), "privilegedContext", term320212);
        setField(term320182, term320182.getClass(), "combiner", null);
        setField(term320182, term320182.getClass(), "permissions", null);
        setField(term320182, term320182.getClass(), "parent", null);
        setBooleanField(term320182, term320182.getClass(), "isWrapped", false);
        setBooleanField(term320182, term320182.getClass(), "isLimited", false);
        setField(term320182, term320182.getClass(), "limitedContext", null);
        setField(term320166, term320166.getClass(), "acc", term320182);
        setBooleanField(term320166, term320166.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term320166, term320166.getClass(), "isPosted", true);
        setBooleanField(term320166, term320166.getClass(), "isSystemGenerated", false);
        setField(term320166, term320166.getClass(), "source", term320222);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SemesterActivity$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term320166;
        callMethod(klass, "mousePressed", argTypes, term320165, args);
    }

};


