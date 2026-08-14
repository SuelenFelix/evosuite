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

public class ImageLabel_getStableSize_137557665520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2989;
     Object term3038;

    public ImageLabel_getStableSize_137557665520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2989 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel"));
        setField(term2989, term2989.getClass(), "urlHiperlinkParent", null);
        setField(term2989, term2989.getClass(), "imageIconOriginal", null);
        setField(term2989, term2989.getClass(), "imageKey", null);
        setIntField(term2989, term2989.getClass(), "mnemonic", 0);
        setIntField(term2989, term2989.getClass(), "mnemonicIndex", 0);
        setField(term2989, term2989.getClass(), "text", null);
        setField(term2989, term2989.getClass(), "defaultIcon", null);
        setField(term2989, term2989.getClass(), "disabledIcon", null);
        setBooleanField(term2989, term2989.getClass(), "disabledIconSet", false);
        setIntField(term2989, term2989.getClass(), "verticalAlignment", 0);
        setIntField(term2989, term2989.getClass(), "horizontalAlignment", 0);
        setIntField(term2989, term2989.getClass(), "verticalTextPosition", 0);
        setIntField(term2989, term2989.getClass(), "horizontalTextPosition", 0);
        setIntField(term2989, term2989.getClass(), "iconTextGap", 0);
        setField(term2989, term2989.getClass(), "labelFor", null);
        setBooleanField(term2989, term2989.getClass(), "isAlignmentXSet", false);
        setFloatField(term2989, term2989.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2989, term2989.getClass(), "isAlignmentYSet", false);
        setFloatField(term2989, term2989.getClass(), "alignmentY", 0.0F);
        setField(term2989, term2989.getClass(), "ui", null);
        setField(term2989, term2989.getClass(), "listenerList", null);
        setField(term2989, term2989.getClass(), "clientProperties", null);
        setField(term2989, term2989.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2989, term2989.getClass(), "autoscrolls", false);
        setField(term2989, term2989.getClass(), "border", null);
        setIntField(term2989, term2989.getClass(), "flags", 0);
        setField(term2989, term2989.getClass(), "inputVerifier", null);
        setBooleanField(term2989, term2989.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2989, term2989.getClass(), "paintingChild", null);
        setField(term2989, term2989.getClass(), "popupMenu", null);
        setField(term2989, term2989.getClass(), "revalidateRunnableScheduled", null);
        setField(term2989, term2989.getClass(), "focusInputMap", null);
        setField(term2989, term2989.getClass(), "ancestorInputMap", null);
        setField(term2989, term2989.getClass(), "windowInputMap", null);
        setField(term2989, term2989.getClass(), "actionMap", null);
        setField(term2989, term2989.getClass(), "aaHint", null);
        setField(term2989, term2989.getClass(), "lcdRenderingHint", null);
        setField(term2989, term2989.getClass(), "component", null);
        setField(term2989, term2989.getClass(), "layoutMgr", null);
        setField(term2989, term2989.getClass(), "dispatcher", null);
        setField(term2989, term2989.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2989, term2989.getClass(), "focusCycleRoot", false);
        setBooleanField(term2989, term2989.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2989, term2989.getClass(), "printingThreads", null);
        setBooleanField(term2989, term2989.getClass(), "printing", false);
        setField(term2989, term2989.getClass(), "containerListener", null);
        setIntField(term2989, term2989.getClass(), "listeningChildren", 0);
        setIntField(term2989, term2989.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2989, term2989.getClass(), "descendantsCount", 0);
        setField(term2989, term2989.getClass(), "preserveBackgroundColor", null);
        setIntField(term2989, term2989.getClass(), "numOfHWComponents", 0);
        setIntField(term2989, term2989.getClass(), "numOfLWComponents", 0);
        setField(term2989, term2989.getClass(), "modalComp", null);
        setField(term2989, term2989.getClass(), "modalAppContext", null);
        setIntField(term2989, term2989.getClass(), "containerSerializedDataVersion", 0);
        setField(term2989, term2989.getClass(), "peer", null);
        setField(term2989, term2989.getClass(), "parent", null);
        setField(term2989, term2989.getClass(), "appContext", null);
        setIntField(term2989, term2989.getClass(), "x", 0);
        setIntField(term2989, term2989.getClass(), "y", 0);
        setIntField(term2989, term2989.getClass(), "width", 0);
        setIntField(term2989, term2989.getClass(), "height", 0);
        setField(term2989, term2989.getClass(), "foreground", null);
        setField(term2989, term2989.getClass(), "background", null);
        setField(term2989, term2989.getClass(), "font", null);
        setField(term2989, term2989.getClass(), "peerFont", null);
        setField(term2989, term2989.getClass(), "cursor", null);
        setField(term2989, term2989.getClass(), "locale", null);
        setField(term2989, term2989.getClass(), "graphicsConfig", null);
        setField(term2989, term2989.getClass(), "bufferStrategy", null);
        setBooleanField(term2989, term2989.getClass(), "ignoreRepaint", false);
        setBooleanField(term2989, term2989.getClass(), "visible", false);
        setBooleanField(term2989, term2989.getClass(), "enabled", false);
        setBooleanField(term2989, term2989.getClass(), "valid", false);
        setField(term2989, term2989.getClass(), "dropTarget", null);
        setField(term2989, term2989.getClass(), "popups", null);
        setField(term2989, term2989.getClass(), "name", null);
        setBooleanField(term2989, term2989.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2989, term2989.getClass(), "focusable", false);
        setIntField(term2989, term2989.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2989, term2989.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2989, term2989.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2989, term2989.getClass(), "acc", null);
        setField(term2989, term2989.getClass(), "minSize", null);
        setBooleanField(term2989, term2989.getClass(), "minSizeSet", false);
        setField(term2989, term2989.getClass(), "prefSize", null);
        setBooleanField(term2989, term2989.getClass(), "prefSizeSet", false);
        setField(term2989, term2989.getClass(), "maxSize", null);
        setBooleanField(term2989, term2989.getClass(), "maxSizeSet", false);
        setField(term2989, term2989.getClass(), "componentOrientation", null);
        setBooleanField(term2989, term2989.getClass(), "newEventsOnly", false);
        setField(term2989, term2989.getClass(), "componentListener", null);
        setField(term2989, term2989.getClass(), "focusListener", null);
        setField(term2989, term2989.getClass(), "hierarchyListener", null);
        setField(term2989, term2989.getClass(), "hierarchyBoundsListener", null);
        setField(term2989, term2989.getClass(), "keyListener", null);
        setField(term2989, term2989.getClass(), "mouseListener", null);
        setField(term2989, term2989.getClass(), "mouseMotionListener", null);
        setField(term2989, term2989.getClass(), "mouseWheelListener", null);
        setField(term2989, term2989.getClass(), "inputMethodListener", null);
        setLongField(term2989, term2989.getClass(), "eventMask", 0L);
        setField(term2989, term2989.getClass(), "changeSupport", null);
        setField(term2989, term2989.getClass(), "objectLock", null);
        setBooleanField(term2989, term2989.getClass(), "isPacked", false);
        setIntField(term2989, term2989.getClass(), "boundsOp", 0);
        setField(term2989, term2989.getClass(), "compoundShape", null);
        setField(term2989, term2989.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2989, term2989.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2989, term2989.getClass(), "backgroundEraseDisabled", false);
        setField(term2989, term2989.getClass(), "eventCache", null);
        setBooleanField(term2989, term2989.getClass(), "coalescingEnabled", false);
        setBooleanField(term2989, term2989.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2989, term2989.getClass(), "componentSerializedDataVersion", 0);
        setField(term2989, term2989.getClass(), "accessibleContext", null);
        term3038 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.preview.image.ImageLabel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3038;
        callMethod(klass, "getStableSize", argTypes, term2989, args);
    }

};


