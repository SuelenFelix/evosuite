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

public class RecentResp_isNewRecord_73957822623 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47381;

    public RecentResp_isNewRecord_73957822623() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47381 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp"));
        Object term47382 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47383 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47387 = newInstance(Class.forName("java.time.LocalTime"));
        Object term47392 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term47393 = newInstance(Class.forName("java.time.LocalDate"));
        Object term47397 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term47383, term47383.getClass(), "year", 2018);
        setShortField(term47383, term47383.getClass(), "month", (short) 4);
        setShortField(term47383, term47383.getClass(), "day", (short) 7);
        setField(term47382, term47382.getClass(), "date", term47383);
        setByteField(term47387, term47387.getClass(), "hour", (byte) 22);
        setByteField(term47387, term47387.getClass(), "minute", (byte) 6);
        setByteField(term47387, term47387.getClass(), "second", (byte) 38);
        setIntField(term47387, term47387.getClass(), "nano", 958732191);
        setField(term47382, term47382.getClass(), "time", term47387);
        setField(term47381, term47381.getClass(), "playDate", term47382);
        setIntField(term47393, term47393.getClass(), "year", 2017);
        setShortField(term47393, term47393.getClass(), "month", (short) 7);
        setShortField(term47393, term47393.getClass(), "day", (short) 25);
        setField(term47392, term47392.getClass(), "date", term47393);
        setByteField(term47397, term47397.getClass(), "hour", (byte) 20);
        setByteField(term47397, term47397.getClass(), "minute", (byte) 19);
        setByteField(term47397, term47397.getClass(), "second", (byte) 55);
        setIntField(term47397, term47397.getClass(), "nano", 617531786);
        setField(term47392, term47392.getClass(), "time", term47397);
        setField(term47381, term47381.getClass(), "userPlayDate", term47392);
        setIntField(term47381, term47381.getClass(), "musicId", -1881843694);
        setIntField(term47381, term47381.getClass(), "level", -1134250665);
        setIntField(term47381, term47381.getClass(), "customId", -1607263638);
        setIntField(term47381, term47381.getClass(), "playedCustom1", 691469974);
        setIntField(term47381, term47381.getClass(), "playedCustom2", -2080503799);
        setIntField(term47381, term47381.getClass(), "playedCustom3", 13757525);
        setIntField(term47381, term47381.getClass(), "track", 77853966);
        setIntField(term47381, term47381.getClass(), "score", 1451393741);
        setIntField(term47381, term47381.getClass(), "rank", -1115815564);
        setIntField(term47381, term47381.getClass(), "maxCombo", 425132480);
        setIntField(term47381, term47381.getClass(), "maxChain", 1968674006);
        setIntField(term47381, term47381.getClass(), "rateTap", -634536248);
        setIntField(term47381, term47381.getClass(), "rateHold", 1090329667);
        setIntField(term47381, term47381.getClass(), "rateSlide", -1082123686);
        setIntField(term47381, term47381.getClass(), "rateAir", -991011239);
        setIntField(term47381, term47381.getClass(), "rateFlick", -1774267288);
        setIntField(term47381, term47381.getClass(), "judgeGuilty", -1394083316);
        setIntField(term47381, term47381.getClass(), "judgeAttack", 23814407);
        setIntField(term47381, term47381.getClass(), "judgeJustice", 1941438128);
        setIntField(term47381, term47381.getClass(), "judgeCritical", -418002301);
        setIntField(term47381, term47381.getClass(), "playerRating", 2067599442);
        setBooleanField(term47381, term47381.getClass(), "isNewRecord", true);
        setBooleanField(term47381, term47381.getClass(), "isFullCombo", true);
        setIntField(term47381, term47381.getClass(), "fullChainKind", -335577660);
        setBooleanField(term47381, term47381.getClass(), "isAllJustice", true);
        setIntField(term47381, term47381.getClass(), "characterId", 1488144730);
        setIntField(term47381, term47381.getClass(), "skillId", -1075257608);
        setIntField(term47381, term47381.getClass(), "playKind", -693529847);
        setBooleanField(term47381, term47381.getClass(), "isClear", true);
        setIntField(term47381, term47381.getClass(), "skillLevel", -325187625);
        setIntField(term47381, term47381.getClass(), "skillEffect", -317484961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.RecentResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNewRecord", argTypes, term47381, args);
    }

};


