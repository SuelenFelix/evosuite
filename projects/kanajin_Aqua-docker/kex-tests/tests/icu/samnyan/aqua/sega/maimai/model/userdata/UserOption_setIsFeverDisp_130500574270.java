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

public class UserOption_setIsFeverDisp_130500574270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72601;
     Object term72819;

    public UserOption_setIsFeverDisp_130500574270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term72607 = new Long(3666226122807672448L);
        term72601 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term72603 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term72605 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term72621 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term72622 = newInstance(Class.forName("java.time.LocalDate"));
        Object term72626 = newInstance(Class.forName("java.time.LocalTime"));
        Object term72631 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term72632 = newInstance(Class.forName("java.time.LocalDate"));
        Object term72636 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term72601, term72601.getClass(), "id", 3810487266967550400L);
        setLongField(term72603, term72603.getClass(), "id", 8965244485590834147L);
        setLongField(term72605, term72605.getClass(), "id", -4825509285016265943L);
        setField(term72605, term72605.getClass(), "extId", term72607);
        setField(term72605, term72605.getClass(), "luid", "CiPMRxGoHO");
        setIntField(term72622, term72622.getClass(), "year", 2010);
        setShortField(term72622, term72622.getClass(), "month", (short) 11);
        setShortField(term72622, term72622.getClass(), "day", (short) 12);
        setField(term72621, term72621.getClass(), "date", term72622);
        setByteField(term72626, term72626.getClass(), "hour", (byte) 19);
        setByteField(term72626, term72626.getClass(), "minute", (byte) 8);
        setByteField(term72626, term72626.getClass(), "second", (byte) 0);
        setIntField(term72626, term72626.getClass(), "nano", 224480743);
        setField(term72621, term72621.getClass(), "time", term72626);
        setField(term72605, term72605.getClass(), "registerTime", term72621);
        setIntField(term72632, term72632.getClass(), "year", 2023);
        setShortField(term72632, term72632.getClass(), "month", (short) 6);
        setShortField(term72632, term72632.getClass(), "day", (short) 11);
        setField(term72631, term72631.getClass(), "date", term72632);
        setByteField(term72636, term72636.getClass(), "hour", (byte) 20);
        setByteField(term72636, term72636.getClass(), "minute", (byte) 37);
        setByteField(term72636, term72636.getClass(), "second", (byte) 26);
        setIntField(term72636, term72636.getClass(), "nano", 879792435);
        setField(term72631, term72631.getClass(), "time", term72636);
        setField(term72605, term72605.getClass(), "accessTime", term72631);
        setField(term72603, term72603.getClass(), "card", term72605);
        setIntField(term72603, term72603.getClass(), "lastDataVersion", -550640214);
        setField(term72603, term72603.getClass(), "userName", "LauKpKmenw");
        setIntField(term72603, term72603.getClass(), "point", 221003516);
        setIntField(term72603, term72603.getClass(), "totalPoint", 694042457);
        setIntField(term72603, term72603.getClass(), "iconId", 415234643);
        setIntField(term72603, term72603.getClass(), "nameplateId", 1656688930);
        setIntField(term72603, term72603.getClass(), "frameId", -1343439629);
        setIntField(term72603, term72603.getClass(), "trophyId", -1203456842);
        setIntField(term72603, term72603.getClass(), "playCount", -638750860);
        setIntField(term72603, term72603.getClass(), "playVsCount", -1167375980);
        setIntField(term72603, term72603.getClass(), "playSyncCount", 577436768);
        setIntField(term72603, term72603.getClass(), "winCount", 555961091);
        setIntField(term72603, term72603.getClass(), "helpCount", -703576578);
        setIntField(term72603, term72603.getClass(), "comboCount", 206793849);
        setIntField(term72603, term72603.getClass(), "feverCount", 1243580461);
        setIntField(term72603, term72603.getClass(), "totalHiScore", 198372440);
        setIntField(term72603, term72603.getClass(), "totalEasyHighScore", -1531562967);
        setIntField(term72603, term72603.getClass(), "totalBasicHighScore", -1471282377);
        setIntField(term72603, term72603.getClass(), "totalAdvancedHighScore", -146555590);
        setIntField(term72603, term72603.getClass(), "totalExpertHighScore", 1355523589);
        setIntField(term72603, term72603.getClass(), "totalMasterHighScore", 170817693);
        setIntField(term72603, term72603.getClass(), "totalReMasterHighScore", -923853879);
        setIntField(term72603, term72603.getClass(), "totalHighSync", 419328039);
        setIntField(term72603, term72603.getClass(), "totalEasySync", 76790742);
        setIntField(term72603, term72603.getClass(), "totalBasicSync", 1540630124);
        setIntField(term72603, term72603.getClass(), "totalAdvancedSync", -1537736801);
        setIntField(term72603, term72603.getClass(), "totalExpertSync", -766206861);
        setIntField(term72603, term72603.getClass(), "totalMasterSync", 1576414103);
        setIntField(term72603, term72603.getClass(), "totalReMasterSync", 891075650);
        setIntField(term72603, term72603.getClass(), "playerRating", 456541378);
        setIntField(term72603, term72603.getClass(), "highestRating", -1836224314);
        setIntField(term72603, term72603.getClass(), "rankAuthTailId", 824141018);
        setField(term72603, term72603.getClass(), "eventWatchedDate", "TydzbTXvbY");
        setField(term72603, term72603.getClass(), "webLimitDate", "yNogNNecFu");
        setIntField(term72603, term72603.getClass(), "challengeTrackPhase", 278690523);
        setIntField(term72603, term72603.getClass(), "firstPlayBits", 272160059);
        setField(term72603, term72603.getClass(), "lastPlayDate", "tcaaotqgDF");
        setIntField(term72603, term72603.getClass(), "lastPlaceId", -19247990);
        setField(term72603, term72603.getClass(), "lastPlaceName", "bXInWdOeyi");
        setIntField(term72603, term72603.getClass(), "lastRegionId", 1986476279);
        setField(term72603, term72603.getClass(), "lastRegionName", "HdwopulXkf");
        setField(term72603, term72603.getClass(), "lastClientId", "FuCKfgAhpC");
        setField(term72603, term72603.getClass(), "lastCountryCode", "gqMysJhxfA");
        setIntField(term72603, term72603.getClass(), "eventPoint", -715837772);
        setIntField(term72603, term72603.getClass(), "totalLv", 1707313333);
        setIntField(term72603, term72603.getClass(), "lastLoginBonusDay", 789086911);
        setIntField(term72603, term72603.getClass(), "lastSurvivalBonusDay", 1249593171);
        setIntField(term72603, term72603.getClass(), "loginBonusLv", -860135164);
        setField(term72601, term72601.getClass(), "user", term72603);
        setIntField(term72601, term72601.getClass(), "soudEffect", 554710113);
        setIntField(term72601, term72601.getClass(), "mirrorMode", -1257507313);
        setIntField(term72601, term72601.getClass(), "guideSpeed", -418551323);
        setIntField(term72601, term72601.getClass(), "bgInfo", -1138154515);
        setIntField(term72601, term72601.getClass(), "brightness", -1149872871);
        setIntField(term72601, term72601.getClass(), "isStarRot", -1399922144);
        setIntField(term72601, term72601.getClass(), "breakSe", -480385546);
        setIntField(term72601, term72601.getClass(), "slideSe", 1949625839);
        setIntField(term72601, term72601.getClass(), "hardJudge", 444643271);
        setIntField(term72601, term72601.getClass(), "isTagJump", -979081687);
        setIntField(term72601, term72601.getClass(), "breakSeVol", 1127310631);
        setIntField(term72601, term72601.getClass(), "slideSeVol", 886454428);
        setIntField(term72601, term72601.getClass(), "isUpperDisp", -2146778104);
        setIntField(term72601, term72601.getClass(), "trackSkip", -645880633);
        setIntField(term72601, term72601.getClass(), "optionMode", 1698626232);
        setIntField(term72601, term72601.getClass(), "simpleOptionParam", -576137583);
        setIntField(term72601, term72601.getClass(), "adjustTiming", 1796558091);
        setIntField(term72601, term72601.getClass(), "dispTiming", 586321169);
        setIntField(term72601, term72601.getClass(), "timingPos", 807581958);
        setIntField(term72601, term72601.getClass(), "ansVol", 1362834596);
        setIntField(term72601, term72601.getClass(), "noteVol", 1654459583);
        setIntField(term72601, term72601.getClass(), "dmgVol", 193503465);
        setIntField(term72601, term72601.getClass(), "appealFlame", 581278549);
        setIntField(term72601, term72601.getClass(), "isFeverDisp", 2019752538);
        setIntField(term72601, term72601.getClass(), "dispJudge", -340054739);
        setIntField(term72601, term72601.getClass(), "judgePos", -1827976043);
        setIntField(term72601, term72601.getClass(), "ratingGuard", 1643366352);
        setIntField(term72601, term72601.getClass(), "selectChara", 1649851803);
        setIntField(term72601, term72601.getClass(), "sortType", 234521633);
        setIntField(term72601, term72601.getClass(), "filterGenre", 1854710669);
        setIntField(term72601, term72601.getClass(), "filterLevel", 40267213);
        setIntField(term72601, term72601.getClass(), "filterRank", 2130886056);
        setIntField(term72601, term72601.getClass(), "filterVersion", 978478352);
        setIntField(term72601, term72601.getClass(), "filterRec", -269052266);
        setIntField(term72601, term72601.getClass(), "filterFullCombo", -1776892844);
        setIntField(term72601, term72601.getClass(), "filterAllPerfect", 2113526092);
        setIntField(term72601, term72601.getClass(), "filterDifficulty", -991810251);
        setIntField(term72601, term72601.getClass(), "filterFullSync", -1006766321);
        setIntField(term72601, term72601.getClass(), "filterReMaster", 1271131361);
        setIntField(term72601, term72601.getClass(), "filterMaxFever", 79901777);
        setIntField(term72601, term72601.getClass(), "finalSelectId", 1704390140);
        setIntField(term72601, term72601.getClass(), "finalSelectCategory", 1542577034);
        term72819 = new Integer(1626193513);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term72819;
        callMethod(klass, "setIsFeverDisp", argTypes, term72601, args);
    }

};


