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

public class RecentResp_getPlayedCustom1_1121392955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51615;

    public RecentResp_getPlayedCustom1_1121392955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51615 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term51616 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51617 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51621 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51626 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51627 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51631 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term51617, term51617.getClass(), "year", 2028);
        setShortField(term51617, term51617.getClass(), "month", (short) 4);
        setShortField(term51617, term51617.getClass(), "day", (short) 9);
        setField(term51616, term51616.getClass(), "date", term51617);
        setByteField(term51621, term51621.getClass(), "hour", (byte) 16);
        setByteField(term51621, term51621.getClass(), "minute", (byte) 26);
        setByteField(term51621, term51621.getClass(), "second", (byte) 35);
        setIntField(term51621, term51621.getClass(), "nano", 546233932);
        setField(term51616, term51616.getClass(), "time", term51621);
        setField(term51615, term51615.getClass(), "playDate", term51616);
        setIntField(term51627, term51627.getClass(), "year", 2022);
        setShortField(term51627, term51627.getClass(), "month", (short) 3);
        setShortField(term51627, term51627.getClass(), "day", (short) 19);
        setField(term51626, term51626.getClass(), "date", term51627);
        setByteField(term51631, term51631.getClass(), "hour", (byte) 6);
        setByteField(term51631, term51631.getClass(), "minute", (byte) 55);
        setByteField(term51631, term51631.getClass(), "second", (byte) 49);
        setIntField(term51631, term51631.getClass(), "nano", 478088059);
        setField(term51626, term51626.getClass(), "time", term51631);
        setField(term51615, term51615.getClass(), "userPlayDate", term51626);
        setIntField(term51615, term51615.getClass(), "musicId", -1155333431);
        setIntField(term51615, term51615.getClass(), "level", -2110210183);
        setIntField(term51615, term51615.getClass(), "customId", -687531774);
        setIntField(term51615, term51615.getClass(), "playedCustom1", -1997574107);
        setIntField(term51615, term51615.getClass(), "playedCustom2", 748487022);
        setIntField(term51615, term51615.getClass(), "playedCustom3", -706230330);
        setIntField(term51615, term51615.getClass(), "track", -926446006);
        setIntField(term51615, term51615.getClass(), "score", 572417171);
        setIntField(term51615, term51615.getClass(), "rank", 46222099);
        setIntField(term51615, term51615.getClass(), "maxCombo", 1985711069);
        setIntField(term51615, term51615.getClass(), "maxChain", -1497378582);
        setIntField(term51615, term51615.getClass(), "rateTap", -449740668);
        setIntField(term51615, term51615.getClass(), "rateHold", 1283268105);
        setIntField(term51615, term51615.getClass(), "rateSlide", -220552939);
        setIntField(term51615, term51615.getClass(), "rateAir", -444257155);
        setIntField(term51615, term51615.getClass(), "rateFlick", -309536114);
        setIntField(term51615, term51615.getClass(), "judgeGuilty", 755500171);
        setIntField(term51615, term51615.getClass(), "judgeAttack", -535062491);
        setIntField(term51615, term51615.getClass(), "judgeJustice", -147381920);
        setIntField(term51615, term51615.getClass(), "judgeCritical", -7568006);
        setIntField(term51615, term51615.getClass(), "playerRating", 1952367361);
        setBooleanField(term51615, term51615.getClass(), "isNewRecord", true);
        setBooleanField(term51615, term51615.getClass(), "isFullCombo", false);
        setIntField(term51615, term51615.getClass(), "fullChainKind", -715290594);
        setBooleanField(term51615, term51615.getClass(), "isAllJustice", true);
        setIntField(term51615, term51615.getClass(), "characterId", -860371306);
        setIntField(term51615, term51615.getClass(), "skillId", -125626789);
        setIntField(term51615, term51615.getClass(), "playKind", -309827965);
        setBooleanField(term51615, term51615.getClass(), "isClear", true);
        setIntField(term51615, term51615.getClass(), "skillLevel", -1534471014);
        setIntField(term51615, term51615.getClass(), "skillEffect", -468720148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedCustom1", argTypes, term51615, args);
    }

};


