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
     Object term309391;

    public Student_1_createToolTip_2923821651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309391 = newInstance(Class.forName("core.user.Student$1"));
        setField(term309391, term309391.getClass(), "dialogTitle", null);
        setField(term309391, term309391.getClass(), "approveButtonText", null);
        setField(term309391, term309391.getClass(), "approveButtonToolTipText", null);
        setIntField(term309391, term309391.getClass(), "approveButtonMnemonic", 0);
        setField(term309391, term309391.getClass(), "filters", null);
        setField(term309391, term309391.getClass(), "dialog", null);
        setIntField(term309391, term309391.getClass(), "dialogType", 0);
        setIntField(term309391, term309391.getClass(), "returnValue", 0);
        setField(term309391, term309391.getClass(), "accessory", null);
        setField(term309391, term309391.getClass(), "fileView", null);
        setBooleanField(term309391, term309391.getClass(), "controlsShown", false);
        setBooleanField(term309391, term309391.getClass(), "useFileHiding", false);
        setField(term309391, term309391.getClass(), "showFilesListener", null);
        setIntField(term309391, term309391.getClass(), "fileSelectionMode", 0);
        setBooleanField(term309391, term309391.getClass(), "multiSelectionEnabled", false);
        setBooleanField(term309391, term309391.getClass(), "useAcceptAllFileFilter", false);
        setBooleanField(term309391, term309391.getClass(), "dragEnabled", false);
        setField(term309391, term309391.getClass(), "fileFilter", null);
        setField(term309391, term309391.getClass(), "fileSystemView", null);
        setField(term309391, term309391.getClass(), "currentDirectory", null);
        setField(term309391, term309391.getClass(), "selectedFile", null);
        setField(term309391, term309391.getClass(), "selectedFiles", null);
        setField(term309391, term309391.getClass(), "accessibleContext", null);
        setBooleanField(term309391, term309391.getClass(), "isAlignmentXSet", false);
        setFloatField(term309391, term309391.getClass(), "alignmentX", 0.0F);
        setBooleanField(term309391, term309391.getClass(), "isAlignmentYSet", false);
        setFloatField(term309391, term309391.getClass(), "alignmentY", 0.0F);
        setField(term309391, term309391.getClass(), "ui", null);
        setField(term309391, term309391.getClass(), "listenerList", null);
        setField(term309391, term309391.getClass(), "clientProperties", null);
        setField(term309391, term309391.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term309391, term309391.getClass(), "autoscrolls", false);
        setField(term309391, term309391.getClass(), "border", null);
        setIntField(term309391, term309391.getClass(), "flags", 0);
        setField(term309391, term309391.getClass(), "inputVerifier", null);
        setBooleanField(term309391, term309391.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term309391, term309391.getClass(), "paintingChild", null);
        setField(term309391, term309391.getClass(), "popupMenu", null);
        setField(term309391, term309391.getClass(), "revalidateRunnableScheduled", null);
        setField(term309391, term309391.getClass(), "focusInputMap", null);
        setField(term309391, term309391.getClass(), "ancestorInputMap", null);
        setField(term309391, term309391.getClass(), "windowInputMap", null);
        setField(term309391, term309391.getClass(), "actionMap", null);
        setField(term309391, term309391.getClass(), "aaHint", null);
        setField(term309391, term309391.getClass(), "lcdRenderingHint", null);
        setField(term309391, term309391.getClass(), "component", null);
        setField(term309391, term309391.getClass(), "layoutMgr", null);
        setField(term309391, term309391.getClass(), "dispatcher", null);
        setField(term309391, term309391.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term309391, term309391.getClass(), "focusCycleRoot", false);
        setBooleanField(term309391, term309391.getClass(), "focusTraversalPolicyProvider", false);
        setField(term309391, term309391.getClass(), "printingThreads", null);
        setBooleanField(term309391, term309391.getClass(), "printing", false);
        setField(term309391, term309391.getClass(), "containerListener", null);
        setIntField(term309391, term309391.getClass(), "listeningChildren", 0);
        setIntField(term309391, term309391.getClass(), "listeningBoundsChildren", 0);
        setIntField(term309391, term309391.getClass(), "descendantsCount", 0);
        setField(term309391, term309391.getClass(), "preserveBackgroundColor", null);
        setIntField(term309391, term309391.getClass(), "numOfHWComponents", 0);
        setIntField(term309391, term309391.getClass(), "numOfLWComponents", 0);
        setField(term309391, term309391.getClass(), "modalComp", null);
        setField(term309391, term309391.getClass(), "modalAppContext", null);
        setIntField(term309391, term309391.getClass(), "containerSerializedDataVersion", 0);
        setField(term309391, term309391.getClass(), "peer", null);
        setField(term309391, term309391.getClass(), "parent", null);
        setField(term309391, term309391.getClass(), "appContext", null);
        setIntField(term309391, term309391.getClass(), "x", 0);
        setIntField(term309391, term309391.getClass(), "y", 0);
        setIntField(term309391, term309391.getClass(), "width", 0);
        setIntField(term309391, term309391.getClass(), "height", 0);
        setField(term309391, term309391.getClass(), "foreground", null);
        setField(term309391, term309391.getClass(), "background", null);
        setField(term309391, term309391.getClass(), "font", null);
        setField(term309391, term309391.getClass(), "peerFont", null);
        setField(term309391, term309391.getClass(), "cursor", null);
        setField(term309391, term309391.getClass(), "locale", null);
        setField(term309391, term309391.getClass(), "graphicsConfig", null);
        setField(term309391, term309391.getClass(), "bufferStrategy", null);
        setBooleanField(term309391, term309391.getClass(), "ignoreRepaint", false);
        setBooleanField(term309391, term309391.getClass(), "visible", false);
        setBooleanField(term309391, term309391.getClass(), "enabled", false);
        setBooleanField(term309391, term309391.getClass(), "valid", false);
        setField(term309391, term309391.getClass(), "dropTarget", null);
        setField(term309391, term309391.getClass(), "popups", null);
        setField(term309391, term309391.getClass(), "name", null);
        setBooleanField(term309391, term309391.getClass(), "nameExplicitlySet", false);
        setBooleanField(term309391, term309391.getClass(), "focusable", false);
        setIntField(term309391, term309391.getClass(), "isFocusTraversableOverridden", 0);
        setField(term309391, term309391.getClass(), "focusTraversalKeys", null);
        setBooleanField(term309391, term309391.getClass(), "focusTraversalKeysEnabled", false);
        setField(term309391, term309391.getClass(), "acc", null);
        setField(term309391, term309391.getClass(), "minSize", null);
        setBooleanField(term309391, term309391.getClass(), "minSizeSet", false);
        setField(term309391, term309391.getClass(), "prefSize", null);
        setBooleanField(term309391, term309391.getClass(), "prefSizeSet", false);
        setField(term309391, term309391.getClass(), "maxSize", null);
        setBooleanField(term309391, term309391.getClass(), "maxSizeSet", false);
        setField(term309391, term309391.getClass(), "componentOrientation", null);
        setBooleanField(term309391, term309391.getClass(), "newEventsOnly", false);
        setField(term309391, term309391.getClass(), "componentListener", null);
        setField(term309391, term309391.getClass(), "focusListener", null);
        setField(term309391, term309391.getClass(), "hierarchyListener", null);
        setField(term309391, term309391.getClass(), "hierarchyBoundsListener", null);
        setField(term309391, term309391.getClass(), "keyListener", null);
        setField(term309391, term309391.getClass(), "mouseListener", null);
        setField(term309391, term309391.getClass(), "mouseMotionListener", null);
        setField(term309391, term309391.getClass(), "mouseWheelListener", null);
        setField(term309391, term309391.getClass(), "inputMethodListener", null);
        setLongField(term309391, term309391.getClass(), "eventMask", 0L);
        setField(term309391, term309391.getClass(), "changeSupport", null);
        setField(term309391, term309391.getClass(), "objectLock", null);
        setBooleanField(term309391, term309391.getClass(), "isPacked", false);
        setIntField(term309391, term309391.getClass(), "boundsOp", 0);
        setField(term309391, term309391.getClass(), "compoundShape", null);
        setField(term309391, term309391.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term309391, term309391.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term309391, term309391.getClass(), "backgroundEraseDisabled", false);
        setField(term309391, term309391.getClass(), "eventCache", null);
        setBooleanField(term309391, term309391.getClass(), "coalescingEnabled", false);
        setBooleanField(term309391, term309391.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term309391, term309391.getClass(), "componentSerializedDataVersion", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.user.Student$1");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term309391, args);
    }

};


