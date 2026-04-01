package core.first;

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
import static core.first.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Login_loginAction_182915862920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8157;

    public Login_loginAction_182915862920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8157 = newInstance(Class.forName("core.first.Login"));
        setField(term8157, term8157.getClass(), "parent", null);
        setIntField(term8157, term8157.getClass(), "defaultCloseOperation", 0);
        setField(term8157, term8157.getClass(), "rootPane", null);
        setBooleanField(term8157, term8157.getClass(), "rootPaneCheckingEnabled", false);
        setField(term8157, term8157.getClass(), "transferHandler", null);
        setField(term8157, term8157.getClass(), "accessibleContext", null);
        setBooleanField(term8157, term8157.getClass(), "resizable", false);
        setBooleanField(term8157, term8157.getClass(), "undecorated", false);
        setBooleanField(term8157, term8157.getClass(), "initialized", false);
        setBooleanField(term8157, term8157.getClass(), "modal", false);
        setField(term8157, term8157.getClass(), "modalityType", null);
        setField(term8157, term8157.getClass(), "blockedWindows", null);
        setField(term8157, term8157.getClass(), "title", null);
        setField(term8157, term8157.getClass(), "modalFilter", null);
        setField(term8157, term8157.getClass(), "secondaryLoop", null);
        setBooleanField(term8157, term8157.getClass(), "isInHide", false);
        setBooleanField(term8157, term8157.getClass(), "isInDispose", false);
        setField(term8157, term8157.getClass(), "warningString", null);
        setField(term8157, term8157.getClass(), "icons", null);
        setField(term8157, term8157.getClass(), "temporaryLostComponent", null);
        setBooleanField(term8157, term8157.getClass(), "syncLWRequests", false);
        setBooleanField(term8157, term8157.getClass(), "beforeFirstShow", false);
        setBooleanField(term8157, term8157.getClass(), "disposing", false);
        setField(term8157, term8157.getClass(), "disposerRecord", null);
        setIntField(term8157, term8157.getClass(), "state", 0);
        setBooleanField(term8157, term8157.getClass(), "alwaysOnTop", false);
        setField(term8157, term8157.getClass(), "ownedWindowList", null);
        setField(term8157, term8157.getClass(), "weakThis", null);
        setBooleanField(term8157, term8157.getClass(), "showWithParent", false);
        setField(term8157, term8157.getClass(), "modalBlocker", null);
        setField(term8157, term8157.getClass(), "modalExclusionType", null);
        setField(term8157, term8157.getClass(), "windowListener", null);
        setField(term8157, term8157.getClass(), "windowStateListener", null);
        setField(term8157, term8157.getClass(), "windowFocusListener", null);
        setField(term8157, term8157.getClass(), "inputContext", null);
        setField(term8157, term8157.getClass(), "inputContextLock", null);
        setField(term8157, term8157.getClass(), "focusMgr", null);
        setBooleanField(term8157, term8157.getClass(), "focusableWindowState", false);
        setBooleanField(term8157, term8157.getClass(), "autoRequestFocus", false);
        setBooleanField(term8157, term8157.getClass(), "isInShow", false);
        setFloatField(term8157, term8157.getClass(), "opacity", 0.0F);
        setField(term8157, term8157.getClass(), "shape", null);
        setBooleanField(term8157, term8157.getClass(), "isTrayIconWindow", false);
        setIntField(term8157, term8157.getClass(), "securityWarningWidth", 0);
        setIntField(term8157, term8157.getClass(), "securityWarningHeight", 0);
        setDoubleField(term8157, term8157.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term8157, term8157.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term8157, term8157.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term8157, term8157.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term8157, term8157.getClass(), "anchor", null);
        setField(term8157, term8157.getClass(), "type", null);
        setIntField(term8157, term8157.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term8157, term8157.getClass(), "locationByPlatform", false);
        setField(term8157, term8157.getClass(), "component", null);
        setField(term8157, term8157.getClass(), "layoutMgr", null);
        setField(term8157, term8157.getClass(), "dispatcher", null);
        setField(term8157, term8157.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term8157, term8157.getClass(), "focusCycleRoot", false);
        setBooleanField(term8157, term8157.getClass(), "focusTraversalPolicyProvider", false);
        setField(term8157, term8157.getClass(), "printingThreads", null);
        setBooleanField(term8157, term8157.getClass(), "printing", false);
        setField(term8157, term8157.getClass(), "containerListener", null);
        setIntField(term8157, term8157.getClass(), "listeningChildren", 0);
        setIntField(term8157, term8157.getClass(), "listeningBoundsChildren", 0);
        setIntField(term8157, term8157.getClass(), "descendantsCount", 0);
        setField(term8157, term8157.getClass(), "preserveBackgroundColor", null);
        setIntField(term8157, term8157.getClass(), "numOfHWComponents", 0);
        setIntField(term8157, term8157.getClass(), "numOfLWComponents", 0);
        setField(term8157, term8157.getClass(), "modalComp", null);
        setField(term8157, term8157.getClass(), "modalAppContext", null);
        setIntField(term8157, term8157.getClass(), "containerSerializedDataVersion", 0);
        setField(term8157, term8157.getClass(), "peer", null);
        setField(term8157, term8157.getClass(), "parent", null);
        setField(term8157, term8157.getClass(), "appContext", null);
        setIntField(term8157, term8157.getClass(), "x", 0);
        setIntField(term8157, term8157.getClass(), "y", 0);
        setIntField(term8157, term8157.getClass(), "width", 0);
        setIntField(term8157, term8157.getClass(), "height", 0);
        setField(term8157, term8157.getClass(), "foreground", null);
        setField(term8157, term8157.getClass(), "background", null);
        setField(term8157, term8157.getClass(), "font", null);
        setField(term8157, term8157.getClass(), "peerFont", null);
        setField(term8157, term8157.getClass(), "cursor", null);
        setField(term8157, term8157.getClass(), "locale", null);
        setField(term8157, term8157.getClass(), "graphicsConfig", null);
        setField(term8157, term8157.getClass(), "bufferStrategy", null);
        setBooleanField(term8157, term8157.getClass(), "ignoreRepaint", false);
        setBooleanField(term8157, term8157.getClass(), "visible", false);
        setBooleanField(term8157, term8157.getClass(), "enabled", false);
        setBooleanField(term8157, term8157.getClass(), "valid", false);
        setField(term8157, term8157.getClass(), "dropTarget", null);
        setField(term8157, term8157.getClass(), "popups", null);
        setField(term8157, term8157.getClass(), "name", null);
        setBooleanField(term8157, term8157.getClass(), "nameExplicitlySet", false);
        setBooleanField(term8157, term8157.getClass(), "focusable", false);
        setIntField(term8157, term8157.getClass(), "isFocusTraversableOverridden", 0);
        setField(term8157, term8157.getClass(), "focusTraversalKeys", null);
        setBooleanField(term8157, term8157.getClass(), "focusTraversalKeysEnabled", false);
        setField(term8157, term8157.getClass(), "acc", null);
        setField(term8157, term8157.getClass(), "minSize", null);
        setBooleanField(term8157, term8157.getClass(), "minSizeSet", false);
        setField(term8157, term8157.getClass(), "prefSize", null);
        setBooleanField(term8157, term8157.getClass(), "prefSizeSet", false);
        setField(term8157, term8157.getClass(), "maxSize", null);
        setBooleanField(term8157, term8157.getClass(), "maxSizeSet", false);
        setField(term8157, term8157.getClass(), "componentOrientation", null);
        setBooleanField(term8157, term8157.getClass(), "newEventsOnly", false);
        setField(term8157, term8157.getClass(), "componentListener", null);
        setField(term8157, term8157.getClass(), "focusListener", null);
        setField(term8157, term8157.getClass(), "hierarchyListener", null);
        setField(term8157, term8157.getClass(), "hierarchyBoundsListener", null);
        setField(term8157, term8157.getClass(), "keyListener", null);
        setField(term8157, term8157.getClass(), "mouseListener", null);
        setField(term8157, term8157.getClass(), "mouseMotionListener", null);
        setField(term8157, term8157.getClass(), "mouseWheelListener", null);
        setField(term8157, term8157.getClass(), "inputMethodListener", null);
        setLongField(term8157, term8157.getClass(), "eventMask", 0L);
        setField(term8157, term8157.getClass(), "changeSupport", null);
        setField(term8157, term8157.getClass(), "objectLock", null);
        setBooleanField(term8157, term8157.getClass(), "isPacked", false);
        setIntField(term8157, term8157.getClass(), "boundsOp", 0);
        setField(term8157, term8157.getClass(), "compoundShape", null);
        setField(term8157, term8157.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term8157, term8157.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term8157, term8157.getClass(), "backgroundEraseDisabled", false);
        setField(term8157, term8157.getClass(), "eventCache", null);
        setBooleanField(term8157, term8157.getClass(), "coalescingEnabled", false);
        setBooleanField(term8157, term8157.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term8157, term8157.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.first.Login");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "loginAction", argTypes, term8157, args);
    }

};


