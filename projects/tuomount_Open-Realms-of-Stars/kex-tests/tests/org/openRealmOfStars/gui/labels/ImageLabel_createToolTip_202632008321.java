package org.openRealmOfStars.gui.labels;

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
import static org.openRealmOfStars.gui.labels.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ImageLabel_createToolTip_202632008321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2286;

    public ImageLabel_createToolTip_202632008321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2286 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.ImageLabel"));
        setField(term2286, term2286.getClass(), "image", null);
        setBooleanField(term2286, term2286.getClass(), "border", false);
        setField(term2286, term2286.getClass(), "fillColor", null);
        setBooleanField(term2286, term2286.getClass(), "center", false);
        setIntField(term2286, term2286.getClass(), "mnemonic", 0);
        setIntField(term2286, term2286.getClass(), "mnemonicIndex", 0);
        setField(term2286, term2286.getClass(), "text", null);
        setField(term2286, term2286.getClass(), "defaultIcon", null);
        setField(term2286, term2286.getClass(), "disabledIcon", null);
        setBooleanField(term2286, term2286.getClass(), "disabledIconSet", false);
        setIntField(term2286, term2286.getClass(), "verticalAlignment", 0);
        setIntField(term2286, term2286.getClass(), "horizontalAlignment", 0);
        setIntField(term2286, term2286.getClass(), "verticalTextPosition", 0);
        setIntField(term2286, term2286.getClass(), "horizontalTextPosition", 0);
        setIntField(term2286, term2286.getClass(), "iconTextGap", 0);
        setField(term2286, term2286.getClass(), "labelFor", null);
        setBooleanField(term2286, term2286.getClass(), "isAlignmentXSet", false);
        setFloatField(term2286, term2286.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2286, term2286.getClass(), "isAlignmentYSet", false);
        setFloatField(term2286, term2286.getClass(), "alignmentY", 0.0F);
        setField(term2286, term2286.getClass(), "ui", null);
        setField(term2286, term2286.getClass(), "listenerList", null);
        setField(term2286, term2286.getClass(), "clientProperties", null);
        setField(term2286, term2286.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2286, term2286.getClass(), "autoscrolls", false);
        setField(term2286, term2286.getClass(), "border", null);
        setIntField(term2286, term2286.getClass(), "flags", 0);
        setField(term2286, term2286.getClass(), "inputVerifier", null);
        setBooleanField(term2286, term2286.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2286, term2286.getClass(), "paintingChild", null);
        setField(term2286, term2286.getClass(), "popupMenu", null);
        setField(term2286, term2286.getClass(), "revalidateRunnableScheduled", null);
        setField(term2286, term2286.getClass(), "focusInputMap", null);
        setField(term2286, term2286.getClass(), "ancestorInputMap", null);
        setField(term2286, term2286.getClass(), "windowInputMap", null);
        setField(term2286, term2286.getClass(), "actionMap", null);
        setField(term2286, term2286.getClass(), "aaHint", null);
        setField(term2286, term2286.getClass(), "lcdRenderingHint", null);
        setField(term2286, term2286.getClass(), "component", null);
        setField(term2286, term2286.getClass(), "layoutMgr", null);
        setField(term2286, term2286.getClass(), "dispatcher", null);
        setField(term2286, term2286.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2286, term2286.getClass(), "focusCycleRoot", false);
        setBooleanField(term2286, term2286.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2286, term2286.getClass(), "printingThreads", null);
        setBooleanField(term2286, term2286.getClass(), "printing", false);
        setField(term2286, term2286.getClass(), "containerListener", null);
        setIntField(term2286, term2286.getClass(), "listeningChildren", 0);
        setIntField(term2286, term2286.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2286, term2286.getClass(), "descendantsCount", 0);
        setField(term2286, term2286.getClass(), "preserveBackgroundColor", null);
        setIntField(term2286, term2286.getClass(), "numOfHWComponents", 0);
        setIntField(term2286, term2286.getClass(), "numOfLWComponents", 0);
        setField(term2286, term2286.getClass(), "modalComp", null);
        setField(term2286, term2286.getClass(), "modalAppContext", null);
        setIntField(term2286, term2286.getClass(), "containerSerializedDataVersion", 0);
        setField(term2286, term2286.getClass(), "peer", null);
        setField(term2286, term2286.getClass(), "parent", null);
        setField(term2286, term2286.getClass(), "appContext", null);
        setIntField(term2286, term2286.getClass(), "x", 0);
        setIntField(term2286, term2286.getClass(), "y", 0);
        setIntField(term2286, term2286.getClass(), "width", 0);
        setIntField(term2286, term2286.getClass(), "height", 0);
        setField(term2286, term2286.getClass(), "foreground", null);
        setField(term2286, term2286.getClass(), "background", null);
        setField(term2286, term2286.getClass(), "font", null);
        setField(term2286, term2286.getClass(), "peerFont", null);
        setField(term2286, term2286.getClass(), "cursor", null);
        setField(term2286, term2286.getClass(), "locale", null);
        setField(term2286, term2286.getClass(), "graphicsConfig", null);
        setField(term2286, term2286.getClass(), "bufferStrategy", null);
        setBooleanField(term2286, term2286.getClass(), "ignoreRepaint", false);
        setBooleanField(term2286, term2286.getClass(), "visible", false);
        setBooleanField(term2286, term2286.getClass(), "enabled", false);
        setBooleanField(term2286, term2286.getClass(), "valid", false);
        setField(term2286, term2286.getClass(), "dropTarget", null);
        setField(term2286, term2286.getClass(), "popups", null);
        setField(term2286, term2286.getClass(), "name", null);
        setBooleanField(term2286, term2286.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2286, term2286.getClass(), "focusable", false);
        setIntField(term2286, term2286.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2286, term2286.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2286, term2286.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2286, term2286.getClass(), "acc", null);
        setField(term2286, term2286.getClass(), "minSize", null);
        setBooleanField(term2286, term2286.getClass(), "minSizeSet", false);
        setField(term2286, term2286.getClass(), "prefSize", null);
        setBooleanField(term2286, term2286.getClass(), "prefSizeSet", false);
        setField(term2286, term2286.getClass(), "maxSize", null);
        setBooleanField(term2286, term2286.getClass(), "maxSizeSet", false);
        setField(term2286, term2286.getClass(), "componentOrientation", null);
        setBooleanField(term2286, term2286.getClass(), "newEventsOnly", false);
        setField(term2286, term2286.getClass(), "componentListener", null);
        setField(term2286, term2286.getClass(), "focusListener", null);
        setField(term2286, term2286.getClass(), "hierarchyListener", null);
        setField(term2286, term2286.getClass(), "hierarchyBoundsListener", null);
        setField(term2286, term2286.getClass(), "keyListener", null);
        setField(term2286, term2286.getClass(), "mouseListener", null);
        setField(term2286, term2286.getClass(), "mouseMotionListener", null);
        setField(term2286, term2286.getClass(), "mouseWheelListener", null);
        setField(term2286, term2286.getClass(), "inputMethodListener", null);
        setLongField(term2286, term2286.getClass(), "eventMask", 0L);
        setField(term2286, term2286.getClass(), "changeSupport", null);
        setField(term2286, term2286.getClass(), "objectLock", null);
        setBooleanField(term2286, term2286.getClass(), "isPacked", false);
        setIntField(term2286, term2286.getClass(), "boundsOp", 0);
        setField(term2286, term2286.getClass(), "compoundShape", null);
        setField(term2286, term2286.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2286, term2286.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2286, term2286.getClass(), "backgroundEraseDisabled", false);
        setField(term2286, term2286.getClass(), "eventCache", null);
        setBooleanField(term2286, term2286.getClass(), "coalescingEnabled", false);
        setBooleanField(term2286, term2286.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2286, term2286.getClass(), "componentSerializedDataVersion", 0);
        setField(term2286, term2286.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.ImageLabel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createToolTip", argTypes, term2286, args);
    }

};


