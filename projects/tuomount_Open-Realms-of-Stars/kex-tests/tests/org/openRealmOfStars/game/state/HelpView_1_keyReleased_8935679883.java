package org.openRealmOfStars.game.state;

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
import static org.openRealmOfStars.game.state.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class HelpView_1_keyReleased_8935679883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83647;
     Object term83648;

    public HelpView_1_keyReleased_8935679883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83647 = newInstance(Class.forName("org.openRealmOfStars.game.state.HelpView$1"));
        setField(term83647, term83647.getClass(), "this$0", null);
        term83648 = newInstance(Class.forName("java.awt.event.KeyEvent"));
        byte[] term83660 = (byte[]) newByteArray(7);
        Object term83670 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term83671 = (Object[]) newArray("java.security.ProtectionDomain", 0);
        Object term83674 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term83675 = (Object[]) newArray("java.security.ProtectionDomain", 0);
        Object term83678 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term83679 = (Object[]) newArray("java.security.ProtectionDomain", 7);
        Object term83682 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term83696 = newInstance(Class.forName("java.lang.Object"));
        setBooleanField(term83648, term83648.getClass(), "isProxyActive", true);
        setIntField(term83648, term83648.getClass(), "keyCode", 24416797);
        setCharField(term83648, term83648.getClass(), "keyChar", 'E');
        setIntField(term83648, term83648.getClass(), "keyLocation", 1333624993);
        setLongField(term83648, term83648.getClass(), "rawCode", 4872422362414183754L);
        setLongField(term83648, term83648.getClass(), "primaryLevelUnicode", 6811161968424632369L);
        setLongField(term83648, term83648.getClass(), "scancode", -7237588299778557629L);
        setLongField(term83648, term83648.getClass(), "extendedKeyCode", 6967924379644551255L);
        setField(term83648, term83648.getClass(), "originalSource", null);
        setLongField(term83648, term83648.getClass(), "when", -2813493605142626659L);
        setIntField(term83648, term83648.getClass(), "modifiers", -1351263253);
        setBooleanField(term83648, term83648.getClass(), "canAccessSystemClipboard", true);
        setByteElement(term83660, 0, (byte) 122);
        setByteElement(term83660, 1, (byte) -30);
        setByteElement(term83660, 2, (byte) 102);
        setByteElement(term83660, 3, (byte) 59);
        setByteElement(term83660, 4, (byte) -79);
        setByteElement(term83660, 5, (byte) -33);
        setByteElement(term83660, 6, (byte) 1);
        setField(term83648, term83648.getClass(), "bdata", term83660);
        setIntField(term83648, term83648.getClass(), "id", -2032135607);
        setBooleanField(term83648, term83648.getClass(), "consumed", true);
        setField(term83670, term83670.getClass(), "context", term83671);
        setBooleanField(term83670, term83670.getClass(), "isPrivileged", false);
        setBooleanField(term83670, term83670.getClass(), "isAuthorized", true);
        setField(term83674, term83674.getClass(), "context", term83675);
        setBooleanField(term83674, term83674.getClass(), "isPrivileged", true);
        setBooleanField(term83674, term83674.getClass(), "isAuthorized", false);
        setField(term83678, term83678.getClass(), "context", term83679);
        setBooleanField(term83678, term83678.getClass(), "isPrivileged", true);
        setBooleanField(term83678, term83678.getClass(), "isAuthorized", false);
        setField(term83682, term83682.getClass(), "context", null);
        setBooleanField(term83682, term83682.getClass(), "isPrivileged", false);
        setBooleanField(term83682, term83682.getClass(), "isAuthorized", false);
        setField(term83682, term83682.getClass(), "privilegedContext", null);
        setField(term83682, term83682.getClass(), "combiner", null);
        setField(term83682, term83682.getClass(), "permissions", null);
        setField(term83682, term83682.getClass(), "parent", null);
        setBooleanField(term83682, term83682.getClass(), "isWrapped", false);
        setBooleanField(term83682, term83682.getClass(), "isLimited", false);
        setField(term83682, term83682.getClass(), "limitedContext", null);
        setField(term83678, term83678.getClass(), "privilegedContext", term83682);
        setField(term83678, term83678.getClass(), "combiner", null);
        setField(term83678, term83678.getClass(), "permissions", null);
        setField(term83678, term83678.getClass(), "parent", null);
        setBooleanField(term83678, term83678.getClass(), "isWrapped", false);
        setBooleanField(term83678, term83678.getClass(), "isLimited", false);
        setField(term83678, term83678.getClass(), "limitedContext", null);
        setField(term83674, term83674.getClass(), "privilegedContext", term83678);
        setField(term83674, term83674.getClass(), "combiner", null);
        setField(term83674, term83674.getClass(), "permissions", null);
        setField(term83674, term83674.getClass(), "parent", null);
        setBooleanField(term83674, term83674.getClass(), "isWrapped", false);
        setBooleanField(term83674, term83674.getClass(), "isLimited", false);
        setField(term83674, term83674.getClass(), "limitedContext", null);
        setField(term83670, term83670.getClass(), "privilegedContext", term83674);
        setField(term83670, term83670.getClass(), "combiner", null);
        setField(term83670, term83670.getClass(), "permissions", null);
        setField(term83670, term83670.getClass(), "parent", null);
        setBooleanField(term83670, term83670.getClass(), "isWrapped", false);
        setBooleanField(term83670, term83670.getClass(), "isLimited", false);
        setField(term83670, term83670.getClass(), "limitedContext", null);
        setField(term83648, term83648.getClass(), "acc", term83670);
        setBooleanField(term83648, term83648.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term83648, term83648.getClass(), "isPosted", false);
        setBooleanField(term83648, term83648.getClass(), "isSystemGenerated", false);
        setField(term83648, term83648.getClass(), "source", term83696);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.HelpView$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.KeyEvent");
        Object[] args = new Object[1];
        args[0] = term83648;
        callMethod(klass, "keyReleased", argTypes, term83647, args);
    }

};


