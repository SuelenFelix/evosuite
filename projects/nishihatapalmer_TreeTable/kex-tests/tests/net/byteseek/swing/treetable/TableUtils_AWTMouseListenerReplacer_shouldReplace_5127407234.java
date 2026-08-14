package net.byteseek.swing.treetable;

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
import static net.byteseek.swing.treetable.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TableUtils_AWTMouseListenerReplacer_shouldReplace_5127407234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82958;
     Object term82960;

    public TableUtils_AWTMouseListenerReplacer_shouldReplace_5127407234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82958 = newInstance(Class.forName("net.byteseek.swing.treetable.TableUtils$AWTMouseListenerReplacer"));
        setField(term82958, term82958.getClass(), "component", null);
        setIntField(term82958, term82958.getClass(), "eventReplacementId", -355469363);
        setField(term82958, term82958.getClass(), "replacementListener", null);
        setField(term82958, term82958.getClass(), "removeListener", null);
        term82960 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term82973 = (byte[]) newByteArray(3);
        Object term82979 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term82980 = (Object[]) newArray("java.security.ProtectionDomain", 6);
        Object term82981 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term82982 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term82983 = (Object[]) newArray("java.security.Principal", 8);
        Object term82986 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term82989 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term82992 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term82995 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term82998 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term83003 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term83013 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term82960, term82960.getClass(), "x", 1633913667);
        setIntField(term82960, term82960.getClass(), "y", 1292332296);
        setIntField(term82960, term82960.getClass(), "xAbs", -1415256843);
        setIntField(term82960, term82960.getClass(), "yAbs", 612177768);
        setIntField(term82960, term82960.getClass(), "clickCount", -1626451656);
        setBooleanField(term82960, term82960.getClass(), "causedByTouchEvent", false);
        setIntField(term82960, term82960.getClass(), "button", 173952451);
        setBooleanField(term82960, term82960.getClass(), "popupTrigger", false);
        setBooleanField(term82960, term82960.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term82960, term82960.getClass(), "when", 4872422362414183754L);
        setIntField(term82960, term82960.getClass(), "modifiers", -1972033388);
        setBooleanField(term82960, term82960.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term82973, 0, (byte) -111);
        setByteElement(term82973, 1, (byte) 23);
        setByteElement(term82973, 2, (byte) -15);
        setField(term82960, term82960.getClass(), "bdata", term82973);
        setIntField(term82960, term82960.getClass(), "id", -1005024758);
        setBooleanField(term82960, term82960.getClass(), "consumed", false);
        setField(term82982, term82982.getClass(), "location", null);
        setField(term82982, term82982.getClass(), "signers", null);
        setField(term82982, term82982.getClass(), "certs", null);
        setField(term82982, term82982.getClass(), "sp", null);
        setField(term82982, term82982.getClass(), "factory", null);
        setField(term82982, term82982.getClass(), "locationNoFragString", null);
        setField(term82981, term82981.getClass(), "codesource", term82982);
        setField(term82981, term82981.getClass(), "classloader", null);
        setField(term82981, term82981.getClass(), "principals", term82983);
        setField(term82981, term82981.getClass(), "permissions", null);
        setBooleanField(term82981, term82981.getClass(), "hasAllPerm", false);
        setBooleanField(term82981, term82981.getClass(), "staticPermissions", false);
        setField(term82981, term82981.getClass(), "key", null);
        setElement(term82980, 0, term82981);
        setField(term82986, term82986.getClass(), "codesource", null);
        setField(term82986, term82986.getClass(), "classloader", null);
        setField(term82986, term82986.getClass(), "principals", null);
        setField(term82986, term82986.getClass(), "permissions", null);
        setBooleanField(term82986, term82986.getClass(), "hasAllPerm", false);
        setBooleanField(term82986, term82986.getClass(), "staticPermissions", false);
        setField(term82986, term82986.getClass(), "key", null);
        setElement(term82980, 1, term82986);
        setField(term82989, term82989.getClass(), "codesource", null);
        setField(term82989, term82989.getClass(), "classloader", null);
        setField(term82989, term82989.getClass(), "principals", null);
        setField(term82989, term82989.getClass(), "permissions", null);
        setBooleanField(term82989, term82989.getClass(), "hasAllPerm", false);
        setBooleanField(term82989, term82989.getClass(), "staticPermissions", false);
        setField(term82989, term82989.getClass(), "key", null);
        setElement(term82980, 2, term82989);
        setField(term82992, term82992.getClass(), "codesource", null);
        setField(term82992, term82992.getClass(), "classloader", null);
        setField(term82992, term82992.getClass(), "principals", null);
        setField(term82992, term82992.getClass(), "permissions", null);
        setBooleanField(term82992, term82992.getClass(), "hasAllPerm", false);
        setBooleanField(term82992, term82992.getClass(), "staticPermissions", false);
        setField(term82992, term82992.getClass(), "key", null);
        setElement(term82980, 3, term82992);
        setField(term82995, term82995.getClass(), "codesource", null);
        setField(term82995, term82995.getClass(), "classloader", null);
        setField(term82995, term82995.getClass(), "principals", null);
        setField(term82995, term82995.getClass(), "permissions", null);
        setBooleanField(term82995, term82995.getClass(), "hasAllPerm", false);
        setBooleanField(term82995, term82995.getClass(), "staticPermissions", false);
        setField(term82995, term82995.getClass(), "key", null);
        setElement(term82980, 4, term82995);
        setField(term82998, term82998.getClass(), "codesource", null);
        setField(term82998, term82998.getClass(), "classloader", null);
        setField(term82998, term82998.getClass(), "principals", null);
        setField(term82998, term82998.getClass(), "permissions", null);
        setBooleanField(term82998, term82998.getClass(), "hasAllPerm", false);
        setBooleanField(term82998, term82998.getClass(), "staticPermissions", false);
        setField(term82998, term82998.getClass(), "key", null);
        setElement(term82980, 5, term82998);
        setField(term82979, term82979.getClass(), "context", term82980);
        setBooleanField(term82979, term82979.getClass(), "isPrivileged", false);
        setBooleanField(term82979, term82979.getClass(), "isAuthorized", false);
        setField(term83003, term83003.getClass(), "context", null);
        setBooleanField(term83003, term83003.getClass(), "isPrivileged", false);
        setBooleanField(term83003, term83003.getClass(), "isAuthorized", false);
        setField(term83003, term83003.getClass(), "privilegedContext", null);
        setField(term83003, term83003.getClass(), "combiner", null);
        setField(term83003, term83003.getClass(), "permissions", null);
        setField(term83003, term83003.getClass(), "parent", null);
        setBooleanField(term83003, term83003.getClass(), "isWrapped", false);
        setBooleanField(term83003, term83003.getClass(), "isLimited", false);
        setField(term83003, term83003.getClass(), "limitedContext", null);
        setField(term82979, term82979.getClass(), "privilegedContext", term83003);
        setField(term82979, term82979.getClass(), "combiner", null);
        setField(term82979, term82979.getClass(), "permissions", null);
        setField(term82979, term82979.getClass(), "parent", null);
        setBooleanField(term82979, term82979.getClass(), "isWrapped", false);
        setBooleanField(term82979, term82979.getClass(), "isLimited", false);
        setField(term82979, term82979.getClass(), "limitedContext", null);
        setField(term82960, term82960.getClass(), "acc", term82979);
        setBooleanField(term82960, term82960.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term82960, term82960.getClass(), "isPosted", false);
        setBooleanField(term82960, term82960.getClass(), "isSystemGenerated", false);
        setField(term82960, term82960.getClass(), "source", term83013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TableUtils$AWTMouseListenerReplacer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term82960;
        callMethod(klass, "shouldReplace", argTypes, term82958, args);
    }

};


