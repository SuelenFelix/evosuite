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

public class ImageLabel_getCalculatedResizeImage_183122849927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3340;

    public ImageLabel_getCalculatedResizeImage_183122849927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3340 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel"));
        setField(term3340, term3340.getClass(), "urlHiperlinkParent", null);
        setField(term3340, term3340.getClass(), "imageIconOriginal", null);
        setField(term3340, term3340.getClass(), "imageKey", null);
        setIntField(term3340, term3340.getClass(), "mnemonic", 0);
        setIntField(term3340, term3340.getClass(), "mnemonicIndex", 0);
        setField(term3340, term3340.getClass(), "text", null);
        setField(term3340, term3340.getClass(), "defaultIcon", null);
        setField(term3340, term3340.getClass(), "disabledIcon", null);
        setBooleanField(term3340, term3340.getClass(), "disabledIconSet", false);
        setIntField(term3340, term3340.getClass(), "verticalAlignment", 0);
        setIntField(term3340, term3340.getClass(), "horizontalAlignment", 0);
        setIntField(term3340, term3340.getClass(), "verticalTextPosition", 0);
        setIntField(term3340, term3340.getClass(), "horizontalTextPosition", 0);
        setIntField(term3340, term3340.getClass(), "iconTextGap", 0);
        setField(term3340, term3340.getClass(), "labelFor", null);
        setBooleanField(term3340, term3340.getClass(), "isAlignmentXSet", false);
        setFloatField(term3340, term3340.getClass(), "alignmentX", 0.0F);
        setBooleanField(term3340, term3340.getClass(), "isAlignmentYSet", false);
        setFloatField(term3340, term3340.getClass(), "alignmentY", 0.0F);
        setField(term3340, term3340.getClass(), "ui", null);
        setField(term3340, term3340.getClass(), "listenerList", null);
        setField(term3340, term3340.getClass(), "clientProperties", null);
        setField(term3340, term3340.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term3340, term3340.getClass(), "autoscrolls", false);
        setField(term3340, term3340.getClass(), "border", null);
        setIntField(term3340, term3340.getClass(), "flags", 0);
        setField(term3340, term3340.getClass(), "inputVerifier", null);
        setBooleanField(term3340, term3340.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term3340, term3340.getClass(), "paintingChild", null);
        setField(term3340, term3340.getClass(), "popupMenu", null);
        setField(term3340, term3340.getClass(), "revalidateRunnableScheduled", null);
        setField(term3340, term3340.getClass(), "focusInputMap", null);
        setField(term3340, term3340.getClass(), "ancestorInputMap", null);
        setField(term3340, term3340.getClass(), "windowInputMap", null);
        setField(term3340, term3340.getClass(), "actionMap", null);
        setField(term3340, term3340.getClass(), "aaHint", null);
        setField(term3340, term3340.getClass(), "lcdRenderingHint", null);
        setField(term3340, term3340.getClass(), "component", null);
        setField(term3340, term3340.getClass(), "layoutMgr", null);
        setField(term3340, term3340.getClass(), "dispatcher", null);
        setField(term3340, term3340.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term3340, term3340.getClass(), "focusCycleRoot", false);
        setBooleanField(term3340, term3340.getClass(), "focusTraversalPolicyProvider", false);
        setField(term3340, term3340.getClass(), "printingThreads", null);
        setBooleanField(term3340, term3340.getClass(), "printing", false);
        setField(term3340, term3340.getClass(), "containerListener", null);
        setIntField(term3340, term3340.getClass(), "listeningChildren", 0);
        setIntField(term3340, term3340.getClass(), "listeningBoundsChildren", 0);
        setIntField(term3340, term3340.getClass(), "descendantsCount", 0);
        setField(term3340, term3340.getClass(), "preserveBackgroundColor", null);
        setIntField(term3340, term3340.getClass(), "numOfHWComponents", 0);
        setIntField(term3340, term3340.getClass(), "numOfLWComponents", 0);
        setField(term3340, term3340.getClass(), "modalComp", null);
        setField(term3340, term3340.getClass(), "modalAppContext", null);
        setIntField(term3340, term3340.getClass(), "containerSerializedDataVersion", 0);
        setField(term3340, term3340.getClass(), "peer", null);
        setField(term3340, term3340.getClass(), "parent", null);
        setField(term3340, term3340.getClass(), "appContext", null);
        setIntField(term3340, term3340.getClass(), "x", 0);
        setIntField(term3340, term3340.getClass(), "y", 0);
        setIntField(term3340, term3340.getClass(), "width", 0);
        setIntField(term3340, term3340.getClass(), "height", 0);
        setField(term3340, term3340.getClass(), "foreground", null);
        setField(term3340, term3340.getClass(), "background", null);
        setField(term3340, term3340.getClass(), "font", null);
        setField(term3340, term3340.getClass(), "peerFont", null);
        setField(term3340, term3340.getClass(), "cursor", null);
        setField(term3340, term3340.getClass(), "locale", null);
        setField(term3340, term3340.getClass(), "graphicsConfig", null);
        setField(term3340, term3340.getClass(), "bufferStrategy", null);
        setBooleanField(term3340, term3340.getClass(), "ignoreRepaint", false);
        setBooleanField(term3340, term3340.getClass(), "visible", false);
        setBooleanField(term3340, term3340.getClass(), "enabled", false);
        setBooleanField(term3340, term3340.getClass(), "valid", false);
        setField(term3340, term3340.getClass(), "dropTarget", null);
        setField(term3340, term3340.getClass(), "popups", null);
        setField(term3340, term3340.getClass(), "name", null);
        setBooleanField(term3340, term3340.getClass(), "nameExplicitlySet", false);
        setBooleanField(term3340, term3340.getClass(), "focusable", false);
        setIntField(term3340, term3340.getClass(), "isFocusTraversableOverridden", 0);
        setField(term3340, term3340.getClass(), "focusTraversalKeys", null);
        setBooleanField(term3340, term3340.getClass(), "focusTraversalKeysEnabled", false);
        setField(term3340, term3340.getClass(), "acc", null);
        setField(term3340, term3340.getClass(), "minSize", null);
        setBooleanField(term3340, term3340.getClass(), "minSizeSet", false);
        setField(term3340, term3340.getClass(), "prefSize", null);
        setBooleanField(term3340, term3340.getClass(), "prefSizeSet", false);
        setField(term3340, term3340.getClass(), "maxSize", null);
        setBooleanField(term3340, term3340.getClass(), "maxSizeSet", false);
        setField(term3340, term3340.getClass(), "componentOrientation", null);
        setBooleanField(term3340, term3340.getClass(), "newEventsOnly", false);
        setField(term3340, term3340.getClass(), "componentListener", null);
        setField(term3340, term3340.getClass(), "focusListener", null);
        setField(term3340, term3340.getClass(), "hierarchyListener", null);
        setField(term3340, term3340.getClass(), "hierarchyBoundsListener", null);
        setField(term3340, term3340.getClass(), "keyListener", null);
        setField(term3340, term3340.getClass(), "mouseListener", null);
        setField(term3340, term3340.getClass(), "mouseMotionListener", null);
        setField(term3340, term3340.getClass(), "mouseWheelListener", null);
        setField(term3340, term3340.getClass(), "inputMethodListener", null);
        setLongField(term3340, term3340.getClass(), "eventMask", 0L);
        setField(term3340, term3340.getClass(), "changeSupport", null);
        setField(term3340, term3340.getClass(), "objectLock", null);
        setBooleanField(term3340, term3340.getClass(), "isPacked", false);
        setIntField(term3340, term3340.getClass(), "boundsOp", 0);
        setField(term3340, term3340.getClass(), "compoundShape", null);
        setField(term3340, term3340.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term3340, term3340.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term3340, term3340.getClass(), "backgroundEraseDisabled", false);
        setField(term3340, term3340.getClass(), "eventCache", null);
        setBooleanField(term3340, term3340.getClass(), "coalescingEnabled", false);
        setBooleanField(term3340, term3340.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term3340, term3340.getClass(), "componentSerializedDataVersion", 0);
        setField(term3340, term3340.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.awt.Dimension");
        argTypes[1] = Class.forName("java.awt.Dimension");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "getCalculatedResizeImage", argTypes, term3340, args);
    }

};


