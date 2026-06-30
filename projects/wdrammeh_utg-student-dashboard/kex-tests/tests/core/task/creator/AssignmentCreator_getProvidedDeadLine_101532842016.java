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
     Object term33866;

    public AssignmentCreator_getProvidedDeadLine_101532842016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33866 = newInstance(Class.forName("core.task.creator.AssignmentCreator"));
        setField(term33866, term33866.getClass(), "nameField", null);
        setField(term33866, term33866.getClass(), "groupChoice", null);
        setField(term33866, term33866.getClass(), "questionArea", null);
        setField(term33866, term33866.getClass(), "modes", null);
        setField(term33866, term33866.getClass(), "meanValue", null);
        setField(term33866, term33866.getClass(), "dField", null);
        setField(term33866, term33866.getClass(), "mField", null);
        setField(term33866, term33866.getClass(), "yField", null);
        setIntField(term33866, term33866.getClass(), "defaultCloseOperation", 0);
        setField(term33866, term33866.getClass(), "rootPane", null);
        setBooleanField(term33866, term33866.getClass(), "rootPaneCheckingEnabled", false);
        setField(term33866, term33866.getClass(), "transferHandler", null);
        setField(term33866, term33866.getClass(), "accessibleContext", null);
        setBooleanField(term33866, term33866.getClass(), "resizable", false);
        setBooleanField(term33866, term33866.getClass(), "undecorated", false);
        setBooleanField(term33866, term33866.getClass(), "initialized", false);
        setBooleanField(term33866, term33866.getClass(), "modal", false);
        setField(term33866, term33866.getClass(), "modalityType", null);
        setField(term33866, term33866.getClass(), "blockedWindows", null);
        setField(term33866, term33866.getClass(), "title", null);
        setField(term33866, term33866.getClass(), "modalFilter", null);
        setField(term33866, term33866.getClass(), "secondaryLoop", null);
        setBooleanField(term33866, term33866.getClass(), "isInHide", false);
        setBooleanField(term33866, term33866.getClass(), "isInDispose", false);
        setField(term33866, term33866.getClass(), "warningString", null);
        setField(term33866, term33866.getClass(), "icons", null);
        setField(term33866, term33866.getClass(), "temporaryLostComponent", null);
        setBooleanField(term33866, term33866.getClass(), "syncLWRequests", false);
        setBooleanField(term33866, term33866.getClass(), "beforeFirstShow", false);
        setBooleanField(term33866, term33866.getClass(), "disposing", false);
        setField(term33866, term33866.getClass(), "disposerRecord", null);
        setIntField(term33866, term33866.getClass(), "state", 0);
        setBooleanField(term33866, term33866.getClass(), "alwaysOnTop", false);
        setField(term33866, term33866.getClass(), "ownedWindowList", null);
        setField(term33866, term33866.getClass(), "weakThis", null);
        setBooleanField(term33866, term33866.getClass(), "showWithParent", false);
        setField(term33866, term33866.getClass(), "modalBlocker", null);
        setField(term33866, term33866.getClass(), "modalExclusionType", null);
        setField(term33866, term33866.getClass(), "windowListener", null);
        setField(term33866, term33866.getClass(), "windowStateListener", null);
        setField(term33866, term33866.getClass(), "windowFocusListener", null);
        setField(term33866, term33866.getClass(), "inputContext", null);
        setField(term33866, term33866.getClass(), "inputContextLock", null);
        setField(term33866, term33866.getClass(), "focusMgr", null);
        setBooleanField(term33866, term33866.getClass(), "focusableWindowState", false);
        setBooleanField(term33866, term33866.getClass(), "autoRequestFocus", false);
        setBooleanField(term33866, term33866.getClass(), "isInShow", false);
        setFloatField(term33866, term33866.getClass(), "opacity", 0.0F);
        setField(term33866, term33866.getClass(), "shape", null);
        setBooleanField(term33866, term33866.getClass(), "isTrayIconWindow", false);
        setIntField(term33866, term33866.getClass(), "securityWarningWidth", 0);
        setIntField(term33866, term33866.getClass(), "securityWarningHeight", 0);
        setDoubleField(term33866, term33866.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term33866, term33866.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term33866, term33866.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term33866, term33866.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term33866, term33866.getClass(), "anchor", null);
        setField(term33866, term33866.getClass(), "type", null);
        setIntField(term33866, term33866.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term33866, term33866.getClass(), "locationByPlatform", false);
        setField(term33866, term33866.getClass(), "component", null);
        setField(term33866, term33866.getClass(), "layoutMgr", null);
        setField(term33866, term33866.getClass(), "dispatcher", null);
        setField(term33866, term33866.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term33866, term33866.getClass(), "focusCycleRoot", false);
        setBooleanField(term33866, term33866.getClass(), "focusTraversalPolicyProvider", false);
        setField(term33866, term33866.getClass(), "printingThreads", null);
        setBooleanField(term33866, term33866.getClass(), "printing", false);
        setField(term33866, term33866.getClass(), "containerListener", null);
        setIntField(term33866, term33866.getClass(), "listeningChildren", 0);
        setIntField(term33866, term33866.getClass(), "listeningBoundsChildren", 0);
        setIntField(term33866, term33866.getClass(), "descendantsCount", 0);
        setField(term33866, term33866.getClass(), "preserveBackgroundColor", null);
        setIntField(term33866, term33866.getClass(), "numOfHWComponents", 0);
        setIntField(term33866, term33866.getClass(), "numOfLWComponents", 0);
        setField(term33866, term33866.getClass(), "modalComp", null);
        setField(term33866, term33866.getClass(), "modalAppContext", null);
        setIntField(term33866, term33866.getClass(), "containerSerializedDataVersion", 0);
        setField(term33866, term33866.getClass(), "peer", null);
        setField(term33866, term33866.getClass(), "parent", null);
        setField(term33866, term33866.getClass(), "appContext", null);
        setIntField(term33866, term33866.getClass(), "x", 0);
        setIntField(term33866, term33866.getClass(), "y", 0);
        setIntField(term33866, term33866.getClass(), "width", 0);
        setIntField(term33866, term33866.getClass(), "height", 0);
        setField(term33866, term33866.getClass(), "foreground", null);
        setField(term33866, term33866.getClass(), "background", null);
        setField(term33866, term33866.getClass(), "font", null);
        setField(term33866, term33866.getClass(), "peerFont", null);
        setField(term33866, term33866.getClass(), "cursor", null);
        setField(term33866, term33866.getClass(), "locale", null);
        setField(term33866, term33866.getClass(), "graphicsConfig", null);
        setField(term33866, term33866.getClass(), "bufferStrategy", null);
        setBooleanField(term33866, term33866.getClass(), "ignoreRepaint", false);
        setBooleanField(term33866, term33866.getClass(), "visible", false);
        setBooleanField(term33866, term33866.getClass(), "enabled", false);
        setBooleanField(term33866, term33866.getClass(), "valid", false);
        setField(term33866, term33866.getClass(), "dropTarget", null);
        setField(term33866, term33866.getClass(), "popups", null);
        setField(term33866, term33866.getClass(), "name", null);
        setBooleanField(term33866, term33866.getClass(), "nameExplicitlySet", false);
        setBooleanField(term33866, term33866.getClass(), "focusable", false);
        setIntField(term33866, term33866.getClass(), "isFocusTraversableOverridden", 0);
        setField(term33866, term33866.getClass(), "focusTraversalKeys", null);
        setBooleanField(term33866, term33866.getClass(), "focusTraversalKeysEnabled", false);
        setField(term33866, term33866.getClass(), "acc", null);
        setField(term33866, term33866.getClass(), "minSize", null);
        setBooleanField(term33866, term33866.getClass(), "minSizeSet", false);
        setField(term33866, term33866.getClass(), "prefSize", null);
        setBooleanField(term33866, term33866.getClass(), "prefSizeSet", false);
        setField(term33866, term33866.getClass(), "maxSize", null);
        setBooleanField(term33866, term33866.getClass(), "maxSizeSet", false);
        setField(term33866, term33866.getClass(), "componentOrientation", null);
        setBooleanField(term33866, term33866.getClass(), "newEventsOnly", false);
        setField(term33866, term33866.getClass(), "componentListener", null);
        setField(term33866, term33866.getClass(), "focusListener", null);
        setField(term33866, term33866.getClass(), "hierarchyListener", null);
        setField(term33866, term33866.getClass(), "hierarchyBoundsListener", null);
        setField(term33866, term33866.getClass(), "keyListener", null);
        setField(term33866, term33866.getClass(), "mouseListener", null);
        setField(term33866, term33866.getClass(), "mouseMotionListener", null);
        setField(term33866, term33866.getClass(), "mouseWheelListener", null);
        setField(term33866, term33866.getClass(), "inputMethodListener", null);
        setLongField(term33866, term33866.getClass(), "eventMask", 0L);
        setField(term33866, term33866.getClass(), "changeSupport", null);
        setField(term33866, term33866.getClass(), "objectLock", null);
        setBooleanField(term33866, term33866.getClass(), "isPacked", false);
        setIntField(term33866, term33866.getClass(), "boundsOp", 0);
        setField(term33866, term33866.getClass(), "compoundShape", null);
        setField(term33866, term33866.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term33866, term33866.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term33866, term33866.getClass(), "backgroundEraseDisabled", false);
        setField(term33866, term33866.getClass(), "eventCache", null);
        setBooleanField(term33866, term33866.getClass(), "coalescingEnabled", false);
        setBooleanField(term33866, term33866.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term33866, term33866.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.AssignmentCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProvidedDeadLine", argTypes, term33866, args);
    }

};


