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
     Object term129100;

    public SummerHandler_SummerModuleEditor_editionListener_2617220262() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129100 = newInstance(Class.forName("core.module.SummerHandler$SummerModuleEditor"));
        setField(term129100, term129100.getClass(), "target", null);
        setField(term129100, term129100.getClass(), "availableYearsBox", null);
        setField(term129100, term129100.getClass(), "yearField", null);
        setField(term129100, term129100.getClass(), "semesterField", null);
        setField(term129100, term129100.getClass(), "codeField", null);
        setField(term129100, term129100.getClass(), "nameField", null);
        setField(term129100, term129100.getClass(), "roomField", null);
        setField(term129100, term129100.getClass(), "lecturerField", null);
        setField(term129100, term129100.getClass(), "scoreField", null);
        setField(term129100, term129100.getClass(), "dayBox", null);
        setField(term129100, term129100.getClass(), "timeBox", null);
        setField(term129100, term129100.getClass(), "requirementBox", null);
        setField(term129100, term129100.getClass(), "creditBox", null);
        setField(term129100, term129100.getClass(), "campusBox", null);
        setField(term129100, term129100.getClass(), "yearPanel", null);
        setField(term129100, term129100.getClass(), "semesterPanel", null);
        setField(term129100, term129100.getClass(), "yearName", null);
        setField(term129100, term129100.getClass(), "semesterName", null);
        setField(term129100, term129100.getClass(), "actionButton", null);
        setIntField(term129100, term129100.getClass(), "defaultCloseOperation", 0);
        setField(term129100, term129100.getClass(), "rootPane", null);
        setBooleanField(term129100, term129100.getClass(), "rootPaneCheckingEnabled", false);
        setField(term129100, term129100.getClass(), "transferHandler", null);
        setField(term129100, term129100.getClass(), "accessibleContext", null);
        setBooleanField(term129100, term129100.getClass(), "resizable", false);
        setBooleanField(term129100, term129100.getClass(), "undecorated", false);
        setBooleanField(term129100, term129100.getClass(), "initialized", false);
        setBooleanField(term129100, term129100.getClass(), "modal", false);
        setField(term129100, term129100.getClass(), "modalityType", null);
        setField(term129100, term129100.getClass(), "blockedWindows", null);
        setField(term129100, term129100.getClass(), "title", null);
        setField(term129100, term129100.getClass(), "modalFilter", null);
        setField(term129100, term129100.getClass(), "secondaryLoop", null);
        setBooleanField(term129100, term129100.getClass(), "isInHide", false);
        setBooleanField(term129100, term129100.getClass(), "isInDispose", false);
        setField(term129100, term129100.getClass(), "warningString", null);
        setField(term129100, term129100.getClass(), "icons", null);
        setField(term129100, term129100.getClass(), "temporaryLostComponent", null);
        setBooleanField(term129100, term129100.getClass(), "syncLWRequests", false);
        setBooleanField(term129100, term129100.getClass(), "beforeFirstShow", false);
        setBooleanField(term129100, term129100.getClass(), "disposing", false);
        setField(term129100, term129100.getClass(), "disposerRecord", null);
        setIntField(term129100, term129100.getClass(), "state", 0);
        setBooleanField(term129100, term129100.getClass(), "alwaysOnTop", false);
        setField(term129100, term129100.getClass(), "ownedWindowList", null);
        setField(term129100, term129100.getClass(), "weakThis", null);
        setBooleanField(term129100, term129100.getClass(), "showWithParent", false);
        setField(term129100, term129100.getClass(), "modalBlocker", null);
        setField(term129100, term129100.getClass(), "modalExclusionType", null);
        setField(term129100, term129100.getClass(), "windowListener", null);
        setField(term129100, term129100.getClass(), "windowStateListener", null);
        setField(term129100, term129100.getClass(), "windowFocusListener", null);
        setField(term129100, term129100.getClass(), "inputContext", null);
        setField(term129100, term129100.getClass(), "inputContextLock", null);
        setField(term129100, term129100.getClass(), "focusMgr", null);
        setBooleanField(term129100, term129100.getClass(), "focusableWindowState", false);
        setBooleanField(term129100, term129100.getClass(), "autoRequestFocus", false);
        setBooleanField(term129100, term129100.getClass(), "isInShow", false);
        setFloatField(term129100, term129100.getClass(), "opacity", 0.0F);
        setField(term129100, term129100.getClass(), "shape", null);
        setBooleanField(term129100, term129100.getClass(), "isTrayIconWindow", false);
        setIntField(term129100, term129100.getClass(), "securityWarningWidth", 0);
        setIntField(term129100, term129100.getClass(), "securityWarningHeight", 0);
        setDoubleField(term129100, term129100.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term129100, term129100.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term129100, term129100.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term129100, term129100.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term129100, term129100.getClass(), "anchor", null);
        setField(term129100, term129100.getClass(), "type", null);
        setIntField(term129100, term129100.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term129100, term129100.getClass(), "locationByPlatform", false);
        setField(term129100, term129100.getClass(), "component", null);
        setField(term129100, term129100.getClass(), "layoutMgr", null);
        setField(term129100, term129100.getClass(), "dispatcher", null);
        setField(term129100, term129100.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term129100, term129100.getClass(), "focusCycleRoot", false);
        setBooleanField(term129100, term129100.getClass(), "focusTraversalPolicyProvider", false);
        setField(term129100, term129100.getClass(), "printingThreads", null);
        setBooleanField(term129100, term129100.getClass(), "printing", false);
        setField(term129100, term129100.getClass(), "containerListener", null);
        setIntField(term129100, term129100.getClass(), "listeningChildren", 0);
        setIntField(term129100, term129100.getClass(), "listeningBoundsChildren", 0);
        setIntField(term129100, term129100.getClass(), "descendantsCount", 0);
        setField(term129100, term129100.getClass(), "preserveBackgroundColor", null);
        setIntField(term129100, term129100.getClass(), "numOfHWComponents", 0);
        setIntField(term129100, term129100.getClass(), "numOfLWComponents", 0);
        setField(term129100, term129100.getClass(), "modalComp", null);
        setField(term129100, term129100.getClass(), "modalAppContext", null);
        setIntField(term129100, term129100.getClass(), "containerSerializedDataVersion", 0);
        setField(term129100, term129100.getClass(), "peer", null);
        setField(term129100, term129100.getClass(), "parent", null);
        setField(term129100, term129100.getClass(), "appContext", null);
        setIntField(term129100, term129100.getClass(), "x", 0);
        setIntField(term129100, term129100.getClass(), "y", 0);
        setIntField(term129100, term129100.getClass(), "width", 0);
        setIntField(term129100, term129100.getClass(), "height", 0);
        setField(term129100, term129100.getClass(), "foreground", null);
        setField(term129100, term129100.getClass(), "background", null);
        setField(term129100, term129100.getClass(), "font", null);
        setField(term129100, term129100.getClass(), "peerFont", null);
        setField(term129100, term129100.getClass(), "cursor", null);
        setField(term129100, term129100.getClass(), "locale", null);
        setField(term129100, term129100.getClass(), "graphicsConfig", null);
        setField(term129100, term129100.getClass(), "bufferStrategy", null);
        setBooleanField(term129100, term129100.getClass(), "ignoreRepaint", false);
        setBooleanField(term129100, term129100.getClass(), "visible", false);
        setBooleanField(term129100, term129100.getClass(), "enabled", false);
        setBooleanField(term129100, term129100.getClass(), "valid", false);
        setField(term129100, term129100.getClass(), "dropTarget", null);
        setField(term129100, term129100.getClass(), "popups", null);
        setField(term129100, term129100.getClass(), "name", null);
        setBooleanField(term129100, term129100.getClass(), "nameExplicitlySet", false);
        setBooleanField(term129100, term129100.getClass(), "focusable", false);
        setIntField(term129100, term129100.getClass(), "isFocusTraversableOverridden", 0);
        setField(term129100, term129100.getClass(), "focusTraversalKeys", null);
        setBooleanField(term129100, term129100.getClass(), "focusTraversalKeysEnabled", false);
        setField(term129100, term129100.getClass(), "acc", null);
        setField(term129100, term129100.getClass(), "minSize", null);
        setBooleanField(term129100, term129100.getClass(), "minSizeSet", false);
        setField(term129100, term129100.getClass(), "prefSize", null);
        setBooleanField(term129100, term129100.getClass(), "prefSizeSet", false);
        setField(term129100, term129100.getClass(), "maxSize", null);
        setBooleanField(term129100, term129100.getClass(), "maxSizeSet", false);
        setField(term129100, term129100.getClass(), "componentOrientation", null);
        setBooleanField(term129100, term129100.getClass(), "newEventsOnly", false);
        setField(term129100, term129100.getClass(), "componentListener", null);
        setField(term129100, term129100.getClass(), "focusListener", null);
        setField(term129100, term129100.getClass(), "hierarchyListener", null);
        setField(term129100, term129100.getClass(), "hierarchyBoundsListener", null);
        setField(term129100, term129100.getClass(), "keyListener", null);
        setField(term129100, term129100.getClass(), "mouseListener", null);
        setField(term129100, term129100.getClass(), "mouseMotionListener", null);
        setField(term129100, term129100.getClass(), "mouseWheelListener", null);
        setField(term129100, term129100.getClass(), "inputMethodListener", null);
        setLongField(term129100, term129100.getClass(), "eventMask", 0L);
        setField(term129100, term129100.getClass(), "changeSupport", null);
        setField(term129100, term129100.getClass(), "objectLock", null);
        setBooleanField(term129100, term129100.getClass(), "isPacked", false);
        setIntField(term129100, term129100.getClass(), "boundsOp", 0);
        setField(term129100, term129100.getClass(), "compoundShape", null);
        setField(term129100, term129100.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term129100, term129100.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term129100, term129100.getClass(), "backgroundEraseDisabled", false);
        setField(term129100, term129100.getClass(), "eventCache", null);
        setBooleanField(term129100, term129100.getClass(), "coalescingEnabled", false);
        setBooleanField(term129100, term129100.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term129100, term129100.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.SummerHandler$SummerModuleEditor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "editionListener", argTypes, term129100, args);
    }

};


