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

public class EventCreator_listener_8141771534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4373;

    public EventCreator_listener_8141771534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4373 = newInstance(Class.forName("core.task.creator.EventCreator"));
        setField(term4373, term4373.getClass(), "eventType", null);
        setField(term4373, term4373.getClass(), "descriptionField", null);
        setField(term4373, term4373.getClass(), "dayField", null);
        setField(term4373, term4373.getClass(), "monthField", null);
        setField(term4373, term4373.getClass(), "yearField", null);
        setIntField(term4373, term4373.getClass(), "defaultCloseOperation", 0);
        setField(term4373, term4373.getClass(), "rootPane", null);
        setBooleanField(term4373, term4373.getClass(), "rootPaneCheckingEnabled", false);
        setField(term4373, term4373.getClass(), "transferHandler", null);
        setField(term4373, term4373.getClass(), "accessibleContext", null);
        setBooleanField(term4373, term4373.getClass(), "resizable", false);
        setBooleanField(term4373, term4373.getClass(), "undecorated", false);
        setBooleanField(term4373, term4373.getClass(), "initialized", false);
        setBooleanField(term4373, term4373.getClass(), "modal", false);
        setField(term4373, term4373.getClass(), "modalityType", null);
        setField(term4373, term4373.getClass(), "blockedWindows", null);
        setField(term4373, term4373.getClass(), "title", null);
        setField(term4373, term4373.getClass(), "modalFilter", null);
        setField(term4373, term4373.getClass(), "secondaryLoop", null);
        setBooleanField(term4373, term4373.getClass(), "isInHide", false);
        setBooleanField(term4373, term4373.getClass(), "isInDispose", false);
        setField(term4373, term4373.getClass(), "warningString", null);
        setField(term4373, term4373.getClass(), "icons", null);
        setField(term4373, term4373.getClass(), "temporaryLostComponent", null);
        setBooleanField(term4373, term4373.getClass(), "syncLWRequests", false);
        setBooleanField(term4373, term4373.getClass(), "beforeFirstShow", false);
        setBooleanField(term4373, term4373.getClass(), "disposing", false);
        setField(term4373, term4373.getClass(), "disposerRecord", null);
        setIntField(term4373, term4373.getClass(), "state", 0);
        setBooleanField(term4373, term4373.getClass(), "alwaysOnTop", false);
        setField(term4373, term4373.getClass(), "ownedWindowList", null);
        setField(term4373, term4373.getClass(), "weakThis", null);
        setBooleanField(term4373, term4373.getClass(), "showWithParent", false);
        setField(term4373, term4373.getClass(), "modalBlocker", null);
        setField(term4373, term4373.getClass(), "modalExclusionType", null);
        setField(term4373, term4373.getClass(), "windowListener", null);
        setField(term4373, term4373.getClass(), "windowStateListener", null);
        setField(term4373, term4373.getClass(), "windowFocusListener", null);
        setField(term4373, term4373.getClass(), "inputContext", null);
        setField(term4373, term4373.getClass(), "inputContextLock", null);
        setField(term4373, term4373.getClass(), "focusMgr", null);
        setBooleanField(term4373, term4373.getClass(), "focusableWindowState", false);
        setBooleanField(term4373, term4373.getClass(), "autoRequestFocus", false);
        setBooleanField(term4373, term4373.getClass(), "isInShow", false);
        setFloatField(term4373, term4373.getClass(), "opacity", 0.0F);
        setField(term4373, term4373.getClass(), "shape", null);
        setBooleanField(term4373, term4373.getClass(), "isTrayIconWindow", false);
        setIntField(term4373, term4373.getClass(), "securityWarningWidth", 0);
        setIntField(term4373, term4373.getClass(), "securityWarningHeight", 0);
        setDoubleField(term4373, term4373.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term4373, term4373.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term4373, term4373.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term4373, term4373.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term4373, term4373.getClass(), "anchor", null);
        setField(term4373, term4373.getClass(), "type", null);
        setIntField(term4373, term4373.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term4373, term4373.getClass(), "locationByPlatform", false);
        setField(term4373, term4373.getClass(), "component", null);
        setField(term4373, term4373.getClass(), "layoutMgr", null);
        setField(term4373, term4373.getClass(), "dispatcher", null);
        setField(term4373, term4373.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term4373, term4373.getClass(), "focusCycleRoot", false);
        setBooleanField(term4373, term4373.getClass(), "focusTraversalPolicyProvider", false);
        setField(term4373, term4373.getClass(), "printingThreads", null);
        setBooleanField(term4373, term4373.getClass(), "printing", false);
        setField(term4373, term4373.getClass(), "containerListener", null);
        setIntField(term4373, term4373.getClass(), "listeningChildren", 0);
        setIntField(term4373, term4373.getClass(), "listeningBoundsChildren", 0);
        setIntField(term4373, term4373.getClass(), "descendantsCount", 0);
        setField(term4373, term4373.getClass(), "preserveBackgroundColor", null);
        setIntField(term4373, term4373.getClass(), "numOfHWComponents", 0);
        setIntField(term4373, term4373.getClass(), "numOfLWComponents", 0);
        setField(term4373, term4373.getClass(), "modalComp", null);
        setField(term4373, term4373.getClass(), "modalAppContext", null);
        setIntField(term4373, term4373.getClass(), "containerSerializedDataVersion", 0);
        setField(term4373, term4373.getClass(), "peer", null);
        setField(term4373, term4373.getClass(), "parent", null);
        setField(term4373, term4373.getClass(), "appContext", null);
        setIntField(term4373, term4373.getClass(), "x", 0);
        setIntField(term4373, term4373.getClass(), "y", 0);
        setIntField(term4373, term4373.getClass(), "width", 0);
        setIntField(term4373, term4373.getClass(), "height", 0);
        setField(term4373, term4373.getClass(), "foreground", null);
        setField(term4373, term4373.getClass(), "background", null);
        setField(term4373, term4373.getClass(), "font", null);
        setField(term4373, term4373.getClass(), "peerFont", null);
        setField(term4373, term4373.getClass(), "cursor", null);
        setField(term4373, term4373.getClass(), "locale", null);
        setField(term4373, term4373.getClass(), "graphicsConfig", null);
        setField(term4373, term4373.getClass(), "bufferStrategy", null);
        setBooleanField(term4373, term4373.getClass(), "ignoreRepaint", false);
        setBooleanField(term4373, term4373.getClass(), "visible", false);
        setBooleanField(term4373, term4373.getClass(), "enabled", false);
        setBooleanField(term4373, term4373.getClass(), "valid", false);
        setField(term4373, term4373.getClass(), "dropTarget", null);
        setField(term4373, term4373.getClass(), "popups", null);
        setField(term4373, term4373.getClass(), "name", null);
        setBooleanField(term4373, term4373.getClass(), "nameExplicitlySet", false);
        setBooleanField(term4373, term4373.getClass(), "focusable", false);
        setIntField(term4373, term4373.getClass(), "isFocusTraversableOverridden", 0);
        setField(term4373, term4373.getClass(), "focusTraversalKeys", null);
        setBooleanField(term4373, term4373.getClass(), "focusTraversalKeysEnabled", false);
        setField(term4373, term4373.getClass(), "acc", null);
        setField(term4373, term4373.getClass(), "minSize", null);
        setBooleanField(term4373, term4373.getClass(), "minSizeSet", false);
        setField(term4373, term4373.getClass(), "prefSize", null);
        setBooleanField(term4373, term4373.getClass(), "prefSizeSet", false);
        setField(term4373, term4373.getClass(), "maxSize", null);
        setBooleanField(term4373, term4373.getClass(), "maxSizeSet", false);
        setField(term4373, term4373.getClass(), "componentOrientation", null);
        setBooleanField(term4373, term4373.getClass(), "newEventsOnly", false);
        setField(term4373, term4373.getClass(), "componentListener", null);
        setField(term4373, term4373.getClass(), "focusListener", null);
        setField(term4373, term4373.getClass(), "hierarchyListener", null);
        setField(term4373, term4373.getClass(), "hierarchyBoundsListener", null);
        setField(term4373, term4373.getClass(), "keyListener", null);
        setField(term4373, term4373.getClass(), "mouseListener", null);
        setField(term4373, term4373.getClass(), "mouseMotionListener", null);
        setField(term4373, term4373.getClass(), "mouseWheelListener", null);
        setField(term4373, term4373.getClass(), "inputMethodListener", null);
        setLongField(term4373, term4373.getClass(), "eventMask", 0L);
        setField(term4373, term4373.getClass(), "changeSupport", null);
        setField(term4373, term4373.getClass(), "objectLock", null);
        setBooleanField(term4373, term4373.getClass(), "isPacked", false);
        setIntField(term4373, term4373.getClass(), "boundsOp", 0);
        setField(term4373, term4373.getClass(), "compoundShape", null);
        setField(term4373, term4373.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term4373, term4373.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term4373, term4373.getClass(), "backgroundEraseDisabled", false);
        setField(term4373, term4373.getClass(), "eventCache", null);
        setBooleanField(term4373, term4373.getClass(), "coalescingEnabled", false);
        setBooleanField(term4373, term4373.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term4373, term4373.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.EventCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "listener", argTypes, term4373, args);
    }

};


