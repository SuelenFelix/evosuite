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

public class AStarSearch_doSearchPreferStraightLines_66644851910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17237;

    public AStarSearch_doSearchPreferStraightLines_66644851910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17281 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17281, term17281.getClass(), "x", 373810833);
        setIntField(term17281, term17281.getClass(), "y", -215979293);
        setDoubleField(term17281, term17281.getClass(), "distance", 0.8823181080774973);
        Object term17285 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17285, term17285.getClass(), "x", -19567889);
        setIntField(term17285, term17285.getClass(), "y", 693500318);
        setDoubleField(term17285, term17285.getClass(), "distance", 0.2192450926212024);
        Object term17289 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17289, term17289.getClass(), "x", 1702404702);
        setIntField(term17289, term17289.getClass(), "y", 1141592999);
        setDoubleField(term17289, term17289.getClass(), "distance", 0.7591353014991907);
        Object term17293 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17293, term17293.getClass(), "x", 848113442);
        setIntField(term17293, term17293.getClass(), "y", 793974213);
        setDoubleField(term17293, term17293.getClass(), "distance", 0.791695029600875);
        Object term17297 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17297, term17297.getClass(), "x", 722546287);
        setIntField(term17297, term17297.getClass(), "y", -2060284160);
        setDoubleField(term17297, term17297.getClass(), "distance", 0.6862221294683138);
        Object term17301 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17301, term17301.getClass(), "x", -568450686);
        setIntField(term17301, term17301.getClass(), "y", 1314660281);
        setDoubleField(term17301, term17301.getClass(), "distance", 0.15917839663695388);
        Object term17305 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17305, term17305.getClass(), "x", -126399768);
        setIntField(term17305, term17305.getClass(), "y", 318982923);
        setDoubleField(term17305, term17305.getClass(), "distance", 0.9374115574082594);
        ArrayList term17279 = new ArrayList();
        ((ArrayList) term17279).add(term17281);
        ((ArrayList) term17279).add(term17285);
        ((ArrayList) term17279).add(term17289);
        ((ArrayList) term17279).add(term17293);
        ((ArrayList) term17279).add(term17297);
        ((ArrayList) term17279).add(term17301);
        ((ArrayList) term17279).add(term17305);
        term17237 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch"));
        Object[] term17240 = (Object[]) newArray("[I", 6);
        int[] term17241 = (int[]) newIntArray(8);
        int[] term17250 = (int[]) newIntArray(4);
        int[] term17255 = (int[]) newIntArray(0);
        int[] term17256 = (int[]) newIntArray(4);
        int[] term17261 = (int[]) newIntArray(8);
        int[] term17270 = (int[]) newIntArray(8);
        Object term17314 = newInstance(Class.forName("org.openRealmOfStars.ai.pathfinding.PathPoint"));
        setIntField(term17237, term17237.getClass(), "maxX", 703799187);
        setIntField(term17237, term17237.getClass(), "maxY", -1305898281);
        setIntElement(term17241, 0, 140501130);
        setIntElement(term17241, 1, -1458890291);
        setIntElement(term17241, 2, 1016087323);
        setIntElement(term17241, 3, 1957748979);
        setIntElement(term17241, 4, -1290093259);
        setIntElement(term17241, 5, -1200934890);
        setIntElement(term17241, 6, 1765633108);
        setIntElement(term17241, 7, 1312888741);
        setElement(term17240, 0, term17241);
        setIntElement(term17250, 0, -1443680397);
        setIntElement(term17250, 1, -1331169079);
        setIntElement(term17250, 2, 1109050836);
        setIntElement(term17250, 3, 1978065000);
        setElement(term17240, 1, term17250);
        setElement(term17240, 2, term17255);
        setIntElement(term17256, 0, -2121133707);
        setIntElement(term17256, 1, -1005498887);
        setIntElement(term17256, 2, 1329150584);
        setIntElement(term17256, 3, -1825382367);
        setElement(term17240, 3, term17256);
        setIntElement(term17261, 0, -1791371074);
        setIntElement(term17261, 1, -1151122332);
        setIntElement(term17261, 2, 953387911);
        setIntElement(term17261, 3, -1550025613);
        setIntElement(term17261, 4, 814617314);
        setIntElement(term17261, 5, -159489307);
        setIntElement(term17261, 6, 1317020952);
        setIntElement(term17261, 7, -742710703);
        setElement(term17240, 4, term17261);
        setIntElement(term17270, 0, -355505521);
        setIntElement(term17270, 1, 1227316523);
        setIntElement(term17270, 2, -58633039);
        setIntElement(term17270, 3, 448061908);
        setIntElement(term17270, 4, -1268483887);
        setIntElement(term17270, 5, -1929689681);
        setIntElement(term17270, 6, -91240911);
        setIntElement(term17270, 7, -321227954);
        setElement(term17240, 5, term17270);
        setField(term17237, term17237.getClass(), "blockMap", term17240);
        setField(term17237, term17237.getClass(), "points", term17279);
        setIntField(term17237, term17237.getClass(), "tx", -154210001);
        setIntField(term17237, term17237.getClass(), "ty", 621910137);
        setIntField(term17237, term17237.getClass(), "targetDistance", 241533020);
        setIntField(term17314, term17314.getClass(), "x", 2081679151);
        setIntField(term17314, term17314.getClass(), "y", -1030167086);
        setDoubleField(term17314, term17314.getClass(), "distance", 0.8454723071922143);
        setField(term17237, term17237.getClass(), "targetPoint", term17314);
        setIntField(term17237, term17237.getClass(), "routeIndex", -434230943);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.pathfinding.AStarSearch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doSearchPreferStraightLines", argTypes, term17237, args);
    }

};


