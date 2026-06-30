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

public class ModuleHandler_ModuleYear_2_mousePressed_800518022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117972;
     Object term117973;

    public ModuleHandler_ModuleYear_2_mousePressed_800518022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117972 = newInstance(Class.forName("core.module.ModuleHandler$ModuleYear$2"));
        setField(term117972, term117972.getClass(), "this$0", null);
        term117973 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term117986 = (byte[]) newByteArray(1);
        Object term117990 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term117991 = (Object[]) newArray("java.security.ProtectionDomain", 2);
        Object term117992 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term117993 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term117994 = (Object[]) newArray("java.security.Principal", 0);
        Object term117997 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term118002 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term118012 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term117973, term117973.getClass(), "x", -1541566235);
        setIntField(term117973, term117973.getClass(), "y", -189738995);
        setIntField(term117973, term117973.getClass(), "xAbs", 1943019963);
        setIntField(term117973, term117973.getClass(), "yAbs", 186472650);
        setIntField(term117973, term117973.getClass(), "clickCount", 279675992);
        setBooleanField(term117973, term117973.getClass(), "causedByTouchEvent", true);
        setIntField(term117973, term117973.getClass(), "button", -1626074989);
        setBooleanField(term117973, term117973.getClass(), "popupTrigger", true);
        setBooleanField(term117973, term117973.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term117973, term117973.getClass(), "when", 2936323121573284007L);
        setIntField(term117973, term117973.getClass(), "modifiers", -552272253);
        setBooleanField(term117973, term117973.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term117986, 0, (byte) -109);
        setField(term117973, term117973.getClass(), "bdata", term117986);
        setIntField(term117973, term117973.getClass(), "id", -633523956);
        setBooleanField(term117973, term117973.getClass(), "consumed", false);
        setField(term117993, term117993.getClass(), "location", null);
        setField(term117993, term117993.getClass(), "signers", null);
        setField(term117993, term117993.getClass(), "certs", null);
        setField(term117993, term117993.getClass(), "sp", null);
        setField(term117993, term117993.getClass(), "factory", null);
        setField(term117993, term117993.getClass(), "locationNoFragString", null);
        setField(term117992, term117992.getClass(), "codesource", term117993);
        setField(term117992, term117992.getClass(), "classloader", null);
        setField(term117992, term117992.getClass(), "principals", term117994);
        setField(term117992, term117992.getClass(), "permissions", null);
        setBooleanField(term117992, term117992.getClass(), "hasAllPerm", false);
        setBooleanField(term117992, term117992.getClass(), "staticPermissions", false);
        setField(term117992, term117992.getClass(), "key", null);
        setElement(term117991, 0, term117992);
        setField(term117997, term117997.getClass(), "codesource", null);
        setField(term117997, term117997.getClass(), "classloader", null);
        setField(term117997, term117997.getClass(), "principals", null);
        setField(term117997, term117997.getClass(), "permissions", null);
        setBooleanField(term117997, term117997.getClass(), "hasAllPerm", false);
        setBooleanField(term117997, term117997.getClass(), "staticPermissions", false);
        setField(term117997, term117997.getClass(), "key", null);
        setElement(term117991, 1, term117997);
        setField(term117990, term117990.getClass(), "context", term117991);
        setBooleanField(term117990, term117990.getClass(), "isPrivileged", false);
        setBooleanField(term117990, term117990.getClass(), "isAuthorized", false);
        setField(term118002, term118002.getClass(), "context", null);
        setBooleanField(term118002, term118002.getClass(), "isPrivileged", false);
        setBooleanField(term118002, term118002.getClass(), "isAuthorized", false);
        setField(term118002, term118002.getClass(), "privilegedContext", null);
        setField(term118002, term118002.getClass(), "combiner", null);
        setField(term118002, term118002.getClass(), "permissions", null);
        setField(term118002, term118002.getClass(), "parent", null);
        setBooleanField(term118002, term118002.getClass(), "isWrapped", false);
        setBooleanField(term118002, term118002.getClass(), "isLimited", false);
        setField(term118002, term118002.getClass(), "limitedContext", null);
        setField(term117990, term117990.getClass(), "privilegedContext", term118002);
        setField(term117990, term117990.getClass(), "combiner", null);
        setField(term117990, term117990.getClass(), "permissions", null);
        setField(term117990, term117990.getClass(), "parent", null);
        setBooleanField(term117990, term117990.getClass(), "isWrapped", false);
        setBooleanField(term117990, term117990.getClass(), "isLimited", false);
        setField(term117990, term117990.getClass(), "limitedContext", null);
        setField(term117973, term117973.getClass(), "acc", term117990);
        setBooleanField(term117973, term117973.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term117973, term117973.getClass(), "isPosted", false);
        setBooleanField(term117973, term117973.getClass(), "isSystemGenerated", true);
        setField(term117973, term117973.getClass(), "source", term118012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleHandler$ModuleYear$2");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term117973;
        callMethod(klass, "mousePressed", argTypes, term117972, args);
    }

};


