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

public class ShipDesignView_1_focusGained_4629279863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1931120;
     Object term1931121;

    public ShipDesignView_1_focusGained_4629279863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1931120 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipDesignView$1"));
        setField(term1931120, term1931120.getClass(), "this$0", null);
        term1931121 = newInstance(Class.forName("java.awt.event.FocusEvent"));
        Object term1931122 = newInstance(Class.forName("java.awt.event.FocusEvent$Cause"));
        byte[] term1931134 = (byte[]) newByteArray(5);
        Object term1931142 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term1931143 = (Object[]) newArray("java.security.ProtectionDomain", 2);
        Object term1931144 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1931145 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term1931146 = (Object[]) newArray("java.security.Principal", 7);
        Object term1931149 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term1931154 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term1931164 = newInstance(Class.forName("java.lang.Object"));
        setField(term1931122, term1931122.getClass(), "name", "UNKNOWN");
        setIntField(term1931122, term1931122.getClass(), "ordinal", 0);
        setField(term1931121, term1931121.getClass(), "cause", term1931122);
        setBooleanField(term1931121, term1931121.getClass(), "temporary", true);
        setField(term1931121, term1931121.getClass(), "opposite", null);
        setByteElement(term1931134, 0, (byte) 23);
        setByteElement(term1931134, 1, (byte) -14);
        setByteElement(term1931134, 2, (byte) 64);
        setByteElement(term1931134, 3, (byte) 59);
        setByteElement(term1931134, 4, (byte) 5);
        setField(term1931121, term1931121.getClass(), "bdata", term1931134);
        setIntField(term1931121, term1931121.getClass(), "id", -163456204);
        setBooleanField(term1931121, term1931121.getClass(), "consumed", true);
        setField(term1931145, term1931145.getClass(), "location", null);
        setField(term1931145, term1931145.getClass(), "signers", null);
        setField(term1931145, term1931145.getClass(), "certs", null);
        setField(term1931145, term1931145.getClass(), "sp", null);
        setField(term1931145, term1931145.getClass(), "factory", null);
        setField(term1931145, term1931145.getClass(), "locationNoFragString", null);
        setField(term1931144, term1931144.getClass(), "codesource", term1931145);
        setField(term1931144, term1931144.getClass(), "classloader", null);
        setField(term1931144, term1931144.getClass(), "principals", term1931146);
        setField(term1931144, term1931144.getClass(), "permissions", null);
        setBooleanField(term1931144, term1931144.getClass(), "hasAllPerm", false);
        setBooleanField(term1931144, term1931144.getClass(), "staticPermissions", false);
        setField(term1931144, term1931144.getClass(), "key", null);
        setElement(term1931143, 0, term1931144);
        setField(term1931149, term1931149.getClass(), "codesource", null);
        setField(term1931149, term1931149.getClass(), "classloader", null);
        setField(term1931149, term1931149.getClass(), "principals", null);
        setField(term1931149, term1931149.getClass(), "permissions", null);
        setBooleanField(term1931149, term1931149.getClass(), "hasAllPerm", false);
        setBooleanField(term1931149, term1931149.getClass(), "staticPermissions", false);
        setField(term1931149, term1931149.getClass(), "key", null);
        setElement(term1931143, 1, term1931149);
        setField(term1931142, term1931142.getClass(), "context", term1931143);
        setBooleanField(term1931142, term1931142.getClass(), "isPrivileged", true);
        setBooleanField(term1931142, term1931142.getClass(), "isAuthorized", true);
        setField(term1931154, term1931154.getClass(), "context", null);
        setBooleanField(term1931154, term1931154.getClass(), "isPrivileged", false);
        setBooleanField(term1931154, term1931154.getClass(), "isAuthorized", false);
        setField(term1931154, term1931154.getClass(), "privilegedContext", null);
        setField(term1931154, term1931154.getClass(), "combiner", null);
        setField(term1931154, term1931154.getClass(), "permissions", null);
        setField(term1931154, term1931154.getClass(), "parent", null);
        setBooleanField(term1931154, term1931154.getClass(), "isWrapped", false);
        setBooleanField(term1931154, term1931154.getClass(), "isLimited", false);
        setField(term1931154, term1931154.getClass(), "limitedContext", null);
        setField(term1931142, term1931142.getClass(), "privilegedContext", term1931154);
        setField(term1931142, term1931142.getClass(), "combiner", null);
        setField(term1931142, term1931142.getClass(), "permissions", null);
        setField(term1931142, term1931142.getClass(), "parent", null);
        setBooleanField(term1931142, term1931142.getClass(), "isWrapped", false);
        setBooleanField(term1931142, term1931142.getClass(), "isLimited", false);
        setField(term1931142, term1931142.getClass(), "limitedContext", null);
        setField(term1931121, term1931121.getClass(), "acc", term1931142);
        setBooleanField(term1931121, term1931121.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term1931121, term1931121.getClass(), "isPosted", false);
        setBooleanField(term1931121, term1931121.getClass(), "isSystemGenerated", false);
        setField(term1931121, term1931121.getClass(), "source", term1931164);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipDesignView$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.FocusEvent");
        Object[] args = new Object[1];
        args[0] = term1931121;
        callMethod(klass, "focusGained", argTypes, term1931120, args);
    }

};


