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

public class VoteView_createBottomPanel_4843929609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157727;

    public VoteView_createBottomPanel_4843929609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157727 = newInstance(Class.forName("org.openRealmOfStars.game.state.VoteView"));
        setField(term157727, term157727.getClass(), "voteLabel", null);
        setIntField(term157727, term157727.getClass(), "voteIndex", 0);
        setField(term157727, term157727.getClass(), "map", null);
        setField(term157727, term157727.getClass(), "voteTitle", null);
        setField(term157727, term157727.getClass(), "votingTime", null);
        setField(term157727, term157727.getClass(), "voteYesBtn", null);
        setField(term157727, term157727.getClass(), "voteNoBtn", null);
        setField(term157727, term157727.getClass(), "voteAbstain", null);
        setField(term157727, term157727.getClass(), "votedText", null);
        setField(term157727, term157727.getClass(), "votingInfoText", null);
        setField(term157727, term157727.getClass(), "votingInfoTitle", null);
        setBooleanField(term157727, term157727.getClass(), "isAlignmentXSet", false);
        setFloatField(term157727, term157727.getClass(), "alignmentX", 0.0F);
        setBooleanField(term157727, term157727.getClass(), "isAlignmentYSet", false);
        setFloatField(term157727, term157727.getClass(), "alignmentY", 0.0F);
        setField(term157727, term157727.getClass(), "ui", null);
        setField(term157727, term157727.getClass(), "listenerList", null);
        setField(term157727, term157727.getClass(), "clientProperties", null);
        setField(term157727, term157727.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term157727, term157727.getClass(), "autoscrolls", false);
        setField(term157727, term157727.getClass(), "border", null);
        setIntField(term157727, term157727.getClass(), "flags", 0);
        setField(term157727, term157727.getClass(), "inputVerifier", null);
        setBooleanField(term157727, term157727.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term157727, term157727.getClass(), "paintingChild", null);
        setField(term157727, term157727.getClass(), "popupMenu", null);
        setField(term157727, term157727.getClass(), "revalidateRunnableScheduled", null);
        setField(term157727, term157727.getClass(), "focusInputMap", null);
        setField(term157727, term157727.getClass(), "ancestorInputMap", null);
        setField(term157727, term157727.getClass(), "windowInputMap", null);
        setField(term157727, term157727.getClass(), "actionMap", null);
        setField(term157727, term157727.getClass(), "aaHint", null);
        setField(term157727, term157727.getClass(), "lcdRenderingHint", null);
        setField(term157727, term157727.getClass(), "component", null);
        setField(term157727, term157727.getClass(), "layoutMgr", null);
        setField(term157727, term157727.getClass(), "dispatcher", null);
        setField(term157727, term157727.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term157727, term157727.getClass(), "focusCycleRoot", false);
        setBooleanField(term157727, term157727.getClass(), "focusTraversalPolicyProvider", false);
        setField(term157727, term157727.getClass(), "printingThreads", null);
        setBooleanField(term157727, term157727.getClass(), "printing", false);
        setField(term157727, term157727.getClass(), "containerListener", null);
        setIntField(term157727, term157727.getClass(), "listeningChildren", 0);
        setIntField(term157727, term157727.getClass(), "listeningBoundsChildren", 0);
        setIntField(term157727, term157727.getClass(), "descendantsCount", 0);
        setField(term157727, term157727.getClass(), "preserveBackgroundColor", null);
        setIntField(term157727, term157727.getClass(), "numOfHWComponents", 0);
        setIntField(term157727, term157727.getClass(), "numOfLWComponents", 0);
        setField(term157727, term157727.getClass(), "modalComp", null);
        setField(term157727, term157727.getClass(), "modalAppContext", null);
        setIntField(term157727, term157727.getClass(), "containerSerializedDataVersion", 0);
        setField(term157727, term157727.getClass(), "peer", null);
        setField(term157727, term157727.getClass(), "parent", null);
        setField(term157727, term157727.getClass(), "appContext", null);
        setIntField(term157727, term157727.getClass(), "x", 0);
        setIntField(term157727, term157727.getClass(), "y", 0);
        setIntField(term157727, term157727.getClass(), "width", 0);
        setIntField(term157727, term157727.getClass(), "height", 0);
        setField(term157727, term157727.getClass(), "foreground", null);
        setField(term157727, term157727.getClass(), "background", null);
        setField(term157727, term157727.getClass(), "font", null);
        setField(term157727, term157727.getClass(), "peerFont", null);
        setField(term157727, term157727.getClass(), "cursor", null);
        setField(term157727, term157727.getClass(), "locale", null);
        setField(term157727, term157727.getClass(), "graphicsConfig", null);
        setField(term157727, term157727.getClass(), "bufferStrategy", null);
        setBooleanField(term157727, term157727.getClass(), "ignoreRepaint", false);
        setBooleanField(term157727, term157727.getClass(), "visible", false);
        setBooleanField(term157727, term157727.getClass(), "enabled", false);
        setBooleanField(term157727, term157727.getClass(), "valid", false);
        setField(term157727, term157727.getClass(), "dropTarget", null);
        setField(term157727, term157727.getClass(), "popups", null);
        setField(term157727, term157727.getClass(), "name", null);
        setBooleanField(term157727, term157727.getClass(), "nameExplicitlySet", false);
        setBooleanField(term157727, term157727.getClass(), "focusable", false);
        setIntField(term157727, term157727.getClass(), "isFocusTraversableOverridden", 0);
        setField(term157727, term157727.getClass(), "focusTraversalKeys", null);
        setBooleanField(term157727, term157727.getClass(), "focusTraversalKeysEnabled", false);
        setField(term157727, term157727.getClass(), "acc", null);
        setField(term157727, term157727.getClass(), "minSize", null);
        setBooleanField(term157727, term157727.getClass(), "minSizeSet", false);
        setField(term157727, term157727.getClass(), "prefSize", null);
        setBooleanField(term157727, term157727.getClass(), "prefSizeSet", false);
        setField(term157727, term157727.getClass(), "maxSize", null);
        setBooleanField(term157727, term157727.getClass(), "maxSizeSet", false);
        setField(term157727, term157727.getClass(), "componentOrientation", null);
        setBooleanField(term157727, term157727.getClass(), "newEventsOnly", false);
        setField(term157727, term157727.getClass(), "componentListener", null);
        setField(term157727, term157727.getClass(), "focusListener", null);
        setField(term157727, term157727.getClass(), "hierarchyListener", null);
        setField(term157727, term157727.getClass(), "hierarchyBoundsListener", null);
        setField(term157727, term157727.getClass(), "keyListener", null);
        setField(term157727, term157727.getClass(), "mouseListener", null);
        setField(term157727, term157727.getClass(), "mouseMotionListener", null);
        setField(term157727, term157727.getClass(), "mouseWheelListener", null);
        setField(term157727, term157727.getClass(), "inputMethodListener", null);
        setLongField(term157727, term157727.getClass(), "eventMask", 0L);
        setField(term157727, term157727.getClass(), "changeSupport", null);
        setField(term157727, term157727.getClass(), "objectLock", null);
        setBooleanField(term157727, term157727.getClass(), "isPacked", false);
        setIntField(term157727, term157727.getClass(), "boundsOp", 0);
        setField(term157727, term157727.getClass(), "compoundShape", null);
        setField(term157727, term157727.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term157727, term157727.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term157727, term157727.getClass(), "backgroundEraseDisabled", false);
        setField(term157727, term157727.getClass(), "eventCache", null);
        setBooleanField(term157727, term157727.getClass(), "coalescingEnabled", false);
        setBooleanField(term157727, term157727.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term157727, term157727.getClass(), "componentSerializedDataVersion", 0);
        setField(term157727, term157727.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.VoteView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionListener");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createBottomPanel", argTypes, term157727, args);
    }

};


