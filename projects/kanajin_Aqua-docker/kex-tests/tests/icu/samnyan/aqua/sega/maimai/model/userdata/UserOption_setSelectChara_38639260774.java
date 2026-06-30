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

public class UserOption_setSelectChara_38639260774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73841;
     Object term74059;

    public UserOption_setSelectChara_38639260774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term73847 = new Long(-7456852906235966771L);
        term73841 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term73843 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term73845 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term73861 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term73862 = newInstance(Class.forName("java.time.LocalDate"));
        Object term73866 = newInstance(Class.forName("java.time.LocalTime"));
        Object term73871 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term73872 = newInstance(Class.forName("java.time.LocalDate"));
        Object term73876 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term73841, term73841.getClass(), "id", -6481933642917183045L);
        setLongField(term73843, term73843.getClass(), "id", 2054808971423494757L);
        setLongField(term73845, term73845.getClass(), "id", 8734518435788772658L);
        setField(term73845, term73845.getClass(), "extId", term73847);
        setField(term73845, term73845.getClass(), "luid", "ZsvLlzqETk");
        setIntField(term73862, term73862.getClass(), "year", 2019);
        setShortField(term73862, term73862.getClass(), "month", (short) 8);
        setShortField(term73862, term73862.getClass(), "day", (short) 6);
        setField(term73861, term73861.getClass(), "date", term73862);
        setByteField(term73866, term73866.getClass(), "hour", (byte) 19);
        setByteField(term73866, term73866.getClass(), "minute", (byte) 30);
        setByteField(term73866, term73866.getClass(), "second", (byte) 36);
        setIntField(term73866, term73866.getClass(), "nano", 118147558);
        setField(term73861, term73861.getClass(), "time", term73866);
        setField(term73845, term73845.getClass(), "registerTime", term73861);
        setIntField(term73872, term73872.getClass(), "year", 2010);
        setShortField(term73872, term73872.getClass(), "month", (short) 11);
        setShortField(term73872, term73872.getClass(), "day", (short) 17);
        setField(term73871, term73871.getClass(), "date", term73872);
        setByteField(term73876, term73876.getClass(), "hour", (byte) 7);
        setByteField(term73876, term73876.getClass(), "minute", (byte) 36);
        setByteField(term73876, term73876.getClass(), "second", (byte) 53);
        setIntField(term73876, term73876.getClass(), "nano", 316643445);
        setField(term73871, term73871.getClass(), "time", term73876);
        setField(term73845, term73845.getClass(), "accessTime", term73871);
        setField(term73843, term73843.getClass(), "card", term73845);
        setIntField(term73843, term73843.getClass(), "lastDataVersion", 249757493);
        setField(term73843, term73843.getClass(), "userName", "DqrZwuHriF");
        setIntField(term73843, term73843.getClass(), "point", -2028608831);
        setIntField(term73843, term73843.getClass(), "totalPoint", 1831890168);
        setIntField(term73843, term73843.getClass(), "iconId", 560641076);
        setIntField(term73843, term73843.getClass(), "nameplateId", 2058467976);
        setIntField(term73843, term73843.getClass(), "frameId", -1355674818);
        setIntField(term73843, term73843.getClass(), "trophyId", 1133607570);
        setIntField(term73843, term73843.getClass(), "playCount", 1098498400);
        setIntField(term73843, term73843.getClass(), "playVsCount", 333972333);
        setIntField(term73843, term73843.getClass(), "playSyncCount", -963004238);
        setIntField(term73843, term73843.getClass(), "winCount", -1034086033);
        setIntField(term73843, term73843.getClass(), "helpCount", -1730877004);
        setIntField(term73843, term73843.getClass(), "comboCount", -44426778);
        setIntField(term73843, term73843.getClass(), "feverCount", 712891292);
        setIntField(term73843, term73843.getClass(), "totalHiScore", -1159253488);
        setIntField(term73843, term73843.getClass(), "totalEasyHighScore", 134959746);
        setIntField(term73843, term73843.getClass(), "totalBasicHighScore", 1720246226);
        setIntField(term73843, term73843.getClass(), "totalAdvancedHighScore", 1873634280);
        setIntField(term73843, term73843.getClass(), "totalExpertHighScore", 377263610);
        setIntField(term73843, term73843.getClass(), "totalMasterHighScore", 90974568);
        setIntField(term73843, term73843.getClass(), "totalReMasterHighScore", 1807676493);
        setIntField(term73843, term73843.getClass(), "totalHighSync", -305806713);
        setIntField(term73843, term73843.getClass(), "totalEasySync", 2061837241);
        setIntField(term73843, term73843.getClass(), "totalBasicSync", 1081840138);
        setIntField(term73843, term73843.getClass(), "totalAdvancedSync", -161898154);
        setIntField(term73843, term73843.getClass(), "totalExpertSync", 250703931);
        setIntField(term73843, term73843.getClass(), "totalMasterSync", -1894406361);
        setIntField(term73843, term73843.getClass(), "totalReMasterSync", 1742486272);
        setIntField(term73843, term73843.getClass(), "playerRating", -973045837);
        setIntField(term73843, term73843.getClass(), "highestRating", 134712754);
        setIntField(term73843, term73843.getClass(), "rankAuthTailId", -1259800083);
        setField(term73843, term73843.getClass(), "eventWatchedDate", "daaMmTkwOR");
        setField(term73843, term73843.getClass(), "webLimitDate", "WfJKDOFrUv");
        setIntField(term73843, term73843.getClass(), "challengeTrackPhase", 34131474);
        setIntField(term73843, term73843.getClass(), "firstPlayBits", -631704303);
        setField(term73843, term73843.getClass(), "lastPlayDate", "CbwfWaINrF");
        setIntField(term73843, term73843.getClass(), "lastPlaceId", -1635979050);
        setField(term73843, term73843.getClass(), "lastPlaceName", "AVCzSfXhGU");
        setIntField(term73843, term73843.getClass(), "lastRegionId", 70002762);
        setField(term73843, term73843.getClass(), "lastRegionName", "nTUCmQGFDE");
        setField(term73843, term73843.getClass(), "lastClientId", "rfFTBanxEx");
        setField(term73843, term73843.getClass(), "lastCountryCode", "MQJTCGewxT");
        setIntField(term73843, term73843.getClass(), "eventPoint", 389525410);
        setIntField(term73843, term73843.getClass(), "totalLv", 2112942190);
        setIntField(term73843, term73843.getClass(), "lastLoginBonusDay", 398996323);
        setIntField(term73843, term73843.getClass(), "lastSurvivalBonusDay", -440295917);
        setIntField(term73843, term73843.getClass(), "loginBonusLv", -780746391);
        setField(term73841, term73841.getClass(), "user", term73843);
        setIntField(term73841, term73841.getClass(), "soudEffect", -118585157);
        setIntField(term73841, term73841.getClass(), "mirrorMode", -1914726727);
        setIntField(term73841, term73841.getClass(), "guideSpeed", 123445242);
        setIntField(term73841, term73841.getClass(), "bgInfo", -1900798875);
        setIntField(term73841, term73841.getClass(), "brightness", 449339836);
        setIntField(term73841, term73841.getClass(), "isStarRot", -141504269);
        setIntField(term73841, term73841.getClass(), "breakSe", 831427858);
        setIntField(term73841, term73841.getClass(), "slideSe", -1304168942);
        setIntField(term73841, term73841.getClass(), "hardJudge", 539294515);
        setIntField(term73841, term73841.getClass(), "isTagJump", -689957065);
        setIntField(term73841, term73841.getClass(), "breakSeVol", 1191175314);
        setIntField(term73841, term73841.getClass(), "slideSeVol", -809294633);
        setIntField(term73841, term73841.getClass(), "isUpperDisp", 725438012);
        setIntField(term73841, term73841.getClass(), "trackSkip", -459474609);
        setIntField(term73841, term73841.getClass(), "optionMode", -729912360);
        setIntField(term73841, term73841.getClass(), "simpleOptionParam", 1127806915);
        setIntField(term73841, term73841.getClass(), "adjustTiming", 1677810938);
        setIntField(term73841, term73841.getClass(), "dispTiming", 1009836664);
        setIntField(term73841, term73841.getClass(), "timingPos", -618803023);
        setIntField(term73841, term73841.getClass(), "ansVol", -1722657416);
        setIntField(term73841, term73841.getClass(), "noteVol", -1744594829);
        setIntField(term73841, term73841.getClass(), "dmgVol", -1768664198);
        setIntField(term73841, term73841.getClass(), "appealFlame", 524170199);
        setIntField(term73841, term73841.getClass(), "isFeverDisp", 700143207);
        setIntField(term73841, term73841.getClass(), "dispJudge", -1290125128);
        setIntField(term73841, term73841.getClass(), "judgePos", 2090150392);
        setIntField(term73841, term73841.getClass(), "ratingGuard", 1308493754);
        setIntField(term73841, term73841.getClass(), "selectChara", 1144770109);
        setIntField(term73841, term73841.getClass(), "sortType", -420207799);
        setIntField(term73841, term73841.getClass(), "filterGenre", 6916361);
        setIntField(term73841, term73841.getClass(), "filterLevel", -1104408701);
        setIntField(term73841, term73841.getClass(), "filterRank", 1385068700);
        setIntField(term73841, term73841.getClass(), "filterVersion", -1278190666);
        setIntField(term73841, term73841.getClass(), "filterRec", 1513109254);
        setIntField(term73841, term73841.getClass(), "filterFullCombo", -1096037803);
        setIntField(term73841, term73841.getClass(), "filterAllPerfect", 1278328078);
        setIntField(term73841, term73841.getClass(), "filterDifficulty", 90110601);
        setIntField(term73841, term73841.getClass(), "filterFullSync", -1682406235);
        setIntField(term73841, term73841.getClass(), "filterReMaster", 446615253);
        setIntField(term73841, term73841.getClass(), "filterMaxFever", -101958090);
        setIntField(term73841, term73841.getClass(), "finalSelectId", 650819171);
        setIntField(term73841, term73841.getClass(), "finalSelectCategory", -755429050);
        term74059 = new Integer(1338628844);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term74059;
        callMethod(klass, "setSelectChara", argTypes, term73841, args);
    }

};


