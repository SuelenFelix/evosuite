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
     Object term45068;

    public TodoCreator_listener_3012176712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45068 = newInstance(Class.forName("core.task.creator.TodoCreator"));
        setField(term45068, term45068.getClass(), "descriptionField", null);
        setField(term45068, term45068.getClass(), "durationBox", null);
        setIntField(term45068, term45068.getClass(), "defaultCloseOperation", 0);
        setField(term45068, term45068.getClass(), "rootPane", null);
        setBooleanField(term45068, term45068.getClass(), "rootPaneCheckingEnabled", false);
        setField(term45068, term45068.getClass(), "transferHandler", null);
        setField(term45068, term45068.getClass(), "accessibleContext", null);
        setBooleanField(term45068, term45068.getClass(), "resizable", false);
        setBooleanField(term45068, term45068.getClass(), "undecorated", false);
        setBooleanField(term45068, term45068.getClass(), "initialized", false);
        setBooleanField(term45068, term45068.getClass(), "modal", false);
        setField(term45068, term45068.getClass(), "modalityType", null);
        setField(term45068, term45068.getClass(), "blockedWindows", null);
        setField(term45068, term45068.getClass(), "title", null);
        setField(term45068, term45068.getClass(), "modalFilter", null);
        setField(term45068, term45068.getClass(), "secondaryLoop", null);
        setBooleanField(term45068, term45068.getClass(), "isInHide", false);
        setBooleanField(term45068, term45068.getClass(), "isInDispose", false);
        setField(term45068, term45068.getClass(), "warningString", null);
        setField(term45068, term45068.getClass(), "icons", null);
        setField(term45068, term45068.getClass(), "temporaryLostComponent", null);
        setBooleanField(term45068, term45068.getClass(), "syncLWRequests", false);
        setBooleanField(term45068, term45068.getClass(), "beforeFirstShow", false);
        setBooleanField(term45068, term45068.getClass(), "disposing", false);
        setField(term45068, term45068.getClass(), "disposerRecord", null);
        setIntField(term45068, term45068.getClass(), "state", 0);
        setBooleanField(term45068, term45068.getClass(), "alwaysOnTop", false);
        setField(term45068, term45068.getClass(), "ownedWindowList", null);
        setField(term45068, term45068.getClass(), "weakThis", null);
        setBooleanField(term45068, term45068.getClass(), "showWithParent", false);
        setField(term45068, term45068.getClass(), "modalBlocker", null);
        setField(term45068, term45068.getClass(), "modalExclusionType", null);
        setField(term45068, term45068.getClass(), "windowListener", null);
        setField(term45068, term45068.getClass(), "windowStateListener", null);
        setField(term45068, term45068.getClass(), "windowFocusListener", null);
        setField(term45068, term45068.getClass(), "inputContext", null);
        setField(term45068, term45068.getClass(), "inputContextLock", null);
        setField(term45068, term45068.getClass(), "focusMgr", null);
        setBooleanField(term45068, term45068.getClass(), "focusableWindowState", false);
        setBooleanField(term45068, term45068.getClass(), "autoRequestFocus", false);
        setBooleanField(term45068, term45068.getClass(), "isInShow", false);
        setFloatField(term45068, term45068.getClass(), "opacity", 0.0F);
        setField(term45068, term45068.getClass(), "shape", null);
        setBooleanField(term45068, term45068.getClass(), "isTrayIconWindow", false);
        setIntField(term45068, term45068.getClass(), "securityWarningWidth", 0);
        setIntField(term45068, term45068.getClass(), "securityWarningHeight", 0);
        setDoubleField(term45068, term45068.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term45068, term45068.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term45068, term45068.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term45068, term45068.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term45068, term45068.getClass(), "anchor", null);
        setField(term45068, term45068.getClass(), "type", null);
        setIntField(term45068, term45068.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term45068, term45068.getClass(), "locationByPlatform", false);
        setField(term45068, term45068.getClass(), "component", null);
        setField(term45068, term45068.getClass(), "layoutMgr", null);
        setField(term45068, term45068.getClass(), "dispatcher", null);
        setField(term45068, term45068.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term45068, term45068.getClass(), "focusCycleRoot", false);
        setBooleanField(term45068, term45068.getClass(), "focusTraversalPolicyProvider", false);
        setField(term45068, term45068.getClass(), "printingThreads", null);
        setBooleanField(term45068, term45068.getClass(), "printing", false);
        setField(term45068, term45068.getClass(), "containerListener", null);
        setIntField(term45068, term45068.getClass(), "listeningChildren", 0);
        setIntField(term45068, term45068.getClass(), "listeningBoundsChildren", 0);
        setIntField(term45068, term45068.getClass(), "descendantsCount", 0);
        setField(term45068, term45068.getClass(), "preserveBackgroundColor", null);
        setIntField(term45068, term45068.getClass(), "numOfHWComponents", 0);
        setIntField(term45068, term45068.getClass(), "numOfLWComponents", 0);
        setField(term45068, term45068.getClass(), "modalComp", null);
        setField(term45068, term45068.getClass(), "modalAppContext", null);
        setIntField(term45068, term45068.getClass(), "containerSerializedDataVersion", 0);
        setField(term45068, term45068.getClass(), "peer", null);
        setField(term45068, term45068.getClass(), "parent", null);
        setField(term45068, term45068.getClass(), "appContext", null);
        setIntField(term45068, term45068.getClass(), "x", 0);
        setIntField(term45068, term45068.getClass(), "y", 0);
        setIntField(term45068, term45068.getClass(), "width", 0);
        setIntField(term45068, term45068.getClass(), "height", 0);
        setField(term45068, term45068.getClass(), "foreground", null);
        setField(term45068, term45068.getClass(), "background", null);
        setField(term45068, term45068.getClass(), "font", null);
        setField(term45068, term45068.getClass(), "peerFont", null);
        setField(term45068, term45068.getClass(), "cursor", null);
        setField(term45068, term45068.getClass(), "locale", null);
        setField(term45068, term45068.getClass(), "graphicsConfig", null);
        setField(term45068, term45068.getClass(), "bufferStrategy", null);
        setBooleanField(term45068, term45068.getClass(), "ignoreRepaint", false);
        setBooleanField(term45068, term45068.getClass(), "visible", false);
        setBooleanField(term45068, term45068.getClass(), "enabled", false);
        setBooleanField(term45068, term45068.getClass(), "valid", false);
        setField(term45068, term45068.getClass(), "dropTarget", null);
        setField(term45068, term45068.getClass(), "popups", null);
        setField(term45068, term45068.getClass(), "name", null);
        setBooleanField(term45068, term45068.getClass(), "nameExplicitlySet", false);
        setBooleanField(term45068, term45068.getClass(), "focusable", false);
        setIntField(term45068, term45068.getClass(), "isFocusTraversableOverridden", 0);
        setField(term45068, term45068.getClass(), "focusTraversalKeys", null);
        setBooleanField(term45068, term45068.getClass(), "focusTraversalKeysEnabled", false);
        setField(term45068, term45068.getClass(), "acc", null);
        setField(term45068, term45068.getClass(), "minSize", null);
        setBooleanField(term45068, term45068.getClass(), "minSizeSet", false);
        setField(term45068, term45068.getClass(), "prefSize", null);
        setBooleanField(term45068, term45068.getClass(), "prefSizeSet", false);
        setField(term45068, term45068.getClass(), "maxSize", null);
        setBooleanField(term45068, term45068.getClass(), "maxSizeSet", false);
        setField(term45068, term45068.getClass(), "componentOrientation", null);
        setBooleanField(term45068, term45068.getClass(), "newEventsOnly", false);
        setField(term45068, term45068.getClass(), "componentListener", null);
        setField(term45068, term45068.getClass(), "focusListener", null);
        setField(term45068, term45068.getClass(), "hierarchyListener", null);
        setField(term45068, term45068.getClass(), "hierarchyBoundsListener", null);
        setField(term45068, term45068.getClass(), "keyListener", null);
        setField(term45068, term45068.getClass(), "mouseListener", null);
        setField(term45068, term45068.getClass(), "mouseMotionListener", null);
        setField(term45068, term45068.getClass(), "mouseWheelListener", null);
        setField(term45068, term45068.getClass(), "inputMethodListener", null);
        setLongField(term45068, term45068.getClass(), "eventMask", 0L);
        setField(term45068, term45068.getClass(), "changeSupport", null);
        setField(term45068, term45068.getClass(), "objectLock", null);
        setBooleanField(term45068, term45068.getClass(), "isPacked", false);
        setIntField(term45068, term45068.getClass(), "boundsOp", 0);
        setField(term45068, term45068.getClass(), "compoundShape", null);
        setField(term45068, term45068.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term45068, term45068.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term45068, term45068.getClass(), "backgroundEraseDisabled", false);
        setField(term45068, term45068.getClass(), "eventCache", null);
        setBooleanField(term45068, term45068.getClass(), "coalescingEnabled", false);
        setBooleanField(term45068, term45068.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term45068, term45068.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.TodoCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "listener", argTypes, term45068, args);
    }

};


