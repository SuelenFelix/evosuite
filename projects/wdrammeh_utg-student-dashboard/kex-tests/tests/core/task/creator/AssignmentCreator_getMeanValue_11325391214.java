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

public class AssignmentCreator_getMeanValue_11325391214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30163;

    public AssignmentCreator_getMeanValue_11325391214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30163 = newInstance(Class.forName("core.task.creator.AssignmentCreator"));
        setField(term30163, term30163.getClass(), "nameField", null);
        setField(term30163, term30163.getClass(), "groupChoice", null);
        setField(term30163, term30163.getClass(), "questionArea", null);
        setField(term30163, term30163.getClass(), "modes", null);
        setField(term30163, term30163.getClass(), "meanValue", null);
        setField(term30163, term30163.getClass(), "dField", null);
        setField(term30163, term30163.getClass(), "mField", null);
        setField(term30163, term30163.getClass(), "yField", null);
        setIntField(term30163, term30163.getClass(), "defaultCloseOperation", 0);
        setField(term30163, term30163.getClass(), "rootPane", null);
        setBooleanField(term30163, term30163.getClass(), "rootPaneCheckingEnabled", false);
        setField(term30163, term30163.getClass(), "transferHandler", null);
        setField(term30163, term30163.getClass(), "accessibleContext", null);
        setBooleanField(term30163, term30163.getClass(), "resizable", false);
        setBooleanField(term30163, term30163.getClass(), "undecorated", false);
        setBooleanField(term30163, term30163.getClass(), "initialized", false);
        setBooleanField(term30163, term30163.getClass(), "modal", false);
        setField(term30163, term30163.getClass(), "modalityType", null);
        setField(term30163, term30163.getClass(), "blockedWindows", null);
        setField(term30163, term30163.getClass(), "title", null);
        setField(term30163, term30163.getClass(), "modalFilter", null);
        setField(term30163, term30163.getClass(), "secondaryLoop", null);
        setBooleanField(term30163, term30163.getClass(), "isInHide", false);
        setBooleanField(term30163, term30163.getClass(), "isInDispose", false);
        setField(term30163, term30163.getClass(), "warningString", null);
        setField(term30163, term30163.getClass(), "icons", null);
        setField(term30163, term30163.getClass(), "temporaryLostComponent", null);
        setBooleanField(term30163, term30163.getClass(), "syncLWRequests", false);
        setBooleanField(term30163, term30163.getClass(), "beforeFirstShow", false);
        setBooleanField(term30163, term30163.getClass(), "disposing", false);
        setField(term30163, term30163.getClass(), "disposerRecord", null);
        setIntField(term30163, term30163.getClass(), "state", 0);
        setBooleanField(term30163, term30163.getClass(), "alwaysOnTop", false);
        setField(term30163, term30163.getClass(), "ownedWindowList", null);
        setField(term30163, term30163.getClass(), "weakThis", null);
        setBooleanField(term30163, term30163.getClass(), "showWithParent", false);
        setField(term30163, term30163.getClass(), "modalBlocker", null);
        setField(term30163, term30163.getClass(), "modalExclusionType", null);
        setField(term30163, term30163.getClass(), "windowListener", null);
        setField(term30163, term30163.getClass(), "windowStateListener", null);
        setField(term30163, term30163.getClass(), "windowFocusListener", null);
        setField(term30163, term30163.getClass(), "inputContext", null);
        setField(term30163, term30163.getClass(), "inputContextLock", null);
        setField(term30163, term30163.getClass(), "focusMgr", null);
        setBooleanField(term30163, term30163.getClass(), "focusableWindowState", false);
        setBooleanField(term30163, term30163.getClass(), "autoRequestFocus", false);
        setBooleanField(term30163, term30163.getClass(), "isInShow", false);
        setFloatField(term30163, term30163.getClass(), "opacity", 0.0F);
        setField(term30163, term30163.getClass(), "shape", null);
        setBooleanField(term30163, term30163.getClass(), "isTrayIconWindow", false);
        setIntField(term30163, term30163.getClass(), "securityWarningWidth", 0);
        setIntField(term30163, term30163.getClass(), "securityWarningHeight", 0);
        setDoubleField(term30163, term30163.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term30163, term30163.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term30163, term30163.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term30163, term30163.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term30163, term30163.getClass(), "anchor", null);
        setField(term30163, term30163.getClass(), "type", null);
        setIntField(term30163, term30163.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term30163, term30163.getClass(), "locationByPlatform", false);
        setField(term30163, term30163.getClass(), "component", null);
        setField(term30163, term30163.getClass(), "layoutMgr", null);
        setField(term30163, term30163.getClass(), "dispatcher", null);
        setField(term30163, term30163.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term30163, term30163.getClass(), "focusCycleRoot", false);
        setBooleanField(term30163, term30163.getClass(), "focusTraversalPolicyProvider", false);
        setField(term30163, term30163.getClass(), "printingThreads", null);
        setBooleanField(term30163, term30163.getClass(), "printing", false);
        setField(term30163, term30163.getClass(), "containerListener", null);
        setIntField(term30163, term30163.getClass(), "listeningChildren", 0);
        setIntField(term30163, term30163.getClass(), "listeningBoundsChildren", 0);
        setIntField(term30163, term30163.getClass(), "descendantsCount", 0);
        setField(term30163, term30163.getClass(), "preserveBackgroundColor", null);
        setIntField(term30163, term30163.getClass(), "numOfHWComponents", 0);
        setIntField(term30163, term30163.getClass(), "numOfLWComponents", 0);
        setField(term30163, term30163.getClass(), "modalComp", null);
        setField(term30163, term30163.getClass(), "modalAppContext", null);
        setIntField(term30163, term30163.getClass(), "containerSerializedDataVersion", 0);
        setField(term30163, term30163.getClass(), "peer", null);
        setField(term30163, term30163.getClass(), "parent", null);
        setField(term30163, term30163.getClass(), "appContext", null);
        setIntField(term30163, term30163.getClass(), "x", 0);
        setIntField(term30163, term30163.getClass(), "y", 0);
        setIntField(term30163, term30163.getClass(), "width", 0);
        setIntField(term30163, term30163.getClass(), "height", 0);
        setField(term30163, term30163.getClass(), "foreground", null);
        setField(term30163, term30163.getClass(), "background", null);
        setField(term30163, term30163.getClass(), "font", null);
        setField(term30163, term30163.getClass(), "peerFont", null);
        setField(term30163, term30163.getClass(), "cursor", null);
        setField(term30163, term30163.getClass(), "locale", null);
        setField(term30163, term30163.getClass(), "graphicsConfig", null);
        setField(term30163, term30163.getClass(), "bufferStrategy", null);
        setBooleanField(term30163, term30163.getClass(), "ignoreRepaint", false);
        setBooleanField(term30163, term30163.getClass(), "visible", false);
        setBooleanField(term30163, term30163.getClass(), "enabled", false);
        setBooleanField(term30163, term30163.getClass(), "valid", false);
        setField(term30163, term30163.getClass(), "dropTarget", null);
        setField(term30163, term30163.getClass(), "popups", null);
        setField(term30163, term30163.getClass(), "name", null);
        setBooleanField(term30163, term30163.getClass(), "nameExplicitlySet", false);
        setBooleanField(term30163, term30163.getClass(), "focusable", false);
        setIntField(term30163, term30163.getClass(), "isFocusTraversableOverridden", 0);
        setField(term30163, term30163.getClass(), "focusTraversalKeys", null);
        setBooleanField(term30163, term30163.getClass(), "focusTraversalKeysEnabled", false);
        setField(term30163, term30163.getClass(), "acc", null);
        setField(term30163, term30163.getClass(), "minSize", null);
        setBooleanField(term30163, term30163.getClass(), "minSizeSet", false);
        setField(term30163, term30163.getClass(), "prefSize", null);
        setBooleanField(term30163, term30163.getClass(), "prefSizeSet", false);
        setField(term30163, term30163.getClass(), "maxSize", null);
        setBooleanField(term30163, term30163.getClass(), "maxSizeSet", false);
        setField(term30163, term30163.getClass(), "componentOrientation", null);
        setBooleanField(term30163, term30163.getClass(), "newEventsOnly", false);
        setField(term30163, term30163.getClass(), "componentListener", null);
        setField(term30163, term30163.getClass(), "focusListener", null);
        setField(term30163, term30163.getClass(), "hierarchyListener", null);
        setField(term30163, term30163.getClass(), "hierarchyBoundsListener", null);
        setField(term30163, term30163.getClass(), "keyListener", null);
        setField(term30163, term30163.getClass(), "mouseListener", null);
        setField(term30163, term30163.getClass(), "mouseMotionListener", null);
        setField(term30163, term30163.getClass(), "mouseWheelListener", null);
        setField(term30163, term30163.getClass(), "inputMethodListener", null);
        setLongField(term30163, term30163.getClass(), "eventMask", 0L);
        setField(term30163, term30163.getClass(), "changeSupport", null);
        setField(term30163, term30163.getClass(), "objectLock", null);
        setBooleanField(term30163, term30163.getClass(), "isPacked", false);
        setIntField(term30163, term30163.getClass(), "boundsOp", 0);
        setField(term30163, term30163.getClass(), "compoundShape", null);
        setField(term30163, term30163.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term30163, term30163.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term30163, term30163.getClass(), "backgroundEraseDisabled", false);
        setField(term30163, term30163.getClass(), "eventCache", null);
        setBooleanField(term30163, term30163.getClass(), "coalescingEnabled", false);
        setBooleanField(term30163, term30163.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term30163, term30163.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.AssignmentCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMeanValue", argTypes, term30163, args);
    }

};


