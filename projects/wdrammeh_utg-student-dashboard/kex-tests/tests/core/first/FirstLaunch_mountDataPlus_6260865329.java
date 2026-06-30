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

public class FirstLaunch_mountDataPlus_6260865329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6321;

    public FirstLaunch_mountDataPlus_6260865329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6321 = newInstance(Class.forName("core.first.FirstLaunch"));
        setField(term6321, term6321.getClass(), "contentPanel", null);
        setField(term6321, term6321.getClass(), "bigFont", null);
        setField(term6321, term6321.getClass(), "layout", null);
        setIntField(term6321, term6321.getClass(), "defaultCloseOperation", 0);
        setField(term6321, term6321.getClass(), "rootPane", null);
        setBooleanField(term6321, term6321.getClass(), "rootPaneCheckingEnabled", false);
        setField(term6321, term6321.getClass(), "transferHandler", null);
        setField(term6321, term6321.getClass(), "accessibleContext", null);
        setBooleanField(term6321, term6321.getClass(), "resizable", false);
        setBooleanField(term6321, term6321.getClass(), "undecorated", false);
        setBooleanField(term6321, term6321.getClass(), "initialized", false);
        setBooleanField(term6321, term6321.getClass(), "modal", false);
        setField(term6321, term6321.getClass(), "modalityType", null);
        setField(term6321, term6321.getClass(), "blockedWindows", null);
        setField(term6321, term6321.getClass(), "title", null);
        setField(term6321, term6321.getClass(), "modalFilter", null);
        setField(term6321, term6321.getClass(), "secondaryLoop", null);
        setBooleanField(term6321, term6321.getClass(), "isInHide", false);
        setBooleanField(term6321, term6321.getClass(), "isInDispose", false);
        setField(term6321, term6321.getClass(), "warningString", null);
        setField(term6321, term6321.getClass(), "icons", null);
        setField(term6321, term6321.getClass(), "temporaryLostComponent", null);
        setBooleanField(term6321, term6321.getClass(), "syncLWRequests", false);
        setBooleanField(term6321, term6321.getClass(), "beforeFirstShow", false);
        setBooleanField(term6321, term6321.getClass(), "disposing", false);
        setField(term6321, term6321.getClass(), "disposerRecord", null);
        setIntField(term6321, term6321.getClass(), "state", 0);
        setBooleanField(term6321, term6321.getClass(), "alwaysOnTop", false);
        setField(term6321, term6321.getClass(), "ownedWindowList", null);
        setField(term6321, term6321.getClass(), "weakThis", null);
        setBooleanField(term6321, term6321.getClass(), "showWithParent", false);
        setField(term6321, term6321.getClass(), "modalBlocker", null);
        setField(term6321, term6321.getClass(), "modalExclusionType", null);
        setField(term6321, term6321.getClass(), "windowListener", null);
        setField(term6321, term6321.getClass(), "windowStateListener", null);
        setField(term6321, term6321.getClass(), "windowFocusListener", null);
        setField(term6321, term6321.getClass(), "inputContext", null);
        setField(term6321, term6321.getClass(), "inputContextLock", null);
        setField(term6321, term6321.getClass(), "focusMgr", null);
        setBooleanField(term6321, term6321.getClass(), "focusableWindowState", false);
        setBooleanField(term6321, term6321.getClass(), "autoRequestFocus", false);
        setBooleanField(term6321, term6321.getClass(), "isInShow", false);
        setFloatField(term6321, term6321.getClass(), "opacity", 0.0F);
        setField(term6321, term6321.getClass(), "shape", null);
        setBooleanField(term6321, term6321.getClass(), "isTrayIconWindow", false);
        setIntField(term6321, term6321.getClass(), "securityWarningWidth", 0);
        setIntField(term6321, term6321.getClass(), "securityWarningHeight", 0);
        setDoubleField(term6321, term6321.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term6321, term6321.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term6321, term6321.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term6321, term6321.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term6321, term6321.getClass(), "anchor", null);
        setField(term6321, term6321.getClass(), "type", null);
        setIntField(term6321, term6321.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term6321, term6321.getClass(), "locationByPlatform", false);
        setField(term6321, term6321.getClass(), "component", null);
        setField(term6321, term6321.getClass(), "layoutMgr", null);
        setField(term6321, term6321.getClass(), "dispatcher", null);
        setField(term6321, term6321.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term6321, term6321.getClass(), "focusCycleRoot", false);
        setBooleanField(term6321, term6321.getClass(), "focusTraversalPolicyProvider", false);
        setField(term6321, term6321.getClass(), "printingThreads", null);
        setBooleanField(term6321, term6321.getClass(), "printing", false);
        setField(term6321, term6321.getClass(), "containerListener", null);
        setIntField(term6321, term6321.getClass(), "listeningChildren", 0);
        setIntField(term6321, term6321.getClass(), "listeningBoundsChildren", 0);
        setIntField(term6321, term6321.getClass(), "descendantsCount", 0);
        setField(term6321, term6321.getClass(), "preserveBackgroundColor", null);
        setIntField(term6321, term6321.getClass(), "numOfHWComponents", 0);
        setIntField(term6321, term6321.getClass(), "numOfLWComponents", 0);
        setField(term6321, term6321.getClass(), "modalComp", null);
        setField(term6321, term6321.getClass(), "modalAppContext", null);
        setIntField(term6321, term6321.getClass(), "containerSerializedDataVersion", 0);
        setField(term6321, term6321.getClass(), "peer", null);
        setField(term6321, term6321.getClass(), "parent", null);
        setField(term6321, term6321.getClass(), "appContext", null);
        setIntField(term6321, term6321.getClass(), "x", 0);
        setIntField(term6321, term6321.getClass(), "y", 0);
        setIntField(term6321, term6321.getClass(), "width", 0);
        setIntField(term6321, term6321.getClass(), "height", 0);
        setField(term6321, term6321.getClass(), "foreground", null);
        setField(term6321, term6321.getClass(), "background", null);
        setField(term6321, term6321.getClass(), "font", null);
        setField(term6321, term6321.getClass(), "peerFont", null);
        setField(term6321, term6321.getClass(), "cursor", null);
        setField(term6321, term6321.getClass(), "locale", null);
        setField(term6321, term6321.getClass(), "graphicsConfig", null);
        setField(term6321, term6321.getClass(), "bufferStrategy", null);
        setBooleanField(term6321, term6321.getClass(), "ignoreRepaint", false);
        setBooleanField(term6321, term6321.getClass(), "visible", false);
        setBooleanField(term6321, term6321.getClass(), "enabled", false);
        setBooleanField(term6321, term6321.getClass(), "valid", false);
        setField(term6321, term6321.getClass(), "dropTarget", null);
        setField(term6321, term6321.getClass(), "popups", null);
        setField(term6321, term6321.getClass(), "name", null);
        setBooleanField(term6321, term6321.getClass(), "nameExplicitlySet", false);
        setBooleanField(term6321, term6321.getClass(), "focusable", false);
        setIntField(term6321, term6321.getClass(), "isFocusTraversableOverridden", 0);
        setField(term6321, term6321.getClass(), "focusTraversalKeys", null);
        setBooleanField(term6321, term6321.getClass(), "focusTraversalKeysEnabled", false);
        setField(term6321, term6321.getClass(), "acc", null);
        setField(term6321, term6321.getClass(), "minSize", null);
        setBooleanField(term6321, term6321.getClass(), "minSizeSet", false);
        setField(term6321, term6321.getClass(), "prefSize", null);
        setBooleanField(term6321, term6321.getClass(), "prefSizeSet", false);
        setField(term6321, term6321.getClass(), "maxSize", null);
        setBooleanField(term6321, term6321.getClass(), "maxSizeSet", false);
        setField(term6321, term6321.getClass(), "componentOrientation", null);
        setBooleanField(term6321, term6321.getClass(), "newEventsOnly", false);
        setField(term6321, term6321.getClass(), "componentListener", null);
        setField(term6321, term6321.getClass(), "focusListener", null);
        setField(term6321, term6321.getClass(), "hierarchyListener", null);
        setField(term6321, term6321.getClass(), "hierarchyBoundsListener", null);
        setField(term6321, term6321.getClass(), "keyListener", null);
        setField(term6321, term6321.getClass(), "mouseListener", null);
        setField(term6321, term6321.getClass(), "mouseMotionListener", null);
        setField(term6321, term6321.getClass(), "mouseWheelListener", null);
        setField(term6321, term6321.getClass(), "inputMethodListener", null);
        setLongField(term6321, term6321.getClass(), "eventMask", 0L);
        setField(term6321, term6321.getClass(), "changeSupport", null);
        setField(term6321, term6321.getClass(), "objectLock", null);
        setBooleanField(term6321, term6321.getClass(), "isPacked", false);
        setIntField(term6321, term6321.getClass(), "boundsOp", 0);
        setField(term6321, term6321.getClass(), "compoundShape", null);
        setField(term6321, term6321.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term6321, term6321.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term6321, term6321.getClass(), "backgroundEraseDisabled", false);
        setField(term6321, term6321.getClass(), "eventCache", null);
        setBooleanField(term6321, term6321.getClass(), "coalescingEnabled", false);
        setBooleanField(term6321, term6321.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term6321, term6321.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.first.FirstLaunch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "mountDataPlus", argTypes, term6321, args);
    }

};


