package org.openRealmOfStars.game.state;

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
import static org.openRealmOfStars.game.state.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class HelpView_valueChanged_17607959792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term610816;

    public HelpView_valueChanged_17607959792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term610816 = newInstance(Class.forName("org.openRealmOfStars.game.state.HelpView"));
        setField(term610816, term610816.getClass(), "infoText", null);
        setField(term610816, term610816.getClass(), "tutorialTree", null);
        setField(term610816, term610816.getClass(), "checkBox", null);
        setField(term610816, term610816.getClass(), "searchText", null);
        setField(term610816, term610816.getClass(), "matchesText", null);
        setField(term610816, term610816.getClass(), "root", null);
        setIntField(term610816, term610816.getClass(), "numberOfMatches", 0);
        setField(term610816, term610816.getClass(), "lastSearchText", null);
        setIntField(term610816, term610816.getClass(), "currentMatch", 0);
        setBooleanField(term610816, term610816.getClass(), "isAlignmentXSet", false);
        setFloatField(term610816, term610816.getClass(), "alignmentX", 0.0F);
        setBooleanField(term610816, term610816.getClass(), "isAlignmentYSet", false);
        setFloatField(term610816, term610816.getClass(), "alignmentY", 0.0F);
        setField(term610816, term610816.getClass(), "ui", null);
        setField(term610816, term610816.getClass(), "listenerList", null);
        setField(term610816, term610816.getClass(), "clientProperties", null);
        setField(term610816, term610816.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term610816, term610816.getClass(), "autoscrolls", false);
        setField(term610816, term610816.getClass(), "border", null);
        setIntField(term610816, term610816.getClass(), "flags", 0);
        setField(term610816, term610816.getClass(), "inputVerifier", null);
        setBooleanField(term610816, term610816.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term610816, term610816.getClass(), "paintingChild", null);
        setField(term610816, term610816.getClass(), "popupMenu", null);
        setField(term610816, term610816.getClass(), "revalidateRunnableScheduled", null);
        setField(term610816, term610816.getClass(), "focusInputMap", null);
        setField(term610816, term610816.getClass(), "ancestorInputMap", null);
        setField(term610816, term610816.getClass(), "windowInputMap", null);
        setField(term610816, term610816.getClass(), "actionMap", null);
        setField(term610816, term610816.getClass(), "aaHint", null);
        setField(term610816, term610816.getClass(), "lcdRenderingHint", null);
        setField(term610816, term610816.getClass(), "component", null);
        setField(term610816, term610816.getClass(), "layoutMgr", null);
        setField(term610816, term610816.getClass(), "dispatcher", null);
        setField(term610816, term610816.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term610816, term610816.getClass(), "focusCycleRoot", false);
        setBooleanField(term610816, term610816.getClass(), "focusTraversalPolicyProvider", false);
        setField(term610816, term610816.getClass(), "printingThreads", null);
        setBooleanField(term610816, term610816.getClass(), "printing", false);
        setField(term610816, term610816.getClass(), "containerListener", null);
        setIntField(term610816, term610816.getClass(), "listeningChildren", 0);
        setIntField(term610816, term610816.getClass(), "listeningBoundsChildren", 0);
        setIntField(term610816, term610816.getClass(), "descendantsCount", 0);
        setField(term610816, term610816.getClass(), "preserveBackgroundColor", null);
        setIntField(term610816, term610816.getClass(), "numOfHWComponents", 0);
        setIntField(term610816, term610816.getClass(), "numOfLWComponents", 0);
        setField(term610816, term610816.getClass(), "modalComp", null);
        setField(term610816, term610816.getClass(), "modalAppContext", null);
        setIntField(term610816, term610816.getClass(), "containerSerializedDataVersion", 0);
        setField(term610816, term610816.getClass(), "peer", null);
        setField(term610816, term610816.getClass(), "parent", null);
        setField(term610816, term610816.getClass(), "appContext", null);
        setIntField(term610816, term610816.getClass(), "x", 0);
        setIntField(term610816, term610816.getClass(), "y", 0);
        setIntField(term610816, term610816.getClass(), "width", 0);
        setIntField(term610816, term610816.getClass(), "height", 0);
        setField(term610816, term610816.getClass(), "foreground", null);
        setField(term610816, term610816.getClass(), "background", null);
        setField(term610816, term610816.getClass(), "font", null);
        setField(term610816, term610816.getClass(), "peerFont", null);
        setField(term610816, term610816.getClass(), "cursor", null);
        setField(term610816, term610816.getClass(), "locale", null);
        setField(term610816, term610816.getClass(), "graphicsConfig", null);
        setField(term610816, term610816.getClass(), "bufferStrategy", null);
        setBooleanField(term610816, term610816.getClass(), "ignoreRepaint", false);
        setBooleanField(term610816, term610816.getClass(), "visible", false);
        setBooleanField(term610816, term610816.getClass(), "enabled", false);
        setBooleanField(term610816, term610816.getClass(), "valid", false);
        setField(term610816, term610816.getClass(), "dropTarget", null);
        setField(term610816, term610816.getClass(), "popups", null);
        setField(term610816, term610816.getClass(), "name", null);
        setBooleanField(term610816, term610816.getClass(), "nameExplicitlySet", false);
        setBooleanField(term610816, term610816.getClass(), "focusable", false);
        setIntField(term610816, term610816.getClass(), "isFocusTraversableOverridden", 0);
        setField(term610816, term610816.getClass(), "focusTraversalKeys", null);
        setBooleanField(term610816, term610816.getClass(), "focusTraversalKeysEnabled", false);
        setField(term610816, term610816.getClass(), "acc", null);
        setField(term610816, term610816.getClass(), "minSize", null);
        setBooleanField(term610816, term610816.getClass(), "minSizeSet", false);
        setField(term610816, term610816.getClass(), "prefSize", null);
        setBooleanField(term610816, term610816.getClass(), "prefSizeSet", false);
        setField(term610816, term610816.getClass(), "maxSize", null);
        setBooleanField(term610816, term610816.getClass(), "maxSizeSet", false);
        setField(term610816, term610816.getClass(), "componentOrientation", null);
        setBooleanField(term610816, term610816.getClass(), "newEventsOnly", false);
        setField(term610816, term610816.getClass(), "componentListener", null);
        setField(term610816, term610816.getClass(), "focusListener", null);
        setField(term610816, term610816.getClass(), "hierarchyListener", null);
        setField(term610816, term610816.getClass(), "hierarchyBoundsListener", null);
        setField(term610816, term610816.getClass(), "keyListener", null);
        setField(term610816, term610816.getClass(), "mouseListener", null);
        setField(term610816, term610816.getClass(), "mouseMotionListener", null);
        setField(term610816, term610816.getClass(), "mouseWheelListener", null);
        setField(term610816, term610816.getClass(), "inputMethodListener", null);
        setLongField(term610816, term610816.getClass(), "eventMask", 0L);
        setField(term610816, term610816.getClass(), "changeSupport", null);
        setField(term610816, term610816.getClass(), "objectLock", null);
        setBooleanField(term610816, term610816.getClass(), "isPacked", false);
        setIntField(term610816, term610816.getClass(), "boundsOp", 0);
        setField(term610816, term610816.getClass(), "compoundShape", null);
        setField(term610816, term610816.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term610816, term610816.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term610816, term610816.getClass(), "backgroundEraseDisabled", false);
        setField(term610816, term610816.getClass(), "eventCache", null);
        setBooleanField(term610816, term610816.getClass(), "coalescingEnabled", false);
        setBooleanField(term610816, term610816.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term610816, term610816.getClass(), "componentSerializedDataVersion", 0);
        setField(term610816, term610816.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.HelpView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.event.TreeSelectionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "valueChanged", argTypes, term610816, args);
    }

};


