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
     Object term39270;

    public ProjectCreator_listener_15006985602() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39270 = newInstance(Class.forName("core.task.creator.ProjectCreator"));
        setField(term39270, term39270.getClass(), "nameField", null);
        setField(term39270, term39270.getClass(), "durationBox", null);
        setField(term39270, term39270.getClass(), "typeBox", null);
        setField(term39270, term39270.getClass(), "createButton", null);
        setIntField(term39270, term39270.getClass(), "defaultCloseOperation", 0);
        setField(term39270, term39270.getClass(), "rootPane", null);
        setBooleanField(term39270, term39270.getClass(), "rootPaneCheckingEnabled", false);
        setField(term39270, term39270.getClass(), "transferHandler", null);
        setField(term39270, term39270.getClass(), "accessibleContext", null);
        setBooleanField(term39270, term39270.getClass(), "resizable", false);
        setBooleanField(term39270, term39270.getClass(), "undecorated", false);
        setBooleanField(term39270, term39270.getClass(), "initialized", false);
        setBooleanField(term39270, term39270.getClass(), "modal", false);
        setField(term39270, term39270.getClass(), "modalityType", null);
        setField(term39270, term39270.getClass(), "blockedWindows", null);
        setField(term39270, term39270.getClass(), "title", null);
        setField(term39270, term39270.getClass(), "modalFilter", null);
        setField(term39270, term39270.getClass(), "secondaryLoop", null);
        setBooleanField(term39270, term39270.getClass(), "isInHide", false);
        setBooleanField(term39270, term39270.getClass(), "isInDispose", false);
        setField(term39270, term39270.getClass(), "warningString", null);
        setField(term39270, term39270.getClass(), "icons", null);
        setField(term39270, term39270.getClass(), "temporaryLostComponent", null);
        setBooleanField(term39270, term39270.getClass(), "syncLWRequests", false);
        setBooleanField(term39270, term39270.getClass(), "beforeFirstShow", false);
        setBooleanField(term39270, term39270.getClass(), "disposing", false);
        setField(term39270, term39270.getClass(), "disposerRecord", null);
        setIntField(term39270, term39270.getClass(), "state", 0);
        setBooleanField(term39270, term39270.getClass(), "alwaysOnTop", false);
        setField(term39270, term39270.getClass(), "ownedWindowList", null);
        setField(term39270, term39270.getClass(), "weakThis", null);
        setBooleanField(term39270, term39270.getClass(), "showWithParent", false);
        setField(term39270, term39270.getClass(), "modalBlocker", null);
        setField(term39270, term39270.getClass(), "modalExclusionType", null);
        setField(term39270, term39270.getClass(), "windowListener", null);
        setField(term39270, term39270.getClass(), "windowStateListener", null);
        setField(term39270, term39270.getClass(), "windowFocusListener", null);
        setField(term39270, term39270.getClass(), "inputContext", null);
        setField(term39270, term39270.getClass(), "inputContextLock", null);
        setField(term39270, term39270.getClass(), "focusMgr", null);
        setBooleanField(term39270, term39270.getClass(), "focusableWindowState", false);
        setBooleanField(term39270, term39270.getClass(), "autoRequestFocus", false);
        setBooleanField(term39270, term39270.getClass(), "isInShow", false);
        setFloatField(term39270, term39270.getClass(), "opacity", 0.0F);
        setField(term39270, term39270.getClass(), "shape", null);
        setBooleanField(term39270, term39270.getClass(), "isTrayIconWindow", false);
        setIntField(term39270, term39270.getClass(), "securityWarningWidth", 0);
        setIntField(term39270, term39270.getClass(), "securityWarningHeight", 0);
        setDoubleField(term39270, term39270.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term39270, term39270.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term39270, term39270.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term39270, term39270.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term39270, term39270.getClass(), "anchor", null);
        setField(term39270, term39270.getClass(), "type", null);
        setIntField(term39270, term39270.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term39270, term39270.getClass(), "locationByPlatform", false);
        setField(term39270, term39270.getClass(), "component", null);
        setField(term39270, term39270.getClass(), "layoutMgr", null);
        setField(term39270, term39270.getClass(), "dispatcher", null);
        setField(term39270, term39270.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term39270, term39270.getClass(), "focusCycleRoot", false);
        setBooleanField(term39270, term39270.getClass(), "focusTraversalPolicyProvider", false);
        setField(term39270, term39270.getClass(), "printingThreads", null);
        setBooleanField(term39270, term39270.getClass(), "printing", false);
        setField(term39270, term39270.getClass(), "containerListener", null);
        setIntField(term39270, term39270.getClass(), "listeningChildren", 0);
        setIntField(term39270, term39270.getClass(), "listeningBoundsChildren", 0);
        setIntField(term39270, term39270.getClass(), "descendantsCount", 0);
        setField(term39270, term39270.getClass(), "preserveBackgroundColor", null);
        setIntField(term39270, term39270.getClass(), "numOfHWComponents", 0);
        setIntField(term39270, term39270.getClass(), "numOfLWComponents", 0);
        setField(term39270, term39270.getClass(), "modalComp", null);
        setField(term39270, term39270.getClass(), "modalAppContext", null);
        setIntField(term39270, term39270.getClass(), "containerSerializedDataVersion", 0);
        setField(term39270, term39270.getClass(), "peer", null);
        setField(term39270, term39270.getClass(), "parent", null);
        setField(term39270, term39270.getClass(), "appContext", null);
        setIntField(term39270, term39270.getClass(), "x", 0);
        setIntField(term39270, term39270.getClass(), "y", 0);
        setIntField(term39270, term39270.getClass(), "width", 0);
        setIntField(term39270, term39270.getClass(), "height", 0);
        setField(term39270, term39270.getClass(), "foreground", null);
        setField(term39270, term39270.getClass(), "background", null);
        setField(term39270, term39270.getClass(), "font", null);
        setField(term39270, term39270.getClass(), "peerFont", null);
        setField(term39270, term39270.getClass(), "cursor", null);
        setField(term39270, term39270.getClass(), "locale", null);
        setField(term39270, term39270.getClass(), "graphicsConfig", null);
        setField(term39270, term39270.getClass(), "bufferStrategy", null);
        setBooleanField(term39270, term39270.getClass(), "ignoreRepaint", false);
        setBooleanField(term39270, term39270.getClass(), "visible", false);
        setBooleanField(term39270, term39270.getClass(), "enabled", false);
        setBooleanField(term39270, term39270.getClass(), "valid", false);
        setField(term39270, term39270.getClass(), "dropTarget", null);
        setField(term39270, term39270.getClass(), "popups", null);
        setField(term39270, term39270.getClass(), "name", null);
        setBooleanField(term39270, term39270.getClass(), "nameExplicitlySet", false);
        setBooleanField(term39270, term39270.getClass(), "focusable", false);
        setIntField(term39270, term39270.getClass(), "isFocusTraversableOverridden", 0);
        setField(term39270, term39270.getClass(), "focusTraversalKeys", null);
        setBooleanField(term39270, term39270.getClass(), "focusTraversalKeysEnabled", false);
        setField(term39270, term39270.getClass(), "acc", null);
        setField(term39270, term39270.getClass(), "minSize", null);
        setBooleanField(term39270, term39270.getClass(), "minSizeSet", false);
        setField(term39270, term39270.getClass(), "prefSize", null);
        setBooleanField(term39270, term39270.getClass(), "prefSizeSet", false);
        setField(term39270, term39270.getClass(), "maxSize", null);
        setBooleanField(term39270, term39270.getClass(), "maxSizeSet", false);
        setField(term39270, term39270.getClass(), "componentOrientation", null);
        setBooleanField(term39270, term39270.getClass(), "newEventsOnly", false);
        setField(term39270, term39270.getClass(), "componentListener", null);
        setField(term39270, term39270.getClass(), "focusListener", null);
        setField(term39270, term39270.getClass(), "hierarchyListener", null);
        setField(term39270, term39270.getClass(), "hierarchyBoundsListener", null);
        setField(term39270, term39270.getClass(), "keyListener", null);
        setField(term39270, term39270.getClass(), "mouseListener", null);
        setField(term39270, term39270.getClass(), "mouseMotionListener", null);
        setField(term39270, term39270.getClass(), "mouseWheelListener", null);
        setField(term39270, term39270.getClass(), "inputMethodListener", null);
        setLongField(term39270, term39270.getClass(), "eventMask", 0L);
        setField(term39270, term39270.getClass(), "changeSupport", null);
        setField(term39270, term39270.getClass(), "objectLock", null);
        setBooleanField(term39270, term39270.getClass(), "isPacked", false);
        setIntField(term39270, term39270.getClass(), "boundsOp", 0);
        setField(term39270, term39270.getClass(), "compoundShape", null);
        setField(term39270, term39270.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term39270, term39270.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term39270, term39270.getClass(), "backgroundEraseDisabled", false);
        setField(term39270, term39270.getClass(), "eventCache", null);
        setBooleanField(term39270, term39270.getClass(), "coalescingEnabled", false);
        setBooleanField(term39270, term39270.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term39270, term39270.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.ProjectCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "listener", argTypes, term39270, args);
    }

};


