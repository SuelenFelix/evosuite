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

public class UserOption_setFilterRank_142983756278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75081;
     Object term75299;

    public UserOption_setFilterRank_142983756278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term75087 = new Long(-1635471392209071620L);
        term75081 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term75083 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term75085 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term75101 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75102 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75106 = newInstance(Class.forName("java.time.LocalTime"));
        Object term75111 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75112 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75116 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term75081, term75081.getClass(), "id", -6206610574921547811L);
        setLongField(term75083, term75083.getClass(), "id", -1625372334693179543L);
        setLongField(term75085, term75085.getClass(), "id", 3778691000276335279L);
        setField(term75085, term75085.getClass(), "extId", term75087);
        setField(term75085, term75085.getClass(), "luid", "PvtJhtGffh");
        setIntField(term75102, term75102.getClass(), "year", 2029);
        setShortField(term75102, term75102.getClass(), "month", (short) 6);
        setShortField(term75102, term75102.getClass(), "day", (short) 25);
        setField(term75101, term75101.getClass(), "date", term75102);
        setByteField(term75106, term75106.getClass(), "hour", (byte) 14);
        setByteField(term75106, term75106.getClass(), "minute", (byte) 19);
        setByteField(term75106, term75106.getClass(), "second", (byte) 52);
        setIntField(term75106, term75106.getClass(), "nano", 250367769);
        setField(term75101, term75101.getClass(), "time", term75106);
        setField(term75085, term75085.getClass(), "registerTime", term75101);
        setIntField(term75112, term75112.getClass(), "year", 2011);
        setShortField(term75112, term75112.getClass(), "month", (short) 11);
        setShortField(term75112, term75112.getClass(), "day", (short) 24);
        setField(term75111, term75111.getClass(), "date", term75112);
        setByteField(term75116, term75116.getClass(), "hour", (byte) 5);
        setByteField(term75116, term75116.getClass(), "minute", (byte) 45);
        setByteField(term75116, term75116.getClass(), "second", (byte) 11);
        setIntField(term75116, term75116.getClass(), "nano", 438339982);
        setField(term75111, term75111.getClass(), "time", term75116);
        setField(term75085, term75085.getClass(), "accessTime", term75111);
        setField(term75083, term75083.getClass(), "card", term75085);
        setIntField(term75083, term75083.getClass(), "lastDataVersion", -789382307);
        setField(term75083, term75083.getClass(), "userName", "KReGJTSQuY");
        setIntField(term75083, term75083.getClass(), "point", -473283632);
        setIntField(term75083, term75083.getClass(), "totalPoint", -493892140);
        setIntField(term75083, term75083.getClass(), "iconId", 1597517534);
        setIntField(term75083, term75083.getClass(), "nameplateId", 869571798);
        setIntField(term75083, term75083.getClass(), "frameId", -720552565);
        setIntField(term75083, term75083.getClass(), "trophyId", 2129936072);
        setIntField(term75083, term75083.getClass(), "playCount", 1143626407);
        setIntField(term75083, term75083.getClass(), "playVsCount", -64685993);
        setIntField(term75083, term75083.getClass(), "playSyncCount", 605536184);
        setIntField(term75083, term75083.getClass(), "winCount", 1480698574);
        setIntField(term75083, term75083.getClass(), "helpCount", -1305515548);
        setIntField(term75083, term75083.getClass(), "comboCount", -1607397836);
        setIntField(term75083, term75083.getClass(), "feverCount", -2006688545);
        setIntField(term75083, term75083.getClass(), "totalHiScore", -1336021455);
        setIntField(term75083, term75083.getClass(), "totalEasyHighScore", -1471789930);
        setIntField(term75083, term75083.getClass(), "totalBasicHighScore", -1834697019);
        setIntField(term75083, term75083.getClass(), "totalAdvancedHighScore", -1671714895);
        setIntField(term75083, term75083.getClass(), "totalExpertHighScore", 1748043344);
        setIntField(term75083, term75083.getClass(), "totalMasterHighScore", -1786413020);
        setIntField(term75083, term75083.getClass(), "totalReMasterHighScore", 1718492301);
        setIntField(term75083, term75083.getClass(), "totalHighSync", 1377469532);
        setIntField(term75083, term75083.getClass(), "totalEasySync", -1231607203);
        setIntField(term75083, term75083.getClass(), "totalBasicSync", -1927281961);
        setIntField(term75083, term75083.getClass(), "totalAdvancedSync", 1719745693);
        setIntField(term75083, term75083.getClass(), "totalExpertSync", 1396423456);
        setIntField(term75083, term75083.getClass(), "totalMasterSync", -2091570079);
        setIntField(term75083, term75083.getClass(), "totalReMasterSync", 2001463947);
        setIntField(term75083, term75083.getClass(), "playerRating", -1587664582);
        setIntField(term75083, term75083.getClass(), "highestRating", 672112674);
        setIntField(term75083, term75083.getClass(), "rankAuthTailId", -1442617726);
        setField(term75083, term75083.getClass(), "eventWatchedDate", "hqZmoXoMuS");
        setField(term75083, term75083.getClass(), "webLimitDate", "PUPJWadLXP");
        setIntField(term75083, term75083.getClass(), "challengeTrackPhase", 1394911907);
        setIntField(term75083, term75083.getClass(), "firstPlayBits", 1378933437);
        setField(term75083, term75083.getClass(), "lastPlayDate", "TBNsemBBKA");
        setIntField(term75083, term75083.getClass(), "lastPlaceId", -570039168);
        setField(term75083, term75083.getClass(), "lastPlaceName", "DpNDxwXKkX");
        setIntField(term75083, term75083.getClass(), "lastRegionId", -43796344);
        setField(term75083, term75083.getClass(), "lastRegionName", "uxoFwkPfXf");
        setField(term75083, term75083.getClass(), "lastClientId", "OoVnZTvxUt");
        setField(term75083, term75083.getClass(), "lastCountryCode", "MnqnyndkhF");
        setIntField(term75083, term75083.getClass(), "eventPoint", 297571645);
        setIntField(term75083, term75083.getClass(), "totalLv", 2088590010);
        setIntField(term75083, term75083.getClass(), "lastLoginBonusDay", -1799691099);
        setIntField(term75083, term75083.getClass(), "lastSurvivalBonusDay", 1473993117);
        setIntField(term75083, term75083.getClass(), "loginBonusLv", 1696678822);
        setField(term75081, term75081.getClass(), "user", term75083);
        setIntField(term75081, term75081.getClass(), "soudEffect", -372738716);
        setIntField(term75081, term75081.getClass(), "mirrorMode", 1314588637);
        setIntField(term75081, term75081.getClass(), "guideSpeed", 303137364);
        setIntField(term75081, term75081.getClass(), "bgInfo", 39424528);
        setIntField(term75081, term75081.getClass(), "brightness", -1798333136);
        setIntField(term75081, term75081.getClass(), "isStarRot", -534510293);
        setIntField(term75081, term75081.getClass(), "breakSe", -650104084);
        setIntField(term75081, term75081.getClass(), "slideSe", 849027714);
        setIntField(term75081, term75081.getClass(), "hardJudge", -504830793);
        setIntField(term75081, term75081.getClass(), "isTagJump", 1140138330);
        setIntField(term75081, term75081.getClass(), "breakSeVol", -1814783532);
        setIntField(term75081, term75081.getClass(), "slideSeVol", 1096850191);
        setIntField(term75081, term75081.getClass(), "isUpperDisp", -363973920);
        setIntField(term75081, term75081.getClass(), "trackSkip", -2124629423);
        setIntField(term75081, term75081.getClass(), "optionMode", 282123890);
        setIntField(term75081, term75081.getClass(), "simpleOptionParam", -370601142);
        setIntField(term75081, term75081.getClass(), "adjustTiming", 379917629);
        setIntField(term75081, term75081.getClass(), "dispTiming", 748860331);
        setIntField(term75081, term75081.getClass(), "timingPos", -315010017);
        setIntField(term75081, term75081.getClass(), "ansVol", -1573100296);
        setIntField(term75081, term75081.getClass(), "noteVol", 1850135733);
        setIntField(term75081, term75081.getClass(), "dmgVol", 708089991);
        setIntField(term75081, term75081.getClass(), "appealFlame", -151824010);
        setIntField(term75081, term75081.getClass(), "isFeverDisp", -1151904761);
        setIntField(term75081, term75081.getClass(), "dispJudge", 1659023460);
        setIntField(term75081, term75081.getClass(), "judgePos", 634488475);
        setIntField(term75081, term75081.getClass(), "ratingGuard", 1847355342);
        setIntField(term75081, term75081.getClass(), "selectChara", 819839423);
        setIntField(term75081, term75081.getClass(), "sortType", -1521589570);
        setIntField(term75081, term75081.getClass(), "filterGenre", 2082551439);
        setIntField(term75081, term75081.getClass(), "filterLevel", -1320937724);
        setIntField(term75081, term75081.getClass(), "filterRank", -1914675402);
        setIntField(term75081, term75081.getClass(), "filterVersion", 1190614266);
        setIntField(term75081, term75081.getClass(), "filterRec", 1145222536);
        setIntField(term75081, term75081.getClass(), "filterFullCombo", -161736323);
        setIntField(term75081, term75081.getClass(), "filterAllPerfect", 321295113);
        setIntField(term75081, term75081.getClass(), "filterDifficulty", 1168712877);
        setIntField(term75081, term75081.getClass(), "filterFullSync", -1701534718);
        setIntField(term75081, term75081.getClass(), "filterReMaster", -841124758);
        setIntField(term75081, term75081.getClass(), "filterMaxFever", -716929464);
        setIntField(term75081, term75081.getClass(), "finalSelectId", -1283170380);
        setIntField(term75081, term75081.getClass(), "finalSelectCategory", 1069682146);
        term75299 = new Integer(-271419315);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term75299;
        callMethod(klass, "setFilterRank", argTypes, term75081, args);
    }

};


