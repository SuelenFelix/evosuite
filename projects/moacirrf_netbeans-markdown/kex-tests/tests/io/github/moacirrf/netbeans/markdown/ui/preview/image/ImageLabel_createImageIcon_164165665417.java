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

public class ImageLabel_createImageIcon_164165665417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2840;

    public ImageLabel_createImageIcon_164165665417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2840 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel"));
        setField(term2840, term2840.getClass(), "urlHiperlinkParent", null);
        setField(term2840, term2840.getClass(), "imageIconOriginal", null);
        setField(term2840, term2840.getClass(), "imageKey", null);
        setIntField(term2840, term2840.getClass(), "mnemonic", 0);
        setIntField(term2840, term2840.getClass(), "mnemonicIndex", 0);
        setField(term2840, term2840.getClass(), "text", null);
        setField(term2840, term2840.getClass(), "defaultIcon", null);
        setField(term2840, term2840.getClass(), "disabledIcon", null);
        setBooleanField(term2840, term2840.getClass(), "disabledIconSet", false);
        setIntField(term2840, term2840.getClass(), "verticalAlignment", 0);
        setIntField(term2840, term2840.getClass(), "horizontalAlignment", 0);
        setIntField(term2840, term2840.getClass(), "verticalTextPosition", 0);
        setIntField(term2840, term2840.getClass(), "horizontalTextPosition", 0);
        setIntField(term2840, term2840.getClass(), "iconTextGap", 0);
        setField(term2840, term2840.getClass(), "labelFor", null);
        setBooleanField(term2840, term2840.getClass(), "isAlignmentXSet", false);
        setFloatField(term2840, term2840.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2840, term2840.getClass(), "isAlignmentYSet", false);
        setFloatField(term2840, term2840.getClass(), "alignmentY", 0.0F);
        setField(term2840, term2840.getClass(), "ui", null);
        setField(term2840, term2840.getClass(), "listenerList", null);
        setField(term2840, term2840.getClass(), "clientProperties", null);
        setField(term2840, term2840.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2840, term2840.getClass(), "autoscrolls", false);
        setField(term2840, term2840.getClass(), "border", null);
        setIntField(term2840, term2840.getClass(), "flags", 0);
        setField(term2840, term2840.getClass(), "inputVerifier", null);
        setBooleanField(term2840, term2840.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2840, term2840.getClass(), "paintingChild", null);
        setField(term2840, term2840.getClass(), "popupMenu", null);
        setField(term2840, term2840.getClass(), "revalidateRunnableScheduled", null);
        setField(term2840, term2840.getClass(), "focusInputMap", null);
        setField(term2840, term2840.getClass(), "ancestorInputMap", null);
        setField(term2840, term2840.getClass(), "windowInputMap", null);
        setField(term2840, term2840.getClass(), "actionMap", null);
        setField(term2840, term2840.getClass(), "aaHint", null);
        setField(term2840, term2840.getClass(), "lcdRenderingHint", null);
        setField(term2840, term2840.getClass(), "component", null);
        setField(term2840, term2840.getClass(), "layoutMgr", null);
        setField(term2840, term2840.getClass(), "dispatcher", null);
        setField(term2840, term2840.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2840, term2840.getClass(), "focusCycleRoot", false);
        setBooleanField(term2840, term2840.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2840, term2840.getClass(), "printingThreads", null);
        setBooleanField(term2840, term2840.getClass(), "printing", false);
        setField(term2840, term2840.getClass(), "containerListener", null);
        setIntField(term2840, term2840.getClass(), "listeningChildren", 0);
        setIntField(term2840, term2840.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2840, term2840.getClass(), "descendantsCount", 0);
        setField(term2840, term2840.getClass(), "preserveBackgroundColor", null);
        setIntField(term2840, term2840.getClass(), "numOfHWComponents", 0);
        setIntField(term2840, term2840.getClass(), "numOfLWComponents", 0);
        setField(term2840, term2840.getClass(), "modalComp", null);
        setField(term2840, term2840.getClass(), "modalAppContext", null);
        setIntField(term2840, term2840.getClass(), "containerSerializedDataVersion", 0);
        setField(term2840, term2840.getClass(), "peer", null);
        setField(term2840, term2840.getClass(), "parent", null);
        setField(term2840, term2840.getClass(), "appContext", null);
        setIntField(term2840, term2840.getClass(), "x", 0);
        setIntField(term2840, term2840.getClass(), "y", 0);
        setIntField(term2840, term2840.getClass(), "width", 0);
        setIntField(term2840, term2840.getClass(), "height", 0);
        setField(term2840, term2840.getClass(), "foreground", null);
        setField(term2840, term2840.getClass(), "background", null);
        setField(term2840, term2840.getClass(), "font", null);
        setField(term2840, term2840.getClass(), "peerFont", null);
        setField(term2840, term2840.getClass(), "cursor", null);
        setField(term2840, term2840.getClass(), "locale", null);
        setField(term2840, term2840.getClass(), "graphicsConfig", null);
        setField(term2840, term2840.getClass(), "bufferStrategy", null);
        setBooleanField(term2840, term2840.getClass(), "ignoreRepaint", false);
        setBooleanField(term2840, term2840.getClass(), "visible", false);
        setBooleanField(term2840, term2840.getClass(), "enabled", false);
        setBooleanField(term2840, term2840.getClass(), "valid", false);
        setField(term2840, term2840.getClass(), "dropTarget", null);
        setField(term2840, term2840.getClass(), "popups", null);
        setField(term2840, term2840.getClass(), "name", null);
        setBooleanField(term2840, term2840.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2840, term2840.getClass(), "focusable", false);
        setIntField(term2840, term2840.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2840, term2840.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2840, term2840.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2840, term2840.getClass(), "acc", null);
        setField(term2840, term2840.getClass(), "minSize", null);
        setBooleanField(term2840, term2840.getClass(), "minSizeSet", false);
        setField(term2840, term2840.getClass(), "prefSize", null);
        setBooleanField(term2840, term2840.getClass(), "prefSizeSet", false);
        setField(term2840, term2840.getClass(), "maxSize", null);
        setBooleanField(term2840, term2840.getClass(), "maxSizeSet", false);
        setField(term2840, term2840.getClass(), "componentOrientation", null);
        setBooleanField(term2840, term2840.getClass(), "newEventsOnly", false);
        setField(term2840, term2840.getClass(), "componentListener", null);
        setField(term2840, term2840.getClass(), "focusListener", null);
        setField(term2840, term2840.getClass(), "hierarchyListener", null);
        setField(term2840, term2840.getClass(), "hierarchyBoundsListener", null);
        setField(term2840, term2840.getClass(), "keyListener", null);
        setField(term2840, term2840.getClass(), "mouseListener", null);
        setField(term2840, term2840.getClass(), "mouseMotionListener", null);
        setField(term2840, term2840.getClass(), "mouseWheelListener", null);
        setField(term2840, term2840.getClass(), "inputMethodListener", null);
        setLongField(term2840, term2840.getClass(), "eventMask", 0L);
        setField(term2840, term2840.getClass(), "changeSupport", null);
        setField(term2840, term2840.getClass(), "objectLock", null);
        setBooleanField(term2840, term2840.getClass(), "isPacked", false);
        setIntField(term2840, term2840.getClass(), "boundsOp", 0);
        setField(term2840, term2840.getClass(), "compoundShape", null);
        setField(term2840, term2840.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2840, term2840.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2840, term2840.getClass(), "backgroundEraseDisabled", false);
        setField(term2840, term2840.getClass(), "eventCache", null);
        setBooleanField(term2840, term2840.getClass(), "coalescingEnabled", false);
        setBooleanField(term2840, term2840.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2840, term2840.getClass(), "componentSerializedDataVersion", 0);
        setField(term2840, term2840.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.text.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createImageIcon", argTypes, term2840, args);
    }

};


