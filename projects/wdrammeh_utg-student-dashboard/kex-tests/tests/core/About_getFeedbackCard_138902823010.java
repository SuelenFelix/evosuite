package core;

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
import static core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class About_getFeedbackCard_138902823010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137382;

    public About_getFeedbackCard_138902823010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137382 = newInstance(Class.forName("core.About"));
        setField(term137382, term137382.getClass(), "midCard", null);
        setField(term137382, term137382.getClass(), "midLayer", null);
        setIntField(term137382, term137382.getClass(), "defaultCloseOperation", 0);
        setField(term137382, term137382.getClass(), "rootPane", null);
        setBooleanField(term137382, term137382.getClass(), "rootPaneCheckingEnabled", false);
        setField(term137382, term137382.getClass(), "transferHandler", null);
        setField(term137382, term137382.getClass(), "accessibleContext", null);
        setBooleanField(term137382, term137382.getClass(), "resizable", false);
        setBooleanField(term137382, term137382.getClass(), "undecorated", false);
        setBooleanField(term137382, term137382.getClass(), "initialized", false);
        setBooleanField(term137382, term137382.getClass(), "modal", false);
        setField(term137382, term137382.getClass(), "modalityType", null);
        setField(term137382, term137382.getClass(), "blockedWindows", null);
        setField(term137382, term137382.getClass(), "title", null);
        setField(term137382, term137382.getClass(), "modalFilter", null);
        setField(term137382, term137382.getClass(), "secondaryLoop", null);
        setBooleanField(term137382, term137382.getClass(), "isInHide", false);
        setBooleanField(term137382, term137382.getClass(), "isInDispose", false);
        setField(term137382, term137382.getClass(), "warningString", null);
        setField(term137382, term137382.getClass(), "icons", null);
        setField(term137382, term137382.getClass(), "temporaryLostComponent", null);
        setBooleanField(term137382, term137382.getClass(), "syncLWRequests", false);
        setBooleanField(term137382, term137382.getClass(), "beforeFirstShow", false);
        setBooleanField(term137382, term137382.getClass(), "disposing", false);
        setField(term137382, term137382.getClass(), "disposerRecord", null);
        setIntField(term137382, term137382.getClass(), "state", 0);
        setBooleanField(term137382, term137382.getClass(), "alwaysOnTop", false);
        setField(term137382, term137382.getClass(), "ownedWindowList", null);
        setField(term137382, term137382.getClass(), "weakThis", null);
        setBooleanField(term137382, term137382.getClass(), "showWithParent", false);
        setField(term137382, term137382.getClass(), "modalBlocker", null);
        setField(term137382, term137382.getClass(), "modalExclusionType", null);
        setField(term137382, term137382.getClass(), "windowListener", null);
        setField(term137382, term137382.getClass(), "windowStateListener", null);
        setField(term137382, term137382.getClass(), "windowFocusListener", null);
        setField(term137382, term137382.getClass(), "inputContext", null);
        setField(term137382, term137382.getClass(), "inputContextLock", null);
        setField(term137382, term137382.getClass(), "focusMgr", null);
        setBooleanField(term137382, term137382.getClass(), "focusableWindowState", false);
        setBooleanField(term137382, term137382.getClass(), "autoRequestFocus", false);
        setBooleanField(term137382, term137382.getClass(), "isInShow", false);
        setFloatField(term137382, term137382.getClass(), "opacity", 0.0F);
        setField(term137382, term137382.getClass(), "shape", null);
        setBooleanField(term137382, term137382.getClass(), "isTrayIconWindow", false);
        setIntField(term137382, term137382.getClass(), "securityWarningWidth", 0);
        setIntField(term137382, term137382.getClass(), "securityWarningHeight", 0);
        setDoubleField(term137382, term137382.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term137382, term137382.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term137382, term137382.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term137382, term137382.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term137382, term137382.getClass(), "anchor", null);
        setField(term137382, term137382.getClass(), "type", null);
        setIntField(term137382, term137382.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term137382, term137382.getClass(), "locationByPlatform", false);
        setField(term137382, term137382.getClass(), "component", null);
        setField(term137382, term137382.getClass(), "layoutMgr", null);
        setField(term137382, term137382.getClass(), "dispatcher", null);
        setField(term137382, term137382.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term137382, term137382.getClass(), "focusCycleRoot", false);
        setBooleanField(term137382, term137382.getClass(), "focusTraversalPolicyProvider", false);
        setField(term137382, term137382.getClass(), "printingThreads", null);
        setBooleanField(term137382, term137382.getClass(), "printing", false);
        setField(term137382, term137382.getClass(), "containerListener", null);
        setIntField(term137382, term137382.getClass(), "listeningChildren", 0);
        setIntField(term137382, term137382.getClass(), "listeningBoundsChildren", 0);
        setIntField(term137382, term137382.getClass(), "descendantsCount", 0);
        setField(term137382, term137382.getClass(), "preserveBackgroundColor", null);
        setIntField(term137382, term137382.getClass(), "numOfHWComponents", 0);
        setIntField(term137382, term137382.getClass(), "numOfLWComponents", 0);
        setField(term137382, term137382.getClass(), "modalComp", null);
        setField(term137382, term137382.getClass(), "modalAppContext", null);
        setIntField(term137382, term137382.getClass(), "containerSerializedDataVersion", 0);
        setField(term137382, term137382.getClass(), "peer", null);
        setField(term137382, term137382.getClass(), "parent", null);
        setField(term137382, term137382.getClass(), "appContext", null);
        setIntField(term137382, term137382.getClass(), "x", 0);
        setIntField(term137382, term137382.getClass(), "y", 0);
        setIntField(term137382, term137382.getClass(), "width", 0);
        setIntField(term137382, term137382.getClass(), "height", 0);
        setField(term137382, term137382.getClass(), "foreground", null);
        setField(term137382, term137382.getClass(), "background", null);
        setField(term137382, term137382.getClass(), "font", null);
        setField(term137382, term137382.getClass(), "peerFont", null);
        setField(term137382, term137382.getClass(), "cursor", null);
        setField(term137382, term137382.getClass(), "locale", null);
        setField(term137382, term137382.getClass(), "graphicsConfig", null);
        setField(term137382, term137382.getClass(), "bufferStrategy", null);
        setBooleanField(term137382, term137382.getClass(), "ignoreRepaint", false);
        setBooleanField(term137382, term137382.getClass(), "visible", false);
        setBooleanField(term137382, term137382.getClass(), "enabled", false);
        setBooleanField(term137382, term137382.getClass(), "valid", false);
        setField(term137382, term137382.getClass(), "dropTarget", null);
        setField(term137382, term137382.getClass(), "popups", null);
        setField(term137382, term137382.getClass(), "name", null);
        setBooleanField(term137382, term137382.getClass(), "nameExplicitlySet", false);
        setBooleanField(term137382, term137382.getClass(), "focusable", false);
        setIntField(term137382, term137382.getClass(), "isFocusTraversableOverridden", 0);
        setField(term137382, term137382.getClass(), "focusTraversalKeys", null);
        setBooleanField(term137382, term137382.getClass(), "focusTraversalKeysEnabled", false);
        setField(term137382, term137382.getClass(), "acc", null);
        setField(term137382, term137382.getClass(), "minSize", null);
        setBooleanField(term137382, term137382.getClass(), "minSizeSet", false);
        setField(term137382, term137382.getClass(), "prefSize", null);
        setBooleanField(term137382, term137382.getClass(), "prefSizeSet", false);
        setField(term137382, term137382.getClass(), "maxSize", null);
        setBooleanField(term137382, term137382.getClass(), "maxSizeSet", false);
        setField(term137382, term137382.getClass(), "componentOrientation", null);
        setBooleanField(term137382, term137382.getClass(), "newEventsOnly", false);
        setField(term137382, term137382.getClass(), "componentListener", null);
        setField(term137382, term137382.getClass(), "focusListener", null);
        setField(term137382, term137382.getClass(), "hierarchyListener", null);
        setField(term137382, term137382.getClass(), "hierarchyBoundsListener", null);
        setField(term137382, term137382.getClass(), "keyListener", null);
        setField(term137382, term137382.getClass(), "mouseListener", null);
        setField(term137382, term137382.getClass(), "mouseMotionListener", null);
        setField(term137382, term137382.getClass(), "mouseWheelListener", null);
        setField(term137382, term137382.getClass(), "inputMethodListener", null);
        setLongField(term137382, term137382.getClass(), "eventMask", 0L);
        setField(term137382, term137382.getClass(), "changeSupport", null);
        setField(term137382, term137382.getClass(), "objectLock", null);
        setBooleanField(term137382, term137382.getClass(), "isPacked", false);
        setIntField(term137382, term137382.getClass(), "boundsOp", 0);
        setField(term137382, term137382.getClass(), "compoundShape", null);
        setField(term137382, term137382.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term137382, term137382.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term137382, term137382.getClass(), "backgroundEraseDisabled", false);
        setField(term137382, term137382.getClass(), "eventCache", null);
        setBooleanField(term137382, term137382.getClass(), "coalescingEnabled", false);
        setBooleanField(term137382, term137382.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term137382, term137382.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.About");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFeedbackCard", argTypes, term137382, args);
    }

};


