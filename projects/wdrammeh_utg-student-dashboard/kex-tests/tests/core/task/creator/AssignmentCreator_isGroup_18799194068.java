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

public class AssignmentCreator_isGroup_18799194068 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54099;

    public AssignmentCreator_isGroup_18799194068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54099 = newInstance(Class.forName("core.task.creator.AssignmentCreator"));
        setField(term54099, term54099.getClass(), "nameField", null);
        setField(term54099, term54099.getClass(), "groupChoice", null);
        setField(term54099, term54099.getClass(), "questionArea", null);
        setField(term54099, term54099.getClass(), "modes", null);
        setField(term54099, term54099.getClass(), "meanValue", null);
        setField(term54099, term54099.getClass(), "dField", null);
        setField(term54099, term54099.getClass(), "mField", null);
        setField(term54099, term54099.getClass(), "yField", null);
        setIntField(term54099, term54099.getClass(), "defaultCloseOperation", 0);
        setField(term54099, term54099.getClass(), "rootPane", null);
        setBooleanField(term54099, term54099.getClass(), "rootPaneCheckingEnabled", false);
        setField(term54099, term54099.getClass(), "transferHandler", null);
        setField(term54099, term54099.getClass(), "accessibleContext", null);
        setBooleanField(term54099, term54099.getClass(), "resizable", false);
        setBooleanField(term54099, term54099.getClass(), "undecorated", false);
        setBooleanField(term54099, term54099.getClass(), "initialized", false);
        setBooleanField(term54099, term54099.getClass(), "modal", false);
        setField(term54099, term54099.getClass(), "modalityType", null);
        setField(term54099, term54099.getClass(), "blockedWindows", null);
        setField(term54099, term54099.getClass(), "title", null);
        setField(term54099, term54099.getClass(), "modalFilter", null);
        setField(term54099, term54099.getClass(), "secondaryLoop", null);
        setBooleanField(term54099, term54099.getClass(), "isInHide", false);
        setBooleanField(term54099, term54099.getClass(), "isInDispose", false);
        setField(term54099, term54099.getClass(), "warningString", null);
        setField(term54099, term54099.getClass(), "icons", null);
        setField(term54099, term54099.getClass(), "temporaryLostComponent", null);
        setBooleanField(term54099, term54099.getClass(), "syncLWRequests", false);
        setBooleanField(term54099, term54099.getClass(), "beforeFirstShow", false);
        setBooleanField(term54099, term54099.getClass(), "disposing", false);
        setField(term54099, term54099.getClass(), "disposerRecord", null);
        setIntField(term54099, term54099.getClass(), "state", 0);
        setBooleanField(term54099, term54099.getClass(), "alwaysOnTop", false);
        setField(term54099, term54099.getClass(), "ownedWindowList", null);
        setField(term54099, term54099.getClass(), "weakThis", null);
        setBooleanField(term54099, term54099.getClass(), "showWithParent", false);
        setField(term54099, term54099.getClass(), "modalBlocker", null);
        setField(term54099, term54099.getClass(), "modalExclusionType", null);
        setField(term54099, term54099.getClass(), "windowListener", null);
        setField(term54099, term54099.getClass(), "windowStateListener", null);
        setField(term54099, term54099.getClass(), "windowFocusListener", null);
        setField(term54099, term54099.getClass(), "inputContext", null);
        setField(term54099, term54099.getClass(), "inputContextLock", null);
        setField(term54099, term54099.getClass(), "focusMgr", null);
        setBooleanField(term54099, term54099.getClass(), "focusableWindowState", false);
        setBooleanField(term54099, term54099.getClass(), "autoRequestFocus", false);
        setBooleanField(term54099, term54099.getClass(), "isInShow", false);
        setFloatField(term54099, term54099.getClass(), "opacity", 0.0F);
        setField(term54099, term54099.getClass(), "shape", null);
        setBooleanField(term54099, term54099.getClass(), "isTrayIconWindow", false);
        setIntField(term54099, term54099.getClass(), "securityWarningWidth", 0);
        setIntField(term54099, term54099.getClass(), "securityWarningHeight", 0);
        setDoubleField(term54099, term54099.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term54099, term54099.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term54099, term54099.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term54099, term54099.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term54099, term54099.getClass(), "anchor", null);
        setField(term54099, term54099.getClass(), "type", null);
        setIntField(term54099, term54099.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term54099, term54099.getClass(), "locationByPlatform", false);
        setField(term54099, term54099.getClass(), "component", null);
        setField(term54099, term54099.getClass(), "layoutMgr", null);
        setField(term54099, term54099.getClass(), "dispatcher", null);
        setField(term54099, term54099.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term54099, term54099.getClass(), "focusCycleRoot", false);
        setBooleanField(term54099, term54099.getClass(), "focusTraversalPolicyProvider", false);
        setField(term54099, term54099.getClass(), "printingThreads", null);
        setBooleanField(term54099, term54099.getClass(), "printing", false);
        setField(term54099, term54099.getClass(), "containerListener", null);
        setIntField(term54099, term54099.getClass(), "listeningChildren", 0);
        setIntField(term54099, term54099.getClass(), "listeningBoundsChildren", 0);
        setIntField(term54099, term54099.getClass(), "descendantsCount", 0);
        setField(term54099, term54099.getClass(), "preserveBackgroundColor", null);
        setIntField(term54099, term54099.getClass(), "numOfHWComponents", 0);
        setIntField(term54099, term54099.getClass(), "numOfLWComponents", 0);
        setField(term54099, term54099.getClass(), "modalComp", null);
        setField(term54099, term54099.getClass(), "modalAppContext", null);
        setIntField(term54099, term54099.getClass(), "containerSerializedDataVersion", 0);
        setField(term54099, term54099.getClass(), "peer", null);
        setField(term54099, term54099.getClass(), "parent", null);
        setField(term54099, term54099.getClass(), "appContext", null);
        setIntField(term54099, term54099.getClass(), "x", 0);
        setIntField(term54099, term54099.getClass(), "y", 0);
        setIntField(term54099, term54099.getClass(), "width", 0);
        setIntField(term54099, term54099.getClass(), "height", 0);
        setField(term54099, term54099.getClass(), "foreground", null);
        setField(term54099, term54099.getClass(), "background", null);
        setField(term54099, term54099.getClass(), "font", null);
        setField(term54099, term54099.getClass(), "peerFont", null);
        setField(term54099, term54099.getClass(), "cursor", null);
        setField(term54099, term54099.getClass(), "locale", null);
        setField(term54099, term54099.getClass(), "graphicsConfig", null);
        setField(term54099, term54099.getClass(), "bufferStrategy", null);
        setBooleanField(term54099, term54099.getClass(), "ignoreRepaint", false);
        setBooleanField(term54099, term54099.getClass(), "visible", false);
        setBooleanField(term54099, term54099.getClass(), "enabled", false);
        setBooleanField(term54099, term54099.getClass(), "valid", false);
        setField(term54099, term54099.getClass(), "dropTarget", null);
        setField(term54099, term54099.getClass(), "popups", null);
        setField(term54099, term54099.getClass(), "name", null);
        setBooleanField(term54099, term54099.getClass(), "nameExplicitlySet", false);
        setBooleanField(term54099, term54099.getClass(), "focusable", false);
        setIntField(term54099, term54099.getClass(), "isFocusTraversableOverridden", 0);
        setField(term54099, term54099.getClass(), "focusTraversalKeys", null);
        setBooleanField(term54099, term54099.getClass(), "focusTraversalKeysEnabled", false);
        setField(term54099, term54099.getClass(), "acc", null);
        setField(term54099, term54099.getClass(), "minSize", null);
        setBooleanField(term54099, term54099.getClass(), "minSizeSet", false);
        setField(term54099, term54099.getClass(), "prefSize", null);
        setBooleanField(term54099, term54099.getClass(), "prefSizeSet", false);
        setField(term54099, term54099.getClass(), "maxSize", null);
        setBooleanField(term54099, term54099.getClass(), "maxSizeSet", false);
        setField(term54099, term54099.getClass(), "componentOrientation", null);
        setBooleanField(term54099, term54099.getClass(), "newEventsOnly", false);
        setField(term54099, term54099.getClass(), "componentListener", null);
        setField(term54099, term54099.getClass(), "focusListener", null);
        setField(term54099, term54099.getClass(), "hierarchyListener", null);
        setField(term54099, term54099.getClass(), "hierarchyBoundsListener", null);
        setField(term54099, term54099.getClass(), "keyListener", null);
        setField(term54099, term54099.getClass(), "mouseListener", null);
        setField(term54099, term54099.getClass(), "mouseMotionListener", null);
        setField(term54099, term54099.getClass(), "mouseWheelListener", null);
        setField(term54099, term54099.getClass(), "inputMethodListener", null);
        setLongField(term54099, term54099.getClass(), "eventMask", 0L);
        setField(term54099, term54099.getClass(), "changeSupport", null);
        setField(term54099, term54099.getClass(), "objectLock", null);
        setBooleanField(term54099, term54099.getClass(), "isPacked", false);
        setIntField(term54099, term54099.getClass(), "boundsOp", 0);
        setField(term54099, term54099.getClass(), "compoundShape", null);
        setField(term54099, term54099.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term54099, term54099.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term54099, term54099.getClass(), "backgroundEraseDisabled", false);
        setField(term54099, term54099.getClass(), "eventCache", null);
        setBooleanField(term54099, term54099.getClass(), "coalescingEnabled", false);
        setBooleanField(term54099, term54099.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term54099, term54099.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.AssignmentCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isGroup", argTypes, term54099, args);
    }

};


