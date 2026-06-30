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
     Object term199087;

    public Board_effectStatusUpgrade_120340234644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199087 = newInstance(Class.forName("core.Board"));
        setField(term199087, term199087.getClass(), "contentPanel", null);
        setField(term199087, term199087.getClass(), "bodyLayer", null);
        setField(term199087, term199087.getClass(), "cardLayout", null);
        setField(term199087, term199087.getClass(), "semesterActivity", null);
        setField(term199087, term199087.getClass(), "moduleActivity", null);
        setField(term199087, term199087.getClass(), "settingsUI", null);
        setField(term199087, term199087.getClass(), "transcriptActivity", null);
        setField(term199087, term199087.getClass(), "analysisActivity", null);
        setField(term199087, term199087.getClass(), "helpActivity", null);
        setField(term199087, term199087.getClass(), "about", null);
        setField(term199087, term199087.getClass(), "taskActivity", null);
        setField(term199087, term199087.getClass(), "newsPresent", null);
        setField(term199087, term199087.getClass(), "alertActivity", null);
        setIntField(term199087, term199087.getClass(), "defaultCloseOperation", 0);
        setField(term199087, term199087.getClass(), "transferHandler", null);
        setField(term199087, term199087.getClass(), "rootPane", null);
        setBooleanField(term199087, term199087.getClass(), "rootPaneCheckingEnabled", false);
        setField(term199087, term199087.getClass(), "accessibleContext", null);
        setField(term199087, term199087.getClass(), "maximizedBounds", null);
        setField(term199087, term199087.getClass(), "title", null);
        setField(term199087, term199087.getClass(), "menuBar", null);
        setBooleanField(term199087, term199087.getClass(), "resizable", false);
        setBooleanField(term199087, term199087.getClass(), "undecorated", false);
        setBooleanField(term199087, term199087.getClass(), "mbManagement", false);
        setIntField(term199087, term199087.getClass(), "state", 0);
        setField(term199087, term199087.getClass(), "ownedWindows", null);
        setIntField(term199087, term199087.getClass(), "frameSerializedDataVersion", 0);
        setField(term199087, term199087.getClass(), "warningString", null);
        setField(term199087, term199087.getClass(), "icons", null);
        setField(term199087, term199087.getClass(), "temporaryLostComponent", null);
        setBooleanField(term199087, term199087.getClass(), "syncLWRequests", false);
        setBooleanField(term199087, term199087.getClass(), "beforeFirstShow", false);
        setBooleanField(term199087, term199087.getClass(), "disposing", false);
        setField(term199087, term199087.getClass(), "disposerRecord", null);
        setBooleanField(term199087, term199087.getClass(), "alwaysOnTop", false);
        setField(term199087, term199087.getClass(), "ownedWindowList", null);
        setField(term199087, term199087.getClass(), "weakThis", null);
        setBooleanField(term199087, term199087.getClass(), "showWithParent", false);
        setField(term199087, term199087.getClass(), "modalBlocker", null);
        setField(term199087, term199087.getClass(), "modalExclusionType", null);
        setField(term199087, term199087.getClass(), "windowListener", null);
        setField(term199087, term199087.getClass(), "windowStateListener", null);
        setField(term199087, term199087.getClass(), "windowFocusListener", null);
        setField(term199087, term199087.getClass(), "inputContext", null);
        setField(term199087, term199087.getClass(), "inputContextLock", null);
        setField(term199087, term199087.getClass(), "focusMgr", null);
        setBooleanField(term199087, term199087.getClass(), "focusableWindowState", false);
        setBooleanField(term199087, term199087.getClass(), "autoRequestFocus", false);
        setBooleanField(term199087, term199087.getClass(), "isInShow", false);
        setFloatField(term199087, term199087.getClass(), "opacity", 0.0F);
        setField(term199087, term199087.getClass(), "shape", null);
        setBooleanField(term199087, term199087.getClass(), "isTrayIconWindow", false);
        setIntField(term199087, term199087.getClass(), "securityWarningWidth", 0);
        setIntField(term199087, term199087.getClass(), "securityWarningHeight", 0);
        setDoubleField(term199087, term199087.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term199087, term199087.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term199087, term199087.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term199087, term199087.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term199087, term199087.getClass(), "anchor", null);
        setField(term199087, term199087.getClass(), "type", null);
        setIntField(term199087, term199087.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term199087, term199087.getClass(), "locationByPlatform", false);
        setField(term199087, term199087.getClass(), "component", null);
        setField(term199087, term199087.getClass(), "layoutMgr", null);
        setField(term199087, term199087.getClass(), "dispatcher", null);
        setField(term199087, term199087.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term199087, term199087.getClass(), "focusCycleRoot", false);
        setBooleanField(term199087, term199087.getClass(), "focusTraversalPolicyProvider", false);
        setField(term199087, term199087.getClass(), "printingThreads", null);
        setBooleanField(term199087, term199087.getClass(), "printing", false);
        setField(term199087, term199087.getClass(), "containerListener", null);
        setIntField(term199087, term199087.getClass(), "listeningChildren", 0);
        setIntField(term199087, term199087.getClass(), "listeningBoundsChildren", 0);
        setIntField(term199087, term199087.getClass(), "descendantsCount", 0);
        setField(term199087, term199087.getClass(), "preserveBackgroundColor", null);
        setIntField(term199087, term199087.getClass(), "numOfHWComponents", 0);
        setIntField(term199087, term199087.getClass(), "numOfLWComponents", 0);
        setField(term199087, term199087.getClass(), "modalComp", null);
        setField(term199087, term199087.getClass(), "modalAppContext", null);
        setIntField(term199087, term199087.getClass(), "containerSerializedDataVersion", 0);
        setField(term199087, term199087.getClass(), "peer", null);
        setField(term199087, term199087.getClass(), "parent", null);
        setField(term199087, term199087.getClass(), "appContext", null);
        setIntField(term199087, term199087.getClass(), "x", 0);
        setIntField(term199087, term199087.getClass(), "y", 0);
        setIntField(term199087, term199087.getClass(), "width", 0);
        setIntField(term199087, term199087.getClass(), "height", 0);
        setField(term199087, term199087.getClass(), "foreground", null);
        setField(term199087, term199087.getClass(), "background", null);
        setField(term199087, term199087.getClass(), "font", null);
        setField(term199087, term199087.getClass(), "peerFont", null);
        setField(term199087, term199087.getClass(), "cursor", null);
        setField(term199087, term199087.getClass(), "locale", null);
        setField(term199087, term199087.getClass(), "graphicsConfig", null);
        setField(term199087, term199087.getClass(), "bufferStrategy", null);
        setBooleanField(term199087, term199087.getClass(), "ignoreRepaint", false);
        setBooleanField(term199087, term199087.getClass(), "visible", false);
        setBooleanField(term199087, term199087.getClass(), "enabled", false);
        setBooleanField(term199087, term199087.getClass(), "valid", false);
        setField(term199087, term199087.getClass(), "dropTarget", null);
        setField(term199087, term199087.getClass(), "popups", null);
        setField(term199087, term199087.getClass(), "name", null);
        setBooleanField(term199087, term199087.getClass(), "nameExplicitlySet", false);
        setBooleanField(term199087, term199087.getClass(), "focusable", false);
        setIntField(term199087, term199087.getClass(), "isFocusTraversableOverridden", 0);
        setField(term199087, term199087.getClass(), "focusTraversalKeys", null);
        setBooleanField(term199087, term199087.getClass(), "focusTraversalKeysEnabled", false);
        setField(term199087, term199087.getClass(), "acc", null);
        setField(term199087, term199087.getClass(), "minSize", null);
        setBooleanField(term199087, term199087.getClass(), "minSizeSet", false);
        setField(term199087, term199087.getClass(), "prefSize", null);
        setBooleanField(term199087, term199087.getClass(), "prefSizeSet", false);
        setField(term199087, term199087.getClass(), "maxSize", null);
        setBooleanField(term199087, term199087.getClass(), "maxSizeSet", false);
        setField(term199087, term199087.getClass(), "componentOrientation", null);
        setBooleanField(term199087, term199087.getClass(), "newEventsOnly", false);
        setField(term199087, term199087.getClass(), "componentListener", null);
        setField(term199087, term199087.getClass(), "focusListener", null);
        setField(term199087, term199087.getClass(), "hierarchyListener", null);
        setField(term199087, term199087.getClass(), "hierarchyBoundsListener", null);
        setField(term199087, term199087.getClass(), "keyListener", null);
        setField(term199087, term199087.getClass(), "mouseListener", null);
        setField(term199087, term199087.getClass(), "mouseMotionListener", null);
        setField(term199087, term199087.getClass(), "mouseWheelListener", null);
        setField(term199087, term199087.getClass(), "inputMethodListener", null);
        setLongField(term199087, term199087.getClass(), "eventMask", 0L);
        setField(term199087, term199087.getClass(), "changeSupport", null);
        setField(term199087, term199087.getClass(), "objectLock", null);
        setBooleanField(term199087, term199087.getClass(), "isPacked", false);
        setIntField(term199087, term199087.getClass(), "boundsOp", 0);
        setField(term199087, term199087.getClass(), "compoundShape", null);
        setField(term199087, term199087.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term199087, term199087.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term199087, term199087.getClass(), "backgroundEraseDisabled", false);
        setField(term199087, term199087.getClass(), "eventCache", null);
        setBooleanField(term199087, term199087.getClass(), "coalescingEnabled", false);
        setBooleanField(term199087, term199087.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term199087, term199087.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "effectStatusUpgrade", argTypes, term199087, args);
    }

};


