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

public class UserOption_getBreakSe_8108824399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53501;

    public UserOption_getBreakSe_8108824399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term53507 = new Long(3090901538358721367L);
        term53501 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term53503 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term53505 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term53521 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53522 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53526 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53531 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53532 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53536 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term53501, term53501.getClass(), "id", -7506365302323354325L);
        setLongField(term53503, term53503.getClass(), "id", -4693900822622913579L);
        setLongField(term53505, term53505.getClass(), "id", -997945615782059734L);
        setField(term53505, term53505.getClass(), "extId", term53507);
        setField(term53505, term53505.getClass(), "luid", "qePuOCwoCf");
        setIntField(term53522, term53522.getClass(), "year", 2029);
        setShortField(term53522, term53522.getClass(), "month", (short) 1);
        setShortField(term53522, term53522.getClass(), "day", (short) 15);
        setField(term53521, term53521.getClass(), "date", term53522);
        setByteField(term53526, term53526.getClass(), "hour", (byte) 1);
        setByteField(term53526, term53526.getClass(), "minute", (byte) 39);
        setByteField(term53526, term53526.getClass(), "second", (byte) 40);
        setIntField(term53526, term53526.getClass(), "nano", 99482694);
        setField(term53521, term53521.getClass(), "time", term53526);
        setField(term53505, term53505.getClass(), "registerTime", term53521);
        setIntField(term53532, term53532.getClass(), "year", 2025);
        setShortField(term53532, term53532.getClass(), "month", (short) 2);
        setShortField(term53532, term53532.getClass(), "day", (short) 11);
        setField(term53531, term53531.getClass(), "date", term53532);
        setByteField(term53536, term53536.getClass(), "hour", (byte) 15);
        setByteField(term53536, term53536.getClass(), "minute", (byte) 46);
        setByteField(term53536, term53536.getClass(), "second", (byte) 31);
        setIntField(term53536, term53536.getClass(), "nano", 989587730);
        setField(term53531, term53531.getClass(), "time", term53536);
        setField(term53505, term53505.getClass(), "accessTime", term53531);
        setField(term53503, term53503.getClass(), "card", term53505);
        setIntField(term53503, term53503.getClass(), "lastDataVersion", -573135556);
        setField(term53503, term53503.getClass(), "userName", "vJPujDInGq");
        setIntField(term53503, term53503.getClass(), "point", 995946657);
        setIntField(term53503, term53503.getClass(), "totalPoint", -1689684498);
        setIntField(term53503, term53503.getClass(), "iconId", -1408160580);
        setIntField(term53503, term53503.getClass(), "nameplateId", -1606951340);
        setIntField(term53503, term53503.getClass(), "frameId", 1066146888);
        setIntField(term53503, term53503.getClass(), "trophyId", 409835682);
        setIntField(term53503, term53503.getClass(), "playCount", -2088840932);
        setIntField(term53503, term53503.getClass(), "playVsCount", 1470124459);
        setIntField(term53503, term53503.getClass(), "playSyncCount", 1708162324);
        setIntField(term53503, term53503.getClass(), "winCount", 686279974);
        setIntField(term53503, term53503.getClass(), "helpCount", 2022250483);
        setIntField(term53503, term53503.getClass(), "comboCount", 509321963);
        setIntField(term53503, term53503.getClass(), "feverCount", -2063187052);
        setIntField(term53503, term53503.getClass(), "totalHiScore", 133581490);
        setIntField(term53503, term53503.getClass(), "totalEasyHighScore", -579671719);
        setIntField(term53503, term53503.getClass(), "totalBasicHighScore", -1915340015);
        setIntField(term53503, term53503.getClass(), "totalAdvancedHighScore", -600241671);
        setIntField(term53503, term53503.getClass(), "totalExpertHighScore", -1229610550);
        setIntField(term53503, term53503.getClass(), "totalMasterHighScore", 493486357);
        setIntField(term53503, term53503.getClass(), "totalReMasterHighScore", 329514667);
        setIntField(term53503, term53503.getClass(), "totalHighSync", 1579294785);
        setIntField(term53503, term53503.getClass(), "totalEasySync", 41910159);
        setIntField(term53503, term53503.getClass(), "totalBasicSync", 2144178531);
        setIntField(term53503, term53503.getClass(), "totalAdvancedSync", -1853902014);
        setIntField(term53503, term53503.getClass(), "totalExpertSync", 1694299799);
        setIntField(term53503, term53503.getClass(), "totalMasterSync", -1172188590);
        setIntField(term53503, term53503.getClass(), "totalReMasterSync", 1811271159);
        setIntField(term53503, term53503.getClass(), "playerRating", 534169620);
        setIntField(term53503, term53503.getClass(), "highestRating", 1011698169);
        setIntField(term53503, term53503.getClass(), "rankAuthTailId", -1031068823);
        setField(term53503, term53503.getClass(), "eventWatchedDate", "cHZGcMhatT");
        setField(term53503, term53503.getClass(), "webLimitDate", "OZGyrUPedG");
        setIntField(term53503, term53503.getClass(), "challengeTrackPhase", -1229282495);
        setIntField(term53503, term53503.getClass(), "firstPlayBits", 58488326);
        setField(term53503, term53503.getClass(), "lastPlayDate", "GAxMzRqmXU");
        setIntField(term53503, term53503.getClass(), "lastPlaceId", -1178011877);
        setField(term53503, term53503.getClass(), "lastPlaceName", "XMhUDGKSWO");
        setIntField(term53503, term53503.getClass(), "lastRegionId", 1744976454);
        setField(term53503, term53503.getClass(), "lastRegionName", "jLgzxtuvVo");
        setField(term53503, term53503.getClass(), "lastClientId", "wmmxjOkPnH");
        setField(term53503, term53503.getClass(), "lastCountryCode", "jgRohUQWxJ");
        setIntField(term53503, term53503.getClass(), "eventPoint", -501735949);
        setIntField(term53503, term53503.getClass(), "totalLv", 1633315544);
        setIntField(term53503, term53503.getClass(), "lastLoginBonusDay", 1699846026);
        setIntField(term53503, term53503.getClass(), "lastSurvivalBonusDay", -1144234812);
        setIntField(term53503, term53503.getClass(), "loginBonusLv", -2144123201);
        setField(term53501, term53501.getClass(), "user", term53503);
        setIntField(term53501, term53501.getClass(), "soudEffect", 1436840858);
        setIntField(term53501, term53501.getClass(), "mirrorMode", -2146939628);
        setIntField(term53501, term53501.getClass(), "guideSpeed", -1735999292);
        setIntField(term53501, term53501.getClass(), "bgInfo", 1978300005);
        setIntField(term53501, term53501.getClass(), "brightness", -495461794);
        setIntField(term53501, term53501.getClass(), "isStarRot", 1179148135);
        setIntField(term53501, term53501.getClass(), "breakSe", 1856832248);
        setIntField(term53501, term53501.getClass(), "slideSe", 1112040940);
        setIntField(term53501, term53501.getClass(), "hardJudge", -1289327826);
        setIntField(term53501, term53501.getClass(), "isTagJump", -1510240264);
        setIntField(term53501, term53501.getClass(), "breakSeVol", -1206929666);
        setIntField(term53501, term53501.getClass(), "slideSeVol", -673087697);
        setIntField(term53501, term53501.getClass(), "isUpperDisp", 821580864);
        setIntField(term53501, term53501.getClass(), "trackSkip", 210061350);
        setIntField(term53501, term53501.getClass(), "optionMode", -1315216208);
        setIntField(term53501, term53501.getClass(), "simpleOptionParam", -543739494);
        setIntField(term53501, term53501.getClass(), "adjustTiming", -1959832217);
        setIntField(term53501, term53501.getClass(), "dispTiming", 61867422);
        setIntField(term53501, term53501.getClass(), "timingPos", 536970938);
        setIntField(term53501, term53501.getClass(), "ansVol", 1370836789);
        setIntField(term53501, term53501.getClass(), "noteVol", -2117537075);
        setIntField(term53501, term53501.getClass(), "dmgVol", -707090176);
        setIntField(term53501, term53501.getClass(), "appealFlame", -1562747284);
        setIntField(term53501, term53501.getClass(), "isFeverDisp", 1595520482);
        setIntField(term53501, term53501.getClass(), "dispJudge", 1344577247);
        setIntField(term53501, term53501.getClass(), "judgePos", 89754306);
        setIntField(term53501, term53501.getClass(), "ratingGuard", -1141919536);
        setIntField(term53501, term53501.getClass(), "selectChara", 1482082530);
        setIntField(term53501, term53501.getClass(), "sortType", -1920069753);
        setIntField(term53501, term53501.getClass(), "filterGenre", -740722091);
        setIntField(term53501, term53501.getClass(), "filterLevel", -758267649);
        setIntField(term53501, term53501.getClass(), "filterRank", 281378461);
        setIntField(term53501, term53501.getClass(), "filterVersion", 1023095456);
        setIntField(term53501, term53501.getClass(), "filterRec", -1831793787);
        setIntField(term53501, term53501.getClass(), "filterFullCombo", 1354308528);
        setIntField(term53501, term53501.getClass(), "filterAllPerfect", -1618737502);
        setIntField(term53501, term53501.getClass(), "filterDifficulty", 1179678118);
        setIntField(term53501, term53501.getClass(), "filterFullSync", -806431195);
        setIntField(term53501, term53501.getClass(), "filterReMaster", 2080180241);
        setIntField(term53501, term53501.getClass(), "filterMaxFever", 346704875);
        setIntField(term53501, term53501.getClass(), "finalSelectId", -646622035);
        setIntField(term53501, term53501.getClass(), "finalSelectCategory", 1580829674);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBreakSe", argTypes, term53501, args);
    }

};


