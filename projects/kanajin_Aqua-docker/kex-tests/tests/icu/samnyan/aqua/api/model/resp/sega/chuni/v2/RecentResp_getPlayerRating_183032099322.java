package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RecentResp_getPlayerRating_183032099322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47329;

    public RecentResp_getPlayerRating_183032099322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47329 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term47330 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47331 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47335 = newInstance(Class.forName("java.time.LocalTime"));
        Object term47340 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47341 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47345 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term47331, term47331.getClass(), "year", 2023);
        setShortField(term47331, term47331.getClass(), "month", (short) 1);
        setShortField(term47331, term47331.getClass(), "day", (short) 10);
        setField(term47330, term47330.getClass(), "date", term47331);
        setByteField(term47335, term47335.getClass(), "hour", (byte) 2);
        setByteField(term47335, term47335.getClass(), "minute", (byte) 12);
        setByteField(term47335, term47335.getClass(), "second", (byte) 45);
        setIntField(term47335, term47335.getClass(), "nano", 793047168);
        setField(term47330, term47330.getClass(), "time", term47335);
        setField(term47329, term47329.getClass(), "playDate", term47330);
        setIntField(term47341, term47341.getClass(), "year", 2028);
        setShortField(term47341, term47341.getClass(), "month", (short) 6);
        setShortField(term47341, term47341.getClass(), "day", (short) 12);
        setField(term47340, term47340.getClass(), "date", term47341);
        setByteField(term47345, term47345.getClass(), "hour", (byte) 9);
        setByteField(term47345, term47345.getClass(), "minute", (byte) 39);
        setByteField(term47345, term47345.getClass(), "second", (byte) 7);
        setIntField(term47345, term47345.getClass(), "nano", 950068890);
        setField(term47340, term47340.getClass(), "time", term47345);
        setField(term47329, term47329.getClass(), "userPlayDate", term47340);
        setIntField(term47329, term47329.getClass(), "musicId", -109584269);
        setIntField(term47329, term47329.getClass(), "level", -682334474);
        setIntField(term47329, term47329.getClass(), "customId", -666332937);
        setIntField(term47329, term47329.getClass(), "playedCustom1", 1661615099);
        setIntField(term47329, term47329.getClass(), "playedCustom2", 1908136627);
        setIntField(term47329, term47329.getClass(), "playedCustom3", 824600792);
        setIntField(term47329, term47329.getClass(), "track", -1498923569);
        setIntField(term47329, term47329.getClass(), "score", 1082643319);
        setIntField(term47329, term47329.getClass(), "rank", -1138616222);
        setIntField(term47329, term47329.getClass(), "maxCombo", 285368240);
        setIntField(term47329, term47329.getClass(), "maxChain", 1526503433);
        setIntField(term47329, term47329.getClass(), "rateTap", 1765728316);
        setIntField(term47329, term47329.getClass(), "rateHold", -1459041031);
        setIntField(term47329, term47329.getClass(), "rateSlide", 846881911);
        setIntField(term47329, term47329.getClass(), "rateAir", 780077059);
        setIntField(term47329, term47329.getClass(), "rateFlick", -924663332);
        setIntField(term47329, term47329.getClass(), "judgeGuilty", 579787883);
        setIntField(term47329, term47329.getClass(), "judgeAttack", -1104816537);
        setIntField(term47329, term47329.getClass(), "judgeJustice", 1997406081);
        setIntField(term47329, term47329.getClass(), "judgeCritical", -160995016);
        setIntField(term47329, term47329.getClass(), "playerRating", -849730731);
        setBooleanField(term47329, term47329.getClass(), "isNewRecord", false);
        setBooleanField(term47329, term47329.getClass(), "isFullCombo", false);
        setIntField(term47329, term47329.getClass(), "fullChainKind", -1965240023);
        setBooleanField(term47329, term47329.getClass(), "isAllJustice", false);
        setIntField(term47329, term47329.getClass(), "characterId", -86860026);
        setIntField(term47329, term47329.getClass(), "skillId", -444451515);
        setIntField(term47329, term47329.getClass(), "playKind", -545419660);
        setBooleanField(term47329, term47329.getClass(), "isClear", false);
        setIntField(term47329, term47329.getClass(), "skillLevel", -1917689550);
        setIntField(term47329, term47329.getClass(), "skillEffect", 1829428325);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term47329, args);
    }

};


