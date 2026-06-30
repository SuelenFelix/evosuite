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

public class Board_completeBuild_39954113814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197140;

    public Board_completeBuild_39954113814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term197140 = newInstance(Class.forName("core.Board"));
        setField(term197140, term197140.getClass(), "contentPanel", null);
        setField(term197140, term197140.getClass(), "bodyLayer", null);
        setField(term197140, term197140.getClass(), "cardLayout", null);
        setField(term197140, term197140.getClass(), "semesterActivity", null);
        setField(term197140, term197140.getClass(), "moduleActivity", null);
        setField(term197140, term197140.getClass(), "settingsUI", null);
        setField(term197140, term197140.getClass(), "transcriptActivity", null);
        setField(term197140, term197140.getClass(), "analysisActivity", null);
        setField(term197140, term197140.getClass(), "helpActivity", null);
        setField(term197140, term197140.getClass(), "about", null);
        setField(term197140, term197140.getClass(), "taskActivity", null);
        setField(term197140, term197140.getClass(), "newsPresent", null);
        setField(term197140, term197140.getClass(), "alertActivity", null);
        setIntField(term197140, term197140.getClass(), "defaultCloseOperation", 0);
        setField(term197140, term197140.getClass(), "transferHandler", null);
        setField(term197140, term197140.getClass(), "rootPane", null);
        setBooleanField(term197140, term197140.getClass(), "rootPaneCheckingEnabled", false);
        setField(term197140, term197140.getClass(), "accessibleContext", null);
        setField(term197140, term197140.getClass(), "maximizedBounds", null);
        setField(term197140, term197140.getClass(), "title", null);
        setField(term197140, term197140.getClass(), "menuBar", null);
        setBooleanField(term197140, term197140.getClass(), "resizable", false);
        setBooleanField(term197140, term197140.getClass(), "undecorated", false);
        setBooleanField(term197140, term197140.getClass(), "mbManagement", false);
        setIntField(term197140, term197140.getClass(), "state", 0);
        setField(term197140, term197140.getClass(), "ownedWindows", null);
        setIntField(term197140, term197140.getClass(), "frameSerializedDataVersion", 0);
        setField(term197140, term197140.getClass(), "warningString", null);
        setField(term197140, term197140.getClass(), "icons", null);
        setField(term197140, term197140.getClass(), "temporaryLostComponent", null);
        setBooleanField(term197140, term197140.getClass(), "syncLWRequests", false);
        setBooleanField(term197140, term197140.getClass(), "beforeFirstShow", false);
        setBooleanField(term197140, term197140.getClass(), "disposing", false);
        setField(term197140, term197140.getClass(), "disposerRecord", null);
        setBooleanField(term197140, term197140.getClass(), "alwaysOnTop", false);
        setField(term197140, term197140.getClass(), "ownedWindowList", null);
        setField(term197140, term197140.getClass(), "weakThis", null);
        setBooleanField(term197140, term197140.getClass(), "showWithParent", false);
        setField(term197140, term197140.getClass(), "modalBlocker", null);
        setField(term197140, term197140.getClass(), "modalExclusionType", null);
        setField(term197140, term197140.getClass(), "windowListener", null);
        setField(term197140, term197140.getClass(), "windowStateListener", null);
        setField(term197140, term197140.getClass(), "windowFocusListener", null);
        setField(term197140, term197140.getClass(), "inputContext", null);
        setField(term197140, term197140.getClass(), "inputContextLock", null);
        setField(term197140, term197140.getClass(), "focusMgr", null);
        setBooleanField(term197140, term197140.getClass(), "focusableWindowState", false);
        setBooleanField(term197140, term197140.getClass(), "autoRequestFocus", false);
        setBooleanField(term197140, term197140.getClass(), "isInShow", false);
        setFloatField(term197140, term197140.getClass(), "opacity", 0.0F);
        setField(term197140, term197140.getClass(), "shape", null);
        setBooleanField(term197140, term197140.getClass(), "isTrayIconWindow", false);
        setIntField(term197140, term197140.getClass(), "securityWarningWidth", 0);
        setIntField(term197140, term197140.getClass(), "securityWarningHeight", 0);
        setDoubleField(term197140, term197140.getClass(), "securityWarningPointX", 0.0);
        setDoubleField(term197140, term197140.getClass(), "securityWarningPointY", 0.0);
        setFloatField(term197140, term197140.getClass(), "securityWarningAlignmentX", 0.0F);
        setFloatField(term197140, term197140.getClass(), "securityWarningAlignmentY", 0.0F);
        setField(term197140, term197140.getClass(), "anchor", null);
        setField(term197140, term197140.getClass(), "type", null);
        setIntField(term197140, term197140.getClass(), "windowSerializedDataVersion", 0);
        setBooleanField(term197140, term197140.getClass(), "locationByPlatform", false);
        setField(term197140, term197140.getClass(), "component", null);
        setField(term197140, term197140.getClass(), "layoutMgr", null);
        setField(term197140, term197140.getClass(), "dispatcher", null);
        setField(term197140, term197140.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term197140, term197140.getClass(), "focusCycleRoot", false);
        setBooleanField(term197140, term197140.getClass(), "focusTraversalPolicyProvider", false);
        setField(term197140, term197140.getClass(), "printingThreads", null);
        setBooleanField(term197140, term197140.getClass(), "printing", false);
        setField(term197140, term197140.getClass(), "containerListener", null);
        setIntField(term197140, term197140.getClass(), "listeningChildren", 0);
        setIntField(term197140, term197140.getClass(), "listeningBoundsChildren", 0);
        setIntField(term197140, term197140.getClass(), "descendantsCount", 0);
        setField(term197140, term197140.getClass(), "preserveBackgroundColor", null);
        setIntField(term197140, term197140.getClass(), "numOfHWComponents", 0);
        setIntField(term197140, term197140.getClass(), "numOfLWComponents", 0);
        setField(term197140, term197140.getClass(), "modalComp", null);
        setField(term197140, term197140.getClass(), "modalAppContext", null);
        setIntField(term197140, term197140.getClass(), "containerSerializedDataVersion", 0);
        setField(term197140, term197140.getClass(), "peer", null);
        setField(term197140, term197140.getClass(), "parent", null);
        setField(term197140, term197140.getClass(), "appContext", null);
        setIntField(term197140, term197140.getClass(), "x", 0);
        setIntField(term197140, term197140.getClass(), "y", 0);
        setIntField(term197140, term197140.getClass(), "width", 0);
        setIntField(term197140, term197140.getClass(), "height", 0);
        setField(term197140, term197140.getClass(), "foreground", null);
        setField(term197140, term197140.getClass(), "background", null);
        setField(term197140, term197140.getClass(), "font", null);
        setField(term197140, term197140.getClass(), "peerFont", null);
        setField(term197140, term197140.getClass(), "cursor", null);
        setField(term197140, term197140.getClass(), "locale", null);
        setField(term197140, term197140.getClass(), "graphicsConfig", null);
        setField(term197140, term197140.getClass(), "bufferStrategy", null);
        setBooleanField(term197140, term197140.getClass(), "ignoreRepaint", false);
        setBooleanField(term197140, term197140.getClass(), "visible", false);
        setBooleanField(term197140, term197140.getClass(), "enabled", false);
        setBooleanField(term197140, term197140.getClass(), "valid", false);
        setField(term197140, term197140.getClass(), "dropTarget", null);
        setField(term197140, term197140.getClass(), "popups", null);
        setField(term197140, term197140.getClass(), "name", null);
        setBooleanField(term197140, term197140.getClass(), "nameExplicitlySet", false);
        setBooleanField(term197140, term197140.getClass(), "focusable", false);
        setIntField(term197140, term197140.getClass(), "isFocusTraversableOverridden", 0);
        setField(term197140, term197140.getClass(), "focusTraversalKeys", null);
        setBooleanField(term197140, term197140.getClass(), "focusTraversalKeysEnabled", false);
        setField(term197140, term197140.getClass(), "acc", null);
        setField(term197140, term197140.getClass(), "minSize", null);
        setBooleanField(term197140, term197140.getClass(), "minSizeSet", false);
        setField(term197140, term197140.getClass(), "prefSize", null);
        setBooleanField(term197140, term197140.getClass(), "prefSizeSet", false);
        setField(term197140, term197140.getClass(), "maxSize", null);
        setBooleanField(term197140, term197140.getClass(), "maxSizeSet", false);
        setField(term197140, term197140.getClass(), "componentOrientation", null);
        setBooleanField(term197140, term197140.getClass(), "newEventsOnly", false);
        setField(term197140, term197140.getClass(), "componentListener", null);
        setField(term197140, term197140.getClass(), "focusListener", null);
        setField(term197140, term197140.getClass(), "hierarchyListener", null);
        setField(term197140, term197140.getClass(), "hierarchyBoundsListener", null);
        setField(term197140, term197140.getClass(), "keyListener", null);
        setField(term197140, term197140.getClass(), "mouseListener", null);
        setField(term197140, term197140.getClass(), "mouseMotionListener", null);
        setField(term197140, term197140.getClass(), "mouseWheelListener", null);
        setField(term197140, term197140.getClass(), "inputMethodListener", null);
        setLongField(term197140, term197140.getClass(), "eventMask", 0L);
        setField(term197140, term197140.getClass(), "changeSupport", null);
        setField(term197140, term197140.getClass(), "objectLock", null);
        setBooleanField(term197140, term197140.getClass(), "isPacked", false);
        setIntField(term197140, term197140.getClass(), "boundsOp", 0);
        setField(term197140, term197140.getClass(), "compoundShape", null);
        setField(term197140, term197140.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term197140, term197140.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term197140, term197140.getClass(), "backgroundEraseDisabled", false);
        setField(term197140, term197140.getClass(), "eventCache", null);
        setBooleanField(term197140, term197140.getClass(), "coalescingEnabled", false);
        setBooleanField(term197140, term197140.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term197140, term197140.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.Board");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "completeBuild", argTypes, term197140, args);
    }

};


