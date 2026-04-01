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
     Object term72384;

    public AssignmentCreator_listener_10488558218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72384 = newInstance(Class.forName("core.task.creator.AssignmentCreator"));
        setField(term72384, term72384.getClass(), "nameField", null);
        setField(term72384, term72384.getClass(), "groupChoice", null);
        setField(term72384, term72384.getClass(), "questionArea", null);
        setField(term72384, term72384.getClass(), "modes", null);
        setField(term72384, term72384.getClass(), "meanValue", null);
        setField(term72384, term72384.getClass(), "dField", null);
        setField(term72384, term72384.getClass(), "mField", null);
        setField(term72384, term72384.getClass(), "yField", null);
        setIntField(term72384, term72384.getClass(), "defaultCloseOperation", 0);
        setField(term72384, term72384.getClass(), "rootPane", null);
        setBooleanField(term72384, term72384.getClass(), "rootPaneCheckingEnabled", false);
        setField(term72384, term72384.getClass(), "transferHandler", null);
        setField(term72384, term72384.getClass(), "accessibleContext", null);
        setBooleanField(term72384, term72384.getClass(), "resizable", false);
        setBooleanField(term72384, term72384.getClass(), "undecorated", false);
        setBooleanField(term72384, term72384.getClass(), "initialized", false);
        setBooleanField(term72384, term72384.getClass(), "modal", false);
        setField(term72384, term72384.getClass(), "modalityType", null);
        setField(term72384, term72384.getClass(), "blockedWindows", null);
        setField(term72384, term72384.getClass(), "title", null);
        setField(term72384, term72384.getClass(), "modalFilter", null);
        setField(term72384, term72384.getClass(), "secondaryLoop", null);
        setBooleanField(term72384, term72384.getClass(), "isInHide", false);
        setBooleanField(term72384, term72384.getClass(), "isInDispose", false);
        setField(term72384, term72384.getClass(), "warningString", null);
        setField(term72384, term72384.getClass(), "icons", null);
        setField(term72384, term72384.getClass(), "temporaryLostComponent", null);
        setBooleanField(term72384, term72384.getClass(), "syncLWRequests", false);
        setBooleanField(term72384, term72384.getClass(), "beforeFirstShow", false);
        setBooleanField(term72384, term72384.getClass(), "disposing", false);
        setField(term72384, term72384.getClass(), "disposerRecord", null);
        setIntField(term72384, term72384.getClass(), "state", 0);
        setBooleanField(term72384, term72384.getClass(), "alwaysOnTop", false);
        setField(term72384, term72384.getClass(), "ownedWindowList", null);
        setField(term72384, term72384.getClass(), "weakThis", null);
        setBooleanField(term72384, term72384.getClass(), "showWithParent", false);
        setField(term72384, term72384.getClass(), "modalBlocker", null);
        setField(term72384, term72384.getClass(), "modalExclusionType", null);
        setField(term72384, term72384.getClass(), "windowListener", null);
        setField(term72384, term72384.getClass(), "windowStateListener", null);
        setField(term72384, term72384.getClass(), "windowFocusListener", null);
        setField(term72384, term72384.getClass(), "inputContext", null);
        setField(term72384, term72384.getClass(), "inputContextLock", null);
        setField(term72384, term72384.getClass(), "focusMgr", null);
        setBooleanField(term72384, term72384.getClass(), "focusableWindowState", false);
        setBooleanField(term72384, term72384.getClass(), "autoRequestFocus", false);
        setBooleanField(term72384, term72384.getClass(), "isInShow", false);
        setFloatField(term72384, term72384.getClass(), "opacity", 0.0F);
        setField(term72384, term72384.getClass(), "shape", null);
        setBooleanField(term72384, term72384.getClass(), "isTrayIconWindow", false);
        setIntField(term72384, term72384.getClass(), "securityWarningWidth", 0);
        setIntField(term72384, term72384.getClass(), "securityWarningHeight", 0);
        setDoubleField(term72384, term72384.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term72384, term72384.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term72384, term72384.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term72384, term72384.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term72384, term72384.getClass(), "anchor", null);
        setField(term72384, term72384.getClass(), "type", null);
        setIntField(term72384, term72384.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term72384, term72384.getClass(), "locationByPlatform", false);
        setField(term72384, term72384.getClass(), "component", null);
        setField(term72384, term72384.getClass(), "layoutMgr", null);
        setField(term72384, term72384.getClass(), "dispatcher", null);
        setField(term72384, term72384.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term72384, term72384.getClass(), "focusCycleRoot", false);
        setBooleanField(term72384, term72384.getClass(), "focusTraversalPolicyProvider", false);
        setField(term72384, term72384.getClass(), "printingThreads", null);
        setBooleanField(term72384, term72384.getClass(), "printing", false);
        setField(term72384, term72384.getClass(), "containerListener", null);
        setIntField(term72384, term72384.getClass(), "listeningChildren", 0);
        setIntField(term72384, term72384.getClass(), "listeningBoundsChildren", 0);
        setIntField(term72384, term72384.getClass(), "descendantsCount", 0);
        setField(term72384, term72384.getClass(), "preserveBackgroundColor", null);
        setIntField(term72384, term72384.getClass(), "numOfHWComponents", 0);
        setIntField(term72384, term72384.getClass(), "numOfLWComponents", 0);
        setField(term72384, term72384.getClass(), "modalComp", null);
        setField(term72384, term72384.getClass(), "modalAppContext", null);
        setIntField(term72384, term72384.getClass(), "containerSerializedDataVersion", 0);
        setField(term72384, term72384.getClass(), "peer", null);
        setField(term72384, term72384.getClass(), "parent", null);
        setField(term72384, term72384.getClass(), "appContext", null);
        setIntField(term72384, term72384.getClass(), "x", 0);
        setIntField(term72384, term72384.getClass(), "y", 0);
        setIntField(term72384, term72384.getClass(), "width", 0);
        setIntField(term72384, term72384.getClass(), "height", 0);
        setField(term72384, term72384.getClass(), "foreground", null);
        setField(term72384, term72384.getClass(), "background", null);
        setField(term72384, term72384.getClass(), "font", null);
        setField(term72384, term72384.getClass(), "peerFont", null);
        setField(term72384, term72384.getClass(), "cursor", null);
        setField(term72384, term72384.getClass(), "locale", null);
        setField(term72384, term72384.getClass(), "graphicsConfig", null);
        setField(term72384, term72384.getClass(), "bufferStrategy", null);
        setBooleanField(term72384, term72384.getClass(), "ignoreRepaint", false);
        setBooleanField(term72384, term72384.getClass(), "visible", false);
        setBooleanField(term72384, term72384.getClass(), "enabled", false);
        setBooleanField(term72384, term72384.getClass(), "valid", false);
        setField(term72384, term72384.getClass(), "dropTarget", null);
        setField(term72384, term72384.getClass(), "popups", null);
        setField(term72384, term72384.getClass(), "name", null);
        setBooleanField(term72384, term72384.getClass(), "nameExplicitlySet", false);
        setBooleanField(term72384, term72384.getClass(), "focusable", false);
        setIntField(term72384, term72384.getClass(), "isFocusTraversableOverridden", 0);
        setField(term72384, term72384.getClass(), "focusTraversalKeys", null);
        setBooleanField(term72384, term72384.getClass(), "focusTraversalKeysEnabled", false);
        setField(term72384, term72384.getClass(), "acc", null);
        setField(term72384, term72384.getClass(), "minSize", null);
        setBooleanField(term72384, term72384.getClass(), "minSizeSet", false);
        setField(term72384, term72384.getClass(), "prefSize", null);
        setBooleanField(term72384, term72384.getClass(), "prefSizeSet", false);
        setField(term72384, term72384.getClass(), "maxSize", null);
        setBooleanField(term72384, term72384.getClass(), "maxSizeSet", false);
        setField(term72384, term72384.getClass(), "componentOrientation", null);
        setBooleanField(term72384, term72384.getClass(), "newEventsOnly", false);
        setField(term72384, term72384.getClass(), "componentListener", null);
        setField(term72384, term72384.getClass(), "focusListener", null);
        setField(term72384, term72384.getClass(), "hierarchyListener", null);
        setField(term72384, term72384.getClass(), "hierarchyBoundsListener", null);
        setField(term72384, term72384.getClass(), "keyListener", null);
        setField(term72384, term72384.getClass(), "mouseListener", null);
        setField(term72384, term72384.getClass(), "mouseMotionListener", null);
        setField(term72384, term72384.getClass(), "mouseWheelListener", null);
        setField(term72384, term72384.getClass(), "inputMethodListener", null);
        setLongField(term72384, term72384.getClass(), "eventMask", 0L);
        setField(term72384, term72384.getClass(), "changeSupport", null);
        setField(term72384, term72384.getClass(), "objectLock", null);
        setBooleanField(term72384, term72384.getClass(), "isPacked", false);
        setIntField(term72384, term72384.getClass(), "boundsOp", 0);
        setField(term72384, term72384.getClass(), "compoundShape", null);
        setField(term72384, term72384.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term72384, term72384.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term72384, term72384.getClass(), "backgroundEraseDisabled", false);
        setField(term72384, term72384.getClass(), "eventCache", null);
        setBooleanField(term72384, term72384.getClass(), "coalescingEnabled", false);
        setBooleanField(term72384, term72384.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term72384, term72384.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.AssignmentCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "listener", argTypes, term72384, args);
    }

};


