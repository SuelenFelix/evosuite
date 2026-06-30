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

public class Welcome_addSelectionActivity_2198591429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3545;

    public Welcome_addSelectionActivity_2198591429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3545 = newInstance(Class.forName("core.first.Welcome"));
        setField(term3545, term3545.getClass(), "cardLayout", null);
        setField(term3545, term3545.getClass(), "welcomeActivity", null);
        setField(term3545, term3545.getClass(), "scrollPane", null);
        setIntField(term3545, term3545.getClass(), "defaultCloseOperation", 0);
        setField(term3545, term3545.getClass(), "rootPane", null);
        setBooleanField(term3545, term3545.getClass(), "rootPaneCheckingEnabled", false);
        setField(term3545, term3545.getClass(), "transferHandler", null);
        setField(term3545, term3545.getClass(), "accessibleContext", null);
        setBooleanField(term3545, term3545.getClass(), "resizable", false);
        setBooleanField(term3545, term3545.getClass(), "undecorated", false);
        setBooleanField(term3545, term3545.getClass(), "initialized", false);
        setBooleanField(term3545, term3545.getClass(), "modal", false);
        setField(term3545, term3545.getClass(), "modalityType", null);
        setField(term3545, term3545.getClass(), "blockedWindows", null);
        setField(term3545, term3545.getClass(), "title", null);
        setField(term3545, term3545.getClass(), "modalFilter", null);
        setField(term3545, term3545.getClass(), "secondaryLoop", null);
        setBooleanField(term3545, term3545.getClass(), "isInHide", false);
        setBooleanField(term3545, term3545.getClass(), "isInDispose", false);
        setField(term3545, term3545.getClass(), "warningString", null);
        setField(term3545, term3545.getClass(), "icons", null);
        setField(term3545, term3545.getClass(), "temporaryLostComponent", null);
        setBooleanField(term3545, term3545.getClass(), "syncLWRequests", false);
        setBooleanField(term3545, term3545.getClass(), "beforeFirstShow", false);
        setBooleanField(term3545, term3545.getClass(), "disposing", false);
        setField(term3545, term3545.getClass(), "disposerRecord", null);
        setIntField(term3545, term3545.getClass(), "state", 0);
        setBooleanField(term3545, term3545.getClass(), "alwaysOnTop", false);
        setField(term3545, term3545.getClass(), "ownedWindowList", null);
        setField(term3545, term3545.getClass(), "weakThis", null);
        setBooleanField(term3545, term3545.getClass(), "showWithParent", false);
        setField(term3545, term3545.getClass(), "modalBlocker", null);
        setField(term3545, term3545.getClass(), "modalExclusionType", null);
        setField(term3545, term3545.getClass(), "windowListener", null);
        setField(term3545, term3545.getClass(), "windowStateListener", null);
        setField(term3545, term3545.getClass(), "windowFocusListener", null);
        setField(term3545, term3545.getClass(), "inputContext", null);
        setField(term3545, term3545.getClass(), "inputContextLock", null);
        setField(term3545, term3545.getClass(), "focusMgr", null);
        setBooleanField(term3545, term3545.getClass(), "focusableWindowState", false);
        setBooleanField(term3545, term3545.getClass(), "autoRequestFocus", false);
        setBooleanField(term3545, term3545.getClass(), "isInShow", false);
        setFloatField(term3545, term3545.getClass(), "opacity", 0.0F);
        setField(term3545, term3545.getClass(), "shape", null);
        setBooleanField(term3545, term3545.getClass(), "isTrayIconWindow", false);
        setIntField(term3545, term3545.getClass(), "securityWarningWidth", 0);
        setIntField(term3545, term3545.getClass(), "securityWarningHeight", 0);
        setDoubleField(term3545, term3545.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term3545, term3545.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term3545, term3545.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term3545, term3545.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term3545, term3545.getClass(), "anchor", null);
        setField(term3545, term3545.getClass(), "type", null);
        setIntField(term3545, term3545.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term3545, term3545.getClass(), "locationByPlatform", false);
        setField(term3545, term3545.getClass(), "component", null);
        setField(term3545, term3545.getClass(), "layoutMgr", null);
        setField(term3545, term3545.getClass(), "dispatcher", null);
        setField(term3545, term3545.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term3545, term3545.getClass(), "focusCycleRoot", false);
        setBooleanField(term3545, term3545.getClass(), "focusTraversalPolicyProvider", false);
        setField(term3545, term3545.getClass(), "printingThreads", null);
        setBooleanField(term3545, term3545.getClass(), "printing", false);
        setField(term3545, term3545.getClass(), "containerListener", null);
        setIntField(term3545, term3545.getClass(), "listeningChildren", 0);
        setIntField(term3545, term3545.getClass(), "listeningBoundsChildren", 0);
        setIntField(term3545, term3545.getClass(), "descendantsCount", 0);
        setField(term3545, term3545.getClass(), "preserveBackgroundColor", null);
        setIntField(term3545, term3545.getClass(), "numOfHWComponents", 0);
        setIntField(term3545, term3545.getClass(), "numOfLWComponents", 0);
        setField(term3545, term3545.getClass(), "modalComp", null);
        setField(term3545, term3545.getClass(), "modalAppContext", null);
        setIntField(term3545, term3545.getClass(), "containerSerializedDataVersion", 0);
        setField(term3545, term3545.getClass(), "peer", null);
        setField(term3545, term3545.getClass(), "parent", null);
        setField(term3545, term3545.getClass(), "appContext", null);
        setIntField(term3545, term3545.getClass(), "x", 0);
        setIntField(term3545, term3545.getClass(), "y", 0);
        setIntField(term3545, term3545.getClass(), "width", 0);
        setIntField(term3545, term3545.getClass(), "height", 0);
        setField(term3545, term3545.getClass(), "foreground", null);
        setField(term3545, term3545.getClass(), "background", null);
        setField(term3545, term3545.getClass(), "font", null);
        setField(term3545, term3545.getClass(), "peerFont", null);
        setField(term3545, term3545.getClass(), "cursor", null);
        setField(term3545, term3545.getClass(), "locale", null);
        setField(term3545, term3545.getClass(), "graphicsConfig", null);
        setField(term3545, term3545.getClass(), "bufferStrategy", null);
        setBooleanField(term3545, term3545.getClass(), "ignoreRepaint", false);
        setBooleanField(term3545, term3545.getClass(), "visible", false);
        setBooleanField(term3545, term3545.getClass(), "enabled", false);
        setBooleanField(term3545, term3545.getClass(), "valid", false);
        setField(term3545, term3545.getClass(), "dropTarget", null);
        setField(term3545, term3545.getClass(), "popups", null);
        setField(term3545, term3545.getClass(), "name", null);
        setBooleanField(term3545, term3545.getClass(), "nameExplicitlySet", false);
        setBooleanField(term3545, term3545.getClass(), "focusable", false);
        setIntField(term3545, term3545.getClass(), "isFocusTraversableOverridden", 0);
        setField(term3545, term3545.getClass(), "focusTraversalKeys", null);
        setBooleanField(term3545, term3545.getClass(), "focusTraversalKeysEnabled", false);
        setField(term3545, term3545.getClass(), "acc", null);
        setField(term3545, term3545.getClass(), "minSize", null);
        setBooleanField(term3545, term3545.getClass(), "minSizeSet", false);
        setField(term3545, term3545.getClass(), "prefSize", null);
        setBooleanField(term3545, term3545.getClass(), "prefSizeSet", false);
        setField(term3545, term3545.getClass(), "maxSize", null);
        setBooleanField(term3545, term3545.getClass(), "maxSizeSet", false);
        setField(term3545, term3545.getClass(), "componentOrientation", null);
        setBooleanField(term3545, term3545.getClass(), "newEventsOnly", false);
        setField(term3545, term3545.getClass(), "componentListener", null);
        setField(term3545, term3545.getClass(), "focusListener", null);
        setField(term3545, term3545.getClass(), "hierarchyListener", null);
        setField(term3545, term3545.getClass(), "hierarchyBoundsListener", null);
        setField(term3545, term3545.getClass(), "keyListener", null);
        setField(term3545, term3545.getClass(), "mouseListener", null);
        setField(term3545, term3545.getClass(), "mouseMotionListener", null);
        setField(term3545, term3545.getClass(), "mouseWheelListener", null);
        setField(term3545, term3545.getClass(), "inputMethodListener", null);
        setLongField(term3545, term3545.getClass(), "eventMask", 0L);
        setField(term3545, term3545.getClass(), "changeSupport", null);
        setField(term3545, term3545.getClass(), "objectLock", null);
        setBooleanField(term3545, term3545.getClass(), "isPacked", false);
        setIntField(term3545, term3545.getClass(), "boundsOp", 0);
        setField(term3545, term3545.getClass(), "compoundShape", null);
        setField(term3545, term3545.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term3545, term3545.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term3545, term3545.getClass(), "backgroundEraseDisabled", false);
        setField(term3545, term3545.getClass(), "eventCache", null);
        setBooleanField(term3545, term3545.getClass(), "coalescingEnabled", false);
        setBooleanField(term3545, term3545.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term3545, term3545.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.first.Welcome");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "addSelectionActivity", argTypes, term3545, args);
    }

};


