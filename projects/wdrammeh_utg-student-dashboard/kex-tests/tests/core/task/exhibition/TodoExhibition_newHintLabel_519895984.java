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
     Object term393502;

    public TodoExhibition_newHintLabel_519895984() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term393502 = newInstance(Class.forName("core.task.exhibition.TodoExhibition"));
        setIntField(term393502, term393502.getClass(), "defaultCloseOperation", 0);
        setField(term393502, term393502.getClass(), "rootPane", null);
        setBooleanField(term393502, term393502.getClass(), "rootPaneCheckingEnabled", false);
        setField(term393502, term393502.getClass(), "transferHandler", null);
        setField(term393502, term393502.getClass(), "accessibleContext", null);
        setBooleanField(term393502, term393502.getClass(), "resizable", false);
        setBooleanField(term393502, term393502.getClass(), "undecorated", false);
        setBooleanField(term393502, term393502.getClass(), "initialized", false);
        setBooleanField(term393502, term393502.getClass(), "modal", false);
        setField(term393502, term393502.getClass(), "modalityType", null);
        setField(term393502, term393502.getClass(), "blockedWindows", null);
        setField(term393502, term393502.getClass(), "title", null);
        setField(term393502, term393502.getClass(), "modalFilter", null);
        setField(term393502, term393502.getClass(), "secondaryLoop", null);
        setBooleanField(term393502, term393502.getClass(), "isInHide", false);
        setBooleanField(term393502, term393502.getClass(), "isInDispose", false);
        setField(term393502, term393502.getClass(), "warningString", null);
        setField(term393502, term393502.getClass(), "icons", null);
        setField(term393502, term393502.getClass(), "temporaryLostComponent", null);
        setBooleanField(term393502, term393502.getClass(), "syncLWRequests", false);
        setBooleanField(term393502, term393502.getClass(), "beforeFirstShow", false);
        setBooleanField(term393502, term393502.getClass(), "disposing", false);
        setField(term393502, term393502.getClass(), "disposerRecord", null);
        setIntField(term393502, term393502.getClass(), "state", 0);
        setBooleanField(term393502, term393502.getClass(), "alwaysOnTop", false);
        setField(term393502, term393502.getClass(), "ownedWindowList", null);
        setField(term393502, term393502.getClass(), "weakThis", null);
        setBooleanField(term393502, term393502.getClass(), "showWithParent", false);
        setField(term393502, term393502.getClass(), "modalBlocker", null);
        setField(term393502, term393502.getClass(), "modalExclusionType", null);
        setField(term393502, term393502.getClass(), "windowListener", null);
        setField(term393502, term393502.getClass(), "windowStateListener", null);
        setField(term393502, term393502.getClass(), "windowFocusListener", null);
        setField(term393502, term393502.getClass(), "inputContext", null);
        setField(term393502, term393502.getClass(), "inputContextLock", null);
        setField(term393502, term393502.getClass(), "focusMgr", null);
        setBooleanField(term393502, term393502.getClass(), "focusableWindowState", false);
        setBooleanField(term393502, term393502.getClass(), "autoRequestFocus", false);
        setBooleanField(term393502, term393502.getClass(), "isInShow", false);
        setFloatField(term393502, term393502.getClass(), "opacity", 0.0F);
        setField(term393502, term393502.getClass(), "shape", null);
        setBooleanField(term393502, term393502.getClass(), "isTrayIconWindow", false);
        setIntField(term393502, term393502.getClass(), "securityWarningWidth", 0);
        setIntField(term393502, term393502.getClass(), "securityWarningHeight", 0);
        setDoubleField(term393502, term393502.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term393502, term393502.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term393502, term393502.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term393502, term393502.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term393502, term393502.getClass(), "anchor", null);
        setField(term393502, term393502.getClass(), "type", null);
        setIntField(term393502, term393502.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term393502, term393502.getClass(), "locationByPlatform", false);
        setField(term393502, term393502.getClass(), "component", null);
        setField(term393502, term393502.getClass(), "layoutMgr", null);
        setField(term393502, term393502.getClass(), "dispatcher", null);
        setField(term393502, term393502.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term393502, term393502.getClass(), "focusCycleRoot", false);
        setBooleanField(term393502, term393502.getClass(), "focusTraversalPolicyProvider", false);
        setField(term393502, term393502.getClass(), "printingThreads", null);
        setBooleanField(term393502, term393502.getClass(), "printing", false);
        setField(term393502, term393502.getClass(), "containerListener", null);
        setIntField(term393502, term393502.getClass(), "listeningChildren", 0);
        setIntField(term393502, term393502.getClass(), "listeningBoundsChildren", 0);
        setIntField(term393502, term393502.getClass(), "descendantsCount", 0);
        setField(term393502, term393502.getClass(), "preserveBackgroundColor", null);
        setIntField(term393502, term393502.getClass(), "numOfHWComponents", 0);
        setIntField(term393502, term393502.getClass(), "numOfLWComponents", 0);
        setField(term393502, term393502.getClass(), "modalComp", null);
        setField(term393502, term393502.getClass(), "modalAppContext", null);
        setIntField(term393502, term393502.getClass(), "containerSerializedDataVersion", 0);
        setField(term393502, term393502.getClass(), "peer", null);
        setField(term393502, term393502.getClass(), "parent", null);
        setField(term393502, term393502.getClass(), "appContext", null);
        setIntField(term393502, term393502.getClass(), "x", 0);
        setIntField(term393502, term393502.getClass(), "y", 0);
        setIntField(term393502, term393502.getClass(), "width", 0);
        setIntField(term393502, term393502.getClass(), "height", 0);
        setField(term393502, term393502.getClass(), "foreground", null);
        setField(term393502, term393502.getClass(), "background", null);
        setField(term393502, term393502.getClass(), "font", null);
        setField(term393502, term393502.getClass(), "peerFont", null);
        setField(term393502, term393502.getClass(), "cursor", null);
        setField(term393502, term393502.getClass(), "locale", null);
        setField(term393502, term393502.getClass(), "graphicsConfig", null);
        setField(term393502, term393502.getClass(), "bufferStrategy", null);
        setBooleanField(term393502, term393502.getClass(), "ignoreRepaint", false);
        setBooleanField(term393502, term393502.getClass(), "visible", false);
        setBooleanField(term393502, term393502.getClass(), "enabled", false);
        setBooleanField(term393502, term393502.getClass(), "valid", false);
        setField(term393502, term393502.getClass(), "dropTarget", null);
        setField(term393502, term393502.getClass(), "popups", null);
        setField(term393502, term393502.getClass(), "name", null);
        setBooleanField(term393502, term393502.getClass(), "nameExplicitlySet", false);
        setBooleanField(term393502, term393502.getClass(), "focusable", false);
        setIntField(term393502, term393502.getClass(), "isFocusTraversableOverridden", 0);
        setField(term393502, term393502.getClass(), "focusTraversalKeys", null);
        setBooleanField(term393502, term393502.getClass(), "focusTraversalKeysEnabled", false);
        setField(term393502, term393502.getClass(), "acc", null);
        setField(term393502, term393502.getClass(), "minSize", null);
        setBooleanField(term393502, term393502.getClass(), "minSizeSet", false);
        setField(term393502, term393502.getClass(), "prefSize", null);
        setBooleanField(term393502, term393502.getClass(), "prefSizeSet", false);
        setField(term393502, term393502.getClass(), "maxSize", null);
        setBooleanField(term393502, term393502.getClass(), "maxSizeSet", false);
        setField(term393502, term393502.getClass(), "componentOrientation", null);
        setBooleanField(term393502, term393502.getClass(), "newEventsOnly", false);
        setField(term393502, term393502.getClass(), "componentListener", null);
        setField(term393502, term393502.getClass(), "focusListener", null);
        setField(term393502, term393502.getClass(), "hierarchyListener", null);
        setField(term393502, term393502.getClass(), "hierarchyBoundsListener", null);
        setField(term393502, term393502.getClass(), "keyListener", null);
        setField(term393502, term393502.getClass(), "mouseListener", null);
        setField(term393502, term393502.getClass(), "mouseMotionListener", null);
        setField(term393502, term393502.getClass(), "mouseWheelListener", null);
        setField(term393502, term393502.getClass(), "inputMethodListener", null);
        setLongField(term393502, term393502.getClass(), "eventMask", 0L);
        setField(term393502, term393502.getClass(), "changeSupport", null);
        setField(term393502, term393502.getClass(), "objectLock", null);
        setBooleanField(term393502, term393502.getClass(), "isPacked", false);
        setIntField(term393502, term393502.getClass(), "boundsOp", 0);
        setField(term393502, term393502.getClass(), "compoundShape", null);
        setField(term393502, term393502.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term393502, term393502.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term393502, term393502.getClass(), "backgroundEraseDisabled", false);
        setField(term393502, term393502.getClass(), "eventCache", null);
        setBooleanField(term393502, term393502.getClass(), "coalescingEnabled", false);
        setBooleanField(term393502, term393502.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term393502, term393502.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.exhibition.TodoExhibition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newHintLabel", argTypes, term393502, args);
    }

};


