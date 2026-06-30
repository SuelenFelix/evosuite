package core.task.creator;

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
import static core.task.creator.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class EventCreator_getProvidedDate_3158549072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2123;

    public EventCreator_getProvidedDate_3158549072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2123 = newInstance(Class.forName("core.task.creator.EventCreator"));
        setField(term2123, term2123.getClass(), "eventType", null);
        setField(term2123, term2123.getClass(), "descriptionField", null);
        setField(term2123, term2123.getClass(), "dayField", null);
        setField(term2123, term2123.getClass(), "monthField", null);
        setField(term2123, term2123.getClass(), "yearField", null);
        setIntField(term2123, term2123.getClass(), "defaultCloseOperation", 0);
        setField(term2123, term2123.getClass(), "rootPane", null);
        setBooleanField(term2123, term2123.getClass(), "rootPaneCheckingEnabled", false);
        setField(term2123, term2123.getClass(), "transferHandler", null);
        setField(term2123, term2123.getClass(), "accessibleContext", null);
        setBooleanField(term2123, term2123.getClass(), "resizable", false);
        setBooleanField(term2123, term2123.getClass(), "undecorated", false);
        setBooleanField(term2123, term2123.getClass(), "initialized", false);
        setBooleanField(term2123, term2123.getClass(), "modal", false);
        setField(term2123, term2123.getClass(), "modalityType", null);
        setField(term2123, term2123.getClass(), "blockedWindows", null);
        setField(term2123, term2123.getClass(), "title", null);
        setField(term2123, term2123.getClass(), "modalFilter", null);
        setField(term2123, term2123.getClass(), "secondaryLoop", null);
        setBooleanField(term2123, term2123.getClass(), "isInHide", false);
        setBooleanField(term2123, term2123.getClass(), "isInDispose", false);
        setField(term2123, term2123.getClass(), "warningString", null);
        setField(term2123, term2123.getClass(), "icons", null);
        setField(term2123, term2123.getClass(), "temporaryLostComponent", null);
        setBooleanField(term2123, term2123.getClass(), "syncLWRequests", false);
        setBooleanField(term2123, term2123.getClass(), "beforeFirstShow", false);
        setBooleanField(term2123, term2123.getClass(), "disposing", false);
        setField(term2123, term2123.getClass(), "disposerRecord", null);
        setIntField(term2123, term2123.getClass(), "state", 0);
        setBooleanField(term2123, term2123.getClass(), "alwaysOnTop", false);
        setField(term2123, term2123.getClass(), "ownedWindowList", null);
        setField(term2123, term2123.getClass(), "weakThis", null);
        setBooleanField(term2123, term2123.getClass(), "showWithParent", false);
        setField(term2123, term2123.getClass(), "modalBlocker", null);
        setField(term2123, term2123.getClass(), "modalExclusionType", null);
        setField(term2123, term2123.getClass(), "windowListener", null);
        setField(term2123, term2123.getClass(), "windowStateListener", null);
        setField(term2123, term2123.getClass(), "windowFocusListener", null);
        setField(term2123, term2123.getClass(), "inputContext", null);
        setField(term2123, term2123.getClass(), "inputContextLock", null);
        setField(term2123, term2123.getClass(), "focusMgr", null);
        setBooleanField(term2123, term2123.getClass(), "focusableWindowState", false);
        setBooleanField(term2123, term2123.getClass(), "autoRequestFocus", false);
        setBooleanField(term2123, term2123.getClass(), "isInShow", false);
        setFloatField(term2123, term2123.getClass(), "opacity", 0.0F);
        setField(term2123, term2123.getClass(), "shape", null);
        setBooleanField(term2123, term2123.getClass(), "isTrayIconWindow", false);
        setIntField(term2123, term2123.getClass(), "securityWarningWidth", 0);
        setIntField(term2123, term2123.getClass(), "securityWarningHeight", 0);
        setDoubleField(term2123, term2123.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term2123, term2123.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term2123, term2123.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term2123, term2123.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term2123, term2123.getClass(), "anchor", null);
        setField(term2123, term2123.getClass(), "type", null);
        setIntField(term2123, term2123.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term2123, term2123.getClass(), "locationByPlatform", false);
        setField(term2123, term2123.getClass(), "component", null);
        setField(term2123, term2123.getClass(), "layoutMgr", null);
        setField(term2123, term2123.getClass(), "dispatcher", null);
        setField(term2123, term2123.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2123, term2123.getClass(), "focusCycleRoot", false);
        setBooleanField(term2123, term2123.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2123, term2123.getClass(), "printingThreads", null);
        setBooleanField(term2123, term2123.getClass(), "printing", false);
        setField(term2123, term2123.getClass(), "containerListener", null);
        setIntField(term2123, term2123.getClass(), "listeningChildren", 0);
        setIntField(term2123, term2123.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2123, term2123.getClass(), "descendantsCount", 0);
        setField(term2123, term2123.getClass(), "preserveBackgroundColor", null);
        setIntField(term2123, term2123.getClass(), "numOfHWComponents", 0);
        setIntField(term2123, term2123.getClass(), "numOfLWComponents", 0);
        setField(term2123, term2123.getClass(), "modalComp", null);
        setField(term2123, term2123.getClass(), "modalAppContext", null);
        setIntField(term2123, term2123.getClass(), "containerSerializedDataVersion", 0);
        setField(term2123, term2123.getClass(), "peer", null);
        setField(term2123, term2123.getClass(), "parent", null);
        setField(term2123, term2123.getClass(), "appContext", null);
        setIntField(term2123, term2123.getClass(), "x", 0);
        setIntField(term2123, term2123.getClass(), "y", 0);
        setIntField(term2123, term2123.getClass(), "width", 0);
        setIntField(term2123, term2123.getClass(), "height", 0);
        setField(term2123, term2123.getClass(), "foreground", null);
        setField(term2123, term2123.getClass(), "background", null);
        setField(term2123, term2123.getClass(), "font", null);
        setField(term2123, term2123.getClass(), "peerFont", null);
        setField(term2123, term2123.getClass(), "cursor", null);
        setField(term2123, term2123.getClass(), "locale", null);
        setField(term2123, term2123.getClass(), "graphicsConfig", null);
        setField(term2123, term2123.getClass(), "bufferStrategy", null);
        setBooleanField(term2123, term2123.getClass(), "ignoreRepaint", false);
        setBooleanField(term2123, term2123.getClass(), "visible", false);
        setBooleanField(term2123, term2123.getClass(), "enabled", false);
        setBooleanField(term2123, term2123.getClass(), "valid", false);
        setField(term2123, term2123.getClass(), "dropTarget", null);
        setField(term2123, term2123.getClass(), "popups", null);
        setField(term2123, term2123.getClass(), "name", null);
        setBooleanField(term2123, term2123.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2123, term2123.getClass(), "focusable", false);
        setIntField(term2123, term2123.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2123, term2123.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2123, term2123.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2123, term2123.getClass(), "acc", null);
        setField(term2123, term2123.getClass(), "minSize", null);
        setBooleanField(term2123, term2123.getClass(), "minSizeSet", false);
        setField(term2123, term2123.getClass(), "prefSize", null);
        setBooleanField(term2123, term2123.getClass(), "prefSizeSet", false);
        setField(term2123, term2123.getClass(), "maxSize", null);
        setBooleanField(term2123, term2123.getClass(), "maxSizeSet", false);
        setField(term2123, term2123.getClass(), "componentOrientation", null);
        setBooleanField(term2123, term2123.getClass(), "newEventsOnly", false);
        setField(term2123, term2123.getClass(), "componentListener", null);
        setField(term2123, term2123.getClass(), "focusListener", null);
        setField(term2123, term2123.getClass(), "hierarchyListener", null);
        setField(term2123, term2123.getClass(), "hierarchyBoundsListener", null);
        setField(term2123, term2123.getClass(), "keyListener", null);
        setField(term2123, term2123.getClass(), "mouseListener", null);
        setField(term2123, term2123.getClass(), "mouseMotionListener", null);
        setField(term2123, term2123.getClass(), "mouseWheelListener", null);
        setField(term2123, term2123.getClass(), "inputMethodListener", null);
        setLongField(term2123, term2123.getClass(), "eventMask", 0L);
        setField(term2123, term2123.getClass(), "changeSupport", null);
        setField(term2123, term2123.getClass(), "objectLock", null);
        setBooleanField(term2123, term2123.getClass(), "isPacked", false);
        setIntField(term2123, term2123.getClass(), "boundsOp", 0);
        setField(term2123, term2123.getClass(), "compoundShape", null);
        setField(term2123, term2123.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2123, term2123.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2123, term2123.getClass(), "backgroundEraseDisabled", false);
        setField(term2123, term2123.getClass(), "eventCache", null);
        setBooleanField(term2123, term2123.getClass(), "coalescingEnabled", false);
        setBooleanField(term2123, term2123.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2123, term2123.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.EventCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProvidedDate", argTypes, term2123, args);
    }

};


