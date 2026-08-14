package io.github.moacirrf.netbeans.markdown.ui;

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
import static io.github.moacirrf.netbeans.markdown.ui.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TopBar_onlySource_109835458915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15164;

    public TopBar_onlySource_109835458915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15164 = newInstance(Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar"));
        setField(term15164, term15164.getClass(), "splitPanel", null);
        setBooleanField(term15164, term15164.getClass(), "splitModeOn", false);
        setField(term15164, term15164.getClass(), "viewMode", null);
        setField(term15164, term15164.getClass(), "buttonGroupViewBtn", null);
        setField(term15164, term15164.getClass(), "scrollSync", null);
        setField(term15164, term15164.getClass(), "showPreviewBtn", null);
        setField(term15164, term15164.getClass(), "showSourceBtn", null);
        setField(term15164, term15164.getClass(), "splitModeBtn", null);
        setField(term15164, term15164.getClass(), "viewModeDefault", null);
        setBooleanField(term15164, term15164.getClass(), "isAlignmentXSet", false);
        setFloatField(term15164, term15164.getClass(), "alignmentX", 0.0F);
        setBooleanField(term15164, term15164.getClass(), "isAlignmentYSet", false);
        setFloatField(term15164, term15164.getClass(), "alignmentY", 0.0F);
        setField(term15164, term15164.getClass(), "ui", null);
        setField(term15164, term15164.getClass(), "listenerList", null);
        setField(term15164, term15164.getClass(), "clientProperties", null);
        setField(term15164, term15164.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term15164, term15164.getClass(), "autoscrolls", false);
        setField(term15164, term15164.getClass(), "border", null);
        setIntField(term15164, term15164.getClass(), "flags", 0);
        setField(term15164, term15164.getClass(), "inputVerifier", null);
        setBooleanField(term15164, term15164.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term15164, term15164.getClass(), "paintingChild", null);
        setField(term15164, term15164.getClass(), "popupMenu", null);
        setField(term15164, term15164.getClass(), "revalidateRunnableScheduled", null);
        setField(term15164, term15164.getClass(), "focusInputMap", null);
        setField(term15164, term15164.getClass(), "ancestorInputMap", null);
        setField(term15164, term15164.getClass(), "windowInputMap", null);
        setField(term15164, term15164.getClass(), "actionMap", null);
        setField(term15164, term15164.getClass(), "aaHint", null);
        setField(term15164, term15164.getClass(), "lcdRenderingHint", null);
        setField(term15164, term15164.getClass(), "component", null);
        setField(term15164, term15164.getClass(), "layoutMgr", null);
        setField(term15164, term15164.getClass(), "dispatcher", null);
        setField(term15164, term15164.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term15164, term15164.getClass(), "focusCycleRoot", false);
        setBooleanField(term15164, term15164.getClass(), "focusTraversalPolicyProvider", false);
        setField(term15164, term15164.getClass(), "printingThreads", null);
        setBooleanField(term15164, term15164.getClass(), "printing", false);
        setField(term15164, term15164.getClass(), "containerListener", null);
        setIntField(term15164, term15164.getClass(), "listeningChildren", 0);
        setIntField(term15164, term15164.getClass(), "listeningBoundsChildren", 0);
        setIntField(term15164, term15164.getClass(), "descendantsCount", 0);
        setField(term15164, term15164.getClass(), "preserveBackgroundColor", null);
        setIntField(term15164, term15164.getClass(), "numOfHWComponents", 0);
        setIntField(term15164, term15164.getClass(), "numOfLWComponents", 0);
        setField(term15164, term15164.getClass(), "modalComp", null);
        setField(term15164, term15164.getClass(), "modalAppContext", null);
        setIntField(term15164, term15164.getClass(), "containerSerializedDataVersion", 0);
        setField(term15164, term15164.getClass(), "peer", null);
        setField(term15164, term15164.getClass(), "parent", null);
        setField(term15164, term15164.getClass(), "appContext", null);
        setIntField(term15164, term15164.getClass(), "x", 0);
        setIntField(term15164, term15164.getClass(), "y", 0);
        setIntField(term15164, term15164.getClass(), "width", 0);
        setIntField(term15164, term15164.getClass(), "height", 0);
        setField(term15164, term15164.getClass(), "foreground", null);
        setField(term15164, term15164.getClass(), "background", null);
        setField(term15164, term15164.getClass(), "font", null);
        setField(term15164, term15164.getClass(), "peerFont", null);
        setField(term15164, term15164.getClass(), "cursor", null);
        setField(term15164, term15164.getClass(), "locale", null);
        setField(term15164, term15164.getClass(), "graphicsConfig", null);
        setField(term15164, term15164.getClass(), "bufferStrategy", null);
        setBooleanField(term15164, term15164.getClass(), "ignoreRepaint", false);
        setBooleanField(term15164, term15164.getClass(), "visible", false);
        setBooleanField(term15164, term15164.getClass(), "enabled", false);
        setBooleanField(term15164, term15164.getClass(), "valid", false);
        setField(term15164, term15164.getClass(), "dropTarget", null);
        setField(term15164, term15164.getClass(), "popups", null);
        setField(term15164, term15164.getClass(), "name", null);
        setBooleanField(term15164, term15164.getClass(), "nameExplicitlySet", false);
        setBooleanField(term15164, term15164.getClass(), "focusable", false);
        setIntField(term15164, term15164.getClass(), "isFocusTraversableOverridden", 0);
        setField(term15164, term15164.getClass(), "focusTraversalKeys", null);
        setBooleanField(term15164, term15164.getClass(), "focusTraversalKeysEnabled", false);
        setField(term15164, term15164.getClass(), "acc", null);
        setField(term15164, term15164.getClass(), "minSize", null);
        setBooleanField(term15164, term15164.getClass(), "minSizeSet", false);
        setField(term15164, term15164.getClass(), "prefSize", null);
        setBooleanField(term15164, term15164.getClass(), "prefSizeSet", false);
        setField(term15164, term15164.getClass(), "maxSize", null);
        setBooleanField(term15164, term15164.getClass(), "maxSizeSet", false);
        setField(term15164, term15164.getClass(), "componentOrientation", null);
        setBooleanField(term15164, term15164.getClass(), "newEventsOnly", false);
        setField(term15164, term15164.getClass(), "componentListener", null);
        setField(term15164, term15164.getClass(), "focusListener", null);
        setField(term15164, term15164.getClass(), "hierarchyListener", null);
        setField(term15164, term15164.getClass(), "hierarchyBoundsListener", null);
        setField(term15164, term15164.getClass(), "keyListener", null);
        setField(term15164, term15164.getClass(), "mouseListener", null);
        setField(term15164, term15164.getClass(), "mouseMotionListener", null);
        setField(term15164, term15164.getClass(), "mouseWheelListener", null);
        setField(term15164, term15164.getClass(), "inputMethodListener", null);
        setLongField(term15164, term15164.getClass(), "eventMask", 0L);
        setField(term15164, term15164.getClass(), "changeSupport", null);
        setField(term15164, term15164.getClass(), "objectLock", null);
        setBooleanField(term15164, term15164.getClass(), "isPacked", false);
        setIntField(term15164, term15164.getClass(), "boundsOp", 0);
        setField(term15164, term15164.getClass(), "compoundShape", null);
        setField(term15164, term15164.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term15164, term15164.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term15164, term15164.getClass(), "backgroundEraseDisabled", false);
        setField(term15164, term15164.getClass(), "eventCache", null);
        setBooleanField(term15164, term15164.getClass(), "coalescingEnabled", false);
        setBooleanField(term15164, term15164.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term15164, term15164.getClass(), "componentSerializedDataVersion", 0);
        setField(term15164, term15164.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.github.moacirrf.netbeans.markdown.ui.TopBar");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "onlySource", argTypes, term15164, args);
    }

};


