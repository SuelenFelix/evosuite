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
import java.lang.Boolean;

public class Board_setReady_158309430438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198711;
     Object term198771;

    public Board_setReady_158309430438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198711 = newInstance(Class.forName("core.Board"));
        setField(term198711, term198711.getClass(), "contentPanel", null);
        setField(term198711, term198711.getClass(), "bodyLayer", null);
        setField(term198711, term198711.getClass(), "cardLayout", null);
        setField(term198711, term198711.getClass(), "semesterActivity", null);
        setField(term198711, term198711.getClass(), "moduleActivity", null);
        setField(term198711, term198711.getClass(), "settingsUI", null);
        setField(term198711, term198711.getClass(), "transcriptActivity", null);
        setField(term198711, term198711.getClass(), "analysisActivity", null);
        setField(term198711, term198711.getClass(), "helpActivity", null);
        setField(term198711, term198711.getClass(), "about", null);
        setField(term198711, term198711.getClass(), "taskActivity", null);
        setField(term198711, term198711.getClass(), "newsPresent", null);
        setField(term198711, term198711.getClass(), "alertActivity", null);
        setIntField(term198711, term198711.getClass(), "defaultCloseOperation", 0);
        setField(term198711, term198711.getClass(), "transferHandler", null);
        setField(term198711, term198711.getClass(), "rootPane", null);
        setBooleanField(term198711, term198711.getClass(), "rootPaneCheckingEnabled", false);
        setField(term198711, term198711.getClass(), "accessibleContext", null);
        setField(term198711, term198711.getClass(), "maximizedBounds", null);
        setField(term198711, term198711.getClass(), "title", null);
        setField(term198711, term198711.getClass(), "menuBar", null);
        setBooleanField(term198711, term198711.getClass(), "resizable", false);
        setBooleanField(term198711, term198711.getClass(), "undecorated", false);
        setBooleanField(term198711, term198711.getClass(), "mbManagement", false);
        setIntField(term198711, term198711.getClass(), "state", 0);
        setField(term198711, term198711.getClass(), "ownedWindows", null);
        setIntField(term198711, term198711.getClass(), "frameSerializedDataVersion", 0);
        setField(term198711, term198711.getClass(), "warningString", null);
        setField(term198711, term198711.getClass(), "icons", null);
        setField(term198711, term198711.getClass(), "temporaryLostComponent", null);
        setBooleanField(term198711, term198711.getClass(), "syncLWRequests", false);
        setBooleanField(term198711, term198711.getClass(), "beforeFirstShow", false);
        setBooleanField(term198711, term198711.getClass(), "disposing", false);
        setField(term198711, term198711.getClass(), "disposerRecord", null);
        setBooleanField(term198711, term198711.getClass(), "alwaysOnTop", false);
        setField(term198711, term198711.getClass(), "ownedWindowList", null);
        setField(term198711, term198711.getClass(), "weakThis", null);
        setBooleanField(term198711, term198711.getClass(), "showWithParent", false);
        setField(term198711, term198711.getClass(), "modalBlocker", null);
        setField(term198711, term198711.getClass(), "modalExclusionType", null);
        setField(term198711, term198711.getClass(), "windowListener", null);
        setField(term198711, term198711.getClass(), "windowStateListener", null);
        setField(term198711, term198711.getClass(), "windowFocusListener", null);
        setField(term198711, term198711.getClass(), "inputContext", null);
        setField(term198711, term198711.getClass(), "inputContextLock", null);
        setField(term198711, term198711.getClass(), "focusMgr", null);
        setBooleanField(term198711, term198711.getClass(), "focusableWindowState", false);
        setBooleanField(term198711, term198711.getClass(), "autoRequestFocus", false);
        setBooleanField(term198711, term198711.getClass(), "isInShow", false);
        setFloatField(term198711, term198711.getClass(), "opacity", 0.0F);
        setField(term198711, term198711.getClass(), "shape", null);
        setBooleanField(term198711, term198711.getClass(), "isTrayIconWindow", false);
        setIntField(term198711, term198711.getClass(), "securityWarningWidth", 0);
        setIntField(term198711, term198711.getClass(), "securityWarningHeight", 0);
        setDoubleField(term198711, term198711.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term198711, term198711.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term198711, term198711.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term198711, term198711.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term198711, term198711.getClass(), "anchor", null);
        setField(term198711, term198711.getClass(), "type", null);
        setIntField(term198711, term198711.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term198711, term198711.getClass(), "locationByPlatform", false);
        setField(term198711, term198711.getClass(), "component", null);
        setField(term198711, term198711.getClass(), "layoutMgr", null);
        setField(term198711, term198711.getClass(), "dispatcher", null);
        setField(term198711, term198711.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term198711, term198711.getClass(), "focusCycleRoot", false);
        setBooleanField(term198711, term198711.getClass(), "focusTraversalPolicyProvider", false);
        setField(term198711, term198711.getClass(), "printingThreads", null);
        setBooleanField(term198711, term198711.getClass(), "printing", false);
        setField(term198711, term198711.getClass(), "containerListener", null);
        setIntField(term198711, term198711.getClass(), "listeningChildren", 0);
        setIntField(term198711, term198711.getClass(), "listeningBoundsChildren", 0);
        setIntField(term198711, term198711.getClass(), "descendantsCount", 0);
        setField(term198711, term198711.getClass(), "preserveBackgroundColor", null);
        setIntField(term198711, term198711.getClass(), "numOfHWComponents", 0);
        setIntField(term198711, term198711.getClass(), "numOfLWComponents", 0);
        setField(term198711, term198711.getClass(), "modalComp", null);
        setField(term198711, term198711.getClass(), "modalAppContext", null);
        setIntField(term198711, term198711.getClass(), "containerSerializedDataVersion", 0);
        setField(term198711, term198711.getClass(), "peer", null);
        setField(term198711, term198711.getClass(), "parent", null);
        setField(term198711, term198711.getClass(), "appContext", null);
        setIntField(term198711, term198711.getClass(), "x", 0);
        setIntField(term198711, term198711.getClass(), "y", 0);
        setIntField(term198711, term198711.getClass(), "width", 0);
        setIntField(term198711, term198711.getClass(), "height", 0);
        setField(term198711, term198711.getClass(), "foreground", null);
        setField(term198711, term198711.getClass(), "background", null);
        setField(term198711, term198711.getClass(), "font", null);
        setField(term198711, term198711.getClass(), "peerFont", null);
        setField(term198711, term198711.getClass(), "cursor", null);
        setField(term198711, term198711.getClass(), "locale", null);
        setField(term198711, term198711.getClass(), "graphicsConfig", null);
        setField(term198711, term198711.getClass(), "bufferStrategy", null);
        setBooleanField(term198711, term198711.getClass(), "ignoreRepaint", false);
        setBooleanField(term198711, term198711.getClass(), "visible", false);
        setBooleanField(term198711, term198711.getClass(), "enabled", false);
        setBooleanField(term198711, term198711.getClass(), "valid", false);
        setField(term198711, term198711.getClass(), "dropTarget", null);
        setField(term198711, term198711.getClass(), "popups", null);
        setField(term198711, term198711.getClass(), "name", null);
        setBooleanField(term198711, term198711.getClass(), "nameExplicitlySet", false);
        setBooleanField(term198711, term198711.getClass(), "focusable", false);
        setIntField(term198711, term198711.getClass(), "isFocusTraversableOverridden", 0);
        setField(term198711, term198711.getClass(), "focusTraversalKeys", null);
        setBooleanField(term198711, term198711.getClass(), "focusTraversalKeysEnabled", false);
        setField(term198711, term198711.getClass(), "acc", null);
        setField(term198711, term198711.getClass(), "minSize", null);
        setBooleanField(term198711, term198711.getClass(), "minSizeSet", false);
        setField(term198711, term198711.getClass(), "prefSize", null);
        setBooleanField(term198711, term198711.getClass(), "prefSizeSet", false);
        setField(term198711, term198711.getClass(), "maxSize", null);
        setBooleanField(term198711, term198711.getClass(), "maxSizeSet", false);
        setField(term198711, term198711.getClass(), "componentOrientation", null);
        setBooleanField(term198711, term198711.getClass(), "newEventsOnly", false);
        setField(term198711, term198711.getClass(), "componentListener", null);
        setField(term198711, term198711.getClass(), "focusListener", null);
        setField(term198711, term198711.getClass(), "hierarchyListener", null);
        setField(term198711, term198711.getClass(), "hierarchyBoundsListener", null);
        setField(term198711, term198711.getClass(), "keyListener", null);
        setField(term198711, term198711.getClass(), "mouseListener", null);
        setField(term198711, term198711.getClass(), "mouseMotionListener", null);
        setField(term198711, term198711.getClass(), "mouseWheelListener", null);
        setField(term198711, term198711.getClass(), "inputMethodListener", null);
        setLongField(term198711, term198711.getClass(), "eventMask", 0L);
        setField(term198711, term198711.getClass(), "changeSupport", null);
        setField(term198711, term198711.getClass(), "objectLock", null);
        setBooleanField(term198711, term198711.getClass(), "isPacked", false);
        setIntField(term198711, term198711.getClass(), "boundsOp", 0);
        setField(term198711, term198711.getClass(), "compoundShape", null);
        setField(term198711, term198711.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term198711, term198711.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term198711, term198711.getClass(), "backgroundEraseDisabled", false);
        setField(term198711, term198711.getClass(), "eventCache", null);
        setBooleanField(term198711, term198711.getClass(), "coalescingEnabled", false);
        setBooleanField(term198711, term198711.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term198711, term198711.getClass(), "componentSerializedDataVersion", 0);
        term198771 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term198771;
        callMethod(klass, "setReady", argTypes, term198711, args);
    }

};


