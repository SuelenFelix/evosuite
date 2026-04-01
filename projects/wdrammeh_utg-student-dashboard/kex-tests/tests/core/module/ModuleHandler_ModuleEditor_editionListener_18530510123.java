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

public class ModuleHandler_ModuleEditor_editionListener_18530510123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315141;

    public ModuleHandler_ModuleEditor_editionListener_18530510123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315141 = newInstance(Class.forName("core.module.ModuleHandler$ModuleEditor"));
        setField(term315141, term315141.getClass(), "onModel", null);
        setField(term315141, term315141.getClass(), "target", null);
        setField(term315141, term315141.getClass(), "yearField", null);
        setField(term315141, term315141.getClass(), "semesterField", null);
        setField(term315141, term315141.getClass(), "codeField", null);
        setField(term315141, term315141.getClass(), "nameField", null);
        setField(term315141, term315141.getClass(), "roomField", null);
        setField(term315141, term315141.getClass(), "lecturerField", null);
        setField(term315141, term315141.getClass(), "scoreField", null);
        setField(term315141, term315141.getClass(), "dayBox", null);
        setField(term315141, term315141.getClass(), "timeBox", null);
        setField(term315141, term315141.getClass(), "requirementBox", null);
        setField(term315141, term315141.getClass(), "creditBox", null);
        setField(term315141, term315141.getClass(), "campusBox", null);
        setField(term315141, term315141.getClass(), "yearPanel", null);
        setField(term315141, term315141.getClass(), "semesterPanel", null);
        setField(term315141, term315141.getClass(), "yearName", null);
        setField(term315141, term315141.getClass(), "semesterName", null);
        setField(term315141, term315141.getClass(), "actionButton", null);
        setIntField(term315141, term315141.getClass(), "defaultCloseOperation", 0);
        setField(term315141, term315141.getClass(), "rootPane", null);
        setBooleanField(term315141, term315141.getClass(), "rootPaneCheckingEnabled", false);
        setField(term315141, term315141.getClass(), "transferHandler", null);
        setField(term315141, term315141.getClass(), "accessibleContext", null);
        setBooleanField(term315141, term315141.getClass(), "resizable", false);
        setBooleanField(term315141, term315141.getClass(), "undecorated", false);
        setBooleanField(term315141, term315141.getClass(), "initialized", false);
        setBooleanField(term315141, term315141.getClass(), "modal", false);
        setField(term315141, term315141.getClass(), "modalityType", null);
        setField(term315141, term315141.getClass(), "blockedWindows", null);
        setField(term315141, term315141.getClass(), "title", null);
        setField(term315141, term315141.getClass(), "modalFilter", null);
        setField(term315141, term315141.getClass(), "secondaryLoop", null);
        setBooleanField(term315141, term315141.getClass(), "isInHide", false);
        setBooleanField(term315141, term315141.getClass(), "isInDispose", false);
        setField(term315141, term315141.getClass(), "warningString", null);
        setField(term315141, term315141.getClass(), "icons", null);
        setField(term315141, term315141.getClass(), "temporaryLostComponent", null);
        setBooleanField(term315141, term315141.getClass(), "syncLWRequests", false);
        setBooleanField(term315141, term315141.getClass(), "beforeFirstShow", false);
        setBooleanField(term315141, term315141.getClass(), "disposing", false);
        setField(term315141, term315141.getClass(), "disposerRecord", null);
        setIntField(term315141, term315141.getClass(), "state", 0);
        setBooleanField(term315141, term315141.getClass(), "alwaysOnTop", false);
        setField(term315141, term315141.getClass(), "ownedWindowList", null);
        setField(term315141, term315141.getClass(), "weakThis", null);
        setBooleanField(term315141, term315141.getClass(), "showWithParent", false);
        setField(term315141, term315141.getClass(), "modalBlocker", null);
        setField(term315141, term315141.getClass(), "modalExclusionType", null);
        setField(term315141, term315141.getClass(), "windowListener", null);
        setField(term315141, term315141.getClass(), "windowStateListener", null);
        setField(term315141, term315141.getClass(), "windowFocusListener", null);
        setField(term315141, term315141.getClass(), "inputContext", null);
        setField(term315141, term315141.getClass(), "inputContextLock", null);
        setField(term315141, term315141.getClass(), "focusMgr", null);
        setBooleanField(term315141, term315141.getClass(), "focusableWindowState", false);
        setBooleanField(term315141, term315141.getClass(), "autoRequestFocus", false);
        setBooleanField(term315141, term315141.getClass(), "isInShow", false);
        setFloatField(term315141, term315141.getClass(), "opacity", 0.0F);
        setField(term315141, term315141.getClass(), "shape", null);
        setBooleanField(term315141, term315141.getClass(), "isTrayIconWindow", false);
        setIntField(term315141, term315141.getClass(), "securityWarningWidth", 0);
        setIntField(term315141, term315141.getClass(), "securityWarningHeight", 0);
        setDoubleField(term315141, term315141.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term315141, term315141.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term315141, term315141.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term315141, term315141.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term315141, term315141.getClass(), "anchor", null);
        setField(term315141, term315141.getClass(), "type", null);
        setIntField(term315141, term315141.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term315141, term315141.getClass(), "locationByPlatform", false);
        setField(term315141, term315141.getClass(), "component", null);
        setField(term315141, term315141.getClass(), "layoutMgr", null);
        setField(term315141, term315141.getClass(), "dispatcher", null);
        setField(term315141, term315141.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term315141, term315141.getClass(), "focusCycleRoot", false);
        setBooleanField(term315141, term315141.getClass(), "focusTraversalPolicyProvider", false);
        setField(term315141, term315141.getClass(), "printingThreads", null);
        setBooleanField(term315141, term315141.getClass(), "printing", false);
        setField(term315141, term315141.getClass(), "containerListener", null);
        setIntField(term315141, term315141.getClass(), "listeningChildren", 0);
        setIntField(term315141, term315141.getClass(), "listeningBoundsChildren", 0);
        setIntField(term315141, term315141.getClass(), "descendantsCount", 0);
        setField(term315141, term315141.getClass(), "preserveBackgroundColor", null);
        setIntField(term315141, term315141.getClass(), "numOfHWComponents", 0);
        setIntField(term315141, term315141.getClass(), "numOfLWComponents", 0);
        setField(term315141, term315141.getClass(), "modalComp", null);
        setField(term315141, term315141.getClass(), "modalAppContext", null);
        setIntField(term315141, term315141.getClass(), "containerSerializedDataVersion", 0);
        setField(term315141, term315141.getClass(), "peer", null);
        setField(term315141, term315141.getClass(), "parent", null);
        setField(term315141, term315141.getClass(), "appContext", null);
        setIntField(term315141, term315141.getClass(), "x", 0);
        setIntField(term315141, term315141.getClass(), "y", 0);
        setIntField(term315141, term315141.getClass(), "width", 0);
        setIntField(term315141, term315141.getClass(), "height", 0);
        setField(term315141, term315141.getClass(), "foreground", null);
        setField(term315141, term315141.getClass(), "background", null);
        setField(term315141, term315141.getClass(), "font", null);
        setField(term315141, term315141.getClass(), "peerFont", null);
        setField(term315141, term315141.getClass(), "cursor", null);
        setField(term315141, term315141.getClass(), "locale", null);
        setField(term315141, term315141.getClass(), "graphicsConfig", null);
        setField(term315141, term315141.getClass(), "bufferStrategy", null);
        setBooleanField(term315141, term315141.getClass(), "ignoreRepaint", false);
        setBooleanField(term315141, term315141.getClass(), "visible", false);
        setBooleanField(term315141, term315141.getClass(), "enabled", false);
        setBooleanField(term315141, term315141.getClass(), "valid", false);
        setField(term315141, term315141.getClass(), "dropTarget", null);
        setField(term315141, term315141.getClass(), "popups", null);
        setField(term315141, term315141.getClass(), "name", null);
        setBooleanField(term315141, term315141.getClass(), "nameExplicitlySet", false);
        setBooleanField(term315141, term315141.getClass(), "focusable", false);
        setIntField(term315141, term315141.getClass(), "isFocusTraversableOverridden", 0);
        setField(term315141, term315141.getClass(), "focusTraversalKeys", null);
        setBooleanField(term315141, term315141.getClass(), "focusTraversalKeysEnabled", false);
        setField(term315141, term315141.getClass(), "acc", null);
        setField(term315141, term315141.getClass(), "minSize", null);
        setBooleanField(term315141, term315141.getClass(), "minSizeSet", false);
        setField(term315141, term315141.getClass(), "prefSize", null);
        setBooleanField(term315141, term315141.getClass(), "prefSizeSet", false);
        setField(term315141, term315141.getClass(), "maxSize", null);
        setBooleanField(term315141, term315141.getClass(), "maxSizeSet", false);
        setField(term315141, term315141.getClass(), "componentOrientation", null);
        setBooleanField(term315141, term315141.getClass(), "newEventsOnly", false);
        setField(term315141, term315141.getClass(), "componentListener", null);
        setField(term315141, term315141.getClass(), "focusListener", null);
        setField(term315141, term315141.getClass(), "hierarchyListener", null);
        setField(term315141, term315141.getClass(), "hierarchyBoundsListener", null);
        setField(term315141, term315141.getClass(), "keyListener", null);
        setField(term315141, term315141.getClass(), "mouseListener", null);
        setField(term315141, term315141.getClass(), "mouseMotionListener", null);
        setField(term315141, term315141.getClass(), "mouseWheelListener", null);
        setField(term315141, term315141.getClass(), "inputMethodListener", null);
        setLongField(term315141, term315141.getClass(), "eventMask", 0L);
        setField(term315141, term315141.getClass(), "changeSupport", null);
        setField(term315141, term315141.getClass(), "objectLock", null);
        setBooleanField(term315141, term315141.getClass(), "isPacked", false);
        setIntField(term315141, term315141.getClass(), "boundsOp", 0);
        setField(term315141, term315141.getClass(), "compoundShape", null);
        setField(term315141, term315141.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term315141, term315141.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term315141, term315141.getClass(), "backgroundEraseDisabled", false);
        setField(term315141, term315141.getClass(), "eventCache", null);
        setBooleanField(term315141, term315141.getClass(), "coalescingEnabled", false);
        setBooleanField(term315141, term315141.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term315141, term315141.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleHandler$ModuleEditor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "editionListener", argTypes, term315141, args);
    }

};


