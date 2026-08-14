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
     Object term137380;

    public About_getFeedbackCard_138902823010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137380 = newInstance(Class.forName("core.About"));
        setField(term137380, term137380.getClass(), "midCard", null);
        setField(term137380, term137380.getClass(), "midLayer", null);
        setIntField(term137380, term137380.getClass(), "defaultCloseOperation", 0);
        setField(term137380, term137380.getClass(), "rootPane", null);
        setBooleanField(term137380, term137380.getClass(), "rootPaneCheckingEnabled", false);
        setField(term137380, term137380.getClass(), "transferHandler", null);
        setField(term137380, term137380.getClass(), "accessibleContext", null);
        setBooleanField(term137380, term137380.getClass(), "resizable", false);
        setBooleanField(term137380, term137380.getClass(), "undecorated", false);
        setBooleanField(term137380, term137380.getClass(), "initialized", false);
        setBooleanField(term137380, term137380.getClass(), "modal", false);
        setField(term137380, term137380.getClass(), "modalityType", null);
        setField(term137380, term137380.getClass(), "blockedWindows", null);
        setField(term137380, term137380.getClass(), "title", null);
        setField(term137380, term137380.getClass(), "modalFilter", null);
        setField(term137380, term137380.getClass(), "secondaryLoop", null);
        setBooleanField(term137380, term137380.getClass(), "isInHide", false);
        setBooleanField(term137380, term137380.getClass(), "isInDispose", false);
        setField(term137380, term137380.getClass(), "warningString", null);
        setField(term137380, term137380.getClass(), "icons", null);
        setField(term137380, term137380.getClass(), "temporaryLostComponent", null);
        setBooleanField(term137380, term137380.getClass(), "syncLWRequests", false);
        setBooleanField(term137380, term137380.getClass(), "beforeFirstShow", false);
        setBooleanField(term137380, term137380.getClass(), "disposing", false);
        setField(term137380, term137380.getClass(), "disposerRecord", null);
        setIntField(term137380, term137380.getClass(), "state", 0);
        setBooleanField(term137380, term137380.getClass(), "alwaysOnTop", false);
        setField(term137380, term137380.getClass(), "ownedWindowList", null);
        setField(term137380, term137380.getClass(), "weakThis", null);
        setBooleanField(term137380, term137380.getClass(), "showWithParent", false);
        setField(term137380, term137380.getClass(), "modalBlocker", null);
        setField(term137380, term137380.getClass(), "modalExclusionType", null);
        setField(term137380, term137380.getClass(), "windowListener", null);
        setField(term137380, term137380.getClass(), "windowStateListener", null);
        setField(term137380, term137380.getClass(), "windowFocusListener", null);
        setField(term137380, term137380.getClass(), "inputContext", null);
        setField(term137380, term137380.getClass(), "inputContextLock", null);
        setField(term137380, term137380.getClass(), "focusMgr", null);
        setBooleanField(term137380, term137380.getClass(), "focusableWindowState", false);
        setBooleanField(term137380, term137380.getClass(), "autoRequestFocus", false);
        setBooleanField(term137380, term137380.getClass(), "isInShow", false);
        setFloatField(term137380, term137380.getClass(), "opacity", 0.0F);
        setField(term137380, term137380.getClass(), "shape", null);
        setBooleanField(term137380, term137380.getClass(), "isTrayIconWindow", false);
        setIntField(term137380, term137380.getClass(), "securityWarningWidth", 0);
        setIntField(term137380, term137380.getClass(), "securityWarningHeight", 0);
        setDoubleField(term137380, term137380.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term137380, term137380.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term137380, term137380.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term137380, term137380.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term137380, term137380.getClass(), "anchor", null);
        setField(term137380, term137380.getClass(), "type", null);
        setIntField(term137380, term137380.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term137380, term137380.getClass(), "locationByPlatform", false);
        setField(term137380, term137380.getClass(), "component", null);
        setField(term137380, term137380.getClass(), "layoutMgr", null);
        setField(term137380, term137380.getClass(), "dispatcher", null);
        setField(term137380, term137380.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term137380, term137380.getClass(), "focusCycleRoot", false);
        setBooleanField(term137380, term137380.getClass(), "focusTraversalPolicyProvider", false);
        setField(term137380, term137380.getClass(), "printingThreads", null);
        setBooleanField(term137380, term137380.getClass(), "printing", false);
        setField(term137380, term137380.getClass(), "containerListener", null);
        setIntField(term137380, term137380.getClass(), "listeningChildren", 0);
        setIntField(term137380, term137380.getClass(), "listeningBoundsChildren", 0);
        setIntField(term137380, term137380.getClass(), "descendantsCount", 0);
        setField(term137380, term137380.getClass(), "preserveBackgroundColor", null);
        setIntField(term137380, term137380.getClass(), "numOfHWComponents", 0);
        setIntField(term137380, term137380.getClass(), "numOfLWComponents", 0);
        setField(term137380, term137380.getClass(), "modalComp", null);
        setField(term137380, term137380.getClass(), "modalAppContext", null);
        setIntField(term137380, term137380.getClass(), "containerSerializedDataVersion", 0);
        setField(term137380, term137380.getClass(), "peer", null);
        setField(term137380, term137380.getClass(), "parent", null);
        setField(term137380, term137380.getClass(), "appContext", null);
        setIntField(term137380, term137380.getClass(), "x", 0);
        setIntField(term137380, term137380.getClass(), "y", 0);
        setIntField(term137380, term137380.getClass(), "width", 0);
        setIntField(term137380, term137380.getClass(), "height", 0);
        setField(term137380, term137380.getClass(), "foreground", null);
        setField(term137380, term137380.getClass(), "background", null);
        setField(term137380, term137380.getClass(), "font", null);
        setField(term137380, term137380.getClass(), "peerFont", null);
        setField(term137380, term137380.getClass(), "cursor", null);
        setField(term137380, term137380.getClass(), "locale", null);
        setField(term137380, term137380.getClass(), "graphicsConfig", null);
        setField(term137380, term137380.getClass(), "bufferStrategy", null);
        setBooleanField(term137380, term137380.getClass(), "ignoreRepaint", false);
        setBooleanField(term137380, term137380.getClass(), "visible", false);
        setBooleanField(term137380, term137380.getClass(), "enabled", false);
        setBooleanField(term137380, term137380.getClass(), "valid", false);
        setField(term137380, term137380.getClass(), "dropTarget", null);
        setField(term137380, term137380.getClass(), "popups", null);
        setField(term137380, term137380.getClass(), "name", null);
        setBooleanField(term137380, term137380.getClass(), "nameExplicitlySet", false);
        setBooleanField(term137380, term137380.getClass(), "focusable", false);
        setIntField(term137380, term137380.getClass(), "isFocusTraversableOverridden", 0);
        setField(term137380, term137380.getClass(), "focusTraversalKeys", null);
        setBooleanField(term137380, term137380.getClass(), "focusTraversalKeysEnabled", false);
        setField(term137380, term137380.getClass(), "acc", null);
        setField(term137380, term137380.getClass(), "minSize", null);
        setBooleanField(term137380, term137380.getClass(), "minSizeSet", false);
        setField(term137380, term137380.getClass(), "prefSize", null);
        setBooleanField(term137380, term137380.getClass(), "prefSizeSet", false);
        setField(term137380, term137380.getClass(), "maxSize", null);
        setBooleanField(term137380, term137380.getClass(), "maxSizeSet", false);
        setField(term137380, term137380.getClass(), "componentOrientation", null);
        setBooleanField(term137380, term137380.getClass(), "newEventsOnly", false);
        setField(term137380, term137380.getClass(), "componentListener", null);
        setField(term137380, term137380.getClass(), "focusListener", null);
        setField(term137380, term137380.getClass(), "hierarchyListener", null);
        setField(term137380, term137380.getClass(), "hierarchyBoundsListener", null);
        setField(term137380, term137380.getClass(), "keyListener", null);
        setField(term137380, term137380.getClass(), "mouseListener", null);
        setField(term137380, term137380.getClass(), "mouseMotionListener", null);
        setField(term137380, term137380.getClass(), "mouseWheelListener", null);
        setField(term137380, term137380.getClass(), "inputMethodListener", null);
        setLongField(term137380, term137380.getClass(), "eventMask", 0L);
        setField(term137380, term137380.getClass(), "changeSupport", null);
        setField(term137380, term137380.getClass(), "objectLock", null);
        setBooleanField(term137380, term137380.getClass(), "isPacked", false);
        setIntField(term137380, term137380.getClass(), "boundsOp", 0);
        setField(term137380, term137380.getClass(), "compoundShape", null);
        setField(term137380, term137380.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term137380, term137380.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term137380, term137380.getClass(), "backgroundEraseDisabled", false);
        setField(term137380, term137380.getClass(), "eventCache", null);
        setBooleanField(term137380, term137380.getClass(), "coalescingEnabled", false);
        setBooleanField(term137380, term137380.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term137380, term137380.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.About");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFeedbackCard", argTypes, term137380, args);
    }

};


