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

public class AssignmentCreator_keepAskingEmailAddress_37208722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7993;

    public AssignmentCreator_keepAskingEmailAddress_37208722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7993 = newInstance(Class.forName("core.task.creator.AssignmentCreator"));
        setField(term7993, term7993.getClass(), "nameField", null);
        setField(term7993, term7993.getClass(), "groupChoice", null);
        setField(term7993, term7993.getClass(), "questionArea", null);
        setField(term7993, term7993.getClass(), "modes", null);
        setField(term7993, term7993.getClass(), "meanValue", null);
        setField(term7993, term7993.getClass(), "dField", null);
        setField(term7993, term7993.getClass(), "mField", null);
        setField(term7993, term7993.getClass(), "yField", null);
        setIntField(term7993, term7993.getClass(), "defaultCloseOperation", 0);
        setField(term7993, term7993.getClass(), "rootPane", null);
        setBooleanField(term7993, term7993.getClass(), "rootPaneCheckingEnabled", false);
        setField(term7993, term7993.getClass(), "transferHandler", null);
        setField(term7993, term7993.getClass(), "accessibleContext", null);
        setBooleanField(term7993, term7993.getClass(), "resizable", false);
        setBooleanField(term7993, term7993.getClass(), "undecorated", false);
        setBooleanField(term7993, term7993.getClass(), "initialized", false);
        setBooleanField(term7993, term7993.getClass(), "modal", false);
        setField(term7993, term7993.getClass(), "modalityType", null);
        setField(term7993, term7993.getClass(), "blockedWindows", null);
        setField(term7993, term7993.getClass(), "title", null);
        setField(term7993, term7993.getClass(), "modalFilter", null);
        setField(term7993, term7993.getClass(), "secondaryLoop", null);
        setBooleanField(term7993, term7993.getClass(), "isInHide", false);
        setBooleanField(term7993, term7993.getClass(), "isInDispose", false);
        setField(term7993, term7993.getClass(), "warningString", null);
        setField(term7993, term7993.getClass(), "icons", null);
        setField(term7993, term7993.getClass(), "temporaryLostComponent", null);
        setBooleanField(term7993, term7993.getClass(), "syncLWRequests", false);
        setBooleanField(term7993, term7993.getClass(), "beforeFirstShow", false);
        setBooleanField(term7993, term7993.getClass(), "disposing", false);
        setField(term7993, term7993.getClass(), "disposerRecord", null);
        setIntField(term7993, term7993.getClass(), "state", 0);
        setBooleanField(term7993, term7993.getClass(), "alwaysOnTop", false);
        setField(term7993, term7993.getClass(), "ownedWindowList", null);
        setField(term7993, term7993.getClass(), "weakThis", null);
        setBooleanField(term7993, term7993.getClass(), "showWithParent", false);
        setField(term7993, term7993.getClass(), "modalBlocker", null);
        setField(term7993, term7993.getClass(), "modalExclusionType", null);
        setField(term7993, term7993.getClass(), "windowListener", null);
        setField(term7993, term7993.getClass(), "windowStateListener", null);
        setField(term7993, term7993.getClass(), "windowFocusListener", null);
        setField(term7993, term7993.getClass(), "inputContext", null);
        setField(term7993, term7993.getClass(), "inputContextLock", null);
        setField(term7993, term7993.getClass(), "focusMgr", null);
        setBooleanField(term7993, term7993.getClass(), "focusableWindowState", false);
        setBooleanField(term7993, term7993.getClass(), "autoRequestFocus", false);
        setBooleanField(term7993, term7993.getClass(), "isInShow", false);
        setFloatField(term7993, term7993.getClass(), "opacity", 0.0F);
        setField(term7993, term7993.getClass(), "shape", null);
        setBooleanField(term7993, term7993.getClass(), "isTrayIconWindow", false);
        setIntField(term7993, term7993.getClass(), "securityWarningWidth", 0);
        setIntField(term7993, term7993.getClass(), "securityWarningHeight", 0);
        setDoubleField(term7993, term7993.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term7993, term7993.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term7993, term7993.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term7993, term7993.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term7993, term7993.getClass(), "anchor", null);
        setField(term7993, term7993.getClass(), "type", null);
        setIntField(term7993, term7993.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term7993, term7993.getClass(), "locationByPlatform", false);
        setField(term7993, term7993.getClass(), "component", null);
        setField(term7993, term7993.getClass(), "layoutMgr", null);
        setField(term7993, term7993.getClass(), "dispatcher", null);
        setField(term7993, term7993.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term7993, term7993.getClass(), "focusCycleRoot", false);
        setBooleanField(term7993, term7993.getClass(), "focusTraversalPolicyProvider", false);
        setField(term7993, term7993.getClass(), "printingThreads", null);
        setBooleanField(term7993, term7993.getClass(), "printing", false);
        setField(term7993, term7993.getClass(), "containerListener", null);
        setIntField(term7993, term7993.getClass(), "listeningChildren", 0);
        setIntField(term7993, term7993.getClass(), "listeningBoundsChildren", 0);
        setIntField(term7993, term7993.getClass(), "descendantsCount", 0);
        setField(term7993, term7993.getClass(), "preserveBackgroundColor", null);
        setIntField(term7993, term7993.getClass(), "numOfHWComponents", 0);
        setIntField(term7993, term7993.getClass(), "numOfLWComponents", 0);
        setField(term7993, term7993.getClass(), "modalComp", null);
        setField(term7993, term7993.getClass(), "modalAppContext", null);
        setIntField(term7993, term7993.getClass(), "containerSerializedDataVersion", 0);
        setField(term7993, term7993.getClass(), "peer", null);
        setField(term7993, term7993.getClass(), "parent", null);
        setField(term7993, term7993.getClass(), "appContext", null);
        setIntField(term7993, term7993.getClass(), "x", 0);
        setIntField(term7993, term7993.getClass(), "y", 0);
        setIntField(term7993, term7993.getClass(), "width", 0);
        setIntField(term7993, term7993.getClass(), "height", 0);
        setField(term7993, term7993.getClass(), "foreground", null);
        setField(term7993, term7993.getClass(), "background", null);
        setField(term7993, term7993.getClass(), "font", null);
        setField(term7993, term7993.getClass(), "peerFont", null);
        setField(term7993, term7993.getClass(), "cursor", null);
        setField(term7993, term7993.getClass(), "locale", null);
        setField(term7993, term7993.getClass(), "graphicsConfig", null);
        setField(term7993, term7993.getClass(), "bufferStrategy", null);
        setBooleanField(term7993, term7993.getClass(), "ignoreRepaint", false);
        setBooleanField(term7993, term7993.getClass(), "visible", false);
        setBooleanField(term7993, term7993.getClass(), "enabled", false);
        setBooleanField(term7993, term7993.getClass(), "valid", false);
        setField(term7993, term7993.getClass(), "dropTarget", null);
        setField(term7993, term7993.getClass(), "popups", null);
        setField(term7993, term7993.getClass(), "name", null);
        setBooleanField(term7993, term7993.getClass(), "nameExplicitlySet", false);
        setBooleanField(term7993, term7993.getClass(), "focusable", false);
        setIntField(term7993, term7993.getClass(), "isFocusTraversableOverridden", 0);
        setField(term7993, term7993.getClass(), "focusTraversalKeys", null);
        setBooleanField(term7993, term7993.getClass(), "focusTraversalKeysEnabled", false);
        setField(term7993, term7993.getClass(), "acc", null);
        setField(term7993, term7993.getClass(), "minSize", null);
        setBooleanField(term7993, term7993.getClass(), "minSizeSet", false);
        setField(term7993, term7993.getClass(), "prefSize", null);
        setBooleanField(term7993, term7993.getClass(), "prefSizeSet", false);
        setField(term7993, term7993.getClass(), "maxSize", null);
        setBooleanField(term7993, term7993.getClass(), "maxSizeSet", false);
        setField(term7993, term7993.getClass(), "componentOrientation", null);
        setBooleanField(term7993, term7993.getClass(), "newEventsOnly", false);
        setField(term7993, term7993.getClass(), "componentListener", null);
        setField(term7993, term7993.getClass(), "focusListener", null);
        setField(term7993, term7993.getClass(), "hierarchyListener", null);
        setField(term7993, term7993.getClass(), "hierarchyBoundsListener", null);
        setField(term7993, term7993.getClass(), "keyListener", null);
        setField(term7993, term7993.getClass(), "mouseListener", null);
        setField(term7993, term7993.getClass(), "mouseMotionListener", null);
        setField(term7993, term7993.getClass(), "mouseWheelListener", null);
        setField(term7993, term7993.getClass(), "inputMethodListener", null);
        setLongField(term7993, term7993.getClass(), "eventMask", 0L);
        setField(term7993, term7993.getClass(), "changeSupport", null);
        setField(term7993, term7993.getClass(), "objectLock", null);
        setBooleanField(term7993, term7993.getClass(), "isPacked", false);
        setIntField(term7993, term7993.getClass(), "boundsOp", 0);
        setField(term7993, term7993.getClass(), "compoundShape", null);
        setField(term7993, term7993.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term7993, term7993.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term7993, term7993.getClass(), "backgroundEraseDisabled", false);
        setField(term7993, term7993.getClass(), "eventCache", null);
        setBooleanField(term7993, term7993.getClass(), "coalescingEnabled", false);
        setBooleanField(term7993, term7993.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term7993, term7993.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.AssignmentCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "keepAskingEmailAddress", argTypes, term7993, args);
    }

};


