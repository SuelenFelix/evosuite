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

public class ProjectCreator_listener_15006985602 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128206;

    public ProjectCreator_listener_15006985602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128206 = newInstance(Class.forName("core.task.creator.ProjectCreator"));
        setField(term128206, term128206.getClass(), "nameField", null);
        setField(term128206, term128206.getClass(), "durationBox", null);
        setField(term128206, term128206.getClass(), "typeBox", null);
        setField(term128206, term128206.getClass(), "createButton", null);
        setIntField(term128206, term128206.getClass(), "defaultCloseOperation", 0);
        setField(term128206, term128206.getClass(), "rootPane", null);
        setBooleanField(term128206, term128206.getClass(), "rootPaneCheckingEnabled", false);
        setField(term128206, term128206.getClass(), "transferHandler", null);
        setField(term128206, term128206.getClass(), "accessibleContext", null);
        setBooleanField(term128206, term128206.getClass(), "resizable", false);
        setBooleanField(term128206, term128206.getClass(), "undecorated", false);
        setBooleanField(term128206, term128206.getClass(), "initialized", false);
        setBooleanField(term128206, term128206.getClass(), "modal", false);
        setField(term128206, term128206.getClass(), "modalityType", null);
        setField(term128206, term128206.getClass(), "blockedWindows", null);
        setField(term128206, term128206.getClass(), "title", null);
        setField(term128206, term128206.getClass(), "modalFilter", null);
        setField(term128206, term128206.getClass(), "secondaryLoop", null);
        setBooleanField(term128206, term128206.getClass(), "isInHide", false);
        setBooleanField(term128206, term128206.getClass(), "isInDispose", false);
        setField(term128206, term128206.getClass(), "warningString", null);
        setField(term128206, term128206.getClass(), "icons", null);
        setField(term128206, term128206.getClass(), "temporaryLostComponent", null);
        setBooleanField(term128206, term128206.getClass(), "syncLWRequests", false);
        setBooleanField(term128206, term128206.getClass(), "beforeFirstShow", false);
        setBooleanField(term128206, term128206.getClass(), "disposing", false);
        setField(term128206, term128206.getClass(), "disposerRecord", null);
        setIntField(term128206, term128206.getClass(), "state", 0);
        setBooleanField(term128206, term128206.getClass(), "alwaysOnTop", false);
        setField(term128206, term128206.getClass(), "ownedWindowList", null);
        setField(term128206, term128206.getClass(), "weakThis", null);
        setBooleanField(term128206, term128206.getClass(), "showWithParent", false);
        setField(term128206, term128206.getClass(), "modalBlocker", null);
        setField(term128206, term128206.getClass(), "modalExclusionType", null);
        setField(term128206, term128206.getClass(), "windowListener", null);
        setField(term128206, term128206.getClass(), "windowStateListener", null);
        setField(term128206, term128206.getClass(), "windowFocusListener", null);
        setField(term128206, term128206.getClass(), "inputContext", null);
        setField(term128206, term128206.getClass(), "inputContextLock", null);
        setField(term128206, term128206.getClass(), "focusMgr", null);
        setBooleanField(term128206, term128206.getClass(), "focusableWindowState", false);
        setBooleanField(term128206, term128206.getClass(), "autoRequestFocus", false);
        setBooleanField(term128206, term128206.getClass(), "isInShow", false);
        setFloatField(term128206, term128206.getClass(), "opacity", 0.0F);
        setField(term128206, term128206.getClass(), "shape", null);
        setBooleanField(term128206, term128206.getClass(), "isTrayIconWindow", false);
        setIntField(term128206, term128206.getClass(), "securityWarningWidth", 0);
        setIntField(term128206, term128206.getClass(), "securityWarningHeight", 0);
        setDoubleField(term128206, term128206.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term128206, term128206.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term128206, term128206.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term128206, term128206.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term128206, term128206.getClass(), "anchor", null);
        setField(term128206, term128206.getClass(), "type", null);
        setIntField(term128206, term128206.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term128206, term128206.getClass(), "locationByPlatform", false);
        setField(term128206, term128206.getClass(), "component", null);
        setField(term128206, term128206.getClass(), "layoutMgr", null);
        setField(term128206, term128206.getClass(), "dispatcher", null);
        setField(term128206, term128206.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term128206, term128206.getClass(), "focusCycleRoot", false);
        setBooleanField(term128206, term128206.getClass(), "focusTraversalPolicyProvider", false);
        setField(term128206, term128206.getClass(), "printingThreads", null);
        setBooleanField(term128206, term128206.getClass(), "printing", false);
        setField(term128206, term128206.getClass(), "containerListener", null);
        setIntField(term128206, term128206.getClass(), "listeningChildren", 0);
        setIntField(term128206, term128206.getClass(), "listeningBoundsChildren", 0);
        setIntField(term128206, term128206.getClass(), "descendantsCount", 0);
        setField(term128206, term128206.getClass(), "preserveBackgroundColor", null);
        setIntField(term128206, term128206.getClass(), "numOfHWComponents", 0);
        setIntField(term128206, term128206.getClass(), "numOfLWComponents", 0);
        setField(term128206, term128206.getClass(), "modalComp", null);
        setField(term128206, term128206.getClass(), "modalAppContext", null);
        setIntField(term128206, term128206.getClass(), "containerSerializedDataVersion", 0);
        setField(term128206, term128206.getClass(), "peer", null);
        setField(term128206, term128206.getClass(), "parent", null);
        setField(term128206, term128206.getClass(), "appContext", null);
        setIntField(term128206, term128206.getClass(), "x", 0);
        setIntField(term128206, term128206.getClass(), "y", 0);
        setIntField(term128206, term128206.getClass(), "width", 0);
        setIntField(term128206, term128206.getClass(), "height", 0);
        setField(term128206, term128206.getClass(), "foreground", null);
        setField(term128206, term128206.getClass(), "background", null);
        setField(term128206, term128206.getClass(), "font", null);
        setField(term128206, term128206.getClass(), "peerFont", null);
        setField(term128206, term128206.getClass(), "cursor", null);
        setField(term128206, term128206.getClass(), "locale", null);
        setField(term128206, term128206.getClass(), "graphicsConfig", null);
        setField(term128206, term128206.getClass(), "bufferStrategy", null);
        setBooleanField(term128206, term128206.getClass(), "ignoreRepaint", false);
        setBooleanField(term128206, term128206.getClass(), "visible", false);
        setBooleanField(term128206, term128206.getClass(), "enabled", false);
        setBooleanField(term128206, term128206.getClass(), "valid", false);
        setField(term128206, term128206.getClass(), "dropTarget", null);
        setField(term128206, term128206.getClass(), "popups", null);
        setField(term128206, term128206.getClass(), "name", null);
        setBooleanField(term128206, term128206.getClass(), "nameExplicitlySet", false);
        setBooleanField(term128206, term128206.getClass(), "focusable", false);
        setIntField(term128206, term128206.getClass(), "isFocusTraversableOverridden", 0);
        setField(term128206, term128206.getClass(), "focusTraversalKeys", null);
        setBooleanField(term128206, term128206.getClass(), "focusTraversalKeysEnabled", false);
        setField(term128206, term128206.getClass(), "acc", null);
        setField(term128206, term128206.getClass(), "minSize", null);
        setBooleanField(term128206, term128206.getClass(), "minSizeSet", false);
        setField(term128206, term128206.getClass(), "prefSize", null);
        setBooleanField(term128206, term128206.getClass(), "prefSizeSet", false);
        setField(term128206, term128206.getClass(), "maxSize", null);
        setBooleanField(term128206, term128206.getClass(), "maxSizeSet", false);
        setField(term128206, term128206.getClass(), "componentOrientation", null);
        setBooleanField(term128206, term128206.getClass(), "newEventsOnly", false);
        setField(term128206, term128206.getClass(), "componentListener", null);
        setField(term128206, term128206.getClass(), "focusListener", null);
        setField(term128206, term128206.getClass(), "hierarchyListener", null);
        setField(term128206, term128206.getClass(), "hierarchyBoundsListener", null);
        setField(term128206, term128206.getClass(), "keyListener", null);
        setField(term128206, term128206.getClass(), "mouseListener", null);
        setField(term128206, term128206.getClass(), "mouseMotionListener", null);
        setField(term128206, term128206.getClass(), "mouseWheelListener", null);
        setField(term128206, term128206.getClass(), "inputMethodListener", null);
        setLongField(term128206, term128206.getClass(), "eventMask", 0L);
        setField(term128206, term128206.getClass(), "changeSupport", null);
        setField(term128206, term128206.getClass(), "objectLock", null);
        setBooleanField(term128206, term128206.getClass(), "isPacked", false);
        setIntField(term128206, term128206.getClass(), "boundsOp", 0);
        setField(term128206, term128206.getClass(), "compoundShape", null);
        setField(term128206, term128206.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term128206, term128206.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term128206, term128206.getClass(), "backgroundEraseDisabled", false);
        setField(term128206, term128206.getClass(), "eventCache", null);
        setBooleanField(term128206, term128206.getClass(), "coalescingEnabled", false);
        setBooleanField(term128206, term128206.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term128206, term128206.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.ProjectCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "listener", argTypes, term128206, args);
    }

};


