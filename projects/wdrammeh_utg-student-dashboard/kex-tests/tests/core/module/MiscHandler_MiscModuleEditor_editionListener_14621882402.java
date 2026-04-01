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
     Object term361122;

    public MiscHandler_MiscModuleEditor_editionListener_14621882402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term361122 = newInstance(Class.forName("core.module.MiscHandler$MiscModuleEditor"));
        setField(term361122, term361122.getClass(), "target", null);
        setField(term361122, term361122.getClass(), "semestersBox", null);
        setField(term361122, term361122.getClass(), "yearField", null);
        setField(term361122, term361122.getClass(), "semesterField", null);
        setField(term361122, term361122.getClass(), "codeField", null);
        setField(term361122, term361122.getClass(), "nameField", null);
        setField(term361122, term361122.getClass(), "roomField", null);
        setField(term361122, term361122.getClass(), "lecturerField", null);
        setField(term361122, term361122.getClass(), "scoreField", null);
        setField(term361122, term361122.getClass(), "dayBox", null);
        setField(term361122, term361122.getClass(), "timeBox", null);
        setField(term361122, term361122.getClass(), "requirementBox", null);
        setField(term361122, term361122.getClass(), "creditBox", null);
        setField(term361122, term361122.getClass(), "campusBox", null);
        setField(term361122, term361122.getClass(), "yearPanel", null);
        setField(term361122, term361122.getClass(), "semesterPanel", null);
        setField(term361122, term361122.getClass(), "yearName", null);
        setField(term361122, term361122.getClass(), "semesterName", null);
        setField(term361122, term361122.getClass(), "actionButton", null);
        setIntField(term361122, term361122.getClass(), "defaultCloseOperation", 0);
        setField(term361122, term361122.getClass(), "rootPane", null);
        setBooleanField(term361122, term361122.getClass(), "rootPaneCheckingEnabled", false);
        setField(term361122, term361122.getClass(), "transferHandler", null);
        setField(term361122, term361122.getClass(), "accessibleContext", null);
        setBooleanField(term361122, term361122.getClass(), "resizable", false);
        setBooleanField(term361122, term361122.getClass(), "undecorated", false);
        setBooleanField(term361122, term361122.getClass(), "initialized", false);
        setBooleanField(term361122, term361122.getClass(), "modal", false);
        setField(term361122, term361122.getClass(), "modalityType", null);
        setField(term361122, term361122.getClass(), "blockedWindows", null);
        setField(term361122, term361122.getClass(), "title", null);
        setField(term361122, term361122.getClass(), "modalFilter", null);
        setField(term361122, term361122.getClass(), "secondaryLoop", null);
        setBooleanField(term361122, term361122.getClass(), "isInHide", false);
        setBooleanField(term361122, term361122.getClass(), "isInDispose", false);
        setField(term361122, term361122.getClass(), "warningString", null);
        setField(term361122, term361122.getClass(), "icons", null);
        setField(term361122, term361122.getClass(), "temporaryLostComponent", null);
        setBooleanField(term361122, term361122.getClass(), "syncLWRequests", false);
        setBooleanField(term361122, term361122.getClass(), "beforeFirstShow", false);
        setBooleanField(term361122, term361122.getClass(), "disposing", false);
        setField(term361122, term361122.getClass(), "disposerRecord", null);
        setIntField(term361122, term361122.getClass(), "state", 0);
        setBooleanField(term361122, term361122.getClass(), "alwaysOnTop", false);
        setField(term361122, term361122.getClass(), "ownedWindowList", null);
        setField(term361122, term361122.getClass(), "weakThis", null);
        setBooleanField(term361122, term361122.getClass(), "showWithParent", false);
        setField(term361122, term361122.getClass(), "modalBlocker", null);
        setField(term361122, term361122.getClass(), "modalExclusionType", null);
        setField(term361122, term361122.getClass(), "windowListener", null);
        setField(term361122, term361122.getClass(), "windowStateListener", null);
        setField(term361122, term361122.getClass(), "windowFocusListener", null);
        setField(term361122, term361122.getClass(), "inputContext", null);
        setField(term361122, term361122.getClass(), "inputContextLock", null);
        setField(term361122, term361122.getClass(), "focusMgr", null);
        setBooleanField(term361122, term361122.getClass(), "focusableWindowState", false);
        setBooleanField(term361122, term361122.getClass(), "autoRequestFocus", false);
        setBooleanField(term361122, term361122.getClass(), "isInShow", false);
        setFloatField(term361122, term361122.getClass(), "opacity", 0.0F);
        setField(term361122, term361122.getClass(), "shape", null);
        setBooleanField(term361122, term361122.getClass(), "isTrayIconWindow", false);
        setIntField(term361122, term361122.getClass(), "securityWarningWidth", 0);
        setIntField(term361122, term361122.getClass(), "securityWarningHeight", 0);
        setDoubleField(term361122, term361122.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term361122, term361122.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term361122, term361122.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term361122, term361122.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term361122, term361122.getClass(), "anchor", null);
        setField(term361122, term361122.getClass(), "type", null);
        setIntField(term361122, term361122.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term361122, term361122.getClass(), "locationByPlatform", false);
        setField(term361122, term361122.getClass(), "component", null);
        setField(term361122, term361122.getClass(), "layoutMgr", null);
        setField(term361122, term361122.getClass(), "dispatcher", null);
        setField(term361122, term361122.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term361122, term361122.getClass(), "focusCycleRoot", false);
        setBooleanField(term361122, term361122.getClass(), "focusTraversalPolicyProvider", false);
        setField(term361122, term361122.getClass(), "printingThreads", null);
        setBooleanField(term361122, term361122.getClass(), "printing", false);
        setField(term361122, term361122.getClass(), "containerListener", null);
        setIntField(term361122, term361122.getClass(), "listeningChildren", 0);
        setIntField(term361122, term361122.getClass(), "listeningBoundsChildren", 0);
        setIntField(term361122, term361122.getClass(), "descendantsCount", 0);
        setField(term361122, term361122.getClass(), "preserveBackgroundColor", null);
        setIntField(term361122, term361122.getClass(), "numOfHWComponents", 0);
        setIntField(term361122, term361122.getClass(), "numOfLWComponents", 0);
        setField(term361122, term361122.getClass(), "modalComp", null);
        setField(term361122, term361122.getClass(), "modalAppContext", null);
        setIntField(term361122, term361122.getClass(), "containerSerializedDataVersion", 0);
        setField(term361122, term361122.getClass(), "peer", null);
        setField(term361122, term361122.getClass(), "parent", null);
        setField(term361122, term361122.getClass(), "appContext", null);
        setIntField(term361122, term361122.getClass(), "x", 0);
        setIntField(term361122, term361122.getClass(), "y", 0);
        setIntField(term361122, term361122.getClass(), "width", 0);
        setIntField(term361122, term361122.getClass(), "height", 0);
        setField(term361122, term361122.getClass(), "foreground", null);
        setField(term361122, term361122.getClass(), "background", null);
        setField(term361122, term361122.getClass(), "font", null);
        setField(term361122, term361122.getClass(), "peerFont", null);
        setField(term361122, term361122.getClass(), "cursor", null);
        setField(term361122, term361122.getClass(), "locale", null);
        setField(term361122, term361122.getClass(), "graphicsConfig", null);
        setField(term361122, term361122.getClass(), "bufferStrategy", null);
        setBooleanField(term361122, term361122.getClass(), "ignoreRepaint", false);
        setBooleanField(term361122, term361122.getClass(), "visible", false);
        setBooleanField(term361122, term361122.getClass(), "enabled", false);
        setBooleanField(term361122, term361122.getClass(), "valid", false);
        setField(term361122, term361122.getClass(), "dropTarget", null);
        setField(term361122, term361122.getClass(), "popups", null);
        setField(term361122, term361122.getClass(), "name", null);
        setBooleanField(term361122, term361122.getClass(), "nameExplicitlySet", false);
        setBooleanField(term361122, term361122.getClass(), "focusable", false);
        setIntField(term361122, term361122.getClass(), "isFocusTraversableOverridden", 0);
        setField(term361122, term361122.getClass(), "focusTraversalKeys", null);
        setBooleanField(term361122, term361122.getClass(), "focusTraversalKeysEnabled", false);
        setField(term361122, term361122.getClass(), "acc", null);
        setField(term361122, term361122.getClass(), "minSize", null);
        setBooleanField(term361122, term361122.getClass(), "minSizeSet", false);
        setField(term361122, term361122.getClass(), "prefSize", null);
        setBooleanField(term361122, term361122.getClass(), "prefSizeSet", false);
        setField(term361122, term361122.getClass(), "maxSize", null);
        setBooleanField(term361122, term361122.getClass(), "maxSizeSet", false);
        setField(term361122, term361122.getClass(), "componentOrientation", null);
        setBooleanField(term361122, term361122.getClass(), "newEventsOnly", false);
        setField(term361122, term361122.getClass(), "componentListener", null);
        setField(term361122, term361122.getClass(), "focusListener", null);
        setField(term361122, term361122.getClass(), "hierarchyListener", null);
        setField(term361122, term361122.getClass(), "hierarchyBoundsListener", null);
        setField(term361122, term361122.getClass(), "keyListener", null);
        setField(term361122, term361122.getClass(), "mouseListener", null);
        setField(term361122, term361122.getClass(), "mouseMotionListener", null);
        setField(term361122, term361122.getClass(), "mouseWheelListener", null);
        setField(term361122, term361122.getClass(), "inputMethodListener", null);
        setLongField(term361122, term361122.getClass(), "eventMask", 0L);
        setField(term361122, term361122.getClass(), "changeSupport", null);
        setField(term361122, term361122.getClass(), "objectLock", null);
        setBooleanField(term361122, term361122.getClass(), "isPacked", false);
        setIntField(term361122, term361122.getClass(), "boundsOp", 0);
        setField(term361122, term361122.getClass(), "compoundShape", null);
        setField(term361122, term361122.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term361122, term361122.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term361122, term361122.getClass(), "backgroundEraseDisabled", false);
        setField(term361122, term361122.getClass(), "eventCache", null);
        setBooleanField(term361122, term361122.getClass(), "coalescingEnabled", false);
        setBooleanField(term361122, term361122.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term361122, term361122.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.MiscHandler$MiscModuleEditor");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "editionListener", argTypes, term361122, args);
    }

};


