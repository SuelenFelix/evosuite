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
     Object term224174;

    public TodoCreator_listener_3012176712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224174 = newInstance(Class.forName("core.task.creator.TodoCreator"));
        setField(term224174, term224174.getClass(), "descriptionField", null);
        setField(term224174, term224174.getClass(), "durationBox", null);
        setIntField(term224174, term224174.getClass(), "defaultCloseOperation", 0);
        setField(term224174, term224174.getClass(), "rootPane", null);
        setBooleanField(term224174, term224174.getClass(), "rootPaneCheckingEnabled", false);
        setField(term224174, term224174.getClass(), "transferHandler", null);
        setField(term224174, term224174.getClass(), "accessibleContext", null);
        setBooleanField(term224174, term224174.getClass(), "resizable", false);
        setBooleanField(term224174, term224174.getClass(), "undecorated", false);
        setBooleanField(term224174, term224174.getClass(), "initialized", false);
        setBooleanField(term224174, term224174.getClass(), "modal", false);
        setField(term224174, term224174.getClass(), "modalityType", null);
        setField(term224174, term224174.getClass(), "blockedWindows", null);
        setField(term224174, term224174.getClass(), "title", null);
        setField(term224174, term224174.getClass(), "modalFilter", null);
        setField(term224174, term224174.getClass(), "secondaryLoop", null);
        setBooleanField(term224174, term224174.getClass(), "isInHide", false);
        setBooleanField(term224174, term224174.getClass(), "isInDispose", false);
        setField(term224174, term224174.getClass(), "warningString", null);
        setField(term224174, term224174.getClass(), "icons", null);
        setField(term224174, term224174.getClass(), "temporaryLostComponent", null);
        setBooleanField(term224174, term224174.getClass(), "syncLWRequests", false);
        setBooleanField(term224174, term224174.getClass(), "beforeFirstShow", false);
        setBooleanField(term224174, term224174.getClass(), "disposing", false);
        setField(term224174, term224174.getClass(), "disposerRecord", null);
        setIntField(term224174, term224174.getClass(), "state", 0);
        setBooleanField(term224174, term224174.getClass(), "alwaysOnTop", false);
        setField(term224174, term224174.getClass(), "ownedWindowList", null);
        setField(term224174, term224174.getClass(), "weakThis", null);
        setBooleanField(term224174, term224174.getClass(), "showWithParent", false);
        setField(term224174, term224174.getClass(), "modalBlocker", null);
        setField(term224174, term224174.getClass(), "modalExclusionType", null);
        setField(term224174, term224174.getClass(), "windowListener", null);
        setField(term224174, term224174.getClass(), "windowStateListener", null);
        setField(term224174, term224174.getClass(), "windowFocusListener", null);
        setField(term224174, term224174.getClass(), "inputContext", null);
        setField(term224174, term224174.getClass(), "inputContextLock", null);
        setField(term224174, term224174.getClass(), "focusMgr", null);
        setBooleanField(term224174, term224174.getClass(), "focusableWindowState", false);
        setBooleanField(term224174, term224174.getClass(), "autoRequestFocus", false);
        setBooleanField(term224174, term224174.getClass(), "isInShow", false);
        setFloatField(term224174, term224174.getClass(), "opacity", 0.0F);
        setField(term224174, term224174.getClass(), "shape", null);
        setBooleanField(term224174, term224174.getClass(), "isTrayIconWindow", false);
        setIntField(term224174, term224174.getClass(), "securityWarningWidth", 0);
        setIntField(term224174, term224174.getClass(), "securityWarningHeight", 0);
        setDoubleField(term224174, term224174.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term224174, term224174.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term224174, term224174.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term224174, term224174.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term224174, term224174.getClass(), "anchor", null);
        setField(term224174, term224174.getClass(), "type", null);
        setIntField(term224174, term224174.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term224174, term224174.getClass(), "locationByPlatform", false);
        setField(term224174, term224174.getClass(), "component", null);
        setField(term224174, term224174.getClass(), "layoutMgr", null);
        setField(term224174, term224174.getClass(), "dispatcher", null);
        setField(term224174, term224174.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term224174, term224174.getClass(), "focusCycleRoot", false);
        setBooleanField(term224174, term224174.getClass(), "focusTraversalPolicyProvider", false);
        setField(term224174, term224174.getClass(), "printingThreads", null);
        setBooleanField(term224174, term224174.getClass(), "printing", false);
        setField(term224174, term224174.getClass(), "containerListener", null);
        setIntField(term224174, term224174.getClass(), "listeningChildren", 0);
        setIntField(term224174, term224174.getClass(), "listeningBoundsChildren", 0);
        setIntField(term224174, term224174.getClass(), "descendantsCount", 0);
        setField(term224174, term224174.getClass(), "preserveBackgroundColor", null);
        setIntField(term224174, term224174.getClass(), "numOfHWComponents", 0);
        setIntField(term224174, term224174.getClass(), "numOfLWComponents", 0);
        setField(term224174, term224174.getClass(), "modalComp", null);
        setField(term224174, term224174.getClass(), "modalAppContext", null);
        setIntField(term224174, term224174.getClass(), "containerSerializedDataVersion", 0);
        setField(term224174, term224174.getClass(), "peer", null);
        setField(term224174, term224174.getClass(), "parent", null);
        setField(term224174, term224174.getClass(), "appContext", null);
        setIntField(term224174, term224174.getClass(), "x", 0);
        setIntField(term224174, term224174.getClass(), "y", 0);
        setIntField(term224174, term224174.getClass(), "width", 0);
        setIntField(term224174, term224174.getClass(), "height", 0);
        setField(term224174, term224174.getClass(), "foreground", null);
        setField(term224174, term224174.getClass(), "background", null);
        setField(term224174, term224174.getClass(), "font", null);
        setField(term224174, term224174.getClass(), "peerFont", null);
        setField(term224174, term224174.getClass(), "cursor", null);
        setField(term224174, term224174.getClass(), "locale", null);
        setField(term224174, term224174.getClass(), "graphicsConfig", null);
        setField(term224174, term224174.getClass(), "bufferStrategy", null);
        setBooleanField(term224174, term224174.getClass(), "ignoreRepaint", false);
        setBooleanField(term224174, term224174.getClass(), "visible", false);
        setBooleanField(term224174, term224174.getClass(), "enabled", false);
        setBooleanField(term224174, term224174.getClass(), "valid", false);
        setField(term224174, term224174.getClass(), "dropTarget", null);
        setField(term224174, term224174.getClass(), "popups", null);
        setField(term224174, term224174.getClass(), "name", null);
        setBooleanField(term224174, term224174.getClass(), "nameExplicitlySet", false);
        setBooleanField(term224174, term224174.getClass(), "focusable", false);
        setIntField(term224174, term224174.getClass(), "isFocusTraversableOverridden", 0);
        setField(term224174, term224174.getClass(), "focusTraversalKeys", null);
        setBooleanField(term224174, term224174.getClass(), "focusTraversalKeysEnabled", false);
        setField(term224174, term224174.getClass(), "acc", null);
        setField(term224174, term224174.getClass(), "minSize", null);
        setBooleanField(term224174, term224174.getClass(), "minSizeSet", false);
        setField(term224174, term224174.getClass(), "prefSize", null);
        setBooleanField(term224174, term224174.getClass(), "prefSizeSet", false);
        setField(term224174, term224174.getClass(), "maxSize", null);
        setBooleanField(term224174, term224174.getClass(), "maxSizeSet", false);
        setField(term224174, term224174.getClass(), "componentOrientation", null);
        setBooleanField(term224174, term224174.getClass(), "newEventsOnly", false);
        setField(term224174, term224174.getClass(), "componentListener", null);
        setField(term224174, term224174.getClass(), "focusListener", null);
        setField(term224174, term224174.getClass(), "hierarchyListener", null);
        setField(term224174, term224174.getClass(), "hierarchyBoundsListener", null);
        setField(term224174, term224174.getClass(), "keyListener", null);
        setField(term224174, term224174.getClass(), "mouseListener", null);
        setField(term224174, term224174.getClass(), "mouseMotionListener", null);
        setField(term224174, term224174.getClass(), "mouseWheelListener", null);
        setField(term224174, term224174.getClass(), "inputMethodListener", null);
        setLongField(term224174, term224174.getClass(), "eventMask", 0L);
        setField(term224174, term224174.getClass(), "changeSupport", null);
        setField(term224174, term224174.getClass(), "objectLock", null);
        setBooleanField(term224174, term224174.getClass(), "isPacked", false);
        setIntField(term224174, term224174.getClass(), "boundsOp", 0);
        setField(term224174, term224174.getClass(), "compoundShape", null);
        setField(term224174, term224174.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term224174, term224174.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term224174, term224174.getClass(), "backgroundEraseDisabled", false);
        setField(term224174, term224174.getClass(), "eventCache", null);
        setBooleanField(term224174, term224174.getClass(), "coalescingEnabled", false);
        setBooleanField(term224174, term224174.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term224174, term224174.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.TodoCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "listener", argTypes, term224174, args);
    }

};


