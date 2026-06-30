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

public class Board_effectNotificationToolTip_22941318339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198787;

    public Board_effectNotificationToolTip_22941318339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198787 = newInstance(Class.forName("core.Board"));
        setField(term198787, term198787.getClass(), "contentPanel", null);
        setField(term198787, term198787.getClass(), "bodyLayer", null);
        setField(term198787, term198787.getClass(), "cardLayout", null);
        setField(term198787, term198787.getClass(), "semesterActivity", null);
        setField(term198787, term198787.getClass(), "moduleActivity", null);
        setField(term198787, term198787.getClass(), "settingsUI", null);
        setField(term198787, term198787.getClass(), "transcriptActivity", null);
        setField(term198787, term198787.getClass(), "analysisActivity", null);
        setField(term198787, term198787.getClass(), "helpActivity", null);
        setField(term198787, term198787.getClass(), "about", null);
        setField(term198787, term198787.getClass(), "taskActivity", null);
        setField(term198787, term198787.getClass(), "newsPresent", null);
        setField(term198787, term198787.getClass(), "alertActivity", null);
        setIntField(term198787, term198787.getClass(), "defaultCloseOperation", 0);
        setField(term198787, term198787.getClass(), "transferHandler", null);
        setField(term198787, term198787.getClass(), "rootPane", null);
        setBooleanField(term198787, term198787.getClass(), "rootPaneCheckingEnabled", false);
        setField(term198787, term198787.getClass(), "accessibleContext", null);
        setField(term198787, term198787.getClass(), "maximizedBounds", null);
        setField(term198787, term198787.getClass(), "title", null);
        setField(term198787, term198787.getClass(), "menuBar", null);
        setBooleanField(term198787, term198787.getClass(), "resizable", false);
        setBooleanField(term198787, term198787.getClass(), "undecorated", false);
        setBooleanField(term198787, term198787.getClass(), "mbManagement", false);
        setIntField(term198787, term198787.getClass(), "state", 0);
        setField(term198787, term198787.getClass(), "ownedWindows", null);
        setIntField(term198787, term198787.getClass(), "frameSerializedDataVersion", 0);
        setField(term198787, term198787.getClass(), "warningString", null);
        setField(term198787, term198787.getClass(), "icons", null);
        setField(term198787, term198787.getClass(), "temporaryLostComponent", null);
        setBooleanField(term198787, term198787.getClass(), "syncLWRequests", false);
        setBooleanField(term198787, term198787.getClass(), "beforeFirstShow", false);
        setBooleanField(term198787, term198787.getClass(), "disposing", false);
        setField(term198787, term198787.getClass(), "disposerRecord", null);
        setBooleanField(term198787, term198787.getClass(), "alwaysOnTop", false);
        setField(term198787, term198787.getClass(), "ownedWindowList", null);
        setField(term198787, term198787.getClass(), "weakThis", null);
        setBooleanField(term198787, term198787.getClass(), "showWithParent", false);
        setField(term198787, term198787.getClass(), "modalBlocker", null);
        setField(term198787, term198787.getClass(), "modalExclusionType", null);
        setField(term198787, term198787.getClass(), "windowListener", null);
        setField(term198787, term198787.getClass(), "windowStateListener", null);
        setField(term198787, term198787.getClass(), "windowFocusListener", null);
        setField(term198787, term198787.getClass(), "inputContext", null);
        setField(term198787, term198787.getClass(), "inputContextLock", null);
        setField(term198787, term198787.getClass(), "focusMgr", null);
        setBooleanField(term198787, term198787.getClass(), "focusableWindowState", false);
        setBooleanField(term198787, term198787.getClass(), "autoRequestFocus", false);
        setBooleanField(term198787, term198787.getClass(), "isInShow", false);
        setFloatField(term198787, term198787.getClass(), "opacity", 0.0F);
        setField(term198787, term198787.getClass(), "shape", null);
        setBooleanField(term198787, term198787.getClass(), "isTrayIconWindow", false);
        setIntField(term198787, term198787.getClass(), "securityWarningWidth", 0);
        setIntField(term198787, term198787.getClass(), "securityWarningHeight", 0);
        setDoubleField(term198787, term198787.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term198787, term198787.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term198787, term198787.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term198787, term198787.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term198787, term198787.getClass(), "anchor", null);
        setField(term198787, term198787.getClass(), "type", null);
        setIntField(term198787, term198787.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term198787, term198787.getClass(), "locationByPlatform", false);
        setField(term198787, term198787.getClass(), "component", null);
        setField(term198787, term198787.getClass(), "layoutMgr", null);
        setField(term198787, term198787.getClass(), "dispatcher", null);
        setField(term198787, term198787.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term198787, term198787.getClass(), "focusCycleRoot", false);
        setBooleanField(term198787, term198787.getClass(), "focusTraversalPolicyProvider", false);
        setField(term198787, term198787.getClass(), "printingThreads", null);
        setBooleanField(term198787, term198787.getClass(), "printing", false);
        setField(term198787, term198787.getClass(), "containerListener", null);
        setIntField(term198787, term198787.getClass(), "listeningChildren", 0);
        setIntField(term198787, term198787.getClass(), "listeningBoundsChildren", 0);
        setIntField(term198787, term198787.getClass(), "descendantsCount", 0);
        setField(term198787, term198787.getClass(), "preserveBackgroundColor", null);
        setIntField(term198787, term198787.getClass(), "numOfHWComponents", 0);
        setIntField(term198787, term198787.getClass(), "numOfLWComponents", 0);
        setField(term198787, term198787.getClass(), "modalComp", null);
        setField(term198787, term198787.getClass(), "modalAppContext", null);
        setIntField(term198787, term198787.getClass(), "containerSerializedDataVersion", 0);
        setField(term198787, term198787.getClass(), "peer", null);
        setField(term198787, term198787.getClass(), "parent", null);
        setField(term198787, term198787.getClass(), "appContext", null);
        setIntField(term198787, term198787.getClass(), "x", 0);
        setIntField(term198787, term198787.getClass(), "y", 0);
        setIntField(term198787, term198787.getClass(), "width", 0);
        setIntField(term198787, term198787.getClass(), "height", 0);
        setField(term198787, term198787.getClass(), "foreground", null);
        setField(term198787, term198787.getClass(), "background", null);
        setField(term198787, term198787.getClass(), "font", null);
        setField(term198787, term198787.getClass(), "peerFont", null);
        setField(term198787, term198787.getClass(), "cursor", null);
        setField(term198787, term198787.getClass(), "locale", null);
        setField(term198787, term198787.getClass(), "graphicsConfig", null);
        setField(term198787, term198787.getClass(), "bufferStrategy", null);
        setBooleanField(term198787, term198787.getClass(), "ignoreRepaint", false);
        setBooleanField(term198787, term198787.getClass(), "visible", false);
        setBooleanField(term198787, term198787.getClass(), "enabled", false);
        setBooleanField(term198787, term198787.getClass(), "valid", false);
        setField(term198787, term198787.getClass(), "dropTarget", null);
        setField(term198787, term198787.getClass(), "popups", null);
        setField(term198787, term198787.getClass(), "name", null);
        setBooleanField(term198787, term198787.getClass(), "nameExplicitlySet", false);
        setBooleanField(term198787, term198787.getClass(), "focusable", false);
        setIntField(term198787, term198787.getClass(), "isFocusTraversableOverridden", 0);
        setField(term198787, term198787.getClass(), "focusTraversalKeys", null);
        setBooleanField(term198787, term198787.getClass(), "focusTraversalKeysEnabled", false);
        setField(term198787, term198787.getClass(), "acc", null);
        setField(term198787, term198787.getClass(), "minSize", null);
        setBooleanField(term198787, term198787.getClass(), "minSizeSet", false);
        setField(term198787, term198787.getClass(), "prefSize", null);
        setBooleanField(term198787, term198787.getClass(), "prefSizeSet", false);
        setField(term198787, term198787.getClass(), "maxSize", null);
        setBooleanField(term198787, term198787.getClass(), "maxSizeSet", false);
        setField(term198787, term198787.getClass(), "componentOrientation", null);
        setBooleanField(term198787, term198787.getClass(), "newEventsOnly", false);
        setField(term198787, term198787.getClass(), "componentListener", null);
        setField(term198787, term198787.getClass(), "focusListener", null);
        setField(term198787, term198787.getClass(), "hierarchyListener", null);
        setField(term198787, term198787.getClass(), "hierarchyBoundsListener", null);
        setField(term198787, term198787.getClass(), "keyListener", null);
        setField(term198787, term198787.getClass(), "mouseListener", null);
        setField(term198787, term198787.getClass(), "mouseMotionListener", null);
        setField(term198787, term198787.getClass(), "mouseWheelListener", null);
        setField(term198787, term198787.getClass(), "inputMethodListener", null);
        setLongField(term198787, term198787.getClass(), "eventMask", 0L);
        setField(term198787, term198787.getClass(), "changeSupport", null);
        setField(term198787, term198787.getClass(), "objectLock", null);
        setBooleanField(term198787, term198787.getClass(), "isPacked", false);
        setIntField(term198787, term198787.getClass(), "boundsOp", 0);
        setField(term198787, term198787.getClass(), "compoundShape", null);
        setField(term198787, term198787.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term198787, term198787.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term198787, term198787.getClass(), "backgroundEraseDisabled", false);
        setField(term198787, term198787.getClass(), "eventCache", null);
        setBooleanField(term198787, term198787.getClass(), "coalescingEnabled", false);
        setBooleanField(term198787, term198787.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term198787, term198787.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "effectNotificationToolTip", argTypes, term198787, args);
    }

};


