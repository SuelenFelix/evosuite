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
     Object term83694;
     Object term83696;

    public TableUtils_AWTMouseListenerReplacer_shouldReplace_5127407234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83694 = newInstance(Class.forName("net.byteseek.swing.treetable.TableUtils$AWTMouseListenerReplacer"));
        setField(term83694, term83694.getClass(), "component", null);
        setIntField(term83694, term83694.getClass(), "eventReplacementId", 864645689);
        setField(term83694, term83694.getClass(), "replacementListener", null);
        setField(term83694, term83694.getClass(), "removeListener", null);
        term83696 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term83709 = (byte[]) newByteArray(2);
        Object term83714 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term83715 = (Object[]) newArray("java.security.ProtectionDomain", 5);
        Object term83716 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term83717 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term83718 = (Object[]) newArray("java.security.Principal", 0);
        Object term83721 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term83724 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term83727 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term83730 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term83735 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term83745 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term83696, term83696.getClass(), "x", 1427305953);
        setIntField(term83696, term83696.getClass(), "y", -781832877);
        setIntField(term83696, term83696.getClass(), "xAbs", 797203987);
        setIntField(term83696, term83696.getClass(), "yAbs", 1973060703);
        setIntField(term83696, term83696.getClass(), "clickCount", -138239905);
        setBooleanField(term83696, term83696.getClass(), "causedByTouchEvent", false);
        setIntField(term83696, term83696.getClass(), "button", 1709474063);
        setBooleanField(term83696, term83696.getClass(), "popupTrigger", false);
        setBooleanField(term83696, term83696.getClass(), "shouldExcludeButtonFromExtModifiers", true);
        setLongField(term83696, term83696.getClass(), "when", 4872422362414183754L);
        setIntField(term83696, term83696.getClass(), "modifiers", 1406617209);
        setBooleanField(term83696, term83696.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term83709, 0, (byte) -54);
        setByteElement(term83709, 1, (byte) 67);
        setField(term83696, term83696.getClass(), "bdata", term83709);
        setIntField(term83696, term83696.getClass(), "id", 1706047059);
        setBooleanField(term83696, term83696.getClass(), "consumed", false);
        setField(term83717, term83717.getClass(), "location", null);
        setField(term83717, term83717.getClass(), "signers", null);
        setField(term83717, term83717.getClass(), "certs", null);
        setField(term83717, term83717.getClass(), "sp", null);
        setField(term83717, term83717.getClass(), "factory", null);
        setField(term83717, term83717.getClass(), "locationNoFragString", null);
        setField(term83716, term83716.getClass(), "codesource", term83717);
        setField(term83716, term83716.getClass(), "classloader", null);
        setField(term83716, term83716.getClass(), "principals", term83718);
        setField(term83716, term83716.getClass(), "permissions", null);
        setBooleanField(term83716, term83716.getClass(), "hasAllPerm", false);
        setBooleanField(term83716, term83716.getClass(), "staticPermissions", false);
        setField(term83716, term83716.getClass(), "key", null);
        setElement(term83715, 0, term83716);
        setField(term83721, term83721.getClass(), "codesource", null);
        setField(term83721, term83721.getClass(), "classloader", null);
        setField(term83721, term83721.getClass(), "principals", null);
        setField(term83721, term83721.getClass(), "permissions", null);
        setBooleanField(term83721, term83721.getClass(), "hasAllPerm", false);
        setBooleanField(term83721, term83721.getClass(), "staticPermissions", false);
        setField(term83721, term83721.getClass(), "key", null);
        setElement(term83715, 1, term83721);
        setField(term83724, term83724.getClass(), "codesource", null);
        setField(term83724, term83724.getClass(), "classloader", null);
        setField(term83724, term83724.getClass(), "principals", null);
        setField(term83724, term83724.getClass(), "permissions", null);
        setBooleanField(term83724, term83724.getClass(), "hasAllPerm", false);
        setBooleanField(term83724, term83724.getClass(), "staticPermissions", false);
        setField(term83724, term83724.getClass(), "key", null);
        setElement(term83715, 2, term83724);
        setField(term83727, term83727.getClass(), "codesource", null);
        setField(term83727, term83727.getClass(), "classloader", null);
        setField(term83727, term83727.getClass(), "principals", null);
        setField(term83727, term83727.getClass(), "permissions", null);
        setBooleanField(term83727, term83727.getClass(), "hasAllPerm", false);
        setBooleanField(term83727, term83727.getClass(), "staticPermissions", false);
        setField(term83727, term83727.getClass(), "key", null);
        setElement(term83715, 3, term83727);
        setField(term83730, term83730.getClass(), "codesource", null);
        setField(term83730, term83730.getClass(), "classloader", null);
        setField(term83730, term83730.getClass(), "principals", null);
        setField(term83730, term83730.getClass(), "permissions", null);
        setBooleanField(term83730, term83730.getClass(), "hasAllPerm", false);
        setBooleanField(term83730, term83730.getClass(), "staticPermissions", false);
        setField(term83730, term83730.getClass(), "key", null);
        setElement(term83715, 4, term83730);
        setField(term83714, term83714.getClass(), "context", term83715);
        setBooleanField(term83714, term83714.getClass(), "isPrivileged", false);
        setBooleanField(term83714, term83714.getClass(), "isAuthorized", false);
        setField(term83735, term83735.getClass(), "context", null);
        setBooleanField(term83735, term83735.getClass(), "isPrivileged", false);
        setBooleanField(term83735, term83735.getClass(), "isAuthorized", false);
        setField(term83735, term83735.getClass(), "privilegedContext", null);
        setField(term83735, term83735.getClass(), "combiner", null);
        setField(term83735, term83735.getClass(), "permissions", null);
        setField(term83735, term83735.getClass(), "parent", null);
        setBooleanField(term83735, term83735.getClass(), "isWrapped", false);
        setBooleanField(term83735, term83735.getClass(), "isLimited", false);
        setField(term83735, term83735.getClass(), "limitedContext", null);
        setField(term83714, term83714.getClass(), "privilegedContext", term83735);
        setField(term83714, term83714.getClass(), "combiner", null);
        setField(term83714, term83714.getClass(), "permissions", null);
        setField(term83714, term83714.getClass(), "parent", null);
        setBooleanField(term83714, term83714.getClass(), "isWrapped", false);
        setBooleanField(term83714, term83714.getClass(), "isLimited", false);
        setField(term83714, term83714.getClass(), "limitedContext", null);
        setField(term83696, term83696.getClass(), "acc", term83714);
        setBooleanField(term83696, term83696.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term83696, term83696.getClass(), "isPosted", false);
        setBooleanField(term83696, term83696.getClass(), "isSystemGenerated", false);
        setField(term83696, term83696.getClass(), "source", term83745);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.byteseek.swing.treetable.TableUtils$AWTMouseListenerReplacer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term83696;
        callMethod(klass, "shouldReplace", argTypes, term83694, args);
    }

};


