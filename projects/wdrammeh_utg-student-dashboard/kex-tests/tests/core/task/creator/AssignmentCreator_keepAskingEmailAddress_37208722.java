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
     Object term43185;

    public AssignmentCreator_keepAskingEmailAddress_37208722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43185 = newInstance(Class.forName("core.task.creator.AssignmentCreator"));
        setField(term43185, term43185.getClass(), "nameField", null);
        setField(term43185, term43185.getClass(), "groupChoice", null);
        setField(term43185, term43185.getClass(), "questionArea", null);
        setField(term43185, term43185.getClass(), "modes", null);
        setField(term43185, term43185.getClass(), "meanValue", null);
        setField(term43185, term43185.getClass(), "dField", null);
        setField(term43185, term43185.getClass(), "mField", null);
        setField(term43185, term43185.getClass(), "yField", null);
        setIntField(term43185, term43185.getClass(), "defaultCloseOperation", 0);
        setField(term43185, term43185.getClass(), "rootPane", null);
        setBooleanField(term43185, term43185.getClass(), "rootPaneCheckingEnabled", false);
        setField(term43185, term43185.getClass(), "transferHandler", null);
        setField(term43185, term43185.getClass(), "accessibleContext", null);
        setBooleanField(term43185, term43185.getClass(), "resizable", false);
        setBooleanField(term43185, term43185.getClass(), "undecorated", false);
        setBooleanField(term43185, term43185.getClass(), "initialized", false);
        setBooleanField(term43185, term43185.getClass(), "modal", false);
        setField(term43185, term43185.getClass(), "modalityType", null);
        setField(term43185, term43185.getClass(), "blockedWindows", null);
        setField(term43185, term43185.getClass(), "title", null);
        setField(term43185, term43185.getClass(), "modalFilter", null);
        setField(term43185, term43185.getClass(), "secondaryLoop", null);
        setBooleanField(term43185, term43185.getClass(), "isInHide", false);
        setBooleanField(term43185, term43185.getClass(), "isInDispose", false);
        setField(term43185, term43185.getClass(), "warningString", null);
        setField(term43185, term43185.getClass(), "icons", null);
        setField(term43185, term43185.getClass(), "temporaryLostComponent", null);
        setBooleanField(term43185, term43185.getClass(), "syncLWRequests", false);
        setBooleanField(term43185, term43185.getClass(), "beforeFirstShow", false);
        setBooleanField(term43185, term43185.getClass(), "disposing", false);
        setField(term43185, term43185.getClass(), "disposerRecord", null);
        setIntField(term43185, term43185.getClass(), "state", 0);
        setBooleanField(term43185, term43185.getClass(), "alwaysOnTop", false);
        setField(term43185, term43185.getClass(), "ownedWindowList", null);
        setField(term43185, term43185.getClass(), "weakThis", null);
        setBooleanField(term43185, term43185.getClass(), "showWithParent", false);
        setField(term43185, term43185.getClass(), "modalBlocker", null);
        setField(term43185, term43185.getClass(), "modalExclusionType", null);
        setField(term43185, term43185.getClass(), "windowListener", null);
        setField(term43185, term43185.getClass(), "windowStateListener", null);
        setField(term43185, term43185.getClass(), "windowFocusListener", null);
        setField(term43185, term43185.getClass(), "inputContext", null);
        setField(term43185, term43185.getClass(), "inputContextLock", null);
        setField(term43185, term43185.getClass(), "focusMgr", null);
        setBooleanField(term43185, term43185.getClass(), "focusableWindowState", false);
        setBooleanField(term43185, term43185.getClass(), "autoRequestFocus", false);
        setBooleanField(term43185, term43185.getClass(), "isInShow", false);
        setFloatField(term43185, term43185.getClass(), "opacity", 0.0F);
        setField(term43185, term43185.getClass(), "shape", null);
        setBooleanField(term43185, term43185.getClass(), "isTrayIconWindow", false);
        setIntField(term43185, term43185.getClass(), "securityWarningWidth", 0);
        setIntField(term43185, term43185.getClass(), "securityWarningHeight", 0);
        setDoubleField(term43185, term43185.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term43185, term43185.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term43185, term43185.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term43185, term43185.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term43185, term43185.getClass(), "anchor", null);
        setField(term43185, term43185.getClass(), "type", null);
        setIntField(term43185, term43185.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term43185, term43185.getClass(), "locationByPlatform", false);
        setField(term43185, term43185.getClass(), "component", null);
        setField(term43185, term43185.getClass(), "layoutMgr", null);
        setField(term43185, term43185.getClass(), "dispatcher", null);
        setField(term43185, term43185.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term43185, term43185.getClass(), "focusCycleRoot", false);
        setBooleanField(term43185, term43185.getClass(), "focusTraversalPolicyProvider", false);
        setField(term43185, term43185.getClass(), "printingThreads", null);
        setBooleanField(term43185, term43185.getClass(), "printing", false);
        setField(term43185, term43185.getClass(), "containerListener", null);
        setIntField(term43185, term43185.getClass(), "listeningChildren", 0);
        setIntField(term43185, term43185.getClass(), "listeningBoundsChildren", 0);
        setIntField(term43185, term43185.getClass(), "descendantsCount", 0);
        setField(term43185, term43185.getClass(), "preserveBackgroundColor", null);
        setIntField(term43185, term43185.getClass(), "numOfHWComponents", 0);
        setIntField(term43185, term43185.getClass(), "numOfLWComponents", 0);
        setField(term43185, term43185.getClass(), "modalComp", null);
        setField(term43185, term43185.getClass(), "modalAppContext", null);
        setIntField(term43185, term43185.getClass(), "containerSerializedDataVersion", 0);
        setField(term43185, term43185.getClass(), "peer", null);
        setField(term43185, term43185.getClass(), "parent", null);
        setField(term43185, term43185.getClass(), "appContext", null);
        setIntField(term43185, term43185.getClass(), "x", 0);
        setIntField(term43185, term43185.getClass(), "y", 0);
        setIntField(term43185, term43185.getClass(), "width", 0);
        setIntField(term43185, term43185.getClass(), "height", 0);
        setField(term43185, term43185.getClass(), "foreground", null);
        setField(term43185, term43185.getClass(), "background", null);
        setField(term43185, term43185.getClass(), "font", null);
        setField(term43185, term43185.getClass(), "peerFont", null);
        setField(term43185, term43185.getClass(), "cursor", null);
        setField(term43185, term43185.getClass(), "locale", null);
        setField(term43185, term43185.getClass(), "graphicsConfig", null);
        setField(term43185, term43185.getClass(), "bufferStrategy", null);
        setBooleanField(term43185, term43185.getClass(), "ignoreRepaint", false);
        setBooleanField(term43185, term43185.getClass(), "visible", false);
        setBooleanField(term43185, term43185.getClass(), "enabled", false);
        setBooleanField(term43185, term43185.getClass(), "valid", false);
        setField(term43185, term43185.getClass(), "dropTarget", null);
        setField(term43185, term43185.getClass(), "popups", null);
        setField(term43185, term43185.getClass(), "name", null);
        setBooleanField(term43185, term43185.getClass(), "nameExplicitlySet", false);
        setBooleanField(term43185, term43185.getClass(), "focusable", false);
        setIntField(term43185, term43185.getClass(), "isFocusTraversableOverridden", 0);
        setField(term43185, term43185.getClass(), "focusTraversalKeys", null);
        setBooleanField(term43185, term43185.getClass(), "focusTraversalKeysEnabled", false);
        setField(term43185, term43185.getClass(), "acc", null);
        setField(term43185, term43185.getClass(), "minSize", null);
        setBooleanField(term43185, term43185.getClass(), "minSizeSet", false);
        setField(term43185, term43185.getClass(), "prefSize", null);
        setBooleanField(term43185, term43185.getClass(), "prefSizeSet", false);
        setField(term43185, term43185.getClass(), "maxSize", null);
        setBooleanField(term43185, term43185.getClass(), "maxSizeSet", false);
        setField(term43185, term43185.getClass(), "componentOrientation", null);
        setBooleanField(term43185, term43185.getClass(), "newEventsOnly", false);
        setField(term43185, term43185.getClass(), "componentListener", null);
        setField(term43185, term43185.getClass(), "focusListener", null);
        setField(term43185, term43185.getClass(), "hierarchyListener", null);
        setField(term43185, term43185.getClass(), "hierarchyBoundsListener", null);
        setField(term43185, term43185.getClass(), "keyListener", null);
        setField(term43185, term43185.getClass(), "mouseListener", null);
        setField(term43185, term43185.getClass(), "mouseMotionListener", null);
        setField(term43185, term43185.getClass(), "mouseWheelListener", null);
        setField(term43185, term43185.getClass(), "inputMethodListener", null);
        setLongField(term43185, term43185.getClass(), "eventMask", 0L);
        setField(term43185, term43185.getClass(), "changeSupport", null);
        setField(term43185, term43185.getClass(), "objectLock", null);
        setBooleanField(term43185, term43185.getClass(), "isPacked", false);
        setIntField(term43185, term43185.getClass(), "boundsOp", 0);
        setField(term43185, term43185.getClass(), "compoundShape", null);
        setField(term43185, term43185.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term43185, term43185.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term43185, term43185.getClass(), "backgroundEraseDisabled", false);
        setField(term43185, term43185.getClass(), "eventCache", null);
        setBooleanField(term43185, term43185.getClass(), "coalescingEnabled", false);
        setBooleanField(term43185, term43185.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term43185, term43185.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.AssignmentCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "keepAskingEmailAddress", argTypes, term43185, args);
    }

};


