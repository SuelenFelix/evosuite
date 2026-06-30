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

public class RecentResp_getMaxCombo_77660075711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46757;

    public RecentResp_getMaxCombo_77660075711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46757 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term46758 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46759 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46763 = newInstance(Class.forName("java.time.LocalTime"));
        Object term46768 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46769 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46773 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term46759, term46759.getClass(), "year", 2012);
        setShortField(term46759, term46759.getClass(), "month", (short) 6);
        setShortField(term46759, term46759.getClass(), "day", (short) 7);
        setField(term46758, term46758.getClass(), "date", term46759);
        setByteField(term46763, term46763.getClass(), "hour", (byte) 19);
        setByteField(term46763, term46763.getClass(), "minute", (byte) 20);
        setByteField(term46763, term46763.getClass(), "second", (byte) 29);
        setIntField(term46763, term46763.getClass(), "nano", 953959934);
        setField(term46758, term46758.getClass(), "time", term46763);
        setField(term46757, term46757.getClass(), "playDate", term46758);
        setIntField(term46769, term46769.getClass(), "year", 2024);
        setShortField(term46769, term46769.getClass(), "month", (short) 3);
        setShortField(term46769, term46769.getClass(), "day", (short) 21);
        setField(term46768, term46768.getClass(), "date", term46769);
        setByteField(term46773, term46773.getClass(), "hour", (byte) 1);
        setByteField(term46773, term46773.getClass(), "minute", (byte) 21);
        setByteField(term46773, term46773.getClass(), "second", (byte) 2);
        setIntField(term46773, term46773.getClass(), "nano", 692012262);
        setField(term46768, term46768.getClass(), "time", term46773);
        setField(term46757, term46757.getClass(), "userPlayDate", term46768);
        setIntField(term46757, term46757.getClass(), "musicId", 844485803);
        setIntField(term46757, term46757.getClass(), "level", -1373407191);
        setIntField(term46757, term46757.getClass(), "customId", 1013516042);
        setIntField(term46757, term46757.getClass(), "playedCustom1", 284652039);
        setIntField(term46757, term46757.getClass(), "playedCustom2", 1163350537);
        setIntField(term46757, term46757.getClass(), "playedCustom3", -855026181);
        setIntField(term46757, term46757.getClass(), "track", 1404243357);
        setIntField(term46757, term46757.getClass(), "score", -570134327);
        setIntField(term46757, term46757.getClass(), "rank", 73847121);
        setIntField(term46757, term46757.getClass(), "maxCombo", 1721050745);
        setIntField(term46757, term46757.getClass(), "maxChain", -1980981205);
        setIntField(term46757, term46757.getClass(), "rateTap", -1530498856);
        setIntField(term46757, term46757.getClass(), "rateHold", 1816257051);
        setIntField(term46757, term46757.getClass(), "rateSlide", -541591725);
        setIntField(term46757, term46757.getClass(), "rateAir", 498271385);
        setIntField(term46757, term46757.getClass(), "rateFlick", 1418222767);
        setIntField(term46757, term46757.getClass(), "judgeGuilty", 1862441057);
        setIntField(term46757, term46757.getClass(), "judgeAttack", 1889814117);
        setIntField(term46757, term46757.getClass(), "judgeJustice", -1336297368);
        setIntField(term46757, term46757.getClass(), "judgeCritical", 1535507114);
        setIntField(term46757, term46757.getClass(), "playerRating", -1174141307);
        setBooleanField(term46757, term46757.getClass(), "isNewRecord", false);
        setBooleanField(term46757, term46757.getClass(), "isFullCombo", false);
        setIntField(term46757, term46757.getClass(), "fullChainKind", -1603957392);
        setBooleanField(term46757, term46757.getClass(), "isAllJustice", true);
        setIntField(term46757, term46757.getClass(), "characterId", -287005602);
        setIntField(term46757, term46757.getClass(), "skillId", 923353564);
        setIntField(term46757, term46757.getClass(), "playKind", 2013647768);
        setBooleanField(term46757, term46757.getClass(), "isClear", true);
        setIntField(term46757, term46757.getClass(), "skillLevel", 1706579212);
        setIntField(term46757, term46757.getClass(), "skillEffect", -1073781147);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxCombo", argTypes, term46757, args);
    }

};


