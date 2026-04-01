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

public class Board_attachListeners_7573895458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194107;

    public Board_attachListeners_7573895458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194107 = newInstance(Class.forName("core.Board"));
        setField(term194107, term194107.getClass(), "contentPanel", null);
        setField(term194107, term194107.getClass(), "bodyLayer", null);
        setField(term194107, term194107.getClass(), "cardLayout", null);
        setField(term194107, term194107.getClass(), "semesterActivity", null);
        setField(term194107, term194107.getClass(), "moduleActivity", null);
        setField(term194107, term194107.getClass(), "settingsUI", null);
        setField(term194107, term194107.getClass(), "transcriptActivity", null);
        setField(term194107, term194107.getClass(), "analysisActivity", null);
        setField(term194107, term194107.getClass(), "helpActivity", null);
        setField(term194107, term194107.getClass(), "about", null);
        setField(term194107, term194107.getClass(), "taskActivity", null);
        setField(term194107, term194107.getClass(), "newsPresent", null);
        setField(term194107, term194107.getClass(), "alertActivity", null);
        setIntField(term194107, term194107.getClass(), "defaultCloseOperation", 0);
        setField(term194107, term194107.getClass(), "transferHandler", null);
        setField(term194107, term194107.getClass(), "rootPane", null);
        setBooleanField(term194107, term194107.getClass(), "rootPaneCheckingEnabled", false);
        setField(term194107, term194107.getClass(), "accessibleContext", null);
        setField(term194107, term194107.getClass(), "maximizedBounds", null);
        setField(term194107, term194107.getClass(), "title", null);
        setField(term194107, term194107.getClass(), "menuBar", null);
        setBooleanField(term194107, term194107.getClass(), "resizable", false);
        setBooleanField(term194107, term194107.getClass(), "undecorated", false);
        setBooleanField(term194107, term194107.getClass(), "mbManagement", false);
        setIntField(term194107, term194107.getClass(), "state", 0);
        setField(term194107, term194107.getClass(), "ownedWindows", null);
        setIntField(term194107, term194107.getClass(), "frameSerializedDataVersion", 0);
        setField(term194107, term194107.getClass(), "warningString", null);
        setField(term194107, term194107.getClass(), "icons", null);
        setField(term194107, term194107.getClass(), "temporaryLostComponent", null);
        setBooleanField(term194107, term194107.getClass(), "syncLWRequests", false);
        setBooleanField(term194107, term194107.getClass(), "beforeFirstShow", false);
        setBooleanField(term194107, term194107.getClass(), "disposing", false);
        setField(term194107, term194107.getClass(), "disposerRecord", null);
        setBooleanField(term194107, term194107.getClass(), "alwaysOnTop", false);
        setField(term194107, term194107.getClass(), "ownedWindowList", null);
        setField(term194107, term194107.getClass(), "weakThis", null);
        setBooleanField(term194107, term194107.getClass(), "showWithParent", false);
        setField(term194107, term194107.getClass(), "modalBlocker", null);
        setField(term194107, term194107.getClass(), "modalExclusionType", null);
        setField(term194107, term194107.getClass(), "windowListener", null);
        setField(term194107, term194107.getClass(), "windowStateListener", null);
        setField(term194107, term194107.getClass(), "windowFocusListener", null);
        setField(term194107, term194107.getClass(), "inputContext", null);
        setField(term194107, term194107.getClass(), "inputContextLock", null);
        setField(term194107, term194107.getClass(), "focusMgr", null);
        setBooleanField(term194107, term194107.getClass(), "focusableWindowState", false);
        setBooleanField(term194107, term194107.getClass(), "autoRequestFocus", false);
        setBooleanField(term194107, term194107.getClass(), "isInShow", false);
        setFloatField(term194107, term194107.getClass(), "opacity", 0.0F);
        setField(term194107, term194107.getClass(), "shape", null);
        setBooleanField(term194107, term194107.getClass(), "isTrayIconWindow", false);
        setIntField(term194107, term194107.getClass(), "securityWarningWidth", 0);
        setIntField(term194107, term194107.getClass(), "securityWarningHeight", 0);
        setDoubleField(term194107, term194107.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term194107, term194107.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term194107, term194107.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term194107, term194107.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term194107, term194107.getClass(), "anchor", null);
        setField(term194107, term194107.getClass(), "type", null);
        setIntField(term194107, term194107.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term194107, term194107.getClass(), "locationByPlatform", false);
        setField(term194107, term194107.getClass(), "component", null);
        setField(term194107, term194107.getClass(), "layoutMgr", null);
        setField(term194107, term194107.getClass(), "dispatcher", null);
        setField(term194107, term194107.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term194107, term194107.getClass(), "focusCycleRoot", false);
        setBooleanField(term194107, term194107.getClass(), "focusTraversalPolicyProvider", false);
        setField(term194107, term194107.getClass(), "printingThreads", null);
        setBooleanField(term194107, term194107.getClass(), "printing", false);
        setField(term194107, term194107.getClass(), "containerListener", null);
        setIntField(term194107, term194107.getClass(), "listeningChildren", 0);
        setIntField(term194107, term194107.getClass(), "listeningBoundsChildren", 0);
        setIntField(term194107, term194107.getClass(), "descendantsCount", 0);
        setField(term194107, term194107.getClass(), "preserveBackgroundColor", null);
        setIntField(term194107, term194107.getClass(), "numOfHWComponents", 0);
        setIntField(term194107, term194107.getClass(), "numOfLWComponents", 0);
        setField(term194107, term194107.getClass(), "modalComp", null);
        setField(term194107, term194107.getClass(), "modalAppContext", null);
        setIntField(term194107, term194107.getClass(), "containerSerializedDataVersion", 0);
        setField(term194107, term194107.getClass(), "peer", null);
        setField(term194107, term194107.getClass(), "parent", null);
        setField(term194107, term194107.getClass(), "appContext", null);
        setIntField(term194107, term194107.getClass(), "x", 0);
        setIntField(term194107, term194107.getClass(), "y", 0);
        setIntField(term194107, term194107.getClass(), "width", 0);
        setIntField(term194107, term194107.getClass(), "height", 0);
        setField(term194107, term194107.getClass(), "foreground", null);
        setField(term194107, term194107.getClass(), "background", null);
        setField(term194107, term194107.getClass(), "font", null);
        setField(term194107, term194107.getClass(), "peerFont", null);
        setField(term194107, term194107.getClass(), "cursor", null);
        setField(term194107, term194107.getClass(), "locale", null);
        setField(term194107, term194107.getClass(), "graphicsConfig", null);
        setField(term194107, term194107.getClass(), "bufferStrategy", null);
        setBooleanField(term194107, term194107.getClass(), "ignoreRepaint", false);
        setBooleanField(term194107, term194107.getClass(), "visible", false);
        setBooleanField(term194107, term194107.getClass(), "enabled", false);
        setBooleanField(term194107, term194107.getClass(), "valid", false);
        setField(term194107, term194107.getClass(), "dropTarget", null);
        setField(term194107, term194107.getClass(), "popups", null);
        setField(term194107, term194107.getClass(), "name", null);
        setBooleanField(term194107, term194107.getClass(), "nameExplicitlySet", false);
        setBooleanField(term194107, term194107.getClass(), "focusable", false);
        setIntField(term194107, term194107.getClass(), "isFocusTraversableOverridden", 0);
        setField(term194107, term194107.getClass(), "focusTraversalKeys", null);
        setBooleanField(term194107, term194107.getClass(), "focusTraversalKeysEnabled", false);
        setField(term194107, term194107.getClass(), "acc", null);
        setField(term194107, term194107.getClass(), "minSize", null);
        setBooleanField(term194107, term194107.getClass(), "minSizeSet", false);
        setField(term194107, term194107.getClass(), "prefSize", null);
        setBooleanField(term194107, term194107.getClass(), "prefSizeSet", false);
        setField(term194107, term194107.getClass(), "maxSize", null);
        setBooleanField(term194107, term194107.getClass(), "maxSizeSet", false);
        setField(term194107, term194107.getClass(), "componentOrientation", null);
        setBooleanField(term194107, term194107.getClass(), "newEventsOnly", false);
        setField(term194107, term194107.getClass(), "componentListener", null);
        setField(term194107, term194107.getClass(), "focusListener", null);
        setField(term194107, term194107.getClass(), "hierarchyListener", null);
        setField(term194107, term194107.getClass(), "hierarchyBoundsListener", null);
        setField(term194107, term194107.getClass(), "keyListener", null);
        setField(term194107, term194107.getClass(), "mouseListener", null);
        setField(term194107, term194107.getClass(), "mouseMotionListener", null);
        setField(term194107, term194107.getClass(), "mouseWheelListener", null);
        setField(term194107, term194107.getClass(), "inputMethodListener", null);
        setLongField(term194107, term194107.getClass(), "eventMask", 0L);
        setField(term194107, term194107.getClass(), "changeSupport", null);
        setField(term194107, term194107.getClass(), "objectLock", null);
        setBooleanField(term194107, term194107.getClass(), "isPacked", false);
        setIntField(term194107, term194107.getClass(), "boundsOp", 0);
        setField(term194107, term194107.getClass(), "compoundShape", null);
        setField(term194107, term194107.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term194107, term194107.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term194107, term194107.getClass(), "backgroundEraseDisabled", false);
        setField(term194107, term194107.getClass(), "eventCache", null);
        setBooleanField(term194107, term194107.getClass(), "coalescingEnabled", false);
        setBooleanField(term194107, term194107.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term194107, term194107.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "attachListeners", argTypes, term194107, args);
    }

};


