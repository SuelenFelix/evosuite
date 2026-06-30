package core.user;

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
import static core.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Guest_newHintLabel_159657175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1650;

    public Guest_newHintLabel_159657175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1650 = newInstance(Class.forName("core.user.Guest"));
        setIntField(term1650, term1650.getClass(), "defaultCloseOperation", 0);
        setField(term1650, term1650.getClass(), "rootPane", null);
        setBooleanField(term1650, term1650.getClass(), "rootPaneCheckingEnabled", false);
        setField(term1650, term1650.getClass(), "transferHandler", null);
        setField(term1650, term1650.getClass(), "accessibleContext", null);
        setBooleanField(term1650, term1650.getClass(), "resizable", false);
        setBooleanField(term1650, term1650.getClass(), "undecorated", false);
        setBooleanField(term1650, term1650.getClass(), "initialized", false);
        setBooleanField(term1650, term1650.getClass(), "modal", false);
        setField(term1650, term1650.getClass(), "modalityType", null);
        setField(term1650, term1650.getClass(), "blockedWindows", null);
        setField(term1650, term1650.getClass(), "title", null);
        setField(term1650, term1650.getClass(), "modalFilter", null);
        setField(term1650, term1650.getClass(), "secondaryLoop", null);
        setBooleanField(term1650, term1650.getClass(), "isInHide", false);
        setBooleanField(term1650, term1650.getClass(), "isInDispose", false);
        setField(term1650, term1650.getClass(), "warningString", null);
        setField(term1650, term1650.getClass(), "icons", null);
        setField(term1650, term1650.getClass(), "temporaryLostComponent", null);
        setBooleanField(term1650, term1650.getClass(), "syncLWRequests", false);
        setBooleanField(term1650, term1650.getClass(), "beforeFirstShow", false);
        setBooleanField(term1650, term1650.getClass(), "disposing", false);
        setField(term1650, term1650.getClass(), "disposerRecord", null);
        setIntField(term1650, term1650.getClass(), "state", 0);
        setBooleanField(term1650, term1650.getClass(), "alwaysOnTop", false);
        setField(term1650, term1650.getClass(), "ownedWindowList", null);
        setField(term1650, term1650.getClass(), "weakThis", null);
        setBooleanField(term1650, term1650.getClass(), "showWithParent", false);
        setField(term1650, term1650.getClass(), "modalBlocker", null);
        setField(term1650, term1650.getClass(), "modalExclusionType", null);
        setField(term1650, term1650.getClass(), "windowListener", null);
        setField(term1650, term1650.getClass(), "windowStateListener", null);
        setField(term1650, term1650.getClass(), "windowFocusListener", null);
        setField(term1650, term1650.getClass(), "inputContext", null);
        setField(term1650, term1650.getClass(), "inputContextLock", null);
        setField(term1650, term1650.getClass(), "focusMgr", null);
        setBooleanField(term1650, term1650.getClass(), "focusableWindowState", false);
        setBooleanField(term1650, term1650.getClass(), "autoRequestFocus", false);
        setBooleanField(term1650, term1650.getClass(), "isInShow", false);
        setFloatField(term1650, term1650.getClass(), "opacity", 0.0F);
        setField(term1650, term1650.getClass(), "shape", null);
        setBooleanField(term1650, term1650.getClass(), "isTrayIconWindow", false);
        setIntField(term1650, term1650.getClass(), "securityWarningWidth", 0);
        setIntField(term1650, term1650.getClass(), "securityWarningHeight", 0);
        setDoubleField(term1650, term1650.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term1650, term1650.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term1650, term1650.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term1650, term1650.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term1650, term1650.getClass(), "anchor", null);
        setField(term1650, term1650.getClass(), "type", null);
        setIntField(term1650, term1650.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term1650, term1650.getClass(), "locationByPlatform", false);
        setField(term1650, term1650.getClass(), "component", null);
        setField(term1650, term1650.getClass(), "layoutMgr", null);
        setField(term1650, term1650.getClass(), "dispatcher", null);
        setField(term1650, term1650.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1650, term1650.getClass(), "focusCycleRoot", false);
        setBooleanField(term1650, term1650.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1650, term1650.getClass(), "printingThreads", null);
        setBooleanField(term1650, term1650.getClass(), "printing", false);
        setField(term1650, term1650.getClass(), "containerListener", null);
        setIntField(term1650, term1650.getClass(), "listeningChildren", 0);
        setIntField(term1650, term1650.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1650, term1650.getClass(), "descendantsCount", 0);
        setField(term1650, term1650.getClass(), "preserveBackgroundColor", null);
        setIntField(term1650, term1650.getClass(), "numOfHWComponents", 0);
        setIntField(term1650, term1650.getClass(), "numOfLWComponents", 0);
        setField(term1650, term1650.getClass(), "modalComp", null);
        setField(term1650, term1650.getClass(), "modalAppContext", null);
        setIntField(term1650, term1650.getClass(), "containerSerializedDataVersion", 0);
        setField(term1650, term1650.getClass(), "peer", null);
        setField(term1650, term1650.getClass(), "parent", null);
        setField(term1650, term1650.getClass(), "appContext", null);
        setIntField(term1650, term1650.getClass(), "x", 0);
        setIntField(term1650, term1650.getClass(), "y", 0);
        setIntField(term1650, term1650.getClass(), "width", 0);
        setIntField(term1650, term1650.getClass(), "height", 0);
        setField(term1650, term1650.getClass(), "foreground", null);
        setField(term1650, term1650.getClass(), "background", null);
        setField(term1650, term1650.getClass(), "font", null);
        setField(term1650, term1650.getClass(), "peerFont", null);
        setField(term1650, term1650.getClass(), "cursor", null);
        setField(term1650, term1650.getClass(), "locale", null);
        setField(term1650, term1650.getClass(), "graphicsConfig", null);
        setField(term1650, term1650.getClass(), "bufferStrategy", null);
        setBooleanField(term1650, term1650.getClass(), "ignoreRepaint", false);
        setBooleanField(term1650, term1650.getClass(), "visible", false);
        setBooleanField(term1650, term1650.getClass(), "enabled", false);
        setBooleanField(term1650, term1650.getClass(), "valid", false);
        setField(term1650, term1650.getClass(), "dropTarget", null);
        setField(term1650, term1650.getClass(), "popups", null);
        setField(term1650, term1650.getClass(), "name", null);
        setBooleanField(term1650, term1650.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1650, term1650.getClass(), "focusable", false);
        setIntField(term1650, term1650.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1650, term1650.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1650, term1650.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1650, term1650.getClass(), "acc", null);
        setField(term1650, term1650.getClass(), "minSize", null);
        setBooleanField(term1650, term1650.getClass(), "minSizeSet", false);
        setField(term1650, term1650.getClass(), "prefSize", null);
        setBooleanField(term1650, term1650.getClass(), "prefSizeSet", false);
        setField(term1650, term1650.getClass(), "maxSize", null);
        setBooleanField(term1650, term1650.getClass(), "maxSizeSet", false);
        setField(term1650, term1650.getClass(), "componentOrientation", null);
        setBooleanField(term1650, term1650.getClass(), "newEventsOnly", false);
        setField(term1650, term1650.getClass(), "componentListener", null);
        setField(term1650, term1650.getClass(), "focusListener", null);
        setField(term1650, term1650.getClass(), "hierarchyListener", null);
        setField(term1650, term1650.getClass(), "hierarchyBoundsListener", null);
        setField(term1650, term1650.getClass(), "keyListener", null);
        setField(term1650, term1650.getClass(), "mouseListener", null);
        setField(term1650, term1650.getClass(), "mouseMotionListener", null);
        setField(term1650, term1650.getClass(), "mouseWheelListener", null);
        setField(term1650, term1650.getClass(), "inputMethodListener", null);
        setLongField(term1650, term1650.getClass(), "eventMask", 0L);
        setField(term1650, term1650.getClass(), "changeSupport", null);
        setField(term1650, term1650.getClass(), "objectLock", null);
        setBooleanField(term1650, term1650.getClass(), "isPacked", false);
        setIntField(term1650, term1650.getClass(), "boundsOp", 0);
        setField(term1650, term1650.getClass(), "compoundShape", null);
        setField(term1650, term1650.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1650, term1650.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1650, term1650.getClass(), "backgroundEraseDisabled", false);
        setField(term1650, term1650.getClass(), "eventCache", null);
        setBooleanField(term1650, term1650.getClass(), "coalescingEnabled", false);
        setBooleanField(term1650, term1650.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1650, term1650.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.user.Guest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newHintLabel", argTypes, term1650, args);
    }

};


