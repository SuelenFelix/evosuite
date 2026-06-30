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
     Object term51007;

    public KFrame_getIcon_1341194865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51007 = newInstance(Class.forName("proto.KFrame"));
        setIntField(term51007, term51007.getClass(), "defaultCloseOperation", 0);
        setField(term51007, term51007.getClass(), "transferHandler", null);
        setField(term51007, term51007.getClass(), "rootPane", null);
        setBooleanField(term51007, term51007.getClass(), "rootPaneCheckingEnabled", false);
        setField(term51007, term51007.getClass(), "accessibleContext", null);
        setField(term51007, term51007.getClass(), "maximizedBounds", null);
        setField(term51007, term51007.getClass(), "title", null);
        setField(term51007, term51007.getClass(), "menuBar", null);
        setBooleanField(term51007, term51007.getClass(), "resizable", false);
        setBooleanField(term51007, term51007.getClass(), "undecorated", false);
        setBooleanField(term51007, term51007.getClass(), "mbManagement", false);
        setIntField(term51007, term51007.getClass(), "state", 0);
        setField(term51007, term51007.getClass(), "ownedWindows", null);
        setIntField(term51007, term51007.getClass(), "frameSerializedDataVersion", 0);
        setField(term51007, term51007.getClass(), "warningString", null);
        setField(term51007, term51007.getClass(), "icons", null);
        setField(term51007, term51007.getClass(), "temporaryLostComponent", null);
        setBooleanField(term51007, term51007.getClass(), "syncLWRequests", false);
        setBooleanField(term51007, term51007.getClass(), "beforeFirstShow", false);
        setBooleanField(term51007, term51007.getClass(), "disposing", false);
        setField(term51007, term51007.getClass(), "disposerRecord", null);
        setBooleanField(term51007, term51007.getClass(), "alwaysOnTop", false);
        setField(term51007, term51007.getClass(), "ownedWindowList", null);
        setField(term51007, term51007.getClass(), "weakThis", null);
        setBooleanField(term51007, term51007.getClass(), "showWithParent", false);
        setField(term51007, term51007.getClass(), "modalBlocker", null);
        setField(term51007, term51007.getClass(), "modalExclusionType", null);
        setField(term51007, term51007.getClass(), "windowListener", null);
        setField(term51007, term51007.getClass(), "windowStateListener", null);
        setField(term51007, term51007.getClass(), "windowFocusListener", null);
        setField(term51007, term51007.getClass(), "inputContext", null);
        setField(term51007, term51007.getClass(), "inputContextLock", null);
        setField(term51007, term51007.getClass(), "focusMgr", null);
        setBooleanField(term51007, term51007.getClass(), "focusableWindowState", false);
        setBooleanField(term51007, term51007.getClass(), "autoRequestFocus", false);
        setBooleanField(term51007, term51007.getClass(), "isInShow", false);
        setFloatField(term51007, term51007.getClass(), "opacity", 0.0F);
        setField(term51007, term51007.getClass(), "shape", null);
        setBooleanField(term51007, term51007.getClass(), "isTrayIconWindow", false);
        setIntField(term51007, term51007.getClass(), "securityWarningWidth", 0);
        setIntField(term51007, term51007.getClass(), "securityWarningHeight", 0);
        setDoubleField(term51007, term51007.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term51007, term51007.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term51007, term51007.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term51007, term51007.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term51007, term51007.getClass(), "anchor", null);
        setField(term51007, term51007.getClass(), "type", null);
        setIntField(term51007, term51007.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term51007, term51007.getClass(), "locationByPlatform", false);
        setField(term51007, term51007.getClass(), "component", null);
        setField(term51007, term51007.getClass(), "layoutMgr", null);
        setField(term51007, term51007.getClass(), "dispatcher", null);
        setField(term51007, term51007.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term51007, term51007.getClass(), "focusCycleRoot", false);
        setBooleanField(term51007, term51007.getClass(), "focusTraversalPolicyProvider", false);
        setField(term51007, term51007.getClass(), "printingThreads", null);
        setBooleanField(term51007, term51007.getClass(), "printing", false);
        setField(term51007, term51007.getClass(), "containerListener", null);
        setIntField(term51007, term51007.getClass(), "listeningChildren", 0);
        setIntField(term51007, term51007.getClass(), "listeningBoundsChildren", 0);
        setIntField(term51007, term51007.getClass(), "descendantsCount", 0);
        setField(term51007, term51007.getClass(), "preserveBackgroundColor", null);
        setIntField(term51007, term51007.getClass(), "numOfHWComponents", 0);
        setIntField(term51007, term51007.getClass(), "numOfLWComponents", 0);
        setField(term51007, term51007.getClass(), "modalComp", null);
        setField(term51007, term51007.getClass(), "modalAppContext", null);
        setIntField(term51007, term51007.getClass(), "containerSerializedDataVersion", 0);
        setField(term51007, term51007.getClass(), "peer", null);
        setField(term51007, term51007.getClass(), "parent", null);
        setField(term51007, term51007.getClass(), "appContext", null);
        setIntField(term51007, term51007.getClass(), "x", 0);
        setIntField(term51007, term51007.getClass(), "y", 0);
        setIntField(term51007, term51007.getClass(), "width", 0);
        setIntField(term51007, term51007.getClass(), "height", 0);
        setField(term51007, term51007.getClass(), "foreground", null);
        setField(term51007, term51007.getClass(), "background", null);
        setField(term51007, term51007.getClass(), "font", null);
        setField(term51007, term51007.getClass(), "peerFont", null);
        setField(term51007, term51007.getClass(), "cursor", null);
        setField(term51007, term51007.getClass(), "locale", null);
        setField(term51007, term51007.getClass(), "graphicsConfig", null);
        setField(term51007, term51007.getClass(), "bufferStrategy", null);
        setBooleanField(term51007, term51007.getClass(), "ignoreRepaint", false);
        setBooleanField(term51007, term51007.getClass(), "visible", false);
        setBooleanField(term51007, term51007.getClass(), "enabled", false);
        setBooleanField(term51007, term51007.getClass(), "valid", false);
        setField(term51007, term51007.getClass(), "dropTarget", null);
        setField(term51007, term51007.getClass(), "popups", null);
        setField(term51007, term51007.getClass(), "name", null);
        setBooleanField(term51007, term51007.getClass(), "nameExplicitlySet", false);
        setBooleanField(term51007, term51007.getClass(), "focusable", false);
        setIntField(term51007, term51007.getClass(), "isFocusTraversableOverridden", 0);
        setField(term51007, term51007.getClass(), "focusTraversalKeys", null);
        setBooleanField(term51007, term51007.getClass(), "focusTraversalKeysEnabled", false);
        setField(term51007, term51007.getClass(), "acc", null);
        setField(term51007, term51007.getClass(), "minSize", null);
        setBooleanField(term51007, term51007.getClass(), "minSizeSet", false);
        setField(term51007, term51007.getClass(), "prefSize", null);
        setBooleanField(term51007, term51007.getClass(), "prefSizeSet", false);
        setField(term51007, term51007.getClass(), "maxSize", null);
        setBooleanField(term51007, term51007.getClass(), "maxSizeSet", false);
        setField(term51007, term51007.getClass(), "componentOrientation", null);
        setBooleanField(term51007, term51007.getClass(), "newEventsOnly", false);
        setField(term51007, term51007.getClass(), "componentListener", null);
        setField(term51007, term51007.getClass(), "focusListener", null);
        setField(term51007, term51007.getClass(), "hierarchyListener", null);
        setField(term51007, term51007.getClass(), "hierarchyBoundsListener", null);
        setField(term51007, term51007.getClass(), "keyListener", null);
        setField(term51007, term51007.getClass(), "mouseListener", null);
        setField(term51007, term51007.getClass(), "mouseMotionListener", null);
        setField(term51007, term51007.getClass(), "mouseWheelListener", null);
        setField(term51007, term51007.getClass(), "inputMethodListener", null);
        setLongField(term51007, term51007.getClass(), "eventMask", 0L);
        setField(term51007, term51007.getClass(), "changeSupport", null);
        setField(term51007, term51007.getClass(), "objectLock", null);
        setBooleanField(term51007, term51007.getClass(), "isPacked", false);
        setIntField(term51007, term51007.getClass(), "boundsOp", 0);
        setField(term51007, term51007.getClass(), "compoundShape", null);
        setField(term51007, term51007.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term51007, term51007.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term51007, term51007.getClass(), "backgroundEraseDisabled", false);
        setField(term51007, term51007.getClass(), "eventCache", null);
        setBooleanField(term51007, term51007.getClass(), "coalescingEnabled", false);
        setBooleanField(term51007, term51007.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term51007, term51007.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KFrame");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIcon", argTypes, term51007, args);
    }

};


