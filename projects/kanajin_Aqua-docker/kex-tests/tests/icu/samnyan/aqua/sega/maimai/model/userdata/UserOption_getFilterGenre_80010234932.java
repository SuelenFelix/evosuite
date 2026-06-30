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

public class UserOption_getFilterGenre_80010234932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60585;

    public UserOption_getFilterGenre_80010234932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term60591 = new Long(3381333711768010594L);
        term60585 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term60587 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term60589 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term60605 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term60606 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60610 = newInstance(Class.forName("java.time.LocalTime"));
        Object term60615 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term60616 = newInstance(Class.forName("java.time.LocalDate"));
        Object term60620 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term60585, term60585.getClass(), "id", 3161040540173678206L);
        setLongField(term60587, term60587.getClass(), "id", 8640463098965331396L);
        setLongField(term60589, term60589.getClass(), "id", -4136906775323730350L);
        setField(term60589, term60589.getClass(), "extId", term60591);
        setField(term60589, term60589.getClass(), "luid", "ZIgHysIFcL");
        setIntField(term60606, term60606.getClass(), "year", 2017);
        setShortField(term60606, term60606.getClass(), "month", (short) 11);
        setShortField(term60606, term60606.getClass(), "day", (short) 17);
        setField(term60605, term60605.getClass(), "date", term60606);
        setByteField(term60610, term60610.getClass(), "hour", (byte) 8);
        setByteField(term60610, term60610.getClass(), "minute", (byte) 54);
        setByteField(term60610, term60610.getClass(), "second", (byte) 50);
        setIntField(term60610, term60610.getClass(), "nano", 819857135);
        setField(term60605, term60605.getClass(), "time", term60610);
        setField(term60589, term60589.getClass(), "registerTime", term60605);
        setIntField(term60616, term60616.getClass(), "year", 2020);
        setShortField(term60616, term60616.getClass(), "month", (short) 2);
        setShortField(term60616, term60616.getClass(), "day", (short) 27);
        setField(term60615, term60615.getClass(), "date", term60616);
        setByteField(term60620, term60620.getClass(), "hour", (byte) 21);
        setByteField(term60620, term60620.getClass(), "minute", (byte) 35);
        setByteField(term60620, term60620.getClass(), "second", (byte) 42);
        setIntField(term60620, term60620.getClass(), "nano", 887239335);
        setField(term60615, term60615.getClass(), "time", term60620);
        setField(term60589, term60589.getClass(), "accessTime", term60615);
        setField(term60587, term60587.getClass(), "card", term60589);
        setIntField(term60587, term60587.getClass(), "lastDataVersion", -602021892);
        setField(term60587, term60587.getClass(), "userName", "ofSfQtWBjp");
        setIntField(term60587, term60587.getClass(), "point", 1020456975);
        setIntField(term60587, term60587.getClass(), "totalPoint", 164978650);
        setIntField(term60587, term60587.getClass(), "iconId", -1868859083);
        setIntField(term60587, term60587.getClass(), "nameplateId", -626522297);
        setIntField(term60587, term60587.getClass(), "frameId", 973355727);
        setIntField(term60587, term60587.getClass(), "trophyId", 1359931152);
        setIntField(term60587, term60587.getClass(), "playCount", -1310947684);
        setIntField(term60587, term60587.getClass(), "playVsCount", -690317377);
        setIntField(term60587, term60587.getClass(), "playSyncCount", -2109129464);
        setIntField(term60587, term60587.getClass(), "winCount", 1463240297);
        setIntField(term60587, term60587.getClass(), "helpCount", 1844126940);
        setIntField(term60587, term60587.getClass(), "comboCount", 1709305254);
        setIntField(term60587, term60587.getClass(), "feverCount", 572620811);
        setIntField(term60587, term60587.getClass(), "totalHiScore", -266178819);
        setIntField(term60587, term60587.getClass(), "totalEasyHighScore", -710586279);
        setIntField(term60587, term60587.getClass(), "totalBasicHighScore", -1876275628);
        setIntField(term60587, term60587.getClass(), "totalAdvancedHighScore", 818078390);
        setIntField(term60587, term60587.getClass(), "totalExpertHighScore", 216907802);
        setIntField(term60587, term60587.getClass(), "totalMasterHighScore", 799118971);
        setIntField(term60587, term60587.getClass(), "totalReMasterHighScore", 1833196618);
        setIntField(term60587, term60587.getClass(), "totalHighSync", -887554572);
        setIntField(term60587, term60587.getClass(), "totalEasySync", 817654648);
        setIntField(term60587, term60587.getClass(), "totalBasicSync", 1717336021);
        setIntField(term60587, term60587.getClass(), "totalAdvancedSync", -2070660986);
        setIntField(term60587, term60587.getClass(), "totalExpertSync", 666357129);
        setIntField(term60587, term60587.getClass(), "totalMasterSync", 2136565937);
        setIntField(term60587, term60587.getClass(), "totalReMasterSync", -891860855);
        setIntField(term60587, term60587.getClass(), "playerRating", -54467304);
        setIntField(term60587, term60587.getClass(), "highestRating", 340369679);
        setIntField(term60587, term60587.getClass(), "rankAuthTailId", -1824478225);
        setField(term60587, term60587.getClass(), "eventWatchedDate", "vkbIpZOlcY");
        setField(term60587, term60587.getClass(), "webLimitDate", "XbAeosZekH");
        setIntField(term60587, term60587.getClass(), "challengeTrackPhase", 60437225);
        setIntField(term60587, term60587.getClass(), "firstPlayBits", -719405836);
        setField(term60587, term60587.getClass(), "lastPlayDate", "EvGPvjswTz");
        setIntField(term60587, term60587.getClass(), "lastPlaceId", 1593612603);
        setField(term60587, term60587.getClass(), "lastPlaceName", "lbnnCkEZgE");
        setIntField(term60587, term60587.getClass(), "lastRegionId", 846762982);
        setField(term60587, term60587.getClass(), "lastRegionName", "YaWdTQZkTw");
        setField(term60587, term60587.getClass(), "lastClientId", "QqsjlsXtmm");
        setField(term60587, term60587.getClass(), "lastCountryCode", "FuWUjAYXxz");
        setIntField(term60587, term60587.getClass(), "eventPoint", 1526808674);
        setIntField(term60587, term60587.getClass(), "totalLv", 1554584842);
        setIntField(term60587, term60587.getClass(), "lastLoginBonusDay", -1678494364);
        setIntField(term60587, term60587.getClass(), "lastSurvivalBonusDay", 1388299013);
        setIntField(term60587, term60587.getClass(), "loginBonusLv", 198610069);
        setField(term60585, term60585.getClass(), "user", term60587);
        setIntField(term60585, term60585.getClass(), "soudEffect", -1228121453);
        setIntField(term60585, term60585.getClass(), "mirrorMode", 336049478);
        setIntField(term60585, term60585.getClass(), "guideSpeed", -450701337);
        setIntField(term60585, term60585.getClass(), "bgInfo", 381290182);
        setIntField(term60585, term60585.getClass(), "brightness", -259833170);
        setIntField(term60585, term60585.getClass(), "isStarRot", 794710786);
        setIntField(term60585, term60585.getClass(), "breakSe", -1974421233);
        setIntField(term60585, term60585.getClass(), "slideSe", -1476827783);
        setIntField(term60585, term60585.getClass(), "hardJudge", 895409963);
        setIntField(term60585, term60585.getClass(), "isTagJump", 1476827497);
        setIntField(term60585, term60585.getClass(), "breakSeVol", -2093258796);
        setIntField(term60585, term60585.getClass(), "slideSeVol", 444674138);
        setIntField(term60585, term60585.getClass(), "isUpperDisp", 1966779557);
        setIntField(term60585, term60585.getClass(), "trackSkip", -1632216455);
        setIntField(term60585, term60585.getClass(), "optionMode", 134123162);
        setIntField(term60585, term60585.getClass(), "simpleOptionParam", 1270482013);
        setIntField(term60585, term60585.getClass(), "adjustTiming", -304419371);
        setIntField(term60585, term60585.getClass(), "dispTiming", -1565193689);
        setIntField(term60585, term60585.getClass(), "timingPos", 954482242);
        setIntField(term60585, term60585.getClass(), "ansVol", -1145866715);
        setIntField(term60585, term60585.getClass(), "noteVol", -792401883);
        setIntField(term60585, term60585.getClass(), "dmgVol", -1513455266);
        setIntField(term60585, term60585.getClass(), "appealFlame", 1576242915);
        setIntField(term60585, term60585.getClass(), "isFeverDisp", -13617495);
        setIntField(term60585, term60585.getClass(), "dispJudge", -1165634173);
        setIntField(term60585, term60585.getClass(), "judgePos", -634884793);
        setIntField(term60585, term60585.getClass(), "ratingGuard", 1476138937);
        setIntField(term60585, term60585.getClass(), "selectChara", 1547525653);
        setIntField(term60585, term60585.getClass(), "sortType", 244752248);
        setIntField(term60585, term60585.getClass(), "filterGenre", -354095413);
        setIntField(term60585, term60585.getClass(), "filterLevel", 1842115165);
        setIntField(term60585, term60585.getClass(), "filterRank", 809042157);
        setIntField(term60585, term60585.getClass(), "filterVersion", 123189112);
        setIntField(term60585, term60585.getClass(), "filterRec", 1409363541);
        setIntField(term60585, term60585.getClass(), "filterFullCombo", -529449674);
        setIntField(term60585, term60585.getClass(), "filterAllPerfect", -2050329736);
        setIntField(term60585, term60585.getClass(), "filterDifficulty", 1971429499);
        setIntField(term60585, term60585.getClass(), "filterFullSync", 761194460);
        setIntField(term60585, term60585.getClass(), "filterReMaster", 2101170479);
        setIntField(term60585, term60585.getClass(), "filterMaxFever", 1016127323);
        setIntField(term60585, term60585.getClass(), "finalSelectId", -1424228916);
        setIntField(term60585, term60585.getClass(), "finalSelectCategory", -1330367712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilterGenre", argTypes, term60585, args);
    }

};


