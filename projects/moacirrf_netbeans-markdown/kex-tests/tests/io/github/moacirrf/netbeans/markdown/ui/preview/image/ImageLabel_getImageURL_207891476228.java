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

public class ImageLabel_getImageURL_207891476228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3389;

    public ImageLabel_getImageURL_207891476228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3389 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel"));
        setField(term3389, term3389.getClass(), "urlHiperlinkParent", null);
        setField(term3389, term3389.getClass(), "imageIconOriginal", null);
        setField(term3389, term3389.getClass(), "imageKey", null);
        setIntField(term3389, term3389.getClass(), "mnemonic", 0);
        setIntField(term3389, term3389.getClass(), "mnemonicIndex", 0);
        setField(term3389, term3389.getClass(), "text", null);
        setField(term3389, term3389.getClass(), "defaultIcon", null);
        setField(term3389, term3389.getClass(), "disabledIcon", null);
        setBooleanField(term3389, term3389.getClass(), "disabledIconSet", false);
        setIntField(term3389, term3389.getClass(), "verticalAlignment", 0);
        setIntField(term3389, term3389.getClass(), "horizontalAlignment", 0);
        setIntField(term3389, term3389.getClass(), "verticalTextPosition", 0);
        setIntField(term3389, term3389.getClass(), "horizontalTextPosition", 0);
        setIntField(term3389, term3389.getClass(), "iconTextGap", 0);
        setField(term3389, term3389.getClass(), "labelFor", null);
        setBooleanField(term3389, term3389.getClass(), "isAlignmentXSet", false);
        setFloatField(term3389, term3389.getClass(), "alignmentX", 0.0F);
        setBooleanField(term3389, term3389.getClass(), "isAlignmentYSet", false);
        setFloatField(term3389, term3389.getClass(), "alignmentY", 0.0F);
        setField(term3389, term3389.getClass(), "ui", null);
        setField(term3389, term3389.getClass(), "listenerList", null);
        setField(term3389, term3389.getClass(), "clientProperties", null);
        setField(term3389, term3389.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term3389, term3389.getClass(), "autoscrolls", false);
        setField(term3389, term3389.getClass(), "border", null);
        setIntField(term3389, term3389.getClass(), "flags", 0);
        setField(term3389, term3389.getClass(), "inputVerifier", null);
        setBooleanField(term3389, term3389.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term3389, term3389.getClass(), "paintingChild", null);
        setField(term3389, term3389.getClass(), "popupMenu", null);
        setField(term3389, term3389.getClass(), "revalidateRunnableScheduled", null);
        setField(term3389, term3389.getClass(), "focusInputMap", null);
        setField(term3389, term3389.getClass(), "ancestorInputMap", null);
        setField(term3389, term3389.getClass(), "windowInputMap", null);
        setField(term3389, term3389.getClass(), "actionMap", null);
        setField(term3389, term3389.getClass(), "aaHint", null);
        setField(term3389, term3389.getClass(), "lcdRenderingHint", null);
        setField(term3389, term3389.getClass(), "component", null);
        setField(term3389, term3389.getClass(), "layoutMgr", null);
        setField(term3389, term3389.getClass(), "dispatcher", null);
        setField(term3389, term3389.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term3389, term3389.getClass(), "focusCycleRoot", false);
        setBooleanField(term3389, term3389.getClass(), "focusTraversalPolicyProvider", false);
        setField(term3389, term3389.getClass(), "printingThreads", null);
        setBooleanField(term3389, term3389.getClass(), "printing", false);
        setField(term3389, term3389.getClass(), "containerListener", null);
        setIntField(term3389, term3389.getClass(), "listeningChildren", 0);
        setIntField(term3389, term3389.getClass(), "listeningBoundsChildren", 0);
        setIntField(term3389, term3389.getClass(), "descendantsCount", 0);
        setField(term3389, term3389.getClass(), "preserveBackgroundColor", null);
        setIntField(term3389, term3389.getClass(), "numOfHWComponents", 0);
        setIntField(term3389, term3389.getClass(), "numOfLWComponents", 0);
        setField(term3389, term3389.getClass(), "modalComp", null);
        setField(term3389, term3389.getClass(), "modalAppContext", null);
        setIntField(term3389, term3389.getClass(), "containerSerializedDataVersion", 0);
        setField(term3389, term3389.getClass(), "peer", null);
        setField(term3389, term3389.getClass(), "parent", null);
        setField(term3389, term3389.getClass(), "appContext", null);
        setIntField(term3389, term3389.getClass(), "x", 0);
        setIntField(term3389, term3389.getClass(), "y", 0);
        setIntField(term3389, term3389.getClass(), "width", 0);
        setIntField(term3389, term3389.getClass(), "height", 0);
        setField(term3389, term3389.getClass(), "foreground", null);
        setField(term3389, term3389.getClass(), "background", null);
        setField(term3389, term3389.getClass(), "font", null);
        setField(term3389, term3389.getClass(), "peerFont", null);
        setField(term3389, term3389.getClass(), "cursor", null);
        setField(term3389, term3389.getClass(), "locale", null);
        setField(term3389, term3389.getClass(), "graphicsConfig", null);
        setField(term3389, term3389.getClass(), "bufferStrategy", null);
        setBooleanField(term3389, term3389.getClass(), "ignoreRepaint", false);
        setBooleanField(term3389, term3389.getClass(), "visible", false);
        setBooleanField(term3389, term3389.getClass(), "enabled", false);
        setBooleanField(term3389, term3389.getClass(), "valid", false);
        setField(term3389, term3389.getClass(), "dropTarget", null);
        setField(term3389, term3389.getClass(), "popups", null);
        setField(term3389, term3389.getClass(), "name", null);
        setBooleanField(term3389, term3389.getClass(), "nameExplicitlySet", false);
        setBooleanField(term3389, term3389.getClass(), "focusable", false);
        setIntField(term3389, term3389.getClass(), "isFocusTraversableOverridden", 0);
        setField(term3389, term3389.getClass(), "focusTraversalKeys", null);
        setBooleanField(term3389, term3389.getClass(), "focusTraversalKeysEnabled", false);
        setField(term3389, term3389.getClass(), "acc", null);
        setField(term3389, term3389.getClass(), "minSize", null);
        setBooleanField(term3389, term3389.getClass(), "minSizeSet", false);
        setField(term3389, term3389.getClass(), "prefSize", null);
        setBooleanField(term3389, term3389.getClass(), "prefSizeSet", false);
        setField(term3389, term3389.getClass(), "maxSize", null);
        setBooleanField(term3389, term3389.getClass(), "maxSizeSet", false);
        setField(term3389, term3389.getClass(), "componentOrientation", null);
        setBooleanField(term3389, term3389.getClass(), "newEventsOnly", false);
        setField(term3389, term3389.getClass(), "componentListener", null);
        setField(term3389, term3389.getClass(), "focusListener", null);
        setField(term3389, term3389.getClass(), "hierarchyListener", null);
        setField(term3389, term3389.getClass(), "hierarchyBoundsListener", null);
        setField(term3389, term3389.getClass(), "keyListener", null);
        setField(term3389, term3389.getClass(), "mouseListener", null);
        setField(term3389, term3389.getClass(), "mouseMotionListener", null);
        setField(term3389, term3389.getClass(), "mouseWheelListener", null);
        setField(term3389, term3389.getClass(), "inputMethodListener", null);
        setLongField(term3389, term3389.getClass(), "eventMask", 0L);
        setField(term3389, term3389.getClass(), "changeSupport", null);
        setField(term3389, term3389.getClass(), "objectLock", null);
        setBooleanField(term3389, term3389.getClass(), "isPacked", false);
        setIntField(term3389, term3389.getClass(), "boundsOp", 0);
        setField(term3389, term3389.getClass(), "compoundShape", null);
        setField(term3389, term3389.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term3389, term3389.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term3389, term3389.getClass(), "backgroundEraseDisabled", false);
        setField(term3389, term3389.getClass(), "eventCache", null);
        setBooleanField(term3389, term3389.getClass(), "coalescingEnabled", false);
        setBooleanField(term3389, term3389.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term3389, term3389.getClass(), "componentSerializedDataVersion", 0);
        setField(term3389, term3389.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.text.Element");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getImageURL", argTypes, term3389, args);
    }

};


