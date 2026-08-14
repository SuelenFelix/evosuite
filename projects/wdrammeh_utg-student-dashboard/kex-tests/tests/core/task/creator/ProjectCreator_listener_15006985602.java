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
     Object term39272;

    public ProjectCreator_listener_15006985602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39272 = newInstance(Class.forName("core.task.creator.ProjectCreator"));
        setField(term39272, term39272.getClass(), "nameField", null);
        setField(term39272, term39272.getClass(), "durationBox", null);
        setField(term39272, term39272.getClass(), "typeBox", null);
        setField(term39272, term39272.getClass(), "createButton", null);
        setIntField(term39272, term39272.getClass(), "defaultCloseOperation", 0);
        setField(term39272, term39272.getClass(), "rootPane", null);
        setBooleanField(term39272, term39272.getClass(), "rootPaneCheckingEnabled", false);
        setField(term39272, term39272.getClass(), "transferHandler", null);
        setField(term39272, term39272.getClass(), "accessibleContext", null);
        setBooleanField(term39272, term39272.getClass(), "resizable", false);
        setBooleanField(term39272, term39272.getClass(), "undecorated", false);
        setBooleanField(term39272, term39272.getClass(), "initialized", false);
        setBooleanField(term39272, term39272.getClass(), "modal", false);
        setField(term39272, term39272.getClass(), "modalityType", null);
        setField(term39272, term39272.getClass(), "blockedWindows", null);
        setField(term39272, term39272.getClass(), "title", null);
        setField(term39272, term39272.getClass(), "modalFilter", null);
        setField(term39272, term39272.getClass(), "secondaryLoop", null);
        setBooleanField(term39272, term39272.getClass(), "isInHide", false);
        setBooleanField(term39272, term39272.getClass(), "isInDispose", false);
        setField(term39272, term39272.getClass(), "warningString", null);
        setField(term39272, term39272.getClass(), "icons", null);
        setField(term39272, term39272.getClass(), "temporaryLostComponent", null);
        setBooleanField(term39272, term39272.getClass(), "syncLWRequests", false);
        setBooleanField(term39272, term39272.getClass(), "beforeFirstShow", false);
        setBooleanField(term39272, term39272.getClass(), "disposing", false);
        setField(term39272, term39272.getClass(), "disposerRecord", null);
        setIntField(term39272, term39272.getClass(), "state", 0);
        setBooleanField(term39272, term39272.getClass(), "alwaysOnTop", false);
        setField(term39272, term39272.getClass(), "ownedWindowList", null);
        setField(term39272, term39272.getClass(), "weakThis", null);
        setBooleanField(term39272, term39272.getClass(), "showWithParent", false);
        setField(term39272, term39272.getClass(), "modalBlocker", null);
        setField(term39272, term39272.getClass(), "modalExclusionType", null);
        setField(term39272, term39272.getClass(), "windowListener", null);
        setField(term39272, term39272.getClass(), "windowStateListener", null);
        setField(term39272, term39272.getClass(), "windowFocusListener", null);
        setField(term39272, term39272.getClass(), "inputContext", null);
        setField(term39272, term39272.getClass(), "inputContextLock", null);
        setField(term39272, term39272.getClass(), "focusMgr", null);
        setBooleanField(term39272, term39272.getClass(), "focusableWindowState", false);
        setBooleanField(term39272, term39272.getClass(), "autoRequestFocus", false);
        setBooleanField(term39272, term39272.getClass(), "isInShow", false);
        setFloatField(term39272, term39272.getClass(), "opacity", 0.0F);
        setField(term39272, term39272.getClass(), "shape", null);
        setBooleanField(term39272, term39272.getClass(), "isTrayIconWindow", false);
        setIntField(term39272, term39272.getClass(), "securityWarningWidth", 0);
        setIntField(term39272, term39272.getClass(), "securityWarningHeight", 0);
        setDoubleField(term39272, term39272.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term39272, term39272.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term39272, term39272.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term39272, term39272.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term39272, term39272.getClass(), "anchor", null);
        setField(term39272, term39272.getClass(), "type", null);
        setIntField(term39272, term39272.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term39272, term39272.getClass(), "locationByPlatform", false);
        setField(term39272, term39272.getClass(), "component", null);
        setField(term39272, term39272.getClass(), "layoutMgr", null);
        setField(term39272, term39272.getClass(), "dispatcher", null);
        setField(term39272, term39272.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term39272, term39272.getClass(), "focusCycleRoot", false);
        setBooleanField(term39272, term39272.getClass(), "focusTraversalPolicyProvider", false);
        setField(term39272, term39272.getClass(), "printingThreads", null);
        setBooleanField(term39272, term39272.getClass(), "printing", false);
        setField(term39272, term39272.getClass(), "containerListener", null);
        setIntField(term39272, term39272.getClass(), "listeningChildren", 0);
        setIntField(term39272, term39272.getClass(), "listeningBoundsChildren", 0);
        setIntField(term39272, term39272.getClass(), "descendantsCount", 0);
        setField(term39272, term39272.getClass(), "preserveBackgroundColor", null);
        setIntField(term39272, term39272.getClass(), "numOfHWComponents", 0);
        setIntField(term39272, term39272.getClass(), "numOfLWComponents", 0);
        setField(term39272, term39272.getClass(), "modalComp", null);
        setField(term39272, term39272.getClass(), "modalAppContext", null);
        setIntField(term39272, term39272.getClass(), "containerSerializedDataVersion", 0);
        setField(term39272, term39272.getClass(), "peer", null);
        setField(term39272, term39272.getClass(), "parent", null);
        setField(term39272, term39272.getClass(), "appContext", null);
        setIntField(term39272, term39272.getClass(), "x", 0);
        setIntField(term39272, term39272.getClass(), "y", 0);
        setIntField(term39272, term39272.getClass(), "width", 0);
        setIntField(term39272, term39272.getClass(), "height", 0);
        setField(term39272, term39272.getClass(), "foreground", null);
        setField(term39272, term39272.getClass(), "background", null);
        setField(term39272, term39272.getClass(), "font", null);
        setField(term39272, term39272.getClass(), "peerFont", null);
        setField(term39272, term39272.getClass(), "cursor", null);
        setField(term39272, term39272.getClass(), "locale", null);
        setField(term39272, term39272.getClass(), "graphicsConfig", null);
        setField(term39272, term39272.getClass(), "bufferStrategy", null);
        setBooleanField(term39272, term39272.getClass(), "ignoreRepaint", false);
        setBooleanField(term39272, term39272.getClass(), "visible", false);
        setBooleanField(term39272, term39272.getClass(), "enabled", false);
        setBooleanField(term39272, term39272.getClass(), "valid", false);
        setField(term39272, term39272.getClass(), "dropTarget", null);
        setField(term39272, term39272.getClass(), "popups", null);
        setField(term39272, term39272.getClass(), "name", null);
        setBooleanField(term39272, term39272.getClass(), "nameExplicitlySet", false);
        setBooleanField(term39272, term39272.getClass(), "focusable", false);
        setIntField(term39272, term39272.getClass(), "isFocusTraversableOverridden", 0);
        setField(term39272, term39272.getClass(), "focusTraversalKeys", null);
        setBooleanField(term39272, term39272.getClass(), "focusTraversalKeysEnabled", false);
        setField(term39272, term39272.getClass(), "acc", null);
        setField(term39272, term39272.getClass(), "minSize", null);
        setBooleanField(term39272, term39272.getClass(), "minSizeSet", false);
        setField(term39272, term39272.getClass(), "prefSize", null);
        setBooleanField(term39272, term39272.getClass(), "prefSizeSet", false);
        setField(term39272, term39272.getClass(), "maxSize", null);
        setBooleanField(term39272, term39272.getClass(), "maxSizeSet", false);
        setField(term39272, term39272.getClass(), "componentOrientation", null);
        setBooleanField(term39272, term39272.getClass(), "newEventsOnly", false);
        setField(term39272, term39272.getClass(), "componentListener", null);
        setField(term39272, term39272.getClass(), "focusListener", null);
        setField(term39272, term39272.getClass(), "hierarchyListener", null);
        setField(term39272, term39272.getClass(), "hierarchyBoundsListener", null);
        setField(term39272, term39272.getClass(), "keyListener", null);
        setField(term39272, term39272.getClass(), "mouseListener", null);
        setField(term39272, term39272.getClass(), "mouseMotionListener", null);
        setField(term39272, term39272.getClass(), "mouseWheelListener", null);
        setField(term39272, term39272.getClass(), "inputMethodListener", null);
        setLongField(term39272, term39272.getClass(), "eventMask", 0L);
        setField(term39272, term39272.getClass(), "changeSupport", null);
        setField(term39272, term39272.getClass(), "objectLock", null);
        setBooleanField(term39272, term39272.getClass(), "isPacked", false);
        setIntField(term39272, term39272.getClass(), "boundsOp", 0);
        setField(term39272, term39272.getClass(), "compoundShape", null);
        setField(term39272, term39272.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term39272, term39272.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term39272, term39272.getClass(), "backgroundEraseDisabled", false);
        setField(term39272, term39272.getClass(), "eventCache", null);
        setBooleanField(term39272, term39272.getClass(), "coalescingEnabled", false);
        setBooleanField(term39272, term39272.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term39272, term39272.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.ProjectCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "listener", argTypes, term39272, args);
    }

};


