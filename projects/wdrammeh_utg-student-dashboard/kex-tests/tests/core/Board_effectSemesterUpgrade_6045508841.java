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

public class Board_effectSemesterUpgrade_6045508841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198893;

    public Board_effectSemesterUpgrade_6045508841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198893 = newInstance(Class.forName("core.Board"));
        setField(term198893, term198893.getClass(), "contentPanel", null);
        setField(term198893, term198893.getClass(), "bodyLayer", null);
        setField(term198893, term198893.getClass(), "cardLayout", null);
        setField(term198893, term198893.getClass(), "semesterActivity", null);
        setField(term198893, term198893.getClass(), "moduleActivity", null);
        setField(term198893, term198893.getClass(), "settingsUI", null);
        setField(term198893, term198893.getClass(), "transcriptActivity", null);
        setField(term198893, term198893.getClass(), "analysisActivity", null);
        setField(term198893, term198893.getClass(), "helpActivity", null);
        setField(term198893, term198893.getClass(), "about", null);
        setField(term198893, term198893.getClass(), "taskActivity", null);
        setField(term198893, term198893.getClass(), "newsPresent", null);
        setField(term198893, term198893.getClass(), "alertActivity", null);
        setIntField(term198893, term198893.getClass(), "defaultCloseOperation", 0);
        setField(term198893, term198893.getClass(), "transferHandler", null);
        setField(term198893, term198893.getClass(), "rootPane", null);
        setBooleanField(term198893, term198893.getClass(), "rootPaneCheckingEnabled", false);
        setField(term198893, term198893.getClass(), "accessibleContext", null);
        setField(term198893, term198893.getClass(), "maximizedBounds", null);
        setField(term198893, term198893.getClass(), "title", null);
        setField(term198893, term198893.getClass(), "menuBar", null);
        setBooleanField(term198893, term198893.getClass(), "resizable", false);
        setBooleanField(term198893, term198893.getClass(), "undecorated", false);
        setBooleanField(term198893, term198893.getClass(), "mbManagement", false);
        setIntField(term198893, term198893.getClass(), "state", 0);
        setField(term198893, term198893.getClass(), "ownedWindows", null);
        setIntField(term198893, term198893.getClass(), "frameSerializedDataVersion", 0);
        setField(term198893, term198893.getClass(), "warningString", null);
        setField(term198893, term198893.getClass(), "icons", null);
        setField(term198893, term198893.getClass(), "temporaryLostComponent", null);
        setBooleanField(term198893, term198893.getClass(), "syncLWRequests", false);
        setBooleanField(term198893, term198893.getClass(), "beforeFirstShow", false);
        setBooleanField(term198893, term198893.getClass(), "disposing", false);
        setField(term198893, term198893.getClass(), "disposerRecord", null);
        setBooleanField(term198893, term198893.getClass(), "alwaysOnTop", false);
        setField(term198893, term198893.getClass(), "ownedWindowList", null);
        setField(term198893, term198893.getClass(), "weakThis", null);
        setBooleanField(term198893, term198893.getClass(), "showWithParent", false);
        setField(term198893, term198893.getClass(), "modalBlocker", null);
        setField(term198893, term198893.getClass(), "modalExclusionType", null);
        setField(term198893, term198893.getClass(), "windowListener", null);
        setField(term198893, term198893.getClass(), "windowStateListener", null);
        setField(term198893, term198893.getClass(), "windowFocusListener", null);
        setField(term198893, term198893.getClass(), "inputContext", null);
        setField(term198893, term198893.getClass(), "inputContextLock", null);
        setField(term198893, term198893.getClass(), "focusMgr", null);
        setBooleanField(term198893, term198893.getClass(), "focusableWindowState", false);
        setBooleanField(term198893, term198893.getClass(), "autoRequestFocus", false);
        setBooleanField(term198893, term198893.getClass(), "isInShow", false);
        setFloatField(term198893, term198893.getClass(), "opacity", 0.0F);
        setField(term198893, term198893.getClass(), "shape", null);
        setBooleanField(term198893, term198893.getClass(), "isTrayIconWindow", false);
        setIntField(term198893, term198893.getClass(), "securityWarningWidth", 0);
        setIntField(term198893, term198893.getClass(), "securityWarningHeight", 0);
        setDoubleField(term198893, term198893.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term198893, term198893.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term198893, term198893.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term198893, term198893.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term198893, term198893.getClass(), "anchor", null);
        setField(term198893, term198893.getClass(), "type", null);
        setIntField(term198893, term198893.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term198893, term198893.getClass(), "locationByPlatform", false);
        setField(term198893, term198893.getClass(), "component", null);
        setField(term198893, term198893.getClass(), "layoutMgr", null);
        setField(term198893, term198893.getClass(), "dispatcher", null);
        setField(term198893, term198893.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term198893, term198893.getClass(), "focusCycleRoot", false);
        setBooleanField(term198893, term198893.getClass(), "focusTraversalPolicyProvider", false);
        setField(term198893, term198893.getClass(), "printingThreads", null);
        setBooleanField(term198893, term198893.getClass(), "printing", false);
        setField(term198893, term198893.getClass(), "containerListener", null);
        setIntField(term198893, term198893.getClass(), "listeningChildren", 0);
        setIntField(term198893, term198893.getClass(), "listeningBoundsChildren", 0);
        setIntField(term198893, term198893.getClass(), "descendantsCount", 0);
        setField(term198893, term198893.getClass(), "preserveBackgroundColor", null);
        setIntField(term198893, term198893.getClass(), "numOfHWComponents", 0);
        setIntField(term198893, term198893.getClass(), "numOfLWComponents", 0);
        setField(term198893, term198893.getClass(), "modalComp", null);
        setField(term198893, term198893.getClass(), "modalAppContext", null);
        setIntField(term198893, term198893.getClass(), "containerSerializedDataVersion", 0);
        setField(term198893, term198893.getClass(), "peer", null);
        setField(term198893, term198893.getClass(), "parent", null);
        setField(term198893, term198893.getClass(), "appContext", null);
        setIntField(term198893, term198893.getClass(), "x", 0);
        setIntField(term198893, term198893.getClass(), "y", 0);
        setIntField(term198893, term198893.getClass(), "width", 0);
        setIntField(term198893, term198893.getClass(), "height", 0);
        setField(term198893, term198893.getClass(), "foreground", null);
        setField(term198893, term198893.getClass(), "background", null);
        setField(term198893, term198893.getClass(), "font", null);
        setField(term198893, term198893.getClass(), "peerFont", null);
        setField(term198893, term198893.getClass(), "cursor", null);
        setField(term198893, term198893.getClass(), "locale", null);
        setField(term198893, term198893.getClass(), "graphicsConfig", null);
        setField(term198893, term198893.getClass(), "bufferStrategy", null);
        setBooleanField(term198893, term198893.getClass(), "ignoreRepaint", false);
        setBooleanField(term198893, term198893.getClass(), "visible", false);
        setBooleanField(term198893, term198893.getClass(), "enabled", false);
        setBooleanField(term198893, term198893.getClass(), "valid", false);
        setField(term198893, term198893.getClass(), "dropTarget", null);
        setField(term198893, term198893.getClass(), "popups", null);
        setField(term198893, term198893.getClass(), "name", null);
        setBooleanField(term198893, term198893.getClass(), "nameExplicitlySet", false);
        setBooleanField(term198893, term198893.getClass(), "focusable", false);
        setIntField(term198893, term198893.getClass(), "isFocusTraversableOverridden", 0);
        setField(term198893, term198893.getClass(), "focusTraversalKeys", null);
        setBooleanField(term198893, term198893.getClass(), "focusTraversalKeysEnabled", false);
        setField(term198893, term198893.getClass(), "acc", null);
        setField(term198893, term198893.getClass(), "minSize", null);
        setBooleanField(term198893, term198893.getClass(), "minSizeSet", false);
        setField(term198893, term198893.getClass(), "prefSize", null);
        setBooleanField(term198893, term198893.getClass(), "prefSizeSet", false);
        setField(term198893, term198893.getClass(), "maxSize", null);
        setBooleanField(term198893, term198893.getClass(), "maxSizeSet", false);
        setField(term198893, term198893.getClass(), "componentOrientation", null);
        setBooleanField(term198893, term198893.getClass(), "newEventsOnly", false);
        setField(term198893, term198893.getClass(), "componentListener", null);
        setField(term198893, term198893.getClass(), "focusListener", null);
        setField(term198893, term198893.getClass(), "hierarchyListener", null);
        setField(term198893, term198893.getClass(), "hierarchyBoundsListener", null);
        setField(term198893, term198893.getClass(), "keyListener", null);
        setField(term198893, term198893.getClass(), "mouseListener", null);
        setField(term198893, term198893.getClass(), "mouseMotionListener", null);
        setField(term198893, term198893.getClass(), "mouseWheelListener", null);
        setField(term198893, term198893.getClass(), "inputMethodListener", null);
        setLongField(term198893, term198893.getClass(), "eventMask", 0L);
        setField(term198893, term198893.getClass(), "changeSupport", null);
        setField(term198893, term198893.getClass(), "objectLock", null);
        setBooleanField(term198893, term198893.getClass(), "isPacked", false);
        setIntField(term198893, term198893.getClass(), "boundsOp", 0);
        setField(term198893, term198893.getClass(), "compoundShape", null);
        setField(term198893, term198893.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term198893, term198893.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term198893, term198893.getClass(), "backgroundEraseDisabled", false);
        setField(term198893, term198893.getClass(), "eventCache", null);
        setBooleanField(term198893, term198893.getClass(), "coalescingEnabled", false);
        setBooleanField(term198893, term198893.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term198893, term198893.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "effectSemesterUpgrade", argTypes, term198893, args);
    }

};


