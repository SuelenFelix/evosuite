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
     Object term160125;

    public AssignmentExhibition_newHintLabel_15459450794() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160125 = newInstance(Class.forName("core.task.exhibition.AssignmentExhibition"));
        setIntField(term160125, term160125.getClass(), "defaultCloseOperation", 0);
        setField(term160125, term160125.getClass(), "rootPane", null);
        setBooleanField(term160125, term160125.getClass(), "rootPaneCheckingEnabled", false);
        setField(term160125, term160125.getClass(), "transferHandler", null);
        setField(term160125, term160125.getClass(), "accessibleContext", null);
        setBooleanField(term160125, term160125.getClass(), "resizable", false);
        setBooleanField(term160125, term160125.getClass(), "undecorated", false);
        setBooleanField(term160125, term160125.getClass(), "initialized", false);
        setBooleanField(term160125, term160125.getClass(), "modal", false);
        setField(term160125, term160125.getClass(), "modalityType", null);
        setField(term160125, term160125.getClass(), "blockedWindows", null);
        setField(term160125, term160125.getClass(), "title", null);
        setField(term160125, term160125.getClass(), "modalFilter", null);
        setField(term160125, term160125.getClass(), "secondaryLoop", null);
        setBooleanField(term160125, term160125.getClass(), "isInHide", false);
        setBooleanField(term160125, term160125.getClass(), "isInDispose", false);
        setField(term160125, term160125.getClass(), "warningString", null);
        setField(term160125, term160125.getClass(), "icons", null);
        setField(term160125, term160125.getClass(), "temporaryLostComponent", null);
        setBooleanField(term160125, term160125.getClass(), "syncLWRequests", false);
        setBooleanField(term160125, term160125.getClass(), "beforeFirstShow", false);
        setBooleanField(term160125, term160125.getClass(), "disposing", false);
        setField(term160125, term160125.getClass(), "disposerRecord", null);
        setIntField(term160125, term160125.getClass(), "state", 0);
        setBooleanField(term160125, term160125.getClass(), "alwaysOnTop", false);
        setField(term160125, term160125.getClass(), "ownedWindowList", null);
        setField(term160125, term160125.getClass(), "weakThis", null);
        setBooleanField(term160125, term160125.getClass(), "showWithParent", false);
        setField(term160125, term160125.getClass(), "modalBlocker", null);
        setField(term160125, term160125.getClass(), "modalExclusionType", null);
        setField(term160125, term160125.getClass(), "windowListener", null);
        setField(term160125, term160125.getClass(), "windowStateListener", null);
        setField(term160125, term160125.getClass(), "windowFocusListener", null);
        setField(term160125, term160125.getClass(), "inputContext", null);
        setField(term160125, term160125.getClass(), "inputContextLock", null);
        setField(term160125, term160125.getClass(), "focusMgr", null);
        setBooleanField(term160125, term160125.getClass(), "focusableWindowState", false);
        setBooleanField(term160125, term160125.getClass(), "autoRequestFocus", false);
        setBooleanField(term160125, term160125.getClass(), "isInShow", false);
        setFloatField(term160125, term160125.getClass(), "opacity", 0.0F);
        setField(term160125, term160125.getClass(), "shape", null);
        setBooleanField(term160125, term160125.getClass(), "isTrayIconWindow", false);
        setIntField(term160125, term160125.getClass(), "securityWarningWidth", 0);
        setIntField(term160125, term160125.getClass(), "securityWarningHeight", 0);
        setDoubleField(term160125, term160125.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term160125, term160125.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term160125, term160125.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term160125, term160125.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term160125, term160125.getClass(), "anchor", null);
        setField(term160125, term160125.getClass(), "type", null);
        setIntField(term160125, term160125.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term160125, term160125.getClass(), "locationByPlatform", false);
        setField(term160125, term160125.getClass(), "component", null);
        setField(term160125, term160125.getClass(), "layoutMgr", null);
        setField(term160125, term160125.getClass(), "dispatcher", null);
        setField(term160125, term160125.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term160125, term160125.getClass(), "focusCycleRoot", false);
        setBooleanField(term160125, term160125.getClass(), "focusTraversalPolicyProvider", false);
        setField(term160125, term160125.getClass(), "printingThreads", null);
        setBooleanField(term160125, term160125.getClass(), "printing", false);
        setField(term160125, term160125.getClass(), "containerListener", null);
        setIntField(term160125, term160125.getClass(), "listeningChildren", 0);
        setIntField(term160125, term160125.getClass(), "listeningBoundsChildren", 0);
        setIntField(term160125, term160125.getClass(), "descendantsCount", 0);
        setField(term160125, term160125.getClass(), "preserveBackgroundColor", null);
        setIntField(term160125, term160125.getClass(), "numOfHWComponents", 0);
        setIntField(term160125, term160125.getClass(), "numOfLWComponents", 0);
        setField(term160125, term160125.getClass(), "modalComp", null);
        setField(term160125, term160125.getClass(), "modalAppContext", null);
        setIntField(term160125, term160125.getClass(), "containerSerializedDataVersion", 0);
        setField(term160125, term160125.getClass(), "peer", null);
        setField(term160125, term160125.getClass(), "parent", null);
        setField(term160125, term160125.getClass(), "appContext", null);
        setIntField(term160125, term160125.getClass(), "x", 0);
        setIntField(term160125, term160125.getClass(), "y", 0);
        setIntField(term160125, term160125.getClass(), "width", 0);
        setIntField(term160125, term160125.getClass(), "height", 0);
        setField(term160125, term160125.getClass(), "foreground", null);
        setField(term160125, term160125.getClass(), "background", null);
        setField(term160125, term160125.getClass(), "font", null);
        setField(term160125, term160125.getClass(), "peerFont", null);
        setField(term160125, term160125.getClass(), "cursor", null);
        setField(term160125, term160125.getClass(), "locale", null);
        setField(term160125, term160125.getClass(), "graphicsConfig", null);
        setField(term160125, term160125.getClass(), "bufferStrategy", null);
        setBooleanField(term160125, term160125.getClass(), "ignoreRepaint", false);
        setBooleanField(term160125, term160125.getClass(), "visible", false);
        setBooleanField(term160125, term160125.getClass(), "enabled", false);
        setBooleanField(term160125, term160125.getClass(), "valid", false);
        setField(term160125, term160125.getClass(), "dropTarget", null);
        setField(term160125, term160125.getClass(), "popups", null);
        setField(term160125, term160125.getClass(), "name", null);
        setBooleanField(term160125, term160125.getClass(), "nameExplicitlySet", false);
        setBooleanField(term160125, term160125.getClass(), "focusable", false);
        setIntField(term160125, term160125.getClass(), "isFocusTraversableOverridden", 0);
        setField(term160125, term160125.getClass(), "focusTraversalKeys", null);
        setBooleanField(term160125, term160125.getClass(), "focusTraversalKeysEnabled", false);
        setField(term160125, term160125.getClass(), "acc", null);
        setField(term160125, term160125.getClass(), "minSize", null);
        setBooleanField(term160125, term160125.getClass(), "minSizeSet", false);
        setField(term160125, term160125.getClass(), "prefSize", null);
        setBooleanField(term160125, term160125.getClass(), "prefSizeSet", false);
        setField(term160125, term160125.getClass(), "maxSize", null);
        setBooleanField(term160125, term160125.getClass(), "maxSizeSet", false);
        setField(term160125, term160125.getClass(), "componentOrientation", null);
        setBooleanField(term160125, term160125.getClass(), "newEventsOnly", false);
        setField(term160125, term160125.getClass(), "componentListener", null);
        setField(term160125, term160125.getClass(), "focusListener", null);
        setField(term160125, term160125.getClass(), "hierarchyListener", null);
        setField(term160125, term160125.getClass(), "hierarchyBoundsListener", null);
        setField(term160125, term160125.getClass(), "keyListener", null);
        setField(term160125, term160125.getClass(), "mouseListener", null);
        setField(term160125, term160125.getClass(), "mouseMotionListener", null);
        setField(term160125, term160125.getClass(), "mouseWheelListener", null);
        setField(term160125, term160125.getClass(), "inputMethodListener", null);
        setLongField(term160125, term160125.getClass(), "eventMask", 0L);
        setField(term160125, term160125.getClass(), "changeSupport", null);
        setField(term160125, term160125.getClass(), "objectLock", null);
        setBooleanField(term160125, term160125.getClass(), "isPacked", false);
        setIntField(term160125, term160125.getClass(), "boundsOp", 0);
        setField(term160125, term160125.getClass(), "compoundShape", null);
        setField(term160125, term160125.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term160125, term160125.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term160125, term160125.getClass(), "backgroundEraseDisabled", false);
        setField(term160125, term160125.getClass(), "eventCache", null);
        setBooleanField(term160125, term160125.getClass(), "coalescingEnabled", false);
        setBooleanField(term160125, term160125.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term160125, term160125.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.exhibition.AssignmentExhibition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newHintLabel", argTypes, term160125, args);
    }

};


