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

public class Welcome_addWelcomeActivity_3022789922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term835;

    public Welcome_addWelcomeActivity_3022789922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term835 = newInstance(Class.forName("core.first.Welcome"));
        setField(term835, term835.getClass(), "cardLayout", null);
        setField(term835, term835.getClass(), "welcomeActivity", null);
        setField(term835, term835.getClass(), "scrollPane", null);
        setIntField(term835, term835.getClass(), "defaultCloseOperation", 0);
        setField(term835, term835.getClass(), "rootPane", null);
        setBooleanField(term835, term835.getClass(), "rootPaneCheckingEnabled", false);
        setField(term835, term835.getClass(), "transferHandler", null);
        setField(term835, term835.getClass(), "accessibleContext", null);
        setBooleanField(term835, term835.getClass(), "resizable", false);
        setBooleanField(term835, term835.getClass(), "undecorated", false);
        setBooleanField(term835, term835.getClass(), "initialized", false);
        setBooleanField(term835, term835.getClass(), "modal", false);
        setField(term835, term835.getClass(), "modalityType", null);
        setField(term835, term835.getClass(), "blockedWindows", null);
        setField(term835, term835.getClass(), "title", null);
        setField(term835, term835.getClass(), "modalFilter", null);
        setField(term835, term835.getClass(), "secondaryLoop", null);
        setBooleanField(term835, term835.getClass(), "isInHide", false);
        setBooleanField(term835, term835.getClass(), "isInDispose", false);
        setField(term835, term835.getClass(), "warningString", null);
        setField(term835, term835.getClass(), "icons", null);
        setField(term835, term835.getClass(), "temporaryLostComponent", null);
        setBooleanField(term835, term835.getClass(), "syncLWRequests", false);
        setBooleanField(term835, term835.getClass(), "beforeFirstShow", false);
        setBooleanField(term835, term835.getClass(), "disposing", false);
        setField(term835, term835.getClass(), "disposerRecord", null);
        setIntField(term835, term835.getClass(), "state", 0);
        setBooleanField(term835, term835.getClass(), "alwaysOnTop", false);
        setField(term835, term835.getClass(), "ownedWindowList", null);
        setField(term835, term835.getClass(), "weakThis", null);
        setBooleanField(term835, term835.getClass(), "showWithParent", false);
        setField(term835, term835.getClass(), "modalBlocker", null);
        setField(term835, term835.getClass(), "modalExclusionType", null);
        setField(term835, term835.getClass(), "windowListener", null);
        setField(term835, term835.getClass(), "windowStateListener", null);
        setField(term835, term835.getClass(), "windowFocusListener", null);
        setField(term835, term835.getClass(), "inputContext", null);
        setField(term835, term835.getClass(), "inputContextLock", null);
        setField(term835, term835.getClass(), "focusMgr", null);
        setBooleanField(term835, term835.getClass(), "focusableWindowState", false);
        setBooleanField(term835, term835.getClass(), "autoRequestFocus", false);
        setBooleanField(term835, term835.getClass(), "isInShow", false);
        setFloatField(term835, term835.getClass(), "opacity", 0.0F);
        setField(term835, term835.getClass(), "shape", null);
        setBooleanField(term835, term835.getClass(), "isTrayIconWindow", false);
        setIntField(term835, term835.getClass(), "securityWarningWidth", 0);
        setIntField(term835, term835.getClass(), "securityWarningHeight", 0);
        setDoubleField(term835, term835.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term835, term835.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term835, term835.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term835, term835.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term835, term835.getClass(), "anchor", null);
        setField(term835, term835.getClass(), "type", null);
        setIntField(term835, term835.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term835, term835.getClass(), "locationByPlatform", false);
        setField(term835, term835.getClass(), "component", null);
        setField(term835, term835.getClass(), "layoutMgr", null);
        setField(term835, term835.getClass(), "dispatcher", null);
        setField(term835, term835.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term835, term835.getClass(), "focusCycleRoot", false);
        setBooleanField(term835, term835.getClass(), "focusTraversalPolicyProvider", false);
        setField(term835, term835.getClass(), "printingThreads", null);
        setBooleanField(term835, term835.getClass(), "printing", false);
        setField(term835, term835.getClass(), "containerListener", null);
        setIntField(term835, term835.getClass(), "listeningChildren", 0);
        setIntField(term835, term835.getClass(), "listeningBoundsChildren", 0);
        setIntField(term835, term835.getClass(), "descendantsCount", 0);
        setField(term835, term835.getClass(), "preserveBackgroundColor", null);
        setIntField(term835, term835.getClass(), "numOfHWComponents", 0);
        setIntField(term835, term835.getClass(), "numOfLWComponents", 0);
        setField(term835, term835.getClass(), "modalComp", null);
        setField(term835, term835.getClass(), "modalAppContext", null);
        setIntField(term835, term835.getClass(), "containerSerializedDataVersion", 0);
        setField(term835, term835.getClass(), "peer", null);
        setField(term835, term835.getClass(), "parent", null);
        setField(term835, term835.getClass(), "appContext", null);
        setIntField(term835, term835.getClass(), "x", 0);
        setIntField(term835, term835.getClass(), "y", 0);
        setIntField(term835, term835.getClass(), "width", 0);
        setIntField(term835, term835.getClass(), "height", 0);
        setField(term835, term835.getClass(), "foreground", null);
        setField(term835, term835.getClass(), "background", null);
        setField(term835, term835.getClass(), "font", null);
        setField(term835, term835.getClass(), "peerFont", null);
        setField(term835, term835.getClass(), "cursor", null);
        setField(term835, term835.getClass(), "locale", null);
        setField(term835, term835.getClass(), "graphicsConfig", null);
        setField(term835, term835.getClass(), "bufferStrategy", null);
        setBooleanField(term835, term835.getClass(), "ignoreRepaint", false);
        setBooleanField(term835, term835.getClass(), "visible", false);
        setBooleanField(term835, term835.getClass(), "enabled", false);
        setBooleanField(term835, term835.getClass(), "valid", false);
        setField(term835, term835.getClass(), "dropTarget", null);
        setField(term835, term835.getClass(), "popups", null);
        setField(term835, term835.getClass(), "name", null);
        setBooleanField(term835, term835.getClass(), "nameExplicitlySet", false);
        setBooleanField(term835, term835.getClass(), "focusable", false);
        setIntField(term835, term835.getClass(), "isFocusTraversableOverridden", 0);
        setField(term835, term835.getClass(), "focusTraversalKeys", null);
        setBooleanField(term835, term835.getClass(), "focusTraversalKeysEnabled", false);
        setField(term835, term835.getClass(), "acc", null);
        setField(term835, term835.getClass(), "minSize", null);
        setBooleanField(term835, term835.getClass(), "minSizeSet", false);
        setField(term835, term835.getClass(), "prefSize", null);
        setBooleanField(term835, term835.getClass(), "prefSizeSet", false);
        setField(term835, term835.getClass(), "maxSize", null);
        setBooleanField(term835, term835.getClass(), "maxSizeSet", false);
        setField(term835, term835.getClass(), "componentOrientation", null);
        setBooleanField(term835, term835.getClass(), "newEventsOnly", false);
        setField(term835, term835.getClass(), "componentListener", null);
        setField(term835, term835.getClass(), "focusListener", null);
        setField(term835, term835.getClass(), "hierarchyListener", null);
        setField(term835, term835.getClass(), "hierarchyBoundsListener", null);
        setField(term835, term835.getClass(), "keyListener", null);
        setField(term835, term835.getClass(), "mouseListener", null);
        setField(term835, term835.getClass(), "mouseMotionListener", null);
        setField(term835, term835.getClass(), "mouseWheelListener", null);
        setField(term835, term835.getClass(), "inputMethodListener", null);
        setLongField(term835, term835.getClass(), "eventMask", 0L);
        setField(term835, term835.getClass(), "changeSupport", null);
        setField(term835, term835.getClass(), "objectLock", null);
        setBooleanField(term835, term835.getClass(), "isPacked", false);
        setIntField(term835, term835.getClass(), "boundsOp", 0);
        setField(term835, term835.getClass(), "compoundShape", null);
        setField(term835, term835.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term835, term835.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term835, term835.getClass(), "backgroundEraseDisabled", false);
        setField(term835, term835.getClass(), "eventCache", null);
        setBooleanField(term835, term835.getClass(), "coalescingEnabled", false);
        setBooleanField(term835, term835.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term835, term835.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.first.Welcome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "addWelcomeActivity", argTypes, term835, args);
    }

};


