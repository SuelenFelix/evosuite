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

public class UserOption_setMirrorMode_59199122448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65781;
     Object term65999;

    public UserOption_setMirrorMode_59199122448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term65787 = new Long(-419800263764810394L);
        term65781 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term65783 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term65785 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term65801 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65802 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65806 = newInstance(Class.forName("java.time.LocalTime"));
        Object term65811 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term65812 = newInstance(Class.forName("java.time.LocalDate"));
        Object term65816 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term65781, term65781.getClass(), "id", -8605430501912680279L);
        setLongField(term65783, term65783.getClass(), "id", 2985226914509512766L);
        setLongField(term65785, term65785.getClass(), "id", 4041117732464806744L);
        setField(term65785, term65785.getClass(), "extId", term65787);
        setField(term65785, term65785.getClass(), "luid", "DEugGJIaYt");
        setIntField(term65802, term65802.getClass(), "year", 2027);
        setShortField(term65802, term65802.getClass(), "month", (short) 9);
        setShortField(term65802, term65802.getClass(), "day", (short) 19);
        setField(term65801, term65801.getClass(), "date", term65802);
        setByteField(term65806, term65806.getClass(), "hour", (byte) 13);
        setByteField(term65806, term65806.getClass(), "minute", (byte) 17);
        setByteField(term65806, term65806.getClass(), "second", (byte) 43);
        setIntField(term65806, term65806.getClass(), "nano", 359493485);
        setField(term65801, term65801.getClass(), "time", term65806);
        setField(term65785, term65785.getClass(), "registerTime", term65801);
        setIntField(term65812, term65812.getClass(), "year", 2028);
        setShortField(term65812, term65812.getClass(), "month", (short) 2);
        setShortField(term65812, term65812.getClass(), "day", (short) 3);
        setField(term65811, term65811.getClass(), "date", term65812);
        setByteField(term65816, term65816.getClass(), "hour", (byte) 14);
        setByteField(term65816, term65816.getClass(), "minute", (byte) 31);
        setByteField(term65816, term65816.getClass(), "second", (byte) 5);
        setIntField(term65816, term65816.getClass(), "nano", 770924836);
        setField(term65811, term65811.getClass(), "time", term65816);
        setField(term65785, term65785.getClass(), "accessTime", term65811);
        setField(term65783, term65783.getClass(), "card", term65785);
        setIntField(term65783, term65783.getClass(), "lastDataVersion", -495686058);
        setField(term65783, term65783.getClass(), "userName", "lzZIObOJmC");
        setIntField(term65783, term65783.getClass(), "point", 611713058);
        setIntField(term65783, term65783.getClass(), "totalPoint", -1354326923);
        setIntField(term65783, term65783.getClass(), "iconId", -986698677);
        setIntField(term65783, term65783.getClass(), "nameplateId", -1381534227);
        setIntField(term65783, term65783.getClass(), "frameId", -115921884);
        setIntField(term65783, term65783.getClass(), "trophyId", 69514589);
        setIntField(term65783, term65783.getClass(), "playCount", 1016576703);
        setIntField(term65783, term65783.getClass(), "playVsCount", -1816990337);
        setIntField(term65783, term65783.getClass(), "playSyncCount", -729317472);
        setIntField(term65783, term65783.getClass(), "winCount", 518527887);
        setIntField(term65783, term65783.getClass(), "helpCount", 1621425751);
        setIntField(term65783, term65783.getClass(), "comboCount", 1649760237);
        setIntField(term65783, term65783.getClass(), "feverCount", 1188626740);
        setIntField(term65783, term65783.getClass(), "totalHiScore", -114111309);
        setIntField(term65783, term65783.getClass(), "totalEasyHighScore", -2138943082);
        setIntField(term65783, term65783.getClass(), "totalBasicHighScore", -186268116);
        setIntField(term65783, term65783.getClass(), "totalAdvancedHighScore", -2082248803);
        setIntField(term65783, term65783.getClass(), "totalExpertHighScore", -1705126082);
        setIntField(term65783, term65783.getClass(), "totalMasterHighScore", -720862130);
        setIntField(term65783, term65783.getClass(), "totalReMasterHighScore", 1070677067);
        setIntField(term65783, term65783.getClass(), "totalHighSync", -2011581334);
        setIntField(term65783, term65783.getClass(), "totalEasySync", 1700393240);
        setIntField(term65783, term65783.getClass(), "totalBasicSync", -2014947462);
        setIntField(term65783, term65783.getClass(), "totalAdvancedSync", -719658316);
        setIntField(term65783, term65783.getClass(), "totalExpertSync", 303187441);
        setIntField(term65783, term65783.getClass(), "totalMasterSync", -1129294722);
        setIntField(term65783, term65783.getClass(), "totalReMasterSync", -1465687477);
        setIntField(term65783, term65783.getClass(), "playerRating", 1456965553);
        setIntField(term65783, term65783.getClass(), "highestRating", 891917447);
        setIntField(term65783, term65783.getClass(), "rankAuthTailId", 733611816);
        setField(term65783, term65783.getClass(), "eventWatchedDate", "RFmGKwvSgz");
        setField(term65783, term65783.getClass(), "webLimitDate", "EUEUhZglna");
        setIntField(term65783, term65783.getClass(), "challengeTrackPhase", 809743488);
        setIntField(term65783, term65783.getClass(), "firstPlayBits", -2061421262);
        setField(term65783, term65783.getClass(), "lastPlayDate", "znDPtjpZrG");
        setIntField(term65783, term65783.getClass(), "lastPlaceId", 729222890);
        setField(term65783, term65783.getClass(), "lastPlaceName", "uodLjxczjr");
        setIntField(term65783, term65783.getClass(), "lastRegionId", -1662914642);
        setField(term65783, term65783.getClass(), "lastRegionName", "HJLVBQAtGs");
        setField(term65783, term65783.getClass(), "lastClientId", "dxAxECMYEm");
        setField(term65783, term65783.getClass(), "lastCountryCode", "ylGHeywyhx");
        setIntField(term65783, term65783.getClass(), "eventPoint", -355284486);
        setIntField(term65783, term65783.getClass(), "totalLv", 1770512077);
        setIntField(term65783, term65783.getClass(), "lastLoginBonusDay", -187774462);
        setIntField(term65783, term65783.getClass(), "lastSurvivalBonusDay", -1557635802);
        setIntField(term65783, term65783.getClass(), "loginBonusLv", 863085455);
        setField(term65781, term65781.getClass(), "user", term65783);
        setIntField(term65781, term65781.getClass(), "soudEffect", -825201659);
        setIntField(term65781, term65781.getClass(), "mirrorMode", 1694627785);
        setIntField(term65781, term65781.getClass(), "guideSpeed", -1218124526);
        setIntField(term65781, term65781.getClass(), "bgInfo", 2095913246);
        setIntField(term65781, term65781.getClass(), "brightness", 2032378574);
        setIntField(term65781, term65781.getClass(), "isStarRot", -532981370);
        setIntField(term65781, term65781.getClass(), "breakSe", -634537095);
        setIntField(term65781, term65781.getClass(), "slideSe", -1818314526);
        setIntField(term65781, term65781.getClass(), "hardJudge", -186468784);
        setIntField(term65781, term65781.getClass(), "isTagJump", -126607040);
        setIntField(term65781, term65781.getClass(), "breakSeVol", 270133587);
        setIntField(term65781, term65781.getClass(), "slideSeVol", -559167477);
        setIntField(term65781, term65781.getClass(), "isUpperDisp", -647004693);
        setIntField(term65781, term65781.getClass(), "trackSkip", -305072527);
        setIntField(term65781, term65781.getClass(), "optionMode", 159778089);
        setIntField(term65781, term65781.getClass(), "simpleOptionParam", -69519222);
        setIntField(term65781, term65781.getClass(), "adjustTiming", -711812997);
        setIntField(term65781, term65781.getClass(), "dispTiming", 880677370);
        setIntField(term65781, term65781.getClass(), "timingPos", 1062818301);
        setIntField(term65781, term65781.getClass(), "ansVol", 1265936428);
        setIntField(term65781, term65781.getClass(), "noteVol", 352976860);
        setIntField(term65781, term65781.getClass(), "dmgVol", 1084007767);
        setIntField(term65781, term65781.getClass(), "appealFlame", 1304651878);
        setIntField(term65781, term65781.getClass(), "isFeverDisp", 505920746);
        setIntField(term65781, term65781.getClass(), "dispJudge", -1636904784);
        setIntField(term65781, term65781.getClass(), "judgePos", 323158291);
        setIntField(term65781, term65781.getClass(), "ratingGuard", 717803007);
        setIntField(term65781, term65781.getClass(), "selectChara", -2028178818);
        setIntField(term65781, term65781.getClass(), "sortType", 1179208287);
        setIntField(term65781, term65781.getClass(), "filterGenre", 766783102);
        setIntField(term65781, term65781.getClass(), "filterLevel", 1928797954);
        setIntField(term65781, term65781.getClass(), "filterRank", 2101488953);
        setIntField(term65781, term65781.getClass(), "filterVersion", 471223135);
        setIntField(term65781, term65781.getClass(), "filterRec", 1896542364);
        setIntField(term65781, term65781.getClass(), "filterFullCombo", -1056985553);
        setIntField(term65781, term65781.getClass(), "filterAllPerfect", 838641171);
        setIntField(term65781, term65781.getClass(), "filterDifficulty", -1468936780);
        setIntField(term65781, term65781.getClass(), "filterFullSync", 64970847);
        setIntField(term65781, term65781.getClass(), "filterReMaster", 1468120818);
        setIntField(term65781, term65781.getClass(), "filterMaxFever", -575994877);
        setIntField(term65781, term65781.getClass(), "finalSelectId", -1798428742);
        setIntField(term65781, term65781.getClass(), "finalSelectCategory", 204314649);
        term65999 = new Integer(758889924);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term65999;
        callMethod(klass, "setMirrorMode", argTypes, term65781, args);
    }

};


