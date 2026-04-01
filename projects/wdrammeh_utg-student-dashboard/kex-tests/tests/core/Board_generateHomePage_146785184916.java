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

public class Board_generateHomePage_146785184916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198171;

    public Board_generateHomePage_146785184916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198171 = newInstance(Class.forName("core.Board"));
        setField(term198171, term198171.getClass(), "contentPanel", null);
        setField(term198171, term198171.getClass(), "bodyLayer", null);
        setField(term198171, term198171.getClass(), "cardLayout", null);
        setField(term198171, term198171.getClass(), "semesterActivity", null);
        setField(term198171, term198171.getClass(), "moduleActivity", null);
        setField(term198171, term198171.getClass(), "settingsUI", null);
        setField(term198171, term198171.getClass(), "transcriptActivity", null);
        setField(term198171, term198171.getClass(), "analysisActivity", null);
        setField(term198171, term198171.getClass(), "helpActivity", null);
        setField(term198171, term198171.getClass(), "about", null);
        setField(term198171, term198171.getClass(), "taskActivity", null);
        setField(term198171, term198171.getClass(), "newsPresent", null);
        setField(term198171, term198171.getClass(), "alertActivity", null);
        setIntField(term198171, term198171.getClass(), "defaultCloseOperation", 0);
        setField(term198171, term198171.getClass(), "transferHandler", null);
        setField(term198171, term198171.getClass(), "rootPane", null);
        setBooleanField(term198171, term198171.getClass(), "rootPaneCheckingEnabled", false);
        setField(term198171, term198171.getClass(), "accessibleContext", null);
        setField(term198171, term198171.getClass(), "maximizedBounds", null);
        setField(term198171, term198171.getClass(), "title", null);
        setField(term198171, term198171.getClass(), "menuBar", null);
        setBooleanField(term198171, term198171.getClass(), "resizable", false);
        setBooleanField(term198171, term198171.getClass(), "undecorated", false);
        setBooleanField(term198171, term198171.getClass(), "mbManagement", false);
        setIntField(term198171, term198171.getClass(), "state", 0);
        setField(term198171, term198171.getClass(), "ownedWindows", null);
        setIntField(term198171, term198171.getClass(), "frameSerializedDataVersion", 0);
        setField(term198171, term198171.getClass(), "warningString", null);
        setField(term198171, term198171.getClass(), "icons", null);
        setField(term198171, term198171.getClass(), "temporaryLostComponent", null);
        setBooleanField(term198171, term198171.getClass(), "syncLWRequests", false);
        setBooleanField(term198171, term198171.getClass(), "beforeFirstShow", false);
        setBooleanField(term198171, term198171.getClass(), "disposing", false);
        setField(term198171, term198171.getClass(), "disposerRecord", null);
        setBooleanField(term198171, term198171.getClass(), "alwaysOnTop", false);
        setField(term198171, term198171.getClass(), "ownedWindowList", null);
        setField(term198171, term198171.getClass(), "weakThis", null);
        setBooleanField(term198171, term198171.getClass(), "showWithParent", false);
        setField(term198171, term198171.getClass(), "modalBlocker", null);
        setField(term198171, term198171.getClass(), "modalExclusionType", null);
        setField(term198171, term198171.getClass(), "windowListener", null);
        setField(term198171, term198171.getClass(), "windowStateListener", null);
        setField(term198171, term198171.getClass(), "windowFocusListener", null);
        setField(term198171, term198171.getClass(), "inputContext", null);
        setField(term198171, term198171.getClass(), "inputContextLock", null);
        setField(term198171, term198171.getClass(), "focusMgr", null);
        setBooleanField(term198171, term198171.getClass(), "focusableWindowState", false);
        setBooleanField(term198171, term198171.getClass(), "autoRequestFocus", false);
        setBooleanField(term198171, term198171.getClass(), "isInShow", false);
        setFloatField(term198171, term198171.getClass(), "opacity", 0.0F);
        setField(term198171, term198171.getClass(), "shape", null);
        setBooleanField(term198171, term198171.getClass(), "isTrayIconWindow", false);
        setIntField(term198171, term198171.getClass(), "securityWarningWidth", 0);
        setIntField(term198171, term198171.getClass(), "securityWarningHeight", 0);
        setDoubleField(term198171, term198171.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term198171, term198171.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term198171, term198171.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term198171, term198171.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term198171, term198171.getClass(), "anchor", null);
        setField(term198171, term198171.getClass(), "type", null);
        setIntField(term198171, term198171.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term198171, term198171.getClass(), "locationByPlatform", false);
        setField(term198171, term198171.getClass(), "component", null);
        setField(term198171, term198171.getClass(), "layoutMgr", null);
        setField(term198171, term198171.getClass(), "dispatcher", null);
        setField(term198171, term198171.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term198171, term198171.getClass(), "focusCycleRoot", false);
        setBooleanField(term198171, term198171.getClass(), "focusTraversalPolicyProvider", false);
        setField(term198171, term198171.getClass(), "printingThreads", null);
        setBooleanField(term198171, term198171.getClass(), "printing", false);
        setField(term198171, term198171.getClass(), "containerListener", null);
        setIntField(term198171, term198171.getClass(), "listeningChildren", 0);
        setIntField(term198171, term198171.getClass(), "listeningBoundsChildren", 0);
        setIntField(term198171, term198171.getClass(), "descendantsCount", 0);
        setField(term198171, term198171.getClass(), "preserveBackgroundColor", null);
        setIntField(term198171, term198171.getClass(), "numOfHWComponents", 0);
        setIntField(term198171, term198171.getClass(), "numOfLWComponents", 0);
        setField(term198171, term198171.getClass(), "modalComp", null);
        setField(term198171, term198171.getClass(), "modalAppContext", null);
        setIntField(term198171, term198171.getClass(), "containerSerializedDataVersion", 0);
        setField(term198171, term198171.getClass(), "peer", null);
        setField(term198171, term198171.getClass(), "parent", null);
        setField(term198171, term198171.getClass(), "appContext", null);
        setIntField(term198171, term198171.getClass(), "x", 0);
        setIntField(term198171, term198171.getClass(), "y", 0);
        setIntField(term198171, term198171.getClass(), "width", 0);
        setIntField(term198171, term198171.getClass(), "height", 0);
        setField(term198171, term198171.getClass(), "foreground", null);
        setField(term198171, term198171.getClass(), "background", null);
        setField(term198171, term198171.getClass(), "font", null);
        setField(term198171, term198171.getClass(), "peerFont", null);
        setField(term198171, term198171.getClass(), "cursor", null);
        setField(term198171, term198171.getClass(), "locale", null);
        setField(term198171, term198171.getClass(), "graphicsConfig", null);
        setField(term198171, term198171.getClass(), "bufferStrategy", null);
        setBooleanField(term198171, term198171.getClass(), "ignoreRepaint", false);
        setBooleanField(term198171, term198171.getClass(), "visible", false);
        setBooleanField(term198171, term198171.getClass(), "enabled", false);
        setBooleanField(term198171, term198171.getClass(), "valid", false);
        setField(term198171, term198171.getClass(), "dropTarget", null);
        setField(term198171, term198171.getClass(), "popups", null);
        setField(term198171, term198171.getClass(), "name", null);
        setBooleanField(term198171, term198171.getClass(), "nameExplicitlySet", false);
        setBooleanField(term198171, term198171.getClass(), "focusable", false);
        setIntField(term198171, term198171.getClass(), "isFocusTraversableOverridden", 0);
        setField(term198171, term198171.getClass(), "focusTraversalKeys", null);
        setBooleanField(term198171, term198171.getClass(), "focusTraversalKeysEnabled", false);
        setField(term198171, term198171.getClass(), "acc", null);
        setField(term198171, term198171.getClass(), "minSize", null);
        setBooleanField(term198171, term198171.getClass(), "minSizeSet", false);
        setField(term198171, term198171.getClass(), "prefSize", null);
        setBooleanField(term198171, term198171.getClass(), "prefSizeSet", false);
        setField(term198171, term198171.getClass(), "maxSize", null);
        setBooleanField(term198171, term198171.getClass(), "maxSizeSet", false);
        setField(term198171, term198171.getClass(), "componentOrientation", null);
        setBooleanField(term198171, term198171.getClass(), "newEventsOnly", false);
        setField(term198171, term198171.getClass(), "componentListener", null);
        setField(term198171, term198171.getClass(), "focusListener", null);
        setField(term198171, term198171.getClass(), "hierarchyListener", null);
        setField(term198171, term198171.getClass(), "hierarchyBoundsListener", null);
        setField(term198171, term198171.getClass(), "keyListener", null);
        setField(term198171, term198171.getClass(), "mouseListener", null);
        setField(term198171, term198171.getClass(), "mouseMotionListener", null);
        setField(term198171, term198171.getClass(), "mouseWheelListener", null);
        setField(term198171, term198171.getClass(), "inputMethodListener", null);
        setLongField(term198171, term198171.getClass(), "eventMask", 0L);
        setField(term198171, term198171.getClass(), "changeSupport", null);
        setField(term198171, term198171.getClass(), "objectLock", null);
        setBooleanField(term198171, term198171.getClass(), "isPacked", false);
        setIntField(term198171, term198171.getClass(), "boundsOp", 0);
        setField(term198171, term198171.getClass(), "compoundShape", null);
        setField(term198171, term198171.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term198171, term198171.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term198171, term198171.getClass(), "backgroundEraseDisabled", false);
        setField(term198171, term198171.getClass(), "eventCache", null);
        setBooleanField(term198171, term198171.getClass(), "coalescingEnabled", false);
        setBooleanField(term198171, term198171.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term198171, term198171.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "generateHomePage", argTypes, term198171, args);
    }

};


