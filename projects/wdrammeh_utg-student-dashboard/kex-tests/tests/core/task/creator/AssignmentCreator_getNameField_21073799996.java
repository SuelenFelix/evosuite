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
     Object term50499;

    public AssignmentCreator_getNameField_21073799996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50499 = newInstance(Class.forName("core.task.creator.AssignmentCreator"));
        setField(term50499, term50499.getClass(), "nameField", null);
        setField(term50499, term50499.getClass(), "groupChoice", null);
        setField(term50499, term50499.getClass(), "questionArea", null);
        setField(term50499, term50499.getClass(), "modes", null);
        setField(term50499, term50499.getClass(), "meanValue", null);
        setField(term50499, term50499.getClass(), "dField", null);
        setField(term50499, term50499.getClass(), "mField", null);
        setField(term50499, term50499.getClass(), "yField", null);
        setIntField(term50499, term50499.getClass(), "defaultCloseOperation", 0);
        setField(term50499, term50499.getClass(), "rootPane", null);
        setBooleanField(term50499, term50499.getClass(), "rootPaneCheckingEnabled", false);
        setField(term50499, term50499.getClass(), "transferHandler", null);
        setField(term50499, term50499.getClass(), "accessibleContext", null);
        setBooleanField(term50499, term50499.getClass(), "resizable", false);
        setBooleanField(term50499, term50499.getClass(), "undecorated", false);
        setBooleanField(term50499, term50499.getClass(), "initialized", false);
        setBooleanField(term50499, term50499.getClass(), "modal", false);
        setField(term50499, term50499.getClass(), "modalityType", null);
        setField(term50499, term50499.getClass(), "blockedWindows", null);
        setField(term50499, term50499.getClass(), "title", null);
        setField(term50499, term50499.getClass(), "modalFilter", null);
        setField(term50499, term50499.getClass(), "secondaryLoop", null);
        setBooleanField(term50499, term50499.getClass(), "isInHide", false);
        setBooleanField(term50499, term50499.getClass(), "isInDispose", false);
        setField(term50499, term50499.getClass(), "warningString", null);
        setField(term50499, term50499.getClass(), "icons", null);
        setField(term50499, term50499.getClass(), "temporaryLostComponent", null);
        setBooleanField(term50499, term50499.getClass(), "syncLWRequests", false);
        setBooleanField(term50499, term50499.getClass(), "beforeFirstShow", false);
        setBooleanField(term50499, term50499.getClass(), "disposing", false);
        setField(term50499, term50499.getClass(), "disposerRecord", null);
        setIntField(term50499, term50499.getClass(), "state", 0);
        setBooleanField(term50499, term50499.getClass(), "alwaysOnTop", false);
        setField(term50499, term50499.getClass(), "ownedWindowList", null);
        setField(term50499, term50499.getClass(), "weakThis", null);
        setBooleanField(term50499, term50499.getClass(), "showWithParent", false);
        setField(term50499, term50499.getClass(), "modalBlocker", null);
        setField(term50499, term50499.getClass(), "modalExclusionType", null);
        setField(term50499, term50499.getClass(), "windowListener", null);
        setField(term50499, term50499.getClass(), "windowStateListener", null);
        setField(term50499, term50499.getClass(), "windowFocusListener", null);
        setField(term50499, term50499.getClass(), "inputContext", null);
        setField(term50499, term50499.getClass(), "inputContextLock", null);
        setField(term50499, term50499.getClass(), "focusMgr", null);
        setBooleanField(term50499, term50499.getClass(), "focusableWindowState", false);
        setBooleanField(term50499, term50499.getClass(), "autoRequestFocus", false);
        setBooleanField(term50499, term50499.getClass(), "isInShow", false);
        setFloatField(term50499, term50499.getClass(), "opacity", 0.0F);
        setField(term50499, term50499.getClass(), "shape", null);
        setBooleanField(term50499, term50499.getClass(), "isTrayIconWindow", false);
        setIntField(term50499, term50499.getClass(), "securityWarningWidth", 0);
        setIntField(term50499, term50499.getClass(), "securityWarningHeight", 0);
        setDoubleField(term50499, term50499.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term50499, term50499.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term50499, term50499.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term50499, term50499.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term50499, term50499.getClass(), "anchor", null);
        setField(term50499, term50499.getClass(), "type", null);
        setIntField(term50499, term50499.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term50499, term50499.getClass(), "locationByPlatform", false);
        setField(term50499, term50499.getClass(), "component", null);
        setField(term50499, term50499.getClass(), "layoutMgr", null);
        setField(term50499, term50499.getClass(), "dispatcher", null);
        setField(term50499, term50499.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term50499, term50499.getClass(), "focusCycleRoot", false);
        setBooleanField(term50499, term50499.getClass(), "focusTraversalPolicyProvider", false);
        setField(term50499, term50499.getClass(), "printingThreads", null);
        setBooleanField(term50499, term50499.getClass(), "printing", false);
        setField(term50499, term50499.getClass(), "containerListener", null);
        setIntField(term50499, term50499.getClass(), "listeningChildren", 0);
        setIntField(term50499, term50499.getClass(), "listeningBoundsChildren", 0);
        setIntField(term50499, term50499.getClass(), "descendantsCount", 0);
        setField(term50499, term50499.getClass(), "preserveBackgroundColor", null);
        setIntField(term50499, term50499.getClass(), "numOfHWComponents", 0);
        setIntField(term50499, term50499.getClass(), "numOfLWComponents", 0);
        setField(term50499, term50499.getClass(), "modalComp", null);
        setField(term50499, term50499.getClass(), "modalAppContext", null);
        setIntField(term50499, term50499.getClass(), "containerSerializedDataVersion", 0);
        setField(term50499, term50499.getClass(), "peer", null);
        setField(term50499, term50499.getClass(), "parent", null);
        setField(term50499, term50499.getClass(), "appContext", null);
        setIntField(term50499, term50499.getClass(), "x", 0);
        setIntField(term50499, term50499.getClass(), "y", 0);
        setIntField(term50499, term50499.getClass(), "width", 0);
        setIntField(term50499, term50499.getClass(), "height", 0);
        setField(term50499, term50499.getClass(), "foreground", null);
        setField(term50499, term50499.getClass(), "background", null);
        setField(term50499, term50499.getClass(), "font", null);
        setField(term50499, term50499.getClass(), "peerFont", null);
        setField(term50499, term50499.getClass(), "cursor", null);
        setField(term50499, term50499.getClass(), "locale", null);
        setField(term50499, term50499.getClass(), "graphicsConfig", null);
        setField(term50499, term50499.getClass(), "bufferStrategy", null);
        setBooleanField(term50499, term50499.getClass(), "ignoreRepaint", false);
        setBooleanField(term50499, term50499.getClass(), "visible", false);
        setBooleanField(term50499, term50499.getClass(), "enabled", false);
        setBooleanField(term50499, term50499.getClass(), "valid", false);
        setField(term50499, term50499.getClass(), "dropTarget", null);
        setField(term50499, term50499.getClass(), "popups", null);
        setField(term50499, term50499.getClass(), "name", null);
        setBooleanField(term50499, term50499.getClass(), "nameExplicitlySet", false);
        setBooleanField(term50499, term50499.getClass(), "focusable", false);
        setIntField(term50499, term50499.getClass(), "isFocusTraversableOverridden", 0);
        setField(term50499, term50499.getClass(), "focusTraversalKeys", null);
        setBooleanField(term50499, term50499.getClass(), "focusTraversalKeysEnabled", false);
        setField(term50499, term50499.getClass(), "acc", null);
        setField(term50499, term50499.getClass(), "minSize", null);
        setBooleanField(term50499, term50499.getClass(), "minSizeSet", false);
        setField(term50499, term50499.getClass(), "prefSize", null);
        setBooleanField(term50499, term50499.getClass(), "prefSizeSet", false);
        setField(term50499, term50499.getClass(), "maxSize", null);
        setBooleanField(term50499, term50499.getClass(), "maxSizeSet", false);
        setField(term50499, term50499.getClass(), "componentOrientation", null);
        setBooleanField(term50499, term50499.getClass(), "newEventsOnly", false);
        setField(term50499, term50499.getClass(), "componentListener", null);
        setField(term50499, term50499.getClass(), "focusListener", null);
        setField(term50499, term50499.getClass(), "hierarchyListener", null);
        setField(term50499, term50499.getClass(), "hierarchyBoundsListener", null);
        setField(term50499, term50499.getClass(), "keyListener", null);
        setField(term50499, term50499.getClass(), "mouseListener", null);
        setField(term50499, term50499.getClass(), "mouseMotionListener", null);
        setField(term50499, term50499.getClass(), "mouseWheelListener", null);
        setField(term50499, term50499.getClass(), "inputMethodListener", null);
        setLongField(term50499, term50499.getClass(), "eventMask", 0L);
        setField(term50499, term50499.getClass(), "changeSupport", null);
        setField(term50499, term50499.getClass(), "objectLock", null);
        setBooleanField(term50499, term50499.getClass(), "isPacked", false);
        setIntField(term50499, term50499.getClass(), "boundsOp", 0);
        setField(term50499, term50499.getClass(), "compoundShape", null);
        setField(term50499, term50499.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term50499, term50499.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term50499, term50499.getClass(), "backgroundEraseDisabled", false);
        setField(term50499, term50499.getClass(), "eventCache", null);
        setBooleanField(term50499, term50499.getClass(), "coalescingEnabled", false);
        setBooleanField(term50499, term50499.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term50499, term50499.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.AssignmentCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameField", argTypes, term50499, args);
    }

};


