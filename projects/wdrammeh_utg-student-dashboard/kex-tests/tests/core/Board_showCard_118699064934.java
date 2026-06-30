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
     Object term198485;

    public Board_showCard_118699064934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198485 = newInstance(Class.forName("core.Board"));
        setField(term198485, term198485.getClass(), "contentPanel", null);
        setField(term198485, term198485.getClass(), "bodyLayer", null);
        setField(term198485, term198485.getClass(), "cardLayout", null);
        setField(term198485, term198485.getClass(), "semesterActivity", null);
        setField(term198485, term198485.getClass(), "moduleActivity", null);
        setField(term198485, term198485.getClass(), "settingsUI", null);
        setField(term198485, term198485.getClass(), "transcriptActivity", null);
        setField(term198485, term198485.getClass(), "analysisActivity", null);
        setField(term198485, term198485.getClass(), "helpActivity", null);
        setField(term198485, term198485.getClass(), "about", null);
        setField(term198485, term198485.getClass(), "taskActivity", null);
        setField(term198485, term198485.getClass(), "newsPresent", null);
        setField(term198485, term198485.getClass(), "alertActivity", null);
        setIntField(term198485, term198485.getClass(), "defaultCloseOperation", 0);
        setField(term198485, term198485.getClass(), "transferHandler", null);
        setField(term198485, term198485.getClass(), "rootPane", null);
        setBooleanField(term198485, term198485.getClass(), "rootPaneCheckingEnabled", false);
        setField(term198485, term198485.getClass(), "accessibleContext", null);
        setField(term198485, term198485.getClass(), "maximizedBounds", null);
        setField(term198485, term198485.getClass(), "title", null);
        setField(term198485, term198485.getClass(), "menuBar", null);
        setBooleanField(term198485, term198485.getClass(), "resizable", false);
        setBooleanField(term198485, term198485.getClass(), "undecorated", false);
        setBooleanField(term198485, term198485.getClass(), "mbManagement", false);
        setIntField(term198485, term198485.getClass(), "state", 0);
        setField(term198485, term198485.getClass(), "ownedWindows", null);
        setIntField(term198485, term198485.getClass(), "frameSerializedDataVersion", 0);
        setField(term198485, term198485.getClass(), "warningString", null);
        setField(term198485, term198485.getClass(), "icons", null);
        setField(term198485, term198485.getClass(), "temporaryLostComponent", null);
        setBooleanField(term198485, term198485.getClass(), "syncLWRequests", false);
        setBooleanField(term198485, term198485.getClass(), "beforeFirstShow", false);
        setBooleanField(term198485, term198485.getClass(), "disposing", false);
        setField(term198485, term198485.getClass(), "disposerRecord", null);
        setBooleanField(term198485, term198485.getClass(), "alwaysOnTop", false);
        setField(term198485, term198485.getClass(), "ownedWindowList", null);
        setField(term198485, term198485.getClass(), "weakThis", null);
        setBooleanField(term198485, term198485.getClass(), "showWithParent", false);
        setField(term198485, term198485.getClass(), "modalBlocker", null);
        setField(term198485, term198485.getClass(), "modalExclusionType", null);
        setField(term198485, term198485.getClass(), "windowListener", null);
        setField(term198485, term198485.getClass(), "windowStateListener", null);
        setField(term198485, term198485.getClass(), "windowFocusListener", null);
        setField(term198485, term198485.getClass(), "inputContext", null);
        setField(term198485, term198485.getClass(), "inputContextLock", null);
        setField(term198485, term198485.getClass(), "focusMgr", null);
        setBooleanField(term198485, term198485.getClass(), "focusableWindowState", false);
        setBooleanField(term198485, term198485.getClass(), "autoRequestFocus", false);
        setBooleanField(term198485, term198485.getClass(), "isInShow", false);
        setFloatField(term198485, term198485.getClass(), "opacity", 0.0F);
        setField(term198485, term198485.getClass(), "shape", null);
        setBooleanField(term198485, term198485.getClass(), "isTrayIconWindow", false);
        setIntField(term198485, term198485.getClass(), "securityWarningWidth", 0);
        setIntField(term198485, term198485.getClass(), "securityWarningHeight", 0);
        setDoubleField(term198485, term198485.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term198485, term198485.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term198485, term198485.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term198485, term198485.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term198485, term198485.getClass(), "anchor", null);
        setField(term198485, term198485.getClass(), "type", null);
        setIntField(term198485, term198485.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term198485, term198485.getClass(), "locationByPlatform", false);
        setField(term198485, term198485.getClass(), "component", null);
        setField(term198485, term198485.getClass(), "layoutMgr", null);
        setField(term198485, term198485.getClass(), "dispatcher", null);
        setField(term198485, term198485.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term198485, term198485.getClass(), "focusCycleRoot", false);
        setBooleanField(term198485, term198485.getClass(), "focusTraversalPolicyProvider", false);
        setField(term198485, term198485.getClass(), "printingThreads", null);
        setBooleanField(term198485, term198485.getClass(), "printing", false);
        setField(term198485, term198485.getClass(), "containerListener", null);
        setIntField(term198485, term198485.getClass(), "listeningChildren", 0);
        setIntField(term198485, term198485.getClass(), "listeningBoundsChildren", 0);
        setIntField(term198485, term198485.getClass(), "descendantsCount", 0);
        setField(term198485, term198485.getClass(), "preserveBackgroundColor", null);
        setIntField(term198485, term198485.getClass(), "numOfHWComponents", 0);
        setIntField(term198485, term198485.getClass(), "numOfLWComponents", 0);
        setField(term198485, term198485.getClass(), "modalComp", null);
        setField(term198485, term198485.getClass(), "modalAppContext", null);
        setIntField(term198485, term198485.getClass(), "containerSerializedDataVersion", 0);
        setField(term198485, term198485.getClass(), "peer", null);
        setField(term198485, term198485.getClass(), "parent", null);
        setField(term198485, term198485.getClass(), "appContext", null);
        setIntField(term198485, term198485.getClass(), "x", 0);
        setIntField(term198485, term198485.getClass(), "y", 0);
        setIntField(term198485, term198485.getClass(), "width", 0);
        setIntField(term198485, term198485.getClass(), "height", 0);
        setField(term198485, term198485.getClass(), "foreground", null);
        setField(term198485, term198485.getClass(), "background", null);
        setField(term198485, term198485.getClass(), "font", null);
        setField(term198485, term198485.getClass(), "peerFont", null);
        setField(term198485, term198485.getClass(), "cursor", null);
        setField(term198485, term198485.getClass(), "locale", null);
        setField(term198485, term198485.getClass(), "graphicsConfig", null);
        setField(term198485, term198485.getClass(), "bufferStrategy", null);
        setBooleanField(term198485, term198485.getClass(), "ignoreRepaint", false);
        setBooleanField(term198485, term198485.getClass(), "visible", false);
        setBooleanField(term198485, term198485.getClass(), "enabled", false);
        setBooleanField(term198485, term198485.getClass(), "valid", false);
        setField(term198485, term198485.getClass(), "dropTarget", null);
        setField(term198485, term198485.getClass(), "popups", null);
        setField(term198485, term198485.getClass(), "name", null);
        setBooleanField(term198485, term198485.getClass(), "nameExplicitlySet", false);
        setBooleanField(term198485, term198485.getClass(), "focusable", false);
        setIntField(term198485, term198485.getClass(), "isFocusTraversableOverridden", 0);
        setField(term198485, term198485.getClass(), "focusTraversalKeys", null);
        setBooleanField(term198485, term198485.getClass(), "focusTraversalKeysEnabled", false);
        setField(term198485, term198485.getClass(), "acc", null);
        setField(term198485, term198485.getClass(), "minSize", null);
        setBooleanField(term198485, term198485.getClass(), "minSizeSet", false);
        setField(term198485, term198485.getClass(), "prefSize", null);
        setBooleanField(term198485, term198485.getClass(), "prefSizeSet", false);
        setField(term198485, term198485.getClass(), "maxSize", null);
        setBooleanField(term198485, term198485.getClass(), "maxSizeSet", false);
        setField(term198485, term198485.getClass(), "componentOrientation", null);
        setBooleanField(term198485, term198485.getClass(), "newEventsOnly", false);
        setField(term198485, term198485.getClass(), "componentListener", null);
        setField(term198485, term198485.getClass(), "focusListener", null);
        setField(term198485, term198485.getClass(), "hierarchyListener", null);
        setField(term198485, term198485.getClass(), "hierarchyBoundsListener", null);
        setField(term198485, term198485.getClass(), "keyListener", null);
        setField(term198485, term198485.getClass(), "mouseListener", null);
        setField(term198485, term198485.getClass(), "mouseMotionListener", null);
        setField(term198485, term198485.getClass(), "mouseWheelListener", null);
        setField(term198485, term198485.getClass(), "inputMethodListener", null);
        setLongField(term198485, term198485.getClass(), "eventMask", 0L);
        setField(term198485, term198485.getClass(), "changeSupport", null);
        setField(term198485, term198485.getClass(), "objectLock", null);
        setBooleanField(term198485, term198485.getClass(), "isPacked", false);
        setIntField(term198485, term198485.getClass(), "boundsOp", 0);
        setField(term198485, term198485.getClass(), "compoundShape", null);
        setField(term198485, term198485.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term198485, term198485.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term198485, term198485.getClass(), "backgroundEraseDisabled", false);
        setField(term198485, term198485.getClass(), "eventCache", null);
        setBooleanField(term198485, term198485.getClass(), "coalescingEnabled", false);
        setBooleanField(term198485, term198485.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term198485, term198485.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "showCard", argTypes, term198485, args);
    }

};


