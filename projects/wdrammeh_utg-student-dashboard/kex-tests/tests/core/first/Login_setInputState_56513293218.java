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
import java.lang.Boolean;

public class Login_setInputState_56513293218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8033;
     Object term8094;

    public Login_setInputState_56513293218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8033 = newInstance(Class.forName("core.first.Login"));
        setField(term8033, term8033.getClass(), "parent", null);
        setIntField(term8033, term8033.getClass(), "defaultCloseOperation", 0);
        setField(term8033, term8033.getClass(), "rootPane", null);
        setBooleanField(term8033, term8033.getClass(), "rootPaneCheckingEnabled", false);
        setField(term8033, term8033.getClass(), "transferHandler", null);
        setField(term8033, term8033.getClass(), "accessibleContext", null);
        setBooleanField(term8033, term8033.getClass(), "resizable", false);
        setBooleanField(term8033, term8033.getClass(), "undecorated", false);
        setBooleanField(term8033, term8033.getClass(), "initialized", false);
        setBooleanField(term8033, term8033.getClass(), "modal", false);
        setField(term8033, term8033.getClass(), "modalityType", null);
        setField(term8033, term8033.getClass(), "blockedWindows", null);
        setField(term8033, term8033.getClass(), "title", null);
        setField(term8033, term8033.getClass(), "modalFilter", null);
        setField(term8033, term8033.getClass(), "secondaryLoop", null);
        setBooleanField(term8033, term8033.getClass(), "isInHide", false);
        setBooleanField(term8033, term8033.getClass(), "isInDispose", false);
        setField(term8033, term8033.getClass(), "warningString", null);
        setField(term8033, term8033.getClass(), "icons", null);
        setField(term8033, term8033.getClass(), "temporaryLostComponent", null);
        setBooleanField(term8033, term8033.getClass(), "syncLWRequests", false);
        setBooleanField(term8033, term8033.getClass(), "beforeFirstShow", false);
        setBooleanField(term8033, term8033.getClass(), "disposing", false);
        setField(term8033, term8033.getClass(), "disposerRecord", null);
        setIntField(term8033, term8033.getClass(), "state", 0);
        setBooleanField(term8033, term8033.getClass(), "alwaysOnTop", false);
        setField(term8033, term8033.getClass(), "ownedWindowList", null);
        setField(term8033, term8033.getClass(), "weakThis", null);
        setBooleanField(term8033, term8033.getClass(), "showWithParent", false);
        setField(term8033, term8033.getClass(), "modalBlocker", null);
        setField(term8033, term8033.getClass(), "modalExclusionType", null);
        setField(term8033, term8033.getClass(), "windowListener", null);
        setField(term8033, term8033.getClass(), "windowStateListener", null);
        setField(term8033, term8033.getClass(), "windowFocusListener", null);
        setField(term8033, term8033.getClass(), "inputContext", null);
        setField(term8033, term8033.getClass(), "inputContextLock", null);
        setField(term8033, term8033.getClass(), "focusMgr", null);
        setBooleanField(term8033, term8033.getClass(), "focusableWindowState", false);
        setBooleanField(term8033, term8033.getClass(), "autoRequestFocus", false);
        setBooleanField(term8033, term8033.getClass(), "isInShow", false);
        setFloatField(term8033, term8033.getClass(), "opacity", 0.0F);
        setField(term8033, term8033.getClass(), "shape", null);
        setBooleanField(term8033, term8033.getClass(), "isTrayIconWindow", false);
        setIntField(term8033, term8033.getClass(), "securityWarningWidth", 0);
        setIntField(term8033, term8033.getClass(), "securityWarningHeight", 0);
        setDoubleField(term8033, term8033.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term8033, term8033.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term8033, term8033.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term8033, term8033.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term8033, term8033.getClass(), "anchor", null);
        setField(term8033, term8033.getClass(), "type", null);
        setIntField(term8033, term8033.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term8033, term8033.getClass(), "locationByPlatform", false);
        setField(term8033, term8033.getClass(), "component", null);
        setField(term8033, term8033.getClass(), "layoutMgr", null);
        setField(term8033, term8033.getClass(), "dispatcher", null);
        setField(term8033, term8033.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term8033, term8033.getClass(), "focusCycleRoot", false);
        setBooleanField(term8033, term8033.getClass(), "focusTraversalPolicyProvider", false);
        setField(term8033, term8033.getClass(), "printingThreads", null);
        setBooleanField(term8033, term8033.getClass(), "printing", false);
        setField(term8033, term8033.getClass(), "containerListener", null);
        setIntField(term8033, term8033.getClass(), "listeningChildren", 0);
        setIntField(term8033, term8033.getClass(), "listeningBoundsChildren", 0);
        setIntField(term8033, term8033.getClass(), "descendantsCount", 0);
        setField(term8033, term8033.getClass(), "preserveBackgroundColor", null);
        setIntField(term8033, term8033.getClass(), "numOfHWComponents", 0);
        setIntField(term8033, term8033.getClass(), "numOfLWComponents", 0);
        setField(term8033, term8033.getClass(), "modalComp", null);
        setField(term8033, term8033.getClass(), "modalAppContext", null);
        setIntField(term8033, term8033.getClass(), "containerSerializedDataVersion", 0);
        setField(term8033, term8033.getClass(), "peer", null);
        setField(term8033, term8033.getClass(), "parent", null);
        setField(term8033, term8033.getClass(), "appContext", null);
        setIntField(term8033, term8033.getClass(), "x", 0);
        setIntField(term8033, term8033.getClass(), "y", 0);
        setIntField(term8033, term8033.getClass(), "width", 0);
        setIntField(term8033, term8033.getClass(), "height", 0);
        setField(term8033, term8033.getClass(), "foreground", null);
        setField(term8033, term8033.getClass(), "background", null);
        setField(term8033, term8033.getClass(), "font", null);
        setField(term8033, term8033.getClass(), "peerFont", null);
        setField(term8033, term8033.getClass(), "cursor", null);
        setField(term8033, term8033.getClass(), "locale", null);
        setField(term8033, term8033.getClass(), "graphicsConfig", null);
        setField(term8033, term8033.getClass(), "bufferStrategy", null);
        setBooleanField(term8033, term8033.getClass(), "ignoreRepaint", false);
        setBooleanField(term8033, term8033.getClass(), "visible", false);
        setBooleanField(term8033, term8033.getClass(), "enabled", false);
        setBooleanField(term8033, term8033.getClass(), "valid", false);
        setField(term8033, term8033.getClass(), "dropTarget", null);
        setField(term8033, term8033.getClass(), "popups", null);
        setField(term8033, term8033.getClass(), "name", null);
        setBooleanField(term8033, term8033.getClass(), "nameExplicitlySet", false);
        setBooleanField(term8033, term8033.getClass(), "focusable", false);
        setIntField(term8033, term8033.getClass(), "isFocusTraversableOverridden", 0);
        setField(term8033, term8033.getClass(), "focusTraversalKeys", null);
        setBooleanField(term8033, term8033.getClass(), "focusTraversalKeysEnabled", false);
        setField(term8033, term8033.getClass(), "acc", null);
        setField(term8033, term8033.getClass(), "minSize", null);
        setBooleanField(term8033, term8033.getClass(), "minSizeSet", false);
        setField(term8033, term8033.getClass(), "prefSize", null);
        setBooleanField(term8033, term8033.getClass(), "prefSizeSet", false);
        setField(term8033, term8033.getClass(), "maxSize", null);
        setBooleanField(term8033, term8033.getClass(), "maxSizeSet", false);
        setField(term8033, term8033.getClass(), "componentOrientation", null);
        setBooleanField(term8033, term8033.getClass(), "newEventsOnly", false);
        setField(term8033, term8033.getClass(), "componentListener", null);
        setField(term8033, term8033.getClass(), "focusListener", null);
        setField(term8033, term8033.getClass(), "hierarchyListener", null);
        setField(term8033, term8033.getClass(), "hierarchyBoundsListener", null);
        setField(term8033, term8033.getClass(), "keyListener", null);
        setField(term8033, term8033.getClass(), "mouseListener", null);
        setField(term8033, term8033.getClass(), "mouseMotionListener", null);
        setField(term8033, term8033.getClass(), "mouseWheelListener", null);
        setField(term8033, term8033.getClass(), "inputMethodListener", null);
        setLongField(term8033, term8033.getClass(), "eventMask", 0L);
        setField(term8033, term8033.getClass(), "changeSupport", null);
        setField(term8033, term8033.getClass(), "objectLock", null);
        setBooleanField(term8033, term8033.getClass(), "isPacked", false);
        setIntField(term8033, term8033.getClass(), "boundsOp", 0);
        setField(term8033, term8033.getClass(), "compoundShape", null);
        setField(term8033, term8033.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term8033, term8033.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term8033, term8033.getClass(), "backgroundEraseDisabled", false);
        setField(term8033, term8033.getClass(), "eventCache", null);
        setBooleanField(term8033, term8033.getClass(), "coalescingEnabled", false);
        setBooleanField(term8033, term8033.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term8033, term8033.getClass(), "componentSerializedDataVersion", 0);
        term8094 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.first.Login");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term8094;
        callMethod(klass, "setInputState", argTypes, term8033, args);
    }

};


