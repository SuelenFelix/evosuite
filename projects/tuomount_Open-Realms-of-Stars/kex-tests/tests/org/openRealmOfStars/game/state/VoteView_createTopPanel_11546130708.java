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

public class VoteView_createTopPanel_11546130708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157685;

    public VoteView_createTopPanel_11546130708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term157685 = newInstance(Class.forName("org.openRealmOfStars.game.state.VoteView"));
        setField(term157685, term157685.getClass(), "voteLabel", null);
        setIntField(term157685, term157685.getClass(), "voteIndex", 0);
        setField(term157685, term157685.getClass(), "map", null);
        setField(term157685, term157685.getClass(), "voteTitle", null);
        setField(term157685, term157685.getClass(), "votingTime", null);
        setField(term157685, term157685.getClass(), "voteYesBtn", null);
        setField(term157685, term157685.getClass(), "voteNoBtn", null);
        setField(term157685, term157685.getClass(), "voteAbstain", null);
        setField(term157685, term157685.getClass(), "votedText", null);
        setField(term157685, term157685.getClass(), "votingInfoText", null);
        setField(term157685, term157685.getClass(), "votingInfoTitle", null);
        setBooleanField(term157685, term157685.getClass(), "isAlignmentXSet", false);
        setFloatField(term157685, term157685.getClass(), "alignmentX", 0.0F);
        setBooleanField(term157685, term157685.getClass(), "isAlignmentYSet", false);
        setFloatField(term157685, term157685.getClass(), "alignmentY", 0.0F);
        setField(term157685, term157685.getClass(), "ui", null);
        setField(term157685, term157685.getClass(), "listenerList", null);
        setField(term157685, term157685.getClass(), "clientProperties", null);
        setField(term157685, term157685.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term157685, term157685.getClass(), "autoscrolls", false);
        setField(term157685, term157685.getClass(), "border", null);
        setIntField(term157685, term157685.getClass(), "flags", 0);
        setField(term157685, term157685.getClass(), "inputVerifier", null);
        setBooleanField(term157685, term157685.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term157685, term157685.getClass(), "paintingChild", null);
        setField(term157685, term157685.getClass(), "popupMenu", null);
        setField(term157685, term157685.getClass(), "revalidateRunnableScheduled", null);
        setField(term157685, term157685.getClass(), "focusInputMap", null);
        setField(term157685, term157685.getClass(), "ancestorInputMap", null);
        setField(term157685, term157685.getClass(), "windowInputMap", null);
        setField(term157685, term157685.getClass(), "actionMap", null);
        setField(term157685, term157685.getClass(), "aaHint", null);
        setField(term157685, term157685.getClass(), "lcdRenderingHint", null);
        setField(term157685, term157685.getClass(), "component", null);
        setField(term157685, term157685.getClass(), "layoutMgr", null);
        setField(term157685, term157685.getClass(), "dispatcher", null);
        setField(term157685, term157685.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term157685, term157685.getClass(), "focusCycleRoot", false);
        setBooleanField(term157685, term157685.getClass(), "focusTraversalPolicyProvider", false);
        setField(term157685, term157685.getClass(), "printingThreads", null);
        setBooleanField(term157685, term157685.getClass(), "printing", false);
        setField(term157685, term157685.getClass(), "containerListener", null);
        setIntField(term157685, term157685.getClass(), "listeningChildren", 0);
        setIntField(term157685, term157685.getClass(), "listeningBoundsChildren", 0);
        setIntField(term157685, term157685.getClass(), "descendantsCount", 0);
        setField(term157685, term157685.getClass(), "preserveBackgroundColor", null);
        setIntField(term157685, term157685.getClass(), "numOfHWComponents", 0);
        setIntField(term157685, term157685.getClass(), "numOfLWComponents", 0);
        setField(term157685, term157685.getClass(), "modalComp", null);
        setField(term157685, term157685.getClass(), "modalAppContext", null);
        setIntField(term157685, term157685.getClass(), "containerSerializedDataVersion", 0);
        setField(term157685, term157685.getClass(), "peer", null);
        setField(term157685, term157685.getClass(), "parent", null);
        setField(term157685, term157685.getClass(), "appContext", null);
        setIntField(term157685, term157685.getClass(), "x", 0);
        setIntField(term157685, term157685.getClass(), "y", 0);
        setIntField(term157685, term157685.getClass(), "width", 0);
        setIntField(term157685, term157685.getClass(), "height", 0);
        setField(term157685, term157685.getClass(), "foreground", null);
        setField(term157685, term157685.getClass(), "background", null);
        setField(term157685, term157685.getClass(), "font", null);
        setField(term157685, term157685.getClass(), "peerFont", null);
        setField(term157685, term157685.getClass(), "cursor", null);
        setField(term157685, term157685.getClass(), "locale", null);
        setField(term157685, term157685.getClass(), "graphicsConfig", null);
        setField(term157685, term157685.getClass(), "bufferStrategy", null);
        setBooleanField(term157685, term157685.getClass(), "ignoreRepaint", false);
        setBooleanField(term157685, term157685.getClass(), "visible", false);
        setBooleanField(term157685, term157685.getClass(), "enabled", false);
        setBooleanField(term157685, term157685.getClass(), "valid", false);
        setField(term157685, term157685.getClass(), "dropTarget", null);
        setField(term157685, term157685.getClass(), "popups", null);
        setField(term157685, term157685.getClass(), "name", null);
        setBooleanField(term157685, term157685.getClass(), "nameExplicitlySet", false);
        setBooleanField(term157685, term157685.getClass(), "focusable", false);
        setIntField(term157685, term157685.getClass(), "isFocusTraversableOverridden", 0);
        setField(term157685, term157685.getClass(), "focusTraversalKeys", null);
        setBooleanField(term157685, term157685.getClass(), "focusTraversalKeysEnabled", false);
        setField(term157685, term157685.getClass(), "acc", null);
        setField(term157685, term157685.getClass(), "minSize", null);
        setBooleanField(term157685, term157685.getClass(), "minSizeSet", false);
        setField(term157685, term157685.getClass(), "prefSize", null);
        setBooleanField(term157685, term157685.getClass(), "prefSizeSet", false);
        setField(term157685, term157685.getClass(), "maxSize", null);
        setBooleanField(term157685, term157685.getClass(), "maxSizeSet", false);
        setField(term157685, term157685.getClass(), "componentOrientation", null);
        setBooleanField(term157685, term157685.getClass(), "newEventsOnly", false);
        setField(term157685, term157685.getClass(), "componentListener", null);
        setField(term157685, term157685.getClass(), "focusListener", null);
        setField(term157685, term157685.getClass(), "hierarchyListener", null);
        setField(term157685, term157685.getClass(), "hierarchyBoundsListener", null);
        setField(term157685, term157685.getClass(), "keyListener", null);
        setField(term157685, term157685.getClass(), "mouseListener", null);
        setField(term157685, term157685.getClass(), "mouseMotionListener", null);
        setField(term157685, term157685.getClass(), "mouseWheelListener", null);
        setField(term157685, term157685.getClass(), "inputMethodListener", null);
        setLongField(term157685, term157685.getClass(), "eventMask", 0L);
        setField(term157685, term157685.getClass(), "changeSupport", null);
        setField(term157685, term157685.getClass(), "objectLock", null);
        setBooleanField(term157685, term157685.getClass(), "isPacked", false);
        setIntField(term157685, term157685.getClass(), "boundsOp", 0);
        setField(term157685, term157685.getClass(), "compoundShape", null);
        setField(term157685, term157685.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term157685, term157685.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term157685, term157685.getClass(), "backgroundEraseDisabled", false);
        setField(term157685, term157685.getClass(), "eventCache", null);
        setBooleanField(term157685, term157685.getClass(), "coalescingEnabled", false);
        setBooleanField(term157685, term157685.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term157685, term157685.getClass(), "componentSerializedDataVersion", 0);
        setField(term157685, term157685.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.VoteView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionListener");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createTopPanel", argTypes, term157685, args);
    }

};


