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

public class Board_effectIconChanges_129366436240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198847;

    public Board_effectIconChanges_129366436240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198847 = newInstance(Class.forName("core.Board"));
        setField(term198847, term198847.getClass(), "contentPanel", null);
        setField(term198847, term198847.getClass(), "bodyLayer", null);
        setField(term198847, term198847.getClass(), "cardLayout", null);
        setField(term198847, term198847.getClass(), "semesterActivity", null);
        setField(term198847, term198847.getClass(), "moduleActivity", null);
        setField(term198847, term198847.getClass(), "settingsUI", null);
        setField(term198847, term198847.getClass(), "transcriptActivity", null);
        setField(term198847, term198847.getClass(), "analysisActivity", null);
        setField(term198847, term198847.getClass(), "helpActivity", null);
        setField(term198847, term198847.getClass(), "about", null);
        setField(term198847, term198847.getClass(), "taskActivity", null);
        setField(term198847, term198847.getClass(), "newsPresent", null);
        setField(term198847, term198847.getClass(), "alertActivity", null);
        setIntField(term198847, term198847.getClass(), "defaultCloseOperation", 0);
        setField(term198847, term198847.getClass(), "transferHandler", null);
        setField(term198847, term198847.getClass(), "rootPane", null);
        setBooleanField(term198847, term198847.getClass(), "rootPaneCheckingEnabled", false);
        setField(term198847, term198847.getClass(), "accessibleContext", null);
        setField(term198847, term198847.getClass(), "maximizedBounds", null);
        setField(term198847, term198847.getClass(), "title", null);
        setField(term198847, term198847.getClass(), "menuBar", null);
        setBooleanField(term198847, term198847.getClass(), "resizable", false);
        setBooleanField(term198847, term198847.getClass(), "undecorated", false);
        setBooleanField(term198847, term198847.getClass(), "mbManagement", false);
        setIntField(term198847, term198847.getClass(), "state", 0);
        setField(term198847, term198847.getClass(), "ownedWindows", null);
        setIntField(term198847, term198847.getClass(), "frameSerializedDataVersion", 0);
        setField(term198847, term198847.getClass(), "warningString", null);
        setField(term198847, term198847.getClass(), "icons", null);
        setField(term198847, term198847.getClass(), "temporaryLostComponent", null);
        setBooleanField(term198847, term198847.getClass(), "syncLWRequests", false);
        setBooleanField(term198847, term198847.getClass(), "beforeFirstShow", false);
        setBooleanField(term198847, term198847.getClass(), "disposing", false);
        setField(term198847, term198847.getClass(), "disposerRecord", null);
        setBooleanField(term198847, term198847.getClass(), "alwaysOnTop", false);
        setField(term198847, term198847.getClass(), "ownedWindowList", null);
        setField(term198847, term198847.getClass(), "weakThis", null);
        setBooleanField(term198847, term198847.getClass(), "showWithParent", false);
        setField(term198847, term198847.getClass(), "modalBlocker", null);
        setField(term198847, term198847.getClass(), "modalExclusionType", null);
        setField(term198847, term198847.getClass(), "windowListener", null);
        setField(term198847, term198847.getClass(), "windowStateListener", null);
        setField(term198847, term198847.getClass(), "windowFocusListener", null);
        setField(term198847, term198847.getClass(), "inputContext", null);
        setField(term198847, term198847.getClass(), "inputContextLock", null);
        setField(term198847, term198847.getClass(), "focusMgr", null);
        setBooleanField(term198847, term198847.getClass(), "focusableWindowState", false);
        setBooleanField(term198847, term198847.getClass(), "autoRequestFocus", false);
        setBooleanField(term198847, term198847.getClass(), "isInShow", false);
        setFloatField(term198847, term198847.getClass(), "opacity", 0.0F);
        setField(term198847, term198847.getClass(), "shape", null);
        setBooleanField(term198847, term198847.getClass(), "isTrayIconWindow", false);
        setIntField(term198847, term198847.getClass(), "securityWarningWidth", 0);
        setIntField(term198847, term198847.getClass(), "securityWarningHeight", 0);
        setDoubleField(term198847, term198847.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term198847, term198847.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term198847, term198847.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term198847, term198847.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term198847, term198847.getClass(), "anchor", null);
        setField(term198847, term198847.getClass(), "type", null);
        setIntField(term198847, term198847.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term198847, term198847.getClass(), "locationByPlatform", false);
        setField(term198847, term198847.getClass(), "component", null);
        setField(term198847, term198847.getClass(), "layoutMgr", null);
        setField(term198847, term198847.getClass(), "dispatcher", null);
        setField(term198847, term198847.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term198847, term198847.getClass(), "focusCycleRoot", false);
        setBooleanField(term198847, term198847.getClass(), "focusTraversalPolicyProvider", false);
        setField(term198847, term198847.getClass(), "printingThreads", null);
        setBooleanField(term198847, term198847.getClass(), "printing", false);
        setField(term198847, term198847.getClass(), "containerListener", null);
        setIntField(term198847, term198847.getClass(), "listeningChildren", 0);
        setIntField(term198847, term198847.getClass(), "listeningBoundsChildren", 0);
        setIntField(term198847, term198847.getClass(), "descendantsCount", 0);
        setField(term198847, term198847.getClass(), "preserveBackgroundColor", null);
        setIntField(term198847, term198847.getClass(), "numOfHWComponents", 0);
        setIntField(term198847, term198847.getClass(), "numOfLWComponents", 0);
        setField(term198847, term198847.getClass(), "modalComp", null);
        setField(term198847, term198847.getClass(), "modalAppContext", null);
        setIntField(term198847, term198847.getClass(), "containerSerializedDataVersion", 0);
        setField(term198847, term198847.getClass(), "peer", null);
        setField(term198847, term198847.getClass(), "parent", null);
        setField(term198847, term198847.getClass(), "appContext", null);
        setIntField(term198847, term198847.getClass(), "x", 0);
        setIntField(term198847, term198847.getClass(), "y", 0);
        setIntField(term198847, term198847.getClass(), "width", 0);
        setIntField(term198847, term198847.getClass(), "height", 0);
        setField(term198847, term198847.getClass(), "foreground", null);
        setField(term198847, term198847.getClass(), "background", null);
        setField(term198847, term198847.getClass(), "font", null);
        setField(term198847, term198847.getClass(), "peerFont", null);
        setField(term198847, term198847.getClass(), "cursor", null);
        setField(term198847, term198847.getClass(), "locale", null);
        setField(term198847, term198847.getClass(), "graphicsConfig", null);
        setField(term198847, term198847.getClass(), "bufferStrategy", null);
        setBooleanField(term198847, term198847.getClass(), "ignoreRepaint", false);
        setBooleanField(term198847, term198847.getClass(), "visible", false);
        setBooleanField(term198847, term198847.getClass(), "enabled", false);
        setBooleanField(term198847, term198847.getClass(), "valid", false);
        setField(term198847, term198847.getClass(), "dropTarget", null);
        setField(term198847, term198847.getClass(), "popups", null);
        setField(term198847, term198847.getClass(), "name", null);
        setBooleanField(term198847, term198847.getClass(), "nameExplicitlySet", false);
        setBooleanField(term198847, term198847.getClass(), "focusable", false);
        setIntField(term198847, term198847.getClass(), "isFocusTraversableOverridden", 0);
        setField(term198847, term198847.getClass(), "focusTraversalKeys", null);
        setBooleanField(term198847, term198847.getClass(), "focusTraversalKeysEnabled", false);
        setField(term198847, term198847.getClass(), "acc", null);
        setField(term198847, term198847.getClass(), "minSize", null);
        setBooleanField(term198847, term198847.getClass(), "minSizeSet", false);
        setField(term198847, term198847.getClass(), "prefSize", null);
        setBooleanField(term198847, term198847.getClass(), "prefSizeSet", false);
        setField(term198847, term198847.getClass(), "maxSize", null);
        setBooleanField(term198847, term198847.getClass(), "maxSizeSet", false);
        setField(term198847, term198847.getClass(), "componentOrientation", null);
        setBooleanField(term198847, term198847.getClass(), "newEventsOnly", false);
        setField(term198847, term198847.getClass(), "componentListener", null);
        setField(term198847, term198847.getClass(), "focusListener", null);
        setField(term198847, term198847.getClass(), "hierarchyListener", null);
        setField(term198847, term198847.getClass(), "hierarchyBoundsListener", null);
        setField(term198847, term198847.getClass(), "keyListener", null);
        setField(term198847, term198847.getClass(), "mouseListener", null);
        setField(term198847, term198847.getClass(), "mouseMotionListener", null);
        setField(term198847, term198847.getClass(), "mouseWheelListener", null);
        setField(term198847, term198847.getClass(), "inputMethodListener", null);
        setLongField(term198847, term198847.getClass(), "eventMask", 0L);
        setField(term198847, term198847.getClass(), "changeSupport", null);
        setField(term198847, term198847.getClass(), "objectLock", null);
        setBooleanField(term198847, term198847.getClass(), "isPacked", false);
        setIntField(term198847, term198847.getClass(), "boundsOp", 0);
        setField(term198847, term198847.getClass(), "compoundShape", null);
        setField(term198847, term198847.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term198847, term198847.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term198847, term198847.getClass(), "backgroundEraseDisabled", false);
        setField(term198847, term198847.getClass(), "eventCache", null);
        setBooleanField(term198847, term198847.getClass(), "coalescingEnabled", false);
        setBooleanField(term198847, term198847.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term198847, term198847.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "effectIconChanges", argTypes, term198847, args);
    }

};


