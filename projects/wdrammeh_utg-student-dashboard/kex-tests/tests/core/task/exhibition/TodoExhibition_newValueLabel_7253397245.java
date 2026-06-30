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

public class TodoExhibition_newValueLabel_7253397245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7012;

    public TodoExhibition_newValueLabel_7253397245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7012 = newInstance(Class.forName("core.task.exhibition.TodoExhibition"));
        setIntField(term7012, term7012.getClass(), "defaultCloseOperation", 0);
        setField(term7012, term7012.getClass(), "rootPane", null);
        setBooleanField(term7012, term7012.getClass(), "rootPaneCheckingEnabled", false);
        setField(term7012, term7012.getClass(), "transferHandler", null);
        setField(term7012, term7012.getClass(), "accessibleContext", null);
        setBooleanField(term7012, term7012.getClass(), "resizable", false);
        setBooleanField(term7012, term7012.getClass(), "undecorated", false);
        setBooleanField(term7012, term7012.getClass(), "initialized", false);
        setBooleanField(term7012, term7012.getClass(), "modal", false);
        setField(term7012, term7012.getClass(), "modalityType", null);
        setField(term7012, term7012.getClass(), "blockedWindows", null);
        setField(term7012, term7012.getClass(), "title", null);
        setField(term7012, term7012.getClass(), "modalFilter", null);
        setField(term7012, term7012.getClass(), "secondaryLoop", null);
        setBooleanField(term7012, term7012.getClass(), "isInHide", false);
        setBooleanField(term7012, term7012.getClass(), "isInDispose", false);
        setField(term7012, term7012.getClass(), "warningString", null);
        setField(term7012, term7012.getClass(), "icons", null);
        setField(term7012, term7012.getClass(), "temporaryLostComponent", null);
        setBooleanField(term7012, term7012.getClass(), "syncLWRequests", false);
        setBooleanField(term7012, term7012.getClass(), "beforeFirstShow", false);
        setBooleanField(term7012, term7012.getClass(), "disposing", false);
        setField(term7012, term7012.getClass(), "disposerRecord", null);
        setIntField(term7012, term7012.getClass(), "state", 0);
        setBooleanField(term7012, term7012.getClass(), "alwaysOnTop", false);
        setField(term7012, term7012.getClass(), "ownedWindowList", null);
        setField(term7012, term7012.getClass(), "weakThis", null);
        setBooleanField(term7012, term7012.getClass(), "showWithParent", false);
        setField(term7012, term7012.getClass(), "modalBlocker", null);
        setField(term7012, term7012.getClass(), "modalExclusionType", null);
        setField(term7012, term7012.getClass(), "windowListener", null);
        setField(term7012, term7012.getClass(), "windowStateListener", null);
        setField(term7012, term7012.getClass(), "windowFocusListener", null);
        setField(term7012, term7012.getClass(), "inputContext", null);
        setField(term7012, term7012.getClass(), "inputContextLock", null);
        setField(term7012, term7012.getClass(), "focusMgr", null);
        setBooleanField(term7012, term7012.getClass(), "focusableWindowState", false);
        setBooleanField(term7012, term7012.getClass(), "autoRequestFocus", false);
        setBooleanField(term7012, term7012.getClass(), "isInShow", false);
        setFloatField(term7012, term7012.getClass(), "opacity", 0.0F);
        setField(term7012, term7012.getClass(), "shape", null);
        setBooleanField(term7012, term7012.getClass(), "isTrayIconWindow", false);
        setIntField(term7012, term7012.getClass(), "securityWarningWidth", 0);
        setIntField(term7012, term7012.getClass(), "securityWarningHeight", 0);
        setDoubleField(term7012, term7012.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term7012, term7012.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term7012, term7012.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term7012, term7012.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term7012, term7012.getClass(), "anchor", null);
        setField(term7012, term7012.getClass(), "type", null);
        setIntField(term7012, term7012.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term7012, term7012.getClass(), "locationByPlatform", false);
        setField(term7012, term7012.getClass(), "component", null);
        setField(term7012, term7012.getClass(), "layoutMgr", null);
        setField(term7012, term7012.getClass(), "dispatcher", null);
        setField(term7012, term7012.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term7012, term7012.getClass(), "focusCycleRoot", false);
        setBooleanField(term7012, term7012.getClass(), "focusTraversalPolicyProvider", false);
        setField(term7012, term7012.getClass(), "printingThreads", null);
        setBooleanField(term7012, term7012.getClass(), "printing", false);
        setField(term7012, term7012.getClass(), "containerListener", null);
        setIntField(term7012, term7012.getClass(), "listeningChildren", 0);
        setIntField(term7012, term7012.getClass(), "listeningBoundsChildren", 0);
        setIntField(term7012, term7012.getClass(), "descendantsCount", 0);
        setField(term7012, term7012.getClass(), "preserveBackgroundColor", null);
        setIntField(term7012, term7012.getClass(), "numOfHWComponents", 0);
        setIntField(term7012, term7012.getClass(), "numOfLWComponents", 0);
        setField(term7012, term7012.getClass(), "modalComp", null);
        setField(term7012, term7012.getClass(), "modalAppContext", null);
        setIntField(term7012, term7012.getClass(), "containerSerializedDataVersion", 0);
        setField(term7012, term7012.getClass(), "peer", null);
        setField(term7012, term7012.getClass(), "parent", null);
        setField(term7012, term7012.getClass(), "appContext", null);
        setIntField(term7012, term7012.getClass(), "x", 0);
        setIntField(term7012, term7012.getClass(), "y", 0);
        setIntField(term7012, term7012.getClass(), "width", 0);
        setIntField(term7012, term7012.getClass(), "height", 0);
        setField(term7012, term7012.getClass(), "foreground", null);
        setField(term7012, term7012.getClass(), "background", null);
        setField(term7012, term7012.getClass(), "font", null);
        setField(term7012, term7012.getClass(), "peerFont", null);
        setField(term7012, term7012.getClass(), "cursor", null);
        setField(term7012, term7012.getClass(), "locale", null);
        setField(term7012, term7012.getClass(), "graphicsConfig", null);
        setField(term7012, term7012.getClass(), "bufferStrategy", null);
        setBooleanField(term7012, term7012.getClass(), "ignoreRepaint", false);
        setBooleanField(term7012, term7012.getClass(), "visible", false);
        setBooleanField(term7012, term7012.getClass(), "enabled", false);
        setBooleanField(term7012, term7012.getClass(), "valid", false);
        setField(term7012, term7012.getClass(), "dropTarget", null);
        setField(term7012, term7012.getClass(), "popups", null);
        setField(term7012, term7012.getClass(), "name", null);
        setBooleanField(term7012, term7012.getClass(), "nameExplicitlySet", false);
        setBooleanField(term7012, term7012.getClass(), "focusable", false);
        setIntField(term7012, term7012.getClass(), "isFocusTraversableOverridden", 0);
        setField(term7012, term7012.getClass(), "focusTraversalKeys", null);
        setBooleanField(term7012, term7012.getClass(), "focusTraversalKeysEnabled", false);
        setField(term7012, term7012.getClass(), "acc", null);
        setField(term7012, term7012.getClass(), "minSize", null);
        setBooleanField(term7012, term7012.getClass(), "minSizeSet", false);
        setField(term7012, term7012.getClass(), "prefSize", null);
        setBooleanField(term7012, term7012.getClass(), "prefSizeSet", false);
        setField(term7012, term7012.getClass(), "maxSize", null);
        setBooleanField(term7012, term7012.getClass(), "maxSizeSet", false);
        setField(term7012, term7012.getClass(), "componentOrientation", null);
        setBooleanField(term7012, term7012.getClass(), "newEventsOnly", false);
        setField(term7012, term7012.getClass(), "componentListener", null);
        setField(term7012, term7012.getClass(), "focusListener", null);
        setField(term7012, term7012.getClass(), "hierarchyListener", null);
        setField(term7012, term7012.getClass(), "hierarchyBoundsListener", null);
        setField(term7012, term7012.getClass(), "keyListener", null);
        setField(term7012, term7012.getClass(), "mouseListener", null);
        setField(term7012, term7012.getClass(), "mouseMotionListener", null);
        setField(term7012, term7012.getClass(), "mouseWheelListener", null);
        setField(term7012, term7012.getClass(), "inputMethodListener", null);
        setLongField(term7012, term7012.getClass(), "eventMask", 0L);
        setField(term7012, term7012.getClass(), "changeSupport", null);
        setField(term7012, term7012.getClass(), "objectLock", null);
        setBooleanField(term7012, term7012.getClass(), "isPacked", false);
        setIntField(term7012, term7012.getClass(), "boundsOp", 0);
        setField(term7012, term7012.getClass(), "compoundShape", null);
        setField(term7012, term7012.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term7012, term7012.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term7012, term7012.getClass(), "backgroundEraseDisabled", false);
        setField(term7012, term7012.getClass(), "eventCache", null);
        setBooleanField(term7012, term7012.getClass(), "coalescingEnabled", false);
        setBooleanField(term7012, term7012.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term7012, term7012.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.exhibition.TodoExhibition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newValueLabel", argTypes, term7012, args);
    }

};


