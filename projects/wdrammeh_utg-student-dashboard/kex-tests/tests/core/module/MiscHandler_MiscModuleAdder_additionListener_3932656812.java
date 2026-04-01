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
     Object term219872;

    public MiscHandler_MiscModuleAdder_additionListener_3932656812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219872 = newInstance(Class.forName("core.module.MiscHandler$MiscModuleAdder"));
        setField(term219872, term219872.getClass(), "semestersBox", null);
        setField(term219872, term219872.getClass(), "yearField", null);
        setField(term219872, term219872.getClass(), "semesterField", null);
        setField(term219872, term219872.getClass(), "codeField", null);
        setField(term219872, term219872.getClass(), "nameField", null);
        setField(term219872, term219872.getClass(), "roomField", null);
        setField(term219872, term219872.getClass(), "lecturerField", null);
        setField(term219872, term219872.getClass(), "scoreField", null);
        setField(term219872, term219872.getClass(), "dayBox", null);
        setField(term219872, term219872.getClass(), "timeBox", null);
        setField(term219872, term219872.getClass(), "requirementBox", null);
        setField(term219872, term219872.getClass(), "creditBox", null);
        setField(term219872, term219872.getClass(), "campusBox", null);
        setField(term219872, term219872.getClass(), "yearPanel", null);
        setField(term219872, term219872.getClass(), "semesterPanel", null);
        setField(term219872, term219872.getClass(), "yearName", null);
        setField(term219872, term219872.getClass(), "semesterName", null);
        setField(term219872, term219872.getClass(), "actionButton", null);
        setIntField(term219872, term219872.getClass(), "defaultCloseOperation", 0);
        setField(term219872, term219872.getClass(), "rootPane", null);
        setBooleanField(term219872, term219872.getClass(), "rootPaneCheckingEnabled", false);
        setField(term219872, term219872.getClass(), "transferHandler", null);
        setField(term219872, term219872.getClass(), "accessibleContext", null);
        setBooleanField(term219872, term219872.getClass(), "resizable", false);
        setBooleanField(term219872, term219872.getClass(), "undecorated", false);
        setBooleanField(term219872, term219872.getClass(), "initialized", false);
        setBooleanField(term219872, term219872.getClass(), "modal", false);
        setField(term219872, term219872.getClass(), "modalityType", null);
        setField(term219872, term219872.getClass(), "blockedWindows", null);
        setField(term219872, term219872.getClass(), "title", null);
        setField(term219872, term219872.getClass(), "modalFilter", null);
        setField(term219872, term219872.getClass(), "secondaryLoop", null);
        setBooleanField(term219872, term219872.getClass(), "isInHide", false);
        setBooleanField(term219872, term219872.getClass(), "isInDispose", false);
        setField(term219872, term219872.getClass(), "warningString", null);
        setField(term219872, term219872.getClass(), "icons", null);
        setField(term219872, term219872.getClass(), "temporaryLostComponent", null);
        setBooleanField(term219872, term219872.getClass(), "syncLWRequests", false);
        setBooleanField(term219872, term219872.getClass(), "beforeFirstShow", false);
        setBooleanField(term219872, term219872.getClass(), "disposing", false);
        setField(term219872, term219872.getClass(), "disposerRecord", null);
        setIntField(term219872, term219872.getClass(), "state", 0);
        setBooleanField(term219872, term219872.getClass(), "alwaysOnTop", false);
        setField(term219872, term219872.getClass(), "ownedWindowList", null);
        setField(term219872, term219872.getClass(), "weakThis", null);
        setBooleanField(term219872, term219872.getClass(), "showWithParent", false);
        setField(term219872, term219872.getClass(), "modalBlocker", null);
        setField(term219872, term219872.getClass(), "modalExclusionType", null);
        setField(term219872, term219872.getClass(), "windowListener", null);
        setField(term219872, term219872.getClass(), "windowStateListener", null);
        setField(term219872, term219872.getClass(), "windowFocusListener", null);
        setField(term219872, term219872.getClass(), "inputContext", null);
        setField(term219872, term219872.getClass(), "inputContextLock", null);
        setField(term219872, term219872.getClass(), "focusMgr", null);
        setBooleanField(term219872, term219872.getClass(), "focusableWindowState", false);
        setBooleanField(term219872, term219872.getClass(), "autoRequestFocus", false);
        setBooleanField(term219872, term219872.getClass(), "isInShow", false);
        setFloatField(term219872, term219872.getClass(), "opacity", 0.0F);
        setField(term219872, term219872.getClass(), "shape", null);
        setBooleanField(term219872, term219872.getClass(), "isTrayIconWindow", false);
        setIntField(term219872, term219872.getClass(), "securityWarningWidth", 0);
        setIntField(term219872, term219872.getClass(), "securityWarningHeight", 0);
        setDoubleField(term219872, term219872.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term219872, term219872.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term219872, term219872.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term219872, term219872.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term219872, term219872.getClass(), "anchor", null);
        setField(term219872, term219872.getClass(), "type", null);
        setIntField(term219872, term219872.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term219872, term219872.getClass(), "locationByPlatform", false);
        setField(term219872, term219872.getClass(), "component", null);
        setField(term219872, term219872.getClass(), "layoutMgr", null);
        setField(term219872, term219872.getClass(), "dispatcher", null);
        setField(term219872, term219872.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term219872, term219872.getClass(), "focusCycleRoot", false);
        setBooleanField(term219872, term219872.getClass(), "focusTraversalPolicyProvider", false);
        setField(term219872, term219872.getClass(), "printingThreads", null);
        setBooleanField(term219872, term219872.getClass(), "printing", false);
        setField(term219872, term219872.getClass(), "containerListener", null);
        setIntField(term219872, term219872.getClass(), "listeningChildren", 0);
        setIntField(term219872, term219872.getClass(), "listeningBoundsChildren", 0);
        setIntField(term219872, term219872.getClass(), "descendantsCount", 0);
        setField(term219872, term219872.getClass(), "preserveBackgroundColor", null);
        setIntField(term219872, term219872.getClass(), "numOfHWComponents", 0);
        setIntField(term219872, term219872.getClass(), "numOfLWComponents", 0);
        setField(term219872, term219872.getClass(), "modalComp", null);
        setField(term219872, term219872.getClass(), "modalAppContext", null);
        setIntField(term219872, term219872.getClass(), "containerSerializedDataVersion", 0);
        setField(term219872, term219872.getClass(), "peer", null);
        setField(term219872, term219872.getClass(), "parent", null);
        setField(term219872, term219872.getClass(), "appContext", null);
        setIntField(term219872, term219872.getClass(), "x", 0);
        setIntField(term219872, term219872.getClass(), "y", 0);
        setIntField(term219872, term219872.getClass(), "width", 0);
        setIntField(term219872, term219872.getClass(), "height", 0);
        setField(term219872, term219872.getClass(), "foreground", null);
        setField(term219872, term219872.getClass(), "background", null);
        setField(term219872, term219872.getClass(), "font", null);
        setField(term219872, term219872.getClass(), "peerFont", null);
        setField(term219872, term219872.getClass(), "cursor", null);
        setField(term219872, term219872.getClass(), "locale", null);
        setField(term219872, term219872.getClass(), "graphicsConfig", null);
        setField(term219872, term219872.getClass(), "bufferStrategy", null);
        setBooleanField(term219872, term219872.getClass(), "ignoreRepaint", false);
        setBooleanField(term219872, term219872.getClass(), "visible", false);
        setBooleanField(term219872, term219872.getClass(), "enabled", false);
        setBooleanField(term219872, term219872.getClass(), "valid", false);
        setField(term219872, term219872.getClass(), "dropTarget", null);
        setField(term219872, term219872.getClass(), "popups", null);
        setField(term219872, term219872.getClass(), "name", null);
        setBooleanField(term219872, term219872.getClass(), "nameExplicitlySet", false);
        setBooleanField(term219872, term219872.getClass(), "focusable", false);
        setIntField(term219872, term219872.getClass(), "isFocusTraversableOverridden", 0);
        setField(term219872, term219872.getClass(), "focusTraversalKeys", null);
        setBooleanField(term219872, term219872.getClass(), "focusTraversalKeysEnabled", false);
        setField(term219872, term219872.getClass(), "acc", null);
        setField(term219872, term219872.getClass(), "minSize", null);
        setBooleanField(term219872, term219872.getClass(), "minSizeSet", false);
        setField(term219872, term219872.getClass(), "prefSize", null);
        setBooleanField(term219872, term219872.getClass(), "prefSizeSet", false);
        setField(term219872, term219872.getClass(), "maxSize", null);
        setBooleanField(term219872, term219872.getClass(), "maxSizeSet", false);
        setField(term219872, term219872.getClass(), "componentOrientation", null);
        setBooleanField(term219872, term219872.getClass(), "newEventsOnly", false);
        setField(term219872, term219872.getClass(), "componentListener", null);
        setField(term219872, term219872.getClass(), "focusListener", null);
        setField(term219872, term219872.getClass(), "hierarchyListener", null);
        setField(term219872, term219872.getClass(), "hierarchyBoundsListener", null);
        setField(term219872, term219872.getClass(), "keyListener", null);
        setField(term219872, term219872.getClass(), "mouseListener", null);
        setField(term219872, term219872.getClass(), "mouseMotionListener", null);
        setField(term219872, term219872.getClass(), "mouseWheelListener", null);
        setField(term219872, term219872.getClass(), "inputMethodListener", null);
        setLongField(term219872, term219872.getClass(), "eventMask", 0L);
        setField(term219872, term219872.getClass(), "changeSupport", null);
        setField(term219872, term219872.getClass(), "objectLock", null);
        setBooleanField(term219872, term219872.getClass(), "isPacked", false);
        setIntField(term219872, term219872.getClass(), "boundsOp", 0);
        setField(term219872, term219872.getClass(), "compoundShape", null);
        setField(term219872, term219872.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term219872, term219872.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term219872, term219872.getClass(), "backgroundEraseDisabled", false);
        setField(term219872, term219872.getClass(), "eventCache", null);
        setBooleanField(term219872, term219872.getClass(), "coalescingEnabled", false);
        setBooleanField(term219872, term219872.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term219872, term219872.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.MiscHandler$MiscModuleAdder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "additionListener", argTypes, term219872, args);
    }

};


