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

public class Board_effectLevelUpgrade_153118618242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198967;

    public Board_effectLevelUpgrade_153118618242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198967 = newInstance(Class.forName("core.Board"));
        setField(term198967, term198967.getClass(), "contentPanel", null);
        setField(term198967, term198967.getClass(), "bodyLayer", null);
        setField(term198967, term198967.getClass(), "cardLayout", null);
        setField(term198967, term198967.getClass(), "semesterActivity", null);
        setField(term198967, term198967.getClass(), "moduleActivity", null);
        setField(term198967, term198967.getClass(), "settingsUI", null);
        setField(term198967, term198967.getClass(), "transcriptActivity", null);
        setField(term198967, term198967.getClass(), "analysisActivity", null);
        setField(term198967, term198967.getClass(), "helpActivity", null);
        setField(term198967, term198967.getClass(), "about", null);
        setField(term198967, term198967.getClass(), "taskActivity", null);
        setField(term198967, term198967.getClass(), "newsPresent", null);
        setField(term198967, term198967.getClass(), "alertActivity", null);
        setIntField(term198967, term198967.getClass(), "defaultCloseOperation", 0);
        setField(term198967, term198967.getClass(), "transferHandler", null);
        setField(term198967, term198967.getClass(), "rootPane", null);
        setBooleanField(term198967, term198967.getClass(), "rootPaneCheckingEnabled", false);
        setField(term198967, term198967.getClass(), "accessibleContext", null);
        setField(term198967, term198967.getClass(), "maximizedBounds", null);
        setField(term198967, term198967.getClass(), "title", null);
        setField(term198967, term198967.getClass(), "menuBar", null);
        setBooleanField(term198967, term198967.getClass(), "resizable", false);
        setBooleanField(term198967, term198967.getClass(), "undecorated", false);
        setBooleanField(term198967, term198967.getClass(), "mbManagement", false);
        setIntField(term198967, term198967.getClass(), "state", 0);
        setField(term198967, term198967.getClass(), "ownedWindows", null);
        setIntField(term198967, term198967.getClass(), "frameSerializedDataVersion", 0);
        setField(term198967, term198967.getClass(), "warningString", null);
        setField(term198967, term198967.getClass(), "icons", null);
        setField(term198967, term198967.getClass(), "temporaryLostComponent", null);
        setBooleanField(term198967, term198967.getClass(), "syncLWRequests", false);
        setBooleanField(term198967, term198967.getClass(), "beforeFirstShow", false);
        setBooleanField(term198967, term198967.getClass(), "disposing", false);
        setField(term198967, term198967.getClass(), "disposerRecord", null);
        setBooleanField(term198967, term198967.getClass(), "alwaysOnTop", false);
        setField(term198967, term198967.getClass(), "ownedWindowList", null);
        setField(term198967, term198967.getClass(), "weakThis", null);
        setBooleanField(term198967, term198967.getClass(), "showWithParent", false);
        setField(term198967, term198967.getClass(), "modalBlocker", null);
        setField(term198967, term198967.getClass(), "modalExclusionType", null);
        setField(term198967, term198967.getClass(), "windowListener", null);
        setField(term198967, term198967.getClass(), "windowStateListener", null);
        setField(term198967, term198967.getClass(), "windowFocusListener", null);
        setField(term198967, term198967.getClass(), "inputContext", null);
        setField(term198967, term198967.getClass(), "inputContextLock", null);
        setField(term198967, term198967.getClass(), "focusMgr", null);
        setBooleanField(term198967, term198967.getClass(), "focusableWindowState", false);
        setBooleanField(term198967, term198967.getClass(), "autoRequestFocus", false);
        setBooleanField(term198967, term198967.getClass(), "isInShow", false);
        setFloatField(term198967, term198967.getClass(), "opacity", 0.0F);
        setField(term198967, term198967.getClass(), "shape", null);
        setBooleanField(term198967, term198967.getClass(), "isTrayIconWindow", false);
        setIntField(term198967, term198967.getClass(), "securityWarningWidth", 0);
        setIntField(term198967, term198967.getClass(), "securityWarningHeight", 0);
        setDoubleField(term198967, term198967.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term198967, term198967.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term198967, term198967.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term198967, term198967.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term198967, term198967.getClass(), "anchor", null);
        setField(term198967, term198967.getClass(), "type", null);
        setIntField(term198967, term198967.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term198967, term198967.getClass(), "locationByPlatform", false);
        setField(term198967, term198967.getClass(), "component", null);
        setField(term198967, term198967.getClass(), "layoutMgr", null);
        setField(term198967, term198967.getClass(), "dispatcher", null);
        setField(term198967, term198967.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term198967, term198967.getClass(), "focusCycleRoot", false);
        setBooleanField(term198967, term198967.getClass(), "focusTraversalPolicyProvider", false);
        setField(term198967, term198967.getClass(), "printingThreads", null);
        setBooleanField(term198967, term198967.getClass(), "printing", false);
        setField(term198967, term198967.getClass(), "containerListener", null);
        setIntField(term198967, term198967.getClass(), "listeningChildren", 0);
        setIntField(term198967, term198967.getClass(), "listeningBoundsChildren", 0);
        setIntField(term198967, term198967.getClass(), "descendantsCount", 0);
        setField(term198967, term198967.getClass(), "preserveBackgroundColor", null);
        setIntField(term198967, term198967.getClass(), "numOfHWComponents", 0);
        setIntField(term198967, term198967.getClass(), "numOfLWComponents", 0);
        setField(term198967, term198967.getClass(), "modalComp", null);
        setField(term198967, term198967.getClass(), "modalAppContext", null);
        setIntField(term198967, term198967.getClass(), "containerSerializedDataVersion", 0);
        setField(term198967, term198967.getClass(), "peer", null);
        setField(term198967, term198967.getClass(), "parent", null);
        setField(term198967, term198967.getClass(), "appContext", null);
        setIntField(term198967, term198967.getClass(), "x", 0);
        setIntField(term198967, term198967.getClass(), "y", 0);
        setIntField(term198967, term198967.getClass(), "width", 0);
        setIntField(term198967, term198967.getClass(), "height", 0);
        setField(term198967, term198967.getClass(), "foreground", null);
        setField(term198967, term198967.getClass(), "background", null);
        setField(term198967, term198967.getClass(), "font", null);
        setField(term198967, term198967.getClass(), "peerFont", null);
        setField(term198967, term198967.getClass(), "cursor", null);
        setField(term198967, term198967.getClass(), "locale", null);
        setField(term198967, term198967.getClass(), "graphicsConfig", null);
        setField(term198967, term198967.getClass(), "bufferStrategy", null);
        setBooleanField(term198967, term198967.getClass(), "ignoreRepaint", false);
        setBooleanField(term198967, term198967.getClass(), "visible", false);
        setBooleanField(term198967, term198967.getClass(), "enabled", false);
        setBooleanField(term198967, term198967.getClass(), "valid", false);
        setField(term198967, term198967.getClass(), "dropTarget", null);
        setField(term198967, term198967.getClass(), "popups", null);
        setField(term198967, term198967.getClass(), "name", null);
        setBooleanField(term198967, term198967.getClass(), "nameExplicitlySet", false);
        setBooleanField(term198967, term198967.getClass(), "focusable", false);
        setIntField(term198967, term198967.getClass(), "isFocusTraversableOverridden", 0);
        setField(term198967, term198967.getClass(), "focusTraversalKeys", null);
        setBooleanField(term198967, term198967.getClass(), "focusTraversalKeysEnabled", false);
        setField(term198967, term198967.getClass(), "acc", null);
        setField(term198967, term198967.getClass(), "minSize", null);
        setBooleanField(term198967, term198967.getClass(), "minSizeSet", false);
        setField(term198967, term198967.getClass(), "prefSize", null);
        setBooleanField(term198967, term198967.getClass(), "prefSizeSet", false);
        setField(term198967, term198967.getClass(), "maxSize", null);
        setBooleanField(term198967, term198967.getClass(), "maxSizeSet", false);
        setField(term198967, term198967.getClass(), "componentOrientation", null);
        setBooleanField(term198967, term198967.getClass(), "newEventsOnly", false);
        setField(term198967, term198967.getClass(), "componentListener", null);
        setField(term198967, term198967.getClass(), "focusListener", null);
        setField(term198967, term198967.getClass(), "hierarchyListener", null);
        setField(term198967, term198967.getClass(), "hierarchyBoundsListener", null);
        setField(term198967, term198967.getClass(), "keyListener", null);
        setField(term198967, term198967.getClass(), "mouseListener", null);
        setField(term198967, term198967.getClass(), "mouseMotionListener", null);
        setField(term198967, term198967.getClass(), "mouseWheelListener", null);
        setField(term198967, term198967.getClass(), "inputMethodListener", null);
        setLongField(term198967, term198967.getClass(), "eventMask", 0L);
        setField(term198967, term198967.getClass(), "changeSupport", null);
        setField(term198967, term198967.getClass(), "objectLock", null);
        setBooleanField(term198967, term198967.getClass(), "isPacked", false);
        setIntField(term198967, term198967.getClass(), "boundsOp", 0);
        setField(term198967, term198967.getClass(), "compoundShape", null);
        setField(term198967, term198967.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term198967, term198967.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term198967, term198967.getClass(), "backgroundEraseDisabled", false);
        setField(term198967, term198967.getClass(), "eventCache", null);
        setBooleanField(term198967, term198967.getClass(), "coalescingEnabled", false);
        setBooleanField(term198967, term198967.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term198967, term198967.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "effectLevelUpgrade", argTypes, term198967, args);
    }

};


