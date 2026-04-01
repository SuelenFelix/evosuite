package core;

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
import static core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class About_reportNoConnection_72890920716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140968;

    public About_reportNoConnection_72890920716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140968 = newInstance(Class.forName("core.About"));
        setField(term140968, term140968.getClass(), "midCard", null);
        setField(term140968, term140968.getClass(), "midLayer", null);
        setIntField(term140968, term140968.getClass(), "defaultCloseOperation", 0);
        setField(term140968, term140968.getClass(), "rootPane", null);
        setBooleanField(term140968, term140968.getClass(), "rootPaneCheckingEnabled", false);
        setField(term140968, term140968.getClass(), "transferHandler", null);
        setField(term140968, term140968.getClass(), "accessibleContext", null);
        setBooleanField(term140968, term140968.getClass(), "resizable", false);
        setBooleanField(term140968, term140968.getClass(), "undecorated", false);
        setBooleanField(term140968, term140968.getClass(), "initialized", false);
        setBooleanField(term140968, term140968.getClass(), "modal", false);
        setField(term140968, term140968.getClass(), "modalityType", null);
        setField(term140968, term140968.getClass(), "blockedWindows", null);
        setField(term140968, term140968.getClass(), "title", null);
        setField(term140968, term140968.getClass(), "modalFilter", null);
        setField(term140968, term140968.getClass(), "secondaryLoop", null);
        setBooleanField(term140968, term140968.getClass(), "isInHide", false);
        setBooleanField(term140968, term140968.getClass(), "isInDispose", false);
        setField(term140968, term140968.getClass(), "warningString", null);
        setField(term140968, term140968.getClass(), "icons", null);
        setField(term140968, term140968.getClass(), "temporaryLostComponent", null);
        setBooleanField(term140968, term140968.getClass(), "syncLWRequests", false);
        setBooleanField(term140968, term140968.getClass(), "beforeFirstShow", false);
        setBooleanField(term140968, term140968.getClass(), "disposing", false);
        setField(term140968, term140968.getClass(), "disposerRecord", null);
        setIntField(term140968, term140968.getClass(), "state", 0);
        setBooleanField(term140968, term140968.getClass(), "alwaysOnTop", false);
        setField(term140968, term140968.getClass(), "ownedWindowList", null);
        setField(term140968, term140968.getClass(), "weakThis", null);
        setBooleanField(term140968, term140968.getClass(), "showWithParent", false);
        setField(term140968, term140968.getClass(), "modalBlocker", null);
        setField(term140968, term140968.getClass(), "modalExclusionType", null);
        setField(term140968, term140968.getClass(), "windowListener", null);
        setField(term140968, term140968.getClass(), "windowStateListener", null);
        setField(term140968, term140968.getClass(), "windowFocusListener", null);
        setField(term140968, term140968.getClass(), "inputContext", null);
        setField(term140968, term140968.getClass(), "inputContextLock", null);
        setField(term140968, term140968.getClass(), "focusMgr", null);
        setBooleanField(term140968, term140968.getClass(), "focusableWindowState", false);
        setBooleanField(term140968, term140968.getClass(), "autoRequestFocus", false);
        setBooleanField(term140968, term140968.getClass(), "isInShow", false);
        setFloatField(term140968, term140968.getClass(), "opacity", 0.0F);
        setField(term140968, term140968.getClass(), "shape", null);
        setBooleanField(term140968, term140968.getClass(), "isTrayIconWindow", false);
        setIntField(term140968, term140968.getClass(), "securityWarningWidth", 0);
        setIntField(term140968, term140968.getClass(), "securityWarningHeight", 0);
        setDoubleField(term140968, term140968.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term140968, term140968.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term140968, term140968.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term140968, term140968.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term140968, term140968.getClass(), "anchor", null);
        setField(term140968, term140968.getClass(), "type", null);
        setIntField(term140968, term140968.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term140968, term140968.getClass(), "locationByPlatform", false);
        setField(term140968, term140968.getClass(), "component", null);
        setField(term140968, term140968.getClass(), "layoutMgr", null);
        setField(term140968, term140968.getClass(), "dispatcher", null);
        setField(term140968, term140968.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term140968, term140968.getClass(), "focusCycleRoot", false);
        setBooleanField(term140968, term140968.getClass(), "focusTraversalPolicyProvider", false);
        setField(term140968, term140968.getClass(), "printingThreads", null);
        setBooleanField(term140968, term140968.getClass(), "printing", false);
        setField(term140968, term140968.getClass(), "containerListener", null);
        setIntField(term140968, term140968.getClass(), "listeningChildren", 0);
        setIntField(term140968, term140968.getClass(), "listeningBoundsChildren", 0);
        setIntField(term140968, term140968.getClass(), "descendantsCount", 0);
        setField(term140968, term140968.getClass(), "preserveBackgroundColor", null);
        setIntField(term140968, term140968.getClass(), "numOfHWComponents", 0);
        setIntField(term140968, term140968.getClass(), "numOfLWComponents", 0);
        setField(term140968, term140968.getClass(), "modalComp", null);
        setField(term140968, term140968.getClass(), "modalAppContext", null);
        setIntField(term140968, term140968.getClass(), "containerSerializedDataVersion", 0);
        setField(term140968, term140968.getClass(), "peer", null);
        setField(term140968, term140968.getClass(), "parent", null);
        setField(term140968, term140968.getClass(), "appContext", null);
        setIntField(term140968, term140968.getClass(), "x", 0);
        setIntField(term140968, term140968.getClass(), "y", 0);
        setIntField(term140968, term140968.getClass(), "width", 0);
        setIntField(term140968, term140968.getClass(), "height", 0);
        setField(term140968, term140968.getClass(), "foreground", null);
        setField(term140968, term140968.getClass(), "background", null);
        setField(term140968, term140968.getClass(), "font", null);
        setField(term140968, term140968.getClass(), "peerFont", null);
        setField(term140968, term140968.getClass(), "cursor", null);
        setField(term140968, term140968.getClass(), "locale", null);
        setField(term140968, term140968.getClass(), "graphicsConfig", null);
        setField(term140968, term140968.getClass(), "bufferStrategy", null);
        setBooleanField(term140968, term140968.getClass(), "ignoreRepaint", false);
        setBooleanField(term140968, term140968.getClass(), "visible", false);
        setBooleanField(term140968, term140968.getClass(), "enabled", false);
        setBooleanField(term140968, term140968.getClass(), "valid", false);
        setField(term140968, term140968.getClass(), "dropTarget", null);
        setField(term140968, term140968.getClass(), "popups", null);
        setField(term140968, term140968.getClass(), "name", null);
        setBooleanField(term140968, term140968.getClass(), "nameExplicitlySet", false);
        setBooleanField(term140968, term140968.getClass(), "focusable", false);
        setIntField(term140968, term140968.getClass(), "isFocusTraversableOverridden", 0);
        setField(term140968, term140968.getClass(), "focusTraversalKeys", null);
        setBooleanField(term140968, term140968.getClass(), "focusTraversalKeysEnabled", false);
        setField(term140968, term140968.getClass(), "acc", null);
        setField(term140968, term140968.getClass(), "minSize", null);
        setBooleanField(term140968, term140968.getClass(), "minSizeSet", false);
        setField(term140968, term140968.getClass(), "prefSize", null);
        setBooleanField(term140968, term140968.getClass(), "prefSizeSet", false);
        setField(term140968, term140968.getClass(), "maxSize", null);
        setBooleanField(term140968, term140968.getClass(), "maxSizeSet", false);
        setField(term140968, term140968.getClass(), "componentOrientation", null);
        setBooleanField(term140968, term140968.getClass(), "newEventsOnly", false);
        setField(term140968, term140968.getClass(), "componentListener", null);
        setField(term140968, term140968.getClass(), "focusListener", null);
        setField(term140968, term140968.getClass(), "hierarchyListener", null);
        setField(term140968, term140968.getClass(), "hierarchyBoundsListener", null);
        setField(term140968, term140968.getClass(), "keyListener", null);
        setField(term140968, term140968.getClass(), "mouseListener", null);
        setField(term140968, term140968.getClass(), "mouseMotionListener", null);
        setField(term140968, term140968.getClass(), "mouseWheelListener", null);
        setField(term140968, term140968.getClass(), "inputMethodListener", null);
        setLongField(term140968, term140968.getClass(), "eventMask", 0L);
        setField(term140968, term140968.getClass(), "changeSupport", null);
        setField(term140968, term140968.getClass(), "objectLock", null);
        setBooleanField(term140968, term140968.getClass(), "isPacked", false);
        setIntField(term140968, term140968.getClass(), "boundsOp", 0);
        setField(term140968, term140968.getClass(), "compoundShape", null);
        setField(term140968, term140968.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term140968, term140968.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term140968, term140968.getClass(), "backgroundEraseDisabled", false);
        setField(term140968, term140968.getClass(), "eventCache", null);
        setBooleanField(term140968, term140968.getClass(), "coalescingEnabled", false);
        setBooleanField(term140968, term140968.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term140968, term140968.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.About");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reportNoConnection", argTypes, term140968, args);
    }

};


