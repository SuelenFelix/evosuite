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

public class UserOption_setAnsVol_173505356566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71361;
     Object term71579;

    public UserOption_setAnsVol_173505356566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term71367 = new Long(-7406618974062419277L);
        term71361 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term71363 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term71365 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term71381 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term71382 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71386 = newInstance(Class.forName("java.time.LocalTime"));
        Object term71391 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term71392 = newInstance(Class.forName("java.time.LocalDate"));
        Object term71396 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term71361, term71361.getClass(), "id", 6252795312796363233L);
        setLongField(term71363, term71363.getClass(), "id", 3968143267572761057L);
        setLongField(term71365, term71365.getClass(), "id", 2712394591642260550L);
        setField(term71365, term71365.getClass(), "extId", term71367);
        setField(term71365, term71365.getClass(), "luid", "KyUmXHRrED");
        setIntField(term71382, term71382.getClass(), "year", 2027);
        setShortField(term71382, term71382.getClass(), "month", (short) 1);
        setShortField(term71382, term71382.getClass(), "day", (short) 10);
        setField(term71381, term71381.getClass(), "date", term71382);
        setByteField(term71386, term71386.getClass(), "hour", (byte) 8);
        setByteField(term71386, term71386.getClass(), "minute", (byte) 34);
        setByteField(term71386, term71386.getClass(), "second", (byte) 28);
        setIntField(term71386, term71386.getClass(), "nano", 703673031);
        setField(term71381, term71381.getClass(), "time", term71386);
        setField(term71365, term71365.getClass(), "registerTime", term71381);
        setIntField(term71392, term71392.getClass(), "year", 2014);
        setShortField(term71392, term71392.getClass(), "month", (short) 5);
        setShortField(term71392, term71392.getClass(), "day", (short) 30);
        setField(term71391, term71391.getClass(), "date", term71392);
        setByteField(term71396, term71396.getClass(), "hour", (byte) 10);
        setByteField(term71396, term71396.getClass(), "minute", (byte) 34);
        setByteField(term71396, term71396.getClass(), "second", (byte) 17);
        setIntField(term71396, term71396.getClass(), "nano", 917654429);
        setField(term71391, term71391.getClass(), "time", term71396);
        setField(term71365, term71365.getClass(), "accessTime", term71391);
        setField(term71363, term71363.getClass(), "card", term71365);
        setIntField(term71363, term71363.getClass(), "lastDataVersion", 2072914504);
        setField(term71363, term71363.getClass(), "userName", "eOMBFVrNcf");
        setIntField(term71363, term71363.getClass(), "point", -1399182054);
        setIntField(term71363, term71363.getClass(), "totalPoint", -280697935);
        setIntField(term71363, term71363.getClass(), "iconId", -2067880029);
        setIntField(term71363, term71363.getClass(), "nameplateId", -2145680141);
        setIntField(term71363, term71363.getClass(), "frameId", -433508892);
        setIntField(term71363, term71363.getClass(), "trophyId", 1186473092);
        setIntField(term71363, term71363.getClass(), "playCount", 1411390040);
        setIntField(term71363, term71363.getClass(), "playVsCount", 1269301460);
        setIntField(term71363, term71363.getClass(), "playSyncCount", 937430146);
        setIntField(term71363, term71363.getClass(), "winCount", -592643197);
        setIntField(term71363, term71363.getClass(), "helpCount", -1572749368);
        setIntField(term71363, term71363.getClass(), "comboCount", -1777247778);
        setIntField(term71363, term71363.getClass(), "feverCount", -1943026433);
        setIntField(term71363, term71363.getClass(), "totalHiScore", 765622015);
        setIntField(term71363, term71363.getClass(), "totalEasyHighScore", -568658204);
        setIntField(term71363, term71363.getClass(), "totalBasicHighScore", -1544212923);
        setIntField(term71363, term71363.getClass(), "totalAdvancedHighScore", 1763127070);
        setIntField(term71363, term71363.getClass(), "totalExpertHighScore", 1568278777);
        setIntField(term71363, term71363.getClass(), "totalMasterHighScore", -1554034571);
        setIntField(term71363, term71363.getClass(), "totalReMasterHighScore", -1228359580);
        setIntField(term71363, term71363.getClass(), "totalHighSync", 292551785);
        setIntField(term71363, term71363.getClass(), "totalEasySync", 603303328);
        setIntField(term71363, term71363.getClass(), "totalBasicSync", -1132491443);
        setIntField(term71363, term71363.getClass(), "totalAdvancedSync", 999801569);
        setIntField(term71363, term71363.getClass(), "totalExpertSync", 1153762185);
        setIntField(term71363, term71363.getClass(), "totalMasterSync", 1276343831);
        setIntField(term71363, term71363.getClass(), "totalReMasterSync", 2147470271);
        setIntField(term71363, term71363.getClass(), "playerRating", 1954298638);
        setIntField(term71363, term71363.getClass(), "highestRating", -2131661608);
        setIntField(term71363, term71363.getClass(), "rankAuthTailId", 391150458);
        setField(term71363, term71363.getClass(), "eventWatchedDate", "gOwOIsocMB");
        setField(term71363, term71363.getClass(), "webLimitDate", "GqTBOhQBgV");
        setIntField(term71363, term71363.getClass(), "challengeTrackPhase", -1174497200);
        setIntField(term71363, term71363.getClass(), "firstPlayBits", -1106115182);
        setField(term71363, term71363.getClass(), "lastPlayDate", "DQhxOWqEyi");
        setIntField(term71363, term71363.getClass(), "lastPlaceId", -458386380);
        setField(term71363, term71363.getClass(), "lastPlaceName", "dSszYGDwAk");
        setIntField(term71363, term71363.getClass(), "lastRegionId", 1308196386);
        setField(term71363, term71363.getClass(), "lastRegionName", "gNeMyGSVIG");
        setField(term71363, term71363.getClass(), "lastClientId", "qxEkaqdKPG");
        setField(term71363, term71363.getClass(), "lastCountryCode", "VclIptmKrF");
        setIntField(term71363, term71363.getClass(), "eventPoint", -665856594);
        setIntField(term71363, term71363.getClass(), "totalLv", -264177336);
        setIntField(term71363, term71363.getClass(), "lastLoginBonusDay", -551046122);
        setIntField(term71363, term71363.getClass(), "lastSurvivalBonusDay", 995079464);
        setIntField(term71363, term71363.getClass(), "loginBonusLv", 508145632);
        setField(term71361, term71361.getClass(), "user", term71363);
        setIntField(term71361, term71361.getClass(), "soudEffect", -621730714);
        setIntField(term71361, term71361.getClass(), "mirrorMode", 873704930);
        setIntField(term71361, term71361.getClass(), "guideSpeed", 464294440);
        setIntField(term71361, term71361.getClass(), "bgInfo", 479268542);
        setIntField(term71361, term71361.getClass(), "brightness", 299614177);
        setIntField(term71361, term71361.getClass(), "isStarRot", -1770093697);
        setIntField(term71361, term71361.getClass(), "breakSe", 1949793607);
        setIntField(term71361, term71361.getClass(), "slideSe", 471219108);
        setIntField(term71361, term71361.getClass(), "hardJudge", 1357739280);
        setIntField(term71361, term71361.getClass(), "isTagJump", 476534314);
        setIntField(term71361, term71361.getClass(), "breakSeVol", -2090021514);
        setIntField(term71361, term71361.getClass(), "slideSeVol", 558476898);
        setIntField(term71361, term71361.getClass(), "isUpperDisp", -757802609);
        setIntField(term71361, term71361.getClass(), "trackSkip", 183041671);
        setIntField(term71361, term71361.getClass(), "optionMode", 400916727);
        setIntField(term71361, term71361.getClass(), "simpleOptionParam", 1620850038);
        setIntField(term71361, term71361.getClass(), "adjustTiming", 933381477);
        setIntField(term71361, term71361.getClass(), "dispTiming", 1138528761);
        setIntField(term71361, term71361.getClass(), "timingPos", 63142432);
        setIntField(term71361, term71361.getClass(), "ansVol", -1629688452);
        setIntField(term71361, term71361.getClass(), "noteVol", -1341364375);
        setIntField(term71361, term71361.getClass(), "dmgVol", -745641678);
        setIntField(term71361, term71361.getClass(), "appealFlame", 2132690014);
        setIntField(term71361, term71361.getClass(), "isFeverDisp", -365249563);
        setIntField(term71361, term71361.getClass(), "dispJudge", 1295989729);
        setIntField(term71361, term71361.getClass(), "judgePos", 1956936717);
        setIntField(term71361, term71361.getClass(), "ratingGuard", -955734660);
        setIntField(term71361, term71361.getClass(), "selectChara", 852902119);
        setIntField(term71361, term71361.getClass(), "sortType", -1152300693);
        setIntField(term71361, term71361.getClass(), "filterGenre", 586032794);
        setIntField(term71361, term71361.getClass(), "filterLevel", 1367834405);
        setIntField(term71361, term71361.getClass(), "filterRank", -1758694220);
        setIntField(term71361, term71361.getClass(), "filterVersion", -1747630048);
        setIntField(term71361, term71361.getClass(), "filterRec", 549628794);
        setIntField(term71361, term71361.getClass(), "filterFullCombo", -44645209);
        setIntField(term71361, term71361.getClass(), "filterAllPerfect", 946955246);
        setIntField(term71361, term71361.getClass(), "filterDifficulty", -1262709003);
        setIntField(term71361, term71361.getClass(), "filterFullSync", -686487699);
        setIntField(term71361, term71361.getClass(), "filterReMaster", -1360951047);
        setIntField(term71361, term71361.getClass(), "filterMaxFever", 1349893977);
        setIntField(term71361, term71361.getClass(), "finalSelectId", 1008804709);
        setIntField(term71361, term71361.getClass(), "finalSelectCategory", 1001974313);
        term71579 = new Integer(245262590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term71579;
        callMethod(klass, "setAnsVol", argTypes, term71361, args);
    }

};


