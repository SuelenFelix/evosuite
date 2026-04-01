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

public class VotingSelectionView_getSelectedVote_12056721054 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term161154;

    public VotingSelectionView_getSelectedVote_12056721054() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term161154 = newInstance(Class.forName("org.openRealmOfStars.game.state.VotingSelectionView"));
        setField(term161154, term161154.getClass(), "textArea", null);
        setField(term161154, term161154.getClass(), "votingSelect", null);
        setField(term161154, term161154.getClass(), "map", null);
        setBooleanField(term161154, term161154.getClass(), "isAlignmentXSet", false);
        setFloatField(term161154, term161154.getClass(), "alignmentX", 0.0F);
        setBooleanField(term161154, term161154.getClass(), "isAlignmentYSet", false);
        setFloatField(term161154, term161154.getClass(), "alignmentY", 0.0F);
        setField(term161154, term161154.getClass(), "ui", null);
        setField(term161154, term161154.getClass(), "listenerList", null);
        setField(term161154, term161154.getClass(), "clientProperties", null);
        setField(term161154, term161154.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term161154, term161154.getClass(), "autoscrolls", false);
        setField(term161154, term161154.getClass(), "border", null);
        setIntField(term161154, term161154.getClass(), "flags", 0);
        setField(term161154, term161154.getClass(), "inputVerifier", null);
        setBooleanField(term161154, term161154.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term161154, term161154.getClass(), "paintingChild", null);
        setField(term161154, term161154.getClass(), "popupMenu", null);
        setField(term161154, term161154.getClass(), "revalidateRunnableScheduled", null);
        setField(term161154, term161154.getClass(), "focusInputMap", null);
        setField(term161154, term161154.getClass(), "ancestorInputMap", null);
        setField(term161154, term161154.getClass(), "windowInputMap", null);
        setField(term161154, term161154.getClass(), "actionMap", null);
        setField(term161154, term161154.getClass(), "aaHint", null);
        setField(term161154, term161154.getClass(), "lcdRenderingHint", null);
        setField(term161154, term161154.getClass(), "component", null);
        setField(term161154, term161154.getClass(), "layoutMgr", null);
        setField(term161154, term161154.getClass(), "dispatcher", null);
        setField(term161154, term161154.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term161154, term161154.getClass(), "focusCycleRoot", false);
        setBooleanField(term161154, term161154.getClass(), "focusTraversalPolicyProvider", false);
        setField(term161154, term161154.getClass(), "printingThreads", null);
        setBooleanField(term161154, term161154.getClass(), "printing", false);
        setField(term161154, term161154.getClass(), "containerListener", null);
        setIntField(term161154, term161154.getClass(), "listeningChildren", 0);
        setIntField(term161154, term161154.getClass(), "listeningBoundsChildren", 0);
        setIntField(term161154, term161154.getClass(), "descendantsCount", 0);
        setField(term161154, term161154.getClass(), "preserveBackgroundColor", null);
        setIntField(term161154, term161154.getClass(), "numOfHWComponents", 0);
        setIntField(term161154, term161154.getClass(), "numOfLWComponents", 0);
        setField(term161154, term161154.getClass(), "modalComp", null);
        setField(term161154, term161154.getClass(), "modalAppContext", null);
        setIntField(term161154, term161154.getClass(), "containerSerializedDataVersion", 0);
        setField(term161154, term161154.getClass(), "peer", null);
        setField(term161154, term161154.getClass(), "parent", null);
        setField(term161154, term161154.getClass(), "appContext", null);
        setIntField(term161154, term161154.getClass(), "x", 0);
        setIntField(term161154, term161154.getClass(), "y", 0);
        setIntField(term161154, term161154.getClass(), "width", 0);
        setIntField(term161154, term161154.getClass(), "height", 0);
        setField(term161154, term161154.getClass(), "foreground", null);
        setField(term161154, term161154.getClass(), "background", null);
        setField(term161154, term161154.getClass(), "font", null);
        setField(term161154, term161154.getClass(), "peerFont", null);
        setField(term161154, term161154.getClass(), "cursor", null);
        setField(term161154, term161154.getClass(), "locale", null);
        setField(term161154, term161154.getClass(), "graphicsConfig", null);
        setField(term161154, term161154.getClass(), "bufferStrategy", null);
        setBooleanField(term161154, term161154.getClass(), "ignoreRepaint", false);
        setBooleanField(term161154, term161154.getClass(), "visible", false);
        setBooleanField(term161154, term161154.getClass(), "enabled", false);
        setBooleanField(term161154, term161154.getClass(), "valid", false);
        setField(term161154, term161154.getClass(), "dropTarget", null);
        setField(term161154, term161154.getClass(), "popups", null);
        setField(term161154, term161154.getClass(), "name", null);
        setBooleanField(term161154, term161154.getClass(), "nameExplicitlySet", false);
        setBooleanField(term161154, term161154.getClass(), "focusable", false);
        setIntField(term161154, term161154.getClass(), "isFocusTraversableOverridden", 0);
        setField(term161154, term161154.getClass(), "focusTraversalKeys", null);
        setBooleanField(term161154, term161154.getClass(), "focusTraversalKeysEnabled", false);
        setField(term161154, term161154.getClass(), "acc", null);
        setField(term161154, term161154.getClass(), "minSize", null);
        setBooleanField(term161154, term161154.getClass(), "minSizeSet", false);
        setField(term161154, term161154.getClass(), "prefSize", null);
        setBooleanField(term161154, term161154.getClass(), "prefSizeSet", false);
        setField(term161154, term161154.getClass(), "maxSize", null);
        setBooleanField(term161154, term161154.getClass(), "maxSizeSet", false);
        setField(term161154, term161154.getClass(), "componentOrientation", null);
        setBooleanField(term161154, term161154.getClass(), "newEventsOnly", false);
        setField(term161154, term161154.getClass(), "componentListener", null);
        setField(term161154, term161154.getClass(), "focusListener", null);
        setField(term161154, term161154.getClass(), "hierarchyListener", null);
        setField(term161154, term161154.getClass(), "hierarchyBoundsListener", null);
        setField(term161154, term161154.getClass(), "keyListener", null);
        setField(term161154, term161154.getClass(), "mouseListener", null);
        setField(term161154, term161154.getClass(), "mouseMotionListener", null);
        setField(term161154, term161154.getClass(), "mouseWheelListener", null);
        setField(term161154, term161154.getClass(), "inputMethodListener", null);
        setLongField(term161154, term161154.getClass(), "eventMask", 0L);
        setField(term161154, term161154.getClass(), "changeSupport", null);
        setField(term161154, term161154.getClass(), "objectLock", null);
        setBooleanField(term161154, term161154.getClass(), "isPacked", false);
        setIntField(term161154, term161154.getClass(), "boundsOp", 0);
        setField(term161154, term161154.getClass(), "compoundShape", null);
        setField(term161154, term161154.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term161154, term161154.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term161154, term161154.getClass(), "backgroundEraseDisabled", false);
        setField(term161154, term161154.getClass(), "eventCache", null);
        setBooleanField(term161154, term161154.getClass(), "coalescingEnabled", false);
        setBooleanField(term161154, term161154.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term161154, term161154.getClass(), "componentSerializedDataVersion", 0);
        setField(term161154, term161154.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.VotingSelectionView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelectedVote", argTypes, term161154, args);
    }

};


