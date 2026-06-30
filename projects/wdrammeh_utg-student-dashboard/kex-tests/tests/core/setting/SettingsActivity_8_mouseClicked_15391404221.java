package core.setting;

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
import static core.setting.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SettingsActivity_8_mouseClicked_15391404221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3628;
     Object term3629;

    public SettingsActivity_8_mouseClicked_15391404221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3628 = newInstance(Class.forName("core.setting.SettingsActivity$8"));
        term3629 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term3642 = (byte[]) newByteArray(9);
        Object term3654 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term3655 = (Object[]) newArray("java.security.ProtectionDomain", 3);
        Object term3656 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term3657 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term3658 = (Object[]) newArray("java.security.Principal", 5);
        Object term3661 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term3664 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term3669 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term3679 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term3629, term3629.getClass(), "x", 1045657203);
        setIntField(term3629, term3629.getClass(), "y", 1386130016);
        setIntField(term3629, term3629.getClass(), "xAbs", 1072005683);
        setIntField(term3629, term3629.getClass(), "yAbs", 1861318859);
        setIntField(term3629, term3629.getClass(), "clickCount", 1474524152);
        setBooleanField(term3629, term3629.getClass(), "causedByTouchEvent", true);
        setIntField(term3629, term3629.getClass(), "button", 568954359);
        setBooleanField(term3629, term3629.getClass(), "popupTrigger", true);
        setBooleanField(term3629, term3629.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term3629, term3629.getClass(), "when", 2535595959091595249L);
        setIntField(term3629, term3629.getClass(), "modifiers", 53410913);
        setBooleanField(term3629, term3629.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term3642, 0, (byte) -10);
        setByteElement(term3642, 1, (byte) 79);
        setByteElement(term3642, 2, (byte) -119);
        setByteElement(term3642, 3, (byte) -66);
        setByteElement(term3642, 4, (byte) 83);
        setByteElement(term3642, 5, (byte) 74);
        setByteElement(term3642, 6, (byte) -71);
        setByteElement(term3642, 7, (byte) 49);
        setByteElement(term3642, 8, (byte) -54);
        setField(term3629, term3629.getClass(), "bdata", term3642);
        setIntField(term3629, term3629.getClass(), "id", -375014958);
        setBooleanField(term3629, term3629.getClass(), "consumed", true);
        setField(term3657, term3657.getClass(), "location", null);
        setField(term3657, term3657.getClass(), "signers", null);
        setField(term3657, term3657.getClass(), "certs", null);
        setField(term3657, term3657.getClass(), "sp", null);
        setField(term3657, term3657.getClass(), "factory", null);
        setField(term3657, term3657.getClass(), "locationNoFragString", null);
        setField(term3656, term3656.getClass(), "codesource", term3657);
        setField(term3656, term3656.getClass(), "classloader", null);
        setField(term3656, term3656.getClass(), "principals", term3658);
        setField(term3656, term3656.getClass(), "permissions", null);
        setBooleanField(term3656, term3656.getClass(), "hasAllPerm", false);
        setBooleanField(term3656, term3656.getClass(), "staticPermissions", false);
        setField(term3656, term3656.getClass(), "key", null);
        setElement(term3655, 0, term3656);
        setField(term3661, term3661.getClass(), "codesource", null);
        setField(term3661, term3661.getClass(), "classloader", null);
        setField(term3661, term3661.getClass(), "principals", null);
        setField(term3661, term3661.getClass(), "permissions", null);
        setBooleanField(term3661, term3661.getClass(), "hasAllPerm", false);
        setBooleanField(term3661, term3661.getClass(), "staticPermissions", false);
        setField(term3661, term3661.getClass(), "key", null);
        setElement(term3655, 1, term3661);
        setField(term3664, term3664.getClass(), "codesource", null);
        setField(term3664, term3664.getClass(), "classloader", null);
        setField(term3664, term3664.getClass(), "principals", null);
        setField(term3664, term3664.getClass(), "permissions", null);
        setBooleanField(term3664, term3664.getClass(), "hasAllPerm", false);
        setBooleanField(term3664, term3664.getClass(), "staticPermissions", false);
        setField(term3664, term3664.getClass(), "key", null);
        setElement(term3655, 2, term3664);
        setField(term3654, term3654.getClass(), "context", term3655);
        setBooleanField(term3654, term3654.getClass(), "isPrivileged", false);
        setBooleanField(term3654, term3654.getClass(), "isAuthorized", false);
        setField(term3669, term3669.getClass(), "context", null);
        setBooleanField(term3669, term3669.getClass(), "isPrivileged", false);
        setBooleanField(term3669, term3669.getClass(), "isAuthorized", false);
        setField(term3669, term3669.getClass(), "privilegedContext", null);
        setField(term3669, term3669.getClass(), "combiner", null);
        setField(term3669, term3669.getClass(), "permissions", null);
        setField(term3669, term3669.getClass(), "parent", null);
        setBooleanField(term3669, term3669.getClass(), "isWrapped", false);
        setBooleanField(term3669, term3669.getClass(), "isLimited", false);
        setField(term3669, term3669.getClass(), "limitedContext", null);
        setField(term3654, term3654.getClass(), "privilegedContext", term3669);
        setField(term3654, term3654.getClass(), "combiner", null);
        setField(term3654, term3654.getClass(), "permissions", null);
        setField(term3654, term3654.getClass(), "parent", null);
        setBooleanField(term3654, term3654.getClass(), "isWrapped", false);
        setBooleanField(term3654, term3654.getClass(), "isLimited", false);
        setField(term3654, term3654.getClass(), "limitedContext", null);
        setField(term3629, term3629.getClass(), "acc", term3654);
        setBooleanField(term3629, term3629.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term3629, term3629.getClass(), "isPosted", true);
        setBooleanField(term3629, term3629.getClass(), "isSystemGenerated", true);
        setField(term3629, term3629.getClass(), "source", term3679);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.setting.SettingsActivity$8");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term3629;
        callMethod(klass, "mouseClicked", argTypes, term3628, args);
    }

};


