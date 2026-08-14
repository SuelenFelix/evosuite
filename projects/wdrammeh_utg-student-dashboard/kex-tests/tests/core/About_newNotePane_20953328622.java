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
     Object term143522;
     Object term143583;

    public About_newNotePane_20953328622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143522 = newInstance(Class.forName("core.About"));
        setField(term143522, term143522.getClass(), "midCard", null);
        setField(term143522, term143522.getClass(), "midLayer", null);
        setIntField(term143522, term143522.getClass(), "defaultCloseOperation", 0);
        setField(term143522, term143522.getClass(), "rootPane", null);
        setBooleanField(term143522, term143522.getClass(), "rootPaneCheckingEnabled", false);
        setField(term143522, term143522.getClass(), "transferHandler", null);
        setField(term143522, term143522.getClass(), "accessibleContext", null);
        setBooleanField(term143522, term143522.getClass(), "resizable", false);
        setBooleanField(term143522, term143522.getClass(), "undecorated", false);
        setBooleanField(term143522, term143522.getClass(), "initialized", false);
        setBooleanField(term143522, term143522.getClass(), "modal", false);
        setField(term143522, term143522.getClass(), "modalityType", null);
        setField(term143522, term143522.getClass(), "blockedWindows", null);
        setField(term143522, term143522.getClass(), "title", null);
        setField(term143522, term143522.getClass(), "modalFilter", null);
        setField(term143522, term143522.getClass(), "secondaryLoop", null);
        setBooleanField(term143522, term143522.getClass(), "isInHide", false);
        setBooleanField(term143522, term143522.getClass(), "isInDispose", false);
        setField(term143522, term143522.getClass(), "warningString", null);
        setField(term143522, term143522.getClass(), "icons", null);
        setField(term143522, term143522.getClass(), "temporaryLostComponent", null);
        setBooleanField(term143522, term143522.getClass(), "syncLWRequests", false);
        setBooleanField(term143522, term143522.getClass(), "beforeFirstShow", false);
        setBooleanField(term143522, term143522.getClass(), "disposing", false);
        setField(term143522, term143522.getClass(), "disposerRecord", null);
        setIntField(term143522, term143522.getClass(), "state", 0);
        setBooleanField(term143522, term143522.getClass(), "alwaysOnTop", false);
        setField(term143522, term143522.getClass(), "ownedWindowList", null);
        setField(term143522, term143522.getClass(), "weakThis", null);
        setBooleanField(term143522, term143522.getClass(), "showWithParent", false);
        setField(term143522, term143522.getClass(), "modalBlocker", null);
        setField(term143522, term143522.getClass(), "modalExclusionType", null);
        setField(term143522, term143522.getClass(), "windowListener", null);
        setField(term143522, term143522.getClass(), "windowStateListener", null);
        setField(term143522, term143522.getClass(), "windowFocusListener", null);
        setField(term143522, term143522.getClass(), "inputContext", null);
        setField(term143522, term143522.getClass(), "inputContextLock", null);
        setField(term143522, term143522.getClass(), "focusMgr", null);
        setBooleanField(term143522, term143522.getClass(), "focusableWindowState", false);
        setBooleanField(term143522, term143522.getClass(), "autoRequestFocus", false);
        setBooleanField(term143522, term143522.getClass(), "isInShow", false);
        setFloatField(term143522, term143522.getClass(), "opacity", 0.0F);
        setField(term143522, term143522.getClass(), "shape", null);
        setBooleanField(term143522, term143522.getClass(), "isTrayIconWindow", false);
        setIntField(term143522, term143522.getClass(), "securityWarningWidth", 0);
        setIntField(term143522, term143522.getClass(), "securityWarningHeight", 0);
        setDoubleField(term143522, term143522.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term143522, term143522.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term143522, term143522.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term143522, term143522.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term143522, term143522.getClass(), "anchor", null);
        setField(term143522, term143522.getClass(), "type", null);
        setIntField(term143522, term143522.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term143522, term143522.getClass(), "locationByPlatform", false);
        setField(term143522, term143522.getClass(), "component", null);
        setField(term143522, term143522.getClass(), "layoutMgr", null);
        setField(term143522, term143522.getClass(), "dispatcher", null);
        setField(term143522, term143522.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term143522, term143522.getClass(), "focusCycleRoot", false);
        setBooleanField(term143522, term143522.getClass(), "focusTraversalPolicyProvider", false);
        setField(term143522, term143522.getClass(), "printingThreads", null);
        setBooleanField(term143522, term143522.getClass(), "printing", false);
        setField(term143522, term143522.getClass(), "containerListener", null);
        setIntField(term143522, term143522.getClass(), "listeningChildren", 0);
        setIntField(term143522, term143522.getClass(), "listeningBoundsChildren", 0);
        setIntField(term143522, term143522.getClass(), "descendantsCount", 0);
        setField(term143522, term143522.getClass(), "preserveBackgroundColor", null);
        setIntField(term143522, term143522.getClass(), "numOfHWComponents", 0);
        setIntField(term143522, term143522.getClass(), "numOfLWComponents", 0);
        setField(term143522, term143522.getClass(), "modalComp", null);
        setField(term143522, term143522.getClass(), "modalAppContext", null);
        setIntField(term143522, term143522.getClass(), "containerSerializedDataVersion", 0);
        setField(term143522, term143522.getClass(), "peer", null);
        setField(term143522, term143522.getClass(), "parent", null);
        setField(term143522, term143522.getClass(), "appContext", null);
        setIntField(term143522, term143522.getClass(), "x", 0);
        setIntField(term143522, term143522.getClass(), "y", 0);
        setIntField(term143522, term143522.getClass(), "width", 0);
        setIntField(term143522, term143522.getClass(), "height", 0);
        setField(term143522, term143522.getClass(), "foreground", null);
        setField(term143522, term143522.getClass(), "background", null);
        setField(term143522, term143522.getClass(), "font", null);
        setField(term143522, term143522.getClass(), "peerFont", null);
        setField(term143522, term143522.getClass(), "cursor", null);
        setField(term143522, term143522.getClass(), "locale", null);
        setField(term143522, term143522.getClass(), "graphicsConfig", null);
        setField(term143522, term143522.getClass(), "bufferStrategy", null);
        setBooleanField(term143522, term143522.getClass(), "ignoreRepaint", false);
        setBooleanField(term143522, term143522.getClass(), "visible", false);
        setBooleanField(term143522, term143522.getClass(), "enabled", false);
        setBooleanField(term143522, term143522.getClass(), "valid", false);
        setField(term143522, term143522.getClass(), "dropTarget", null);
        setField(term143522, term143522.getClass(), "popups", null);
        setField(term143522, term143522.getClass(), "name", null);
        setBooleanField(term143522, term143522.getClass(), "nameExplicitlySet", false);
        setBooleanField(term143522, term143522.getClass(), "focusable", false);
        setIntField(term143522, term143522.getClass(), "isFocusTraversableOverridden", 0);
        setField(term143522, term143522.getClass(), "focusTraversalKeys", null);
        setBooleanField(term143522, term143522.getClass(), "focusTraversalKeysEnabled", false);
        setField(term143522, term143522.getClass(), "acc", null);
        setField(term143522, term143522.getClass(), "minSize", null);
        setBooleanField(term143522, term143522.getClass(), "minSizeSet", false);
        setField(term143522, term143522.getClass(), "prefSize", null);
        setBooleanField(term143522, term143522.getClass(), "prefSizeSet", false);
        setField(term143522, term143522.getClass(), "maxSize", null);
        setBooleanField(term143522, term143522.getClass(), "maxSizeSet", false);
        setField(term143522, term143522.getClass(), "componentOrientation", null);
        setBooleanField(term143522, term143522.getClass(), "newEventsOnly", false);
        setField(term143522, term143522.getClass(), "componentListener", null);
        setField(term143522, term143522.getClass(), "focusListener", null);
        setField(term143522, term143522.getClass(), "hierarchyListener", null);
        setField(term143522, term143522.getClass(), "hierarchyBoundsListener", null);
        setField(term143522, term143522.getClass(), "keyListener", null);
        setField(term143522, term143522.getClass(), "mouseListener", null);
        setField(term143522, term143522.getClass(), "mouseMotionListener", null);
        setField(term143522, term143522.getClass(), "mouseWheelListener", null);
        setField(term143522, term143522.getClass(), "inputMethodListener", null);
        setLongField(term143522, term143522.getClass(), "eventMask", 0L);
        setField(term143522, term143522.getClass(), "changeSupport", null);
        setField(term143522, term143522.getClass(), "objectLock", null);
        setBooleanField(term143522, term143522.getClass(), "isPacked", false);
        setIntField(term143522, term143522.getClass(), "boundsOp", 0);
        setField(term143522, term143522.getClass(), "compoundShape", null);
        setField(term143522, term143522.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term143522, term143522.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term143522, term143522.getClass(), "backgroundEraseDisabled", false);
        setField(term143522, term143522.getClass(), "eventCache", null);
        setBooleanField(term143522, term143522.getClass(), "coalescingEnabled", false);
        setBooleanField(term143522, term143522.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term143522, term143522.getClass(), "componentSerializedDataVersion", 0);
        term143583 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.About");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term143583;
        callMethod(klass, "newNotePane", argTypes, term143522, args);
    }

};


