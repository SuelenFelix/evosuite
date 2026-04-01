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

public class Board_getRoot_187078052335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198531;

    public Board_getRoot_187078052335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198531 = newInstance(Class.forName("core.Board"));
        setField(term198531, term198531.getClass(), "contentPanel", null);
        setField(term198531, term198531.getClass(), "bodyLayer", null);
        setField(term198531, term198531.getClass(), "cardLayout", null);
        setField(term198531, term198531.getClass(), "semesterActivity", null);
        setField(term198531, term198531.getClass(), "moduleActivity", null);
        setField(term198531, term198531.getClass(), "settingsUI", null);
        setField(term198531, term198531.getClass(), "transcriptActivity", null);
        setField(term198531, term198531.getClass(), "analysisActivity", null);
        setField(term198531, term198531.getClass(), "helpActivity", null);
        setField(term198531, term198531.getClass(), "about", null);
        setField(term198531, term198531.getClass(), "taskActivity", null);
        setField(term198531, term198531.getClass(), "newsPresent", null);
        setField(term198531, term198531.getClass(), "alertActivity", null);
        setIntField(term198531, term198531.getClass(), "defaultCloseOperation", 0);
        setField(term198531, term198531.getClass(), "transferHandler", null);
        setField(term198531, term198531.getClass(), "rootPane", null);
        setBooleanField(term198531, term198531.getClass(), "rootPaneCheckingEnabled", false);
        setField(term198531, term198531.getClass(), "accessibleContext", null);
        setField(term198531, term198531.getClass(), "maximizedBounds", null);
        setField(term198531, term198531.getClass(), "title", null);
        setField(term198531, term198531.getClass(), "menuBar", null);
        setBooleanField(term198531, term198531.getClass(), "resizable", false);
        setBooleanField(term198531, term198531.getClass(), "undecorated", false);
        setBooleanField(term198531, term198531.getClass(), "mbManagement", false);
        setIntField(term198531, term198531.getClass(), "state", 0);
        setField(term198531, term198531.getClass(), "ownedWindows", null);
        setIntField(term198531, term198531.getClass(), "frameSerializedDataVersion", 0);
        setField(term198531, term198531.getClass(), "warningString", null);
        setField(term198531, term198531.getClass(), "icons", null);
        setField(term198531, term198531.getClass(), "temporaryLostComponent", null);
        setBooleanField(term198531, term198531.getClass(), "syncLWRequests", false);
        setBooleanField(term198531, term198531.getClass(), "beforeFirstShow", false);
        setBooleanField(term198531, term198531.getClass(), "disposing", false);
        setField(term198531, term198531.getClass(), "disposerRecord", null);
        setBooleanField(term198531, term198531.getClass(), "alwaysOnTop", false);
        setField(term198531, term198531.getClass(), "ownedWindowList", null);
        setField(term198531, term198531.getClass(), "weakThis", null);
        setBooleanField(term198531, term198531.getClass(), "showWithParent", false);
        setField(term198531, term198531.getClass(), "modalBlocker", null);
        setField(term198531, term198531.getClass(), "modalExclusionType", null);
        setField(term198531, term198531.getClass(), "windowListener", null);
        setField(term198531, term198531.getClass(), "windowStateListener", null);
        setField(term198531, term198531.getClass(), "windowFocusListener", null);
        setField(term198531, term198531.getClass(), "inputContext", null);
        setField(term198531, term198531.getClass(), "inputContextLock", null);
        setField(term198531, term198531.getClass(), "focusMgr", null);
        setBooleanField(term198531, term198531.getClass(), "focusableWindowState", false);
        setBooleanField(term198531, term198531.getClass(), "autoRequestFocus", false);
        setBooleanField(term198531, term198531.getClass(), "isInShow", false);
        setFloatField(term198531, term198531.getClass(), "opacity", 0.0F);
        setField(term198531, term198531.getClass(), "shape", null);
        setBooleanField(term198531, term198531.getClass(), "isTrayIconWindow", false);
        setIntField(term198531, term198531.getClass(), "securityWarningWidth", 0);
        setIntField(term198531, term198531.getClass(), "securityWarningHeight", 0);
        setDoubleField(term198531, term198531.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term198531, term198531.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term198531, term198531.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term198531, term198531.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term198531, term198531.getClass(), "anchor", null);
        setField(term198531, term198531.getClass(), "type", null);
        setIntField(term198531, term198531.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term198531, term198531.getClass(), "locationByPlatform", false);
        setField(term198531, term198531.getClass(), "component", null);
        setField(term198531, term198531.getClass(), "layoutMgr", null);
        setField(term198531, term198531.getClass(), "dispatcher", null);
        setField(term198531, term198531.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term198531, term198531.getClass(), "focusCycleRoot", false);
        setBooleanField(term198531, term198531.getClass(), "focusTraversalPolicyProvider", false);
        setField(term198531, term198531.getClass(), "printingThreads", null);
        setBooleanField(term198531, term198531.getClass(), "printing", false);
        setField(term198531, term198531.getClass(), "containerListener", null);
        setIntField(term198531, term198531.getClass(), "listeningChildren", 0);
        setIntField(term198531, term198531.getClass(), "listeningBoundsChildren", 0);
        setIntField(term198531, term198531.getClass(), "descendantsCount", 0);
        setField(term198531, term198531.getClass(), "preserveBackgroundColor", null);
        setIntField(term198531, term198531.getClass(), "numOfHWComponents", 0);
        setIntField(term198531, term198531.getClass(), "numOfLWComponents", 0);
        setField(term198531, term198531.getClass(), "modalComp", null);
        setField(term198531, term198531.getClass(), "modalAppContext", null);
        setIntField(term198531, term198531.getClass(), "containerSerializedDataVersion", 0);
        setField(term198531, term198531.getClass(), "peer", null);
        setField(term198531, term198531.getClass(), "parent", null);
        setField(term198531, term198531.getClass(), "appContext", null);
        setIntField(term198531, term198531.getClass(), "x", 0);
        setIntField(term198531, term198531.getClass(), "y", 0);
        setIntField(term198531, term198531.getClass(), "width", 0);
        setIntField(term198531, term198531.getClass(), "height", 0);
        setField(term198531, term198531.getClass(), "foreground", null);
        setField(term198531, term198531.getClass(), "background", null);
        setField(term198531, term198531.getClass(), "font", null);
        setField(term198531, term198531.getClass(), "peerFont", null);
        setField(term198531, term198531.getClass(), "cursor", null);
        setField(term198531, term198531.getClass(), "locale", null);
        setField(term198531, term198531.getClass(), "graphicsConfig", null);
        setField(term198531, term198531.getClass(), "bufferStrategy", null);
        setBooleanField(term198531, term198531.getClass(), "ignoreRepaint", false);
        setBooleanField(term198531, term198531.getClass(), "visible", false);
        setBooleanField(term198531, term198531.getClass(), "enabled", false);
        setBooleanField(term198531, term198531.getClass(), "valid", false);
        setField(term198531, term198531.getClass(), "dropTarget", null);
        setField(term198531, term198531.getClass(), "popups", null);
        setField(term198531, term198531.getClass(), "name", null);
        setBooleanField(term198531, term198531.getClass(), "nameExplicitlySet", false);
        setBooleanField(term198531, term198531.getClass(), "focusable", false);
        setIntField(term198531, term198531.getClass(), "isFocusTraversableOverridden", 0);
        setField(term198531, term198531.getClass(), "focusTraversalKeys", null);
        setBooleanField(term198531, term198531.getClass(), "focusTraversalKeysEnabled", false);
        setField(term198531, term198531.getClass(), "acc", null);
        setField(term198531, term198531.getClass(), "minSize", null);
        setBooleanField(term198531, term198531.getClass(), "minSizeSet", false);
        setField(term198531, term198531.getClass(), "prefSize", null);
        setBooleanField(term198531, term198531.getClass(), "prefSizeSet", false);
        setField(term198531, term198531.getClass(), "maxSize", null);
        setBooleanField(term198531, term198531.getClass(), "maxSizeSet", false);
        setField(term198531, term198531.getClass(), "componentOrientation", null);
        setBooleanField(term198531, term198531.getClass(), "newEventsOnly", false);
        setField(term198531, term198531.getClass(), "componentListener", null);
        setField(term198531, term198531.getClass(), "focusListener", null);
        setField(term198531, term198531.getClass(), "hierarchyListener", null);
        setField(term198531, term198531.getClass(), "hierarchyBoundsListener", null);
        setField(term198531, term198531.getClass(), "keyListener", null);
        setField(term198531, term198531.getClass(), "mouseListener", null);
        setField(term198531, term198531.getClass(), "mouseMotionListener", null);
        setField(term198531, term198531.getClass(), "mouseWheelListener", null);
        setField(term198531, term198531.getClass(), "inputMethodListener", null);
        setLongField(term198531, term198531.getClass(), "eventMask", 0L);
        setField(term198531, term198531.getClass(), "changeSupport", null);
        setField(term198531, term198531.getClass(), "objectLock", null);
        setBooleanField(term198531, term198531.getClass(), "isPacked", false);
        setIntField(term198531, term198531.getClass(), "boundsOp", 0);
        setField(term198531, term198531.getClass(), "compoundShape", null);
        setField(term198531, term198531.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term198531, term198531.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term198531, term198531.getClass(), "backgroundEraseDisabled", false);
        setField(term198531, term198531.getClass(), "eventCache", null);
        setBooleanField(term198531, term198531.getClass(), "coalescingEnabled", false);
        setBooleanField(term198531, term198531.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term198531, term198531.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoot", argTypes, term198531, args);
    }

};


