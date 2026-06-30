package core.user;

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
import static core.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Guest_signalMissingInfo_6212772474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1589;

    public Guest_signalMissingInfo_6212772474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1589 = newInstance(Class.forName("core.user.Guest"));
        setIntField(term1589, term1589.getClass(), "defaultCloseOperation", 0);
        setField(term1589, term1589.getClass(), "rootPane", null);
        setBooleanField(term1589, term1589.getClass(), "rootPaneCheckingEnabled", false);
        setField(term1589, term1589.getClass(), "transferHandler", null);
        setField(term1589, term1589.getClass(), "accessibleContext", null);
        setBooleanField(term1589, term1589.getClass(), "resizable", false);
        setBooleanField(term1589, term1589.getClass(), "undecorated", false);
        setBooleanField(term1589, term1589.getClass(), "initialized", false);
        setBooleanField(term1589, term1589.getClass(), "modal", false);
        setField(term1589, term1589.getClass(), "modalityType", null);
        setField(term1589, term1589.getClass(), "blockedWindows", null);
        setField(term1589, term1589.getClass(), "title", null);
        setField(term1589, term1589.getClass(), "modalFilter", null);
        setField(term1589, term1589.getClass(), "secondaryLoop", null);
        setBooleanField(term1589, term1589.getClass(), "isInHide", false);
        setBooleanField(term1589, term1589.getClass(), "isInDispose", false);
        setField(term1589, term1589.getClass(), "warningString", null);
        setField(term1589, term1589.getClass(), "icons", null);
        setField(term1589, term1589.getClass(), "temporaryLostComponent", null);
        setBooleanField(term1589, term1589.getClass(), "syncLWRequests", false);
        setBooleanField(term1589, term1589.getClass(), "beforeFirstShow", false);
        setBooleanField(term1589, term1589.getClass(), "disposing", false);
        setField(term1589, term1589.getClass(), "disposerRecord", null);
        setIntField(term1589, term1589.getClass(), "state", 0);
        setBooleanField(term1589, term1589.getClass(), "alwaysOnTop", false);
        setField(term1589, term1589.getClass(), "ownedWindowList", null);
        setField(term1589, term1589.getClass(), "weakThis", null);
        setBooleanField(term1589, term1589.getClass(), "showWithParent", false);
        setField(term1589, term1589.getClass(), "modalBlocker", null);
        setField(term1589, term1589.getClass(), "modalExclusionType", null);
        setField(term1589, term1589.getClass(), "windowListener", null);
        setField(term1589, term1589.getClass(), "windowStateListener", null);
        setField(term1589, term1589.getClass(), "windowFocusListener", null);
        setField(term1589, term1589.getClass(), "inputContext", null);
        setField(term1589, term1589.getClass(), "inputContextLock", null);
        setField(term1589, term1589.getClass(), "focusMgr", null);
        setBooleanField(term1589, term1589.getClass(), "focusableWindowState", false);
        setBooleanField(term1589, term1589.getClass(), "autoRequestFocus", false);
        setBooleanField(term1589, term1589.getClass(), "isInShow", false);
        setFloatField(term1589, term1589.getClass(), "opacity", 0.0F);
        setField(term1589, term1589.getClass(), "shape", null);
        setBooleanField(term1589, term1589.getClass(), "isTrayIconWindow", false);
        setIntField(term1589, term1589.getClass(), "securityWarningWidth", 0);
        setIntField(term1589, term1589.getClass(), "securityWarningHeight", 0);
        setDoubleField(term1589, term1589.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term1589, term1589.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term1589, term1589.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term1589, term1589.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term1589, term1589.getClass(), "anchor", null);
        setField(term1589, term1589.getClass(), "type", null);
        setIntField(term1589, term1589.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term1589, term1589.getClass(), "locationByPlatform", false);
        setField(term1589, term1589.getClass(), "component", null);
        setField(term1589, term1589.getClass(), "layoutMgr", null);
        setField(term1589, term1589.getClass(), "dispatcher", null);
        setField(term1589, term1589.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1589, term1589.getClass(), "focusCycleRoot", false);
        setBooleanField(term1589, term1589.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1589, term1589.getClass(), "printingThreads", null);
        setBooleanField(term1589, term1589.getClass(), "printing", false);
        setField(term1589, term1589.getClass(), "containerListener", null);
        setIntField(term1589, term1589.getClass(), "listeningChildren", 0);
        setIntField(term1589, term1589.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1589, term1589.getClass(), "descendantsCount", 0);
        setField(term1589, term1589.getClass(), "preserveBackgroundColor", null);
        setIntField(term1589, term1589.getClass(), "numOfHWComponents", 0);
        setIntField(term1589, term1589.getClass(), "numOfLWComponents", 0);
        setField(term1589, term1589.getClass(), "modalComp", null);
        setField(term1589, term1589.getClass(), "modalAppContext", null);
        setIntField(term1589, term1589.getClass(), "containerSerializedDataVersion", 0);
        setField(term1589, term1589.getClass(), "peer", null);
        setField(term1589, term1589.getClass(), "parent", null);
        setField(term1589, term1589.getClass(), "appContext", null);
        setIntField(term1589, term1589.getClass(), "x", 0);
        setIntField(term1589, term1589.getClass(), "y", 0);
        setIntField(term1589, term1589.getClass(), "width", 0);
        setIntField(term1589, term1589.getClass(), "height", 0);
        setField(term1589, term1589.getClass(), "foreground", null);
        setField(term1589, term1589.getClass(), "background", null);
        setField(term1589, term1589.getClass(), "font", null);
        setField(term1589, term1589.getClass(), "peerFont", null);
        setField(term1589, term1589.getClass(), "cursor", null);
        setField(term1589, term1589.getClass(), "locale", null);
        setField(term1589, term1589.getClass(), "graphicsConfig", null);
        setField(term1589, term1589.getClass(), "bufferStrategy", null);
        setBooleanField(term1589, term1589.getClass(), "ignoreRepaint", false);
        setBooleanField(term1589, term1589.getClass(), "visible", false);
        setBooleanField(term1589, term1589.getClass(), "enabled", false);
        setBooleanField(term1589, term1589.getClass(), "valid", false);
        setField(term1589, term1589.getClass(), "dropTarget", null);
        setField(term1589, term1589.getClass(), "popups", null);
        setField(term1589, term1589.getClass(), "name", null);
        setBooleanField(term1589, term1589.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1589, term1589.getClass(), "focusable", false);
        setIntField(term1589, term1589.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1589, term1589.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1589, term1589.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1589, term1589.getClass(), "acc", null);
        setField(term1589, term1589.getClass(), "minSize", null);
        setBooleanField(term1589, term1589.getClass(), "minSizeSet", false);
        setField(term1589, term1589.getClass(), "prefSize", null);
        setBooleanField(term1589, term1589.getClass(), "prefSizeSet", false);
        setField(term1589, term1589.getClass(), "maxSize", null);
        setBooleanField(term1589, term1589.getClass(), "maxSizeSet", false);
        setField(term1589, term1589.getClass(), "componentOrientation", null);
        setBooleanField(term1589, term1589.getClass(), "newEventsOnly", false);
        setField(term1589, term1589.getClass(), "componentListener", null);
        setField(term1589, term1589.getClass(), "focusListener", null);
        setField(term1589, term1589.getClass(), "hierarchyListener", null);
        setField(term1589, term1589.getClass(), "hierarchyBoundsListener", null);
        setField(term1589, term1589.getClass(), "keyListener", null);
        setField(term1589, term1589.getClass(), "mouseListener", null);
        setField(term1589, term1589.getClass(), "mouseMotionListener", null);
        setField(term1589, term1589.getClass(), "mouseWheelListener", null);
        setField(term1589, term1589.getClass(), "inputMethodListener", null);
        setLongField(term1589, term1589.getClass(), "eventMask", 0L);
        setField(term1589, term1589.getClass(), "changeSupport", null);
        setField(term1589, term1589.getClass(), "objectLock", null);
        setBooleanField(term1589, term1589.getClass(), "isPacked", false);
        setIntField(term1589, term1589.getClass(), "boundsOp", 0);
        setField(term1589, term1589.getClass(), "compoundShape", null);
        setField(term1589, term1589.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1589, term1589.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1589, term1589.getClass(), "backgroundEraseDisabled", false);
        setField(term1589, term1589.getClass(), "eventCache", null);
        setBooleanField(term1589, term1589.getClass(), "coalescingEnabled", false);
        setBooleanField(term1589, term1589.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1589, term1589.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.user.Guest");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.awt.Component");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "signalMissingInfo", argTypes, term1589, args);
    }

};


