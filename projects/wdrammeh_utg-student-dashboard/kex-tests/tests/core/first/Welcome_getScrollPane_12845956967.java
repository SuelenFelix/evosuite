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

public class Welcome_getScrollPane_12845956967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2704;

    public Welcome_getScrollPane_12845956967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2704 = newInstance(Class.forName("core.first.Welcome"));
        setField(term2704, term2704.getClass(), "cardLayout", null);
        setField(term2704, term2704.getClass(), "welcomeActivity", null);
        setField(term2704, term2704.getClass(), "scrollPane", null);
        setIntField(term2704, term2704.getClass(), "defaultCloseOperation", 0);
        setField(term2704, term2704.getClass(), "rootPane", null);
        setBooleanField(term2704, term2704.getClass(), "rootPaneCheckingEnabled", false);
        setField(term2704, term2704.getClass(), "transferHandler", null);
        setField(term2704, term2704.getClass(), "accessibleContext", null);
        setBooleanField(term2704, term2704.getClass(), "resizable", false);
        setBooleanField(term2704, term2704.getClass(), "undecorated", false);
        setBooleanField(term2704, term2704.getClass(), "initialized", false);
        setBooleanField(term2704, term2704.getClass(), "modal", false);
        setField(term2704, term2704.getClass(), "modalityType", null);
        setField(term2704, term2704.getClass(), "blockedWindows", null);
        setField(term2704, term2704.getClass(), "title", null);
        setField(term2704, term2704.getClass(), "modalFilter", null);
        setField(term2704, term2704.getClass(), "secondaryLoop", null);
        setBooleanField(term2704, term2704.getClass(), "isInHide", false);
        setBooleanField(term2704, term2704.getClass(), "isInDispose", false);
        setField(term2704, term2704.getClass(), "warningString", null);
        setField(term2704, term2704.getClass(), "icons", null);
        setField(term2704, term2704.getClass(), "temporaryLostComponent", null);
        setBooleanField(term2704, term2704.getClass(), "syncLWRequests", false);
        setBooleanField(term2704, term2704.getClass(), "beforeFirstShow", false);
        setBooleanField(term2704, term2704.getClass(), "disposing", false);
        setField(term2704, term2704.getClass(), "disposerRecord", null);
        setIntField(term2704, term2704.getClass(), "state", 0);
        setBooleanField(term2704, term2704.getClass(), "alwaysOnTop", false);
        setField(term2704, term2704.getClass(), "ownedWindowList", null);
        setField(term2704, term2704.getClass(), "weakThis", null);
        setBooleanField(term2704, term2704.getClass(), "showWithParent", false);
        setField(term2704, term2704.getClass(), "modalBlocker", null);
        setField(term2704, term2704.getClass(), "modalExclusionType", null);
        setField(term2704, term2704.getClass(), "windowListener", null);
        setField(term2704, term2704.getClass(), "windowStateListener", null);
        setField(term2704, term2704.getClass(), "windowFocusListener", null);
        setField(term2704, term2704.getClass(), "inputContext", null);
        setField(term2704, term2704.getClass(), "inputContextLock", null);
        setField(term2704, term2704.getClass(), "focusMgr", null);
        setBooleanField(term2704, term2704.getClass(), "focusableWindowState", false);
        setBooleanField(term2704, term2704.getClass(), "autoRequestFocus", false);
        setBooleanField(term2704, term2704.getClass(), "isInShow", false);
        setFloatField(term2704, term2704.getClass(), "opacity", 0.0F);
        setField(term2704, term2704.getClass(), "shape", null);
        setBooleanField(term2704, term2704.getClass(), "isTrayIconWindow", false);
        setIntField(term2704, term2704.getClass(), "securityWarningWidth", 0);
        setIntField(term2704, term2704.getClass(), "securityWarningHeight", 0);
        setDoubleField(term2704, term2704.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term2704, term2704.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term2704, term2704.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term2704, term2704.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term2704, term2704.getClass(), "anchor", null);
        setField(term2704, term2704.getClass(), "type", null);
        setIntField(term2704, term2704.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term2704, term2704.getClass(), "locationByPlatform", false);
        setField(term2704, term2704.getClass(), "component", null);
        setField(term2704, term2704.getClass(), "layoutMgr", null);
        setField(term2704, term2704.getClass(), "dispatcher", null);
        setField(term2704, term2704.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2704, term2704.getClass(), "focusCycleRoot", false);
        setBooleanField(term2704, term2704.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2704, term2704.getClass(), "printingThreads", null);
        setBooleanField(term2704, term2704.getClass(), "printing", false);
        setField(term2704, term2704.getClass(), "containerListener", null);
        setIntField(term2704, term2704.getClass(), "listeningChildren", 0);
        setIntField(term2704, term2704.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2704, term2704.getClass(), "descendantsCount", 0);
        setField(term2704, term2704.getClass(), "preserveBackgroundColor", null);
        setIntField(term2704, term2704.getClass(), "numOfHWComponents", 0);
        setIntField(term2704, term2704.getClass(), "numOfLWComponents", 0);
        setField(term2704, term2704.getClass(), "modalComp", null);
        setField(term2704, term2704.getClass(), "modalAppContext", null);
        setIntField(term2704, term2704.getClass(), "containerSerializedDataVersion", 0);
        setField(term2704, term2704.getClass(), "peer", null);
        setField(term2704, term2704.getClass(), "parent", null);
        setField(term2704, term2704.getClass(), "appContext", null);
        setIntField(term2704, term2704.getClass(), "x", 0);
        setIntField(term2704, term2704.getClass(), "y", 0);
        setIntField(term2704, term2704.getClass(), "width", 0);
        setIntField(term2704, term2704.getClass(), "height", 0);
        setField(term2704, term2704.getClass(), "foreground", null);
        setField(term2704, term2704.getClass(), "background", null);
        setField(term2704, term2704.getClass(), "font", null);
        setField(term2704, term2704.getClass(), "peerFont", null);
        setField(term2704, term2704.getClass(), "cursor", null);
        setField(term2704, term2704.getClass(), "locale", null);
        setField(term2704, term2704.getClass(), "graphicsConfig", null);
        setField(term2704, term2704.getClass(), "bufferStrategy", null);
        setBooleanField(term2704, term2704.getClass(), "ignoreRepaint", false);
        setBooleanField(term2704, term2704.getClass(), "visible", false);
        setBooleanField(term2704, term2704.getClass(), "enabled", false);
        setBooleanField(term2704, term2704.getClass(), "valid", false);
        setField(term2704, term2704.getClass(), "dropTarget", null);
        setField(term2704, term2704.getClass(), "popups", null);
        setField(term2704, term2704.getClass(), "name", null);
        setBooleanField(term2704, term2704.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2704, term2704.getClass(), "focusable", false);
        setIntField(term2704, term2704.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2704, term2704.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2704, term2704.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2704, term2704.getClass(), "acc", null);
        setField(term2704, term2704.getClass(), "minSize", null);
        setBooleanField(term2704, term2704.getClass(), "minSizeSet", false);
        setField(term2704, term2704.getClass(), "prefSize", null);
        setBooleanField(term2704, term2704.getClass(), "prefSizeSet", false);
        setField(term2704, term2704.getClass(), "maxSize", null);
        setBooleanField(term2704, term2704.getClass(), "maxSizeSet", false);
        setField(term2704, term2704.getClass(), "componentOrientation", null);
        setBooleanField(term2704, term2704.getClass(), "newEventsOnly", false);
        setField(term2704, term2704.getClass(), "componentListener", null);
        setField(term2704, term2704.getClass(), "focusListener", null);
        setField(term2704, term2704.getClass(), "hierarchyListener", null);
        setField(term2704, term2704.getClass(), "hierarchyBoundsListener", null);
        setField(term2704, term2704.getClass(), "keyListener", null);
        setField(term2704, term2704.getClass(), "mouseListener", null);
        setField(term2704, term2704.getClass(), "mouseMotionListener", null);
        setField(term2704, term2704.getClass(), "mouseWheelListener", null);
        setField(term2704, term2704.getClass(), "inputMethodListener", null);
        setLongField(term2704, term2704.getClass(), "eventMask", 0L);
        setField(term2704, term2704.getClass(), "changeSupport", null);
        setField(term2704, term2704.getClass(), "objectLock", null);
        setBooleanField(term2704, term2704.getClass(), "isPacked", false);
        setIntField(term2704, term2704.getClass(), "boundsOp", 0);
        setField(term2704, term2704.getClass(), "compoundShape", null);
        setField(term2704, term2704.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2704, term2704.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2704, term2704.getClass(), "backgroundEraseDisabled", false);
        setField(term2704, term2704.getClass(), "eventCache", null);
        setBooleanField(term2704, term2704.getClass(), "coalescingEnabled", false);
        setBooleanField(term2704, term2704.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2704, term2704.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.first.Welcome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScrollPane", argTypes, term2704, args);
    }

};


