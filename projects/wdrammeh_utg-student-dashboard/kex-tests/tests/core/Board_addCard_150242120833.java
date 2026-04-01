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

public class Board_addCard_150242120833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198411;

    public Board_addCard_150242120833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198411 = newInstance(Class.forName("core.Board"));
        setField(term198411, term198411.getClass(), "contentPanel", null);
        setField(term198411, term198411.getClass(), "bodyLayer", null);
        setField(term198411, term198411.getClass(), "cardLayout", null);
        setField(term198411, term198411.getClass(), "semesterActivity", null);
        setField(term198411, term198411.getClass(), "moduleActivity", null);
        setField(term198411, term198411.getClass(), "settingsUI", null);
        setField(term198411, term198411.getClass(), "transcriptActivity", null);
        setField(term198411, term198411.getClass(), "analysisActivity", null);
        setField(term198411, term198411.getClass(), "helpActivity", null);
        setField(term198411, term198411.getClass(), "about", null);
        setField(term198411, term198411.getClass(), "taskActivity", null);
        setField(term198411, term198411.getClass(), "newsPresent", null);
        setField(term198411, term198411.getClass(), "alertActivity", null);
        setIntField(term198411, term198411.getClass(), "defaultCloseOperation", 0);
        setField(term198411, term198411.getClass(), "transferHandler", null);
        setField(term198411, term198411.getClass(), "rootPane", null);
        setBooleanField(term198411, term198411.getClass(), "rootPaneCheckingEnabled", false);
        setField(term198411, term198411.getClass(), "accessibleContext", null);
        setField(term198411, term198411.getClass(), "maximizedBounds", null);
        setField(term198411, term198411.getClass(), "title", null);
        setField(term198411, term198411.getClass(), "menuBar", null);
        setBooleanField(term198411, term198411.getClass(), "resizable", false);
        setBooleanField(term198411, term198411.getClass(), "undecorated", false);
        setBooleanField(term198411, term198411.getClass(), "mbManagement", false);
        setIntField(term198411, term198411.getClass(), "state", 0);
        setField(term198411, term198411.getClass(), "ownedWindows", null);
        setIntField(term198411, term198411.getClass(), "frameSerializedDataVersion", 0);
        setField(term198411, term198411.getClass(), "warningString", null);
        setField(term198411, term198411.getClass(), "icons", null);
        setField(term198411, term198411.getClass(), "temporaryLostComponent", null);
        setBooleanField(term198411, term198411.getClass(), "syncLWRequests", false);
        setBooleanField(term198411, term198411.getClass(), "beforeFirstShow", false);
        setBooleanField(term198411, term198411.getClass(), "disposing", false);
        setField(term198411, term198411.getClass(), "disposerRecord", null);
        setBooleanField(term198411, term198411.getClass(), "alwaysOnTop", false);
        setField(term198411, term198411.getClass(), "ownedWindowList", null);
        setField(term198411, term198411.getClass(), "weakThis", null);
        setBooleanField(term198411, term198411.getClass(), "showWithParent", false);
        setField(term198411, term198411.getClass(), "modalBlocker", null);
        setField(term198411, term198411.getClass(), "modalExclusionType", null);
        setField(term198411, term198411.getClass(), "windowListener", null);
        setField(term198411, term198411.getClass(), "windowStateListener", null);
        setField(term198411, term198411.getClass(), "windowFocusListener", null);
        setField(term198411, term198411.getClass(), "inputContext", null);
        setField(term198411, term198411.getClass(), "inputContextLock", null);
        setField(term198411, term198411.getClass(), "focusMgr", null);
        setBooleanField(term198411, term198411.getClass(), "focusableWindowState", false);
        setBooleanField(term198411, term198411.getClass(), "autoRequestFocus", false);
        setBooleanField(term198411, term198411.getClass(), "isInShow", false);
        setFloatField(term198411, term198411.getClass(), "opacity", 0.0F);
        setField(term198411, term198411.getClass(), "shape", null);
        setBooleanField(term198411, term198411.getClass(), "isTrayIconWindow", false);
        setIntField(term198411, term198411.getClass(), "securityWarningWidth", 0);
        setIntField(term198411, term198411.getClass(), "securityWarningHeight", 0);
        setDoubleField(term198411, term198411.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term198411, term198411.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term198411, term198411.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term198411, term198411.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term198411, term198411.getClass(), "anchor", null);
        setField(term198411, term198411.getClass(), "type", null);
        setIntField(term198411, term198411.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term198411, term198411.getClass(), "locationByPlatform", false);
        setField(term198411, term198411.getClass(), "component", null);
        setField(term198411, term198411.getClass(), "layoutMgr", null);
        setField(term198411, term198411.getClass(), "dispatcher", null);
        setField(term198411, term198411.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term198411, term198411.getClass(), "focusCycleRoot", false);
        setBooleanField(term198411, term198411.getClass(), "focusTraversalPolicyProvider", false);
        setField(term198411, term198411.getClass(), "printingThreads", null);
        setBooleanField(term198411, term198411.getClass(), "printing", false);
        setField(term198411, term198411.getClass(), "containerListener", null);
        setIntField(term198411, term198411.getClass(), "listeningChildren", 0);
        setIntField(term198411, term198411.getClass(), "listeningBoundsChildren", 0);
        setIntField(term198411, term198411.getClass(), "descendantsCount", 0);
        setField(term198411, term198411.getClass(), "preserveBackgroundColor", null);
        setIntField(term198411, term198411.getClass(), "numOfHWComponents", 0);
        setIntField(term198411, term198411.getClass(), "numOfLWComponents", 0);
        setField(term198411, term198411.getClass(), "modalComp", null);
        setField(term198411, term198411.getClass(), "modalAppContext", null);
        setIntField(term198411, term198411.getClass(), "containerSerializedDataVersion", 0);
        setField(term198411, term198411.getClass(), "peer", null);
        setField(term198411, term198411.getClass(), "parent", null);
        setField(term198411, term198411.getClass(), "appContext", null);
        setIntField(term198411, term198411.getClass(), "x", 0);
        setIntField(term198411, term198411.getClass(), "y", 0);
        setIntField(term198411, term198411.getClass(), "width", 0);
        setIntField(term198411, term198411.getClass(), "height", 0);
        setField(term198411, term198411.getClass(), "foreground", null);
        setField(term198411, term198411.getClass(), "background", null);
        setField(term198411, term198411.getClass(), "font", null);
        setField(term198411, term198411.getClass(), "peerFont", null);
        setField(term198411, term198411.getClass(), "cursor", null);
        setField(term198411, term198411.getClass(), "locale", null);
        setField(term198411, term198411.getClass(), "graphicsConfig", null);
        setField(term198411, term198411.getClass(), "bufferStrategy", null);
        setBooleanField(term198411, term198411.getClass(), "ignoreRepaint", false);
        setBooleanField(term198411, term198411.getClass(), "visible", false);
        setBooleanField(term198411, term198411.getClass(), "enabled", false);
        setBooleanField(term198411, term198411.getClass(), "valid", false);
        setField(term198411, term198411.getClass(), "dropTarget", null);
        setField(term198411, term198411.getClass(), "popups", null);
        setField(term198411, term198411.getClass(), "name", null);
        setBooleanField(term198411, term198411.getClass(), "nameExplicitlySet", false);
        setBooleanField(term198411, term198411.getClass(), "focusable", false);
        setIntField(term198411, term198411.getClass(), "isFocusTraversableOverridden", 0);
        setField(term198411, term198411.getClass(), "focusTraversalKeys", null);
        setBooleanField(term198411, term198411.getClass(), "focusTraversalKeysEnabled", false);
        setField(term198411, term198411.getClass(), "acc", null);
        setField(term198411, term198411.getClass(), "minSize", null);
        setBooleanField(term198411, term198411.getClass(), "minSizeSet", false);
        setField(term198411, term198411.getClass(), "prefSize", null);
        setBooleanField(term198411, term198411.getClass(), "prefSizeSet", false);
        setField(term198411, term198411.getClass(), "maxSize", null);
        setBooleanField(term198411, term198411.getClass(), "maxSizeSet", false);
        setField(term198411, term198411.getClass(), "componentOrientation", null);
        setBooleanField(term198411, term198411.getClass(), "newEventsOnly", false);
        setField(term198411, term198411.getClass(), "componentListener", null);
        setField(term198411, term198411.getClass(), "focusListener", null);
        setField(term198411, term198411.getClass(), "hierarchyListener", null);
        setField(term198411, term198411.getClass(), "hierarchyBoundsListener", null);
        setField(term198411, term198411.getClass(), "keyListener", null);
        setField(term198411, term198411.getClass(), "mouseListener", null);
        setField(term198411, term198411.getClass(), "mouseMotionListener", null);
        setField(term198411, term198411.getClass(), "mouseWheelListener", null);
        setField(term198411, term198411.getClass(), "inputMethodListener", null);
        setLongField(term198411, term198411.getClass(), "eventMask", 0L);
        setField(term198411, term198411.getClass(), "changeSupport", null);
        setField(term198411, term198411.getClass(), "objectLock", null);
        setBooleanField(term198411, term198411.getClass(), "isPacked", false);
        setIntField(term198411, term198411.getClass(), "boundsOp", 0);
        setField(term198411, term198411.getClass(), "compoundShape", null);
        setField(term198411, term198411.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term198411, term198411.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term198411, term198411.getClass(), "backgroundEraseDisabled", false);
        setField(term198411, term198411.getClass(), "eventCache", null);
        setBooleanField(term198411, term198411.getClass(), "coalescingEnabled", false);
        setBooleanField(term198411, term198411.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term198411, term198411.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.Component");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "addCard", argTypes, term198411, args);
    }

};


