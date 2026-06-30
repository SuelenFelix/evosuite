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
     Object term198185;

    public Board_generateHomePage_146785184916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198185 = newInstance(Class.forName("core.Board"));
        setField(term198185, term198185.getClass(), "contentPanel", null);
        setField(term198185, term198185.getClass(), "bodyLayer", null);
        setField(term198185, term198185.getClass(), "cardLayout", null);
        setField(term198185, term198185.getClass(), "semesterActivity", null);
        setField(term198185, term198185.getClass(), "moduleActivity", null);
        setField(term198185, term198185.getClass(), "settingsUI", null);
        setField(term198185, term198185.getClass(), "transcriptActivity", null);
        setField(term198185, term198185.getClass(), "analysisActivity", null);
        setField(term198185, term198185.getClass(), "helpActivity", null);
        setField(term198185, term198185.getClass(), "about", null);
        setField(term198185, term198185.getClass(), "taskActivity", null);
        setField(term198185, term198185.getClass(), "newsPresent", null);
        setField(term198185, term198185.getClass(), "alertActivity", null);
        setIntField(term198185, term198185.getClass(), "defaultCloseOperation", 0);
        setField(term198185, term198185.getClass(), "transferHandler", null);
        setField(term198185, term198185.getClass(), "rootPane", null);
        setBooleanField(term198185, term198185.getClass(), "rootPaneCheckingEnabled", false);
        setField(term198185, term198185.getClass(), "accessibleContext", null);
        setField(term198185, term198185.getClass(), "maximizedBounds", null);
        setField(term198185, term198185.getClass(), "title", null);
        setField(term198185, term198185.getClass(), "menuBar", null);
        setBooleanField(term198185, term198185.getClass(), "resizable", false);
        setBooleanField(term198185, term198185.getClass(), "undecorated", false);
        setBooleanField(term198185, term198185.getClass(), "mbManagement", false);
        setIntField(term198185, term198185.getClass(), "state", 0);
        setField(term198185, term198185.getClass(), "ownedWindows", null);
        setIntField(term198185, term198185.getClass(), "frameSerializedDataVersion", 0);
        setField(term198185, term198185.getClass(), "warningString", null);
        setField(term198185, term198185.getClass(), "icons", null);
        setField(term198185, term198185.getClass(), "temporaryLostComponent", null);
        setBooleanField(term198185, term198185.getClass(), "syncLWRequests", false);
        setBooleanField(term198185, term198185.getClass(), "beforeFirstShow", false);
        setBooleanField(term198185, term198185.getClass(), "disposing", false);
        setField(term198185, term198185.getClass(), "disposerRecord", null);
        setBooleanField(term198185, term198185.getClass(), "alwaysOnTop", false);
        setField(term198185, term198185.getClass(), "ownedWindowList", null);
        setField(term198185, term198185.getClass(), "weakThis", null);
        setBooleanField(term198185, term198185.getClass(), "showWithParent", false);
        setField(term198185, term198185.getClass(), "modalBlocker", null);
        setField(term198185, term198185.getClass(), "modalExclusionType", null);
        setField(term198185, term198185.getClass(), "windowListener", null);
        setField(term198185, term198185.getClass(), "windowStateListener", null);
        setField(term198185, term198185.getClass(), "windowFocusListener", null);
        setField(term198185, term198185.getClass(), "inputContext", null);
        setField(term198185, term198185.getClass(), "inputContextLock", null);
        setField(term198185, term198185.getClass(), "focusMgr", null);
        setBooleanField(term198185, term198185.getClass(), "focusableWindowState", false);
        setBooleanField(term198185, term198185.getClass(), "autoRequestFocus", false);
        setBooleanField(term198185, term198185.getClass(), "isInShow", false);
        setFloatField(term198185, term198185.getClass(), "opacity", 0.0F);
        setField(term198185, term198185.getClass(), "shape", null);
        setBooleanField(term198185, term198185.getClass(), "isTrayIconWindow", false);
        setIntField(term198185, term198185.getClass(), "securityWarningWidth", 0);
        setIntField(term198185, term198185.getClass(), "securityWarningHeight", 0);
        setDoubleField(term198185, term198185.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term198185, term198185.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term198185, term198185.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term198185, term198185.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term198185, term198185.getClass(), "anchor", null);
        setField(term198185, term198185.getClass(), "type", null);
        setIntField(term198185, term198185.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term198185, term198185.getClass(), "locationByPlatform", false);
        setField(term198185, term198185.getClass(), "component", null);
        setField(term198185, term198185.getClass(), "layoutMgr", null);
        setField(term198185, term198185.getClass(), "dispatcher", null);
        setField(term198185, term198185.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term198185, term198185.getClass(), "focusCycleRoot", false);
        setBooleanField(term198185, term198185.getClass(), "focusTraversalPolicyProvider", false);
        setField(term198185, term198185.getClass(), "printingThreads", null);
        setBooleanField(term198185, term198185.getClass(), "printing", false);
        setField(term198185, term198185.getClass(), "containerListener", null);
        setIntField(term198185, term198185.getClass(), "listeningChildren", 0);
        setIntField(term198185, term198185.getClass(), "listeningBoundsChildren", 0);
        setIntField(term198185, term198185.getClass(), "descendantsCount", 0);
        setField(term198185, term198185.getClass(), "preserveBackgroundColor", null);
        setIntField(term198185, term198185.getClass(), "numOfHWComponents", 0);
        setIntField(term198185, term198185.getClass(), "numOfLWComponents", 0);
        setField(term198185, term198185.getClass(), "modalComp", null);
        setField(term198185, term198185.getClass(), "modalAppContext", null);
        setIntField(term198185, term198185.getClass(), "containerSerializedDataVersion", 0);
        setField(term198185, term198185.getClass(), "peer", null);
        setField(term198185, term198185.getClass(), "parent", null);
        setField(term198185, term198185.getClass(), "appContext", null);
        setIntField(term198185, term198185.getClass(), "x", 0);
        setIntField(term198185, term198185.getClass(), "y", 0);
        setIntField(term198185, term198185.getClass(), "width", 0);
        setIntField(term198185, term198185.getClass(), "height", 0);
        setField(term198185, term198185.getClass(), "foreground", null);
        setField(term198185, term198185.getClass(), "background", null);
        setField(term198185, term198185.getClass(), "font", null);
        setField(term198185, term198185.getClass(), "peerFont", null);
        setField(term198185, term198185.getClass(), "cursor", null);
        setField(term198185, term198185.getClass(), "locale", null);
        setField(term198185, term198185.getClass(), "graphicsConfig", null);
        setField(term198185, term198185.getClass(), "bufferStrategy", null);
        setBooleanField(term198185, term198185.getClass(), "ignoreRepaint", false);
        setBooleanField(term198185, term198185.getClass(), "visible", false);
        setBooleanField(term198185, term198185.getClass(), "enabled", false);
        setBooleanField(term198185, term198185.getClass(), "valid", false);
        setField(term198185, term198185.getClass(), "dropTarget", null);
        setField(term198185, term198185.getClass(), "popups", null);
        setField(term198185, term198185.getClass(), "name", null);
        setBooleanField(term198185, term198185.getClass(), "nameExplicitlySet", false);
        setBooleanField(term198185, term198185.getClass(), "focusable", false);
        setIntField(term198185, term198185.getClass(), "isFocusTraversableOverridden", 0);
        setField(term198185, term198185.getClass(), "focusTraversalKeys", null);
        setBooleanField(term198185, term198185.getClass(), "focusTraversalKeysEnabled", false);
        setField(term198185, term198185.getClass(), "acc", null);
        setField(term198185, term198185.getClass(), "minSize", null);
        setBooleanField(term198185, term198185.getClass(), "minSizeSet", false);
        setField(term198185, term198185.getClass(), "prefSize", null);
        setBooleanField(term198185, term198185.getClass(), "prefSizeSet", false);
        setField(term198185, term198185.getClass(), "maxSize", null);
        setBooleanField(term198185, term198185.getClass(), "maxSizeSet", false);
        setField(term198185, term198185.getClass(), "componentOrientation", null);
        setBooleanField(term198185, term198185.getClass(), "newEventsOnly", false);
        setField(term198185, term198185.getClass(), "componentListener", null);
        setField(term198185, term198185.getClass(), "focusListener", null);
        setField(term198185, term198185.getClass(), "hierarchyListener", null);
        setField(term198185, term198185.getClass(), "hierarchyBoundsListener", null);
        setField(term198185, term198185.getClass(), "keyListener", null);
        setField(term198185, term198185.getClass(), "mouseListener", null);
        setField(term198185, term198185.getClass(), "mouseMotionListener", null);
        setField(term198185, term198185.getClass(), "mouseWheelListener", null);
        setField(term198185, term198185.getClass(), "inputMethodListener", null);
        setLongField(term198185, term198185.getClass(), "eventMask", 0L);
        setField(term198185, term198185.getClass(), "changeSupport", null);
        setField(term198185, term198185.getClass(), "objectLock", null);
        setBooleanField(term198185, term198185.getClass(), "isPacked", false);
        setIntField(term198185, term198185.getClass(), "boundsOp", 0);
        setField(term198185, term198185.getClass(), "compoundShape", null);
        setField(term198185, term198185.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term198185, term198185.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term198185, term198185.getClass(), "backgroundEraseDisabled", false);
        setField(term198185, term198185.getClass(), "eventCache", null);
        setBooleanField(term198185, term198185.getClass(), "coalescingEnabled", false);
        setBooleanField(term198185, term198185.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term198185, term198185.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "generateHomePage", argTypes, term198185, args);
    }

};


