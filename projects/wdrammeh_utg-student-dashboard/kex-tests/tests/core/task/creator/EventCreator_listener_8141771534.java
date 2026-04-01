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
     Object term35205;

    public EventCreator_listener_8141771534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35205 = newInstance(Class.forName("core.task.creator.EventCreator"));
        setField(term35205, term35205.getClass(), "eventType", null);
        setField(term35205, term35205.getClass(), "descriptionField", null);
        setField(term35205, term35205.getClass(), "dayField", null);
        setField(term35205, term35205.getClass(), "monthField", null);
        setField(term35205, term35205.getClass(), "yearField", null);
        setIntField(term35205, term35205.getClass(), "defaultCloseOperation", 0);
        setField(term35205, term35205.getClass(), "rootPane", null);
        setBooleanField(term35205, term35205.getClass(), "rootPaneCheckingEnabled", false);
        setField(term35205, term35205.getClass(), "transferHandler", null);
        setField(term35205, term35205.getClass(), "accessibleContext", null);
        setBooleanField(term35205, term35205.getClass(), "resizable", false);
        setBooleanField(term35205, term35205.getClass(), "undecorated", false);
        setBooleanField(term35205, term35205.getClass(), "initialized", false);
        setBooleanField(term35205, term35205.getClass(), "modal", false);
        setField(term35205, term35205.getClass(), "modalityType", null);
        setField(term35205, term35205.getClass(), "blockedWindows", null);
        setField(term35205, term35205.getClass(), "title", null);
        setField(term35205, term35205.getClass(), "modalFilter", null);
        setField(term35205, term35205.getClass(), "secondaryLoop", null);
        setBooleanField(term35205, term35205.getClass(), "isInHide", false);
        setBooleanField(term35205, term35205.getClass(), "isInDispose", false);
        setField(term35205, term35205.getClass(), "warningString", null);
        setField(term35205, term35205.getClass(), "icons", null);
        setField(term35205, term35205.getClass(), "temporaryLostComponent", null);
        setBooleanField(term35205, term35205.getClass(), "syncLWRequests", false);
        setBooleanField(term35205, term35205.getClass(), "beforeFirstShow", false);
        setBooleanField(term35205, term35205.getClass(), "disposing", false);
        setField(term35205, term35205.getClass(), "disposerRecord", null);
        setIntField(term35205, term35205.getClass(), "state", 0);
        setBooleanField(term35205, term35205.getClass(), "alwaysOnTop", false);
        setField(term35205, term35205.getClass(), "ownedWindowList", null);
        setField(term35205, term35205.getClass(), "weakThis", null);
        setBooleanField(term35205, term35205.getClass(), "showWithParent", false);
        setField(term35205, term35205.getClass(), "modalBlocker", null);
        setField(term35205, term35205.getClass(), "modalExclusionType", null);
        setField(term35205, term35205.getClass(), "windowListener", null);
        setField(term35205, term35205.getClass(), "windowStateListener", null);
        setField(term35205, term35205.getClass(), "windowFocusListener", null);
        setField(term35205, term35205.getClass(), "inputContext", null);
        setField(term35205, term35205.getClass(), "inputContextLock", null);
        setField(term35205, term35205.getClass(), "focusMgr", null);
        setBooleanField(term35205, term35205.getClass(), "focusableWindowState", false);
        setBooleanField(term35205, term35205.getClass(), "autoRequestFocus", false);
        setBooleanField(term35205, term35205.getClass(), "isInShow", false);
        setFloatField(term35205, term35205.getClass(), "opacity", 0.0F);
        setField(term35205, term35205.getClass(), "shape", null);
        setBooleanField(term35205, term35205.getClass(), "isTrayIconWindow", false);
        setIntField(term35205, term35205.getClass(), "securityWarningWidth", 0);
        setIntField(term35205, term35205.getClass(), "securityWarningHeight", 0);
        setDoubleField(term35205, term35205.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term35205, term35205.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term35205, term35205.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term35205, term35205.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term35205, term35205.getClass(), "anchor", null);
        setField(term35205, term35205.getClass(), "type", null);
        setIntField(term35205, term35205.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term35205, term35205.getClass(), "locationByPlatform", false);
        setField(term35205, term35205.getClass(), "component", null);
        setField(term35205, term35205.getClass(), "layoutMgr", null);
        setField(term35205, term35205.getClass(), "dispatcher", null);
        setField(term35205, term35205.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term35205, term35205.getClass(), "focusCycleRoot", false);
        setBooleanField(term35205, term35205.getClass(), "focusTraversalPolicyProvider", false);
        setField(term35205, term35205.getClass(), "printingThreads", null);
        setBooleanField(term35205, term35205.getClass(), "printing", false);
        setField(term35205, term35205.getClass(), "containerListener", null);
        setIntField(term35205, term35205.getClass(), "listeningChildren", 0);
        setIntField(term35205, term35205.getClass(), "listeningBoundsChildren", 0);
        setIntField(term35205, term35205.getClass(), "descendantsCount", 0);
        setField(term35205, term35205.getClass(), "preserveBackgroundColor", null);
        setIntField(term35205, term35205.getClass(), "numOfHWComponents", 0);
        setIntField(term35205, term35205.getClass(), "numOfLWComponents", 0);
        setField(term35205, term35205.getClass(), "modalComp", null);
        setField(term35205, term35205.getClass(), "modalAppContext", null);
        setIntField(term35205, term35205.getClass(), "containerSerializedDataVersion", 0);
        setField(term35205, term35205.getClass(), "peer", null);
        setField(term35205, term35205.getClass(), "parent", null);
        setField(term35205, term35205.getClass(), "appContext", null);
        setIntField(term35205, term35205.getClass(), "x", 0);
        setIntField(term35205, term35205.getClass(), "y", 0);
        setIntField(term35205, term35205.getClass(), "width", 0);
        setIntField(term35205, term35205.getClass(), "height", 0);
        setField(term35205, term35205.getClass(), "foreground", null);
        setField(term35205, term35205.getClass(), "background", null);
        setField(term35205, term35205.getClass(), "font", null);
        setField(term35205, term35205.getClass(), "peerFont", null);
        setField(term35205, term35205.getClass(), "cursor", null);
        setField(term35205, term35205.getClass(), "locale", null);
        setField(term35205, term35205.getClass(), "graphicsConfig", null);
        setField(term35205, term35205.getClass(), "bufferStrategy", null);
        setBooleanField(term35205, term35205.getClass(), "ignoreRepaint", false);
        setBooleanField(term35205, term35205.getClass(), "visible", false);
        setBooleanField(term35205, term35205.getClass(), "enabled", false);
        setBooleanField(term35205, term35205.getClass(), "valid", false);
        setField(term35205, term35205.getClass(), "dropTarget", null);
        setField(term35205, term35205.getClass(), "popups", null);
        setField(term35205, term35205.getClass(), "name", null);
        setBooleanField(term35205, term35205.getClass(), "nameExplicitlySet", false);
        setBooleanField(term35205, term35205.getClass(), "focusable", false);
        setIntField(term35205, term35205.getClass(), "isFocusTraversableOverridden", 0);
        setField(term35205, term35205.getClass(), "focusTraversalKeys", null);
        setBooleanField(term35205, term35205.getClass(), "focusTraversalKeysEnabled", false);
        setField(term35205, term35205.getClass(), "acc", null);
        setField(term35205, term35205.getClass(), "minSize", null);
        setBooleanField(term35205, term35205.getClass(), "minSizeSet", false);
        setField(term35205, term35205.getClass(), "prefSize", null);
        setBooleanField(term35205, term35205.getClass(), "prefSizeSet", false);
        setField(term35205, term35205.getClass(), "maxSize", null);
        setBooleanField(term35205, term35205.getClass(), "maxSizeSet", false);
        setField(term35205, term35205.getClass(), "componentOrientation", null);
        setBooleanField(term35205, term35205.getClass(), "newEventsOnly", false);
        setField(term35205, term35205.getClass(), "componentListener", null);
        setField(term35205, term35205.getClass(), "focusListener", null);
        setField(term35205, term35205.getClass(), "hierarchyListener", null);
        setField(term35205, term35205.getClass(), "hierarchyBoundsListener", null);
        setField(term35205, term35205.getClass(), "keyListener", null);
        setField(term35205, term35205.getClass(), "mouseListener", null);
        setField(term35205, term35205.getClass(), "mouseMotionListener", null);
        setField(term35205, term35205.getClass(), "mouseWheelListener", null);
        setField(term35205, term35205.getClass(), "inputMethodListener", null);
        setLongField(term35205, term35205.getClass(), "eventMask", 0L);
        setField(term35205, term35205.getClass(), "changeSupport", null);
        setField(term35205, term35205.getClass(), "objectLock", null);
        setBooleanField(term35205, term35205.getClass(), "isPacked", false);
        setIntField(term35205, term35205.getClass(), "boundsOp", 0);
        setField(term35205, term35205.getClass(), "compoundShape", null);
        setField(term35205, term35205.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term35205, term35205.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term35205, term35205.getClass(), "backgroundEraseDisabled", false);
        setField(term35205, term35205.getClass(), "eventCache", null);
        setBooleanField(term35205, term35205.getClass(), "coalescingEnabled", false);
        setBooleanField(term35205, term35205.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term35205, term35205.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.EventCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "listener", argTypes, term35205, args);
    }

};


