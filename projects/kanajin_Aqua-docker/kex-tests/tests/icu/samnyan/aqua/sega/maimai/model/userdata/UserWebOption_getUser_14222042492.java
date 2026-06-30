package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserWebOption_getUser_14222042492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37797;

    public UserWebOption_getUser_14222042492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term37803 = new Long(3620247240684476031L);
        term37797 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption"));
        Object term37799 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term37801 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term37817 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37818 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37822 = newInstance(Class.forName("java.time.LocalTime"));
        Object term37827 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term37828 = newInstance(Class.forName("java.time.LocalDate"));
        Object term37832 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term37797, term37797.getClass(), "id", 7271112616766426991L);
        setLongField(term37799, term37799.getClass(), "id", -8514728180792822493L);
        setLongField(term37801, term37801.getClass(), "id", 5315236285592892506L);
        setField(term37801, term37801.getClass(), "extId", term37803);
        setField(term37801, term37801.getClass(), "luid", "txUWLZRkSv");
        setIntField(term37818, term37818.getClass(), "year", 2025);
        setShortField(term37818, term37818.getClass(), "month", (short) 2);
        setShortField(term37818, term37818.getClass(), "day", (short) 23);
        setField(term37817, term37817.getClass(), "date", term37818);
        setByteField(term37822, term37822.getClass(), "hour", (byte) 16);
        setByteField(term37822, term37822.getClass(), "minute", (byte) 39);
        setByteField(term37822, term37822.getClass(), "second", (byte) 42);
        setIntField(term37822, term37822.getClass(), "nano", 342777686);
        setField(term37817, term37817.getClass(), "time", term37822);
        setField(term37801, term37801.getClass(), "registerTime", term37817);
        setIntField(term37828, term37828.getClass(), "year", 2029);
        setShortField(term37828, term37828.getClass(), "month", (short) 8);
        setShortField(term37828, term37828.getClass(), "day", (short) 14);
        setField(term37827, term37827.getClass(), "date", term37828);
        setByteField(term37832, term37832.getClass(), "hour", (byte) 10);
        setByteField(term37832, term37832.getClass(), "minute", (byte) 28);
        setByteField(term37832, term37832.getClass(), "second", (byte) 23);
        setIntField(term37832, term37832.getClass(), "nano", 676524979);
        setField(term37827, term37827.getClass(), "time", term37832);
        setField(term37801, term37801.getClass(), "accessTime", term37827);
        setField(term37799, term37799.getClass(), "card", term37801);
        setIntField(term37799, term37799.getClass(), "lastDataVersion", 329934484);
        setField(term37799, term37799.getClass(), "userName", "gHRMJRsBGm");
        setIntField(term37799, term37799.getClass(), "point", 575431591);
        setIntField(term37799, term37799.getClass(), "totalPoint", 912666310);
        setIntField(term37799, term37799.getClass(), "iconId", 302408238);
        setIntField(term37799, term37799.getClass(), "nameplateId", -685735773);
        setIntField(term37799, term37799.getClass(), "frameId", -1229964213);
        setIntField(term37799, term37799.getClass(), "trophyId", -206580016);
        setIntField(term37799, term37799.getClass(), "playCount", -982047423);
        setIntField(term37799, term37799.getClass(), "playVsCount", -1580085541);
        setIntField(term37799, term37799.getClass(), "playSyncCount", -1151473049);
        setIntField(term37799, term37799.getClass(), "winCount", 1472205129);
        setIntField(term37799, term37799.getClass(), "helpCount", -289676027);
        setIntField(term37799, term37799.getClass(), "comboCount", 1248845256);
        setIntField(term37799, term37799.getClass(), "feverCount", 229418911);
        setIntField(term37799, term37799.getClass(), "totalHiScore", -1130854864);
        setIntField(term37799, term37799.getClass(), "totalEasyHighScore", 1114579008);
        setIntField(term37799, term37799.getClass(), "totalBasicHighScore", 1460012868);
        setIntField(term37799, term37799.getClass(), "totalAdvancedHighScore", -2073192308);
        setIntField(term37799, term37799.getClass(), "totalExpertHighScore", -2085811126);
        setIntField(term37799, term37799.getClass(), "totalMasterHighScore", -2129502819);
        setIntField(term37799, term37799.getClass(), "totalReMasterHighScore", -1063218440);
        setIntField(term37799, term37799.getClass(), "totalHighSync", -688177933);
        setIntField(term37799, term37799.getClass(), "totalEasySync", -566941881);
        setIntField(term37799, term37799.getClass(), "totalBasicSync", 2051356935);
        setIntField(term37799, term37799.getClass(), "totalAdvancedSync", -383329501);
        setIntField(term37799, term37799.getClass(), "totalExpertSync", 617819961);
        setIntField(term37799, term37799.getClass(), "totalMasterSync", -1030437854);
        setIntField(term37799, term37799.getClass(), "totalReMasterSync", 131035705);
        setIntField(term37799, term37799.getClass(), "playerRating", 1345091994);
        setIntField(term37799, term37799.getClass(), "highestRating", -657987818);
        setIntField(term37799, term37799.getClass(), "rankAuthTailId", -211167283);
        setField(term37799, term37799.getClass(), "eventWatchedDate", "rZyrfnMvHa");
        setField(term37799, term37799.getClass(), "webLimitDate", "GMyMhTZeDC");
        setIntField(term37799, term37799.getClass(), "challengeTrackPhase", -1037774699);
        setIntField(term37799, term37799.getClass(), "firstPlayBits", -851853041);
        setField(term37799, term37799.getClass(), "lastPlayDate", "KqQOTshBOL");
        setIntField(term37799, term37799.getClass(), "lastPlaceId", 1501524873);
        setField(term37799, term37799.getClass(), "lastPlaceName", "cuWgFcYkPC");
        setIntField(term37799, term37799.getClass(), "lastRegionId", 92455948);
        setField(term37799, term37799.getClass(), "lastRegionName", "HfbcOKkXBm");
        setField(term37799, term37799.getClass(), "lastClientId", "pLbTzSMbsN");
        setField(term37799, term37799.getClass(), "lastCountryCode", "lFSbxerCPP");
        setIntField(term37799, term37799.getClass(), "eventPoint", -1557991371);
        setIntField(term37799, term37799.getClass(), "totalLv", -951318891);
        setIntField(term37799, term37799.getClass(), "lastLoginBonusDay", 718233611);
        setIntField(term37799, term37799.getClass(), "lastSurvivalBonusDay", -2015648096);
        setIntField(term37799, term37799.getClass(), "loginBonusLv", -818525120);
        setField(term37797, term37797.getClass(), "user", term37799);
        setBooleanField(term37797, term37797.getClass(), "isNetMember", true);
        setIntField(term37797, term37797.getClass(), "dispRate", 2119335779);
        setIntField(term37797, term37797.getClass(), "dispJudgeStyle", -808109817);
        setIntField(term37797, term37797.getClass(), "dispRank", 33486504);
        setIntField(term37797, term37797.getClass(), "dispHomeRanker", -2112546178);
        setIntField(term37797, term37797.getClass(), "dispTotalLv", 2088023767);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term37797, args);
    }

};


