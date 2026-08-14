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

public class AssignmentCreator_getProvidedDeadLine_101532842016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33868;

    public AssignmentCreator_getProvidedDeadLine_101532842016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33868 = newInstance(Class.forName("core.task.creator.AssignmentCreator"));
        setField(term33868, term33868.getClass(), "nameField", null);
        setField(term33868, term33868.getClass(), "groupChoice", null);
        setField(term33868, term33868.getClass(), "questionArea", null);
        setField(term33868, term33868.getClass(), "modes", null);
        setField(term33868, term33868.getClass(), "meanValue", null);
        setField(term33868, term33868.getClass(), "dField", null);
        setField(term33868, term33868.getClass(), "mField", null);
        setField(term33868, term33868.getClass(), "yField", null);
        setIntField(term33868, term33868.getClass(), "defaultCloseOperation", 0);
        setField(term33868, term33868.getClass(), "rootPane", null);
        setBooleanField(term33868, term33868.getClass(), "rootPaneCheckingEnabled", false);
        setField(term33868, term33868.getClass(), "transferHandler", null);
        setField(term33868, term33868.getClass(), "accessibleContext", null);
        setBooleanField(term33868, term33868.getClass(), "resizable", false);
        setBooleanField(term33868, term33868.getClass(), "undecorated", false);
        setBooleanField(term33868, term33868.getClass(), "initialized", false);
        setBooleanField(term33868, term33868.getClass(), "modal", false);
        setField(term33868, term33868.getClass(), "modalityType", null);
        setField(term33868, term33868.getClass(), "blockedWindows", null);
        setField(term33868, term33868.getClass(), "title", null);
        setField(term33868, term33868.getClass(), "modalFilter", null);
        setField(term33868, term33868.getClass(), "secondaryLoop", null);
        setBooleanField(term33868, term33868.getClass(), "isInHide", false);
        setBooleanField(term33868, term33868.getClass(), "isInDispose", false);
        setField(term33868, term33868.getClass(), "warningString", null);
        setField(term33868, term33868.getClass(), "icons", null);
        setField(term33868, term33868.getClass(), "temporaryLostComponent", null);
        setBooleanField(term33868, term33868.getClass(), "syncLWRequests", false);
        setBooleanField(term33868, term33868.getClass(), "beforeFirstShow", false);
        setBooleanField(term33868, term33868.getClass(), "disposing", false);
        setField(term33868, term33868.getClass(), "disposerRecord", null);
        setIntField(term33868, term33868.getClass(), "state", 0);
        setBooleanField(term33868, term33868.getClass(), "alwaysOnTop", false);
        setField(term33868, term33868.getClass(), "ownedWindowList", null);
        setField(term33868, term33868.getClass(), "weakThis", null);
        setBooleanField(term33868, term33868.getClass(), "showWithParent", false);
        setField(term33868, term33868.getClass(), "modalBlocker", null);
        setField(term33868, term33868.getClass(), "modalExclusionType", null);
        setField(term33868, term33868.getClass(), "windowListener", null);
        setField(term33868, term33868.getClass(), "windowStateListener", null);
        setField(term33868, term33868.getClass(), "windowFocusListener", null);
        setField(term33868, term33868.getClass(), "inputContext", null);
        setField(term33868, term33868.getClass(), "inputContextLock", null);
        setField(term33868, term33868.getClass(), "focusMgr", null);
        setBooleanField(term33868, term33868.getClass(), "focusableWindowState", false);
        setBooleanField(term33868, term33868.getClass(), "autoRequestFocus", false);
        setBooleanField(term33868, term33868.getClass(), "isInShow", false);
        setFloatField(term33868, term33868.getClass(), "opacity", 0.0F);
        setField(term33868, term33868.getClass(), "shape", null);
        setBooleanField(term33868, term33868.getClass(), "isTrayIconWindow", false);
        setIntField(term33868, term33868.getClass(), "securityWarningWidth", 0);
        setIntField(term33868, term33868.getClass(), "securityWarningHeight", 0);
        setDoubleField(term33868, term33868.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term33868, term33868.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term33868, term33868.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term33868, term33868.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term33868, term33868.getClass(), "anchor", null);
        setField(term33868, term33868.getClass(), "type", null);
        setIntField(term33868, term33868.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term33868, term33868.getClass(), "locationByPlatform", false);
        setField(term33868, term33868.getClass(), "component", null);
        setField(term33868, term33868.getClass(), "layoutMgr", null);
        setField(term33868, term33868.getClass(), "dispatcher", null);
        setField(term33868, term33868.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term33868, term33868.getClass(), "focusCycleRoot", false);
        setBooleanField(term33868, term33868.getClass(), "focusTraversalPolicyProvider", false);
        setField(term33868, term33868.getClass(), "printingThreads", null);
        setBooleanField(term33868, term33868.getClass(), "printing", false);
        setField(term33868, term33868.getClass(), "containerListener", null);
        setIntField(term33868, term33868.getClass(), "listeningChildren", 0);
        setIntField(term33868, term33868.getClass(), "listeningBoundsChildren", 0);
        setIntField(term33868, term33868.getClass(), "descendantsCount", 0);
        setField(term33868, term33868.getClass(), "preserveBackgroundColor", null);
        setIntField(term33868, term33868.getClass(), "numOfHWComponents", 0);
        setIntField(term33868, term33868.getClass(), "numOfLWComponents", 0);
        setField(term33868, term33868.getClass(), "modalComp", null);
        setField(term33868, term33868.getClass(), "modalAppContext", null);
        setIntField(term33868, term33868.getClass(), "containerSerializedDataVersion", 0);
        setField(term33868, term33868.getClass(), "peer", null);
        setField(term33868, term33868.getClass(), "parent", null);
        setField(term33868, term33868.getClass(), "appContext", null);
        setIntField(term33868, term33868.getClass(), "x", 0);
        setIntField(term33868, term33868.getClass(), "y", 0);
        setIntField(term33868, term33868.getClass(), "width", 0);
        setIntField(term33868, term33868.getClass(), "height", 0);
        setField(term33868, term33868.getClass(), "foreground", null);
        setField(term33868, term33868.getClass(), "background", null);
        setField(term33868, term33868.getClass(), "font", null);
        setField(term33868, term33868.getClass(), "peerFont", null);
        setField(term33868, term33868.getClass(), "cursor", null);
        setField(term33868, term33868.getClass(), "locale", null);
        setField(term33868, term33868.getClass(), "graphicsConfig", null);
        setField(term33868, term33868.getClass(), "bufferStrategy", null);
        setBooleanField(term33868, term33868.getClass(), "ignoreRepaint", false);
        setBooleanField(term33868, term33868.getClass(), "visible", false);
        setBooleanField(term33868, term33868.getClass(), "enabled", false);
        setBooleanField(term33868, term33868.getClass(), "valid", false);
        setField(term33868, term33868.getClass(), "dropTarget", null);
        setField(term33868, term33868.getClass(), "popups", null);
        setField(term33868, term33868.getClass(), "name", null);
        setBooleanField(term33868, term33868.getClass(), "nameExplicitlySet", false);
        setBooleanField(term33868, term33868.getClass(), "focusable", false);
        setIntField(term33868, term33868.getClass(), "isFocusTraversableOverridden", 0);
        setField(term33868, term33868.getClass(), "focusTraversalKeys", null);
        setBooleanField(term33868, term33868.getClass(), "focusTraversalKeysEnabled", false);
        setField(term33868, term33868.getClass(), "acc", null);
        setField(term33868, term33868.getClass(), "minSize", null);
        setBooleanField(term33868, term33868.getClass(), "minSizeSet", false);
        setField(term33868, term33868.getClass(), "prefSize", null);
        setBooleanField(term33868, term33868.getClass(), "prefSizeSet", false);
        setField(term33868, term33868.getClass(), "maxSize", null);
        setBooleanField(term33868, term33868.getClass(), "maxSizeSet", false);
        setField(term33868, term33868.getClass(), "componentOrientation", null);
        setBooleanField(term33868, term33868.getClass(), "newEventsOnly", false);
        setField(term33868, term33868.getClass(), "componentListener", null);
        setField(term33868, term33868.getClass(), "focusListener", null);
        setField(term33868, term33868.getClass(), "hierarchyListener", null);
        setField(term33868, term33868.getClass(), "hierarchyBoundsListener", null);
        setField(term33868, term33868.getClass(), "keyListener", null);
        setField(term33868, term33868.getClass(), "mouseListener", null);
        setField(term33868, term33868.getClass(), "mouseMotionListener", null);
        setField(term33868, term33868.getClass(), "mouseWheelListener", null);
        setField(term33868, term33868.getClass(), "inputMethodListener", null);
        setLongField(term33868, term33868.getClass(), "eventMask", 0L);
        setField(term33868, term33868.getClass(), "changeSupport", null);
        setField(term33868, term33868.getClass(), "objectLock", null);
        setBooleanField(term33868, term33868.getClass(), "isPacked", false);
        setIntField(term33868, term33868.getClass(), "boundsOp", 0);
        setField(term33868, term33868.getClass(), "compoundShape", null);
        setField(term33868, term33868.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term33868, term33868.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term33868, term33868.getClass(), "backgroundEraseDisabled", false);
        setField(term33868, term33868.getClass(), "eventCache", null);
        setBooleanField(term33868, term33868.getClass(), "coalescingEnabled", false);
        setBooleanField(term33868, term33868.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term33868, term33868.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.AssignmentCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProvidedDeadLine", argTypes, term33868, args);
    }

};


