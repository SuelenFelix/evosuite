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

public class AssignmentExhibition_newValueLabel_7686157575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160186;

    public AssignmentExhibition_newValueLabel_7686157575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160186 = newInstance(Class.forName("core.task.exhibition.AssignmentExhibition"));
        setIntField(term160186, term160186.getClass(), "defaultCloseOperation", 0);
        setField(term160186, term160186.getClass(), "rootPane", null);
        setBooleanField(term160186, term160186.getClass(), "rootPaneCheckingEnabled", false);
        setField(term160186, term160186.getClass(), "transferHandler", null);
        setField(term160186, term160186.getClass(), "accessibleContext", null);
        setBooleanField(term160186, term160186.getClass(), "resizable", false);
        setBooleanField(term160186, term160186.getClass(), "undecorated", false);
        setBooleanField(term160186, term160186.getClass(), "initialized", false);
        setBooleanField(term160186, term160186.getClass(), "modal", false);
        setField(term160186, term160186.getClass(), "modalityType", null);
        setField(term160186, term160186.getClass(), "blockedWindows", null);
        setField(term160186, term160186.getClass(), "title", null);
        setField(term160186, term160186.getClass(), "modalFilter", null);
        setField(term160186, term160186.getClass(), "secondaryLoop", null);
        setBooleanField(term160186, term160186.getClass(), "isInHide", false);
        setBooleanField(term160186, term160186.getClass(), "isInDispose", false);
        setField(term160186, term160186.getClass(), "warningString", null);
        setField(term160186, term160186.getClass(), "icons", null);
        setField(term160186, term160186.getClass(), "temporaryLostComponent", null);
        setBooleanField(term160186, term160186.getClass(), "syncLWRequests", false);
        setBooleanField(term160186, term160186.getClass(), "beforeFirstShow", false);
        setBooleanField(term160186, term160186.getClass(), "disposing", false);
        setField(term160186, term160186.getClass(), "disposerRecord", null);
        setIntField(term160186, term160186.getClass(), "state", 0);
        setBooleanField(term160186, term160186.getClass(), "alwaysOnTop", false);
        setField(term160186, term160186.getClass(), "ownedWindowList", null);
        setField(term160186, term160186.getClass(), "weakThis", null);
        setBooleanField(term160186, term160186.getClass(), "showWithParent", false);
        setField(term160186, term160186.getClass(), "modalBlocker", null);
        setField(term160186, term160186.getClass(), "modalExclusionType", null);
        setField(term160186, term160186.getClass(), "windowListener", null);
        setField(term160186, term160186.getClass(), "windowStateListener", null);
        setField(term160186, term160186.getClass(), "windowFocusListener", null);
        setField(term160186, term160186.getClass(), "inputContext", null);
        setField(term160186, term160186.getClass(), "inputContextLock", null);
        setField(term160186, term160186.getClass(), "focusMgr", null);
        setBooleanField(term160186, term160186.getClass(), "focusableWindowState", false);
        setBooleanField(term160186, term160186.getClass(), "autoRequestFocus", false);
        setBooleanField(term160186, term160186.getClass(), "isInShow", false);
        setFloatField(term160186, term160186.getClass(), "opacity", 0.0F);
        setField(term160186, term160186.getClass(), "shape", null);
        setBooleanField(term160186, term160186.getClass(), "isTrayIconWindow", false);
        setIntField(term160186, term160186.getClass(), "securityWarningWidth", 0);
        setIntField(term160186, term160186.getClass(), "securityWarningHeight", 0);
        setDoubleField(term160186, term160186.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term160186, term160186.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term160186, term160186.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term160186, term160186.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term160186, term160186.getClass(), "anchor", null);
        setField(term160186, term160186.getClass(), "type", null);
        setIntField(term160186, term160186.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term160186, term160186.getClass(), "locationByPlatform", false);
        setField(term160186, term160186.getClass(), "component", null);
        setField(term160186, term160186.getClass(), "layoutMgr", null);
        setField(term160186, term160186.getClass(), "dispatcher", null);
        setField(term160186, term160186.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term160186, term160186.getClass(), "focusCycleRoot", false);
        setBooleanField(term160186, term160186.getClass(), "focusTraversalPolicyProvider", false);
        setField(term160186, term160186.getClass(), "printingThreads", null);
        setBooleanField(term160186, term160186.getClass(), "printing", false);
        setField(term160186, term160186.getClass(), "containerListener", null);
        setIntField(term160186, term160186.getClass(), "listeningChildren", 0);
        setIntField(term160186, term160186.getClass(), "listeningBoundsChildren", 0);
        setIntField(term160186, term160186.getClass(), "descendantsCount", 0);
        setField(term160186, term160186.getClass(), "preserveBackgroundColor", null);
        setIntField(term160186, term160186.getClass(), "numOfHWComponents", 0);
        setIntField(term160186, term160186.getClass(), "numOfLWComponents", 0);
        setField(term160186, term160186.getClass(), "modalComp", null);
        setField(term160186, term160186.getClass(), "modalAppContext", null);
        setIntField(term160186, term160186.getClass(), "containerSerializedDataVersion", 0);
        setField(term160186, term160186.getClass(), "peer", null);
        setField(term160186, term160186.getClass(), "parent", null);
        setField(term160186, term160186.getClass(), "appContext", null);
        setIntField(term160186, term160186.getClass(), "x", 0);
        setIntField(term160186, term160186.getClass(), "y", 0);
        setIntField(term160186, term160186.getClass(), "width", 0);
        setIntField(term160186, term160186.getClass(), "height", 0);
        setField(term160186, term160186.getClass(), "foreground", null);
        setField(term160186, term160186.getClass(), "background", null);
        setField(term160186, term160186.getClass(), "font", null);
        setField(term160186, term160186.getClass(), "peerFont", null);
        setField(term160186, term160186.getClass(), "cursor", null);
        setField(term160186, term160186.getClass(), "locale", null);
        setField(term160186, term160186.getClass(), "graphicsConfig", null);
        setField(term160186, term160186.getClass(), "bufferStrategy", null);
        setBooleanField(term160186, term160186.getClass(), "ignoreRepaint", false);
        setBooleanField(term160186, term160186.getClass(), "visible", false);
        setBooleanField(term160186, term160186.getClass(), "enabled", false);
        setBooleanField(term160186, term160186.getClass(), "valid", false);
        setField(term160186, term160186.getClass(), "dropTarget", null);
        setField(term160186, term160186.getClass(), "popups", null);
        setField(term160186, term160186.getClass(), "name", null);
        setBooleanField(term160186, term160186.getClass(), "nameExplicitlySet", false);
        setBooleanField(term160186, term160186.getClass(), "focusable", false);
        setIntField(term160186, term160186.getClass(), "isFocusTraversableOverridden", 0);
        setField(term160186, term160186.getClass(), "focusTraversalKeys", null);
        setBooleanField(term160186, term160186.getClass(), "focusTraversalKeysEnabled", false);
        setField(term160186, term160186.getClass(), "acc", null);
        setField(term160186, term160186.getClass(), "minSize", null);
        setBooleanField(term160186, term160186.getClass(), "minSizeSet", false);
        setField(term160186, term160186.getClass(), "prefSize", null);
        setBooleanField(term160186, term160186.getClass(), "prefSizeSet", false);
        setField(term160186, term160186.getClass(), "maxSize", null);
        setBooleanField(term160186, term160186.getClass(), "maxSizeSet", false);
        setField(term160186, term160186.getClass(), "componentOrientation", null);
        setBooleanField(term160186, term160186.getClass(), "newEventsOnly", false);
        setField(term160186, term160186.getClass(), "componentListener", null);
        setField(term160186, term160186.getClass(), "focusListener", null);
        setField(term160186, term160186.getClass(), "hierarchyListener", null);
        setField(term160186, term160186.getClass(), "hierarchyBoundsListener", null);
        setField(term160186, term160186.getClass(), "keyListener", null);
        setField(term160186, term160186.getClass(), "mouseListener", null);
        setField(term160186, term160186.getClass(), "mouseMotionListener", null);
        setField(term160186, term160186.getClass(), "mouseWheelListener", null);
        setField(term160186, term160186.getClass(), "inputMethodListener", null);
        setLongField(term160186, term160186.getClass(), "eventMask", 0L);
        setField(term160186, term160186.getClass(), "changeSupport", null);
        setField(term160186, term160186.getClass(), "objectLock", null);
        setBooleanField(term160186, term160186.getClass(), "isPacked", false);
        setIntField(term160186, term160186.getClass(), "boundsOp", 0);
        setField(term160186, term160186.getClass(), "compoundShape", null);
        setField(term160186, term160186.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term160186, term160186.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term160186, term160186.getClass(), "backgroundEraseDisabled", false);
        setField(term160186, term160186.getClass(), "eventCache", null);
        setBooleanField(term160186, term160186.getClass(), "coalescingEnabled", false);
        setBooleanField(term160186, term160186.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term160186, term160186.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.exhibition.AssignmentExhibition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newValueLabel", argTypes, term160186, args);
    }

};


