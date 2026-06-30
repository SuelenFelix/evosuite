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

public class UserOption_getHardJudge_63295732411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54117;

    public UserOption_getHardJudge_63295732411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term54123 = new Long(4795660804170399986L);
        term54117 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term54119 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term54121 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term54137 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54138 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54142 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54147 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54148 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54152 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term54117, term54117.getClass(), "id", -9168517519350392654L);
        setLongField(term54119, term54119.getClass(), "id", 4828755228445882127L);
        setLongField(term54121, term54121.getClass(), "id", 970120292495348028L);
        setField(term54121, term54121.getClass(), "extId", term54123);
        setField(term54121, term54121.getClass(), "luid", "hpTAdtnQku");
        setIntField(term54138, term54138.getClass(), "year", 2018);
        setShortField(term54138, term54138.getClass(), "month", (short) 9);
        setShortField(term54138, term54138.getClass(), "day", (short) 19);
        setField(term54137, term54137.getClass(), "date", term54138);
        setByteField(term54142, term54142.getClass(), "hour", (byte) 23);
        setByteField(term54142, term54142.getClass(), "minute", (byte) 30);
        setByteField(term54142, term54142.getClass(), "second", (byte) 11);
        setIntField(term54142, term54142.getClass(), "nano", 615798597);
        setField(term54137, term54137.getClass(), "time", term54142);
        setField(term54121, term54121.getClass(), "registerTime", term54137);
        setIntField(term54148, term54148.getClass(), "year", 2021);
        setShortField(term54148, term54148.getClass(), "month", (short) 3);
        setShortField(term54148, term54148.getClass(), "day", (short) 13);
        setField(term54147, term54147.getClass(), "date", term54148);
        setByteField(term54152, term54152.getClass(), "hour", (byte) 11);
        setByteField(term54152, term54152.getClass(), "minute", (byte) 11);
        setByteField(term54152, term54152.getClass(), "second", (byte) 36);
        setIntField(term54152, term54152.getClass(), "nano", 411690155);
        setField(term54147, term54147.getClass(), "time", term54152);
        setField(term54121, term54121.getClass(), "accessTime", term54147);
        setField(term54119, term54119.getClass(), "card", term54121);
        setIntField(term54119, term54119.getClass(), "lastDataVersion", 568150061);
        setField(term54119, term54119.getClass(), "userName", "GdMAXFBAtl");
        setIntField(term54119, term54119.getClass(), "point", -1014042063);
        setIntField(term54119, term54119.getClass(), "totalPoint", -1581094320);
        setIntField(term54119, term54119.getClass(), "iconId", 861218402);
        setIntField(term54119, term54119.getClass(), "nameplateId", 2041897178);
        setIntField(term54119, term54119.getClass(), "frameId", -766372661);
        setIntField(term54119, term54119.getClass(), "trophyId", 729482578);
        setIntField(term54119, term54119.getClass(), "playCount", -368397845);
        setIntField(term54119, term54119.getClass(), "playVsCount", -279315948);
        setIntField(term54119, term54119.getClass(), "playSyncCount", -195577818);
        setIntField(term54119, term54119.getClass(), "winCount", 1457197657);
        setIntField(term54119, term54119.getClass(), "helpCount", 1961784130);
        setIntField(term54119, term54119.getClass(), "comboCount", -1669337588);
        setIntField(term54119, term54119.getClass(), "feverCount", 2041255104);
        setIntField(term54119, term54119.getClass(), "totalHiScore", 574882663);
        setIntField(term54119, term54119.getClass(), "totalEasyHighScore", -1745553783);
        setIntField(term54119, term54119.getClass(), "totalBasicHighScore", 2039100321);
        setIntField(term54119, term54119.getClass(), "totalAdvancedHighScore", -327912576);
        setIntField(term54119, term54119.getClass(), "totalExpertHighScore", -324420288);
        setIntField(term54119, term54119.getClass(), "totalMasterHighScore", -327505418);
        setIntField(term54119, term54119.getClass(), "totalReMasterHighScore", -345983538);
        setIntField(term54119, term54119.getClass(), "totalHighSync", 1910809114);
        setIntField(term54119, term54119.getClass(), "totalEasySync", 1217723895);
        setIntField(term54119, term54119.getClass(), "totalBasicSync", -907902250);
        setIntField(term54119, term54119.getClass(), "totalAdvancedSync", -286413213);
        setIntField(term54119, term54119.getClass(), "totalExpertSync", 389597623);
        setIntField(term54119, term54119.getClass(), "totalMasterSync", 1355618501);
        setIntField(term54119, term54119.getClass(), "totalReMasterSync", -804557100);
        setIntField(term54119, term54119.getClass(), "playerRating", -208537609);
        setIntField(term54119, term54119.getClass(), "highestRating", 2077395924);
        setIntField(term54119, term54119.getClass(), "rankAuthTailId", 415308572);
        setField(term54119, term54119.getClass(), "eventWatchedDate", "KWVRAlcIqd");
        setField(term54119, term54119.getClass(), "webLimitDate", "GeVOqtDiGv");
        setIntField(term54119, term54119.getClass(), "challengeTrackPhase", -1042999942);
        setIntField(term54119, term54119.getClass(), "firstPlayBits", 154667804);
        setField(term54119, term54119.getClass(), "lastPlayDate", "vbRAJCwftU");
        setIntField(term54119, term54119.getClass(), "lastPlaceId", 45779305);
        setField(term54119, term54119.getClass(), "lastPlaceName", "baJbjUImxp");
        setIntField(term54119, term54119.getClass(), "lastRegionId", -743067909);
        setField(term54119, term54119.getClass(), "lastRegionName", "lPERFqPpGz");
        setField(term54119, term54119.getClass(), "lastClientId", "jleFBTYSNb");
        setField(term54119, term54119.getClass(), "lastCountryCode", "WmSSWHEELj");
        setIntField(term54119, term54119.getClass(), "eventPoint", -361714184);
        setIntField(term54119, term54119.getClass(), "totalLv", -1401087276);
        setIntField(term54119, term54119.getClass(), "lastLoginBonusDay", -2103330738);
        setIntField(term54119, term54119.getClass(), "lastSurvivalBonusDay", 1748913795);
        setIntField(term54119, term54119.getClass(), "loginBonusLv", -1329402588);
        setField(term54117, term54117.getClass(), "user", term54119);
        setIntField(term54117, term54117.getClass(), "soudEffect", 1726678084);
        setIntField(term54117, term54117.getClass(), "mirrorMode", -1646777638);
        setIntField(term54117, term54117.getClass(), "guideSpeed", -555901750);
        setIntField(term54117, term54117.getClass(), "bgInfo", 2095599554);
        setIntField(term54117, term54117.getClass(), "brightness", -776665689);
        setIntField(term54117, term54117.getClass(), "isStarRot", -1175048755);
        setIntField(term54117, term54117.getClass(), "breakSe", 202504175);
        setIntField(term54117, term54117.getClass(), "slideSe", 1832731908);
        setIntField(term54117, term54117.getClass(), "hardJudge", -1441501052);
        setIntField(term54117, term54117.getClass(), "isTagJump", 1398726767);
        setIntField(term54117, term54117.getClass(), "breakSeVol", -321873809);
        setIntField(term54117, term54117.getClass(), "slideSeVol", 241171795);
        setIntField(term54117, term54117.getClass(), "isUpperDisp", 1585564451);
        setIntField(term54117, term54117.getClass(), "trackSkip", -510547208);
        setIntField(term54117, term54117.getClass(), "optionMode", -373108299);
        setIntField(term54117, term54117.getClass(), "simpleOptionParam", -457580209);
        setIntField(term54117, term54117.getClass(), "adjustTiming", 1322915133);
        setIntField(term54117, term54117.getClass(), "dispTiming", 280114994);
        setIntField(term54117, term54117.getClass(), "timingPos", -289519625);
        setIntField(term54117, term54117.getClass(), "ansVol", -495258347);
        setIntField(term54117, term54117.getClass(), "noteVol", 1581720562);
        setIntField(term54117, term54117.getClass(), "dmgVol", 17092444);
        setIntField(term54117, term54117.getClass(), "appealFlame", 1646931775);
        setIntField(term54117, term54117.getClass(), "isFeverDisp", 852601791);
        setIntField(term54117, term54117.getClass(), "dispJudge", 398280959);
        setIntField(term54117, term54117.getClass(), "judgePos", -258521262);
        setIntField(term54117, term54117.getClass(), "ratingGuard", 1217456071);
        setIntField(term54117, term54117.getClass(), "selectChara", 651030320);
        setIntField(term54117, term54117.getClass(), "sortType", -1538279121);
        setIntField(term54117, term54117.getClass(), "filterGenre", -64171030);
        setIntField(term54117, term54117.getClass(), "filterLevel", -1799451766);
        setIntField(term54117, term54117.getClass(), "filterRank", -1576640496);
        setIntField(term54117, term54117.getClass(), "filterVersion", 12609042);
        setIntField(term54117, term54117.getClass(), "filterRec", -184191841);
        setIntField(term54117, term54117.getClass(), "filterFullCombo", -238927593);
        setIntField(term54117, term54117.getClass(), "filterAllPerfect", -2130505195);
        setIntField(term54117, term54117.getClass(), "filterDifficulty", 80166636);
        setIntField(term54117, term54117.getClass(), "filterFullSync", -142617740);
        setIntField(term54117, term54117.getClass(), "filterReMaster", 1932617639);
        setIntField(term54117, term54117.getClass(), "filterMaxFever", -102676348);
        setIntField(term54117, term54117.getClass(), "finalSelectId", -438825744);
        setIntField(term54117, term54117.getClass(), "finalSelectCategory", -182534382);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHardJudge", argTypes, term54117, args);
    }

};


