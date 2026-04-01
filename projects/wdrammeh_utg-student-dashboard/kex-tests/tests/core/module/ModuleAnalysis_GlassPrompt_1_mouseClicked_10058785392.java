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

public class ModuleAnalysis_GlassPrompt_1_mouseClicked_10058785392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163102;
     Object term163240;

    public ModuleAnalysis_GlassPrompt_1_mouseClicked_10058785392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163102 = newInstance(Class.forName("core.module.ModuleAnalysis$GlassPrompt$1"));
        Object term163103 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term163103, term163103.getClass(), "score", 0.13481025392611334);
        setField(term163103, term163103.getClass(), "code", "ccnotFfPXt");
        setField(term163103, term163103.getClass(), "name", "plWlgdgIhn");
        setField(term163103, term163103.getClass(), "year", "RZaKVKWtND");
        setField(term163103, term163103.getClass(), "semester", "vXiaNiquft");
        setField(term163103, term163103.getClass(), "lecturer", "lucCeiVnYe");
        setBooleanField(term163103, term163103.getClass(), "isLecturerEditable", true);
        setField(term163103, term163103.getClass(), "campus", "iYwkCLMsbJ");
        setField(term163103, term163103.getClass(), "room", "MXLsVQWrwc");
        setField(term163103, term163103.getClass(), "day", "lRaSlqzqNY");
        setField(term163103, term163103.getClass(), "time", "TiEyxWXsra");
        setField(term163103, term163103.getClass(), "requirement", "TuLgwTZsPP");
        setIntField(term163103, term163103.getClass(), "creditHours", 1248430530);
        setBooleanField(term163103, term163103.getClass(), "isConfirmed", true);
        setField(term163103, term163103.getClass(), "status", "KoasxTJGpx");
        setField(term163102, term163102.getClass(), "val$c", term163103);
        setField(term163102, term163102.getClass(), "this$0", null);
        term163240 = newInstance(Class.forName("java.awt.event.MouseEvent"));
        byte[] term163253 = (byte[]) newByteArray(5);
        Object term163261 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object[] term163262 = (Object[]) newArray("java.security.ProtectionDomain", 9);
        Object term163263 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term163264 = newInstance(Class.forName("java.security.CodeSource"));
        Object[] term163265 = (Object[]) newArray("java.security.Principal", 3);
        Object term163268 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term163271 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term163274 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term163277 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term163280 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term163283 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term163286 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term163289 = newInstance(Class.forName("java.security.ProtectionDomain"));
        Object term163294 = newInstance(Class.forName("java.security.AccessControlContext"));
        Object term163304 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term163240, term163240.getClass(), "x", 241725499);
        setIntField(term163240, term163240.getClass(), "y", 823179298);
        setIntField(term163240, term163240.getClass(), "xAbs", 1174484848);
        setIntField(term163240, term163240.getClass(), "yAbs", 939889496);
        setIntField(term163240, term163240.getClass(), "clickCount", -495242269);
        setBooleanField(term163240, term163240.getClass(), "causedByTouchEvent", false);
        setIntField(term163240, term163240.getClass(), "button", 932810106);
        setBooleanField(term163240, term163240.getClass(), "popupTrigger", true);
        setBooleanField(term163240, term163240.getClass(), "shouldExcludeButtonFromExtModifiers", false);
        setLongField(term163240, term163240.getClass(), "when", 1457594663983990440L);
        setIntField(term163240, term163240.getClass(), "modifiers", -2138801137);
        setBooleanField(term163240, term163240.getClass(), "canAccessSystemClipboard", false);
        setByteElement(term163253, 0, (byte) 116);
        setByteElement(term163253, 1, (byte) -81);
        setByteElement(term163253, 2, (byte) 102);
        setByteElement(term163253, 3, (byte) -118);
        setByteElement(term163253, 4, (byte) -126);
        setField(term163240, term163240.getClass(), "bdata", term163253);
        setIntField(term163240, term163240.getClass(), "id", -1470115841);
        setBooleanField(term163240, term163240.getClass(), "consumed", false);
        setField(term163264, term163264.getClass(), "location", null);
        setField(term163264, term163264.getClass(), "signers", null);
        setField(term163264, term163264.getClass(), "certs", null);
        setField(term163264, term163264.getClass(), "sp", null);
        setField(term163264, term163264.getClass(), "factory", null);
        setField(term163264, term163264.getClass(), "locationNoFragString", null);
        setField(term163263, term163263.getClass(), "codesource", term163264);
        setField(term163263, term163263.getClass(), "classloader", null);
        setField(term163263, term163263.getClass(), "principals", term163265);
        setField(term163263, term163263.getClass(), "permissions", null);
        setBooleanField(term163263, term163263.getClass(), "hasAllPerm", false);
        setBooleanField(term163263, term163263.getClass(), "staticPermissions", false);
        setField(term163263, term163263.getClass(), "key", null);
        setElement(term163262, 0, term163263);
        setField(term163268, term163268.getClass(), "codesource", null);
        setField(term163268, term163268.getClass(), "classloader", null);
        setField(term163268, term163268.getClass(), "principals", null);
        setField(term163268, term163268.getClass(), "permissions", null);
        setBooleanField(term163268, term163268.getClass(), "hasAllPerm", false);
        setBooleanField(term163268, term163268.getClass(), "staticPermissions", false);
        setField(term163268, term163268.getClass(), "key", null);
        setElement(term163262, 1, term163268);
        setField(term163271, term163271.getClass(), "codesource", null);
        setField(term163271, term163271.getClass(), "classloader", null);
        setField(term163271, term163271.getClass(), "principals", null);
        setField(term163271, term163271.getClass(), "permissions", null);
        setBooleanField(term163271, term163271.getClass(), "hasAllPerm", false);
        setBooleanField(term163271, term163271.getClass(), "staticPermissions", false);
        setField(term163271, term163271.getClass(), "key", null);
        setElement(term163262, 2, term163271);
        setField(term163274, term163274.getClass(), "codesource", null);
        setField(term163274, term163274.getClass(), "classloader", null);
        setField(term163274, term163274.getClass(), "principals", null);
        setField(term163274, term163274.getClass(), "permissions", null);
        setBooleanField(term163274, term163274.getClass(), "hasAllPerm", false);
        setBooleanField(term163274, term163274.getClass(), "staticPermissions", false);
        setField(term163274, term163274.getClass(), "key", null);
        setElement(term163262, 3, term163274);
        setField(term163277, term163277.getClass(), "codesource", null);
        setField(term163277, term163277.getClass(), "classloader", null);
        setField(term163277, term163277.getClass(), "principals", null);
        setField(term163277, term163277.getClass(), "permissions", null);
        setBooleanField(term163277, term163277.getClass(), "hasAllPerm", false);
        setBooleanField(term163277, term163277.getClass(), "staticPermissions", false);
        setField(term163277, term163277.getClass(), "key", null);
        setElement(term163262, 4, term163277);
        setField(term163280, term163280.getClass(), "codesource", null);
        setField(term163280, term163280.getClass(), "classloader", null);
        setField(term163280, term163280.getClass(), "principals", null);
        setField(term163280, term163280.getClass(), "permissions", null);
        setBooleanField(term163280, term163280.getClass(), "hasAllPerm", false);
        setBooleanField(term163280, term163280.getClass(), "staticPermissions", false);
        setField(term163280, term163280.getClass(), "key", null);
        setElement(term163262, 5, term163280);
        setField(term163283, term163283.getClass(), "codesource", null);
        setField(term163283, term163283.getClass(), "classloader", null);
        setField(term163283, term163283.getClass(), "principals", null);
        setField(term163283, term163283.getClass(), "permissions", null);
        setBooleanField(term163283, term163283.getClass(), "hasAllPerm", false);
        setBooleanField(term163283, term163283.getClass(), "staticPermissions", false);
        setField(term163283, term163283.getClass(), "key", null);
        setElement(term163262, 6, term163283);
        setField(term163286, term163286.getClass(), "codesource", null);
        setField(term163286, term163286.getClass(), "classloader", null);
        setField(term163286, term163286.getClass(), "principals", null);
        setField(term163286, term163286.getClass(), "permissions", null);
        setBooleanField(term163286, term163286.getClass(), "hasAllPerm", false);
        setBooleanField(term163286, term163286.getClass(), "staticPermissions", false);
        setField(term163286, term163286.getClass(), "key", null);
        setElement(term163262, 7, term163286);
        setField(term163289, term163289.getClass(), "codesource", null);
        setField(term163289, term163289.getClass(), "classloader", null);
        setField(term163289, term163289.getClass(), "principals", null);
        setField(term163289, term163289.getClass(), "permissions", null);
        setBooleanField(term163289, term163289.getClass(), "hasAllPerm", false);
        setBooleanField(term163289, term163289.getClass(), "staticPermissions", false);
        setField(term163289, term163289.getClass(), "key", null);
        setElement(term163262, 8, term163289);
        setField(term163261, term163261.getClass(), "context", term163262);
        setBooleanField(term163261, term163261.getClass(), "isPrivileged", true);
        setBooleanField(term163261, term163261.getClass(), "isAuthorized", false);
        setField(term163294, term163294.getClass(), "context", null);
        setBooleanField(term163294, term163294.getClass(), "isPrivileged", false);
        setBooleanField(term163294, term163294.getClass(), "isAuthorized", false);
        setField(term163294, term163294.getClass(), "privilegedContext", null);
        setField(term163294, term163294.getClass(), "combiner", null);
        setField(term163294, term163294.getClass(), "permissions", null);
        setField(term163294, term163294.getClass(), "parent", null);
        setBooleanField(term163294, term163294.getClass(), "isWrapped", false);
        setBooleanField(term163294, term163294.getClass(), "isLimited", false);
        setField(term163294, term163294.getClass(), "limitedContext", null);
        setField(term163261, term163261.getClass(), "privilegedContext", term163294);
        setField(term163261, term163261.getClass(), "combiner", null);
        setField(term163261, term163261.getClass(), "permissions", null);
        setField(term163261, term163261.getClass(), "parent", null);
        setBooleanField(term163261, term163261.getClass(), "isWrapped", false);
        setBooleanField(term163261, term163261.getClass(), "isLimited", false);
        setField(term163261, term163261.getClass(), "limitedContext", null);
        setField(term163240, term163240.getClass(), "acc", term163261);
        setBooleanField(term163240, term163240.getClass(), "focusManagerIsDispatching", false);
        setBooleanField(term163240, term163240.getClass(), "isPosted", true);
        setBooleanField(term163240, term163240.getClass(), "isSystemGenerated", false);
        setField(term163240, term163240.getClass(), "source", term163304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleAnalysis$GlassPrompt$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = term163240;
        callMethod(klass, "mouseClicked", argTypes, term163102, args);
    }

};


