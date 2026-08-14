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

public class ImageLabel_getUrlHiperlinkParent_16023107630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3487;

    public ImageLabel_getUrlHiperlinkParent_16023107630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3487 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel"));
        setField(term3487, term3487.getClass(), "urlHiperlinkParent", null);
        setField(term3487, term3487.getClass(), "imageIconOriginal", null);
        setField(term3487, term3487.getClass(), "imageKey", null);
        setIntField(term3487, term3487.getClass(), "mnemonic", 0);
        setIntField(term3487, term3487.getClass(), "mnemonicIndex", 0);
        setField(term3487, term3487.getClass(), "text", null);
        setField(term3487, term3487.getClass(), "defaultIcon", null);
        setField(term3487, term3487.getClass(), "disabledIcon", null);
        setBooleanField(term3487, term3487.getClass(), "disabledIconSet", false);
        setIntField(term3487, term3487.getClass(), "verticalAlignment", 0);
        setIntField(term3487, term3487.getClass(), "horizontalAlignment", 0);
        setIntField(term3487, term3487.getClass(), "verticalTextPosition", 0);
        setIntField(term3487, term3487.getClass(), "horizontalTextPosition", 0);
        setIntField(term3487, term3487.getClass(), "iconTextGap", 0);
        setField(term3487, term3487.getClass(), "labelFor", null);
        setBooleanField(term3487, term3487.getClass(), "isAlignmentXSet", false);
        setFloatField(term3487, term3487.getClass(), "alignmentX", 0.0F);
        setBooleanField(term3487, term3487.getClass(), "isAlignmentYSet", false);
        setFloatField(term3487, term3487.getClass(), "alignmentY", 0.0F);
        setField(term3487, term3487.getClass(), "ui", null);
        setField(term3487, term3487.getClass(), "listenerList", null);
        setField(term3487, term3487.getClass(), "clientProperties", null);
        setField(term3487, term3487.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term3487, term3487.getClass(), "autoscrolls", false);
        setField(term3487, term3487.getClass(), "border", null);
        setIntField(term3487, term3487.getClass(), "flags", 0);
        setField(term3487, term3487.getClass(), "inputVerifier", null);
        setBooleanField(term3487, term3487.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term3487, term3487.getClass(), "paintingChild", null);
        setField(term3487, term3487.getClass(), "popupMenu", null);
        setField(term3487, term3487.getClass(), "revalidateRunnableScheduled", null);
        setField(term3487, term3487.getClass(), "focusInputMap", null);
        setField(term3487, term3487.getClass(), "ancestorInputMap", null);
        setField(term3487, term3487.getClass(), "windowInputMap", null);
        setField(term3487, term3487.getClass(), "actionMap", null);
        setField(term3487, term3487.getClass(), "aaHint", null);
        setField(term3487, term3487.getClass(), "lcdRenderingHint", null);
        setField(term3487, term3487.getClass(), "component", null);
        setField(term3487, term3487.getClass(), "layoutMgr", null);
        setField(term3487, term3487.getClass(), "dispatcher", null);
        setField(term3487, term3487.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term3487, term3487.getClass(), "focusCycleRoot", false);
        setBooleanField(term3487, term3487.getClass(), "focusTraversalPolicyProvider", false);
        setField(term3487, term3487.getClass(), "printingThreads", null);
        setBooleanField(term3487, term3487.getClass(), "printing", false);
        setField(term3487, term3487.getClass(), "containerListener", null);
        setIntField(term3487, term3487.getClass(), "listeningChildren", 0);
        setIntField(term3487, term3487.getClass(), "listeningBoundsChildren", 0);
        setIntField(term3487, term3487.getClass(), "descendantsCount", 0);
        setField(term3487, term3487.getClass(), "preserveBackgroundColor", null);
        setIntField(term3487, term3487.getClass(), "numOfHWComponents", 0);
        setIntField(term3487, term3487.getClass(), "numOfLWComponents", 0);
        setField(term3487, term3487.getClass(), "modalComp", null);
        setField(term3487, term3487.getClass(), "modalAppContext", null);
        setIntField(term3487, term3487.getClass(), "containerSerializedDataVersion", 0);
        setField(term3487, term3487.getClass(), "peer", null);
        setField(term3487, term3487.getClass(), "parent", null);
        setField(term3487, term3487.getClass(), "appContext", null);
        setIntField(term3487, term3487.getClass(), "x", 0);
        setIntField(term3487, term3487.getClass(), "y", 0);
        setIntField(term3487, term3487.getClass(), "width", 0);
        setIntField(term3487, term3487.getClass(), "height", 0);
        setField(term3487, term3487.getClass(), "foreground", null);
        setField(term3487, term3487.getClass(), "background", null);
        setField(term3487, term3487.getClass(), "font", null);
        setField(term3487, term3487.getClass(), "peerFont", null);
        setField(term3487, term3487.getClass(), "cursor", null);
        setField(term3487, term3487.getClass(), "locale", null);
        setField(term3487, term3487.getClass(), "graphicsConfig", null);
        setField(term3487, term3487.getClass(), "bufferStrategy", null);
        setBooleanField(term3487, term3487.getClass(), "ignoreRepaint", false);
        setBooleanField(term3487, term3487.getClass(), "visible", false);
        setBooleanField(term3487, term3487.getClass(), "enabled", false);
        setBooleanField(term3487, term3487.getClass(), "valid", false);
        setField(term3487, term3487.getClass(), "dropTarget", null);
        setField(term3487, term3487.getClass(), "popups", null);
        setField(term3487, term3487.getClass(), "name", null);
        setBooleanField(term3487, term3487.getClass(), "nameExplicitlySet", false);
        setBooleanField(term3487, term3487.getClass(), "focusable", false);
        setIntField(term3487, term3487.getClass(), "isFocusTraversableOverridden", 0);
        setField(term3487, term3487.getClass(), "focusTraversalKeys", null);
        setBooleanField(term3487, term3487.getClass(), "focusTraversalKeysEnabled", false);
        setField(term3487, term3487.getClass(), "acc", null);
        setField(term3487, term3487.getClass(), "minSize", null);
        setBooleanField(term3487, term3487.getClass(), "minSizeSet", false);
        setField(term3487, term3487.getClass(), "prefSize", null);
        setBooleanField(term3487, term3487.getClass(), "prefSizeSet", false);
        setField(term3487, term3487.getClass(), "maxSize", null);
        setBooleanField(term3487, term3487.getClass(), "maxSizeSet", false);
        setField(term3487, term3487.getClass(), "componentOrientation", null);
        setBooleanField(term3487, term3487.getClass(), "newEventsOnly", false);
        setField(term3487, term3487.getClass(), "componentListener", null);
        setField(term3487, term3487.getClass(), "focusListener", null);
        setField(term3487, term3487.getClass(), "hierarchyListener", null);
        setField(term3487, term3487.getClass(), "hierarchyBoundsListener", null);
        setField(term3487, term3487.getClass(), "keyListener", null);
        setField(term3487, term3487.getClass(), "mouseListener", null);
        setField(term3487, term3487.getClass(), "mouseMotionListener", null);
        setField(term3487, term3487.getClass(), "mouseWheelListener", null);
        setField(term3487, term3487.getClass(), "inputMethodListener", null);
        setLongField(term3487, term3487.getClass(), "eventMask", 0L);
        setField(term3487, term3487.getClass(), "changeSupport", null);
        setField(term3487, term3487.getClass(), "objectLock", null);
        setBooleanField(term3487, term3487.getClass(), "isPacked", false);
        setIntField(term3487, term3487.getClass(), "boundsOp", 0);
        setField(term3487, term3487.getClass(), "compoundShape", null);
        setField(term3487, term3487.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term3487, term3487.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term3487, term3487.getClass(), "backgroundEraseDisabled", false);
        setField(term3487, term3487.getClass(), "eventCache", null);
        setBooleanField(term3487, term3487.getClass(), "coalescingEnabled", false);
        setBooleanField(term3487, term3487.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term3487, term3487.getClass(), "componentSerializedDataVersion", 0);
        setField(term3487, term3487.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.text.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getUrlHiperlinkParent", argTypes, term3487, args);
    }

};


