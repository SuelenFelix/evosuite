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

public class AssignmentCreator_getSelectedMode_201015960612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61410;

    public AssignmentCreator_getSelectedMode_201015960612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61410 = newInstance(Class.forName("core.task.creator.AssignmentCreator"));
        setField(term61410, term61410.getClass(), "nameField", null);
        setField(term61410, term61410.getClass(), "groupChoice", null);
        setField(term61410, term61410.getClass(), "questionArea", null);
        setField(term61410, term61410.getClass(), "modes", null);
        setField(term61410, term61410.getClass(), "meanValue", null);
        setField(term61410, term61410.getClass(), "dField", null);
        setField(term61410, term61410.getClass(), "mField", null);
        setField(term61410, term61410.getClass(), "yField", null);
        setIntField(term61410, term61410.getClass(), "defaultCloseOperation", 0);
        setField(term61410, term61410.getClass(), "rootPane", null);
        setBooleanField(term61410, term61410.getClass(), "rootPaneCheckingEnabled", false);
        setField(term61410, term61410.getClass(), "transferHandler", null);
        setField(term61410, term61410.getClass(), "accessibleContext", null);
        setBooleanField(term61410, term61410.getClass(), "resizable", false);
        setBooleanField(term61410, term61410.getClass(), "undecorated", false);
        setBooleanField(term61410, term61410.getClass(), "initialized", false);
        setBooleanField(term61410, term61410.getClass(), "modal", false);
        setField(term61410, term61410.getClass(), "modalityType", null);
        setField(term61410, term61410.getClass(), "blockedWindows", null);
        setField(term61410, term61410.getClass(), "title", null);
        setField(term61410, term61410.getClass(), "modalFilter", null);
        setField(term61410, term61410.getClass(), "secondaryLoop", null);
        setBooleanField(term61410, term61410.getClass(), "isInHide", false);
        setBooleanField(term61410, term61410.getClass(), "isInDispose", false);
        setField(term61410, term61410.getClass(), "warningString", null);
        setField(term61410, term61410.getClass(), "icons", null);
        setField(term61410, term61410.getClass(), "temporaryLostComponent", null);
        setBooleanField(term61410, term61410.getClass(), "syncLWRequests", false);
        setBooleanField(term61410, term61410.getClass(), "beforeFirstShow", false);
        setBooleanField(term61410, term61410.getClass(), "disposing", false);
        setField(term61410, term61410.getClass(), "disposerRecord", null);
        setIntField(term61410, term61410.getClass(), "state", 0);
        setBooleanField(term61410, term61410.getClass(), "alwaysOnTop", false);
        setField(term61410, term61410.getClass(), "ownedWindowList", null);
        setField(term61410, term61410.getClass(), "weakThis", null);
        setBooleanField(term61410, term61410.getClass(), "showWithParent", false);
        setField(term61410, term61410.getClass(), "modalBlocker", null);
        setField(term61410, term61410.getClass(), "modalExclusionType", null);
        setField(term61410, term61410.getClass(), "windowListener", null);
        setField(term61410, term61410.getClass(), "windowStateListener", null);
        setField(term61410, term61410.getClass(), "windowFocusListener", null);
        setField(term61410, term61410.getClass(), "inputContext", null);
        setField(term61410, term61410.getClass(), "inputContextLock", null);
        setField(term61410, term61410.getClass(), "focusMgr", null);
        setBooleanField(term61410, term61410.getClass(), "focusableWindowState", false);
        setBooleanField(term61410, term61410.getClass(), "autoRequestFocus", false);
        setBooleanField(term61410, term61410.getClass(), "isInShow", false);
        setFloatField(term61410, term61410.getClass(), "opacity", 0.0F);
        setField(term61410, term61410.getClass(), "shape", null);
        setBooleanField(term61410, term61410.getClass(), "isTrayIconWindow", false);
        setIntField(term61410, term61410.getClass(), "securityWarningWidth", 0);
        setIntField(term61410, term61410.getClass(), "securityWarningHeight", 0);
        setDoubleField(term61410, term61410.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term61410, term61410.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term61410, term61410.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term61410, term61410.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term61410, term61410.getClass(), "anchor", null);
        setField(term61410, term61410.getClass(), "type", null);
        setIntField(term61410, term61410.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term61410, term61410.getClass(), "locationByPlatform", false);
        setField(term61410, term61410.getClass(), "component", null);
        setField(term61410, term61410.getClass(), "layoutMgr", null);
        setField(term61410, term61410.getClass(), "dispatcher", null);
        setField(term61410, term61410.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term61410, term61410.getClass(), "focusCycleRoot", false);
        setBooleanField(term61410, term61410.getClass(), "focusTraversalPolicyProvider", false);
        setField(term61410, term61410.getClass(), "printingThreads", null);
        setBooleanField(term61410, term61410.getClass(), "printing", false);
        setField(term61410, term61410.getClass(), "containerListener", null);
        setIntField(term61410, term61410.getClass(), "listeningChildren", 0);
        setIntField(term61410, term61410.getClass(), "listeningBoundsChildren", 0);
        setIntField(term61410, term61410.getClass(), "descendantsCount", 0);
        setField(term61410, term61410.getClass(), "preserveBackgroundColor", null);
        setIntField(term61410, term61410.getClass(), "numOfHWComponents", 0);
        setIntField(term61410, term61410.getClass(), "numOfLWComponents", 0);
        setField(term61410, term61410.getClass(), "modalComp", null);
        setField(term61410, term61410.getClass(), "modalAppContext", null);
        setIntField(term61410, term61410.getClass(), "containerSerializedDataVersion", 0);
        setField(term61410, term61410.getClass(), "peer", null);
        setField(term61410, term61410.getClass(), "parent", null);
        setField(term61410, term61410.getClass(), "appContext", null);
        setIntField(term61410, term61410.getClass(), "x", 0);
        setIntField(term61410, term61410.getClass(), "y", 0);
        setIntField(term61410, term61410.getClass(), "width", 0);
        setIntField(term61410, term61410.getClass(), "height", 0);
        setField(term61410, term61410.getClass(), "foreground", null);
        setField(term61410, term61410.getClass(), "background", null);
        setField(term61410, term61410.getClass(), "font", null);
        setField(term61410, term61410.getClass(), "peerFont", null);
        setField(term61410, term61410.getClass(), "cursor", null);
        setField(term61410, term61410.getClass(), "locale", null);
        setField(term61410, term61410.getClass(), "graphicsConfig", null);
        setField(term61410, term61410.getClass(), "bufferStrategy", null);
        setBooleanField(term61410, term61410.getClass(), "ignoreRepaint", false);
        setBooleanField(term61410, term61410.getClass(), "visible", false);
        setBooleanField(term61410, term61410.getClass(), "enabled", false);
        setBooleanField(term61410, term61410.getClass(), "valid", false);
        setField(term61410, term61410.getClass(), "dropTarget", null);
        setField(term61410, term61410.getClass(), "popups", null);
        setField(term61410, term61410.getClass(), "name", null);
        setBooleanField(term61410, term61410.getClass(), "nameExplicitlySet", false);
        setBooleanField(term61410, term61410.getClass(), "focusable", false);
        setIntField(term61410, term61410.getClass(), "isFocusTraversableOverridden", 0);
        setField(term61410, term61410.getClass(), "focusTraversalKeys", null);
        setBooleanField(term61410, term61410.getClass(), "focusTraversalKeysEnabled", false);
        setField(term61410, term61410.getClass(), "acc", null);
        setField(term61410, term61410.getClass(), "minSize", null);
        setBooleanField(term61410, term61410.getClass(), "minSizeSet", false);
        setField(term61410, term61410.getClass(), "prefSize", null);
        setBooleanField(term61410, term61410.getClass(), "prefSizeSet", false);
        setField(term61410, term61410.getClass(), "maxSize", null);
        setBooleanField(term61410, term61410.getClass(), "maxSizeSet", false);
        setField(term61410, term61410.getClass(), "componentOrientation", null);
        setBooleanField(term61410, term61410.getClass(), "newEventsOnly", false);
        setField(term61410, term61410.getClass(), "componentListener", null);
        setField(term61410, term61410.getClass(), "focusListener", null);
        setField(term61410, term61410.getClass(), "hierarchyListener", null);
        setField(term61410, term61410.getClass(), "hierarchyBoundsListener", null);
        setField(term61410, term61410.getClass(), "keyListener", null);
        setField(term61410, term61410.getClass(), "mouseListener", null);
        setField(term61410, term61410.getClass(), "mouseMotionListener", null);
        setField(term61410, term61410.getClass(), "mouseWheelListener", null);
        setField(term61410, term61410.getClass(), "inputMethodListener", null);
        setLongField(term61410, term61410.getClass(), "eventMask", 0L);
        setField(term61410, term61410.getClass(), "changeSupport", null);
        setField(term61410, term61410.getClass(), "objectLock", null);
        setBooleanField(term61410, term61410.getClass(), "isPacked", false);
        setIntField(term61410, term61410.getClass(), "boundsOp", 0);
        setField(term61410, term61410.getClass(), "compoundShape", null);
        setField(term61410, term61410.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term61410, term61410.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term61410, term61410.getClass(), "backgroundEraseDisabled", false);
        setField(term61410, term61410.getClass(), "eventCache", null);
        setBooleanField(term61410, term61410.getClass(), "coalescingEnabled", false);
        setBooleanField(term61410, term61410.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term61410, term61410.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.AssignmentCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelectedMode", argTypes, term61410, args);
    }

};


