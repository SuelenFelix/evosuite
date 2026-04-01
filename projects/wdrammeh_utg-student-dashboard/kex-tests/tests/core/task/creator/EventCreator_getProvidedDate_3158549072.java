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
     Object term33004;

    public EventCreator_getProvidedDate_3158549072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33004 = newInstance(Class.forName("core.task.creator.EventCreator"));
        setField(term33004, term33004.getClass(), "eventType", null);
        setField(term33004, term33004.getClass(), "descriptionField", null);
        setField(term33004, term33004.getClass(), "dayField", null);
        setField(term33004, term33004.getClass(), "monthField", null);
        setField(term33004, term33004.getClass(), "yearField", null);
        setIntField(term33004, term33004.getClass(), "defaultCloseOperation", 0);
        setField(term33004, term33004.getClass(), "rootPane", null);
        setBooleanField(term33004, term33004.getClass(), "rootPaneCheckingEnabled", false);
        setField(term33004, term33004.getClass(), "transferHandler", null);
        setField(term33004, term33004.getClass(), "accessibleContext", null);
        setBooleanField(term33004, term33004.getClass(), "resizable", false);
        setBooleanField(term33004, term33004.getClass(), "undecorated", false);
        setBooleanField(term33004, term33004.getClass(), "initialized", false);
        setBooleanField(term33004, term33004.getClass(), "modal", false);
        setField(term33004, term33004.getClass(), "modalityType", null);
        setField(term33004, term33004.getClass(), "blockedWindows", null);
        setField(term33004, term33004.getClass(), "title", null);
        setField(term33004, term33004.getClass(), "modalFilter", null);
        setField(term33004, term33004.getClass(), "secondaryLoop", null);
        setBooleanField(term33004, term33004.getClass(), "isInHide", false);
        setBooleanField(term33004, term33004.getClass(), "isInDispose", false);
        setField(term33004, term33004.getClass(), "warningString", null);
        setField(term33004, term33004.getClass(), "icons", null);
        setField(term33004, term33004.getClass(), "temporaryLostComponent", null);
        setBooleanField(term33004, term33004.getClass(), "syncLWRequests", false);
        setBooleanField(term33004, term33004.getClass(), "beforeFirstShow", false);
        setBooleanField(term33004, term33004.getClass(), "disposing", false);
        setField(term33004, term33004.getClass(), "disposerRecord", null);
        setIntField(term33004, term33004.getClass(), "state", 0);
        setBooleanField(term33004, term33004.getClass(), "alwaysOnTop", false);
        setField(term33004, term33004.getClass(), "ownedWindowList", null);
        setField(term33004, term33004.getClass(), "weakThis", null);
        setBooleanField(term33004, term33004.getClass(), "showWithParent", false);
        setField(term33004, term33004.getClass(), "modalBlocker", null);
        setField(term33004, term33004.getClass(), "modalExclusionType", null);
        setField(term33004, term33004.getClass(), "windowListener", null);
        setField(term33004, term33004.getClass(), "windowStateListener", null);
        setField(term33004, term33004.getClass(), "windowFocusListener", null);
        setField(term33004, term33004.getClass(), "inputContext", null);
        setField(term33004, term33004.getClass(), "inputContextLock", null);
        setField(term33004, term33004.getClass(), "focusMgr", null);
        setBooleanField(term33004, term33004.getClass(), "focusableWindowState", false);
        setBooleanField(term33004, term33004.getClass(), "autoRequestFocus", false);
        setBooleanField(term33004, term33004.getClass(), "isInShow", false);
        setFloatField(term33004, term33004.getClass(), "opacity", 0.0F);
        setField(term33004, term33004.getClass(), "shape", null);
        setBooleanField(term33004, term33004.getClass(), "isTrayIconWindow", false);
        setIntField(term33004, term33004.getClass(), "securityWarningWidth", 0);
        setIntField(term33004, term33004.getClass(), "securityWarningHeight", 0);
        setDoubleField(term33004, term33004.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term33004, term33004.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term33004, term33004.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term33004, term33004.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term33004, term33004.getClass(), "anchor", null);
        setField(term33004, term33004.getClass(), "type", null);
        setIntField(term33004, term33004.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term33004, term33004.getClass(), "locationByPlatform", false);
        setField(term33004, term33004.getClass(), "component", null);
        setField(term33004, term33004.getClass(), "layoutMgr", null);
        setField(term33004, term33004.getClass(), "dispatcher", null);
        setField(term33004, term33004.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term33004, term33004.getClass(), "focusCycleRoot", false);
        setBooleanField(term33004, term33004.getClass(), "focusTraversalPolicyProvider", false);
        setField(term33004, term33004.getClass(), "printingThreads", null);
        setBooleanField(term33004, term33004.getClass(), "printing", false);
        setField(term33004, term33004.getClass(), "containerListener", null);
        setIntField(term33004, term33004.getClass(), "listeningChildren", 0);
        setIntField(term33004, term33004.getClass(), "listeningBoundsChildren", 0);
        setIntField(term33004, term33004.getClass(), "descendantsCount", 0);
        setField(term33004, term33004.getClass(), "preserveBackgroundColor", null);
        setIntField(term33004, term33004.getClass(), "numOfHWComponents", 0);
        setIntField(term33004, term33004.getClass(), "numOfLWComponents", 0);
        setField(term33004, term33004.getClass(), "modalComp", null);
        setField(term33004, term33004.getClass(), "modalAppContext", null);
        setIntField(term33004, term33004.getClass(), "containerSerializedDataVersion", 0);
        setField(term33004, term33004.getClass(), "peer", null);
        setField(term33004, term33004.getClass(), "parent", null);
        setField(term33004, term33004.getClass(), "appContext", null);
        setIntField(term33004, term33004.getClass(), "x", 0);
        setIntField(term33004, term33004.getClass(), "y", 0);
        setIntField(term33004, term33004.getClass(), "width", 0);
        setIntField(term33004, term33004.getClass(), "height", 0);
        setField(term33004, term33004.getClass(), "foreground", null);
        setField(term33004, term33004.getClass(), "background", null);
        setField(term33004, term33004.getClass(), "font", null);
        setField(term33004, term33004.getClass(), "peerFont", null);
        setField(term33004, term33004.getClass(), "cursor", null);
        setField(term33004, term33004.getClass(), "locale", null);
        setField(term33004, term33004.getClass(), "graphicsConfig", null);
        setField(term33004, term33004.getClass(), "bufferStrategy", null);
        setBooleanField(term33004, term33004.getClass(), "ignoreRepaint", false);
        setBooleanField(term33004, term33004.getClass(), "visible", false);
        setBooleanField(term33004, term33004.getClass(), "enabled", false);
        setBooleanField(term33004, term33004.getClass(), "valid", false);
        setField(term33004, term33004.getClass(), "dropTarget", null);
        setField(term33004, term33004.getClass(), "popups", null);
        setField(term33004, term33004.getClass(), "name", null);
        setBooleanField(term33004, term33004.getClass(), "nameExplicitlySet", false);
        setBooleanField(term33004, term33004.getClass(), "focusable", false);
        setIntField(term33004, term33004.getClass(), "isFocusTraversableOverridden", 0);
        setField(term33004, term33004.getClass(), "focusTraversalKeys", null);
        setBooleanField(term33004, term33004.getClass(), "focusTraversalKeysEnabled", false);
        setField(term33004, term33004.getClass(), "acc", null);
        setField(term33004, term33004.getClass(), "minSize", null);
        setBooleanField(term33004, term33004.getClass(), "minSizeSet", false);
        setField(term33004, term33004.getClass(), "prefSize", null);
        setBooleanField(term33004, term33004.getClass(), "prefSizeSet", false);
        setField(term33004, term33004.getClass(), "maxSize", null);
        setBooleanField(term33004, term33004.getClass(), "maxSizeSet", false);
        setField(term33004, term33004.getClass(), "componentOrientation", null);
        setBooleanField(term33004, term33004.getClass(), "newEventsOnly", false);
        setField(term33004, term33004.getClass(), "componentListener", null);
        setField(term33004, term33004.getClass(), "focusListener", null);
        setField(term33004, term33004.getClass(), "hierarchyListener", null);
        setField(term33004, term33004.getClass(), "hierarchyBoundsListener", null);
        setField(term33004, term33004.getClass(), "keyListener", null);
        setField(term33004, term33004.getClass(), "mouseListener", null);
        setField(term33004, term33004.getClass(), "mouseMotionListener", null);
        setField(term33004, term33004.getClass(), "mouseWheelListener", null);
        setField(term33004, term33004.getClass(), "inputMethodListener", null);
        setLongField(term33004, term33004.getClass(), "eventMask", 0L);
        setField(term33004, term33004.getClass(), "changeSupport", null);
        setField(term33004, term33004.getClass(), "objectLock", null);
        setBooleanField(term33004, term33004.getClass(), "isPacked", false);
        setIntField(term33004, term33004.getClass(), "boundsOp", 0);
        setField(term33004, term33004.getClass(), "compoundShape", null);
        setField(term33004, term33004.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term33004, term33004.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term33004, term33004.getClass(), "backgroundEraseDisabled", false);
        setField(term33004, term33004.getClass(), "eventCache", null);
        setBooleanField(term33004, term33004.getClass(), "coalescingEnabled", false);
        setBooleanField(term33004, term33004.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term33004, term33004.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.task.creator.EventCreator");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProvidedDate", argTypes, term33004, args);
    }

};


