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

public class UserCourse_getLastPlayDate_86066715110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77398;

    public UserCourse_getLastPlayDate_86066715110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term77404 = new Long(1084801489398441516L);
        Integer term77467 = new Integer(-1261824381);
        Integer term77469 = new Integer(1594426218);
        Integer term77471 = new Integer(-2060535464);
        Integer term77473 = new Integer(-1242946317);
        Integer term77475 = new Integer(-1541566235);
        ArrayList term77465 = new ArrayList();
        ((ArrayList) term77465).add(term77467);
        ((ArrayList) term77465).add(term77469);
        ((ArrayList) term77465).add(term77471);
        ((ArrayList) term77465).add(term77473);
        ((ArrayList) term77465).add(term77475);
        ArrayList term77479 = new ArrayList();
        term77398 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse"));
        Object term77400 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term77402 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term77418 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77419 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77423 = newInstance(Class.forName("java.time.LocalTime"));
        Object term77428 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77429 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77433 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term77398, term77398.getClass(), "id", 514081142743495894L);
        setLongField(term77400, term77400.getClass(), "id", 1933345968294866712L);
        setLongField(term77402, term77402.getClass(), "id", 4286595441513061164L);
        setField(term77402, term77402.getClass(), "extId", term77404);
        setField(term77402, term77402.getClass(), "luid", "JljyXnwkuC");
        setIntField(term77419, term77419.getClass(), "year", 2019);
        setShortField(term77419, term77419.getClass(), "month", (short) 9);
        setShortField(term77419, term77419.getClass(), "day", (short) 3);
        setField(term77418, term77418.getClass(), "date", term77419);
        setByteField(term77423, term77423.getClass(), "hour", (byte) 2);
        setByteField(term77423, term77423.getClass(), "minute", (byte) 32);
        setByteField(term77423, term77423.getClass(), "second", (byte) 30);
        setIntField(term77423, term77423.getClass(), "nano", 339846128);
        setField(term77418, term77418.getClass(), "time", term77423);
        setField(term77402, term77402.getClass(), "registerTime", term77418);
        setIntField(term77429, term77429.getClass(), "year", 2029);
        setShortField(term77429, term77429.getClass(), "month", (short) 11);
        setShortField(term77429, term77429.getClass(), "day", (short) 6);
        setField(term77428, term77428.getClass(), "date", term77429);
        setByteField(term77433, term77433.getClass(), "hour", (byte) 2);
        setByteField(term77433, term77433.getClass(), "minute", (byte) 55);
        setByteField(term77433, term77433.getClass(), "second", (byte) 43);
        setIntField(term77433, term77433.getClass(), "nano", 109400580);
        setField(term77428, term77428.getClass(), "time", term77433);
        setField(term77402, term77402.getClass(), "accessTime", term77428);
        setField(term77400, term77400.getClass(), "card", term77402);
        setField(term77400, term77400.getClass(), "userName", "XLOxkLyvMY");
        setIntField(term77400, term77400.getClass(), "isNetMember", 513276394);
        setIntField(term77400, term77400.getClass(), "iconId", -867492502);
        setIntField(term77400, term77400.getClass(), "plateId", 1315160763);
        setIntField(term77400, term77400.getClass(), "titleId", -806163944);
        setIntField(term77400, term77400.getClass(), "partnerId", -1528700295);
        setIntField(term77400, term77400.getClass(), "frameId", -92750221);
        setIntField(term77400, term77400.getClass(), "selectMapId", 1994324228);
        setIntField(term77400, term77400.getClass(), "totalAwake", 1551084552);
        setIntField(term77400, term77400.getClass(), "gradeRating", 1435658339);
        setIntField(term77400, term77400.getClass(), "musicRating", 1802290366);
        setIntField(term77400, term77400.getClass(), "playerRating", -1308723047);
        setIntField(term77400, term77400.getClass(), "highestRating", -1225238765);
        setIntField(term77400, term77400.getClass(), "gradeRank", -546245327);
        setIntField(term77400, term77400.getClass(), "classRank", 1671823678);
        setIntField(term77400, term77400.getClass(), "courseRank", -1929941351);
        setField(term77400, term77400.getClass(), "charaSlot", term77465);
        setField(term77400, term77400.getClass(), "charaLockSlot", term77479);
        setLongField(term77400, term77400.getClass(), "contentBit", -6076443966344923773L);
        setIntField(term77400, term77400.getClass(), "playCount", -137121647);
        setField(term77400, term77400.getClass(), "eventWatchedDate", "pjUyKHjjKH");
        setField(term77400, term77400.getClass(), "lastGameId", "JApuaiAykc");
        setField(term77400, term77400.getClass(), "lastRomVersion", "NJWFosJfXl");
        setField(term77400, term77400.getClass(), "lastDataVersion", "JraVClZLWB");
        setField(term77400, term77400.getClass(), "lastLoginDate", "PxscjEhxGk");
        setField(term77400, term77400.getClass(), "lastPlayDate", "ePFnljQSHU");
        setIntField(term77400, term77400.getClass(), "lastPlayCredit", 503819416);
        setIntField(term77400, term77400.getClass(), "lastPlayMode", -1959893804);
        setIntField(term77400, term77400.getClass(), "lastPlaceId", -983886756);
        setField(term77400, term77400.getClass(), "lastPlaceName", "wedLWAuOOY");
        setIntField(term77400, term77400.getClass(), "lastAllNetId", 662682481);
        setIntField(term77400, term77400.getClass(), "lastRegionId", 51649517);
        setField(term77400, term77400.getClass(), "lastRegionName", "oZDNpnQlCv");
        setField(term77400, term77400.getClass(), "lastClientId", "NdPeQAHWKN");
        setField(term77400, term77400.getClass(), "lastCountryCode", "giGQTpcQuV");
        setIntField(term77400, term77400.getClass(), "lastSelectEMoney", -416813909);
        setIntField(term77400, term77400.getClass(), "lastSelectTicket", -894882289);
        setIntField(term77400, term77400.getClass(), "lastSelectCourse", 270964023);
        setIntField(term77400, term77400.getClass(), "lastCountCourse", -66130728);
        setField(term77400, term77400.getClass(), "firstGameId", "IWCccrYFQd");
        setField(term77400, term77400.getClass(), "firstRomVersion", "zpkdYKWkCa");
        setField(term77400, term77400.getClass(), "firstDataVersion", "mvOJAtEcWR");
        setField(term77400, term77400.getClass(), "firstPlayDate", "QybezBkmJu");
        setField(term77400, term77400.getClass(), "compatibleCmVersion", "uWIrREgpjs");
        setField(term77400, term77400.getClass(), "dailyBonusDate", "TmEdDFXkTZ");
        setField(term77400, term77400.getClass(), "dailyCourseBonusDate", "DjjdYbIhNY");
        setField(term77400, term77400.getClass(), "lastPairLoginDate", "AGaeaoutjJ");
        setField(term77400, term77400.getClass(), "lastTrialPlayDate", "oHWSUbpGiK");
        setIntField(term77400, term77400.getClass(), "playVsCount", -720277275);
        setIntField(term77400, term77400.getClass(), "playSyncCount", 1131634307);
        setIntField(term77400, term77400.getClass(), "winCount", -898785465);
        setIntField(term77400, term77400.getClass(), "helpCount", 1852804936);
        setIntField(term77400, term77400.getClass(), "comboCount", 53950838);
        setLongField(term77400, term77400.getClass(), "totalDeluxscore", 8397128558586549852L);
        setLongField(term77400, term77400.getClass(), "totalBasicDeluxscore", -8545746620266373186L);
        setLongField(term77400, term77400.getClass(), "totalAdvancedDeluxscore", 2105501884913088990L);
        setLongField(term77400, term77400.getClass(), "totalExpertDeluxscore", -8124278437144435231L);
        setLongField(term77400, term77400.getClass(), "totalMasterDeluxscore", 7732659324628481307L);
        setLongField(term77400, term77400.getClass(), "totalReMasterDeluxscore", -3474044978480774340L);
        setIntField(term77400, term77400.getClass(), "totalSync", -180263871);
        setIntField(term77400, term77400.getClass(), "totalBasicSync", 787708003);
        setIntField(term77400, term77400.getClass(), "totalAdvancedSync", -1238626650);
        setIntField(term77400, term77400.getClass(), "totalExpertSync", 1251835216);
        setIntField(term77400, term77400.getClass(), "totalMasterSync", -1462529055);
        setIntField(term77400, term77400.getClass(), "totalReMasterSync", 1576372849);
        setLongField(term77400, term77400.getClass(), "totalAchievement", 775312077947534347L);
        setLongField(term77400, term77400.getClass(), "totalBasicAchievement", -2297509313118713445L);
        setLongField(term77400, term77400.getClass(), "totalAdvancedAchievement", 3418764832141465118L);
        setLongField(term77400, term77400.getClass(), "totalExpertAchievement", -5892867592432507702L);
        setLongField(term77400, term77400.getClass(), "totalMasterAchievement", -7416289304165255328L);
        setLongField(term77400, term77400.getClass(), "totalReMasterAchievement", 5413420475317965403L);
        setLongField(term77400, term77400.getClass(), "playerOldRating", -3283999366140639273L);
        setLongField(term77400, term77400.getClass(), "playerNewRating", 2068458621990556070L);
        setIntField(term77400, term77400.getClass(), "banState", 1296336460);
        setLongField(term77400, term77400.getClass(), "dateTime", -3300207888965272273L);
        setField(term77398, term77398.getClass(), "user", term77400);
        setIntField(term77398, term77398.getClass(), "courseId", -1024380992);
        setBooleanField(term77398, term77398.getClass(), "isLastClear", false);
        setIntField(term77398, term77398.getClass(), "totalRestlife", 274867099);
        setIntField(term77398, term77398.getClass(), "totalAchievement", -1432735615);
        setIntField(term77398, term77398.getClass(), "totalDeluxscore", 472705336);
        setIntField(term77398, term77398.getClass(), "playCount", 988659735);
        setField(term77398, term77398.getClass(), "clearDate", "RreVzKmtxf");
        setField(term77398, term77398.getClass(), "lastPlayDate", "xHBCsghEAi");
        setIntField(term77398, term77398.getClass(), "bestAchievement", 1481448478);
        setField(term77398, term77398.getClass(), "bestAchievementDate", "BVlqqUSYbB");
        setIntField(term77398, term77398.getClass(), "bestDeluxscore", 598259983);
        setField(term77398, term77398.getClass(), "bestDeluxscoreDate", "hhGHcwcBqB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCourse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayDate", argTypes, term77398, args);
    }

};


