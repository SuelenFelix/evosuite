package core.first;

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
import static core.first.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FirstLaunch_majorCodeComponent_7523153932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4475;

    public FirstLaunch_majorCodeComponent_7523153932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4475 = newInstance(Class.forName("core.first.FirstLaunch"));
        setField(term4475, term4475.getClass(), "contentPanel", null);
        setField(term4475, term4475.getClass(), "bigFont", null);
        setField(term4475, term4475.getClass(), "layout", null);
        setIntField(term4475, term4475.getClass(), "defaultCloseOperation", 0);
        setField(term4475, term4475.getClass(), "rootPane", null);
        setBooleanField(term4475, term4475.getClass(), "rootPaneCheckingEnabled", false);
        setField(term4475, term4475.getClass(), "transferHandler", null);
        setField(term4475, term4475.getClass(), "accessibleContext", null);
        setBooleanField(term4475, term4475.getClass(), "resizable", false);
        setBooleanField(term4475, term4475.getClass(), "undecorated", false);
        setBooleanField(term4475, term4475.getClass(), "initialized", false);
        setBooleanField(term4475, term4475.getClass(), "modal", false);
        setField(term4475, term4475.getClass(), "modalityType", null);
        setField(term4475, term4475.getClass(), "blockedWindows", null);
        setField(term4475, term4475.getClass(), "title", null);
        setField(term4475, term4475.getClass(), "modalFilter", null);
        setField(term4475, term4475.getClass(), "secondaryLoop", null);
        setBooleanField(term4475, term4475.getClass(), "isInHide", false);
        setBooleanField(term4475, term4475.getClass(), "isInDispose", false);
        setField(term4475, term4475.getClass(), "warningString", null);
        setField(term4475, term4475.getClass(), "icons", null);
        setField(term4475, term4475.getClass(), "temporaryLostComponent", null);
        setBooleanField(term4475, term4475.getClass(), "syncLWRequests", false);
        setBooleanField(term4475, term4475.getClass(), "beforeFirstShow", false);
        setBooleanField(term4475, term4475.getClass(), "disposing", false);
        setField(term4475, term4475.getClass(), "disposerRecord", null);
        setIntField(term4475, term4475.getClass(), "state", 0);
        setBooleanField(term4475, term4475.getClass(), "alwaysOnTop", false);
        setField(term4475, term4475.getClass(), "ownedWindowList", null);
        setField(term4475, term4475.getClass(), "weakThis", null);
        setBooleanField(term4475, term4475.getClass(), "showWithParent", false);
        setField(term4475, term4475.getClass(), "modalBlocker", null);
        setField(term4475, term4475.getClass(), "modalExclusionType", null);
        setField(term4475, term4475.getClass(), "windowListener", null);
        setField(term4475, term4475.getClass(), "windowStateListener", null);
        setField(term4475, term4475.getClass(), "windowFocusListener", null);
        setField(term4475, term4475.getClass(), "inputContext", null);
        setField(term4475, term4475.getClass(), "inputContextLock", null);
        setField(term4475, term4475.getClass(), "focusMgr", null);
        setBooleanField(term4475, term4475.getClass(), "focusableWindowState", false);
        setBooleanField(term4475, term4475.getClass(), "autoRequestFocus", false);
        setBooleanField(term4475, term4475.getClass(), "isInShow", false);
        setFloatField(term4475, term4475.getClass(), "opacity", 0.0F);
        setField(term4475, term4475.getClass(), "shape", null);
        setBooleanField(term4475, term4475.getClass(), "isTrayIconWindow", false);
        setIntField(term4475, term4475.getClass(), "securityWarningWidth", 0);
        setIntField(term4475, term4475.getClass(), "securityWarningHeight", 0);
        setDoubleField(term4475, term4475.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term4475, term4475.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term4475, term4475.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term4475, term4475.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term4475, term4475.getClass(), "anchor", null);
        setField(term4475, term4475.getClass(), "type", null);
        setIntField(term4475, term4475.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term4475, term4475.getClass(), "locationByPlatform", false);
        setField(term4475, term4475.getClass(), "component", null);
        setField(term4475, term4475.getClass(), "layoutMgr", null);
        setField(term4475, term4475.getClass(), "dispatcher", null);
        setField(term4475, term4475.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term4475, term4475.getClass(), "focusCycleRoot", false);
        setBooleanField(term4475, term4475.getClass(), "focusTraversalPolicyProvider", false);
        setField(term4475, term4475.getClass(), "printingThreads", null);
        setBooleanField(term4475, term4475.getClass(), "printing", false);
        setField(term4475, term4475.getClass(), "containerListener", null);
        setIntField(term4475, term4475.getClass(), "listeningChildren", 0);
        setIntField(term4475, term4475.getClass(), "listeningBoundsChildren", 0);
        setIntField(term4475, term4475.getClass(), "descendantsCount", 0);
        setField(term4475, term4475.getClass(), "preserveBackgroundColor", null);
        setIntField(term4475, term4475.getClass(), "numOfHWComponents", 0);
        setIntField(term4475, term4475.getClass(), "numOfLWComponents", 0);
        setField(term4475, term4475.getClass(), "modalComp", null);
        setField(term4475, term4475.getClass(), "modalAppContext", null);
        setIntField(term4475, term4475.getClass(), "containerSerializedDataVersion", 0);
        setField(term4475, term4475.getClass(), "peer", null);
        setField(term4475, term4475.getClass(), "parent", null);
        setField(term4475, term4475.getClass(), "appContext", null);
        setIntField(term4475, term4475.getClass(), "x", 0);
        setIntField(term4475, term4475.getClass(), "y", 0);
        setIntField(term4475, term4475.getClass(), "width", 0);
        setIntField(term4475, term4475.getClass(), "height", 0);
        setField(term4475, term4475.getClass(), "foreground", null);
        setField(term4475, term4475.getClass(), "background", null);
        setField(term4475, term4475.getClass(), "font", null);
        setField(term4475, term4475.getClass(), "peerFont", null);
        setField(term4475, term4475.getClass(), "cursor", null);
        setField(term4475, term4475.getClass(), "locale", null);
        setField(term4475, term4475.getClass(), "graphicsConfig", null);
        setField(term4475, term4475.getClass(), "bufferStrategy", null);
        setBooleanField(term4475, term4475.getClass(), "ignoreRepaint", false);
        setBooleanField(term4475, term4475.getClass(), "visible", false);
        setBooleanField(term4475, term4475.getClass(), "enabled", false);
        setBooleanField(term4475, term4475.getClass(), "valid", false);
        setField(term4475, term4475.getClass(), "dropTarget", null);
        setField(term4475, term4475.getClass(), "popups", null);
        setField(term4475, term4475.getClass(), "name", null);
        setBooleanField(term4475, term4475.getClass(), "nameExplicitlySet", false);
        setBooleanField(term4475, term4475.getClass(), "focusable", false);
        setIntField(term4475, term4475.getClass(), "isFocusTraversableOverridden", 0);
        setField(term4475, term4475.getClass(), "focusTraversalKeys", null);
        setBooleanField(term4475, term4475.getClass(), "focusTraversalKeysEnabled", false);
        setField(term4475, term4475.getClass(), "acc", null);
        setField(term4475, term4475.getClass(), "minSize", null);
        setBooleanField(term4475, term4475.getClass(), "minSizeSet", false);
        setField(term4475, term4475.getClass(), "prefSize", null);
        setBooleanField(term4475, term4475.getClass(), "prefSizeSet", false);
        setField(term4475, term4475.getClass(), "maxSize", null);
        setBooleanField(term4475, term4475.getClass(), "maxSizeSet", false);
        setField(term4475, term4475.getClass(), "componentOrientation", null);
        setBooleanField(term4475, term4475.getClass(), "newEventsOnly", false);
        setField(term4475, term4475.getClass(), "componentListener", null);
        setField(term4475, term4475.getClass(), "focusListener", null);
        setField(term4475, term4475.getClass(), "hierarchyListener", null);
        setField(term4475, term4475.getClass(), "hierarchyBoundsListener", null);
        setField(term4475, term4475.getClass(), "keyListener", null);
        setField(term4475, term4475.getClass(), "mouseListener", null);
        setField(term4475, term4475.getClass(), "mouseMotionListener", null);
        setField(term4475, term4475.getClass(), "mouseWheelListener", null);
        setField(term4475, term4475.getClass(), "inputMethodListener", null);
        setLongField(term4475, term4475.getClass(), "eventMask", 0L);
        setField(term4475, term4475.getClass(), "changeSupport", null);
        setField(term4475, term4475.getClass(), "objectLock", null);
        setBooleanField(term4475, term4475.getClass(), "isPacked", false);
        setIntField(term4475, term4475.getClass(), "boundsOp", 0);
        setField(term4475, term4475.getClass(), "compoundShape", null);
        setField(term4475, term4475.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term4475, term4475.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term4475, term4475.getClass(), "backgroundEraseDisabled", false);
        setField(term4475, term4475.getClass(), "eventCache", null);
        setBooleanField(term4475, term4475.getClass(), "coalescingEnabled", false);
        setBooleanField(term4475, term4475.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term4475, term4475.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.first.FirstLaunch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "majorCodeComponent", argTypes, term4475, args);
    }

};


