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
import java.lang.Integer;

public class ImageLabel_scaleImageSmooth_170186904323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3140;
     Object term3189;
     Object term3191;

    public ImageLabel_scaleImageSmooth_170186904323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3140 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel"));
        setField(term3140, term3140.getClass(), "urlHiperlinkParent", null);
        setField(term3140, term3140.getClass(), "imageIconOriginal", null);
        setField(term3140, term3140.getClass(), "imageKey", null);
        setIntField(term3140, term3140.getClass(), "mnemonic", 0);
        setIntField(term3140, term3140.getClass(), "mnemonicIndex", 0);
        setField(term3140, term3140.getClass(), "text", null);
        setField(term3140, term3140.getClass(), "defaultIcon", null);
        setField(term3140, term3140.getClass(), "disabledIcon", null);
        setBooleanField(term3140, term3140.getClass(), "disabledIconSet", false);
        setIntField(term3140, term3140.getClass(), "verticalAlignment", 0);
        setIntField(term3140, term3140.getClass(), "horizontalAlignment", 0);
        setIntField(term3140, term3140.getClass(), "verticalTextPosition", 0);
        setIntField(term3140, term3140.getClass(), "horizontalTextPosition", 0);
        setIntField(term3140, term3140.getClass(), "iconTextGap", 0);
        setField(term3140, term3140.getClass(), "labelFor", null);
        setBooleanField(term3140, term3140.getClass(), "isAlignmentXSet", false);
        setFloatField(term3140, term3140.getClass(), "alignmentX", 0.0F);
        setBooleanField(term3140, term3140.getClass(), "isAlignmentYSet", false);
        setFloatField(term3140, term3140.getClass(), "alignmentY", 0.0F);
        setField(term3140, term3140.getClass(), "ui", null);
        setField(term3140, term3140.getClass(), "listenerList", null);
        setField(term3140, term3140.getClass(), "clientProperties", null);
        setField(term3140, term3140.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term3140, term3140.getClass(), "autoscrolls", false);
        setField(term3140, term3140.getClass(), "border", null);
        setIntField(term3140, term3140.getClass(), "flags", 0);
        setField(term3140, term3140.getClass(), "inputVerifier", null);
        setBooleanField(term3140, term3140.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term3140, term3140.getClass(), "paintingChild", null);
        setField(term3140, term3140.getClass(), "popupMenu", null);
        setField(term3140, term3140.getClass(), "revalidateRunnableScheduled", null);
        setField(term3140, term3140.getClass(), "focusInputMap", null);
        setField(term3140, term3140.getClass(), "ancestorInputMap", null);
        setField(term3140, term3140.getClass(), "windowInputMap", null);
        setField(term3140, term3140.getClass(), "actionMap", null);
        setField(term3140, term3140.getClass(), "aaHint", null);
        setField(term3140, term3140.getClass(), "lcdRenderingHint", null);
        setField(term3140, term3140.getClass(), "component", null);
        setField(term3140, term3140.getClass(), "layoutMgr", null);
        setField(term3140, term3140.getClass(), "dispatcher", null);
        setField(term3140, term3140.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term3140, term3140.getClass(), "focusCycleRoot", false);
        setBooleanField(term3140, term3140.getClass(), "focusTraversalPolicyProvider", false);
        setField(term3140, term3140.getClass(), "printingThreads", null);
        setBooleanField(term3140, term3140.getClass(), "printing", false);
        setField(term3140, term3140.getClass(), "containerListener", null);
        setIntField(term3140, term3140.getClass(), "listeningChildren", 0);
        setIntField(term3140, term3140.getClass(), "listeningBoundsChildren", 0);
        setIntField(term3140, term3140.getClass(), "descendantsCount", 0);
        setField(term3140, term3140.getClass(), "preserveBackgroundColor", null);
        setIntField(term3140, term3140.getClass(), "numOfHWComponents", 0);
        setIntField(term3140, term3140.getClass(), "numOfLWComponents", 0);
        setField(term3140, term3140.getClass(), "modalComp", null);
        setField(term3140, term3140.getClass(), "modalAppContext", null);
        setIntField(term3140, term3140.getClass(), "containerSerializedDataVersion", 0);
        setField(term3140, term3140.getClass(), "peer", null);
        setField(term3140, term3140.getClass(), "parent", null);
        setField(term3140, term3140.getClass(), "appContext", null);
        setIntField(term3140, term3140.getClass(), "x", 0);
        setIntField(term3140, term3140.getClass(), "y", 0);
        setIntField(term3140, term3140.getClass(), "width", 0);
        setIntField(term3140, term3140.getClass(), "height", 0);
        setField(term3140, term3140.getClass(), "foreground", null);
        setField(term3140, term3140.getClass(), "background", null);
        setField(term3140, term3140.getClass(), "font", null);
        setField(term3140, term3140.getClass(), "peerFont", null);
        setField(term3140, term3140.getClass(), "cursor", null);
        setField(term3140, term3140.getClass(), "locale", null);
        setField(term3140, term3140.getClass(), "graphicsConfig", null);
        setField(term3140, term3140.getClass(), "bufferStrategy", null);
        setBooleanField(term3140, term3140.getClass(), "ignoreRepaint", false);
        setBooleanField(term3140, term3140.getClass(), "visible", false);
        setBooleanField(term3140, term3140.getClass(), "enabled", false);
        setBooleanField(term3140, term3140.getClass(), "valid", false);
        setField(term3140, term3140.getClass(), "dropTarget", null);
        setField(term3140, term3140.getClass(), "popups", null);
        setField(term3140, term3140.getClass(), "name", null);
        setBooleanField(term3140, term3140.getClass(), "nameExplicitlySet", false);
        setBooleanField(term3140, term3140.getClass(), "focusable", false);
        setIntField(term3140, term3140.getClass(), "isFocusTraversableOverridden", 0);
        setField(term3140, term3140.getClass(), "focusTraversalKeys", null);
        setBooleanField(term3140, term3140.getClass(), "focusTraversalKeysEnabled", false);
        setField(term3140, term3140.getClass(), "acc", null);
        setField(term3140, term3140.getClass(), "minSize", null);
        setBooleanField(term3140, term3140.getClass(), "minSizeSet", false);
        setField(term3140, term3140.getClass(), "prefSize", null);
        setBooleanField(term3140, term3140.getClass(), "prefSizeSet", false);
        setField(term3140, term3140.getClass(), "maxSize", null);
        setBooleanField(term3140, term3140.getClass(), "maxSizeSet", false);
        setField(term3140, term3140.getClass(), "componentOrientation", null);
        setBooleanField(term3140, term3140.getClass(), "newEventsOnly", false);
        setField(term3140, term3140.getClass(), "componentListener", null);
        setField(term3140, term3140.getClass(), "focusListener", null);
        setField(term3140, term3140.getClass(), "hierarchyListener", null);
        setField(term3140, term3140.getClass(), "hierarchyBoundsListener", null);
        setField(term3140, term3140.getClass(), "keyListener", null);
        setField(term3140, term3140.getClass(), "mouseListener", null);
        setField(term3140, term3140.getClass(), "mouseMotionListener", null);
        setField(term3140, term3140.getClass(), "mouseWheelListener", null);
        setField(term3140, term3140.getClass(), "inputMethodListener", null);
        setLongField(term3140, term3140.getClass(), "eventMask", 0L);
        setField(term3140, term3140.getClass(), "changeSupport", null);
        setField(term3140, term3140.getClass(), "objectLock", null);
        setBooleanField(term3140, term3140.getClass(), "isPacked", false);
        setIntField(term3140, term3140.getClass(), "boundsOp", 0);
        setField(term3140, term3140.getClass(), "compoundShape", null);
        setField(term3140, term3140.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term3140, term3140.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term3140, term3140.getClass(), "backgroundEraseDisabled", false);
        setField(term3140, term3140.getClass(), "eventCache", null);
        setBooleanField(term3140, term3140.getClass(), "coalescingEnabled", false);
        setBooleanField(term3140, term3140.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term3140, term3140.getClass(), "componentSerializedDataVersion", 0);
        setField(term3140, term3140.getClass(), "accessibleContext", null);
        term3189 = new Integer(0);
        term3191 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.Image");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term3189;
        args[2] = term3191;
        callMethod(klass, "scaleImageSmooth", argTypes, term3140, args);
    }

};


