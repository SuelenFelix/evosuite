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

public class Login_loginTriggered_4961913998 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7789;

    public Login_loginTriggered_4961913998() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7789 = newInstance(Class.forName("core.first.Login"));
        setField(term7789, term7789.getClass(), "parent", null);
        setIntField(term7789, term7789.getClass(), "defaultCloseOperation", 0);
        setField(term7789, term7789.getClass(), "rootPane", null);
        setBooleanField(term7789, term7789.getClass(), "rootPaneCheckingEnabled", false);
        setField(term7789, term7789.getClass(), "transferHandler", null);
        setField(term7789, term7789.getClass(), "accessibleContext", null);
        setBooleanField(term7789, term7789.getClass(), "resizable", false);
        setBooleanField(term7789, term7789.getClass(), "undecorated", false);
        setBooleanField(term7789, term7789.getClass(), "initialized", false);
        setBooleanField(term7789, term7789.getClass(), "modal", false);
        setField(term7789, term7789.getClass(), "modalityType", null);
        setField(term7789, term7789.getClass(), "blockedWindows", null);
        setField(term7789, term7789.getClass(), "title", null);
        setField(term7789, term7789.getClass(), "modalFilter", null);
        setField(term7789, term7789.getClass(), "secondaryLoop", null);
        setBooleanField(term7789, term7789.getClass(), "isInHide", false);
        setBooleanField(term7789, term7789.getClass(), "isInDispose", false);
        setField(term7789, term7789.getClass(), "warningString", null);
        setField(term7789, term7789.getClass(), "icons", null);
        setField(term7789, term7789.getClass(), "temporaryLostComponent", null);
        setBooleanField(term7789, term7789.getClass(), "syncLWRequests", false);
        setBooleanField(term7789, term7789.getClass(), "beforeFirstShow", false);
        setBooleanField(term7789, term7789.getClass(), "disposing", false);
        setField(term7789, term7789.getClass(), "disposerRecord", null);
        setIntField(term7789, term7789.getClass(), "state", 0);
        setBooleanField(term7789, term7789.getClass(), "alwaysOnTop", false);
        setField(term7789, term7789.getClass(), "ownedWindowList", null);
        setField(term7789, term7789.getClass(), "weakThis", null);
        setBooleanField(term7789, term7789.getClass(), "showWithParent", false);
        setField(term7789, term7789.getClass(), "modalBlocker", null);
        setField(term7789, term7789.getClass(), "modalExclusionType", null);
        setField(term7789, term7789.getClass(), "windowListener", null);
        setField(term7789, term7789.getClass(), "windowStateListener", null);
        setField(term7789, term7789.getClass(), "windowFocusListener", null);
        setField(term7789, term7789.getClass(), "inputContext", null);
        setField(term7789, term7789.getClass(), "inputContextLock", null);
        setField(term7789, term7789.getClass(), "focusMgr", null);
        setBooleanField(term7789, term7789.getClass(), "focusableWindowState", false);
        setBooleanField(term7789, term7789.getClass(), "autoRequestFocus", false);
        setBooleanField(term7789, term7789.getClass(), "isInShow", false);
        setFloatField(term7789, term7789.getClass(), "opacity", 0.0F);
        setField(term7789, term7789.getClass(), "shape", null);
        setBooleanField(term7789, term7789.getClass(), "isTrayIconWindow", false);
        setIntField(term7789, term7789.getClass(), "securityWarningWidth", 0);
        setIntField(term7789, term7789.getClass(), "securityWarningHeight", 0);
        setDoubleField(term7789, term7789.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term7789, term7789.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term7789, term7789.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term7789, term7789.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term7789, term7789.getClass(), "anchor", null);
        setField(term7789, term7789.getClass(), "type", null);
        setIntField(term7789, term7789.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term7789, term7789.getClass(), "locationByPlatform", false);
        setField(term7789, term7789.getClass(), "component", null);
        setField(term7789, term7789.getClass(), "layoutMgr", null);
        setField(term7789, term7789.getClass(), "dispatcher", null);
        setField(term7789, term7789.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term7789, term7789.getClass(), "focusCycleRoot", false);
        setBooleanField(term7789, term7789.getClass(), "focusTraversalPolicyProvider", false);
        setField(term7789, term7789.getClass(), "printingThreads", null);
        setBooleanField(term7789, term7789.getClass(), "printing", false);
        setField(term7789, term7789.getClass(), "containerListener", null);
        setIntField(term7789, term7789.getClass(), "listeningChildren", 0);
        setIntField(term7789, term7789.getClass(), "listeningBoundsChildren", 0);
        setIntField(term7789, term7789.getClass(), "descendantsCount", 0);
        setField(term7789, term7789.getClass(), "preserveBackgroundColor", null);
        setIntField(term7789, term7789.getClass(), "numOfHWComponents", 0);
        setIntField(term7789, term7789.getClass(), "numOfLWComponents", 0);
        setField(term7789, term7789.getClass(), "modalComp", null);
        setField(term7789, term7789.getClass(), "modalAppContext", null);
        setIntField(term7789, term7789.getClass(), "containerSerializedDataVersion", 0);
        setField(term7789, term7789.getClass(), "peer", null);
        setField(term7789, term7789.getClass(), "parent", null);
        setField(term7789, term7789.getClass(), "appContext", null);
        setIntField(term7789, term7789.getClass(), "x", 0);
        setIntField(term7789, term7789.getClass(), "y", 0);
        setIntField(term7789, term7789.getClass(), "width", 0);
        setIntField(term7789, term7789.getClass(), "height", 0);
        setField(term7789, term7789.getClass(), "foreground", null);
        setField(term7789, term7789.getClass(), "background", null);
        setField(term7789, term7789.getClass(), "font", null);
        setField(term7789, term7789.getClass(), "peerFont", null);
        setField(term7789, term7789.getClass(), "cursor", null);
        setField(term7789, term7789.getClass(), "locale", null);
        setField(term7789, term7789.getClass(), "graphicsConfig", null);
        setField(term7789, term7789.getClass(), "bufferStrategy", null);
        setBooleanField(term7789, term7789.getClass(), "ignoreRepaint", false);
        setBooleanField(term7789, term7789.getClass(), "visible", false);
        setBooleanField(term7789, term7789.getClass(), "enabled", false);
        setBooleanField(term7789, term7789.getClass(), "valid", false);
        setField(term7789, term7789.getClass(), "dropTarget", null);
        setField(term7789, term7789.getClass(), "popups", null);
        setField(term7789, term7789.getClass(), "name", null);
        setBooleanField(term7789, term7789.getClass(), "nameExplicitlySet", false);
        setBooleanField(term7789, term7789.getClass(), "focusable", false);
        setIntField(term7789, term7789.getClass(), "isFocusTraversableOverridden", 0);
        setField(term7789, term7789.getClass(), "focusTraversalKeys", null);
        setBooleanField(term7789, term7789.getClass(), "focusTraversalKeysEnabled", false);
        setField(term7789, term7789.getClass(), "acc", null);
        setField(term7789, term7789.getClass(), "minSize", null);
        setBooleanField(term7789, term7789.getClass(), "minSizeSet", false);
        setField(term7789, term7789.getClass(), "prefSize", null);
        setBooleanField(term7789, term7789.getClass(), "prefSizeSet", false);
        setField(term7789, term7789.getClass(), "maxSize", null);
        setBooleanField(term7789, term7789.getClass(), "maxSizeSet", false);
        setField(term7789, term7789.getClass(), "componentOrientation", null);
        setBooleanField(term7789, term7789.getClass(), "newEventsOnly", false);
        setField(term7789, term7789.getClass(), "componentListener", null);
        setField(term7789, term7789.getClass(), "focusListener", null);
        setField(term7789, term7789.getClass(), "hierarchyListener", null);
        setField(term7789, term7789.getClass(), "hierarchyBoundsListener", null);
        setField(term7789, term7789.getClass(), "keyListener", null);
        setField(term7789, term7789.getClass(), "mouseListener", null);
        setField(term7789, term7789.getClass(), "mouseMotionListener", null);
        setField(term7789, term7789.getClass(), "mouseWheelListener", null);
        setField(term7789, term7789.getClass(), "inputMethodListener", null);
        setLongField(term7789, term7789.getClass(), "eventMask", 0L);
        setField(term7789, term7789.getClass(), "changeSupport", null);
        setField(term7789, term7789.getClass(), "objectLock", null);
        setBooleanField(term7789, term7789.getClass(), "isPacked", false);
        setIntField(term7789, term7789.getClass(), "boundsOp", 0);
        setField(term7789, term7789.getClass(), "compoundShape", null);
        setField(term7789, term7789.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term7789, term7789.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term7789, term7789.getClass(), "backgroundEraseDisabled", false);
        setField(term7789, term7789.getClass(), "eventCache", null);
        setBooleanField(term7789, term7789.getClass(), "coalescingEnabled", false);
        setBooleanField(term7789, term7789.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term7789, term7789.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.first.Login");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "loginTriggered", argTypes, term7789, args);
    }

};


