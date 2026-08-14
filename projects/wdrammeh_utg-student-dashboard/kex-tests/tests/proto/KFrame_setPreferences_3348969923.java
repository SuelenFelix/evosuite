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

public class KFrame_setPreferences_3348969923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50996;

    public KFrame_setPreferences_3348969923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50996 = newInstance(Class.forName("proto.KFrame"));
        setIntField(term50996, term50996.getClass(), "defaultCloseOperation", 0);
        setField(term50996, term50996.getClass(), "transferHandler", null);
        setField(term50996, term50996.getClass(), "rootPane", null);
        setBooleanField(term50996, term50996.getClass(), "rootPaneCheckingEnabled", false);
        setField(term50996, term50996.getClass(), "accessibleContext", null);
        setField(term50996, term50996.getClass(), "maximizedBounds", null);
        setField(term50996, term50996.getClass(), "title", null);
        setField(term50996, term50996.getClass(), "menuBar", null);
        setBooleanField(term50996, term50996.getClass(), "resizable", false);
        setBooleanField(term50996, term50996.getClass(), "undecorated", false);
        setBooleanField(term50996, term50996.getClass(), "mbManagement", false);
        setIntField(term50996, term50996.getClass(), "state", 0);
        setField(term50996, term50996.getClass(), "ownedWindows", null);
        setIntField(term50996, term50996.getClass(), "frameSerializedDataVersion", 0);
        setField(term50996, term50996.getClass(), "warningString", null);
        setField(term50996, term50996.getClass(), "icons", null);
        setField(term50996, term50996.getClass(), "temporaryLostComponent", null);
        setBooleanField(term50996, term50996.getClass(), "syncLWRequests", false);
        setBooleanField(term50996, term50996.getClass(), "beforeFirstShow", false);
        setBooleanField(term50996, term50996.getClass(), "disposing", false);
        setField(term50996, term50996.getClass(), "disposerRecord", null);
        setBooleanField(term50996, term50996.getClass(), "alwaysOnTop", false);
        setField(term50996, term50996.getClass(), "ownedWindowList", null);
        setField(term50996, term50996.getClass(), "weakThis", null);
        setBooleanField(term50996, term50996.getClass(), "showWithParent", false);
        setField(term50996, term50996.getClass(), "modalBlocker", null);
        setField(term50996, term50996.getClass(), "modalExclusionType", null);
        setField(term50996, term50996.getClass(), "windowListener", null);
        setField(term50996, term50996.getClass(), "windowStateListener", null);
        setField(term50996, term50996.getClass(), "windowFocusListener", null);
        setField(term50996, term50996.getClass(), "inputContext", null);
        setField(term50996, term50996.getClass(), "inputContextLock", null);
        setField(term50996, term50996.getClass(), "focusMgr", null);
        setBooleanField(term50996, term50996.getClass(), "focusableWindowState", false);
        setBooleanField(term50996, term50996.getClass(), "autoRequestFocus", false);
        setBooleanField(term50996, term50996.getClass(), "isInShow", false);
        setFloatField(term50996, term50996.getClass(), "opacity", 0.0F);
        setField(term50996, term50996.getClass(), "shape", null);
        setBooleanField(term50996, term50996.getClass(), "isTrayIconWindow", false);
        setIntField(term50996, term50996.getClass(), "securityWarningWidth", 0);
        setIntField(term50996, term50996.getClass(), "securityWarningHeight", 0);
        setDoubleField(term50996, term50996.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term50996, term50996.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term50996, term50996.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term50996, term50996.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term50996, term50996.getClass(), "anchor", null);
        setField(term50996, term50996.getClass(), "type", null);
        setIntField(term50996, term50996.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term50996, term50996.getClass(), "locationByPlatform", false);
        setField(term50996, term50996.getClass(), "component", null);
        setField(term50996, term50996.getClass(), "layoutMgr", null);
        setField(term50996, term50996.getClass(), "dispatcher", null);
        setField(term50996, term50996.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term50996, term50996.getClass(), "focusCycleRoot", false);
        setBooleanField(term50996, term50996.getClass(), "focusTraversalPolicyProvider", false);
        setField(term50996, term50996.getClass(), "printingThreads", null);
        setBooleanField(term50996, term50996.getClass(), "printing", false);
        setField(term50996, term50996.getClass(), "containerListener", null);
        setIntField(term50996, term50996.getClass(), "listeningChildren", 0);
        setIntField(term50996, term50996.getClass(), "listeningBoundsChildren", 0);
        setIntField(term50996, term50996.getClass(), "descendantsCount", 0);
        setField(term50996, term50996.getClass(), "preserveBackgroundColor", null);
        setIntField(term50996, term50996.getClass(), "numOfHWComponents", 0);
        setIntField(term50996, term50996.getClass(), "numOfLWComponents", 0);
        setField(term50996, term50996.getClass(), "modalComp", null);
        setField(term50996, term50996.getClass(), "modalAppContext", null);
        setIntField(term50996, term50996.getClass(), "containerSerializedDataVersion", 0);
        setField(term50996, term50996.getClass(), "peer", null);
        setField(term50996, term50996.getClass(), "parent", null);
        setField(term50996, term50996.getClass(), "appContext", null);
        setIntField(term50996, term50996.getClass(), "x", 0);
        setIntField(term50996, term50996.getClass(), "y", 0);
        setIntField(term50996, term50996.getClass(), "width", 0);
        setIntField(term50996, term50996.getClass(), "height", 0);
        setField(term50996, term50996.getClass(), "foreground", null);
        setField(term50996, term50996.getClass(), "background", null);
        setField(term50996, term50996.getClass(), "font", null);
        setField(term50996, term50996.getClass(), "peerFont", null);
        setField(term50996, term50996.getClass(), "cursor", null);
        setField(term50996, term50996.getClass(), "locale", null);
        setField(term50996, term50996.getClass(), "graphicsConfig", null);
        setField(term50996, term50996.getClass(), "bufferStrategy", null);
        setBooleanField(term50996, term50996.getClass(), "ignoreRepaint", false);
        setBooleanField(term50996, term50996.getClass(), "visible", false);
        setBooleanField(term50996, term50996.getClass(), "enabled", false);
        setBooleanField(term50996, term50996.getClass(), "valid", false);
        setField(term50996, term50996.getClass(), "dropTarget", null);
        setField(term50996, term50996.getClass(), "popups", null);
        setField(term50996, term50996.getClass(), "name", null);
        setBooleanField(term50996, term50996.getClass(), "nameExplicitlySet", false);
        setBooleanField(term50996, term50996.getClass(), "focusable", false);
        setIntField(term50996, term50996.getClass(), "isFocusTraversableOverridden", 0);
        setField(term50996, term50996.getClass(), "focusTraversalKeys", null);
        setBooleanField(term50996, term50996.getClass(), "focusTraversalKeysEnabled", false);
        setField(term50996, term50996.getClass(), "acc", null);
        setField(term50996, term50996.getClass(), "minSize", null);
        setBooleanField(term50996, term50996.getClass(), "minSizeSet", false);
        setField(term50996, term50996.getClass(), "prefSize", null);
        setBooleanField(term50996, term50996.getClass(), "prefSizeSet", false);
        setField(term50996, term50996.getClass(), "maxSize", null);
        setBooleanField(term50996, term50996.getClass(), "maxSizeSet", false);
        setField(term50996, term50996.getClass(), "componentOrientation", null);
        setBooleanField(term50996, term50996.getClass(), "newEventsOnly", false);
        setField(term50996, term50996.getClass(), "componentListener", null);
        setField(term50996, term50996.getClass(), "focusListener", null);
        setField(term50996, term50996.getClass(), "hierarchyListener", null);
        setField(term50996, term50996.getClass(), "hierarchyBoundsListener", null);
        setField(term50996, term50996.getClass(), "keyListener", null);
        setField(term50996, term50996.getClass(), "mouseListener", null);
        setField(term50996, term50996.getClass(), "mouseMotionListener", null);
        setField(term50996, term50996.getClass(), "mouseWheelListener", null);
        setField(term50996, term50996.getClass(), "inputMethodListener", null);
        setLongField(term50996, term50996.getClass(), "eventMask", 0L);
        setField(term50996, term50996.getClass(), "changeSupport", null);
        setField(term50996, term50996.getClass(), "objectLock", null);
        setBooleanField(term50996, term50996.getClass(), "isPacked", false);
        setIntField(term50996, term50996.getClass(), "boundsOp", 0);
        setField(term50996, term50996.getClass(), "compoundShape", null);
        setField(term50996, term50996.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term50996, term50996.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term50996, term50996.getClass(), "backgroundEraseDisabled", false);
        setField(term50996, term50996.getClass(), "eventCache", null);
        setBooleanField(term50996, term50996.getClass(), "coalescingEnabled", false);
        setBooleanField(term50996, term50996.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term50996, term50996.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("proto.KFrame");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setPreferences", argTypes, term50996, args);
    }

};


