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
     Object term11746;

    public AssignmentCreator_keepAskingWebAddress_19444732324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11746 = newInstance(Class.forName("core.task.creator.AssignmentCreator"));
        setField(term11746, term11746.getClass(), "nameField", null);
        setField(term11746, term11746.getClass(), "groupChoice", null);
        setField(term11746, term11746.getClass(), "questionArea", null);
        setField(term11746, term11746.getClass(), "modes", null);
        setField(term11746, term11746.getClass(), "meanValue", null);
        setField(term11746, term11746.getClass(), "dField", null);
        setField(term11746, term11746.getClass(), "mField", null);
        setField(term11746, term11746.getClass(), "yField", null);
        setIntField(term11746, term11746.getClass(), "defaultCloseOperation", 0);
        setField(term11746, term11746.getClass(), "rootPane", null);
        setBooleanField(term11746, term11746.getClass(), "rootPaneCheckingEnabled", false);
        setField(term11746, term11746.getClass(), "transferHandler", null);
        setField(term11746, term11746.getClass(), "accessibleContext", null);
        setBooleanField(term11746, term11746.getClass(), "resizable", false);
        setBooleanField(term11746, term11746.getClass(), "undecorated", false);
        setBooleanField(term11746, term11746.getClass(), "initialized", false);
        setBooleanField(term11746, term11746.getClass(), "modal", false);
        setField(term11746, term11746.getClass(), "modalityType", null);
        setField(term11746, term11746.getClass(), "blockedWindows", null);
        setField(term11746, term11746.getClass(), "title", null);
        setField(term11746, term11746.getClass(), "modalFilter", null);
        setField(term11746, term11746.getClass(), "secondaryLoop", null);
        setBooleanField(term11746, term11746.getClass(), "isInHide", false);
        setBooleanField(term11746, term11746.getClass(), "isInDispose", false);
        setField(term11746, term11746.getClass(), "warningString", null);
        setField(term11746, term11746.getClass(), "icons", null);
        setField(term11746, term11746.getClass(), "temporaryLostComponent", null);
        setBooleanField(term11746, term11746.getClass(), "syncLWRequests", false);
        setBooleanField(term11746, term11746.getClass(), "beforeFirstShow", false);
        setBooleanField(term11746, term11746.getClass(), "disposing", false);
        setField(term11746, term11746.getClass(), "disposerRecord", null);
        setIntField(term11746, term11746.getClass(), "state", 0);
        setBooleanField(term11746, term11746.getClass(), "alwaysOnTop", false);
        setField(term11746, term11746.getClass(), "ownedWindowList", null);
        setField(term11746, term11746.getClass(), "weakThis", null);
        setBooleanField(term11746, term11746.getClass(), "showWithParent", false);
        setField(term11746, term11746.getClass(), "modalBlocker", null);
        setField(term11746, term11746.getClass(), "modalExclusionType", null);
        setField(term11746, term11746.getClass(), "windowListener", null);
        setField(term11746, term11746.getClass(), "windowStateListener", null);
        setField(term11746, term11746.getClass(), "windowFocusListener", null);
        setField(term11746, term11746.getClass(), "inputContext", null);
        setField(term11746, term11746.getClass(), "inputContextLock", null);
        setField(term11746, term11746.getClass(), "focusMgr", null);
        setBooleanField(term11746, term11746.getClass(), "focusableWindowState", false);
        setBooleanField(term11746, term11746.getClass(), "autoRequestFocus", false);
        setBooleanField(term11746, term11746.getClass(), "isInShow", false);
        setFloatField(term11746, term11746.getClass(), "opacity", 0.0F);
        setField(term11746, term11746.getClass(), "shape", null);
        setBooleanField(term11746, term11746.getClass(), "isTrayIconWindow", false);
        setIntField(term11746, term11746.getClass(), "securityWarningWidth", 0);
        setIntField(term11746, term11746.getClass(), "securityWarningHeight", 0);
        setDoubleField(term11746, term11746.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term11746, term11746.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term11746, term11746.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term11746, term11746.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term11746, term11746.getClass(), "anchor", null);
        setField(term11746, term11746.getClass(), "type", null);
        setIntField(term11746, term11746.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term11746, term11746.getClass(), "locationByPlatform", false);
        setField(term11746, term11746.getClass(), "component", null);
        setField(term11746, term11746.getClass(), "layoutMgr", null);
        setField(term11746, term11746.getClass(), "dispatcher", null);
        setField(term11746, term11746.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term11746, term11746.getClass(), "focusCycleRoot", false);
        setBooleanField(term11746, term11746.getClass(), "focusTraversalPolicyProvider", false);
        setField(term11746, term11746.getClass(), "printingThreads", null);
        setBooleanField(term11746, term11746.getClass(), "printing", false);
        setField(term11746, term11746.getClass(), "containerListener", null);
        setIntField(term11746, term11746.getClass(), "listeningChildren", 0);
        setIntField(term11746, term11746.getClass(), "listeningBoundsChildren", 0);
        setIntField(term11746, term11746.getClass(), "descendantsCount", 0);
        setField(term11746, term11746.getClass(), "preserveBackgroundColor", null);
        setIntField(term11746, term11746.getClass(), "numOfHWComponents", 0);
        setIntField(term11746, term11746.getClass(), "numOfLWComponents", 0);
        setField(term11746, term11746.getClass(), "modalComp", null);
        setField(term11746, term11746.getClass(), "modalAppContext", null);
        setIntField(term11746, term11746.getClass(), "containerSerializedDataVersion", 0);
        setField(term11746, term11746.getClass(), "peer", null);
        setField(term11746, term11746.getClass(), "parent", null);
        setField(term11746, term11746.getClass(), "appContext", null);
        setIntField(term11746, term11746.getClass(), "x", 0);
        setIntField(term11746, term11746.getClass(), "y", 0);
        setIntField(term11746, term11746.getClass(), "width", 0);
        setIntField(term11746, term11746.getClass(), "height", 0);
        setField(term11746, term11746.getClass(), "foreground", null);
        setField(term11746, term11746.getClass(), "background", null);
        setField(term11746, term11746.getClass(), "font", null);
        setField(term11746, term11746.getClass(), "peerFont", null);
        setField(term11746, term11746.getClass(), "cursor", null);
        setField(term11746, term11746.getClass(), "locale", null);
        setField(term11746, term11746.getClass(), "graphicsConfig", null);
        setField(term11746, term11746.getClass(), "bufferStrategy", null);
        setBooleanField(term11746, term11746.getClass(), "ignoreRepaint", false);
        setBooleanField(term11746, term11746.getClass(), "visible", false);
        setBooleanField(term11746, term11746.getClass(), "enabled", false);
        setBooleanField(term11746, term11746.getClass(), "valid", false);
        setField(term11746, term11746.getClass(), "dropTarget", null);
        setField(term11746, term11746.getClass(), "popups", null);
        setField(term11746, term11746.getClass(), "name", null);
        setBooleanField(term11746, term11746.getClass(), "nameExplicitlySet", false);
        setBooleanField(term11746, term11746.getClass(), "focusable", false);
        setIntField(term11746, term11746.getClass(), "isFocusTraversableOverridden", 0);
        setField(term11746, term11746.getClass(), "focusTraversalKeys", null);
        setBooleanField(term11746, term11746.getClass(), "focusTraversalKeysEnabled", false);
        setField(term11746, term11746.getClass(), "acc", null);
        setField(term11746, term11746.getClass(), "minSize", null);
        setBooleanField(term11746, term11746.getClass(), "minSizeSet", false);
        setField(term11746, term11746.getClass(), "prefSize", null);
        setBooleanField(term11746, term11746.getClass(), "prefSizeSet", false);
        setField(term11746, term11746.getClass(), "maxSize", null);
        setBooleanField(term11746, term11746.getClass(), "maxSizeSet", false);
        setField(term11746, term11746.getClass(), "componentOrientation", null);
        setBooleanField(term11746, term11746.getClass(), "newEventsOnly", false);
        setField(term11746, term11746.getClass(), "componentListener", null);
        setField(term11746, term11746.getClass(), "focusListener", null);
        setField(term11746, term11746.getClass(), "hierarchyListener", null);
        setField(term11746, term11746.getClass(), "hierarchyBoundsListener", null);
        setField(term11746, term11746.getClass(), "keyListener", null);
        setField(term11746, term11746.getClass(), "mouseListener", null);
        setField(term11746, term11746.getClass(), "mouseMotionListener", null);
        setField(term11746, term11746.getClass(), "mouseWheelListener", null);
        setField(term11746, term11746.getClass(), "inputMethodListener", null);
        setLongField(term11746, term11746.getClass(), "eventMask", 0L);
        setField(term11746, term11746.getClass(), "changeSupport", null);
        setField(term11746, term11746.getClass(), "objectLock", null);
        setBooleanField(term11746, term11746.getClass(), "isPacked", false);
        setIntField(term11746, term11746.getClass(), "boundsOp", 0);
        setField(term11746, term11746.getClass(), "compoundShape", null);
        setField(term11746, term11746.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term11746, term11746.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term11746, term11746.getClass(), "backgroundEraseDisabled", false);
        setField(term11746, term11746.getClass(), "eventCache", null);
        setBooleanField(term11746, term11746.getClass(), "coalescingEnabled", false);
        setBooleanField(term11746, term11746.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term11746, term11746.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.AssignmentCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "keepAskingWebAddress", argTypes, term11746, args);
    }

};


