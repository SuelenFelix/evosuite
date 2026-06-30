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

public class RecentResp_getLevel_12028203283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51511;

    public RecentResp_getLevel_12028203283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51511 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp"));
        Object term51512 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51513 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51517 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51522 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51523 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51527 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term51513, term51513.getClass(), "year", 2027);
        setShortField(term51513, term51513.getClass(), "month", (short) 11);
        setShortField(term51513, term51513.getClass(), "day", (short) 17);
        setField(term51512, term51512.getClass(), "date", term51513);
        setByteField(term51517, term51517.getClass(), "hour", (byte) 8);
        setByteField(term51517, term51517.getClass(), "minute", (byte) 27);
        setByteField(term51517, term51517.getClass(), "second", (byte) 41);
        setIntField(term51517, term51517.getClass(), "nano", 737345800);
        setField(term51512, term51512.getClass(), "time", term51517);
        setField(term51511, term51511.getClass(), "playDate", term51512);
        setIntField(term51523, term51523.getClass(), "year", 2028);
        setShortField(term51523, term51523.getClass(), "month", (short) 9);
        setShortField(term51523, term51523.getClass(), "day", (short) 4);
        setField(term51522, term51522.getClass(), "date", term51523);
        setByteField(term51527, term51527.getClass(), "hour", (byte) 2);
        setByteField(term51527, term51527.getClass(), "minute", (byte) 4);
        setByteField(term51527, term51527.getClass(), "second", (byte) 33);
        setIntField(term51527, term51527.getClass(), "nano", 927519741);
        setField(term51522, term51522.getClass(), "time", term51527);
        setField(term51511, term51511.getClass(), "userPlayDate", term51522);
        setIntField(term51511, term51511.getClass(), "musicId", 1968674006);
        setIntField(term51511, term51511.getClass(), "level", -634536248);
        setIntField(term51511, term51511.getClass(), "customId", 1090329667);
        setIntField(term51511, term51511.getClass(), "playedCustom1", -1082123686);
        setIntField(term51511, term51511.getClass(), "playedCustom2", -991011239);
        setIntField(term51511, term51511.getClass(), "playedCustom3", -1774267288);
        setIntField(term51511, term51511.getClass(), "track", -1394083316);
        setIntField(term51511, term51511.getClass(), "score", 23814407);
        setIntField(term51511, term51511.getClass(), "rank", 1941438128);
        setIntField(term51511, term51511.getClass(), "maxCombo", -418002301);
        setIntField(term51511, term51511.getClass(), "maxChain", 2067599442);
        setIntField(term51511, term51511.getClass(), "rateTap", -335577660);
        setIntField(term51511, term51511.getClass(), "rateHold", 1488144730);
        setIntField(term51511, term51511.getClass(), "rateSlide", -1075257608);
        setIntField(term51511, term51511.getClass(), "rateAir", -693529847);
        setIntField(term51511, term51511.getClass(), "rateFlick", -325187625);
        setIntField(term51511, term51511.getClass(), "judgeGuilty", -317484961);
        setIntField(term51511, term51511.getClass(), "judgeAttack", 418080259);
        setIntField(term51511, term51511.getClass(), "judgeJustice", 657195865);
        setIntField(term51511, term51511.getClass(), "judgeCritical", 1397647176);
        setIntField(term51511, term51511.getClass(), "playerRating", -1375675721);
        setBooleanField(term51511, term51511.getClass(), "isNewRecord", false);
        setBooleanField(term51511, term51511.getClass(), "isFullCombo", false);
        setIntField(term51511, term51511.getClass(), "fullChainKind", 456313553);
        setBooleanField(term51511, term51511.getClass(), "isAllJustice", true);
        setIntField(term51511, term51511.getClass(), "characterId", 1636460194);
        setIntField(term51511, term51511.getClass(), "skillId", -1926178417);
        setIntField(term51511, term51511.getClass(), "playKind", -1011180309);
        setBooleanField(term51511, term51511.getClass(), "isClear", true);
        setIntField(term51511, term51511.getClass(), "skillLevel", -342719145);
        setIntField(term51511, term51511.getClass(), "skillEffect", 2101766592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel", argTypes, term51511, args);
    }

};


