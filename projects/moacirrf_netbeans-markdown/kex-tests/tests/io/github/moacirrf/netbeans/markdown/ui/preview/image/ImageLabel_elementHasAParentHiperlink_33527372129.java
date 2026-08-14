package io.github.moacirrf.netbeans.markdown.ui.preview.image;

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
import static io.github.moacirrf.netbeans.markdown.ui.preview.image.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ImageLabel_elementHasAParentHiperlink_33527372129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3438;

    public ImageLabel_elementHasAParentHiperlink_33527372129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3438 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel"));
        setField(term3438, term3438.getClass(), "urlHiperlinkParent", null);
        setField(term3438, term3438.getClass(), "imageIconOriginal", null);
        setField(term3438, term3438.getClass(), "imageKey", null);
        setIntField(term3438, term3438.getClass(), "mnemonic", 0);
        setIntField(term3438, term3438.getClass(), "mnemonicIndex", 0);
        setField(term3438, term3438.getClass(), "text", null);
        setField(term3438, term3438.getClass(), "defaultIcon", null);
        setField(term3438, term3438.getClass(), "disabledIcon", null);
        setBooleanField(term3438, term3438.getClass(), "disabledIconSet", false);
        setIntField(term3438, term3438.getClass(), "verticalAlignment", 0);
        setIntField(term3438, term3438.getClass(), "horizontalAlignment", 0);
        setIntField(term3438, term3438.getClass(), "verticalTextPosition", 0);
        setIntField(term3438, term3438.getClass(), "horizontalTextPosition", 0);
        setIntField(term3438, term3438.getClass(), "iconTextGap", 0);
        setField(term3438, term3438.getClass(), "labelFor", null);
        setBooleanField(term3438, term3438.getClass(), "isAlignmentXSet", false);
        setFloatField(term3438, term3438.getClass(), "alignmentX", 0.0F);
        setBooleanField(term3438, term3438.getClass(), "isAlignmentYSet", false);
        setFloatField(term3438, term3438.getClass(), "alignmentY", 0.0F);
        setField(term3438, term3438.getClass(), "ui", null);
        setField(term3438, term3438.getClass(), "listenerList", null);
        setField(term3438, term3438.getClass(), "clientProperties", null);
        setField(term3438, term3438.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term3438, term3438.getClass(), "autoscrolls", false);
        setField(term3438, term3438.getClass(), "border", null);
        setIntField(term3438, term3438.getClass(), "flags", 0);
        setField(term3438, term3438.getClass(), "inputVerifier", null);
        setBooleanField(term3438, term3438.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term3438, term3438.getClass(), "paintingChild", null);
        setField(term3438, term3438.getClass(), "popupMenu", null);
        setField(term3438, term3438.getClass(), "revalidateRunnableScheduled", null);
        setField(term3438, term3438.getClass(), "focusInputMap", null);
        setField(term3438, term3438.getClass(), "ancestorInputMap", null);
        setField(term3438, term3438.getClass(), "windowInputMap", null);
        setField(term3438, term3438.getClass(), "actionMap", null);
        setField(term3438, term3438.getClass(), "aaHint", null);
        setField(term3438, term3438.getClass(), "lcdRenderingHint", null);
        setField(term3438, term3438.getClass(), "component", null);
        setField(term3438, term3438.getClass(), "layoutMgr", null);
        setField(term3438, term3438.getClass(), "dispatcher", null);
        setField(term3438, term3438.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term3438, term3438.getClass(), "focusCycleRoot", false);
        setBooleanField(term3438, term3438.getClass(), "focusTraversalPolicyProvider", false);
        setField(term3438, term3438.getClass(), "printingThreads", null);
        setBooleanField(term3438, term3438.getClass(), "printing", false);
        setField(term3438, term3438.getClass(), "containerListener", null);
        setIntField(term3438, term3438.getClass(), "listeningChildren", 0);
        setIntField(term3438, term3438.getClass(), "listeningBoundsChildren", 0);
        setIntField(term3438, term3438.getClass(), "descendantsCount", 0);
        setField(term3438, term3438.getClass(), "preserveBackgroundColor", null);
        setIntField(term3438, term3438.getClass(), "numOfHWComponents", 0);
        setIntField(term3438, term3438.getClass(), "numOfLWComponents", 0);
        setField(term3438, term3438.getClass(), "modalComp", null);
        setField(term3438, term3438.getClass(), "modalAppContext", null);
        setIntField(term3438, term3438.getClass(), "containerSerializedDataVersion", 0);
        setField(term3438, term3438.getClass(), "peer", null);
        setField(term3438, term3438.getClass(), "parent", null);
        setField(term3438, term3438.getClass(), "appContext", null);
        setIntField(term3438, term3438.getClass(), "x", 0);
        setIntField(term3438, term3438.getClass(), "y", 0);
        setIntField(term3438, term3438.getClass(), "width", 0);
        setIntField(term3438, term3438.getClass(), "height", 0);
        setField(term3438, term3438.getClass(), "foreground", null);
        setField(term3438, term3438.getClass(), "background", null);
        setField(term3438, term3438.getClass(), "font", null);
        setField(term3438, term3438.getClass(), "peerFont", null);
        setField(term3438, term3438.getClass(), "cursor", null);
        setField(term3438, term3438.getClass(), "locale", null);
        setField(term3438, term3438.getClass(), "graphicsConfig", null);
        setField(term3438, term3438.getClass(), "bufferStrategy", null);
        setBooleanField(term3438, term3438.getClass(), "ignoreRepaint", false);
        setBooleanField(term3438, term3438.getClass(), "visible", false);
        setBooleanField(term3438, term3438.getClass(), "enabled", false);
        setBooleanField(term3438, term3438.getClass(), "valid", false);
        setField(term3438, term3438.getClass(), "dropTarget", null);
        setField(term3438, term3438.getClass(), "popups", null);
        setField(term3438, term3438.getClass(), "name", null);
        setBooleanField(term3438, term3438.getClass(), "nameExplicitlySet", false);
        setBooleanField(term3438, term3438.getClass(), "focusable", false);
        setIntField(term3438, term3438.getClass(), "isFocusTraversableOverridden", 0);
        setField(term3438, term3438.getClass(), "focusTraversalKeys", null);
        setBooleanField(term3438, term3438.getClass(), "focusTraversalKeysEnabled", false);
        setField(term3438, term3438.getClass(), "acc", null);
        setField(term3438, term3438.getClass(), "minSize", null);
        setBooleanField(term3438, term3438.getClass(), "minSizeSet", false);
        setField(term3438, term3438.getClass(), "prefSize", null);
        setBooleanField(term3438, term3438.getClass(), "prefSizeSet", false);
        setField(term3438, term3438.getClass(), "maxSize", null);
        setBooleanField(term3438, term3438.getClass(), "maxSizeSet", false);
        setField(term3438, term3438.getClass(), "componentOrientation", null);
        setBooleanField(term3438, term3438.getClass(), "newEventsOnly", false);
        setField(term3438, term3438.getClass(), "componentListener", null);
        setField(term3438, term3438.getClass(), "focusListener", null);
        setField(term3438, term3438.getClass(), "hierarchyListener", null);
        setField(term3438, term3438.getClass(), "hierarchyBoundsListener", null);
        setField(term3438, term3438.getClass(), "keyListener", null);
        setField(term3438, term3438.getClass(), "mouseListener", null);
        setField(term3438, term3438.getClass(), "mouseMotionListener", null);
        setField(term3438, term3438.getClass(), "mouseWheelListener", null);
        setField(term3438, term3438.getClass(), "inputMethodListener", null);
        setLongField(term3438, term3438.getClass(), "eventMask", 0L);
        setField(term3438, term3438.getClass(), "changeSupport", null);
        setField(term3438, term3438.getClass(), "objectLock", null);
        setBooleanField(term3438, term3438.getClass(), "isPacked", false);
        setIntField(term3438, term3438.getClass(), "boundsOp", 0);
        setField(term3438, term3438.getClass(), "compoundShape", null);
        setField(term3438, term3438.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term3438, term3438.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term3438, term3438.getClass(), "backgroundEraseDisabled", false);
        setField(term3438, term3438.getClass(), "eventCache", null);
        setBooleanField(term3438, term3438.getClass(), "coalescingEnabled", false);
        setBooleanField(term3438, term3438.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term3438, term3438.getClass(), "componentSerializedDataVersion", 0);
        setField(term3438, term3438.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.text.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "elementHasAParentHiperlink", argTypes, term3438, args);
    }

};


