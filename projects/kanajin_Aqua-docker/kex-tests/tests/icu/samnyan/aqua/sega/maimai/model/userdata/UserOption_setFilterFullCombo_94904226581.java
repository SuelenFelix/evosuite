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
import java.lang.Integer;

public class UserOption_setFilterFullCombo_94904226581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76011;
     Object term76229;

    public UserOption_setFilterFullCombo_94904226581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term76017 = new Long(-9204303423581447271L);
        term76011 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term76013 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term76015 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term76031 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76032 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76036 = newInstance(Class.forName("java.time.LocalTime"));
        Object term76041 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76042 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76046 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term76011, term76011.getClass(), "id", -6265886087280835813L);
        setLongField(term76013, term76013.getClass(), "id", 8408467837292297525L);
        setLongField(term76015, term76015.getClass(), "id", -5157976075409724332L);
        setField(term76015, term76015.getClass(), "extId", term76017);
        setField(term76015, term76015.getClass(), "luid", "WVPSokrFPV");
        setIntField(term76032, term76032.getClass(), "year", 2010);
        setShortField(term76032, term76032.getClass(), "month", (short) 1);
        setShortField(term76032, term76032.getClass(), "day", (short) 25);
        setField(term76031, term76031.getClass(), "date", term76032);
        setByteField(term76036, term76036.getClass(), "hour", (byte) 2);
        setByteField(term76036, term76036.getClass(), "minute", (byte) 58);
        setByteField(term76036, term76036.getClass(), "second", (byte) 38);
        setIntField(term76036, term76036.getClass(), "nano", 91985442);
        setField(term76031, term76031.getClass(), "time", term76036);
        setField(term76015, term76015.getClass(), "registerTime", term76031);
        setIntField(term76042, term76042.getClass(), "year", 2016);
        setShortField(term76042, term76042.getClass(), "month", (short) 8);
        setShortField(term76042, term76042.getClass(), "day", (short) 5);
        setField(term76041, term76041.getClass(), "date", term76042);
        setByteField(term76046, term76046.getClass(), "hour", (byte) 0);
        setByteField(term76046, term76046.getClass(), "minute", (byte) 44);
        setByteField(term76046, term76046.getClass(), "second", (byte) 0);
        setIntField(term76046, term76046.getClass(), "nano", 108509);
        setField(term76041, term76041.getClass(), "time", term76046);
        setField(term76015, term76015.getClass(), "accessTime", term76041);
        setField(term76013, term76013.getClass(), "card", term76015);
        setIntField(term76013, term76013.getClass(), "lastDataVersion", 1366352792);
        setField(term76013, term76013.getClass(), "userName", "jELmrpQCNf");
        setIntField(term76013, term76013.getClass(), "point", -543646973);
        setIntField(term76013, term76013.getClass(), "totalPoint", 104724870);
        setIntField(term76013, term76013.getClass(), "iconId", -1649977050);
        setIntField(term76013, term76013.getClass(), "nameplateId", 629996726);
        setIntField(term76013, term76013.getClass(), "frameId", 43834381);
        setIntField(term76013, term76013.getClass(), "trophyId", -344626639);
        setIntField(term76013, term76013.getClass(), "playCount", 1543187413);
        setIntField(term76013, term76013.getClass(), "playVsCount", 911320014);
        setIntField(term76013, term76013.getClass(), "playSyncCount", -393953514);
        setIntField(term76013, term76013.getClass(), "winCount", 109796987);
        setIntField(term76013, term76013.getClass(), "helpCount", -2123134675);
        setIntField(term76013, term76013.getClass(), "comboCount", 1611645923);
        setIntField(term76013, term76013.getClass(), "feverCount", -2097613528);
        setIntField(term76013, term76013.getClass(), "totalHiScore", 1835910970);
        setIntField(term76013, term76013.getClass(), "totalEasyHighScore", -800791185);
        setIntField(term76013, term76013.getClass(), "totalBasicHighScore", 1772283447);
        setIntField(term76013, term76013.getClass(), "totalAdvancedHighScore", -461557612);
        setIntField(term76013, term76013.getClass(), "totalExpertHighScore", 210504323);
        setIntField(term76013, term76013.getClass(), "totalMasterHighScore", 1520176636);
        setIntField(term76013, term76013.getClass(), "totalReMasterHighScore", 1707887906);
        setIntField(term76013, term76013.getClass(), "totalHighSync", 566561079);
        setIntField(term76013, term76013.getClass(), "totalEasySync", 1136741540);
        setIntField(term76013, term76013.getClass(), "totalBasicSync", -1462079169);
        setIntField(term76013, term76013.getClass(), "totalAdvancedSync", 564422692);
        setIntField(term76013, term76013.getClass(), "totalExpertSync", -1598267137);
        setIntField(term76013, term76013.getClass(), "totalMasterSync", 954586200);
        setIntField(term76013, term76013.getClass(), "totalReMasterSync", -109805366);
        setIntField(term76013, term76013.getClass(), "playerRating", -744032962);
        setIntField(term76013, term76013.getClass(), "highestRating", 403901613);
        setIntField(term76013, term76013.getClass(), "rankAuthTailId", -1399456203);
        setField(term76013, term76013.getClass(), "eventWatchedDate", "NkjAcBXmmT");
        setField(term76013, term76013.getClass(), "webLimitDate", "KgtGJGInhu");
        setIntField(term76013, term76013.getClass(), "challengeTrackPhase", -1622044225);
        setIntField(term76013, term76013.getClass(), "firstPlayBits", 38757245);
        setField(term76013, term76013.getClass(), "lastPlayDate", "mVHDjrsMAV");
        setIntField(term76013, term76013.getClass(), "lastPlaceId", 2027144411);
        setField(term76013, term76013.getClass(), "lastPlaceName", "rjWnqcjYuU");
        setIntField(term76013, term76013.getClass(), "lastRegionId", -1280281752);
        setField(term76013, term76013.getClass(), "lastRegionName", "JhszTkUWCg");
        setField(term76013, term76013.getClass(), "lastClientId", "gfNPCeiULY");
        setField(term76013, term76013.getClass(), "lastCountryCode", "aUJLXfcWME");
        setIntField(term76013, term76013.getClass(), "eventPoint", -409018511);
        setIntField(term76013, term76013.getClass(), "totalLv", -1702868266);
        setIntField(term76013, term76013.getClass(), "lastLoginBonusDay", -1114987711);
        setIntField(term76013, term76013.getClass(), "lastSurvivalBonusDay", -235628635);
        setIntField(term76013, term76013.getClass(), "loginBonusLv", 1526568010);
        setField(term76011, term76011.getClass(), "user", term76013);
        setIntField(term76011, term76011.getClass(), "soudEffect", -162919111);
        setIntField(term76011, term76011.getClass(), "mirrorMode", 402632755);
        setIntField(term76011, term76011.getClass(), "guideSpeed", -1689951656);
        setIntField(term76011, term76011.getClass(), "bgInfo", -1441923858);
        setIntField(term76011, term76011.getClass(), "brightness", 22148319);
        setIntField(term76011, term76011.getClass(), "isStarRot", -473021331);
        setIntField(term76011, term76011.getClass(), "breakSe", -660334816);
        setIntField(term76011, term76011.getClass(), "slideSe", -1864873568);
        setIntField(term76011, term76011.getClass(), "hardJudge", 710697959);
        setIntField(term76011, term76011.getClass(), "isTagJump", -647347437);
        setIntField(term76011, term76011.getClass(), "breakSeVol", 658084221);
        setIntField(term76011, term76011.getClass(), "slideSeVol", -1984593436);
        setIntField(term76011, term76011.getClass(), "isUpperDisp", -1366169312);
        setIntField(term76011, term76011.getClass(), "trackSkip", 917532658);
        setIntField(term76011, term76011.getClass(), "optionMode", -906225721);
        setIntField(term76011, term76011.getClass(), "simpleOptionParam", 1029803622);
        setIntField(term76011, term76011.getClass(), "adjustTiming", 1547718184);
        setIntField(term76011, term76011.getClass(), "dispTiming", 1882154507);
        setIntField(term76011, term76011.getClass(), "timingPos", -1930761887);
        setIntField(term76011, term76011.getClass(), "ansVol", 1426685210);
        setIntField(term76011, term76011.getClass(), "noteVol", -581569867);
        setIntField(term76011, term76011.getClass(), "dmgVol", -987041198);
        setIntField(term76011, term76011.getClass(), "appealFlame", 1924660270);
        setIntField(term76011, term76011.getClass(), "isFeverDisp", 716661667);
        setIntField(term76011, term76011.getClass(), "dispJudge", 786893106);
        setIntField(term76011, term76011.getClass(), "judgePos", 137615027);
        setIntField(term76011, term76011.getClass(), "ratingGuard", -1236558524);
        setIntField(term76011, term76011.getClass(), "selectChara", -290487304);
        setIntField(term76011, term76011.getClass(), "sortType", 938576013);
        setIntField(term76011, term76011.getClass(), "filterGenre", -1555416747);
        setIntField(term76011, term76011.getClass(), "filterLevel", 135588064);
        setIntField(term76011, term76011.getClass(), "filterRank", 996710213);
        setIntField(term76011, term76011.getClass(), "filterVersion", -1618090161);
        setIntField(term76011, term76011.getClass(), "filterRec", 1629570081);
        setIntField(term76011, term76011.getClass(), "filterFullCombo", -2032841320);
        setIntField(term76011, term76011.getClass(), "filterAllPerfect", -402431218);
        setIntField(term76011, term76011.getClass(), "filterDifficulty", -1895304212);
        setIntField(term76011, term76011.getClass(), "filterFullSync", -1451313019);
        setIntField(term76011, term76011.getClass(), "filterReMaster", -2084270378);
        setIntField(term76011, term76011.getClass(), "filterMaxFever", -1060897638);
        setIntField(term76011, term76011.getClass(), "finalSelectId", 138174044);
        setIntField(term76011, term76011.getClass(), "finalSelectCategory", 2098822004);
        term76229 = new Integer(1036909188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term76229;
        callMethod(klass, "setFilterFullCombo", argTypes, term76011, args);
    }

};


