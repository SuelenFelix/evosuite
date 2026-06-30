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

public class UserOption_getFilterFullCombo_155633841537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62125;

    public UserOption_getFilterFullCombo_155633841537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term62131 = new Long(3288941170644426558L);
        term62125 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term62127 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term62129 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term62145 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62146 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62150 = newInstance(Class.forName("java.time.LocalTime"));
        Object term62155 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62156 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62160 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term62125, term62125.getClass(), "id", -99017747847004910L);
        setLongField(term62127, term62127.getClass(), "id", 797798302378380033L);
        setLongField(term62129, term62129.getClass(), "id", 4892304277320345810L);
        setField(term62129, term62129.getClass(), "extId", term62131);
        setField(term62129, term62129.getClass(), "luid", "RlyxtfCqKY");
        setIntField(term62146, term62146.getClass(), "year", 2020);
        setShortField(term62146, term62146.getClass(), "month", (short) 5);
        setShortField(term62146, term62146.getClass(), "day", (short) 25);
        setField(term62145, term62145.getClass(), "date", term62146);
        setByteField(term62150, term62150.getClass(), "hour", (byte) 4);
        setByteField(term62150, term62150.getClass(), "minute", (byte) 20);
        setByteField(term62150, term62150.getClass(), "second", (byte) 39);
        setIntField(term62150, term62150.getClass(), "nano", 382102366);
        setField(term62145, term62145.getClass(), "time", term62150);
        setField(term62129, term62129.getClass(), "registerTime", term62145);
        setIntField(term62156, term62156.getClass(), "year", 2023);
        setShortField(term62156, term62156.getClass(), "month", (short) 3);
        setShortField(term62156, term62156.getClass(), "day", (short) 4);
        setField(term62155, term62155.getClass(), "date", term62156);
        setByteField(term62160, term62160.getClass(), "hour", (byte) 20);
        setByteField(term62160, term62160.getClass(), "minute", (byte) 17);
        setByteField(term62160, term62160.getClass(), "second", (byte) 33);
        setIntField(term62160, term62160.getClass(), "nano", 193707533);
        setField(term62155, term62155.getClass(), "time", term62160);
        setField(term62129, term62129.getClass(), "accessTime", term62155);
        setField(term62127, term62127.getClass(), "card", term62129);
        setIntField(term62127, term62127.getClass(), "lastDataVersion", 1407499360);
        setField(term62127, term62127.getClass(), "userName", "kyTUkLCRYm");
        setIntField(term62127, term62127.getClass(), "point", -824739842);
        setIntField(term62127, term62127.getClass(), "totalPoint", 1736957152);
        setIntField(term62127, term62127.getClass(), "iconId", -526630921);
        setIntField(term62127, term62127.getClass(), "nameplateId", -1766101899);
        setIntField(term62127, term62127.getClass(), "frameId", -1198424905);
        setIntField(term62127, term62127.getClass(), "trophyId", -782844264);
        setIntField(term62127, term62127.getClass(), "playCount", -546737664);
        setIntField(term62127, term62127.getClass(), "playVsCount", 2004350139);
        setIntField(term62127, term62127.getClass(), "playSyncCount", 1239280488);
        setIntField(term62127, term62127.getClass(), "winCount", -1336481907);
        setIntField(term62127, term62127.getClass(), "helpCount", 1804282244);
        setIntField(term62127, term62127.getClass(), "comboCount", 1481607063);
        setIntField(term62127, term62127.getClass(), "feverCount", 972749902);
        setIntField(term62127, term62127.getClass(), "totalHiScore", -1556774479);
        setIntField(term62127, term62127.getClass(), "totalEasyHighScore", -74035050);
        setIntField(term62127, term62127.getClass(), "totalBasicHighScore", 1681611551);
        setIntField(term62127, term62127.getClass(), "totalAdvancedHighScore", 1979378883);
        setIntField(term62127, term62127.getClass(), "totalExpertHighScore", -471723430);
        setIntField(term62127, term62127.getClass(), "totalMasterHighScore", -1834936016);
        setIntField(term62127, term62127.getClass(), "totalReMasterHighScore", -1317671732);
        setIntField(term62127, term62127.getClass(), "totalHighSync", -589460764);
        setIntField(term62127, term62127.getClass(), "totalEasySync", 1158956816);
        setIntField(term62127, term62127.getClass(), "totalBasicSync", -1817072774);
        setIntField(term62127, term62127.getClass(), "totalAdvancedSync", 1457278062);
        setIntField(term62127, term62127.getClass(), "totalExpertSync", 1950635891);
        setIntField(term62127, term62127.getClass(), "totalMasterSync", 1872837544);
        setIntField(term62127, term62127.getClass(), "totalReMasterSync", 1853027403);
        setIntField(term62127, term62127.getClass(), "playerRating", 1076142687);
        setIntField(term62127, term62127.getClass(), "highestRating", -1876139521);
        setIntField(term62127, term62127.getClass(), "rankAuthTailId", -241791599);
        setField(term62127, term62127.getClass(), "eventWatchedDate", "oAotZgNUFH");
        setField(term62127, term62127.getClass(), "webLimitDate", "TowhQcovXu");
        setIntField(term62127, term62127.getClass(), "challengeTrackPhase", 176773103);
        setIntField(term62127, term62127.getClass(), "firstPlayBits", -1103469317);
        setField(term62127, term62127.getClass(), "lastPlayDate", "UFGOnIMOzf");
        setIntField(term62127, term62127.getClass(), "lastPlaceId", 19350338);
        setField(term62127, term62127.getClass(), "lastPlaceName", "ySiyRlAQpt");
        setIntField(term62127, term62127.getClass(), "lastRegionId", -1448947603);
        setField(term62127, term62127.getClass(), "lastRegionName", "MiankJgKCp");
        setField(term62127, term62127.getClass(), "lastClientId", "lmZBCmpOeb");
        setField(term62127, term62127.getClass(), "lastCountryCode", "cPlYOAUqsP");
        setIntField(term62127, term62127.getClass(), "eventPoint", 741952810);
        setIntField(term62127, term62127.getClass(), "totalLv", 1898180943);
        setIntField(term62127, term62127.getClass(), "lastLoginBonusDay", -801187383);
        setIntField(term62127, term62127.getClass(), "lastSurvivalBonusDay", -2118633501);
        setIntField(term62127, term62127.getClass(), "loginBonusLv", 2007901309);
        setField(term62125, term62125.getClass(), "user", term62127);
        setIntField(term62125, term62125.getClass(), "soudEffect", -287540465);
        setIntField(term62125, term62125.getClass(), "mirrorMode", -465195814);
        setIntField(term62125, term62125.getClass(), "guideSpeed", -313554253);
        setIntField(term62125, term62125.getClass(), "bgInfo", -934314073);
        setIntField(term62125, term62125.getClass(), "brightness", 1640531917);
        setIntField(term62125, term62125.getClass(), "isStarRot", -871360111);
        setIntField(term62125, term62125.getClass(), "breakSe", 931050250);
        setIntField(term62125, term62125.getClass(), "slideSe", -1686618770);
        setIntField(term62125, term62125.getClass(), "hardJudge", -1592104600);
        setIntField(term62125, term62125.getClass(), "isTagJump", -500126132);
        setIntField(term62125, term62125.getClass(), "breakSeVol", -327712746);
        setIntField(term62125, term62125.getClass(), "slideSeVol", -1446388321);
        setIntField(term62125, term62125.getClass(), "isUpperDisp", 283077570);
        setIntField(term62125, term62125.getClass(), "trackSkip", -1013688248);
        setIntField(term62125, term62125.getClass(), "optionMode", -164074275);
        setIntField(term62125, term62125.getClass(), "simpleOptionParam", 344170834);
        setIntField(term62125, term62125.getClass(), "adjustTiming", -305813067);
        setIntField(term62125, term62125.getClass(), "dispTiming", 956385164);
        setIntField(term62125, term62125.getClass(), "timingPos", -696090550);
        setIntField(term62125, term62125.getClass(), "ansVol", -453710990);
        setIntField(term62125, term62125.getClass(), "noteVol", -986333882);
        setIntField(term62125, term62125.getClass(), "dmgVol", -163205883);
        setIntField(term62125, term62125.getClass(), "appealFlame", -1916495224);
        setIntField(term62125, term62125.getClass(), "isFeverDisp", -409557637);
        setIntField(term62125, term62125.getClass(), "dispJudge", 1817886491);
        setIntField(term62125, term62125.getClass(), "judgePos", 252819186);
        setIntField(term62125, term62125.getClass(), "ratingGuard", -1730296941);
        setIntField(term62125, term62125.getClass(), "selectChara", 315600005);
        setIntField(term62125, term62125.getClass(), "sortType", 862341418);
        setIntField(term62125, term62125.getClass(), "filterGenre", 2068475777);
        setIntField(term62125, term62125.getClass(), "filterLevel", 865947404);
        setIntField(term62125, term62125.getClass(), "filterRank", -685471102);
        setIntField(term62125, term62125.getClass(), "filterVersion", -1392152397);
        setIntField(term62125, term62125.getClass(), "filterRec", 559505850);
        setIntField(term62125, term62125.getClass(), "filterFullCombo", 83945804);
        setIntField(term62125, term62125.getClass(), "filterAllPerfect", -1680670781);
        setIntField(term62125, term62125.getClass(), "filterDifficulty", -1210651793);
        setIntField(term62125, term62125.getClass(), "filterFullSync", 1725376668);
        setIntField(term62125, term62125.getClass(), "filterReMaster", 563995066);
        setIntField(term62125, term62125.getClass(), "filterMaxFever", -1143070528);
        setIntField(term62125, term62125.getClass(), "finalSelectId", -2013146103);
        setIntField(term62125, term62125.getClass(), "finalSelectCategory", 1831685253);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilterFullCombo", argTypes, term62125, args);
    }

};


