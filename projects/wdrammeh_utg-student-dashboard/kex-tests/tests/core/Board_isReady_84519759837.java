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

public class Board_isReady_84519759837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198665;

    public Board_isReady_84519759837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198665 = newInstance(Class.forName("core.Board"));
        setField(term198665, term198665.getClass(), "contentPanel", null);
        setField(term198665, term198665.getClass(), "bodyLayer", null);
        setField(term198665, term198665.getClass(), "cardLayout", null);
        setField(term198665, term198665.getClass(), "semesterActivity", null);
        setField(term198665, term198665.getClass(), "moduleActivity", null);
        setField(term198665, term198665.getClass(), "settingsUI", null);
        setField(term198665, term198665.getClass(), "transcriptActivity", null);
        setField(term198665, term198665.getClass(), "analysisActivity", null);
        setField(term198665, term198665.getClass(), "helpActivity", null);
        setField(term198665, term198665.getClass(), "about", null);
        setField(term198665, term198665.getClass(), "taskActivity", null);
        setField(term198665, term198665.getClass(), "newsPresent", null);
        setField(term198665, term198665.getClass(), "alertActivity", null);
        setIntField(term198665, term198665.getClass(), "defaultCloseOperation", 0);
        setField(term198665, term198665.getClass(), "transferHandler", null);
        setField(term198665, term198665.getClass(), "rootPane", null);
        setBooleanField(term198665, term198665.getClass(), "rootPaneCheckingEnabled", false);
        setField(term198665, term198665.getClass(), "accessibleContext", null);
        setField(term198665, term198665.getClass(), "maximizedBounds", null);
        setField(term198665, term198665.getClass(), "title", null);
        setField(term198665, term198665.getClass(), "menuBar", null);
        setBooleanField(term198665, term198665.getClass(), "resizable", false);
        setBooleanField(term198665, term198665.getClass(), "undecorated", false);
        setBooleanField(term198665, term198665.getClass(), "mbManagement", false);
        setIntField(term198665, term198665.getClass(), "state", 0);
        setField(term198665, term198665.getClass(), "ownedWindows", null);
        setIntField(term198665, term198665.getClass(), "frameSerializedDataVersion", 0);
        setField(term198665, term198665.getClass(), "warningString", null);
        setField(term198665, term198665.getClass(), "icons", null);
        setField(term198665, term198665.getClass(), "temporaryLostComponent", null);
        setBooleanField(term198665, term198665.getClass(), "syncLWRequests", false);
        setBooleanField(term198665, term198665.getClass(), "beforeFirstShow", false);
        setBooleanField(term198665, term198665.getClass(), "disposing", false);
        setField(term198665, term198665.getClass(), "disposerRecord", null);
        setBooleanField(term198665, term198665.getClass(), "alwaysOnTop", false);
        setField(term198665, term198665.getClass(), "ownedWindowList", null);
        setField(term198665, term198665.getClass(), "weakThis", null);
        setBooleanField(term198665, term198665.getClass(), "showWithParent", false);
        setField(term198665, term198665.getClass(), "modalBlocker", null);
        setField(term198665, term198665.getClass(), "modalExclusionType", null);
        setField(term198665, term198665.getClass(), "windowListener", null);
        setField(term198665, term198665.getClass(), "windowStateListener", null);
        setField(term198665, term198665.getClass(), "windowFocusListener", null);
        setField(term198665, term198665.getClass(), "inputContext", null);
        setField(term198665, term198665.getClass(), "inputContextLock", null);
        setField(term198665, term198665.getClass(), "focusMgr", null);
        setBooleanField(term198665, term198665.getClass(), "focusableWindowState", false);
        setBooleanField(term198665, term198665.getClass(), "autoRequestFocus", false);
        setBooleanField(term198665, term198665.getClass(), "isInShow", false);
        setFloatField(term198665, term198665.getClass(), "opacity", 0.0F);
        setField(term198665, term198665.getClass(), "shape", null);
        setBooleanField(term198665, term198665.getClass(), "isTrayIconWindow", false);
        setIntField(term198665, term198665.getClass(), "securityWarningWidth", 0);
        setIntField(term198665, term198665.getClass(), "securityWarningHeight", 0);
        setDoubleField(term198665, term198665.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term198665, term198665.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term198665, term198665.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term198665, term198665.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term198665, term198665.getClass(), "anchor", null);
        setField(term198665, term198665.getClass(), "type", null);
        setIntField(term198665, term198665.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term198665, term198665.getClass(), "locationByPlatform", false);
        setField(term198665, term198665.getClass(), "component", null);
        setField(term198665, term198665.getClass(), "layoutMgr", null);
        setField(term198665, term198665.getClass(), "dispatcher", null);
        setField(term198665, term198665.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term198665, term198665.getClass(), "focusCycleRoot", false);
        setBooleanField(term198665, term198665.getClass(), "focusTraversalPolicyProvider", false);
        setField(term198665, term198665.getClass(), "printingThreads", null);
        setBooleanField(term198665, term198665.getClass(), "printing", false);
        setField(term198665, term198665.getClass(), "containerListener", null);
        setIntField(term198665, term198665.getClass(), "listeningChildren", 0);
        setIntField(term198665, term198665.getClass(), "listeningBoundsChildren", 0);
        setIntField(term198665, term198665.getClass(), "descendantsCount", 0);
        setField(term198665, term198665.getClass(), "preserveBackgroundColor", null);
        setIntField(term198665, term198665.getClass(), "numOfHWComponents", 0);
        setIntField(term198665, term198665.getClass(), "numOfLWComponents", 0);
        setField(term198665, term198665.getClass(), "modalComp", null);
        setField(term198665, term198665.getClass(), "modalAppContext", null);
        setIntField(term198665, term198665.getClass(), "containerSerializedDataVersion", 0);
        setField(term198665, term198665.getClass(), "peer", null);
        setField(term198665, term198665.getClass(), "parent", null);
        setField(term198665, term198665.getClass(), "appContext", null);
        setIntField(term198665, term198665.getClass(), "x", 0);
        setIntField(term198665, term198665.getClass(), "y", 0);
        setIntField(term198665, term198665.getClass(), "width", 0);
        setIntField(term198665, term198665.getClass(), "height", 0);
        setField(term198665, term198665.getClass(), "foreground", null);
        setField(term198665, term198665.getClass(), "background", null);
        setField(term198665, term198665.getClass(), "font", null);
        setField(term198665, term198665.getClass(), "peerFont", null);
        setField(term198665, term198665.getClass(), "cursor", null);
        setField(term198665, term198665.getClass(), "locale", null);
        setField(term198665, term198665.getClass(), "graphicsConfig", null);
        setField(term198665, term198665.getClass(), "bufferStrategy", null);
        setBooleanField(term198665, term198665.getClass(), "ignoreRepaint", false);
        setBooleanField(term198665, term198665.getClass(), "visible", false);
        setBooleanField(term198665, term198665.getClass(), "enabled", false);
        setBooleanField(term198665, term198665.getClass(), "valid", false);
        setField(term198665, term198665.getClass(), "dropTarget", null);
        setField(term198665, term198665.getClass(), "popups", null);
        setField(term198665, term198665.getClass(), "name", null);
        setBooleanField(term198665, term198665.getClass(), "nameExplicitlySet", false);
        setBooleanField(term198665, term198665.getClass(), "focusable", false);
        setIntField(term198665, term198665.getClass(), "isFocusTraversableOverridden", 0);
        setField(term198665, term198665.getClass(), "focusTraversalKeys", null);
        setBooleanField(term198665, term198665.getClass(), "focusTraversalKeysEnabled", false);
        setField(term198665, term198665.getClass(), "acc", null);
        setField(term198665, term198665.getClass(), "minSize", null);
        setBooleanField(term198665, term198665.getClass(), "minSizeSet", false);
        setField(term198665, term198665.getClass(), "prefSize", null);
        setBooleanField(term198665, term198665.getClass(), "prefSizeSet", false);
        setField(term198665, term198665.getClass(), "maxSize", null);
        setBooleanField(term198665, term198665.getClass(), "maxSizeSet", false);
        setField(term198665, term198665.getClass(), "componentOrientation", null);
        setBooleanField(term198665, term198665.getClass(), "newEventsOnly", false);
        setField(term198665, term198665.getClass(), "componentListener", null);
        setField(term198665, term198665.getClass(), "focusListener", null);
        setField(term198665, term198665.getClass(), "hierarchyListener", null);
        setField(term198665, term198665.getClass(), "hierarchyBoundsListener", null);
        setField(term198665, term198665.getClass(), "keyListener", null);
        setField(term198665, term198665.getClass(), "mouseListener", null);
        setField(term198665, term198665.getClass(), "mouseMotionListener", null);
        setField(term198665, term198665.getClass(), "mouseWheelListener", null);
        setField(term198665, term198665.getClass(), "inputMethodListener", null);
        setLongField(term198665, term198665.getClass(), "eventMask", 0L);
        setField(term198665, term198665.getClass(), "changeSupport", null);
        setField(term198665, term198665.getClass(), "objectLock", null);
        setBooleanField(term198665, term198665.getClass(), "isPacked", false);
        setIntField(term198665, term198665.getClass(), "boundsOp", 0);
        setField(term198665, term198665.getClass(), "compoundShape", null);
        setField(term198665, term198665.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term198665, term198665.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term198665, term198665.getClass(), "backgroundEraseDisabled", false);
        setField(term198665, term198665.getClass(), "eventCache", null);
        setBooleanField(term198665, term198665.getClass(), "coalescingEnabled", false);
        setBooleanField(term198665, term198665.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term198665, term198665.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isReady", argTypes, term198665, args);
    }

};


