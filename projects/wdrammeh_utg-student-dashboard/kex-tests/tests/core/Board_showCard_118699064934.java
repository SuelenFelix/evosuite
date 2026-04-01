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

public class Board_showCard_118699064934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198471;

    public Board_showCard_118699064934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198471 = newInstance(Class.forName("core.Board"));
        setField(term198471, term198471.getClass(), "contentPanel", null);
        setField(term198471, term198471.getClass(), "bodyLayer", null);
        setField(term198471, term198471.getClass(), "cardLayout", null);
        setField(term198471, term198471.getClass(), "semesterActivity", null);
        setField(term198471, term198471.getClass(), "moduleActivity", null);
        setField(term198471, term198471.getClass(), "settingsUI", null);
        setField(term198471, term198471.getClass(), "transcriptActivity", null);
        setField(term198471, term198471.getClass(), "analysisActivity", null);
        setField(term198471, term198471.getClass(), "helpActivity", null);
        setField(term198471, term198471.getClass(), "about", null);
        setField(term198471, term198471.getClass(), "taskActivity", null);
        setField(term198471, term198471.getClass(), "newsPresent", null);
        setField(term198471, term198471.getClass(), "alertActivity", null);
        setIntField(term198471, term198471.getClass(), "defaultCloseOperation", 0);
        setField(term198471, term198471.getClass(), "transferHandler", null);
        setField(term198471, term198471.getClass(), "rootPane", null);
        setBooleanField(term198471, term198471.getClass(), "rootPaneCheckingEnabled", false);
        setField(term198471, term198471.getClass(), "accessibleContext", null);
        setField(term198471, term198471.getClass(), "maximizedBounds", null);
        setField(term198471, term198471.getClass(), "title", null);
        setField(term198471, term198471.getClass(), "menuBar", null);
        setBooleanField(term198471, term198471.getClass(), "resizable", false);
        setBooleanField(term198471, term198471.getClass(), "undecorated", false);
        setBooleanField(term198471, term198471.getClass(), "mbManagement", false);
        setIntField(term198471, term198471.getClass(), "state", 0);
        setField(term198471, term198471.getClass(), "ownedWindows", null);
        setIntField(term198471, term198471.getClass(), "frameSerializedDataVersion", 0);
        setField(term198471, term198471.getClass(), "warningString", null);
        setField(term198471, term198471.getClass(), "icons", null);
        setField(term198471, term198471.getClass(), "temporaryLostComponent", null);
        setBooleanField(term198471, term198471.getClass(), "syncLWRequests", false);
        setBooleanField(term198471, term198471.getClass(), "beforeFirstShow", false);
        setBooleanField(term198471, term198471.getClass(), "disposing", false);
        setField(term198471, term198471.getClass(), "disposerRecord", null);
        setBooleanField(term198471, term198471.getClass(), "alwaysOnTop", false);
        setField(term198471, term198471.getClass(), "ownedWindowList", null);
        setField(term198471, term198471.getClass(), "weakThis", null);
        setBooleanField(term198471, term198471.getClass(), "showWithParent", false);
        setField(term198471, term198471.getClass(), "modalBlocker", null);
        setField(term198471, term198471.getClass(), "modalExclusionType", null);
        setField(term198471, term198471.getClass(), "windowListener", null);
        setField(term198471, term198471.getClass(), "windowStateListener", null);
        setField(term198471, term198471.getClass(), "windowFocusListener", null);
        setField(term198471, term198471.getClass(), "inputContext", null);
        setField(term198471, term198471.getClass(), "inputContextLock", null);
        setField(term198471, term198471.getClass(), "focusMgr", null);
        setBooleanField(term198471, term198471.getClass(), "focusableWindowState", false);
        setBooleanField(term198471, term198471.getClass(), "autoRequestFocus", false);
        setBooleanField(term198471, term198471.getClass(), "isInShow", false);
        setFloatField(term198471, term198471.getClass(), "opacity", 0.0F);
        setField(term198471, term198471.getClass(), "shape", null);
        setBooleanField(term198471, term198471.getClass(), "isTrayIconWindow", false);
        setIntField(term198471, term198471.getClass(), "securityWarningWidth", 0);
        setIntField(term198471, term198471.getClass(), "securityWarningHeight", 0);
        setDoubleField(term198471, term198471.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term198471, term198471.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term198471, term198471.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term198471, term198471.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term198471, term198471.getClass(), "anchor", null);
        setField(term198471, term198471.getClass(), "type", null);
        setIntField(term198471, term198471.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term198471, term198471.getClass(), "locationByPlatform", false);
        setField(term198471, term198471.getClass(), "component", null);
        setField(term198471, term198471.getClass(), "layoutMgr", null);
        setField(term198471, term198471.getClass(), "dispatcher", null);
        setField(term198471, term198471.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term198471, term198471.getClass(), "focusCycleRoot", false);
        setBooleanField(term198471, term198471.getClass(), "focusTraversalPolicyProvider", false);
        setField(term198471, term198471.getClass(), "printingThreads", null);
        setBooleanField(term198471, term198471.getClass(), "printing", false);
        setField(term198471, term198471.getClass(), "containerListener", null);
        setIntField(term198471, term198471.getClass(), "listeningChildren", 0);
        setIntField(term198471, term198471.getClass(), "listeningBoundsChildren", 0);
        setIntField(term198471, term198471.getClass(), "descendantsCount", 0);
        setField(term198471, term198471.getClass(), "preserveBackgroundColor", null);
        setIntField(term198471, term198471.getClass(), "numOfHWComponents", 0);
        setIntField(term198471, term198471.getClass(), "numOfLWComponents", 0);
        setField(term198471, term198471.getClass(), "modalComp", null);
        setField(term198471, term198471.getClass(), "modalAppContext", null);
        setIntField(term198471, term198471.getClass(), "containerSerializedDataVersion", 0);
        setField(term198471, term198471.getClass(), "peer", null);
        setField(term198471, term198471.getClass(), "parent", null);
        setField(term198471, term198471.getClass(), "appContext", null);
        setIntField(term198471, term198471.getClass(), "x", 0);
        setIntField(term198471, term198471.getClass(), "y", 0);
        setIntField(term198471, term198471.getClass(), "width", 0);
        setIntField(term198471, term198471.getClass(), "height", 0);
        setField(term198471, term198471.getClass(), "foreground", null);
        setField(term198471, term198471.getClass(), "background", null);
        setField(term198471, term198471.getClass(), "font", null);
        setField(term198471, term198471.getClass(), "peerFont", null);
        setField(term198471, term198471.getClass(), "cursor", null);
        setField(term198471, term198471.getClass(), "locale", null);
        setField(term198471, term198471.getClass(), "graphicsConfig", null);
        setField(term198471, term198471.getClass(), "bufferStrategy", null);
        setBooleanField(term198471, term198471.getClass(), "ignoreRepaint", false);
        setBooleanField(term198471, term198471.getClass(), "visible", false);
        setBooleanField(term198471, term198471.getClass(), "enabled", false);
        setBooleanField(term198471, term198471.getClass(), "valid", false);
        setField(term198471, term198471.getClass(), "dropTarget", null);
        setField(term198471, term198471.getClass(), "popups", null);
        setField(term198471, term198471.getClass(), "name", null);
        setBooleanField(term198471, term198471.getClass(), "nameExplicitlySet", false);
        setBooleanField(term198471, term198471.getClass(), "focusable", false);
        setIntField(term198471, term198471.getClass(), "isFocusTraversableOverridden", 0);
        setField(term198471, term198471.getClass(), "focusTraversalKeys", null);
        setBooleanField(term198471, term198471.getClass(), "focusTraversalKeysEnabled", false);
        setField(term198471, term198471.getClass(), "acc", null);
        setField(term198471, term198471.getClass(), "minSize", null);
        setBooleanField(term198471, term198471.getClass(), "minSizeSet", false);
        setField(term198471, term198471.getClass(), "prefSize", null);
        setBooleanField(term198471, term198471.getClass(), "prefSizeSet", false);
        setField(term198471, term198471.getClass(), "maxSize", null);
        setBooleanField(term198471, term198471.getClass(), "maxSizeSet", false);
        setField(term198471, term198471.getClass(), "componentOrientation", null);
        setBooleanField(term198471, term198471.getClass(), "newEventsOnly", false);
        setField(term198471, term198471.getClass(), "componentListener", null);
        setField(term198471, term198471.getClass(), "focusListener", null);
        setField(term198471, term198471.getClass(), "hierarchyListener", null);
        setField(term198471, term198471.getClass(), "hierarchyBoundsListener", null);
        setField(term198471, term198471.getClass(), "keyListener", null);
        setField(term198471, term198471.getClass(), "mouseListener", null);
        setField(term198471, term198471.getClass(), "mouseMotionListener", null);
        setField(term198471, term198471.getClass(), "mouseWheelListener", null);
        setField(term198471, term198471.getClass(), "inputMethodListener", null);
        setLongField(term198471, term198471.getClass(), "eventMask", 0L);
        setField(term198471, term198471.getClass(), "changeSupport", null);
        setField(term198471, term198471.getClass(), "objectLock", null);
        setBooleanField(term198471, term198471.getClass(), "isPacked", false);
        setIntField(term198471, term198471.getClass(), "boundsOp", 0);
        setField(term198471, term198471.getClass(), "compoundShape", null);
        setField(term198471, term198471.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term198471, term198471.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term198471, term198471.getClass(), "backgroundEraseDisabled", false);
        setField(term198471, term198471.getClass(), "eventCache", null);
        setBooleanField(term198471, term198471.getClass(), "coalescingEnabled", false);
        setBooleanField(term198471, term198471.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term198471, term198471.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "showCard", argTypes, term198471, args);
    }

};


