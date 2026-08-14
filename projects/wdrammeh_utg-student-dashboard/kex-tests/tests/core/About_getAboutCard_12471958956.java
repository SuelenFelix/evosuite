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

public class About_getAboutCard_12471958956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135651;

    public About_getAboutCard_12471958956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135651 = newInstance(Class.forName("core.About"));
        setField(term135651, term135651.getClass(), "midCard", null);
        setField(term135651, term135651.getClass(), "midLayer", null);
        setIntField(term135651, term135651.getClass(), "defaultCloseOperation", 0);
        setField(term135651, term135651.getClass(), "rootPane", null);
        setBooleanField(term135651, term135651.getClass(), "rootPaneCheckingEnabled", false);
        setField(term135651, term135651.getClass(), "transferHandler", null);
        setField(term135651, term135651.getClass(), "accessibleContext", null);
        setBooleanField(term135651, term135651.getClass(), "resizable", false);
        setBooleanField(term135651, term135651.getClass(), "undecorated", false);
        setBooleanField(term135651, term135651.getClass(), "initialized", false);
        setBooleanField(term135651, term135651.getClass(), "modal", false);
        setField(term135651, term135651.getClass(), "modalityType", null);
        setField(term135651, term135651.getClass(), "blockedWindows", null);
        setField(term135651, term135651.getClass(), "title", null);
        setField(term135651, term135651.getClass(), "modalFilter", null);
        setField(term135651, term135651.getClass(), "secondaryLoop", null);
        setBooleanField(term135651, term135651.getClass(), "isInHide", false);
        setBooleanField(term135651, term135651.getClass(), "isInDispose", false);
        setField(term135651, term135651.getClass(), "warningString", null);
        setField(term135651, term135651.getClass(), "icons", null);
        setField(term135651, term135651.getClass(), "temporaryLostComponent", null);
        setBooleanField(term135651, term135651.getClass(), "syncLWRequests", false);
        setBooleanField(term135651, term135651.getClass(), "beforeFirstShow", false);
        setBooleanField(term135651, term135651.getClass(), "disposing", false);
        setField(term135651, term135651.getClass(), "disposerRecord", null);
        setIntField(term135651, term135651.getClass(), "state", 0);
        setBooleanField(term135651, term135651.getClass(), "alwaysOnTop", false);
        setField(term135651, term135651.getClass(), "ownedWindowList", null);
        setField(term135651, term135651.getClass(), "weakThis", null);
        setBooleanField(term135651, term135651.getClass(), "showWithParent", false);
        setField(term135651, term135651.getClass(), "modalBlocker", null);
        setField(term135651, term135651.getClass(), "modalExclusionType", null);
        setField(term135651, term135651.getClass(), "windowListener", null);
        setField(term135651, term135651.getClass(), "windowStateListener", null);
        setField(term135651, term135651.getClass(), "windowFocusListener", null);
        setField(term135651, term135651.getClass(), "inputContext", null);
        setField(term135651, term135651.getClass(), "inputContextLock", null);
        setField(term135651, term135651.getClass(), "focusMgr", null);
        setBooleanField(term135651, term135651.getClass(), "focusableWindowState", false);
        setBooleanField(term135651, term135651.getClass(), "autoRequestFocus", false);
        setBooleanField(term135651, term135651.getClass(), "isInShow", false);
        setFloatField(term135651, term135651.getClass(), "opacity", 0.0F);
        setField(term135651, term135651.getClass(), "shape", null);
        setBooleanField(term135651, term135651.getClass(), "isTrayIconWindow", false);
        setIntField(term135651, term135651.getClass(), "securityWarningWidth", 0);
        setIntField(term135651, term135651.getClass(), "securityWarningHeight", 0);
        setDoubleField(term135651, term135651.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term135651, term135651.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term135651, term135651.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term135651, term135651.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term135651, term135651.getClass(), "anchor", null);
        setField(term135651, term135651.getClass(), "type", null);
        setIntField(term135651, term135651.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term135651, term135651.getClass(), "locationByPlatform", false);
        setField(term135651, term135651.getClass(), "component", null);
        setField(term135651, term135651.getClass(), "layoutMgr", null);
        setField(term135651, term135651.getClass(), "dispatcher", null);
        setField(term135651, term135651.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term135651, term135651.getClass(), "focusCycleRoot", false);
        setBooleanField(term135651, term135651.getClass(), "focusTraversalPolicyProvider", false);
        setField(term135651, term135651.getClass(), "printingThreads", null);
        setBooleanField(term135651, term135651.getClass(), "printing", false);
        setField(term135651, term135651.getClass(), "containerListener", null);
        setIntField(term135651, term135651.getClass(), "listeningChildren", 0);
        setIntField(term135651, term135651.getClass(), "listeningBoundsChildren", 0);
        setIntField(term135651, term135651.getClass(), "descendantsCount", 0);
        setField(term135651, term135651.getClass(), "preserveBackgroundColor", null);
        setIntField(term135651, term135651.getClass(), "numOfHWComponents", 0);
        setIntField(term135651, term135651.getClass(), "numOfLWComponents", 0);
        setField(term135651, term135651.getClass(), "modalComp", null);
        setField(term135651, term135651.getClass(), "modalAppContext", null);
        setIntField(term135651, term135651.getClass(), "containerSerializedDataVersion", 0);
        setField(term135651, term135651.getClass(), "peer", null);
        setField(term135651, term135651.getClass(), "parent", null);
        setField(term135651, term135651.getClass(), "appContext", null);
        setIntField(term135651, term135651.getClass(), "x", 0);
        setIntField(term135651, term135651.getClass(), "y", 0);
        setIntField(term135651, term135651.getClass(), "width", 0);
        setIntField(term135651, term135651.getClass(), "height", 0);
        setField(term135651, term135651.getClass(), "foreground", null);
        setField(term135651, term135651.getClass(), "background", null);
        setField(term135651, term135651.getClass(), "font", null);
        setField(term135651, term135651.getClass(), "peerFont", null);
        setField(term135651, term135651.getClass(), "cursor", null);
        setField(term135651, term135651.getClass(), "locale", null);
        setField(term135651, term135651.getClass(), "graphicsConfig", null);
        setField(term135651, term135651.getClass(), "bufferStrategy", null);
        setBooleanField(term135651, term135651.getClass(), "ignoreRepaint", false);
        setBooleanField(term135651, term135651.getClass(), "visible", false);
        setBooleanField(term135651, term135651.getClass(), "enabled", false);
        setBooleanField(term135651, term135651.getClass(), "valid", false);
        setField(term135651, term135651.getClass(), "dropTarget", null);
        setField(term135651, term135651.getClass(), "popups", null);
        setField(term135651, term135651.getClass(), "name", null);
        setBooleanField(term135651, term135651.getClass(), "nameExplicitlySet", false);
        setBooleanField(term135651, term135651.getClass(), "focusable", false);
        setIntField(term135651, term135651.getClass(), "isFocusTraversableOverridden", 0);
        setField(term135651, term135651.getClass(), "focusTraversalKeys", null);
        setBooleanField(term135651, term135651.getClass(), "focusTraversalKeysEnabled", false);
        setField(term135651, term135651.getClass(), "acc", null);
        setField(term135651, term135651.getClass(), "minSize", null);
        setBooleanField(term135651, term135651.getClass(), "minSizeSet", false);
        setField(term135651, term135651.getClass(), "prefSize", null);
        setBooleanField(term135651, term135651.getClass(), "prefSizeSet", false);
        setField(term135651, term135651.getClass(), "maxSize", null);
        setBooleanField(term135651, term135651.getClass(), "maxSizeSet", false);
        setField(term135651, term135651.getClass(), "componentOrientation", null);
        setBooleanField(term135651, term135651.getClass(), "newEventsOnly", false);
        setField(term135651, term135651.getClass(), "componentListener", null);
        setField(term135651, term135651.getClass(), "focusListener", null);
        setField(term135651, term135651.getClass(), "hierarchyListener", null);
        setField(term135651, term135651.getClass(), "hierarchyBoundsListener", null);
        setField(term135651, term135651.getClass(), "keyListener", null);
        setField(term135651, term135651.getClass(), "mouseListener", null);
        setField(term135651, term135651.getClass(), "mouseMotionListener", null);
        setField(term135651, term135651.getClass(), "mouseWheelListener", null);
        setField(term135651, term135651.getClass(), "inputMethodListener", null);
        setLongField(term135651, term135651.getClass(), "eventMask", 0L);
        setField(term135651, term135651.getClass(), "changeSupport", null);
        setField(term135651, term135651.getClass(), "objectLock", null);
        setBooleanField(term135651, term135651.getClass(), "isPacked", false);
        setIntField(term135651, term135651.getClass(), "boundsOp", 0);
        setField(term135651, term135651.getClass(), "compoundShape", null);
        setField(term135651, term135651.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term135651, term135651.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term135651, term135651.getClass(), "backgroundEraseDisabled", false);
        setField(term135651, term135651.getClass(), "eventCache", null);
        setBooleanField(term135651, term135651.getClass(), "coalescingEnabled", false);
        setBooleanField(term135651, term135651.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term135651, term135651.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.About");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAboutCard", argTypes, term135651, args);
    }

};


