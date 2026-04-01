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

public class EspionageMissionView_getEspionageStats_18606826683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1025811;

    public EspionageMissionView_getEspionageStats_18606826683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1025811 = newInstance(Class.forName("org.openRealmOfStars.game.state.EspionageMissionView"));
        setField(term1025811, term1025811.getClass(), "farmPanel", null);
        setField(term1025811, term1025811.getClass(), "minePanel", null);
        setField(term1025811, term1025811.getClass(), "factoryPanel", null);
        setField(term1025811, term1025811.getClass(), "resePanel", null);
        setField(term1025811, term1025811.getClass(), "taxPanel", null);
        setField(term1025811, term1025811.getClass(), "cultureLabel", null);
        setField(term1025811, term1025811.getClass(), "totalPeople", null);
        setField(term1025811, term1025811.getClass(), "peopleGrowth", null);
        setField(term1025811, term1025811.getClass(), "farmProd", null);
        setField(term1025811, term1025811.getClass(), "mineProd", null);
        setField(term1025811, term1025811.getClass(), "prodProd", null);
        setField(term1025811, term1025811.getClass(), "reseProd", null);
        setField(term1025811, term1025811.getClass(), "cultProd", null);
        setField(term1025811, term1025811.getClass(), "credProd", null);
        setField(term1025811, term1025811.getClass(), "maintenance", null);
        setField(term1025811, term1025811.getClass(), "metal", null);
        setField(term1025811, term1025811.getClass(), "metalOre", null);
        setField(term1025811, term1025811.getClass(), "happiness", null);
        setField(term1025811, term1025811.getClass(), "constructionLabel", null);
        setField(term1025811, term1025811.getClass(), "buildingLabel", null);
        setField(term1025811, term1025811.getClass(), "buildingEstimate", null);
        setField(term1025811, term1025811.getClass(), "governorLabel", null);
        setField(term1025811, term1025811.getClass(), "buildingList", null);
        setField(term1025811, term1025811.getClass(), "planet", null);
        setField(term1025811, term1025811.getClass(), "info", null);
        setField(term1025811, term1025811.getClass(), "fleet", null);
        setField(term1025811, term1025811.getClass(), "missionType", null);
        setField(term1025811, term1025811.getClass(), "missionInfo", null);
        setBooleanField(term1025811, term1025811.getClass(), "isAlignmentXSet", false);
        setFloatField(term1025811, term1025811.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1025811, term1025811.getClass(), "isAlignmentYSet", false);
        setFloatField(term1025811, term1025811.getClass(), "alignmentY", 0.0F);
        setField(term1025811, term1025811.getClass(), "ui", null);
        setField(term1025811, term1025811.getClass(), "listenerList", null);
        setField(term1025811, term1025811.getClass(), "clientProperties", null);
        setField(term1025811, term1025811.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1025811, term1025811.getClass(), "autoscrolls", false);
        setField(term1025811, term1025811.getClass(), "border", null);
        setIntField(term1025811, term1025811.getClass(), "flags", 0);
        setField(term1025811, term1025811.getClass(), "inputVerifier", null);
        setBooleanField(term1025811, term1025811.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1025811, term1025811.getClass(), "paintingChild", null);
        setField(term1025811, term1025811.getClass(), "popupMenu", null);
        setField(term1025811, term1025811.getClass(), "revalidateRunnableScheduled", null);
        setField(term1025811, term1025811.getClass(), "focusInputMap", null);
        setField(term1025811, term1025811.getClass(), "ancestorInputMap", null);
        setField(term1025811, term1025811.getClass(), "windowInputMap", null);
        setField(term1025811, term1025811.getClass(), "actionMap", null);
        setField(term1025811, term1025811.getClass(), "aaHint", null);
        setField(term1025811, term1025811.getClass(), "lcdRenderingHint", null);
        setField(term1025811, term1025811.getClass(), "component", null);
        setField(term1025811, term1025811.getClass(), "layoutMgr", null);
        setField(term1025811, term1025811.getClass(), "dispatcher", null);
        setField(term1025811, term1025811.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1025811, term1025811.getClass(), "focusCycleRoot", false);
        setBooleanField(term1025811, term1025811.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1025811, term1025811.getClass(), "printingThreads", null);
        setBooleanField(term1025811, term1025811.getClass(), "printing", false);
        setField(term1025811, term1025811.getClass(), "containerListener", null);
        setIntField(term1025811, term1025811.getClass(), "listeningChildren", 0);
        setIntField(term1025811, term1025811.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1025811, term1025811.getClass(), "descendantsCount", 0);
        setField(term1025811, term1025811.getClass(), "preserveBackgroundColor", null);
        setIntField(term1025811, term1025811.getClass(), "numOfHWComponents", 0);
        setIntField(term1025811, term1025811.getClass(), "numOfLWComponents", 0);
        setField(term1025811, term1025811.getClass(), "modalComp", null);
        setField(term1025811, term1025811.getClass(), "modalAppContext", null);
        setIntField(term1025811, term1025811.getClass(), "containerSerializedDataVersion", 0);
        setField(term1025811, term1025811.getClass(), "peer", null);
        setField(term1025811, term1025811.getClass(), "parent", null);
        setField(term1025811, term1025811.getClass(), "appContext", null);
        setIntField(term1025811, term1025811.getClass(), "x", 0);
        setIntField(term1025811, term1025811.getClass(), "y", 0);
        setIntField(term1025811, term1025811.getClass(), "width", 0);
        setIntField(term1025811, term1025811.getClass(), "height", 0);
        setField(term1025811, term1025811.getClass(), "foreground", null);
        setField(term1025811, term1025811.getClass(), "background", null);
        setField(term1025811, term1025811.getClass(), "font", null);
        setField(term1025811, term1025811.getClass(), "peerFont", null);
        setField(term1025811, term1025811.getClass(), "cursor", null);
        setField(term1025811, term1025811.getClass(), "locale", null);
        setField(term1025811, term1025811.getClass(), "graphicsConfig", null);
        setField(term1025811, term1025811.getClass(), "bufferStrategy", null);
        setBooleanField(term1025811, term1025811.getClass(), "ignoreRepaint", false);
        setBooleanField(term1025811, term1025811.getClass(), "visible", false);
        setBooleanField(term1025811, term1025811.getClass(), "enabled", false);
        setBooleanField(term1025811, term1025811.getClass(), "valid", false);
        setField(term1025811, term1025811.getClass(), "dropTarget", null);
        setField(term1025811, term1025811.getClass(), "popups", null);
        setField(term1025811, term1025811.getClass(), "name", null);
        setBooleanField(term1025811, term1025811.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1025811, term1025811.getClass(), "focusable", false);
        setIntField(term1025811, term1025811.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1025811, term1025811.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1025811, term1025811.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1025811, term1025811.getClass(), "acc", null);
        setField(term1025811, term1025811.getClass(), "minSize", null);
        setBooleanField(term1025811, term1025811.getClass(), "minSizeSet", false);
        setField(term1025811, term1025811.getClass(), "prefSize", null);
        setBooleanField(term1025811, term1025811.getClass(), "prefSizeSet", false);
        setField(term1025811, term1025811.getClass(), "maxSize", null);
        setBooleanField(term1025811, term1025811.getClass(), "maxSizeSet", false);
        setField(term1025811, term1025811.getClass(), "componentOrientation", null);
        setBooleanField(term1025811, term1025811.getClass(), "newEventsOnly", false);
        setField(term1025811, term1025811.getClass(), "componentListener", null);
        setField(term1025811, term1025811.getClass(), "focusListener", null);
        setField(term1025811, term1025811.getClass(), "hierarchyListener", null);
        setField(term1025811, term1025811.getClass(), "hierarchyBoundsListener", null);
        setField(term1025811, term1025811.getClass(), "keyListener", null);
        setField(term1025811, term1025811.getClass(), "mouseListener", null);
        setField(term1025811, term1025811.getClass(), "mouseMotionListener", null);
        setField(term1025811, term1025811.getClass(), "mouseWheelListener", null);
        setField(term1025811, term1025811.getClass(), "inputMethodListener", null);
        setLongField(term1025811, term1025811.getClass(), "eventMask", 0L);
        setField(term1025811, term1025811.getClass(), "changeSupport", null);
        setField(term1025811, term1025811.getClass(), "objectLock", null);
        setBooleanField(term1025811, term1025811.getClass(), "isPacked", false);
        setIntField(term1025811, term1025811.getClass(), "boundsOp", 0);
        setField(term1025811, term1025811.getClass(), "compoundShape", null);
        setField(term1025811, term1025811.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1025811, term1025811.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1025811, term1025811.getClass(), "backgroundEraseDisabled", false);
        setField(term1025811, term1025811.getClass(), "eventCache", null);
        setBooleanField(term1025811, term1025811.getClass(), "coalescingEnabled", false);
        setBooleanField(term1025811, term1025811.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1025811, term1025811.getClass(), "componentSerializedDataVersion", 0);
        setField(term1025811, term1025811.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.EspionageMissionView");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEspionageStats", argTypes, term1025811, args);
    }

};


