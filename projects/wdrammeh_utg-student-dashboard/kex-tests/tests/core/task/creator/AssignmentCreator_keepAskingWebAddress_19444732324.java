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

public class AssignmentCreator_keepAskingWebAddress_19444732324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46833;

    public AssignmentCreator_keepAskingWebAddress_19444732324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46833 = newInstance(Class.forName("core.task.creator.AssignmentCreator"));
        setField(term46833, term46833.getClass(), "nameField", null);
        setField(term46833, term46833.getClass(), "groupChoice", null);
        setField(term46833, term46833.getClass(), "questionArea", null);
        setField(term46833, term46833.getClass(), "modes", null);
        setField(term46833, term46833.getClass(), "meanValue", null);
        setField(term46833, term46833.getClass(), "dField", null);
        setField(term46833, term46833.getClass(), "mField", null);
        setField(term46833, term46833.getClass(), "yField", null);
        setIntField(term46833, term46833.getClass(), "defaultCloseOperation", 0);
        setField(term46833, term46833.getClass(), "rootPane", null);
        setBooleanField(term46833, term46833.getClass(), "rootPaneCheckingEnabled", false);
        setField(term46833, term46833.getClass(), "transferHandler", null);
        setField(term46833, term46833.getClass(), "accessibleContext", null);
        setBooleanField(term46833, term46833.getClass(), "resizable", false);
        setBooleanField(term46833, term46833.getClass(), "undecorated", false);
        setBooleanField(term46833, term46833.getClass(), "initialized", false);
        setBooleanField(term46833, term46833.getClass(), "modal", false);
        setField(term46833, term46833.getClass(), "modalityType", null);
        setField(term46833, term46833.getClass(), "blockedWindows", null);
        setField(term46833, term46833.getClass(), "title", null);
        setField(term46833, term46833.getClass(), "modalFilter", null);
        setField(term46833, term46833.getClass(), "secondaryLoop", null);
        setBooleanField(term46833, term46833.getClass(), "isInHide", false);
        setBooleanField(term46833, term46833.getClass(), "isInDispose", false);
        setField(term46833, term46833.getClass(), "warningString", null);
        setField(term46833, term46833.getClass(), "icons", null);
        setField(term46833, term46833.getClass(), "temporaryLostComponent", null);
        setBooleanField(term46833, term46833.getClass(), "syncLWRequests", false);
        setBooleanField(term46833, term46833.getClass(), "beforeFirstShow", false);
        setBooleanField(term46833, term46833.getClass(), "disposing", false);
        setField(term46833, term46833.getClass(), "disposerRecord", null);
        setIntField(term46833, term46833.getClass(), "state", 0);
        setBooleanField(term46833, term46833.getClass(), "alwaysOnTop", false);
        setField(term46833, term46833.getClass(), "ownedWindowList", null);
        setField(term46833, term46833.getClass(), "weakThis", null);
        setBooleanField(term46833, term46833.getClass(), "showWithParent", false);
        setField(term46833, term46833.getClass(), "modalBlocker", null);
        setField(term46833, term46833.getClass(), "modalExclusionType", null);
        setField(term46833, term46833.getClass(), "windowListener", null);
        setField(term46833, term46833.getClass(), "windowStateListener", null);
        setField(term46833, term46833.getClass(), "windowFocusListener", null);
        setField(term46833, term46833.getClass(), "inputContext", null);
        setField(term46833, term46833.getClass(), "inputContextLock", null);
        setField(term46833, term46833.getClass(), "focusMgr", null);
        setBooleanField(term46833, term46833.getClass(), "focusableWindowState", false);
        setBooleanField(term46833, term46833.getClass(), "autoRequestFocus", false);
        setBooleanField(term46833, term46833.getClass(), "isInShow", false);
        setFloatField(term46833, term46833.getClass(), "opacity", 0.0F);
        setField(term46833, term46833.getClass(), "shape", null);
        setBooleanField(term46833, term46833.getClass(), "isTrayIconWindow", false);
        setIntField(term46833, term46833.getClass(), "securityWarningWidth", 0);
        setIntField(term46833, term46833.getClass(), "securityWarningHeight", 0);
        setDoubleField(term46833, term46833.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term46833, term46833.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term46833, term46833.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term46833, term46833.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term46833, term46833.getClass(), "anchor", null);
        setField(term46833, term46833.getClass(), "type", null);
        setIntField(term46833, term46833.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term46833, term46833.getClass(), "locationByPlatform", false);
        setField(term46833, term46833.getClass(), "component", null);
        setField(term46833, term46833.getClass(), "layoutMgr", null);
        setField(term46833, term46833.getClass(), "dispatcher", null);
        setField(term46833, term46833.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term46833, term46833.getClass(), "focusCycleRoot", false);
        setBooleanField(term46833, term46833.getClass(), "focusTraversalPolicyProvider", false);
        setField(term46833, term46833.getClass(), "printingThreads", null);
        setBooleanField(term46833, term46833.getClass(), "printing", false);
        setField(term46833, term46833.getClass(), "containerListener", null);
        setIntField(term46833, term46833.getClass(), "listeningChildren", 0);
        setIntField(term46833, term46833.getClass(), "listeningBoundsChildren", 0);
        setIntField(term46833, term46833.getClass(), "descendantsCount", 0);
        setField(term46833, term46833.getClass(), "preserveBackgroundColor", null);
        setIntField(term46833, term46833.getClass(), "numOfHWComponents", 0);
        setIntField(term46833, term46833.getClass(), "numOfLWComponents", 0);
        setField(term46833, term46833.getClass(), "modalComp", null);
        setField(term46833, term46833.getClass(), "modalAppContext", null);
        setIntField(term46833, term46833.getClass(), "containerSerializedDataVersion", 0);
        setField(term46833, term46833.getClass(), "peer", null);
        setField(term46833, term46833.getClass(), "parent", null);
        setField(term46833, term46833.getClass(), "appContext", null);
        setIntField(term46833, term46833.getClass(), "x", 0);
        setIntField(term46833, term46833.getClass(), "y", 0);
        setIntField(term46833, term46833.getClass(), "width", 0);
        setIntField(term46833, term46833.getClass(), "height", 0);
        setField(term46833, term46833.getClass(), "foreground", null);
        setField(term46833, term46833.getClass(), "background", null);
        setField(term46833, term46833.getClass(), "font", null);
        setField(term46833, term46833.getClass(), "peerFont", null);
        setField(term46833, term46833.getClass(), "cursor", null);
        setField(term46833, term46833.getClass(), "locale", null);
        setField(term46833, term46833.getClass(), "graphicsConfig", null);
        setField(term46833, term46833.getClass(), "bufferStrategy", null);
        setBooleanField(term46833, term46833.getClass(), "ignoreRepaint", false);
        setBooleanField(term46833, term46833.getClass(), "visible", false);
        setBooleanField(term46833, term46833.getClass(), "enabled", false);
        setBooleanField(term46833, term46833.getClass(), "valid", false);
        setField(term46833, term46833.getClass(), "dropTarget", null);
        setField(term46833, term46833.getClass(), "popups", null);
        setField(term46833, term46833.getClass(), "name", null);
        setBooleanField(term46833, term46833.getClass(), "nameExplicitlySet", false);
        setBooleanField(term46833, term46833.getClass(), "focusable", false);
        setIntField(term46833, term46833.getClass(), "isFocusTraversableOverridden", 0);
        setField(term46833, term46833.getClass(), "focusTraversalKeys", null);
        setBooleanField(term46833, term46833.getClass(), "focusTraversalKeysEnabled", false);
        setField(term46833, term46833.getClass(), "acc", null);
        setField(term46833, term46833.getClass(), "minSize", null);
        setBooleanField(term46833, term46833.getClass(), "minSizeSet", false);
        setField(term46833, term46833.getClass(), "prefSize", null);
        setBooleanField(term46833, term46833.getClass(), "prefSizeSet", false);
        setField(term46833, term46833.getClass(), "maxSize", null);
        setBooleanField(term46833, term46833.getClass(), "maxSizeSet", false);
        setField(term46833, term46833.getClass(), "componentOrientation", null);
        setBooleanField(term46833, term46833.getClass(), "newEventsOnly", false);
        setField(term46833, term46833.getClass(), "componentListener", null);
        setField(term46833, term46833.getClass(), "focusListener", null);
        setField(term46833, term46833.getClass(), "hierarchyListener", null);
        setField(term46833, term46833.getClass(), "hierarchyBoundsListener", null);
        setField(term46833, term46833.getClass(), "keyListener", null);
        setField(term46833, term46833.getClass(), "mouseListener", null);
        setField(term46833, term46833.getClass(), "mouseMotionListener", null);
        setField(term46833, term46833.getClass(), "mouseWheelListener", null);
        setField(term46833, term46833.getClass(), "inputMethodListener", null);
        setLongField(term46833, term46833.getClass(), "eventMask", 0L);
        setField(term46833, term46833.getClass(), "changeSupport", null);
        setField(term46833, term46833.getClass(), "objectLock", null);
        setBooleanField(term46833, term46833.getClass(), "isPacked", false);
        setIntField(term46833, term46833.getClass(), "boundsOp", 0);
        setField(term46833, term46833.getClass(), "compoundShape", null);
        setField(term46833, term46833.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term46833, term46833.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term46833, term46833.getClass(), "backgroundEraseDisabled", false);
        setField(term46833, term46833.getClass(), "eventCache", null);
        setBooleanField(term46833, term46833.getClass(), "coalescingEnabled", false);
        setBooleanField(term46833, term46833.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term46833, term46833.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.AssignmentCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "keepAskingWebAddress", argTypes, term46833, args);
    }

};


