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
     Object term356828;

    public SemesterActivity_RegisteredCourseAdder_newHintLabel_9435590263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356828 = newInstance(Class.forName("core.module.SemesterActivity$RegisteredCourseAdder"));
        setField(term356828, term356828.getClass(), "codeField", null);
        setField(term356828, term356828.getClass(), "nameField", null);
        setField(term356828, term356828.getClass(), "lecturerField", null);
        setField(term356828, term356828.getClass(), "roomField", null);
        setField(term356828, term356828.getClass(), "daysBox", null);
        setField(term356828, term356828.getClass(), "hoursBox", null);
        setField(term356828, term356828.getClass(), "campusBox", null);
        setField(term356828, term356828.getClass(), "doneButton", null);
        setField(term356828, term356828.getClass(), "checkPanel", null);
        setField(term356828, term356828.getClass(), "contentPanel", null);
        setIntField(term356828, term356828.getClass(), "defaultCloseOperation", 0);
        setField(term356828, term356828.getClass(), "rootPane", null);
        setBooleanField(term356828, term356828.getClass(), "rootPaneCheckingEnabled", false);
        setField(term356828, term356828.getClass(), "transferHandler", null);
        setField(term356828, term356828.getClass(), "accessibleContext", null);
        setBooleanField(term356828, term356828.getClass(), "resizable", false);
        setBooleanField(term356828, term356828.getClass(), "undecorated", false);
        setBooleanField(term356828, term356828.getClass(), "initialized", false);
        setBooleanField(term356828, term356828.getClass(), "modal", false);
        setField(term356828, term356828.getClass(), "modalityType", null);
        setField(term356828, term356828.getClass(), "blockedWindows", null);
        setField(term356828, term356828.getClass(), "title", null);
        setField(term356828, term356828.getClass(), "modalFilter", null);
        setField(term356828, term356828.getClass(), "secondaryLoop", null);
        setBooleanField(term356828, term356828.getClass(), "isInHide", false);
        setBooleanField(term356828, term356828.getClass(), "isInDispose", false);
        setField(term356828, term356828.getClass(), "warningString", null);
        setField(term356828, term356828.getClass(), "icons", null);
        setField(term356828, term356828.getClass(), "temporaryLostComponent", null);
        setBooleanField(term356828, term356828.getClass(), "syncLWRequests", false);
        setBooleanField(term356828, term356828.getClass(), "beforeFirstShow", false);
        setBooleanField(term356828, term356828.getClass(), "disposing", false);
        setField(term356828, term356828.getClass(), "disposerRecord", null);
        setIntField(term356828, term356828.getClass(), "state", 0);
        setBooleanField(term356828, term356828.getClass(), "alwaysOnTop", false);
        setField(term356828, term356828.getClass(), "ownedWindowList", null);
        setField(term356828, term356828.getClass(), "weakThis", null);
        setBooleanField(term356828, term356828.getClass(), "showWithParent", false);
        setField(term356828, term356828.getClass(), "modalBlocker", null);
        setField(term356828, term356828.getClass(), "modalExclusionType", null);
        setField(term356828, term356828.getClass(), "windowListener", null);
        setField(term356828, term356828.getClass(), "windowStateListener", null);
        setField(term356828, term356828.getClass(), "windowFocusListener", null);
        setField(term356828, term356828.getClass(), "inputContext", null);
        setField(term356828, term356828.getClass(), "inputContextLock", null);
        setField(term356828, term356828.getClass(), "focusMgr", null);
        setBooleanField(term356828, term356828.getClass(), "focusableWindowState", false);
        setBooleanField(term356828, term356828.getClass(), "autoRequestFocus", false);
        setBooleanField(term356828, term356828.getClass(), "isInShow", false);
        setFloatField(term356828, term356828.getClass(), "opacity", 0.0F);
        setField(term356828, term356828.getClass(), "shape", null);
        setBooleanField(term356828, term356828.getClass(), "isTrayIconWindow", false);
        setIntField(term356828, term356828.getClass(), "securityWarningWidth", 0);
        setIntField(term356828, term356828.getClass(), "securityWarningHeight", 0);
        setDoubleField(term356828, term356828.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term356828, term356828.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term356828, term356828.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term356828, term356828.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term356828, term356828.getClass(), "anchor", null);
        setField(term356828, term356828.getClass(), "type", null);
        setIntField(term356828, term356828.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term356828, term356828.getClass(), "locationByPlatform", false);
        setField(term356828, term356828.getClass(), "component", null);
        setField(term356828, term356828.getClass(), "layoutMgr", null);
        setField(term356828, term356828.getClass(), "dispatcher", null);
        setField(term356828, term356828.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term356828, term356828.getClass(), "focusCycleRoot", false);
        setBooleanField(term356828, term356828.getClass(), "focusTraversalPolicyProvider", false);
        setField(term356828, term356828.getClass(), "printingThreads", null);
        setBooleanField(term356828, term356828.getClass(), "printing", false);
        setField(term356828, term356828.getClass(), "containerListener", null);
        setIntField(term356828, term356828.getClass(), "listeningChildren", 0);
        setIntField(term356828, term356828.getClass(), "listeningBoundsChildren", 0);
        setIntField(term356828, term356828.getClass(), "descendantsCount", 0);
        setField(term356828, term356828.getClass(), "preserveBackgroundColor", null);
        setIntField(term356828, term356828.getClass(), "numOfHWComponents", 0);
        setIntField(term356828, term356828.getClass(), "numOfLWComponents", 0);
        setField(term356828, term356828.getClass(), "modalComp", null);
        setField(term356828, term356828.getClass(), "modalAppContext", null);
        setIntField(term356828, term356828.getClass(), "containerSerializedDataVersion", 0);
        setField(term356828, term356828.getClass(), "peer", null);
        setField(term356828, term356828.getClass(), "parent", null);
        setField(term356828, term356828.getClass(), "appContext", null);
        setIntField(term356828, term356828.getClass(), "x", 0);
        setIntField(term356828, term356828.getClass(), "y", 0);
        setIntField(term356828, term356828.getClass(), "width", 0);
        setIntField(term356828, term356828.getClass(), "height", 0);
        setField(term356828, term356828.getClass(), "foreground", null);
        setField(term356828, term356828.getClass(), "background", null);
        setField(term356828, term356828.getClass(), "font", null);
        setField(term356828, term356828.getClass(), "peerFont", null);
        setField(term356828, term356828.getClass(), "cursor", null);
        setField(term356828, term356828.getClass(), "locale", null);
        setField(term356828, term356828.getClass(), "graphicsConfig", null);
        setField(term356828, term356828.getClass(), "bufferStrategy", null);
        setBooleanField(term356828, term356828.getClass(), "ignoreRepaint", false);
        setBooleanField(term356828, term356828.getClass(), "visible", false);
        setBooleanField(term356828, term356828.getClass(), "enabled", false);
        setBooleanField(term356828, term356828.getClass(), "valid", false);
        setField(term356828, term356828.getClass(), "dropTarget", null);
        setField(term356828, term356828.getClass(), "popups", null);
        setField(term356828, term356828.getClass(), "name", null);
        setBooleanField(term356828, term356828.getClass(), "nameExplicitlySet", false);
        setBooleanField(term356828, term356828.getClass(), "focusable", false);
        setIntField(term356828, term356828.getClass(), "isFocusTraversableOverridden", 0);
        setField(term356828, term356828.getClass(), "focusTraversalKeys", null);
        setBooleanField(term356828, term356828.getClass(), "focusTraversalKeysEnabled", false);
        setField(term356828, term356828.getClass(), "acc", null);
        setField(term356828, term356828.getClass(), "minSize", null);
        setBooleanField(term356828, term356828.getClass(), "minSizeSet", false);
        setField(term356828, term356828.getClass(), "prefSize", null);
        setBooleanField(term356828, term356828.getClass(), "prefSizeSet", false);
        setField(term356828, term356828.getClass(), "maxSize", null);
        setBooleanField(term356828, term356828.getClass(), "maxSizeSet", false);
        setField(term356828, term356828.getClass(), "componentOrientation", null);
        setBooleanField(term356828, term356828.getClass(), "newEventsOnly", false);
        setField(term356828, term356828.getClass(), "componentListener", null);
        setField(term356828, term356828.getClass(), "focusListener", null);
        setField(term356828, term356828.getClass(), "hierarchyListener", null);
        setField(term356828, term356828.getClass(), "hierarchyBoundsListener", null);
        setField(term356828, term356828.getClass(), "keyListener", null);
        setField(term356828, term356828.getClass(), "mouseListener", null);
        setField(term356828, term356828.getClass(), "mouseMotionListener", null);
        setField(term356828, term356828.getClass(), "mouseWheelListener", null);
        setField(term356828, term356828.getClass(), "inputMethodListener", null);
        setLongField(term356828, term356828.getClass(), "eventMask", 0L);
        setField(term356828, term356828.getClass(), "changeSupport", null);
        setField(term356828, term356828.getClass(), "objectLock", null);
        setBooleanField(term356828, term356828.getClass(), "isPacked", false);
        setIntField(term356828, term356828.getClass(), "boundsOp", 0);
        setField(term356828, term356828.getClass(), "compoundShape", null);
        setField(term356828, term356828.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term356828, term356828.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term356828, term356828.getClass(), "backgroundEraseDisabled", false);
        setField(term356828, term356828.getClass(), "eventCache", null);
        setBooleanField(term356828, term356828.getClass(), "coalescingEnabled", false);
        setBooleanField(term356828, term356828.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term356828, term356828.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SemesterActivity$RegisteredCourseAdder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newHintLabel", argTypes, term356828, args);
    }

};


