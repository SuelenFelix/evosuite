package core.task.exhibition;

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
import static core.task.exhibition.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TodoExhibition_newHintLabel_519895984 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6951;

    public TodoExhibition_newHintLabel_519895984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6951 = newInstance(Class.forName("core.task.exhibition.TodoExhibition"));
        setIntField(term6951, term6951.getClass(), "defaultCloseOperation", 0);
        setField(term6951, term6951.getClass(), "rootPane", null);
        setBooleanField(term6951, term6951.getClass(), "rootPaneCheckingEnabled", false);
        setField(term6951, term6951.getClass(), "transferHandler", null);
        setField(term6951, term6951.getClass(), "accessibleContext", null);
        setBooleanField(term6951, term6951.getClass(), "resizable", false);
        setBooleanField(term6951, term6951.getClass(), "undecorated", false);
        setBooleanField(term6951, term6951.getClass(), "initialized", false);
        setBooleanField(term6951, term6951.getClass(), "modal", false);
        setField(term6951, term6951.getClass(), "modalityType", null);
        setField(term6951, term6951.getClass(), "blockedWindows", null);
        setField(term6951, term6951.getClass(), "title", null);
        setField(term6951, term6951.getClass(), "modalFilter", null);
        setField(term6951, term6951.getClass(), "secondaryLoop", null);
        setBooleanField(term6951, term6951.getClass(), "isInHide", false);
        setBooleanField(term6951, term6951.getClass(), "isInDispose", false);
        setField(term6951, term6951.getClass(), "warningString", null);
        setField(term6951, term6951.getClass(), "icons", null);
        setField(term6951, term6951.getClass(), "temporaryLostComponent", null);
        setBooleanField(term6951, term6951.getClass(), "syncLWRequests", false);
        setBooleanField(term6951, term6951.getClass(), "beforeFirstShow", false);
        setBooleanField(term6951, term6951.getClass(), "disposing", false);
        setField(term6951, term6951.getClass(), "disposerRecord", null);
        setIntField(term6951, term6951.getClass(), "state", 0);
        setBooleanField(term6951, term6951.getClass(), "alwaysOnTop", false);
        setField(term6951, term6951.getClass(), "ownedWindowList", null);
        setField(term6951, term6951.getClass(), "weakThis", null);
        setBooleanField(term6951, term6951.getClass(), "showWithParent", false);
        setField(term6951, term6951.getClass(), "modalBlocker", null);
        setField(term6951, term6951.getClass(), "modalExclusionType", null);
        setField(term6951, term6951.getClass(), "windowListener", null);
        setField(term6951, term6951.getClass(), "windowStateListener", null);
        setField(term6951, term6951.getClass(), "windowFocusListener", null);
        setField(term6951, term6951.getClass(), "inputContext", null);
        setField(term6951, term6951.getClass(), "inputContextLock", null);
        setField(term6951, term6951.getClass(), "focusMgr", null);
        setBooleanField(term6951, term6951.getClass(), "focusableWindowState", false);
        setBooleanField(term6951, term6951.getClass(), "autoRequestFocus", false);
        setBooleanField(term6951, term6951.getClass(), "isInShow", false);
        setFloatField(term6951, term6951.getClass(), "opacity", 0.0F);
        setField(term6951, term6951.getClass(), "shape", null);
        setBooleanField(term6951, term6951.getClass(), "isTrayIconWindow", false);
        setIntField(term6951, term6951.getClass(), "securityWarningWidth", 0);
        setIntField(term6951, term6951.getClass(), "securityWarningHeight", 0);
        setDoubleField(term6951, term6951.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term6951, term6951.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term6951, term6951.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term6951, term6951.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term6951, term6951.getClass(), "anchor", null);
        setField(term6951, term6951.getClass(), "type", null);
        setIntField(term6951, term6951.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term6951, term6951.getClass(), "locationByPlatform", false);
        setField(term6951, term6951.getClass(), "component", null);
        setField(term6951, term6951.getClass(), "layoutMgr", null);
        setField(term6951, term6951.getClass(), "dispatcher", null);
        setField(term6951, term6951.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term6951, term6951.getClass(), "focusCycleRoot", false);
        setBooleanField(term6951, term6951.getClass(), "focusTraversalPolicyProvider", false);
        setField(term6951, term6951.getClass(), "printingThreads", null);
        setBooleanField(term6951, term6951.getClass(), "printing", false);
        setField(term6951, term6951.getClass(), "containerListener", null);
        setIntField(term6951, term6951.getClass(), "listeningChildren", 0);
        setIntField(term6951, term6951.getClass(), "listeningBoundsChildren", 0);
        setIntField(term6951, term6951.getClass(), "descendantsCount", 0);
        setField(term6951, term6951.getClass(), "preserveBackgroundColor", null);
        setIntField(term6951, term6951.getClass(), "numOfHWComponents", 0);
        setIntField(term6951, term6951.getClass(), "numOfLWComponents", 0);
        setField(term6951, term6951.getClass(), "modalComp", null);
        setField(term6951, term6951.getClass(), "modalAppContext", null);
        setIntField(term6951, term6951.getClass(), "containerSerializedDataVersion", 0);
        setField(term6951, term6951.getClass(), "peer", null);
        setField(term6951, term6951.getClass(), "parent", null);
        setField(term6951, term6951.getClass(), "appContext", null);
        setIntField(term6951, term6951.getClass(), "x", 0);
        setIntField(term6951, term6951.getClass(), "y", 0);
        setIntField(term6951, term6951.getClass(), "width", 0);
        setIntField(term6951, term6951.getClass(), "height", 0);
        setField(term6951, term6951.getClass(), "foreground", null);
        setField(term6951, term6951.getClass(), "background", null);
        setField(term6951, term6951.getClass(), "font", null);
        setField(term6951, term6951.getClass(), "peerFont", null);
        setField(term6951, term6951.getClass(), "cursor", null);
        setField(term6951, term6951.getClass(), "locale", null);
        setField(term6951, term6951.getClass(), "graphicsConfig", null);
        setField(term6951, term6951.getClass(), "bufferStrategy", null);
        setBooleanField(term6951, term6951.getClass(), "ignoreRepaint", false);
        setBooleanField(term6951, term6951.getClass(), "visible", false);
        setBooleanField(term6951, term6951.getClass(), "enabled", false);
        setBooleanField(term6951, term6951.getClass(), "valid", false);
        setField(term6951, term6951.getClass(), "dropTarget", null);
        setField(term6951, term6951.getClass(), "popups", null);
        setField(term6951, term6951.getClass(), "name", null);
        setBooleanField(term6951, term6951.getClass(), "nameExplicitlySet", false);
        setBooleanField(term6951, term6951.getClass(), "focusable", false);
        setIntField(term6951, term6951.getClass(), "isFocusTraversableOverridden", 0);
        setField(term6951, term6951.getClass(), "focusTraversalKeys", null);
        setBooleanField(term6951, term6951.getClass(), "focusTraversalKeysEnabled", false);
        setField(term6951, term6951.getClass(), "acc", null);
        setField(term6951, term6951.getClass(), "minSize", null);
        setBooleanField(term6951, term6951.getClass(), "minSizeSet", false);
        setField(term6951, term6951.getClass(), "prefSize", null);
        setBooleanField(term6951, term6951.getClass(), "prefSizeSet", false);
        setField(term6951, term6951.getClass(), "maxSize", null);
        setBooleanField(term6951, term6951.getClass(), "maxSizeSet", false);
        setField(term6951, term6951.getClass(), "componentOrientation", null);
        setBooleanField(term6951, term6951.getClass(), "newEventsOnly", false);
        setField(term6951, term6951.getClass(), "componentListener", null);
        setField(term6951, term6951.getClass(), "focusListener", null);
        setField(term6951, term6951.getClass(), "hierarchyListener", null);
        setField(term6951, term6951.getClass(), "hierarchyBoundsListener", null);
        setField(term6951, term6951.getClass(), "keyListener", null);
        setField(term6951, term6951.getClass(), "mouseListener", null);
        setField(term6951, term6951.getClass(), "mouseMotionListener", null);
        setField(term6951, term6951.getClass(), "mouseWheelListener", null);
        setField(term6951, term6951.getClass(), "inputMethodListener", null);
        setLongField(term6951, term6951.getClass(), "eventMask", 0L);
        setField(term6951, term6951.getClass(), "changeSupport", null);
        setField(term6951, term6951.getClass(), "objectLock", null);
        setBooleanField(term6951, term6951.getClass(), "isPacked", false);
        setIntField(term6951, term6951.getClass(), "boundsOp", 0);
        setField(term6951, term6951.getClass(), "compoundShape", null);
        setField(term6951, term6951.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term6951, term6951.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term6951, term6951.getClass(), "backgroundEraseDisabled", false);
        setField(term6951, term6951.getClass(), "eventCache", null);
        setBooleanField(term6951, term6951.getClass(), "coalescingEnabled", false);
        setBooleanField(term6951, term6951.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term6951, term6951.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.exhibition.TodoExhibition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newHintLabel", argTypes, term6951, args);
    }

};


