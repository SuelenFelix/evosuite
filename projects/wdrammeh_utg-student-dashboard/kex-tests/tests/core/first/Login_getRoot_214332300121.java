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

public class Login_getRoot_214332300121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8218;

    public Login_getRoot_214332300121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8218 = newInstance(Class.forName("core.first.Login"));
        setField(term8218, term8218.getClass(), "parent", null);
        setIntField(term8218, term8218.getClass(), "defaultCloseOperation", 0);
        setField(term8218, term8218.getClass(), "rootPane", null);
        setBooleanField(term8218, term8218.getClass(), "rootPaneCheckingEnabled", false);
        setField(term8218, term8218.getClass(), "transferHandler", null);
        setField(term8218, term8218.getClass(), "accessibleContext", null);
        setBooleanField(term8218, term8218.getClass(), "resizable", false);
        setBooleanField(term8218, term8218.getClass(), "undecorated", false);
        setBooleanField(term8218, term8218.getClass(), "initialized", false);
        setBooleanField(term8218, term8218.getClass(), "modal", false);
        setField(term8218, term8218.getClass(), "modalityType", null);
        setField(term8218, term8218.getClass(), "blockedWindows", null);
        setField(term8218, term8218.getClass(), "title", null);
        setField(term8218, term8218.getClass(), "modalFilter", null);
        setField(term8218, term8218.getClass(), "secondaryLoop", null);
        setBooleanField(term8218, term8218.getClass(), "isInHide", false);
        setBooleanField(term8218, term8218.getClass(), "isInDispose", false);
        setField(term8218, term8218.getClass(), "warningString", null);
        setField(term8218, term8218.getClass(), "icons", null);
        setField(term8218, term8218.getClass(), "temporaryLostComponent", null);
        setBooleanField(term8218, term8218.getClass(), "syncLWRequests", false);
        setBooleanField(term8218, term8218.getClass(), "beforeFirstShow", false);
        setBooleanField(term8218, term8218.getClass(), "disposing", false);
        setField(term8218, term8218.getClass(), "disposerRecord", null);
        setIntField(term8218, term8218.getClass(), "state", 0);
        setBooleanField(term8218, term8218.getClass(), "alwaysOnTop", false);
        setField(term8218, term8218.getClass(), "ownedWindowList", null);
        setField(term8218, term8218.getClass(), "weakThis", null);
        setBooleanField(term8218, term8218.getClass(), "showWithParent", false);
        setField(term8218, term8218.getClass(), "modalBlocker", null);
        setField(term8218, term8218.getClass(), "modalExclusionType", null);
        setField(term8218, term8218.getClass(), "windowListener", null);
        setField(term8218, term8218.getClass(), "windowStateListener", null);
        setField(term8218, term8218.getClass(), "windowFocusListener", null);
        setField(term8218, term8218.getClass(), "inputContext", null);
        setField(term8218, term8218.getClass(), "inputContextLock", null);
        setField(term8218, term8218.getClass(), "focusMgr", null);
        setBooleanField(term8218, term8218.getClass(), "focusableWindowState", false);
        setBooleanField(term8218, term8218.getClass(), "autoRequestFocus", false);
        setBooleanField(term8218, term8218.getClass(), "isInShow", false);
        setFloatField(term8218, term8218.getClass(), "opacity", 0.0F);
        setField(term8218, term8218.getClass(), "shape", null);
        setBooleanField(term8218, term8218.getClass(), "isTrayIconWindow", false);
        setIntField(term8218, term8218.getClass(), "securityWarningWidth", 0);
        setIntField(term8218, term8218.getClass(), "securityWarningHeight", 0);
        setDoubleField(term8218, term8218.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term8218, term8218.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term8218, term8218.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term8218, term8218.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term8218, term8218.getClass(), "anchor", null);
        setField(term8218, term8218.getClass(), "type", null);
        setIntField(term8218, term8218.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term8218, term8218.getClass(), "locationByPlatform", false);
        setField(term8218, term8218.getClass(), "component", null);
        setField(term8218, term8218.getClass(), "layoutMgr", null);
        setField(term8218, term8218.getClass(), "dispatcher", null);
        setField(term8218, term8218.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term8218, term8218.getClass(), "focusCycleRoot", false);
        setBooleanField(term8218, term8218.getClass(), "focusTraversalPolicyProvider", false);
        setField(term8218, term8218.getClass(), "printingThreads", null);
        setBooleanField(term8218, term8218.getClass(), "printing", false);
        setField(term8218, term8218.getClass(), "containerListener", null);
        setIntField(term8218, term8218.getClass(), "listeningChildren", 0);
        setIntField(term8218, term8218.getClass(), "listeningBoundsChildren", 0);
        setIntField(term8218, term8218.getClass(), "descendantsCount", 0);
        setField(term8218, term8218.getClass(), "preserveBackgroundColor", null);
        setIntField(term8218, term8218.getClass(), "numOfHWComponents", 0);
        setIntField(term8218, term8218.getClass(), "numOfLWComponents", 0);
        setField(term8218, term8218.getClass(), "modalComp", null);
        setField(term8218, term8218.getClass(), "modalAppContext", null);
        setIntField(term8218, term8218.getClass(), "containerSerializedDataVersion", 0);
        setField(term8218, term8218.getClass(), "peer", null);
        setField(term8218, term8218.getClass(), "parent", null);
        setField(term8218, term8218.getClass(), "appContext", null);
        setIntField(term8218, term8218.getClass(), "x", 0);
        setIntField(term8218, term8218.getClass(), "y", 0);
        setIntField(term8218, term8218.getClass(), "width", 0);
        setIntField(term8218, term8218.getClass(), "height", 0);
        setField(term8218, term8218.getClass(), "foreground", null);
        setField(term8218, term8218.getClass(), "background", null);
        setField(term8218, term8218.getClass(), "font", null);
        setField(term8218, term8218.getClass(), "peerFont", null);
        setField(term8218, term8218.getClass(), "cursor", null);
        setField(term8218, term8218.getClass(), "locale", null);
        setField(term8218, term8218.getClass(), "graphicsConfig", null);
        setField(term8218, term8218.getClass(), "bufferStrategy", null);
        setBooleanField(term8218, term8218.getClass(), "ignoreRepaint", false);
        setBooleanField(term8218, term8218.getClass(), "visible", false);
        setBooleanField(term8218, term8218.getClass(), "enabled", false);
        setBooleanField(term8218, term8218.getClass(), "valid", false);
        setField(term8218, term8218.getClass(), "dropTarget", null);
        setField(term8218, term8218.getClass(), "popups", null);
        setField(term8218, term8218.getClass(), "name", null);
        setBooleanField(term8218, term8218.getClass(), "nameExplicitlySet", false);
        setBooleanField(term8218, term8218.getClass(), "focusable", false);
        setIntField(term8218, term8218.getClass(), "isFocusTraversableOverridden", 0);
        setField(term8218, term8218.getClass(), "focusTraversalKeys", null);
        setBooleanField(term8218, term8218.getClass(), "focusTraversalKeysEnabled", false);
        setField(term8218, term8218.getClass(), "acc", null);
        setField(term8218, term8218.getClass(), "minSize", null);
        setBooleanField(term8218, term8218.getClass(), "minSizeSet", false);
        setField(term8218, term8218.getClass(), "prefSize", null);
        setBooleanField(term8218, term8218.getClass(), "prefSizeSet", false);
        setField(term8218, term8218.getClass(), "maxSize", null);
        setBooleanField(term8218, term8218.getClass(), "maxSizeSet", false);
        setField(term8218, term8218.getClass(), "componentOrientation", null);
        setBooleanField(term8218, term8218.getClass(), "newEventsOnly", false);
        setField(term8218, term8218.getClass(), "componentListener", null);
        setField(term8218, term8218.getClass(), "focusListener", null);
        setField(term8218, term8218.getClass(), "hierarchyListener", null);
        setField(term8218, term8218.getClass(), "hierarchyBoundsListener", null);
        setField(term8218, term8218.getClass(), "keyListener", null);
        setField(term8218, term8218.getClass(), "mouseListener", null);
        setField(term8218, term8218.getClass(), "mouseMotionListener", null);
        setField(term8218, term8218.getClass(), "mouseWheelListener", null);
        setField(term8218, term8218.getClass(), "inputMethodListener", null);
        setLongField(term8218, term8218.getClass(), "eventMask", 0L);
        setField(term8218, term8218.getClass(), "changeSupport", null);
        setField(term8218, term8218.getClass(), "objectLock", null);
        setBooleanField(term8218, term8218.getClass(), "isPacked", false);
        setIntField(term8218, term8218.getClass(), "boundsOp", 0);
        setField(term8218, term8218.getClass(), "compoundShape", null);
        setField(term8218, term8218.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term8218, term8218.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term8218, term8218.getClass(), "backgroundEraseDisabled", false);
        setField(term8218, term8218.getClass(), "eventCache", null);
        setBooleanField(term8218, term8218.getClass(), "coalescingEnabled", false);
        setBooleanField(term8218, term8218.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term8218, term8218.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.first.Login");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoot", argTypes, term8218, args);
    }

};


