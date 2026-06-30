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
     Object term26587;

    public AssignmentCreator_getSelectedMode_201015960612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26587 = newInstance(Class.forName("core.task.creator.AssignmentCreator"));
        setField(term26587, term26587.getClass(), "nameField", null);
        setField(term26587, term26587.getClass(), "groupChoice", null);
        setField(term26587, term26587.getClass(), "questionArea", null);
        setField(term26587, term26587.getClass(), "modes", null);
        setField(term26587, term26587.getClass(), "meanValue", null);
        setField(term26587, term26587.getClass(), "dField", null);
        setField(term26587, term26587.getClass(), "mField", null);
        setField(term26587, term26587.getClass(), "yField", null);
        setIntField(term26587, term26587.getClass(), "defaultCloseOperation", 0);
        setField(term26587, term26587.getClass(), "rootPane", null);
        setBooleanField(term26587, term26587.getClass(), "rootPaneCheckingEnabled", false);
        setField(term26587, term26587.getClass(), "transferHandler", null);
        setField(term26587, term26587.getClass(), "accessibleContext", null);
        setBooleanField(term26587, term26587.getClass(), "resizable", false);
        setBooleanField(term26587, term26587.getClass(), "undecorated", false);
        setBooleanField(term26587, term26587.getClass(), "initialized", false);
        setBooleanField(term26587, term26587.getClass(), "modal", false);
        setField(term26587, term26587.getClass(), "modalityType", null);
        setField(term26587, term26587.getClass(), "blockedWindows", null);
        setField(term26587, term26587.getClass(), "title", null);
        setField(term26587, term26587.getClass(), "modalFilter", null);
        setField(term26587, term26587.getClass(), "secondaryLoop", null);
        setBooleanField(term26587, term26587.getClass(), "isInHide", false);
        setBooleanField(term26587, term26587.getClass(), "isInDispose", false);
        setField(term26587, term26587.getClass(), "warningString", null);
        setField(term26587, term26587.getClass(), "icons", null);
        setField(term26587, term26587.getClass(), "temporaryLostComponent", null);
        setBooleanField(term26587, term26587.getClass(), "syncLWRequests", false);
        setBooleanField(term26587, term26587.getClass(), "beforeFirstShow", false);
        setBooleanField(term26587, term26587.getClass(), "disposing", false);
        setField(term26587, term26587.getClass(), "disposerRecord", null);
        setIntField(term26587, term26587.getClass(), "state", 0);
        setBooleanField(term26587, term26587.getClass(), "alwaysOnTop", false);
        setField(term26587, term26587.getClass(), "ownedWindowList", null);
        setField(term26587, term26587.getClass(), "weakThis", null);
        setBooleanField(term26587, term26587.getClass(), "showWithParent", false);
        setField(term26587, term26587.getClass(), "modalBlocker", null);
        setField(term26587, term26587.getClass(), "modalExclusionType", null);
        setField(term26587, term26587.getClass(), "windowListener", null);
        setField(term26587, term26587.getClass(), "windowStateListener", null);
        setField(term26587, term26587.getClass(), "windowFocusListener", null);
        setField(term26587, term26587.getClass(), "inputContext", null);
        setField(term26587, term26587.getClass(), "inputContextLock", null);
        setField(term26587, term26587.getClass(), "focusMgr", null);
        setBooleanField(term26587, term26587.getClass(), "focusableWindowState", false);
        setBooleanField(term26587, term26587.getClass(), "autoRequestFocus", false);
        setBooleanField(term26587, term26587.getClass(), "isInShow", false);
        setFloatField(term26587, term26587.getClass(), "opacity", 0.0F);
        setField(term26587, term26587.getClass(), "shape", null);
        setBooleanField(term26587, term26587.getClass(), "isTrayIconWindow", false);
        setIntField(term26587, term26587.getClass(), "securityWarningWidth", 0);
        setIntField(term26587, term26587.getClass(), "securityWarningHeight", 0);
        setDoubleField(term26587, term26587.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term26587, term26587.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term26587, term26587.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term26587, term26587.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term26587, term26587.getClass(), "anchor", null);
        setField(term26587, term26587.getClass(), "type", null);
        setIntField(term26587, term26587.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term26587, term26587.getClass(), "locationByPlatform", false);
        setField(term26587, term26587.getClass(), "component", null);
        setField(term26587, term26587.getClass(), "layoutMgr", null);
        setField(term26587, term26587.getClass(), "dispatcher", null);
        setField(term26587, term26587.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term26587, term26587.getClass(), "focusCycleRoot", false);
        setBooleanField(term26587, term26587.getClass(), "focusTraversalPolicyProvider", false);
        setField(term26587, term26587.getClass(), "printingThreads", null);
        setBooleanField(term26587, term26587.getClass(), "printing", false);
        setField(term26587, term26587.getClass(), "containerListener", null);
        setIntField(term26587, term26587.getClass(), "listeningChildren", 0);
        setIntField(term26587, term26587.getClass(), "listeningBoundsChildren", 0);
        setIntField(term26587, term26587.getClass(), "descendantsCount", 0);
        setField(term26587, term26587.getClass(), "preserveBackgroundColor", null);
        setIntField(term26587, term26587.getClass(), "numOfHWComponents", 0);
        setIntField(term26587, term26587.getClass(), "numOfLWComponents", 0);
        setField(term26587, term26587.getClass(), "modalComp", null);
        setField(term26587, term26587.getClass(), "modalAppContext", null);
        setIntField(term26587, term26587.getClass(), "containerSerializedDataVersion", 0);
        setField(term26587, term26587.getClass(), "peer", null);
        setField(term26587, term26587.getClass(), "parent", null);
        setField(term26587, term26587.getClass(), "appContext", null);
        setIntField(term26587, term26587.getClass(), "x", 0);
        setIntField(term26587, term26587.getClass(), "y", 0);
        setIntField(term26587, term26587.getClass(), "width", 0);
        setIntField(term26587, term26587.getClass(), "height", 0);
        setField(term26587, term26587.getClass(), "foreground", null);
        setField(term26587, term26587.getClass(), "background", null);
        setField(term26587, term26587.getClass(), "font", null);
        setField(term26587, term26587.getClass(), "peerFont", null);
        setField(term26587, term26587.getClass(), "cursor", null);
        setField(term26587, term26587.getClass(), "locale", null);
        setField(term26587, term26587.getClass(), "graphicsConfig", null);
        setField(term26587, term26587.getClass(), "bufferStrategy", null);
        setBooleanField(term26587, term26587.getClass(), "ignoreRepaint", false);
        setBooleanField(term26587, term26587.getClass(), "visible", false);
        setBooleanField(term26587, term26587.getClass(), "enabled", false);
        setBooleanField(term26587, term26587.getClass(), "valid", false);
        setField(term26587, term26587.getClass(), "dropTarget", null);
        setField(term26587, term26587.getClass(), "popups", null);
        setField(term26587, term26587.getClass(), "name", null);
        setBooleanField(term26587, term26587.getClass(), "nameExplicitlySet", false);
        setBooleanField(term26587, term26587.getClass(), "focusable", false);
        setIntField(term26587, term26587.getClass(), "isFocusTraversableOverridden", 0);
        setField(term26587, term26587.getClass(), "focusTraversalKeys", null);
        setBooleanField(term26587, term26587.getClass(), "focusTraversalKeysEnabled", false);
        setField(term26587, term26587.getClass(), "acc", null);
        setField(term26587, term26587.getClass(), "minSize", null);
        setBooleanField(term26587, term26587.getClass(), "minSizeSet", false);
        setField(term26587, term26587.getClass(), "prefSize", null);
        setBooleanField(term26587, term26587.getClass(), "prefSizeSet", false);
        setField(term26587, term26587.getClass(), "maxSize", null);
        setBooleanField(term26587, term26587.getClass(), "maxSizeSet", false);
        setField(term26587, term26587.getClass(), "componentOrientation", null);
        setBooleanField(term26587, term26587.getClass(), "newEventsOnly", false);
        setField(term26587, term26587.getClass(), "componentListener", null);
        setField(term26587, term26587.getClass(), "focusListener", null);
        setField(term26587, term26587.getClass(), "hierarchyListener", null);
        setField(term26587, term26587.getClass(), "hierarchyBoundsListener", null);
        setField(term26587, term26587.getClass(), "keyListener", null);
        setField(term26587, term26587.getClass(), "mouseListener", null);
        setField(term26587, term26587.getClass(), "mouseMotionListener", null);
        setField(term26587, term26587.getClass(), "mouseWheelListener", null);
        setField(term26587, term26587.getClass(), "inputMethodListener", null);
        setLongField(term26587, term26587.getClass(), "eventMask", 0L);
        setField(term26587, term26587.getClass(), "changeSupport", null);
        setField(term26587, term26587.getClass(), "objectLock", null);
        setBooleanField(term26587, term26587.getClass(), "isPacked", false);
        setIntField(term26587, term26587.getClass(), "boundsOp", 0);
        setField(term26587, term26587.getClass(), "compoundShape", null);
        setField(term26587, term26587.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term26587, term26587.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term26587, term26587.getClass(), "backgroundEraseDisabled", false);
        setField(term26587, term26587.getClass(), "eventCache", null);
        setBooleanField(term26587, term26587.getClass(), "coalescingEnabled", false);
        setBooleanField(term26587, term26587.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term26587, term26587.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.AssignmentCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelectedMode", argTypes, term26587, args);
    }

};


