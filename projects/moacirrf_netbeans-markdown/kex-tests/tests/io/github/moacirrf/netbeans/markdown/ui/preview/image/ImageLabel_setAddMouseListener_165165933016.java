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

public class ImageLabel_setAddMouseListener_165165933016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2791;

    public ImageLabel_setAddMouseListener_165165933016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2791 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel"));
        setField(term2791, term2791.getClass(), "urlHiperlinkParent", null);
        setField(term2791, term2791.getClass(), "imageIconOriginal", null);
        setField(term2791, term2791.getClass(), "imageKey", null);
        setIntField(term2791, term2791.getClass(), "mnemonic", 0);
        setIntField(term2791, term2791.getClass(), "mnemonicIndex", 0);
        setField(term2791, term2791.getClass(), "text", null);
        setField(term2791, term2791.getClass(), "defaultIcon", null);
        setField(term2791, term2791.getClass(), "disabledIcon", null);
        setBooleanField(term2791, term2791.getClass(), "disabledIconSet", false);
        setIntField(term2791, term2791.getClass(), "verticalAlignment", 0);
        setIntField(term2791, term2791.getClass(), "horizontalAlignment", 0);
        setIntField(term2791, term2791.getClass(), "verticalTextPosition", 0);
        setIntField(term2791, term2791.getClass(), "horizontalTextPosition", 0);
        setIntField(term2791, term2791.getClass(), "iconTextGap", 0);
        setField(term2791, term2791.getClass(), "labelFor", null);
        setBooleanField(term2791, term2791.getClass(), "isAlignmentXSet", false);
        setFloatField(term2791, term2791.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2791, term2791.getClass(), "isAlignmentYSet", false);
        setFloatField(term2791, term2791.getClass(), "alignmentY", 0.0F);
        setField(term2791, term2791.getClass(), "ui", null);
        setField(term2791, term2791.getClass(), "listenerList", null);
        setField(term2791, term2791.getClass(), "clientProperties", null);
        setField(term2791, term2791.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2791, term2791.getClass(), "autoscrolls", false);
        setField(term2791, term2791.getClass(), "border", null);
        setIntField(term2791, term2791.getClass(), "flags", 0);
        setField(term2791, term2791.getClass(), "inputVerifier", null);
        setBooleanField(term2791, term2791.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2791, term2791.getClass(), "paintingChild", null);
        setField(term2791, term2791.getClass(), "popupMenu", null);
        setField(term2791, term2791.getClass(), "revalidateRunnableScheduled", null);
        setField(term2791, term2791.getClass(), "focusInputMap", null);
        setField(term2791, term2791.getClass(), "ancestorInputMap", null);
        setField(term2791, term2791.getClass(), "windowInputMap", null);
        setField(term2791, term2791.getClass(), "actionMap", null);
        setField(term2791, term2791.getClass(), "aaHint", null);
        setField(term2791, term2791.getClass(), "lcdRenderingHint", null);
        setField(term2791, term2791.getClass(), "component", null);
        setField(term2791, term2791.getClass(), "layoutMgr", null);
        setField(term2791, term2791.getClass(), "dispatcher", null);
        setField(term2791, term2791.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2791, term2791.getClass(), "focusCycleRoot", false);
        setBooleanField(term2791, term2791.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2791, term2791.getClass(), "printingThreads", null);
        setBooleanField(term2791, term2791.getClass(), "printing", false);
        setField(term2791, term2791.getClass(), "containerListener", null);
        setIntField(term2791, term2791.getClass(), "listeningChildren", 0);
        setIntField(term2791, term2791.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2791, term2791.getClass(), "descendantsCount", 0);
        setField(term2791, term2791.getClass(), "preserveBackgroundColor", null);
        setIntField(term2791, term2791.getClass(), "numOfHWComponents", 0);
        setIntField(term2791, term2791.getClass(), "numOfLWComponents", 0);
        setField(term2791, term2791.getClass(), "modalComp", null);
        setField(term2791, term2791.getClass(), "modalAppContext", null);
        setIntField(term2791, term2791.getClass(), "containerSerializedDataVersion", 0);
        setField(term2791, term2791.getClass(), "peer", null);
        setField(term2791, term2791.getClass(), "parent", null);
        setField(term2791, term2791.getClass(), "appContext", null);
        setIntField(term2791, term2791.getClass(), "x", 0);
        setIntField(term2791, term2791.getClass(), "y", 0);
        setIntField(term2791, term2791.getClass(), "width", 0);
        setIntField(term2791, term2791.getClass(), "height", 0);
        setField(term2791, term2791.getClass(), "foreground", null);
        setField(term2791, term2791.getClass(), "background", null);
        setField(term2791, term2791.getClass(), "font", null);
        setField(term2791, term2791.getClass(), "peerFont", null);
        setField(term2791, term2791.getClass(), "cursor", null);
        setField(term2791, term2791.getClass(), "locale", null);
        setField(term2791, term2791.getClass(), "graphicsConfig", null);
        setField(term2791, term2791.getClass(), "bufferStrategy", null);
        setBooleanField(term2791, term2791.getClass(), "ignoreRepaint", false);
        setBooleanField(term2791, term2791.getClass(), "visible", false);
        setBooleanField(term2791, term2791.getClass(), "enabled", false);
        setBooleanField(term2791, term2791.getClass(), "valid", false);
        setField(term2791, term2791.getClass(), "dropTarget", null);
        setField(term2791, term2791.getClass(), "popups", null);
        setField(term2791, term2791.getClass(), "name", null);
        setBooleanField(term2791, term2791.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2791, term2791.getClass(), "focusable", false);
        setIntField(term2791, term2791.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2791, term2791.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2791, term2791.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2791, term2791.getClass(), "acc", null);
        setField(term2791, term2791.getClass(), "minSize", null);
        setBooleanField(term2791, term2791.getClass(), "minSizeSet", false);
        setField(term2791, term2791.getClass(), "prefSize", null);
        setBooleanField(term2791, term2791.getClass(), "prefSizeSet", false);
        setField(term2791, term2791.getClass(), "maxSize", null);
        setBooleanField(term2791, term2791.getClass(), "maxSizeSet", false);
        setField(term2791, term2791.getClass(), "componentOrientation", null);
        setBooleanField(term2791, term2791.getClass(), "newEventsOnly", false);
        setField(term2791, term2791.getClass(), "componentListener", null);
        setField(term2791, term2791.getClass(), "focusListener", null);
        setField(term2791, term2791.getClass(), "hierarchyListener", null);
        setField(term2791, term2791.getClass(), "hierarchyBoundsListener", null);
        setField(term2791, term2791.getClass(), "keyListener", null);
        setField(term2791, term2791.getClass(), "mouseListener", null);
        setField(term2791, term2791.getClass(), "mouseMotionListener", null);
        setField(term2791, term2791.getClass(), "mouseWheelListener", null);
        setField(term2791, term2791.getClass(), "inputMethodListener", null);
        setLongField(term2791, term2791.getClass(), "eventMask", 0L);
        setField(term2791, term2791.getClass(), "changeSupport", null);
        setField(term2791, term2791.getClass(), "objectLock", null);
        setBooleanField(term2791, term2791.getClass(), "isPacked", false);
        setIntField(term2791, term2791.getClass(), "boundsOp", 0);
        setField(term2791, term2791.getClass(), "compoundShape", null);
        setField(term2791, term2791.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2791, term2791.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2791, term2791.getClass(), "backgroundEraseDisabled", false);
        setField(term2791, term2791.getClass(), "eventCache", null);
        setBooleanField(term2791, term2791.getClass(), "coalescingEnabled", false);
        setBooleanField(term2791, term2791.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2791, term2791.getClass(), "componentSerializedDataVersion", 0);
        setField(term2791, term2791.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.text.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setAddMouseListener", argTypes, term2791, args);
    }

};


