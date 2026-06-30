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
     Object term96857;

    public ModuleHandler_ModuleEditor_editionListener_18530510123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96857 = newInstance(Class.forName("core.module.ModuleHandler$ModuleEditor"));
        setField(term96857, term96857.getClass(), "onModel", null);
        setField(term96857, term96857.getClass(), "target", null);
        setField(term96857, term96857.getClass(), "yearField", null);
        setField(term96857, term96857.getClass(), "semesterField", null);
        setField(term96857, term96857.getClass(), "codeField", null);
        setField(term96857, term96857.getClass(), "nameField", null);
        setField(term96857, term96857.getClass(), "roomField", null);
        setField(term96857, term96857.getClass(), "lecturerField", null);
        setField(term96857, term96857.getClass(), "scoreField", null);
        setField(term96857, term96857.getClass(), "dayBox", null);
        setField(term96857, term96857.getClass(), "timeBox", null);
        setField(term96857, term96857.getClass(), "requirementBox", null);
        setField(term96857, term96857.getClass(), "creditBox", null);
        setField(term96857, term96857.getClass(), "campusBox", null);
        setField(term96857, term96857.getClass(), "yearPanel", null);
        setField(term96857, term96857.getClass(), "semesterPanel", null);
        setField(term96857, term96857.getClass(), "yearName", null);
        setField(term96857, term96857.getClass(), "semesterName", null);
        setField(term96857, term96857.getClass(), "actionButton", null);
        setIntField(term96857, term96857.getClass(), "defaultCloseOperation", 0);
        setField(term96857, term96857.getClass(), "rootPane", null);
        setBooleanField(term96857, term96857.getClass(), "rootPaneCheckingEnabled", false);
        setField(term96857, term96857.getClass(), "transferHandler", null);
        setField(term96857, term96857.getClass(), "accessibleContext", null);
        setBooleanField(term96857, term96857.getClass(), "resizable", false);
        setBooleanField(term96857, term96857.getClass(), "undecorated", false);
        setBooleanField(term96857, term96857.getClass(), "initialized", false);
        setBooleanField(term96857, term96857.getClass(), "modal", false);
        setField(term96857, term96857.getClass(), "modalityType", null);
        setField(term96857, term96857.getClass(), "blockedWindows", null);
        setField(term96857, term96857.getClass(), "title", null);
        setField(term96857, term96857.getClass(), "modalFilter", null);
        setField(term96857, term96857.getClass(), "secondaryLoop", null);
        setBooleanField(term96857, term96857.getClass(), "isInHide", false);
        setBooleanField(term96857, term96857.getClass(), "isInDispose", false);
        setField(term96857, term96857.getClass(), "warningString", null);
        setField(term96857, term96857.getClass(), "icons", null);
        setField(term96857, term96857.getClass(), "temporaryLostComponent", null);
        setBooleanField(term96857, term96857.getClass(), "syncLWRequests", false);
        setBooleanField(term96857, term96857.getClass(), "beforeFirstShow", false);
        setBooleanField(term96857, term96857.getClass(), "disposing", false);
        setField(term96857, term96857.getClass(), "disposerRecord", null);
        setIntField(term96857, term96857.getClass(), "state", 0);
        setBooleanField(term96857, term96857.getClass(), "alwaysOnTop", false);
        setField(term96857, term96857.getClass(), "ownedWindowList", null);
        setField(term96857, term96857.getClass(), "weakThis", null);
        setBooleanField(term96857, term96857.getClass(), "showWithParent", false);
        setField(term96857, term96857.getClass(), "modalBlocker", null);
        setField(term96857, term96857.getClass(), "modalExclusionType", null);
        setField(term96857, term96857.getClass(), "windowListener", null);
        setField(term96857, term96857.getClass(), "windowStateListener", null);
        setField(term96857, term96857.getClass(), "windowFocusListener", null);
        setField(term96857, term96857.getClass(), "inputContext", null);
        setField(term96857, term96857.getClass(), "inputContextLock", null);
        setField(term96857, term96857.getClass(), "focusMgr", null);
        setBooleanField(term96857, term96857.getClass(), "focusableWindowState", false);
        setBooleanField(term96857, term96857.getClass(), "autoRequestFocus", false);
        setBooleanField(term96857, term96857.getClass(), "isInShow", false);
        setFloatField(term96857, term96857.getClass(), "opacity", 0.0F);
        setField(term96857, term96857.getClass(), "shape", null);
        setBooleanField(term96857, term96857.getClass(), "isTrayIconWindow", false);
        setIntField(term96857, term96857.getClass(), "securityWarningWidth", 0);
        setIntField(term96857, term96857.getClass(), "securityWarningHeight", 0);
        setDoubleField(term96857, term96857.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term96857, term96857.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term96857, term96857.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term96857, term96857.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term96857, term96857.getClass(), "anchor", null);
        setField(term96857, term96857.getClass(), "type", null);
        setIntField(term96857, term96857.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term96857, term96857.getClass(), "locationByPlatform", false);
        setField(term96857, term96857.getClass(), "component", null);
        setField(term96857, term96857.getClass(), "layoutMgr", null);
        setField(term96857, term96857.getClass(), "dispatcher", null);
        setField(term96857, term96857.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term96857, term96857.getClass(), "focusCycleRoot", false);
        setBooleanField(term96857, term96857.getClass(), "focusTraversalPolicyProvider", false);
        setField(term96857, term96857.getClass(), "printingThreads", null);
        setBooleanField(term96857, term96857.getClass(), "printing", false);
        setField(term96857, term96857.getClass(), "containerListener", null);
        setIntField(term96857, term96857.getClass(), "listeningChildren", 0);
        setIntField(term96857, term96857.getClass(), "listeningBoundsChildren", 0);
        setIntField(term96857, term96857.getClass(), "descendantsCount", 0);
        setField(term96857, term96857.getClass(), "preserveBackgroundColor", null);
        setIntField(term96857, term96857.getClass(), "numOfHWComponents", 0);
        setIntField(term96857, term96857.getClass(), "numOfLWComponents", 0);
        setField(term96857, term96857.getClass(), "modalComp", null);
        setField(term96857, term96857.getClass(), "modalAppContext", null);
        setIntField(term96857, term96857.getClass(), "containerSerializedDataVersion", 0);
        setField(term96857, term96857.getClass(), "peer", null);
        setField(term96857, term96857.getClass(), "parent", null);
        setField(term96857, term96857.getClass(), "appContext", null);
        setIntField(term96857, term96857.getClass(), "x", 0);
        setIntField(term96857, term96857.getClass(), "y", 0);
        setIntField(term96857, term96857.getClass(), "width", 0);
        setIntField(term96857, term96857.getClass(), "height", 0);
        setField(term96857, term96857.getClass(), "foreground", null);
        setField(term96857, term96857.getClass(), "background", null);
        setField(term96857, term96857.getClass(), "font", null);
        setField(term96857, term96857.getClass(), "peerFont", null);
        setField(term96857, term96857.getClass(), "cursor", null);
        setField(term96857, term96857.getClass(), "locale", null);
        setField(term96857, term96857.getClass(), "graphicsConfig", null);
        setField(term96857, term96857.getClass(), "bufferStrategy", null);
        setBooleanField(term96857, term96857.getClass(), "ignoreRepaint", false);
        setBooleanField(term96857, term96857.getClass(), "visible", false);
        setBooleanField(term96857, term96857.getClass(), "enabled", false);
        setBooleanField(term96857, term96857.getClass(), "valid", false);
        setField(term96857, term96857.getClass(), "dropTarget", null);
        setField(term96857, term96857.getClass(), "popups", null);
        setField(term96857, term96857.getClass(), "name", null);
        setBooleanField(term96857, term96857.getClass(), "nameExplicitlySet", false);
        setBooleanField(term96857, term96857.getClass(), "focusable", false);
        setIntField(term96857, term96857.getClass(), "isFocusTraversableOverridden", 0);
        setField(term96857, term96857.getClass(), "focusTraversalKeys", null);
        setBooleanField(term96857, term96857.getClass(), "focusTraversalKeysEnabled", false);
        setField(term96857, term96857.getClass(), "acc", null);
        setField(term96857, term96857.getClass(), "minSize", null);
        setBooleanField(term96857, term96857.getClass(), "minSizeSet", false);
        setField(term96857, term96857.getClass(), "prefSize", null);
        setBooleanField(term96857, term96857.getClass(), "prefSizeSet", false);
        setField(term96857, term96857.getClass(), "maxSize", null);
        setBooleanField(term96857, term96857.getClass(), "maxSizeSet", false);
        setField(term96857, term96857.getClass(), "componentOrientation", null);
        setBooleanField(term96857, term96857.getClass(), "newEventsOnly", false);
        setField(term96857, term96857.getClass(), "componentListener", null);
        setField(term96857, term96857.getClass(), "focusListener", null);
        setField(term96857, term96857.getClass(), "hierarchyListener", null);
        setField(term96857, term96857.getClass(), "hierarchyBoundsListener", null);
        setField(term96857, term96857.getClass(), "keyListener", null);
        setField(term96857, term96857.getClass(), "mouseListener", null);
        setField(term96857, term96857.getClass(), "mouseMotionListener", null);
        setField(term96857, term96857.getClass(), "mouseWheelListener", null);
        setField(term96857, term96857.getClass(), "inputMethodListener", null);
        setLongField(term96857, term96857.getClass(), "eventMask", 0L);
        setField(term96857, term96857.getClass(), "changeSupport", null);
        setField(term96857, term96857.getClass(), "objectLock", null);
        setBooleanField(term96857, term96857.getClass(), "isPacked", false);
        setIntField(term96857, term96857.getClass(), "boundsOp", 0);
        setField(term96857, term96857.getClass(), "compoundShape", null);
        setField(term96857, term96857.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term96857, term96857.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term96857, term96857.getClass(), "backgroundEraseDisabled", false);
        setField(term96857, term96857.getClass(), "eventCache", null);
        setBooleanField(term96857, term96857.getClass(), "coalescingEnabled", false);
        setBooleanField(term96857, term96857.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term96857, term96857.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.ModuleHandler$ModuleEditor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "editionListener", argTypes, term96857, args);
    }

};


