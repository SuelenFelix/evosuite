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

public class UserOption_canEqual_174282913590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78800;
     Object term79018;

    public UserOption_canEqual_174282913590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term78806 = new Long(4255811647459029682L);
        term78800 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term78802 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term78804 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term78820 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78821 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78825 = newInstance(Class.forName("java.time.LocalTime"));
        Object term78830 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term78831 = newInstance(Class.forName("java.time.LocalDate"));
        Object term78835 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term78800, term78800.getClass(), "id", 7393438062788805516L);
        setLongField(term78802, term78802.getClass(), "id", 5383032785479262184L);
        setLongField(term78804, term78804.getClass(), "id", -6900715686580158779L);
        setField(term78804, term78804.getClass(), "extId", term78806);
        setField(term78804, term78804.getClass(), "luid", "HHAcgDPghN");
        setIntField(term78821, term78821.getClass(), "year", 2015);
        setShortField(term78821, term78821.getClass(), "month", (short) 11);
        setShortField(term78821, term78821.getClass(), "day", (short) 12);
        setField(term78820, term78820.getClass(), "date", term78821);
        setByteField(term78825, term78825.getClass(), "hour", (byte) 8);
        setByteField(term78825, term78825.getClass(), "minute", (byte) 57);
        setByteField(term78825, term78825.getClass(), "second", (byte) 39);
        setIntField(term78825, term78825.getClass(), "nano", 144990931);
        setField(term78820, term78820.getClass(), "time", term78825);
        setField(term78804, term78804.getClass(), "registerTime", term78820);
        setIntField(term78831, term78831.getClass(), "year", 2015);
        setShortField(term78831, term78831.getClass(), "month", (short) 3);
        setShortField(term78831, term78831.getClass(), "day", (short) 10);
        setField(term78830, term78830.getClass(), "date", term78831);
        setByteField(term78835, term78835.getClass(), "hour", (byte) 6);
        setByteField(term78835, term78835.getClass(), "minute", (byte) 11);
        setByteField(term78835, term78835.getClass(), "second", (byte) 21);
        setIntField(term78835, term78835.getClass(), "nano", 925797004);
        setField(term78830, term78830.getClass(), "time", term78835);
        setField(term78804, term78804.getClass(), "accessTime", term78830);
        setField(term78802, term78802.getClass(), "card", term78804);
        setIntField(term78802, term78802.getClass(), "lastDataVersion", 86310829);
        setField(term78802, term78802.getClass(), "userName", "GzmFcFoYft");
        setIntField(term78802, term78802.getClass(), "point", 307341387);
        setIntField(term78802, term78802.getClass(), "totalPoint", 1543796264);
        setIntField(term78802, term78802.getClass(), "iconId", 1495907347);
        setIntField(term78802, term78802.getClass(), "nameplateId", -837165958);
        setIntField(term78802, term78802.getClass(), "frameId", -1497849874);
        setIntField(term78802, term78802.getClass(), "trophyId", -370670342);
        setIntField(term78802, term78802.getClass(), "playCount", 464894195);
        setIntField(term78802, term78802.getClass(), "playVsCount", -315503530);
        setIntField(term78802, term78802.getClass(), "playSyncCount", -1272454535);
        setIntField(term78802, term78802.getClass(), "winCount", -74370450);
        setIntField(term78802, term78802.getClass(), "helpCount", -707698143);
        setIntField(term78802, term78802.getClass(), "comboCount", -837477515);
        setIntField(term78802, term78802.getClass(), "feverCount", 1463516996);
        setIntField(term78802, term78802.getClass(), "totalHiScore", -418592932);
        setIntField(term78802, term78802.getClass(), "totalEasyHighScore", -1258428630);
        setIntField(term78802, term78802.getClass(), "totalBasicHighScore", 1183977686);
        setIntField(term78802, term78802.getClass(), "totalAdvancedHighScore", -1293096528);
        setIntField(term78802, term78802.getClass(), "totalExpertHighScore", -50374025);
        setIntField(term78802, term78802.getClass(), "totalMasterHighScore", -506796467);
        setIntField(term78802, term78802.getClass(), "totalReMasterHighScore", -1497561160);
        setIntField(term78802, term78802.getClass(), "totalHighSync", -1274280051);
        setIntField(term78802, term78802.getClass(), "totalEasySync", -2108798746);
        setIntField(term78802, term78802.getClass(), "totalBasicSync", 479017858);
        setIntField(term78802, term78802.getClass(), "totalAdvancedSync", 7613516);
        setIntField(term78802, term78802.getClass(), "totalExpertSync", -305118788);
        setIntField(term78802, term78802.getClass(), "totalMasterSync", 2114397202);
        setIntField(term78802, term78802.getClass(), "totalReMasterSync", 1829059518);
        setIntField(term78802, term78802.getClass(), "playerRating", -451555413);
        setIntField(term78802, term78802.getClass(), "highestRating", 752319253);
        setIntField(term78802, term78802.getClass(), "rankAuthTailId", -1276139327);
        setField(term78802, term78802.getClass(), "eventWatchedDate", "LYRdIFgbgt");
        setField(term78802, term78802.getClass(), "webLimitDate", "NiKeRXajei");
        setIntField(term78802, term78802.getClass(), "challengeTrackPhase", 1209458805);
        setIntField(term78802, term78802.getClass(), "firstPlayBits", -2118940919);
        setField(term78802, term78802.getClass(), "lastPlayDate", "fDNtdfDzQh");
        setIntField(term78802, term78802.getClass(), "lastPlaceId", 1122177418);
        setField(term78802, term78802.getClass(), "lastPlaceName", "VbIydgisyZ");
        setIntField(term78802, term78802.getClass(), "lastRegionId", 2016777060);
        setField(term78802, term78802.getClass(), "lastRegionName", "vigaMWRpCA");
        setField(term78802, term78802.getClass(), "lastClientId", "sgVVVUpnau");
        setField(term78802, term78802.getClass(), "lastCountryCode", "xwVTgDhNdW");
        setIntField(term78802, term78802.getClass(), "eventPoint", 1071294304);
        setIntField(term78802, term78802.getClass(), "totalLv", -292309);
        setIntField(term78802, term78802.getClass(), "lastLoginBonusDay", -1610527348);
        setIntField(term78802, term78802.getClass(), "lastSurvivalBonusDay", -2007571028);
        setIntField(term78802, term78802.getClass(), "loginBonusLv", -1988744576);
        setField(term78800, term78800.getClass(), "user", term78802);
        setIntField(term78800, term78800.getClass(), "soudEffect", -1212873450);
        setIntField(term78800, term78800.getClass(), "mirrorMode", 2144592813);
        setIntField(term78800, term78800.getClass(), "guideSpeed", 1708159330);
        setIntField(term78800, term78800.getClass(), "bgInfo", 1033352289);
        setIntField(term78800, term78800.getClass(), "brightness", 1363366152);
        setIntField(term78800, term78800.getClass(), "isStarRot", -1718981498);
        setIntField(term78800, term78800.getClass(), "breakSe", -1985364873);
        setIntField(term78800, term78800.getClass(), "slideSe", -1805626205);
        setIntField(term78800, term78800.getClass(), "hardJudge", -126924629);
        setIntField(term78800, term78800.getClass(), "isTagJump", 1496446682);
        setIntField(term78800, term78800.getClass(), "breakSeVol", 970101338);
        setIntField(term78800, term78800.getClass(), "slideSeVol", -1606666058);
        setIntField(term78800, term78800.getClass(), "isUpperDisp", 385166216);
        setIntField(term78800, term78800.getClass(), "trackSkip", 258545659);
        setIntField(term78800, term78800.getClass(), "optionMode", 1941427849);
        setIntField(term78800, term78800.getClass(), "simpleOptionParam", 1558269156);
        setIntField(term78800, term78800.getClass(), "adjustTiming", 1665713337);
        setIntField(term78800, term78800.getClass(), "dispTiming", 999956076);
        setIntField(term78800, term78800.getClass(), "timingPos", -1212519317);
        setIntField(term78800, term78800.getClass(), "ansVol", -1264031340);
        setIntField(term78800, term78800.getClass(), "noteVol", -118961950);
        setIntField(term78800, term78800.getClass(), "dmgVol", 47401671);
        setIntField(term78800, term78800.getClass(), "appealFlame", 277629019);
        setIntField(term78800, term78800.getClass(), "isFeverDisp", 1458933964);
        setIntField(term78800, term78800.getClass(), "dispJudge", 2008391522);
        setIntField(term78800, term78800.getClass(), "judgePos", 342831841);
        setIntField(term78800, term78800.getClass(), "ratingGuard", 1428487687);
        setIntField(term78800, term78800.getClass(), "selectChara", -1834483721);
        setIntField(term78800, term78800.getClass(), "sortType", 240061124);
        setIntField(term78800, term78800.getClass(), "filterGenre", 473805611);
        setIntField(term78800, term78800.getClass(), "filterLevel", -851419141);
        setIntField(term78800, term78800.getClass(), "filterRank", -1747772952);
        setIntField(term78800, term78800.getClass(), "filterVersion", -876649349);
        setIntField(term78800, term78800.getClass(), "filterRec", -2113924518);
        setIntField(term78800, term78800.getClass(), "filterFullCombo", 1416561784);
        setIntField(term78800, term78800.getClass(), "filterAllPerfect", -2003997410);
        setIntField(term78800, term78800.getClass(), "filterDifficulty", -2047713330);
        setIntField(term78800, term78800.getClass(), "filterFullSync", -1911473334);
        setIntField(term78800, term78800.getClass(), "filterReMaster", 803849098);
        setIntField(term78800, term78800.getClass(), "filterMaxFever", 431184457);
        setIntField(term78800, term78800.getClass(), "finalSelectId", 669026321);
        setIntField(term78800, term78800.getClass(), "finalSelectCategory", 893202719);
        term79018 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term79018;
        callMethod(klass, "canEqual", argTypes, term78800, args);
    }

};


