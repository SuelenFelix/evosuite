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
     Object term393563;

    public TodoExhibition_newValueLabel_7253397245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term393563 = newInstance(Class.forName("core.task.exhibition.TodoExhibition"));
        setIntField(term393563, term393563.getClass(), "defaultCloseOperation", 0);
        setField(term393563, term393563.getClass(), "rootPane", null);
        setBooleanField(term393563, term393563.getClass(), "rootPaneCheckingEnabled", false);
        setField(term393563, term393563.getClass(), "transferHandler", null);
        setField(term393563, term393563.getClass(), "accessibleContext", null);
        setBooleanField(term393563, term393563.getClass(), "resizable", false);
        setBooleanField(term393563, term393563.getClass(), "undecorated", false);
        setBooleanField(term393563, term393563.getClass(), "initialized", false);
        setBooleanField(term393563, term393563.getClass(), "modal", false);
        setField(term393563, term393563.getClass(), "modalityType", null);
        setField(term393563, term393563.getClass(), "blockedWindows", null);
        setField(term393563, term393563.getClass(), "title", null);
        setField(term393563, term393563.getClass(), "modalFilter", null);
        setField(term393563, term393563.getClass(), "secondaryLoop", null);
        setBooleanField(term393563, term393563.getClass(), "isInHide", false);
        setBooleanField(term393563, term393563.getClass(), "isInDispose", false);
        setField(term393563, term393563.getClass(), "warningString", null);
        setField(term393563, term393563.getClass(), "icons", null);
        setField(term393563, term393563.getClass(), "temporaryLostComponent", null);
        setBooleanField(term393563, term393563.getClass(), "syncLWRequests", false);
        setBooleanField(term393563, term393563.getClass(), "beforeFirstShow", false);
        setBooleanField(term393563, term393563.getClass(), "disposing", false);
        setField(term393563, term393563.getClass(), "disposerRecord", null);
        setIntField(term393563, term393563.getClass(), "state", 0);
        setBooleanField(term393563, term393563.getClass(), "alwaysOnTop", false);
        setField(term393563, term393563.getClass(), "ownedWindowList", null);
        setField(term393563, term393563.getClass(), "weakThis", null);
        setBooleanField(term393563, term393563.getClass(), "showWithParent", false);
        setField(term393563, term393563.getClass(), "modalBlocker", null);
        setField(term393563, term393563.getClass(), "modalExclusionType", null);
        setField(term393563, term393563.getClass(), "windowListener", null);
        setField(term393563, term393563.getClass(), "windowStateListener", null);
        setField(term393563, term393563.getClass(), "windowFocusListener", null);
        setField(term393563, term393563.getClass(), "inputContext", null);
        setField(term393563, term393563.getClass(), "inputContextLock", null);
        setField(term393563, term393563.getClass(), "focusMgr", null);
        setBooleanField(term393563, term393563.getClass(), "focusableWindowState", false);
        setBooleanField(term393563, term393563.getClass(), "autoRequestFocus", false);
        setBooleanField(term393563, term393563.getClass(), "isInShow", false);
        setFloatField(term393563, term393563.getClass(), "opacity", 0.0F);
        setField(term393563, term393563.getClass(), "shape", null);
        setBooleanField(term393563, term393563.getClass(), "isTrayIconWindow", false);
        setIntField(term393563, term393563.getClass(), "securityWarningWidth", 0);
        setIntField(term393563, term393563.getClass(), "securityWarningHeight", 0);
        setDoubleField(term393563, term393563.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term393563, term393563.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term393563, term393563.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term393563, term393563.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term393563, term393563.getClass(), "anchor", null);
        setField(term393563, term393563.getClass(), "type", null);
        setIntField(term393563, term393563.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term393563, term393563.getClass(), "locationByPlatform", false);
        setField(term393563, term393563.getClass(), "component", null);
        setField(term393563, term393563.getClass(), "layoutMgr", null);
        setField(term393563, term393563.getClass(), "dispatcher", null);
        setField(term393563, term393563.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term393563, term393563.getClass(), "focusCycleRoot", false);
        setBooleanField(term393563, term393563.getClass(), "focusTraversalPolicyProvider", false);
        setField(term393563, term393563.getClass(), "printingThreads", null);
        setBooleanField(term393563, term393563.getClass(), "printing", false);
        setField(term393563, term393563.getClass(), "containerListener", null);
        setIntField(term393563, term393563.getClass(), "listeningChildren", 0);
        setIntField(term393563, term393563.getClass(), "listeningBoundsChildren", 0);
        setIntField(term393563, term393563.getClass(), "descendantsCount", 0);
        setField(term393563, term393563.getClass(), "preserveBackgroundColor", null);
        setIntField(term393563, term393563.getClass(), "numOfHWComponents", 0);
        setIntField(term393563, term393563.getClass(), "numOfLWComponents", 0);
        setField(term393563, term393563.getClass(), "modalComp", null);
        setField(term393563, term393563.getClass(), "modalAppContext", null);
        setIntField(term393563, term393563.getClass(), "containerSerializedDataVersion", 0);
        setField(term393563, term393563.getClass(), "peer", null);
        setField(term393563, term393563.getClass(), "parent", null);
        setField(term393563, term393563.getClass(), "appContext", null);
        setIntField(term393563, term393563.getClass(), "x", 0);
        setIntField(term393563, term393563.getClass(), "y", 0);
        setIntField(term393563, term393563.getClass(), "width", 0);
        setIntField(term393563, term393563.getClass(), "height", 0);
        setField(term393563, term393563.getClass(), "foreground", null);
        setField(term393563, term393563.getClass(), "background", null);
        setField(term393563, term393563.getClass(), "font", null);
        setField(term393563, term393563.getClass(), "peerFont", null);
        setField(term393563, term393563.getClass(), "cursor", null);
        setField(term393563, term393563.getClass(), "locale", null);
        setField(term393563, term393563.getClass(), "graphicsConfig", null);
        setField(term393563, term393563.getClass(), "bufferStrategy", null);
        setBooleanField(term393563, term393563.getClass(), "ignoreRepaint", false);
        setBooleanField(term393563, term393563.getClass(), "visible", false);
        setBooleanField(term393563, term393563.getClass(), "enabled", false);
        setBooleanField(term393563, term393563.getClass(), "valid", false);
        setField(term393563, term393563.getClass(), "dropTarget", null);
        setField(term393563, term393563.getClass(), "popups", null);
        setField(term393563, term393563.getClass(), "name", null);
        setBooleanField(term393563, term393563.getClass(), "nameExplicitlySet", false);
        setBooleanField(term393563, term393563.getClass(), "focusable", false);
        setIntField(term393563, term393563.getClass(), "isFocusTraversableOverridden", 0);
        setField(term393563, term393563.getClass(), "focusTraversalKeys", null);
        setBooleanField(term393563, term393563.getClass(), "focusTraversalKeysEnabled", false);
        setField(term393563, term393563.getClass(), "acc", null);
        setField(term393563, term393563.getClass(), "minSize", null);
        setBooleanField(term393563, term393563.getClass(), "minSizeSet", false);
        setField(term393563, term393563.getClass(), "prefSize", null);
        setBooleanField(term393563, term393563.getClass(), "prefSizeSet", false);
        setField(term393563, term393563.getClass(), "maxSize", null);
        setBooleanField(term393563, term393563.getClass(), "maxSizeSet", false);
        setField(term393563, term393563.getClass(), "componentOrientation", null);
        setBooleanField(term393563, term393563.getClass(), "newEventsOnly", false);
        setField(term393563, term393563.getClass(), "componentListener", null);
        setField(term393563, term393563.getClass(), "focusListener", null);
        setField(term393563, term393563.getClass(), "hierarchyListener", null);
        setField(term393563, term393563.getClass(), "hierarchyBoundsListener", null);
        setField(term393563, term393563.getClass(), "keyListener", null);
        setField(term393563, term393563.getClass(), "mouseListener", null);
        setField(term393563, term393563.getClass(), "mouseMotionListener", null);
        setField(term393563, term393563.getClass(), "mouseWheelListener", null);
        setField(term393563, term393563.getClass(), "inputMethodListener", null);
        setLongField(term393563, term393563.getClass(), "eventMask", 0L);
        setField(term393563, term393563.getClass(), "changeSupport", null);
        setField(term393563, term393563.getClass(), "objectLock", null);
        setBooleanField(term393563, term393563.getClass(), "isPacked", false);
        setIntField(term393563, term393563.getClass(), "boundsOp", 0);
        setField(term393563, term393563.getClass(), "compoundShape", null);
        setField(term393563, term393563.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term393563, term393563.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term393563, term393563.getClass(), "backgroundEraseDisabled", false);
        setField(term393563, term393563.getClass(), "eventCache", null);
        setBooleanField(term393563, term393563.getClass(), "coalescingEnabled", false);
        setBooleanField(term393563, term393563.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term393563, term393563.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.exhibition.TodoExhibition");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newValueLabel", argTypes, term393563, args);
    }

};


