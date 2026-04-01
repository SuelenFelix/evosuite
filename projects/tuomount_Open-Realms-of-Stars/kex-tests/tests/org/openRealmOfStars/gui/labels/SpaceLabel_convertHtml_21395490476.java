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

public class SpaceLabel_convertHtml_21395490476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306;

    public SpaceLabel_convertHtml_21395490476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term306 = newInstance(Class.forName("org.openRealmOfStars.gui.labels.SpaceLabel"));
        setIntField(term306, term306.getClass(), "mnemonic", 0);
        setIntField(term306, term306.getClass(), "mnemonicIndex", 0);
        setField(term306, term306.getClass(), "text", null);
        setField(term306, term306.getClass(), "defaultIcon", null);
        setField(term306, term306.getClass(), "disabledIcon", null);
        setBooleanField(term306, term306.getClass(), "disabledIconSet", false);
        setIntField(term306, term306.getClass(), "verticalAlignment", 0);
        setIntField(term306, term306.getClass(), "horizontalAlignment", 0);
        setIntField(term306, term306.getClass(), "verticalTextPosition", 0);
        setIntField(term306, term306.getClass(), "horizontalTextPosition", 0);
        setIntField(term306, term306.getClass(), "iconTextGap", 0);
        setField(term306, term306.getClass(), "labelFor", null);
        setBooleanField(term306, term306.getClass(), "isAlignmentXSet", false);
        setFloatField(term306, term306.getClass(), "alignmentX", 0.0F);
        setBooleanField(term306, term306.getClass(), "isAlignmentYSet", false);
        setFloatField(term306, term306.getClass(), "alignmentY", 0.0F);
        setField(term306, term306.getClass(), "ui", null);
        setField(term306, term306.getClass(), "listenerList", null);
        setField(term306, term306.getClass(), "clientProperties", null);
        setField(term306, term306.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term306, term306.getClass(), "autoscrolls", false);
        setField(term306, term306.getClass(), "border", null);
        setIntField(term306, term306.getClass(), "flags", 0);
        setField(term306, term306.getClass(), "inputVerifier", null);
        setBooleanField(term306, term306.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term306, term306.getClass(), "paintingChild", null);
        setField(term306, term306.getClass(), "popupMenu", null);
        setField(term306, term306.getClass(), "revalidateRunnableScheduled", null);
        setField(term306, term306.getClass(), "focusInputMap", null);
        setField(term306, term306.getClass(), "ancestorInputMap", null);
        setField(term306, term306.getClass(), "windowInputMap", null);
        setField(term306, term306.getClass(), "actionMap", null);
        setField(term306, term306.getClass(), "aaHint", null);
        setField(term306, term306.getClass(), "lcdRenderingHint", null);
        setField(term306, term306.getClass(), "component", null);
        setField(term306, term306.getClass(), "layoutMgr", null);
        setField(term306, term306.getClass(), "dispatcher", null);
        setField(term306, term306.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term306, term306.getClass(), "focusCycleRoot", false);
        setBooleanField(term306, term306.getClass(), "focusTraversalPolicyProvider", false);
        setField(term306, term306.getClass(), "printingThreads", null);
        setBooleanField(term306, term306.getClass(), "printing", false);
        setField(term306, term306.getClass(), "containerListener", null);
        setIntField(term306, term306.getClass(), "listeningChildren", 0);
        setIntField(term306, term306.getClass(), "listeningBoundsChildren", 0);
        setIntField(term306, term306.getClass(), "descendantsCount", 0);
        setField(term306, term306.getClass(), "preserveBackgroundColor", null);
        setIntField(term306, term306.getClass(), "numOfHWComponents", 0);
        setIntField(term306, term306.getClass(), "numOfLWComponents", 0);
        setField(term306, term306.getClass(), "modalComp", null);
        setField(term306, term306.getClass(), "modalAppContext", null);
        setIntField(term306, term306.getClass(), "containerSerializedDataVersion", 0);
        setField(term306, term306.getClass(), "peer", null);
        setField(term306, term306.getClass(), "parent", null);
        setField(term306, term306.getClass(), "appContext", null);
        setIntField(term306, term306.getClass(), "x", 0);
        setIntField(term306, term306.getClass(), "y", 0);
        setIntField(term306, term306.getClass(), "width", 0);
        setIntField(term306, term306.getClass(), "height", 0);
        setField(term306, term306.getClass(), "foreground", null);
        setField(term306, term306.getClass(), "background", null);
        setField(term306, term306.getClass(), "font", null);
        setField(term306, term306.getClass(), "peerFont", null);
        setField(term306, term306.getClass(), "cursor", null);
        setField(term306, term306.getClass(), "locale", null);
        setField(term306, term306.getClass(), "graphicsConfig", null);
        setField(term306, term306.getClass(), "bufferStrategy", null);
        setBooleanField(term306, term306.getClass(), "ignoreRepaint", false);
        setBooleanField(term306, term306.getClass(), "visible", false);
        setBooleanField(term306, term306.getClass(), "enabled", false);
        setBooleanField(term306, term306.getClass(), "valid", false);
        setField(term306, term306.getClass(), "dropTarget", null);
        setField(term306, term306.getClass(), "popups", null);
        setField(term306, term306.getClass(), "name", null);
        setBooleanField(term306, term306.getClass(), "nameExplicitlySet", false);
        setBooleanField(term306, term306.getClass(), "focusable", false);
        setIntField(term306, term306.getClass(), "isFocusTraversableOverridden", 0);
        setField(term306, term306.getClass(), "focusTraversalKeys", null);
        setBooleanField(term306, term306.getClass(), "focusTraversalKeysEnabled", false);
        setField(term306, term306.getClass(), "acc", null);
        setField(term306, term306.getClass(), "minSize", null);
        setBooleanField(term306, term306.getClass(), "minSizeSet", false);
        setField(term306, term306.getClass(), "prefSize", null);
        setBooleanField(term306, term306.getClass(), "prefSizeSet", false);
        setField(term306, term306.getClass(), "maxSize", null);
        setBooleanField(term306, term306.getClass(), "maxSizeSet", false);
        setField(term306, term306.getClass(), "componentOrientation", null);
        setBooleanField(term306, term306.getClass(), "newEventsOnly", false);
        setField(term306, term306.getClass(), "componentListener", null);
        setField(term306, term306.getClass(), "focusListener", null);
        setField(term306, term306.getClass(), "hierarchyListener", null);
        setField(term306, term306.getClass(), "hierarchyBoundsListener", null);
        setField(term306, term306.getClass(), "keyListener", null);
        setField(term306, term306.getClass(), "mouseListener", null);
        setField(term306, term306.getClass(), "mouseMotionListener", null);
        setField(term306, term306.getClass(), "mouseWheelListener", null);
        setField(term306, term306.getClass(), "inputMethodListener", null);
        setLongField(term306, term306.getClass(), "eventMask", 0L);
        setField(term306, term306.getClass(), "changeSupport", null);
        setField(term306, term306.getClass(), "objectLock", null);
        setBooleanField(term306, term306.getClass(), "isPacked", false);
        setIntField(term306, term306.getClass(), "boundsOp", 0);
        setField(term306, term306.getClass(), "compoundShape", null);
        setField(term306, term306.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term306, term306.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term306, term306.getClass(), "backgroundEraseDisabled", false);
        setField(term306, term306.getClass(), "eventCache", null);
        setBooleanField(term306, term306.getClass(), "coalescingEnabled", false);
        setBooleanField(term306, term306.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term306, term306.getClass(), "componentSerializedDataVersion", 0);
        setField(term306, term306.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.labels.SpaceLabel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "convertHtml", argTypes, term306, args);
    }

};


