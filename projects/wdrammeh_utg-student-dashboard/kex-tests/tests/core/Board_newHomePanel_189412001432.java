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
     Object term198361;
     Object term198421;
     Object term198423;

    public Board_newHomePanel_189412001432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198361 = newInstance(Class.forName("core.Board"));
        setField(term198361, term198361.getClass(), "contentPanel", null);
        setField(term198361, term198361.getClass(), "bodyLayer", null);
        setField(term198361, term198361.getClass(), "cardLayout", null);
        setField(term198361, term198361.getClass(), "semesterActivity", null);
        setField(term198361, term198361.getClass(), "moduleActivity", null);
        setField(term198361, term198361.getClass(), "settingsUI", null);
        setField(term198361, term198361.getClass(), "transcriptActivity", null);
        setField(term198361, term198361.getClass(), "analysisActivity", null);
        setField(term198361, term198361.getClass(), "helpActivity", null);
        setField(term198361, term198361.getClass(), "about", null);
        setField(term198361, term198361.getClass(), "taskActivity", null);
        setField(term198361, term198361.getClass(), "newsPresent", null);
        setField(term198361, term198361.getClass(), "alertActivity", null);
        setIntField(term198361, term198361.getClass(), "defaultCloseOperation", 0);
        setField(term198361, term198361.getClass(), "transferHandler", null);
        setField(term198361, term198361.getClass(), "rootPane", null);
        setBooleanField(term198361, term198361.getClass(), "rootPaneCheckingEnabled", false);
        setField(term198361, term198361.getClass(), "accessibleContext", null);
        setField(term198361, term198361.getClass(), "maximizedBounds", null);
        setField(term198361, term198361.getClass(), "title", null);
        setField(term198361, term198361.getClass(), "menuBar", null);
        setBooleanField(term198361, term198361.getClass(), "resizable", false);
        setBooleanField(term198361, term198361.getClass(), "undecorated", false);
        setBooleanField(term198361, term198361.getClass(), "mbManagement", false);
        setIntField(term198361, term198361.getClass(), "state", 0);
        setField(term198361, term198361.getClass(), "ownedWindows", null);
        setIntField(term198361, term198361.getClass(), "frameSerializedDataVersion", 0);
        setField(term198361, term198361.getClass(), "warningString", null);
        setField(term198361, term198361.getClass(), "icons", null);
        setField(term198361, term198361.getClass(), "temporaryLostComponent", null);
        setBooleanField(term198361, term198361.getClass(), "syncLWRequests", false);
        setBooleanField(term198361, term198361.getClass(), "beforeFirstShow", false);
        setBooleanField(term198361, term198361.getClass(), "disposing", false);
        setField(term198361, term198361.getClass(), "disposerRecord", null);
        setBooleanField(term198361, term198361.getClass(), "alwaysOnTop", false);
        setField(term198361, term198361.getClass(), "ownedWindowList", null);
        setField(term198361, term198361.getClass(), "weakThis", null);
        setBooleanField(term198361, term198361.getClass(), "showWithParent", false);
        setField(term198361, term198361.getClass(), "modalBlocker", null);
        setField(term198361, term198361.getClass(), "modalExclusionType", null);
        setField(term198361, term198361.getClass(), "windowListener", null);
        setField(term198361, term198361.getClass(), "windowStateListener", null);
        setField(term198361, term198361.getClass(), "windowFocusListener", null);
        setField(term198361, term198361.getClass(), "inputContext", null);
        setField(term198361, term198361.getClass(), "inputContextLock", null);
        setField(term198361, term198361.getClass(), "focusMgr", null);
        setBooleanField(term198361, term198361.getClass(), "focusableWindowState", false);
        setBooleanField(term198361, term198361.getClass(), "autoRequestFocus", false);
        setBooleanField(term198361, term198361.getClass(), "isInShow", false);
        setFloatField(term198361, term198361.getClass(), "opacity", 0.0F);
        setField(term198361, term198361.getClass(), "shape", null);
        setBooleanField(term198361, term198361.getClass(), "isTrayIconWindow", false);
        setIntField(term198361, term198361.getClass(), "securityWarningWidth", 0);
        setIntField(term198361, term198361.getClass(), "securityWarningHeight", 0);
        setDoubleField(term198361, term198361.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term198361, term198361.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term198361, term198361.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term198361, term198361.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term198361, term198361.getClass(), "anchor", null);
        setField(term198361, term198361.getClass(), "type", null);
        setIntField(term198361, term198361.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term198361, term198361.getClass(), "locationByPlatform", false);
        setField(term198361, term198361.getClass(), "component", null);
        setField(term198361, term198361.getClass(), "layoutMgr", null);
        setField(term198361, term198361.getClass(), "dispatcher", null);
        setField(term198361, term198361.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term198361, term198361.getClass(), "focusCycleRoot", false);
        setBooleanField(term198361, term198361.getClass(), "focusTraversalPolicyProvider", false);
        setField(term198361, term198361.getClass(), "printingThreads", null);
        setBooleanField(term198361, term198361.getClass(), "printing", false);
        setField(term198361, term198361.getClass(), "containerListener", null);
        setIntField(term198361, term198361.getClass(), "listeningChildren", 0);
        setIntField(term198361, term198361.getClass(), "listeningBoundsChildren", 0);
        setIntField(term198361, term198361.getClass(), "descendantsCount", 0);
        setField(term198361, term198361.getClass(), "preserveBackgroundColor", null);
        setIntField(term198361, term198361.getClass(), "numOfHWComponents", 0);
        setIntField(term198361, term198361.getClass(), "numOfLWComponents", 0);
        setField(term198361, term198361.getClass(), "modalComp", null);
        setField(term198361, term198361.getClass(), "modalAppContext", null);
        setIntField(term198361, term198361.getClass(), "containerSerializedDataVersion", 0);
        setField(term198361, term198361.getClass(), "peer", null);
        setField(term198361, term198361.getClass(), "parent", null);
        setField(term198361, term198361.getClass(), "appContext", null);
        setIntField(term198361, term198361.getClass(), "x", 0);
        setIntField(term198361, term198361.getClass(), "y", 0);
        setIntField(term198361, term198361.getClass(), "width", 0);
        setIntField(term198361, term198361.getClass(), "height", 0);
        setField(term198361, term198361.getClass(), "foreground", null);
        setField(term198361, term198361.getClass(), "background", null);
        setField(term198361, term198361.getClass(), "font", null);
        setField(term198361, term198361.getClass(), "peerFont", null);
        setField(term198361, term198361.getClass(), "cursor", null);
        setField(term198361, term198361.getClass(), "locale", null);
        setField(term198361, term198361.getClass(), "graphicsConfig", null);
        setField(term198361, term198361.getClass(), "bufferStrategy", null);
        setBooleanField(term198361, term198361.getClass(), "ignoreRepaint", false);
        setBooleanField(term198361, term198361.getClass(), "visible", false);
        setBooleanField(term198361, term198361.getClass(), "enabled", false);
        setBooleanField(term198361, term198361.getClass(), "valid", false);
        setField(term198361, term198361.getClass(), "dropTarget", null);
        setField(term198361, term198361.getClass(), "popups", null);
        setField(term198361, term198361.getClass(), "name", null);
        setBooleanField(term198361, term198361.getClass(), "nameExplicitlySet", false);
        setBooleanField(term198361, term198361.getClass(), "focusable", false);
        setIntField(term198361, term198361.getClass(), "isFocusTraversableOverridden", 0);
        setField(term198361, term198361.getClass(), "focusTraversalKeys", null);
        setBooleanField(term198361, term198361.getClass(), "focusTraversalKeysEnabled", false);
        setField(term198361, term198361.getClass(), "acc", null);
        setField(term198361, term198361.getClass(), "minSize", null);
        setBooleanField(term198361, term198361.getClass(), "minSizeSet", false);
        setField(term198361, term198361.getClass(), "prefSize", null);
        setBooleanField(term198361, term198361.getClass(), "prefSizeSet", false);
        setField(term198361, term198361.getClass(), "maxSize", null);
        setBooleanField(term198361, term198361.getClass(), "maxSizeSet", false);
        setField(term198361, term198361.getClass(), "componentOrientation", null);
        setBooleanField(term198361, term198361.getClass(), "newEventsOnly", false);
        setField(term198361, term198361.getClass(), "componentListener", null);
        setField(term198361, term198361.getClass(), "focusListener", null);
        setField(term198361, term198361.getClass(), "hierarchyListener", null);
        setField(term198361, term198361.getClass(), "hierarchyBoundsListener", null);
        setField(term198361, term198361.getClass(), "keyListener", null);
        setField(term198361, term198361.getClass(), "mouseListener", null);
        setField(term198361, term198361.getClass(), "mouseMotionListener", null);
        setField(term198361, term198361.getClass(), "mouseWheelListener", null);
        setField(term198361, term198361.getClass(), "inputMethodListener", null);
        setLongField(term198361, term198361.getClass(), "eventMask", 0L);
        setField(term198361, term198361.getClass(), "changeSupport", null);
        setField(term198361, term198361.getClass(), "objectLock", null);
        setBooleanField(term198361, term198361.getClass(), "isPacked", false);
        setIntField(term198361, term198361.getClass(), "boundsOp", 0);
        setField(term198361, term198361.getClass(), "compoundShape", null);
        setField(term198361, term198361.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term198361, term198361.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term198361, term198361.getClass(), "backgroundEraseDisabled", false);
        setField(term198361, term198361.getClass(), "eventCache", null);
        setBooleanField(term198361, term198361.getClass(), "coalescingEnabled", false);
        setBooleanField(term198361, term198361.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term198361, term198361.getClass(), "componentSerializedDataVersion", 0);
        term198421 = new Integer(0);
        term198423 = new Integer(0);
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
        args[2] = term198421;
        args[3] = term198423;
        callMethod(klass, "newHomePanel", argTypes, term198361, args);
    }

};


