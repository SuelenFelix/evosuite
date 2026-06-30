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
     Object term19138;

    public AssignmentCreator_isGroup_18799194068() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19138 = newInstance(Class.forName("core.task.creator.AssignmentCreator"));
        setField(term19138, term19138.getClass(), "nameField", null);
        setField(term19138, term19138.getClass(), "groupChoice", null);
        setField(term19138, term19138.getClass(), "questionArea", null);
        setField(term19138, term19138.getClass(), "modes", null);
        setField(term19138, term19138.getClass(), "meanValue", null);
        setField(term19138, term19138.getClass(), "dField", null);
        setField(term19138, term19138.getClass(), "mField", null);
        setField(term19138, term19138.getClass(), "yField", null);
        setIntField(term19138, term19138.getClass(), "defaultCloseOperation", 0);
        setField(term19138, term19138.getClass(), "rootPane", null);
        setBooleanField(term19138, term19138.getClass(), "rootPaneCheckingEnabled", false);
        setField(term19138, term19138.getClass(), "transferHandler", null);
        setField(term19138, term19138.getClass(), "accessibleContext", null);
        setBooleanField(term19138, term19138.getClass(), "resizable", false);
        setBooleanField(term19138, term19138.getClass(), "undecorated", false);
        setBooleanField(term19138, term19138.getClass(), "initialized", false);
        setBooleanField(term19138, term19138.getClass(), "modal", false);
        setField(term19138, term19138.getClass(), "modalityType", null);
        setField(term19138, term19138.getClass(), "blockedWindows", null);
        setField(term19138, term19138.getClass(), "title", null);
        setField(term19138, term19138.getClass(), "modalFilter", null);
        setField(term19138, term19138.getClass(), "secondaryLoop", null);
        setBooleanField(term19138, term19138.getClass(), "isInHide", false);
        setBooleanField(term19138, term19138.getClass(), "isInDispose", false);
        setField(term19138, term19138.getClass(), "warningString", null);
        setField(term19138, term19138.getClass(), "icons", null);
        setField(term19138, term19138.getClass(), "temporaryLostComponent", null);
        setBooleanField(term19138, term19138.getClass(), "syncLWRequests", false);
        setBooleanField(term19138, term19138.getClass(), "beforeFirstShow", false);
        setBooleanField(term19138, term19138.getClass(), "disposing", false);
        setField(term19138, term19138.getClass(), "disposerRecord", null);
        setIntField(term19138, term19138.getClass(), "state", 0);
        setBooleanField(term19138, term19138.getClass(), "alwaysOnTop", false);
        setField(term19138, term19138.getClass(), "ownedWindowList", null);
        setField(term19138, term19138.getClass(), "weakThis", null);
        setBooleanField(term19138, term19138.getClass(), "showWithParent", false);
        setField(term19138, term19138.getClass(), "modalBlocker", null);
        setField(term19138, term19138.getClass(), "modalExclusionType", null);
        setField(term19138, term19138.getClass(), "windowListener", null);
        setField(term19138, term19138.getClass(), "windowStateListener", null);
        setField(term19138, term19138.getClass(), "windowFocusListener", null);
        setField(term19138, term19138.getClass(), "inputContext", null);
        setField(term19138, term19138.getClass(), "inputContextLock", null);
        setField(term19138, term19138.getClass(), "focusMgr", null);
        setBooleanField(term19138, term19138.getClass(), "focusableWindowState", false);
        setBooleanField(term19138, term19138.getClass(), "autoRequestFocus", false);
        setBooleanField(term19138, term19138.getClass(), "isInShow", false);
        setFloatField(term19138, term19138.getClass(), "opacity", 0.0F);
        setField(term19138, term19138.getClass(), "shape", null);
        setBooleanField(term19138, term19138.getClass(), "isTrayIconWindow", false);
        setIntField(term19138, term19138.getClass(), "securityWarningWidth", 0);
        setIntField(term19138, term19138.getClass(), "securityWarningHeight", 0);
        setDoubleField(term19138, term19138.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term19138, term19138.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term19138, term19138.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term19138, term19138.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term19138, term19138.getClass(), "anchor", null);
        setField(term19138, term19138.getClass(), "type", null);
        setIntField(term19138, term19138.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term19138, term19138.getClass(), "locationByPlatform", false);
        setField(term19138, term19138.getClass(), "component", null);
        setField(term19138, term19138.getClass(), "layoutMgr", null);
        setField(term19138, term19138.getClass(), "dispatcher", null);
        setField(term19138, term19138.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term19138, term19138.getClass(), "focusCycleRoot", false);
        setBooleanField(term19138, term19138.getClass(), "focusTraversalPolicyProvider", false);
        setField(term19138, term19138.getClass(), "printingThreads", null);
        setBooleanField(term19138, term19138.getClass(), "printing", false);
        setField(term19138, term19138.getClass(), "containerListener", null);
        setIntField(term19138, term19138.getClass(), "listeningChildren", 0);
        setIntField(term19138, term19138.getClass(), "listeningBoundsChildren", 0);
        setIntField(term19138, term19138.getClass(), "descendantsCount", 0);
        setField(term19138, term19138.getClass(), "preserveBackgroundColor", null);
        setIntField(term19138, term19138.getClass(), "numOfHWComponents", 0);
        setIntField(term19138, term19138.getClass(), "numOfLWComponents", 0);
        setField(term19138, term19138.getClass(), "modalComp", null);
        setField(term19138, term19138.getClass(), "modalAppContext", null);
        setIntField(term19138, term19138.getClass(), "containerSerializedDataVersion", 0);
        setField(term19138, term19138.getClass(), "peer", null);
        setField(term19138, term19138.getClass(), "parent", null);
        setField(term19138, term19138.getClass(), "appContext", null);
        setIntField(term19138, term19138.getClass(), "x", 0);
        setIntField(term19138, term19138.getClass(), "y", 0);
        setIntField(term19138, term19138.getClass(), "width", 0);
        setIntField(term19138, term19138.getClass(), "height", 0);
        setField(term19138, term19138.getClass(), "foreground", null);
        setField(term19138, term19138.getClass(), "background", null);
        setField(term19138, term19138.getClass(), "font", null);
        setField(term19138, term19138.getClass(), "peerFont", null);
        setField(term19138, term19138.getClass(), "cursor", null);
        setField(term19138, term19138.getClass(), "locale", null);
        setField(term19138, term19138.getClass(), "graphicsConfig", null);
        setField(term19138, term19138.getClass(), "bufferStrategy", null);
        setBooleanField(term19138, term19138.getClass(), "ignoreRepaint", false);
        setBooleanField(term19138, term19138.getClass(), "visible", false);
        setBooleanField(term19138, term19138.getClass(), "enabled", false);
        setBooleanField(term19138, term19138.getClass(), "valid", false);
        setField(term19138, term19138.getClass(), "dropTarget", null);
        setField(term19138, term19138.getClass(), "popups", null);
        setField(term19138, term19138.getClass(), "name", null);
        setBooleanField(term19138, term19138.getClass(), "nameExplicitlySet", false);
        setBooleanField(term19138, term19138.getClass(), "focusable", false);
        setIntField(term19138, term19138.getClass(), "isFocusTraversableOverridden", 0);
        setField(term19138, term19138.getClass(), "focusTraversalKeys", null);
        setBooleanField(term19138, term19138.getClass(), "focusTraversalKeysEnabled", false);
        setField(term19138, term19138.getClass(), "acc", null);
        setField(term19138, term19138.getClass(), "minSize", null);
        setBooleanField(term19138, term19138.getClass(), "minSizeSet", false);
        setField(term19138, term19138.getClass(), "prefSize", null);
        setBooleanField(term19138, term19138.getClass(), "prefSizeSet", false);
        setField(term19138, term19138.getClass(), "maxSize", null);
        setBooleanField(term19138, term19138.getClass(), "maxSizeSet", false);
        setField(term19138, term19138.getClass(), "componentOrientation", null);
        setBooleanField(term19138, term19138.getClass(), "newEventsOnly", false);
        setField(term19138, term19138.getClass(), "componentListener", null);
        setField(term19138, term19138.getClass(), "focusListener", null);
        setField(term19138, term19138.getClass(), "hierarchyListener", null);
        setField(term19138, term19138.getClass(), "hierarchyBoundsListener", null);
        setField(term19138, term19138.getClass(), "keyListener", null);
        setField(term19138, term19138.getClass(), "mouseListener", null);
        setField(term19138, term19138.getClass(), "mouseMotionListener", null);
        setField(term19138, term19138.getClass(), "mouseWheelListener", null);
        setField(term19138, term19138.getClass(), "inputMethodListener", null);
        setLongField(term19138, term19138.getClass(), "eventMask", 0L);
        setField(term19138, term19138.getClass(), "changeSupport", null);
        setField(term19138, term19138.getClass(), "objectLock", null);
        setBooleanField(term19138, term19138.getClass(), "isPacked", false);
        setIntField(term19138, term19138.getClass(), "boundsOp", 0);
        setField(term19138, term19138.getClass(), "compoundShape", null);
        setField(term19138, term19138.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term19138, term19138.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term19138, term19138.getClass(), "backgroundEraseDisabled", false);
        setField(term19138, term19138.getClass(), "eventCache", null);
        setBooleanField(term19138, term19138.getClass(), "coalescingEnabled", false);
        setBooleanField(term19138, term19138.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term19138, term19138.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.AssignmentCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isGroup", argTypes, term19138, args);
    }

};


