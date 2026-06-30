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
     Object term28362;

    public KDialog_setPreferences_11730875873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28362 = newInstance(Class.forName("proto.KDialog"));
        setIntField(term28362, term28362.getClass(), "defaultCloseOperation", 0);
        setField(term28362, term28362.getClass(), "rootPane", null);
        setBooleanField(term28362, term28362.getClass(), "rootPaneCheckingEnabled", false);
        setField(term28362, term28362.getClass(), "transferHandler", null);
        setField(term28362, term28362.getClass(), "accessibleContext", null);
        setBooleanField(term28362, term28362.getClass(), "resizable", false);
        setBooleanField(term28362, term28362.getClass(), "undecorated", false);
        setBooleanField(term28362, term28362.getClass(), "initialized", false);
        setBooleanField(term28362, term28362.getClass(), "modal", false);
        setField(term28362, term28362.getClass(), "modalityType", null);
        setField(term28362, term28362.getClass(), "blockedWindows", null);
        setField(term28362, term28362.getClass(), "title", null);
        setField(term28362, term28362.getClass(), "modalFilter", null);
        setField(term28362, term28362.getClass(), "secondaryLoop", null);
        setBooleanField(term28362, term28362.getClass(), "isInHide", false);
        setBooleanField(term28362, term28362.getClass(), "isInDispose", false);
        setField(term28362, term28362.getClass(), "warningString", null);
        setField(term28362, term28362.getClass(), "icons", null);
        setField(term28362, term28362.getClass(), "temporaryLostComponent", null);
        setBooleanField(term28362, term28362.getClass(), "syncLWRequests", false);
        setBooleanField(term28362, term28362.getClass(), "beforeFirstShow", false);
        setBooleanField(term28362, term28362.getClass(), "disposing", false);
        setField(term28362, term28362.getClass(), "disposerRecord", null);
        setIntField(term28362, term28362.getClass(), "state", 0);
        setBooleanField(term28362, term28362.getClass(), "alwaysOnTop", false);
        setField(term28362, term28362.getClass(), "ownedWindowList", null);
        setField(term28362, term28362.getClass(), "weakThis", null);
        setBooleanField(term28362, term28362.getClass(), "showWithParent", false);
        setField(term28362, term28362.getClass(), "modalBlocker", null);
        setField(term28362, term28362.getClass(), "modalExclusionType", null);
        setField(term28362, term28362.getClass(), "windowListener", null);
        setField(term28362, term28362.getClass(), "windowStateListener", null);
        setField(term28362, term28362.getClass(), "windowFocusListener", null);
        setField(term28362, term28362.getClass(), "inputContext", null);
        setField(term28362, term28362.getClass(), "inputContextLock", null);
        setField(term28362, term28362.getClass(), "focusMgr", null);
        setBooleanField(term28362, term28362.getClass(), "focusableWindowState", false);
        setBooleanField(term28362, term28362.getClass(), "autoRequestFocus", false);
        setBooleanField(term28362, term28362.getClass(), "isInShow", false);
        setFloatField(term28362, term28362.getClass(), "opacity", 0.0F);
        setField(term28362, term28362.getClass(), "shape", null);
        setBooleanField(term28362, term28362.getClass(), "isTrayIconWindow", false);
        setIntField(term28362, term28362.getClass(), "securityWarningWidth", 0);
        setIntField(term28362, term28362.getClass(), "securityWarningHeight", 0);
        setDoubleField(term28362, term28362.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term28362, term28362.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term28362, term28362.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term28362, term28362.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term28362, term28362.getClass(), "anchor", null);
        setField(term28362, term28362.getClass(), "type", null);
        setIntField(term28362, term28362.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term28362, term28362.getClass(), "locationByPlatform", false);
        setField(term28362, term28362.getClass(), "component", null);
        setField(term28362, term28362.getClass(), "layoutMgr", null);
        setField(term28362, term28362.getClass(), "dispatcher", null);
        setField(term28362, term28362.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term28362, term28362.getClass(), "focusCycleRoot", false);
        setBooleanField(term28362, term28362.getClass(), "focusTraversalPolicyProvider", false);
        setField(term28362, term28362.getClass(), "printingThreads", null);
        setBooleanField(term28362, term28362.getClass(), "printing", false);
        setField(term28362, term28362.getClass(), "containerListener", null);
        setIntField(term28362, term28362.getClass(), "listeningChildren", 0);
        setIntField(term28362, term28362.getClass(), "listeningBoundsChildren", 0);
        setIntField(term28362, term28362.getClass(), "descendantsCount", 0);
        setField(term28362, term28362.getClass(), "preserveBackgroundColor", null);
        setIntField(term28362, term28362.getClass(), "numOfHWComponents", 0);
        setIntField(term28362, term28362.getClass(), "numOfLWComponents", 0);
        setField(term28362, term28362.getClass(), "modalComp", null);
        setField(term28362, term28362.getClass(), "modalAppContext", null);
        setIntField(term28362, term28362.getClass(), "containerSerializedDataVersion", 0);
        setField(term28362, term28362.getClass(), "peer", null);
        setField(term28362, term28362.getClass(), "parent", null);
        setField(term28362, term28362.getClass(), "appContext", null);
        setIntField(term28362, term28362.getClass(), "x", 0);
        setIntField(term28362, term28362.getClass(), "y", 0);
        setIntField(term28362, term28362.getClass(), "width", 0);
        setIntField(term28362, term28362.getClass(), "height", 0);
        setField(term28362, term28362.getClass(), "foreground", null);
        setField(term28362, term28362.getClass(), "background", null);
        setField(term28362, term28362.getClass(), "font", null);
        setField(term28362, term28362.getClass(), "peerFont", null);
        setField(term28362, term28362.getClass(), "cursor", null);
        setField(term28362, term28362.getClass(), "locale", null);
        setField(term28362, term28362.getClass(), "graphicsConfig", null);
        setField(term28362, term28362.getClass(), "bufferStrategy", null);
        setBooleanField(term28362, term28362.getClass(), "ignoreRepaint", false);
        setBooleanField(term28362, term28362.getClass(), "visible", false);
        setBooleanField(term28362, term28362.getClass(), "enabled", false);
        setBooleanField(term28362, term28362.getClass(), "valid", false);
        setField(term28362, term28362.getClass(), "dropTarget", null);
        setField(term28362, term28362.getClass(), "popups", null);
        setField(term28362, term28362.getClass(), "name", null);
        setBooleanField(term28362, term28362.getClass(), "nameExplicitlySet", false);
        setBooleanField(term28362, term28362.getClass(), "focusable", false);
        setIntField(term28362, term28362.getClass(), "isFocusTraversableOverridden", 0);
        setField(term28362, term28362.getClass(), "focusTraversalKeys", null);
        setBooleanField(term28362, term28362.getClass(), "focusTraversalKeysEnabled", false);
        setField(term28362, term28362.getClass(), "acc", null);
        setField(term28362, term28362.getClass(), "minSize", null);
        setBooleanField(term28362, term28362.getClass(), "minSizeSet", false);
        setField(term28362, term28362.getClass(), "prefSize", null);
        setBooleanField(term28362, term28362.getClass(), "prefSizeSet", false);
        setField(term28362, term28362.getClass(), "maxSize", null);
        setBooleanField(term28362, term28362.getClass(), "maxSizeSet", false);
        setField(term28362, term28362.getClass(), "componentOrientation", null);
        setBooleanField(term28362, term28362.getClass(), "newEventsOnly", false);
        setField(term28362, term28362.getClass(), "componentListener", null);
        setField(term28362, term28362.getClass(), "focusListener", null);
        setField(term28362, term28362.getClass(), "hierarchyListener", null);
        setField(term28362, term28362.getClass(), "hierarchyBoundsListener", null);
        setField(term28362, term28362.getClass(), "keyListener", null);
        setField(term28362, term28362.getClass(), "mouseListener", null);
        setField(term28362, term28362.getClass(), "mouseMotionListener", null);
        setField(term28362, term28362.getClass(), "mouseWheelListener", null);
        setField(term28362, term28362.getClass(), "inputMethodListener", null);
        setLongField(term28362, term28362.getClass(), "eventMask", 0L);
        setField(term28362, term28362.getClass(), "changeSupport", null);
        setField(term28362, term28362.getClass(), "objectLock", null);
        setBooleanField(term28362, term28362.getClass(), "isPacked", false);
        setIntField(term28362, term28362.getClass(), "boundsOp", 0);
        setField(term28362, term28362.getClass(), "compoundShape", null);
        setField(term28362, term28362.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term28362, term28362.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term28362, term28362.getClass(), "backgroundEraseDisabled", false);
        setField(term28362, term28362.getClass(), "eventCache", null);
        setBooleanField(term28362, term28362.getClass(), "coalescingEnabled", false);
        setBooleanField(term28362, term28362.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term28362, term28362.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KDialog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term28362, args);
    }

};


