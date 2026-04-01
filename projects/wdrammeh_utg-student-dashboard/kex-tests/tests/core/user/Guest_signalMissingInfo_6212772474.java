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
     Object term85049;

    public Guest_signalMissingInfo_6212772474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85049 = newInstance(Class.forName("core.user.Guest"));
        setIntField(term85049, term85049.getClass(), "defaultCloseOperation", 0);
        setField(term85049, term85049.getClass(), "rootPane", null);
        setBooleanField(term85049, term85049.getClass(), "rootPaneCheckingEnabled", false);
        setField(term85049, term85049.getClass(), "transferHandler", null);
        setField(term85049, term85049.getClass(), "accessibleContext", null);
        setBooleanField(term85049, term85049.getClass(), "resizable", false);
        setBooleanField(term85049, term85049.getClass(), "undecorated", false);
        setBooleanField(term85049, term85049.getClass(), "initialized", false);
        setBooleanField(term85049, term85049.getClass(), "modal", false);
        setField(term85049, term85049.getClass(), "modalityType", null);
        setField(term85049, term85049.getClass(), "blockedWindows", null);
        setField(term85049, term85049.getClass(), "title", null);
        setField(term85049, term85049.getClass(), "modalFilter", null);
        setField(term85049, term85049.getClass(), "secondaryLoop", null);
        setBooleanField(term85049, term85049.getClass(), "isInHide", false);
        setBooleanField(term85049, term85049.getClass(), "isInDispose", false);
        setField(term85049, term85049.getClass(), "warningString", null);
        setField(term85049, term85049.getClass(), "icons", null);
        setField(term85049, term85049.getClass(), "temporaryLostComponent", null);
        setBooleanField(term85049, term85049.getClass(), "syncLWRequests", false);
        setBooleanField(term85049, term85049.getClass(), "beforeFirstShow", false);
        setBooleanField(term85049, term85049.getClass(), "disposing", false);
        setField(term85049, term85049.getClass(), "disposerRecord", null);
        setIntField(term85049, term85049.getClass(), "state", 0);
        setBooleanField(term85049, term85049.getClass(), "alwaysOnTop", false);
        setField(term85049, term85049.getClass(), "ownedWindowList", null);
        setField(term85049, term85049.getClass(), "weakThis", null);
        setBooleanField(term85049, term85049.getClass(), "showWithParent", false);
        setField(term85049, term85049.getClass(), "modalBlocker", null);
        setField(term85049, term85049.getClass(), "modalExclusionType", null);
        setField(term85049, term85049.getClass(), "windowListener", null);
        setField(term85049, term85049.getClass(), "windowStateListener", null);
        setField(term85049, term85049.getClass(), "windowFocusListener", null);
        setField(term85049, term85049.getClass(), "inputContext", null);
        setField(term85049, term85049.getClass(), "inputContextLock", null);
        setField(term85049, term85049.getClass(), "focusMgr", null);
        setBooleanField(term85049, term85049.getClass(), "focusableWindowState", false);
        setBooleanField(term85049, term85049.getClass(), "autoRequestFocus", false);
        setBooleanField(term85049, term85049.getClass(), "isInShow", false);
        setFloatField(term85049, term85049.getClass(), "opacity", 0.0F);
        setField(term85049, term85049.getClass(), "shape", null);
        setBooleanField(term85049, term85049.getClass(), "isTrayIconWindow", false);
        setIntField(term85049, term85049.getClass(), "securityWarningWidth", 0);
        setIntField(term85049, term85049.getClass(), "securityWarningHeight", 0);
        setDoubleField(term85049, term85049.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term85049, term85049.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term85049, term85049.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term85049, term85049.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term85049, term85049.getClass(), "anchor", null);
        setField(term85049, term85049.getClass(), "type", null);
        setIntField(term85049, term85049.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term85049, term85049.getClass(), "locationByPlatform", false);
        setField(term85049, term85049.getClass(), "component", null);
        setField(term85049, term85049.getClass(), "layoutMgr", null);
        setField(term85049, term85049.getClass(), "dispatcher", null);
        setField(term85049, term85049.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term85049, term85049.getClass(), "focusCycleRoot", false);
        setBooleanField(term85049, term85049.getClass(), "focusTraversalPolicyProvider", false);
        setField(term85049, term85049.getClass(), "printingThreads", null);
        setBooleanField(term85049, term85049.getClass(), "printing", false);
        setField(term85049, term85049.getClass(), "containerListener", null);
        setIntField(term85049, term85049.getClass(), "listeningChildren", 0);
        setIntField(term85049, term85049.getClass(), "listeningBoundsChildren", 0);
        setIntField(term85049, term85049.getClass(), "descendantsCount", 0);
        setField(term85049, term85049.getClass(), "preserveBackgroundColor", null);
        setIntField(term85049, term85049.getClass(), "numOfHWComponents", 0);
        setIntField(term85049, term85049.getClass(), "numOfLWComponents", 0);
        setField(term85049, term85049.getClass(), "modalComp", null);
        setField(term85049, term85049.getClass(), "modalAppContext", null);
        setIntField(term85049, term85049.getClass(), "containerSerializedDataVersion", 0);
        setField(term85049, term85049.getClass(), "peer", null);
        setField(term85049, term85049.getClass(), "parent", null);
        setField(term85049, term85049.getClass(), "appContext", null);
        setIntField(term85049, term85049.getClass(), "x", 0);
        setIntField(term85049, term85049.getClass(), "y", 0);
        setIntField(term85049, term85049.getClass(), "width", 0);
        setIntField(term85049, term85049.getClass(), "height", 0);
        setField(term85049, term85049.getClass(), "foreground", null);
        setField(term85049, term85049.getClass(), "background", null);
        setField(term85049, term85049.getClass(), "font", null);
        setField(term85049, term85049.getClass(), "peerFont", null);
        setField(term85049, term85049.getClass(), "cursor", null);
        setField(term85049, term85049.getClass(), "locale", null);
        setField(term85049, term85049.getClass(), "graphicsConfig", null);
        setField(term85049, term85049.getClass(), "bufferStrategy", null);
        setBooleanField(term85049, term85049.getClass(), "ignoreRepaint", false);
        setBooleanField(term85049, term85049.getClass(), "visible", false);
        setBooleanField(term85049, term85049.getClass(), "enabled", false);
        setBooleanField(term85049, term85049.getClass(), "valid", false);
        setField(term85049, term85049.getClass(), "dropTarget", null);
        setField(term85049, term85049.getClass(), "popups", null);
        setField(term85049, term85049.getClass(), "name", null);
        setBooleanField(term85049, term85049.getClass(), "nameExplicitlySet", false);
        setBooleanField(term85049, term85049.getClass(), "focusable", false);
        setIntField(term85049, term85049.getClass(), "isFocusTraversableOverridden", 0);
        setField(term85049, term85049.getClass(), "focusTraversalKeys", null);
        setBooleanField(term85049, term85049.getClass(), "focusTraversalKeysEnabled", false);
        setField(term85049, term85049.getClass(), "acc", null);
        setField(term85049, term85049.getClass(), "minSize", null);
        setBooleanField(term85049, term85049.getClass(), "minSizeSet", false);
        setField(term85049, term85049.getClass(), "prefSize", null);
        setBooleanField(term85049, term85049.getClass(), "prefSizeSet", false);
        setField(term85049, term85049.getClass(), "maxSize", null);
        setBooleanField(term85049, term85049.getClass(), "maxSizeSet", false);
        setField(term85049, term85049.getClass(), "componentOrientation", null);
        setBooleanField(term85049, term85049.getClass(), "newEventsOnly", false);
        setField(term85049, term85049.getClass(), "componentListener", null);
        setField(term85049, term85049.getClass(), "focusListener", null);
        setField(term85049, term85049.getClass(), "hierarchyListener", null);
        setField(term85049, term85049.getClass(), "hierarchyBoundsListener", null);
        setField(term85049, term85049.getClass(), "keyListener", null);
        setField(term85049, term85049.getClass(), "mouseListener", null);
        setField(term85049, term85049.getClass(), "mouseMotionListener", null);
        setField(term85049, term85049.getClass(), "mouseWheelListener", null);
        setField(term85049, term85049.getClass(), "inputMethodListener", null);
        setLongField(term85049, term85049.getClass(), "eventMask", 0L);
        setField(term85049, term85049.getClass(), "changeSupport", null);
        setField(term85049, term85049.getClass(), "objectLock", null);
        setBooleanField(term85049, term85049.getClass(), "isPacked", false);
        setIntField(term85049, term85049.getClass(), "boundsOp", 0);
        setField(term85049, term85049.getClass(), "compoundShape", null);
        setField(term85049, term85049.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term85049, term85049.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term85049, term85049.getClass(), "backgroundEraseDisabled", false);
        setField(term85049, term85049.getClass(), "eventCache", null);
        setBooleanField(term85049, term85049.getClass(), "coalescingEnabled", false);
        setBooleanField(term85049, term85049.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term85049, term85049.getClass(), "componentSerializedDataVersion", 0);
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
        callMethod(klass, "signalMissingInfo", argTypes, term85049, args);
    }

};


