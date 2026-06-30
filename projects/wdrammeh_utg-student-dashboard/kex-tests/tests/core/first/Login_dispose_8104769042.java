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

public class Login_dispose_8104769042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6916;

    public Login_dispose_8104769042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6916 = newInstance(Class.forName("core.first.Login"));
        setField(term6916, term6916.getClass(), "parent", null);
        setIntField(term6916, term6916.getClass(), "defaultCloseOperation", 0);
        setField(term6916, term6916.getClass(), "rootPane", null);
        setBooleanField(term6916, term6916.getClass(), "rootPaneCheckingEnabled", false);
        setField(term6916, term6916.getClass(), "transferHandler", null);
        setField(term6916, term6916.getClass(), "accessibleContext", null);
        setBooleanField(term6916, term6916.getClass(), "resizable", false);
        setBooleanField(term6916, term6916.getClass(), "undecorated", false);
        setBooleanField(term6916, term6916.getClass(), "initialized", false);
        setBooleanField(term6916, term6916.getClass(), "modal", false);
        setField(term6916, term6916.getClass(), "modalityType", null);
        setField(term6916, term6916.getClass(), "blockedWindows", null);
        setField(term6916, term6916.getClass(), "title", null);
        setField(term6916, term6916.getClass(), "modalFilter", null);
        setField(term6916, term6916.getClass(), "secondaryLoop", null);
        setBooleanField(term6916, term6916.getClass(), "isInHide", false);
        setBooleanField(term6916, term6916.getClass(), "isInDispose", false);
        setField(term6916, term6916.getClass(), "warningString", null);
        setField(term6916, term6916.getClass(), "icons", null);
        setField(term6916, term6916.getClass(), "temporaryLostComponent", null);
        setBooleanField(term6916, term6916.getClass(), "syncLWRequests", false);
        setBooleanField(term6916, term6916.getClass(), "beforeFirstShow", false);
        setBooleanField(term6916, term6916.getClass(), "disposing", false);
        setField(term6916, term6916.getClass(), "disposerRecord", null);
        setIntField(term6916, term6916.getClass(), "state", 0);
        setBooleanField(term6916, term6916.getClass(), "alwaysOnTop", false);
        setField(term6916, term6916.getClass(), "ownedWindowList", null);
        setField(term6916, term6916.getClass(), "weakThis", null);
        setBooleanField(term6916, term6916.getClass(), "showWithParent", false);
        setField(term6916, term6916.getClass(), "modalBlocker", null);
        setField(term6916, term6916.getClass(), "modalExclusionType", null);
        setField(term6916, term6916.getClass(), "windowListener", null);
        setField(term6916, term6916.getClass(), "windowStateListener", null);
        setField(term6916, term6916.getClass(), "windowFocusListener", null);
        setField(term6916, term6916.getClass(), "inputContext", null);
        setField(term6916, term6916.getClass(), "inputContextLock", null);
        setField(term6916, term6916.getClass(), "focusMgr", null);
        setBooleanField(term6916, term6916.getClass(), "focusableWindowState", false);
        setBooleanField(term6916, term6916.getClass(), "autoRequestFocus", false);
        setBooleanField(term6916, term6916.getClass(), "isInShow", false);
        setFloatField(term6916, term6916.getClass(), "opacity", 0.0F);
        setField(term6916, term6916.getClass(), "shape", null);
        setBooleanField(term6916, term6916.getClass(), "isTrayIconWindow", false);
        setIntField(term6916, term6916.getClass(), "securityWarningWidth", 0);
        setIntField(term6916, term6916.getClass(), "securityWarningHeight", 0);
        setDoubleField(term6916, term6916.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term6916, term6916.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term6916, term6916.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term6916, term6916.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term6916, term6916.getClass(), "anchor", null);
        setField(term6916, term6916.getClass(), "type", null);
        setIntField(term6916, term6916.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term6916, term6916.getClass(), "locationByPlatform", false);
        setField(term6916, term6916.getClass(), "component", null);
        setField(term6916, term6916.getClass(), "layoutMgr", null);
        setField(term6916, term6916.getClass(), "dispatcher", null);
        setField(term6916, term6916.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term6916, term6916.getClass(), "focusCycleRoot", false);
        setBooleanField(term6916, term6916.getClass(), "focusTraversalPolicyProvider", false);
        setField(term6916, term6916.getClass(), "printingThreads", null);
        setBooleanField(term6916, term6916.getClass(), "printing", false);
        setField(term6916, term6916.getClass(), "containerListener", null);
        setIntField(term6916, term6916.getClass(), "listeningChildren", 0);
        setIntField(term6916, term6916.getClass(), "listeningBoundsChildren", 0);
        setIntField(term6916, term6916.getClass(), "descendantsCount", 0);
        setField(term6916, term6916.getClass(), "preserveBackgroundColor", null);
        setIntField(term6916, term6916.getClass(), "numOfHWComponents", 0);
        setIntField(term6916, term6916.getClass(), "numOfLWComponents", 0);
        setField(term6916, term6916.getClass(), "modalComp", null);
        setField(term6916, term6916.getClass(), "modalAppContext", null);
        setIntField(term6916, term6916.getClass(), "containerSerializedDataVersion", 0);
        setField(term6916, term6916.getClass(), "peer", null);
        setField(term6916, term6916.getClass(), "parent", null);
        setField(term6916, term6916.getClass(), "appContext", null);
        setIntField(term6916, term6916.getClass(), "x", 0);
        setIntField(term6916, term6916.getClass(), "y", 0);
        setIntField(term6916, term6916.getClass(), "width", 0);
        setIntField(term6916, term6916.getClass(), "height", 0);
        setField(term6916, term6916.getClass(), "foreground", null);
        setField(term6916, term6916.getClass(), "background", null);
        setField(term6916, term6916.getClass(), "font", null);
        setField(term6916, term6916.getClass(), "peerFont", null);
        setField(term6916, term6916.getClass(), "cursor", null);
        setField(term6916, term6916.getClass(), "locale", null);
        setField(term6916, term6916.getClass(), "graphicsConfig", null);
        setField(term6916, term6916.getClass(), "bufferStrategy", null);
        setBooleanField(term6916, term6916.getClass(), "ignoreRepaint", false);
        setBooleanField(term6916, term6916.getClass(), "visible", false);
        setBooleanField(term6916, term6916.getClass(), "enabled", false);
        setBooleanField(term6916, term6916.getClass(), "valid", false);
        setField(term6916, term6916.getClass(), "dropTarget", null);
        setField(term6916, term6916.getClass(), "popups", null);
        setField(term6916, term6916.getClass(), "name", null);
        setBooleanField(term6916, term6916.getClass(), "nameExplicitlySet", false);
        setBooleanField(term6916, term6916.getClass(), "focusable", false);
        setIntField(term6916, term6916.getClass(), "isFocusTraversableOverridden", 0);
        setField(term6916, term6916.getClass(), "focusTraversalKeys", null);
        setBooleanField(term6916, term6916.getClass(), "focusTraversalKeysEnabled", false);
        setField(term6916, term6916.getClass(), "acc", null);
        setField(term6916, term6916.getClass(), "minSize", null);
        setBooleanField(term6916, term6916.getClass(), "minSizeSet", false);
        setField(term6916, term6916.getClass(), "prefSize", null);
        setBooleanField(term6916, term6916.getClass(), "prefSizeSet", false);
        setField(term6916, term6916.getClass(), "maxSize", null);
        setBooleanField(term6916, term6916.getClass(), "maxSizeSet", false);
        setField(term6916, term6916.getClass(), "componentOrientation", null);
        setBooleanField(term6916, term6916.getClass(), "newEventsOnly", false);
        setField(term6916, term6916.getClass(), "componentListener", null);
        setField(term6916, term6916.getClass(), "focusListener", null);
        setField(term6916, term6916.getClass(), "hierarchyListener", null);
        setField(term6916, term6916.getClass(), "hierarchyBoundsListener", null);
        setField(term6916, term6916.getClass(), "keyListener", null);
        setField(term6916, term6916.getClass(), "mouseListener", null);
        setField(term6916, term6916.getClass(), "mouseMotionListener", null);
        setField(term6916, term6916.getClass(), "mouseWheelListener", null);
        setField(term6916, term6916.getClass(), "inputMethodListener", null);
        setLongField(term6916, term6916.getClass(), "eventMask", 0L);
        setField(term6916, term6916.getClass(), "changeSupport", null);
        setField(term6916, term6916.getClass(), "objectLock", null);
        setBooleanField(term6916, term6916.getClass(), "isPacked", false);
        setIntField(term6916, term6916.getClass(), "boundsOp", 0);
        setField(term6916, term6916.getClass(), "compoundShape", null);
        setField(term6916, term6916.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term6916, term6916.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term6916, term6916.getClass(), "backgroundEraseDisabled", false);
        setField(term6916, term6916.getClass(), "eventCache", null);
        setBooleanField(term6916, term6916.getClass(), "coalescingEnabled", false);
        setBooleanField(term6916, term6916.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term6916, term6916.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.first.Login");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "dispose", argTypes, term6916, args);
    }

};


