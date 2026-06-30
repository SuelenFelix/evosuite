package core.module;

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
import static core.module.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SemesterActivity_RegisteredCourseAdder_newHintLabel_9435590263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120500;

    public SemesterActivity_RegisteredCourseAdder_newHintLabel_9435590263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120500 = newInstance(Class.forName("core.module.SemesterActivity$RegisteredCourseAdder"));
        setField(term120500, term120500.getClass(), "codeField", null);
        setField(term120500, term120500.getClass(), "nameField", null);
        setField(term120500, term120500.getClass(), "lecturerField", null);
        setField(term120500, term120500.getClass(), "roomField", null);
        setField(term120500, term120500.getClass(), "daysBox", null);
        setField(term120500, term120500.getClass(), "hoursBox", null);
        setField(term120500, term120500.getClass(), "campusBox", null);
        setField(term120500, term120500.getClass(), "doneButton", null);
        setField(term120500, term120500.getClass(), "checkPanel", null);
        setField(term120500, term120500.getClass(), "contentPanel", null);
        setIntField(term120500, term120500.getClass(), "defaultCloseOperation", 0);
        setField(term120500, term120500.getClass(), "rootPane", null);
        setBooleanField(term120500, term120500.getClass(), "rootPaneCheckingEnabled", false);
        setField(term120500, term120500.getClass(), "transferHandler", null);
        setField(term120500, term120500.getClass(), "accessibleContext", null);
        setBooleanField(term120500, term120500.getClass(), "resizable", false);
        setBooleanField(term120500, term120500.getClass(), "undecorated", false);
        setBooleanField(term120500, term120500.getClass(), "initialized", false);
        setBooleanField(term120500, term120500.getClass(), "modal", false);
        setField(term120500, term120500.getClass(), "modalityType", null);
        setField(term120500, term120500.getClass(), "blockedWindows", null);
        setField(term120500, term120500.getClass(), "title", null);
        setField(term120500, term120500.getClass(), "modalFilter", null);
        setField(term120500, term120500.getClass(), "secondaryLoop", null);
        setBooleanField(term120500, term120500.getClass(), "isInHide", false);
        setBooleanField(term120500, term120500.getClass(), "isInDispose", false);
        setField(term120500, term120500.getClass(), "warningString", null);
        setField(term120500, term120500.getClass(), "icons", null);
        setField(term120500, term120500.getClass(), "temporaryLostComponent", null);
        setBooleanField(term120500, term120500.getClass(), "syncLWRequests", false);
        setBooleanField(term120500, term120500.getClass(), "beforeFirstShow", false);
        setBooleanField(term120500, term120500.getClass(), "disposing", false);
        setField(term120500, term120500.getClass(), "disposerRecord", null);
        setIntField(term120500, term120500.getClass(), "state", 0);
        setBooleanField(term120500, term120500.getClass(), "alwaysOnTop", false);
        setField(term120500, term120500.getClass(), "ownedWindowList", null);
        setField(term120500, term120500.getClass(), "weakThis", null);
        setBooleanField(term120500, term120500.getClass(), "showWithParent", false);
        setField(term120500, term120500.getClass(), "modalBlocker", null);
        setField(term120500, term120500.getClass(), "modalExclusionType", null);
        setField(term120500, term120500.getClass(), "windowListener", null);
        setField(term120500, term120500.getClass(), "windowStateListener", null);
        setField(term120500, term120500.getClass(), "windowFocusListener", null);
        setField(term120500, term120500.getClass(), "inputContext", null);
        setField(term120500, term120500.getClass(), "inputContextLock", null);
        setField(term120500, term120500.getClass(), "focusMgr", null);
        setBooleanField(term120500, term120500.getClass(), "focusableWindowState", false);
        setBooleanField(term120500, term120500.getClass(), "autoRequestFocus", false);
        setBooleanField(term120500, term120500.getClass(), "isInShow", false);
        setFloatField(term120500, term120500.getClass(), "opacity", 0.0F);
        setField(term120500, term120500.getClass(), "shape", null);
        setBooleanField(term120500, term120500.getClass(), "isTrayIconWindow", false);
        setIntField(term120500, term120500.getClass(), "securityWarningWidth", 0);
        setIntField(term120500, term120500.getClass(), "securityWarningHeight", 0);
        setDoubleField(term120500, term120500.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term120500, term120500.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term120500, term120500.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term120500, term120500.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term120500, term120500.getClass(), "anchor", null);
        setField(term120500, term120500.getClass(), "type", null);
        setIntField(term120500, term120500.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term120500, term120500.getClass(), "locationByPlatform", false);
        setField(term120500, term120500.getClass(), "component", null);
        setField(term120500, term120500.getClass(), "layoutMgr", null);
        setField(term120500, term120500.getClass(), "dispatcher", null);
        setField(term120500, term120500.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term120500, term120500.getClass(), "focusCycleRoot", false);
        setBooleanField(term120500, term120500.getClass(), "focusTraversalPolicyProvider", false);
        setField(term120500, term120500.getClass(), "printingThreads", null);
        setBooleanField(term120500, term120500.getClass(), "printing", false);
        setField(term120500, term120500.getClass(), "containerListener", null);
        setIntField(term120500, term120500.getClass(), "listeningChildren", 0);
        setIntField(term120500, term120500.getClass(), "listeningBoundsChildren", 0);
        setIntField(term120500, term120500.getClass(), "descendantsCount", 0);
        setField(term120500, term120500.getClass(), "preserveBackgroundColor", null);
        setIntField(term120500, term120500.getClass(), "numOfHWComponents", 0);
        setIntField(term120500, term120500.getClass(), "numOfLWComponents", 0);
        setField(term120500, term120500.getClass(), "modalComp", null);
        setField(term120500, term120500.getClass(), "modalAppContext", null);
        setIntField(term120500, term120500.getClass(), "containerSerializedDataVersion", 0);
        setField(term120500, term120500.getClass(), "peer", null);
        setField(term120500, term120500.getClass(), "parent", null);
        setField(term120500, term120500.getClass(), "appContext", null);
        setIntField(term120500, term120500.getClass(), "x", 0);
        setIntField(term120500, term120500.getClass(), "y", 0);
        setIntField(term120500, term120500.getClass(), "width", 0);
        setIntField(term120500, term120500.getClass(), "height", 0);
        setField(term120500, term120500.getClass(), "foreground", null);
        setField(term120500, term120500.getClass(), "background", null);
        setField(term120500, term120500.getClass(), "font", null);
        setField(term120500, term120500.getClass(), "peerFont", null);
        setField(term120500, term120500.getClass(), "cursor", null);
        setField(term120500, term120500.getClass(), "locale", null);
        setField(term120500, term120500.getClass(), "graphicsConfig", null);
        setField(term120500, term120500.getClass(), "bufferStrategy", null);
        setBooleanField(term120500, term120500.getClass(), "ignoreRepaint", false);
        setBooleanField(term120500, term120500.getClass(), "visible", false);
        setBooleanField(term120500, term120500.getClass(), "enabled", false);
        setBooleanField(term120500, term120500.getClass(), "valid", false);
        setField(term120500, term120500.getClass(), "dropTarget", null);
        setField(term120500, term120500.getClass(), "popups", null);
        setField(term120500, term120500.getClass(), "name", null);
        setBooleanField(term120500, term120500.getClass(), "nameExplicitlySet", false);
        setBooleanField(term120500, term120500.getClass(), "focusable", false);
        setIntField(term120500, term120500.getClass(), "isFocusTraversableOverridden", 0);
        setField(term120500, term120500.getClass(), "focusTraversalKeys", null);
        setBooleanField(term120500, term120500.getClass(), "focusTraversalKeysEnabled", false);
        setField(term120500, term120500.getClass(), "acc", null);
        setField(term120500, term120500.getClass(), "minSize", null);
        setBooleanField(term120500, term120500.getClass(), "minSizeSet", false);
        setField(term120500, term120500.getClass(), "prefSize", null);
        setBooleanField(term120500, term120500.getClass(), "prefSizeSet", false);
        setField(term120500, term120500.getClass(), "maxSize", null);
        setBooleanField(term120500, term120500.getClass(), "maxSizeSet", false);
        setField(term120500, term120500.getClass(), "componentOrientation", null);
        setBooleanField(term120500, term120500.getClass(), "newEventsOnly", false);
        setField(term120500, term120500.getClass(), "componentListener", null);
        setField(term120500, term120500.getClass(), "focusListener", null);
        setField(term120500, term120500.getClass(), "hierarchyListener", null);
        setField(term120500, term120500.getClass(), "hierarchyBoundsListener", null);
        setField(term120500, term120500.getClass(), "keyListener", null);
        setField(term120500, term120500.getClass(), "mouseListener", null);
        setField(term120500, term120500.getClass(), "mouseMotionListener", null);
        setField(term120500, term120500.getClass(), "mouseWheelListener", null);
        setField(term120500, term120500.getClass(), "inputMethodListener", null);
        setLongField(term120500, term120500.getClass(), "eventMask", 0L);
        setField(term120500, term120500.getClass(), "changeSupport", null);
        setField(term120500, term120500.getClass(), "objectLock", null);
        setBooleanField(term120500, term120500.getClass(), "isPacked", false);
        setIntField(term120500, term120500.getClass(), "boundsOp", 0);
        setField(term120500, term120500.getClass(), "compoundShape", null);
        setField(term120500, term120500.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term120500, term120500.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term120500, term120500.getClass(), "backgroundEraseDisabled", false);
        setField(term120500, term120500.getClass(), "eventCache", null);
        setBooleanField(term120500, term120500.getClass(), "coalescingEnabled", false);
        setBooleanField(term120500, term120500.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term120500, term120500.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SemesterActivity$RegisteredCourseAdder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newHintLabel", argTypes, term120500, args);
    }

};


