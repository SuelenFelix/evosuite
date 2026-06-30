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

public class RecentResp_getJudgeAttack_212267419619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47173;

    public RecentResp_getJudgeAttack_212267419619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47173 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term47174 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47175 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47179 = newInstance(Class.forName("java.time.LocalTime"));
        Object term47184 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47185 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47189 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term47175, term47175.getClass(), "year", 2012);
        setShortField(term47175, term47175.getClass(), "month", (short) 4);
        setShortField(term47175, term47175.getClass(), "day", (short) 21);
        setField(term47174, term47174.getClass(), "date", term47175);
        setByteField(term47179, term47179.getClass(), "hour", (byte) 8);
        setByteField(term47179, term47179.getClass(), "minute", (byte) 7);
        setByteField(term47179, term47179.getClass(), "second", (byte) 21);
        setIntField(term47179, term47179.getClass(), "nano", 641327534);
        setField(term47174, term47174.getClass(), "time", term47179);
        setField(term47173, term47173.getClass(), "playDate", term47174);
        setIntField(term47185, term47185.getClass(), "year", 2028);
        setShortField(term47185, term47185.getClass(), "month", (short) 6);
        setShortField(term47185, term47185.getClass(), "day", (short) 11);
        setField(term47184, term47184.getClass(), "date", term47185);
        setByteField(term47189, term47189.getClass(), "hour", (byte) 15);
        setByteField(term47189, term47189.getClass(), "minute", (byte) 2);
        setByteField(term47189, term47189.getClass(), "second", (byte) 44);
        setIntField(term47189, term47189.getClass(), "nano", 463103620);
        setField(term47184, term47184.getClass(), "time", term47189);
        setField(term47173, term47173.getClass(), "userPlayDate", term47184);
        setIntField(term47173, term47173.getClass(), "musicId", -887392605);
        setIntField(term47173, term47173.getClass(), "level", 1813573586);
        setIntField(term47173, term47173.getClass(), "customId", -1950105121);
        setIntField(term47173, term47173.getClass(), "playedCustom1", 1664370474);
        setIntField(term47173, term47173.getClass(), "playedCustom2", 56756754);
        setIntField(term47173, term47173.getClass(), "playedCustom3", -1283242129);
        setIntField(term47173, term47173.getClass(), "track", -1400827537);
        setIntField(term47173, term47173.getClass(), "score", 1630959866);
        setIntField(term47173, term47173.getClass(), "rank", 414147550);
        setIntField(term47173, term47173.getClass(), "maxCombo", 1652909222);
        setIntField(term47173, term47173.getClass(), "maxChain", 1130098561);
        setIntField(term47173, term47173.getClass(), "rateTap", 954169543);
        setIntField(term47173, term47173.getClass(), "rateHold", -2124307939);
        setIntField(term47173, term47173.getClass(), "rateSlide", 332880714);
        setIntField(term47173, term47173.getClass(), "rateAir", 904733719);
        setIntField(term47173, term47173.getClass(), "rateFlick", -240576356);
        setIntField(term47173, term47173.getClass(), "judgeGuilty", 148921829);
        setIntField(term47173, term47173.getClass(), "judgeAttack", 2076458515);
        setIntField(term47173, term47173.getClass(), "judgeJustice", 622248745);
        setIntField(term47173, term47173.getClass(), "judgeCritical", -33243170);
        setIntField(term47173, term47173.getClass(), "playerRating", -906823990);
        setBooleanField(term47173, term47173.getClass(), "isNewRecord", true);
        setBooleanField(term47173, term47173.getClass(), "isFullCombo", true);
        setIntField(term47173, term47173.getClass(), "fullChainKind", -1670324779);
        setBooleanField(term47173, term47173.getClass(), "isAllJustice", true);
        setIntField(term47173, term47173.getClass(), "characterId", -1696838199);
        setIntField(term47173, term47173.getClass(), "skillId", -1286086755);
        setIntField(term47173, term47173.getClass(), "playKind", 724669093);
        setBooleanField(term47173, term47173.getClass(), "isClear", true);
        setIntField(term47173, term47173.getClass(), "skillLevel", -2005743628);
        setIntField(term47173, term47173.getClass(), "skillEffect", -1204207224);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgeAttack", argTypes, term47173, args);
    }

};


