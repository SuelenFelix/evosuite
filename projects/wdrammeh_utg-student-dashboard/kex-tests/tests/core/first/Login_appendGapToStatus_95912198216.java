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

public class Login_appendGapToStatus_95912198216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7911;

    public Login_appendGapToStatus_95912198216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7911 = newInstance(Class.forName("core.first.Login"));
        setField(term7911, term7911.getClass(), "parent", null);
        setIntField(term7911, term7911.getClass(), "defaultCloseOperation", 0);
        setField(term7911, term7911.getClass(), "rootPane", null);
        setBooleanField(term7911, term7911.getClass(), "rootPaneCheckingEnabled", false);
        setField(term7911, term7911.getClass(), "transferHandler", null);
        setField(term7911, term7911.getClass(), "accessibleContext", null);
        setBooleanField(term7911, term7911.getClass(), "resizable", false);
        setBooleanField(term7911, term7911.getClass(), "undecorated", false);
        setBooleanField(term7911, term7911.getClass(), "initialized", false);
        setBooleanField(term7911, term7911.getClass(), "modal", false);
        setField(term7911, term7911.getClass(), "modalityType", null);
        setField(term7911, term7911.getClass(), "blockedWindows", null);
        setField(term7911, term7911.getClass(), "title", null);
        setField(term7911, term7911.getClass(), "modalFilter", null);
        setField(term7911, term7911.getClass(), "secondaryLoop", null);
        setBooleanField(term7911, term7911.getClass(), "isInHide", false);
        setBooleanField(term7911, term7911.getClass(), "isInDispose", false);
        setField(term7911, term7911.getClass(), "warningString", null);
        setField(term7911, term7911.getClass(), "icons", null);
        setField(term7911, term7911.getClass(), "temporaryLostComponent", null);
        setBooleanField(term7911, term7911.getClass(), "syncLWRequests", false);
        setBooleanField(term7911, term7911.getClass(), "beforeFirstShow", false);
        setBooleanField(term7911, term7911.getClass(), "disposing", false);
        setField(term7911, term7911.getClass(), "disposerRecord", null);
        setIntField(term7911, term7911.getClass(), "state", 0);
        setBooleanField(term7911, term7911.getClass(), "alwaysOnTop", false);
        setField(term7911, term7911.getClass(), "ownedWindowList", null);
        setField(term7911, term7911.getClass(), "weakThis", null);
        setBooleanField(term7911, term7911.getClass(), "showWithParent", false);
        setField(term7911, term7911.getClass(), "modalBlocker", null);
        setField(term7911, term7911.getClass(), "modalExclusionType", null);
        setField(term7911, term7911.getClass(), "windowListener", null);
        setField(term7911, term7911.getClass(), "windowStateListener", null);
        setField(term7911, term7911.getClass(), "windowFocusListener", null);
        setField(term7911, term7911.getClass(), "inputContext", null);
        setField(term7911, term7911.getClass(), "inputContextLock", null);
        setField(term7911, term7911.getClass(), "focusMgr", null);
        setBooleanField(term7911, term7911.getClass(), "focusableWindowState", false);
        setBooleanField(term7911, term7911.getClass(), "autoRequestFocus", false);
        setBooleanField(term7911, term7911.getClass(), "isInShow", false);
        setFloatField(term7911, term7911.getClass(), "opacity", 0.0F);
        setField(term7911, term7911.getClass(), "shape", null);
        setBooleanField(term7911, term7911.getClass(), "isTrayIconWindow", false);
        setIntField(term7911, term7911.getClass(), "securityWarningWidth", 0);
        setIntField(term7911, term7911.getClass(), "securityWarningHeight", 0);
        setDoubleField(term7911, term7911.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term7911, term7911.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term7911, term7911.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term7911, term7911.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term7911, term7911.getClass(), "anchor", null);
        setField(term7911, term7911.getClass(), "type", null);
        setIntField(term7911, term7911.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term7911, term7911.getClass(), "locationByPlatform", false);
        setField(term7911, term7911.getClass(), "component", null);
        setField(term7911, term7911.getClass(), "layoutMgr", null);
        setField(term7911, term7911.getClass(), "dispatcher", null);
        setField(term7911, term7911.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term7911, term7911.getClass(), "focusCycleRoot", false);
        setBooleanField(term7911, term7911.getClass(), "focusTraversalPolicyProvider", false);
        setField(term7911, term7911.getClass(), "printingThreads", null);
        setBooleanField(term7911, term7911.getClass(), "printing", false);
        setField(term7911, term7911.getClass(), "containerListener", null);
        setIntField(term7911, term7911.getClass(), "listeningChildren", 0);
        setIntField(term7911, term7911.getClass(), "listeningBoundsChildren", 0);
        setIntField(term7911, term7911.getClass(), "descendantsCount", 0);
        setField(term7911, term7911.getClass(), "preserveBackgroundColor", null);
        setIntField(term7911, term7911.getClass(), "numOfHWComponents", 0);
        setIntField(term7911, term7911.getClass(), "numOfLWComponents", 0);
        setField(term7911, term7911.getClass(), "modalComp", null);
        setField(term7911, term7911.getClass(), "modalAppContext", null);
        setIntField(term7911, term7911.getClass(), "containerSerializedDataVersion", 0);
        setField(term7911, term7911.getClass(), "peer", null);
        setField(term7911, term7911.getClass(), "parent", null);
        setField(term7911, term7911.getClass(), "appContext", null);
        setIntField(term7911, term7911.getClass(), "x", 0);
        setIntField(term7911, term7911.getClass(), "y", 0);
        setIntField(term7911, term7911.getClass(), "width", 0);
        setIntField(term7911, term7911.getClass(), "height", 0);
        setField(term7911, term7911.getClass(), "foreground", null);
        setField(term7911, term7911.getClass(), "background", null);
        setField(term7911, term7911.getClass(), "font", null);
        setField(term7911, term7911.getClass(), "peerFont", null);
        setField(term7911, term7911.getClass(), "cursor", null);
        setField(term7911, term7911.getClass(), "locale", null);
        setField(term7911, term7911.getClass(), "graphicsConfig", null);
        setField(term7911, term7911.getClass(), "bufferStrategy", null);
        setBooleanField(term7911, term7911.getClass(), "ignoreRepaint", false);
        setBooleanField(term7911, term7911.getClass(), "visible", false);
        setBooleanField(term7911, term7911.getClass(), "enabled", false);
        setBooleanField(term7911, term7911.getClass(), "valid", false);
        setField(term7911, term7911.getClass(), "dropTarget", null);
        setField(term7911, term7911.getClass(), "popups", null);
        setField(term7911, term7911.getClass(), "name", null);
        setBooleanField(term7911, term7911.getClass(), "nameExplicitlySet", false);
        setBooleanField(term7911, term7911.getClass(), "focusable", false);
        setIntField(term7911, term7911.getClass(), "isFocusTraversableOverridden", 0);
        setField(term7911, term7911.getClass(), "focusTraversalKeys", null);
        setBooleanField(term7911, term7911.getClass(), "focusTraversalKeysEnabled", false);
        setField(term7911, term7911.getClass(), "acc", null);
        setField(term7911, term7911.getClass(), "minSize", null);
        setBooleanField(term7911, term7911.getClass(), "minSizeSet", false);
        setField(term7911, term7911.getClass(), "prefSize", null);
        setBooleanField(term7911, term7911.getClass(), "prefSizeSet", false);
        setField(term7911, term7911.getClass(), "maxSize", null);
        setBooleanField(term7911, term7911.getClass(), "maxSizeSet", false);
        setField(term7911, term7911.getClass(), "componentOrientation", null);
        setBooleanField(term7911, term7911.getClass(), "newEventsOnly", false);
        setField(term7911, term7911.getClass(), "componentListener", null);
        setField(term7911, term7911.getClass(), "focusListener", null);
        setField(term7911, term7911.getClass(), "hierarchyListener", null);
        setField(term7911, term7911.getClass(), "hierarchyBoundsListener", null);
        setField(term7911, term7911.getClass(), "keyListener", null);
        setField(term7911, term7911.getClass(), "mouseListener", null);
        setField(term7911, term7911.getClass(), "mouseMotionListener", null);
        setField(term7911, term7911.getClass(), "mouseWheelListener", null);
        setField(term7911, term7911.getClass(), "inputMethodListener", null);
        setLongField(term7911, term7911.getClass(), "eventMask", 0L);
        setField(term7911, term7911.getClass(), "changeSupport", null);
        setField(term7911, term7911.getClass(), "objectLock", null);
        setBooleanField(term7911, term7911.getClass(), "isPacked", false);
        setIntField(term7911, term7911.getClass(), "boundsOp", 0);
        setField(term7911, term7911.getClass(), "compoundShape", null);
        setField(term7911, term7911.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term7911, term7911.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term7911, term7911.getClass(), "backgroundEraseDisabled", false);
        setField(term7911, term7911.getClass(), "eventCache", null);
        setBooleanField(term7911, term7911.getClass(), "coalescingEnabled", false);
        setBooleanField(term7911, term7911.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term7911, term7911.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.first.Login");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "appendGapToStatus", argTypes, term7911, args);
    }

};


