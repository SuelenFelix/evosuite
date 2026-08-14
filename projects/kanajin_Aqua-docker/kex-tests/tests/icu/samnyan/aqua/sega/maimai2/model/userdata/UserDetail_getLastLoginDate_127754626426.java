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

public class UserDetail_getLastLoginDate_127754626426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210300;

    public UserDetail_getLastLoginDate_127754626426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term210304 = new Long(2274723545906746965L);
        Integer term210367 = new Integer(1093956146);
        Integer term210369 = new Integer(1459247713);
        Integer term210371 = new Integer(1400302967);
        Integer term210373 = new Integer(692198729);
        Integer term210375 = new Integer(-1232290301);
        Integer term210377 = new Integer(-1411058034);
        ArrayList term210365 = new ArrayList();
        ((ArrayList) term210365).add(term210367);
        ((ArrayList) term210365).add(term210369);
        ((ArrayList) term210365).add(term210371);
        ((ArrayList) term210365).add(term210373);
        ((ArrayList) term210365).add(term210375);
        ((ArrayList) term210365).add(term210377);
        Integer term210383 = new Integer(-144155597);
        Integer term210385 = new Integer(-996670851);
        Integer term210387 = new Integer(340642931);
        Integer term210389 = new Integer(-2018441502);
        Integer term210391 = new Integer(-762480882);
        Integer term210393 = new Integer(-263338308);
        ArrayList term210381 = new ArrayList();
        ((ArrayList) term210381).add(term210383);
        ((ArrayList) term210381).add(term210385);
        ((ArrayList) term210381).add(term210387);
        ((ArrayList) term210381).add(term210389);
        ((ArrayList) term210381).add(term210391);
        ((ArrayList) term210381).add(term210393);
        term210300 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term210302 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term210318 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term210319 = newInstance(Class.forName("java.time.LocalDate"));
        Object term210323 = newInstance(Class.forName("java.time.LocalTime"));
        Object term210328 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term210329 = newInstance(Class.forName("java.time.LocalDate"));
        Object term210333 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term210300, term210300.getClass(), "id", -7669498958586932756L);
        setLongField(term210302, term210302.getClass(), "id", -1448895922107466006L);
        setField(term210302, term210302.getClass(), "extId", term210304);
        setField(term210302, term210302.getClass(), "luid", "CrwhMcTxfa");
        setIntField(term210319, term210319.getClass(), "year", 2028);
        setShortField(term210319, term210319.getClass(), "month", (short) 7);
        setShortField(term210319, term210319.getClass(), "day", (short) 24);
        setField(term210318, term210318.getClass(), "date", term210319);
        setByteField(term210323, term210323.getClass(), "hour", (byte) 11);
        setByteField(term210323, term210323.getClass(), "minute", (byte) 2);
        setByteField(term210323, term210323.getClass(), "second", (byte) 47);
        setIntField(term210323, term210323.getClass(), "nano", 875421060);
        setField(term210318, term210318.getClass(), "time", term210323);
        setField(term210302, term210302.getClass(), "registerTime", term210318);
        setIntField(term210329, term210329.getClass(), "year", 2029);
        setShortField(term210329, term210329.getClass(), "month", (short) 12);
        setShortField(term210329, term210329.getClass(), "day", (short) 20);
        setField(term210328, term210328.getClass(), "date", term210329);
        setByteField(term210333, term210333.getClass(), "hour", (byte) 3);
        setByteField(term210333, term210333.getClass(), "minute", (byte) 1);
        setByteField(term210333, term210333.getClass(), "second", (byte) 52);
        setIntField(term210333, term210333.getClass(), "nano", 833458434);
        setField(term210328, term210328.getClass(), "time", term210333);
        setField(term210302, term210302.getClass(), "accessTime", term210328);
        setField(term210300, term210300.getClass(), "card", term210302);
        setField(term210300, term210300.getClass(), "userName", "HqjOaRqVoo");
        setIntField(term210300, term210300.getClass(), "isNetMember", 1539547587);
        setIntField(term210300, term210300.getClass(), "iconId", -109999328);
        setIntField(term210300, term210300.getClass(), "plateId", 2066479007);
        setIntField(term210300, term210300.getClass(), "titleId", 513713337);
        setIntField(term210300, term210300.getClass(), "partnerId", -563013373);
        setIntField(term210300, term210300.getClass(), "frameId", -558676728);
        setIntField(term210300, term210300.getClass(), "selectMapId", 356027079);
        setIntField(term210300, term210300.getClass(), "totalAwake", 1395741052);
        setIntField(term210300, term210300.getClass(), "gradeRating", -325013597);
        setIntField(term210300, term210300.getClass(), "musicRating", 963111794);
        setIntField(term210300, term210300.getClass(), "playerRating", 94574545);
        setIntField(term210300, term210300.getClass(), "highestRating", 1513786853);
        setIntField(term210300, term210300.getClass(), "gradeRank", 1635757738);
        setIntField(term210300, term210300.getClass(), "classRank", 1128345792);
        setIntField(term210300, term210300.getClass(), "courseRank", -556377581);
        setField(term210300, term210300.getClass(), "charaSlot", term210365);
        setField(term210300, term210300.getClass(), "charaLockSlot", term210381);
        setLongField(term210300, term210300.getClass(), "contentBit", -2816221532853440753L);
        setIntField(term210300, term210300.getClass(), "playCount", 1451482001);
        setField(term210300, term210300.getClass(), "eventWatchedDate", "HouDaCvEOJ");
        setField(term210300, term210300.getClass(), "lastGameId", "OkSXzntFXp");
        setField(term210300, term210300.getClass(), "lastRomVersion", "krvvLzcVhh");
        setField(term210300, term210300.getClass(), "lastDataVersion", "rUsEwvlLpO");
        setField(term210300, term210300.getClass(), "lastLoginDate", "UWZEdfWFvS");
        setField(term210300, term210300.getClass(), "lastPlayDate", "AOOxoUEqxT");
        setIntField(term210300, term210300.getClass(), "lastPlayCredit", -2078292497);
        setIntField(term210300, term210300.getClass(), "lastPlayMode", 1009834663);
        setIntField(term210300, term210300.getClass(), "lastPlaceId", -230210054);
        setField(term210300, term210300.getClass(), "lastPlaceName", "sbHglfuJyn");
        setIntField(term210300, term210300.getClass(), "lastAllNetId", -615000850);
        setIntField(term210300, term210300.getClass(), "lastRegionId", -753466696);
        setField(term210300, term210300.getClass(), "lastRegionName", "hjKMxDKUku");
        setField(term210300, term210300.getClass(), "lastClientId", "bAkWQIpVFz");
        setField(term210300, term210300.getClass(), "lastCountryCode", "lMVrMjVtkh");
        setIntField(term210300, term210300.getClass(), "lastSelectEMoney", 1816927743);
        setIntField(term210300, term210300.getClass(), "lastSelectTicket", -499934638);
        setIntField(term210300, term210300.getClass(), "lastSelectCourse", 332996405);
        setIntField(term210300, term210300.getClass(), "lastCountCourse", -2032792413);
        setField(term210300, term210300.getClass(), "firstGameId", "pCYeiJyEzg");
        setField(term210300, term210300.getClass(), "firstRomVersion", "trtedumQuD");
        setField(term210300, term210300.getClass(), "firstDataVersion", "sxkHztjOJZ");
        setField(term210300, term210300.getClass(), "firstPlayDate", "GyvoRsilst");
        setField(term210300, term210300.getClass(), "compatibleCmVersion", "IYeSURgmgZ");
        setField(term210300, term210300.getClass(), "dailyBonusDate", "AtaJCOLMjf");
        setField(term210300, term210300.getClass(), "dailyCourseBonusDate", "MkLxfBFQqR");
        setField(term210300, term210300.getClass(), "lastPairLoginDate", "rgbJzxJVFu");
        setField(term210300, term210300.getClass(), "lastTrialPlayDate", "KPaseiPrvu");
        setIntField(term210300, term210300.getClass(), "playVsCount", -144153639);
        setIntField(term210300, term210300.getClass(), "playSyncCount", -1696480829);
        setIntField(term210300, term210300.getClass(), "winCount", -1518205033);
        setIntField(term210300, term210300.getClass(), "helpCount", -1389703991);
        setIntField(term210300, term210300.getClass(), "comboCount", 1125567446);
        setLongField(term210300, term210300.getClass(), "totalDeluxscore", -3324388461589977064L);
        setLongField(term210300, term210300.getClass(), "totalBasicDeluxscore", -3325236353434709566L);
        setLongField(term210300, term210300.getClass(), "totalAdvancedDeluxscore", -1491380514883022088L);
        setLongField(term210300, term210300.getClass(), "totalExpertDeluxscore", 5034990425635847415L);
        setLongField(term210300, term210300.getClass(), "totalMasterDeluxscore", 1222177686319950738L);
        setLongField(term210300, term210300.getClass(), "totalReMasterDeluxscore", 4783096215431576066L);
        setIntField(term210300, term210300.getClass(), "totalSync", -1287731042);
        setIntField(term210300, term210300.getClass(), "totalBasicSync", 1189363638);
        setIntField(term210300, term210300.getClass(), "totalAdvancedSync", -282860769);
        setIntField(term210300, term210300.getClass(), "totalExpertSync", -2077950026);
        setIntField(term210300, term210300.getClass(), "totalMasterSync", -817927463);
        setIntField(term210300, term210300.getClass(), "totalReMasterSync", 960720214);
        setLongField(term210300, term210300.getClass(), "totalAchievement", 1343459668932607461L);
        setLongField(term210300, term210300.getClass(), "totalBasicAchievement", -9102102270807296424L);
        setLongField(term210300, term210300.getClass(), "totalAdvancedAchievement", 6138671209073546063L);
        setLongField(term210300, term210300.getClass(), "totalExpertAchievement", 5221418857304717721L);
        setLongField(term210300, term210300.getClass(), "totalMasterAchievement", 7928766268705604145L);
        setLongField(term210300, term210300.getClass(), "totalReMasterAchievement", 4457753160962357199L);
        setLongField(term210300, term210300.getClass(), "playerOldRating", 5795775657175520210L);
        setLongField(term210300, term210300.getClass(), "playerNewRating", -9188635684559551496L);
        setIntField(term210300, term210300.getClass(), "banState", -957641184);
        setLongField(term210300, term210300.getClass(), "dateTime", 8334183398809330820L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastLoginDate", argTypes, term210300, args);
    }

};


