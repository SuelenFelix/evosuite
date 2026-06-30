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

public class MiscHandler_MiscModuleAdder_additionListener_3932656812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64878;

    public MiscHandler_MiscModuleAdder_additionListener_3932656812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64878 = newInstance(Class.forName("core.module.MiscHandler$MiscModuleAdder"));
        setField(term64878, term64878.getClass(), "semestersBox", null);
        setField(term64878, term64878.getClass(), "yearField", null);
        setField(term64878, term64878.getClass(), "semesterField", null);
        setField(term64878, term64878.getClass(), "codeField", null);
        setField(term64878, term64878.getClass(), "nameField", null);
        setField(term64878, term64878.getClass(), "roomField", null);
        setField(term64878, term64878.getClass(), "lecturerField", null);
        setField(term64878, term64878.getClass(), "scoreField", null);
        setField(term64878, term64878.getClass(), "dayBox", null);
        setField(term64878, term64878.getClass(), "timeBox", null);
        setField(term64878, term64878.getClass(), "requirementBox", null);
        setField(term64878, term64878.getClass(), "creditBox", null);
        setField(term64878, term64878.getClass(), "campusBox", null);
        setField(term64878, term64878.getClass(), "yearPanel", null);
        setField(term64878, term64878.getClass(), "semesterPanel", null);
        setField(term64878, term64878.getClass(), "yearName", null);
        setField(term64878, term64878.getClass(), "semesterName", null);
        setField(term64878, term64878.getClass(), "actionButton", null);
        setIntField(term64878, term64878.getClass(), "defaultCloseOperation", 0);
        setField(term64878, term64878.getClass(), "rootPane", null);
        setBooleanField(term64878, term64878.getClass(), "rootPaneCheckingEnabled", false);
        setField(term64878, term64878.getClass(), "transferHandler", null);
        setField(term64878, term64878.getClass(), "accessibleContext", null);
        setBooleanField(term64878, term64878.getClass(), "resizable", false);
        setBooleanField(term64878, term64878.getClass(), "undecorated", false);
        setBooleanField(term64878, term64878.getClass(), "initialized", false);
        setBooleanField(term64878, term64878.getClass(), "modal", false);
        setField(term64878, term64878.getClass(), "modalityType", null);
        setField(term64878, term64878.getClass(), "blockedWindows", null);
        setField(term64878, term64878.getClass(), "title", null);
        setField(term64878, term64878.getClass(), "modalFilter", null);
        setField(term64878, term64878.getClass(), "secondaryLoop", null);
        setBooleanField(term64878, term64878.getClass(), "isInHide", false);
        setBooleanField(term64878, term64878.getClass(), "isInDispose", false);
        setField(term64878, term64878.getClass(), "warningString", null);
        setField(term64878, term64878.getClass(), "icons", null);
        setField(term64878, term64878.getClass(), "temporaryLostComponent", null);
        setBooleanField(term64878, term64878.getClass(), "syncLWRequests", false);
        setBooleanField(term64878, term64878.getClass(), "beforeFirstShow", false);
        setBooleanField(term64878, term64878.getClass(), "disposing", false);
        setField(term64878, term64878.getClass(), "disposerRecord", null);
        setIntField(term64878, term64878.getClass(), "state", 0);
        setBooleanField(term64878, term64878.getClass(), "alwaysOnTop", false);
        setField(term64878, term64878.getClass(), "ownedWindowList", null);
        setField(term64878, term64878.getClass(), "weakThis", null);
        setBooleanField(term64878, term64878.getClass(), "showWithParent", false);
        setField(term64878, term64878.getClass(), "modalBlocker", null);
        setField(term64878, term64878.getClass(), "modalExclusionType", null);
        setField(term64878, term64878.getClass(), "windowListener", null);
        setField(term64878, term64878.getClass(), "windowStateListener", null);
        setField(term64878, term64878.getClass(), "windowFocusListener", null);
        setField(term64878, term64878.getClass(), "inputContext", null);
        setField(term64878, term64878.getClass(), "inputContextLock", null);
        setField(term64878, term64878.getClass(), "focusMgr", null);
        setBooleanField(term64878, term64878.getClass(), "focusableWindowState", false);
        setBooleanField(term64878, term64878.getClass(), "autoRequestFocus", false);
        setBooleanField(term64878, term64878.getClass(), "isInShow", false);
        setFloatField(term64878, term64878.getClass(), "opacity", 0.0F);
        setField(term64878, term64878.getClass(), "shape", null);
        setBooleanField(term64878, term64878.getClass(), "isTrayIconWindow", false);
        setIntField(term64878, term64878.getClass(), "securityWarningWidth", 0);
        setIntField(term64878, term64878.getClass(), "securityWarningHeight", 0);
        setDoubleField(term64878, term64878.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term64878, term64878.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term64878, term64878.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term64878, term64878.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term64878, term64878.getClass(), "anchor", null);
        setField(term64878, term64878.getClass(), "type", null);
        setIntField(term64878, term64878.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term64878, term64878.getClass(), "locationByPlatform", false);
        setField(term64878, term64878.getClass(), "component", null);
        setField(term64878, term64878.getClass(), "layoutMgr", null);
        setField(term64878, term64878.getClass(), "dispatcher", null);
        setField(term64878, term64878.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term64878, term64878.getClass(), "focusCycleRoot", false);
        setBooleanField(term64878, term64878.getClass(), "focusTraversalPolicyProvider", false);
        setField(term64878, term64878.getClass(), "printingThreads", null);
        setBooleanField(term64878, term64878.getClass(), "printing", false);
        setField(term64878, term64878.getClass(), "containerListener", null);
        setIntField(term64878, term64878.getClass(), "listeningChildren", 0);
        setIntField(term64878, term64878.getClass(), "listeningBoundsChildren", 0);
        setIntField(term64878, term64878.getClass(), "descendantsCount", 0);
        setField(term64878, term64878.getClass(), "preserveBackgroundColor", null);
        setIntField(term64878, term64878.getClass(), "numOfHWComponents", 0);
        setIntField(term64878, term64878.getClass(), "numOfLWComponents", 0);
        setField(term64878, term64878.getClass(), "modalComp", null);
        setField(term64878, term64878.getClass(), "modalAppContext", null);
        setIntField(term64878, term64878.getClass(), "containerSerializedDataVersion", 0);
        setField(term64878, term64878.getClass(), "peer", null);
        setField(term64878, term64878.getClass(), "parent", null);
        setField(term64878, term64878.getClass(), "appContext", null);
        setIntField(term64878, term64878.getClass(), "x", 0);
        setIntField(term64878, term64878.getClass(), "y", 0);
        setIntField(term64878, term64878.getClass(), "width", 0);
        setIntField(term64878, term64878.getClass(), "height", 0);
        setField(term64878, term64878.getClass(), "foreground", null);
        setField(term64878, term64878.getClass(), "background", null);
        setField(term64878, term64878.getClass(), "font", null);
        setField(term64878, term64878.getClass(), "peerFont", null);
        setField(term64878, term64878.getClass(), "cursor", null);
        setField(term64878, term64878.getClass(), "locale", null);
        setField(term64878, term64878.getClass(), "graphicsConfig", null);
        setField(term64878, term64878.getClass(), "bufferStrategy", null);
        setBooleanField(term64878, term64878.getClass(), "ignoreRepaint", false);
        setBooleanField(term64878, term64878.getClass(), "visible", false);
        setBooleanField(term64878, term64878.getClass(), "enabled", false);
        setBooleanField(term64878, term64878.getClass(), "valid", false);
        setField(term64878, term64878.getClass(), "dropTarget", null);
        setField(term64878, term64878.getClass(), "popups", null);
        setField(term64878, term64878.getClass(), "name", null);
        setBooleanField(term64878, term64878.getClass(), "nameExplicitlySet", false);
        setBooleanField(term64878, term64878.getClass(), "focusable", false);
        setIntField(term64878, term64878.getClass(), "isFocusTraversableOverridden", 0);
        setField(term64878, term64878.getClass(), "focusTraversalKeys", null);
        setBooleanField(term64878, term64878.getClass(), "focusTraversalKeysEnabled", false);
        setField(term64878, term64878.getClass(), "acc", null);
        setField(term64878, term64878.getClass(), "minSize", null);
        setBooleanField(term64878, term64878.getClass(), "minSizeSet", false);
        setField(term64878, term64878.getClass(), "prefSize", null);
        setBooleanField(term64878, term64878.getClass(), "prefSizeSet", false);
        setField(term64878, term64878.getClass(), "maxSize", null);
        setBooleanField(term64878, term64878.getClass(), "maxSizeSet", false);
        setField(term64878, term64878.getClass(), "componentOrientation", null);
        setBooleanField(term64878, term64878.getClass(), "newEventsOnly", false);
        setField(term64878, term64878.getClass(), "componentListener", null);
        setField(term64878, term64878.getClass(), "focusListener", null);
        setField(term64878, term64878.getClass(), "hierarchyListener", null);
        setField(term64878, term64878.getClass(), "hierarchyBoundsListener", null);
        setField(term64878, term64878.getClass(), "keyListener", null);
        setField(term64878, term64878.getClass(), "mouseListener", null);
        setField(term64878, term64878.getClass(), "mouseMotionListener", null);
        setField(term64878, term64878.getClass(), "mouseWheelListener", null);
        setField(term64878, term64878.getClass(), "inputMethodListener", null);
        setLongField(term64878, term64878.getClass(), "eventMask", 0L);
        setField(term64878, term64878.getClass(), "changeSupport", null);
        setField(term64878, term64878.getClass(), "objectLock", null);
        setBooleanField(term64878, term64878.getClass(), "isPacked", false);
        setIntField(term64878, term64878.getClass(), "boundsOp", 0);
        setField(term64878, term64878.getClass(), "compoundShape", null);
        setField(term64878, term64878.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term64878, term64878.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term64878, term64878.getClass(), "backgroundEraseDisabled", false);
        setField(term64878, term64878.getClass(), "eventCache", null);
        setBooleanField(term64878, term64878.getClass(), "coalescingEnabled", false);
        setBooleanField(term64878, term64878.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term64878, term64878.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.MiscHandler$MiscModuleAdder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "additionListener", argTypes, term64878, args);
    }

};


