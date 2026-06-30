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

public class UserOption_getFilterAllPerfect_146724748038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62433;

    public UserOption_getFilterAllPerfect_146724748038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term62439 = new Long(-8338004844694486146L);
        term62433 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term62435 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term62437 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term62453 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62454 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62458 = newInstance(Class.forName("java.time.LocalTime"));
        Object term62463 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62464 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62468 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term62433, term62433.getClass(), "id", -3271370917942710167L);
        setLongField(term62435, term62435.getClass(), "id", -8928717808154338062L);
        setLongField(term62437, term62437.getClass(), "id", 4628458998884457238L);
        setField(term62437, term62437.getClass(), "extId", term62439);
        setField(term62437, term62437.getClass(), "luid", "ritBUyuuKt");
        setIntField(term62454, term62454.getClass(), "year", 2018);
        setShortField(term62454, term62454.getClass(), "month", (short) 12);
        setShortField(term62454, term62454.getClass(), "day", (short) 9);
        setField(term62453, term62453.getClass(), "date", term62454);
        setByteField(term62458, term62458.getClass(), "hour", (byte) 11);
        setByteField(term62458, term62458.getClass(), "minute", (byte) 17);
        setByteField(term62458, term62458.getClass(), "second", (byte) 16);
        setIntField(term62458, term62458.getClass(), "nano", 832353222);
        setField(term62453, term62453.getClass(), "time", term62458);
        setField(term62437, term62437.getClass(), "registerTime", term62453);
        setIntField(term62464, term62464.getClass(), "year", 2022);
        setShortField(term62464, term62464.getClass(), "month", (short) 10);
        setShortField(term62464, term62464.getClass(), "day", (short) 18);
        setField(term62463, term62463.getClass(), "date", term62464);
        setByteField(term62468, term62468.getClass(), "hour", (byte) 21);
        setByteField(term62468, term62468.getClass(), "minute", (byte) 51);
        setByteField(term62468, term62468.getClass(), "second", (byte) 0);
        setIntField(term62468, term62468.getClass(), "nano", 906699884);
        setField(term62463, term62463.getClass(), "time", term62468);
        setField(term62437, term62437.getClass(), "accessTime", term62463);
        setField(term62435, term62435.getClass(), "card", term62437);
        setIntField(term62435, term62435.getClass(), "lastDataVersion", 430196321);
        setField(term62435, term62435.getClass(), "userName", "YfziBBiPvL");
        setIntField(term62435, term62435.getClass(), "point", 211291160);
        setIntField(term62435, term62435.getClass(), "totalPoint", -317734451);
        setIntField(term62435, term62435.getClass(), "iconId", -1297214762);
        setIntField(term62435, term62435.getClass(), "nameplateId", -1749048132);
        setIntField(term62435, term62435.getClass(), "frameId", 201489622);
        setIntField(term62435, term62435.getClass(), "trophyId", -1557911649);
        setIntField(term62435, term62435.getClass(), "playCount", -2023283754);
        setIntField(term62435, term62435.getClass(), "playVsCount", 100828116);
        setIntField(term62435, term62435.getClass(), "playSyncCount", -1959805707);
        setIntField(term62435, term62435.getClass(), "winCount", 30813741);
        setIntField(term62435, term62435.getClass(), "helpCount", 2044603094);
        setIntField(term62435, term62435.getClass(), "comboCount", 726068108);
        setIntField(term62435, term62435.getClass(), "feverCount", 56736806);
        setIntField(term62435, term62435.getClass(), "totalHiScore", 496074088);
        setIntField(term62435, term62435.getClass(), "totalEasyHighScore", -785066858);
        setIntField(term62435, term62435.getClass(), "totalBasicHighScore", -1086354117);
        setIntField(term62435, term62435.getClass(), "totalAdvancedHighScore", -868397361);
        setIntField(term62435, term62435.getClass(), "totalExpertHighScore", 1974839599);
        setIntField(term62435, term62435.getClass(), "totalMasterHighScore", 975425511);
        setIntField(term62435, term62435.getClass(), "totalReMasterHighScore", 1662673275);
        setIntField(term62435, term62435.getClass(), "totalHighSync", 1782831447);
        setIntField(term62435, term62435.getClass(), "totalEasySync", -1997327027);
        setIntField(term62435, term62435.getClass(), "totalBasicSync", -1055738735);
        setIntField(term62435, term62435.getClass(), "totalAdvancedSync", 693030720);
        setIntField(term62435, term62435.getClass(), "totalExpertSync", -148509792);
        setIntField(term62435, term62435.getClass(), "totalMasterSync", 1306551461);
        setIntField(term62435, term62435.getClass(), "totalReMasterSync", -141757322);
        setIntField(term62435, term62435.getClass(), "playerRating", 507424812);
        setIntField(term62435, term62435.getClass(), "highestRating", -844787500);
        setIntField(term62435, term62435.getClass(), "rankAuthTailId", 917456811);
        setField(term62435, term62435.getClass(), "eventWatchedDate", "lNBaHEkYui");
        setField(term62435, term62435.getClass(), "webLimitDate", "BqxRCYZwmn");
        setIntField(term62435, term62435.getClass(), "challengeTrackPhase", 78789367);
        setIntField(term62435, term62435.getClass(), "firstPlayBits", -437074400);
        setField(term62435, term62435.getClass(), "lastPlayDate", "KHPDZjrXQp");
        setIntField(term62435, term62435.getClass(), "lastPlaceId", -1058580635);
        setField(term62435, term62435.getClass(), "lastPlaceName", "fpyUFzdCwQ");
        setIntField(term62435, term62435.getClass(), "lastRegionId", 1737604630);
        setField(term62435, term62435.getClass(), "lastRegionName", "OQqBkSGDem");
        setField(term62435, term62435.getClass(), "lastClientId", "vZzZOvsIYn");
        setField(term62435, term62435.getClass(), "lastCountryCode", "pAIBwhAbDu");
        setIntField(term62435, term62435.getClass(), "eventPoint", 1363336854);
        setIntField(term62435, term62435.getClass(), "totalLv", 649098774);
        setIntField(term62435, term62435.getClass(), "lastLoginBonusDay", 394089806);
        setIntField(term62435, term62435.getClass(), "lastSurvivalBonusDay", 1726963667);
        setIntField(term62435, term62435.getClass(), "loginBonusLv", 1456425179);
        setField(term62433, term62433.getClass(), "user", term62435);
        setIntField(term62433, term62433.getClass(), "soudEffect", -709895123);
        setIntField(term62433, term62433.getClass(), "mirrorMode", -1519932258);
        setIntField(term62433, term62433.getClass(), "guideSpeed", 1214021948);
        setIntField(term62433, term62433.getClass(), "bgInfo", -795117444);
        setIntField(term62433, term62433.getClass(), "brightness", -1609134843);
        setIntField(term62433, term62433.getClass(), "isStarRot", -637905866);
        setIntField(term62433, term62433.getClass(), "breakSe", 377538185);
        setIntField(term62433, term62433.getClass(), "slideSe", -2110389833);
        setIntField(term62433, term62433.getClass(), "hardJudge", 936155212);
        setIntField(term62433, term62433.getClass(), "isTagJump", -1890572080);
        setIntField(term62433, term62433.getClass(), "breakSeVol", -1341195642);
        setIntField(term62433, term62433.getClass(), "slideSeVol", -36425470);
        setIntField(term62433, term62433.getClass(), "isUpperDisp", -1224302439);
        setIntField(term62433, term62433.getClass(), "trackSkip", 1290766916);
        setIntField(term62433, term62433.getClass(), "optionMode", -2679674);
        setIntField(term62433, term62433.getClass(), "simpleOptionParam", 830157799);
        setIntField(term62433, term62433.getClass(), "adjustTiming", 532225144);
        setIntField(term62433, term62433.getClass(), "dispTiming", 1858406662);
        setIntField(term62433, term62433.getClass(), "timingPos", 991353239);
        setIntField(term62433, term62433.getClass(), "ansVol", 270036008);
        setIntField(term62433, term62433.getClass(), "noteVol", 316019909);
        setIntField(term62433, term62433.getClass(), "dmgVol", -253958157);
        setIntField(term62433, term62433.getClass(), "appealFlame", -491002634);
        setIntField(term62433, term62433.getClass(), "isFeverDisp", -651603671);
        setIntField(term62433, term62433.getClass(), "dispJudge", -1485310915);
        setIntField(term62433, term62433.getClass(), "judgePos", 931952204);
        setIntField(term62433, term62433.getClass(), "ratingGuard", -1752243259);
        setIntField(term62433, term62433.getClass(), "selectChara", 1622508431);
        setIntField(term62433, term62433.getClass(), "sortType", 288439377);
        setIntField(term62433, term62433.getClass(), "filterGenre", 122193410);
        setIntField(term62433, term62433.getClass(), "filterLevel", 1299505147);
        setIntField(term62433, term62433.getClass(), "filterRank", 1080293155);
        setIntField(term62433, term62433.getClass(), "filterVersion", -538823875);
        setIntField(term62433, term62433.getClass(), "filterRec", 2138473011);
        setIntField(term62433, term62433.getClass(), "filterFullCombo", 710964891);
        setIntField(term62433, term62433.getClass(), "filterAllPerfect", 597579516);
        setIntField(term62433, term62433.getClass(), "filterDifficulty", -1074602151);
        setIntField(term62433, term62433.getClass(), "filterFullSync", -1806046732);
        setIntField(term62433, term62433.getClass(), "filterReMaster", -244632280);
        setIntField(term62433, term62433.getClass(), "filterMaxFever", -364640291);
        setIntField(term62433, term62433.getClass(), "finalSelectId", 14738351);
        setIntField(term62433, term62433.getClass(), "finalSelectCategory", 2115515217);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilterAllPerfect", argTypes, term62433, args);
    }

};


