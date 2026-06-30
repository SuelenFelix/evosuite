package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserGameOption_getJudgeJustice_35659478013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54571;

    public UserGameOption_getJudgeJustice_35659478013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term54577 = new Long(-2177368829816872572L);
        term54571 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term54573 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term54575 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term54591 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54592 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54596 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54601 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54602 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54606 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54623 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54624 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54628 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54684 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54685 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54689 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54732 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54733 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54737 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54778 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54779 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54783 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term54571, term54571.getClass(), "id", 4600612212546071466L);
        setLongField(term54573, term54573.getClass(), "id", 736282298030442495L);
        setLongField(term54575, term54575.getClass(), "id", -8385042448755891761L);
        setField(term54575, term54575.getClass(), "extId", term54577);
        setField(term54575, term54575.getClass(), "luid", "lsQrIFMkgZ");
        setIntField(term54592, term54592.getClass(), "year", 2013);
        setShortField(term54592, term54592.getClass(), "month", (short) 5);
        setShortField(term54592, term54592.getClass(), "day", (short) 5);
        setField(term54591, term54591.getClass(), "date", term54592);
        setByteField(term54596, term54596.getClass(), "hour", (byte) 7);
        setByteField(term54596, term54596.getClass(), "minute", (byte) 44);
        setByteField(term54596, term54596.getClass(), "second", (byte) 24);
        setIntField(term54596, term54596.getClass(), "nano", 458681760);
        setField(term54591, term54591.getClass(), "time", term54596);
        setField(term54575, term54575.getClass(), "registerTime", term54591);
        setIntField(term54602, term54602.getClass(), "year", 2019);
        setShortField(term54602, term54602.getClass(), "month", (short) 1);
        setShortField(term54602, term54602.getClass(), "day", (short) 12);
        setField(term54601, term54601.getClass(), "date", term54602);
        setByteField(term54606, term54606.getClass(), "hour", (byte) 5);
        setByteField(term54606, term54606.getClass(), "minute", (byte) 47);
        setByteField(term54606, term54606.getClass(), "second", (byte) 36);
        setIntField(term54606, term54606.getClass(), "nano", 50353124);
        setField(term54601, term54601.getClass(), "time", term54606);
        setField(term54575, term54575.getClass(), "accessTime", term54601);
        setField(term54573, term54573.getClass(), "card", term54575);
        setField(term54573, term54573.getClass(), "userName", "VgAyBhgBhq");
        setIntField(term54624, term54624.getClass(), "year", 2014);
        setShortField(term54624, term54624.getClass(), "month", (short) 1);
        setShortField(term54624, term54624.getClass(), "day", (short) 23);
        setField(term54623, term54623.getClass(), "date", term54624);
        setByteField(term54628, term54628.getClass(), "hour", (byte) 19);
        setByteField(term54628, term54628.getClass(), "minute", (byte) 10);
        setByteField(term54628, term54628.getClass(), "second", (byte) 5);
        setIntField(term54628, term54628.getClass(), "nano", 522099168);
        setField(term54623, term54623.getClass(), "time", term54628);
        setField(term54573, term54573.getClass(), "lastLoginDate", term54623);
        setBooleanField(term54573, term54573.getClass(), "isWebJoin", true);
        setField(term54573, term54573.getClass(), "webLimitDate", "nhpssUKjpK");
        setIntField(term54573, term54573.getClass(), "level", 825756233);
        setIntField(term54573, term54573.getClass(), "reincarnationNum", -494349155);
        setField(term54573, term54573.getClass(), "exp", "lnJVsFNsCN");
        setLongField(term54573, term54573.getClass(), "point", 3776640840397782177L);
        setLongField(term54573, term54573.getClass(), "totalPoint", -4458985981191164653L);
        setIntField(term54573, term54573.getClass(), "playCount", -621743880);
        setIntField(term54573, term54573.getClass(), "multiPlayCount", 1487958580);
        setIntField(term54573, term54573.getClass(), "multiWinCount", -41377169);
        setIntField(term54573, term54573.getClass(), "requestResCount", -1713407140);
        setIntField(term54573, term54573.getClass(), "acceptResCount", 184591989);
        setIntField(term54573, term54573.getClass(), "successResCount", 528505320);
        setIntField(term54573, term54573.getClass(), "playerRating", 1255256909);
        setIntField(term54573, term54573.getClass(), "highestRating", 1364268540);
        setIntField(term54573, term54573.getClass(), "nameplateId", 1613417207);
        setIntField(term54573, term54573.getClass(), "frameId", -267884738);
        setIntField(term54573, term54573.getClass(), "characterId", 1701113802);
        setIntField(term54573, term54573.getClass(), "trophyId", 2142343992);
        setIntField(term54573, term54573.getClass(), "playedTutorialBit", -875414289);
        setIntField(term54573, term54573.getClass(), "firstTutorialCancelNum", 510025419);
        setIntField(term54573, term54573.getClass(), "masterTutorialCancelNum", 768579195);
        setIntField(term54573, term54573.getClass(), "totalRepertoireCount", 935186156);
        setIntField(term54573, term54573.getClass(), "totalMapNum", -101515724);
        setLongField(term54573, term54573.getClass(), "totalHiScore", 3774876119567638995L);
        setLongField(term54573, term54573.getClass(), "totalBasicHighScore", -5849140391879955934L);
        setLongField(term54573, term54573.getClass(), "totalAdvancedHighScore", 5257982794400938524L);
        setLongField(term54573, term54573.getClass(), "totalExpertHighScore", -5630319423499317967L);
        setLongField(term54573, term54573.getClass(), "totalMasterHighScore", 7053349473507426657L);
        setIntField(term54685, term54685.getClass(), "year", 2024);
        setShortField(term54685, term54685.getClass(), "month", (short) 11);
        setShortField(term54685, term54685.getClass(), "day", (short) 12);
        setField(term54684, term54684.getClass(), "date", term54685);
        setByteField(term54689, term54689.getClass(), "hour", (byte) 7);
        setByteField(term54689, term54689.getClass(), "minute", (byte) 0);
        setByteField(term54689, term54689.getClass(), "second", (byte) 20);
        setIntField(term54689, term54689.getClass(), "nano", 646827761);
        setField(term54684, term54684.getClass(), "time", term54689);
        setField(term54573, term54573.getClass(), "eventWatchedDate", term54684);
        setIntField(term54573, term54573.getClass(), "friendCount", 987526407);
        setBooleanField(term54573, term54573.getClass(), "isMaimai", true);
        setField(term54573, term54573.getClass(), "firstGameId", "CUagRkEuzN");
        setField(term54573, term54573.getClass(), "firstRomVersion", "eWIWfWobXm");
        setField(term54573, term54573.getClass(), "firstDataVersion", "lkPJVVXhDd");
        setIntField(term54733, term54733.getClass(), "year", 2022);
        setShortField(term54733, term54733.getClass(), "month", (short) 9);
        setShortField(term54733, term54733.getClass(), "day", (short) 13);
        setField(term54732, term54732.getClass(), "date", term54733);
        setByteField(term54737, term54737.getClass(), "hour", (byte) 3);
        setByteField(term54737, term54737.getClass(), "minute", (byte) 50);
        setByteField(term54737, term54737.getClass(), "second", (byte) 35);
        setIntField(term54737, term54737.getClass(), "nano", 260929854);
        setField(term54732, term54732.getClass(), "time", term54737);
        setField(term54573, term54573.getClass(), "firstPlayDate", term54732);
        setField(term54573, term54573.getClass(), "lastGameId", "OpMnUyJTrb");
        setField(term54573, term54573.getClass(), "lastRomVersion", "ACBGZgugev");
        setField(term54573, term54573.getClass(), "lastDataVersion", "rcbQDpUkab");
        setIntField(term54779, term54779.getClass(), "year", 2022);
        setShortField(term54779, term54779.getClass(), "month", (short) 4);
        setShortField(term54779, term54779.getClass(), "day", (short) 7);
        setField(term54778, term54778.getClass(), "date", term54779);
        setByteField(term54783, term54783.getClass(), "hour", (byte) 8);
        setByteField(term54783, term54783.getClass(), "minute", (byte) 56);
        setByteField(term54783, term54783.getClass(), "second", (byte) 3);
        setIntField(term54783, term54783.getClass(), "nano", 496160001);
        setField(term54778, term54778.getClass(), "time", term54783);
        setField(term54573, term54573.getClass(), "lastPlayDate", term54778);
        setIntField(term54573, term54573.getClass(), "lastPlaceId", -1370999464);
        setField(term54573, term54573.getClass(), "lastPlaceName", "oZAbUeXmhW");
        setField(term54573, term54573.getClass(), "lastRegionId", "NDSDpOeQda");
        setField(term54573, term54573.getClass(), "lastRegionName", "HlKwxzAqTg");
        setField(term54573, term54573.getClass(), "lastAllNetId", "xKjkdjTYfe");
        setField(term54573, term54573.getClass(), "lastClientId", "HcfabJkuEQ");
        setField(term54571, term54571.getClass(), "user", term54573);
        setIntField(term54571, term54571.getClass(), "bgInfo", -409231949);
        setIntField(term54571, term54571.getClass(), "fieldColor", -666074929);
        setIntField(term54571, term54571.getClass(), "guideSound", 1263172764);
        setIntField(term54571, term54571.getClass(), "soundEffect", 294155442);
        setIntField(term54571, term54571.getClass(), "guideLine", -790860079);
        setIntField(term54571, term54571.getClass(), "speed", 52653332);
        setIntField(term54571, term54571.getClass(), "optionSet", 605369567);
        setIntField(term54571, term54571.getClass(), "matching", 662969700);
        setIntField(term54571, term54571.getClass(), "judgePos", -907171757);
        setIntField(term54571, term54571.getClass(), "rating", 1041315057);
        setIntField(term54571, term54571.getClass(), "judgeJustice", 5602462);
        setIntField(term54571, term54571.getClass(), "judgeAttack", 1573768776);
        setIntField(term54571, term54571.getClass(), "headphone", 1525686645);
        setIntField(term54571, term54571.getClass(), "playerLevel", -538376054);
        setIntField(term54571, term54571.getClass(), "successTap", -159290084);
        setIntField(term54571, term54571.getClass(), "successExTap", -1181936403);
        setIntField(term54571, term54571.getClass(), "successSlideHold", 597843779);
        setIntField(term54571, term54571.getClass(), "successAir", -920715260);
        setIntField(term54571, term54571.getClass(), "successFlick", -111304359);
        setIntField(term54571, term54571.getClass(), "successSkill", -1359946362);
        setIntField(term54571, term54571.getClass(), "successTapTimbre", 882866050);
        setIntField(term54571, term54571.getClass(), "privacy", -979923296);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgeJustice", argTypes, term54571, args);
    }

};


