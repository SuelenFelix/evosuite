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

public class Board_getInstance_18484586636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198605;

    public Board_getInstance_18484586636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198605 = newInstance(Class.forName("core.Board"));
        setField(term198605, term198605.getClass(), "contentPanel", null);
        setField(term198605, term198605.getClass(), "bodyLayer", null);
        setField(term198605, term198605.getClass(), "cardLayout", null);
        setField(term198605, term198605.getClass(), "semesterActivity", null);
        setField(term198605, term198605.getClass(), "moduleActivity", null);
        setField(term198605, term198605.getClass(), "settingsUI", null);
        setField(term198605, term198605.getClass(), "transcriptActivity", null);
        setField(term198605, term198605.getClass(), "analysisActivity", null);
        setField(term198605, term198605.getClass(), "helpActivity", null);
        setField(term198605, term198605.getClass(), "about", null);
        setField(term198605, term198605.getClass(), "taskActivity", null);
        setField(term198605, term198605.getClass(), "newsPresent", null);
        setField(term198605, term198605.getClass(), "alertActivity", null);
        setIntField(term198605, term198605.getClass(), "defaultCloseOperation", 0);
        setField(term198605, term198605.getClass(), "transferHandler", null);
        setField(term198605, term198605.getClass(), "rootPane", null);
        setBooleanField(term198605, term198605.getClass(), "rootPaneCheckingEnabled", false);
        setField(term198605, term198605.getClass(), "accessibleContext", null);
        setField(term198605, term198605.getClass(), "maximizedBounds", null);
        setField(term198605, term198605.getClass(), "title", null);
        setField(term198605, term198605.getClass(), "menuBar", null);
        setBooleanField(term198605, term198605.getClass(), "resizable", false);
        setBooleanField(term198605, term198605.getClass(), "undecorated", false);
        setBooleanField(term198605, term198605.getClass(), "mbManagement", false);
        setIntField(term198605, term198605.getClass(), "state", 0);
        setField(term198605, term198605.getClass(), "ownedWindows", null);
        setIntField(term198605, term198605.getClass(), "frameSerializedDataVersion", 0);
        setField(term198605, term198605.getClass(), "warningString", null);
        setField(term198605, term198605.getClass(), "icons", null);
        setField(term198605, term198605.getClass(), "temporaryLostComponent", null);
        setBooleanField(term198605, term198605.getClass(), "syncLWRequests", false);
        setBooleanField(term198605, term198605.getClass(), "beforeFirstShow", false);
        setBooleanField(term198605, term198605.getClass(), "disposing", false);
        setField(term198605, term198605.getClass(), "disposerRecord", null);
        setBooleanField(term198605, term198605.getClass(), "alwaysOnTop", false);
        setField(term198605, term198605.getClass(), "ownedWindowList", null);
        setField(term198605, term198605.getClass(), "weakThis", null);
        setBooleanField(term198605, term198605.getClass(), "showWithParent", false);
        setField(term198605, term198605.getClass(), "modalBlocker", null);
        setField(term198605, term198605.getClass(), "modalExclusionType", null);
        setField(term198605, term198605.getClass(), "windowListener", null);
        setField(term198605, term198605.getClass(), "windowStateListener", null);
        setField(term198605, term198605.getClass(), "windowFocusListener", null);
        setField(term198605, term198605.getClass(), "inputContext", null);
        setField(term198605, term198605.getClass(), "inputContextLock", null);
        setField(term198605, term198605.getClass(), "focusMgr", null);
        setBooleanField(term198605, term198605.getClass(), "focusableWindowState", false);
        setBooleanField(term198605, term198605.getClass(), "autoRequestFocus", false);
        setBooleanField(term198605, term198605.getClass(), "isInShow", false);
        setFloatField(term198605, term198605.getClass(), "opacity", 0.0F);
        setField(term198605, term198605.getClass(), "shape", null);
        setBooleanField(term198605, term198605.getClass(), "isTrayIconWindow", false);
        setIntField(term198605, term198605.getClass(), "securityWarningWidth", 0);
        setIntField(term198605, term198605.getClass(), "securityWarningHeight", 0);
        setDoubleField(term198605, term198605.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term198605, term198605.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term198605, term198605.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term198605, term198605.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term198605, term198605.getClass(), "anchor", null);
        setField(term198605, term198605.getClass(), "type", null);
        setIntField(term198605, term198605.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term198605, term198605.getClass(), "locationByPlatform", false);
        setField(term198605, term198605.getClass(), "component", null);
        setField(term198605, term198605.getClass(), "layoutMgr", null);
        setField(term198605, term198605.getClass(), "dispatcher", null);
        setField(term198605, term198605.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term198605, term198605.getClass(), "focusCycleRoot", false);
        setBooleanField(term198605, term198605.getClass(), "focusTraversalPolicyProvider", false);
        setField(term198605, term198605.getClass(), "printingThreads", null);
        setBooleanField(term198605, term198605.getClass(), "printing", false);
        setField(term198605, term198605.getClass(), "containerListener", null);
        setIntField(term198605, term198605.getClass(), "listeningChildren", 0);
        setIntField(term198605, term198605.getClass(), "listeningBoundsChildren", 0);
        setIntField(term198605, term198605.getClass(), "descendantsCount", 0);
        setField(term198605, term198605.getClass(), "preserveBackgroundColor", null);
        setIntField(term198605, term198605.getClass(), "numOfHWComponents", 0);
        setIntField(term198605, term198605.getClass(), "numOfLWComponents", 0);
        setField(term198605, term198605.getClass(), "modalComp", null);
        setField(term198605, term198605.getClass(), "modalAppContext", null);
        setIntField(term198605, term198605.getClass(), "containerSerializedDataVersion", 0);
        setField(term198605, term198605.getClass(), "peer", null);
        setField(term198605, term198605.getClass(), "parent", null);
        setField(term198605, term198605.getClass(), "appContext", null);
        setIntField(term198605, term198605.getClass(), "x", 0);
        setIntField(term198605, term198605.getClass(), "y", 0);
        setIntField(term198605, term198605.getClass(), "width", 0);
        setIntField(term198605, term198605.getClass(), "height", 0);
        setField(term198605, term198605.getClass(), "foreground", null);
        setField(term198605, term198605.getClass(), "background", null);
        setField(term198605, term198605.getClass(), "font", null);
        setField(term198605, term198605.getClass(), "peerFont", null);
        setField(term198605, term198605.getClass(), "cursor", null);
        setField(term198605, term198605.getClass(), "locale", null);
        setField(term198605, term198605.getClass(), "graphicsConfig", null);
        setField(term198605, term198605.getClass(), "bufferStrategy", null);
        setBooleanField(term198605, term198605.getClass(), "ignoreRepaint", false);
        setBooleanField(term198605, term198605.getClass(), "visible", false);
        setBooleanField(term198605, term198605.getClass(), "enabled", false);
        setBooleanField(term198605, term198605.getClass(), "valid", false);
        setField(term198605, term198605.getClass(), "dropTarget", null);
        setField(term198605, term198605.getClass(), "popups", null);
        setField(term198605, term198605.getClass(), "name", null);
        setBooleanField(term198605, term198605.getClass(), "nameExplicitlySet", false);
        setBooleanField(term198605, term198605.getClass(), "focusable", false);
        setIntField(term198605, term198605.getClass(), "isFocusTraversableOverridden", 0);
        setField(term198605, term198605.getClass(), "focusTraversalKeys", null);
        setBooleanField(term198605, term198605.getClass(), "focusTraversalKeysEnabled", false);
        setField(term198605, term198605.getClass(), "acc", null);
        setField(term198605, term198605.getClass(), "minSize", null);
        setBooleanField(term198605, term198605.getClass(), "minSizeSet", false);
        setField(term198605, term198605.getClass(), "prefSize", null);
        setBooleanField(term198605, term198605.getClass(), "prefSizeSet", false);
        setField(term198605, term198605.getClass(), "maxSize", null);
        setBooleanField(term198605, term198605.getClass(), "maxSizeSet", false);
        setField(term198605, term198605.getClass(), "componentOrientation", null);
        setBooleanField(term198605, term198605.getClass(), "newEventsOnly", false);
        setField(term198605, term198605.getClass(), "componentListener", null);
        setField(term198605, term198605.getClass(), "focusListener", null);
        setField(term198605, term198605.getClass(), "hierarchyListener", null);
        setField(term198605, term198605.getClass(), "hierarchyBoundsListener", null);
        setField(term198605, term198605.getClass(), "keyListener", null);
        setField(term198605, term198605.getClass(), "mouseListener", null);
        setField(term198605, term198605.getClass(), "mouseMotionListener", null);
        setField(term198605, term198605.getClass(), "mouseWheelListener", null);
        setField(term198605, term198605.getClass(), "inputMethodListener", null);
        setLongField(term198605, term198605.getClass(), "eventMask", 0L);
        setField(term198605, term198605.getClass(), "changeSupport", null);
        setField(term198605, term198605.getClass(), "objectLock", null);
        setBooleanField(term198605, term198605.getClass(), "isPacked", false);
        setIntField(term198605, term198605.getClass(), "boundsOp", 0);
        setField(term198605, term198605.getClass(), "compoundShape", null);
        setField(term198605, term198605.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term198605, term198605.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term198605, term198605.getClass(), "backgroundEraseDisabled", false);
        setField(term198605, term198605.getClass(), "eventCache", null);
        setBooleanField(term198605, term198605.getClass(), "coalescingEnabled", false);
        setBooleanField(term198605, term198605.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term198605, term198605.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInstance", argTypes, term198605, args);
    }

};


