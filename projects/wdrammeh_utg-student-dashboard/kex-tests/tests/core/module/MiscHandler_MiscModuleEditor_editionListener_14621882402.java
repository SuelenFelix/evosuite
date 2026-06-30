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

public class MiscHandler_MiscModuleEditor_editionListener_14621882402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124920;

    public MiscHandler_MiscModuleEditor_editionListener_14621882402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124920 = newInstance(Class.forName("core.module.MiscHandler$MiscModuleEditor"));
        setField(term124920, term124920.getClass(), "target", null);
        setField(term124920, term124920.getClass(), "semestersBox", null);
        setField(term124920, term124920.getClass(), "yearField", null);
        setField(term124920, term124920.getClass(), "semesterField", null);
        setField(term124920, term124920.getClass(), "codeField", null);
        setField(term124920, term124920.getClass(), "nameField", null);
        setField(term124920, term124920.getClass(), "roomField", null);
        setField(term124920, term124920.getClass(), "lecturerField", null);
        setField(term124920, term124920.getClass(), "scoreField", null);
        setField(term124920, term124920.getClass(), "dayBox", null);
        setField(term124920, term124920.getClass(), "timeBox", null);
        setField(term124920, term124920.getClass(), "requirementBox", null);
        setField(term124920, term124920.getClass(), "creditBox", null);
        setField(term124920, term124920.getClass(), "campusBox", null);
        setField(term124920, term124920.getClass(), "yearPanel", null);
        setField(term124920, term124920.getClass(), "semesterPanel", null);
        setField(term124920, term124920.getClass(), "yearName", null);
        setField(term124920, term124920.getClass(), "semesterName", null);
        setField(term124920, term124920.getClass(), "actionButton", null);
        setIntField(term124920, term124920.getClass(), "defaultCloseOperation", 0);
        setField(term124920, term124920.getClass(), "rootPane", null);
        setBooleanField(term124920, term124920.getClass(), "rootPaneCheckingEnabled", false);
        setField(term124920, term124920.getClass(), "transferHandler", null);
        setField(term124920, term124920.getClass(), "accessibleContext", null);
        setBooleanField(term124920, term124920.getClass(), "resizable", false);
        setBooleanField(term124920, term124920.getClass(), "undecorated", false);
        setBooleanField(term124920, term124920.getClass(), "initialized", false);
        setBooleanField(term124920, term124920.getClass(), "modal", false);
        setField(term124920, term124920.getClass(), "modalityType", null);
        setField(term124920, term124920.getClass(), "blockedWindows", null);
        setField(term124920, term124920.getClass(), "title", null);
        setField(term124920, term124920.getClass(), "modalFilter", null);
        setField(term124920, term124920.getClass(), "secondaryLoop", null);
        setBooleanField(term124920, term124920.getClass(), "isInHide", false);
        setBooleanField(term124920, term124920.getClass(), "isInDispose", false);
        setField(term124920, term124920.getClass(), "warningString", null);
        setField(term124920, term124920.getClass(), "icons", null);
        setField(term124920, term124920.getClass(), "temporaryLostComponent", null);
        setBooleanField(term124920, term124920.getClass(), "syncLWRequests", false);
        setBooleanField(term124920, term124920.getClass(), "beforeFirstShow", false);
        setBooleanField(term124920, term124920.getClass(), "disposing", false);
        setField(term124920, term124920.getClass(), "disposerRecord", null);
        setIntField(term124920, term124920.getClass(), "state", 0);
        setBooleanField(term124920, term124920.getClass(), "alwaysOnTop", false);
        setField(term124920, term124920.getClass(), "ownedWindowList", null);
        setField(term124920, term124920.getClass(), "weakThis", null);
        setBooleanField(term124920, term124920.getClass(), "showWithParent", false);
        setField(term124920, term124920.getClass(), "modalBlocker", null);
        setField(term124920, term124920.getClass(), "modalExclusionType", null);
        setField(term124920, term124920.getClass(), "windowListener", null);
        setField(term124920, term124920.getClass(), "windowStateListener", null);
        setField(term124920, term124920.getClass(), "windowFocusListener", null);
        setField(term124920, term124920.getClass(), "inputContext", null);
        setField(term124920, term124920.getClass(), "inputContextLock", null);
        setField(term124920, term124920.getClass(), "focusMgr", null);
        setBooleanField(term124920, term124920.getClass(), "focusableWindowState", false);
        setBooleanField(term124920, term124920.getClass(), "autoRequestFocus", false);
        setBooleanField(term124920, term124920.getClass(), "isInShow", false);
        setFloatField(term124920, term124920.getClass(), "opacity", 0.0F);
        setField(term124920, term124920.getClass(), "shape", null);
        setBooleanField(term124920, term124920.getClass(), "isTrayIconWindow", false);
        setIntField(term124920, term124920.getClass(), "securityWarningWidth", 0);
        setIntField(term124920, term124920.getClass(), "securityWarningHeight", 0);
        setDoubleField(term124920, term124920.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term124920, term124920.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term124920, term124920.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term124920, term124920.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term124920, term124920.getClass(), "anchor", null);
        setField(term124920, term124920.getClass(), "type", null);
        setIntField(term124920, term124920.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term124920, term124920.getClass(), "locationByPlatform", false);
        setField(term124920, term124920.getClass(), "component", null);
        setField(term124920, term124920.getClass(), "layoutMgr", null);
        setField(term124920, term124920.getClass(), "dispatcher", null);
        setField(term124920, term124920.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term124920, term124920.getClass(), "focusCycleRoot", false);
        setBooleanField(term124920, term124920.getClass(), "focusTraversalPolicyProvider", false);
        setField(term124920, term124920.getClass(), "printingThreads", null);
        setBooleanField(term124920, term124920.getClass(), "printing", false);
        setField(term124920, term124920.getClass(), "containerListener", null);
        setIntField(term124920, term124920.getClass(), "listeningChildren", 0);
        setIntField(term124920, term124920.getClass(), "listeningBoundsChildren", 0);
        setIntField(term124920, term124920.getClass(), "descendantsCount", 0);
        setField(term124920, term124920.getClass(), "preserveBackgroundColor", null);
        setIntField(term124920, term124920.getClass(), "numOfHWComponents", 0);
        setIntField(term124920, term124920.getClass(), "numOfLWComponents", 0);
        setField(term124920, term124920.getClass(), "modalComp", null);
        setField(term124920, term124920.getClass(), "modalAppContext", null);
        setIntField(term124920, term124920.getClass(), "containerSerializedDataVersion", 0);
        setField(term124920, term124920.getClass(), "peer", null);
        setField(term124920, term124920.getClass(), "parent", null);
        setField(term124920, term124920.getClass(), "appContext", null);
        setIntField(term124920, term124920.getClass(), "x", 0);
        setIntField(term124920, term124920.getClass(), "y", 0);
        setIntField(term124920, term124920.getClass(), "width", 0);
        setIntField(term124920, term124920.getClass(), "height", 0);
        setField(term124920, term124920.getClass(), "foreground", null);
        setField(term124920, term124920.getClass(), "background", null);
        setField(term124920, term124920.getClass(), "font", null);
        setField(term124920, term124920.getClass(), "peerFont", null);
        setField(term124920, term124920.getClass(), "cursor", null);
        setField(term124920, term124920.getClass(), "locale", null);
        setField(term124920, term124920.getClass(), "graphicsConfig", null);
        setField(term124920, term124920.getClass(), "bufferStrategy", null);
        setBooleanField(term124920, term124920.getClass(), "ignoreRepaint", false);
        setBooleanField(term124920, term124920.getClass(), "visible", false);
        setBooleanField(term124920, term124920.getClass(), "enabled", false);
        setBooleanField(term124920, term124920.getClass(), "valid", false);
        setField(term124920, term124920.getClass(), "dropTarget", null);
        setField(term124920, term124920.getClass(), "popups", null);
        setField(term124920, term124920.getClass(), "name", null);
        setBooleanField(term124920, term124920.getClass(), "nameExplicitlySet", false);
        setBooleanField(term124920, term124920.getClass(), "focusable", false);
        setIntField(term124920, term124920.getClass(), "isFocusTraversableOverridden", 0);
        setField(term124920, term124920.getClass(), "focusTraversalKeys", null);
        setBooleanField(term124920, term124920.getClass(), "focusTraversalKeysEnabled", false);
        setField(term124920, term124920.getClass(), "acc", null);
        setField(term124920, term124920.getClass(), "minSize", null);
        setBooleanField(term124920, term124920.getClass(), "minSizeSet", false);
        setField(term124920, term124920.getClass(), "prefSize", null);
        setBooleanField(term124920, term124920.getClass(), "prefSizeSet", false);
        setField(term124920, term124920.getClass(), "maxSize", null);
        setBooleanField(term124920, term124920.getClass(), "maxSizeSet", false);
        setField(term124920, term124920.getClass(), "componentOrientation", null);
        setBooleanField(term124920, term124920.getClass(), "newEventsOnly", false);
        setField(term124920, term124920.getClass(), "componentListener", null);
        setField(term124920, term124920.getClass(), "focusListener", null);
        setField(term124920, term124920.getClass(), "hierarchyListener", null);
        setField(term124920, term124920.getClass(), "hierarchyBoundsListener", null);
        setField(term124920, term124920.getClass(), "keyListener", null);
        setField(term124920, term124920.getClass(), "mouseListener", null);
        setField(term124920, term124920.getClass(), "mouseMotionListener", null);
        setField(term124920, term124920.getClass(), "mouseWheelListener", null);
        setField(term124920, term124920.getClass(), "inputMethodListener", null);
        setLongField(term124920, term124920.getClass(), "eventMask", 0L);
        setField(term124920, term124920.getClass(), "changeSupport", null);
        setField(term124920, term124920.getClass(), "objectLock", null);
        setBooleanField(term124920, term124920.getClass(), "isPacked", false);
        setIntField(term124920, term124920.getClass(), "boundsOp", 0);
        setField(term124920, term124920.getClass(), "compoundShape", null);
        setField(term124920, term124920.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term124920, term124920.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term124920, term124920.getClass(), "backgroundEraseDisabled", false);
        setField(term124920, term124920.getClass(), "eventCache", null);
        setBooleanField(term124920, term124920.getClass(), "coalescingEnabled", false);
        setBooleanField(term124920, term124920.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term124920, term124920.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.MiscHandler$MiscModuleEditor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "editionListener", argTypes, term124920, args);
    }

};


