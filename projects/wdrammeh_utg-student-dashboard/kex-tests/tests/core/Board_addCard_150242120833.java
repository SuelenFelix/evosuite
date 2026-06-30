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
     Object term198425;

    public Board_addCard_150242120833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198425 = newInstance(Class.forName("core.Board"));
        setField(term198425, term198425.getClass(), "contentPanel", null);
        setField(term198425, term198425.getClass(), "bodyLayer", null);
        setField(term198425, term198425.getClass(), "cardLayout", null);
        setField(term198425, term198425.getClass(), "semesterActivity", null);
        setField(term198425, term198425.getClass(), "moduleActivity", null);
        setField(term198425, term198425.getClass(), "settingsUI", null);
        setField(term198425, term198425.getClass(), "transcriptActivity", null);
        setField(term198425, term198425.getClass(), "analysisActivity", null);
        setField(term198425, term198425.getClass(), "helpActivity", null);
        setField(term198425, term198425.getClass(), "about", null);
        setField(term198425, term198425.getClass(), "taskActivity", null);
        setField(term198425, term198425.getClass(), "newsPresent", null);
        setField(term198425, term198425.getClass(), "alertActivity", null);
        setIntField(term198425, term198425.getClass(), "defaultCloseOperation", 0);
        setField(term198425, term198425.getClass(), "transferHandler", null);
        setField(term198425, term198425.getClass(), "rootPane", null);
        setBooleanField(term198425, term198425.getClass(), "rootPaneCheckingEnabled", false);
        setField(term198425, term198425.getClass(), "accessibleContext", null);
        setField(term198425, term198425.getClass(), "maximizedBounds", null);
        setField(term198425, term198425.getClass(), "title", null);
        setField(term198425, term198425.getClass(), "menuBar", null);
        setBooleanField(term198425, term198425.getClass(), "resizable", false);
        setBooleanField(term198425, term198425.getClass(), "undecorated", false);
        setBooleanField(term198425, term198425.getClass(), "mbManagement", false);
        setIntField(term198425, term198425.getClass(), "state", 0);
        setField(term198425, term198425.getClass(), "ownedWindows", null);
        setIntField(term198425, term198425.getClass(), "frameSerializedDataVersion", 0);
        setField(term198425, term198425.getClass(), "warningString", null);
        setField(term198425, term198425.getClass(), "icons", null);
        setField(term198425, term198425.getClass(), "temporaryLostComponent", null);
        setBooleanField(term198425, term198425.getClass(), "syncLWRequests", false);
        setBooleanField(term198425, term198425.getClass(), "beforeFirstShow", false);
        setBooleanField(term198425, term198425.getClass(), "disposing", false);
        setField(term198425, term198425.getClass(), "disposerRecord", null);
        setBooleanField(term198425, term198425.getClass(), "alwaysOnTop", false);
        setField(term198425, term198425.getClass(), "ownedWindowList", null);
        setField(term198425, term198425.getClass(), "weakThis", null);
        setBooleanField(term198425, term198425.getClass(), "showWithParent", false);
        setField(term198425, term198425.getClass(), "modalBlocker", null);
        setField(term198425, term198425.getClass(), "modalExclusionType", null);
        setField(term198425, term198425.getClass(), "windowListener", null);
        setField(term198425, term198425.getClass(), "windowStateListener", null);
        setField(term198425, term198425.getClass(), "windowFocusListener", null);
        setField(term198425, term198425.getClass(), "inputContext", null);
        setField(term198425, term198425.getClass(), "inputContextLock", null);
        setField(term198425, term198425.getClass(), "focusMgr", null);
        setBooleanField(term198425, term198425.getClass(), "focusableWindowState", false);
        setBooleanField(term198425, term198425.getClass(), "autoRequestFocus", false);
        setBooleanField(term198425, term198425.getClass(), "isInShow", false);
        setFloatField(term198425, term198425.getClass(), "opacity", 0.0F);
        setField(term198425, term198425.getClass(), "shape", null);
        setBooleanField(term198425, term198425.getClass(), "isTrayIconWindow", false);
        setIntField(term198425, term198425.getClass(), "securityWarningWidth", 0);
        setIntField(term198425, term198425.getClass(), "securityWarningHeight", 0);
        setDoubleField(term198425, term198425.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term198425, term198425.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term198425, term198425.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term198425, term198425.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term198425, term198425.getClass(), "anchor", null);
        setField(term198425, term198425.getClass(), "type", null);
        setIntField(term198425, term198425.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term198425, term198425.getClass(), "locationByPlatform", false);
        setField(term198425, term198425.getClass(), "component", null);
        setField(term198425, term198425.getClass(), "layoutMgr", null);
        setField(term198425, term198425.getClass(), "dispatcher", null);
        setField(term198425, term198425.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term198425, term198425.getClass(), "focusCycleRoot", false);
        setBooleanField(term198425, term198425.getClass(), "focusTraversalPolicyProvider", false);
        setField(term198425, term198425.getClass(), "printingThreads", null);
        setBooleanField(term198425, term198425.getClass(), "printing", false);
        setField(term198425, term198425.getClass(), "containerListener", null);
        setIntField(term198425, term198425.getClass(), "listeningChildren", 0);
        setIntField(term198425, term198425.getClass(), "listeningBoundsChildren", 0);
        setIntField(term198425, term198425.getClass(), "descendantsCount", 0);
        setField(term198425, term198425.getClass(), "preserveBackgroundColor", null);
        setIntField(term198425, term198425.getClass(), "numOfHWComponents", 0);
        setIntField(term198425, term198425.getClass(), "numOfLWComponents", 0);
        setField(term198425, term198425.getClass(), "modalComp", null);
        setField(term198425, term198425.getClass(), "modalAppContext", null);
        setIntField(term198425, term198425.getClass(), "containerSerializedDataVersion", 0);
        setField(term198425, term198425.getClass(), "peer", null);
        setField(term198425, term198425.getClass(), "parent", null);
        setField(term198425, term198425.getClass(), "appContext", null);
        setIntField(term198425, term198425.getClass(), "x", 0);
        setIntField(term198425, term198425.getClass(), "y", 0);
        setIntField(term198425, term198425.getClass(), "width", 0);
        setIntField(term198425, term198425.getClass(), "height", 0);
        setField(term198425, term198425.getClass(), "foreground", null);
        setField(term198425, term198425.getClass(), "background", null);
        setField(term198425, term198425.getClass(), "font", null);
        setField(term198425, term198425.getClass(), "peerFont", null);
        setField(term198425, term198425.getClass(), "cursor", null);
        setField(term198425, term198425.getClass(), "locale", null);
        setField(term198425, term198425.getClass(), "graphicsConfig", null);
        setField(term198425, term198425.getClass(), "bufferStrategy", null);
        setBooleanField(term198425, term198425.getClass(), "ignoreRepaint", false);
        setBooleanField(term198425, term198425.getClass(), "visible", false);
        setBooleanField(term198425, term198425.getClass(), "enabled", false);
        setBooleanField(term198425, term198425.getClass(), "valid", false);
        setField(term198425, term198425.getClass(), "dropTarget", null);
        setField(term198425, term198425.getClass(), "popups", null);
        setField(term198425, term198425.getClass(), "name", null);
        setBooleanField(term198425, term198425.getClass(), "nameExplicitlySet", false);
        setBooleanField(term198425, term198425.getClass(), "focusable", false);
        setIntField(term198425, term198425.getClass(), "isFocusTraversableOverridden", 0);
        setField(term198425, term198425.getClass(), "focusTraversalKeys", null);
        setBooleanField(term198425, term198425.getClass(), "focusTraversalKeysEnabled", false);
        setField(term198425, term198425.getClass(), "acc", null);
        setField(term198425, term198425.getClass(), "minSize", null);
        setBooleanField(term198425, term198425.getClass(), "minSizeSet", false);
        setField(term198425, term198425.getClass(), "prefSize", null);
        setBooleanField(term198425, term198425.getClass(), "prefSizeSet", false);
        setField(term198425, term198425.getClass(), "maxSize", null);
        setBooleanField(term198425, term198425.getClass(), "maxSizeSet", false);
        setField(term198425, term198425.getClass(), "componentOrientation", null);
        setBooleanField(term198425, term198425.getClass(), "newEventsOnly", false);
        setField(term198425, term198425.getClass(), "componentListener", null);
        setField(term198425, term198425.getClass(), "focusListener", null);
        setField(term198425, term198425.getClass(), "hierarchyListener", null);
        setField(term198425, term198425.getClass(), "hierarchyBoundsListener", null);
        setField(term198425, term198425.getClass(), "keyListener", null);
        setField(term198425, term198425.getClass(), "mouseListener", null);
        setField(term198425, term198425.getClass(), "mouseMotionListener", null);
        setField(term198425, term198425.getClass(), "mouseWheelListener", null);
        setField(term198425, term198425.getClass(), "inputMethodListener", null);
        setLongField(term198425, term198425.getClass(), "eventMask", 0L);
        setField(term198425, term198425.getClass(), "changeSupport", null);
        setField(term198425, term198425.getClass(), "objectLock", null);
        setBooleanField(term198425, term198425.getClass(), "isPacked", false);
        setIntField(term198425, term198425.getClass(), "boundsOp", 0);
        setField(term198425, term198425.getClass(), "compoundShape", null);
        setField(term198425, term198425.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term198425, term198425.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term198425, term198425.getClass(), "backgroundEraseDisabled", false);
        setField(term198425, term198425.getClass(), "eventCache", null);
        setBooleanField(term198425, term198425.getClass(), "coalescingEnabled", false);
        setBooleanField(term198425, term198425.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term198425, term198425.getClass(), "componentSerializedDataVersion", 0);
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
        callMethod(klass, "addCard", argTypes, term198425, args);
    }

};


