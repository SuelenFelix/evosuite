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

public class UserOption_setRatingGuard_144725260273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73531;
     Object term73749;

    public UserOption_setRatingGuard_144725260273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term73537 = new Long(1860789353508856614L);
        term73531 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term73533 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term73535 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term73551 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term73552 = newInstance(Class.forName("java.time.LocalDate"));
        Object term73556 = newInstance(Class.forName("java.time.LocalTime"));
        Object term73561 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term73562 = newInstance(Class.forName("java.time.LocalDate"));
        Object term73566 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term73531, term73531.getClass(), "id", 6921855906793748590L);
        setLongField(term73533, term73533.getClass(), "id", 7450182989722198450L);
        setLongField(term73535, term73535.getClass(), "id", 675601558105654203L);
        setField(term73535, term73535.getClass(), "extId", term73537);
        setField(term73535, term73535.getClass(), "luid", "vgHeAegSfV");
        setIntField(term73552, term73552.getClass(), "year", 2015);
        setShortField(term73552, term73552.getClass(), "month", (short) 1);
        setShortField(term73552, term73552.getClass(), "day", (short) 10);
        setField(term73551, term73551.getClass(), "date", term73552);
        setByteField(term73556, term73556.getClass(), "hour", (byte) 2);
        setByteField(term73556, term73556.getClass(), "minute", (byte) 48);
        setByteField(term73556, term73556.getClass(), "second", (byte) 41);
        setIntField(term73556, term73556.getClass(), "nano", 572611941);
        setField(term73551, term73551.getClass(), "time", term73556);
        setField(term73535, term73535.getClass(), "registerTime", term73551);
        setIntField(term73562, term73562.getClass(), "year", 2013);
        setShortField(term73562, term73562.getClass(), "month", (short) 10);
        setShortField(term73562, term73562.getClass(), "day", (short) 23);
        setField(term73561, term73561.getClass(), "date", term73562);
        setByteField(term73566, term73566.getClass(), "hour", (byte) 4);
        setByteField(term73566, term73566.getClass(), "minute", (byte) 33);
        setByteField(term73566, term73566.getClass(), "second", (byte) 51);
        setIntField(term73566, term73566.getClass(), "nano", 626320293);
        setField(term73561, term73561.getClass(), "time", term73566);
        setField(term73535, term73535.getClass(), "accessTime", term73561);
        setField(term73533, term73533.getClass(), "card", term73535);
        setIntField(term73533, term73533.getClass(), "lastDataVersion", -92217686);
        setField(term73533, term73533.getClass(), "userName", "qShfKMgKGs");
        setIntField(term73533, term73533.getClass(), "point", -1677257791);
        setIntField(term73533, term73533.getClass(), "totalPoint", 683954616);
        setIntField(term73533, term73533.getClass(), "iconId", -1408363971);
        setIntField(term73533, term73533.getClass(), "nameplateId", 48119406);
        setIntField(term73533, term73533.getClass(), "frameId", 123440622);
        setIntField(term73533, term73533.getClass(), "trophyId", -1768690545);
        setIntField(term73533, term73533.getClass(), "playCount", -1655526781);
        setIntField(term73533, term73533.getClass(), "playVsCount", -2080302114);
        setIntField(term73533, term73533.getClass(), "playSyncCount", -661400963);
        setIntField(term73533, term73533.getClass(), "winCount", -423080768);
        setIntField(term73533, term73533.getClass(), "helpCount", -78695612);
        setIntField(term73533, term73533.getClass(), "comboCount", 1199748690);
        setIntField(term73533, term73533.getClass(), "feverCount", -1982962318);
        setIntField(term73533, term73533.getClass(), "totalHiScore", 1593132746);
        setIntField(term73533, term73533.getClass(), "totalEasyHighScore", 1522102912);
        setIntField(term73533, term73533.getClass(), "totalBasicHighScore", -211973081);
        setIntField(term73533, term73533.getClass(), "totalAdvancedHighScore", 725283135);
        setIntField(term73533, term73533.getClass(), "totalExpertHighScore", -1719671182);
        setIntField(term73533, term73533.getClass(), "totalMasterHighScore", -538422081);
        setIntField(term73533, term73533.getClass(), "totalReMasterHighScore", -927155686);
        setIntField(term73533, term73533.getClass(), "totalHighSync", -1434757746);
        setIntField(term73533, term73533.getClass(), "totalEasySync", -1310339010);
        setIntField(term73533, term73533.getClass(), "totalBasicSync", -1447648390);
        setIntField(term73533, term73533.getClass(), "totalAdvancedSync", -1299088423);
        setIntField(term73533, term73533.getClass(), "totalExpertSync", 977296957);
        setIntField(term73533, term73533.getClass(), "totalMasterSync", 1586808362);
        setIntField(term73533, term73533.getClass(), "totalReMasterSync", -512737863);
        setIntField(term73533, term73533.getClass(), "playerRating", -1649958441);
        setIntField(term73533, term73533.getClass(), "highestRating", -1404279126);
        setIntField(term73533, term73533.getClass(), "rankAuthTailId", 493437846);
        setField(term73533, term73533.getClass(), "eventWatchedDate", "bLCaDnEUyS");
        setField(term73533, term73533.getClass(), "webLimitDate", "yfHcOCDrGy");
        setIntField(term73533, term73533.getClass(), "challengeTrackPhase", -909658371);
        setIntField(term73533, term73533.getClass(), "firstPlayBits", -1238691745);
        setField(term73533, term73533.getClass(), "lastPlayDate", "juKqILstcn");
        setIntField(term73533, term73533.getClass(), "lastPlaceId", 300313903);
        setField(term73533, term73533.getClass(), "lastPlaceName", "QSCQJRyiPa");
        setIntField(term73533, term73533.getClass(), "lastRegionId", 1575380093);
        setField(term73533, term73533.getClass(), "lastRegionName", "jPPOVoAOLQ");
        setField(term73533, term73533.getClass(), "lastClientId", "kZKzEkUFFI");
        setField(term73533, term73533.getClass(), "lastCountryCode", "dnYvoLZjCf");
        setIntField(term73533, term73533.getClass(), "eventPoint", 776765535);
        setIntField(term73533, term73533.getClass(), "totalLv", 723360748);
        setIntField(term73533, term73533.getClass(), "lastLoginBonusDay", -831759632);
        setIntField(term73533, term73533.getClass(), "lastSurvivalBonusDay", -156726292);
        setIntField(term73533, term73533.getClass(), "loginBonusLv", 1907884024);
        setField(term73531, term73531.getClass(), "user", term73533);
        setIntField(term73531, term73531.getClass(), "soudEffect", -799156553);
        setIntField(term73531, term73531.getClass(), "mirrorMode", -1923382317);
        setIntField(term73531, term73531.getClass(), "guideSpeed", 95911344);
        setIntField(term73531, term73531.getClass(), "bgInfo", -1645593981);
        setIntField(term73531, term73531.getClass(), "brightness", -1999330416);
        setIntField(term73531, term73531.getClass(), "isStarRot", -1659723057);
        setIntField(term73531, term73531.getClass(), "breakSe", 1685315409);
        setIntField(term73531, term73531.getClass(), "slideSe", -1697320127);
        setIntField(term73531, term73531.getClass(), "hardJudge", 90743281);
        setIntField(term73531, term73531.getClass(), "isTagJump", -369043862);
        setIntField(term73531, term73531.getClass(), "breakSeVol", 321344575);
        setIntField(term73531, term73531.getClass(), "slideSeVol", -1944164836);
        setIntField(term73531, term73531.getClass(), "isUpperDisp", -1481390257);
        setIntField(term73531, term73531.getClass(), "trackSkip", -550936196);
        setIntField(term73531, term73531.getClass(), "optionMode", -587355829);
        setIntField(term73531, term73531.getClass(), "simpleOptionParam", 640876559);
        setIntField(term73531, term73531.getClass(), "adjustTiming", 1516812723);
        setIntField(term73531, term73531.getClass(), "dispTiming", 1897673784);
        setIntField(term73531, term73531.getClass(), "timingPos", 379634520);
        setIntField(term73531, term73531.getClass(), "ansVol", 353352132);
        setIntField(term73531, term73531.getClass(), "noteVol", -367345783);
        setIntField(term73531, term73531.getClass(), "dmgVol", 2080342380);
        setIntField(term73531, term73531.getClass(), "appealFlame", -686275247);
        setIntField(term73531, term73531.getClass(), "isFeverDisp", -1216022402);
        setIntField(term73531, term73531.getClass(), "dispJudge", -520857416);
        setIntField(term73531, term73531.getClass(), "judgePos", -733551609);
        setIntField(term73531, term73531.getClass(), "ratingGuard", -1356258979);
        setIntField(term73531, term73531.getClass(), "selectChara", 55318841);
        setIntField(term73531, term73531.getClass(), "sortType", 2081805554);
        setIntField(term73531, term73531.getClass(), "filterGenre", 679008476);
        setIntField(term73531, term73531.getClass(), "filterLevel", 1853917521);
        setIntField(term73531, term73531.getClass(), "filterRank", 1330121230);
        setIntField(term73531, term73531.getClass(), "filterVersion", -216630452);
        setIntField(term73531, term73531.getClass(), "filterRec", 1361809573);
        setIntField(term73531, term73531.getClass(), "filterFullCombo", 1790505574);
        setIntField(term73531, term73531.getClass(), "filterAllPerfect", -1813277220);
        setIntField(term73531, term73531.getClass(), "filterDifficulty", -1095231728);
        setIntField(term73531, term73531.getClass(), "filterFullSync", 1735286345);
        setIntField(term73531, term73531.getClass(), "filterReMaster", 1644109867);
        setIntField(term73531, term73531.getClass(), "filterMaxFever", -465156572);
        setIntField(term73531, term73531.getClass(), "finalSelectId", -1400504878);
        setIntField(term73531, term73531.getClass(), "finalSelectCategory", -245021343);
        term73749 = new Integer(352873149);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term73749;
        callMethod(klass, "setRatingGuard", argTypes, term73531, args);
    }

};


