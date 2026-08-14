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

public class AssignmentCreator_listener_10488558218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37489;

    public AssignmentCreator_listener_10488558218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37489 = newInstance(Class.forName("core.task.creator.AssignmentCreator"));
        setField(term37489, term37489.getClass(), "nameField", null);
        setField(term37489, term37489.getClass(), "groupChoice", null);
        setField(term37489, term37489.getClass(), "questionArea", null);
        setField(term37489, term37489.getClass(), "modes", null);
        setField(term37489, term37489.getClass(), "meanValue", null);
        setField(term37489, term37489.getClass(), "dField", null);
        setField(term37489, term37489.getClass(), "mField", null);
        setField(term37489, term37489.getClass(), "yField", null);
        setIntField(term37489, term37489.getClass(), "defaultCloseOperation", 0);
        setField(term37489, term37489.getClass(), "rootPane", null);
        setBooleanField(term37489, term37489.getClass(), "rootPaneCheckingEnabled", false);
        setField(term37489, term37489.getClass(), "transferHandler", null);
        setField(term37489, term37489.getClass(), "accessibleContext", null);
        setBooleanField(term37489, term37489.getClass(), "resizable", false);
        setBooleanField(term37489, term37489.getClass(), "undecorated", false);
        setBooleanField(term37489, term37489.getClass(), "initialized", false);
        setBooleanField(term37489, term37489.getClass(), "modal", false);
        setField(term37489, term37489.getClass(), "modalityType", null);
        setField(term37489, term37489.getClass(), "blockedWindows", null);
        setField(term37489, term37489.getClass(), "title", null);
        setField(term37489, term37489.getClass(), "modalFilter", null);
        setField(term37489, term37489.getClass(), "secondaryLoop", null);
        setBooleanField(term37489, term37489.getClass(), "isInHide", false);
        setBooleanField(term37489, term37489.getClass(), "isInDispose", false);
        setField(term37489, term37489.getClass(), "warningString", null);
        setField(term37489, term37489.getClass(), "icons", null);
        setField(term37489, term37489.getClass(), "temporaryLostComponent", null);
        setBooleanField(term37489, term37489.getClass(), "syncLWRequests", false);
        setBooleanField(term37489, term37489.getClass(), "beforeFirstShow", false);
        setBooleanField(term37489, term37489.getClass(), "disposing", false);
        setField(term37489, term37489.getClass(), "disposerRecord", null);
        setIntField(term37489, term37489.getClass(), "state", 0);
        setBooleanField(term37489, term37489.getClass(), "alwaysOnTop", false);
        setField(term37489, term37489.getClass(), "ownedWindowList", null);
        setField(term37489, term37489.getClass(), "weakThis", null);
        setBooleanField(term37489, term37489.getClass(), "showWithParent", false);
        setField(term37489, term37489.getClass(), "modalBlocker", null);
        setField(term37489, term37489.getClass(), "modalExclusionType", null);
        setField(term37489, term37489.getClass(), "windowListener", null);
        setField(term37489, term37489.getClass(), "windowStateListener", null);
        setField(term37489, term37489.getClass(), "windowFocusListener", null);
        setField(term37489, term37489.getClass(), "inputContext", null);
        setField(term37489, term37489.getClass(), "inputContextLock", null);
        setField(term37489, term37489.getClass(), "focusMgr", null);
        setBooleanField(term37489, term37489.getClass(), "focusableWindowState", false);
        setBooleanField(term37489, term37489.getClass(), "autoRequestFocus", false);
        setBooleanField(term37489, term37489.getClass(), "isInShow", false);
        setFloatField(term37489, term37489.getClass(), "opacity", 0.0F);
        setField(term37489, term37489.getClass(), "shape", null);
        setBooleanField(term37489, term37489.getClass(), "isTrayIconWindow", false);
        setIntField(term37489, term37489.getClass(), "securityWarningWidth", 0);
        setIntField(term37489, term37489.getClass(), "securityWarningHeight", 0);
        setDoubleField(term37489, term37489.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term37489, term37489.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term37489, term37489.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term37489, term37489.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term37489, term37489.getClass(), "anchor", null);
        setField(term37489, term37489.getClass(), "type", null);
        setIntField(term37489, term37489.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term37489, term37489.getClass(), "locationByPlatform", false);
        setField(term37489, term37489.getClass(), "component", null);
        setField(term37489, term37489.getClass(), "layoutMgr", null);
        setField(term37489, term37489.getClass(), "dispatcher", null);
        setField(term37489, term37489.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term37489, term37489.getClass(), "focusCycleRoot", false);
        setBooleanField(term37489, term37489.getClass(), "focusTraversalPolicyProvider", false);
        setField(term37489, term37489.getClass(), "printingThreads", null);
        setBooleanField(term37489, term37489.getClass(), "printing", false);
        setField(term37489, term37489.getClass(), "containerListener", null);
        setIntField(term37489, term37489.getClass(), "listeningChildren", 0);
        setIntField(term37489, term37489.getClass(), "listeningBoundsChildren", 0);
        setIntField(term37489, term37489.getClass(), "descendantsCount", 0);
        setField(term37489, term37489.getClass(), "preserveBackgroundColor", null);
        setIntField(term37489, term37489.getClass(), "numOfHWComponents", 0);
        setIntField(term37489, term37489.getClass(), "numOfLWComponents", 0);
        setField(term37489, term37489.getClass(), "modalComp", null);
        setField(term37489, term37489.getClass(), "modalAppContext", null);
        setIntField(term37489, term37489.getClass(), "containerSerializedDataVersion", 0);
        setField(term37489, term37489.getClass(), "peer", null);
        setField(term37489, term37489.getClass(), "parent", null);
        setField(term37489, term37489.getClass(), "appContext", null);
        setIntField(term37489, term37489.getClass(), "x", 0);
        setIntField(term37489, term37489.getClass(), "y", 0);
        setIntField(term37489, term37489.getClass(), "width", 0);
        setIntField(term37489, term37489.getClass(), "height", 0);
        setField(term37489, term37489.getClass(), "foreground", null);
        setField(term37489, term37489.getClass(), "background", null);
        setField(term37489, term37489.getClass(), "font", null);
        setField(term37489, term37489.getClass(), "peerFont", null);
        setField(term37489, term37489.getClass(), "cursor", null);
        setField(term37489, term37489.getClass(), "locale", null);
        setField(term37489, term37489.getClass(), "graphicsConfig", null);
        setField(term37489, term37489.getClass(), "bufferStrategy", null);
        setBooleanField(term37489, term37489.getClass(), "ignoreRepaint", false);
        setBooleanField(term37489, term37489.getClass(), "visible", false);
        setBooleanField(term37489, term37489.getClass(), "enabled", false);
        setBooleanField(term37489, term37489.getClass(), "valid", false);
        setField(term37489, term37489.getClass(), "dropTarget", null);
        setField(term37489, term37489.getClass(), "popups", null);
        setField(term37489, term37489.getClass(), "name", null);
        setBooleanField(term37489, term37489.getClass(), "nameExplicitlySet", false);
        setBooleanField(term37489, term37489.getClass(), "focusable", false);
        setIntField(term37489, term37489.getClass(), "isFocusTraversableOverridden", 0);
        setField(term37489, term37489.getClass(), "focusTraversalKeys", null);
        setBooleanField(term37489, term37489.getClass(), "focusTraversalKeysEnabled", false);
        setField(term37489, term37489.getClass(), "acc", null);
        setField(term37489, term37489.getClass(), "minSize", null);
        setBooleanField(term37489, term37489.getClass(), "minSizeSet", false);
        setField(term37489, term37489.getClass(), "prefSize", null);
        setBooleanField(term37489, term37489.getClass(), "prefSizeSet", false);
        setField(term37489, term37489.getClass(), "maxSize", null);
        setBooleanField(term37489, term37489.getClass(), "maxSizeSet", false);
        setField(term37489, term37489.getClass(), "componentOrientation", null);
        setBooleanField(term37489, term37489.getClass(), "newEventsOnly", false);
        setField(term37489, term37489.getClass(), "componentListener", null);
        setField(term37489, term37489.getClass(), "focusListener", null);
        setField(term37489, term37489.getClass(), "hierarchyListener", null);
        setField(term37489, term37489.getClass(), "hierarchyBoundsListener", null);
        setField(term37489, term37489.getClass(), "keyListener", null);
        setField(term37489, term37489.getClass(), "mouseListener", null);
        setField(term37489, term37489.getClass(), "mouseMotionListener", null);
        setField(term37489, term37489.getClass(), "mouseWheelListener", null);
        setField(term37489, term37489.getClass(), "inputMethodListener", null);
        setLongField(term37489, term37489.getClass(), "eventMask", 0L);
        setField(term37489, term37489.getClass(), "changeSupport", null);
        setField(term37489, term37489.getClass(), "objectLock", null);
        setBooleanField(term37489, term37489.getClass(), "isPacked", false);
        setIntField(term37489, term37489.getClass(), "boundsOp", 0);
        setField(term37489, term37489.getClass(), "compoundShape", null);
        setField(term37489, term37489.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term37489, term37489.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term37489, term37489.getClass(), "backgroundEraseDisabled", false);
        setField(term37489, term37489.getClass(), "eventCache", null);
        setBooleanField(term37489, term37489.getClass(), "coalescingEnabled", false);
        setBooleanField(term37489, term37489.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term37489, term37489.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.AssignmentCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "listener", argTypes, term37489, args);
    }

};


