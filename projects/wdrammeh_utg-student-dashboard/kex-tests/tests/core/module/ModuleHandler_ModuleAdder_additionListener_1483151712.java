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

public class ModuleHandler_ModuleAdder_additionListener_1483151712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60448;

    public ModuleHandler_ModuleAdder_additionListener_1483151712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60448 = newInstance(Class.forName("core.module.ModuleHandler$ModuleAdder"));
        setField(term60448, term60448.getClass(), "yearField", null);
        setField(term60448, term60448.getClass(), "semesterField", null);
        setField(term60448, term60448.getClass(), "codeField", null);
        setField(term60448, term60448.getClass(), "nameField", null);
        setField(term60448, term60448.getClass(), "roomField", null);
        setField(term60448, term60448.getClass(), "lecturerField", null);
        setField(term60448, term60448.getClass(), "scoreField", null);
        setField(term60448, term60448.getClass(), "dayBox", null);
        setField(term60448, term60448.getClass(), "timeBox", null);
        setField(term60448, term60448.getClass(), "requirementBox", null);
        setField(term60448, term60448.getClass(), "creditBox", null);
        setField(term60448, term60448.getClass(), "campusBox", null);
        setField(term60448, term60448.getClass(), "yearPanel", null);
        setField(term60448, term60448.getClass(), "semesterPanel", null);
        setField(term60448, term60448.getClass(), "yearName", null);
        setField(term60448, term60448.getClass(), "semesterName", null);
        setField(term60448, term60448.getClass(), "actionButton", null);
        setIntField(term60448, term60448.getClass(), "defaultCloseOperation", 0);
        setField(term60448, term60448.getClass(), "rootPane", null);
        setBooleanField(term60448, term60448.getClass(), "rootPaneCheckingEnabled", false);
        setField(term60448, term60448.getClass(), "transferHandler", null);
        setField(term60448, term60448.getClass(), "accessibleContext", null);
        setBooleanField(term60448, term60448.getClass(), "resizable", false);
        setBooleanField(term60448, term60448.getClass(), "undecorated", false);
        setBooleanField(term60448, term60448.getClass(), "initialized", false);
        setBooleanField(term60448, term60448.getClass(), "modal", false);
        setField(term60448, term60448.getClass(), "modalityType", null);
        setField(term60448, term60448.getClass(), "blockedWindows", null);
        setField(term60448, term60448.getClass(), "title", null);
        setField(term60448, term60448.getClass(), "modalFilter", null);
        setField(term60448, term60448.getClass(), "secondaryLoop", null);
        setBooleanField(term60448, term60448.getClass(), "isInHide", false);
        setBooleanField(term60448, term60448.getClass(), "isInDispose", false);
        setField(term60448, term60448.getClass(), "warningString", null);
        setField(term60448, term60448.getClass(), "icons", null);
        setField(term60448, term60448.getClass(), "temporaryLostComponent", null);
        setBooleanField(term60448, term60448.getClass(), "syncLWRequests", false);
        setBooleanField(term60448, term60448.getClass(), "beforeFirstShow", false);
        setBooleanField(term60448, term60448.getClass(), "disposing", false);
        setField(term60448, term60448.getClass(), "disposerRecord", null);
        setIntField(term60448, term60448.getClass(), "state", 0);
        setBooleanField(term60448, term60448.getClass(), "alwaysOnTop", false);
        setField(term60448, term60448.getClass(), "ownedWindowList", null);
        setField(term60448, term60448.getClass(), "weakThis", null);
        setBooleanField(term60448, term60448.getClass(), "showWithParent", false);
        setField(term60448, term60448.getClass(), "modalBlocker", null);
        setField(term60448, term60448.getClass(), "modalExclusionType", null);
        setField(term60448, term60448.getClass(), "windowListener", null);
        setField(term60448, term60448.getClass(), "windowStateListener", null);
        setField(term60448, term60448.getClass(), "windowFocusListener", null);
        setField(term60448, term60448.getClass(), "inputContext", null);
        setField(term60448, term60448.getClass(), "inputContextLock", null);
        setField(term60448, term60448.getClass(), "focusMgr", null);
        setBooleanField(term60448, term60448.getClass(), "focusableWindowState", false);
        setBooleanField(term60448, term60448.getClass(), "autoRequestFocus", false);
        setBooleanField(term60448, term60448.getClass(), "isInShow", false);
        setFloatField(term60448, term60448.getClass(), "opacity", 0.0F);
        setField(term60448, term60448.getClass(), "shape", null);
        setBooleanField(term60448, term60448.getClass(), "isTrayIconWindow", false);
        setIntField(term60448, term60448.getClass(), "securityWarningWidth", 0);
        setIntField(term60448, term60448.getClass(), "securityWarningHeight", 0);
        setDoubleField(term60448, term60448.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term60448, term60448.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term60448, term60448.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term60448, term60448.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term60448, term60448.getClass(), "anchor", null);
        setField(term60448, term60448.getClass(), "type", null);
        setIntField(term60448, term60448.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term60448, term60448.getClass(), "locationByPlatform", false);
        setField(term60448, term60448.getClass(), "component", null);
        setField(term60448, term60448.getClass(), "layoutMgr", null);
        setField(term60448, term60448.getClass(), "dispatcher", null);
        setField(term60448, term60448.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term60448, term60448.getClass(), "focusCycleRoot", false);
        setBooleanField(term60448, term60448.getClass(), "focusTraversalPolicyProvider", false);
        setField(term60448, term60448.getClass(), "printingThreads", null);
        setBooleanField(term60448, term60448.getClass(), "printing", false);
        setField(term60448, term60448.getClass(), "containerListener", null);
        setIntField(term60448, term60448.getClass(), "listeningChildren", 0);
        setIntField(term60448, term60448.getClass(), "listeningBoundsChildren", 0);
        setIntField(term60448, term60448.getClass(), "descendantsCount", 0);
        setField(term60448, term60448.getClass(), "preserveBackgroundColor", null);
        setIntField(term60448, term60448.getClass(), "numOfHWComponents", 0);
        setIntField(term60448, term60448.getClass(), "numOfLWComponents", 0);
        setField(term60448, term60448.getClass(), "modalComp", null);
        setField(term60448, term60448.getClass(), "modalAppContext", null);
        setIntField(term60448, term60448.getClass(), "containerSerializedDataVersion", 0);
        setField(term60448, term60448.getClass(), "peer", null);
        setField(term60448, term60448.getClass(), "parent", null);
        setField(term60448, term60448.getClass(), "appContext", null);
        setIntField(term60448, term60448.getClass(), "x", 0);
        setIntField(term60448, term60448.getClass(), "y", 0);
        setIntField(term60448, term60448.getClass(), "width", 0);
        setIntField(term60448, term60448.getClass(), "height", 0);
        setField(term60448, term60448.getClass(), "foreground", null);
        setField(term60448, term60448.getClass(), "background", null);
        setField(term60448, term60448.getClass(), "font", null);
        setField(term60448, term60448.getClass(), "peerFont", null);
        setField(term60448, term60448.getClass(), "cursor", null);
        setField(term60448, term60448.getClass(), "locale", null);
        setField(term60448, term60448.getClass(), "graphicsConfig", null);
        setField(term60448, term60448.getClass(), "bufferStrategy", null);
        setBooleanField(term60448, term60448.getClass(), "ignoreRepaint", false);
        setBooleanField(term60448, term60448.getClass(), "visible", false);
        setBooleanField(term60448, term60448.getClass(), "enabled", false);
        setBooleanField(term60448, term60448.getClass(), "valid", false);
        setField(term60448, term60448.getClass(), "dropTarget", null);
        setField(term60448, term60448.getClass(), "popups", null);
        setField(term60448, term60448.getClass(), "name", null);
        setBooleanField(term60448, term60448.getClass(), "nameExplicitlySet", false);
        setBooleanField(term60448, term60448.getClass(), "focusable", false);
        setIntField(term60448, term60448.getClass(), "isFocusTraversableOverridden", 0);
        setField(term60448, term60448.getClass(), "focusTraversalKeys", null);
        setBooleanField(term60448, term60448.getClass(), "focusTraversalKeysEnabled", false);
        setField(term60448, term60448.getClass(), "acc", null);
        setField(term60448, term60448.getClass(), "minSize", null);
        setBooleanField(term60448, term60448.getClass(), "minSizeSet", false);
        setField(term60448, term60448.getClass(), "prefSize", null);
        setBooleanField(term60448, term60448.getClass(), "prefSizeSet", false);
        setField(term60448, term60448.getClass(), "maxSize", null);
        setBooleanField(term60448, term60448.getClass(), "maxSizeSet", false);
        setField(term60448, term60448.getClass(), "componentOrientation", null);
        setBooleanField(term60448, term60448.getClass(), "newEventsOnly", false);
        setField(term60448, term60448.getClass(), "componentListener", null);
        setField(term60448, term60448.getClass(), "focusListener", null);
        setField(term60448, term60448.getClass(), "hierarchyListener", null);
        setField(term60448, term60448.getClass(), "hierarchyBoundsListener", null);
        setField(term60448, term60448.getClass(), "keyListener", null);
        setField(term60448, term60448.getClass(), "mouseListener", null);
        setField(term60448, term60448.getClass(), "mouseMotionListener", null);
        setField(term60448, term60448.getClass(), "mouseWheelListener", null);
        setField(term60448, term60448.getClass(), "inputMethodListener", null);
        setLongField(term60448, term60448.getClass(), "eventMask", 0L);
        setField(term60448, term60448.getClass(), "changeSupport", null);
        setField(term60448, term60448.getClass(), "objectLock", null);
        setBooleanField(term60448, term60448.getClass(), "isPacked", false);
        setIntField(term60448, term60448.getClass(), "boundsOp", 0);
        setField(term60448, term60448.getClass(), "compoundShape", null);
        setField(term60448, term60448.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term60448, term60448.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term60448, term60448.getClass(), "backgroundEraseDisabled", false);
        setField(term60448, term60448.getClass(), "eventCache", null);
        setBooleanField(term60448, term60448.getClass(), "coalescingEnabled", false);
        setBooleanField(term60448, term60448.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term60448, term60448.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleHandler$ModuleAdder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "additionListener", argTypes, term60448, args);
    }

};


