package core.task.creator;

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
import static core.task.creator.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TodoCreator_listener_3012176712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45070;

    public TodoCreator_listener_3012176712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45070 = newInstance(Class.forName("core.task.creator.TodoCreator"));
        setField(term45070, term45070.getClass(), "descriptionField", null);
        setField(term45070, term45070.getClass(), "durationBox", null);
        setIntField(term45070, term45070.getClass(), "defaultCloseOperation", 0);
        setField(term45070, term45070.getClass(), "rootPane", null);
        setBooleanField(term45070, term45070.getClass(), "rootPaneCheckingEnabled", false);
        setField(term45070, term45070.getClass(), "transferHandler", null);
        setField(term45070, term45070.getClass(), "accessibleContext", null);
        setBooleanField(term45070, term45070.getClass(), "resizable", false);
        setBooleanField(term45070, term45070.getClass(), "undecorated", false);
        setBooleanField(term45070, term45070.getClass(), "initialized", false);
        setBooleanField(term45070, term45070.getClass(), "modal", false);
        setField(term45070, term45070.getClass(), "modalityType", null);
        setField(term45070, term45070.getClass(), "blockedWindows", null);
        setField(term45070, term45070.getClass(), "title", null);
        setField(term45070, term45070.getClass(), "modalFilter", null);
        setField(term45070, term45070.getClass(), "secondaryLoop", null);
        setBooleanField(term45070, term45070.getClass(), "isInHide", false);
        setBooleanField(term45070, term45070.getClass(), "isInDispose", false);
        setField(term45070, term45070.getClass(), "warningString", null);
        setField(term45070, term45070.getClass(), "icons", null);
        setField(term45070, term45070.getClass(), "temporaryLostComponent", null);
        setBooleanField(term45070, term45070.getClass(), "syncLWRequests", false);
        setBooleanField(term45070, term45070.getClass(), "beforeFirstShow", false);
        setBooleanField(term45070, term45070.getClass(), "disposing", false);
        setField(term45070, term45070.getClass(), "disposerRecord", null);
        setIntField(term45070, term45070.getClass(), "state", 0);
        setBooleanField(term45070, term45070.getClass(), "alwaysOnTop", false);
        setField(term45070, term45070.getClass(), "ownedWindowList", null);
        setField(term45070, term45070.getClass(), "weakThis", null);
        setBooleanField(term45070, term45070.getClass(), "showWithParent", false);
        setField(term45070, term45070.getClass(), "modalBlocker", null);
        setField(term45070, term45070.getClass(), "modalExclusionType", null);
        setField(term45070, term45070.getClass(), "windowListener", null);
        setField(term45070, term45070.getClass(), "windowStateListener", null);
        setField(term45070, term45070.getClass(), "windowFocusListener", null);
        setField(term45070, term45070.getClass(), "inputContext", null);
        setField(term45070, term45070.getClass(), "inputContextLock", null);
        setField(term45070, term45070.getClass(), "focusMgr", null);
        setBooleanField(term45070, term45070.getClass(), "focusableWindowState", false);
        setBooleanField(term45070, term45070.getClass(), "autoRequestFocus", false);
        setBooleanField(term45070, term45070.getClass(), "isInShow", false);
        setFloatField(term45070, term45070.getClass(), "opacity", 0.0F);
        setField(term45070, term45070.getClass(), "shape", null);
        setBooleanField(term45070, term45070.getClass(), "isTrayIconWindow", false);
        setIntField(term45070, term45070.getClass(), "securityWarningWidth", 0);
        setIntField(term45070, term45070.getClass(), "securityWarningHeight", 0);
        setDoubleField(term45070, term45070.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term45070, term45070.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term45070, term45070.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term45070, term45070.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term45070, term45070.getClass(), "anchor", null);
        setField(term45070, term45070.getClass(), "type", null);
        setIntField(term45070, term45070.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term45070, term45070.getClass(), "locationByPlatform", false);
        setField(term45070, term45070.getClass(), "component", null);
        setField(term45070, term45070.getClass(), "layoutMgr", null);
        setField(term45070, term45070.getClass(), "dispatcher", null);
        setField(term45070, term45070.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term45070, term45070.getClass(), "focusCycleRoot", false);
        setBooleanField(term45070, term45070.getClass(), "focusTraversalPolicyProvider", false);
        setField(term45070, term45070.getClass(), "printingThreads", null);
        setBooleanField(term45070, term45070.getClass(), "printing", false);
        setField(term45070, term45070.getClass(), "containerListener", null);
        setIntField(term45070, term45070.getClass(), "listeningChildren", 0);
        setIntField(term45070, term45070.getClass(), "listeningBoundsChildren", 0);
        setIntField(term45070, term45070.getClass(), "descendantsCount", 0);
        setField(term45070, term45070.getClass(), "preserveBackgroundColor", null);
        setIntField(term45070, term45070.getClass(), "numOfHWComponents", 0);
        setIntField(term45070, term45070.getClass(), "numOfLWComponents", 0);
        setField(term45070, term45070.getClass(), "modalComp", null);
        setField(term45070, term45070.getClass(), "modalAppContext", null);
        setIntField(term45070, term45070.getClass(), "containerSerializedDataVersion", 0);
        setField(term45070, term45070.getClass(), "peer", null);
        setField(term45070, term45070.getClass(), "parent", null);
        setField(term45070, term45070.getClass(), "appContext", null);
        setIntField(term45070, term45070.getClass(), "x", 0);
        setIntField(term45070, term45070.getClass(), "y", 0);
        setIntField(term45070, term45070.getClass(), "width", 0);
        setIntField(term45070, term45070.getClass(), "height", 0);
        setField(term45070, term45070.getClass(), "foreground", null);
        setField(term45070, term45070.getClass(), "background", null);
        setField(term45070, term45070.getClass(), "font", null);
        setField(term45070, term45070.getClass(), "peerFont", null);
        setField(term45070, term45070.getClass(), "cursor", null);
        setField(term45070, term45070.getClass(), "locale", null);
        setField(term45070, term45070.getClass(), "graphicsConfig", null);
        setField(term45070, term45070.getClass(), "bufferStrategy", null);
        setBooleanField(term45070, term45070.getClass(), "ignoreRepaint", false);
        setBooleanField(term45070, term45070.getClass(), "visible", false);
        setBooleanField(term45070, term45070.getClass(), "enabled", false);
        setBooleanField(term45070, term45070.getClass(), "valid", false);
        setField(term45070, term45070.getClass(), "dropTarget", null);
        setField(term45070, term45070.getClass(), "popups", null);
        setField(term45070, term45070.getClass(), "name", null);
        setBooleanField(term45070, term45070.getClass(), "nameExplicitlySet", false);
        setBooleanField(term45070, term45070.getClass(), "focusable", false);
        setIntField(term45070, term45070.getClass(), "isFocusTraversableOverridden", 0);
        setField(term45070, term45070.getClass(), "focusTraversalKeys", null);
        setBooleanField(term45070, term45070.getClass(), "focusTraversalKeysEnabled", false);
        setField(term45070, term45070.getClass(), "acc", null);
        setField(term45070, term45070.getClass(), "minSize", null);
        setBooleanField(term45070, term45070.getClass(), "minSizeSet", false);
        setField(term45070, term45070.getClass(), "prefSize", null);
        setBooleanField(term45070, term45070.getClass(), "prefSizeSet", false);
        setField(term45070, term45070.getClass(), "maxSize", null);
        setBooleanField(term45070, term45070.getClass(), "maxSizeSet", false);
        setField(term45070, term45070.getClass(), "componentOrientation", null);
        setBooleanField(term45070, term45070.getClass(), "newEventsOnly", false);
        setField(term45070, term45070.getClass(), "componentListener", null);
        setField(term45070, term45070.getClass(), "focusListener", null);
        setField(term45070, term45070.getClass(), "hierarchyListener", null);
        setField(term45070, term45070.getClass(), "hierarchyBoundsListener", null);
        setField(term45070, term45070.getClass(), "keyListener", null);
        setField(term45070, term45070.getClass(), "mouseListener", null);
        setField(term45070, term45070.getClass(), "mouseMotionListener", null);
        setField(term45070, term45070.getClass(), "mouseWheelListener", null);
        setField(term45070, term45070.getClass(), "inputMethodListener", null);
        setLongField(term45070, term45070.getClass(), "eventMask", 0L);
        setField(term45070, term45070.getClass(), "changeSupport", null);
        setField(term45070, term45070.getClass(), "objectLock", null);
        setBooleanField(term45070, term45070.getClass(), "isPacked", false);
        setIntField(term45070, term45070.getClass(), "boundsOp", 0);
        setField(term45070, term45070.getClass(), "compoundShape", null);
        setField(term45070, term45070.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term45070, term45070.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term45070, term45070.getClass(), "backgroundEraseDisabled", false);
        setField(term45070, term45070.getClass(), "eventCache", null);
        setBooleanField(term45070, term45070.getClass(), "coalescingEnabled", false);
        setBooleanField(term45070, term45070.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term45070, term45070.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.TodoCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "listener", argTypes, term45070, args);
    }

};


