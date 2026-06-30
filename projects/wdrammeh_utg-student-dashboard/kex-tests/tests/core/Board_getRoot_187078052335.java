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
     Object term198545;

    public Board_getRoot_187078052335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198545 = newInstance(Class.forName("core.Board"));
        setField(term198545, term198545.getClass(), "contentPanel", null);
        setField(term198545, term198545.getClass(), "bodyLayer", null);
        setField(term198545, term198545.getClass(), "cardLayout", null);
        setField(term198545, term198545.getClass(), "semesterActivity", null);
        setField(term198545, term198545.getClass(), "moduleActivity", null);
        setField(term198545, term198545.getClass(), "settingsUI", null);
        setField(term198545, term198545.getClass(), "transcriptActivity", null);
        setField(term198545, term198545.getClass(), "analysisActivity", null);
        setField(term198545, term198545.getClass(), "helpActivity", null);
        setField(term198545, term198545.getClass(), "about", null);
        setField(term198545, term198545.getClass(), "taskActivity", null);
        setField(term198545, term198545.getClass(), "newsPresent", null);
        setField(term198545, term198545.getClass(), "alertActivity", null);
        setIntField(term198545, term198545.getClass(), "defaultCloseOperation", 0);
        setField(term198545, term198545.getClass(), "transferHandler", null);
        setField(term198545, term198545.getClass(), "rootPane", null);
        setBooleanField(term198545, term198545.getClass(), "rootPaneCheckingEnabled", false);
        setField(term198545, term198545.getClass(), "accessibleContext", null);
        setField(term198545, term198545.getClass(), "maximizedBounds", null);
        setField(term198545, term198545.getClass(), "title", null);
        setField(term198545, term198545.getClass(), "menuBar", null);
        setBooleanField(term198545, term198545.getClass(), "resizable", false);
        setBooleanField(term198545, term198545.getClass(), "undecorated", false);
        setBooleanField(term198545, term198545.getClass(), "mbManagement", false);
        setIntField(term198545, term198545.getClass(), "state", 0);
        setField(term198545, term198545.getClass(), "ownedWindows", null);
        setIntField(term198545, term198545.getClass(), "frameSerializedDataVersion", 0);
        setField(term198545, term198545.getClass(), "warningString", null);
        setField(term198545, term198545.getClass(), "icons", null);
        setField(term198545, term198545.getClass(), "temporaryLostComponent", null);
        setBooleanField(term198545, term198545.getClass(), "syncLWRequests", false);
        setBooleanField(term198545, term198545.getClass(), "beforeFirstShow", false);
        setBooleanField(term198545, term198545.getClass(), "disposing", false);
        setField(term198545, term198545.getClass(), "disposerRecord", null);
        setBooleanField(term198545, term198545.getClass(), "alwaysOnTop", false);
        setField(term198545, term198545.getClass(), "ownedWindowList", null);
        setField(term198545, term198545.getClass(), "weakThis", null);
        setBooleanField(term198545, term198545.getClass(), "showWithParent", false);
        setField(term198545, term198545.getClass(), "modalBlocker", null);
        setField(term198545, term198545.getClass(), "modalExclusionType", null);
        setField(term198545, term198545.getClass(), "windowListener", null);
        setField(term198545, term198545.getClass(), "windowStateListener", null);
        setField(term198545, term198545.getClass(), "windowFocusListener", null);
        setField(term198545, term198545.getClass(), "inputContext", null);
        setField(term198545, term198545.getClass(), "inputContextLock", null);
        setField(term198545, term198545.getClass(), "focusMgr", null);
        setBooleanField(term198545, term198545.getClass(), "focusableWindowState", false);
        setBooleanField(term198545, term198545.getClass(), "autoRequestFocus", false);
        setBooleanField(term198545, term198545.getClass(), "isInShow", false);
        setFloatField(term198545, term198545.getClass(), "opacity", 0.0F);
        setField(term198545, term198545.getClass(), "shape", null);
        setBooleanField(term198545, term198545.getClass(), "isTrayIconWindow", false);
        setIntField(term198545, term198545.getClass(), "securityWarningWidth", 0);
        setIntField(term198545, term198545.getClass(), "securityWarningHeight", 0);
        setDoubleField(term198545, term198545.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term198545, term198545.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term198545, term198545.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term198545, term198545.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term198545, term198545.getClass(), "anchor", null);
        setField(term198545, term198545.getClass(), "type", null);
        setIntField(term198545, term198545.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term198545, term198545.getClass(), "locationByPlatform", false);
        setField(term198545, term198545.getClass(), "component", null);
        setField(term198545, term198545.getClass(), "layoutMgr", null);
        setField(term198545, term198545.getClass(), "dispatcher", null);
        setField(term198545, term198545.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term198545, term198545.getClass(), "focusCycleRoot", false);
        setBooleanField(term198545, term198545.getClass(), "focusTraversalPolicyProvider", false);
        setField(term198545, term198545.getClass(), "printingThreads", null);
        setBooleanField(term198545, term198545.getClass(), "printing", false);
        setField(term198545, term198545.getClass(), "containerListener", null);
        setIntField(term198545, term198545.getClass(), "listeningChildren", 0);
        setIntField(term198545, term198545.getClass(), "listeningBoundsChildren", 0);
        setIntField(term198545, term198545.getClass(), "descendantsCount", 0);
        setField(term198545, term198545.getClass(), "preserveBackgroundColor", null);
        setIntField(term198545, term198545.getClass(), "numOfHWComponents", 0);
        setIntField(term198545, term198545.getClass(), "numOfLWComponents", 0);
        setField(term198545, term198545.getClass(), "modalComp", null);
        setField(term198545, term198545.getClass(), "modalAppContext", null);
        setIntField(term198545, term198545.getClass(), "containerSerializedDataVersion", 0);
        setField(term198545, term198545.getClass(), "peer", null);
        setField(term198545, term198545.getClass(), "parent", null);
        setField(term198545, term198545.getClass(), "appContext", null);
        setIntField(term198545, term198545.getClass(), "x", 0);
        setIntField(term198545, term198545.getClass(), "y", 0);
        setIntField(term198545, term198545.getClass(), "width", 0);
        setIntField(term198545, term198545.getClass(), "height", 0);
        setField(term198545, term198545.getClass(), "foreground", null);
        setField(term198545, term198545.getClass(), "background", null);
        setField(term198545, term198545.getClass(), "font", null);
        setField(term198545, term198545.getClass(), "peerFont", null);
        setField(term198545, term198545.getClass(), "cursor", null);
        setField(term198545, term198545.getClass(), "locale", null);
        setField(term198545, term198545.getClass(), "graphicsConfig", null);
        setField(term198545, term198545.getClass(), "bufferStrategy", null);
        setBooleanField(term198545, term198545.getClass(), "ignoreRepaint", false);
        setBooleanField(term198545, term198545.getClass(), "visible", false);
        setBooleanField(term198545, term198545.getClass(), "enabled", false);
        setBooleanField(term198545, term198545.getClass(), "valid", false);
        setField(term198545, term198545.getClass(), "dropTarget", null);
        setField(term198545, term198545.getClass(), "popups", null);
        setField(term198545, term198545.getClass(), "name", null);
        setBooleanField(term198545, term198545.getClass(), "nameExplicitlySet", false);
        setBooleanField(term198545, term198545.getClass(), "focusable", false);
        setIntField(term198545, term198545.getClass(), "isFocusTraversableOverridden", 0);
        setField(term198545, term198545.getClass(), "focusTraversalKeys", null);
        setBooleanField(term198545, term198545.getClass(), "focusTraversalKeysEnabled", false);
        setField(term198545, term198545.getClass(), "acc", null);
        setField(term198545, term198545.getClass(), "minSize", null);
        setBooleanField(term198545, term198545.getClass(), "minSizeSet", false);
        setField(term198545, term198545.getClass(), "prefSize", null);
        setBooleanField(term198545, term198545.getClass(), "prefSizeSet", false);
        setField(term198545, term198545.getClass(), "maxSize", null);
        setBooleanField(term198545, term198545.getClass(), "maxSizeSet", false);
        setField(term198545, term198545.getClass(), "componentOrientation", null);
        setBooleanField(term198545, term198545.getClass(), "newEventsOnly", false);
        setField(term198545, term198545.getClass(), "componentListener", null);
        setField(term198545, term198545.getClass(), "focusListener", null);
        setField(term198545, term198545.getClass(), "hierarchyListener", null);
        setField(term198545, term198545.getClass(), "hierarchyBoundsListener", null);
        setField(term198545, term198545.getClass(), "keyListener", null);
        setField(term198545, term198545.getClass(), "mouseListener", null);
        setField(term198545, term198545.getClass(), "mouseMotionListener", null);
        setField(term198545, term198545.getClass(), "mouseWheelListener", null);
        setField(term198545, term198545.getClass(), "inputMethodListener", null);
        setLongField(term198545, term198545.getClass(), "eventMask", 0L);
        setField(term198545, term198545.getClass(), "changeSupport", null);
        setField(term198545, term198545.getClass(), "objectLock", null);
        setBooleanField(term198545, term198545.getClass(), "isPacked", false);
        setIntField(term198545, term198545.getClass(), "boundsOp", 0);
        setField(term198545, term198545.getClass(), "compoundShape", null);
        setField(term198545, term198545.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term198545, term198545.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term198545, term198545.getClass(), "backgroundEraseDisabled", false);
        setField(term198545, term198545.getClass(), "eventCache", null);
        setBooleanField(term198545, term198545.getClass(), "coalescingEnabled", false);
        setBooleanField(term198545, term198545.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term198545, term198545.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoot", argTypes, term198545, args);
    }

};


