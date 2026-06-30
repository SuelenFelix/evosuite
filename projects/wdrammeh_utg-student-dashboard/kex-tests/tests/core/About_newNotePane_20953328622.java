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
     Object term143520;
     Object term143581;

    public About_newNotePane_20953328622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143520 = newInstance(Class.forName("core.About"));
        setField(term143520, term143520.getClass(), "midCard", null);
        setField(term143520, term143520.getClass(), "midLayer", null);
        setIntField(term143520, term143520.getClass(), "defaultCloseOperation", 0);
        setField(term143520, term143520.getClass(), "rootPane", null);
        setBooleanField(term143520, term143520.getClass(), "rootPaneCheckingEnabled", false);
        setField(term143520, term143520.getClass(), "transferHandler", null);
        setField(term143520, term143520.getClass(), "accessibleContext", null);
        setBooleanField(term143520, term143520.getClass(), "resizable", false);
        setBooleanField(term143520, term143520.getClass(), "undecorated", false);
        setBooleanField(term143520, term143520.getClass(), "initialized", false);
        setBooleanField(term143520, term143520.getClass(), "modal", false);
        setField(term143520, term143520.getClass(), "modalityType", null);
        setField(term143520, term143520.getClass(), "blockedWindows", null);
        setField(term143520, term143520.getClass(), "title", null);
        setField(term143520, term143520.getClass(), "modalFilter", null);
        setField(term143520, term143520.getClass(), "secondaryLoop", null);
        setBooleanField(term143520, term143520.getClass(), "isInHide", false);
        setBooleanField(term143520, term143520.getClass(), "isInDispose", false);
        setField(term143520, term143520.getClass(), "warningString", null);
        setField(term143520, term143520.getClass(), "icons", null);
        setField(term143520, term143520.getClass(), "temporaryLostComponent", null);
        setBooleanField(term143520, term143520.getClass(), "syncLWRequests", false);
        setBooleanField(term143520, term143520.getClass(), "beforeFirstShow", false);
        setBooleanField(term143520, term143520.getClass(), "disposing", false);
        setField(term143520, term143520.getClass(), "disposerRecord", null);
        setIntField(term143520, term143520.getClass(), "state", 0);
        setBooleanField(term143520, term143520.getClass(), "alwaysOnTop", false);
        setField(term143520, term143520.getClass(), "ownedWindowList", null);
        setField(term143520, term143520.getClass(), "weakThis", null);
        setBooleanField(term143520, term143520.getClass(), "showWithParent", false);
        setField(term143520, term143520.getClass(), "modalBlocker", null);
        setField(term143520, term143520.getClass(), "modalExclusionType", null);
        setField(term143520, term143520.getClass(), "windowListener", null);
        setField(term143520, term143520.getClass(), "windowStateListener", null);
        setField(term143520, term143520.getClass(), "windowFocusListener", null);
        setField(term143520, term143520.getClass(), "inputContext", null);
        setField(term143520, term143520.getClass(), "inputContextLock", null);
        setField(term143520, term143520.getClass(), "focusMgr", null);
        setBooleanField(term143520, term143520.getClass(), "focusableWindowState", false);
        setBooleanField(term143520, term143520.getClass(), "autoRequestFocus", false);
        setBooleanField(term143520, term143520.getClass(), "isInShow", false);
        setFloatField(term143520, term143520.getClass(), "opacity", 0.0F);
        setField(term143520, term143520.getClass(), "shape", null);
        setBooleanField(term143520, term143520.getClass(), "isTrayIconWindow", false);
        setIntField(term143520, term143520.getClass(), "securityWarningWidth", 0);
        setIntField(term143520, term143520.getClass(), "securityWarningHeight", 0);
        setDoubleField(term143520, term143520.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term143520, term143520.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term143520, term143520.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term143520, term143520.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term143520, term143520.getClass(), "anchor", null);
        setField(term143520, term143520.getClass(), "type", null);
        setIntField(term143520, term143520.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term143520, term143520.getClass(), "locationByPlatform", false);
        setField(term143520, term143520.getClass(), "component", null);
        setField(term143520, term143520.getClass(), "layoutMgr", null);
        setField(term143520, term143520.getClass(), "dispatcher", null);
        setField(term143520, term143520.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term143520, term143520.getClass(), "focusCycleRoot", false);
        setBooleanField(term143520, term143520.getClass(), "focusTraversalPolicyProvider", false);
        setField(term143520, term143520.getClass(), "printingThreads", null);
        setBooleanField(term143520, term143520.getClass(), "printing", false);
        setField(term143520, term143520.getClass(), "containerListener", null);
        setIntField(term143520, term143520.getClass(), "listeningChildren", 0);
        setIntField(term143520, term143520.getClass(), "listeningBoundsChildren", 0);
        setIntField(term143520, term143520.getClass(), "descendantsCount", 0);
        setField(term143520, term143520.getClass(), "preserveBackgroundColor", null);
        setIntField(term143520, term143520.getClass(), "numOfHWComponents", 0);
        setIntField(term143520, term143520.getClass(), "numOfLWComponents", 0);
        setField(term143520, term143520.getClass(), "modalComp", null);
        setField(term143520, term143520.getClass(), "modalAppContext", null);
        setIntField(term143520, term143520.getClass(), "containerSerializedDataVersion", 0);
        setField(term143520, term143520.getClass(), "peer", null);
        setField(term143520, term143520.getClass(), "parent", null);
        setField(term143520, term143520.getClass(), "appContext", null);
        setIntField(term143520, term143520.getClass(), "x", 0);
        setIntField(term143520, term143520.getClass(), "y", 0);
        setIntField(term143520, term143520.getClass(), "width", 0);
        setIntField(term143520, term143520.getClass(), "height", 0);
        setField(term143520, term143520.getClass(), "foreground", null);
        setField(term143520, term143520.getClass(), "background", null);
        setField(term143520, term143520.getClass(), "font", null);
        setField(term143520, term143520.getClass(), "peerFont", null);
        setField(term143520, term143520.getClass(), "cursor", null);
        setField(term143520, term143520.getClass(), "locale", null);
        setField(term143520, term143520.getClass(), "graphicsConfig", null);
        setField(term143520, term143520.getClass(), "bufferStrategy", null);
        setBooleanField(term143520, term143520.getClass(), "ignoreRepaint", false);
        setBooleanField(term143520, term143520.getClass(), "visible", false);
        setBooleanField(term143520, term143520.getClass(), "enabled", false);
        setBooleanField(term143520, term143520.getClass(), "valid", false);
        setField(term143520, term143520.getClass(), "dropTarget", null);
        setField(term143520, term143520.getClass(), "popups", null);
        setField(term143520, term143520.getClass(), "name", null);
        setBooleanField(term143520, term143520.getClass(), "nameExplicitlySet", false);
        setBooleanField(term143520, term143520.getClass(), "focusable", false);
        setIntField(term143520, term143520.getClass(), "isFocusTraversableOverridden", 0);
        setField(term143520, term143520.getClass(), "focusTraversalKeys", null);
        setBooleanField(term143520, term143520.getClass(), "focusTraversalKeysEnabled", false);
        setField(term143520, term143520.getClass(), "acc", null);
        setField(term143520, term143520.getClass(), "minSize", null);
        setBooleanField(term143520, term143520.getClass(), "minSizeSet", false);
        setField(term143520, term143520.getClass(), "prefSize", null);
        setBooleanField(term143520, term143520.getClass(), "prefSizeSet", false);
        setField(term143520, term143520.getClass(), "maxSize", null);
        setBooleanField(term143520, term143520.getClass(), "maxSizeSet", false);
        setField(term143520, term143520.getClass(), "componentOrientation", null);
        setBooleanField(term143520, term143520.getClass(), "newEventsOnly", false);
        setField(term143520, term143520.getClass(), "componentListener", null);
        setField(term143520, term143520.getClass(), "focusListener", null);
        setField(term143520, term143520.getClass(), "hierarchyListener", null);
        setField(term143520, term143520.getClass(), "hierarchyBoundsListener", null);
        setField(term143520, term143520.getClass(), "keyListener", null);
        setField(term143520, term143520.getClass(), "mouseListener", null);
        setField(term143520, term143520.getClass(), "mouseMotionListener", null);
        setField(term143520, term143520.getClass(), "mouseWheelListener", null);
        setField(term143520, term143520.getClass(), "inputMethodListener", null);
        setLongField(term143520, term143520.getClass(), "eventMask", 0L);
        setField(term143520, term143520.getClass(), "changeSupport", null);
        setField(term143520, term143520.getClass(), "objectLock", null);
        setBooleanField(term143520, term143520.getClass(), "isPacked", false);
        setIntField(term143520, term143520.getClass(), "boundsOp", 0);
        setField(term143520, term143520.getClass(), "compoundShape", null);
        setField(term143520, term143520.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term143520, term143520.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term143520, term143520.getClass(), "backgroundEraseDisabled", false);
        setField(term143520, term143520.getClass(), "eventCache", null);
        setBooleanField(term143520, term143520.getClass(), "coalescingEnabled", false);
        setBooleanField(term143520, term143520.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term143520, term143520.getClass(), "componentSerializedDataVersion", 0);
        term143581 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.About");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term143581;
        callMethod(klass, "newNotePane", argTypes, term143520, args);
    }

};


