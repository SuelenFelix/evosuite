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

public class Board_effectStatusUpgrade_120340234644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199073;

    public Board_effectStatusUpgrade_120340234644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199073 = newInstance(Class.forName("core.Board"));
        setField(term199073, term199073.getClass(), "contentPanel", null);
        setField(term199073, term199073.getClass(), "bodyLayer", null);
        setField(term199073, term199073.getClass(), "cardLayout", null);
        setField(term199073, term199073.getClass(), "semesterActivity", null);
        setField(term199073, term199073.getClass(), "moduleActivity", null);
        setField(term199073, term199073.getClass(), "settingsUI", null);
        setField(term199073, term199073.getClass(), "transcriptActivity", null);
        setField(term199073, term199073.getClass(), "analysisActivity", null);
        setField(term199073, term199073.getClass(), "helpActivity", null);
        setField(term199073, term199073.getClass(), "about", null);
        setField(term199073, term199073.getClass(), "taskActivity", null);
        setField(term199073, term199073.getClass(), "newsPresent", null);
        setField(term199073, term199073.getClass(), "alertActivity", null);
        setIntField(term199073, term199073.getClass(), "defaultCloseOperation", 0);
        setField(term199073, term199073.getClass(), "transferHandler", null);
        setField(term199073, term199073.getClass(), "rootPane", null);
        setBooleanField(term199073, term199073.getClass(), "rootPaneCheckingEnabled", false);
        setField(term199073, term199073.getClass(), "accessibleContext", null);
        setField(term199073, term199073.getClass(), "maximizedBounds", null);
        setField(term199073, term199073.getClass(), "title", null);
        setField(term199073, term199073.getClass(), "menuBar", null);
        setBooleanField(term199073, term199073.getClass(), "resizable", false);
        setBooleanField(term199073, term199073.getClass(), "undecorated", false);
        setBooleanField(term199073, term199073.getClass(), "mbManagement", false);
        setIntField(term199073, term199073.getClass(), "state", 0);
        setField(term199073, term199073.getClass(), "ownedWindows", null);
        setIntField(term199073, term199073.getClass(), "frameSerializedDataVersion", 0);
        setField(term199073, term199073.getClass(), "warningString", null);
        setField(term199073, term199073.getClass(), "icons", null);
        setField(term199073, term199073.getClass(), "temporaryLostComponent", null);
        setBooleanField(term199073, term199073.getClass(), "syncLWRequests", false);
        setBooleanField(term199073, term199073.getClass(), "beforeFirstShow", false);
        setBooleanField(term199073, term199073.getClass(), "disposing", false);
        setField(term199073, term199073.getClass(), "disposerRecord", null);
        setBooleanField(term199073, term199073.getClass(), "alwaysOnTop", false);
        setField(term199073, term199073.getClass(), "ownedWindowList", null);
        setField(term199073, term199073.getClass(), "weakThis", null);
        setBooleanField(term199073, term199073.getClass(), "showWithParent", false);
        setField(term199073, term199073.getClass(), "modalBlocker", null);
        setField(term199073, term199073.getClass(), "modalExclusionType", null);
        setField(term199073, term199073.getClass(), "windowListener", null);
        setField(term199073, term199073.getClass(), "windowStateListener", null);
        setField(term199073, term199073.getClass(), "windowFocusListener", null);
        setField(term199073, term199073.getClass(), "inputContext", null);
        setField(term199073, term199073.getClass(), "inputContextLock", null);
        setField(term199073, term199073.getClass(), "focusMgr", null);
        setBooleanField(term199073, term199073.getClass(), "focusableWindowState", false);
        setBooleanField(term199073, term199073.getClass(), "autoRequestFocus", false);
        setBooleanField(term199073, term199073.getClass(), "isInShow", false);
        setFloatField(term199073, term199073.getClass(), "opacity", 0.0F);
        setField(term199073, term199073.getClass(), "shape", null);
        setBooleanField(term199073, term199073.getClass(), "isTrayIconWindow", false);
        setIntField(term199073, term199073.getClass(), "securityWarningWidth", 0);
        setIntField(term199073, term199073.getClass(), "securityWarningHeight", 0);
        setDoubleField(term199073, term199073.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term199073, term199073.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term199073, term199073.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term199073, term199073.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term199073, term199073.getClass(), "anchor", null);
        setField(term199073, term199073.getClass(), "type", null);
        setIntField(term199073, term199073.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term199073, term199073.getClass(), "locationByPlatform", false);
        setField(term199073, term199073.getClass(), "component", null);
        setField(term199073, term199073.getClass(), "layoutMgr", null);
        setField(term199073, term199073.getClass(), "dispatcher", null);
        setField(term199073, term199073.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term199073, term199073.getClass(), "focusCycleRoot", false);
        setBooleanField(term199073, term199073.getClass(), "focusTraversalPolicyProvider", false);
        setField(term199073, term199073.getClass(), "printingThreads", null);
        setBooleanField(term199073, term199073.getClass(), "printing", false);
        setField(term199073, term199073.getClass(), "containerListener", null);
        setIntField(term199073, term199073.getClass(), "listeningChildren", 0);
        setIntField(term199073, term199073.getClass(), "listeningBoundsChildren", 0);
        setIntField(term199073, term199073.getClass(), "descendantsCount", 0);
        setField(term199073, term199073.getClass(), "preserveBackgroundColor", null);
        setIntField(term199073, term199073.getClass(), "numOfHWComponents", 0);
        setIntField(term199073, term199073.getClass(), "numOfLWComponents", 0);
        setField(term199073, term199073.getClass(), "modalComp", null);
        setField(term199073, term199073.getClass(), "modalAppContext", null);
        setIntField(term199073, term199073.getClass(), "containerSerializedDataVersion", 0);
        setField(term199073, term199073.getClass(), "peer", null);
        setField(term199073, term199073.getClass(), "parent", null);
        setField(term199073, term199073.getClass(), "appContext", null);
        setIntField(term199073, term199073.getClass(), "x", 0);
        setIntField(term199073, term199073.getClass(), "y", 0);
        setIntField(term199073, term199073.getClass(), "width", 0);
        setIntField(term199073, term199073.getClass(), "height", 0);
        setField(term199073, term199073.getClass(), "foreground", null);
        setField(term199073, term199073.getClass(), "background", null);
        setField(term199073, term199073.getClass(), "font", null);
        setField(term199073, term199073.getClass(), "peerFont", null);
        setField(term199073, term199073.getClass(), "cursor", null);
        setField(term199073, term199073.getClass(), "locale", null);
        setField(term199073, term199073.getClass(), "graphicsConfig", null);
        setField(term199073, term199073.getClass(), "bufferStrategy", null);
        setBooleanField(term199073, term199073.getClass(), "ignoreRepaint", false);
        setBooleanField(term199073, term199073.getClass(), "visible", false);
        setBooleanField(term199073, term199073.getClass(), "enabled", false);
        setBooleanField(term199073, term199073.getClass(), "valid", false);
        setField(term199073, term199073.getClass(), "dropTarget", null);
        setField(term199073, term199073.getClass(), "popups", null);
        setField(term199073, term199073.getClass(), "name", null);
        setBooleanField(term199073, term199073.getClass(), "nameExplicitlySet", false);
        setBooleanField(term199073, term199073.getClass(), "focusable", false);
        setIntField(term199073, term199073.getClass(), "isFocusTraversableOverridden", 0);
        setField(term199073, term199073.getClass(), "focusTraversalKeys", null);
        setBooleanField(term199073, term199073.getClass(), "focusTraversalKeysEnabled", false);
        setField(term199073, term199073.getClass(), "acc", null);
        setField(term199073, term199073.getClass(), "minSize", null);
        setBooleanField(term199073, term199073.getClass(), "minSizeSet", false);
        setField(term199073, term199073.getClass(), "prefSize", null);
        setBooleanField(term199073, term199073.getClass(), "prefSizeSet", false);
        setField(term199073, term199073.getClass(), "maxSize", null);
        setBooleanField(term199073, term199073.getClass(), "maxSizeSet", false);
        setField(term199073, term199073.getClass(), "componentOrientation", null);
        setBooleanField(term199073, term199073.getClass(), "newEventsOnly", false);
        setField(term199073, term199073.getClass(), "componentListener", null);
        setField(term199073, term199073.getClass(), "focusListener", null);
        setField(term199073, term199073.getClass(), "hierarchyListener", null);
        setField(term199073, term199073.getClass(), "hierarchyBoundsListener", null);
        setField(term199073, term199073.getClass(), "keyListener", null);
        setField(term199073, term199073.getClass(), "mouseListener", null);
        setField(term199073, term199073.getClass(), "mouseMotionListener", null);
        setField(term199073, term199073.getClass(), "mouseWheelListener", null);
        setField(term199073, term199073.getClass(), "inputMethodListener", null);
        setLongField(term199073, term199073.getClass(), "eventMask", 0L);
        setField(term199073, term199073.getClass(), "changeSupport", null);
        setField(term199073, term199073.getClass(), "objectLock", null);
        setBooleanField(term199073, term199073.getClass(), "isPacked", false);
        setIntField(term199073, term199073.getClass(), "boundsOp", 0);
        setField(term199073, term199073.getClass(), "compoundShape", null);
        setField(term199073, term199073.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term199073, term199073.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term199073, term199073.getClass(), "backgroundEraseDisabled", false);
        setField(term199073, term199073.getClass(), "eventCache", null);
        setBooleanField(term199073, term199073.getClass(), "coalescingEnabled", false);
        setBooleanField(term199073, term199073.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term199073, term199073.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "effectStatusUpgrade", argTypes, term199073, args);
    }

};


