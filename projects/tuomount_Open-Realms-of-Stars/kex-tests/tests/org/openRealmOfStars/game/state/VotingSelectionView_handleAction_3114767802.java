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

public class VotingSelectionView_handleAction_3114767802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159848;

    public VotingSelectionView_handleAction_3114767802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term159848 = newInstance(Class.forName("org.openRealmOfStars.game.state.VotingSelectionView"));
        setField(term159848, term159848.getClass(), "textArea", null);
        setField(term159848, term159848.getClass(), "votingSelect", null);
        setField(term159848, term159848.getClass(), "map", null);
        setBooleanField(term159848, term159848.getClass(), "isAlignmentXSet", false);
        setFloatField(term159848, term159848.getClass(), "alignmentX", 0.0F);
        setBooleanField(term159848, term159848.getClass(), "isAlignmentYSet", false);
        setFloatField(term159848, term159848.getClass(), "alignmentY", 0.0F);
        setField(term159848, term159848.getClass(), "ui", null);
        setField(term159848, term159848.getClass(), "listenerList", null);
        setField(term159848, term159848.getClass(), "clientProperties", null);
        setField(term159848, term159848.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term159848, term159848.getClass(), "autoscrolls", false);
        setField(term159848, term159848.getClass(), "border", null);
        setIntField(term159848, term159848.getClass(), "flags", 0);
        setField(term159848, term159848.getClass(), "inputVerifier", null);
        setBooleanField(term159848, term159848.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term159848, term159848.getClass(), "paintingChild", null);
        setField(term159848, term159848.getClass(), "popupMenu", null);
        setField(term159848, term159848.getClass(), "revalidateRunnableScheduled", null);
        setField(term159848, term159848.getClass(), "focusInputMap", null);
        setField(term159848, term159848.getClass(), "ancestorInputMap", null);
        setField(term159848, term159848.getClass(), "windowInputMap", null);
        setField(term159848, term159848.getClass(), "actionMap", null);
        setField(term159848, term159848.getClass(), "aaHint", null);
        setField(term159848, term159848.getClass(), "lcdRenderingHint", null);
        setField(term159848, term159848.getClass(), "component", null);
        setField(term159848, term159848.getClass(), "layoutMgr", null);
        setField(term159848, term159848.getClass(), "dispatcher", null);
        setField(term159848, term159848.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term159848, term159848.getClass(), "focusCycleRoot", false);
        setBooleanField(term159848, term159848.getClass(), "focusTraversalPolicyProvider", false);
        setField(term159848, term159848.getClass(), "printingThreads", null);
        setBooleanField(term159848, term159848.getClass(), "printing", false);
        setField(term159848, term159848.getClass(), "containerListener", null);
        setIntField(term159848, term159848.getClass(), "listeningChildren", 0);
        setIntField(term159848, term159848.getClass(), "listeningBoundsChildren", 0);
        setIntField(term159848, term159848.getClass(), "descendantsCount", 0);
        setField(term159848, term159848.getClass(), "preserveBackgroundColor", null);
        setIntField(term159848, term159848.getClass(), "numOfHWComponents", 0);
        setIntField(term159848, term159848.getClass(), "numOfLWComponents", 0);
        setField(term159848, term159848.getClass(), "modalComp", null);
        setField(term159848, term159848.getClass(), "modalAppContext", null);
        setIntField(term159848, term159848.getClass(), "containerSerializedDataVersion", 0);
        setField(term159848, term159848.getClass(), "peer", null);
        setField(term159848, term159848.getClass(), "parent", null);
        setField(term159848, term159848.getClass(), "appContext", null);
        setIntField(term159848, term159848.getClass(), "x", 0);
        setIntField(term159848, term159848.getClass(), "y", 0);
        setIntField(term159848, term159848.getClass(), "width", 0);
        setIntField(term159848, term159848.getClass(), "height", 0);
        setField(term159848, term159848.getClass(), "foreground", null);
        setField(term159848, term159848.getClass(), "background", null);
        setField(term159848, term159848.getClass(), "font", null);
        setField(term159848, term159848.getClass(), "peerFont", null);
        setField(term159848, term159848.getClass(), "cursor", null);
        setField(term159848, term159848.getClass(), "locale", null);
        setField(term159848, term159848.getClass(), "graphicsConfig", null);
        setField(term159848, term159848.getClass(), "bufferStrategy", null);
        setBooleanField(term159848, term159848.getClass(), "ignoreRepaint", false);
        setBooleanField(term159848, term159848.getClass(), "visible", false);
        setBooleanField(term159848, term159848.getClass(), "enabled", false);
        setBooleanField(term159848, term159848.getClass(), "valid", false);
        setField(term159848, term159848.getClass(), "dropTarget", null);
        setField(term159848, term159848.getClass(), "popups", null);
        setField(term159848, term159848.getClass(), "name", null);
        setBooleanField(term159848, term159848.getClass(), "nameExplicitlySet", false);
        setBooleanField(term159848, term159848.getClass(), "focusable", false);
        setIntField(term159848, term159848.getClass(), "isFocusTraversableOverridden", 0);
        setField(term159848, term159848.getClass(), "focusTraversalKeys", null);
        setBooleanField(term159848, term159848.getClass(), "focusTraversalKeysEnabled", false);
        setField(term159848, term159848.getClass(), "acc", null);
        setField(term159848, term159848.getClass(), "minSize", null);
        setBooleanField(term159848, term159848.getClass(), "minSizeSet", false);
        setField(term159848, term159848.getClass(), "prefSize", null);
        setBooleanField(term159848, term159848.getClass(), "prefSizeSet", false);
        setField(term159848, term159848.getClass(), "maxSize", null);
        setBooleanField(term159848, term159848.getClass(), "maxSizeSet", false);
        setField(term159848, term159848.getClass(), "componentOrientation", null);
        setBooleanField(term159848, term159848.getClass(), "newEventsOnly", false);
        setField(term159848, term159848.getClass(), "componentListener", null);
        setField(term159848, term159848.getClass(), "focusListener", null);
        setField(term159848, term159848.getClass(), "hierarchyListener", null);
        setField(term159848, term159848.getClass(), "hierarchyBoundsListener", null);
        setField(term159848, term159848.getClass(), "keyListener", null);
        setField(term159848, term159848.getClass(), "mouseListener", null);
        setField(term159848, term159848.getClass(), "mouseMotionListener", null);
        setField(term159848, term159848.getClass(), "mouseWheelListener", null);
        setField(term159848, term159848.getClass(), "inputMethodListener", null);
        setLongField(term159848, term159848.getClass(), "eventMask", 0L);
        setField(term159848, term159848.getClass(), "changeSupport", null);
        setField(term159848, term159848.getClass(), "objectLock", null);
        setBooleanField(term159848, term159848.getClass(), "isPacked", false);
        setIntField(term159848, term159848.getClass(), "boundsOp", 0);
        setField(term159848, term159848.getClass(), "compoundShape", null);
        setField(term159848, term159848.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term159848, term159848.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term159848, term159848.getClass(), "backgroundEraseDisabled", false);
        setField(term159848, term159848.getClass(), "eventCache", null);
        setBooleanField(term159848, term159848.getClass(), "coalescingEnabled", false);
        setBooleanField(term159848, term159848.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term159848, term159848.getClass(), "componentSerializedDataVersion", 0);
        setField(term159848, term159848.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.VotingSelectionView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleAction", argTypes, term159848, args);
    }

};


