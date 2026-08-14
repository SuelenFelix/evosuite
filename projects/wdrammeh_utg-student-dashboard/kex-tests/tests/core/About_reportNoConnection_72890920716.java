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
     Object term140966;

    public About_reportNoConnection_72890920716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140966 = newInstance(Class.forName("core.About"));
        setField(term140966, term140966.getClass(), "midCard", null);
        setField(term140966, term140966.getClass(), "midLayer", null);
        setIntField(term140966, term140966.getClass(), "defaultCloseOperation", 0);
        setField(term140966, term140966.getClass(), "rootPane", null);
        setBooleanField(term140966, term140966.getClass(), "rootPaneCheckingEnabled", false);
        setField(term140966, term140966.getClass(), "transferHandler", null);
        setField(term140966, term140966.getClass(), "accessibleContext", null);
        setBooleanField(term140966, term140966.getClass(), "resizable", false);
        setBooleanField(term140966, term140966.getClass(), "undecorated", false);
        setBooleanField(term140966, term140966.getClass(), "initialized", false);
        setBooleanField(term140966, term140966.getClass(), "modal", false);
        setField(term140966, term140966.getClass(), "modalityType", null);
        setField(term140966, term140966.getClass(), "blockedWindows", null);
        setField(term140966, term140966.getClass(), "title", null);
        setField(term140966, term140966.getClass(), "modalFilter", null);
        setField(term140966, term140966.getClass(), "secondaryLoop", null);
        setBooleanField(term140966, term140966.getClass(), "isInHide", false);
        setBooleanField(term140966, term140966.getClass(), "isInDispose", false);
        setField(term140966, term140966.getClass(), "warningString", null);
        setField(term140966, term140966.getClass(), "icons", null);
        setField(term140966, term140966.getClass(), "temporaryLostComponent", null);
        setBooleanField(term140966, term140966.getClass(), "syncLWRequests", false);
        setBooleanField(term140966, term140966.getClass(), "beforeFirstShow", false);
        setBooleanField(term140966, term140966.getClass(), "disposing", false);
        setField(term140966, term140966.getClass(), "disposerRecord", null);
        setIntField(term140966, term140966.getClass(), "state", 0);
        setBooleanField(term140966, term140966.getClass(), "alwaysOnTop", false);
        setField(term140966, term140966.getClass(), "ownedWindowList", null);
        setField(term140966, term140966.getClass(), "weakThis", null);
        setBooleanField(term140966, term140966.getClass(), "showWithParent", false);
        setField(term140966, term140966.getClass(), "modalBlocker", null);
        setField(term140966, term140966.getClass(), "modalExclusionType", null);
        setField(term140966, term140966.getClass(), "windowListener", null);
        setField(term140966, term140966.getClass(), "windowStateListener", null);
        setField(term140966, term140966.getClass(), "windowFocusListener", null);
        setField(term140966, term140966.getClass(), "inputContext", null);
        setField(term140966, term140966.getClass(), "inputContextLock", null);
        setField(term140966, term140966.getClass(), "focusMgr", null);
        setBooleanField(term140966, term140966.getClass(), "focusableWindowState", false);
        setBooleanField(term140966, term140966.getClass(), "autoRequestFocus", false);
        setBooleanField(term140966, term140966.getClass(), "isInShow", false);
        setFloatField(term140966, term140966.getClass(), "opacity", 0.0F);
        setField(term140966, term140966.getClass(), "shape", null);
        setBooleanField(term140966, term140966.getClass(), "isTrayIconWindow", false);
        setIntField(term140966, term140966.getClass(), "securityWarningWidth", 0);
        setIntField(term140966, term140966.getClass(), "securityWarningHeight", 0);
        setDoubleField(term140966, term140966.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term140966, term140966.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term140966, term140966.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term140966, term140966.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term140966, term140966.getClass(), "anchor", null);
        setField(term140966, term140966.getClass(), "type", null);
        setIntField(term140966, term140966.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term140966, term140966.getClass(), "locationByPlatform", false);
        setField(term140966, term140966.getClass(), "component", null);
        setField(term140966, term140966.getClass(), "layoutMgr", null);
        setField(term140966, term140966.getClass(), "dispatcher", null);
        setField(term140966, term140966.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term140966, term140966.getClass(), "focusCycleRoot", false);
        setBooleanField(term140966, term140966.getClass(), "focusTraversalPolicyProvider", false);
        setField(term140966, term140966.getClass(), "printingThreads", null);
        setBooleanField(term140966, term140966.getClass(), "printing", false);
        setField(term140966, term140966.getClass(), "containerListener", null);
        setIntField(term140966, term140966.getClass(), "listeningChildren", 0);
        setIntField(term140966, term140966.getClass(), "listeningBoundsChildren", 0);
        setIntField(term140966, term140966.getClass(), "descendantsCount", 0);
        setField(term140966, term140966.getClass(), "preserveBackgroundColor", null);
        setIntField(term140966, term140966.getClass(), "numOfHWComponents", 0);
        setIntField(term140966, term140966.getClass(), "numOfLWComponents", 0);
        setField(term140966, term140966.getClass(), "modalComp", null);
        setField(term140966, term140966.getClass(), "modalAppContext", null);
        setIntField(term140966, term140966.getClass(), "containerSerializedDataVersion", 0);
        setField(term140966, term140966.getClass(), "peer", null);
        setField(term140966, term140966.getClass(), "parent", null);
        setField(term140966, term140966.getClass(), "appContext", null);
        setIntField(term140966, term140966.getClass(), "x", 0);
        setIntField(term140966, term140966.getClass(), "y", 0);
        setIntField(term140966, term140966.getClass(), "width", 0);
        setIntField(term140966, term140966.getClass(), "height", 0);
        setField(term140966, term140966.getClass(), "foreground", null);
        setField(term140966, term140966.getClass(), "background", null);
        setField(term140966, term140966.getClass(), "font", null);
        setField(term140966, term140966.getClass(), "peerFont", null);
        setField(term140966, term140966.getClass(), "cursor", null);
        setField(term140966, term140966.getClass(), "locale", null);
        setField(term140966, term140966.getClass(), "graphicsConfig", null);
        setField(term140966, term140966.getClass(), "bufferStrategy", null);
        setBooleanField(term140966, term140966.getClass(), "ignoreRepaint", false);
        setBooleanField(term140966, term140966.getClass(), "visible", false);
        setBooleanField(term140966, term140966.getClass(), "enabled", false);
        setBooleanField(term140966, term140966.getClass(), "valid", false);
        setField(term140966, term140966.getClass(), "dropTarget", null);
        setField(term140966, term140966.getClass(), "popups", null);
        setField(term140966, term140966.getClass(), "name", null);
        setBooleanField(term140966, term140966.getClass(), "nameExplicitlySet", false);
        setBooleanField(term140966, term140966.getClass(), "focusable", false);
        setIntField(term140966, term140966.getClass(), "isFocusTraversableOverridden", 0);
        setField(term140966, term140966.getClass(), "focusTraversalKeys", null);
        setBooleanField(term140966, term140966.getClass(), "focusTraversalKeysEnabled", false);
        setField(term140966, term140966.getClass(), "acc", null);
        setField(term140966, term140966.getClass(), "minSize", null);
        setBooleanField(term140966, term140966.getClass(), "minSizeSet", false);
        setField(term140966, term140966.getClass(), "prefSize", null);
        setBooleanField(term140966, term140966.getClass(), "prefSizeSet", false);
        setField(term140966, term140966.getClass(), "maxSize", null);
        setBooleanField(term140966, term140966.getClass(), "maxSizeSet", false);
        setField(term140966, term140966.getClass(), "componentOrientation", null);
        setBooleanField(term140966, term140966.getClass(), "newEventsOnly", false);
        setField(term140966, term140966.getClass(), "componentListener", null);
        setField(term140966, term140966.getClass(), "focusListener", null);
        setField(term140966, term140966.getClass(), "hierarchyListener", null);
        setField(term140966, term140966.getClass(), "hierarchyBoundsListener", null);
        setField(term140966, term140966.getClass(), "keyListener", null);
        setField(term140966, term140966.getClass(), "mouseListener", null);
        setField(term140966, term140966.getClass(), "mouseMotionListener", null);
        setField(term140966, term140966.getClass(), "mouseWheelListener", null);
        setField(term140966, term140966.getClass(), "inputMethodListener", null);
        setLongField(term140966, term140966.getClass(), "eventMask", 0L);
        setField(term140966, term140966.getClass(), "changeSupport", null);
        setField(term140966, term140966.getClass(), "objectLock", null);
        setBooleanField(term140966, term140966.getClass(), "isPacked", false);
        setIntField(term140966, term140966.getClass(), "boundsOp", 0);
        setField(term140966, term140966.getClass(), "compoundShape", null);
        setField(term140966, term140966.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term140966, term140966.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term140966, term140966.getClass(), "backgroundEraseDisabled", false);
        setField(term140966, term140966.getClass(), "eventCache", null);
        setBooleanField(term140966, term140966.getClass(), "coalescingEnabled", false);
        setBooleanField(term140966, term140966.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term140966, term140966.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.About");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reportNoConnection", argTypes, term140966, args);
    }

};


