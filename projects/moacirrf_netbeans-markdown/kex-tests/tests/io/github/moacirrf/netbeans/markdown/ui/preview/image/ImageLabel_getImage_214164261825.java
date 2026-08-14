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

public class ImageLabel_getImage_214164261825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3242;

    public ImageLabel_getImage_214164261825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3242 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel"));
        setField(term3242, term3242.getClass(), "urlHiperlinkParent", null);
        setField(term3242, term3242.getClass(), "imageIconOriginal", null);
        setField(term3242, term3242.getClass(), "imageKey", null);
        setIntField(term3242, term3242.getClass(), "mnemonic", 0);
        setIntField(term3242, term3242.getClass(), "mnemonicIndex", 0);
        setField(term3242, term3242.getClass(), "text", null);
        setField(term3242, term3242.getClass(), "defaultIcon", null);
        setField(term3242, term3242.getClass(), "disabledIcon", null);
        setBooleanField(term3242, term3242.getClass(), "disabledIconSet", false);
        setIntField(term3242, term3242.getClass(), "verticalAlignment", 0);
        setIntField(term3242, term3242.getClass(), "horizontalAlignment", 0);
        setIntField(term3242, term3242.getClass(), "verticalTextPosition", 0);
        setIntField(term3242, term3242.getClass(), "horizontalTextPosition", 0);
        setIntField(term3242, term3242.getClass(), "iconTextGap", 0);
        setField(term3242, term3242.getClass(), "labelFor", null);
        setBooleanField(term3242, term3242.getClass(), "isAlignmentXSet", false);
        setFloatField(term3242, term3242.getClass(), "alignmentX", 0.0F);
        setBooleanField(term3242, term3242.getClass(), "isAlignmentYSet", false);
        setFloatField(term3242, term3242.getClass(), "alignmentY", 0.0F);
        setField(term3242, term3242.getClass(), "ui", null);
        setField(term3242, term3242.getClass(), "listenerList", null);
        setField(term3242, term3242.getClass(), "clientProperties", null);
        setField(term3242, term3242.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term3242, term3242.getClass(), "autoscrolls", false);
        setField(term3242, term3242.getClass(), "border", null);
        setIntField(term3242, term3242.getClass(), "flags", 0);
        setField(term3242, term3242.getClass(), "inputVerifier", null);
        setBooleanField(term3242, term3242.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term3242, term3242.getClass(), "paintingChild", null);
        setField(term3242, term3242.getClass(), "popupMenu", null);
        setField(term3242, term3242.getClass(), "revalidateRunnableScheduled", null);
        setField(term3242, term3242.getClass(), "focusInputMap", null);
        setField(term3242, term3242.getClass(), "ancestorInputMap", null);
        setField(term3242, term3242.getClass(), "windowInputMap", null);
        setField(term3242, term3242.getClass(), "actionMap", null);
        setField(term3242, term3242.getClass(), "aaHint", null);
        setField(term3242, term3242.getClass(), "lcdRenderingHint", null);
        setField(term3242, term3242.getClass(), "component", null);
        setField(term3242, term3242.getClass(), "layoutMgr", null);
        setField(term3242, term3242.getClass(), "dispatcher", null);
        setField(term3242, term3242.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term3242, term3242.getClass(), "focusCycleRoot", false);
        setBooleanField(term3242, term3242.getClass(), "focusTraversalPolicyProvider", false);
        setField(term3242, term3242.getClass(), "printingThreads", null);
        setBooleanField(term3242, term3242.getClass(), "printing", false);
        setField(term3242, term3242.getClass(), "containerListener", null);
        setIntField(term3242, term3242.getClass(), "listeningChildren", 0);
        setIntField(term3242, term3242.getClass(), "listeningBoundsChildren", 0);
        setIntField(term3242, term3242.getClass(), "descendantsCount", 0);
        setField(term3242, term3242.getClass(), "preserveBackgroundColor", null);
        setIntField(term3242, term3242.getClass(), "numOfHWComponents", 0);
        setIntField(term3242, term3242.getClass(), "numOfLWComponents", 0);
        setField(term3242, term3242.getClass(), "modalComp", null);
        setField(term3242, term3242.getClass(), "modalAppContext", null);
        setIntField(term3242, term3242.getClass(), "containerSerializedDataVersion", 0);
        setField(term3242, term3242.getClass(), "peer", null);
        setField(term3242, term3242.getClass(), "parent", null);
        setField(term3242, term3242.getClass(), "appContext", null);
        setIntField(term3242, term3242.getClass(), "x", 0);
        setIntField(term3242, term3242.getClass(), "y", 0);
        setIntField(term3242, term3242.getClass(), "width", 0);
        setIntField(term3242, term3242.getClass(), "height", 0);
        setField(term3242, term3242.getClass(), "foreground", null);
        setField(term3242, term3242.getClass(), "background", null);
        setField(term3242, term3242.getClass(), "font", null);
        setField(term3242, term3242.getClass(), "peerFont", null);
        setField(term3242, term3242.getClass(), "cursor", null);
        setField(term3242, term3242.getClass(), "locale", null);
        setField(term3242, term3242.getClass(), "graphicsConfig", null);
        setField(term3242, term3242.getClass(), "bufferStrategy", null);
        setBooleanField(term3242, term3242.getClass(), "ignoreRepaint", false);
        setBooleanField(term3242, term3242.getClass(), "visible", false);
        setBooleanField(term3242, term3242.getClass(), "enabled", false);
        setBooleanField(term3242, term3242.getClass(), "valid", false);
        setField(term3242, term3242.getClass(), "dropTarget", null);
        setField(term3242, term3242.getClass(), "popups", null);
        setField(term3242, term3242.getClass(), "name", null);
        setBooleanField(term3242, term3242.getClass(), "nameExplicitlySet", false);
        setBooleanField(term3242, term3242.getClass(), "focusable", false);
        setIntField(term3242, term3242.getClass(), "isFocusTraversableOverridden", 0);
        setField(term3242, term3242.getClass(), "focusTraversalKeys", null);
        setBooleanField(term3242, term3242.getClass(), "focusTraversalKeysEnabled", false);
        setField(term3242, term3242.getClass(), "acc", null);
        setField(term3242, term3242.getClass(), "minSize", null);
        setBooleanField(term3242, term3242.getClass(), "minSizeSet", false);
        setField(term3242, term3242.getClass(), "prefSize", null);
        setBooleanField(term3242, term3242.getClass(), "prefSizeSet", false);
        setField(term3242, term3242.getClass(), "maxSize", null);
        setBooleanField(term3242, term3242.getClass(), "maxSizeSet", false);
        setField(term3242, term3242.getClass(), "componentOrientation", null);
        setBooleanField(term3242, term3242.getClass(), "newEventsOnly", false);
        setField(term3242, term3242.getClass(), "componentListener", null);
        setField(term3242, term3242.getClass(), "focusListener", null);
        setField(term3242, term3242.getClass(), "hierarchyListener", null);
        setField(term3242, term3242.getClass(), "hierarchyBoundsListener", null);
        setField(term3242, term3242.getClass(), "keyListener", null);
        setField(term3242, term3242.getClass(), "mouseListener", null);
        setField(term3242, term3242.getClass(), "mouseMotionListener", null);
        setField(term3242, term3242.getClass(), "mouseWheelListener", null);
        setField(term3242, term3242.getClass(), "inputMethodListener", null);
        setLongField(term3242, term3242.getClass(), "eventMask", 0L);
        setField(term3242, term3242.getClass(), "changeSupport", null);
        setField(term3242, term3242.getClass(), "objectLock", null);
        setBooleanField(term3242, term3242.getClass(), "isPacked", false);
        setIntField(term3242, term3242.getClass(), "boundsOp", 0);
        setField(term3242, term3242.getClass(), "compoundShape", null);
        setField(term3242, term3242.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term3242, term3242.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term3242, term3242.getClass(), "backgroundEraseDisabled", false);
        setField(term3242, term3242.getClass(), "eventCache", null);
        setBooleanField(term3242, term3242.getClass(), "coalescingEnabled", false);
        setBooleanField(term3242, term3242.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term3242, term3242.getClass(), "componentSerializedDataVersion", 0);
        setField(term3242, term3242.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.net.URL");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getImage", argTypes, term3242, args);
    }

};


