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

public class About_getAboutCard_12471958956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135653;

    public About_getAboutCard_12471958956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135653 = newInstance(Class.forName("core.About"));
        setField(term135653, term135653.getClass(), "midCard", null);
        setField(term135653, term135653.getClass(), "midLayer", null);
        setIntField(term135653, term135653.getClass(), "defaultCloseOperation", 0);
        setField(term135653, term135653.getClass(), "rootPane", null);
        setBooleanField(term135653, term135653.getClass(), "rootPaneCheckingEnabled", false);
        setField(term135653, term135653.getClass(), "transferHandler", null);
        setField(term135653, term135653.getClass(), "accessibleContext", null);
        setBooleanField(term135653, term135653.getClass(), "resizable", false);
        setBooleanField(term135653, term135653.getClass(), "undecorated", false);
        setBooleanField(term135653, term135653.getClass(), "initialized", false);
        setBooleanField(term135653, term135653.getClass(), "modal", false);
        setField(term135653, term135653.getClass(), "modalityType", null);
        setField(term135653, term135653.getClass(), "blockedWindows", null);
        setField(term135653, term135653.getClass(), "title", null);
        setField(term135653, term135653.getClass(), "modalFilter", null);
        setField(term135653, term135653.getClass(), "secondaryLoop", null);
        setBooleanField(term135653, term135653.getClass(), "isInHide", false);
        setBooleanField(term135653, term135653.getClass(), "isInDispose", false);
        setField(term135653, term135653.getClass(), "warningString", null);
        setField(term135653, term135653.getClass(), "icons", null);
        setField(term135653, term135653.getClass(), "temporaryLostComponent", null);
        setBooleanField(term135653, term135653.getClass(), "syncLWRequests", false);
        setBooleanField(term135653, term135653.getClass(), "beforeFirstShow", false);
        setBooleanField(term135653, term135653.getClass(), "disposing", false);
        setField(term135653, term135653.getClass(), "disposerRecord", null);
        setIntField(term135653, term135653.getClass(), "state", 0);
        setBooleanField(term135653, term135653.getClass(), "alwaysOnTop", false);
        setField(term135653, term135653.getClass(), "ownedWindowList", null);
        setField(term135653, term135653.getClass(), "weakThis", null);
        setBooleanField(term135653, term135653.getClass(), "showWithParent", false);
        setField(term135653, term135653.getClass(), "modalBlocker", null);
        setField(term135653, term135653.getClass(), "modalExclusionType", null);
        setField(term135653, term135653.getClass(), "windowListener", null);
        setField(term135653, term135653.getClass(), "windowStateListener", null);
        setField(term135653, term135653.getClass(), "windowFocusListener", null);
        setField(term135653, term135653.getClass(), "inputContext", null);
        setField(term135653, term135653.getClass(), "inputContextLock", null);
        setField(term135653, term135653.getClass(), "focusMgr", null);
        setBooleanField(term135653, term135653.getClass(), "focusableWindowState", false);
        setBooleanField(term135653, term135653.getClass(), "autoRequestFocus", false);
        setBooleanField(term135653, term135653.getClass(), "isInShow", false);
        setFloatField(term135653, term135653.getClass(), "opacity", 0.0F);
        setField(term135653, term135653.getClass(), "shape", null);
        setBooleanField(term135653, term135653.getClass(), "isTrayIconWindow", false);
        setIntField(term135653, term135653.getClass(), "securityWarningWidth", 0);
        setIntField(term135653, term135653.getClass(), "securityWarningHeight", 0);
        setDoubleField(term135653, term135653.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term135653, term135653.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term135653, term135653.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term135653, term135653.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term135653, term135653.getClass(), "anchor", null);
        setField(term135653, term135653.getClass(), "type", null);
        setIntField(term135653, term135653.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term135653, term135653.getClass(), "locationByPlatform", false);
        setField(term135653, term135653.getClass(), "component", null);
        setField(term135653, term135653.getClass(), "layoutMgr", null);
        setField(term135653, term135653.getClass(), "dispatcher", null);
        setField(term135653, term135653.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term135653, term135653.getClass(), "focusCycleRoot", false);
        setBooleanField(term135653, term135653.getClass(), "focusTraversalPolicyProvider", false);
        setField(term135653, term135653.getClass(), "printingThreads", null);
        setBooleanField(term135653, term135653.getClass(), "printing", false);
        setField(term135653, term135653.getClass(), "containerListener", null);
        setIntField(term135653, term135653.getClass(), "listeningChildren", 0);
        setIntField(term135653, term135653.getClass(), "listeningBoundsChildren", 0);
        setIntField(term135653, term135653.getClass(), "descendantsCount", 0);
        setField(term135653, term135653.getClass(), "preserveBackgroundColor", null);
        setIntField(term135653, term135653.getClass(), "numOfHWComponents", 0);
        setIntField(term135653, term135653.getClass(), "numOfLWComponents", 0);
        setField(term135653, term135653.getClass(), "modalComp", null);
        setField(term135653, term135653.getClass(), "modalAppContext", null);
        setIntField(term135653, term135653.getClass(), "containerSerializedDataVersion", 0);
        setField(term135653, term135653.getClass(), "peer", null);
        setField(term135653, term135653.getClass(), "parent", null);
        setField(term135653, term135653.getClass(), "appContext", null);
        setIntField(term135653, term135653.getClass(), "x", 0);
        setIntField(term135653, term135653.getClass(), "y", 0);
        setIntField(term135653, term135653.getClass(), "width", 0);
        setIntField(term135653, term135653.getClass(), "height", 0);
        setField(term135653, term135653.getClass(), "foreground", null);
        setField(term135653, term135653.getClass(), "background", null);
        setField(term135653, term135653.getClass(), "font", null);
        setField(term135653, term135653.getClass(), "peerFont", null);
        setField(term135653, term135653.getClass(), "cursor", null);
        setField(term135653, term135653.getClass(), "locale", null);
        setField(term135653, term135653.getClass(), "graphicsConfig", null);
        setField(term135653, term135653.getClass(), "bufferStrategy", null);
        setBooleanField(term135653, term135653.getClass(), "ignoreRepaint", false);
        setBooleanField(term135653, term135653.getClass(), "visible", false);
        setBooleanField(term135653, term135653.getClass(), "enabled", false);
        setBooleanField(term135653, term135653.getClass(), "valid", false);
        setField(term135653, term135653.getClass(), "dropTarget", null);
        setField(term135653, term135653.getClass(), "popups", null);
        setField(term135653, term135653.getClass(), "name", null);
        setBooleanField(term135653, term135653.getClass(), "nameExplicitlySet", false);
        setBooleanField(term135653, term135653.getClass(), "focusable", false);
        setIntField(term135653, term135653.getClass(), "isFocusTraversableOverridden", 0);
        setField(term135653, term135653.getClass(), "focusTraversalKeys", null);
        setBooleanField(term135653, term135653.getClass(), "focusTraversalKeysEnabled", false);
        setField(term135653, term135653.getClass(), "acc", null);
        setField(term135653, term135653.getClass(), "minSize", null);
        setBooleanField(term135653, term135653.getClass(), "minSizeSet", false);
        setField(term135653, term135653.getClass(), "prefSize", null);
        setBooleanField(term135653, term135653.getClass(), "prefSizeSet", false);
        setField(term135653, term135653.getClass(), "maxSize", null);
        setBooleanField(term135653, term135653.getClass(), "maxSizeSet", false);
        setField(term135653, term135653.getClass(), "componentOrientation", null);
        setBooleanField(term135653, term135653.getClass(), "newEventsOnly", false);
        setField(term135653, term135653.getClass(), "componentListener", null);
        setField(term135653, term135653.getClass(), "focusListener", null);
        setField(term135653, term135653.getClass(), "hierarchyListener", null);
        setField(term135653, term135653.getClass(), "hierarchyBoundsListener", null);
        setField(term135653, term135653.getClass(), "keyListener", null);
        setField(term135653, term135653.getClass(), "mouseListener", null);
        setField(term135653, term135653.getClass(), "mouseMotionListener", null);
        setField(term135653, term135653.getClass(), "mouseWheelListener", null);
        setField(term135653, term135653.getClass(), "inputMethodListener", null);
        setLongField(term135653, term135653.getClass(), "eventMask", 0L);
        setField(term135653, term135653.getClass(), "changeSupport", null);
        setField(term135653, term135653.getClass(), "objectLock", null);
        setBooleanField(term135653, term135653.getClass(), "isPacked", false);
        setIntField(term135653, term135653.getClass(), "boundsOp", 0);
        setField(term135653, term135653.getClass(), "compoundShape", null);
        setField(term135653, term135653.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term135653, term135653.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term135653, term135653.getClass(), "backgroundEraseDisabled", false);
        setField(term135653, term135653.getClass(), "eventCache", null);
        setBooleanField(term135653, term135653.getClass(), "coalescingEnabled", false);
        setBooleanField(term135653, term135653.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term135653, term135653.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.About");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAboutCard", argTypes, term135653, args);
    }

};


