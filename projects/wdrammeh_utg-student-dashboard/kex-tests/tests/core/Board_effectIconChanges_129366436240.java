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
     Object term198833;

    public Board_effectIconChanges_129366436240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198833 = newInstance(Class.forName("core.Board"));
        setField(term198833, term198833.getClass(), "contentPanel", null);
        setField(term198833, term198833.getClass(), "bodyLayer", null);
        setField(term198833, term198833.getClass(), "cardLayout", null);
        setField(term198833, term198833.getClass(), "semesterActivity", null);
        setField(term198833, term198833.getClass(), "moduleActivity", null);
        setField(term198833, term198833.getClass(), "settingsUI", null);
        setField(term198833, term198833.getClass(), "transcriptActivity", null);
        setField(term198833, term198833.getClass(), "analysisActivity", null);
        setField(term198833, term198833.getClass(), "helpActivity", null);
        setField(term198833, term198833.getClass(), "about", null);
        setField(term198833, term198833.getClass(), "taskActivity", null);
        setField(term198833, term198833.getClass(), "newsPresent", null);
        setField(term198833, term198833.getClass(), "alertActivity", null);
        setIntField(term198833, term198833.getClass(), "defaultCloseOperation", 0);
        setField(term198833, term198833.getClass(), "transferHandler", null);
        setField(term198833, term198833.getClass(), "rootPane", null);
        setBooleanField(term198833, term198833.getClass(), "rootPaneCheckingEnabled", false);
        setField(term198833, term198833.getClass(), "accessibleContext", null);
        setField(term198833, term198833.getClass(), "maximizedBounds", null);
        setField(term198833, term198833.getClass(), "title", null);
        setField(term198833, term198833.getClass(), "menuBar", null);
        setBooleanField(term198833, term198833.getClass(), "resizable", false);
        setBooleanField(term198833, term198833.getClass(), "undecorated", false);
        setBooleanField(term198833, term198833.getClass(), "mbManagement", false);
        setIntField(term198833, term198833.getClass(), "state", 0);
        setField(term198833, term198833.getClass(), "ownedWindows", null);
        setIntField(term198833, term198833.getClass(), "frameSerializedDataVersion", 0);
        setField(term198833, term198833.getClass(), "warningString", null);
        setField(term198833, term198833.getClass(), "icons", null);
        setField(term198833, term198833.getClass(), "temporaryLostComponent", null);
        setBooleanField(term198833, term198833.getClass(), "syncLWRequests", false);
        setBooleanField(term198833, term198833.getClass(), "beforeFirstShow", false);
        setBooleanField(term198833, term198833.getClass(), "disposing", false);
        setField(term198833, term198833.getClass(), "disposerRecord", null);
        setBooleanField(term198833, term198833.getClass(), "alwaysOnTop", false);
        setField(term198833, term198833.getClass(), "ownedWindowList", null);
        setField(term198833, term198833.getClass(), "weakThis", null);
        setBooleanField(term198833, term198833.getClass(), "showWithParent", false);
        setField(term198833, term198833.getClass(), "modalBlocker", null);
        setField(term198833, term198833.getClass(), "modalExclusionType", null);
        setField(term198833, term198833.getClass(), "windowListener", null);
        setField(term198833, term198833.getClass(), "windowStateListener", null);
        setField(term198833, term198833.getClass(), "windowFocusListener", null);
        setField(term198833, term198833.getClass(), "inputContext", null);
        setField(term198833, term198833.getClass(), "inputContextLock", null);
        setField(term198833, term198833.getClass(), "focusMgr", null);
        setBooleanField(term198833, term198833.getClass(), "focusableWindowState", false);
        setBooleanField(term198833, term198833.getClass(), "autoRequestFocus", false);
        setBooleanField(term198833, term198833.getClass(), "isInShow", false);
        setFloatField(term198833, term198833.getClass(), "opacity", 0.0F);
        setField(term198833, term198833.getClass(), "shape", null);
        setBooleanField(term198833, term198833.getClass(), "isTrayIconWindow", false);
        setIntField(term198833, term198833.getClass(), "securityWarningWidth", 0);
        setIntField(term198833, term198833.getClass(), "securityWarningHeight", 0);
        setDoubleField(term198833, term198833.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term198833, term198833.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term198833, term198833.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term198833, term198833.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term198833, term198833.getClass(), "anchor", null);
        setField(term198833, term198833.getClass(), "type", null);
        setIntField(term198833, term198833.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term198833, term198833.getClass(), "locationByPlatform", false);
        setField(term198833, term198833.getClass(), "component", null);
        setField(term198833, term198833.getClass(), "layoutMgr", null);
        setField(term198833, term198833.getClass(), "dispatcher", null);
        setField(term198833, term198833.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term198833, term198833.getClass(), "focusCycleRoot", false);
        setBooleanField(term198833, term198833.getClass(), "focusTraversalPolicyProvider", false);
        setField(term198833, term198833.getClass(), "printingThreads", null);
        setBooleanField(term198833, term198833.getClass(), "printing", false);
        setField(term198833, term198833.getClass(), "containerListener", null);
        setIntField(term198833, term198833.getClass(), "listeningChildren", 0);
        setIntField(term198833, term198833.getClass(), "listeningBoundsChildren", 0);
        setIntField(term198833, term198833.getClass(), "descendantsCount", 0);
        setField(term198833, term198833.getClass(), "preserveBackgroundColor", null);
        setIntField(term198833, term198833.getClass(), "numOfHWComponents", 0);
        setIntField(term198833, term198833.getClass(), "numOfLWComponents", 0);
        setField(term198833, term198833.getClass(), "modalComp", null);
        setField(term198833, term198833.getClass(), "modalAppContext", null);
        setIntField(term198833, term198833.getClass(), "containerSerializedDataVersion", 0);
        setField(term198833, term198833.getClass(), "peer", null);
        setField(term198833, term198833.getClass(), "parent", null);
        setField(term198833, term198833.getClass(), "appContext", null);
        setIntField(term198833, term198833.getClass(), "x", 0);
        setIntField(term198833, term198833.getClass(), "y", 0);
        setIntField(term198833, term198833.getClass(), "width", 0);
        setIntField(term198833, term198833.getClass(), "height", 0);
        setField(term198833, term198833.getClass(), "foreground", null);
        setField(term198833, term198833.getClass(), "background", null);
        setField(term198833, term198833.getClass(), "font", null);
        setField(term198833, term198833.getClass(), "peerFont", null);
        setField(term198833, term198833.getClass(), "cursor", null);
        setField(term198833, term198833.getClass(), "locale", null);
        setField(term198833, term198833.getClass(), "graphicsConfig", null);
        setField(term198833, term198833.getClass(), "bufferStrategy", null);
        setBooleanField(term198833, term198833.getClass(), "ignoreRepaint", false);
        setBooleanField(term198833, term198833.getClass(), "visible", false);
        setBooleanField(term198833, term198833.getClass(), "enabled", false);
        setBooleanField(term198833, term198833.getClass(), "valid", false);
        setField(term198833, term198833.getClass(), "dropTarget", null);
        setField(term198833, term198833.getClass(), "popups", null);
        setField(term198833, term198833.getClass(), "name", null);
        setBooleanField(term198833, term198833.getClass(), "nameExplicitlySet", false);
        setBooleanField(term198833, term198833.getClass(), "focusable", false);
        setIntField(term198833, term198833.getClass(), "isFocusTraversableOverridden", 0);
        setField(term198833, term198833.getClass(), "focusTraversalKeys", null);
        setBooleanField(term198833, term198833.getClass(), "focusTraversalKeysEnabled", false);
        setField(term198833, term198833.getClass(), "acc", null);
        setField(term198833, term198833.getClass(), "minSize", null);
        setBooleanField(term198833, term198833.getClass(), "minSizeSet", false);
        setField(term198833, term198833.getClass(), "prefSize", null);
        setBooleanField(term198833, term198833.getClass(), "prefSizeSet", false);
        setField(term198833, term198833.getClass(), "maxSize", null);
        setBooleanField(term198833, term198833.getClass(), "maxSizeSet", false);
        setField(term198833, term198833.getClass(), "componentOrientation", null);
        setBooleanField(term198833, term198833.getClass(), "newEventsOnly", false);
        setField(term198833, term198833.getClass(), "componentListener", null);
        setField(term198833, term198833.getClass(), "focusListener", null);
        setField(term198833, term198833.getClass(), "hierarchyListener", null);
        setField(term198833, term198833.getClass(), "hierarchyBoundsListener", null);
        setField(term198833, term198833.getClass(), "keyListener", null);
        setField(term198833, term198833.getClass(), "mouseListener", null);
        setField(term198833, term198833.getClass(), "mouseMotionListener", null);
        setField(term198833, term198833.getClass(), "mouseWheelListener", null);
        setField(term198833, term198833.getClass(), "inputMethodListener", null);
        setLongField(term198833, term198833.getClass(), "eventMask", 0L);
        setField(term198833, term198833.getClass(), "changeSupport", null);
        setField(term198833, term198833.getClass(), "objectLock", null);
        setBooleanField(term198833, term198833.getClass(), "isPacked", false);
        setIntField(term198833, term198833.getClass(), "boundsOp", 0);
        setField(term198833, term198833.getClass(), "compoundShape", null);
        setField(term198833, term198833.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term198833, term198833.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term198833, term198833.getClass(), "backgroundEraseDisabled", false);
        setField(term198833, term198833.getClass(), "eventCache", null);
        setBooleanField(term198833, term198833.getClass(), "coalescingEnabled", false);
        setBooleanField(term198833, term198833.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term198833, term198833.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "effectIconChanges", argTypes, term198833, args);
    }

};


