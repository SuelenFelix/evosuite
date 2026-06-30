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

public class Login_appendToStatus_150082272315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7850;

    public Login_appendToStatus_150082272315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7850 = newInstance(Class.forName("core.first.Login"));
        setField(term7850, term7850.getClass(), "parent", null);
        setIntField(term7850, term7850.getClass(), "defaultCloseOperation", 0);
        setField(term7850, term7850.getClass(), "rootPane", null);
        setBooleanField(term7850, term7850.getClass(), "rootPaneCheckingEnabled", false);
        setField(term7850, term7850.getClass(), "transferHandler", null);
        setField(term7850, term7850.getClass(), "accessibleContext", null);
        setBooleanField(term7850, term7850.getClass(), "resizable", false);
        setBooleanField(term7850, term7850.getClass(), "undecorated", false);
        setBooleanField(term7850, term7850.getClass(), "initialized", false);
        setBooleanField(term7850, term7850.getClass(), "modal", false);
        setField(term7850, term7850.getClass(), "modalityType", null);
        setField(term7850, term7850.getClass(), "blockedWindows", null);
        setField(term7850, term7850.getClass(), "title", null);
        setField(term7850, term7850.getClass(), "modalFilter", null);
        setField(term7850, term7850.getClass(), "secondaryLoop", null);
        setBooleanField(term7850, term7850.getClass(), "isInHide", false);
        setBooleanField(term7850, term7850.getClass(), "isInDispose", false);
        setField(term7850, term7850.getClass(), "warningString", null);
        setField(term7850, term7850.getClass(), "icons", null);
        setField(term7850, term7850.getClass(), "temporaryLostComponent", null);
        setBooleanField(term7850, term7850.getClass(), "syncLWRequests", false);
        setBooleanField(term7850, term7850.getClass(), "beforeFirstShow", false);
        setBooleanField(term7850, term7850.getClass(), "disposing", false);
        setField(term7850, term7850.getClass(), "disposerRecord", null);
        setIntField(term7850, term7850.getClass(), "state", 0);
        setBooleanField(term7850, term7850.getClass(), "alwaysOnTop", false);
        setField(term7850, term7850.getClass(), "ownedWindowList", null);
        setField(term7850, term7850.getClass(), "weakThis", null);
        setBooleanField(term7850, term7850.getClass(), "showWithParent", false);
        setField(term7850, term7850.getClass(), "modalBlocker", null);
        setField(term7850, term7850.getClass(), "modalExclusionType", null);
        setField(term7850, term7850.getClass(), "windowListener", null);
        setField(term7850, term7850.getClass(), "windowStateListener", null);
        setField(term7850, term7850.getClass(), "windowFocusListener", null);
        setField(term7850, term7850.getClass(), "inputContext", null);
        setField(term7850, term7850.getClass(), "inputContextLock", null);
        setField(term7850, term7850.getClass(), "focusMgr", null);
        setBooleanField(term7850, term7850.getClass(), "focusableWindowState", false);
        setBooleanField(term7850, term7850.getClass(), "autoRequestFocus", false);
        setBooleanField(term7850, term7850.getClass(), "isInShow", false);
        setFloatField(term7850, term7850.getClass(), "opacity", 0.0F);
        setField(term7850, term7850.getClass(), "shape", null);
        setBooleanField(term7850, term7850.getClass(), "isTrayIconWindow", false);
        setIntField(term7850, term7850.getClass(), "securityWarningWidth", 0);
        setIntField(term7850, term7850.getClass(), "securityWarningHeight", 0);
        setDoubleField(term7850, term7850.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term7850, term7850.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term7850, term7850.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term7850, term7850.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term7850, term7850.getClass(), "anchor", null);
        setField(term7850, term7850.getClass(), "type", null);
        setIntField(term7850, term7850.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term7850, term7850.getClass(), "locationByPlatform", false);
        setField(term7850, term7850.getClass(), "component", null);
        setField(term7850, term7850.getClass(), "layoutMgr", null);
        setField(term7850, term7850.getClass(), "dispatcher", null);
        setField(term7850, term7850.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term7850, term7850.getClass(), "focusCycleRoot", false);
        setBooleanField(term7850, term7850.getClass(), "focusTraversalPolicyProvider", false);
        setField(term7850, term7850.getClass(), "printingThreads", null);
        setBooleanField(term7850, term7850.getClass(), "printing", false);
        setField(term7850, term7850.getClass(), "containerListener", null);
        setIntField(term7850, term7850.getClass(), "listeningChildren", 0);
        setIntField(term7850, term7850.getClass(), "listeningBoundsChildren", 0);
        setIntField(term7850, term7850.getClass(), "descendantsCount", 0);
        setField(term7850, term7850.getClass(), "preserveBackgroundColor", null);
        setIntField(term7850, term7850.getClass(), "numOfHWComponents", 0);
        setIntField(term7850, term7850.getClass(), "numOfLWComponents", 0);
        setField(term7850, term7850.getClass(), "modalComp", null);
        setField(term7850, term7850.getClass(), "modalAppContext", null);
        setIntField(term7850, term7850.getClass(), "containerSerializedDataVersion", 0);
        setField(term7850, term7850.getClass(), "peer", null);
        setField(term7850, term7850.getClass(), "parent", null);
        setField(term7850, term7850.getClass(), "appContext", null);
        setIntField(term7850, term7850.getClass(), "x", 0);
        setIntField(term7850, term7850.getClass(), "y", 0);
        setIntField(term7850, term7850.getClass(), "width", 0);
        setIntField(term7850, term7850.getClass(), "height", 0);
        setField(term7850, term7850.getClass(), "foreground", null);
        setField(term7850, term7850.getClass(), "background", null);
        setField(term7850, term7850.getClass(), "font", null);
        setField(term7850, term7850.getClass(), "peerFont", null);
        setField(term7850, term7850.getClass(), "cursor", null);
        setField(term7850, term7850.getClass(), "locale", null);
        setField(term7850, term7850.getClass(), "graphicsConfig", null);
        setField(term7850, term7850.getClass(), "bufferStrategy", null);
        setBooleanField(term7850, term7850.getClass(), "ignoreRepaint", false);
        setBooleanField(term7850, term7850.getClass(), "visible", false);
        setBooleanField(term7850, term7850.getClass(), "enabled", false);
        setBooleanField(term7850, term7850.getClass(), "valid", false);
        setField(term7850, term7850.getClass(), "dropTarget", null);
        setField(term7850, term7850.getClass(), "popups", null);
        setField(term7850, term7850.getClass(), "name", null);
        setBooleanField(term7850, term7850.getClass(), "nameExplicitlySet", false);
        setBooleanField(term7850, term7850.getClass(), "focusable", false);
        setIntField(term7850, term7850.getClass(), "isFocusTraversableOverridden", 0);
        setField(term7850, term7850.getClass(), "focusTraversalKeys", null);
        setBooleanField(term7850, term7850.getClass(), "focusTraversalKeysEnabled", false);
        setField(term7850, term7850.getClass(), "acc", null);
        setField(term7850, term7850.getClass(), "minSize", null);
        setBooleanField(term7850, term7850.getClass(), "minSizeSet", false);
        setField(term7850, term7850.getClass(), "prefSize", null);
        setBooleanField(term7850, term7850.getClass(), "prefSizeSet", false);
        setField(term7850, term7850.getClass(), "maxSize", null);
        setBooleanField(term7850, term7850.getClass(), "maxSizeSet", false);
        setField(term7850, term7850.getClass(), "componentOrientation", null);
        setBooleanField(term7850, term7850.getClass(), "newEventsOnly", false);
        setField(term7850, term7850.getClass(), "componentListener", null);
        setField(term7850, term7850.getClass(), "focusListener", null);
        setField(term7850, term7850.getClass(), "hierarchyListener", null);
        setField(term7850, term7850.getClass(), "hierarchyBoundsListener", null);
        setField(term7850, term7850.getClass(), "keyListener", null);
        setField(term7850, term7850.getClass(), "mouseListener", null);
        setField(term7850, term7850.getClass(), "mouseMotionListener", null);
        setField(term7850, term7850.getClass(), "mouseWheelListener", null);
        setField(term7850, term7850.getClass(), "inputMethodListener", null);
        setLongField(term7850, term7850.getClass(), "eventMask", 0L);
        setField(term7850, term7850.getClass(), "changeSupport", null);
        setField(term7850, term7850.getClass(), "objectLock", null);
        setBooleanField(term7850, term7850.getClass(), "isPacked", false);
        setIntField(term7850, term7850.getClass(), "boundsOp", 0);
        setField(term7850, term7850.getClass(), "compoundShape", null);
        setField(term7850, term7850.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term7850, term7850.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term7850, term7850.getClass(), "backgroundEraseDisabled", false);
        setField(term7850, term7850.getClass(), "eventCache", null);
        setBooleanField(term7850, term7850.getClass(), "coalescingEnabled", false);
        setBooleanField(term7850, term7850.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term7850, term7850.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.first.Login");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "appendToStatus", argTypes, term7850, args);
    }

};


