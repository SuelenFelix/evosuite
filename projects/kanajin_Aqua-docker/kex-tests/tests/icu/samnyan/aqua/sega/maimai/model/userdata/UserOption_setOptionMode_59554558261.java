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

public class UserOption_setOptionMode_59554558261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69811;
     Object term70029;

    public UserOption_setOptionMode_59554558261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term69817 = new Long(21047099434645581L);
        term69811 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term69813 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term69815 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term69831 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term69832 = newInstance(Class.forName("java.time.LocalDate"));
        Object term69836 = newInstance(Class.forName("java.time.LocalTime"));
        Object term69841 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term69842 = newInstance(Class.forName("java.time.LocalDate"));
        Object term69846 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term69811, term69811.getClass(), "id", -1325109462577461208L);
        setLongField(term69813, term69813.getClass(), "id", -7181112149072926893L);
        setLongField(term69815, term69815.getClass(), "id", -5850316381591949820L);
        setField(term69815, term69815.getClass(), "extId", term69817);
        setField(term69815, term69815.getClass(), "luid", "FivesaUeHG");
        setIntField(term69832, term69832.getClass(), "year", 2014);
        setShortField(term69832, term69832.getClass(), "month", (short) 6);
        setShortField(term69832, term69832.getClass(), "day", (short) 26);
        setField(term69831, term69831.getClass(), "date", term69832);
        setByteField(term69836, term69836.getClass(), "hour", (byte) 1);
        setByteField(term69836, term69836.getClass(), "minute", (byte) 48);
        setByteField(term69836, term69836.getClass(), "second", (byte) 51);
        setIntField(term69836, term69836.getClass(), "nano", 770527454);
        setField(term69831, term69831.getClass(), "time", term69836);
        setField(term69815, term69815.getClass(), "registerTime", term69831);
        setIntField(term69842, term69842.getClass(), "year", 2019);
        setShortField(term69842, term69842.getClass(), "month", (short) 10);
        setShortField(term69842, term69842.getClass(), "day", (short) 21);
        setField(term69841, term69841.getClass(), "date", term69842);
        setByteField(term69846, term69846.getClass(), "hour", (byte) 23);
        setByteField(term69846, term69846.getClass(), "minute", (byte) 33);
        setByteField(term69846, term69846.getClass(), "second", (byte) 19);
        setIntField(term69846, term69846.getClass(), "nano", 72784109);
        setField(term69841, term69841.getClass(), "time", term69846);
        setField(term69815, term69815.getClass(), "accessTime", term69841);
        setField(term69813, term69813.getClass(), "card", term69815);
        setIntField(term69813, term69813.getClass(), "lastDataVersion", -249737071);
        setField(term69813, term69813.getClass(), "userName", "TnpXhZmCRY");
        setIntField(term69813, term69813.getClass(), "point", -1495822478);
        setIntField(term69813, term69813.getClass(), "totalPoint", 1837477160);
        setIntField(term69813, term69813.getClass(), "iconId", -715274403);
        setIntField(term69813, term69813.getClass(), "nameplateId", -1194682970);
        setIntField(term69813, term69813.getClass(), "frameId", -800758682);
        setIntField(term69813, term69813.getClass(), "trophyId", -1806348982);
        setIntField(term69813, term69813.getClass(), "playCount", 1710916931);
        setIntField(term69813, term69813.getClass(), "playVsCount", -476865589);
        setIntField(term69813, term69813.getClass(), "playSyncCount", -426524240);
        setIntField(term69813, term69813.getClass(), "winCount", -2094943009);
        setIntField(term69813, term69813.getClass(), "helpCount", -6347300);
        setIntField(term69813, term69813.getClass(), "comboCount", -2028885510);
        setIntField(term69813, term69813.getClass(), "feverCount", 1898148089);
        setIntField(term69813, term69813.getClass(), "totalHiScore", 1620462199);
        setIntField(term69813, term69813.getClass(), "totalEasyHighScore", -418350686);
        setIntField(term69813, term69813.getClass(), "totalBasicHighScore", 2108089284);
        setIntField(term69813, term69813.getClass(), "totalAdvancedHighScore", 1042300663);
        setIntField(term69813, term69813.getClass(), "totalExpertHighScore", -1957248425);
        setIntField(term69813, term69813.getClass(), "totalMasterHighScore", 437128088);
        setIntField(term69813, term69813.getClass(), "totalReMasterHighScore", 1196324194);
        setIntField(term69813, term69813.getClass(), "totalHighSync", 489535471);
        setIntField(term69813, term69813.getClass(), "totalEasySync", -2003174737);
        setIntField(term69813, term69813.getClass(), "totalBasicSync", 554212199);
        setIntField(term69813, term69813.getClass(), "totalAdvancedSync", 389737737);
        setIntField(term69813, term69813.getClass(), "totalExpertSync", 562342011);
        setIntField(term69813, term69813.getClass(), "totalMasterSync", 1494869778);
        setIntField(term69813, term69813.getClass(), "totalReMasterSync", 1841534409);
        setIntField(term69813, term69813.getClass(), "playerRating", -454011518);
        setIntField(term69813, term69813.getClass(), "highestRating", 912352909);
        setIntField(term69813, term69813.getClass(), "rankAuthTailId", -1991098590);
        setField(term69813, term69813.getClass(), "eventWatchedDate", "ECVAXFhrTP");
        setField(term69813, term69813.getClass(), "webLimitDate", "ypytdNbrBc");
        setIntField(term69813, term69813.getClass(), "challengeTrackPhase", -1125437654);
        setIntField(term69813, term69813.getClass(), "firstPlayBits", -1672681991);
        setField(term69813, term69813.getClass(), "lastPlayDate", "XvrJCOSYei");
        setIntField(term69813, term69813.getClass(), "lastPlaceId", 1344218803);
        setField(term69813, term69813.getClass(), "lastPlaceName", "QdRcxOxNSl");
        setIntField(term69813, term69813.getClass(), "lastRegionId", 997123210);
        setField(term69813, term69813.getClass(), "lastRegionName", "lvdsucnNvR");
        setField(term69813, term69813.getClass(), "lastClientId", "mSjSKfeMUn");
        setField(term69813, term69813.getClass(), "lastCountryCode", "nVXCBYnEcg");
        setIntField(term69813, term69813.getClass(), "eventPoint", 354354316);
        setIntField(term69813, term69813.getClass(), "totalLv", 1271683860);
        setIntField(term69813, term69813.getClass(), "lastLoginBonusDay", 391963036);
        setIntField(term69813, term69813.getClass(), "lastSurvivalBonusDay", 971387953);
        setIntField(term69813, term69813.getClass(), "loginBonusLv", 1267426986);
        setField(term69811, term69811.getClass(), "user", term69813);
        setIntField(term69811, term69811.getClass(), "soudEffect", -796963513);
        setIntField(term69811, term69811.getClass(), "mirrorMode", -968061478);
        setIntField(term69811, term69811.getClass(), "guideSpeed", -1731545429);
        setIntField(term69811, term69811.getClass(), "bgInfo", 1529459552);
        setIntField(term69811, term69811.getClass(), "brightness", -319743898);
        setIntField(term69811, term69811.getClass(), "isStarRot", 1259713000);
        setIntField(term69811, term69811.getClass(), "breakSe", -56433677);
        setIntField(term69811, term69811.getClass(), "slideSe", -362651319);
        setIntField(term69811, term69811.getClass(), "hardJudge", -1194579845);
        setIntField(term69811, term69811.getClass(), "isTagJump", 423662191);
        setIntField(term69811, term69811.getClass(), "breakSeVol", -1353912745);
        setIntField(term69811, term69811.getClass(), "slideSeVol", -1991138903);
        setIntField(term69811, term69811.getClass(), "isUpperDisp", -1011499047);
        setIntField(term69811, term69811.getClass(), "trackSkip", 1739555012);
        setIntField(term69811, term69811.getClass(), "optionMode", -648034125);
        setIntField(term69811, term69811.getClass(), "simpleOptionParam", 463060109);
        setIntField(term69811, term69811.getClass(), "adjustTiming", 1272416881);
        setIntField(term69811, term69811.getClass(), "dispTiming", -1392505419);
        setIntField(term69811, term69811.getClass(), "timingPos", -1881547807);
        setIntField(term69811, term69811.getClass(), "ansVol", -2118350031);
        setIntField(term69811, term69811.getClass(), "noteVol", 1226740323);
        setIntField(term69811, term69811.getClass(), "dmgVol", -913955707);
        setIntField(term69811, term69811.getClass(), "appealFlame", -1375658129);
        setIntField(term69811, term69811.getClass(), "isFeverDisp", -1851280223);
        setIntField(term69811, term69811.getClass(), "dispJudge", 1587309016);
        setIntField(term69811, term69811.getClass(), "judgePos", -2135993804);
        setIntField(term69811, term69811.getClass(), "ratingGuard", 1633651090);
        setIntField(term69811, term69811.getClass(), "selectChara", 1253413026);
        setIntField(term69811, term69811.getClass(), "sortType", -1393517042);
        setIntField(term69811, term69811.getClass(), "filterGenre", 1002224898);
        setIntField(term69811, term69811.getClass(), "filterLevel", -855504293);
        setIntField(term69811, term69811.getClass(), "filterRank", -1726032687);
        setIntField(term69811, term69811.getClass(), "filterVersion", 7194547);
        setIntField(term69811, term69811.getClass(), "filterRec", -509177802);
        setIntField(term69811, term69811.getClass(), "filterFullCombo", -1731230168);
        setIntField(term69811, term69811.getClass(), "filterAllPerfect", -34115571);
        setIntField(term69811, term69811.getClass(), "filterDifficulty", 2098121847);
        setIntField(term69811, term69811.getClass(), "filterFullSync", 870572059);
        setIntField(term69811, term69811.getClass(), "filterReMaster", -1255111844);
        setIntField(term69811, term69811.getClass(), "filterMaxFever", -1114425326);
        setIntField(term69811, term69811.getClass(), "finalSelectId", 512107996);
        setIntField(term69811, term69811.getClass(), "finalSelectCategory", 838748747);
        term70029 = new Integer(429358930);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term70029;
        callMethod(klass, "setOptionMode", argTypes, term69811, args);
    }

};


