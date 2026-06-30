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

public class AssignmentCreator_getNameField_21073799996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15487;

    public AssignmentCreator_getNameField_21073799996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15487 = newInstance(Class.forName("core.task.creator.AssignmentCreator"));
        setField(term15487, term15487.getClass(), "nameField", null);
        setField(term15487, term15487.getClass(), "groupChoice", null);
        setField(term15487, term15487.getClass(), "questionArea", null);
        setField(term15487, term15487.getClass(), "modes", null);
        setField(term15487, term15487.getClass(), "meanValue", null);
        setField(term15487, term15487.getClass(), "dField", null);
        setField(term15487, term15487.getClass(), "mField", null);
        setField(term15487, term15487.getClass(), "yField", null);
        setIntField(term15487, term15487.getClass(), "defaultCloseOperation", 0);
        setField(term15487, term15487.getClass(), "rootPane", null);
        setBooleanField(term15487, term15487.getClass(), "rootPaneCheckingEnabled", false);
        setField(term15487, term15487.getClass(), "transferHandler", null);
        setField(term15487, term15487.getClass(), "accessibleContext", null);
        setBooleanField(term15487, term15487.getClass(), "resizable", false);
        setBooleanField(term15487, term15487.getClass(), "undecorated", false);
        setBooleanField(term15487, term15487.getClass(), "initialized", false);
        setBooleanField(term15487, term15487.getClass(), "modal", false);
        setField(term15487, term15487.getClass(), "modalityType", null);
        setField(term15487, term15487.getClass(), "blockedWindows", null);
        setField(term15487, term15487.getClass(), "title", null);
        setField(term15487, term15487.getClass(), "modalFilter", null);
        setField(term15487, term15487.getClass(), "secondaryLoop", null);
        setBooleanField(term15487, term15487.getClass(), "isInHide", false);
        setBooleanField(term15487, term15487.getClass(), "isInDispose", false);
        setField(term15487, term15487.getClass(), "warningString", null);
        setField(term15487, term15487.getClass(), "icons", null);
        setField(term15487, term15487.getClass(), "temporaryLostComponent", null);
        setBooleanField(term15487, term15487.getClass(), "syncLWRequests", false);
        setBooleanField(term15487, term15487.getClass(), "beforeFirstShow", false);
        setBooleanField(term15487, term15487.getClass(), "disposing", false);
        setField(term15487, term15487.getClass(), "disposerRecord", null);
        setIntField(term15487, term15487.getClass(), "state", 0);
        setBooleanField(term15487, term15487.getClass(), "alwaysOnTop", false);
        setField(term15487, term15487.getClass(), "ownedWindowList", null);
        setField(term15487, term15487.getClass(), "weakThis", null);
        setBooleanField(term15487, term15487.getClass(), "showWithParent", false);
        setField(term15487, term15487.getClass(), "modalBlocker", null);
        setField(term15487, term15487.getClass(), "modalExclusionType", null);
        setField(term15487, term15487.getClass(), "windowListener", null);
        setField(term15487, term15487.getClass(), "windowStateListener", null);
        setField(term15487, term15487.getClass(), "windowFocusListener", null);
        setField(term15487, term15487.getClass(), "inputContext", null);
        setField(term15487, term15487.getClass(), "inputContextLock", null);
        setField(term15487, term15487.getClass(), "focusMgr", null);
        setBooleanField(term15487, term15487.getClass(), "focusableWindowState", false);
        setBooleanField(term15487, term15487.getClass(), "autoRequestFocus", false);
        setBooleanField(term15487, term15487.getClass(), "isInShow", false);
        setFloatField(term15487, term15487.getClass(), "opacity", 0.0F);
        setField(term15487, term15487.getClass(), "shape", null);
        setBooleanField(term15487, term15487.getClass(), "isTrayIconWindow", false);
        setIntField(term15487, term15487.getClass(), "securityWarningWidth", 0);
        setIntField(term15487, term15487.getClass(), "securityWarningHeight", 0);
        setDoubleField(term15487, term15487.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term15487, term15487.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term15487, term15487.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term15487, term15487.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term15487, term15487.getClass(), "anchor", null);
        setField(term15487, term15487.getClass(), "type", null);
        setIntField(term15487, term15487.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term15487, term15487.getClass(), "locationByPlatform", false);
        setField(term15487, term15487.getClass(), "component", null);
        setField(term15487, term15487.getClass(), "layoutMgr", null);
        setField(term15487, term15487.getClass(), "dispatcher", null);
        setField(term15487, term15487.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term15487, term15487.getClass(), "focusCycleRoot", false);
        setBooleanField(term15487, term15487.getClass(), "focusTraversalPolicyProvider", false);
        setField(term15487, term15487.getClass(), "printingThreads", null);
        setBooleanField(term15487, term15487.getClass(), "printing", false);
        setField(term15487, term15487.getClass(), "containerListener", null);
        setIntField(term15487, term15487.getClass(), "listeningChildren", 0);
        setIntField(term15487, term15487.getClass(), "listeningBoundsChildren", 0);
        setIntField(term15487, term15487.getClass(), "descendantsCount", 0);
        setField(term15487, term15487.getClass(), "preserveBackgroundColor", null);
        setIntField(term15487, term15487.getClass(), "numOfHWComponents", 0);
        setIntField(term15487, term15487.getClass(), "numOfLWComponents", 0);
        setField(term15487, term15487.getClass(), "modalComp", null);
        setField(term15487, term15487.getClass(), "modalAppContext", null);
        setIntField(term15487, term15487.getClass(), "containerSerializedDataVersion", 0);
        setField(term15487, term15487.getClass(), "peer", null);
        setField(term15487, term15487.getClass(), "parent", null);
        setField(term15487, term15487.getClass(), "appContext", null);
        setIntField(term15487, term15487.getClass(), "x", 0);
        setIntField(term15487, term15487.getClass(), "y", 0);
        setIntField(term15487, term15487.getClass(), "width", 0);
        setIntField(term15487, term15487.getClass(), "height", 0);
        setField(term15487, term15487.getClass(), "foreground", null);
        setField(term15487, term15487.getClass(), "background", null);
        setField(term15487, term15487.getClass(), "font", null);
        setField(term15487, term15487.getClass(), "peerFont", null);
        setField(term15487, term15487.getClass(), "cursor", null);
        setField(term15487, term15487.getClass(), "locale", null);
        setField(term15487, term15487.getClass(), "graphicsConfig", null);
        setField(term15487, term15487.getClass(), "bufferStrategy", null);
        setBooleanField(term15487, term15487.getClass(), "ignoreRepaint", false);
        setBooleanField(term15487, term15487.getClass(), "visible", false);
        setBooleanField(term15487, term15487.getClass(), "enabled", false);
        setBooleanField(term15487, term15487.getClass(), "valid", false);
        setField(term15487, term15487.getClass(), "dropTarget", null);
        setField(term15487, term15487.getClass(), "popups", null);
        setField(term15487, term15487.getClass(), "name", null);
        setBooleanField(term15487, term15487.getClass(), "nameExplicitlySet", false);
        setBooleanField(term15487, term15487.getClass(), "focusable", false);
        setIntField(term15487, term15487.getClass(), "isFocusTraversableOverridden", 0);
        setField(term15487, term15487.getClass(), "focusTraversalKeys", null);
        setBooleanField(term15487, term15487.getClass(), "focusTraversalKeysEnabled", false);
        setField(term15487, term15487.getClass(), "acc", null);
        setField(term15487, term15487.getClass(), "minSize", null);
        setBooleanField(term15487, term15487.getClass(), "minSizeSet", false);
        setField(term15487, term15487.getClass(), "prefSize", null);
        setBooleanField(term15487, term15487.getClass(), "prefSizeSet", false);
        setField(term15487, term15487.getClass(), "maxSize", null);
        setBooleanField(term15487, term15487.getClass(), "maxSizeSet", false);
        setField(term15487, term15487.getClass(), "componentOrientation", null);
        setBooleanField(term15487, term15487.getClass(), "newEventsOnly", false);
        setField(term15487, term15487.getClass(), "componentListener", null);
        setField(term15487, term15487.getClass(), "focusListener", null);
        setField(term15487, term15487.getClass(), "hierarchyListener", null);
        setField(term15487, term15487.getClass(), "hierarchyBoundsListener", null);
        setField(term15487, term15487.getClass(), "keyListener", null);
        setField(term15487, term15487.getClass(), "mouseListener", null);
        setField(term15487, term15487.getClass(), "mouseMotionListener", null);
        setField(term15487, term15487.getClass(), "mouseWheelListener", null);
        setField(term15487, term15487.getClass(), "inputMethodListener", null);
        setLongField(term15487, term15487.getClass(), "eventMask", 0L);
        setField(term15487, term15487.getClass(), "changeSupport", null);
        setField(term15487, term15487.getClass(), "objectLock", null);
        setBooleanField(term15487, term15487.getClass(), "isPacked", false);
        setIntField(term15487, term15487.getClass(), "boundsOp", 0);
        setField(term15487, term15487.getClass(), "compoundShape", null);
        setField(term15487, term15487.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term15487, term15487.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term15487, term15487.getClass(), "backgroundEraseDisabled", false);
        setField(term15487, term15487.getClass(), "eventCache", null);
        setBooleanField(term15487, term15487.getClass(), "coalescingEnabled", false);
        setBooleanField(term15487, term15487.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term15487, term15487.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.AssignmentCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameField", argTypes, term15487, args);
    }

};


