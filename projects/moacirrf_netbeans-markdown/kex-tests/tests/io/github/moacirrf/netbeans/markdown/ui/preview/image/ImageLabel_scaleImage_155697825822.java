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

public class ImageLabel_scaleImage_155697825822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3091;

    public ImageLabel_scaleImage_155697825822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3091 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel"));
        setField(term3091, term3091.getClass(), "urlHiperlinkParent", null);
        setField(term3091, term3091.getClass(), "imageIconOriginal", null);
        setField(term3091, term3091.getClass(), "imageKey", null);
        setIntField(term3091, term3091.getClass(), "mnemonic", 0);
        setIntField(term3091, term3091.getClass(), "mnemonicIndex", 0);
        setField(term3091, term3091.getClass(), "text", null);
        setField(term3091, term3091.getClass(), "defaultIcon", null);
        setField(term3091, term3091.getClass(), "disabledIcon", null);
        setBooleanField(term3091, term3091.getClass(), "disabledIconSet", false);
        setIntField(term3091, term3091.getClass(), "verticalAlignment", 0);
        setIntField(term3091, term3091.getClass(), "horizontalAlignment", 0);
        setIntField(term3091, term3091.getClass(), "verticalTextPosition", 0);
        setIntField(term3091, term3091.getClass(), "horizontalTextPosition", 0);
        setIntField(term3091, term3091.getClass(), "iconTextGap", 0);
        setField(term3091, term3091.getClass(), "labelFor", null);
        setBooleanField(term3091, term3091.getClass(), "isAlignmentXSet", false);
        setFloatField(term3091, term3091.getClass(), "alignmentX", 0.0F);
        setBooleanField(term3091, term3091.getClass(), "isAlignmentYSet", false);
        setFloatField(term3091, term3091.getClass(), "alignmentY", 0.0F);
        setField(term3091, term3091.getClass(), "ui", null);
        setField(term3091, term3091.getClass(), "listenerList", null);
        setField(term3091, term3091.getClass(), "clientProperties", null);
        setField(term3091, term3091.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term3091, term3091.getClass(), "autoscrolls", false);
        setField(term3091, term3091.getClass(), "border", null);
        setIntField(term3091, term3091.getClass(), "flags", 0);
        setField(term3091, term3091.getClass(), "inputVerifier", null);
        setBooleanField(term3091, term3091.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term3091, term3091.getClass(), "paintingChild", null);
        setField(term3091, term3091.getClass(), "popupMenu", null);
        setField(term3091, term3091.getClass(), "revalidateRunnableScheduled", null);
        setField(term3091, term3091.getClass(), "focusInputMap", null);
        setField(term3091, term3091.getClass(), "ancestorInputMap", null);
        setField(term3091, term3091.getClass(), "windowInputMap", null);
        setField(term3091, term3091.getClass(), "actionMap", null);
        setField(term3091, term3091.getClass(), "aaHint", null);
        setField(term3091, term3091.getClass(), "lcdRenderingHint", null);
        setField(term3091, term3091.getClass(), "component", null);
        setField(term3091, term3091.getClass(), "layoutMgr", null);
        setField(term3091, term3091.getClass(), "dispatcher", null);
        setField(term3091, term3091.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term3091, term3091.getClass(), "focusCycleRoot", false);
        setBooleanField(term3091, term3091.getClass(), "focusTraversalPolicyProvider", false);
        setField(term3091, term3091.getClass(), "printingThreads", null);
        setBooleanField(term3091, term3091.getClass(), "printing", false);
        setField(term3091, term3091.getClass(), "containerListener", null);
        setIntField(term3091, term3091.getClass(), "listeningChildren", 0);
        setIntField(term3091, term3091.getClass(), "listeningBoundsChildren", 0);
        setIntField(term3091, term3091.getClass(), "descendantsCount", 0);
        setField(term3091, term3091.getClass(), "preserveBackgroundColor", null);
        setIntField(term3091, term3091.getClass(), "numOfHWComponents", 0);
        setIntField(term3091, term3091.getClass(), "numOfLWComponents", 0);
        setField(term3091, term3091.getClass(), "modalComp", null);
        setField(term3091, term3091.getClass(), "modalAppContext", null);
        setIntField(term3091, term3091.getClass(), "containerSerializedDataVersion", 0);
        setField(term3091, term3091.getClass(), "peer", null);
        setField(term3091, term3091.getClass(), "parent", null);
        setField(term3091, term3091.getClass(), "appContext", null);
        setIntField(term3091, term3091.getClass(), "x", 0);
        setIntField(term3091, term3091.getClass(), "y", 0);
        setIntField(term3091, term3091.getClass(), "width", 0);
        setIntField(term3091, term3091.getClass(), "height", 0);
        setField(term3091, term3091.getClass(), "foreground", null);
        setField(term3091, term3091.getClass(), "background", null);
        setField(term3091, term3091.getClass(), "font", null);
        setField(term3091, term3091.getClass(), "peerFont", null);
        setField(term3091, term3091.getClass(), "cursor", null);
        setField(term3091, term3091.getClass(), "locale", null);
        setField(term3091, term3091.getClass(), "graphicsConfig", null);
        setField(term3091, term3091.getClass(), "bufferStrategy", null);
        setBooleanField(term3091, term3091.getClass(), "ignoreRepaint", false);
        setBooleanField(term3091, term3091.getClass(), "visible", false);
        setBooleanField(term3091, term3091.getClass(), "enabled", false);
        setBooleanField(term3091, term3091.getClass(), "valid", false);
        setField(term3091, term3091.getClass(), "dropTarget", null);
        setField(term3091, term3091.getClass(), "popups", null);
        setField(term3091, term3091.getClass(), "name", null);
        setBooleanField(term3091, term3091.getClass(), "nameExplicitlySet", false);
        setBooleanField(term3091, term3091.getClass(), "focusable", false);
        setIntField(term3091, term3091.getClass(), "isFocusTraversableOverridden", 0);
        setField(term3091, term3091.getClass(), "focusTraversalKeys", null);
        setBooleanField(term3091, term3091.getClass(), "focusTraversalKeysEnabled", false);
        setField(term3091, term3091.getClass(), "acc", null);
        setField(term3091, term3091.getClass(), "minSize", null);
        setBooleanField(term3091, term3091.getClass(), "minSizeSet", false);
        setField(term3091, term3091.getClass(), "prefSize", null);
        setBooleanField(term3091, term3091.getClass(), "prefSizeSet", false);
        setField(term3091, term3091.getClass(), "maxSize", null);
        setBooleanField(term3091, term3091.getClass(), "maxSizeSet", false);
        setField(term3091, term3091.getClass(), "componentOrientation", null);
        setBooleanField(term3091, term3091.getClass(), "newEventsOnly", false);
        setField(term3091, term3091.getClass(), "componentListener", null);
        setField(term3091, term3091.getClass(), "focusListener", null);
        setField(term3091, term3091.getClass(), "hierarchyListener", null);
        setField(term3091, term3091.getClass(), "hierarchyBoundsListener", null);
        setField(term3091, term3091.getClass(), "keyListener", null);
        setField(term3091, term3091.getClass(), "mouseListener", null);
        setField(term3091, term3091.getClass(), "mouseMotionListener", null);
        setField(term3091, term3091.getClass(), "mouseWheelListener", null);
        setField(term3091, term3091.getClass(), "inputMethodListener", null);
        setLongField(term3091, term3091.getClass(), "eventMask", 0L);
        setField(term3091, term3091.getClass(), "changeSupport", null);
        setField(term3091, term3091.getClass(), "objectLock", null);
        setBooleanField(term3091, term3091.getClass(), "isPacked", false);
        setIntField(term3091, term3091.getClass(), "boundsOp", 0);
        setField(term3091, term3091.getClass(), "compoundShape", null);
        setField(term3091, term3091.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term3091, term3091.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term3091, term3091.getClass(), "backgroundEraseDisabled", false);
        setField(term3091, term3091.getClass(), "eventCache", null);
        setBooleanField(term3091, term3091.getClass(), "coalescingEnabled", false);
        setBooleanField(term3091, term3091.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term3091, term3091.getClass(), "componentSerializedDataVersion", 0);
        setField(term3091, term3091.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.awt.Image");
        argTypes[2] = Class.forName("java.awt.Dimension");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "scaleImage", argTypes, term3091, args);
    }

};


