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

public class UserOption_setFilterMaxFever_214668910286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77561;
     Object term77779;

    public UserOption_setFilterMaxFever_214668910286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term77567 = new Long(918397384129253729L);
        term77561 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term77563 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term77565 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term77581 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77582 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77586 = newInstance(Class.forName("java.time.LocalTime"));
        Object term77591 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term77592 = newInstance(Class.forName("java.time.LocalDate"));
        Object term77596 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term77561, term77561.getClass(), "id", -1379663556617181551L);
        setLongField(term77563, term77563.getClass(), "id", -927624000067769617L);
        setLongField(term77565, term77565.getClass(), "id", 2978561187278004830L);
        setField(term77565, term77565.getClass(), "extId", term77567);
        setField(term77565, term77565.getClass(), "luid", "jvQHxWAYDO");
        setIntField(term77582, term77582.getClass(), "year", 2013);
        setShortField(term77582, term77582.getClass(), "month", (short) 11);
        setShortField(term77582, term77582.getClass(), "day", (short) 15);
        setField(term77581, term77581.getClass(), "date", term77582);
        setByteField(term77586, term77586.getClass(), "hour", (byte) 16);
        setByteField(term77586, term77586.getClass(), "minute", (byte) 0);
        setByteField(term77586, term77586.getClass(), "second", (byte) 59);
        setIntField(term77586, term77586.getClass(), "nano", 823311700);
        setField(term77581, term77581.getClass(), "time", term77586);
        setField(term77565, term77565.getClass(), "registerTime", term77581);
        setIntField(term77592, term77592.getClass(), "year", 2017);
        setShortField(term77592, term77592.getClass(), "month", (short) 11);
        setShortField(term77592, term77592.getClass(), "day", (short) 30);
        setField(term77591, term77591.getClass(), "date", term77592);
        setByteField(term77596, term77596.getClass(), "hour", (byte) 23);
        setByteField(term77596, term77596.getClass(), "minute", (byte) 28);
        setByteField(term77596, term77596.getClass(), "second", (byte) 34);
        setIntField(term77596, term77596.getClass(), "nano", 684347789);
        setField(term77591, term77591.getClass(), "time", term77596);
        setField(term77565, term77565.getClass(), "accessTime", term77591);
        setField(term77563, term77563.getClass(), "card", term77565);
        setIntField(term77563, term77563.getClass(), "lastDataVersion", 743308436);
        setField(term77563, term77563.getClass(), "userName", "mntnLPfhte");
        setIntField(term77563, term77563.getClass(), "point", 1515447076);
        setIntField(term77563, term77563.getClass(), "totalPoint", 317488675);
        setIntField(term77563, term77563.getClass(), "iconId", -524898610);
        setIntField(term77563, term77563.getClass(), "nameplateId", 601799326);
        setIntField(term77563, term77563.getClass(), "frameId", -1480953254);
        setIntField(term77563, term77563.getClass(), "trophyId", -1805067162);
        setIntField(term77563, term77563.getClass(), "playCount", -95403687);
        setIntField(term77563, term77563.getClass(), "playVsCount", -803305808);
        setIntField(term77563, term77563.getClass(), "playSyncCount", -643136612);
        setIntField(term77563, term77563.getClass(), "winCount", -396252493);
        setIntField(term77563, term77563.getClass(), "helpCount", 2139168202);
        setIntField(term77563, term77563.getClass(), "comboCount", -38286841);
        setIntField(term77563, term77563.getClass(), "feverCount", 233315805);
        setIntField(term77563, term77563.getClass(), "totalHiScore", -390730722);
        setIntField(term77563, term77563.getClass(), "totalEasyHighScore", -2142953673);
        setIntField(term77563, term77563.getClass(), "totalBasicHighScore", -1743060227);
        setIntField(term77563, term77563.getClass(), "totalAdvancedHighScore", 1726641010);
        setIntField(term77563, term77563.getClass(), "totalExpertHighScore", -72451167);
        setIntField(term77563, term77563.getClass(), "totalMasterHighScore", -1623279591);
        setIntField(term77563, term77563.getClass(), "totalReMasterHighScore", -2002169681);
        setIntField(term77563, term77563.getClass(), "totalHighSync", 1033809638);
        setIntField(term77563, term77563.getClass(), "totalEasySync", -211436956);
        setIntField(term77563, term77563.getClass(), "totalBasicSync", -165855936);
        setIntField(term77563, term77563.getClass(), "totalAdvancedSync", -1903586081);
        setIntField(term77563, term77563.getClass(), "totalExpertSync", 2043296011);
        setIntField(term77563, term77563.getClass(), "totalMasterSync", -318415298);
        setIntField(term77563, term77563.getClass(), "totalReMasterSync", -2077725690);
        setIntField(term77563, term77563.getClass(), "playerRating", 2056474652);
        setIntField(term77563, term77563.getClass(), "highestRating", 1073925201);
        setIntField(term77563, term77563.getClass(), "rankAuthTailId", -298572677);
        setField(term77563, term77563.getClass(), "eventWatchedDate", "rIKLUjcdnZ");
        setField(term77563, term77563.getClass(), "webLimitDate", "MQaKKukkYD");
        setIntField(term77563, term77563.getClass(), "challengeTrackPhase", -1992187961);
        setIntField(term77563, term77563.getClass(), "firstPlayBits", -473392096);
        setField(term77563, term77563.getClass(), "lastPlayDate", "ThGyaiqnHq");
        setIntField(term77563, term77563.getClass(), "lastPlaceId", -322705062);
        setField(term77563, term77563.getClass(), "lastPlaceName", "AtEuOtHJrK");
        setIntField(term77563, term77563.getClass(), "lastRegionId", -463115041);
        setField(term77563, term77563.getClass(), "lastRegionName", "gzqokHWvLu");
        setField(term77563, term77563.getClass(), "lastClientId", "ANCcRsABGP");
        setField(term77563, term77563.getClass(), "lastCountryCode", "MBadwVIvwu");
        setIntField(term77563, term77563.getClass(), "eventPoint", 532572816);
        setIntField(term77563, term77563.getClass(), "totalLv", -326440840);
        setIntField(term77563, term77563.getClass(), "lastLoginBonusDay", -1936817971);
        setIntField(term77563, term77563.getClass(), "lastSurvivalBonusDay", -1537670934);
        setIntField(term77563, term77563.getClass(), "loginBonusLv", 2106033430);
        setField(term77561, term77561.getClass(), "user", term77563);
        setIntField(term77561, term77561.getClass(), "soudEffect", -1790157462);
        setIntField(term77561, term77561.getClass(), "mirrorMode", 1383655017);
        setIntField(term77561, term77561.getClass(), "guideSpeed", 674859870);
        setIntField(term77561, term77561.getClass(), "bgInfo", 1814186472);
        setIntField(term77561, term77561.getClass(), "brightness", 154798354);
        setIntField(term77561, term77561.getClass(), "isStarRot", -161324707);
        setIntField(term77561, term77561.getClass(), "breakSe", -458456066);
        setIntField(term77561, term77561.getClass(), "slideSe", 519712744);
        setIntField(term77561, term77561.getClass(), "hardJudge", 1517894350);
        setIntField(term77561, term77561.getClass(), "isTagJump", -211882537);
        setIntField(term77561, term77561.getClass(), "breakSeVol", -116485225);
        setIntField(term77561, term77561.getClass(), "slideSeVol", -1432160265);
        setIntField(term77561, term77561.getClass(), "isUpperDisp", -128667429);
        setIntField(term77561, term77561.getClass(), "trackSkip", -1155202085);
        setIntField(term77561, term77561.getClass(), "optionMode", -649874365);
        setIntField(term77561, term77561.getClass(), "simpleOptionParam", 102990319);
        setIntField(term77561, term77561.getClass(), "adjustTiming", 1616673856);
        setIntField(term77561, term77561.getClass(), "dispTiming", -1785694379);
        setIntField(term77561, term77561.getClass(), "timingPos", -130903572);
        setIntField(term77561, term77561.getClass(), "ansVol", -337347370);
        setIntField(term77561, term77561.getClass(), "noteVol", -565854486);
        setIntField(term77561, term77561.getClass(), "dmgVol", -655702672);
        setIntField(term77561, term77561.getClass(), "appealFlame", -713625841);
        setIntField(term77561, term77561.getClass(), "isFeverDisp", -774019505);
        setIntField(term77561, term77561.getClass(), "dispJudge", -1148868584);
        setIntField(term77561, term77561.getClass(), "judgePos", -774216920);
        setIntField(term77561, term77561.getClass(), "ratingGuard", -2024861246);
        setIntField(term77561, term77561.getClass(), "selectChara", -347239085);
        setIntField(term77561, term77561.getClass(), "sortType", -915057928);
        setIntField(term77561, term77561.getClass(), "filterGenre", 1172300062);
        setIntField(term77561, term77561.getClass(), "filterLevel", -1752924937);
        setIntField(term77561, term77561.getClass(), "filterRank", 284560417);
        setIntField(term77561, term77561.getClass(), "filterVersion", 1568828306);
        setIntField(term77561, term77561.getClass(), "filterRec", 1113651370);
        setIntField(term77561, term77561.getClass(), "filterFullCombo", 2135980546);
        setIntField(term77561, term77561.getClass(), "filterAllPerfect", 312798579);
        setIntField(term77561, term77561.getClass(), "filterDifficulty", 1892335077);
        setIntField(term77561, term77561.getClass(), "filterFullSync", -2119248330);
        setIntField(term77561, term77561.getClass(), "filterReMaster", -1354680744);
        setIntField(term77561, term77561.getClass(), "filterMaxFever", 1429270769);
        setIntField(term77561, term77561.getClass(), "finalSelectId", -910224561);
        setIntField(term77561, term77561.getClass(), "finalSelectCategory", 1215706313);
        term77779 = new Integer(1428978073);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term77779;
        callMethod(klass, "setFilterMaxFever", argTypes, term77561, args);
    }

};


