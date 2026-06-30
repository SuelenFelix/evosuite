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

public class RecentResp_getCustomId_1057213884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51563;

    public RecentResp_getCustomId_1057213884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51563 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term51564 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51565 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51569 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51574 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51575 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51579 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term51565, term51565.getClass(), "year", 2015);
        setShortField(term51565, term51565.getClass(), "month", (short) 11);
        setShortField(term51565, term51565.getClass(), "day", (short) 12);
        setField(term51564, term51564.getClass(), "date", term51565);
        setByteField(term51569, term51569.getClass(), "hour", (byte) 8);
        setByteField(term51569, term51569.getClass(), "minute", (byte) 57);
        setByteField(term51569, term51569.getClass(), "second", (byte) 39);
        setIntField(term51569, term51569.getClass(), "nano", 144990931);
        setField(term51564, term51564.getClass(), "time", term51569);
        setField(term51563, term51563.getClass(), "playDate", term51564);
        setIntField(term51575, term51575.getClass(), "year", 2015);
        setShortField(term51575, term51575.getClass(), "month", (short) 3);
        setShortField(term51575, term51575.getClass(), "day", (short) 10);
        setField(term51574, term51574.getClass(), "date", term51575);
        setByteField(term51579, term51579.getClass(), "hour", (byte) 6);
        setByteField(term51579, term51579.getClass(), "minute", (byte) 11);
        setByteField(term51579, term51579.getClass(), "second", (byte) 21);
        setIntField(term51579, term51579.getClass(), "nano", 925797004);
        setField(term51574, term51574.getClass(), "time", term51579);
        setField(term51563, term51563.getClass(), "userPlayDate", term51574);
        setIntField(term51563, term51563.getClass(), "musicId", 802196878);
        setIntField(term51563, term51563.getClass(), "level", -174401540);
        setIntField(term51563, term51563.getClass(), "customId", -1881073314);
        setIntField(term51563, term51563.getClass(), "playedCustom1", -1902513009);
        setIntField(term51563, term51563.getClass(), "playedCustom2", 1810303681);
        setIntField(term51563, term51563.getClass(), "playedCustom3", 1374798468);
        setIntField(term51563, term51563.getClass(), "track", -425364766);
        setIntField(term51563, term51563.getClass(), "score", -240455247);
        setIntField(term51563, term51563.getClass(), "rank", 412243891);
        setIntField(term51563, term51563.getClass(), "maxCombo", -1517264869);
        setIntField(term51563, term51563.getClass(), "maxChain", 1498231709);
        setIntField(term51563, term51563.getClass(), "rateTap", -775074162);
        setIntField(term51563, term51563.getClass(), "rateHold", 304255923);
        setIntField(term51563, term51563.getClass(), "rateSlide", 1532668668);
        setIntField(term51563, term51563.getClass(), "rateAir", -100547107);
        setIntField(term51563, term51563.getClass(), "rateFlick", 2140567451);
        setIntField(term51563, term51563.getClass(), "judgeGuilty", -390400057);
        setIntField(term51563, term51563.getClass(), "judgeAttack", -157273113);
        setIntField(term51563, term51563.getClass(), "judgeJustice", 1497057438);
        setIntField(term51563, term51563.getClass(), "judgeCritical", 1526060255);
        setIntField(term51563, term51563.getClass(), "playerRating", -833785119);
        setBooleanField(term51563, term51563.getClass(), "isNewRecord", true);
        setBooleanField(term51563, term51563.getClass(), "isFullCombo", true);
        setIntField(term51563, term51563.getClass(), "fullChainKind", -1920705464);
        setBooleanField(term51563, term51563.getClass(), "isAllJustice", false);
        setIntField(term51563, term51563.getClass(), "characterId", 428714196);
        setIntField(term51563, term51563.getClass(), "skillId", 934939315);
        setIntField(term51563, term51563.getClass(), "playKind", -935897776);
        setBooleanField(term51563, term51563.getClass(), "isClear", false);
        setIntField(term51563, term51563.getClass(), "skillLevel", 1370328728);
        setIntField(term51563, term51563.getClass(), "skillEffect", 1126005767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomId", argTypes, term51563, args);
    }

};


