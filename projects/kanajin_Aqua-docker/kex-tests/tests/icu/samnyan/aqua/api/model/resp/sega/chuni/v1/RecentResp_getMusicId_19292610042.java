package icu.samnyan.aqua.api.model.resp.sega.chuni.v1;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class RecentResp_getMusicId_19292610042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51459;

    public RecentResp_getMusicId_19292610042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51459 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term51460 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51461 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51465 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51470 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51471 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51475 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term51461, term51461.getClass(), "year", 2015);
        setShortField(term51461, term51461.getClass(), "month", (short) 10);
        setShortField(term51461, term51461.getClass(), "day", (short) 4);
        setField(term51460, term51460.getClass(), "date", term51461);
        setByteField(term51465, term51465.getClass(), "hour", (byte) 4);
        setByteField(term51465, term51465.getClass(), "minute", (byte) 28);
        setByteField(term51465, term51465.getClass(), "second", (byte) 5);
        setIntField(term51465, term51465.getClass(), "nano", 457950228);
        setField(term51460, term51460.getClass(), "time", term51465);
        setField(term51459, term51459.getClass(), "playDate", term51460);
        setIntField(term51471, term51471.getClass(), "year", 2017);
        setShortField(term51471, term51471.getClass(), "month", (short) 2);
        setShortField(term51471, term51471.getClass(), "day", (short) 8);
        setField(term51470, term51470.getClass(), "date", term51471);
        setByteField(term51475, term51475.getClass(), "hour", (byte) 12);
        setByteField(term51475, term51475.getClass(), "minute", (byte) 5);
        setByteField(term51475, term51475.getClass(), "second", (byte) 46);
        setIntField(term51475, term51475.getClass(), "nano", 847487783);
        setField(term51470, term51470.getClass(), "time", term51475);
        setField(term51459, term51459.getClass(), "userPlayDate", term51470);
        setIntField(term51459, term51459.getClass(), "musicId", 1526503433);
        setIntField(term51459, term51459.getClass(), "level", 1765728316);
        setIntField(term51459, term51459.getClass(), "customId", -1459041031);
        setIntField(term51459, term51459.getClass(), "playedCustom1", 846881911);
        setIntField(term51459, term51459.getClass(), "playedCustom2", 780077059);
        setIntField(term51459, term51459.getClass(), "playedCustom3", -924663332);
        setIntField(term51459, term51459.getClass(), "track", 579787883);
        setIntField(term51459, term51459.getClass(), "score", -1104816537);
        setIntField(term51459, term51459.getClass(), "rank", 1997406081);
        setIntField(term51459, term51459.getClass(), "maxCombo", -160995016);
        setIntField(term51459, term51459.getClass(), "maxChain", -849730731);
        setIntField(term51459, term51459.getClass(), "rateTap", -1965240023);
        setIntField(term51459, term51459.getClass(), "rateHold", -86860026);
        setIntField(term51459, term51459.getClass(), "rateSlide", -444451515);
        setIntField(term51459, term51459.getClass(), "rateAir", -545419660);
        setIntField(term51459, term51459.getClass(), "rateFlick", -1917689550);
        setIntField(term51459, term51459.getClass(), "judgeGuilty", 1829428325);
        setIntField(term51459, term51459.getClass(), "judgeAttack", -1881843694);
        setIntField(term51459, term51459.getClass(), "judgeJustice", -1134250665);
        setIntField(term51459, term51459.getClass(), "judgeCritical", -1607263638);
        setIntField(term51459, term51459.getClass(), "playerRating", 691469974);
        setBooleanField(term51459, term51459.getClass(), "isNewRecord", true);
        setBooleanField(term51459, term51459.getClass(), "isFullCombo", true);
        setIntField(term51459, term51459.getClass(), "fullChainKind", -2080503799);
        setBooleanField(term51459, term51459.getClass(), "isAllJustice", false);
        setIntField(term51459, term51459.getClass(), "characterId", 13757525);
        setIntField(term51459, term51459.getClass(), "skillId", 77853966);
        setIntField(term51459, term51459.getClass(), "playKind", 1451393741);
        setBooleanField(term51459, term51459.getClass(), "isClear", false);
        setIntField(term51459, term51459.getClass(), "skillLevel", -1115815564);
        setIntField(term51459, term51459.getClass(), "skillEffect", 425132480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicId", argTypes, term51459, args);
    }

};


