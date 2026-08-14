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

public class ImageLabel_getImageKey_48905057524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3193;

    public ImageLabel_getImageKey_48905057524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3193 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel"));
        setField(term3193, term3193.getClass(), "urlHiperlinkParent", null);
        setField(term3193, term3193.getClass(), "imageIconOriginal", null);
        setField(term3193, term3193.getClass(), "imageKey", null);
        setIntField(term3193, term3193.getClass(), "mnemonic", 0);
        setIntField(term3193, term3193.getClass(), "mnemonicIndex", 0);
        setField(term3193, term3193.getClass(), "text", null);
        setField(term3193, term3193.getClass(), "defaultIcon", null);
        setField(term3193, term3193.getClass(), "disabledIcon", null);
        setBooleanField(term3193, term3193.getClass(), "disabledIconSet", false);
        setIntField(term3193, term3193.getClass(), "verticalAlignment", 0);
        setIntField(term3193, term3193.getClass(), "horizontalAlignment", 0);
        setIntField(term3193, term3193.getClass(), "verticalTextPosition", 0);
        setIntField(term3193, term3193.getClass(), "horizontalTextPosition", 0);
        setIntField(term3193, term3193.getClass(), "iconTextGap", 0);
        setField(term3193, term3193.getClass(), "labelFor", null);
        setBooleanField(term3193, term3193.getClass(), "isAlignmentXSet", false);
        setFloatField(term3193, term3193.getClass(), "alignmentX", 0.0F);
        setBooleanField(term3193, term3193.getClass(), "isAlignmentYSet", false);
        setFloatField(term3193, term3193.getClass(), "alignmentY", 0.0F);
        setField(term3193, term3193.getClass(), "ui", null);
        setField(term3193, term3193.getClass(), "listenerList", null);
        setField(term3193, term3193.getClass(), "clientProperties", null);
        setField(term3193, term3193.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term3193, term3193.getClass(), "autoscrolls", false);
        setField(term3193, term3193.getClass(), "border", null);
        setIntField(term3193, term3193.getClass(), "flags", 0);
        setField(term3193, term3193.getClass(), "inputVerifier", null);
        setBooleanField(term3193, term3193.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term3193, term3193.getClass(), "paintingChild", null);
        setField(term3193, term3193.getClass(), "popupMenu", null);
        setField(term3193, term3193.getClass(), "revalidateRunnableScheduled", null);
        setField(term3193, term3193.getClass(), "focusInputMap", null);
        setField(term3193, term3193.getClass(), "ancestorInputMap", null);
        setField(term3193, term3193.getClass(), "windowInputMap", null);
        setField(term3193, term3193.getClass(), "actionMap", null);
        setField(term3193, term3193.getClass(), "aaHint", null);
        setField(term3193, term3193.getClass(), "lcdRenderingHint", null);
        setField(term3193, term3193.getClass(), "component", null);
        setField(term3193, term3193.getClass(), "layoutMgr", null);
        setField(term3193, term3193.getClass(), "dispatcher", null);
        setField(term3193, term3193.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term3193, term3193.getClass(), "focusCycleRoot", false);
        setBooleanField(term3193, term3193.getClass(), "focusTraversalPolicyProvider", false);
        setField(term3193, term3193.getClass(), "printingThreads", null);
        setBooleanField(term3193, term3193.getClass(), "printing", false);
        setField(term3193, term3193.getClass(), "containerListener", null);
        setIntField(term3193, term3193.getClass(), "listeningChildren", 0);
        setIntField(term3193, term3193.getClass(), "listeningBoundsChildren", 0);
        setIntField(term3193, term3193.getClass(), "descendantsCount", 0);
        setField(term3193, term3193.getClass(), "preserveBackgroundColor", null);
        setIntField(term3193, term3193.getClass(), "numOfHWComponents", 0);
        setIntField(term3193, term3193.getClass(), "numOfLWComponents", 0);
        setField(term3193, term3193.getClass(), "modalComp", null);
        setField(term3193, term3193.getClass(), "modalAppContext", null);
        setIntField(term3193, term3193.getClass(), "containerSerializedDataVersion", 0);
        setField(term3193, term3193.getClass(), "peer", null);
        setField(term3193, term3193.getClass(), "parent", null);
        setField(term3193, term3193.getClass(), "appContext", null);
        setIntField(term3193, term3193.getClass(), "x", 0);
        setIntField(term3193, term3193.getClass(), "y", 0);
        setIntField(term3193, term3193.getClass(), "width", 0);
        setIntField(term3193, term3193.getClass(), "height", 0);
        setField(term3193, term3193.getClass(), "foreground", null);
        setField(term3193, term3193.getClass(), "background", null);
        setField(term3193, term3193.getClass(), "font", null);
        setField(term3193, term3193.getClass(), "peerFont", null);
        setField(term3193, term3193.getClass(), "cursor", null);
        setField(term3193, term3193.getClass(), "locale", null);
        setField(term3193, term3193.getClass(), "graphicsConfig", null);
        setField(term3193, term3193.getClass(), "bufferStrategy", null);
        setBooleanField(term3193, term3193.getClass(), "ignoreRepaint", false);
        setBooleanField(term3193, term3193.getClass(), "visible", false);
        setBooleanField(term3193, term3193.getClass(), "enabled", false);
        setBooleanField(term3193, term3193.getClass(), "valid", false);
        setField(term3193, term3193.getClass(), "dropTarget", null);
        setField(term3193, term3193.getClass(), "popups", null);
        setField(term3193, term3193.getClass(), "name", null);
        setBooleanField(term3193, term3193.getClass(), "nameExplicitlySet", false);
        setBooleanField(term3193, term3193.getClass(), "focusable", false);
        setIntField(term3193, term3193.getClass(), "isFocusTraversableOverridden", 0);
        setField(term3193, term3193.getClass(), "focusTraversalKeys", null);
        setBooleanField(term3193, term3193.getClass(), "focusTraversalKeysEnabled", false);
        setField(term3193, term3193.getClass(), "acc", null);
        setField(term3193, term3193.getClass(), "minSize", null);
        setBooleanField(term3193, term3193.getClass(), "minSizeSet", false);
        setField(term3193, term3193.getClass(), "prefSize", null);
        setBooleanField(term3193, term3193.getClass(), "prefSizeSet", false);
        setField(term3193, term3193.getClass(), "maxSize", null);
        setBooleanField(term3193, term3193.getClass(), "maxSizeSet", false);
        setField(term3193, term3193.getClass(), "componentOrientation", null);
        setBooleanField(term3193, term3193.getClass(), "newEventsOnly", false);
        setField(term3193, term3193.getClass(), "componentListener", null);
        setField(term3193, term3193.getClass(), "focusListener", null);
        setField(term3193, term3193.getClass(), "hierarchyListener", null);
        setField(term3193, term3193.getClass(), "hierarchyBoundsListener", null);
        setField(term3193, term3193.getClass(), "keyListener", null);
        setField(term3193, term3193.getClass(), "mouseListener", null);
        setField(term3193, term3193.getClass(), "mouseMotionListener", null);
        setField(term3193, term3193.getClass(), "mouseWheelListener", null);
        setField(term3193, term3193.getClass(), "inputMethodListener", null);
        setLongField(term3193, term3193.getClass(), "eventMask", 0L);
        setField(term3193, term3193.getClass(), "changeSupport", null);
        setField(term3193, term3193.getClass(), "objectLock", null);
        setBooleanField(term3193, term3193.getClass(), "isPacked", false);
        setIntField(term3193, term3193.getClass(), "boundsOp", 0);
        setField(term3193, term3193.getClass(), "compoundShape", null);
        setField(term3193, term3193.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term3193, term3193.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term3193, term3193.getClass(), "backgroundEraseDisabled", false);
        setField(term3193, term3193.getClass(), "eventCache", null);
        setBooleanField(term3193, term3193.getClass(), "coalescingEnabled", false);
        setBooleanField(term3193, term3193.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term3193, term3193.getClass(), "componentSerializedDataVersion", 0);
        setField(term3193, term3193.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.text.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getImageKey", argTypes, term3193, args);
    }

};


