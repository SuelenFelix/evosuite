package core.user;

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
import static core.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Student_1_createToolTip_2923821651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3367;

    public Student_1_createToolTip_2923821651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3367 = newInstance(Class.forName("core.user.Student$1"));
        setField(term3367, term3367.getClass(), "dialogTitle", null);
        setField(term3367, term3367.getClass(), "approveButtonText", null);
        setField(term3367, term3367.getClass(), "approveButtonToolTipText", null);
        setIntField(term3367, term3367.getClass(), "approveButtonMnemonic", 0);
        setField(term3367, term3367.getClass(), "filters", null);
        setField(term3367, term3367.getClass(), "dialog", null);
        setIntField(term3367, term3367.getClass(), "dialogType", 0);
        setIntField(term3367, term3367.getClass(), "returnValue", 0);
        setField(term3367, term3367.getClass(), "accessory", null);
        setField(term3367, term3367.getClass(), "fileView", null);
        setBooleanField(term3367, term3367.getClass(), "controlsShown", false);
        setBooleanField(term3367, term3367.getClass(), "useFileHiding", false);
        setField(term3367, term3367.getClass(), "showFilesListener", null);
        setIntField(term3367, term3367.getClass(), "fileSelectionMode", 0);
        setBooleanField(term3367, term3367.getClass(), "multiSelectionEnabled", false);
        setBooleanField(term3367, term3367.getClass(), "useAcceptAllFileFilter", false);
        setBooleanField(term3367, term3367.getClass(), "dragEnabled", false);
        setField(term3367, term3367.getClass(), "fileFilter", null);
        setField(term3367, term3367.getClass(), "fileSystemView", null);
        setField(term3367, term3367.getClass(), "currentDirectory", null);
        setField(term3367, term3367.getClass(), "selectedFile", null);
        setField(term3367, term3367.getClass(), "selectedFiles", null);
        setField(term3367, term3367.getClass(), "accessibleContext", null);
        setBooleanField(term3367, term3367.getClass(), "isAlignmentXSet", false);
        setFloatField(term3367, term3367.getClass(), "alignmentX", 0.0F);
        setBooleanField(term3367, term3367.getClass(), "isAlignmentYSet", false);
        setFloatField(term3367, term3367.getClass(), "alignmentY", 0.0F);
        setField(term3367, term3367.getClass(), "ui", null);
        setField(term3367, term3367.getClass(), "listenerList", null);
        setField(term3367, term3367.getClass(), "clientProperties", null);
        setField(term3367, term3367.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term3367, term3367.getClass(), "autoscrolls", false);
        setField(term3367, term3367.getClass(), "border", null);
        setIntField(term3367, term3367.getClass(), "flags", 0);
        setField(term3367, term3367.getClass(), "inputVerifier", null);
        setBooleanField(term3367, term3367.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term3367, term3367.getClass(), "paintingChild", null);
        setField(term3367, term3367.getClass(), "popupMenu", null);
        setField(term3367, term3367.getClass(), "revalidateRunnableScheduled", null);
        setField(term3367, term3367.getClass(), "focusInputMap", null);
        setField(term3367, term3367.getClass(), "ancestorInputMap", null);
        setField(term3367, term3367.getClass(), "windowInputMap", null);
        setField(term3367, term3367.getClass(), "actionMap", null);
        setField(term3367, term3367.getClass(), "aaHint", null);
        setField(term3367, term3367.getClass(), "lcdRenderingHint", null);
        setField(term3367, term3367.getClass(), "component", null);
        setField(term3367, term3367.getClass(), "layoutMgr", null);
        setField(term3367, term3367.getClass(), "dispatcher", null);
        setField(term3367, term3367.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term3367, term3367.getClass(), "focusCycleRoot", false);
        setBooleanField(term3367, term3367.getClass(), "focusTraversalPolicyProvider", false);
        setField(term3367, term3367.getClass(), "printingThreads", null);
        setBooleanField(term3367, term3367.getClass(), "printing", false);
        setField(term3367, term3367.getClass(), "containerListener", null);
        setIntField(term3367, term3367.getClass(), "listeningChildren", 0);
        setIntField(term3367, term3367.getClass(), "listeningBoundsChildren", 0);
        setIntField(term3367, term3367.getClass(), "descendantsCount", 0);
        setField(term3367, term3367.getClass(), "preserveBackgroundColor", null);
        setIntField(term3367, term3367.getClass(), "numOfHWComponents", 0);
        setIntField(term3367, term3367.getClass(), "numOfLWComponents", 0);
        setField(term3367, term3367.getClass(), "modalComp", null);
        setField(term3367, term3367.getClass(), "modalAppContext", null);
        setIntField(term3367, term3367.getClass(), "containerSerializedDataVersion", 0);
        setField(term3367, term3367.getClass(), "peer", null);
        setField(term3367, term3367.getClass(), "parent", null);
        setField(term3367, term3367.getClass(), "appContext", null);
        setIntField(term3367, term3367.getClass(), "x", 0);
        setIntField(term3367, term3367.getClass(), "y", 0);
        setIntField(term3367, term3367.getClass(), "width", 0);
        setIntField(term3367, term3367.getClass(), "height", 0);
        setField(term3367, term3367.getClass(), "foreground", null);
        setField(term3367, term3367.getClass(), "background", null);
        setField(term3367, term3367.getClass(), "font", null);
        setField(term3367, term3367.getClass(), "peerFont", null);
        setField(term3367, term3367.getClass(), "cursor", null);
        setField(term3367, term3367.getClass(), "locale", null);
        setField(term3367, term3367.getClass(), "graphicsConfig", null);
        setField(term3367, term3367.getClass(), "bufferStrategy", null);
        setBooleanField(term3367, term3367.getClass(), "ignoreRepaint", false);
        setBooleanField(term3367, term3367.getClass(), "visible", false);
        setBooleanField(term3367, term3367.getClass(), "enabled", false);
        setBooleanField(term3367, term3367.getClass(), "valid", false);
        setField(term3367, term3367.getClass(), "dropTarget", null);
        setField(term3367, term3367.getClass(), "popups", null);
        setField(term3367, term3367.getClass(), "name", null);
        setBooleanField(term3367, term3367.getClass(), "nameExplicitlySet", false);
        setBooleanField(term3367, term3367.getClass(), "focusable", false);
        setIntField(term3367, term3367.getClass(), "isFocusTraversableOverridden", 0);
        setField(term3367, term3367.getClass(), "focusTraversalKeys", null);
        setBooleanField(term3367, term3367.getClass(), "focusTraversalKeysEnabled", false);
        setField(term3367, term3367.getClass(), "acc", null);
        setField(term3367, term3367.getClass(), "minSize", null);
        setBooleanField(term3367, term3367.getClass(), "minSizeSet", false);
        setField(term3367, term3367.getClass(), "prefSize", null);
        setBooleanField(term3367, term3367.getClass(), "prefSizeSet", false);
        setField(term3367, term3367.getClass(), "maxSize", null);
        setBooleanField(term3367, term3367.getClass(), "maxSizeSet", false);
        setField(term3367, term3367.getClass(), "componentOrientation", null);
        setBooleanField(term3367, term3367.getClass(), "newEventsOnly", false);
        setField(term3367, term3367.getClass(), "componentListener", null);
        setField(term3367, term3367.getClass(), "focusListener", null);
        setField(term3367, term3367.getClass(), "hierarchyListener", null);
        setField(term3367, term3367.getClass(), "hierarchyBoundsListener", null);
        setField(term3367, term3367.getClass(), "keyListener", null);
        setField(term3367, term3367.getClass(), "mouseListener", null);
        setField(term3367, term3367.getClass(), "mouseMotionListener", null);
        setField(term3367, term3367.getClass(), "mouseWheelListener", null);
        setField(term3367, term3367.getClass(), "inputMethodListener", null);
        setLongField(term3367, term3367.getClass(), "eventMask", 0L);
        setField(term3367, term3367.getClass(), "changeSupport", null);
        setField(term3367, term3367.getClass(), "objectLock", null);
        setBooleanField(term3367, term3367.getClass(), "isPacked", false);
        setIntField(term3367, term3367.getClass(), "boundsOp", 0);
        setField(term3367, term3367.getClass(), "compoundShape", null);
        setField(term3367, term3367.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term3367, term3367.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term3367, term3367.getClass(), "backgroundEraseDisabled", false);
        setField(term3367, term3367.getClass(), "eventCache", null);
        setBooleanField(term3367, term3367.getClass(), "coalescingEnabled", false);
        setBooleanField(term3367, term3367.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term3367, term3367.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.user.Student$1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term3367, args);
    }

};


