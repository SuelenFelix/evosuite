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

public class ProjectExhibition_newHintLabel_8598091434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term375758;

    public ProjectExhibition_newHintLabel_8598091434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term375758 = newInstance(Class.forName("core.task.exhibition.ProjectExhibition"));
        setIntField(term375758, term375758.getClass(), "defaultCloseOperation", 0);
        setField(term375758, term375758.getClass(), "rootPane", null);
        setBooleanField(term375758, term375758.getClass(), "rootPaneCheckingEnabled", false);
        setField(term375758, term375758.getClass(), "transferHandler", null);
        setField(term375758, term375758.getClass(), "accessibleContext", null);
        setBooleanField(term375758, term375758.getClass(), "resizable", false);
        setBooleanField(term375758, term375758.getClass(), "undecorated", false);
        setBooleanField(term375758, term375758.getClass(), "initialized", false);
        setBooleanField(term375758, term375758.getClass(), "modal", false);
        setField(term375758, term375758.getClass(), "modalityType", null);
        setField(term375758, term375758.getClass(), "blockedWindows", null);
        setField(term375758, term375758.getClass(), "title", null);
        setField(term375758, term375758.getClass(), "modalFilter", null);
        setField(term375758, term375758.getClass(), "secondaryLoop", null);
        setBooleanField(term375758, term375758.getClass(), "isInHide", false);
        setBooleanField(term375758, term375758.getClass(), "isInDispose", false);
        setField(term375758, term375758.getClass(), "warningString", null);
        setField(term375758, term375758.getClass(), "icons", null);
        setField(term375758, term375758.getClass(), "temporaryLostComponent", null);
        setBooleanField(term375758, term375758.getClass(), "syncLWRequests", false);
        setBooleanField(term375758, term375758.getClass(), "beforeFirstShow", false);
        setBooleanField(term375758, term375758.getClass(), "disposing", false);
        setField(term375758, term375758.getClass(), "disposerRecord", null);
        setIntField(term375758, term375758.getClass(), "state", 0);
        setBooleanField(term375758, term375758.getClass(), "alwaysOnTop", false);
        setField(term375758, term375758.getClass(), "ownedWindowList", null);
        setField(term375758, term375758.getClass(), "weakThis", null);
        setBooleanField(term375758, term375758.getClass(), "showWithParent", false);
        setField(term375758, term375758.getClass(), "modalBlocker", null);
        setField(term375758, term375758.getClass(), "modalExclusionType", null);
        setField(term375758, term375758.getClass(), "windowListener", null);
        setField(term375758, term375758.getClass(), "windowStateListener", null);
        setField(term375758, term375758.getClass(), "windowFocusListener", null);
        setField(term375758, term375758.getClass(), "inputContext", null);
        setField(term375758, term375758.getClass(), "inputContextLock", null);
        setField(term375758, term375758.getClass(), "focusMgr", null);
        setBooleanField(term375758, term375758.getClass(), "focusableWindowState", false);
        setBooleanField(term375758, term375758.getClass(), "autoRequestFocus", false);
        setBooleanField(term375758, term375758.getClass(), "isInShow", false);
        setFloatField(term375758, term375758.getClass(), "opacity", 0.0F);
        setField(term375758, term375758.getClass(), "shape", null);
        setBooleanField(term375758, term375758.getClass(), "isTrayIconWindow", false);
        setIntField(term375758, term375758.getClass(), "securityWarningWidth", 0);
        setIntField(term375758, term375758.getClass(), "securityWarningHeight", 0);
        setDoubleField(term375758, term375758.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term375758, term375758.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term375758, term375758.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term375758, term375758.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term375758, term375758.getClass(), "anchor", null);
        setField(term375758, term375758.getClass(), "type", null);
        setIntField(term375758, term375758.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term375758, term375758.getClass(), "locationByPlatform", false);
        setField(term375758, term375758.getClass(), "component", null);
        setField(term375758, term375758.getClass(), "layoutMgr", null);
        setField(term375758, term375758.getClass(), "dispatcher", null);
        setField(term375758, term375758.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term375758, term375758.getClass(), "focusCycleRoot", false);
        setBooleanField(term375758, term375758.getClass(), "focusTraversalPolicyProvider", false);
        setField(term375758, term375758.getClass(), "printingThreads", null);
        setBooleanField(term375758, term375758.getClass(), "printing", false);
        setField(term375758, term375758.getClass(), "containerListener", null);
        setIntField(term375758, term375758.getClass(), "listeningChildren", 0);
        setIntField(term375758, term375758.getClass(), "listeningBoundsChildren", 0);
        setIntField(term375758, term375758.getClass(), "descendantsCount", 0);
        setField(term375758, term375758.getClass(), "preserveBackgroundColor", null);
        setIntField(term375758, term375758.getClass(), "numOfHWComponents", 0);
        setIntField(term375758, term375758.getClass(), "numOfLWComponents", 0);
        setField(term375758, term375758.getClass(), "modalComp", null);
        setField(term375758, term375758.getClass(), "modalAppContext", null);
        setIntField(term375758, term375758.getClass(), "containerSerializedDataVersion", 0);
        setField(term375758, term375758.getClass(), "peer", null);
        setField(term375758, term375758.getClass(), "parent", null);
        setField(term375758, term375758.getClass(), "appContext", null);
        setIntField(term375758, term375758.getClass(), "x", 0);
        setIntField(term375758, term375758.getClass(), "y", 0);
        setIntField(term375758, term375758.getClass(), "width", 0);
        setIntField(term375758, term375758.getClass(), "height", 0);
        setField(term375758, term375758.getClass(), "foreground", null);
        setField(term375758, term375758.getClass(), "background", null);
        setField(term375758, term375758.getClass(), "font", null);
        setField(term375758, term375758.getClass(), "peerFont", null);
        setField(term375758, term375758.getClass(), "cursor", null);
        setField(term375758, term375758.getClass(), "locale", null);
        setField(term375758, term375758.getClass(), "graphicsConfig", null);
        setField(term375758, term375758.getClass(), "bufferStrategy", null);
        setBooleanField(term375758, term375758.getClass(), "ignoreRepaint", false);
        setBooleanField(term375758, term375758.getClass(), "visible", false);
        setBooleanField(term375758, term375758.getClass(), "enabled", false);
        setBooleanField(term375758, term375758.getClass(), "valid", false);
        setField(term375758, term375758.getClass(), "dropTarget", null);
        setField(term375758, term375758.getClass(), "popups", null);
        setField(term375758, term375758.getClass(), "name", null);
        setBooleanField(term375758, term375758.getClass(), "nameExplicitlySet", false);
        setBooleanField(term375758, term375758.getClass(), "focusable", false);
        setIntField(term375758, term375758.getClass(), "isFocusTraversableOverridden", 0);
        setField(term375758, term375758.getClass(), "focusTraversalKeys", null);
        setBooleanField(term375758, term375758.getClass(), "focusTraversalKeysEnabled", false);
        setField(term375758, term375758.getClass(), "acc", null);
        setField(term375758, term375758.getClass(), "minSize", null);
        setBooleanField(term375758, term375758.getClass(), "minSizeSet", false);
        setField(term375758, term375758.getClass(), "prefSize", null);
        setBooleanField(term375758, term375758.getClass(), "prefSizeSet", false);
        setField(term375758, term375758.getClass(), "maxSize", null);
        setBooleanField(term375758, term375758.getClass(), "maxSizeSet", false);
        setField(term375758, term375758.getClass(), "componentOrientation", null);
        setBooleanField(term375758, term375758.getClass(), "newEventsOnly", false);
        setField(term375758, term375758.getClass(), "componentListener", null);
        setField(term375758, term375758.getClass(), "focusListener", null);
        setField(term375758, term375758.getClass(), "hierarchyListener", null);
        setField(term375758, term375758.getClass(), "hierarchyBoundsListener", null);
        setField(term375758, term375758.getClass(), "keyListener", null);
        setField(term375758, term375758.getClass(), "mouseListener", null);
        setField(term375758, term375758.getClass(), "mouseMotionListener", null);
        setField(term375758, term375758.getClass(), "mouseWheelListener", null);
        setField(term375758, term375758.getClass(), "inputMethodListener", null);
        setLongField(term375758, term375758.getClass(), "eventMask", 0L);
        setField(term375758, term375758.getClass(), "changeSupport", null);
        setField(term375758, term375758.getClass(), "objectLock", null);
        setBooleanField(term375758, term375758.getClass(), "isPacked", false);
        setIntField(term375758, term375758.getClass(), "boundsOp", 0);
        setField(term375758, term375758.getClass(), "compoundShape", null);
        setField(term375758, term375758.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term375758, term375758.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term375758, term375758.getClass(), "backgroundEraseDisabled", false);
        setField(term375758, term375758.getClass(), "eventCache", null);
        setBooleanField(term375758, term375758.getClass(), "coalescingEnabled", false);
        setBooleanField(term375758, term375758.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term375758, term375758.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.exhibition.ProjectExhibition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newHintLabel", argTypes, term375758, args);
    }

};


