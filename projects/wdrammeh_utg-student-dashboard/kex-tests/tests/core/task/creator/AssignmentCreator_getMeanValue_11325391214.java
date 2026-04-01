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
     Object term65196;

    public AssignmentCreator_getMeanValue_11325391214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65196 = newInstance(Class.forName("core.task.creator.AssignmentCreator"));
        setField(term65196, term65196.getClass(), "nameField", null);
        setField(term65196, term65196.getClass(), "groupChoice", null);
        setField(term65196, term65196.getClass(), "questionArea", null);
        setField(term65196, term65196.getClass(), "modes", null);
        setField(term65196, term65196.getClass(), "meanValue", null);
        setField(term65196, term65196.getClass(), "dField", null);
        setField(term65196, term65196.getClass(), "mField", null);
        setField(term65196, term65196.getClass(), "yField", null);
        setIntField(term65196, term65196.getClass(), "defaultCloseOperation", 0);
        setField(term65196, term65196.getClass(), "rootPane", null);
        setBooleanField(term65196, term65196.getClass(), "rootPaneCheckingEnabled", false);
        setField(term65196, term65196.getClass(), "transferHandler", null);
        setField(term65196, term65196.getClass(), "accessibleContext", null);
        setBooleanField(term65196, term65196.getClass(), "resizable", false);
        setBooleanField(term65196, term65196.getClass(), "undecorated", false);
        setBooleanField(term65196, term65196.getClass(), "initialized", false);
        setBooleanField(term65196, term65196.getClass(), "modal", false);
        setField(term65196, term65196.getClass(), "modalityType", null);
        setField(term65196, term65196.getClass(), "blockedWindows", null);
        setField(term65196, term65196.getClass(), "title", null);
        setField(term65196, term65196.getClass(), "modalFilter", null);
        setField(term65196, term65196.getClass(), "secondaryLoop", null);
        setBooleanField(term65196, term65196.getClass(), "isInHide", false);
        setBooleanField(term65196, term65196.getClass(), "isInDispose", false);
        setField(term65196, term65196.getClass(), "warningString", null);
        setField(term65196, term65196.getClass(), "icons", null);
        setField(term65196, term65196.getClass(), "temporaryLostComponent", null);
        setBooleanField(term65196, term65196.getClass(), "syncLWRequests", false);
        setBooleanField(term65196, term65196.getClass(), "beforeFirstShow", false);
        setBooleanField(term65196, term65196.getClass(), "disposing", false);
        setField(term65196, term65196.getClass(), "disposerRecord", null);
        setIntField(term65196, term65196.getClass(), "state", 0);
        setBooleanField(term65196, term65196.getClass(), "alwaysOnTop", false);
        setField(term65196, term65196.getClass(), "ownedWindowList", null);
        setField(term65196, term65196.getClass(), "weakThis", null);
        setBooleanField(term65196, term65196.getClass(), "showWithParent", false);
        setField(term65196, term65196.getClass(), "modalBlocker", null);
        setField(term65196, term65196.getClass(), "modalExclusionType", null);
        setField(term65196, term65196.getClass(), "windowListener", null);
        setField(term65196, term65196.getClass(), "windowStateListener", null);
        setField(term65196, term65196.getClass(), "windowFocusListener", null);
        setField(term65196, term65196.getClass(), "inputContext", null);
        setField(term65196, term65196.getClass(), "inputContextLock", null);
        setField(term65196, term65196.getClass(), "focusMgr", null);
        setBooleanField(term65196, term65196.getClass(), "focusableWindowState", false);
        setBooleanField(term65196, term65196.getClass(), "autoRequestFocus", false);
        setBooleanField(term65196, term65196.getClass(), "isInShow", false);
        setFloatField(term65196, term65196.getClass(), "opacity", 0.0F);
        setField(term65196, term65196.getClass(), "shape", null);
        setBooleanField(term65196, term65196.getClass(), "isTrayIconWindow", false);
        setIntField(term65196, term65196.getClass(), "securityWarningWidth", 0);
        setIntField(term65196, term65196.getClass(), "securityWarningHeight", 0);
        setDoubleField(term65196, term65196.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term65196, term65196.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term65196, term65196.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term65196, term65196.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term65196, term65196.getClass(), "anchor", null);
        setField(term65196, term65196.getClass(), "type", null);
        setIntField(term65196, term65196.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term65196, term65196.getClass(), "locationByPlatform", false);
        setField(term65196, term65196.getClass(), "component", null);
        setField(term65196, term65196.getClass(), "layoutMgr", null);
        setField(term65196, term65196.getClass(), "dispatcher", null);
        setField(term65196, term65196.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term65196, term65196.getClass(), "focusCycleRoot", false);
        setBooleanField(term65196, term65196.getClass(), "focusTraversalPolicyProvider", false);
        setField(term65196, term65196.getClass(), "printingThreads", null);
        setBooleanField(term65196, term65196.getClass(), "printing", false);
        setField(term65196, term65196.getClass(), "containerListener", null);
        setIntField(term65196, term65196.getClass(), "listeningChildren", 0);
        setIntField(term65196, term65196.getClass(), "listeningBoundsChildren", 0);
        setIntField(term65196, term65196.getClass(), "descendantsCount", 0);
        setField(term65196, term65196.getClass(), "preserveBackgroundColor", null);
        setIntField(term65196, term65196.getClass(), "numOfHWComponents", 0);
        setIntField(term65196, term65196.getClass(), "numOfLWComponents", 0);
        setField(term65196, term65196.getClass(), "modalComp", null);
        setField(term65196, term65196.getClass(), "modalAppContext", null);
        setIntField(term65196, term65196.getClass(), "containerSerializedDataVersion", 0);
        setField(term65196, term65196.getClass(), "peer", null);
        setField(term65196, term65196.getClass(), "parent", null);
        setField(term65196, term65196.getClass(), "appContext", null);
        setIntField(term65196, term65196.getClass(), "x", 0);
        setIntField(term65196, term65196.getClass(), "y", 0);
        setIntField(term65196, term65196.getClass(), "width", 0);
        setIntField(term65196, term65196.getClass(), "height", 0);
        setField(term65196, term65196.getClass(), "foreground", null);
        setField(term65196, term65196.getClass(), "background", null);
        setField(term65196, term65196.getClass(), "font", null);
        setField(term65196, term65196.getClass(), "peerFont", null);
        setField(term65196, term65196.getClass(), "cursor", null);
        setField(term65196, term65196.getClass(), "locale", null);
        setField(term65196, term65196.getClass(), "graphicsConfig", null);
        setField(term65196, term65196.getClass(), "bufferStrategy", null);
        setBooleanField(term65196, term65196.getClass(), "ignoreRepaint", false);
        setBooleanField(term65196, term65196.getClass(), "visible", false);
        setBooleanField(term65196, term65196.getClass(), "enabled", false);
        setBooleanField(term65196, term65196.getClass(), "valid", false);
        setField(term65196, term65196.getClass(), "dropTarget", null);
        setField(term65196, term65196.getClass(), "popups", null);
        setField(term65196, term65196.getClass(), "name", null);
        setBooleanField(term65196, term65196.getClass(), "nameExplicitlySet", false);
        setBooleanField(term65196, term65196.getClass(), "focusable", false);
        setIntField(term65196, term65196.getClass(), "isFocusTraversableOverridden", 0);
        setField(term65196, term65196.getClass(), "focusTraversalKeys", null);
        setBooleanField(term65196, term65196.getClass(), "focusTraversalKeysEnabled", false);
        setField(term65196, term65196.getClass(), "acc", null);
        setField(term65196, term65196.getClass(), "minSize", null);
        setBooleanField(term65196, term65196.getClass(), "minSizeSet", false);
        setField(term65196, term65196.getClass(), "prefSize", null);
        setBooleanField(term65196, term65196.getClass(), "prefSizeSet", false);
        setField(term65196, term65196.getClass(), "maxSize", null);
        setBooleanField(term65196, term65196.getClass(), "maxSizeSet", false);
        setField(term65196, term65196.getClass(), "componentOrientation", null);
        setBooleanField(term65196, term65196.getClass(), "newEventsOnly", false);
        setField(term65196, term65196.getClass(), "componentListener", null);
        setField(term65196, term65196.getClass(), "focusListener", null);
        setField(term65196, term65196.getClass(), "hierarchyListener", null);
        setField(term65196, term65196.getClass(), "hierarchyBoundsListener", null);
        setField(term65196, term65196.getClass(), "keyListener", null);
        setField(term65196, term65196.getClass(), "mouseListener", null);
        setField(term65196, term65196.getClass(), "mouseMotionListener", null);
        setField(term65196, term65196.getClass(), "mouseWheelListener", null);
        setField(term65196, term65196.getClass(), "inputMethodListener", null);
        setLongField(term65196, term65196.getClass(), "eventMask", 0L);
        setField(term65196, term65196.getClass(), "changeSupport", null);
        setField(term65196, term65196.getClass(), "objectLock", null);
        setBooleanField(term65196, term65196.getClass(), "isPacked", false);
        setIntField(term65196, term65196.getClass(), "boundsOp", 0);
        setField(term65196, term65196.getClass(), "compoundShape", null);
        setField(term65196, term65196.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term65196, term65196.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term65196, term65196.getClass(), "backgroundEraseDisabled", false);
        setField(term65196, term65196.getClass(), "eventCache", null);
        setBooleanField(term65196, term65196.getClass(), "coalescingEnabled", false);
        setBooleanField(term65196, term65196.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term65196, term65196.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.AssignmentCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMeanValue", argTypes, term65196, args);
    }

};


