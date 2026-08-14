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

public class ImageLabel_preloadImages_8334966826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3291;

    public ImageLabel_preloadImages_8334966826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3291 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel"));
        setField(term3291, term3291.getClass(), "urlHiperlinkParent", null);
        setField(term3291, term3291.getClass(), "imageIconOriginal", null);
        setField(term3291, term3291.getClass(), "imageKey", null);
        setIntField(term3291, term3291.getClass(), "mnemonic", 0);
        setIntField(term3291, term3291.getClass(), "mnemonicIndex", 0);
        setField(term3291, term3291.getClass(), "text", null);
        setField(term3291, term3291.getClass(), "defaultIcon", null);
        setField(term3291, term3291.getClass(), "disabledIcon", null);
        setBooleanField(term3291, term3291.getClass(), "disabledIconSet", false);
        setIntField(term3291, term3291.getClass(), "verticalAlignment", 0);
        setIntField(term3291, term3291.getClass(), "horizontalAlignment", 0);
        setIntField(term3291, term3291.getClass(), "verticalTextPosition", 0);
        setIntField(term3291, term3291.getClass(), "horizontalTextPosition", 0);
        setIntField(term3291, term3291.getClass(), "iconTextGap", 0);
        setField(term3291, term3291.getClass(), "labelFor", null);
        setBooleanField(term3291, term3291.getClass(), "isAlignmentXSet", false);
        setFloatField(term3291, term3291.getClass(), "alignmentX", 0.0F);
        setBooleanField(term3291, term3291.getClass(), "isAlignmentYSet", false);
        setFloatField(term3291, term3291.getClass(), "alignmentY", 0.0F);
        setField(term3291, term3291.getClass(), "ui", null);
        setField(term3291, term3291.getClass(), "listenerList", null);
        setField(term3291, term3291.getClass(), "clientProperties", null);
        setField(term3291, term3291.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term3291, term3291.getClass(), "autoscrolls", false);
        setField(term3291, term3291.getClass(), "border", null);
        setIntField(term3291, term3291.getClass(), "flags", 0);
        setField(term3291, term3291.getClass(), "inputVerifier", null);
        setBooleanField(term3291, term3291.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term3291, term3291.getClass(), "paintingChild", null);
        setField(term3291, term3291.getClass(), "popupMenu", null);
        setField(term3291, term3291.getClass(), "revalidateRunnableScheduled", null);
        setField(term3291, term3291.getClass(), "focusInputMap", null);
        setField(term3291, term3291.getClass(), "ancestorInputMap", null);
        setField(term3291, term3291.getClass(), "windowInputMap", null);
        setField(term3291, term3291.getClass(), "actionMap", null);
        setField(term3291, term3291.getClass(), "aaHint", null);
        setField(term3291, term3291.getClass(), "lcdRenderingHint", null);
        setField(term3291, term3291.getClass(), "component", null);
        setField(term3291, term3291.getClass(), "layoutMgr", null);
        setField(term3291, term3291.getClass(), "dispatcher", null);
        setField(term3291, term3291.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term3291, term3291.getClass(), "focusCycleRoot", false);
        setBooleanField(term3291, term3291.getClass(), "focusTraversalPolicyProvider", false);
        setField(term3291, term3291.getClass(), "printingThreads", null);
        setBooleanField(term3291, term3291.getClass(), "printing", false);
        setField(term3291, term3291.getClass(), "containerListener", null);
        setIntField(term3291, term3291.getClass(), "listeningChildren", 0);
        setIntField(term3291, term3291.getClass(), "listeningBoundsChildren", 0);
        setIntField(term3291, term3291.getClass(), "descendantsCount", 0);
        setField(term3291, term3291.getClass(), "preserveBackgroundColor", null);
        setIntField(term3291, term3291.getClass(), "numOfHWComponents", 0);
        setIntField(term3291, term3291.getClass(), "numOfLWComponents", 0);
        setField(term3291, term3291.getClass(), "modalComp", null);
        setField(term3291, term3291.getClass(), "modalAppContext", null);
        setIntField(term3291, term3291.getClass(), "containerSerializedDataVersion", 0);
        setField(term3291, term3291.getClass(), "peer", null);
        setField(term3291, term3291.getClass(), "parent", null);
        setField(term3291, term3291.getClass(), "appContext", null);
        setIntField(term3291, term3291.getClass(), "x", 0);
        setIntField(term3291, term3291.getClass(), "y", 0);
        setIntField(term3291, term3291.getClass(), "width", 0);
        setIntField(term3291, term3291.getClass(), "height", 0);
        setField(term3291, term3291.getClass(), "foreground", null);
        setField(term3291, term3291.getClass(), "background", null);
        setField(term3291, term3291.getClass(), "font", null);
        setField(term3291, term3291.getClass(), "peerFont", null);
        setField(term3291, term3291.getClass(), "cursor", null);
        setField(term3291, term3291.getClass(), "locale", null);
        setField(term3291, term3291.getClass(), "graphicsConfig", null);
        setField(term3291, term3291.getClass(), "bufferStrategy", null);
        setBooleanField(term3291, term3291.getClass(), "ignoreRepaint", false);
        setBooleanField(term3291, term3291.getClass(), "visible", false);
        setBooleanField(term3291, term3291.getClass(), "enabled", false);
        setBooleanField(term3291, term3291.getClass(), "valid", false);
        setField(term3291, term3291.getClass(), "dropTarget", null);
        setField(term3291, term3291.getClass(), "popups", null);
        setField(term3291, term3291.getClass(), "name", null);
        setBooleanField(term3291, term3291.getClass(), "nameExplicitlySet", false);
        setBooleanField(term3291, term3291.getClass(), "focusable", false);
        setIntField(term3291, term3291.getClass(), "isFocusTraversableOverridden", 0);
        setField(term3291, term3291.getClass(), "focusTraversalKeys", null);
        setBooleanField(term3291, term3291.getClass(), "focusTraversalKeysEnabled", false);
        setField(term3291, term3291.getClass(), "acc", null);
        setField(term3291, term3291.getClass(), "minSize", null);
        setBooleanField(term3291, term3291.getClass(), "minSizeSet", false);
        setField(term3291, term3291.getClass(), "prefSize", null);
        setBooleanField(term3291, term3291.getClass(), "prefSizeSet", false);
        setField(term3291, term3291.getClass(), "maxSize", null);
        setBooleanField(term3291, term3291.getClass(), "maxSizeSet", false);
        setField(term3291, term3291.getClass(), "componentOrientation", null);
        setBooleanField(term3291, term3291.getClass(), "newEventsOnly", false);
        setField(term3291, term3291.getClass(), "componentListener", null);
        setField(term3291, term3291.getClass(), "focusListener", null);
        setField(term3291, term3291.getClass(), "hierarchyListener", null);
        setField(term3291, term3291.getClass(), "hierarchyBoundsListener", null);
        setField(term3291, term3291.getClass(), "keyListener", null);
        setField(term3291, term3291.getClass(), "mouseListener", null);
        setField(term3291, term3291.getClass(), "mouseMotionListener", null);
        setField(term3291, term3291.getClass(), "mouseWheelListener", null);
        setField(term3291, term3291.getClass(), "inputMethodListener", null);
        setLongField(term3291, term3291.getClass(), "eventMask", 0L);
        setField(term3291, term3291.getClass(), "changeSupport", null);
        setField(term3291, term3291.getClass(), "objectLock", null);
        setBooleanField(term3291, term3291.getClass(), "isPacked", false);
        setIntField(term3291, term3291.getClass(), "boundsOp", 0);
        setField(term3291, term3291.getClass(), "compoundShape", null);
        setField(term3291, term3291.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term3291, term3291.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term3291, term3291.getClass(), "backgroundEraseDisabled", false);
        setField(term3291, term3291.getClass(), "eventCache", null);
        setBooleanField(term3291, term3291.getClass(), "coalescingEnabled", false);
        setBooleanField(term3291, term3291.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term3291, term3291.getClass(), "componentSerializedDataVersion", 0);
        setField(term3291, term3291.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "preloadImages", argTypes, term3291, args);
    }

};


