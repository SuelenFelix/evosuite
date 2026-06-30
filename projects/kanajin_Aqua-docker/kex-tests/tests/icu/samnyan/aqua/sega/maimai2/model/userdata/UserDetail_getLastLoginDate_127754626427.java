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

public class UserDetail_getLastLoginDate_127754626427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210355;

    public UserDetail_getLastLoginDate_127754626427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term210359 = new Long(2274723545906746965L);
        Integer term210422 = new Integer(1093956146);
        Integer term210424 = new Integer(1459247713);
        Integer term210426 = new Integer(1400302967);
        Integer term210428 = new Integer(692198729);
        Integer term210430 = new Integer(-1232290301);
        Integer term210432 = new Integer(-1411058034);
        ArrayList term210420 = new ArrayList();
        ((ArrayList) term210420).add(term210422);
        ((ArrayList) term210420).add(term210424);
        ((ArrayList) term210420).add(term210426);
        ((ArrayList) term210420).add(term210428);
        ((ArrayList) term210420).add(term210430);
        ((ArrayList) term210420).add(term210432);
        Integer term210438 = new Integer(-144155597);
        Integer term210440 = new Integer(-996670851);
        Integer term210442 = new Integer(340642931);
        Integer term210444 = new Integer(-2018441502);
        Integer term210446 = new Integer(-762480882);
        Integer term210448 = new Integer(-263338308);
        ArrayList term210436 = new ArrayList();
        ((ArrayList) term210436).add(term210438);
        ((ArrayList) term210436).add(term210440);
        ((ArrayList) term210436).add(term210442);
        ((ArrayList) term210436).add(term210444);
        ((ArrayList) term210436).add(term210446);
        ((ArrayList) term210436).add(term210448);
        term210355 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term210357 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term210373 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term210374 = newInstance(Class.forName("java.time.LocalDate"));
        Object term210378 = newInstance(Class.forName("java.time.LocalTime"));
        Object term210383 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term210384 = newInstance(Class.forName("java.time.LocalDate"));
        Object term210388 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term210355, term210355.getClass(), "id", -7669498958586932756L);
        setLongField(term210357, term210357.getClass(), "id", -1448895922107466006L);
        setField(term210357, term210357.getClass(), "extId", term210359);
        setField(term210357, term210357.getClass(), "luid", "CrwhMcTxfa");
        setIntField(term210374, term210374.getClass(), "year", 2028);
        setShortField(term210374, term210374.getClass(), "month", (short) 7);
        setShortField(term210374, term210374.getClass(), "day", (short) 24);
        setField(term210373, term210373.getClass(), "date", term210374);
        setByteField(term210378, term210378.getClass(), "hour", (byte) 11);
        setByteField(term210378, term210378.getClass(), "minute", (byte) 2);
        setByteField(term210378, term210378.getClass(), "second", (byte) 47);
        setIntField(term210378, term210378.getClass(), "nano", 875421060);
        setField(term210373, term210373.getClass(), "time", term210378);
        setField(term210357, term210357.getClass(), "registerTime", term210373);
        setIntField(term210384, term210384.getClass(), "year", 2029);
        setShortField(term210384, term210384.getClass(), "month", (short) 12);
        setShortField(term210384, term210384.getClass(), "day", (short) 20);
        setField(term210383, term210383.getClass(), "date", term210384);
        setByteField(term210388, term210388.getClass(), "hour", (byte) 3);
        setByteField(term210388, term210388.getClass(), "minute", (byte) 1);
        setByteField(term210388, term210388.getClass(), "second", (byte) 52);
        setIntField(term210388, term210388.getClass(), "nano", 833458434);
        setField(term210383, term210383.getClass(), "time", term210388);
        setField(term210357, term210357.getClass(), "accessTime", term210383);
        setField(term210355, term210355.getClass(), "card", term210357);
        setField(term210355, term210355.getClass(), "userName", "HqjOaRqVoo");
        setIntField(term210355, term210355.getClass(), "isNetMember", 1539547587);
        setIntField(term210355, term210355.getClass(), "iconId", -109999328);
        setIntField(term210355, term210355.getClass(), "plateId", 2066479007);
        setIntField(term210355, term210355.getClass(), "titleId", 513713337);
        setIntField(term210355, term210355.getClass(), "partnerId", -563013373);
        setIntField(term210355, term210355.getClass(), "frameId", -558676728);
        setIntField(term210355, term210355.getClass(), "selectMapId", 356027079);
        setIntField(term210355, term210355.getClass(), "totalAwake", 1395741052);
        setIntField(term210355, term210355.getClass(), "gradeRating", -325013597);
        setIntField(term210355, term210355.getClass(), "musicRating", 963111794);
        setIntField(term210355, term210355.getClass(), "playerRating", 94574545);
        setIntField(term210355, term210355.getClass(), "highestRating", 1513786853);
        setIntField(term210355, term210355.getClass(), "gradeRank", 1635757738);
        setIntField(term210355, term210355.getClass(), "classRank", 1128345792);
        setIntField(term210355, term210355.getClass(), "courseRank", -556377581);
        setField(term210355, term210355.getClass(), "charaSlot", term210420);
        setField(term210355, term210355.getClass(), "charaLockSlot", term210436);
        setLongField(term210355, term210355.getClass(), "contentBit", -2816221532853440753L);
        setIntField(term210355, term210355.getClass(), "playCount", 1451482001);
        setField(term210355, term210355.getClass(), "eventWatchedDate", "HouDaCvEOJ");
        setField(term210355, term210355.getClass(), "lastGameId", "OkSXzntFXp");
        setField(term210355, term210355.getClass(), "lastRomVersion", "krvvLzcVhh");
        setField(term210355, term210355.getClass(), "lastDataVersion", "rUsEwvlLpO");
        setField(term210355, term210355.getClass(), "lastLoginDate", "UWZEdfWFvS");
        setField(term210355, term210355.getClass(), "lastPlayDate", "AOOxoUEqxT");
        setIntField(term210355, term210355.getClass(), "lastPlayCredit", -2078292497);
        setIntField(term210355, term210355.getClass(), "lastPlayMode", 1009834663);
        setIntField(term210355, term210355.getClass(), "lastPlaceId", -230210054);
        setField(term210355, term210355.getClass(), "lastPlaceName", "sbHglfuJyn");
        setIntField(term210355, term210355.getClass(), "lastAllNetId", -615000850);
        setIntField(term210355, term210355.getClass(), "lastRegionId", -753466696);
        setField(term210355, term210355.getClass(), "lastRegionName", "hjKMxDKUku");
        setField(term210355, term210355.getClass(), "lastClientId", "bAkWQIpVFz");
        setField(term210355, term210355.getClass(), "lastCountryCode", "lMVrMjVtkh");
        setIntField(term210355, term210355.getClass(), "lastSelectEMoney", 1816927743);
        setIntField(term210355, term210355.getClass(), "lastSelectTicket", -499934638);
        setIntField(term210355, term210355.getClass(), "lastSelectCourse", 332996405);
        setIntField(term210355, term210355.getClass(), "lastCountCourse", -2032792413);
        setField(term210355, term210355.getClass(), "firstGameId", "pCYeiJyEzg");
        setField(term210355, term210355.getClass(), "firstRomVersion", "trtedumQuD");
        setField(term210355, term210355.getClass(), "firstDataVersion", "sxkHztjOJZ");
        setField(term210355, term210355.getClass(), "firstPlayDate", "GyvoRsilst");
        setField(term210355, term210355.getClass(), "compatibleCmVersion", "IYeSURgmgZ");
        setField(term210355, term210355.getClass(), "dailyBonusDate", "AtaJCOLMjf");
        setField(term210355, term210355.getClass(), "dailyCourseBonusDate", "MkLxfBFQqR");
        setField(term210355, term210355.getClass(), "lastPairLoginDate", "rgbJzxJVFu");
        setField(term210355, term210355.getClass(), "lastTrialPlayDate", "KPaseiPrvu");
        setIntField(term210355, term210355.getClass(), "playVsCount", -144153639);
        setIntField(term210355, term210355.getClass(), "playSyncCount", -1696480829);
        setIntField(term210355, term210355.getClass(), "winCount", -1518205033);
        setIntField(term210355, term210355.getClass(), "helpCount", -1389703991);
        setIntField(term210355, term210355.getClass(), "comboCount", 1125567446);
        setLongField(term210355, term210355.getClass(), "totalDeluxscore", -3324388461589977064L);
        setLongField(term210355, term210355.getClass(), "totalBasicDeluxscore", -3325236353434709566L);
        setLongField(term210355, term210355.getClass(), "totalAdvancedDeluxscore", -1491380514883022088L);
        setLongField(term210355, term210355.getClass(), "totalExpertDeluxscore", 5034990425635847415L);
        setLongField(term210355, term210355.getClass(), "totalMasterDeluxscore", 1222177686319950738L);
        setLongField(term210355, term210355.getClass(), "totalReMasterDeluxscore", 4783096215431576066L);
        setIntField(term210355, term210355.getClass(), "totalSync", -1287731042);
        setIntField(term210355, term210355.getClass(), "totalBasicSync", 1189363638);
        setIntField(term210355, term210355.getClass(), "totalAdvancedSync", -282860769);
        setIntField(term210355, term210355.getClass(), "totalExpertSync", -2077950026);
        setIntField(term210355, term210355.getClass(), "totalMasterSync", -817927463);
        setIntField(term210355, term210355.getClass(), "totalReMasterSync", 960720214);
        setLongField(term210355, term210355.getClass(), "totalAchievement", 1343459668932607461L);
        setLongField(term210355, term210355.getClass(), "totalBasicAchievement", -9102102270807296424L);
        setLongField(term210355, term210355.getClass(), "totalAdvancedAchievement", 6138671209073546063L);
        setLongField(term210355, term210355.getClass(), "totalExpertAchievement", 5221418857304717721L);
        setLongField(term210355, term210355.getClass(), "totalMasterAchievement", 7928766268705604145L);
        setLongField(term210355, term210355.getClass(), "totalReMasterAchievement", 4457753160962357199L);
        setLongField(term210355, term210355.getClass(), "playerOldRating", 5795775657175520210L);
        setLongField(term210355, term210355.getClass(), "playerNewRating", -9188635684559551496L);
        setIntField(term210355, term210355.getClass(), "banState", -957641184);
        setLongField(term210355, term210355.getClass(), "dateTime", 8334183398809330820L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastLoginDate", argTypes, term210355, args);
    }

};


