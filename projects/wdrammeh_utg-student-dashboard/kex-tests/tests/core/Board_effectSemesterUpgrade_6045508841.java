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
     Object term198907;

    public Board_effectSemesterUpgrade_6045508841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198907 = newInstance(Class.forName("core.Board"));
        setField(term198907, term198907.getClass(), "contentPanel", null);
        setField(term198907, term198907.getClass(), "bodyLayer", null);
        setField(term198907, term198907.getClass(), "cardLayout", null);
        setField(term198907, term198907.getClass(), "semesterActivity", null);
        setField(term198907, term198907.getClass(), "moduleActivity", null);
        setField(term198907, term198907.getClass(), "settingsUI", null);
        setField(term198907, term198907.getClass(), "transcriptActivity", null);
        setField(term198907, term198907.getClass(), "analysisActivity", null);
        setField(term198907, term198907.getClass(), "helpActivity", null);
        setField(term198907, term198907.getClass(), "about", null);
        setField(term198907, term198907.getClass(), "taskActivity", null);
        setField(term198907, term198907.getClass(), "newsPresent", null);
        setField(term198907, term198907.getClass(), "alertActivity", null);
        setIntField(term198907, term198907.getClass(), "defaultCloseOperation", 0);
        setField(term198907, term198907.getClass(), "transferHandler", null);
        setField(term198907, term198907.getClass(), "rootPane", null);
        setBooleanField(term198907, term198907.getClass(), "rootPaneCheckingEnabled", false);
        setField(term198907, term198907.getClass(), "accessibleContext", null);
        setField(term198907, term198907.getClass(), "maximizedBounds", null);
        setField(term198907, term198907.getClass(), "title", null);
        setField(term198907, term198907.getClass(), "menuBar", null);
        setBooleanField(term198907, term198907.getClass(), "resizable", false);
        setBooleanField(term198907, term198907.getClass(), "undecorated", false);
        setBooleanField(term198907, term198907.getClass(), "mbManagement", false);
        setIntField(term198907, term198907.getClass(), "state", 0);
        setField(term198907, term198907.getClass(), "ownedWindows", null);
        setIntField(term198907, term198907.getClass(), "frameSerializedDataVersion", 0);
        setField(term198907, term198907.getClass(), "warningString", null);
        setField(term198907, term198907.getClass(), "icons", null);
        setField(term198907, term198907.getClass(), "temporaryLostComponent", null);
        setBooleanField(term198907, term198907.getClass(), "syncLWRequests", false);
        setBooleanField(term198907, term198907.getClass(), "beforeFirstShow", false);
        setBooleanField(term198907, term198907.getClass(), "disposing", false);
        setField(term198907, term198907.getClass(), "disposerRecord", null);
        setBooleanField(term198907, term198907.getClass(), "alwaysOnTop", false);
        setField(term198907, term198907.getClass(), "ownedWindowList", null);
        setField(term198907, term198907.getClass(), "weakThis", null);
        setBooleanField(term198907, term198907.getClass(), "showWithParent", false);
        setField(term198907, term198907.getClass(), "modalBlocker", null);
        setField(term198907, term198907.getClass(), "modalExclusionType", null);
        setField(term198907, term198907.getClass(), "windowListener", null);
        setField(term198907, term198907.getClass(), "windowStateListener", null);
        setField(term198907, term198907.getClass(), "windowFocusListener", null);
        setField(term198907, term198907.getClass(), "inputContext", null);
        setField(term198907, term198907.getClass(), "inputContextLock", null);
        setField(term198907, term198907.getClass(), "focusMgr", null);
        setBooleanField(term198907, term198907.getClass(), "focusableWindowState", false);
        setBooleanField(term198907, term198907.getClass(), "autoRequestFocus", false);
        setBooleanField(term198907, term198907.getClass(), "isInShow", false);
        setFloatField(term198907, term198907.getClass(), "opacity", 0.0F);
        setField(term198907, term198907.getClass(), "shape", null);
        setBooleanField(term198907, term198907.getClass(), "isTrayIconWindow", false);
        setIntField(term198907, term198907.getClass(), "securityWarningWidth", 0);
        setIntField(term198907, term198907.getClass(), "securityWarningHeight", 0);
        setDoubleField(term198907, term198907.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term198907, term198907.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term198907, term198907.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term198907, term198907.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term198907, term198907.getClass(), "anchor", null);
        setField(term198907, term198907.getClass(), "type", null);
        setIntField(term198907, term198907.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term198907, term198907.getClass(), "locationByPlatform", false);
        setField(term198907, term198907.getClass(), "component", null);
        setField(term198907, term198907.getClass(), "layoutMgr", null);
        setField(term198907, term198907.getClass(), "dispatcher", null);
        setField(term198907, term198907.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term198907, term198907.getClass(), "focusCycleRoot", false);
        setBooleanField(term198907, term198907.getClass(), "focusTraversalPolicyProvider", false);
        setField(term198907, term198907.getClass(), "printingThreads", null);
        setBooleanField(term198907, term198907.getClass(), "printing", false);
        setField(term198907, term198907.getClass(), "containerListener", null);
        setIntField(term198907, term198907.getClass(), "listeningChildren", 0);
        setIntField(term198907, term198907.getClass(), "listeningBoundsChildren", 0);
        setIntField(term198907, term198907.getClass(), "descendantsCount", 0);
        setField(term198907, term198907.getClass(), "preserveBackgroundColor", null);
        setIntField(term198907, term198907.getClass(), "numOfHWComponents", 0);
        setIntField(term198907, term198907.getClass(), "numOfLWComponents", 0);
        setField(term198907, term198907.getClass(), "modalComp", null);
        setField(term198907, term198907.getClass(), "modalAppContext", null);
        setIntField(term198907, term198907.getClass(), "containerSerializedDataVersion", 0);
        setField(term198907, term198907.getClass(), "peer", null);
        setField(term198907, term198907.getClass(), "parent", null);
        setField(term198907, term198907.getClass(), "appContext", null);
        setIntField(term198907, term198907.getClass(), "x", 0);
        setIntField(term198907, term198907.getClass(), "y", 0);
        setIntField(term198907, term198907.getClass(), "width", 0);
        setIntField(term198907, term198907.getClass(), "height", 0);
        setField(term198907, term198907.getClass(), "foreground", null);
        setField(term198907, term198907.getClass(), "background", null);
        setField(term198907, term198907.getClass(), "font", null);
        setField(term198907, term198907.getClass(), "peerFont", null);
        setField(term198907, term198907.getClass(), "cursor", null);
        setField(term198907, term198907.getClass(), "locale", null);
        setField(term198907, term198907.getClass(), "graphicsConfig", null);
        setField(term198907, term198907.getClass(), "bufferStrategy", null);
        setBooleanField(term198907, term198907.getClass(), "ignoreRepaint", false);
        setBooleanField(term198907, term198907.getClass(), "visible", false);
        setBooleanField(term198907, term198907.getClass(), "enabled", false);
        setBooleanField(term198907, term198907.getClass(), "valid", false);
        setField(term198907, term198907.getClass(), "dropTarget", null);
        setField(term198907, term198907.getClass(), "popups", null);
        setField(term198907, term198907.getClass(), "name", null);
        setBooleanField(term198907, term198907.getClass(), "nameExplicitlySet", false);
        setBooleanField(term198907, term198907.getClass(), "focusable", false);
        setIntField(term198907, term198907.getClass(), "isFocusTraversableOverridden", 0);
        setField(term198907, term198907.getClass(), "focusTraversalKeys", null);
        setBooleanField(term198907, term198907.getClass(), "focusTraversalKeysEnabled", false);
        setField(term198907, term198907.getClass(), "acc", null);
        setField(term198907, term198907.getClass(), "minSize", null);
        setBooleanField(term198907, term198907.getClass(), "minSizeSet", false);
        setField(term198907, term198907.getClass(), "prefSize", null);
        setBooleanField(term198907, term198907.getClass(), "prefSizeSet", false);
        setField(term198907, term198907.getClass(), "maxSize", null);
        setBooleanField(term198907, term198907.getClass(), "maxSizeSet", false);
        setField(term198907, term198907.getClass(), "componentOrientation", null);
        setBooleanField(term198907, term198907.getClass(), "newEventsOnly", false);
        setField(term198907, term198907.getClass(), "componentListener", null);
        setField(term198907, term198907.getClass(), "focusListener", null);
        setField(term198907, term198907.getClass(), "hierarchyListener", null);
        setField(term198907, term198907.getClass(), "hierarchyBoundsListener", null);
        setField(term198907, term198907.getClass(), "keyListener", null);
        setField(term198907, term198907.getClass(), "mouseListener", null);
        setField(term198907, term198907.getClass(), "mouseMotionListener", null);
        setField(term198907, term198907.getClass(), "mouseWheelListener", null);
        setField(term198907, term198907.getClass(), "inputMethodListener", null);
        setLongField(term198907, term198907.getClass(), "eventMask", 0L);
        setField(term198907, term198907.getClass(), "changeSupport", null);
        setField(term198907, term198907.getClass(), "objectLock", null);
        setBooleanField(term198907, term198907.getClass(), "isPacked", false);
        setIntField(term198907, term198907.getClass(), "boundsOp", 0);
        setField(term198907, term198907.getClass(), "compoundShape", null);
        setField(term198907, term198907.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term198907, term198907.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term198907, term198907.getClass(), "backgroundEraseDisabled", false);
        setField(term198907, term198907.getClass(), "eventCache", null);
        setBooleanField(term198907, term198907.getClass(), "coalescingEnabled", false);
        setBooleanField(term198907, term198907.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term198907, term198907.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "effectSemesterUpgrade", argTypes, term198907, args);
    }

};


