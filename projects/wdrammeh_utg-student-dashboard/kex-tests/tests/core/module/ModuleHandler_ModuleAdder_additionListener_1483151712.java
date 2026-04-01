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
     Object term180514;

    public ModuleHandler_ModuleAdder_additionListener_1483151712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180514 = newInstance(Class.forName("core.module.ModuleHandler$ModuleAdder"));
        setField(term180514, term180514.getClass(), "yearField", null);
        setField(term180514, term180514.getClass(), "semesterField", null);
        setField(term180514, term180514.getClass(), "codeField", null);
        setField(term180514, term180514.getClass(), "nameField", null);
        setField(term180514, term180514.getClass(), "roomField", null);
        setField(term180514, term180514.getClass(), "lecturerField", null);
        setField(term180514, term180514.getClass(), "scoreField", null);
        setField(term180514, term180514.getClass(), "dayBox", null);
        setField(term180514, term180514.getClass(), "timeBox", null);
        setField(term180514, term180514.getClass(), "requirementBox", null);
        setField(term180514, term180514.getClass(), "creditBox", null);
        setField(term180514, term180514.getClass(), "campusBox", null);
        setField(term180514, term180514.getClass(), "yearPanel", null);
        setField(term180514, term180514.getClass(), "semesterPanel", null);
        setField(term180514, term180514.getClass(), "yearName", null);
        setField(term180514, term180514.getClass(), "semesterName", null);
        setField(term180514, term180514.getClass(), "actionButton", null);
        setIntField(term180514, term180514.getClass(), "defaultCloseOperation", 0);
        setField(term180514, term180514.getClass(), "rootPane", null);
        setBooleanField(term180514, term180514.getClass(), "rootPaneCheckingEnabled", false);
        setField(term180514, term180514.getClass(), "transferHandler", null);
        setField(term180514, term180514.getClass(), "accessibleContext", null);
        setBooleanField(term180514, term180514.getClass(), "resizable", false);
        setBooleanField(term180514, term180514.getClass(), "undecorated", false);
        setBooleanField(term180514, term180514.getClass(), "initialized", false);
        setBooleanField(term180514, term180514.getClass(), "modal", false);
        setField(term180514, term180514.getClass(), "modalityType", null);
        setField(term180514, term180514.getClass(), "blockedWindows", null);
        setField(term180514, term180514.getClass(), "title", null);
        setField(term180514, term180514.getClass(), "modalFilter", null);
        setField(term180514, term180514.getClass(), "secondaryLoop", null);
        setBooleanField(term180514, term180514.getClass(), "isInHide", false);
        setBooleanField(term180514, term180514.getClass(), "isInDispose", false);
        setField(term180514, term180514.getClass(), "warningString", null);
        setField(term180514, term180514.getClass(), "icons", null);
        setField(term180514, term180514.getClass(), "temporaryLostComponent", null);
        setBooleanField(term180514, term180514.getClass(), "syncLWRequests", false);
        setBooleanField(term180514, term180514.getClass(), "beforeFirstShow", false);
        setBooleanField(term180514, term180514.getClass(), "disposing", false);
        setField(term180514, term180514.getClass(), "disposerRecord", null);
        setIntField(term180514, term180514.getClass(), "state", 0);
        setBooleanField(term180514, term180514.getClass(), "alwaysOnTop", false);
        setField(term180514, term180514.getClass(), "ownedWindowList", null);
        setField(term180514, term180514.getClass(), "weakThis", null);
        setBooleanField(term180514, term180514.getClass(), "showWithParent", false);
        setField(term180514, term180514.getClass(), "modalBlocker", null);
        setField(term180514, term180514.getClass(), "modalExclusionType", null);
        setField(term180514, term180514.getClass(), "windowListener", null);
        setField(term180514, term180514.getClass(), "windowStateListener", null);
        setField(term180514, term180514.getClass(), "windowFocusListener", null);
        setField(term180514, term180514.getClass(), "inputContext", null);
        setField(term180514, term180514.getClass(), "inputContextLock", null);
        setField(term180514, term180514.getClass(), "focusMgr", null);
        setBooleanField(term180514, term180514.getClass(), "focusableWindowState", false);
        setBooleanField(term180514, term180514.getClass(), "autoRequestFocus", false);
        setBooleanField(term180514, term180514.getClass(), "isInShow", false);
        setFloatField(term180514, term180514.getClass(), "opacity", 0.0F);
        setField(term180514, term180514.getClass(), "shape", null);
        setBooleanField(term180514, term180514.getClass(), "isTrayIconWindow", false);
        setIntField(term180514, term180514.getClass(), "securityWarningWidth", 0);
        setIntField(term180514, term180514.getClass(), "securityWarningHeight", 0);
        setDoubleField(term180514, term180514.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term180514, term180514.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term180514, term180514.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term180514, term180514.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term180514, term180514.getClass(), "anchor", null);
        setField(term180514, term180514.getClass(), "type", null);
        setIntField(term180514, term180514.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term180514, term180514.getClass(), "locationByPlatform", false);
        setField(term180514, term180514.getClass(), "component", null);
        setField(term180514, term180514.getClass(), "layoutMgr", null);
        setField(term180514, term180514.getClass(), "dispatcher", null);
        setField(term180514, term180514.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term180514, term180514.getClass(), "focusCycleRoot", false);
        setBooleanField(term180514, term180514.getClass(), "focusTraversalPolicyProvider", false);
        setField(term180514, term180514.getClass(), "printingThreads", null);
        setBooleanField(term180514, term180514.getClass(), "printing", false);
        setField(term180514, term180514.getClass(), "containerListener", null);
        setIntField(term180514, term180514.getClass(), "listeningChildren", 0);
        setIntField(term180514, term180514.getClass(), "listeningBoundsChildren", 0);
        setIntField(term180514, term180514.getClass(), "descendantsCount", 0);
        setField(term180514, term180514.getClass(), "preserveBackgroundColor", null);
        setIntField(term180514, term180514.getClass(), "numOfHWComponents", 0);
        setIntField(term180514, term180514.getClass(), "numOfLWComponents", 0);
        setField(term180514, term180514.getClass(), "modalComp", null);
        setField(term180514, term180514.getClass(), "modalAppContext", null);
        setIntField(term180514, term180514.getClass(), "containerSerializedDataVersion", 0);
        setField(term180514, term180514.getClass(), "peer", null);
        setField(term180514, term180514.getClass(), "parent", null);
        setField(term180514, term180514.getClass(), "appContext", null);
        setIntField(term180514, term180514.getClass(), "x", 0);
        setIntField(term180514, term180514.getClass(), "y", 0);
        setIntField(term180514, term180514.getClass(), "width", 0);
        setIntField(term180514, term180514.getClass(), "height", 0);
        setField(term180514, term180514.getClass(), "foreground", null);
        setField(term180514, term180514.getClass(), "background", null);
        setField(term180514, term180514.getClass(), "font", null);
        setField(term180514, term180514.getClass(), "peerFont", null);
        setField(term180514, term180514.getClass(), "cursor", null);
        setField(term180514, term180514.getClass(), "locale", null);
        setField(term180514, term180514.getClass(), "graphicsConfig", null);
        setField(term180514, term180514.getClass(), "bufferStrategy", null);
        setBooleanField(term180514, term180514.getClass(), "ignoreRepaint", false);
        setBooleanField(term180514, term180514.getClass(), "visible", false);
        setBooleanField(term180514, term180514.getClass(), "enabled", false);
        setBooleanField(term180514, term180514.getClass(), "valid", false);
        setField(term180514, term180514.getClass(), "dropTarget", null);
        setField(term180514, term180514.getClass(), "popups", null);
        setField(term180514, term180514.getClass(), "name", null);
        setBooleanField(term180514, term180514.getClass(), "nameExplicitlySet", false);
        setBooleanField(term180514, term180514.getClass(), "focusable", false);
        setIntField(term180514, term180514.getClass(), "isFocusTraversableOverridden", 0);
        setField(term180514, term180514.getClass(), "focusTraversalKeys", null);
        setBooleanField(term180514, term180514.getClass(), "focusTraversalKeysEnabled", false);
        setField(term180514, term180514.getClass(), "acc", null);
        setField(term180514, term180514.getClass(), "minSize", null);
        setBooleanField(term180514, term180514.getClass(), "minSizeSet", false);
        setField(term180514, term180514.getClass(), "prefSize", null);
        setBooleanField(term180514, term180514.getClass(), "prefSizeSet", false);
        setField(term180514, term180514.getClass(), "maxSize", null);
        setBooleanField(term180514, term180514.getClass(), "maxSizeSet", false);
        setField(term180514, term180514.getClass(), "componentOrientation", null);
        setBooleanField(term180514, term180514.getClass(), "newEventsOnly", false);
        setField(term180514, term180514.getClass(), "componentListener", null);
        setField(term180514, term180514.getClass(), "focusListener", null);
        setField(term180514, term180514.getClass(), "hierarchyListener", null);
        setField(term180514, term180514.getClass(), "hierarchyBoundsListener", null);
        setField(term180514, term180514.getClass(), "keyListener", null);
        setField(term180514, term180514.getClass(), "mouseListener", null);
        setField(term180514, term180514.getClass(), "mouseMotionListener", null);
        setField(term180514, term180514.getClass(), "mouseWheelListener", null);
        setField(term180514, term180514.getClass(), "inputMethodListener", null);
        setLongField(term180514, term180514.getClass(), "eventMask", 0L);
        setField(term180514, term180514.getClass(), "changeSupport", null);
        setField(term180514, term180514.getClass(), "objectLock", null);
        setBooleanField(term180514, term180514.getClass(), "isPacked", false);
        setIntField(term180514, term180514.getClass(), "boundsOp", 0);
        setField(term180514, term180514.getClass(), "compoundShape", null);
        setField(term180514, term180514.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term180514, term180514.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term180514, term180514.getClass(), "backgroundEraseDisabled", false);
        setField(term180514, term180514.getClass(), "eventCache", null);
        setBooleanField(term180514, term180514.getClass(), "coalescingEnabled", false);
        setBooleanField(term180514, term180514.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term180514, term180514.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleHandler$ModuleAdder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "additionListener", argTypes, term180514, args);
    }

};


