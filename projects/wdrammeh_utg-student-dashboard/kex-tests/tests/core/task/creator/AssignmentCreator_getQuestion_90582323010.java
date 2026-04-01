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
     Object term57714;

    public AssignmentCreator_getQuestion_90582323010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57714 = newInstance(Class.forName("core.task.creator.AssignmentCreator"));
        setField(term57714, term57714.getClass(), "nameField", null);
        setField(term57714, term57714.getClass(), "groupChoice", null);
        setField(term57714, term57714.getClass(), "questionArea", null);
        setField(term57714, term57714.getClass(), "modes", null);
        setField(term57714, term57714.getClass(), "meanValue", null);
        setField(term57714, term57714.getClass(), "dField", null);
        setField(term57714, term57714.getClass(), "mField", null);
        setField(term57714, term57714.getClass(), "yField", null);
        setIntField(term57714, term57714.getClass(), "defaultCloseOperation", 0);
        setField(term57714, term57714.getClass(), "rootPane", null);
        setBooleanField(term57714, term57714.getClass(), "rootPaneCheckingEnabled", false);
        setField(term57714, term57714.getClass(), "transferHandler", null);
        setField(term57714, term57714.getClass(), "accessibleContext", null);
        setBooleanField(term57714, term57714.getClass(), "resizable", false);
        setBooleanField(term57714, term57714.getClass(), "undecorated", false);
        setBooleanField(term57714, term57714.getClass(), "initialized", false);
        setBooleanField(term57714, term57714.getClass(), "modal", false);
        setField(term57714, term57714.getClass(), "modalityType", null);
        setField(term57714, term57714.getClass(), "blockedWindows", null);
        setField(term57714, term57714.getClass(), "title", null);
        setField(term57714, term57714.getClass(), "modalFilter", null);
        setField(term57714, term57714.getClass(), "secondaryLoop", null);
        setBooleanField(term57714, term57714.getClass(), "isInHide", false);
        setBooleanField(term57714, term57714.getClass(), "isInDispose", false);
        setField(term57714, term57714.getClass(), "warningString", null);
        setField(term57714, term57714.getClass(), "icons", null);
        setField(term57714, term57714.getClass(), "temporaryLostComponent", null);
        setBooleanField(term57714, term57714.getClass(), "syncLWRequests", false);
        setBooleanField(term57714, term57714.getClass(), "beforeFirstShow", false);
        setBooleanField(term57714, term57714.getClass(), "disposing", false);
        setField(term57714, term57714.getClass(), "disposerRecord", null);
        setIntField(term57714, term57714.getClass(), "state", 0);
        setBooleanField(term57714, term57714.getClass(), "alwaysOnTop", false);
        setField(term57714, term57714.getClass(), "ownedWindowList", null);
        setField(term57714, term57714.getClass(), "weakThis", null);
        setBooleanField(term57714, term57714.getClass(), "showWithParent", false);
        setField(term57714, term57714.getClass(), "modalBlocker", null);
        setField(term57714, term57714.getClass(), "modalExclusionType", null);
        setField(term57714, term57714.getClass(), "windowListener", null);
        setField(term57714, term57714.getClass(), "windowStateListener", null);
        setField(term57714, term57714.getClass(), "windowFocusListener", null);
        setField(term57714, term57714.getClass(), "inputContext", null);
        setField(term57714, term57714.getClass(), "inputContextLock", null);
        setField(term57714, term57714.getClass(), "focusMgr", null);
        setBooleanField(term57714, term57714.getClass(), "focusableWindowState", false);
        setBooleanField(term57714, term57714.getClass(), "autoRequestFocus", false);
        setBooleanField(term57714, term57714.getClass(), "isInShow", false);
        setFloatField(term57714, term57714.getClass(), "opacity", 0.0F);
        setField(term57714, term57714.getClass(), "shape", null);
        setBooleanField(term57714, term57714.getClass(), "isTrayIconWindow", false);
        setIntField(term57714, term57714.getClass(), "securityWarningWidth", 0);
        setIntField(term57714, term57714.getClass(), "securityWarningHeight", 0);
        setDoubleField(term57714, term57714.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term57714, term57714.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term57714, term57714.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term57714, term57714.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term57714, term57714.getClass(), "anchor", null);
        setField(term57714, term57714.getClass(), "type", null);
        setIntField(term57714, term57714.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term57714, term57714.getClass(), "locationByPlatform", false);
        setField(term57714, term57714.getClass(), "component", null);
        setField(term57714, term57714.getClass(), "layoutMgr", null);
        setField(term57714, term57714.getClass(), "dispatcher", null);
        setField(term57714, term57714.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term57714, term57714.getClass(), "focusCycleRoot", false);
        setBooleanField(term57714, term57714.getClass(), "focusTraversalPolicyProvider", false);
        setField(term57714, term57714.getClass(), "printingThreads", null);
        setBooleanField(term57714, term57714.getClass(), "printing", false);
        setField(term57714, term57714.getClass(), "containerListener", null);
        setIntField(term57714, term57714.getClass(), "listeningChildren", 0);
        setIntField(term57714, term57714.getClass(), "listeningBoundsChildren", 0);
        setIntField(term57714, term57714.getClass(), "descendantsCount", 0);
        setField(term57714, term57714.getClass(), "preserveBackgroundColor", null);
        setIntField(term57714, term57714.getClass(), "numOfHWComponents", 0);
        setIntField(term57714, term57714.getClass(), "numOfLWComponents", 0);
        setField(term57714, term57714.getClass(), "modalComp", null);
        setField(term57714, term57714.getClass(), "modalAppContext", null);
        setIntField(term57714, term57714.getClass(), "containerSerializedDataVersion", 0);
        setField(term57714, term57714.getClass(), "peer", null);
        setField(term57714, term57714.getClass(), "parent", null);
        setField(term57714, term57714.getClass(), "appContext", null);
        setIntField(term57714, term57714.getClass(), "x", 0);
        setIntField(term57714, term57714.getClass(), "y", 0);
        setIntField(term57714, term57714.getClass(), "width", 0);
        setIntField(term57714, term57714.getClass(), "height", 0);
        setField(term57714, term57714.getClass(), "foreground", null);
        setField(term57714, term57714.getClass(), "background", null);
        setField(term57714, term57714.getClass(), "font", null);
        setField(term57714, term57714.getClass(), "peerFont", null);
        setField(term57714, term57714.getClass(), "cursor", null);
        setField(term57714, term57714.getClass(), "locale", null);
        setField(term57714, term57714.getClass(), "graphicsConfig", null);
        setField(term57714, term57714.getClass(), "bufferStrategy", null);
        setBooleanField(term57714, term57714.getClass(), "ignoreRepaint", false);
        setBooleanField(term57714, term57714.getClass(), "visible", false);
        setBooleanField(term57714, term57714.getClass(), "enabled", false);
        setBooleanField(term57714, term57714.getClass(), "valid", false);
        setField(term57714, term57714.getClass(), "dropTarget", null);
        setField(term57714, term57714.getClass(), "popups", null);
        setField(term57714, term57714.getClass(), "name", null);
        setBooleanField(term57714, term57714.getClass(), "nameExplicitlySet", false);
        setBooleanField(term57714, term57714.getClass(), "focusable", false);
        setIntField(term57714, term57714.getClass(), "isFocusTraversableOverridden", 0);
        setField(term57714, term57714.getClass(), "focusTraversalKeys", null);
        setBooleanField(term57714, term57714.getClass(), "focusTraversalKeysEnabled", false);
        setField(term57714, term57714.getClass(), "acc", null);
        setField(term57714, term57714.getClass(), "minSize", null);
        setBooleanField(term57714, term57714.getClass(), "minSizeSet", false);
        setField(term57714, term57714.getClass(), "prefSize", null);
        setBooleanField(term57714, term57714.getClass(), "prefSizeSet", false);
        setField(term57714, term57714.getClass(), "maxSize", null);
        setBooleanField(term57714, term57714.getClass(), "maxSizeSet", false);
        setField(term57714, term57714.getClass(), "componentOrientation", null);
        setBooleanField(term57714, term57714.getClass(), "newEventsOnly", false);
        setField(term57714, term57714.getClass(), "componentListener", null);
        setField(term57714, term57714.getClass(), "focusListener", null);
        setField(term57714, term57714.getClass(), "hierarchyListener", null);
        setField(term57714, term57714.getClass(), "hierarchyBoundsListener", null);
        setField(term57714, term57714.getClass(), "keyListener", null);
        setField(term57714, term57714.getClass(), "mouseListener", null);
        setField(term57714, term57714.getClass(), "mouseMotionListener", null);
        setField(term57714, term57714.getClass(), "mouseWheelListener", null);
        setField(term57714, term57714.getClass(), "inputMethodListener", null);
        setLongField(term57714, term57714.getClass(), "eventMask", 0L);
        setField(term57714, term57714.getClass(), "changeSupport", null);
        setField(term57714, term57714.getClass(), "objectLock", null);
        setBooleanField(term57714, term57714.getClass(), "isPacked", false);
        setIntField(term57714, term57714.getClass(), "boundsOp", 0);
        setField(term57714, term57714.getClass(), "compoundShape", null);
        setField(term57714, term57714.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term57714, term57714.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term57714, term57714.getClass(), "backgroundEraseDisabled", false);
        setField(term57714, term57714.getClass(), "eventCache", null);
        setBooleanField(term57714, term57714.getClass(), "coalescingEnabled", false);
        setBooleanField(term57714, term57714.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term57714, term57714.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.AssignmentCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getQuestion", argTypes, term57714, args);
    }

};


