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

public class AssignmentExhibition_newHintLabel_15459450794 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1029;

    public AssignmentExhibition_newHintLabel_15459450794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1029 = newInstance(Class.forName("core.task.exhibition.AssignmentExhibition"));
        setIntField(term1029, term1029.getClass(), "defaultCloseOperation", 0);
        setField(term1029, term1029.getClass(), "rootPane", null);
        setBooleanField(term1029, term1029.getClass(), "rootPaneCheckingEnabled", false);
        setField(term1029, term1029.getClass(), "transferHandler", null);
        setField(term1029, term1029.getClass(), "accessibleContext", null);
        setBooleanField(term1029, term1029.getClass(), "resizable", false);
        setBooleanField(term1029, term1029.getClass(), "undecorated", false);
        setBooleanField(term1029, term1029.getClass(), "initialized", false);
        setBooleanField(term1029, term1029.getClass(), "modal", false);
        setField(term1029, term1029.getClass(), "modalityType", null);
        setField(term1029, term1029.getClass(), "blockedWindows", null);
        setField(term1029, term1029.getClass(), "title", null);
        setField(term1029, term1029.getClass(), "modalFilter", null);
        setField(term1029, term1029.getClass(), "secondaryLoop", null);
        setBooleanField(term1029, term1029.getClass(), "isInHide", false);
        setBooleanField(term1029, term1029.getClass(), "isInDispose", false);
        setField(term1029, term1029.getClass(), "warningString", null);
        setField(term1029, term1029.getClass(), "icons", null);
        setField(term1029, term1029.getClass(), "temporaryLostComponent", null);
        setBooleanField(term1029, term1029.getClass(), "syncLWRequests", false);
        setBooleanField(term1029, term1029.getClass(), "beforeFirstShow", false);
        setBooleanField(term1029, term1029.getClass(), "disposing", false);
        setField(term1029, term1029.getClass(), "disposerRecord", null);
        setIntField(term1029, term1029.getClass(), "state", 0);
        setBooleanField(term1029, term1029.getClass(), "alwaysOnTop", false);
        setField(term1029, term1029.getClass(), "ownedWindowList", null);
        setField(term1029, term1029.getClass(), "weakThis", null);
        setBooleanField(term1029, term1029.getClass(), "showWithParent", false);
        setField(term1029, term1029.getClass(), "modalBlocker", null);
        setField(term1029, term1029.getClass(), "modalExclusionType", null);
        setField(term1029, term1029.getClass(), "windowListener", null);
        setField(term1029, term1029.getClass(), "windowStateListener", null);
        setField(term1029, term1029.getClass(), "windowFocusListener", null);
        setField(term1029, term1029.getClass(), "inputContext", null);
        setField(term1029, term1029.getClass(), "inputContextLock", null);
        setField(term1029, term1029.getClass(), "focusMgr", null);
        setBooleanField(term1029, term1029.getClass(), "focusableWindowState", false);
        setBooleanField(term1029, term1029.getClass(), "autoRequestFocus", false);
        setBooleanField(term1029, term1029.getClass(), "isInShow", false);
        setFloatField(term1029, term1029.getClass(), "opacity", 0.0F);
        setField(term1029, term1029.getClass(), "shape", null);
        setBooleanField(term1029, term1029.getClass(), "isTrayIconWindow", false);
        setIntField(term1029, term1029.getClass(), "securityWarningWidth", 0);
        setIntField(term1029, term1029.getClass(), "securityWarningHeight", 0);
        setDoubleField(term1029, term1029.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term1029, term1029.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term1029, term1029.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term1029, term1029.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term1029, term1029.getClass(), "anchor", null);
        setField(term1029, term1029.getClass(), "type", null);
        setIntField(term1029, term1029.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term1029, term1029.getClass(), "locationByPlatform", false);
        setField(term1029, term1029.getClass(), "component", null);
        setField(term1029, term1029.getClass(), "layoutMgr", null);
        setField(term1029, term1029.getClass(), "dispatcher", null);
        setField(term1029, term1029.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1029, term1029.getClass(), "focusCycleRoot", false);
        setBooleanField(term1029, term1029.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1029, term1029.getClass(), "printingThreads", null);
        setBooleanField(term1029, term1029.getClass(), "printing", false);
        setField(term1029, term1029.getClass(), "containerListener", null);
        setIntField(term1029, term1029.getClass(), "listeningChildren", 0);
        setIntField(term1029, term1029.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1029, term1029.getClass(), "descendantsCount", 0);
        setField(term1029, term1029.getClass(), "preserveBackgroundColor", null);
        setIntField(term1029, term1029.getClass(), "numOfHWComponents", 0);
        setIntField(term1029, term1029.getClass(), "numOfLWComponents", 0);
        setField(term1029, term1029.getClass(), "modalComp", null);
        setField(term1029, term1029.getClass(), "modalAppContext", null);
        setIntField(term1029, term1029.getClass(), "containerSerializedDataVersion", 0);
        setField(term1029, term1029.getClass(), "peer", null);
        setField(term1029, term1029.getClass(), "parent", null);
        setField(term1029, term1029.getClass(), "appContext", null);
        setIntField(term1029, term1029.getClass(), "x", 0);
        setIntField(term1029, term1029.getClass(), "y", 0);
        setIntField(term1029, term1029.getClass(), "width", 0);
        setIntField(term1029, term1029.getClass(), "height", 0);
        setField(term1029, term1029.getClass(), "foreground", null);
        setField(term1029, term1029.getClass(), "background", null);
        setField(term1029, term1029.getClass(), "font", null);
        setField(term1029, term1029.getClass(), "peerFont", null);
        setField(term1029, term1029.getClass(), "cursor", null);
        setField(term1029, term1029.getClass(), "locale", null);
        setField(term1029, term1029.getClass(), "graphicsConfig", null);
        setField(term1029, term1029.getClass(), "bufferStrategy", null);
        setBooleanField(term1029, term1029.getClass(), "ignoreRepaint", false);
        setBooleanField(term1029, term1029.getClass(), "visible", false);
        setBooleanField(term1029, term1029.getClass(), "enabled", false);
        setBooleanField(term1029, term1029.getClass(), "valid", false);
        setField(term1029, term1029.getClass(), "dropTarget", null);
        setField(term1029, term1029.getClass(), "popups", null);
        setField(term1029, term1029.getClass(), "name", null);
        setBooleanField(term1029, term1029.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1029, term1029.getClass(), "focusable", false);
        setIntField(term1029, term1029.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1029, term1029.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1029, term1029.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1029, term1029.getClass(), "acc", null);
        setField(term1029, term1029.getClass(), "minSize", null);
        setBooleanField(term1029, term1029.getClass(), "minSizeSet", false);
        setField(term1029, term1029.getClass(), "prefSize", null);
        setBooleanField(term1029, term1029.getClass(), "prefSizeSet", false);
        setField(term1029, term1029.getClass(), "maxSize", null);
        setBooleanField(term1029, term1029.getClass(), "maxSizeSet", false);
        setField(term1029, term1029.getClass(), "componentOrientation", null);
        setBooleanField(term1029, term1029.getClass(), "newEventsOnly", false);
        setField(term1029, term1029.getClass(), "componentListener", null);
        setField(term1029, term1029.getClass(), "focusListener", null);
        setField(term1029, term1029.getClass(), "hierarchyListener", null);
        setField(term1029, term1029.getClass(), "hierarchyBoundsListener", null);
        setField(term1029, term1029.getClass(), "keyListener", null);
        setField(term1029, term1029.getClass(), "mouseListener", null);
        setField(term1029, term1029.getClass(), "mouseMotionListener", null);
        setField(term1029, term1029.getClass(), "mouseWheelListener", null);
        setField(term1029, term1029.getClass(), "inputMethodListener", null);
        setLongField(term1029, term1029.getClass(), "eventMask", 0L);
        setField(term1029, term1029.getClass(), "changeSupport", null);
        setField(term1029, term1029.getClass(), "objectLock", null);
        setBooleanField(term1029, term1029.getClass(), "isPacked", false);
        setIntField(term1029, term1029.getClass(), "boundsOp", 0);
        setField(term1029, term1029.getClass(), "compoundShape", null);
        setField(term1029, term1029.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1029, term1029.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1029, term1029.getClass(), "backgroundEraseDisabled", false);
        setField(term1029, term1029.getClass(), "eventCache", null);
        setBooleanField(term1029, term1029.getClass(), "coalescingEnabled", false);
        setBooleanField(term1029, term1029.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1029, term1029.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.exhibition.AssignmentExhibition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newHintLabel", argTypes, term1029, args);
    }

};


