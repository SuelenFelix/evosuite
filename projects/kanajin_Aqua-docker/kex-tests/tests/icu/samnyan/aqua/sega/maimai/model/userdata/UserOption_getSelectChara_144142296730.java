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

public class UserOption_getSelectChara_144142296730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59969;

    public UserOption_getSelectChara_144142296730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term59975 = new Long(-1885698929232124806L);
        term59969 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term59971 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term59973 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term59989 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59990 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59994 = newInstance(Class.forName("java.time.LocalTime"));
        Object term59999 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term60000 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60004 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term59969, term59969.getClass(), "id", -6503611645609982617L);
        setLongField(term59971, term59971.getClass(), "id", -7574091101944828886L);
        setLongField(term59973, term59973.getClass(), "id", -6792339614909987294L);
        setField(term59973, term59973.getClass(), "extId", term59975);
        setField(term59973, term59973.getClass(), "luid", "iLsUPvsdys");
        setIntField(term59990, term59990.getClass(), "year", 2026);
        setShortField(term59990, term59990.getClass(), "month", (short) 9);
        setShortField(term59990, term59990.getClass(), "day", (short) 22);
        setField(term59989, term59989.getClass(), "date", term59990);
        setByteField(term59994, term59994.getClass(), "hour", (byte) 22);
        setByteField(term59994, term59994.getClass(), "minute", (byte) 25);
        setByteField(term59994, term59994.getClass(), "second", (byte) 25);
        setIntField(term59994, term59994.getClass(), "nano", 526433618);
        setField(term59989, term59989.getClass(), "time", term59994);
        setField(term59973, term59973.getClass(), "registerTime", term59989);
        setIntField(term60000, term60000.getClass(), "year", 2017);
        setShortField(term60000, term60000.getClass(), "month", (short) 8);
        setShortField(term60000, term60000.getClass(), "day", (short) 11);
        setField(term59999, term59999.getClass(), "date", term60000);
        setByteField(term60004, term60004.getClass(), "hour", (byte) 0);
        setByteField(term60004, term60004.getClass(), "minute", (byte) 12);
        setByteField(term60004, term60004.getClass(), "second", (byte) 8);
        setIntField(term60004, term60004.getClass(), "nano", 421599135);
        setField(term59999, term59999.getClass(), "time", term60004);
        setField(term59973, term59973.getClass(), "accessTime", term59999);
        setField(term59971, term59971.getClass(), "card", term59973);
        setIntField(term59971, term59971.getClass(), "lastDataVersion", 1625459515);
        setField(term59971, term59971.getClass(), "userName", "zsglFxvzdp");
        setIntField(term59971, term59971.getClass(), "point", -587695160);
        setIntField(term59971, term59971.getClass(), "totalPoint", 1418102078);
        setIntField(term59971, term59971.getClass(), "iconId", -1980653473);
        setIntField(term59971, term59971.getClass(), "nameplateId", -1681323081);
        setIntField(term59971, term59971.getClass(), "frameId", -365670276);
        setIntField(term59971, term59971.getClass(), "trophyId", 163534924);
        setIntField(term59971, term59971.getClass(), "playCount", 1575479969);
        setIntField(term59971, term59971.getClass(), "playVsCount", -583257141);
        setIntField(term59971, term59971.getClass(), "playSyncCount", -949536306);
        setIntField(term59971, term59971.getClass(), "winCount", -531020119);
        setIntField(term59971, term59971.getClass(), "helpCount", 257618497);
        setIntField(term59971, term59971.getClass(), "comboCount", -1053171626);
        setIntField(term59971, term59971.getClass(), "feverCount", -523085747);
        setIntField(term59971, term59971.getClass(), "totalHiScore", 417603895);
        setIntField(term59971, term59971.getClass(), "totalEasyHighScore", -1482676874);
        setIntField(term59971, term59971.getClass(), "totalBasicHighScore", -1157428137);
        setIntField(term59971, term59971.getClass(), "totalAdvancedHighScore", 1937997872);
        setIntField(term59971, term59971.getClass(), "totalExpertHighScore", -1961074437);
        setIntField(term59971, term59971.getClass(), "totalMasterHighScore", 2132751608);
        setIntField(term59971, term59971.getClass(), "totalReMasterHighScore", -739046971);
        setIntField(term59971, term59971.getClass(), "totalHighSync", 1735844763);
        setIntField(term59971, term59971.getClass(), "totalEasySync", -1276527088);
        setIntField(term59971, term59971.getClass(), "totalBasicSync", -1354264089);
        setIntField(term59971, term59971.getClass(), "totalAdvancedSync", -2041515106);
        setIntField(term59971, term59971.getClass(), "totalExpertSync", 699571489);
        setIntField(term59971, term59971.getClass(), "totalMasterSync", 2067513821);
        setIntField(term59971, term59971.getClass(), "totalReMasterSync", 1556440556);
        setIntField(term59971, term59971.getClass(), "playerRating", -436359872);
        setIntField(term59971, term59971.getClass(), "highestRating", -1959666038);
        setIntField(term59971, term59971.getClass(), "rankAuthTailId", 2128660618);
        setField(term59971, term59971.getClass(), "eventWatchedDate", "zhXtSGLnJR");
        setField(term59971, term59971.getClass(), "webLimitDate", "XlNXxsYNss");
        setIntField(term59971, term59971.getClass(), "challengeTrackPhase", -1354012258);
        setIntField(term59971, term59971.getClass(), "firstPlayBits", -734919944);
        setField(term59971, term59971.getClass(), "lastPlayDate", "jheRZWjuaB");
        setIntField(term59971, term59971.getClass(), "lastPlaceId", -91371563);
        setField(term59971, term59971.getClass(), "lastPlaceName", "IERziToRSQ");
        setIntField(term59971, term59971.getClass(), "lastRegionId", 4662703);
        setField(term59971, term59971.getClass(), "lastRegionName", "mDTRMwjBpc");
        setField(term59971, term59971.getClass(), "lastClientId", "sCLAuKoiVL");
        setField(term59971, term59971.getClass(), "lastCountryCode", "pFWiDEnVnU");
        setIntField(term59971, term59971.getClass(), "eventPoint", -2118566618);
        setIntField(term59971, term59971.getClass(), "totalLv", 1655029720);
        setIntField(term59971, term59971.getClass(), "lastLoginBonusDay", -793892224);
        setIntField(term59971, term59971.getClass(), "lastSurvivalBonusDay", 1440702542);
        setIntField(term59971, term59971.getClass(), "loginBonusLv", -943970524);
        setField(term59969, term59969.getClass(), "user", term59971);
        setIntField(term59969, term59969.getClass(), "soudEffect", 917621965);
        setIntField(term59969, term59969.getClass(), "mirrorMode", 749518086);
        setIntField(term59969, term59969.getClass(), "guideSpeed", -1596868093);
        setIntField(term59969, term59969.getClass(), "bgInfo", -1081975340);
        setIntField(term59969, term59969.getClass(), "brightness", 1804381424);
        setIntField(term59969, term59969.getClass(), "isStarRot", 347701928);
        setIntField(term59969, term59969.getClass(), "breakSe", -1540852359);
        setIntField(term59969, term59969.getClass(), "slideSe", 351747692);
        setIntField(term59969, term59969.getClass(), "hardJudge", 1960962844);
        setIntField(term59969, term59969.getClass(), "isTagJump", 1500998512);
        setIntField(term59969, term59969.getClass(), "breakSeVol", -961310688);
        setIntField(term59969, term59969.getClass(), "slideSeVol", -1837033783);
        setIntField(term59969, term59969.getClass(), "isUpperDisp", -33928000);
        setIntField(term59969, term59969.getClass(), "trackSkip", 1798598770);
        setIntField(term59969, term59969.getClass(), "optionMode", 1275192092);
        setIntField(term59969, term59969.getClass(), "simpleOptionParam", 798975305);
        setIntField(term59969, term59969.getClass(), "adjustTiming", -290202123);
        setIntField(term59969, term59969.getClass(), "dispTiming", -858738604);
        setIntField(term59969, term59969.getClass(), "timingPos", -1508450432);
        setIntField(term59969, term59969.getClass(), "ansVol", -1168985350);
        setIntField(term59969, term59969.getClass(), "noteVol", 736504530);
        setIntField(term59969, term59969.getClass(), "dmgVol", -1151578095);
        setIntField(term59969, term59969.getClass(), "appealFlame", -666674757);
        setIntField(term59969, term59969.getClass(), "isFeverDisp", -618304525);
        setIntField(term59969, term59969.getClass(), "dispJudge", 1975532031);
        setIntField(term59969, term59969.getClass(), "judgePos", -1548999687);
        setIntField(term59969, term59969.getClass(), "ratingGuard", 1593514066);
        setIntField(term59969, term59969.getClass(), "selectChara", 1329551874);
        setIntField(term59969, term59969.getClass(), "sortType", -378332024);
        setIntField(term59969, term59969.getClass(), "filterGenre", 77686011);
        setIntField(term59969, term59969.getClass(), "filterLevel", 132651471);
        setIntField(term59969, term59969.getClass(), "filterRank", 1315153287);
        setIntField(term59969, term59969.getClass(), "filterVersion", 760555251);
        setIntField(term59969, term59969.getClass(), "filterRec", -706677210);
        setIntField(term59969, term59969.getClass(), "filterFullCombo", -468204040);
        setIntField(term59969, term59969.getClass(), "filterAllPerfect", -1236041569);
        setIntField(term59969, term59969.getClass(), "filterDifficulty", -1932056684);
        setIntField(term59969, term59969.getClass(), "filterFullSync", -1418002835);
        setIntField(term59969, term59969.getClass(), "filterReMaster", -1020428732);
        setIntField(term59969, term59969.getClass(), "filterMaxFever", -1341267836);
        setIntField(term59969, term59969.getClass(), "finalSelectId", 895888926);
        setIntField(term59969, term59969.getClass(), "finalSelectCategory", -808723798);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelectChara", argTypes, term59969, args);
    }

};


