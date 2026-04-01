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
     Object term85110;

    public Guest_newHintLabel_159657175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85110 = newInstance(Class.forName("core.user.Guest"));
        setIntField(term85110, term85110.getClass(), "defaultCloseOperation", 0);
        setField(term85110, term85110.getClass(), "rootPane", null);
        setBooleanField(term85110, term85110.getClass(), "rootPaneCheckingEnabled", false);
        setField(term85110, term85110.getClass(), "transferHandler", null);
        setField(term85110, term85110.getClass(), "accessibleContext", null);
        setBooleanField(term85110, term85110.getClass(), "resizable", false);
        setBooleanField(term85110, term85110.getClass(), "undecorated", false);
        setBooleanField(term85110, term85110.getClass(), "initialized", false);
        setBooleanField(term85110, term85110.getClass(), "modal", false);
        setField(term85110, term85110.getClass(), "modalityType", null);
        setField(term85110, term85110.getClass(), "blockedWindows", null);
        setField(term85110, term85110.getClass(), "title", null);
        setField(term85110, term85110.getClass(), "modalFilter", null);
        setField(term85110, term85110.getClass(), "secondaryLoop", null);
        setBooleanField(term85110, term85110.getClass(), "isInHide", false);
        setBooleanField(term85110, term85110.getClass(), "isInDispose", false);
        setField(term85110, term85110.getClass(), "warningString", null);
        setField(term85110, term85110.getClass(), "icons", null);
        setField(term85110, term85110.getClass(), "temporaryLostComponent", null);
        setBooleanField(term85110, term85110.getClass(), "syncLWRequests", false);
        setBooleanField(term85110, term85110.getClass(), "beforeFirstShow", false);
        setBooleanField(term85110, term85110.getClass(), "disposing", false);
        setField(term85110, term85110.getClass(), "disposerRecord", null);
        setIntField(term85110, term85110.getClass(), "state", 0);
        setBooleanField(term85110, term85110.getClass(), "alwaysOnTop", false);
        setField(term85110, term85110.getClass(), "ownedWindowList", null);
        setField(term85110, term85110.getClass(), "weakThis", null);
        setBooleanField(term85110, term85110.getClass(), "showWithParent", false);
        setField(term85110, term85110.getClass(), "modalBlocker", null);
        setField(term85110, term85110.getClass(), "modalExclusionType", null);
        setField(term85110, term85110.getClass(), "windowListener", null);
        setField(term85110, term85110.getClass(), "windowStateListener", null);
        setField(term85110, term85110.getClass(), "windowFocusListener", null);
        setField(term85110, term85110.getClass(), "inputContext", null);
        setField(term85110, term85110.getClass(), "inputContextLock", null);
        setField(term85110, term85110.getClass(), "focusMgr", null);
        setBooleanField(term85110, term85110.getClass(), "focusableWindowState", false);
        setBooleanField(term85110, term85110.getClass(), "autoRequestFocus", false);
        setBooleanField(term85110, term85110.getClass(), "isInShow", false);
        setFloatField(term85110, term85110.getClass(), "opacity", 0.0F);
        setField(term85110, term85110.getClass(), "shape", null);
        setBooleanField(term85110, term85110.getClass(), "isTrayIconWindow", false);
        setIntField(term85110, term85110.getClass(), "securityWarningWidth", 0);
        setIntField(term85110, term85110.getClass(), "securityWarningHeight", 0);
        setDoubleField(term85110, term85110.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term85110, term85110.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term85110, term85110.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term85110, term85110.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term85110, term85110.getClass(), "anchor", null);
        setField(term85110, term85110.getClass(), "type", null);
        setIntField(term85110, term85110.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term85110, term85110.getClass(), "locationByPlatform", false);
        setField(term85110, term85110.getClass(), "component", null);
        setField(term85110, term85110.getClass(), "layoutMgr", null);
        setField(term85110, term85110.getClass(), "dispatcher", null);
        setField(term85110, term85110.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term85110, term85110.getClass(), "focusCycleRoot", false);
        setBooleanField(term85110, term85110.getClass(), "focusTraversalPolicyProvider", false);
        setField(term85110, term85110.getClass(), "printingThreads", null);
        setBooleanField(term85110, term85110.getClass(), "printing", false);
        setField(term85110, term85110.getClass(), "containerListener", null);
        setIntField(term85110, term85110.getClass(), "listeningChildren", 0);
        setIntField(term85110, term85110.getClass(), "listeningBoundsChildren", 0);
        setIntField(term85110, term85110.getClass(), "descendantsCount", 0);
        setField(term85110, term85110.getClass(), "preserveBackgroundColor", null);
        setIntField(term85110, term85110.getClass(), "numOfHWComponents", 0);
        setIntField(term85110, term85110.getClass(), "numOfLWComponents", 0);
        setField(term85110, term85110.getClass(), "modalComp", null);
        setField(term85110, term85110.getClass(), "modalAppContext", null);
        setIntField(term85110, term85110.getClass(), "containerSerializedDataVersion", 0);
        setField(term85110, term85110.getClass(), "peer", null);
        setField(term85110, term85110.getClass(), "parent", null);
        setField(term85110, term85110.getClass(), "appContext", null);
        setIntField(term85110, term85110.getClass(), "x", 0);
        setIntField(term85110, term85110.getClass(), "y", 0);
        setIntField(term85110, term85110.getClass(), "width", 0);
        setIntField(term85110, term85110.getClass(), "height", 0);
        setField(term85110, term85110.getClass(), "foreground", null);
        setField(term85110, term85110.getClass(), "background", null);
        setField(term85110, term85110.getClass(), "font", null);
        setField(term85110, term85110.getClass(), "peerFont", null);
        setField(term85110, term85110.getClass(), "cursor", null);
        setField(term85110, term85110.getClass(), "locale", null);
        setField(term85110, term85110.getClass(), "graphicsConfig", null);
        setField(term85110, term85110.getClass(), "bufferStrategy", null);
        setBooleanField(term85110, term85110.getClass(), "ignoreRepaint", false);
        setBooleanField(term85110, term85110.getClass(), "visible", false);
        setBooleanField(term85110, term85110.getClass(), "enabled", false);
        setBooleanField(term85110, term85110.getClass(), "valid", false);
        setField(term85110, term85110.getClass(), "dropTarget", null);
        setField(term85110, term85110.getClass(), "popups", null);
        setField(term85110, term85110.getClass(), "name", null);
        setBooleanField(term85110, term85110.getClass(), "nameExplicitlySet", false);
        setBooleanField(term85110, term85110.getClass(), "focusable", false);
        setIntField(term85110, term85110.getClass(), "isFocusTraversableOverridden", 0);
        setField(term85110, term85110.getClass(), "focusTraversalKeys", null);
        setBooleanField(term85110, term85110.getClass(), "focusTraversalKeysEnabled", false);
        setField(term85110, term85110.getClass(), "acc", null);
        setField(term85110, term85110.getClass(), "minSize", null);
        setBooleanField(term85110, term85110.getClass(), "minSizeSet", false);
        setField(term85110, term85110.getClass(), "prefSize", null);
        setBooleanField(term85110, term85110.getClass(), "prefSizeSet", false);
        setField(term85110, term85110.getClass(), "maxSize", null);
        setBooleanField(term85110, term85110.getClass(), "maxSizeSet", false);
        setField(term85110, term85110.getClass(), "componentOrientation", null);
        setBooleanField(term85110, term85110.getClass(), "newEventsOnly", false);
        setField(term85110, term85110.getClass(), "componentListener", null);
        setField(term85110, term85110.getClass(), "focusListener", null);
        setField(term85110, term85110.getClass(), "hierarchyListener", null);
        setField(term85110, term85110.getClass(), "hierarchyBoundsListener", null);
        setField(term85110, term85110.getClass(), "keyListener", null);
        setField(term85110, term85110.getClass(), "mouseListener", null);
        setField(term85110, term85110.getClass(), "mouseMotionListener", null);
        setField(term85110, term85110.getClass(), "mouseWheelListener", null);
        setField(term85110, term85110.getClass(), "inputMethodListener", null);
        setLongField(term85110, term85110.getClass(), "eventMask", 0L);
        setField(term85110, term85110.getClass(), "changeSupport", null);
        setField(term85110, term85110.getClass(), "objectLock", null);
        setBooleanField(term85110, term85110.getClass(), "isPacked", false);
        setIntField(term85110, term85110.getClass(), "boundsOp", 0);
        setField(term85110, term85110.getClass(), "compoundShape", null);
        setField(term85110, term85110.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term85110, term85110.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term85110, term85110.getClass(), "backgroundEraseDisabled", false);
        setField(term85110, term85110.getClass(), "eventCache", null);
        setBooleanField(term85110, term85110.getClass(), "coalescingEnabled", false);
        setBooleanField(term85110, term85110.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term85110, term85110.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.user.Guest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newHintLabel", argTypes, term85110, args);
    }

};


