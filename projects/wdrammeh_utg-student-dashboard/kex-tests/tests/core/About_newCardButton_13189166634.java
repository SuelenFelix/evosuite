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

public class About_newCardButton_13189166634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134797;

    public About_newCardButton_13189166634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134797 = newInstance(Class.forName("core.About"));
        setField(term134797, term134797.getClass(), "midCard", null);
        setField(term134797, term134797.getClass(), "midLayer", null);
        setIntField(term134797, term134797.getClass(), "defaultCloseOperation", 0);
        setField(term134797, term134797.getClass(), "rootPane", null);
        setBooleanField(term134797, term134797.getClass(), "rootPaneCheckingEnabled", false);
        setField(term134797, term134797.getClass(), "transferHandler", null);
        setField(term134797, term134797.getClass(), "accessibleContext", null);
        setBooleanField(term134797, term134797.getClass(), "resizable", false);
        setBooleanField(term134797, term134797.getClass(), "undecorated", false);
        setBooleanField(term134797, term134797.getClass(), "initialized", false);
        setBooleanField(term134797, term134797.getClass(), "modal", false);
        setField(term134797, term134797.getClass(), "modalityType", null);
        setField(term134797, term134797.getClass(), "blockedWindows", null);
        setField(term134797, term134797.getClass(), "title", null);
        setField(term134797, term134797.getClass(), "modalFilter", null);
        setField(term134797, term134797.getClass(), "secondaryLoop", null);
        setBooleanField(term134797, term134797.getClass(), "isInHide", false);
        setBooleanField(term134797, term134797.getClass(), "isInDispose", false);
        setField(term134797, term134797.getClass(), "warningString", null);
        setField(term134797, term134797.getClass(), "icons", null);
        setField(term134797, term134797.getClass(), "temporaryLostComponent", null);
        setBooleanField(term134797, term134797.getClass(), "syncLWRequests", false);
        setBooleanField(term134797, term134797.getClass(), "beforeFirstShow", false);
        setBooleanField(term134797, term134797.getClass(), "disposing", false);
        setField(term134797, term134797.getClass(), "disposerRecord", null);
        setIntField(term134797, term134797.getClass(), "state", 0);
        setBooleanField(term134797, term134797.getClass(), "alwaysOnTop", false);
        setField(term134797, term134797.getClass(), "ownedWindowList", null);
        setField(term134797, term134797.getClass(), "weakThis", null);
        setBooleanField(term134797, term134797.getClass(), "showWithParent", false);
        setField(term134797, term134797.getClass(), "modalBlocker", null);
        setField(term134797, term134797.getClass(), "modalExclusionType", null);
        setField(term134797, term134797.getClass(), "windowListener", null);
        setField(term134797, term134797.getClass(), "windowStateListener", null);
        setField(term134797, term134797.getClass(), "windowFocusListener", null);
        setField(term134797, term134797.getClass(), "inputContext", null);
        setField(term134797, term134797.getClass(), "inputContextLock", null);
        setField(term134797, term134797.getClass(), "focusMgr", null);
        setBooleanField(term134797, term134797.getClass(), "focusableWindowState", false);
        setBooleanField(term134797, term134797.getClass(), "autoRequestFocus", false);
        setBooleanField(term134797, term134797.getClass(), "isInShow", false);
        setFloatField(term134797, term134797.getClass(), "opacity", 0.0F);
        setField(term134797, term134797.getClass(), "shape", null);
        setBooleanField(term134797, term134797.getClass(), "isTrayIconWindow", false);
        setIntField(term134797, term134797.getClass(), "securityWarningWidth", 0);
        setIntField(term134797, term134797.getClass(), "securityWarningHeight", 0);
        setDoubleField(term134797, term134797.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term134797, term134797.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term134797, term134797.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term134797, term134797.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term134797, term134797.getClass(), "anchor", null);
        setField(term134797, term134797.getClass(), "type", null);
        setIntField(term134797, term134797.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term134797, term134797.getClass(), "locationByPlatform", false);
        setField(term134797, term134797.getClass(), "component", null);
        setField(term134797, term134797.getClass(), "layoutMgr", null);
        setField(term134797, term134797.getClass(), "dispatcher", null);
        setField(term134797, term134797.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term134797, term134797.getClass(), "focusCycleRoot", false);
        setBooleanField(term134797, term134797.getClass(), "focusTraversalPolicyProvider", false);
        setField(term134797, term134797.getClass(), "printingThreads", null);
        setBooleanField(term134797, term134797.getClass(), "printing", false);
        setField(term134797, term134797.getClass(), "containerListener", null);
        setIntField(term134797, term134797.getClass(), "listeningChildren", 0);
        setIntField(term134797, term134797.getClass(), "listeningBoundsChildren", 0);
        setIntField(term134797, term134797.getClass(), "descendantsCount", 0);
        setField(term134797, term134797.getClass(), "preserveBackgroundColor", null);
        setIntField(term134797, term134797.getClass(), "numOfHWComponents", 0);
        setIntField(term134797, term134797.getClass(), "numOfLWComponents", 0);
        setField(term134797, term134797.getClass(), "modalComp", null);
        setField(term134797, term134797.getClass(), "modalAppContext", null);
        setIntField(term134797, term134797.getClass(), "containerSerializedDataVersion", 0);
        setField(term134797, term134797.getClass(), "peer", null);
        setField(term134797, term134797.getClass(), "parent", null);
        setField(term134797, term134797.getClass(), "appContext", null);
        setIntField(term134797, term134797.getClass(), "x", 0);
        setIntField(term134797, term134797.getClass(), "y", 0);
        setIntField(term134797, term134797.getClass(), "width", 0);
        setIntField(term134797, term134797.getClass(), "height", 0);
        setField(term134797, term134797.getClass(), "foreground", null);
        setField(term134797, term134797.getClass(), "background", null);
        setField(term134797, term134797.getClass(), "font", null);
        setField(term134797, term134797.getClass(), "peerFont", null);
        setField(term134797, term134797.getClass(), "cursor", null);
        setField(term134797, term134797.getClass(), "locale", null);
        setField(term134797, term134797.getClass(), "graphicsConfig", null);
        setField(term134797, term134797.getClass(), "bufferStrategy", null);
        setBooleanField(term134797, term134797.getClass(), "ignoreRepaint", false);
        setBooleanField(term134797, term134797.getClass(), "visible", false);
        setBooleanField(term134797, term134797.getClass(), "enabled", false);
        setBooleanField(term134797, term134797.getClass(), "valid", false);
        setField(term134797, term134797.getClass(), "dropTarget", null);
        setField(term134797, term134797.getClass(), "popups", null);
        setField(term134797, term134797.getClass(), "name", null);
        setBooleanField(term134797, term134797.getClass(), "nameExplicitlySet", false);
        setBooleanField(term134797, term134797.getClass(), "focusable", false);
        setIntField(term134797, term134797.getClass(), "isFocusTraversableOverridden", 0);
        setField(term134797, term134797.getClass(), "focusTraversalKeys", null);
        setBooleanField(term134797, term134797.getClass(), "focusTraversalKeysEnabled", false);
        setField(term134797, term134797.getClass(), "acc", null);
        setField(term134797, term134797.getClass(), "minSize", null);
        setBooleanField(term134797, term134797.getClass(), "minSizeSet", false);
        setField(term134797, term134797.getClass(), "prefSize", null);
        setBooleanField(term134797, term134797.getClass(), "prefSizeSet", false);
        setField(term134797, term134797.getClass(), "maxSize", null);
        setBooleanField(term134797, term134797.getClass(), "maxSizeSet", false);
        setField(term134797, term134797.getClass(), "componentOrientation", null);
        setBooleanField(term134797, term134797.getClass(), "newEventsOnly", false);
        setField(term134797, term134797.getClass(), "componentListener", null);
        setField(term134797, term134797.getClass(), "focusListener", null);
        setField(term134797, term134797.getClass(), "hierarchyListener", null);
        setField(term134797, term134797.getClass(), "hierarchyBoundsListener", null);
        setField(term134797, term134797.getClass(), "keyListener", null);
        setField(term134797, term134797.getClass(), "mouseListener", null);
        setField(term134797, term134797.getClass(), "mouseMotionListener", null);
        setField(term134797, term134797.getClass(), "mouseWheelListener", null);
        setField(term134797, term134797.getClass(), "inputMethodListener", null);
        setLongField(term134797, term134797.getClass(), "eventMask", 0L);
        setField(term134797, term134797.getClass(), "changeSupport", null);
        setField(term134797, term134797.getClass(), "objectLock", null);
        setBooleanField(term134797, term134797.getClass(), "isPacked", false);
        setIntField(term134797, term134797.getClass(), "boundsOp", 0);
        setField(term134797, term134797.getClass(), "compoundShape", null);
        setField(term134797, term134797.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term134797, term134797.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term134797, term134797.getClass(), "backgroundEraseDisabled", false);
        setField(term134797, term134797.getClass(), "eventCache", null);
        setBooleanField(term134797, term134797.getClass(), "coalescingEnabled", false);
        setBooleanField(term134797, term134797.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term134797, term134797.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.About");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "newCardButton", argTypes, term134797, args);
    }

};


