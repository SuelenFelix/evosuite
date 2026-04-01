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

public class Welcome_head_5748573034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1743;

    public Welcome_head_5748573034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1743 = newInstance(Class.forName("core.first.Welcome"));
        setField(term1743, term1743.getClass(), "cardLayout", null);
        setField(term1743, term1743.getClass(), "welcomeActivity", null);
        setField(term1743, term1743.getClass(), "scrollPane", null);
        setIntField(term1743, term1743.getClass(), "defaultCloseOperation", 0);
        setField(term1743, term1743.getClass(), "rootPane", null);
        setBooleanField(term1743, term1743.getClass(), "rootPaneCheckingEnabled", false);
        setField(term1743, term1743.getClass(), "transferHandler", null);
        setField(term1743, term1743.getClass(), "accessibleContext", null);
        setBooleanField(term1743, term1743.getClass(), "resizable", false);
        setBooleanField(term1743, term1743.getClass(), "undecorated", false);
        setBooleanField(term1743, term1743.getClass(), "initialized", false);
        setBooleanField(term1743, term1743.getClass(), "modal", false);
        setField(term1743, term1743.getClass(), "modalityType", null);
        setField(term1743, term1743.getClass(), "blockedWindows", null);
        setField(term1743, term1743.getClass(), "title", null);
        setField(term1743, term1743.getClass(), "modalFilter", null);
        setField(term1743, term1743.getClass(), "secondaryLoop", null);
        setBooleanField(term1743, term1743.getClass(), "isInHide", false);
        setBooleanField(term1743, term1743.getClass(), "isInDispose", false);
        setField(term1743, term1743.getClass(), "warningString", null);
        setField(term1743, term1743.getClass(), "icons", null);
        setField(term1743, term1743.getClass(), "temporaryLostComponent", null);
        setBooleanField(term1743, term1743.getClass(), "syncLWRequests", false);
        setBooleanField(term1743, term1743.getClass(), "beforeFirstShow", false);
        setBooleanField(term1743, term1743.getClass(), "disposing", false);
        setField(term1743, term1743.getClass(), "disposerRecord", null);
        setIntField(term1743, term1743.getClass(), "state", 0);
        setBooleanField(term1743, term1743.getClass(), "alwaysOnTop", false);
        setField(term1743, term1743.getClass(), "ownedWindowList", null);
        setField(term1743, term1743.getClass(), "weakThis", null);
        setBooleanField(term1743, term1743.getClass(), "showWithParent", false);
        setField(term1743, term1743.getClass(), "modalBlocker", null);
        setField(term1743, term1743.getClass(), "modalExclusionType", null);
        setField(term1743, term1743.getClass(), "windowListener", null);
        setField(term1743, term1743.getClass(), "windowStateListener", null);
        setField(term1743, term1743.getClass(), "windowFocusListener", null);
        setField(term1743, term1743.getClass(), "inputContext", null);
        setField(term1743, term1743.getClass(), "inputContextLock", null);
        setField(term1743, term1743.getClass(), "focusMgr", null);
        setBooleanField(term1743, term1743.getClass(), "focusableWindowState", false);
        setBooleanField(term1743, term1743.getClass(), "autoRequestFocus", false);
        setBooleanField(term1743, term1743.getClass(), "isInShow", false);
        setFloatField(term1743, term1743.getClass(), "opacity", 0.0F);
        setField(term1743, term1743.getClass(), "shape", null);
        setBooleanField(term1743, term1743.getClass(), "isTrayIconWindow", false);
        setIntField(term1743, term1743.getClass(), "securityWarningWidth", 0);
        setIntField(term1743, term1743.getClass(), "securityWarningHeight", 0);
        setDoubleField(term1743, term1743.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term1743, term1743.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term1743, term1743.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term1743, term1743.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term1743, term1743.getClass(), "anchor", null);
        setField(term1743, term1743.getClass(), "type", null);
        setIntField(term1743, term1743.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term1743, term1743.getClass(), "locationByPlatform", false);
        setField(term1743, term1743.getClass(), "component", null);
        setField(term1743, term1743.getClass(), "layoutMgr", null);
        setField(term1743, term1743.getClass(), "dispatcher", null);
        setField(term1743, term1743.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1743, term1743.getClass(), "focusCycleRoot", false);
        setBooleanField(term1743, term1743.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1743, term1743.getClass(), "printingThreads", null);
        setBooleanField(term1743, term1743.getClass(), "printing", false);
        setField(term1743, term1743.getClass(), "containerListener", null);
        setIntField(term1743, term1743.getClass(), "listeningChildren", 0);
        setIntField(term1743, term1743.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1743, term1743.getClass(), "descendantsCount", 0);
        setField(term1743, term1743.getClass(), "preserveBackgroundColor", null);
        setIntField(term1743, term1743.getClass(), "numOfHWComponents", 0);
        setIntField(term1743, term1743.getClass(), "numOfLWComponents", 0);
        setField(term1743, term1743.getClass(), "modalComp", null);
        setField(term1743, term1743.getClass(), "modalAppContext", null);
        setIntField(term1743, term1743.getClass(), "containerSerializedDataVersion", 0);
        setField(term1743, term1743.getClass(), "peer", null);
        setField(term1743, term1743.getClass(), "parent", null);
        setField(term1743, term1743.getClass(), "appContext", null);
        setIntField(term1743, term1743.getClass(), "x", 0);
        setIntField(term1743, term1743.getClass(), "y", 0);
        setIntField(term1743, term1743.getClass(), "width", 0);
        setIntField(term1743, term1743.getClass(), "height", 0);
        setField(term1743, term1743.getClass(), "foreground", null);
        setField(term1743, term1743.getClass(), "background", null);
        setField(term1743, term1743.getClass(), "font", null);
        setField(term1743, term1743.getClass(), "peerFont", null);
        setField(term1743, term1743.getClass(), "cursor", null);
        setField(term1743, term1743.getClass(), "locale", null);
        setField(term1743, term1743.getClass(), "graphicsConfig", null);
        setField(term1743, term1743.getClass(), "bufferStrategy", null);
        setBooleanField(term1743, term1743.getClass(), "ignoreRepaint", false);
        setBooleanField(term1743, term1743.getClass(), "visible", false);
        setBooleanField(term1743, term1743.getClass(), "enabled", false);
        setBooleanField(term1743, term1743.getClass(), "valid", false);
        setField(term1743, term1743.getClass(), "dropTarget", null);
        setField(term1743, term1743.getClass(), "popups", null);
        setField(term1743, term1743.getClass(), "name", null);
        setBooleanField(term1743, term1743.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1743, term1743.getClass(), "focusable", false);
        setIntField(term1743, term1743.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1743, term1743.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1743, term1743.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1743, term1743.getClass(), "acc", null);
        setField(term1743, term1743.getClass(), "minSize", null);
        setBooleanField(term1743, term1743.getClass(), "minSizeSet", false);
        setField(term1743, term1743.getClass(), "prefSize", null);
        setBooleanField(term1743, term1743.getClass(), "prefSizeSet", false);
        setField(term1743, term1743.getClass(), "maxSize", null);
        setBooleanField(term1743, term1743.getClass(), "maxSizeSet", false);
        setField(term1743, term1743.getClass(), "componentOrientation", null);
        setBooleanField(term1743, term1743.getClass(), "newEventsOnly", false);
        setField(term1743, term1743.getClass(), "componentListener", null);
        setField(term1743, term1743.getClass(), "focusListener", null);
        setField(term1743, term1743.getClass(), "hierarchyListener", null);
        setField(term1743, term1743.getClass(), "hierarchyBoundsListener", null);
        setField(term1743, term1743.getClass(), "keyListener", null);
        setField(term1743, term1743.getClass(), "mouseListener", null);
        setField(term1743, term1743.getClass(), "mouseMotionListener", null);
        setField(term1743, term1743.getClass(), "mouseWheelListener", null);
        setField(term1743, term1743.getClass(), "inputMethodListener", null);
        setLongField(term1743, term1743.getClass(), "eventMask", 0L);
        setField(term1743, term1743.getClass(), "changeSupport", null);
        setField(term1743, term1743.getClass(), "objectLock", null);
        setBooleanField(term1743, term1743.getClass(), "isPacked", false);
        setIntField(term1743, term1743.getClass(), "boundsOp", 0);
        setField(term1743, term1743.getClass(), "compoundShape", null);
        setField(term1743, term1743.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1743, term1743.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1743, term1743.getClass(), "backgroundEraseDisabled", false);
        setField(term1743, term1743.getClass(), "eventCache", null);
        setBooleanField(term1743, term1743.getClass(), "coalescingEnabled", false);
        setBooleanField(term1743, term1743.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1743, term1743.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.first.Welcome");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "head", argTypes, term1743, args);
    }

};


