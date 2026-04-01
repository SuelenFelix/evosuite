package org.openRealmOfStars.ai.pathfinding;

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
import static org.openRealmOfStars.ai.pathfinding.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class AStarSearch_getTargetDistance_94684215716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17744;

    public AStarSearch_getTargetDistance_94684215716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17770 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17770, term17770.getClass(), "x", 1017354215);
        setIntField(term17770, term17770.getClass(), "y", 695330987);
        setDoubleField(term17770, term17770.getClass(), "distance", 0.6047137830113202);
        Object term17774 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17774, term17774.getClass(), "x", -267289967);
        setIntField(term17774, term17774.getClass(), "y", 773432822);
        setDoubleField(term17774, term17774.getClass(), "distance", 0.6767213143579776);
        ArrayList term17768 = new ArrayList();
        ((ArrayList) term17768).add(term17770);
        ((ArrayList) term17768).add(term17774);
        term17744 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        Object[] term17747 = (Object[]) newArray("[I", 3);
        int[] term17748 = (int[]) newIntArray(8);
        int[] term17757 = (int[]) newIntArray(6);
        int[] term17764 = (int[]) newIntArray(3);
        Object term17783 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17744, term17744.getClass(), "maxX", 1769496642);
        setIntField(term17744, term17744.getClass(), "maxY", -947460705);
        setIntElement(term17748, 0, -1435758764);
        setIntElement(term17748, 1, 752858379);
        setIntElement(term17748, 2, -370819357);
        setIntElement(term17748, 3, -71819242);
        setIntElement(term17748, 4, 1268893136);
        setIntElement(term17748, 5, -1472700822);
        setIntElement(term17748, 6, 1626670889);
        setIntElement(term17748, 7, -2117361140);
        setElement(term17747, 0, term17748);
        setIntElement(term17757, 0, 407708341);
        setIntElement(term17757, 1, -287519200);
        setIntElement(term17757, 2, -1490696181);
        setIntElement(term17757, 3, 623717232);
        setIntElement(term17757, 4, -1413291732);
        setIntElement(term17757, 5, 203264365);
        setElement(term17747, 1, term17757);
        setIntElement(term17764, 0, -1066281036);
        setIntElement(term17764, 1, 30837706);
        setIntElement(term17764, 2, 379523101);
        setElement(term17747, 2, term17764);
        setField(term17744, term17744.getClass(), "blockMap", term17747);
        setField(term17744, term17744.getClass(), "points", term17768);
        setIntField(term17744, term17744.getClass(), "tx", -488294922);
        setIntField(term17744, term17744.getClass(), "ty", -397161164);
        setIntField(term17744, term17744.getClass(), "targetDistance", -703717191);
        setIntField(term17783, term17783.getClass(), "x", -1255535445);
        setIntField(term17783, term17783.getClass(), "y", -2033952124);
        setDoubleField(term17783, term17783.getClass(), "distance", 0.48862955528902696);
        setField(term17744, term17744.getClass(), "targetPoint", term17783);
        setIntField(term17744, term17744.getClass(), "routeIndex", 560401653);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTargetDistance", argTypes, term17744, args);
    }

};


