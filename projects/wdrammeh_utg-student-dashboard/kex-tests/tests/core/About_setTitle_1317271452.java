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

public class About_setTitle_1317271452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133865;

    public About_setTitle_1317271452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133865 = newInstance(Class.forName("core.About"));
        setField(term133865, term133865.getClass(), "midCard", null);
        setField(term133865, term133865.getClass(), "midLayer", null);
        setIntField(term133865, term133865.getClass(), "defaultCloseOperation", 0);
        setField(term133865, term133865.getClass(), "rootPane", null);
        setBooleanField(term133865, term133865.getClass(), "rootPaneCheckingEnabled", false);
        setField(term133865, term133865.getClass(), "transferHandler", null);
        setField(term133865, term133865.getClass(), "accessibleContext", null);
        setBooleanField(term133865, term133865.getClass(), "resizable", false);
        setBooleanField(term133865, term133865.getClass(), "undecorated", false);
        setBooleanField(term133865, term133865.getClass(), "initialized", false);
        setBooleanField(term133865, term133865.getClass(), "modal", false);
        setField(term133865, term133865.getClass(), "modalityType", null);
        setField(term133865, term133865.getClass(), "blockedWindows", null);
        setField(term133865, term133865.getClass(), "title", null);
        setField(term133865, term133865.getClass(), "modalFilter", null);
        setField(term133865, term133865.getClass(), "secondaryLoop", null);
        setBooleanField(term133865, term133865.getClass(), "isInHide", false);
        setBooleanField(term133865, term133865.getClass(), "isInDispose", false);
        setField(term133865, term133865.getClass(), "warningString", null);
        setField(term133865, term133865.getClass(), "icons", null);
        setField(term133865, term133865.getClass(), "temporaryLostComponent", null);
        setBooleanField(term133865, term133865.getClass(), "syncLWRequests", false);
        setBooleanField(term133865, term133865.getClass(), "beforeFirstShow", false);
        setBooleanField(term133865, term133865.getClass(), "disposing", false);
        setField(term133865, term133865.getClass(), "disposerRecord", null);
        setIntField(term133865, term133865.getClass(), "state", 0);
        setBooleanField(term133865, term133865.getClass(), "alwaysOnTop", false);
        setField(term133865, term133865.getClass(), "ownedWindowList", null);
        setField(term133865, term133865.getClass(), "weakThis", null);
        setBooleanField(term133865, term133865.getClass(), "showWithParent", false);
        setField(term133865, term133865.getClass(), "modalBlocker", null);
        setField(term133865, term133865.getClass(), "modalExclusionType", null);
        setField(term133865, term133865.getClass(), "windowListener", null);
        setField(term133865, term133865.getClass(), "windowStateListener", null);
        setField(term133865, term133865.getClass(), "windowFocusListener", null);
        setField(term133865, term133865.getClass(), "inputContext", null);
        setField(term133865, term133865.getClass(), "inputContextLock", null);
        setField(term133865, term133865.getClass(), "focusMgr", null);
        setBooleanField(term133865, term133865.getClass(), "focusableWindowState", false);
        setBooleanField(term133865, term133865.getClass(), "autoRequestFocus", false);
        setBooleanField(term133865, term133865.getClass(), "isInShow", false);
        setFloatField(term133865, term133865.getClass(), "opacity", 0.0F);
        setField(term133865, term133865.getClass(), "shape", null);
        setBooleanField(term133865, term133865.getClass(), "isTrayIconWindow", false);
        setIntField(term133865, term133865.getClass(), "securityWarningWidth", 0);
        setIntField(term133865, term133865.getClass(), "securityWarningHeight", 0);
        setDoubleField(term133865, term133865.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term133865, term133865.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term133865, term133865.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term133865, term133865.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term133865, term133865.getClass(), "anchor", null);
        setField(term133865, term133865.getClass(), "type", null);
        setIntField(term133865, term133865.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term133865, term133865.getClass(), "locationByPlatform", false);
        setField(term133865, term133865.getClass(), "component", null);
        setField(term133865, term133865.getClass(), "layoutMgr", null);
        setField(term133865, term133865.getClass(), "dispatcher", null);
        setField(term133865, term133865.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term133865, term133865.getClass(), "focusCycleRoot", false);
        setBooleanField(term133865, term133865.getClass(), "focusTraversalPolicyProvider", false);
        setField(term133865, term133865.getClass(), "printingThreads", null);
        setBooleanField(term133865, term133865.getClass(), "printing", false);
        setField(term133865, term133865.getClass(), "containerListener", null);
        setIntField(term133865, term133865.getClass(), "listeningChildren", 0);
        setIntField(term133865, term133865.getClass(), "listeningBoundsChildren", 0);
        setIntField(term133865, term133865.getClass(), "descendantsCount", 0);
        setField(term133865, term133865.getClass(), "preserveBackgroundColor", null);
        setIntField(term133865, term133865.getClass(), "numOfHWComponents", 0);
        setIntField(term133865, term133865.getClass(), "numOfLWComponents", 0);
        setField(term133865, term133865.getClass(), "modalComp", null);
        setField(term133865, term133865.getClass(), "modalAppContext", null);
        setIntField(term133865, term133865.getClass(), "containerSerializedDataVersion", 0);
        setField(term133865, term133865.getClass(), "peer", null);
        setField(term133865, term133865.getClass(), "parent", null);
        setField(term133865, term133865.getClass(), "appContext", null);
        setIntField(term133865, term133865.getClass(), "x", 0);
        setIntField(term133865, term133865.getClass(), "y", 0);
        setIntField(term133865, term133865.getClass(), "width", 0);
        setIntField(term133865, term133865.getClass(), "height", 0);
        setField(term133865, term133865.getClass(), "foreground", null);
        setField(term133865, term133865.getClass(), "background", null);
        setField(term133865, term133865.getClass(), "font", null);
        setField(term133865, term133865.getClass(), "peerFont", null);
        setField(term133865, term133865.getClass(), "cursor", null);
        setField(term133865, term133865.getClass(), "locale", null);
        setField(term133865, term133865.getClass(), "graphicsConfig", null);
        setField(term133865, term133865.getClass(), "bufferStrategy", null);
        setBooleanField(term133865, term133865.getClass(), "ignoreRepaint", false);
        setBooleanField(term133865, term133865.getClass(), "visible", false);
        setBooleanField(term133865, term133865.getClass(), "enabled", false);
        setBooleanField(term133865, term133865.getClass(), "valid", false);
        setField(term133865, term133865.getClass(), "dropTarget", null);
        setField(term133865, term133865.getClass(), "popups", null);
        setField(term133865, term133865.getClass(), "name", null);
        setBooleanField(term133865, term133865.getClass(), "nameExplicitlySet", false);
        setBooleanField(term133865, term133865.getClass(), "focusable", false);
        setIntField(term133865, term133865.getClass(), "isFocusTraversableOverridden", 0);
        setField(term133865, term133865.getClass(), "focusTraversalKeys", null);
        setBooleanField(term133865, term133865.getClass(), "focusTraversalKeysEnabled", false);
        setField(term133865, term133865.getClass(), "acc", null);
        setField(term133865, term133865.getClass(), "minSize", null);
        setBooleanField(term133865, term133865.getClass(), "minSizeSet", false);
        setField(term133865, term133865.getClass(), "prefSize", null);
        setBooleanField(term133865, term133865.getClass(), "prefSizeSet", false);
        setField(term133865, term133865.getClass(), "maxSize", null);
        setBooleanField(term133865, term133865.getClass(), "maxSizeSet", false);
        setField(term133865, term133865.getClass(), "componentOrientation", null);
        setBooleanField(term133865, term133865.getClass(), "newEventsOnly", false);
        setField(term133865, term133865.getClass(), "componentListener", null);
        setField(term133865, term133865.getClass(), "focusListener", null);
        setField(term133865, term133865.getClass(), "hierarchyListener", null);
        setField(term133865, term133865.getClass(), "hierarchyBoundsListener", null);
        setField(term133865, term133865.getClass(), "keyListener", null);
        setField(term133865, term133865.getClass(), "mouseListener", null);
        setField(term133865, term133865.getClass(), "mouseMotionListener", null);
        setField(term133865, term133865.getClass(), "mouseWheelListener", null);
        setField(term133865, term133865.getClass(), "inputMethodListener", null);
        setLongField(term133865, term133865.getClass(), "eventMask", 0L);
        setField(term133865, term133865.getClass(), "changeSupport", null);
        setField(term133865, term133865.getClass(), "objectLock", null);
        setBooleanField(term133865, term133865.getClass(), "isPacked", false);
        setIntField(term133865, term133865.getClass(), "boundsOp", 0);
        setField(term133865, term133865.getClass(), "compoundShape", null);
        setField(term133865, term133865.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term133865, term133865.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term133865, term133865.getClass(), "backgroundEraseDisabled", false);
        setField(term133865, term133865.getClass(), "eventCache", null);
        setBooleanField(term133865, term133865.getClass(), "coalescingEnabled", false);
        setBooleanField(term133865, term133865.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term133865, term133865.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.About");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTitle", argTypes, term133865, args);
    }

};


