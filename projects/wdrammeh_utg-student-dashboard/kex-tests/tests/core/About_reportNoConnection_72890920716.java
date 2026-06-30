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
     Object term140964;

    public About_reportNoConnection_72890920716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140964 = newInstance(Class.forName("core.About"));
        setField(term140964, term140964.getClass(), "midCard", null);
        setField(term140964, term140964.getClass(), "midLayer", null);
        setIntField(term140964, term140964.getClass(), "defaultCloseOperation", 0);
        setField(term140964, term140964.getClass(), "rootPane", null);
        setBooleanField(term140964, term140964.getClass(), "rootPaneCheckingEnabled", false);
        setField(term140964, term140964.getClass(), "transferHandler", null);
        setField(term140964, term140964.getClass(), "accessibleContext", null);
        setBooleanField(term140964, term140964.getClass(), "resizable", false);
        setBooleanField(term140964, term140964.getClass(), "undecorated", false);
        setBooleanField(term140964, term140964.getClass(), "initialized", false);
        setBooleanField(term140964, term140964.getClass(), "modal", false);
        setField(term140964, term140964.getClass(), "modalityType", null);
        setField(term140964, term140964.getClass(), "blockedWindows", null);
        setField(term140964, term140964.getClass(), "title", null);
        setField(term140964, term140964.getClass(), "modalFilter", null);
        setField(term140964, term140964.getClass(), "secondaryLoop", null);
        setBooleanField(term140964, term140964.getClass(), "isInHide", false);
        setBooleanField(term140964, term140964.getClass(), "isInDispose", false);
        setField(term140964, term140964.getClass(), "warningString", null);
        setField(term140964, term140964.getClass(), "icons", null);
        setField(term140964, term140964.getClass(), "temporaryLostComponent", null);
        setBooleanField(term140964, term140964.getClass(), "syncLWRequests", false);
        setBooleanField(term140964, term140964.getClass(), "beforeFirstShow", false);
        setBooleanField(term140964, term140964.getClass(), "disposing", false);
        setField(term140964, term140964.getClass(), "disposerRecord", null);
        setIntField(term140964, term140964.getClass(), "state", 0);
        setBooleanField(term140964, term140964.getClass(), "alwaysOnTop", false);
        setField(term140964, term140964.getClass(), "ownedWindowList", null);
        setField(term140964, term140964.getClass(), "weakThis", null);
        setBooleanField(term140964, term140964.getClass(), "showWithParent", false);
        setField(term140964, term140964.getClass(), "modalBlocker", null);
        setField(term140964, term140964.getClass(), "modalExclusionType", null);
        setField(term140964, term140964.getClass(), "windowListener", null);
        setField(term140964, term140964.getClass(), "windowStateListener", null);
        setField(term140964, term140964.getClass(), "windowFocusListener", null);
        setField(term140964, term140964.getClass(), "inputContext", null);
        setField(term140964, term140964.getClass(), "inputContextLock", null);
        setField(term140964, term140964.getClass(), "focusMgr", null);
        setBooleanField(term140964, term140964.getClass(), "focusableWindowState", false);
        setBooleanField(term140964, term140964.getClass(), "autoRequestFocus", false);
        setBooleanField(term140964, term140964.getClass(), "isInShow", false);
        setFloatField(term140964, term140964.getClass(), "opacity", 0.0F);
        setField(term140964, term140964.getClass(), "shape", null);
        setBooleanField(term140964, term140964.getClass(), "isTrayIconWindow", false);
        setIntField(term140964, term140964.getClass(), "securityWarningWidth", 0);
        setIntField(term140964, term140964.getClass(), "securityWarningHeight", 0);
        setDoubleField(term140964, term140964.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term140964, term140964.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term140964, term140964.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term140964, term140964.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term140964, term140964.getClass(), "anchor", null);
        setField(term140964, term140964.getClass(), "type", null);
        setIntField(term140964, term140964.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term140964, term140964.getClass(), "locationByPlatform", false);
        setField(term140964, term140964.getClass(), "component", null);
        setField(term140964, term140964.getClass(), "layoutMgr", null);
        setField(term140964, term140964.getClass(), "dispatcher", null);
        setField(term140964, term140964.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term140964, term140964.getClass(), "focusCycleRoot", false);
        setBooleanField(term140964, term140964.getClass(), "focusTraversalPolicyProvider", false);
        setField(term140964, term140964.getClass(), "printingThreads", null);
        setBooleanField(term140964, term140964.getClass(), "printing", false);
        setField(term140964, term140964.getClass(), "containerListener", null);
        setIntField(term140964, term140964.getClass(), "listeningChildren", 0);
        setIntField(term140964, term140964.getClass(), "listeningBoundsChildren", 0);
        setIntField(term140964, term140964.getClass(), "descendantsCount", 0);
        setField(term140964, term140964.getClass(), "preserveBackgroundColor", null);
        setIntField(term140964, term140964.getClass(), "numOfHWComponents", 0);
        setIntField(term140964, term140964.getClass(), "numOfLWComponents", 0);
        setField(term140964, term140964.getClass(), "modalComp", null);
        setField(term140964, term140964.getClass(), "modalAppContext", null);
        setIntField(term140964, term140964.getClass(), "containerSerializedDataVersion", 0);
        setField(term140964, term140964.getClass(), "peer", null);
        setField(term140964, term140964.getClass(), "parent", null);
        setField(term140964, term140964.getClass(), "appContext", null);
        setIntField(term140964, term140964.getClass(), "x", 0);
        setIntField(term140964, term140964.getClass(), "y", 0);
        setIntField(term140964, term140964.getClass(), "width", 0);
        setIntField(term140964, term140964.getClass(), "height", 0);
        setField(term140964, term140964.getClass(), "foreground", null);
        setField(term140964, term140964.getClass(), "background", null);
        setField(term140964, term140964.getClass(), "font", null);
        setField(term140964, term140964.getClass(), "peerFont", null);
        setField(term140964, term140964.getClass(), "cursor", null);
        setField(term140964, term140964.getClass(), "locale", null);
        setField(term140964, term140964.getClass(), "graphicsConfig", null);
        setField(term140964, term140964.getClass(), "bufferStrategy", null);
        setBooleanField(term140964, term140964.getClass(), "ignoreRepaint", false);
        setBooleanField(term140964, term140964.getClass(), "visible", false);
        setBooleanField(term140964, term140964.getClass(), "enabled", false);
        setBooleanField(term140964, term140964.getClass(), "valid", false);
        setField(term140964, term140964.getClass(), "dropTarget", null);
        setField(term140964, term140964.getClass(), "popups", null);
        setField(term140964, term140964.getClass(), "name", null);
        setBooleanField(term140964, term140964.getClass(), "nameExplicitlySet", false);
        setBooleanField(term140964, term140964.getClass(), "focusable", false);
        setIntField(term140964, term140964.getClass(), "isFocusTraversableOverridden", 0);
        setField(term140964, term140964.getClass(), "focusTraversalKeys", null);
        setBooleanField(term140964, term140964.getClass(), "focusTraversalKeysEnabled", false);
        setField(term140964, term140964.getClass(), "acc", null);
        setField(term140964, term140964.getClass(), "minSize", null);
        setBooleanField(term140964, term140964.getClass(), "minSizeSet", false);
        setField(term140964, term140964.getClass(), "prefSize", null);
        setBooleanField(term140964, term140964.getClass(), "prefSizeSet", false);
        setField(term140964, term140964.getClass(), "maxSize", null);
        setBooleanField(term140964, term140964.getClass(), "maxSizeSet", false);
        setField(term140964, term140964.getClass(), "componentOrientation", null);
        setBooleanField(term140964, term140964.getClass(), "newEventsOnly", false);
        setField(term140964, term140964.getClass(), "componentListener", null);
        setField(term140964, term140964.getClass(), "focusListener", null);
        setField(term140964, term140964.getClass(), "hierarchyListener", null);
        setField(term140964, term140964.getClass(), "hierarchyBoundsListener", null);
        setField(term140964, term140964.getClass(), "keyListener", null);
        setField(term140964, term140964.getClass(), "mouseListener", null);
        setField(term140964, term140964.getClass(), "mouseMotionListener", null);
        setField(term140964, term140964.getClass(), "mouseWheelListener", null);
        setField(term140964, term140964.getClass(), "inputMethodListener", null);
        setLongField(term140964, term140964.getClass(), "eventMask", 0L);
        setField(term140964, term140964.getClass(), "changeSupport", null);
        setField(term140964, term140964.getClass(), "objectLock", null);
        setBooleanField(term140964, term140964.getClass(), "isPacked", false);
        setIntField(term140964, term140964.getClass(), "boundsOp", 0);
        setField(term140964, term140964.getClass(), "compoundShape", null);
        setField(term140964, term140964.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term140964, term140964.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term140964, term140964.getClass(), "backgroundEraseDisabled", false);
        setField(term140964, term140964.getClass(), "eventCache", null);
        setBooleanField(term140964, term140964.getClass(), "coalescingEnabled", false);
        setBooleanField(term140964, term140964.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term140964, term140964.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.About");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reportNoConnection", argTypes, term140964, args);
    }

};


