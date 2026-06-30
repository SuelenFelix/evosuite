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

public class SummerHandler_1_mouseReleased_17841336382 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97973;
     Object term97974;

    public SummerHandler_1_mouseReleased_17841336382() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97973 = newInstance(Class.forName("core.module.SummerHandler$1"));
        setField(term97973, term97973.getClass(), "this$0", null);
        term97974 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term97987 = (byte[]) newByteArray(8);
        Object term97998 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term97999 = (Object[]) newArray("java.security.ProtectionDomain", 9);
        Object term98000 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98001 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term98002 = (Object[]) newArray("java.security.Principal", 3);
        Object term98005 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98008 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98011 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98014 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98017 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98020 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98023 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98026 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term98031 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term98041 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term97974, term97974.getClass(), "x", 1418551216);
        setIntField(term97974, term97974.getClass(), "y", -626779272);
        setIntField(term97974, term97974.getClass(), "xAbs", -1150062870);
        setIntField(term97974, term97974.getClass(), "yAbs", -886200503);
        setIntField(term97974, term97974.getClass(), "clickCount", 1136393691);
        setBooleanField(term97974, term97974.getClass(), "causedByTouchEvent", true);
        setIntField(term97974, term97974.getClass(), "button", -1288536479);
        setBooleanField(term97974, term97974.getClass(), "popupTrigger", false);
        setBooleanField(term97974, term97974.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term97974, term97974.getClass(), "when", 2120084523938730454L);
        setIntField(term97974, term97974.getClass(), "modifiers", 1092038167);
        setBooleanField(term97974, term97974.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term97987, 0, (byte) -39);
        setByteElement(term97987, 1, (byte) -20);
        setByteElement(term97987, 2, (byte) 10);
        setByteElement(term97987, 3, (byte) 77);
        setByteElement(term97987, 4, (byte) 14);
        setByteElement(term97987, 5, (byte) -101);
        setByteElement(term97987, 6, (byte) 35);
        setByteElement(term97987, 7, (byte) 66);
        setField(term97974, term97974.getClass(), "bdata", term97987);
        setIntField(term97974, term97974.getClass(), "id", 1879729823);
        setBooleanField(term97974, term97974.getClass(), "consumed", false);
        setField(term98001, term98001.getClass(), "location", null);
        setField(term98001, term98001.getClass(), "signers", null);
        setField(term98001, term98001.getClass(), "certs", null);
        setField(term98001, term98001.getClass(), "sp", null);
        setField(term98001, term98001.getClass(), "factory", null);
        setField(term98001, term98001.getClass(), "locationNoFragString", null);
        setField(term98000, term98000.getClass(), "codesource", term98001);
        setField(term98000, term98000.getClass(), "classloader", null);
        setField(term98000, term98000.getClass(), "principals", term98002);
        setField(term98000, term98000.getClass(), "permissions", null);
        setBooleanField(term98000, term98000.getClass(), "hasAllPerm", false);
        setBooleanField(term98000, term98000.getClass(), "staticPermissions", false);
        setField(term98000, term98000.getClass(), "key", null);
        setElement(term97999, 0, term98000);
        setField(term98005, term98005.getClass(), "codesource", null);
        setField(term98005, term98005.getClass(), "classloader", null);
        setField(term98005, term98005.getClass(), "principals", null);
        setField(term98005, term98005.getClass(), "permissions", null);
        setBooleanField(term98005, term98005.getClass(), "hasAllPerm", false);
        setBooleanField(term98005, term98005.getClass(), "staticPermissions", false);
        setField(term98005, term98005.getClass(), "key", null);
        setElement(term97999, 1, term98005);
        setField(term98008, term98008.getClass(), "codesource", null);
        setField(term98008, term98008.getClass(), "classloader", null);
        setField(term98008, term98008.getClass(), "principals", null);
        setField(term98008, term98008.getClass(), "permissions", null);
        setBooleanField(term98008, term98008.getClass(), "hasAllPerm", false);
        setBooleanField(term98008, term98008.getClass(), "staticPermissions", false);
        setField(term98008, term98008.getClass(), "key", null);
        setElement(term97999, 2, term98008);
        setField(term98011, term98011.getClass(), "codesource", null);
        setField(term98011, term98011.getClass(), "classloader", null);
        setField(term98011, term98011.getClass(), "principals", null);
        setField(term98011, term98011.getClass(), "permissions", null);
        setBooleanField(term98011, term98011.getClass(), "hasAllPerm", false);
        setBooleanField(term98011, term98011.getClass(), "staticPermissions", false);
        setField(term98011, term98011.getClass(), "key", null);
        setElement(term97999, 3, term98011);
        setField(term98014, term98014.getClass(), "codesource", null);
        setField(term98014, term98014.getClass(), "classloader", null);
        setField(term98014, term98014.getClass(), "principals", null);
        setField(term98014, term98014.getClass(), "permissions", null);
        setBooleanField(term98014, term98014.getClass(), "hasAllPerm", false);
        setBooleanField(term98014, term98014.getClass(), "staticPermissions", false);
        setField(term98014, term98014.getClass(), "key", null);
        setElement(term97999, 4, term98014);
        setField(term98017, term98017.getClass(), "codesource", null);
        setField(term98017, term98017.getClass(), "classloader", null);
        setField(term98017, term98017.getClass(), "principals", null);
        setField(term98017, term98017.getClass(), "permissions", null);
        setBooleanField(term98017, term98017.getClass(), "hasAllPerm", false);
        setBooleanField(term98017, term98017.getClass(), "staticPermissions", false);
        setField(term98017, term98017.getClass(), "key", null);
        setElement(term97999, 5, term98017);
        setField(term98020, term98020.getClass(), "codesource", null);
        setField(term98020, term98020.getClass(), "classloader", null);
        setField(term98020, term98020.getClass(), "principals", null);
        setField(term98020, term98020.getClass(), "permissions", null);
        setBooleanField(term98020, term98020.getClass(), "hasAllPerm", false);
        setBooleanField(term98020, term98020.getClass(), "staticPermissions", false);
        setField(term98020, term98020.getClass(), "key", null);
        setElement(term97999, 6, term98020);
        setField(term98023, term98023.getClass(), "codesource", null);
        setField(term98023, term98023.getClass(), "classloader", null);
        setField(term98023, term98023.getClass(), "principals", null);
        setField(term98023, term98023.getClass(), "permissions", null);
        setBooleanField(term98023, term98023.getClass(), "hasAllPerm", false);
        setBooleanField(term98023, term98023.getClass(), "staticPermissions", false);
        setField(term98023, term98023.getClass(), "key", null);
        setElement(term97999, 7, term98023);
        setField(term98026, term98026.getClass(), "codesource", null);
        setField(term98026, term98026.getClass(), "classloader", null);
        setField(term98026, term98026.getClass(), "principals", null);
        setField(term98026, term98026.getClass(), "permissions", null);
        setBooleanField(term98026, term98026.getClass(), "hasAllPerm", false);
        setBooleanField(term98026, term98026.getClass(), "staticPermissions", false);
        setField(term98026, term98026.getClass(), "key", null);
        setElement(term97999, 8, term98026);
        setField(term97998, term97998.getClass(), "context", term97999);
        setBooleanField(term97998, term97998.getClass(), "isPrivileged", true);
        setBooleanField(term97998, term97998.getClass(), "isAuthorized", false);
        setField(term98031, term98031.getClass(), "context", null);
        setBooleanField(term98031, term98031.getClass(), "isPrivileged", false);
        setBooleanField(term98031, term98031.getClass(), "isAuthorized", false);
        setField(term98031, term98031.getClass(), "privilegedContext", null);
        setField(term98031, term98031.getClass(), "combiner", null);
        setField(term98031, term98031.getClass(), "permissions", null);
        setField(term98031, term98031.getClass(), "parent", null);
        setBooleanField(term98031, term98031.getClass(), "isWrapped", false);
        setBooleanField(term98031, term98031.getClass(), "isLimited", false);
        setField(term98031, term98031.getClass(), "limitedContext", null);
        setField(term97998, term97998.getClass(), "privilegedContext", term98031);
        setField(term97998, term97998.getClass(), "combiner", null);
        setField(term97998, term97998.getClass(), "permissions", null);
        setField(term97998, term97998.getClass(), "parent", null);
        setBooleanField(term97998, term97998.getClass(), "isWrapped", false);
        setBooleanField(term97998, term97998.getClass(), "isLimited", false);
        setField(term97998, term97998.getClass(), "limitedContext", null);
        setField(term97974, term97974.getClass(), "acc", term97998);
        setBooleanField(term97974, term97974.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term97974, term97974.getClass(), "isPosted", true);
        setBooleanField(term97974, term97974.getClass(), "isSystemGenerated", true);
        setField(term97974, term97974.getClass(), "source", term98041);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SummerHandler$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term97974;
        callMethod(klass, "mouseReleased", argTypes, term97973, args);
    }

};


