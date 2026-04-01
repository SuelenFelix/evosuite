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
     Object term198953;

    public Board_effectLevelUpgrade_153118618242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198953 = newInstance(Class.forName("core.Board"));
        setField(term198953, term198953.getClass(), "contentPanel", null);
        setField(term198953, term198953.getClass(), "bodyLayer", null);
        setField(term198953, term198953.getClass(), "cardLayout", null);
        setField(term198953, term198953.getClass(), "semesterActivity", null);
        setField(term198953, term198953.getClass(), "moduleActivity", null);
        setField(term198953, term198953.getClass(), "settingsUI", null);
        setField(term198953, term198953.getClass(), "transcriptActivity", null);
        setField(term198953, term198953.getClass(), "analysisActivity", null);
        setField(term198953, term198953.getClass(), "helpActivity", null);
        setField(term198953, term198953.getClass(), "about", null);
        setField(term198953, term198953.getClass(), "taskActivity", null);
        setField(term198953, term198953.getClass(), "newsPresent", null);
        setField(term198953, term198953.getClass(), "alertActivity", null);
        setIntField(term198953, term198953.getClass(), "defaultCloseOperation", 0);
        setField(term198953, term198953.getClass(), "transferHandler", null);
        setField(term198953, term198953.getClass(), "rootPane", null);
        setBooleanField(term198953, term198953.getClass(), "rootPaneCheckingEnabled", false);
        setField(term198953, term198953.getClass(), "accessibleContext", null);
        setField(term198953, term198953.getClass(), "maximizedBounds", null);
        setField(term198953, term198953.getClass(), "title", null);
        setField(term198953, term198953.getClass(), "menuBar", null);
        setBooleanField(term198953, term198953.getClass(), "resizable", false);
        setBooleanField(term198953, term198953.getClass(), "undecorated", false);
        setBooleanField(term198953, term198953.getClass(), "mbManagement", false);
        setIntField(term198953, term198953.getClass(), "state", 0);
        setField(term198953, term198953.getClass(), "ownedWindows", null);
        setIntField(term198953, term198953.getClass(), "frameSerializedDataVersion", 0);
        setField(term198953, term198953.getClass(), "warningString", null);
        setField(term198953, term198953.getClass(), "icons", null);
        setField(term198953, term198953.getClass(), "temporaryLostComponent", null);
        setBooleanField(term198953, term198953.getClass(), "syncLWRequests", false);
        setBooleanField(term198953, term198953.getClass(), "beforeFirstShow", false);
        setBooleanField(term198953, term198953.getClass(), "disposing", false);
        setField(term198953, term198953.getClass(), "disposerRecord", null);
        setBooleanField(term198953, term198953.getClass(), "alwaysOnTop", false);
        setField(term198953, term198953.getClass(), "ownedWindowList", null);
        setField(term198953, term198953.getClass(), "weakThis", null);
        setBooleanField(term198953, term198953.getClass(), "showWithParent", false);
        setField(term198953, term198953.getClass(), "modalBlocker", null);
        setField(term198953, term198953.getClass(), "modalExclusionType", null);
        setField(term198953, term198953.getClass(), "windowListener", null);
        setField(term198953, term198953.getClass(), "windowStateListener", null);
        setField(term198953, term198953.getClass(), "windowFocusListener", null);
        setField(term198953, term198953.getClass(), "inputContext", null);
        setField(term198953, term198953.getClass(), "inputContextLock", null);
        setField(term198953, term198953.getClass(), "focusMgr", null);
        setBooleanField(term198953, term198953.getClass(), "focusableWindowState", false);
        setBooleanField(term198953, term198953.getClass(), "autoRequestFocus", false);
        setBooleanField(term198953, term198953.getClass(), "isInShow", false);
        setFloatField(term198953, term198953.getClass(), "opacity", 0.0F);
        setField(term198953, term198953.getClass(), "shape", null);
        setBooleanField(term198953, term198953.getClass(), "isTrayIconWindow", false);
        setIntField(term198953, term198953.getClass(), "securityWarningWidth", 0);
        setIntField(term198953, term198953.getClass(), "securityWarningHeight", 0);
        setDoubleField(term198953, term198953.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term198953, term198953.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term198953, term198953.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term198953, term198953.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term198953, term198953.getClass(), "anchor", null);
        setField(term198953, term198953.getClass(), "type", null);
        setIntField(term198953, term198953.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term198953, term198953.getClass(), "locationByPlatform", false);
        setField(term198953, term198953.getClass(), "component", null);
        setField(term198953, term198953.getClass(), "layoutMgr", null);
        setField(term198953, term198953.getClass(), "dispatcher", null);
        setField(term198953, term198953.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term198953, term198953.getClass(), "focusCycleRoot", false);
        setBooleanField(term198953, term198953.getClass(), "focusTraversalPolicyProvider", false);
        setField(term198953, term198953.getClass(), "printingThreads", null);
        setBooleanField(term198953, term198953.getClass(), "printing", false);
        setField(term198953, term198953.getClass(), "containerListener", null);
        setIntField(term198953, term198953.getClass(), "listeningChildren", 0);
        setIntField(term198953, term198953.getClass(), "listeningBoundsChildren", 0);
        setIntField(term198953, term198953.getClass(), "descendantsCount", 0);
        setField(term198953, term198953.getClass(), "preserveBackgroundColor", null);
        setIntField(term198953, term198953.getClass(), "numOfHWComponents", 0);
        setIntField(term198953, term198953.getClass(), "numOfLWComponents", 0);
        setField(term198953, term198953.getClass(), "modalComp", null);
        setField(term198953, term198953.getClass(), "modalAppContext", null);
        setIntField(term198953, term198953.getClass(), "containerSerializedDataVersion", 0);
        setField(term198953, term198953.getClass(), "peer", null);
        setField(term198953, term198953.getClass(), "parent", null);
        setField(term198953, term198953.getClass(), "appContext", null);
        setIntField(term198953, term198953.getClass(), "x", 0);
        setIntField(term198953, term198953.getClass(), "y", 0);
        setIntField(term198953, term198953.getClass(), "width", 0);
        setIntField(term198953, term198953.getClass(), "height", 0);
        setField(term198953, term198953.getClass(), "foreground", null);
        setField(term198953, term198953.getClass(), "background", null);
        setField(term198953, term198953.getClass(), "font", null);
        setField(term198953, term198953.getClass(), "peerFont", null);
        setField(term198953, term198953.getClass(), "cursor", null);
        setField(term198953, term198953.getClass(), "locale", null);
        setField(term198953, term198953.getClass(), "graphicsConfig", null);
        setField(term198953, term198953.getClass(), "bufferStrategy", null);
        setBooleanField(term198953, term198953.getClass(), "ignoreRepaint", false);
        setBooleanField(term198953, term198953.getClass(), "visible", false);
        setBooleanField(term198953, term198953.getClass(), "enabled", false);
        setBooleanField(term198953, term198953.getClass(), "valid", false);
        setField(term198953, term198953.getClass(), "dropTarget", null);
        setField(term198953, term198953.getClass(), "popups", null);
        setField(term198953, term198953.getClass(), "name", null);
        setBooleanField(term198953, term198953.getClass(), "nameExplicitlySet", false);
        setBooleanField(term198953, term198953.getClass(), "focusable", false);
        setIntField(term198953, term198953.getClass(), "isFocusTraversableOverridden", 0);
        setField(term198953, term198953.getClass(), "focusTraversalKeys", null);
        setBooleanField(term198953, term198953.getClass(), "focusTraversalKeysEnabled", false);
        setField(term198953, term198953.getClass(), "acc", null);
        setField(term198953, term198953.getClass(), "minSize", null);
        setBooleanField(term198953, term198953.getClass(), "minSizeSet", false);
        setField(term198953, term198953.getClass(), "prefSize", null);
        setBooleanField(term198953, term198953.getClass(), "prefSizeSet", false);
        setField(term198953, term198953.getClass(), "maxSize", null);
        setBooleanField(term198953, term198953.getClass(), "maxSizeSet", false);
        setField(term198953, term198953.getClass(), "componentOrientation", null);
        setBooleanField(term198953, term198953.getClass(), "newEventsOnly", false);
        setField(term198953, term198953.getClass(), "componentListener", null);
        setField(term198953, term198953.getClass(), "focusListener", null);
        setField(term198953, term198953.getClass(), "hierarchyListener", null);
        setField(term198953, term198953.getClass(), "hierarchyBoundsListener", null);
        setField(term198953, term198953.getClass(), "keyListener", null);
        setField(term198953, term198953.getClass(), "mouseListener", null);
        setField(term198953, term198953.getClass(), "mouseMotionListener", null);
        setField(term198953, term198953.getClass(), "mouseWheelListener", null);
        setField(term198953, term198953.getClass(), "inputMethodListener", null);
        setLongField(term198953, term198953.getClass(), "eventMask", 0L);
        setField(term198953, term198953.getClass(), "changeSupport", null);
        setField(term198953, term198953.getClass(), "objectLock", null);
        setBooleanField(term198953, term198953.getClass(), "isPacked", false);
        setIntField(term198953, term198953.getClass(), "boundsOp", 0);
        setField(term198953, term198953.getClass(), "compoundShape", null);
        setField(term198953, term198953.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term198953, term198953.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term198953, term198953.getClass(), "backgroundEraseDisabled", false);
        setField(term198953, term198953.getClass(), "eventCache", null);
        setBooleanField(term198953, term198953.getClass(), "coalescingEnabled", false);
        setBooleanField(term198953, term198953.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term198953, term198953.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "effectLevelUpgrade", argTypes, term198953, args);
    }

};


