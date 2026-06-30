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

public class UserOption_getBreakSeVol_127309949813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54733;

    public UserOption_getBreakSeVol_127309949813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term54739 = new Long(-8010214112439224349L);
        term54733 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term54735 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term54737 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term54753 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54754 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54758 = newInstance(Class.forName("java.time.LocalTime"));
        Object term54763 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term54764 = newInstance(Class.forName("java.time.LocalDate"));
        Object term54768 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term54733, term54733.getClass(), "id", 8527367353497875781L);
        setLongField(term54735, term54735.getClass(), "id", -6489405551733780896L);
        setLongField(term54737, term54737.getClass(), "id", 5818741986224130131L);
        setField(term54737, term54737.getClass(), "extId", term54739);
        setField(term54737, term54737.getClass(), "luid", "SQnbnBmbcf");
        setIntField(term54754, term54754.getClass(), "year", 2018);
        setShortField(term54754, term54754.getClass(), "month", (short) 2);
        setShortField(term54754, term54754.getClass(), "day", (short) 16);
        setField(term54753, term54753.getClass(), "date", term54754);
        setByteField(term54758, term54758.getClass(), "hour", (byte) 16);
        setByteField(term54758, term54758.getClass(), "minute", (byte) 32);
        setByteField(term54758, term54758.getClass(), "second", (byte) 46);
        setIntField(term54758, term54758.getClass(), "nano", 932915298);
        setField(term54753, term54753.getClass(), "time", term54758);
        setField(term54737, term54737.getClass(), "registerTime", term54753);
        setIntField(term54764, term54764.getClass(), "year", 2013);
        setShortField(term54764, term54764.getClass(), "month", (short) 11);
        setShortField(term54764, term54764.getClass(), "day", (short) 7);
        setField(term54763, term54763.getClass(), "date", term54764);
        setByteField(term54768, term54768.getClass(), "hour", (byte) 9);
        setByteField(term54768, term54768.getClass(), "minute", (byte) 3);
        setByteField(term54768, term54768.getClass(), "second", (byte) 32);
        setIntField(term54768, term54768.getClass(), "nano", 53548583);
        setField(term54763, term54763.getClass(), "time", term54768);
        setField(term54737, term54737.getClass(), "accessTime", term54763);
        setField(term54735, term54735.getClass(), "card", term54737);
        setIntField(term54735, term54735.getClass(), "lastDataVersion", 1219123477);
        setField(term54735, term54735.getClass(), "userName", "jaNVteZrZi");
        setIntField(term54735, term54735.getClass(), "point", 11646624);
        setIntField(term54735, term54735.getClass(), "totalPoint", -330936660);
        setIntField(term54735, term54735.getClass(), "iconId", 2055839448);
        setIntField(term54735, term54735.getClass(), "nameplateId", -384754498);
        setIntField(term54735, term54735.getClass(), "frameId", 264487081);
        setIntField(term54735, term54735.getClass(), "trophyId", -834904279);
        setIntField(term54735, term54735.getClass(), "playCount", 1040056537);
        setIntField(term54735, term54735.getClass(), "playVsCount", 2036195661);
        setIntField(term54735, term54735.getClass(), "playSyncCount", -1622316712);
        setIntField(term54735, term54735.getClass(), "winCount", -1235123974);
        setIntField(term54735, term54735.getClass(), "helpCount", -898215180);
        setIntField(term54735, term54735.getClass(), "comboCount", 537429234);
        setIntField(term54735, term54735.getClass(), "feverCount", -2003655808);
        setIntField(term54735, term54735.getClass(), "totalHiScore", 483470724);
        setIntField(term54735, term54735.getClass(), "totalEasyHighScore", -2146772904);
        setIntField(term54735, term54735.getClass(), "totalBasicHighScore", -1010615015);
        setIntField(term54735, term54735.getClass(), "totalAdvancedHighScore", 1876974431);
        setIntField(term54735, term54735.getClass(), "totalExpertHighScore", -910876771);
        setIntField(term54735, term54735.getClass(), "totalMasterHighScore", 1838706925);
        setIntField(term54735, term54735.getClass(), "totalReMasterHighScore", -618691801);
        setIntField(term54735, term54735.getClass(), "totalHighSync", -1470171320);
        setIntField(term54735, term54735.getClass(), "totalEasySync", -995528354);
        setIntField(term54735, term54735.getClass(), "totalBasicSync", -2002926440);
        setIntField(term54735, term54735.getClass(), "totalAdvancedSync", -985098142);
        setIntField(term54735, term54735.getClass(), "totalExpertSync", -889602431);
        setIntField(term54735, term54735.getClass(), "totalMasterSync", 233063229);
        setIntField(term54735, term54735.getClass(), "totalReMasterSync", -2119606595);
        setIntField(term54735, term54735.getClass(), "playerRating", -11676368);
        setIntField(term54735, term54735.getClass(), "highestRating", 1176193646);
        setIntField(term54735, term54735.getClass(), "rankAuthTailId", -1538768806);
        setField(term54735, term54735.getClass(), "eventWatchedDate", "bMRkDiPUGu");
        setField(term54735, term54735.getClass(), "webLimitDate", "xjKxECGyLT");
        setIntField(term54735, term54735.getClass(), "challengeTrackPhase", -762348027);
        setIntField(term54735, term54735.getClass(), "firstPlayBits", 174471043);
        setField(term54735, term54735.getClass(), "lastPlayDate", "ffKeJGEXBT");
        setIntField(term54735, term54735.getClass(), "lastPlaceId", 90007022);
        setField(term54735, term54735.getClass(), "lastPlaceName", "rsnXTpfhqf");
        setIntField(term54735, term54735.getClass(), "lastRegionId", -1775594472);
        setField(term54735, term54735.getClass(), "lastRegionName", "gzvlGZVfnZ");
        setField(term54735, term54735.getClass(), "lastClientId", "rmSqCaXWHi");
        setField(term54735, term54735.getClass(), "lastCountryCode", "ScztqspySK");
        setIntField(term54735, term54735.getClass(), "eventPoint", 2043059296);
        setIntField(term54735, term54735.getClass(), "totalLv", 809100435);
        setIntField(term54735, term54735.getClass(), "lastLoginBonusDay", -1186136316);
        setIntField(term54735, term54735.getClass(), "lastSurvivalBonusDay", -1777720081);
        setIntField(term54735, term54735.getClass(), "loginBonusLv", -21630131);
        setField(term54733, term54733.getClass(), "user", term54735);
        setIntField(term54733, term54733.getClass(), "soudEffect", -908750386);
        setIntField(term54733, term54733.getClass(), "mirrorMode", 373886649);
        setIntField(term54733, term54733.getClass(), "guideSpeed", -2113984384);
        setIntField(term54733, term54733.getClass(), "bgInfo", 900825176);
        setIntField(term54733, term54733.getClass(), "brightness", -1078523636);
        setIntField(term54733, term54733.getClass(), "isStarRot", -1869767871);
        setIntField(term54733, term54733.getClass(), "breakSe", -1987615511);
        setIntField(term54733, term54733.getClass(), "slideSe", -334279196);
        setIntField(term54733, term54733.getClass(), "hardJudge", -1801372665);
        setIntField(term54733, term54733.getClass(), "isTagJump", 149567580);
        setIntField(term54733, term54733.getClass(), "breakSeVol", -1027296422);
        setIntField(term54733, term54733.getClass(), "slideSeVol", 1436156970);
        setIntField(term54733, term54733.getClass(), "isUpperDisp", 349805322);
        setIntField(term54733, term54733.getClass(), "trackSkip", -1951028737);
        setIntField(term54733, term54733.getClass(), "optionMode", -2088200216);
        setIntField(term54733, term54733.getClass(), "simpleOptionParam", 808519297);
        setIntField(term54733, term54733.getClass(), "adjustTiming", 1331143399);
        setIntField(term54733, term54733.getClass(), "dispTiming", -1736012493);
        setIntField(term54733, term54733.getClass(), "timingPos", 1021379232);
        setIntField(term54733, term54733.getClass(), "ansVol", 180789471);
        setIntField(term54733, term54733.getClass(), "noteVol", -1718954451);
        setIntField(term54733, term54733.getClass(), "dmgVol", 1867721531);
        setIntField(term54733, term54733.getClass(), "appealFlame", -964194849);
        setIntField(term54733, term54733.getClass(), "isFeverDisp", -1558640225);
        setIntField(term54733, term54733.getClass(), "dispJudge", 1206556058);
        setIntField(term54733, term54733.getClass(), "judgePos", 85515004);
        setIntField(term54733, term54733.getClass(), "ratingGuard", 1809173984);
        setIntField(term54733, term54733.getClass(), "selectChara", -1649722492);
        setIntField(term54733, term54733.getClass(), "sortType", 1892060110);
        setIntField(term54733, term54733.getClass(), "filterGenre", -1722968935);
        setIntField(term54733, term54733.getClass(), "filterLevel", -352942698);
        setIntField(term54733, term54733.getClass(), "filterRank", -291574787);
        setIntField(term54733, term54733.getClass(), "filterVersion", 1661313090);
        setIntField(term54733, term54733.getClass(), "filterRec", 1684314973);
        setIntField(term54733, term54733.getClass(), "filterFullCombo", 1244976316);
        setIntField(term54733, term54733.getClass(), "filterAllPerfect", -1572789846);
        setIntField(term54733, term54733.getClass(), "filterDifficulty", -1829984905);
        setIntField(term54733, term54733.getClass(), "filterFullSync", -1730584098);
        setIntField(term54733, term54733.getClass(), "filterReMaster", -1681411287);
        setIntField(term54733, term54733.getClass(), "filterMaxFever", -1796526306);
        setIntField(term54733, term54733.getClass(), "finalSelectId", 719664754);
        setIntField(term54733, term54733.getClass(), "finalSelectCategory", 1908542558);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBreakSeVol", argTypes, term54733, args);
    }

};


