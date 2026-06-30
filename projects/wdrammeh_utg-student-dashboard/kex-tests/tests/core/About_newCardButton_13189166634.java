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
     Object term134799;

    public About_newCardButton_13189166634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134799 = newInstance(Class.forName("core.About"));
        setField(term134799, term134799.getClass(), "midCard", null);
        setField(term134799, term134799.getClass(), "midLayer", null);
        setIntField(term134799, term134799.getClass(), "defaultCloseOperation", 0);
        setField(term134799, term134799.getClass(), "rootPane", null);
        setBooleanField(term134799, term134799.getClass(), "rootPaneCheckingEnabled", false);
        setField(term134799, term134799.getClass(), "transferHandler", null);
        setField(term134799, term134799.getClass(), "accessibleContext", null);
        setBooleanField(term134799, term134799.getClass(), "resizable", false);
        setBooleanField(term134799, term134799.getClass(), "undecorated", false);
        setBooleanField(term134799, term134799.getClass(), "initialized", false);
        setBooleanField(term134799, term134799.getClass(), "modal", false);
        setField(term134799, term134799.getClass(), "modalityType", null);
        setField(term134799, term134799.getClass(), "blockedWindows", null);
        setField(term134799, term134799.getClass(), "title", null);
        setField(term134799, term134799.getClass(), "modalFilter", null);
        setField(term134799, term134799.getClass(), "secondaryLoop", null);
        setBooleanField(term134799, term134799.getClass(), "isInHide", false);
        setBooleanField(term134799, term134799.getClass(), "isInDispose", false);
        setField(term134799, term134799.getClass(), "warningString", null);
        setField(term134799, term134799.getClass(), "icons", null);
        setField(term134799, term134799.getClass(), "temporaryLostComponent", null);
        setBooleanField(term134799, term134799.getClass(), "syncLWRequests", false);
        setBooleanField(term134799, term134799.getClass(), "beforeFirstShow", false);
        setBooleanField(term134799, term134799.getClass(), "disposing", false);
        setField(term134799, term134799.getClass(), "disposerRecord", null);
        setIntField(term134799, term134799.getClass(), "state", 0);
        setBooleanField(term134799, term134799.getClass(), "alwaysOnTop", false);
        setField(term134799, term134799.getClass(), "ownedWindowList", null);
        setField(term134799, term134799.getClass(), "weakThis", null);
        setBooleanField(term134799, term134799.getClass(), "showWithParent", false);
        setField(term134799, term134799.getClass(), "modalBlocker", null);
        setField(term134799, term134799.getClass(), "modalExclusionType", null);
        setField(term134799, term134799.getClass(), "windowListener", null);
        setField(term134799, term134799.getClass(), "windowStateListener", null);
        setField(term134799, term134799.getClass(), "windowFocusListener", null);
        setField(term134799, term134799.getClass(), "inputContext", null);
        setField(term134799, term134799.getClass(), "inputContextLock", null);
        setField(term134799, term134799.getClass(), "focusMgr", null);
        setBooleanField(term134799, term134799.getClass(), "focusableWindowState", false);
        setBooleanField(term134799, term134799.getClass(), "autoRequestFocus", false);
        setBooleanField(term134799, term134799.getClass(), "isInShow", false);
        setFloatField(term134799, term134799.getClass(), "opacity", 0.0F);
        setField(term134799, term134799.getClass(), "shape", null);
        setBooleanField(term134799, term134799.getClass(), "isTrayIconWindow", false);
        setIntField(term134799, term134799.getClass(), "securityWarningWidth", 0);
        setIntField(term134799, term134799.getClass(), "securityWarningHeight", 0);
        setDoubleField(term134799, term134799.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term134799, term134799.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term134799, term134799.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term134799, term134799.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term134799, term134799.getClass(), "anchor", null);
        setField(term134799, term134799.getClass(), "type", null);
        setIntField(term134799, term134799.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term134799, term134799.getClass(), "locationByPlatform", false);
        setField(term134799, term134799.getClass(), "component", null);
        setField(term134799, term134799.getClass(), "layoutMgr", null);
        setField(term134799, term134799.getClass(), "dispatcher", null);
        setField(term134799, term134799.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term134799, term134799.getClass(), "focusCycleRoot", false);
        setBooleanField(term134799, term134799.getClass(), "focusTraversalPolicyProvider", false);
        setField(term134799, term134799.getClass(), "printingThreads", null);
        setBooleanField(term134799, term134799.getClass(), "printing", false);
        setField(term134799, term134799.getClass(), "containerListener", null);
        setIntField(term134799, term134799.getClass(), "listeningChildren", 0);
        setIntField(term134799, term134799.getClass(), "listeningBoundsChildren", 0);
        setIntField(term134799, term134799.getClass(), "descendantsCount", 0);
        setField(term134799, term134799.getClass(), "preserveBackgroundColor", null);
        setIntField(term134799, term134799.getClass(), "numOfHWComponents", 0);
        setIntField(term134799, term134799.getClass(), "numOfLWComponents", 0);
        setField(term134799, term134799.getClass(), "modalComp", null);
        setField(term134799, term134799.getClass(), "modalAppContext", null);
        setIntField(term134799, term134799.getClass(), "containerSerializedDataVersion", 0);
        setField(term134799, term134799.getClass(), "peer", null);
        setField(term134799, term134799.getClass(), "parent", null);
        setField(term134799, term134799.getClass(), "appContext", null);
        setIntField(term134799, term134799.getClass(), "x", 0);
        setIntField(term134799, term134799.getClass(), "y", 0);
        setIntField(term134799, term134799.getClass(), "width", 0);
        setIntField(term134799, term134799.getClass(), "height", 0);
        setField(term134799, term134799.getClass(), "foreground", null);
        setField(term134799, term134799.getClass(), "background", null);
        setField(term134799, term134799.getClass(), "font", null);
        setField(term134799, term134799.getClass(), "peerFont", null);
        setField(term134799, term134799.getClass(), "cursor", null);
        setField(term134799, term134799.getClass(), "locale", null);
        setField(term134799, term134799.getClass(), "graphicsConfig", null);
        setField(term134799, term134799.getClass(), "bufferStrategy", null);
        setBooleanField(term134799, term134799.getClass(), "ignoreRepaint", false);
        setBooleanField(term134799, term134799.getClass(), "visible", false);
        setBooleanField(term134799, term134799.getClass(), "enabled", false);
        setBooleanField(term134799, term134799.getClass(), "valid", false);
        setField(term134799, term134799.getClass(), "dropTarget", null);
        setField(term134799, term134799.getClass(), "popups", null);
        setField(term134799, term134799.getClass(), "name", null);
        setBooleanField(term134799, term134799.getClass(), "nameExplicitlySet", false);
        setBooleanField(term134799, term134799.getClass(), "focusable", false);
        setIntField(term134799, term134799.getClass(), "isFocusTraversableOverridden", 0);
        setField(term134799, term134799.getClass(), "focusTraversalKeys", null);
        setBooleanField(term134799, term134799.getClass(), "focusTraversalKeysEnabled", false);
        setField(term134799, term134799.getClass(), "acc", null);
        setField(term134799, term134799.getClass(), "minSize", null);
        setBooleanField(term134799, term134799.getClass(), "minSizeSet", false);
        setField(term134799, term134799.getClass(), "prefSize", null);
        setBooleanField(term134799, term134799.getClass(), "prefSizeSet", false);
        setField(term134799, term134799.getClass(), "maxSize", null);
        setBooleanField(term134799, term134799.getClass(), "maxSizeSet", false);
        setField(term134799, term134799.getClass(), "componentOrientation", null);
        setBooleanField(term134799, term134799.getClass(), "newEventsOnly", false);
        setField(term134799, term134799.getClass(), "componentListener", null);
        setField(term134799, term134799.getClass(), "focusListener", null);
        setField(term134799, term134799.getClass(), "hierarchyListener", null);
        setField(term134799, term134799.getClass(), "hierarchyBoundsListener", null);
        setField(term134799, term134799.getClass(), "keyListener", null);
        setField(term134799, term134799.getClass(), "mouseListener", null);
        setField(term134799, term134799.getClass(), "mouseMotionListener", null);
        setField(term134799, term134799.getClass(), "mouseWheelListener", null);
        setField(term134799, term134799.getClass(), "inputMethodListener", null);
        setLongField(term134799, term134799.getClass(), "eventMask", 0L);
        setField(term134799, term134799.getClass(), "changeSupport", null);
        setField(term134799, term134799.getClass(), "objectLock", null);
        setBooleanField(term134799, term134799.getClass(), "isPacked", false);
        setIntField(term134799, term134799.getClass(), "boundsOp", 0);
        setField(term134799, term134799.getClass(), "compoundShape", null);
        setField(term134799, term134799.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term134799, term134799.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term134799, term134799.getClass(), "backgroundEraseDisabled", false);
        setField(term134799, term134799.getClass(), "eventCache", null);
        setBooleanField(term134799, term134799.getClass(), "coalescingEnabled", false);
        setBooleanField(term134799, term134799.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term134799, term134799.getClass(), "componentSerializedDataVersion", 0);
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
        callMethod(klass, "newCardButton", argTypes, term134799, args);
    }

};


