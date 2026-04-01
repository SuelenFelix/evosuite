package core.transcript;

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
import static core.transcript.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TranscriptActivity_1_mouseClicked_823014281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term375880;
     Object term375881;

    public TranscriptActivity_1_mouseClicked_823014281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term375880 = newInstance(Class.forName("core.transcript.TranscriptActivity$1"));
        setField(term375880, term375880.getClass(), "this$0", null);
        term375881 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term375894 = (byte[]) newByteArray(6);
        Object term375903 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term375904 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term375905 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term375906 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term375907 = (Object[]) newArray("java.security.Principal", 9);
        Object term375910 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term375913 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term375916 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term375919 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term375922 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term375927 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term375937 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term375881, term375881.getClass(), "x", -149022151);
        setIntField(term375881, term375881.getClass(), "y", -2128082017);
        setIntField(term375881, term375881.getClass(), "xAbs", -626860638);
        setIntField(term375881, term375881.getClass(), "yAbs", 969445811);
        setIntField(term375881, term375881.getClass(), "clickCount", -1232355383);
        setBooleanField(term375881, term375881.getClass(), "causedByTouchEvent", false);
        setIntField(term375881, term375881.getClass(), "button", 1599985157);
        setBooleanField(term375881, term375881.getClass(), "popupTrigger", false);
        setBooleanField(term375881, term375881.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term375881, term375881.getClass(), "when", 2990264647913003810L);
        setIntField(term375881, term375881.getClass(), "modifiers", 80735812);
        setBooleanField(term375881, term375881.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term375894, 0, (byte) 103);
        setByteElement(term375894, 1, (byte) 40);
        setByteElement(term375894, 2, (byte) -106);
        setByteElement(term375894, 3, (byte) -95);
        setByteElement(term375894, 4, (byte) 69);
        setByteElement(term375894, 5, (byte) 63);
        setField(term375881, term375881.getClass(), "bdata", term375894);
        setIntField(term375881, term375881.getClass(), "id", 1616706735);
        setBooleanField(term375881, term375881.getClass(), "consumed", false);
        setField(term375906, term375906.getClass(), "location", null);
        setField(term375906, term375906.getClass(), "signers", null);
        setField(term375906, term375906.getClass(), "certs", null);
        setField(term375906, term375906.getClass(), "sp", null);
        setField(term375906, term375906.getClass(), "factory", null);
        setField(term375906, term375906.getClass(), "locationNoFragString", null);
        setField(term375905, term375905.getClass(), "codesource", term375906);
        setField(term375905, term375905.getClass(), "classloader", null);
        setField(term375905, term375905.getClass(), "principals", term375907);
        setField(term375905, term375905.getClass(), "permissions", null);
        setBooleanField(term375905, term375905.getClass(), "hasAllPerm", false);
        setBooleanField(term375905, term375905.getClass(), "staticPermissions", false);
        setField(term375905, term375905.getClass(), "key", null);
        setElement(term375904, 0, term375905);
        setField(term375910, term375910.getClass(), "codesource", null);
        setField(term375910, term375910.getClass(), "classloader", null);
        setField(term375910, term375910.getClass(), "principals", null);
        setField(term375910, term375910.getClass(), "permissions", null);
        setBooleanField(term375910, term375910.getClass(), "hasAllPerm", false);
        setBooleanField(term375910, term375910.getClass(), "staticPermissions", false);
        setField(term375910, term375910.getClass(), "key", null);
        setElement(term375904, 1, term375910);
        setField(term375913, term375913.getClass(), "codesource", null);
        setField(term375913, term375913.getClass(), "classloader", null);
        setField(term375913, term375913.getClass(), "principals", null);
        setField(term375913, term375913.getClass(), "permissions", null);
        setBooleanField(term375913, term375913.getClass(), "hasAllPerm", false);
        setBooleanField(term375913, term375913.getClass(), "staticPermissions", false);
        setField(term375913, term375913.getClass(), "key", null);
        setElement(term375904, 2, term375913);
        setField(term375916, term375916.getClass(), "codesource", null);
        setField(term375916, term375916.getClass(), "classloader", null);
        setField(term375916, term375916.getClass(), "principals", null);
        setField(term375916, term375916.getClass(), "permissions", null);
        setBooleanField(term375916, term375916.getClass(), "hasAllPerm", false);
        setBooleanField(term375916, term375916.getClass(), "staticPermissions", false);
        setField(term375916, term375916.getClass(), "key", null);
        setElement(term375904, 3, term375916);
        setField(term375919, term375919.getClass(), "codesource", null);
        setField(term375919, term375919.getClass(), "classloader", null);
        setField(term375919, term375919.getClass(), "principals", null);
        setField(term375919, term375919.getClass(), "permissions", null);
        setBooleanField(term375919, term375919.getClass(), "hasAllPerm", false);
        setBooleanField(term375919, term375919.getClass(), "staticPermissions", false);
        setField(term375919, term375919.getClass(), "key", null);
        setElement(term375904, 4, term375919);
        setField(term375922, term375922.getClass(), "codesource", null);
        setField(term375922, term375922.getClass(), "classloader", null);
        setField(term375922, term375922.getClass(), "principals", null);
        setField(term375922, term375922.getClass(), "permissions", null);
        setBooleanField(term375922, term375922.getClass(), "hasAllPerm", false);
        setBooleanField(term375922, term375922.getClass(), "staticPermissions", false);
        setField(term375922, term375922.getClass(), "key", null);
        setElement(term375904, 5, term375922);
        setField(term375903, term375903.getClass(), "context", term375904);
        setBooleanField(term375903, term375903.getClass(), "isPrivileged", false);
        setBooleanField(term375903, term375903.getClass(), "isAuthorized", false);
        setField(term375927, term375927.getClass(), "context", null);
        setBooleanField(term375927, term375927.getClass(), "isPrivileged", false);
        setBooleanField(term375927, term375927.getClass(), "isAuthorized", false);
        setField(term375927, term375927.getClass(), "privilegedContext", null);
        setField(term375927, term375927.getClass(), "combiner", null);
        setField(term375927, term375927.getClass(), "permissions", null);
        setField(term375927, term375927.getClass(), "parent", null);
        setBooleanField(term375927, term375927.getClass(), "isWrapped", false);
        setBooleanField(term375927, term375927.getClass(), "isLimited", false);
        setField(term375927, term375927.getClass(), "limitedContext", null);
        setField(term375903, term375903.getClass(), "privilegedContext", term375927);
        setField(term375903, term375903.getClass(), "combiner", null);
        setField(term375903, term375903.getClass(), "permissions", null);
        setField(term375903, term375903.getClass(), "parent", null);
        setBooleanField(term375903, term375903.getClass(), "isWrapped", false);
        setBooleanField(term375903, term375903.getClass(), "isLimited", false);
        setField(term375903, term375903.getClass(), "limitedContext", null);
        setField(term375881, term375881.getClass(), "acc", term375903);
        setBooleanField(term375881, term375881.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term375881, term375881.getClass(), "isPosted", true);
        setBooleanField(term375881, term375881.getClass(), "isSystemGenerated", true);
        setField(term375881, term375881.getClass(), "source", term375937);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.transcript.TranscriptActivity$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term375881;
        callMethod(klass, "mouseClicked", argTypes, term375880, args);
    }

};


