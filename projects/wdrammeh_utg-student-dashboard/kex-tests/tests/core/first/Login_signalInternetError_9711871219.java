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

public class Login_signalInternetError_9711871219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8096;

    public Login_signalInternetError_9711871219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8096 = newInstance(Class.forName("core.first.Login"));
        setField(term8096, term8096.getClass(), "parent", null);
        setIntField(term8096, term8096.getClass(), "defaultCloseOperation", 0);
        setField(term8096, term8096.getClass(), "rootPane", null);
        setBooleanField(term8096, term8096.getClass(), "rootPaneCheckingEnabled", false);
        setField(term8096, term8096.getClass(), "transferHandler", null);
        setField(term8096, term8096.getClass(), "accessibleContext", null);
        setBooleanField(term8096, term8096.getClass(), "resizable", false);
        setBooleanField(term8096, term8096.getClass(), "undecorated", false);
        setBooleanField(term8096, term8096.getClass(), "initialized", false);
        setBooleanField(term8096, term8096.getClass(), "modal", false);
        setField(term8096, term8096.getClass(), "modalityType", null);
        setField(term8096, term8096.getClass(), "blockedWindows", null);
        setField(term8096, term8096.getClass(), "title", null);
        setField(term8096, term8096.getClass(), "modalFilter", null);
        setField(term8096, term8096.getClass(), "secondaryLoop", null);
        setBooleanField(term8096, term8096.getClass(), "isInHide", false);
        setBooleanField(term8096, term8096.getClass(), "isInDispose", false);
        setField(term8096, term8096.getClass(), "warningString", null);
        setField(term8096, term8096.getClass(), "icons", null);
        setField(term8096, term8096.getClass(), "temporaryLostComponent", null);
        setBooleanField(term8096, term8096.getClass(), "syncLWRequests", false);
        setBooleanField(term8096, term8096.getClass(), "beforeFirstShow", false);
        setBooleanField(term8096, term8096.getClass(), "disposing", false);
        setField(term8096, term8096.getClass(), "disposerRecord", null);
        setIntField(term8096, term8096.getClass(), "state", 0);
        setBooleanField(term8096, term8096.getClass(), "alwaysOnTop", false);
        setField(term8096, term8096.getClass(), "ownedWindowList", null);
        setField(term8096, term8096.getClass(), "weakThis", null);
        setBooleanField(term8096, term8096.getClass(), "showWithParent", false);
        setField(term8096, term8096.getClass(), "modalBlocker", null);
        setField(term8096, term8096.getClass(), "modalExclusionType", null);
        setField(term8096, term8096.getClass(), "windowListener", null);
        setField(term8096, term8096.getClass(), "windowStateListener", null);
        setField(term8096, term8096.getClass(), "windowFocusListener", null);
        setField(term8096, term8096.getClass(), "inputContext", null);
        setField(term8096, term8096.getClass(), "inputContextLock", null);
        setField(term8096, term8096.getClass(), "focusMgr", null);
        setBooleanField(term8096, term8096.getClass(), "focusableWindowState", false);
        setBooleanField(term8096, term8096.getClass(), "autoRequestFocus", false);
        setBooleanField(term8096, term8096.getClass(), "isInShow", false);
        setFloatField(term8096, term8096.getClass(), "opacity", 0.0F);
        setField(term8096, term8096.getClass(), "shape", null);
        setBooleanField(term8096, term8096.getClass(), "isTrayIconWindow", false);
        setIntField(term8096, term8096.getClass(), "securityWarningWidth", 0);
        setIntField(term8096, term8096.getClass(), "securityWarningHeight", 0);
        setDoubleField(term8096, term8096.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term8096, term8096.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term8096, term8096.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term8096, term8096.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term8096, term8096.getClass(), "anchor", null);
        setField(term8096, term8096.getClass(), "type", null);
        setIntField(term8096, term8096.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term8096, term8096.getClass(), "locationByPlatform", false);
        setField(term8096, term8096.getClass(), "component", null);
        setField(term8096, term8096.getClass(), "layoutMgr", null);
        setField(term8096, term8096.getClass(), "dispatcher", null);
        setField(term8096, term8096.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term8096, term8096.getClass(), "focusCycleRoot", false);
        setBooleanField(term8096, term8096.getClass(), "focusTraversalPolicyProvider", false);
        setField(term8096, term8096.getClass(), "printingThreads", null);
        setBooleanField(term8096, term8096.getClass(), "printing", false);
        setField(term8096, term8096.getClass(), "containerListener", null);
        setIntField(term8096, term8096.getClass(), "listeningChildren", 0);
        setIntField(term8096, term8096.getClass(), "listeningBoundsChildren", 0);
        setIntField(term8096, term8096.getClass(), "descendantsCount", 0);
        setField(term8096, term8096.getClass(), "preserveBackgroundColor", null);
        setIntField(term8096, term8096.getClass(), "numOfHWComponents", 0);
        setIntField(term8096, term8096.getClass(), "numOfLWComponents", 0);
        setField(term8096, term8096.getClass(), "modalComp", null);
        setField(term8096, term8096.getClass(), "modalAppContext", null);
        setIntField(term8096, term8096.getClass(), "containerSerializedDataVersion", 0);
        setField(term8096, term8096.getClass(), "peer", null);
        setField(term8096, term8096.getClass(), "parent", null);
        setField(term8096, term8096.getClass(), "appContext", null);
        setIntField(term8096, term8096.getClass(), "x", 0);
        setIntField(term8096, term8096.getClass(), "y", 0);
        setIntField(term8096, term8096.getClass(), "width", 0);
        setIntField(term8096, term8096.getClass(), "height", 0);
        setField(term8096, term8096.getClass(), "foreground", null);
        setField(term8096, term8096.getClass(), "background", null);
        setField(term8096, term8096.getClass(), "font", null);
        setField(term8096, term8096.getClass(), "peerFont", null);
        setField(term8096, term8096.getClass(), "cursor", null);
        setField(term8096, term8096.getClass(), "locale", null);
        setField(term8096, term8096.getClass(), "graphicsConfig", null);
        setField(term8096, term8096.getClass(), "bufferStrategy", null);
        setBooleanField(term8096, term8096.getClass(), "ignoreRepaint", false);
        setBooleanField(term8096, term8096.getClass(), "visible", false);
        setBooleanField(term8096, term8096.getClass(), "enabled", false);
        setBooleanField(term8096, term8096.getClass(), "valid", false);
        setField(term8096, term8096.getClass(), "dropTarget", null);
        setField(term8096, term8096.getClass(), "popups", null);
        setField(term8096, term8096.getClass(), "name", null);
        setBooleanField(term8096, term8096.getClass(), "nameExplicitlySet", false);
        setBooleanField(term8096, term8096.getClass(), "focusable", false);
        setIntField(term8096, term8096.getClass(), "isFocusTraversableOverridden", 0);
        setField(term8096, term8096.getClass(), "focusTraversalKeys", null);
        setBooleanField(term8096, term8096.getClass(), "focusTraversalKeysEnabled", false);
        setField(term8096, term8096.getClass(), "acc", null);
        setField(term8096, term8096.getClass(), "minSize", null);
        setBooleanField(term8096, term8096.getClass(), "minSizeSet", false);
        setField(term8096, term8096.getClass(), "prefSize", null);
        setBooleanField(term8096, term8096.getClass(), "prefSizeSet", false);
        setField(term8096, term8096.getClass(), "maxSize", null);
        setBooleanField(term8096, term8096.getClass(), "maxSizeSet", false);
        setField(term8096, term8096.getClass(), "componentOrientation", null);
        setBooleanField(term8096, term8096.getClass(), "newEventsOnly", false);
        setField(term8096, term8096.getClass(), "componentListener", null);
        setField(term8096, term8096.getClass(), "focusListener", null);
        setField(term8096, term8096.getClass(), "hierarchyListener", null);
        setField(term8096, term8096.getClass(), "hierarchyBoundsListener", null);
        setField(term8096, term8096.getClass(), "keyListener", null);
        setField(term8096, term8096.getClass(), "mouseListener", null);
        setField(term8096, term8096.getClass(), "mouseMotionListener", null);
        setField(term8096, term8096.getClass(), "mouseWheelListener", null);
        setField(term8096, term8096.getClass(), "inputMethodListener", null);
        setLongField(term8096, term8096.getClass(), "eventMask", 0L);
        setField(term8096, term8096.getClass(), "changeSupport", null);
        setField(term8096, term8096.getClass(), "objectLock", null);
        setBooleanField(term8096, term8096.getClass(), "isPacked", false);
        setIntField(term8096, term8096.getClass(), "boundsOp", 0);
        setField(term8096, term8096.getClass(), "compoundShape", null);
        setField(term8096, term8096.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term8096, term8096.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term8096, term8096.getClass(), "backgroundEraseDisabled", false);
        setField(term8096, term8096.getClass(), "eventCache", null);
        setBooleanField(term8096, term8096.getClass(), "coalescingEnabled", false);
        setBooleanField(term8096, term8096.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term8096, term8096.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.first.Login");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "signalInternetError", argTypes, term8096, args);
    }

};


