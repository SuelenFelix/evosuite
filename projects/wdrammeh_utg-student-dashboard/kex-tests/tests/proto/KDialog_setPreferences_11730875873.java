package proto;

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
import static proto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class KDialog_setPreferences_11730875873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28395;

    public KDialog_setPreferences_11730875873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28395 = newInstance(Class.forName("proto.KDialog"));
        setIntField(term28395, term28395.getClass(), "defaultCloseOperation", 0);
        setField(term28395, term28395.getClass(), "rootPane", null);
        setBooleanField(term28395, term28395.getClass(), "rootPaneCheckingEnabled", false);
        setField(term28395, term28395.getClass(), "transferHandler", null);
        setField(term28395, term28395.getClass(), "accessibleContext", null);
        setBooleanField(term28395, term28395.getClass(), "resizable", false);
        setBooleanField(term28395, term28395.getClass(), "undecorated", false);
        setBooleanField(term28395, term28395.getClass(), "initialized", false);
        setBooleanField(term28395, term28395.getClass(), "modal", false);
        setField(term28395, term28395.getClass(), "modalityType", null);
        setField(term28395, term28395.getClass(), "blockedWindows", null);
        setField(term28395, term28395.getClass(), "title", null);
        setField(term28395, term28395.getClass(), "modalFilter", null);
        setField(term28395, term28395.getClass(), "secondaryLoop", null);
        setBooleanField(term28395, term28395.getClass(), "isInHide", false);
        setBooleanField(term28395, term28395.getClass(), "isInDispose", false);
        setField(term28395, term28395.getClass(), "warningString", null);
        setField(term28395, term28395.getClass(), "icons", null);
        setField(term28395, term28395.getClass(), "temporaryLostComponent", null);
        setBooleanField(term28395, term28395.getClass(), "syncLWRequests", false);
        setBooleanField(term28395, term28395.getClass(), "beforeFirstShow", false);
        setBooleanField(term28395, term28395.getClass(), "disposing", false);
        setField(term28395, term28395.getClass(), "disposerRecord", null);
        setIntField(term28395, term28395.getClass(), "state", 0);
        setBooleanField(term28395, term28395.getClass(), "alwaysOnTop", false);
        setField(term28395, term28395.getClass(), "ownedWindowList", null);
        setField(term28395, term28395.getClass(), "weakThis", null);
        setBooleanField(term28395, term28395.getClass(), "showWithParent", false);
        setField(term28395, term28395.getClass(), "modalBlocker", null);
        setField(term28395, term28395.getClass(), "modalExclusionType", null);
        setField(term28395, term28395.getClass(), "windowListener", null);
        setField(term28395, term28395.getClass(), "windowStateListener", null);
        setField(term28395, term28395.getClass(), "windowFocusListener", null);
        setField(term28395, term28395.getClass(), "inputContext", null);
        setField(term28395, term28395.getClass(), "inputContextLock", null);
        setField(term28395, term28395.getClass(), "focusMgr", null);
        setBooleanField(term28395, term28395.getClass(), "focusableWindowState", false);
        setBooleanField(term28395, term28395.getClass(), "autoRequestFocus", false);
        setBooleanField(term28395, term28395.getClass(), "isInShow", false);
        setFloatField(term28395, term28395.getClass(), "opacity", 0.0F);
        setField(term28395, term28395.getClass(), "shape", null);
        setBooleanField(term28395, term28395.getClass(), "isTrayIconWindow", false);
        setIntField(term28395, term28395.getClass(), "securityWarningWidth", 0);
        setIntField(term28395, term28395.getClass(), "securityWarningHeight", 0);
        setDoubleField(term28395, term28395.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term28395, term28395.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term28395, term28395.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term28395, term28395.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term28395, term28395.getClass(), "anchor", null);
        setField(term28395, term28395.getClass(), "type", null);
        setIntField(term28395, term28395.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term28395, term28395.getClass(), "locationByPlatform", false);
        setField(term28395, term28395.getClass(), "component", null);
        setField(term28395, term28395.getClass(), "layoutMgr", null);
        setField(term28395, term28395.getClass(), "dispatcher", null);
        setField(term28395, term28395.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term28395, term28395.getClass(), "focusCycleRoot", false);
        setBooleanField(term28395, term28395.getClass(), "focusTraversalPolicyProvider", false);
        setField(term28395, term28395.getClass(), "printingThreads", null);
        setBooleanField(term28395, term28395.getClass(), "printing", false);
        setField(term28395, term28395.getClass(), "containerListener", null);
        setIntField(term28395, term28395.getClass(), "listeningChildren", 0);
        setIntField(term28395, term28395.getClass(), "listeningBoundsChildren", 0);
        setIntField(term28395, term28395.getClass(), "descendantsCount", 0);
        setField(term28395, term28395.getClass(), "preserveBackgroundColor", null);
        setIntField(term28395, term28395.getClass(), "numOfHWComponents", 0);
        setIntField(term28395, term28395.getClass(), "numOfLWComponents", 0);
        setField(term28395, term28395.getClass(), "modalComp", null);
        setField(term28395, term28395.getClass(), "modalAppContext", null);
        setIntField(term28395, term28395.getClass(), "containerSerializedDataVersion", 0);
        setField(term28395, term28395.getClass(), "peer", null);
        setField(term28395, term28395.getClass(), "parent", null);
        setField(term28395, term28395.getClass(), "appContext", null);
        setIntField(term28395, term28395.getClass(), "x", 0);
        setIntField(term28395, term28395.getClass(), "y", 0);
        setIntField(term28395, term28395.getClass(), "width", 0);
        setIntField(term28395, term28395.getClass(), "height", 0);
        setField(term28395, term28395.getClass(), "foreground", null);
        setField(term28395, term28395.getClass(), "background", null);
        setField(term28395, term28395.getClass(), "font", null);
        setField(term28395, term28395.getClass(), "peerFont", null);
        setField(term28395, term28395.getClass(), "cursor", null);
        setField(term28395, term28395.getClass(), "locale", null);
        setField(term28395, term28395.getClass(), "graphicsConfig", null);
        setField(term28395, term28395.getClass(), "bufferStrategy", null);
        setBooleanField(term28395, term28395.getClass(), "ignoreRepaint", false);
        setBooleanField(term28395, term28395.getClass(), "visible", false);
        setBooleanField(term28395, term28395.getClass(), "enabled", false);
        setBooleanField(term28395, term28395.getClass(), "valid", false);
        setField(term28395, term28395.getClass(), "dropTarget", null);
        setField(term28395, term28395.getClass(), "popups", null);
        setField(term28395, term28395.getClass(), "name", null);
        setBooleanField(term28395, term28395.getClass(), "nameExplicitlySet", false);
        setBooleanField(term28395, term28395.getClass(), "focusable", false);
        setIntField(term28395, term28395.getClass(), "isFocusTraversableOverridden", 0);
        setField(term28395, term28395.getClass(), "focusTraversalKeys", null);
        setBooleanField(term28395, term28395.getClass(), "focusTraversalKeysEnabled", false);
        setField(term28395, term28395.getClass(), "acc", null);
        setField(term28395, term28395.getClass(), "minSize", null);
        setBooleanField(term28395, term28395.getClass(), "minSizeSet", false);
        setField(term28395, term28395.getClass(), "prefSize", null);
        setBooleanField(term28395, term28395.getClass(), "prefSizeSet", false);
        setField(term28395, term28395.getClass(), "maxSize", null);
        setBooleanField(term28395, term28395.getClass(), "maxSizeSet", false);
        setField(term28395, term28395.getClass(), "componentOrientation", null);
        setBooleanField(term28395, term28395.getClass(), "newEventsOnly", false);
        setField(term28395, term28395.getClass(), "componentListener", null);
        setField(term28395, term28395.getClass(), "focusListener", null);
        setField(term28395, term28395.getClass(), "hierarchyListener", null);
        setField(term28395, term28395.getClass(), "hierarchyBoundsListener", null);
        setField(term28395, term28395.getClass(), "keyListener", null);
        setField(term28395, term28395.getClass(), "mouseListener", null);
        setField(term28395, term28395.getClass(), "mouseMotionListener", null);
        setField(term28395, term28395.getClass(), "mouseWheelListener", null);
        setField(term28395, term28395.getClass(), "inputMethodListener", null);
        setLongField(term28395, term28395.getClass(), "eventMask", 0L);
        setField(term28395, term28395.getClass(), "changeSupport", null);
        setField(term28395, term28395.getClass(), "objectLock", null);
        setBooleanField(term28395, term28395.getClass(), "isPacked", false);
        setIntField(term28395, term28395.getClass(), "boundsOp", 0);
        setField(term28395, term28395.getClass(), "compoundShape", null);
        setField(term28395, term28395.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term28395, term28395.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term28395, term28395.getClass(), "backgroundEraseDisabled", false);
        setField(term28395, term28395.getClass(), "eventCache", null);
        setBooleanField(term28395, term28395.getClass(), "coalescingEnabled", false);
        setBooleanField(term28395, term28395.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term28395, term28395.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KDialog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term28395, args);
    }

};


