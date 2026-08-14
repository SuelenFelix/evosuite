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

public class KFrame_getIcon_1341194865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51056;

    public KFrame_getIcon_1341194865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51056 = newInstance(Class.forName("proto.KFrame"));
        setIntField(term51056, term51056.getClass(), "defaultCloseOperation", 0);
        setField(term51056, term51056.getClass(), "transferHandler", null);
        setField(term51056, term51056.getClass(), "rootPane", null);
        setBooleanField(term51056, term51056.getClass(), "rootPaneCheckingEnabled", false);
        setField(term51056, term51056.getClass(), "accessibleContext", null);
        setField(term51056, term51056.getClass(), "maximizedBounds", null);
        setField(term51056, term51056.getClass(), "title", null);
        setField(term51056, term51056.getClass(), "menuBar", null);
        setBooleanField(term51056, term51056.getClass(), "resizable", false);
        setBooleanField(term51056, term51056.getClass(), "undecorated", false);
        setBooleanField(term51056, term51056.getClass(), "mbManagement", false);
        setIntField(term51056, term51056.getClass(), "state", 0);
        setField(term51056, term51056.getClass(), "ownedWindows", null);
        setIntField(term51056, term51056.getClass(), "frameSerializedDataVersion", 0);
        setField(term51056, term51056.getClass(), "warningString", null);
        setField(term51056, term51056.getClass(), "icons", null);
        setField(term51056, term51056.getClass(), "temporaryLostComponent", null);
        setBooleanField(term51056, term51056.getClass(), "syncLWRequests", false);
        setBooleanField(term51056, term51056.getClass(), "beforeFirstShow", false);
        setBooleanField(term51056, term51056.getClass(), "disposing", false);
        setField(term51056, term51056.getClass(), "disposerRecord", null);
        setBooleanField(term51056, term51056.getClass(), "alwaysOnTop", false);
        setField(term51056, term51056.getClass(), "ownedWindowList", null);
        setField(term51056, term51056.getClass(), "weakThis", null);
        setBooleanField(term51056, term51056.getClass(), "showWithParent", false);
        setField(term51056, term51056.getClass(), "modalBlocker", null);
        setField(term51056, term51056.getClass(), "modalExclusionType", null);
        setField(term51056, term51056.getClass(), "windowListener", null);
        setField(term51056, term51056.getClass(), "windowStateListener", null);
        setField(term51056, term51056.getClass(), "windowFocusListener", null);
        setField(term51056, term51056.getClass(), "inputContext", null);
        setField(term51056, term51056.getClass(), "inputContextLock", null);
        setField(term51056, term51056.getClass(), "focusMgr", null);
        setBooleanField(term51056, term51056.getClass(), "focusableWindowState", false);
        setBooleanField(term51056, term51056.getClass(), "autoRequestFocus", false);
        setBooleanField(term51056, term51056.getClass(), "isInShow", false);
        setFloatField(term51056, term51056.getClass(), "opacity", 0.0F);
        setField(term51056, term51056.getClass(), "shape", null);
        setBooleanField(term51056, term51056.getClass(), "isTrayIconWindow", false);
        setIntField(term51056, term51056.getClass(), "securityWarningWidth", 0);
        setIntField(term51056, term51056.getClass(), "securityWarningHeight", 0);
        setDoubleField(term51056, term51056.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term51056, term51056.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term51056, term51056.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term51056, term51056.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term51056, term51056.getClass(), "anchor", null);
        setField(term51056, term51056.getClass(), "type", null);
        setIntField(term51056, term51056.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term51056, term51056.getClass(), "locationByPlatform", false);
        setField(term51056, term51056.getClass(), "component", null);
        setField(term51056, term51056.getClass(), "layoutMgr", null);
        setField(term51056, term51056.getClass(), "dispatcher", null);
        setField(term51056, term51056.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term51056, term51056.getClass(), "focusCycleRoot", false);
        setBooleanField(term51056, term51056.getClass(), "focusTraversalPolicyProvider", false);
        setField(term51056, term51056.getClass(), "printingThreads", null);
        setBooleanField(term51056, term51056.getClass(), "printing", false);
        setField(term51056, term51056.getClass(), "containerListener", null);
        setIntField(term51056, term51056.getClass(), "listeningChildren", 0);
        setIntField(term51056, term51056.getClass(), "listeningBoundsChildren", 0);
        setIntField(term51056, term51056.getClass(), "descendantsCount", 0);
        setField(term51056, term51056.getClass(), "preserveBackgroundColor", null);
        setIntField(term51056, term51056.getClass(), "numOfHWComponents", 0);
        setIntField(term51056, term51056.getClass(), "numOfLWComponents", 0);
        setField(term51056, term51056.getClass(), "modalComp", null);
        setField(term51056, term51056.getClass(), "modalAppContext", null);
        setIntField(term51056, term51056.getClass(), "containerSerializedDataVersion", 0);
        setField(term51056, term51056.getClass(), "peer", null);
        setField(term51056, term51056.getClass(), "parent", null);
        setField(term51056, term51056.getClass(), "appContext", null);
        setIntField(term51056, term51056.getClass(), "x", 0);
        setIntField(term51056, term51056.getClass(), "y", 0);
        setIntField(term51056, term51056.getClass(), "width", 0);
        setIntField(term51056, term51056.getClass(), "height", 0);
        setField(term51056, term51056.getClass(), "foreground", null);
        setField(term51056, term51056.getClass(), "background", null);
        setField(term51056, term51056.getClass(), "font", null);
        setField(term51056, term51056.getClass(), "peerFont", null);
        setField(term51056, term51056.getClass(), "cursor", null);
        setField(term51056, term51056.getClass(), "locale", null);
        setField(term51056, term51056.getClass(), "graphicsConfig", null);
        setField(term51056, term51056.getClass(), "bufferStrategy", null);
        setBooleanField(term51056, term51056.getClass(), "ignoreRepaint", false);
        setBooleanField(term51056, term51056.getClass(), "visible", false);
        setBooleanField(term51056, term51056.getClass(), "enabled", false);
        setBooleanField(term51056, term51056.getClass(), "valid", false);
        setField(term51056, term51056.getClass(), "dropTarget", null);
        setField(term51056, term51056.getClass(), "popups", null);
        setField(term51056, term51056.getClass(), "name", null);
        setBooleanField(term51056, term51056.getClass(), "nameExplicitlySet", false);
        setBooleanField(term51056, term51056.getClass(), "focusable", false);
        setIntField(term51056, term51056.getClass(), "isFocusTraversableOverridden", 0);
        setField(term51056, term51056.getClass(), "focusTraversalKeys", null);
        setBooleanField(term51056, term51056.getClass(), "focusTraversalKeysEnabled", false);
        setField(term51056, term51056.getClass(), "acc", null);
        setField(term51056, term51056.getClass(), "minSize", null);
        setBooleanField(term51056, term51056.getClass(), "minSizeSet", false);
        setField(term51056, term51056.getClass(), "prefSize", null);
        setBooleanField(term51056, term51056.getClass(), "prefSizeSet", false);
        setField(term51056, term51056.getClass(), "maxSize", null);
        setBooleanField(term51056, term51056.getClass(), "maxSizeSet", false);
        setField(term51056, term51056.getClass(), "componentOrientation", null);
        setBooleanField(term51056, term51056.getClass(), "newEventsOnly", false);
        setField(term51056, term51056.getClass(), "componentListener", null);
        setField(term51056, term51056.getClass(), "focusListener", null);
        setField(term51056, term51056.getClass(), "hierarchyListener", null);
        setField(term51056, term51056.getClass(), "hierarchyBoundsListener", null);
        setField(term51056, term51056.getClass(), "keyListener", null);
        setField(term51056, term51056.getClass(), "mouseListener", null);
        setField(term51056, term51056.getClass(), "mouseMotionListener", null);
        setField(term51056, term51056.getClass(), "mouseWheelListener", null);
        setField(term51056, term51056.getClass(), "inputMethodListener", null);
        setLongField(term51056, term51056.getClass(), "eventMask", 0L);
        setField(term51056, term51056.getClass(), "changeSupport", null);
        setField(term51056, term51056.getClass(), "objectLock", null);
        setBooleanField(term51056, term51056.getClass(), "isPacked", false);
        setIntField(term51056, term51056.getClass(), "boundsOp", 0);
        setField(term51056, term51056.getClass(), "compoundShape", null);
        setField(term51056, term51056.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term51056, term51056.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term51056, term51056.getClass(), "backgroundEraseDisabled", false);
        setField(term51056, term51056.getClass(), "eventCache", null);
        setBooleanField(term51056, term51056.getClass(), "coalescingEnabled", false);
        setBooleanField(term51056, term51056.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term51056, term51056.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KFrame");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIcon", argTypes, term51056, args);
    }

};


