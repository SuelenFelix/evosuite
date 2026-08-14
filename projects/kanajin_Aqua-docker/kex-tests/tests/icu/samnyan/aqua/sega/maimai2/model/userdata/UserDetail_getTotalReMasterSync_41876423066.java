package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserDetail_getTotalReMasterSync_41876423066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232902;

    public UserDetail_getTotalReMasterSync_41876423066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term232906 = new Long(1278107327214302894L);
        Integer term232969 = new Integer(1573768776);
        ArrayList term232967 = new ArrayList();
        ((ArrayList) term232967).add(term232969);
        Integer term232975 = new Integer(1525686645);
        Integer term232977 = new Integer(-538376054);
        Integer term232979 = new Integer(-159290084);
        ArrayList term232973 = new ArrayList();
        ((ArrayList) term232973).add(term232975);
        ((ArrayList) term232973).add(term232977);
        ((ArrayList) term232973).add(term232979);
        term232902 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term232904 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term232920 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term232921 = newInstance(Class.forName("java.time.LocalDate"));
        Object term232925 = newInstance(Class.forName("java.time.LocalTime"));
        Object term232930 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term232931 = newInstance(Class.forName("java.time.LocalDate"));
        Object term232935 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term232902, term232902.getClass(), "id", -4657983727699507915L);
        setLongField(term232904, term232904.getClass(), "id", 8371846874123508864L);
        setField(term232904, term232904.getClass(), "extId", term232906);
        setField(term232904, term232904.getClass(), "luid", "ZsLVOMoUYo");
        setIntField(term232921, term232921.getClass(), "year", 2011);
        setShortField(term232921, term232921.getClass(), "month", (short) 12);
        setShortField(term232921, term232921.getClass(), "day", (short) 6);
        setField(term232920, term232920.getClass(), "date", term232921);
        setByteField(term232925, term232925.getClass(), "hour", (byte) 21);
        setByteField(term232925, term232925.getClass(), "minute", (byte) 3);
        setByteField(term232925, term232925.getClass(), "second", (byte) 28);
        setIntField(term232925, term232925.getClass(), "nano", 650612376);
        setField(term232920, term232920.getClass(), "time", term232925);
        setField(term232904, term232904.getClass(), "registerTime", term232920);
        setIntField(term232931, term232931.getClass(), "year", 2025);
        setShortField(term232931, term232931.getClass(), "month", (short) 1);
        setShortField(term232931, term232931.getClass(), "day", (short) 2);
        setField(term232930, term232930.getClass(), "date", term232931);
        setByteField(term232935, term232935.getClass(), "hour", (byte) 12);
        setByteField(term232935, term232935.getClass(), "minute", (byte) 18);
        setByteField(term232935, term232935.getClass(), "second", (byte) 4);
        setIntField(term232935, term232935.getClass(), "nano", 249732001);
        setField(term232930, term232930.getClass(), "time", term232935);
        setField(term232904, term232904.getClass(), "accessTime", term232930);
        setField(term232902, term232902.getClass(), "card", term232904);
        setField(term232902, term232902.getClass(), "userName", "TwUxYxbDNT");
        setIntField(term232902, term232902.getClass(), "isNetMember", 1923456353);
        setIntField(term232902, term232902.getClass(), "iconId", -1649560697);
        setIntField(term232902, term232902.getClass(), "plateId", 580727356);
        setIntField(term232902, term232902.getClass(), "titleId", -1703249761);
        setIntField(term232902, term232902.getClass(), "partnerId", -1444931808);
        setIntField(term232902, term232902.getClass(), "frameId", -12124373);
        setIntField(term232902, term232902.getClass(), "selectMapId", -458525211);
        setIntField(term232902, term232902.getClass(), "totalAwake", 79574412);
        setIntField(term232902, term232902.getClass(), "gradeRating", 1278232442);
        setIntField(term232902, term232902.getClass(), "musicRating", -30189614);
        setIntField(term232902, term232902.getClass(), "playerRating", 621019431);
        setIntField(term232902, term232902.getClass(), "highestRating", 67755379);
        setIntField(term232902, term232902.getClass(), "gradeRank", 546827218);
        setIntField(term232902, term232902.getClass(), "classRank", 443225664);
        setIntField(term232902, term232902.getClass(), "courseRank", 695264841);
        setField(term232902, term232902.getClass(), "charaSlot", term232967);
        setField(term232902, term232902.getClass(), "charaLockSlot", term232973);
        setLongField(term232902, term232902.getClass(), "contentBit", 5139914115068593411L);
        setIntField(term232902, term232902.getClass(), "playCount", -141489831);
        setField(term232902, term232902.getClass(), "eventWatchedDate", "GTMmkmtsqp");
        setField(term232902, term232902.getClass(), "lastGameId", "kbGYeAFzCC");
        setField(term232902, term232902.getClass(), "lastRomVersion", "IXQAKAMGZv");
        setField(term232902, term232902.getClass(), "lastDataVersion", "gNywlVTWoX");
        setField(term232902, term232902.getClass(), "lastLoginDate", "YurkNSyZwK");
        setField(term232902, term232902.getClass(), "lastPlayDate", "nHiRqjNeSG");
        setIntField(term232902, term232902.getClass(), "lastPlayCredit", 1842921890);
        setIntField(term232902, term232902.getClass(), "lastPlayMode", 1488820788);
        setIntField(term232902, term232902.getClass(), "lastPlaceId", -892002512);
        setField(term232902, term232902.getClass(), "lastPlaceName", "iMKGcdwoFr");
        setIntField(term232902, term232902.getClass(), "lastAllNetId", -8983814);
        setIntField(term232902, term232902.getClass(), "lastRegionId", 1376766367);
        setField(term232902, term232902.getClass(), "lastRegionName", "IegHsntisv");
        setField(term232902, term232902.getClass(), "lastClientId", "ayYZrbEzcd");
        setField(term232902, term232902.getClass(), "lastCountryCode", "UUGIomkSIL");
        setIntField(term232902, term232902.getClass(), "lastSelectEMoney", 728709306);
        setIntField(term232902, term232902.getClass(), "lastSelectTicket", -235241687);
        setIntField(term232902, term232902.getClass(), "lastSelectCourse", 6575429);
        setIntField(term232902, term232902.getClass(), "lastCountCourse", 2015303962);
        setField(term232902, term232902.getClass(), "firstGameId", "wNECXXAaeY");
        setField(term232902, term232902.getClass(), "firstRomVersion", "HmwyatxXfH");
        setField(term232902, term232902.getClass(), "firstDataVersion", "kCzNtZKBxJ");
        setField(term232902, term232902.getClass(), "firstPlayDate", "TZvkoSdfcy");
        setField(term232902, term232902.getClass(), "compatibleCmVersion", "AQLfRkbDCq");
        setField(term232902, term232902.getClass(), "dailyBonusDate", "psEjMhzuKg");
        setField(term232902, term232902.getClass(), "dailyCourseBonusDate", "gPwMKIBKVa");
        setField(term232902, term232902.getClass(), "lastPairLoginDate", "KPgCBUCwkT");
        setField(term232902, term232902.getClass(), "lastTrialPlayDate", "oIuYGsJcJK");
        setIntField(term232902, term232902.getClass(), "playVsCount", -2104017987);
        setIntField(term232902, term232902.getClass(), "playSyncCount", -140083994);
        setIntField(term232902, term232902.getClass(), "winCount", -309241845);
        setIntField(term232902, term232902.getClass(), "helpCount", -510075480);
        setIntField(term232902, term232902.getClass(), "comboCount", 2108016352);
        setLongField(term232902, term232902.getClass(), "totalDeluxscore", -8828375492863660333L);
        setLongField(term232902, term232902.getClass(), "totalBasicDeluxscore", 3829060389754535308L);
        setLongField(term232902, term232902.getClass(), "totalAdvancedDeluxscore", -4152905340342113900L);
        setLongField(term232902, term232902.getClass(), "totalExpertDeluxscore", -2320858494141057588L);
        setLongField(term232902, term232902.getClass(), "totalMasterDeluxscore", 3671531966262068453L);
        setLongField(term232902, term232902.getClass(), "totalReMasterDeluxscore", 8091751543255986624L);
        setIntField(term232902, term232902.getClass(), "totalSync", 1369643206);
        setIntField(term232902, term232902.getClass(), "totalBasicSync", -1289723150);
        setIntField(term232902, term232902.getClass(), "totalAdvancedSync", 1642362629);
        setIntField(term232902, term232902.getClass(), "totalExpertSync", -979192435);
        setIntField(term232902, term232902.getClass(), "totalMasterSync", -1921424551);
        setIntField(term232902, term232902.getClass(), "totalReMasterSync", 101983151);
        setLongField(term232902, term232902.getClass(), "totalAchievement", -3105437328811671426L);
        setLongField(term232902, term232902.getClass(), "totalBasicAchievement", 4652127938324994599L);
        setLongField(term232902, term232902.getClass(), "totalAdvancedAchievement", 8066087404848503575L);
        setLongField(term232902, term232902.getClass(), "totalExpertAchievement", -6205406662057862003L);
        setLongField(term232902, term232902.getClass(), "totalMasterAchievement", 2812994364572081165L);
        setLongField(term232902, term232902.getClass(), "totalReMasterAchievement", -381737772463044732L);
        setLongField(term232902, term232902.getClass(), "playerOldRating", 1022195053841077055L);
        setLongField(term232902, term232902.getClass(), "playerNewRating", -5735359083132852428L);
        setIntField(term232902, term232902.getClass(), "banState", -8336587);
        setLongField(term232902, term232902.getClass(), "dateTime", 7626275182194750265L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalReMasterSync", argTypes, term232902, args);
    }

};


