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
     Object term68796;

    public AssignmentCreator_getProvidedDeadLine_101532842016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68796 = newInstance(Class.forName("core.task.creator.AssignmentCreator"));
        setField(term68796, term68796.getClass(), "nameField", null);
        setField(term68796, term68796.getClass(), "groupChoice", null);
        setField(term68796, term68796.getClass(), "questionArea", null);
        setField(term68796, term68796.getClass(), "modes", null);
        setField(term68796, term68796.getClass(), "meanValue", null);
        setField(term68796, term68796.getClass(), "dField", null);
        setField(term68796, term68796.getClass(), "mField", null);
        setField(term68796, term68796.getClass(), "yField", null);
        setIntField(term68796, term68796.getClass(), "defaultCloseOperation", 0);
        setField(term68796, term68796.getClass(), "rootPane", null);
        setBooleanField(term68796, term68796.getClass(), "rootPaneCheckingEnabled", false);
        setField(term68796, term68796.getClass(), "transferHandler", null);
        setField(term68796, term68796.getClass(), "accessibleContext", null);
        setBooleanField(term68796, term68796.getClass(), "resizable", false);
        setBooleanField(term68796, term68796.getClass(), "undecorated", false);
        setBooleanField(term68796, term68796.getClass(), "initialized", false);
        setBooleanField(term68796, term68796.getClass(), "modal", false);
        setField(term68796, term68796.getClass(), "modalityType", null);
        setField(term68796, term68796.getClass(), "blockedWindows", null);
        setField(term68796, term68796.getClass(), "title", null);
        setField(term68796, term68796.getClass(), "modalFilter", null);
        setField(term68796, term68796.getClass(), "secondaryLoop", null);
        setBooleanField(term68796, term68796.getClass(), "isInHide", false);
        setBooleanField(term68796, term68796.getClass(), "isInDispose", false);
        setField(term68796, term68796.getClass(), "warningString", null);
        setField(term68796, term68796.getClass(), "icons", null);
        setField(term68796, term68796.getClass(), "temporaryLostComponent", null);
        setBooleanField(term68796, term68796.getClass(), "syncLWRequests", false);
        setBooleanField(term68796, term68796.getClass(), "beforeFirstShow", false);
        setBooleanField(term68796, term68796.getClass(), "disposing", false);
        setField(term68796, term68796.getClass(), "disposerRecord", null);
        setIntField(term68796, term68796.getClass(), "state", 0);
        setBooleanField(term68796, term68796.getClass(), "alwaysOnTop", false);
        setField(term68796, term68796.getClass(), "ownedWindowList", null);
        setField(term68796, term68796.getClass(), "weakThis", null);
        setBooleanField(term68796, term68796.getClass(), "showWithParent", false);
        setField(term68796, term68796.getClass(), "modalBlocker", null);
        setField(term68796, term68796.getClass(), "modalExclusionType", null);
        setField(term68796, term68796.getClass(), "windowListener", null);
        setField(term68796, term68796.getClass(), "windowStateListener", null);
        setField(term68796, term68796.getClass(), "windowFocusListener", null);
        setField(term68796, term68796.getClass(), "inputContext", null);
        setField(term68796, term68796.getClass(), "inputContextLock", null);
        setField(term68796, term68796.getClass(), "focusMgr", null);
        setBooleanField(term68796, term68796.getClass(), "focusableWindowState", false);
        setBooleanField(term68796, term68796.getClass(), "autoRequestFocus", false);
        setBooleanField(term68796, term68796.getClass(), "isInShow", false);
        setFloatField(term68796, term68796.getClass(), "opacity", 0.0F);
        setField(term68796, term68796.getClass(), "shape", null);
        setBooleanField(term68796, term68796.getClass(), "isTrayIconWindow", false);
        setIntField(term68796, term68796.getClass(), "securityWarningWidth", 0);
        setIntField(term68796, term68796.getClass(), "securityWarningHeight", 0);
        setDoubleField(term68796, term68796.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term68796, term68796.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term68796, term68796.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term68796, term68796.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term68796, term68796.getClass(), "anchor", null);
        setField(term68796, term68796.getClass(), "type", null);
        setIntField(term68796, term68796.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term68796, term68796.getClass(), "locationByPlatform", false);
        setField(term68796, term68796.getClass(), "component", null);
        setField(term68796, term68796.getClass(), "layoutMgr", null);
        setField(term68796, term68796.getClass(), "dispatcher", null);
        setField(term68796, term68796.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term68796, term68796.getClass(), "focusCycleRoot", false);
        setBooleanField(term68796, term68796.getClass(), "focusTraversalPolicyProvider", false);
        setField(term68796, term68796.getClass(), "printingThreads", null);
        setBooleanField(term68796, term68796.getClass(), "printing", false);
        setField(term68796, term68796.getClass(), "containerListener", null);
        setIntField(term68796, term68796.getClass(), "listeningChildren", 0);
        setIntField(term68796, term68796.getClass(), "listeningBoundsChildren", 0);
        setIntField(term68796, term68796.getClass(), "descendantsCount", 0);
        setField(term68796, term68796.getClass(), "preserveBackgroundColor", null);
        setIntField(term68796, term68796.getClass(), "numOfHWComponents", 0);
        setIntField(term68796, term68796.getClass(), "numOfLWComponents", 0);
        setField(term68796, term68796.getClass(), "modalComp", null);
        setField(term68796, term68796.getClass(), "modalAppContext", null);
        setIntField(term68796, term68796.getClass(), "containerSerializedDataVersion", 0);
        setField(term68796, term68796.getClass(), "peer", null);
        setField(term68796, term68796.getClass(), "parent", null);
        setField(term68796, term68796.getClass(), "appContext", null);
        setIntField(term68796, term68796.getClass(), "x", 0);
        setIntField(term68796, term68796.getClass(), "y", 0);
        setIntField(term68796, term68796.getClass(), "width", 0);
        setIntField(term68796, term68796.getClass(), "height", 0);
        setField(term68796, term68796.getClass(), "foreground", null);
        setField(term68796, term68796.getClass(), "background", null);
        setField(term68796, term68796.getClass(), "font", null);
        setField(term68796, term68796.getClass(), "peerFont", null);
        setField(term68796, term68796.getClass(), "cursor", null);
        setField(term68796, term68796.getClass(), "locale", null);
        setField(term68796, term68796.getClass(), "graphicsConfig", null);
        setField(term68796, term68796.getClass(), "bufferStrategy", null);
        setBooleanField(term68796, term68796.getClass(), "ignoreRepaint", false);
        setBooleanField(term68796, term68796.getClass(), "visible", false);
        setBooleanField(term68796, term68796.getClass(), "enabled", false);
        setBooleanField(term68796, term68796.getClass(), "valid", false);
        setField(term68796, term68796.getClass(), "dropTarget", null);
        setField(term68796, term68796.getClass(), "popups", null);
        setField(term68796, term68796.getClass(), "name", null);
        setBooleanField(term68796, term68796.getClass(), "nameExplicitlySet", false);
        setBooleanField(term68796, term68796.getClass(), "focusable", false);
        setIntField(term68796, term68796.getClass(), "isFocusTraversableOverridden", 0);
        setField(term68796, term68796.getClass(), "focusTraversalKeys", null);
        setBooleanField(term68796, term68796.getClass(), "focusTraversalKeysEnabled", false);
        setField(term68796, term68796.getClass(), "acc", null);
        setField(term68796, term68796.getClass(), "minSize", null);
        setBooleanField(term68796, term68796.getClass(), "minSizeSet", false);
        setField(term68796, term68796.getClass(), "prefSize", null);
        setBooleanField(term68796, term68796.getClass(), "prefSizeSet", false);
        setField(term68796, term68796.getClass(), "maxSize", null);
        setBooleanField(term68796, term68796.getClass(), "maxSizeSet", false);
        setField(term68796, term68796.getClass(), "componentOrientation", null);
        setBooleanField(term68796, term68796.getClass(), "newEventsOnly", false);
        setField(term68796, term68796.getClass(), "componentListener", null);
        setField(term68796, term68796.getClass(), "focusListener", null);
        setField(term68796, term68796.getClass(), "hierarchyListener", null);
        setField(term68796, term68796.getClass(), "hierarchyBoundsListener", null);
        setField(term68796, term68796.getClass(), "keyListener", null);
        setField(term68796, term68796.getClass(), "mouseListener", null);
        setField(term68796, term68796.getClass(), "mouseMotionListener", null);
        setField(term68796, term68796.getClass(), "mouseWheelListener", null);
        setField(term68796, term68796.getClass(), "inputMethodListener", null);
        setLongField(term68796, term68796.getClass(), "eventMask", 0L);
        setField(term68796, term68796.getClass(), "changeSupport", null);
        setField(term68796, term68796.getClass(), "objectLock", null);
        setBooleanField(term68796, term68796.getClass(), "isPacked", false);
        setIntField(term68796, term68796.getClass(), "boundsOp", 0);
        setField(term68796, term68796.getClass(), "compoundShape", null);
        setField(term68796, term68796.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term68796, term68796.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term68796, term68796.getClass(), "backgroundEraseDisabled", false);
        setField(term68796, term68796.getClass(), "eventCache", null);
        setBooleanField(term68796, term68796.getClass(), "coalescingEnabled", false);
        setBooleanField(term68796, term68796.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term68796, term68796.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.AssignmentCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProvidedDeadLine", argTypes, term68796, args);
    }

};


