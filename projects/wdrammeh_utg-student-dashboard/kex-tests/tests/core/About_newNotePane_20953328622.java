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
import java.lang.Integer;

public class About_newNotePane_20953328622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143524;
     Object term143585;

    public About_newNotePane_20953328622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143524 = newInstance(Class.forName("core.About"));
        setField(term143524, term143524.getClass(), "midCard", null);
        setField(term143524, term143524.getClass(), "midLayer", null);
        setIntField(term143524, term143524.getClass(), "defaultCloseOperation", 0);
        setField(term143524, term143524.getClass(), "rootPane", null);
        setBooleanField(term143524, term143524.getClass(), "rootPaneCheckingEnabled", false);
        setField(term143524, term143524.getClass(), "transferHandler", null);
        setField(term143524, term143524.getClass(), "accessibleContext", null);
        setBooleanField(term143524, term143524.getClass(), "resizable", false);
        setBooleanField(term143524, term143524.getClass(), "undecorated", false);
        setBooleanField(term143524, term143524.getClass(), "initialized", false);
        setBooleanField(term143524, term143524.getClass(), "modal", false);
        setField(term143524, term143524.getClass(), "modalityType", null);
        setField(term143524, term143524.getClass(), "blockedWindows", null);
        setField(term143524, term143524.getClass(), "title", null);
        setField(term143524, term143524.getClass(), "modalFilter", null);
        setField(term143524, term143524.getClass(), "secondaryLoop", null);
        setBooleanField(term143524, term143524.getClass(), "isInHide", false);
        setBooleanField(term143524, term143524.getClass(), "isInDispose", false);
        setField(term143524, term143524.getClass(), "warningString", null);
        setField(term143524, term143524.getClass(), "icons", null);
        setField(term143524, term143524.getClass(), "temporaryLostComponent", null);
        setBooleanField(term143524, term143524.getClass(), "syncLWRequests", false);
        setBooleanField(term143524, term143524.getClass(), "beforeFirstShow", false);
        setBooleanField(term143524, term143524.getClass(), "disposing", false);
        setField(term143524, term143524.getClass(), "disposerRecord", null);
        setIntField(term143524, term143524.getClass(), "state", 0);
        setBooleanField(term143524, term143524.getClass(), "alwaysOnTop", false);
        setField(term143524, term143524.getClass(), "ownedWindowList", null);
        setField(term143524, term143524.getClass(), "weakThis", null);
        setBooleanField(term143524, term143524.getClass(), "showWithParent", false);
        setField(term143524, term143524.getClass(), "modalBlocker", null);
        setField(term143524, term143524.getClass(), "modalExclusionType", null);
        setField(term143524, term143524.getClass(), "windowListener", null);
        setField(term143524, term143524.getClass(), "windowStateListener", null);
        setField(term143524, term143524.getClass(), "windowFocusListener", null);
        setField(term143524, term143524.getClass(), "inputContext", null);
        setField(term143524, term143524.getClass(), "inputContextLock", null);
        setField(term143524, term143524.getClass(), "focusMgr", null);
        setBooleanField(term143524, term143524.getClass(), "focusableWindowState", false);
        setBooleanField(term143524, term143524.getClass(), "autoRequestFocus", false);
        setBooleanField(term143524, term143524.getClass(), "isInShow", false);
        setFloatField(term143524, term143524.getClass(), "opacity", 0.0F);
        setField(term143524, term143524.getClass(), "shape", null);
        setBooleanField(term143524, term143524.getClass(), "isTrayIconWindow", false);
        setIntField(term143524, term143524.getClass(), "securityWarningWidth", 0);
        setIntField(term143524, term143524.getClass(), "securityWarningHeight", 0);
        setDoubleField(term143524, term143524.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term143524, term143524.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term143524, term143524.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term143524, term143524.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term143524, term143524.getClass(), "anchor", null);
        setField(term143524, term143524.getClass(), "type", null);
        setIntField(term143524, term143524.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term143524, term143524.getClass(), "locationByPlatform", false);
        setField(term143524, term143524.getClass(), "component", null);
        setField(term143524, term143524.getClass(), "layoutMgr", null);
        setField(term143524, term143524.getClass(), "dispatcher", null);
        setField(term143524, term143524.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term143524, term143524.getClass(), "focusCycleRoot", false);
        setBooleanField(term143524, term143524.getClass(), "focusTraversalPolicyProvider", false);
        setField(term143524, term143524.getClass(), "printingThreads", null);
        setBooleanField(term143524, term143524.getClass(), "printing", false);
        setField(term143524, term143524.getClass(), "containerListener", null);
        setIntField(term143524, term143524.getClass(), "listeningChildren", 0);
        setIntField(term143524, term143524.getClass(), "listeningBoundsChildren", 0);
        setIntField(term143524, term143524.getClass(), "descendantsCount", 0);
        setField(term143524, term143524.getClass(), "preserveBackgroundColor", null);
        setIntField(term143524, term143524.getClass(), "numOfHWComponents", 0);
        setIntField(term143524, term143524.getClass(), "numOfLWComponents", 0);
        setField(term143524, term143524.getClass(), "modalComp", null);
        setField(term143524, term143524.getClass(), "modalAppContext", null);
        setIntField(term143524, term143524.getClass(), "containerSerializedDataVersion", 0);
        setField(term143524, term143524.getClass(), "peer", null);
        setField(term143524, term143524.getClass(), "parent", null);
        setField(term143524, term143524.getClass(), "appContext", null);
        setIntField(term143524, term143524.getClass(), "x", 0);
        setIntField(term143524, term143524.getClass(), "y", 0);
        setIntField(term143524, term143524.getClass(), "width", 0);
        setIntField(term143524, term143524.getClass(), "height", 0);
        setField(term143524, term143524.getClass(), "foreground", null);
        setField(term143524, term143524.getClass(), "background", null);
        setField(term143524, term143524.getClass(), "font", null);
        setField(term143524, term143524.getClass(), "peerFont", null);
        setField(term143524, term143524.getClass(), "cursor", null);
        setField(term143524, term143524.getClass(), "locale", null);
        setField(term143524, term143524.getClass(), "graphicsConfig", null);
        setField(term143524, term143524.getClass(), "bufferStrategy", null);
        setBooleanField(term143524, term143524.getClass(), "ignoreRepaint", false);
        setBooleanField(term143524, term143524.getClass(), "visible", false);
        setBooleanField(term143524, term143524.getClass(), "enabled", false);
        setBooleanField(term143524, term143524.getClass(), "valid", false);
        setField(term143524, term143524.getClass(), "dropTarget", null);
        setField(term143524, term143524.getClass(), "popups", null);
        setField(term143524, term143524.getClass(), "name", null);
        setBooleanField(term143524, term143524.getClass(), "nameExplicitlySet", false);
        setBooleanField(term143524, term143524.getClass(), "focusable", false);
        setIntField(term143524, term143524.getClass(), "isFocusTraversableOverridden", 0);
        setField(term143524, term143524.getClass(), "focusTraversalKeys", null);
        setBooleanField(term143524, term143524.getClass(), "focusTraversalKeysEnabled", false);
        setField(term143524, term143524.getClass(), "acc", null);
        setField(term143524, term143524.getClass(), "minSize", null);
        setBooleanField(term143524, term143524.getClass(), "minSizeSet", false);
        setField(term143524, term143524.getClass(), "prefSize", null);
        setBooleanField(term143524, term143524.getClass(), "prefSizeSet", false);
        setField(term143524, term143524.getClass(), "maxSize", null);
        setBooleanField(term143524, term143524.getClass(), "maxSizeSet", false);
        setField(term143524, term143524.getClass(), "componentOrientation", null);
        setBooleanField(term143524, term143524.getClass(), "newEventsOnly", false);
        setField(term143524, term143524.getClass(), "componentListener", null);
        setField(term143524, term143524.getClass(), "focusListener", null);
        setField(term143524, term143524.getClass(), "hierarchyListener", null);
        setField(term143524, term143524.getClass(), "hierarchyBoundsListener", null);
        setField(term143524, term143524.getClass(), "keyListener", null);
        setField(term143524, term143524.getClass(), "mouseListener", null);
        setField(term143524, term143524.getClass(), "mouseMotionListener", null);
        setField(term143524, term143524.getClass(), "mouseWheelListener", null);
        setField(term143524, term143524.getClass(), "inputMethodListener", null);
        setLongField(term143524, term143524.getClass(), "eventMask", 0L);
        setField(term143524, term143524.getClass(), "changeSupport", null);
        setField(term143524, term143524.getClass(), "objectLock", null);
        setBooleanField(term143524, term143524.getClass(), "isPacked", false);
        setIntField(term143524, term143524.getClass(), "boundsOp", 0);
        setField(term143524, term143524.getClass(), "compoundShape", null);
        setField(term143524, term143524.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term143524, term143524.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term143524, term143524.getClass(), "backgroundEraseDisabled", false);
        setField(term143524, term143524.getClass(), "eventCache", null);
        setBooleanField(term143524, term143524.getClass(), "coalescingEnabled", false);
        setBooleanField(term143524, term143524.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term143524, term143524.getClass(), "componentSerializedDataVersion", 0);
        term143585 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.About");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term143585;
        callMethod(klass, "newNotePane", argTypes, term143524, args);
    }

};


