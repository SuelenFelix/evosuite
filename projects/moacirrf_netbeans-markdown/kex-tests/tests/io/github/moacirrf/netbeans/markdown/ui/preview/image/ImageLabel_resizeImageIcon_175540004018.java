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

public class ImageLabel_resizeImageIcon_175540004018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2889;
     Object term2938;

    public ImageLabel_resizeImageIcon_175540004018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2889 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel"));
        setField(term2889, term2889.getClass(), "urlHiperlinkParent", null);
        setField(term2889, term2889.getClass(), "imageIconOriginal", null);
        setField(term2889, term2889.getClass(), "imageKey", null);
        setIntField(term2889, term2889.getClass(), "mnemonic", 0);
        setIntField(term2889, term2889.getClass(), "mnemonicIndex", 0);
        setField(term2889, term2889.getClass(), "text", null);
        setField(term2889, term2889.getClass(), "defaultIcon", null);
        setField(term2889, term2889.getClass(), "disabledIcon", null);
        setBooleanField(term2889, term2889.getClass(), "disabledIconSet", false);
        setIntField(term2889, term2889.getClass(), "verticalAlignment", 0);
        setIntField(term2889, term2889.getClass(), "horizontalAlignment", 0);
        setIntField(term2889, term2889.getClass(), "verticalTextPosition", 0);
        setIntField(term2889, term2889.getClass(), "horizontalTextPosition", 0);
        setIntField(term2889, term2889.getClass(), "iconTextGap", 0);
        setField(term2889, term2889.getClass(), "labelFor", null);
        setBooleanField(term2889, term2889.getClass(), "isAlignmentXSet", false);
        setFloatField(term2889, term2889.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2889, term2889.getClass(), "isAlignmentYSet", false);
        setFloatField(term2889, term2889.getClass(), "alignmentY", 0.0F);
        setField(term2889, term2889.getClass(), "ui", null);
        setField(term2889, term2889.getClass(), "listenerList", null);
        setField(term2889, term2889.getClass(), "clientProperties", null);
        setField(term2889, term2889.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2889, term2889.getClass(), "autoscrolls", false);
        setField(term2889, term2889.getClass(), "border", null);
        setIntField(term2889, term2889.getClass(), "flags", 0);
        setField(term2889, term2889.getClass(), "inputVerifier", null);
        setBooleanField(term2889, term2889.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2889, term2889.getClass(), "paintingChild", null);
        setField(term2889, term2889.getClass(), "popupMenu", null);
        setField(term2889, term2889.getClass(), "revalidateRunnableScheduled", null);
        setField(term2889, term2889.getClass(), "focusInputMap", null);
        setField(term2889, term2889.getClass(), "ancestorInputMap", null);
        setField(term2889, term2889.getClass(), "windowInputMap", null);
        setField(term2889, term2889.getClass(), "actionMap", null);
        setField(term2889, term2889.getClass(), "aaHint", null);
        setField(term2889, term2889.getClass(), "lcdRenderingHint", null);
        setField(term2889, term2889.getClass(), "component", null);
        setField(term2889, term2889.getClass(), "layoutMgr", null);
        setField(term2889, term2889.getClass(), "dispatcher", null);
        setField(term2889, term2889.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2889, term2889.getClass(), "focusCycleRoot", false);
        setBooleanField(term2889, term2889.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2889, term2889.getClass(), "printingThreads", null);
        setBooleanField(term2889, term2889.getClass(), "printing", false);
        setField(term2889, term2889.getClass(), "containerListener", null);
        setIntField(term2889, term2889.getClass(), "listeningChildren", 0);
        setIntField(term2889, term2889.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2889, term2889.getClass(), "descendantsCount", 0);
        setField(term2889, term2889.getClass(), "preserveBackgroundColor", null);
        setIntField(term2889, term2889.getClass(), "numOfHWComponents", 0);
        setIntField(term2889, term2889.getClass(), "numOfLWComponents", 0);
        setField(term2889, term2889.getClass(), "modalComp", null);
        setField(term2889, term2889.getClass(), "modalAppContext", null);
        setIntField(term2889, term2889.getClass(), "containerSerializedDataVersion", 0);
        setField(term2889, term2889.getClass(), "peer", null);
        setField(term2889, term2889.getClass(), "parent", null);
        setField(term2889, term2889.getClass(), "appContext", null);
        setIntField(term2889, term2889.getClass(), "x", 0);
        setIntField(term2889, term2889.getClass(), "y", 0);
        setIntField(term2889, term2889.getClass(), "width", 0);
        setIntField(term2889, term2889.getClass(), "height", 0);
        setField(term2889, term2889.getClass(), "foreground", null);
        setField(term2889, term2889.getClass(), "background", null);
        setField(term2889, term2889.getClass(), "font", null);
        setField(term2889, term2889.getClass(), "peerFont", null);
        setField(term2889, term2889.getClass(), "cursor", null);
        setField(term2889, term2889.getClass(), "locale", null);
        setField(term2889, term2889.getClass(), "graphicsConfig", null);
        setField(term2889, term2889.getClass(), "bufferStrategy", null);
        setBooleanField(term2889, term2889.getClass(), "ignoreRepaint", false);
        setBooleanField(term2889, term2889.getClass(), "visible", false);
        setBooleanField(term2889, term2889.getClass(), "enabled", false);
        setBooleanField(term2889, term2889.getClass(), "valid", false);
        setField(term2889, term2889.getClass(), "dropTarget", null);
        setField(term2889, term2889.getClass(), "popups", null);
        setField(term2889, term2889.getClass(), "name", null);
        setBooleanField(term2889, term2889.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2889, term2889.getClass(), "focusable", false);
        setIntField(term2889, term2889.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2889, term2889.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2889, term2889.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2889, term2889.getClass(), "acc", null);
        setField(term2889, term2889.getClass(), "minSize", null);
        setBooleanField(term2889, term2889.getClass(), "minSizeSet", false);
        setField(term2889, term2889.getClass(), "prefSize", null);
        setBooleanField(term2889, term2889.getClass(), "prefSizeSet", false);
        setField(term2889, term2889.getClass(), "maxSize", null);
        setBooleanField(term2889, term2889.getClass(), "maxSizeSet", false);
        setField(term2889, term2889.getClass(), "componentOrientation", null);
        setBooleanField(term2889, term2889.getClass(), "newEventsOnly", false);
        setField(term2889, term2889.getClass(), "componentListener", null);
        setField(term2889, term2889.getClass(), "focusListener", null);
        setField(term2889, term2889.getClass(), "hierarchyListener", null);
        setField(term2889, term2889.getClass(), "hierarchyBoundsListener", null);
        setField(term2889, term2889.getClass(), "keyListener", null);
        setField(term2889, term2889.getClass(), "mouseListener", null);
        setField(term2889, term2889.getClass(), "mouseMotionListener", null);
        setField(term2889, term2889.getClass(), "mouseWheelListener", null);
        setField(term2889, term2889.getClass(), "inputMethodListener", null);
        setLongField(term2889, term2889.getClass(), "eventMask", 0L);
        setField(term2889, term2889.getClass(), "changeSupport", null);
        setField(term2889, term2889.getClass(), "objectLock", null);
        setBooleanField(term2889, term2889.getClass(), "isPacked", false);
        setIntField(term2889, term2889.getClass(), "boundsOp", 0);
        setField(term2889, term2889.getClass(), "compoundShape", null);
        setField(term2889, term2889.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2889, term2889.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2889, term2889.getClass(), "backgroundEraseDisabled", false);
        setField(term2889, term2889.getClass(), "eventCache", null);
        setBooleanField(term2889, term2889.getClass(), "coalescingEnabled", false);
        setBooleanField(term2889, term2889.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2889, term2889.getClass(), "componentSerializedDataVersion", 0);
        setField(term2889, term2889.getClass(), "accessibleContext", null);
        term2938 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2938;
        callMethod(klass, "resizeImageIcon", argTypes, term2889, args);
    }

};


