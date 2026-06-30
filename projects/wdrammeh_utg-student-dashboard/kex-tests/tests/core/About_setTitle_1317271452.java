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
     Object term133867;

    public About_setTitle_1317271452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133867 = newInstance(Class.forName("core.About"));
        setField(term133867, term133867.getClass(), "midCard", null);
        setField(term133867, term133867.getClass(), "midLayer", null);
        setIntField(term133867, term133867.getClass(), "defaultCloseOperation", 0);
        setField(term133867, term133867.getClass(), "rootPane", null);
        setBooleanField(term133867, term133867.getClass(), "rootPaneCheckingEnabled", false);
        setField(term133867, term133867.getClass(), "transferHandler", null);
        setField(term133867, term133867.getClass(), "accessibleContext", null);
        setBooleanField(term133867, term133867.getClass(), "resizable", false);
        setBooleanField(term133867, term133867.getClass(), "undecorated", false);
        setBooleanField(term133867, term133867.getClass(), "initialized", false);
        setBooleanField(term133867, term133867.getClass(), "modal", false);
        setField(term133867, term133867.getClass(), "modalityType", null);
        setField(term133867, term133867.getClass(), "blockedWindows", null);
        setField(term133867, term133867.getClass(), "title", null);
        setField(term133867, term133867.getClass(), "modalFilter", null);
        setField(term133867, term133867.getClass(), "secondaryLoop", null);
        setBooleanField(term133867, term133867.getClass(), "isInHide", false);
        setBooleanField(term133867, term133867.getClass(), "isInDispose", false);
        setField(term133867, term133867.getClass(), "warningString", null);
        setField(term133867, term133867.getClass(), "icons", null);
        setField(term133867, term133867.getClass(), "temporaryLostComponent", null);
        setBooleanField(term133867, term133867.getClass(), "syncLWRequests", false);
        setBooleanField(term133867, term133867.getClass(), "beforeFirstShow", false);
        setBooleanField(term133867, term133867.getClass(), "disposing", false);
        setField(term133867, term133867.getClass(), "disposerRecord", null);
        setIntField(term133867, term133867.getClass(), "state", 0);
        setBooleanField(term133867, term133867.getClass(), "alwaysOnTop", false);
        setField(term133867, term133867.getClass(), "ownedWindowList", null);
        setField(term133867, term133867.getClass(), "weakThis", null);
        setBooleanField(term133867, term133867.getClass(), "showWithParent", false);
        setField(term133867, term133867.getClass(), "modalBlocker", null);
        setField(term133867, term133867.getClass(), "modalExclusionType", null);
        setField(term133867, term133867.getClass(), "windowListener", null);
        setField(term133867, term133867.getClass(), "windowStateListener", null);
        setField(term133867, term133867.getClass(), "windowFocusListener", null);
        setField(term133867, term133867.getClass(), "inputContext", null);
        setField(term133867, term133867.getClass(), "inputContextLock", null);
        setField(term133867, term133867.getClass(), "focusMgr", null);
        setBooleanField(term133867, term133867.getClass(), "focusableWindowState", false);
        setBooleanField(term133867, term133867.getClass(), "autoRequestFocus", false);
        setBooleanField(term133867, term133867.getClass(), "isInShow", false);
        setFloatField(term133867, term133867.getClass(), "opacity", 0.0F);
        setField(term133867, term133867.getClass(), "shape", null);
        setBooleanField(term133867, term133867.getClass(), "isTrayIconWindow", false);
        setIntField(term133867, term133867.getClass(), "securityWarningWidth", 0);
        setIntField(term133867, term133867.getClass(), "securityWarningHeight", 0);
        setDoubleField(term133867, term133867.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term133867, term133867.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term133867, term133867.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term133867, term133867.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term133867, term133867.getClass(), "anchor", null);
        setField(term133867, term133867.getClass(), "type", null);
        setIntField(term133867, term133867.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term133867, term133867.getClass(), "locationByPlatform", false);
        setField(term133867, term133867.getClass(), "component", null);
        setField(term133867, term133867.getClass(), "layoutMgr", null);
        setField(term133867, term133867.getClass(), "dispatcher", null);
        setField(term133867, term133867.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term133867, term133867.getClass(), "focusCycleRoot", false);
        setBooleanField(term133867, term133867.getClass(), "focusTraversalPolicyProvider", false);
        setField(term133867, term133867.getClass(), "printingThreads", null);
        setBooleanField(term133867, term133867.getClass(), "printing", false);
        setField(term133867, term133867.getClass(), "containerListener", null);
        setIntField(term133867, term133867.getClass(), "listeningChildren", 0);
        setIntField(term133867, term133867.getClass(), "listeningBoundsChildren", 0);
        setIntField(term133867, term133867.getClass(), "descendantsCount", 0);
        setField(term133867, term133867.getClass(), "preserveBackgroundColor", null);
        setIntField(term133867, term133867.getClass(), "numOfHWComponents", 0);
        setIntField(term133867, term133867.getClass(), "numOfLWComponents", 0);
        setField(term133867, term133867.getClass(), "modalComp", null);
        setField(term133867, term133867.getClass(), "modalAppContext", null);
        setIntField(term133867, term133867.getClass(), "containerSerializedDataVersion", 0);
        setField(term133867, term133867.getClass(), "peer", null);
        setField(term133867, term133867.getClass(), "parent", null);
        setField(term133867, term133867.getClass(), "appContext", null);
        setIntField(term133867, term133867.getClass(), "x", 0);
        setIntField(term133867, term133867.getClass(), "y", 0);
        setIntField(term133867, term133867.getClass(), "width", 0);
        setIntField(term133867, term133867.getClass(), "height", 0);
        setField(term133867, term133867.getClass(), "foreground", null);
        setField(term133867, term133867.getClass(), "background", null);
        setField(term133867, term133867.getClass(), "font", null);
        setField(term133867, term133867.getClass(), "peerFont", null);
        setField(term133867, term133867.getClass(), "cursor", null);
        setField(term133867, term133867.getClass(), "locale", null);
        setField(term133867, term133867.getClass(), "graphicsConfig", null);
        setField(term133867, term133867.getClass(), "bufferStrategy", null);
        setBooleanField(term133867, term133867.getClass(), "ignoreRepaint", false);
        setBooleanField(term133867, term133867.getClass(), "visible", false);
        setBooleanField(term133867, term133867.getClass(), "enabled", false);
        setBooleanField(term133867, term133867.getClass(), "valid", false);
        setField(term133867, term133867.getClass(), "dropTarget", null);
        setField(term133867, term133867.getClass(), "popups", null);
        setField(term133867, term133867.getClass(), "name", null);
        setBooleanField(term133867, term133867.getClass(), "nameExplicitlySet", false);
        setBooleanField(term133867, term133867.getClass(), "focusable", false);
        setIntField(term133867, term133867.getClass(), "isFocusTraversableOverridden", 0);
        setField(term133867, term133867.getClass(), "focusTraversalKeys", null);
        setBooleanField(term133867, term133867.getClass(), "focusTraversalKeysEnabled", false);
        setField(term133867, term133867.getClass(), "acc", null);
        setField(term133867, term133867.getClass(), "minSize", null);
        setBooleanField(term133867, term133867.getClass(), "minSizeSet", false);
        setField(term133867, term133867.getClass(), "prefSize", null);
        setBooleanField(term133867, term133867.getClass(), "prefSizeSet", false);
        setField(term133867, term133867.getClass(), "maxSize", null);
        setBooleanField(term133867, term133867.getClass(), "maxSizeSet", false);
        setField(term133867, term133867.getClass(), "componentOrientation", null);
        setBooleanField(term133867, term133867.getClass(), "newEventsOnly", false);
        setField(term133867, term133867.getClass(), "componentListener", null);
        setField(term133867, term133867.getClass(), "focusListener", null);
        setField(term133867, term133867.getClass(), "hierarchyListener", null);
        setField(term133867, term133867.getClass(), "hierarchyBoundsListener", null);
        setField(term133867, term133867.getClass(), "keyListener", null);
        setField(term133867, term133867.getClass(), "mouseListener", null);
        setField(term133867, term133867.getClass(), "mouseMotionListener", null);
        setField(term133867, term133867.getClass(), "mouseWheelListener", null);
        setField(term133867, term133867.getClass(), "inputMethodListener", null);
        setLongField(term133867, term133867.getClass(), "eventMask", 0L);
        setField(term133867, term133867.getClass(), "changeSupport", null);
        setField(term133867, term133867.getClass(), "objectLock", null);
        setBooleanField(term133867, term133867.getClass(), "isPacked", false);
        setIntField(term133867, term133867.getClass(), "boundsOp", 0);
        setField(term133867, term133867.getClass(), "compoundShape", null);
        setField(term133867, term133867.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term133867, term133867.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term133867, term133867.getClass(), "backgroundEraseDisabled", false);
        setField(term133867, term133867.getClass(), "eventCache", null);
        setBooleanField(term133867, term133867.getClass(), "coalescingEnabled", false);
        setBooleanField(term133867, term133867.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term133867, term133867.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.About");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTitle", argTypes, term133867, args);
    }

};


