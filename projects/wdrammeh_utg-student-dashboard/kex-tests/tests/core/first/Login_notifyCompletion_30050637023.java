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

public class Login_notifyCompletion_30050637023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8340;

    public Login_notifyCompletion_30050637023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8340 = newInstance(Class.forName("core.first.Login"));
        setField(term8340, term8340.getClass(), "parent", null);
        setIntField(term8340, term8340.getClass(), "defaultCloseOperation", 0);
        setField(term8340, term8340.getClass(), "rootPane", null);
        setBooleanField(term8340, term8340.getClass(), "rootPaneCheckingEnabled", false);
        setField(term8340, term8340.getClass(), "transferHandler", null);
        setField(term8340, term8340.getClass(), "accessibleContext", null);
        setBooleanField(term8340, term8340.getClass(), "resizable", false);
        setBooleanField(term8340, term8340.getClass(), "undecorated", false);
        setBooleanField(term8340, term8340.getClass(), "initialized", false);
        setBooleanField(term8340, term8340.getClass(), "modal", false);
        setField(term8340, term8340.getClass(), "modalityType", null);
        setField(term8340, term8340.getClass(), "blockedWindows", null);
        setField(term8340, term8340.getClass(), "title", null);
        setField(term8340, term8340.getClass(), "modalFilter", null);
        setField(term8340, term8340.getClass(), "secondaryLoop", null);
        setBooleanField(term8340, term8340.getClass(), "isInHide", false);
        setBooleanField(term8340, term8340.getClass(), "isInDispose", false);
        setField(term8340, term8340.getClass(), "warningString", null);
        setField(term8340, term8340.getClass(), "icons", null);
        setField(term8340, term8340.getClass(), "temporaryLostComponent", null);
        setBooleanField(term8340, term8340.getClass(), "syncLWRequests", false);
        setBooleanField(term8340, term8340.getClass(), "beforeFirstShow", false);
        setBooleanField(term8340, term8340.getClass(), "disposing", false);
        setField(term8340, term8340.getClass(), "disposerRecord", null);
        setIntField(term8340, term8340.getClass(), "state", 0);
        setBooleanField(term8340, term8340.getClass(), "alwaysOnTop", false);
        setField(term8340, term8340.getClass(), "ownedWindowList", null);
        setField(term8340, term8340.getClass(), "weakThis", null);
        setBooleanField(term8340, term8340.getClass(), "showWithParent", false);
        setField(term8340, term8340.getClass(), "modalBlocker", null);
        setField(term8340, term8340.getClass(), "modalExclusionType", null);
        setField(term8340, term8340.getClass(), "windowListener", null);
        setField(term8340, term8340.getClass(), "windowStateListener", null);
        setField(term8340, term8340.getClass(), "windowFocusListener", null);
        setField(term8340, term8340.getClass(), "inputContext", null);
        setField(term8340, term8340.getClass(), "inputContextLock", null);
        setField(term8340, term8340.getClass(), "focusMgr", null);
        setBooleanField(term8340, term8340.getClass(), "focusableWindowState", false);
        setBooleanField(term8340, term8340.getClass(), "autoRequestFocus", false);
        setBooleanField(term8340, term8340.getClass(), "isInShow", false);
        setFloatField(term8340, term8340.getClass(), "opacity", 0.0F);
        setField(term8340, term8340.getClass(), "shape", null);
        setBooleanField(term8340, term8340.getClass(), "isTrayIconWindow", false);
        setIntField(term8340, term8340.getClass(), "securityWarningWidth", 0);
        setIntField(term8340, term8340.getClass(), "securityWarningHeight", 0);
        setDoubleField(term8340, term8340.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term8340, term8340.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term8340, term8340.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term8340, term8340.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term8340, term8340.getClass(), "anchor", null);
        setField(term8340, term8340.getClass(), "type", null);
        setIntField(term8340, term8340.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term8340, term8340.getClass(), "locationByPlatform", false);
        setField(term8340, term8340.getClass(), "component", null);
        setField(term8340, term8340.getClass(), "layoutMgr", null);
        setField(term8340, term8340.getClass(), "dispatcher", null);
        setField(term8340, term8340.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term8340, term8340.getClass(), "focusCycleRoot", false);
        setBooleanField(term8340, term8340.getClass(), "focusTraversalPolicyProvider", false);
        setField(term8340, term8340.getClass(), "printingThreads", null);
        setBooleanField(term8340, term8340.getClass(), "printing", false);
        setField(term8340, term8340.getClass(), "containerListener", null);
        setIntField(term8340, term8340.getClass(), "listeningChildren", 0);
        setIntField(term8340, term8340.getClass(), "listeningBoundsChildren", 0);
        setIntField(term8340, term8340.getClass(), "descendantsCount", 0);
        setField(term8340, term8340.getClass(), "preserveBackgroundColor", null);
        setIntField(term8340, term8340.getClass(), "numOfHWComponents", 0);
        setIntField(term8340, term8340.getClass(), "numOfLWComponents", 0);
        setField(term8340, term8340.getClass(), "modalComp", null);
        setField(term8340, term8340.getClass(), "modalAppContext", null);
        setIntField(term8340, term8340.getClass(), "containerSerializedDataVersion", 0);
        setField(term8340, term8340.getClass(), "peer", null);
        setField(term8340, term8340.getClass(), "parent", null);
        setField(term8340, term8340.getClass(), "appContext", null);
        setIntField(term8340, term8340.getClass(), "x", 0);
        setIntField(term8340, term8340.getClass(), "y", 0);
        setIntField(term8340, term8340.getClass(), "width", 0);
        setIntField(term8340, term8340.getClass(), "height", 0);
        setField(term8340, term8340.getClass(), "foreground", null);
        setField(term8340, term8340.getClass(), "background", null);
        setField(term8340, term8340.getClass(), "font", null);
        setField(term8340, term8340.getClass(), "peerFont", null);
        setField(term8340, term8340.getClass(), "cursor", null);
        setField(term8340, term8340.getClass(), "locale", null);
        setField(term8340, term8340.getClass(), "graphicsConfig", null);
        setField(term8340, term8340.getClass(), "bufferStrategy", null);
        setBooleanField(term8340, term8340.getClass(), "ignoreRepaint", false);
        setBooleanField(term8340, term8340.getClass(), "visible", false);
        setBooleanField(term8340, term8340.getClass(), "enabled", false);
        setBooleanField(term8340, term8340.getClass(), "valid", false);
        setField(term8340, term8340.getClass(), "dropTarget", null);
        setField(term8340, term8340.getClass(), "popups", null);
        setField(term8340, term8340.getClass(), "name", null);
        setBooleanField(term8340, term8340.getClass(), "nameExplicitlySet", false);
        setBooleanField(term8340, term8340.getClass(), "focusable", false);
        setIntField(term8340, term8340.getClass(), "isFocusTraversableOverridden", 0);
        setField(term8340, term8340.getClass(), "focusTraversalKeys", null);
        setBooleanField(term8340, term8340.getClass(), "focusTraversalKeysEnabled", false);
        setField(term8340, term8340.getClass(), "acc", null);
        setField(term8340, term8340.getClass(), "minSize", null);
        setBooleanField(term8340, term8340.getClass(), "minSizeSet", false);
        setField(term8340, term8340.getClass(), "prefSize", null);
        setBooleanField(term8340, term8340.getClass(), "prefSizeSet", false);
        setField(term8340, term8340.getClass(), "maxSize", null);
        setBooleanField(term8340, term8340.getClass(), "maxSizeSet", false);
        setField(term8340, term8340.getClass(), "componentOrientation", null);
        setBooleanField(term8340, term8340.getClass(), "newEventsOnly", false);
        setField(term8340, term8340.getClass(), "componentListener", null);
        setField(term8340, term8340.getClass(), "focusListener", null);
        setField(term8340, term8340.getClass(), "hierarchyListener", null);
        setField(term8340, term8340.getClass(), "hierarchyBoundsListener", null);
        setField(term8340, term8340.getClass(), "keyListener", null);
        setField(term8340, term8340.getClass(), "mouseListener", null);
        setField(term8340, term8340.getClass(), "mouseMotionListener", null);
        setField(term8340, term8340.getClass(), "mouseWheelListener", null);
        setField(term8340, term8340.getClass(), "inputMethodListener", null);
        setLongField(term8340, term8340.getClass(), "eventMask", 0L);
        setField(term8340, term8340.getClass(), "changeSupport", null);
        setField(term8340, term8340.getClass(), "objectLock", null);
        setBooleanField(term8340, term8340.getClass(), "isPacked", false);
        setIntField(term8340, term8340.getClass(), "boundsOp", 0);
        setField(term8340, term8340.getClass(), "compoundShape", null);
        setField(term8340, term8340.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term8340, term8340.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term8340, term8340.getClass(), "backgroundEraseDisabled", false);
        setField(term8340, term8340.getClass(), "eventCache", null);
        setBooleanField(term8340, term8340.getClass(), "coalescingEnabled", false);
        setBooleanField(term8340, term8340.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term8340, term8340.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.first.Login");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "notifyCompletion", argTypes, term8340, args);
    }

};


