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

public class ProjectExhibition_newValueLabel_824798215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6106;

    public ProjectExhibition_newValueLabel_824798215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6106 = newInstance(Class.forName("core.task.exhibition.ProjectExhibition"));
        setIntField(term6106, term6106.getClass(), "defaultCloseOperation", 0);
        setField(term6106, term6106.getClass(), "rootPane", null);
        setBooleanField(term6106, term6106.getClass(), "rootPaneCheckingEnabled", false);
        setField(term6106, term6106.getClass(), "transferHandler", null);
        setField(term6106, term6106.getClass(), "accessibleContext", null);
        setBooleanField(term6106, term6106.getClass(), "resizable", false);
        setBooleanField(term6106, term6106.getClass(), "undecorated", false);
        setBooleanField(term6106, term6106.getClass(), "initialized", false);
        setBooleanField(term6106, term6106.getClass(), "modal", false);
        setField(term6106, term6106.getClass(), "modalityType", null);
        setField(term6106, term6106.getClass(), "blockedWindows", null);
        setField(term6106, term6106.getClass(), "title", null);
        setField(term6106, term6106.getClass(), "modalFilter", null);
        setField(term6106, term6106.getClass(), "secondaryLoop", null);
        setBooleanField(term6106, term6106.getClass(), "isInHide", false);
        setBooleanField(term6106, term6106.getClass(), "isInDispose", false);
        setField(term6106, term6106.getClass(), "warningString", null);
        setField(term6106, term6106.getClass(), "icons", null);
        setField(term6106, term6106.getClass(), "temporaryLostComponent", null);
        setBooleanField(term6106, term6106.getClass(), "syncLWRequests", false);
        setBooleanField(term6106, term6106.getClass(), "beforeFirstShow", false);
        setBooleanField(term6106, term6106.getClass(), "disposing", false);
        setField(term6106, term6106.getClass(), "disposerRecord", null);
        setIntField(term6106, term6106.getClass(), "state", 0);
        setBooleanField(term6106, term6106.getClass(), "alwaysOnTop", false);
        setField(term6106, term6106.getClass(), "ownedWindowList", null);
        setField(term6106, term6106.getClass(), "weakThis", null);
        setBooleanField(term6106, term6106.getClass(), "showWithParent", false);
        setField(term6106, term6106.getClass(), "modalBlocker", null);
        setField(term6106, term6106.getClass(), "modalExclusionType", null);
        setField(term6106, term6106.getClass(), "windowListener", null);
        setField(term6106, term6106.getClass(), "windowStateListener", null);
        setField(term6106, term6106.getClass(), "windowFocusListener", null);
        setField(term6106, term6106.getClass(), "inputContext", null);
        setField(term6106, term6106.getClass(), "inputContextLock", null);
        setField(term6106, term6106.getClass(), "focusMgr", null);
        setBooleanField(term6106, term6106.getClass(), "focusableWindowState", false);
        setBooleanField(term6106, term6106.getClass(), "autoRequestFocus", false);
        setBooleanField(term6106, term6106.getClass(), "isInShow", false);
        setFloatField(term6106, term6106.getClass(), "opacity", 0.0F);
        setField(term6106, term6106.getClass(), "shape", null);
        setBooleanField(term6106, term6106.getClass(), "isTrayIconWindow", false);
        setIntField(term6106, term6106.getClass(), "securityWarningWidth", 0);
        setIntField(term6106, term6106.getClass(), "securityWarningHeight", 0);
        setDoubleField(term6106, term6106.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term6106, term6106.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term6106, term6106.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term6106, term6106.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term6106, term6106.getClass(), "anchor", null);
        setField(term6106, term6106.getClass(), "type", null);
        setIntField(term6106, term6106.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term6106, term6106.getClass(), "locationByPlatform", false);
        setField(term6106, term6106.getClass(), "component", null);
        setField(term6106, term6106.getClass(), "layoutMgr", null);
        setField(term6106, term6106.getClass(), "dispatcher", null);
        setField(term6106, term6106.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term6106, term6106.getClass(), "focusCycleRoot", false);
        setBooleanField(term6106, term6106.getClass(), "focusTraversalPolicyProvider", false);
        setField(term6106, term6106.getClass(), "printingThreads", null);
        setBooleanField(term6106, term6106.getClass(), "printing", false);
        setField(term6106, term6106.getClass(), "containerListener", null);
        setIntField(term6106, term6106.getClass(), "listeningChildren", 0);
        setIntField(term6106, term6106.getClass(), "listeningBoundsChildren", 0);
        setIntField(term6106, term6106.getClass(), "descendantsCount", 0);
        setField(term6106, term6106.getClass(), "preserveBackgroundColor", null);
        setIntField(term6106, term6106.getClass(), "numOfHWComponents", 0);
        setIntField(term6106, term6106.getClass(), "numOfLWComponents", 0);
        setField(term6106, term6106.getClass(), "modalComp", null);
        setField(term6106, term6106.getClass(), "modalAppContext", null);
        setIntField(term6106, term6106.getClass(), "containerSerializedDataVersion", 0);
        setField(term6106, term6106.getClass(), "peer", null);
        setField(term6106, term6106.getClass(), "parent", null);
        setField(term6106, term6106.getClass(), "appContext", null);
        setIntField(term6106, term6106.getClass(), "x", 0);
        setIntField(term6106, term6106.getClass(), "y", 0);
        setIntField(term6106, term6106.getClass(), "width", 0);
        setIntField(term6106, term6106.getClass(), "height", 0);
        setField(term6106, term6106.getClass(), "foreground", null);
        setField(term6106, term6106.getClass(), "background", null);
        setField(term6106, term6106.getClass(), "font", null);
        setField(term6106, term6106.getClass(), "peerFont", null);
        setField(term6106, term6106.getClass(), "cursor", null);
        setField(term6106, term6106.getClass(), "locale", null);
        setField(term6106, term6106.getClass(), "graphicsConfig", null);
        setField(term6106, term6106.getClass(), "bufferStrategy", null);
        setBooleanField(term6106, term6106.getClass(), "ignoreRepaint", false);
        setBooleanField(term6106, term6106.getClass(), "visible", false);
        setBooleanField(term6106, term6106.getClass(), "enabled", false);
        setBooleanField(term6106, term6106.getClass(), "valid", false);
        setField(term6106, term6106.getClass(), "dropTarget", null);
        setField(term6106, term6106.getClass(), "popups", null);
        setField(term6106, term6106.getClass(), "name", null);
        setBooleanField(term6106, term6106.getClass(), "nameExplicitlySet", false);
        setBooleanField(term6106, term6106.getClass(), "focusable", false);
        setIntField(term6106, term6106.getClass(), "isFocusTraversableOverridden", 0);
        setField(term6106, term6106.getClass(), "focusTraversalKeys", null);
        setBooleanField(term6106, term6106.getClass(), "focusTraversalKeysEnabled", false);
        setField(term6106, term6106.getClass(), "acc", null);
        setField(term6106, term6106.getClass(), "minSize", null);
        setBooleanField(term6106, term6106.getClass(), "minSizeSet", false);
        setField(term6106, term6106.getClass(), "prefSize", null);
        setBooleanField(term6106, term6106.getClass(), "prefSizeSet", false);
        setField(term6106, term6106.getClass(), "maxSize", null);
        setBooleanField(term6106, term6106.getClass(), "maxSizeSet", false);
        setField(term6106, term6106.getClass(), "componentOrientation", null);
        setBooleanField(term6106, term6106.getClass(), "newEventsOnly", false);
        setField(term6106, term6106.getClass(), "componentListener", null);
        setField(term6106, term6106.getClass(), "focusListener", null);
        setField(term6106, term6106.getClass(), "hierarchyListener", null);
        setField(term6106, term6106.getClass(), "hierarchyBoundsListener", null);
        setField(term6106, term6106.getClass(), "keyListener", null);
        setField(term6106, term6106.getClass(), "mouseListener", null);
        setField(term6106, term6106.getClass(), "mouseMotionListener", null);
        setField(term6106, term6106.getClass(), "mouseWheelListener", null);
        setField(term6106, term6106.getClass(), "inputMethodListener", null);
        setLongField(term6106, term6106.getClass(), "eventMask", 0L);
        setField(term6106, term6106.getClass(), "changeSupport", null);
        setField(term6106, term6106.getClass(), "objectLock", null);
        setBooleanField(term6106, term6106.getClass(), "isPacked", false);
        setIntField(term6106, term6106.getClass(), "boundsOp", 0);
        setField(term6106, term6106.getClass(), "compoundShape", null);
        setField(term6106, term6106.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term6106, term6106.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term6106, term6106.getClass(), "backgroundEraseDisabled", false);
        setField(term6106, term6106.getClass(), "eventCache", null);
        setBooleanField(term6106, term6106.getClass(), "coalescingEnabled", false);
        setBooleanField(term6106, term6106.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term6106, term6106.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.exhibition.ProjectExhibition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newValueLabel", argTypes, term6106, args);
    }

};


