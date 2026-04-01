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

public class FirstLaunch_imageComponent_21039741966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6260;

    public FirstLaunch_imageComponent_21039741966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6260 = newInstance(Class.forName("core.first.FirstLaunch"));
        setField(term6260, term6260.getClass(), "contentPanel", null);
        setField(term6260, term6260.getClass(), "bigFont", null);
        setField(term6260, term6260.getClass(), "layout", null);
        setIntField(term6260, term6260.getClass(), "defaultCloseOperation", 0);
        setField(term6260, term6260.getClass(), "rootPane", null);
        setBooleanField(term6260, term6260.getClass(), "rootPaneCheckingEnabled", false);
        setField(term6260, term6260.getClass(), "transferHandler", null);
        setField(term6260, term6260.getClass(), "accessibleContext", null);
        setBooleanField(term6260, term6260.getClass(), "resizable", false);
        setBooleanField(term6260, term6260.getClass(), "undecorated", false);
        setBooleanField(term6260, term6260.getClass(), "initialized", false);
        setBooleanField(term6260, term6260.getClass(), "modal", false);
        setField(term6260, term6260.getClass(), "modalityType", null);
        setField(term6260, term6260.getClass(), "blockedWindows", null);
        setField(term6260, term6260.getClass(), "title", null);
        setField(term6260, term6260.getClass(), "modalFilter", null);
        setField(term6260, term6260.getClass(), "secondaryLoop", null);
        setBooleanField(term6260, term6260.getClass(), "isInHide", false);
        setBooleanField(term6260, term6260.getClass(), "isInDispose", false);
        setField(term6260, term6260.getClass(), "warningString", null);
        setField(term6260, term6260.getClass(), "icons", null);
        setField(term6260, term6260.getClass(), "temporaryLostComponent", null);
        setBooleanField(term6260, term6260.getClass(), "syncLWRequests", false);
        setBooleanField(term6260, term6260.getClass(), "beforeFirstShow", false);
        setBooleanField(term6260, term6260.getClass(), "disposing", false);
        setField(term6260, term6260.getClass(), "disposerRecord", null);
        setIntField(term6260, term6260.getClass(), "state", 0);
        setBooleanField(term6260, term6260.getClass(), "alwaysOnTop", false);
        setField(term6260, term6260.getClass(), "ownedWindowList", null);
        setField(term6260, term6260.getClass(), "weakThis", null);
        setBooleanField(term6260, term6260.getClass(), "showWithParent", false);
        setField(term6260, term6260.getClass(), "modalBlocker", null);
        setField(term6260, term6260.getClass(), "modalExclusionType", null);
        setField(term6260, term6260.getClass(), "windowListener", null);
        setField(term6260, term6260.getClass(), "windowStateListener", null);
        setField(term6260, term6260.getClass(), "windowFocusListener", null);
        setField(term6260, term6260.getClass(), "inputContext", null);
        setField(term6260, term6260.getClass(), "inputContextLock", null);
        setField(term6260, term6260.getClass(), "focusMgr", null);
        setBooleanField(term6260, term6260.getClass(), "focusableWindowState", false);
        setBooleanField(term6260, term6260.getClass(), "autoRequestFocus", false);
        setBooleanField(term6260, term6260.getClass(), "isInShow", false);
        setFloatField(term6260, term6260.getClass(), "opacity", 0.0F);
        setField(term6260, term6260.getClass(), "shape", null);
        setBooleanField(term6260, term6260.getClass(), "isTrayIconWindow", false);
        setIntField(term6260, term6260.getClass(), "securityWarningWidth", 0);
        setIntField(term6260, term6260.getClass(), "securityWarningHeight", 0);
        setDoubleField(term6260, term6260.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term6260, term6260.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term6260, term6260.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term6260, term6260.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term6260, term6260.getClass(), "anchor", null);
        setField(term6260, term6260.getClass(), "type", null);
        setIntField(term6260, term6260.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term6260, term6260.getClass(), "locationByPlatform", false);
        setField(term6260, term6260.getClass(), "component", null);
        setField(term6260, term6260.getClass(), "layoutMgr", null);
        setField(term6260, term6260.getClass(), "dispatcher", null);
        setField(term6260, term6260.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term6260, term6260.getClass(), "focusCycleRoot", false);
        setBooleanField(term6260, term6260.getClass(), "focusTraversalPolicyProvider", false);
        setField(term6260, term6260.getClass(), "printingThreads", null);
        setBooleanField(term6260, term6260.getClass(), "printing", false);
        setField(term6260, term6260.getClass(), "containerListener", null);
        setIntField(term6260, term6260.getClass(), "listeningChildren", 0);
        setIntField(term6260, term6260.getClass(), "listeningBoundsChildren", 0);
        setIntField(term6260, term6260.getClass(), "descendantsCount", 0);
        setField(term6260, term6260.getClass(), "preserveBackgroundColor", null);
        setIntField(term6260, term6260.getClass(), "numOfHWComponents", 0);
        setIntField(term6260, term6260.getClass(), "numOfLWComponents", 0);
        setField(term6260, term6260.getClass(), "modalComp", null);
        setField(term6260, term6260.getClass(), "modalAppContext", null);
        setIntField(term6260, term6260.getClass(), "containerSerializedDataVersion", 0);
        setField(term6260, term6260.getClass(), "peer", null);
        setField(term6260, term6260.getClass(), "parent", null);
        setField(term6260, term6260.getClass(), "appContext", null);
        setIntField(term6260, term6260.getClass(), "x", 0);
        setIntField(term6260, term6260.getClass(), "y", 0);
        setIntField(term6260, term6260.getClass(), "width", 0);
        setIntField(term6260, term6260.getClass(), "height", 0);
        setField(term6260, term6260.getClass(), "foreground", null);
        setField(term6260, term6260.getClass(), "background", null);
        setField(term6260, term6260.getClass(), "font", null);
        setField(term6260, term6260.getClass(), "peerFont", null);
        setField(term6260, term6260.getClass(), "cursor", null);
        setField(term6260, term6260.getClass(), "locale", null);
        setField(term6260, term6260.getClass(), "graphicsConfig", null);
        setField(term6260, term6260.getClass(), "bufferStrategy", null);
        setBooleanField(term6260, term6260.getClass(), "ignoreRepaint", false);
        setBooleanField(term6260, term6260.getClass(), "visible", false);
        setBooleanField(term6260, term6260.getClass(), "enabled", false);
        setBooleanField(term6260, term6260.getClass(), "valid", false);
        setField(term6260, term6260.getClass(), "dropTarget", null);
        setField(term6260, term6260.getClass(), "popups", null);
        setField(term6260, term6260.getClass(), "name", null);
        setBooleanField(term6260, term6260.getClass(), "nameExplicitlySet", false);
        setBooleanField(term6260, term6260.getClass(), "focusable", false);
        setIntField(term6260, term6260.getClass(), "isFocusTraversableOverridden", 0);
        setField(term6260, term6260.getClass(), "focusTraversalKeys", null);
        setBooleanField(term6260, term6260.getClass(), "focusTraversalKeysEnabled", false);
        setField(term6260, term6260.getClass(), "acc", null);
        setField(term6260, term6260.getClass(), "minSize", null);
        setBooleanField(term6260, term6260.getClass(), "minSizeSet", false);
        setField(term6260, term6260.getClass(), "prefSize", null);
        setBooleanField(term6260, term6260.getClass(), "prefSizeSet", false);
        setField(term6260, term6260.getClass(), "maxSize", null);
        setBooleanField(term6260, term6260.getClass(), "maxSizeSet", false);
        setField(term6260, term6260.getClass(), "componentOrientation", null);
        setBooleanField(term6260, term6260.getClass(), "newEventsOnly", false);
        setField(term6260, term6260.getClass(), "componentListener", null);
        setField(term6260, term6260.getClass(), "focusListener", null);
        setField(term6260, term6260.getClass(), "hierarchyListener", null);
        setField(term6260, term6260.getClass(), "hierarchyBoundsListener", null);
        setField(term6260, term6260.getClass(), "keyListener", null);
        setField(term6260, term6260.getClass(), "mouseListener", null);
        setField(term6260, term6260.getClass(), "mouseMotionListener", null);
        setField(term6260, term6260.getClass(), "mouseWheelListener", null);
        setField(term6260, term6260.getClass(), "inputMethodListener", null);
        setLongField(term6260, term6260.getClass(), "eventMask", 0L);
        setField(term6260, term6260.getClass(), "changeSupport", null);
        setField(term6260, term6260.getClass(), "objectLock", null);
        setBooleanField(term6260, term6260.getClass(), "isPacked", false);
        setIntField(term6260, term6260.getClass(), "boundsOp", 0);
        setField(term6260, term6260.getClass(), "compoundShape", null);
        setField(term6260, term6260.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term6260, term6260.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term6260, term6260.getClass(), "backgroundEraseDisabled", false);
        setField(term6260, term6260.getClass(), "eventCache", null);
        setBooleanField(term6260, term6260.getClass(), "coalescingEnabled", false);
        setBooleanField(term6260, term6260.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term6260, term6260.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.first.FirstLaunch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "imageComponent", argTypes, term6260, args);
    }

};


