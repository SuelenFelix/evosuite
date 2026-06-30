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

public class Board_collapse_110888769012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196116;

    public Board_collapse_110888769012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196116 = newInstance(Class.forName("core.Board"));
        setField(term196116, term196116.getClass(), "contentPanel", null);
        setField(term196116, term196116.getClass(), "bodyLayer", null);
        setField(term196116, term196116.getClass(), "cardLayout", null);
        setField(term196116, term196116.getClass(), "semesterActivity", null);
        setField(term196116, term196116.getClass(), "moduleActivity", null);
        setField(term196116, term196116.getClass(), "settingsUI", null);
        setField(term196116, term196116.getClass(), "transcriptActivity", null);
        setField(term196116, term196116.getClass(), "analysisActivity", null);
        setField(term196116, term196116.getClass(), "helpActivity", null);
        setField(term196116, term196116.getClass(), "about", null);
        setField(term196116, term196116.getClass(), "taskActivity", null);
        setField(term196116, term196116.getClass(), "newsPresent", null);
        setField(term196116, term196116.getClass(), "alertActivity", null);
        setIntField(term196116, term196116.getClass(), "defaultCloseOperation", 0);
        setField(term196116, term196116.getClass(), "transferHandler", null);
        setField(term196116, term196116.getClass(), "rootPane", null);
        setBooleanField(term196116, term196116.getClass(), "rootPaneCheckingEnabled", false);
        setField(term196116, term196116.getClass(), "accessibleContext", null);
        setField(term196116, term196116.getClass(), "maximizedBounds", null);
        setField(term196116, term196116.getClass(), "title", null);
        setField(term196116, term196116.getClass(), "menuBar", null);
        setBooleanField(term196116, term196116.getClass(), "resizable", false);
        setBooleanField(term196116, term196116.getClass(), "undecorated", false);
        setBooleanField(term196116, term196116.getClass(), "mbManagement", false);
        setIntField(term196116, term196116.getClass(), "state", 0);
        setField(term196116, term196116.getClass(), "ownedWindows", null);
        setIntField(term196116, term196116.getClass(), "frameSerializedDataVersion", 0);
        setField(term196116, term196116.getClass(), "warningString", null);
        setField(term196116, term196116.getClass(), "icons", null);
        setField(term196116, term196116.getClass(), "temporaryLostComponent", null);
        setBooleanField(term196116, term196116.getClass(), "syncLWRequests", false);
        setBooleanField(term196116, term196116.getClass(), "beforeFirstShow", false);
        setBooleanField(term196116, term196116.getClass(), "disposing", false);
        setField(term196116, term196116.getClass(), "disposerRecord", null);
        setBooleanField(term196116, term196116.getClass(), "alwaysOnTop", false);
        setField(term196116, term196116.getClass(), "ownedWindowList", null);
        setField(term196116, term196116.getClass(), "weakThis", null);
        setBooleanField(term196116, term196116.getClass(), "showWithParent", false);
        setField(term196116, term196116.getClass(), "modalBlocker", null);
        setField(term196116, term196116.getClass(), "modalExclusionType", null);
        setField(term196116, term196116.getClass(), "windowListener", null);
        setField(term196116, term196116.getClass(), "windowStateListener", null);
        setField(term196116, term196116.getClass(), "windowFocusListener", null);
        setField(term196116, term196116.getClass(), "inputContext", null);
        setField(term196116, term196116.getClass(), "inputContextLock", null);
        setField(term196116, term196116.getClass(), "focusMgr", null);
        setBooleanField(term196116, term196116.getClass(), "focusableWindowState", false);
        setBooleanField(term196116, term196116.getClass(), "autoRequestFocus", false);
        setBooleanField(term196116, term196116.getClass(), "isInShow", false);
        setFloatField(term196116, term196116.getClass(), "opacity", 0.0F);
        setField(term196116, term196116.getClass(), "shape", null);
        setBooleanField(term196116, term196116.getClass(), "isTrayIconWindow", false);
        setIntField(term196116, term196116.getClass(), "securityWarningWidth", 0);
        setIntField(term196116, term196116.getClass(), "securityWarningHeight", 0);
        setDoubleField(term196116, term196116.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term196116, term196116.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term196116, term196116.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term196116, term196116.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term196116, term196116.getClass(), "anchor", null);
        setField(term196116, term196116.getClass(), "type", null);
        setIntField(term196116, term196116.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term196116, term196116.getClass(), "locationByPlatform", false);
        setField(term196116, term196116.getClass(), "component", null);
        setField(term196116, term196116.getClass(), "layoutMgr", null);
        setField(term196116, term196116.getClass(), "dispatcher", null);
        setField(term196116, term196116.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term196116, term196116.getClass(), "focusCycleRoot", false);
        setBooleanField(term196116, term196116.getClass(), "focusTraversalPolicyProvider", false);
        setField(term196116, term196116.getClass(), "printingThreads", null);
        setBooleanField(term196116, term196116.getClass(), "printing", false);
        setField(term196116, term196116.getClass(), "containerListener", null);
        setIntField(term196116, term196116.getClass(), "listeningChildren", 0);
        setIntField(term196116, term196116.getClass(), "listeningBoundsChildren", 0);
        setIntField(term196116, term196116.getClass(), "descendantsCount", 0);
        setField(term196116, term196116.getClass(), "preserveBackgroundColor", null);
        setIntField(term196116, term196116.getClass(), "numOfHWComponents", 0);
        setIntField(term196116, term196116.getClass(), "numOfLWComponents", 0);
        setField(term196116, term196116.getClass(), "modalComp", null);
        setField(term196116, term196116.getClass(), "modalAppContext", null);
        setIntField(term196116, term196116.getClass(), "containerSerializedDataVersion", 0);
        setField(term196116, term196116.getClass(), "peer", null);
        setField(term196116, term196116.getClass(), "parent", null);
        setField(term196116, term196116.getClass(), "appContext", null);
        setIntField(term196116, term196116.getClass(), "x", 0);
        setIntField(term196116, term196116.getClass(), "y", 0);
        setIntField(term196116, term196116.getClass(), "width", 0);
        setIntField(term196116, term196116.getClass(), "height", 0);
        setField(term196116, term196116.getClass(), "foreground", null);
        setField(term196116, term196116.getClass(), "background", null);
        setField(term196116, term196116.getClass(), "font", null);
        setField(term196116, term196116.getClass(), "peerFont", null);
        setField(term196116, term196116.getClass(), "cursor", null);
        setField(term196116, term196116.getClass(), "locale", null);
        setField(term196116, term196116.getClass(), "graphicsConfig", null);
        setField(term196116, term196116.getClass(), "bufferStrategy", null);
        setBooleanField(term196116, term196116.getClass(), "ignoreRepaint", false);
        setBooleanField(term196116, term196116.getClass(), "visible", false);
        setBooleanField(term196116, term196116.getClass(), "enabled", false);
        setBooleanField(term196116, term196116.getClass(), "valid", false);
        setField(term196116, term196116.getClass(), "dropTarget", null);
        setField(term196116, term196116.getClass(), "popups", null);
        setField(term196116, term196116.getClass(), "name", null);
        setBooleanField(term196116, term196116.getClass(), "nameExplicitlySet", false);
        setBooleanField(term196116, term196116.getClass(), "focusable", false);
        setIntField(term196116, term196116.getClass(), "isFocusTraversableOverridden", 0);
        setField(term196116, term196116.getClass(), "focusTraversalKeys", null);
        setBooleanField(term196116, term196116.getClass(), "focusTraversalKeysEnabled", false);
        setField(term196116, term196116.getClass(), "acc", null);
        setField(term196116, term196116.getClass(), "minSize", null);
        setBooleanField(term196116, term196116.getClass(), "minSizeSet", false);
        setField(term196116, term196116.getClass(), "prefSize", null);
        setBooleanField(term196116, term196116.getClass(), "prefSizeSet", false);
        setField(term196116, term196116.getClass(), "maxSize", null);
        setBooleanField(term196116, term196116.getClass(), "maxSizeSet", false);
        setField(term196116, term196116.getClass(), "componentOrientation", null);
        setBooleanField(term196116, term196116.getClass(), "newEventsOnly", false);
        setField(term196116, term196116.getClass(), "componentListener", null);
        setField(term196116, term196116.getClass(), "focusListener", null);
        setField(term196116, term196116.getClass(), "hierarchyListener", null);
        setField(term196116, term196116.getClass(), "hierarchyBoundsListener", null);
        setField(term196116, term196116.getClass(), "keyListener", null);
        setField(term196116, term196116.getClass(), "mouseListener", null);
        setField(term196116, term196116.getClass(), "mouseMotionListener", null);
        setField(term196116, term196116.getClass(), "mouseWheelListener", null);
        setField(term196116, term196116.getClass(), "inputMethodListener", null);
        setLongField(term196116, term196116.getClass(), "eventMask", 0L);
        setField(term196116, term196116.getClass(), "changeSupport", null);
        setField(term196116, term196116.getClass(), "objectLock", null);
        setBooleanField(term196116, term196116.getClass(), "isPacked", false);
        setIntField(term196116, term196116.getClass(), "boundsOp", 0);
        setField(term196116, term196116.getClass(), "compoundShape", null);
        setField(term196116, term196116.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term196116, term196116.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term196116, term196116.getClass(), "backgroundEraseDisabled", false);
        setField(term196116, term196116.getClass(), "eventCache", null);
        setBooleanField(term196116, term196116.getClass(), "coalescingEnabled", false);
        setBooleanField(term196116, term196116.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term196116, term196116.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "collapse", argTypes, term196116, args);
    }

};


