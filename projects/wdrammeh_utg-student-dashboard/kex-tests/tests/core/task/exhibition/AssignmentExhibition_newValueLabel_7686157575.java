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
     Object term1090;

    public AssignmentExhibition_newValueLabel_7686157575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1090 = newInstance(Class.forName("core.task.exhibition.AssignmentExhibition"));
        setIntField(term1090, term1090.getClass(), "defaultCloseOperation", 0);
        setField(term1090, term1090.getClass(), "rootPane", null);
        setBooleanField(term1090, term1090.getClass(), "rootPaneCheckingEnabled", false);
        setField(term1090, term1090.getClass(), "transferHandler", null);
        setField(term1090, term1090.getClass(), "accessibleContext", null);
        setBooleanField(term1090, term1090.getClass(), "resizable", false);
        setBooleanField(term1090, term1090.getClass(), "undecorated", false);
        setBooleanField(term1090, term1090.getClass(), "initialized", false);
        setBooleanField(term1090, term1090.getClass(), "modal", false);
        setField(term1090, term1090.getClass(), "modalityType", null);
        setField(term1090, term1090.getClass(), "blockedWindows", null);
        setField(term1090, term1090.getClass(), "title", null);
        setField(term1090, term1090.getClass(), "modalFilter", null);
        setField(term1090, term1090.getClass(), "secondaryLoop", null);
        setBooleanField(term1090, term1090.getClass(), "isInHide", false);
        setBooleanField(term1090, term1090.getClass(), "isInDispose", false);
        setField(term1090, term1090.getClass(), "warningString", null);
        setField(term1090, term1090.getClass(), "icons", null);
        setField(term1090, term1090.getClass(), "temporaryLostComponent", null);
        setBooleanField(term1090, term1090.getClass(), "syncLWRequests", false);
        setBooleanField(term1090, term1090.getClass(), "beforeFirstShow", false);
        setBooleanField(term1090, term1090.getClass(), "disposing", false);
        setField(term1090, term1090.getClass(), "disposerRecord", null);
        setIntField(term1090, term1090.getClass(), "state", 0);
        setBooleanField(term1090, term1090.getClass(), "alwaysOnTop", false);
        setField(term1090, term1090.getClass(), "ownedWindowList", null);
        setField(term1090, term1090.getClass(), "weakThis", null);
        setBooleanField(term1090, term1090.getClass(), "showWithParent", false);
        setField(term1090, term1090.getClass(), "modalBlocker", null);
        setField(term1090, term1090.getClass(), "modalExclusionType", null);
        setField(term1090, term1090.getClass(), "windowListener", null);
        setField(term1090, term1090.getClass(), "windowStateListener", null);
        setField(term1090, term1090.getClass(), "windowFocusListener", null);
        setField(term1090, term1090.getClass(), "inputContext", null);
        setField(term1090, term1090.getClass(), "inputContextLock", null);
        setField(term1090, term1090.getClass(), "focusMgr", null);
        setBooleanField(term1090, term1090.getClass(), "focusableWindowState", false);
        setBooleanField(term1090, term1090.getClass(), "autoRequestFocus", false);
        setBooleanField(term1090, term1090.getClass(), "isInShow", false);
        setFloatField(term1090, term1090.getClass(), "opacity", 0.0F);
        setField(term1090, term1090.getClass(), "shape", null);
        setBooleanField(term1090, term1090.getClass(), "isTrayIconWindow", false);
        setIntField(term1090, term1090.getClass(), "securityWarningWidth", 0);
        setIntField(term1090, term1090.getClass(), "securityWarningHeight", 0);
        setDoubleField(term1090, term1090.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term1090, term1090.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term1090, term1090.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term1090, term1090.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term1090, term1090.getClass(), "anchor", null);
        setField(term1090, term1090.getClass(), "type", null);
        setIntField(term1090, term1090.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term1090, term1090.getClass(), "locationByPlatform", false);
        setField(term1090, term1090.getClass(), "component", null);
        setField(term1090, term1090.getClass(), "layoutMgr", null);
        setField(term1090, term1090.getClass(), "dispatcher", null);
        setField(term1090, term1090.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1090, term1090.getClass(), "focusCycleRoot", false);
        setBooleanField(term1090, term1090.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1090, term1090.getClass(), "printingThreads", null);
        setBooleanField(term1090, term1090.getClass(), "printing", false);
        setField(term1090, term1090.getClass(), "containerListener", null);
        setIntField(term1090, term1090.getClass(), "listeningChildren", 0);
        setIntField(term1090, term1090.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1090, term1090.getClass(), "descendantsCount", 0);
        setField(term1090, term1090.getClass(), "preserveBackgroundColor", null);
        setIntField(term1090, term1090.getClass(), "numOfHWComponents", 0);
        setIntField(term1090, term1090.getClass(), "numOfLWComponents", 0);
        setField(term1090, term1090.getClass(), "modalComp", null);
        setField(term1090, term1090.getClass(), "modalAppContext", null);
        setIntField(term1090, term1090.getClass(), "containerSerializedDataVersion", 0);
        setField(term1090, term1090.getClass(), "peer", null);
        setField(term1090, term1090.getClass(), "parent", null);
        setField(term1090, term1090.getClass(), "appContext", null);
        setIntField(term1090, term1090.getClass(), "x", 0);
        setIntField(term1090, term1090.getClass(), "y", 0);
        setIntField(term1090, term1090.getClass(), "width", 0);
        setIntField(term1090, term1090.getClass(), "height", 0);
        setField(term1090, term1090.getClass(), "foreground", null);
        setField(term1090, term1090.getClass(), "background", null);
        setField(term1090, term1090.getClass(), "font", null);
        setField(term1090, term1090.getClass(), "peerFont", null);
        setField(term1090, term1090.getClass(), "cursor", null);
        setField(term1090, term1090.getClass(), "locale", null);
        setField(term1090, term1090.getClass(), "graphicsConfig", null);
        setField(term1090, term1090.getClass(), "bufferStrategy", null);
        setBooleanField(term1090, term1090.getClass(), "ignoreRepaint", false);
        setBooleanField(term1090, term1090.getClass(), "visible", false);
        setBooleanField(term1090, term1090.getClass(), "enabled", false);
        setBooleanField(term1090, term1090.getClass(), "valid", false);
        setField(term1090, term1090.getClass(), "dropTarget", null);
        setField(term1090, term1090.getClass(), "popups", null);
        setField(term1090, term1090.getClass(), "name", null);
        setBooleanField(term1090, term1090.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1090, term1090.getClass(), "focusable", false);
        setIntField(term1090, term1090.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1090, term1090.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1090, term1090.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1090, term1090.getClass(), "acc", null);
        setField(term1090, term1090.getClass(), "minSize", null);
        setBooleanField(term1090, term1090.getClass(), "minSizeSet", false);
        setField(term1090, term1090.getClass(), "prefSize", null);
        setBooleanField(term1090, term1090.getClass(), "prefSizeSet", false);
        setField(term1090, term1090.getClass(), "maxSize", null);
        setBooleanField(term1090, term1090.getClass(), "maxSizeSet", false);
        setField(term1090, term1090.getClass(), "componentOrientation", null);
        setBooleanField(term1090, term1090.getClass(), "newEventsOnly", false);
        setField(term1090, term1090.getClass(), "componentListener", null);
        setField(term1090, term1090.getClass(), "focusListener", null);
        setField(term1090, term1090.getClass(), "hierarchyListener", null);
        setField(term1090, term1090.getClass(), "hierarchyBoundsListener", null);
        setField(term1090, term1090.getClass(), "keyListener", null);
        setField(term1090, term1090.getClass(), "mouseListener", null);
        setField(term1090, term1090.getClass(), "mouseMotionListener", null);
        setField(term1090, term1090.getClass(), "mouseWheelListener", null);
        setField(term1090, term1090.getClass(), "inputMethodListener", null);
        setLongField(term1090, term1090.getClass(), "eventMask", 0L);
        setField(term1090, term1090.getClass(), "changeSupport", null);
        setField(term1090, term1090.getClass(), "objectLock", null);
        setBooleanField(term1090, term1090.getClass(), "isPacked", false);
        setIntField(term1090, term1090.getClass(), "boundsOp", 0);
        setField(term1090, term1090.getClass(), "compoundShape", null);
        setField(term1090, term1090.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1090, term1090.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1090, term1090.getClass(), "backgroundEraseDisabled", false);
        setField(term1090, term1090.getClass(), "eventCache", null);
        setBooleanField(term1090, term1090.getClass(), "coalescingEnabled", false);
        setBooleanField(term1090, term1090.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1090, term1090.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.exhibition.AssignmentExhibition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newValueLabel", argTypes, term1090, args);
    }

};


