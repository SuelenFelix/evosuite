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

public class UserOption_getFilterDifficulty_141023751139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62741;

    public UserOption_getFilterDifficulty_141023751139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term62747 = new Long(6426732259596412988L);
        term62741 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term62743 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term62745 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term62761 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62762 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62766 = newInstance(Class.forName("java.time.LocalTime"));
        Object term62771 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term62772 = newInstance(Class.forName("java.time.LocalDate"));
        Object term62776 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term62741, term62741.getClass(), "id", -6806576523000182981L);
        setLongField(term62743, term62743.getClass(), "id", 6437032166810658671L);
        setLongField(term62745, term62745.getClass(), "id", 6044346825617132280L);
        setField(term62745, term62745.getClass(), "extId", term62747);
        setField(term62745, term62745.getClass(), "luid", "iqhNUjVbRG");
        setIntField(term62762, term62762.getClass(), "year", 2011);
        setShortField(term62762, term62762.getClass(), "month", (short) 1);
        setShortField(term62762, term62762.getClass(), "day", (short) 7);
        setField(term62761, term62761.getClass(), "date", term62762);
        setByteField(term62766, term62766.getClass(), "hour", (byte) 10);
        setByteField(term62766, term62766.getClass(), "minute", (byte) 6);
        setByteField(term62766, term62766.getClass(), "second", (byte) 28);
        setIntField(term62766, term62766.getClass(), "nano", 669533698);
        setField(term62761, term62761.getClass(), "time", term62766);
        setField(term62745, term62745.getClass(), "registerTime", term62761);
        setIntField(term62772, term62772.getClass(), "year", 2016);
        setShortField(term62772, term62772.getClass(), "month", (short) 11);
        setShortField(term62772, term62772.getClass(), "day", (short) 15);
        setField(term62771, term62771.getClass(), "date", term62772);
        setByteField(term62776, term62776.getClass(), "hour", (byte) 14);
        setByteField(term62776, term62776.getClass(), "minute", (byte) 34);
        setByteField(term62776, term62776.getClass(), "second", (byte) 23);
        setIntField(term62776, term62776.getClass(), "nano", 287070581);
        setField(term62771, term62771.getClass(), "time", term62776);
        setField(term62745, term62745.getClass(), "accessTime", term62771);
        setField(term62743, term62743.getClass(), "card", term62745);
        setIntField(term62743, term62743.getClass(), "lastDataVersion", -2061313449);
        setField(term62743, term62743.getClass(), "userName", "SSqIrPwJXd");
        setIntField(term62743, term62743.getClass(), "point", 1235250395);
        setIntField(term62743, term62743.getClass(), "totalPoint", -554298931);
        setIntField(term62743, term62743.getClass(), "iconId", 1776900753);
        setIntField(term62743, term62743.getClass(), "nameplateId", 77426182);
        setIntField(term62743, term62743.getClass(), "frameId", -395423165);
        setIntField(term62743, term62743.getClass(), "trophyId", -990526245);
        setIntField(term62743, term62743.getClass(), "playCount", 2133565885);
        setIntField(term62743, term62743.getClass(), "playVsCount", -1197317011);
        setIntField(term62743, term62743.getClass(), "playSyncCount", -622026055);
        setIntField(term62743, term62743.getClass(), "winCount", -253994513);
        setIntField(term62743, term62743.getClass(), "helpCount", -797621149);
        setIntField(term62743, term62743.getClass(), "comboCount", 1348878482);
        setIntField(term62743, term62743.getClass(), "feverCount", 1839647396);
        setIntField(term62743, term62743.getClass(), "totalHiScore", 749558175);
        setIntField(term62743, term62743.getClass(), "totalEasyHighScore", -249093225);
        setIntField(term62743, term62743.getClass(), "totalBasicHighScore", 1664707074);
        setIntField(term62743, term62743.getClass(), "totalAdvancedHighScore", -1965724215);
        setIntField(term62743, term62743.getClass(), "totalExpertHighScore", -2029902121);
        setIntField(term62743, term62743.getClass(), "totalMasterHighScore", -1095782854);
        setIntField(term62743, term62743.getClass(), "totalReMasterHighScore", 1432496573);
        setIntField(term62743, term62743.getClass(), "totalHighSync", -849194186);
        setIntField(term62743, term62743.getClass(), "totalEasySync", 534005485);
        setIntField(term62743, term62743.getClass(), "totalBasicSync", 433949054);
        setIntField(term62743, term62743.getClass(), "totalAdvancedSync", 1432683121);
        setIntField(term62743, term62743.getClass(), "totalExpertSync", -1075532959);
        setIntField(term62743, term62743.getClass(), "totalMasterSync", -2112121102);
        setIntField(term62743, term62743.getClass(), "totalReMasterSync", 882228649);
        setIntField(term62743, term62743.getClass(), "playerRating", 1534973931);
        setIntField(term62743, term62743.getClass(), "highestRating", 1939412111);
        setIntField(term62743, term62743.getClass(), "rankAuthTailId", -2088107446);
        setField(term62743, term62743.getClass(), "eventWatchedDate", "jAxYagPvcV");
        setField(term62743, term62743.getClass(), "webLimitDate", "ZXLgGUqgyW");
        setIntField(term62743, term62743.getClass(), "challengeTrackPhase", 590965528);
        setIntField(term62743, term62743.getClass(), "firstPlayBits", -901801526);
        setField(term62743, term62743.getClass(), "lastPlayDate", "PdeSzTcBgY");
        setIntField(term62743, term62743.getClass(), "lastPlaceId", -844430982);
        setField(term62743, term62743.getClass(), "lastPlaceName", "PmSvMYNoIS");
        setIntField(term62743, term62743.getClass(), "lastRegionId", -164393345);
        setField(term62743, term62743.getClass(), "lastRegionName", "zejWtMxJdV");
        setField(term62743, term62743.getClass(), "lastClientId", "YUIUZeZiMK");
        setField(term62743, term62743.getClass(), "lastCountryCode", "rrPETbKRef");
        setIntField(term62743, term62743.getClass(), "eventPoint", 994265990);
        setIntField(term62743, term62743.getClass(), "totalLv", 1551328629);
        setIntField(term62743, term62743.getClass(), "lastLoginBonusDay", -967088595);
        setIntField(term62743, term62743.getClass(), "lastSurvivalBonusDay", 1703596113);
        setIntField(term62743, term62743.getClass(), "loginBonusLv", -1570405490);
        setField(term62741, term62741.getClass(), "user", term62743);
        setIntField(term62741, term62741.getClass(), "soudEffect", 2093699918);
        setIntField(term62741, term62741.getClass(), "mirrorMode", -1477783757);
        setIntField(term62741, term62741.getClass(), "guideSpeed", -1106829807);
        setIntField(term62741, term62741.getClass(), "bgInfo", 1056213101);
        setIntField(term62741, term62741.getClass(), "brightness", 1985766183);
        setIntField(term62741, term62741.getClass(), "isStarRot", -789887248);
        setIntField(term62741, term62741.getClass(), "breakSe", -833940690);
        setIntField(term62741, term62741.getClass(), "slideSe", -202105331);
        setIntField(term62741, term62741.getClass(), "hardJudge", 1446394868);
        setIntField(term62741, term62741.getClass(), "isTagJump", -385831603);
        setIntField(term62741, term62741.getClass(), "breakSeVol", -1896400624);
        setIntField(term62741, term62741.getClass(), "slideSeVol", -186142402);
        setIntField(term62741, term62741.getClass(), "isUpperDisp", -87117118);
        setIntField(term62741, term62741.getClass(), "trackSkip", 240936347);
        setIntField(term62741, term62741.getClass(), "optionMode", -1531057884);
        setIntField(term62741, term62741.getClass(), "simpleOptionParam", -942173626);
        setIntField(term62741, term62741.getClass(), "adjustTiming", 209865960);
        setIntField(term62741, term62741.getClass(), "dispTiming", -1616150864);
        setIntField(term62741, term62741.getClass(), "timingPos", -1945453513);
        setIntField(term62741, term62741.getClass(), "ansVol", -1022307429);
        setIntField(term62741, term62741.getClass(), "noteVol", 1058681211);
        setIntField(term62741, term62741.getClass(), "dmgVol", -1476609706);
        setIntField(term62741, term62741.getClass(), "appealFlame", -807331064);
        setIntField(term62741, term62741.getClass(), "isFeverDisp", 4051182);
        setIntField(term62741, term62741.getClass(), "dispJudge", -868532730);
        setIntField(term62741, term62741.getClass(), "judgePos", -90828570);
        setIntField(term62741, term62741.getClass(), "ratingGuard", -340081641);
        setIntField(term62741, term62741.getClass(), "selectChara", -1412324757);
        setIntField(term62741, term62741.getClass(), "sortType", 140849786);
        setIntField(term62741, term62741.getClass(), "filterGenre", 34056751);
        setIntField(term62741, term62741.getClass(), "filterLevel", 1802001091);
        setIntField(term62741, term62741.getClass(), "filterRank", -1767833537);
        setIntField(term62741, term62741.getClass(), "filterVersion", -215734173);
        setIntField(term62741, term62741.getClass(), "filterRec", -1841017701);
        setIntField(term62741, term62741.getClass(), "filterFullCombo", 1099125651);
        setIntField(term62741, term62741.getClass(), "filterAllPerfect", 338123354);
        setIntField(term62741, term62741.getClass(), "filterDifficulty", -830092964);
        setIntField(term62741, term62741.getClass(), "filterFullSync", 2137377172);
        setIntField(term62741, term62741.getClass(), "filterReMaster", 1981927891);
        setIntField(term62741, term62741.getClass(), "filterMaxFever", -1835063179);
        setIntField(term62741, term62741.getClass(), "finalSelectId", -184092475);
        setIntField(term62741, term62741.getClass(), "finalSelectCategory", -1002047965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilterDifficulty", argTypes, term62741, args);
    }

};


