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

public class SummerHandler_SummerModuleEditor_editionListener_2617220262 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397872;

    public SummerHandler_SummerModuleEditor_editionListener_2617220262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term397872 = newInstance(Class.forName("core.module.SummerHandler$SummerModuleEditor"));
        setField(term397872, term397872.getClass(), "target", null);
        setField(term397872, term397872.getClass(), "availableYearsBox", null);
        setField(term397872, term397872.getClass(), "yearField", null);
        setField(term397872, term397872.getClass(), "semesterField", null);
        setField(term397872, term397872.getClass(), "codeField", null);
        setField(term397872, term397872.getClass(), "nameField", null);
        setField(term397872, term397872.getClass(), "roomField", null);
        setField(term397872, term397872.getClass(), "lecturerField", null);
        setField(term397872, term397872.getClass(), "scoreField", null);
        setField(term397872, term397872.getClass(), "dayBox", null);
        setField(term397872, term397872.getClass(), "timeBox", null);
        setField(term397872, term397872.getClass(), "requirementBox", null);
        setField(term397872, term397872.getClass(), "creditBox", null);
        setField(term397872, term397872.getClass(), "campusBox", null);
        setField(term397872, term397872.getClass(), "yearPanel", null);
        setField(term397872, term397872.getClass(), "semesterPanel", null);
        setField(term397872, term397872.getClass(), "yearName", null);
        setField(term397872, term397872.getClass(), "semesterName", null);
        setField(term397872, term397872.getClass(), "actionButton", null);
        setIntField(term397872, term397872.getClass(), "defaultCloseOperation", 0);
        setField(term397872, term397872.getClass(), "rootPane", null);
        setBooleanField(term397872, term397872.getClass(), "rootPaneCheckingEnabled", false);
        setField(term397872, term397872.getClass(), "transferHandler", null);
        setField(term397872, term397872.getClass(), "accessibleContext", null);
        setBooleanField(term397872, term397872.getClass(), "resizable", false);
        setBooleanField(term397872, term397872.getClass(), "undecorated", false);
        setBooleanField(term397872, term397872.getClass(), "initialized", false);
        setBooleanField(term397872, term397872.getClass(), "modal", false);
        setField(term397872, term397872.getClass(), "modalityType", null);
        setField(term397872, term397872.getClass(), "blockedWindows", null);
        setField(term397872, term397872.getClass(), "title", null);
        setField(term397872, term397872.getClass(), "modalFilter", null);
        setField(term397872, term397872.getClass(), "secondaryLoop", null);
        setBooleanField(term397872, term397872.getClass(), "isInHide", false);
        setBooleanField(term397872, term397872.getClass(), "isInDispose", false);
        setField(term397872, term397872.getClass(), "warningString", null);
        setField(term397872, term397872.getClass(), "icons", null);
        setField(term397872, term397872.getClass(), "temporaryLostComponent", null);
        setBooleanField(term397872, term397872.getClass(), "syncLWRequests", false);
        setBooleanField(term397872, term397872.getClass(), "beforeFirstShow", false);
        setBooleanField(term397872, term397872.getClass(), "disposing", false);
        setField(term397872, term397872.getClass(), "disposerRecord", null);
        setIntField(term397872, term397872.getClass(), "state", 0);
        setBooleanField(term397872, term397872.getClass(), "alwaysOnTop", false);
        setField(term397872, term397872.getClass(), "ownedWindowList", null);
        setField(term397872, term397872.getClass(), "weakThis", null);
        setBooleanField(term397872, term397872.getClass(), "showWithParent", false);
        setField(term397872, term397872.getClass(), "modalBlocker", null);
        setField(term397872, term397872.getClass(), "modalExclusionType", null);
        setField(term397872, term397872.getClass(), "windowListener", null);
        setField(term397872, term397872.getClass(), "windowStateListener", null);
        setField(term397872, term397872.getClass(), "windowFocusListener", null);
        setField(term397872, term397872.getClass(), "inputContext", null);
        setField(term397872, term397872.getClass(), "inputContextLock", null);
        setField(term397872, term397872.getClass(), "focusMgr", null);
        setBooleanField(term397872, term397872.getClass(), "focusableWindowState", false);
        setBooleanField(term397872, term397872.getClass(), "autoRequestFocus", false);
        setBooleanField(term397872, term397872.getClass(), "isInShow", false);
        setFloatField(term397872, term397872.getClass(), "opacity", 0.0F);
        setField(term397872, term397872.getClass(), "shape", null);
        setBooleanField(term397872, term397872.getClass(), "isTrayIconWindow", false);
        setIntField(term397872, term397872.getClass(), "securityWarningWidth", 0);
        setIntField(term397872, term397872.getClass(), "securityWarningHeight", 0);
        setDoubleField(term397872, term397872.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term397872, term397872.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term397872, term397872.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term397872, term397872.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term397872, term397872.getClass(), "anchor", null);
        setField(term397872, term397872.getClass(), "type", null);
        setIntField(term397872, term397872.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term397872, term397872.getClass(), "locationByPlatform", false);
        setField(term397872, term397872.getClass(), "component", null);
        setField(term397872, term397872.getClass(), "layoutMgr", null);
        setField(term397872, term397872.getClass(), "dispatcher", null);
        setField(term397872, term397872.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term397872, term397872.getClass(), "focusCycleRoot", false);
        setBooleanField(term397872, term397872.getClass(), "focusTraversalPolicyProvider", false);
        setField(term397872, term397872.getClass(), "printingThreads", null);
        setBooleanField(term397872, term397872.getClass(), "printing", false);
        setField(term397872, term397872.getClass(), "containerListener", null);
        setIntField(term397872, term397872.getClass(), "listeningChildren", 0);
        setIntField(term397872, term397872.getClass(), "listeningBoundsChildren", 0);
        setIntField(term397872, term397872.getClass(), "descendantsCount", 0);
        setField(term397872, term397872.getClass(), "preserveBackgroundColor", null);
        setIntField(term397872, term397872.getClass(), "numOfHWComponents", 0);
        setIntField(term397872, term397872.getClass(), "numOfLWComponents", 0);
        setField(term397872, term397872.getClass(), "modalComp", null);
        setField(term397872, term397872.getClass(), "modalAppContext", null);
        setIntField(term397872, term397872.getClass(), "containerSerializedDataVersion", 0);
        setField(term397872, term397872.getClass(), "peer", null);
        setField(term397872, term397872.getClass(), "parent", null);
        setField(term397872, term397872.getClass(), "appContext", null);
        setIntField(term397872, term397872.getClass(), "x", 0);
        setIntField(term397872, term397872.getClass(), "y", 0);
        setIntField(term397872, term397872.getClass(), "width", 0);
        setIntField(term397872, term397872.getClass(), "height", 0);
        setField(term397872, term397872.getClass(), "foreground", null);
        setField(term397872, term397872.getClass(), "background", null);
        setField(term397872, term397872.getClass(), "font", null);
        setField(term397872, term397872.getClass(), "peerFont", null);
        setField(term397872, term397872.getClass(), "cursor", null);
        setField(term397872, term397872.getClass(), "locale", null);
        setField(term397872, term397872.getClass(), "graphicsConfig", null);
        setField(term397872, term397872.getClass(), "bufferStrategy", null);
        setBooleanField(term397872, term397872.getClass(), "ignoreRepaint", false);
        setBooleanField(term397872, term397872.getClass(), "visible", false);
        setBooleanField(term397872, term397872.getClass(), "enabled", false);
        setBooleanField(term397872, term397872.getClass(), "valid", false);
        setField(term397872, term397872.getClass(), "dropTarget", null);
        setField(term397872, term397872.getClass(), "popups", null);
        setField(term397872, term397872.getClass(), "name", null);
        setBooleanField(term397872, term397872.getClass(), "nameExplicitlySet", false);
        setBooleanField(term397872, term397872.getClass(), "focusable", false);
        setIntField(term397872, term397872.getClass(), "isFocusTraversableOverridden", 0);
        setField(term397872, term397872.getClass(), "focusTraversalKeys", null);
        setBooleanField(term397872, term397872.getClass(), "focusTraversalKeysEnabled", false);
        setField(term397872, term397872.getClass(), "acc", null);
        setField(term397872, term397872.getClass(), "minSize", null);
        setBooleanField(term397872, term397872.getClass(), "minSizeSet", false);
        setField(term397872, term397872.getClass(), "prefSize", null);
        setBooleanField(term397872, term397872.getClass(), "prefSizeSet", false);
        setField(term397872, term397872.getClass(), "maxSize", null);
        setBooleanField(term397872, term397872.getClass(), "maxSizeSet", false);
        setField(term397872, term397872.getClass(), "componentOrientation", null);
        setBooleanField(term397872, term397872.getClass(), "newEventsOnly", false);
        setField(term397872, term397872.getClass(), "componentListener", null);
        setField(term397872, term397872.getClass(), "focusListener", null);
        setField(term397872, term397872.getClass(), "hierarchyListener", null);
        setField(term397872, term397872.getClass(), "hierarchyBoundsListener", null);
        setField(term397872, term397872.getClass(), "keyListener", null);
        setField(term397872, term397872.getClass(), "mouseListener", null);
        setField(term397872, term397872.getClass(), "mouseMotionListener", null);
        setField(term397872, term397872.getClass(), "mouseWheelListener", null);
        setField(term397872, term397872.getClass(), "inputMethodListener", null);
        setLongField(term397872, term397872.getClass(), "eventMask", 0L);
        setField(term397872, term397872.getClass(), "changeSupport", null);
        setField(term397872, term397872.getClass(), "objectLock", null);
        setBooleanField(term397872, term397872.getClass(), "isPacked", false);
        setIntField(term397872, term397872.getClass(), "boundsOp", 0);
        setField(term397872, term397872.getClass(), "compoundShape", null);
        setField(term397872, term397872.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term397872, term397872.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term397872, term397872.getClass(), "backgroundEraseDisabled", false);
        setField(term397872, term397872.getClass(), "eventCache", null);
        setBooleanField(term397872, term397872.getClass(), "coalescingEnabled", false);
        setBooleanField(term397872, term397872.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term397872, term397872.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SummerHandler$SummerModuleEditor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "editionListener", argTypes, term397872, args);
    }

};


