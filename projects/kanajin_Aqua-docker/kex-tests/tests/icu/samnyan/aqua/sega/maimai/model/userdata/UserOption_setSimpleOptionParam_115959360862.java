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

public class UserOption_setSimpleOptionParam_115959360862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70121;
     Object term70339;

    public UserOption_setSimpleOptionParam_115959360862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term70127 = new Long(-8862087040734407227L);
        term70121 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term70123 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term70125 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term70141 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70142 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70146 = newInstance(Class.forName("java.time.LocalTime"));
        Object term70151 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70152 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70156 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term70121, term70121.getClass(), "id", 5857854340777182167L);
        setLongField(term70123, term70123.getClass(), "id", 3660520943100987842L);
        setLongField(term70125, term70125.getClass(), "id", -8211240904293846981L);
        setField(term70125, term70125.getClass(), "extId", term70127);
        setField(term70125, term70125.getClass(), "luid", "fcLnKXxzfM");
        setIntField(term70142, term70142.getClass(), "year", 2027);
        setShortField(term70142, term70142.getClass(), "month", (short) 10);
        setShortField(term70142, term70142.getClass(), "day", (short) 12);
        setField(term70141, term70141.getClass(), "date", term70142);
        setByteField(term70146, term70146.getClass(), "hour", (byte) 23);
        setByteField(term70146, term70146.getClass(), "minute", (byte) 45);
        setByteField(term70146, term70146.getClass(), "second", (byte) 21);
        setIntField(term70146, term70146.getClass(), "nano", 866836785);
        setField(term70141, term70141.getClass(), "time", term70146);
        setField(term70125, term70125.getClass(), "registerTime", term70141);
        setIntField(term70152, term70152.getClass(), "year", 2022);
        setShortField(term70152, term70152.getClass(), "month", (short) 5);
        setShortField(term70152, term70152.getClass(), "day", (short) 27);
        setField(term70151, term70151.getClass(), "date", term70152);
        setByteField(term70156, term70156.getClass(), "hour", (byte) 11);
        setByteField(term70156, term70156.getClass(), "minute", (byte) 48);
        setByteField(term70156, term70156.getClass(), "second", (byte) 27);
        setIntField(term70156, term70156.getClass(), "nano", 101970300);
        setField(term70151, term70151.getClass(), "time", term70156);
        setField(term70125, term70125.getClass(), "accessTime", term70151);
        setField(term70123, term70123.getClass(), "card", term70125);
        setIntField(term70123, term70123.getClass(), "lastDataVersion", 1691700582);
        setField(term70123, term70123.getClass(), "userName", "FtyaWnfsgn");
        setIntField(term70123, term70123.getClass(), "point", -1661320880);
        setIntField(term70123, term70123.getClass(), "totalPoint", -1500981713);
        setIntField(term70123, term70123.getClass(), "iconId", 151330446);
        setIntField(term70123, term70123.getClass(), "nameplateId", 1085757815);
        setIntField(term70123, term70123.getClass(), "frameId", 1419726204);
        setIntField(term70123, term70123.getClass(), "trophyId", 327539141);
        setIntField(term70123, term70123.getClass(), "playCount", 564309045);
        setIntField(term70123, term70123.getClass(), "playVsCount", -393999611);
        setIntField(term70123, term70123.getClass(), "playSyncCount", 277874910);
        setIntField(term70123, term70123.getClass(), "winCount", -1564481884);
        setIntField(term70123, term70123.getClass(), "helpCount", -1891590977);
        setIntField(term70123, term70123.getClass(), "comboCount", -49122115);
        setIntField(term70123, term70123.getClass(), "feverCount", 1162634645);
        setIntField(term70123, term70123.getClass(), "totalHiScore", -1269431491);
        setIntField(term70123, term70123.getClass(), "totalEasyHighScore", 2066614250);
        setIntField(term70123, term70123.getClass(), "totalBasicHighScore", 1678127654);
        setIntField(term70123, term70123.getClass(), "totalAdvancedHighScore", -1503783301);
        setIntField(term70123, term70123.getClass(), "totalExpertHighScore", -755256222);
        setIntField(term70123, term70123.getClass(), "totalMasterHighScore", -776385039);
        setIntField(term70123, term70123.getClass(), "totalReMasterHighScore", 1475507904);
        setIntField(term70123, term70123.getClass(), "totalHighSync", -1307551368);
        setIntField(term70123, term70123.getClass(), "totalEasySync", -1368286452);
        setIntField(term70123, term70123.getClass(), "totalBasicSync", -1376166915);
        setIntField(term70123, term70123.getClass(), "totalAdvancedSync", -746820758);
        setIntField(term70123, term70123.getClass(), "totalExpertSync", -14052587);
        setIntField(term70123, term70123.getClass(), "totalMasterSync", -1178359208);
        setIntField(term70123, term70123.getClass(), "totalReMasterSync", -494779428);
        setIntField(term70123, term70123.getClass(), "playerRating", -126124540);
        setIntField(term70123, term70123.getClass(), "highestRating", -798322865);
        setIntField(term70123, term70123.getClass(), "rankAuthTailId", -400148013);
        setField(term70123, term70123.getClass(), "eventWatchedDate", "qphbpPdwrD");
        setField(term70123, term70123.getClass(), "webLimitDate", "xHdHafzFSM");
        setIntField(term70123, term70123.getClass(), "challengeTrackPhase", -794879248);
        setIntField(term70123, term70123.getClass(), "firstPlayBits", -757299372);
        setField(term70123, term70123.getClass(), "lastPlayDate", "fAsiOEKVaH");
        setIntField(term70123, term70123.getClass(), "lastPlaceId", -914326611);
        setField(term70123, term70123.getClass(), "lastPlaceName", "EltrILhEwT");
        setIntField(term70123, term70123.getClass(), "lastRegionId", 18577398);
        setField(term70123, term70123.getClass(), "lastRegionName", "wCcSeUJzhg");
        setField(term70123, term70123.getClass(), "lastClientId", "HlVHAsOBmJ");
        setField(term70123, term70123.getClass(), "lastCountryCode", "nyThJEXHhd");
        setIntField(term70123, term70123.getClass(), "eventPoint", -355052439);
        setIntField(term70123, term70123.getClass(), "totalLv", 334949165);
        setIntField(term70123, term70123.getClass(), "lastLoginBonusDay", 106163860);
        setIntField(term70123, term70123.getClass(), "lastSurvivalBonusDay", 656343283);
        setIntField(term70123, term70123.getClass(), "loginBonusLv", 706546358);
        setField(term70121, term70121.getClass(), "user", term70123);
        setIntField(term70121, term70121.getClass(), "soudEffect", 1548818125);
        setIntField(term70121, term70121.getClass(), "mirrorMode", 1232113626);
        setIntField(term70121, term70121.getClass(), "guideSpeed", 2074975666);
        setIntField(term70121, term70121.getClass(), "bgInfo", 1785785400);
        setIntField(term70121, term70121.getClass(), "brightness", 1103364487);
        setIntField(term70121, term70121.getClass(), "isStarRot", 1306932888);
        setIntField(term70121, term70121.getClass(), "breakSe", -1805947114);
        setIntField(term70121, term70121.getClass(), "slideSe", 181911352);
        setIntField(term70121, term70121.getClass(), "hardJudge", 1019450273);
        setIntField(term70121, term70121.getClass(), "isTagJump", 1841139779);
        setIntField(term70121, term70121.getClass(), "breakSeVol", -2029319805);
        setIntField(term70121, term70121.getClass(), "slideSeVol", 2034151707);
        setIntField(term70121, term70121.getClass(), "isUpperDisp", -208922753);
        setIntField(term70121, term70121.getClass(), "trackSkip", -47733507);
        setIntField(term70121, term70121.getClass(), "optionMode", 1132217508);
        setIntField(term70121, term70121.getClass(), "simpleOptionParam", 597877971);
        setIntField(term70121, term70121.getClass(), "adjustTiming", 1129519360);
        setIntField(term70121, term70121.getClass(), "dispTiming", -986657496);
        setIntField(term70121, term70121.getClass(), "timingPos", 1452393321);
        setIntField(term70121, term70121.getClass(), "ansVol", -259001191);
        setIntField(term70121, term70121.getClass(), "noteVol", -526624985);
        setIntField(term70121, term70121.getClass(), "dmgVol", -1808470980);
        setIntField(term70121, term70121.getClass(), "appealFlame", -333940657);
        setIntField(term70121, term70121.getClass(), "isFeverDisp", 681073368);
        setIntField(term70121, term70121.getClass(), "dispJudge", 1186573309);
        setIntField(term70121, term70121.getClass(), "judgePos", -1612970790);
        setIntField(term70121, term70121.getClass(), "ratingGuard", 1322035683);
        setIntField(term70121, term70121.getClass(), "selectChara", 473364076);
        setIntField(term70121, term70121.getClass(), "sortType", -309915978);
        setIntField(term70121, term70121.getClass(), "filterGenre", -2126284255);
        setIntField(term70121, term70121.getClass(), "filterLevel", 1745632136);
        setIntField(term70121, term70121.getClass(), "filterRank", -1127735797);
        setIntField(term70121, term70121.getClass(), "filterVersion", -1176366062);
        setIntField(term70121, term70121.getClass(), "filterRec", -1989569985);
        setIntField(term70121, term70121.getClass(), "filterFullCombo", 22953591);
        setIntField(term70121, term70121.getClass(), "filterAllPerfect", 2000418563);
        setIntField(term70121, term70121.getClass(), "filterDifficulty", 1533972742);
        setIntField(term70121, term70121.getClass(), "filterFullSync", 2134249034);
        setIntField(term70121, term70121.getClass(), "filterReMaster", 905187079);
        setIntField(term70121, term70121.getClass(), "filterMaxFever", 2064319269);
        setIntField(term70121, term70121.getClass(), "finalSelectId", -1355791461);
        setIntField(term70121, term70121.getClass(), "finalSelectCategory", 315878223);
        term70339 = new Integer(-1983348178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term70339;
        callMethod(klass, "setSimpleOptionParam", argTypes, term70121, args);
    }

};


