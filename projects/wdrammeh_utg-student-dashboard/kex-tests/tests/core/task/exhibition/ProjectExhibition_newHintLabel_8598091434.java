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
     Object term6045;

    public ProjectExhibition_newHintLabel_8598091434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6045 = newInstance(Class.forName("core.task.exhibition.ProjectExhibition"));
        setIntField(term6045, term6045.getClass(), "defaultCloseOperation", 0);
        setField(term6045, term6045.getClass(), "rootPane", null);
        setBooleanField(term6045, term6045.getClass(), "rootPaneCheckingEnabled", false);
        setField(term6045, term6045.getClass(), "transferHandler", null);
        setField(term6045, term6045.getClass(), "accessibleContext", null);
        setBooleanField(term6045, term6045.getClass(), "resizable", false);
        setBooleanField(term6045, term6045.getClass(), "undecorated", false);
        setBooleanField(term6045, term6045.getClass(), "initialized", false);
        setBooleanField(term6045, term6045.getClass(), "modal", false);
        setField(term6045, term6045.getClass(), "modalityType", null);
        setField(term6045, term6045.getClass(), "blockedWindows", null);
        setField(term6045, term6045.getClass(), "title", null);
        setField(term6045, term6045.getClass(), "modalFilter", null);
        setField(term6045, term6045.getClass(), "secondaryLoop", null);
        setBooleanField(term6045, term6045.getClass(), "isInHide", false);
        setBooleanField(term6045, term6045.getClass(), "isInDispose", false);
        setField(term6045, term6045.getClass(), "warningString", null);
        setField(term6045, term6045.getClass(), "icons", null);
        setField(term6045, term6045.getClass(), "temporaryLostComponent", null);
        setBooleanField(term6045, term6045.getClass(), "syncLWRequests", false);
        setBooleanField(term6045, term6045.getClass(), "beforeFirstShow", false);
        setBooleanField(term6045, term6045.getClass(), "disposing", false);
        setField(term6045, term6045.getClass(), "disposerRecord", null);
        setIntField(term6045, term6045.getClass(), "state", 0);
        setBooleanField(term6045, term6045.getClass(), "alwaysOnTop", false);
        setField(term6045, term6045.getClass(), "ownedWindowList", null);
        setField(term6045, term6045.getClass(), "weakThis", null);
        setBooleanField(term6045, term6045.getClass(), "showWithParent", false);
        setField(term6045, term6045.getClass(), "modalBlocker", null);
        setField(term6045, term6045.getClass(), "modalExclusionType", null);
        setField(term6045, term6045.getClass(), "windowListener", null);
        setField(term6045, term6045.getClass(), "windowStateListener", null);
        setField(term6045, term6045.getClass(), "windowFocusListener", null);
        setField(term6045, term6045.getClass(), "inputContext", null);
        setField(term6045, term6045.getClass(), "inputContextLock", null);
        setField(term6045, term6045.getClass(), "focusMgr", null);
        setBooleanField(term6045, term6045.getClass(), "focusableWindowState", false);
        setBooleanField(term6045, term6045.getClass(), "autoRequestFocus", false);
        setBooleanField(term6045, term6045.getClass(), "isInShow", false);
        setFloatField(term6045, term6045.getClass(), "opacity", 0.0F);
        setField(term6045, term6045.getClass(), "shape", null);
        setBooleanField(term6045, term6045.getClass(), "isTrayIconWindow", false);
        setIntField(term6045, term6045.getClass(), "securityWarningWidth", 0);
        setIntField(term6045, term6045.getClass(), "securityWarningHeight", 0);
        setDoubleField(term6045, term6045.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term6045, term6045.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term6045, term6045.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term6045, term6045.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term6045, term6045.getClass(), "anchor", null);
        setField(term6045, term6045.getClass(), "type", null);
        setIntField(term6045, term6045.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term6045, term6045.getClass(), "locationByPlatform", false);
        setField(term6045, term6045.getClass(), "component", null);
        setField(term6045, term6045.getClass(), "layoutMgr", null);
        setField(term6045, term6045.getClass(), "dispatcher", null);
        setField(term6045, term6045.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term6045, term6045.getClass(), "focusCycleRoot", false);
        setBooleanField(term6045, term6045.getClass(), "focusTraversalPolicyProvider", false);
        setField(term6045, term6045.getClass(), "printingThreads", null);
        setBooleanField(term6045, term6045.getClass(), "printing", false);
        setField(term6045, term6045.getClass(), "containerListener", null);
        setIntField(term6045, term6045.getClass(), "listeningChildren", 0);
        setIntField(term6045, term6045.getClass(), "listeningBoundsChildren", 0);
        setIntField(term6045, term6045.getClass(), "descendantsCount", 0);
        setField(term6045, term6045.getClass(), "preserveBackgroundColor", null);
        setIntField(term6045, term6045.getClass(), "numOfHWComponents", 0);
        setIntField(term6045, term6045.getClass(), "numOfLWComponents", 0);
        setField(term6045, term6045.getClass(), "modalComp", null);
        setField(term6045, term6045.getClass(), "modalAppContext", null);
        setIntField(term6045, term6045.getClass(), "containerSerializedDataVersion", 0);
        setField(term6045, term6045.getClass(), "peer", null);
        setField(term6045, term6045.getClass(), "parent", null);
        setField(term6045, term6045.getClass(), "appContext", null);
        setIntField(term6045, term6045.getClass(), "x", 0);
        setIntField(term6045, term6045.getClass(), "y", 0);
        setIntField(term6045, term6045.getClass(), "width", 0);
        setIntField(term6045, term6045.getClass(), "height", 0);
        setField(term6045, term6045.getClass(), "foreground", null);
        setField(term6045, term6045.getClass(), "background", null);
        setField(term6045, term6045.getClass(), "font", null);
        setField(term6045, term6045.getClass(), "peerFont", null);
        setField(term6045, term6045.getClass(), "cursor", null);
        setField(term6045, term6045.getClass(), "locale", null);
        setField(term6045, term6045.getClass(), "graphicsConfig", null);
        setField(term6045, term6045.getClass(), "bufferStrategy", null);
        setBooleanField(term6045, term6045.getClass(), "ignoreRepaint", false);
        setBooleanField(term6045, term6045.getClass(), "visible", false);
        setBooleanField(term6045, term6045.getClass(), "enabled", false);
        setBooleanField(term6045, term6045.getClass(), "valid", false);
        setField(term6045, term6045.getClass(), "dropTarget", null);
        setField(term6045, term6045.getClass(), "popups", null);
        setField(term6045, term6045.getClass(), "name", null);
        setBooleanField(term6045, term6045.getClass(), "nameExplicitlySet", false);
        setBooleanField(term6045, term6045.getClass(), "focusable", false);
        setIntField(term6045, term6045.getClass(), "isFocusTraversableOverridden", 0);
        setField(term6045, term6045.getClass(), "focusTraversalKeys", null);
        setBooleanField(term6045, term6045.getClass(), "focusTraversalKeysEnabled", false);
        setField(term6045, term6045.getClass(), "acc", null);
        setField(term6045, term6045.getClass(), "minSize", null);
        setBooleanField(term6045, term6045.getClass(), "minSizeSet", false);
        setField(term6045, term6045.getClass(), "prefSize", null);
        setBooleanField(term6045, term6045.getClass(), "prefSizeSet", false);
        setField(term6045, term6045.getClass(), "maxSize", null);
        setBooleanField(term6045, term6045.getClass(), "maxSizeSet", false);
        setField(term6045, term6045.getClass(), "componentOrientation", null);
        setBooleanField(term6045, term6045.getClass(), "newEventsOnly", false);
        setField(term6045, term6045.getClass(), "componentListener", null);
        setField(term6045, term6045.getClass(), "focusListener", null);
        setField(term6045, term6045.getClass(), "hierarchyListener", null);
        setField(term6045, term6045.getClass(), "hierarchyBoundsListener", null);
        setField(term6045, term6045.getClass(), "keyListener", null);
        setField(term6045, term6045.getClass(), "mouseListener", null);
        setField(term6045, term6045.getClass(), "mouseMotionListener", null);
        setField(term6045, term6045.getClass(), "mouseWheelListener", null);
        setField(term6045, term6045.getClass(), "inputMethodListener", null);
        setLongField(term6045, term6045.getClass(), "eventMask", 0L);
        setField(term6045, term6045.getClass(), "changeSupport", null);
        setField(term6045, term6045.getClass(), "objectLock", null);
        setBooleanField(term6045, term6045.getClass(), "isPacked", false);
        setIntField(term6045, term6045.getClass(), "boundsOp", 0);
        setField(term6045, term6045.getClass(), "compoundShape", null);
        setField(term6045, term6045.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term6045, term6045.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term6045, term6045.getClass(), "backgroundEraseDisabled", false);
        setField(term6045, term6045.getClass(), "eventCache", null);
        setBooleanField(term6045, term6045.getClass(), "coalescingEnabled", false);
        setBooleanField(term6045, term6045.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term6045, term6045.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.exhibition.ProjectExhibition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newHintLabel", argTypes, term6045, args);
    }

};


