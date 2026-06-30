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

public class AssignmentCreator_getQuestion_90582323010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22879;

    public AssignmentCreator_getQuestion_90582323010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22879 = newInstance(Class.forName("core.task.creator.AssignmentCreator"));
        setField(term22879, term22879.getClass(), "nameField", null);
        setField(term22879, term22879.getClass(), "groupChoice", null);
        setField(term22879, term22879.getClass(), "questionArea", null);
        setField(term22879, term22879.getClass(), "modes", null);
        setField(term22879, term22879.getClass(), "meanValue", null);
        setField(term22879, term22879.getClass(), "dField", null);
        setField(term22879, term22879.getClass(), "mField", null);
        setField(term22879, term22879.getClass(), "yField", null);
        setIntField(term22879, term22879.getClass(), "defaultCloseOperation", 0);
        setField(term22879, term22879.getClass(), "rootPane", null);
        setBooleanField(term22879, term22879.getClass(), "rootPaneCheckingEnabled", false);
        setField(term22879, term22879.getClass(), "transferHandler", null);
        setField(term22879, term22879.getClass(), "accessibleContext", null);
        setBooleanField(term22879, term22879.getClass(), "resizable", false);
        setBooleanField(term22879, term22879.getClass(), "undecorated", false);
        setBooleanField(term22879, term22879.getClass(), "initialized", false);
        setBooleanField(term22879, term22879.getClass(), "modal", false);
        setField(term22879, term22879.getClass(), "modalityType", null);
        setField(term22879, term22879.getClass(), "blockedWindows", null);
        setField(term22879, term22879.getClass(), "title", null);
        setField(term22879, term22879.getClass(), "modalFilter", null);
        setField(term22879, term22879.getClass(), "secondaryLoop", null);
        setBooleanField(term22879, term22879.getClass(), "isInHide", false);
        setBooleanField(term22879, term22879.getClass(), "isInDispose", false);
        setField(term22879, term22879.getClass(), "warningString", null);
        setField(term22879, term22879.getClass(), "icons", null);
        setField(term22879, term22879.getClass(), "temporaryLostComponent", null);
        setBooleanField(term22879, term22879.getClass(), "syncLWRequests", false);
        setBooleanField(term22879, term22879.getClass(), "beforeFirstShow", false);
        setBooleanField(term22879, term22879.getClass(), "disposing", false);
        setField(term22879, term22879.getClass(), "disposerRecord", null);
        setIntField(term22879, term22879.getClass(), "state", 0);
        setBooleanField(term22879, term22879.getClass(), "alwaysOnTop", false);
        setField(term22879, term22879.getClass(), "ownedWindowList", null);
        setField(term22879, term22879.getClass(), "weakThis", null);
        setBooleanField(term22879, term22879.getClass(), "showWithParent", false);
        setField(term22879, term22879.getClass(), "modalBlocker", null);
        setField(term22879, term22879.getClass(), "modalExclusionType", null);
        setField(term22879, term22879.getClass(), "windowListener", null);
        setField(term22879, term22879.getClass(), "windowStateListener", null);
        setField(term22879, term22879.getClass(), "windowFocusListener", null);
        setField(term22879, term22879.getClass(), "inputContext", null);
        setField(term22879, term22879.getClass(), "inputContextLock", null);
        setField(term22879, term22879.getClass(), "focusMgr", null);
        setBooleanField(term22879, term22879.getClass(), "focusableWindowState", false);
        setBooleanField(term22879, term22879.getClass(), "autoRequestFocus", false);
        setBooleanField(term22879, term22879.getClass(), "isInShow", false);
        setFloatField(term22879, term22879.getClass(), "opacity", 0.0F);
        setField(term22879, term22879.getClass(), "shape", null);
        setBooleanField(term22879, term22879.getClass(), "isTrayIconWindow", false);
        setIntField(term22879, term22879.getClass(), "securityWarningWidth", 0);
        setIntField(term22879, term22879.getClass(), "securityWarningHeight", 0);
        setDoubleField(term22879, term22879.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term22879, term22879.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term22879, term22879.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term22879, term22879.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term22879, term22879.getClass(), "anchor", null);
        setField(term22879, term22879.getClass(), "type", null);
        setIntField(term22879, term22879.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term22879, term22879.getClass(), "locationByPlatform", false);
        setField(term22879, term22879.getClass(), "component", null);
        setField(term22879, term22879.getClass(), "layoutMgr", null);
        setField(term22879, term22879.getClass(), "dispatcher", null);
        setField(term22879, term22879.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term22879, term22879.getClass(), "focusCycleRoot", false);
        setBooleanField(term22879, term22879.getClass(), "focusTraversalPolicyProvider", false);
        setField(term22879, term22879.getClass(), "printingThreads", null);
        setBooleanField(term22879, term22879.getClass(), "printing", false);
        setField(term22879, term22879.getClass(), "containerListener", null);
        setIntField(term22879, term22879.getClass(), "listeningChildren", 0);
        setIntField(term22879, term22879.getClass(), "listeningBoundsChildren", 0);
        setIntField(term22879, term22879.getClass(), "descendantsCount", 0);
        setField(term22879, term22879.getClass(), "preserveBackgroundColor", null);
        setIntField(term22879, term22879.getClass(), "numOfHWComponents", 0);
        setIntField(term22879, term22879.getClass(), "numOfLWComponents", 0);
        setField(term22879, term22879.getClass(), "modalComp", null);
        setField(term22879, term22879.getClass(), "modalAppContext", null);
        setIntField(term22879, term22879.getClass(), "containerSerializedDataVersion", 0);
        setField(term22879, term22879.getClass(), "peer", null);
        setField(term22879, term22879.getClass(), "parent", null);
        setField(term22879, term22879.getClass(), "appContext", null);
        setIntField(term22879, term22879.getClass(), "x", 0);
        setIntField(term22879, term22879.getClass(), "y", 0);
        setIntField(term22879, term22879.getClass(), "width", 0);
        setIntField(term22879, term22879.getClass(), "height", 0);
        setField(term22879, term22879.getClass(), "foreground", null);
        setField(term22879, term22879.getClass(), "background", null);
        setField(term22879, term22879.getClass(), "font", null);
        setField(term22879, term22879.getClass(), "peerFont", null);
        setField(term22879, term22879.getClass(), "cursor", null);
        setField(term22879, term22879.getClass(), "locale", null);
        setField(term22879, term22879.getClass(), "graphicsConfig", null);
        setField(term22879, term22879.getClass(), "bufferStrategy", null);
        setBooleanField(term22879, term22879.getClass(), "ignoreRepaint", false);
        setBooleanField(term22879, term22879.getClass(), "visible", false);
        setBooleanField(term22879, term22879.getClass(), "enabled", false);
        setBooleanField(term22879, term22879.getClass(), "valid", false);
        setField(term22879, term22879.getClass(), "dropTarget", null);
        setField(term22879, term22879.getClass(), "popups", null);
        setField(term22879, term22879.getClass(), "name", null);
        setBooleanField(term22879, term22879.getClass(), "nameExplicitlySet", false);
        setBooleanField(term22879, term22879.getClass(), "focusable", false);
        setIntField(term22879, term22879.getClass(), "isFocusTraversableOverridden", 0);
        setField(term22879, term22879.getClass(), "focusTraversalKeys", null);
        setBooleanField(term22879, term22879.getClass(), "focusTraversalKeysEnabled", false);
        setField(term22879, term22879.getClass(), "acc", null);
        setField(term22879, term22879.getClass(), "minSize", null);
        setBooleanField(term22879, term22879.getClass(), "minSizeSet", false);
        setField(term22879, term22879.getClass(), "prefSize", null);
        setBooleanField(term22879, term22879.getClass(), "prefSizeSet", false);
        setField(term22879, term22879.getClass(), "maxSize", null);
        setBooleanField(term22879, term22879.getClass(), "maxSizeSet", false);
        setField(term22879, term22879.getClass(), "componentOrientation", null);
        setBooleanField(term22879, term22879.getClass(), "newEventsOnly", false);
        setField(term22879, term22879.getClass(), "componentListener", null);
        setField(term22879, term22879.getClass(), "focusListener", null);
        setField(term22879, term22879.getClass(), "hierarchyListener", null);
        setField(term22879, term22879.getClass(), "hierarchyBoundsListener", null);
        setField(term22879, term22879.getClass(), "keyListener", null);
        setField(term22879, term22879.getClass(), "mouseListener", null);
        setField(term22879, term22879.getClass(), "mouseMotionListener", null);
        setField(term22879, term22879.getClass(), "mouseWheelListener", null);
        setField(term22879, term22879.getClass(), "inputMethodListener", null);
        setLongField(term22879, term22879.getClass(), "eventMask", 0L);
        setField(term22879, term22879.getClass(), "changeSupport", null);
        setField(term22879, term22879.getClass(), "objectLock", null);
        setBooleanField(term22879, term22879.getClass(), "isPacked", false);
        setIntField(term22879, term22879.getClass(), "boundsOp", 0);
        setField(term22879, term22879.getClass(), "compoundShape", null);
        setField(term22879, term22879.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term22879, term22879.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term22879, term22879.getClass(), "backgroundEraseDisabled", false);
        setField(term22879, term22879.getClass(), "eventCache", null);
        setBooleanField(term22879, term22879.getClass(), "coalescingEnabled", false);
        setBooleanField(term22879, term22879.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term22879, term22879.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.AssignmentCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQuestion", argTypes, term22879, args);
    }

};


