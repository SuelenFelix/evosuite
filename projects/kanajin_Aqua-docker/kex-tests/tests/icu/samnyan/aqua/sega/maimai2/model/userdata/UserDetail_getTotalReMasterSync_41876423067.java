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

public class UserDetail_getTotalReMasterSync_41876423067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232957;

    public UserDetail_getTotalReMasterSync_41876423067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term232961 = new Long(1278107327214302894L);
        Integer term233024 = new Integer(1573768776);
        ArrayList term233022 = new ArrayList();
        ((ArrayList) term233022).add(term233024);
        Integer term233030 = new Integer(1525686645);
        Integer term233032 = new Integer(-538376054);
        Integer term233034 = new Integer(-159290084);
        ArrayList term233028 = new ArrayList();
        ((ArrayList) term233028).add(term233030);
        ((ArrayList) term233028).add(term233032);
        ((ArrayList) term233028).add(term233034);
        term232957 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term232959 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term232975 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term232976 = newInstance(Class.forName("java.time.LocalDate"));
        Object term232980 = newInstance(Class.forName("java.time.LocalTime"));
        Object term232985 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term232986 = newInstance(Class.forName("java.time.LocalDate"));
        Object term232990 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term232957, term232957.getClass(), "id", -4657983727699507915L);
        setLongField(term232959, term232959.getClass(), "id", 8371846874123508864L);
        setField(term232959, term232959.getClass(), "extId", term232961);
        setField(term232959, term232959.getClass(), "luid", "ZsLVOMoUYo");
        setIntField(term232976, term232976.getClass(), "year", 2011);
        setShortField(term232976, term232976.getClass(), "month", (short) 12);
        setShortField(term232976, term232976.getClass(), "day", (short) 6);
        setField(term232975, term232975.getClass(), "date", term232976);
        setByteField(term232980, term232980.getClass(), "hour", (byte) 21);
        setByteField(term232980, term232980.getClass(), "minute", (byte) 3);
        setByteField(term232980, term232980.getClass(), "second", (byte) 28);
        setIntField(term232980, term232980.getClass(), "nano", 650612376);
        setField(term232975, term232975.getClass(), "time", term232980);
        setField(term232959, term232959.getClass(), "registerTime", term232975);
        setIntField(term232986, term232986.getClass(), "year", 2025);
        setShortField(term232986, term232986.getClass(), "month", (short) 1);
        setShortField(term232986, term232986.getClass(), "day", (short) 2);
        setField(term232985, term232985.getClass(), "date", term232986);
        setByteField(term232990, term232990.getClass(), "hour", (byte) 12);
        setByteField(term232990, term232990.getClass(), "minute", (byte) 18);
        setByteField(term232990, term232990.getClass(), "second", (byte) 4);
        setIntField(term232990, term232990.getClass(), "nano", 249732001);
        setField(term232985, term232985.getClass(), "time", term232990);
        setField(term232959, term232959.getClass(), "accessTime", term232985);
        setField(term232957, term232957.getClass(), "card", term232959);
        setField(term232957, term232957.getClass(), "userName", "TwUxYxbDNT");
        setIntField(term232957, term232957.getClass(), "isNetMember", 1923456353);
        setIntField(term232957, term232957.getClass(), "iconId", -1649560697);
        setIntField(term232957, term232957.getClass(), "plateId", 580727356);
        setIntField(term232957, term232957.getClass(), "titleId", -1703249761);
        setIntField(term232957, term232957.getClass(), "partnerId", -1444931808);
        setIntField(term232957, term232957.getClass(), "frameId", -12124373);
        setIntField(term232957, term232957.getClass(), "selectMapId", -458525211);
        setIntField(term232957, term232957.getClass(), "totalAwake", 79574412);
        setIntField(term232957, term232957.getClass(), "gradeRating", 1278232442);
        setIntField(term232957, term232957.getClass(), "musicRating", -30189614);
        setIntField(term232957, term232957.getClass(), "playerRating", 621019431);
        setIntField(term232957, term232957.getClass(), "highestRating", 67755379);
        setIntField(term232957, term232957.getClass(), "gradeRank", 546827218);
        setIntField(term232957, term232957.getClass(), "classRank", 443225664);
        setIntField(term232957, term232957.getClass(), "courseRank", 695264841);
        setField(term232957, term232957.getClass(), "charaSlot", term233022);
        setField(term232957, term232957.getClass(), "charaLockSlot", term233028);
        setLongField(term232957, term232957.getClass(), "contentBit", 5139914115068593411L);
        setIntField(term232957, term232957.getClass(), "playCount", -141489831);
        setField(term232957, term232957.getClass(), "eventWatchedDate", "GTMmkmtsqp");
        setField(term232957, term232957.getClass(), "lastGameId", "kbGYeAFzCC");
        setField(term232957, term232957.getClass(), "lastRomVersion", "IXQAKAMGZv");
        setField(term232957, term232957.getClass(), "lastDataVersion", "gNywlVTWoX");
        setField(term232957, term232957.getClass(), "lastLoginDate", "YurkNSyZwK");
        setField(term232957, term232957.getClass(), "lastPlayDate", "nHiRqjNeSG");
        setIntField(term232957, term232957.getClass(), "lastPlayCredit", 1842921890);
        setIntField(term232957, term232957.getClass(), "lastPlayMode", 1488820788);
        setIntField(term232957, term232957.getClass(), "lastPlaceId", -892002512);
        setField(term232957, term232957.getClass(), "lastPlaceName", "iMKGcdwoFr");
        setIntField(term232957, term232957.getClass(), "lastAllNetId", -8983814);
        setIntField(term232957, term232957.getClass(), "lastRegionId", 1376766367);
        setField(term232957, term232957.getClass(), "lastRegionName", "IegHsntisv");
        setField(term232957, term232957.getClass(), "lastClientId", "ayYZrbEzcd");
        setField(term232957, term232957.getClass(), "lastCountryCode", "UUGIomkSIL");
        setIntField(term232957, term232957.getClass(), "lastSelectEMoney", 728709306);
        setIntField(term232957, term232957.getClass(), "lastSelectTicket", -235241687);
        setIntField(term232957, term232957.getClass(), "lastSelectCourse", 6575429);
        setIntField(term232957, term232957.getClass(), "lastCountCourse", 2015303962);
        setField(term232957, term232957.getClass(), "firstGameId", "wNECXXAaeY");
        setField(term232957, term232957.getClass(), "firstRomVersion", "HmwyatxXfH");
        setField(term232957, term232957.getClass(), "firstDataVersion", "kCzNtZKBxJ");
        setField(term232957, term232957.getClass(), "firstPlayDate", "TZvkoSdfcy");
        setField(term232957, term232957.getClass(), "compatibleCmVersion", "AQLfRkbDCq");
        setField(term232957, term232957.getClass(), "dailyBonusDate", "psEjMhzuKg");
        setField(term232957, term232957.getClass(), "dailyCourseBonusDate", "gPwMKIBKVa");
        setField(term232957, term232957.getClass(), "lastPairLoginDate", "KPgCBUCwkT");
        setField(term232957, term232957.getClass(), "lastTrialPlayDate", "oIuYGsJcJK");
        setIntField(term232957, term232957.getClass(), "playVsCount", -2104017987);
        setIntField(term232957, term232957.getClass(), "playSyncCount", -140083994);
        setIntField(term232957, term232957.getClass(), "winCount", -309241845);
        setIntField(term232957, term232957.getClass(), "helpCount", -510075480);
        setIntField(term232957, term232957.getClass(), "comboCount", 2108016352);
        setLongField(term232957, term232957.getClass(), "totalDeluxscore", -8828375492863660333L);
        setLongField(term232957, term232957.getClass(), "totalBasicDeluxscore", 3829060389754535308L);
        setLongField(term232957, term232957.getClass(), "totalAdvancedDeluxscore", -4152905340342113900L);
        setLongField(term232957, term232957.getClass(), "totalExpertDeluxscore", -2320858494141057588L);
        setLongField(term232957, term232957.getClass(), "totalMasterDeluxscore", 3671531966262068453L);
        setLongField(term232957, term232957.getClass(), "totalReMasterDeluxscore", 8091751543255986624L);
        setIntField(term232957, term232957.getClass(), "totalSync", 1369643206);
        setIntField(term232957, term232957.getClass(), "totalBasicSync", -1289723150);
        setIntField(term232957, term232957.getClass(), "totalAdvancedSync", 1642362629);
        setIntField(term232957, term232957.getClass(), "totalExpertSync", -979192435);
        setIntField(term232957, term232957.getClass(), "totalMasterSync", -1921424551);
        setIntField(term232957, term232957.getClass(), "totalReMasterSync", 101983151);
        setLongField(term232957, term232957.getClass(), "totalAchievement", -3105437328811671426L);
        setLongField(term232957, term232957.getClass(), "totalBasicAchievement", 4652127938324994599L);
        setLongField(term232957, term232957.getClass(), "totalAdvancedAchievement", 8066087404848503575L);
        setLongField(term232957, term232957.getClass(), "totalExpertAchievement", -6205406662057862003L);
        setLongField(term232957, term232957.getClass(), "totalMasterAchievement", 2812994364572081165L);
        setLongField(term232957, term232957.getClass(), "totalReMasterAchievement", -381737772463044732L);
        setLongField(term232957, term232957.getClass(), "playerOldRating", 1022195053841077055L);
        setLongField(term232957, term232957.getClass(), "playerNewRating", -5735359083132852428L);
        setIntField(term232957, term232957.getClass(), "banState", -8336587);
        setLongField(term232957, term232957.getClass(), "dateTime", 7626275182194750265L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalReMasterSync", argTypes, term232957, args);
    }

};


