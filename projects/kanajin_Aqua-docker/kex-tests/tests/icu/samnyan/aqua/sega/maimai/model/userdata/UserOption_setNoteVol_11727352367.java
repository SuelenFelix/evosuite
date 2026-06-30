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

public class UserOption_setNoteVol_11727352367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71671;
     Object term71889;

    public UserOption_setNoteVol_11727352367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term71677 = new Long(868503089567085985L);
        term71671 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term71673 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term71675 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term71691 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term71692 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71696 = newInstance(Class.forName("java.time.LocalTime"));
        Object term71701 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term71702 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71706 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term71671, term71671.getClass(), "id", -1211273460223868511L);
        setLongField(term71673, term71673.getClass(), "id", -8172564209423941839L);
        setLongField(term71675, term71675.getClass(), "id", -4561371668792438386L);
        setField(term71675, term71675.getClass(), "extId", term71677);
        setField(term71675, term71675.getClass(), "luid", "wcTeSHCZwz");
        setIntField(term71692, term71692.getClass(), "year", 2026);
        setShortField(term71692, term71692.getClass(), "month", (short) 10);
        setShortField(term71692, term71692.getClass(), "day", (short) 15);
        setField(term71691, term71691.getClass(), "date", term71692);
        setByteField(term71696, term71696.getClass(), "hour", (byte) 15);
        setByteField(term71696, term71696.getClass(), "minute", (byte) 25);
        setByteField(term71696, term71696.getClass(), "second", (byte) 12);
        setIntField(term71696, term71696.getClass(), "nano", 467763340);
        setField(term71691, term71691.getClass(), "time", term71696);
        setField(term71675, term71675.getClass(), "registerTime", term71691);
        setIntField(term71702, term71702.getClass(), "year", 2023);
        setShortField(term71702, term71702.getClass(), "month", (short) 1);
        setShortField(term71702, term71702.getClass(), "day", (short) 25);
        setField(term71701, term71701.getClass(), "date", term71702);
        setByteField(term71706, term71706.getClass(), "hour", (byte) 2);
        setByteField(term71706, term71706.getClass(), "minute", (byte) 13);
        setByteField(term71706, term71706.getClass(), "second", (byte) 2);
        setIntField(term71706, term71706.getClass(), "nano", 723644716);
        setField(term71701, term71701.getClass(), "time", term71706);
        setField(term71675, term71675.getClass(), "accessTime", term71701);
        setField(term71673, term71673.getClass(), "card", term71675);
        setIntField(term71673, term71673.getClass(), "lastDataVersion", 891892433);
        setField(term71673, term71673.getClass(), "userName", "fxxnbYOiZZ");
        setIntField(term71673, term71673.getClass(), "point", 164865868);
        setIntField(term71673, term71673.getClass(), "totalPoint", -2067928979);
        setIntField(term71673, term71673.getClass(), "iconId", 1481758219);
        setIntField(term71673, term71673.getClass(), "nameplateId", 1349957503);
        setIntField(term71673, term71673.getClass(), "frameId", 99967254);
        setIntField(term71673, term71673.getClass(), "trophyId", -796705964);
        setIntField(term71673, term71673.getClass(), "playCount", -489945946);
        setIntField(term71673, term71673.getClass(), "playVsCount", -1521003193);
        setIntField(term71673, term71673.getClass(), "playSyncCount", -1766675944);
        setIntField(term71673, term71673.getClass(), "winCount", -1854430994);
        setIntField(term71673, term71673.getClass(), "helpCount", -992967791);
        setIntField(term71673, term71673.getClass(), "comboCount", -942995580);
        setIntField(term71673, term71673.getClass(), "feverCount", -1062858947);
        setIntField(term71673, term71673.getClass(), "totalHiScore", 1335767564);
        setIntField(term71673, term71673.getClass(), "totalEasyHighScore", -1976451322);
        setIntField(term71673, term71673.getClass(), "totalBasicHighScore", -1406224137);
        setIntField(term71673, term71673.getClass(), "totalAdvancedHighScore", -1950232603);
        setIntField(term71673, term71673.getClass(), "totalExpertHighScore", 438976859);
        setIntField(term71673, term71673.getClass(), "totalMasterHighScore", -1677003709);
        setIntField(term71673, term71673.getClass(), "totalReMasterHighScore", 241273595);
        setIntField(term71673, term71673.getClass(), "totalHighSync", 672655113);
        setIntField(term71673, term71673.getClass(), "totalEasySync", -1911449677);
        setIntField(term71673, term71673.getClass(), "totalBasicSync", -458794680);
        setIntField(term71673, term71673.getClass(), "totalAdvancedSync", -1986339842);
        setIntField(term71673, term71673.getClass(), "totalExpertSync", -390659422);
        setIntField(term71673, term71673.getClass(), "totalMasterSync", -191520335);
        setIntField(term71673, term71673.getClass(), "totalReMasterSync", 1800240350);
        setIntField(term71673, term71673.getClass(), "playerRating", -1577729748);
        setIntField(term71673, term71673.getClass(), "highestRating", -313193141);
        setIntField(term71673, term71673.getClass(), "rankAuthTailId", -742825342);
        setField(term71673, term71673.getClass(), "eventWatchedDate", "CTnRYaYXia");
        setField(term71673, term71673.getClass(), "webLimitDate", "SUIYUFtCCe");
        setIntField(term71673, term71673.getClass(), "challengeTrackPhase", -2112740645);
        setIntField(term71673, term71673.getClass(), "firstPlayBits", -1077024916);
        setField(term71673, term71673.getClass(), "lastPlayDate", "eKCrPCkedw");
        setIntField(term71673, term71673.getClass(), "lastPlaceId", -1813631452);
        setField(term71673, term71673.getClass(), "lastPlaceName", "VAFSknHLsZ");
        setIntField(term71673, term71673.getClass(), "lastRegionId", -1818017791);
        setField(term71673, term71673.getClass(), "lastRegionName", "MamzBtwhiz");
        setField(term71673, term71673.getClass(), "lastClientId", "wVOypfVLsP");
        setField(term71673, term71673.getClass(), "lastCountryCode", "pEazBcUUWX");
        setIntField(term71673, term71673.getClass(), "eventPoint", -2008670044);
        setIntField(term71673, term71673.getClass(), "totalLv", 1851068303);
        setIntField(term71673, term71673.getClass(), "lastLoginBonusDay", 63529722);
        setIntField(term71673, term71673.getClass(), "lastSurvivalBonusDay", 608631812);
        setIntField(term71673, term71673.getClass(), "loginBonusLv", -616104461);
        setField(term71671, term71671.getClass(), "user", term71673);
        setIntField(term71671, term71671.getClass(), "soudEffect", -2121819706);
        setIntField(term71671, term71671.getClass(), "mirrorMode", 857872548);
        setIntField(term71671, term71671.getClass(), "guideSpeed", -140153101);
        setIntField(term71671, term71671.getClass(), "bgInfo", -38642214);
        setIntField(term71671, term71671.getClass(), "brightness", 1058657365);
        setIntField(term71671, term71671.getClass(), "isStarRot", 780690863);
        setIntField(term71671, term71671.getClass(), "breakSe", 599054233);
        setIntField(term71671, term71671.getClass(), "slideSe", 779645960);
        setIntField(term71671, term71671.getClass(), "hardJudge", 1499398534);
        setIntField(term71671, term71671.getClass(), "isTagJump", -1850750147);
        setIntField(term71671, term71671.getClass(), "breakSeVol", 484299838);
        setIntField(term71671, term71671.getClass(), "slideSeVol", 239733321);
        setIntField(term71671, term71671.getClass(), "isUpperDisp", -976860961);
        setIntField(term71671, term71671.getClass(), "trackSkip", -1891721175);
        setIntField(term71671, term71671.getClass(), "optionMode", -1809426188);
        setIntField(term71671, term71671.getClass(), "simpleOptionParam", -1096623533);
        setIntField(term71671, term71671.getClass(), "adjustTiming", -107411562);
        setIntField(term71671, term71671.getClass(), "dispTiming", -1928426897);
        setIntField(term71671, term71671.getClass(), "timingPos", -1947912399);
        setIntField(term71671, term71671.getClass(), "ansVol", 1383677886);
        setIntField(term71671, term71671.getClass(), "noteVol", 1382626372);
        setIntField(term71671, term71671.getClass(), "dmgVol", -894391605);
        setIntField(term71671, term71671.getClass(), "appealFlame", 1886259870);
        setIntField(term71671, term71671.getClass(), "isFeverDisp", -240613804);
        setIntField(term71671, term71671.getClass(), "dispJudge", -883570215);
        setIntField(term71671, term71671.getClass(), "judgePos", 949378719);
        setIntField(term71671, term71671.getClass(), "ratingGuard", -925982931);
        setIntField(term71671, term71671.getClass(), "selectChara", -1246013301);
        setIntField(term71671, term71671.getClass(), "sortType", 943091152);
        setIntField(term71671, term71671.getClass(), "filterGenre", 820624409);
        setIntField(term71671, term71671.getClass(), "filterLevel", 330572913);
        setIntField(term71671, term71671.getClass(), "filterRank", -854584753);
        setIntField(term71671, term71671.getClass(), "filterVersion", 589219235);
        setIntField(term71671, term71671.getClass(), "filterRec", 640625812);
        setIntField(term71671, term71671.getClass(), "filterFullCombo", 1595916841);
        setIntField(term71671, term71671.getClass(), "filterAllPerfect", -1599538173);
        setIntField(term71671, term71671.getClass(), "filterDifficulty", -625135745);
        setIntField(term71671, term71671.getClass(), "filterFullSync", 964413759);
        setIntField(term71671, term71671.getClass(), "filterReMaster", -1275633123);
        setIntField(term71671, term71671.getClass(), "filterMaxFever", -1651068471);
        setIntField(term71671, term71671.getClass(), "finalSelectId", -132132293);
        setIntField(term71671, term71671.getClass(), "finalSelectCategory", -2002625028);
        term71889 = new Integer(838386477);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term71889;
        callMethod(klass, "setNoteVol", argTypes, term71671, args);
    }

};


