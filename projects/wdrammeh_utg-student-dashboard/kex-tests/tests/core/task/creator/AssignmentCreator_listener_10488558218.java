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
     Object term37487;

    public AssignmentCreator_listener_10488558218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37487 = newInstance(Class.forName("core.task.creator.AssignmentCreator"));
        setField(term37487, term37487.getClass(), "nameField", null);
        setField(term37487, term37487.getClass(), "groupChoice", null);
        setField(term37487, term37487.getClass(), "questionArea", null);
        setField(term37487, term37487.getClass(), "modes", null);
        setField(term37487, term37487.getClass(), "meanValue", null);
        setField(term37487, term37487.getClass(), "dField", null);
        setField(term37487, term37487.getClass(), "mField", null);
        setField(term37487, term37487.getClass(), "yField", null);
        setIntField(term37487, term37487.getClass(), "defaultCloseOperation", 0);
        setField(term37487, term37487.getClass(), "rootPane", null);
        setBooleanField(term37487, term37487.getClass(), "rootPaneCheckingEnabled", false);
        setField(term37487, term37487.getClass(), "transferHandler", null);
        setField(term37487, term37487.getClass(), "accessibleContext", null);
        setBooleanField(term37487, term37487.getClass(), "resizable", false);
        setBooleanField(term37487, term37487.getClass(), "undecorated", false);
        setBooleanField(term37487, term37487.getClass(), "initialized", false);
        setBooleanField(term37487, term37487.getClass(), "modal", false);
        setField(term37487, term37487.getClass(), "modalityType", null);
        setField(term37487, term37487.getClass(), "blockedWindows", null);
        setField(term37487, term37487.getClass(), "title", null);
        setField(term37487, term37487.getClass(), "modalFilter", null);
        setField(term37487, term37487.getClass(), "secondaryLoop", null);
        setBooleanField(term37487, term37487.getClass(), "isInHide", false);
        setBooleanField(term37487, term37487.getClass(), "isInDispose", false);
        setField(term37487, term37487.getClass(), "warningString", null);
        setField(term37487, term37487.getClass(), "icons", null);
        setField(term37487, term37487.getClass(), "temporaryLostComponent", null);
        setBooleanField(term37487, term37487.getClass(), "syncLWRequests", false);
        setBooleanField(term37487, term37487.getClass(), "beforeFirstShow", false);
        setBooleanField(term37487, term37487.getClass(), "disposing", false);
        setField(term37487, term37487.getClass(), "disposerRecord", null);
        setIntField(term37487, term37487.getClass(), "state", 0);
        setBooleanField(term37487, term37487.getClass(), "alwaysOnTop", false);
        setField(term37487, term37487.getClass(), "ownedWindowList", null);
        setField(term37487, term37487.getClass(), "weakThis", null);
        setBooleanField(term37487, term37487.getClass(), "showWithParent", false);
        setField(term37487, term37487.getClass(), "modalBlocker", null);
        setField(term37487, term37487.getClass(), "modalExclusionType", null);
        setField(term37487, term37487.getClass(), "windowListener", null);
        setField(term37487, term37487.getClass(), "windowStateListener", null);
        setField(term37487, term37487.getClass(), "windowFocusListener", null);
        setField(term37487, term37487.getClass(), "inputContext", null);
        setField(term37487, term37487.getClass(), "inputContextLock", null);
        setField(term37487, term37487.getClass(), "focusMgr", null);
        setBooleanField(term37487, term37487.getClass(), "focusableWindowState", false);
        setBooleanField(term37487, term37487.getClass(), "autoRequestFocus", false);
        setBooleanField(term37487, term37487.getClass(), "isInShow", false);
        setFloatField(term37487, term37487.getClass(), "opacity", 0.0F);
        setField(term37487, term37487.getClass(), "shape", null);
        setBooleanField(term37487, term37487.getClass(), "isTrayIconWindow", false);
        setIntField(term37487, term37487.getClass(), "securityWarningWidth", 0);
        setIntField(term37487, term37487.getClass(), "securityWarningHeight", 0);
        setDoubleField(term37487, term37487.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term37487, term37487.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term37487, term37487.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term37487, term37487.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term37487, term37487.getClass(), "anchor", null);
        setField(term37487, term37487.getClass(), "type", null);
        setIntField(term37487, term37487.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term37487, term37487.getClass(), "locationByPlatform", false);
        setField(term37487, term37487.getClass(), "component", null);
        setField(term37487, term37487.getClass(), "layoutMgr", null);
        setField(term37487, term37487.getClass(), "dispatcher", null);
        setField(term37487, term37487.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term37487, term37487.getClass(), "focusCycleRoot", false);
        setBooleanField(term37487, term37487.getClass(), "focusTraversalPolicyProvider", false);
        setField(term37487, term37487.getClass(), "printingThreads", null);
        setBooleanField(term37487, term37487.getClass(), "printing", false);
        setField(term37487, term37487.getClass(), "containerListener", null);
        setIntField(term37487, term37487.getClass(), "listeningChildren", 0);
        setIntField(term37487, term37487.getClass(), "listeningBoundsChildren", 0);
        setIntField(term37487, term37487.getClass(), "descendantsCount", 0);
        setField(term37487, term37487.getClass(), "preserveBackgroundColor", null);
        setIntField(term37487, term37487.getClass(), "numOfHWComponents", 0);
        setIntField(term37487, term37487.getClass(), "numOfLWComponents", 0);
        setField(term37487, term37487.getClass(), "modalComp", null);
        setField(term37487, term37487.getClass(), "modalAppContext", null);
        setIntField(term37487, term37487.getClass(), "containerSerializedDataVersion", 0);
        setField(term37487, term37487.getClass(), "peer", null);
        setField(term37487, term37487.getClass(), "parent", null);
        setField(term37487, term37487.getClass(), "appContext", null);
        setIntField(term37487, term37487.getClass(), "x", 0);
        setIntField(term37487, term37487.getClass(), "y", 0);
        setIntField(term37487, term37487.getClass(), "width", 0);
        setIntField(term37487, term37487.getClass(), "height", 0);
        setField(term37487, term37487.getClass(), "foreground", null);
        setField(term37487, term37487.getClass(), "background", null);
        setField(term37487, term37487.getClass(), "font", null);
        setField(term37487, term37487.getClass(), "peerFont", null);
        setField(term37487, term37487.getClass(), "cursor", null);
        setField(term37487, term37487.getClass(), "locale", null);
        setField(term37487, term37487.getClass(), "graphicsConfig", null);
        setField(term37487, term37487.getClass(), "bufferStrategy", null);
        setBooleanField(term37487, term37487.getClass(), "ignoreRepaint", false);
        setBooleanField(term37487, term37487.getClass(), "visible", false);
        setBooleanField(term37487, term37487.getClass(), "enabled", false);
        setBooleanField(term37487, term37487.getClass(), "valid", false);
        setField(term37487, term37487.getClass(), "dropTarget", null);
        setField(term37487, term37487.getClass(), "popups", null);
        setField(term37487, term37487.getClass(), "name", null);
        setBooleanField(term37487, term37487.getClass(), "nameExplicitlySet", false);
        setBooleanField(term37487, term37487.getClass(), "focusable", false);
        setIntField(term37487, term37487.getClass(), "isFocusTraversableOverridden", 0);
        setField(term37487, term37487.getClass(), "focusTraversalKeys", null);
        setBooleanField(term37487, term37487.getClass(), "focusTraversalKeysEnabled", false);
        setField(term37487, term37487.getClass(), "acc", null);
        setField(term37487, term37487.getClass(), "minSize", null);
        setBooleanField(term37487, term37487.getClass(), "minSizeSet", false);
        setField(term37487, term37487.getClass(), "prefSize", null);
        setBooleanField(term37487, term37487.getClass(), "prefSizeSet", false);
        setField(term37487, term37487.getClass(), "maxSize", null);
        setBooleanField(term37487, term37487.getClass(), "maxSizeSet", false);
        setField(term37487, term37487.getClass(), "componentOrientation", null);
        setBooleanField(term37487, term37487.getClass(), "newEventsOnly", false);
        setField(term37487, term37487.getClass(), "componentListener", null);
        setField(term37487, term37487.getClass(), "focusListener", null);
        setField(term37487, term37487.getClass(), "hierarchyListener", null);
        setField(term37487, term37487.getClass(), "hierarchyBoundsListener", null);
        setField(term37487, term37487.getClass(), "keyListener", null);
        setField(term37487, term37487.getClass(), "mouseListener", null);
        setField(term37487, term37487.getClass(), "mouseMotionListener", null);
        setField(term37487, term37487.getClass(), "mouseWheelListener", null);
        setField(term37487, term37487.getClass(), "inputMethodListener", null);
        setLongField(term37487, term37487.getClass(), "eventMask", 0L);
        setField(term37487, term37487.getClass(), "changeSupport", null);
        setField(term37487, term37487.getClass(), "objectLock", null);
        setBooleanField(term37487, term37487.getClass(), "isPacked", false);
        setIntField(term37487, term37487.getClass(), "boundsOp", 0);
        setField(term37487, term37487.getClass(), "compoundShape", null);
        setField(term37487, term37487.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term37487, term37487.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term37487, term37487.getClass(), "backgroundEraseDisabled", false);
        setField(term37487, term37487.getClass(), "eventCache", null);
        setBooleanField(term37487, term37487.getClass(), "coalescingEnabled", false);
        setBooleanField(term37487, term37487.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term37487, term37487.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.AssignmentCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "listener", argTypes, term37487, args);
    }

};


