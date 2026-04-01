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

public class ShipDesignView_1_focusLost_20149613642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1931014;
     Object term1931015;

    public ShipDesignView_1_focusLost_20149613642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1931014 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipDesignView$1"));
        setField(term1931014, term1931014.getClass(), "this$0", null);
        term1931015 = newInstance(Class.forName("java.awt.event.FocusEvent"));
        Object term1931016 = newInstance(Class.forName("java.awt.event.FocusEvent$Cause"));
        byte[] term1931045 = (byte[]) newByteArray(8);
        Object term1931056 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term1931057 = (Object[]) newArray("java.security.ProtectionDomain", 5);
        Object term1931058 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1931059 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term1931060 = (Object[]) newArray("java.security.Principal", 1);
        Object term1931063 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1931066 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1931069 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1931072 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1931077 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term1931087 = newInstance(Class.forName("java.lang.Object"));
        setField(term1931016, term1931016.getClass(), "name", "CLEAR_GLOBAL_FOCUS_OWNER");
        setIntField(term1931016, term1931016.getClass(), "ordinal", 10);
        setField(term1931015, term1931015.getClass(), "cause", term1931016);
        setBooleanField(term1931015, term1931015.getClass(), "temporary", false);
        setField(term1931015, term1931015.getClass(), "opposite", null);
        setByteElement(term1931045, 0, (byte) 13);
        setByteElement(term1931045, 1, (byte) 69);
        setByteElement(term1931045, 2, (byte) 126);
        setByteElement(term1931045, 3, (byte) 47);
        setByteElement(term1931045, 4, (byte) 123);
        setByteElement(term1931045, 5, (byte) 13);
        setByteElement(term1931045, 6, (byte) -78);
        setByteElement(term1931045, 7, (byte) -104);
        setField(term1931015, term1931015.getClass(), "bdata", term1931045);
        setIntField(term1931015, term1931015.getClass(), "id", -14953655);
        setBooleanField(term1931015, term1931015.getClass(), "consumed", true);
        setField(term1931059, term1931059.getClass(), "location", null);
        setField(term1931059, term1931059.getClass(), "signers", null);
        setField(term1931059, term1931059.getClass(), "certs", null);
        setField(term1931059, term1931059.getClass(), "sp", null);
        setField(term1931059, term1931059.getClass(), "factory", null);
        setField(term1931059, term1931059.getClass(), "locationNoFragString", null);
        setField(term1931058, term1931058.getClass(), "codesource", term1931059);
        setField(term1931058, term1931058.getClass(), "classloader", null);
        setField(term1931058, term1931058.getClass(), "principals", term1931060);
        setField(term1931058, term1931058.getClass(), "permissions", null);
        setBooleanField(term1931058, term1931058.getClass(), "hasAllPerm", false);
        setBooleanField(term1931058, term1931058.getClass(), "staticPermissions", false);
        setField(term1931058, term1931058.getClass(), "key", null);
        setElement(term1931057, 0, term1931058);
        setField(term1931063, term1931063.getClass(), "codesource", null);
        setField(term1931063, term1931063.getClass(), "classloader", null);
        setField(term1931063, term1931063.getClass(), "principals", null);
        setField(term1931063, term1931063.getClass(), "permissions", null);
        setBooleanField(term1931063, term1931063.getClass(), "hasAllPerm", false);
        setBooleanField(term1931063, term1931063.getClass(), "staticPermissions", false);
        setField(term1931063, term1931063.getClass(), "key", null);
        setElement(term1931057, 1, term1931063);
        setField(term1931066, term1931066.getClass(), "codesource", null);
        setField(term1931066, term1931066.getClass(), "classloader", null);
        setField(term1931066, term1931066.getClass(), "principals", null);
        setField(term1931066, term1931066.getClass(), "permissions", null);
        setBooleanField(term1931066, term1931066.getClass(), "hasAllPerm", false);
        setBooleanField(term1931066, term1931066.getClass(), "staticPermissions", false);
        setField(term1931066, term1931066.getClass(), "key", null);
        setElement(term1931057, 2, term1931066);
        setField(term1931069, term1931069.getClass(), "codesource", null);
        setField(term1931069, term1931069.getClass(), "classloader", null);
        setField(term1931069, term1931069.getClass(), "principals", null);
        setField(term1931069, term1931069.getClass(), "permissions", null);
        setBooleanField(term1931069, term1931069.getClass(), "hasAllPerm", false);
        setBooleanField(term1931069, term1931069.getClass(), "staticPermissions", false);
        setField(term1931069, term1931069.getClass(), "key", null);
        setElement(term1931057, 3, term1931069);
        setField(term1931072, term1931072.getClass(), "codesource", null);
        setField(term1931072, term1931072.getClass(), "classloader", null);
        setField(term1931072, term1931072.getClass(), "principals", null);
        setField(term1931072, term1931072.getClass(), "permissions", null);
        setBooleanField(term1931072, term1931072.getClass(), "hasAllPerm", false);
        setBooleanField(term1931072, term1931072.getClass(), "staticPermissions", false);
        setField(term1931072, term1931072.getClass(), "key", null);
        setElement(term1931057, 4, term1931072);
        setField(term1931056, term1931056.getClass(), "context", term1931057);
        setBooleanField(term1931056, term1931056.getClass(), "isPrivileged", true);
        setBooleanField(term1931056, term1931056.getClass(), "isAuthorized", true);
        setField(term1931077, term1931077.getClass(), "context", null);
        setBooleanField(term1931077, term1931077.getClass(), "isPrivileged", false);
        setBooleanField(term1931077, term1931077.getClass(), "isAuthorized", false);
        setField(term1931077, term1931077.getClass(), "privilegedContext", null);
        setField(term1931077, term1931077.getClass(), "combiner", null);
        setField(term1931077, term1931077.getClass(), "permissions", null);
        setField(term1931077, term1931077.getClass(), "parent", null);
        setBooleanField(term1931077, term1931077.getClass(), "isWrapped", false);
        setBooleanField(term1931077, term1931077.getClass(), "isLimited", false);
        setField(term1931077, term1931077.getClass(), "limitedContext", null);
        setField(term1931056, term1931056.getClass(), "privilegedContext", term1931077);
        setField(term1931056, term1931056.getClass(), "combiner", null);
        setField(term1931056, term1931056.getClass(), "permissions", null);
        setField(term1931056, term1931056.getClass(), "parent", null);
        setBooleanField(term1931056, term1931056.getClass(), "isWrapped", false);
        setBooleanField(term1931056, term1931056.getClass(), "isLimited", false);
        setField(term1931056, term1931056.getClass(), "limitedContext", null);
        setField(term1931015, term1931015.getClass(), "acc", term1931056);
        setBooleanField(term1931015, term1931015.getClass(), "focusManagerIsDispatching", true);
        setBooleanField(term1931015, term1931015.getClass(), "isPosted", false);
        setBooleanField(term1931015, term1931015.getClass(), "isSystemGenerated", true);
        setField(term1931015, term1931015.getClass(), "source", term1931087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipDesignView$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.FocusEvent");
        Object[] args = new Object[1];
        args[0] = term1931015;
        callMethod(klass, "focusLost", argTypes, term1931014, args);
    }

};


