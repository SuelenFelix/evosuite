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
import java.lang.Integer;

public class Board_newHomePanel_189412001432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198347;
     Object term198407;
     Object term198409;

    public Board_newHomePanel_189412001432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198347 = newInstance(Class.forName("core.Board"));
        setField(term198347, term198347.getClass(), "contentPanel", null);
        setField(term198347, term198347.getClass(), "bodyLayer", null);
        setField(term198347, term198347.getClass(), "cardLayout", null);
        setField(term198347, term198347.getClass(), "semesterActivity", null);
        setField(term198347, term198347.getClass(), "moduleActivity", null);
        setField(term198347, term198347.getClass(), "settingsUI", null);
        setField(term198347, term198347.getClass(), "transcriptActivity", null);
        setField(term198347, term198347.getClass(), "analysisActivity", null);
        setField(term198347, term198347.getClass(), "helpActivity", null);
        setField(term198347, term198347.getClass(), "about", null);
        setField(term198347, term198347.getClass(), "taskActivity", null);
        setField(term198347, term198347.getClass(), "newsPresent", null);
        setField(term198347, term198347.getClass(), "alertActivity", null);
        setIntField(term198347, term198347.getClass(), "defaultCloseOperation", 0);
        setField(term198347, term198347.getClass(), "transferHandler", null);
        setField(term198347, term198347.getClass(), "rootPane", null);
        setBooleanField(term198347, term198347.getClass(), "rootPaneCheckingEnabled", false);
        setField(term198347, term198347.getClass(), "accessibleContext", null);
        setField(term198347, term198347.getClass(), "maximizedBounds", null);
        setField(term198347, term198347.getClass(), "title", null);
        setField(term198347, term198347.getClass(), "menuBar", null);
        setBooleanField(term198347, term198347.getClass(), "resizable", false);
        setBooleanField(term198347, term198347.getClass(), "undecorated", false);
        setBooleanField(term198347, term198347.getClass(), "mbManagement", false);
        setIntField(term198347, term198347.getClass(), "state", 0);
        setField(term198347, term198347.getClass(), "ownedWindows", null);
        setIntField(term198347, term198347.getClass(), "frameSerializedDataVersion", 0);
        setField(term198347, term198347.getClass(), "warningString", null);
        setField(term198347, term198347.getClass(), "icons", null);
        setField(term198347, term198347.getClass(), "temporaryLostComponent", null);
        setBooleanField(term198347, term198347.getClass(), "syncLWRequests", false);
        setBooleanField(term198347, term198347.getClass(), "beforeFirstShow", false);
        setBooleanField(term198347, term198347.getClass(), "disposing", false);
        setField(term198347, term198347.getClass(), "disposerRecord", null);
        setBooleanField(term198347, term198347.getClass(), "alwaysOnTop", false);
        setField(term198347, term198347.getClass(), "ownedWindowList", null);
        setField(term198347, term198347.getClass(), "weakThis", null);
        setBooleanField(term198347, term198347.getClass(), "showWithParent", false);
        setField(term198347, term198347.getClass(), "modalBlocker", null);
        setField(term198347, term198347.getClass(), "modalExclusionType", null);
        setField(term198347, term198347.getClass(), "windowListener", null);
        setField(term198347, term198347.getClass(), "windowStateListener", null);
        setField(term198347, term198347.getClass(), "windowFocusListener", null);
        setField(term198347, term198347.getClass(), "inputContext", null);
        setField(term198347, term198347.getClass(), "inputContextLock", null);
        setField(term198347, term198347.getClass(), "focusMgr", null);
        setBooleanField(term198347, term198347.getClass(), "focusableWindowState", false);
        setBooleanField(term198347, term198347.getClass(), "autoRequestFocus", false);
        setBooleanField(term198347, term198347.getClass(), "isInShow", false);
        setFloatField(term198347, term198347.getClass(), "opacity", 0.0F);
        setField(term198347, term198347.getClass(), "shape", null);
        setBooleanField(term198347, term198347.getClass(), "isTrayIconWindow", false);
        setIntField(term198347, term198347.getClass(), "securityWarningWidth", 0);
        setIntField(term198347, term198347.getClass(), "securityWarningHeight", 0);
        setDoubleField(term198347, term198347.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term198347, term198347.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term198347, term198347.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term198347, term198347.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term198347, term198347.getClass(), "anchor", null);
        setField(term198347, term198347.getClass(), "type", null);
        setIntField(term198347, term198347.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term198347, term198347.getClass(), "locationByPlatform", false);
        setField(term198347, term198347.getClass(), "component", null);
        setField(term198347, term198347.getClass(), "layoutMgr", null);
        setField(term198347, term198347.getClass(), "dispatcher", null);
        setField(term198347, term198347.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term198347, term198347.getClass(), "focusCycleRoot", false);
        setBooleanField(term198347, term198347.getClass(), "focusTraversalPolicyProvider", false);
        setField(term198347, term198347.getClass(), "printingThreads", null);
        setBooleanField(term198347, term198347.getClass(), "printing", false);
        setField(term198347, term198347.getClass(), "containerListener", null);
        setIntField(term198347, term198347.getClass(), "listeningChildren", 0);
        setIntField(term198347, term198347.getClass(), "listeningBoundsChildren", 0);
        setIntField(term198347, term198347.getClass(), "descendantsCount", 0);
        setField(term198347, term198347.getClass(), "preserveBackgroundColor", null);
        setIntField(term198347, term198347.getClass(), "numOfHWComponents", 0);
        setIntField(term198347, term198347.getClass(), "numOfLWComponents", 0);
        setField(term198347, term198347.getClass(), "modalComp", null);
        setField(term198347, term198347.getClass(), "modalAppContext", null);
        setIntField(term198347, term198347.getClass(), "containerSerializedDataVersion", 0);
        setField(term198347, term198347.getClass(), "peer", null);
        setField(term198347, term198347.getClass(), "parent", null);
        setField(term198347, term198347.getClass(), "appContext", null);
        setIntField(term198347, term198347.getClass(), "x", 0);
        setIntField(term198347, term198347.getClass(), "y", 0);
        setIntField(term198347, term198347.getClass(), "width", 0);
        setIntField(term198347, term198347.getClass(), "height", 0);
        setField(term198347, term198347.getClass(), "foreground", null);
        setField(term198347, term198347.getClass(), "background", null);
        setField(term198347, term198347.getClass(), "font", null);
        setField(term198347, term198347.getClass(), "peerFont", null);
        setField(term198347, term198347.getClass(), "cursor", null);
        setField(term198347, term198347.getClass(), "locale", null);
        setField(term198347, term198347.getClass(), "graphicsConfig", null);
        setField(term198347, term198347.getClass(), "bufferStrategy", null);
        setBooleanField(term198347, term198347.getClass(), "ignoreRepaint", false);
        setBooleanField(term198347, term198347.getClass(), "visible", false);
        setBooleanField(term198347, term198347.getClass(), "enabled", false);
        setBooleanField(term198347, term198347.getClass(), "valid", false);
        setField(term198347, term198347.getClass(), "dropTarget", null);
        setField(term198347, term198347.getClass(), "popups", null);
        setField(term198347, term198347.getClass(), "name", null);
        setBooleanField(term198347, term198347.getClass(), "nameExplicitlySet", false);
        setBooleanField(term198347, term198347.getClass(), "focusable", false);
        setIntField(term198347, term198347.getClass(), "isFocusTraversableOverridden", 0);
        setField(term198347, term198347.getClass(), "focusTraversalKeys", null);
        setBooleanField(term198347, term198347.getClass(), "focusTraversalKeysEnabled", false);
        setField(term198347, term198347.getClass(), "acc", null);
        setField(term198347, term198347.getClass(), "minSize", null);
        setBooleanField(term198347, term198347.getClass(), "minSizeSet", false);
        setField(term198347, term198347.getClass(), "prefSize", null);
        setBooleanField(term198347, term198347.getClass(), "prefSizeSet", false);
        setField(term198347, term198347.getClass(), "maxSize", null);
        setBooleanField(term198347, term198347.getClass(), "maxSizeSet", false);
        setField(term198347, term198347.getClass(), "componentOrientation", null);
        setBooleanField(term198347, term198347.getClass(), "newEventsOnly", false);
        setField(term198347, term198347.getClass(), "componentListener", null);
        setField(term198347, term198347.getClass(), "focusListener", null);
        setField(term198347, term198347.getClass(), "hierarchyListener", null);
        setField(term198347, term198347.getClass(), "hierarchyBoundsListener", null);
        setField(term198347, term198347.getClass(), "keyListener", null);
        setField(term198347, term198347.getClass(), "mouseListener", null);
        setField(term198347, term198347.getClass(), "mouseMotionListener", null);
        setField(term198347, term198347.getClass(), "mouseWheelListener", null);
        setField(term198347, term198347.getClass(), "inputMethodListener", null);
        setLongField(term198347, term198347.getClass(), "eventMask", 0L);
        setField(term198347, term198347.getClass(), "changeSupport", null);
        setField(term198347, term198347.getClass(), "objectLock", null);
        setBooleanField(term198347, term198347.getClass(), "isPacked", false);
        setIntField(term198347, term198347.getClass(), "boundsOp", 0);
        setField(term198347, term198347.getClass(), "compoundShape", null);
        setField(term198347, term198347.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term198347, term198347.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term198347, term198347.getClass(), "backgroundEraseDisabled", false);
        setField(term198347, term198347.getClass(), "eventCache", null);
        setBooleanField(term198347, term198347.getClass(), "coalescingEnabled", false);
        setBooleanField(term198347, term198347.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term198347, term198347.getClass(), "componentSerializedDataVersion", 0);
        term198407 = new Integer(0);
        term198409 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term198407;
        args[3] = term198409;
        callMethod(klass, "newHomePanel", argTypes, term198347, args);
    }

};


