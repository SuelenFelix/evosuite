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

public class FirstLaunch_minorComponent_2378597904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5396;

    public FirstLaunch_minorComponent_2378597904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5396 = newInstance(Class.forName("core.first.FirstLaunch"));
        setField(term5396, term5396.getClass(), "contentPanel", null);
        setField(term5396, term5396.getClass(), "bigFont", null);
        setField(term5396, term5396.getClass(), "layout", null);
        setIntField(term5396, term5396.getClass(), "defaultCloseOperation", 0);
        setField(term5396, term5396.getClass(), "rootPane", null);
        setBooleanField(term5396, term5396.getClass(), "rootPaneCheckingEnabled", false);
        setField(term5396, term5396.getClass(), "transferHandler", null);
        setField(term5396, term5396.getClass(), "accessibleContext", null);
        setBooleanField(term5396, term5396.getClass(), "resizable", false);
        setBooleanField(term5396, term5396.getClass(), "undecorated", false);
        setBooleanField(term5396, term5396.getClass(), "initialized", false);
        setBooleanField(term5396, term5396.getClass(), "modal", false);
        setField(term5396, term5396.getClass(), "modalityType", null);
        setField(term5396, term5396.getClass(), "blockedWindows", null);
        setField(term5396, term5396.getClass(), "title", null);
        setField(term5396, term5396.getClass(), "modalFilter", null);
        setField(term5396, term5396.getClass(), "secondaryLoop", null);
        setBooleanField(term5396, term5396.getClass(), "isInHide", false);
        setBooleanField(term5396, term5396.getClass(), "isInDispose", false);
        setField(term5396, term5396.getClass(), "warningString", null);
        setField(term5396, term5396.getClass(), "icons", null);
        setField(term5396, term5396.getClass(), "temporaryLostComponent", null);
        setBooleanField(term5396, term5396.getClass(), "syncLWRequests", false);
        setBooleanField(term5396, term5396.getClass(), "beforeFirstShow", false);
        setBooleanField(term5396, term5396.getClass(), "disposing", false);
        setField(term5396, term5396.getClass(), "disposerRecord", null);
        setIntField(term5396, term5396.getClass(), "state", 0);
        setBooleanField(term5396, term5396.getClass(), "alwaysOnTop", false);
        setField(term5396, term5396.getClass(), "ownedWindowList", null);
        setField(term5396, term5396.getClass(), "weakThis", null);
        setBooleanField(term5396, term5396.getClass(), "showWithParent", false);
        setField(term5396, term5396.getClass(), "modalBlocker", null);
        setField(term5396, term5396.getClass(), "modalExclusionType", null);
        setField(term5396, term5396.getClass(), "windowListener", null);
        setField(term5396, term5396.getClass(), "windowStateListener", null);
        setField(term5396, term5396.getClass(), "windowFocusListener", null);
        setField(term5396, term5396.getClass(), "inputContext", null);
        setField(term5396, term5396.getClass(), "inputContextLock", null);
        setField(term5396, term5396.getClass(), "focusMgr", null);
        setBooleanField(term5396, term5396.getClass(), "focusableWindowState", false);
        setBooleanField(term5396, term5396.getClass(), "autoRequestFocus", false);
        setBooleanField(term5396, term5396.getClass(), "isInShow", false);
        setFloatField(term5396, term5396.getClass(), "opacity", 0.0F);
        setField(term5396, term5396.getClass(), "shape", null);
        setBooleanField(term5396, term5396.getClass(), "isTrayIconWindow", false);
        setIntField(term5396, term5396.getClass(), "securityWarningWidth", 0);
        setIntField(term5396, term5396.getClass(), "securityWarningHeight", 0);
        setDoubleField(term5396, term5396.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term5396, term5396.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term5396, term5396.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term5396, term5396.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term5396, term5396.getClass(), "anchor", null);
        setField(term5396, term5396.getClass(), "type", null);
        setIntField(term5396, term5396.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term5396, term5396.getClass(), "locationByPlatform", false);
        setField(term5396, term5396.getClass(), "component", null);
        setField(term5396, term5396.getClass(), "layoutMgr", null);
        setField(term5396, term5396.getClass(), "dispatcher", null);
        setField(term5396, term5396.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term5396, term5396.getClass(), "focusCycleRoot", false);
        setBooleanField(term5396, term5396.getClass(), "focusTraversalPolicyProvider", false);
        setField(term5396, term5396.getClass(), "printingThreads", null);
        setBooleanField(term5396, term5396.getClass(), "printing", false);
        setField(term5396, term5396.getClass(), "containerListener", null);
        setIntField(term5396, term5396.getClass(), "listeningChildren", 0);
        setIntField(term5396, term5396.getClass(), "listeningBoundsChildren", 0);
        setIntField(term5396, term5396.getClass(), "descendantsCount", 0);
        setField(term5396, term5396.getClass(), "preserveBackgroundColor", null);
        setIntField(term5396, term5396.getClass(), "numOfHWComponents", 0);
        setIntField(term5396, term5396.getClass(), "numOfLWComponents", 0);
        setField(term5396, term5396.getClass(), "modalComp", null);
        setField(term5396, term5396.getClass(), "modalAppContext", null);
        setIntField(term5396, term5396.getClass(), "containerSerializedDataVersion", 0);
        setField(term5396, term5396.getClass(), "peer", null);
        setField(term5396, term5396.getClass(), "parent", null);
        setField(term5396, term5396.getClass(), "appContext", null);
        setIntField(term5396, term5396.getClass(), "x", 0);
        setIntField(term5396, term5396.getClass(), "y", 0);
        setIntField(term5396, term5396.getClass(), "width", 0);
        setIntField(term5396, term5396.getClass(), "height", 0);
        setField(term5396, term5396.getClass(), "foreground", null);
        setField(term5396, term5396.getClass(), "background", null);
        setField(term5396, term5396.getClass(), "font", null);
        setField(term5396, term5396.getClass(), "peerFont", null);
        setField(term5396, term5396.getClass(), "cursor", null);
        setField(term5396, term5396.getClass(), "locale", null);
        setField(term5396, term5396.getClass(), "graphicsConfig", null);
        setField(term5396, term5396.getClass(), "bufferStrategy", null);
        setBooleanField(term5396, term5396.getClass(), "ignoreRepaint", false);
        setBooleanField(term5396, term5396.getClass(), "visible", false);
        setBooleanField(term5396, term5396.getClass(), "enabled", false);
        setBooleanField(term5396, term5396.getClass(), "valid", false);
        setField(term5396, term5396.getClass(), "dropTarget", null);
        setField(term5396, term5396.getClass(), "popups", null);
        setField(term5396, term5396.getClass(), "name", null);
        setBooleanField(term5396, term5396.getClass(), "nameExplicitlySet", false);
        setBooleanField(term5396, term5396.getClass(), "focusable", false);
        setIntField(term5396, term5396.getClass(), "isFocusTraversableOverridden", 0);
        setField(term5396, term5396.getClass(), "focusTraversalKeys", null);
        setBooleanField(term5396, term5396.getClass(), "focusTraversalKeysEnabled", false);
        setField(term5396, term5396.getClass(), "acc", null);
        setField(term5396, term5396.getClass(), "minSize", null);
        setBooleanField(term5396, term5396.getClass(), "minSizeSet", false);
        setField(term5396, term5396.getClass(), "prefSize", null);
        setBooleanField(term5396, term5396.getClass(), "prefSizeSet", false);
        setField(term5396, term5396.getClass(), "maxSize", null);
        setBooleanField(term5396, term5396.getClass(), "maxSizeSet", false);
        setField(term5396, term5396.getClass(), "componentOrientation", null);
        setBooleanField(term5396, term5396.getClass(), "newEventsOnly", false);
        setField(term5396, term5396.getClass(), "componentListener", null);
        setField(term5396, term5396.getClass(), "focusListener", null);
        setField(term5396, term5396.getClass(), "hierarchyListener", null);
        setField(term5396, term5396.getClass(), "hierarchyBoundsListener", null);
        setField(term5396, term5396.getClass(), "keyListener", null);
        setField(term5396, term5396.getClass(), "mouseListener", null);
        setField(term5396, term5396.getClass(), "mouseMotionListener", null);
        setField(term5396, term5396.getClass(), "mouseWheelListener", null);
        setField(term5396, term5396.getClass(), "inputMethodListener", null);
        setLongField(term5396, term5396.getClass(), "eventMask", 0L);
        setField(term5396, term5396.getClass(), "changeSupport", null);
        setField(term5396, term5396.getClass(), "objectLock", null);
        setBooleanField(term5396, term5396.getClass(), "isPacked", false);
        setIntField(term5396, term5396.getClass(), "boundsOp", 0);
        setField(term5396, term5396.getClass(), "compoundShape", null);
        setField(term5396, term5396.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term5396, term5396.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term5396, term5396.getClass(), "backgroundEraseDisabled", false);
        setField(term5396, term5396.getClass(), "eventCache", null);
        setBooleanField(term5396, term5396.getClass(), "coalescingEnabled", false);
        setBooleanField(term5396, term5396.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term5396, term5396.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.first.FirstLaunch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "minorComponent", argTypes, term5396, args);
    }

};


