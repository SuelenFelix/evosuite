package proto;

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
import static proto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class KFrame_setPreferences_3348969923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50947;

    public KFrame_setPreferences_3348969923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50947 = newInstance(Class.forName("proto.KFrame"));
        setIntField(term50947, term50947.getClass(), "defaultCloseOperation", 0);
        setField(term50947, term50947.getClass(), "transferHandler", null);
        setField(term50947, term50947.getClass(), "rootPane", null);
        setBooleanField(term50947, term50947.getClass(), "rootPaneCheckingEnabled", false);
        setField(term50947, term50947.getClass(), "accessibleContext", null);
        setField(term50947, term50947.getClass(), "maximizedBounds", null);
        setField(term50947, term50947.getClass(), "title", null);
        setField(term50947, term50947.getClass(), "menuBar", null);
        setBooleanField(term50947, term50947.getClass(), "resizable", false);
        setBooleanField(term50947, term50947.getClass(), "undecorated", false);
        setBooleanField(term50947, term50947.getClass(), "mbManagement", false);
        setIntField(term50947, term50947.getClass(), "state", 0);
        setField(term50947, term50947.getClass(), "ownedWindows", null);
        setIntField(term50947, term50947.getClass(), "frameSerializedDataVersion", 0);
        setField(term50947, term50947.getClass(), "warningString", null);
        setField(term50947, term50947.getClass(), "icons", null);
        setField(term50947, term50947.getClass(), "temporaryLostComponent", null);
        setBooleanField(term50947, term50947.getClass(), "syncLWRequests", false);
        setBooleanField(term50947, term50947.getClass(), "beforeFirstShow", false);
        setBooleanField(term50947, term50947.getClass(), "disposing", false);
        setField(term50947, term50947.getClass(), "disposerRecord", null);
        setBooleanField(term50947, term50947.getClass(), "alwaysOnTop", false);
        setField(term50947, term50947.getClass(), "ownedWindowList", null);
        setField(term50947, term50947.getClass(), "weakThis", null);
        setBooleanField(term50947, term50947.getClass(), "showWithParent", false);
        setField(term50947, term50947.getClass(), "modalBlocker", null);
        setField(term50947, term50947.getClass(), "modalExclusionType", null);
        setField(term50947, term50947.getClass(), "windowListener", null);
        setField(term50947, term50947.getClass(), "windowStateListener", null);
        setField(term50947, term50947.getClass(), "windowFocusListener", null);
        setField(term50947, term50947.getClass(), "inputContext", null);
        setField(term50947, term50947.getClass(), "inputContextLock", null);
        setField(term50947, term50947.getClass(), "focusMgr", null);
        setBooleanField(term50947, term50947.getClass(), "focusableWindowState", false);
        setBooleanField(term50947, term50947.getClass(), "autoRequestFocus", false);
        setBooleanField(term50947, term50947.getClass(), "isInShow", false);
        setFloatField(term50947, term50947.getClass(), "opacity", 0.0F);
        setField(term50947, term50947.getClass(), "shape", null);
        setBooleanField(term50947, term50947.getClass(), "isTrayIconWindow", false);
        setIntField(term50947, term50947.getClass(), "securityWarningWidth", 0);
        setIntField(term50947, term50947.getClass(), "securityWarningHeight", 0);
        setDoubleField(term50947, term50947.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term50947, term50947.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term50947, term50947.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term50947, term50947.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term50947, term50947.getClass(), "anchor", null);
        setField(term50947, term50947.getClass(), "type", null);
        setIntField(term50947, term50947.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term50947, term50947.getClass(), "locationByPlatform", false);
        setField(term50947, term50947.getClass(), "component", null);
        setField(term50947, term50947.getClass(), "layoutMgr", null);
        setField(term50947, term50947.getClass(), "dispatcher", null);
        setField(term50947, term50947.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term50947, term50947.getClass(), "focusCycleRoot", false);
        setBooleanField(term50947, term50947.getClass(), "focusTraversalPolicyProvider", false);
        setField(term50947, term50947.getClass(), "printingThreads", null);
        setBooleanField(term50947, term50947.getClass(), "printing", false);
        setField(term50947, term50947.getClass(), "containerListener", null);
        setIntField(term50947, term50947.getClass(), "listeningChildren", 0);
        setIntField(term50947, term50947.getClass(), "listeningBoundsChildren", 0);
        setIntField(term50947, term50947.getClass(), "descendantsCount", 0);
        setField(term50947, term50947.getClass(), "preserveBackgroundColor", null);
        setIntField(term50947, term50947.getClass(), "numOfHWComponents", 0);
        setIntField(term50947, term50947.getClass(), "numOfLWComponents", 0);
        setField(term50947, term50947.getClass(), "modalComp", null);
        setField(term50947, term50947.getClass(), "modalAppContext", null);
        setIntField(term50947, term50947.getClass(), "containerSerializedDataVersion", 0);
        setField(term50947, term50947.getClass(), "peer", null);
        setField(term50947, term50947.getClass(), "parent", null);
        setField(term50947, term50947.getClass(), "appContext", null);
        setIntField(term50947, term50947.getClass(), "x", 0);
        setIntField(term50947, term50947.getClass(), "y", 0);
        setIntField(term50947, term50947.getClass(), "width", 0);
        setIntField(term50947, term50947.getClass(), "height", 0);
        setField(term50947, term50947.getClass(), "foreground", null);
        setField(term50947, term50947.getClass(), "background", null);
        setField(term50947, term50947.getClass(), "font", null);
        setField(term50947, term50947.getClass(), "peerFont", null);
        setField(term50947, term50947.getClass(), "cursor", null);
        setField(term50947, term50947.getClass(), "locale", null);
        setField(term50947, term50947.getClass(), "graphicsConfig", null);
        setField(term50947, term50947.getClass(), "bufferStrategy", null);
        setBooleanField(term50947, term50947.getClass(), "ignoreRepaint", false);
        setBooleanField(term50947, term50947.getClass(), "visible", false);
        setBooleanField(term50947, term50947.getClass(), "enabled", false);
        setBooleanField(term50947, term50947.getClass(), "valid", false);
        setField(term50947, term50947.getClass(), "dropTarget", null);
        setField(term50947, term50947.getClass(), "popups", null);
        setField(term50947, term50947.getClass(), "name", null);
        setBooleanField(term50947, term50947.getClass(), "nameExplicitlySet", false);
        setBooleanField(term50947, term50947.getClass(), "focusable", false);
        setIntField(term50947, term50947.getClass(), "isFocusTraversableOverridden", 0);
        setField(term50947, term50947.getClass(), "focusTraversalKeys", null);
        setBooleanField(term50947, term50947.getClass(), "focusTraversalKeysEnabled", false);
        setField(term50947, term50947.getClass(), "acc", null);
        setField(term50947, term50947.getClass(), "minSize", null);
        setBooleanField(term50947, term50947.getClass(), "minSizeSet", false);
        setField(term50947, term50947.getClass(), "prefSize", null);
        setBooleanField(term50947, term50947.getClass(), "prefSizeSet", false);
        setField(term50947, term50947.getClass(), "maxSize", null);
        setBooleanField(term50947, term50947.getClass(), "maxSizeSet", false);
        setField(term50947, term50947.getClass(), "componentOrientation", null);
        setBooleanField(term50947, term50947.getClass(), "newEventsOnly", false);
        setField(term50947, term50947.getClass(), "componentListener", null);
        setField(term50947, term50947.getClass(), "focusListener", null);
        setField(term50947, term50947.getClass(), "hierarchyListener", null);
        setField(term50947, term50947.getClass(), "hierarchyBoundsListener", null);
        setField(term50947, term50947.getClass(), "keyListener", null);
        setField(term50947, term50947.getClass(), "mouseListener", null);
        setField(term50947, term50947.getClass(), "mouseMotionListener", null);
        setField(term50947, term50947.getClass(), "mouseWheelListener", null);
        setField(term50947, term50947.getClass(), "inputMethodListener", null);
        setLongField(term50947, term50947.getClass(), "eventMask", 0L);
        setField(term50947, term50947.getClass(), "changeSupport", null);
        setField(term50947, term50947.getClass(), "objectLock", null);
        setBooleanField(term50947, term50947.getClass(), "isPacked", false);
        setIntField(term50947, term50947.getClass(), "boundsOp", 0);
        setField(term50947, term50947.getClass(), "compoundShape", null);
        setField(term50947, term50947.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term50947, term50947.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term50947, term50947.getClass(), "backgroundEraseDisabled", false);
        setField(term50947, term50947.getClass(), "eventCache", null);
        setBooleanField(term50947, term50947.getClass(), "coalescingEnabled", false);
        setBooleanField(term50947, term50947.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term50947, term50947.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KFrame");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term50947, args);
    }

};


