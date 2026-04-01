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

public class CreditsView_generateCreditsAndLicense_4731720516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1501752;

    public CreditsView_generateCreditsAndLicense_4731720516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1501752 = newInstance(Class.forName("org.openRealmOfStars.game.state.CreditsView"));
        setField(term1501752, term1501752.getClass(), "textArea", null);
        setBooleanField(term1501752, term1501752.getClass(), "isAlignmentXSet", false);
        setFloatField(term1501752, term1501752.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1501752, term1501752.getClass(), "isAlignmentYSet", false);
        setFloatField(term1501752, term1501752.getClass(), "alignmentY", 0.0F);
        setField(term1501752, term1501752.getClass(), "ui", null);
        setField(term1501752, term1501752.getClass(), "listenerList", null);
        setField(term1501752, term1501752.getClass(), "clientProperties", null);
        setField(term1501752, term1501752.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1501752, term1501752.getClass(), "autoscrolls", false);
        setField(term1501752, term1501752.getClass(), "border", null);
        setIntField(term1501752, term1501752.getClass(), "flags", 0);
        setField(term1501752, term1501752.getClass(), "inputVerifier", null);
        setBooleanField(term1501752, term1501752.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1501752, term1501752.getClass(), "paintingChild", null);
        setField(term1501752, term1501752.getClass(), "popupMenu", null);
        setField(term1501752, term1501752.getClass(), "revalidateRunnableScheduled", null);
        setField(term1501752, term1501752.getClass(), "focusInputMap", null);
        setField(term1501752, term1501752.getClass(), "ancestorInputMap", null);
        setField(term1501752, term1501752.getClass(), "windowInputMap", null);
        setField(term1501752, term1501752.getClass(), "actionMap", null);
        setField(term1501752, term1501752.getClass(), "aaHint", null);
        setField(term1501752, term1501752.getClass(), "lcdRenderingHint", null);
        setField(term1501752, term1501752.getClass(), "component", null);
        setField(term1501752, term1501752.getClass(), "layoutMgr", null);
        setField(term1501752, term1501752.getClass(), "dispatcher", null);
        setField(term1501752, term1501752.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1501752, term1501752.getClass(), "focusCycleRoot", false);
        setBooleanField(term1501752, term1501752.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1501752, term1501752.getClass(), "printingThreads", null);
        setBooleanField(term1501752, term1501752.getClass(), "printing", false);
        setField(term1501752, term1501752.getClass(), "containerListener", null);
        setIntField(term1501752, term1501752.getClass(), "listeningChildren", 0);
        setIntField(term1501752, term1501752.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1501752, term1501752.getClass(), "descendantsCount", 0);
        setField(term1501752, term1501752.getClass(), "preserveBackgroundColor", null);
        setIntField(term1501752, term1501752.getClass(), "numOfHWComponents", 0);
        setIntField(term1501752, term1501752.getClass(), "numOfLWComponents", 0);
        setField(term1501752, term1501752.getClass(), "modalComp", null);
        setField(term1501752, term1501752.getClass(), "modalAppContext", null);
        setIntField(term1501752, term1501752.getClass(), "containerSerializedDataVersion", 0);
        setField(term1501752, term1501752.getClass(), "peer", null);
        setField(term1501752, term1501752.getClass(), "parent", null);
        setField(term1501752, term1501752.getClass(), "appContext", null);
        setIntField(term1501752, term1501752.getClass(), "x", 0);
        setIntField(term1501752, term1501752.getClass(), "y", 0);
        setIntField(term1501752, term1501752.getClass(), "width", 0);
        setIntField(term1501752, term1501752.getClass(), "height", 0);
        setField(term1501752, term1501752.getClass(), "foreground", null);
        setField(term1501752, term1501752.getClass(), "background", null);
        setField(term1501752, term1501752.getClass(), "font", null);
        setField(term1501752, term1501752.getClass(), "peerFont", null);
        setField(term1501752, term1501752.getClass(), "cursor", null);
        setField(term1501752, term1501752.getClass(), "locale", null);
        setField(term1501752, term1501752.getClass(), "graphicsConfig", null);
        setField(term1501752, term1501752.getClass(), "bufferStrategy", null);
        setBooleanField(term1501752, term1501752.getClass(), "ignoreRepaint", false);
        setBooleanField(term1501752, term1501752.getClass(), "visible", false);
        setBooleanField(term1501752, term1501752.getClass(), "enabled", false);
        setBooleanField(term1501752, term1501752.getClass(), "valid", false);
        setField(term1501752, term1501752.getClass(), "dropTarget", null);
        setField(term1501752, term1501752.getClass(), "popups", null);
        setField(term1501752, term1501752.getClass(), "name", null);
        setBooleanField(term1501752, term1501752.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1501752, term1501752.getClass(), "focusable", false);
        setIntField(term1501752, term1501752.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1501752, term1501752.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1501752, term1501752.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1501752, term1501752.getClass(), "acc", null);
        setField(term1501752, term1501752.getClass(), "minSize", null);
        setBooleanField(term1501752, term1501752.getClass(), "minSizeSet", false);
        setField(term1501752, term1501752.getClass(), "prefSize", null);
        setBooleanField(term1501752, term1501752.getClass(), "prefSizeSet", false);
        setField(term1501752, term1501752.getClass(), "maxSize", null);
        setBooleanField(term1501752, term1501752.getClass(), "maxSizeSet", false);
        setField(term1501752, term1501752.getClass(), "componentOrientation", null);
        setBooleanField(term1501752, term1501752.getClass(), "newEventsOnly", false);
        setField(term1501752, term1501752.getClass(), "componentListener", null);
        setField(term1501752, term1501752.getClass(), "focusListener", null);
        setField(term1501752, term1501752.getClass(), "hierarchyListener", null);
        setField(term1501752, term1501752.getClass(), "hierarchyBoundsListener", null);
        setField(term1501752, term1501752.getClass(), "keyListener", null);
        setField(term1501752, term1501752.getClass(), "mouseListener", null);
        setField(term1501752, term1501752.getClass(), "mouseMotionListener", null);
        setField(term1501752, term1501752.getClass(), "mouseWheelListener", null);
        setField(term1501752, term1501752.getClass(), "inputMethodListener", null);
        setLongField(term1501752, term1501752.getClass(), "eventMask", 0L);
        setField(term1501752, term1501752.getClass(), "changeSupport", null);
        setField(term1501752, term1501752.getClass(), "objectLock", null);
        setBooleanField(term1501752, term1501752.getClass(), "isPacked", false);
        setIntField(term1501752, term1501752.getClass(), "boundsOp", 0);
        setField(term1501752, term1501752.getClass(), "compoundShape", null);
        setField(term1501752, term1501752.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1501752, term1501752.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1501752, term1501752.getClass(), "backgroundEraseDisabled", false);
        setField(term1501752, term1501752.getClass(), "eventCache", null);
        setBooleanField(term1501752, term1501752.getClass(), "coalescingEnabled", false);
        setBooleanField(term1501752, term1501752.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1501752, term1501752.getClass(), "componentSerializedDataVersion", 0);
        setField(term1501752, term1501752.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.CreditsView");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "generateCreditsAndLicense", argTypes, term1501752, args);
    }

};


