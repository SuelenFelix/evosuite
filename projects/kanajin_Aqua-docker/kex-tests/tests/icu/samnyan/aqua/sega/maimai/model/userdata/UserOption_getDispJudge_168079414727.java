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

public class UserOption_getDispJudge_168079414727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59045;

    public UserOption_getDispJudge_168079414727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term59051 = new Long(4199886998224701110L);
        term59045 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        Object term59047 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term59049 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term59065 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59066 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59070 = newInstance(Class.forName("java.time.LocalTime"));
        Object term59075 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59076 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59080 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term59045, term59045.getClass(), "id", -8531377551015443915L);
        setLongField(term59047, term59047.getClass(), "id", -3048863932438585863L);
        setLongField(term59049, term59049.getClass(), "id", -7155106718297861156L);
        setField(term59049, term59049.getClass(), "extId", term59051);
        setField(term59049, term59049.getClass(), "luid", "dTxnMmHoVm");
        setIntField(term59066, term59066.getClass(), "year", 2025);
        setShortField(term59066, term59066.getClass(), "month", (short) 8);
        setShortField(term59066, term59066.getClass(), "day", (short) 4);
        setField(term59065, term59065.getClass(), "date", term59066);
        setByteField(term59070, term59070.getClass(), "hour", (byte) 7);
        setByteField(term59070, term59070.getClass(), "minute", (byte) 29);
        setByteField(term59070, term59070.getClass(), "second", (byte) 4);
        setIntField(term59070, term59070.getClass(), "nano", 175288511);
        setField(term59065, term59065.getClass(), "time", term59070);
        setField(term59049, term59049.getClass(), "registerTime", term59065);
        setIntField(term59076, term59076.getClass(), "year", 2029);
        setShortField(term59076, term59076.getClass(), "month", (short) 9);
        setShortField(term59076, term59076.getClass(), "day", (short) 1);
        setField(term59075, term59075.getClass(), "date", term59076);
        setByteField(term59080, term59080.getClass(), "hour", (byte) 19);
        setByteField(term59080, term59080.getClass(), "minute", (byte) 56);
        setByteField(term59080, term59080.getClass(), "second", (byte) 46);
        setIntField(term59080, term59080.getClass(), "nano", 657110114);
        setField(term59075, term59075.getClass(), "time", term59080);
        setField(term59049, term59049.getClass(), "accessTime", term59075);
        setField(term59047, term59047.getClass(), "card", term59049);
        setIntField(term59047, term59047.getClass(), "lastDataVersion", -184719611);
        setField(term59047, term59047.getClass(), "userName", "iswxaQUQgT");
        setIntField(term59047, term59047.getClass(), "point", -1275570760);
        setIntField(term59047, term59047.getClass(), "totalPoint", -1359553558);
        setIntField(term59047, term59047.getClass(), "iconId", -1307021664);
        setIntField(term59047, term59047.getClass(), "nameplateId", -202359899);
        setIntField(term59047, term59047.getClass(), "frameId", -2145573227);
        setIntField(term59047, term59047.getClass(), "trophyId", 1334594060);
        setIntField(term59047, term59047.getClass(), "playCount", 2070138820);
        setIntField(term59047, term59047.getClass(), "playVsCount", -323557659);
        setIntField(term59047, term59047.getClass(), "playSyncCount", 1046757455);
        setIntField(term59047, term59047.getClass(), "winCount", 597376126);
        setIntField(term59047, term59047.getClass(), "helpCount", 1562609944);
        setIntField(term59047, term59047.getClass(), "comboCount", -568660846);
        setIntField(term59047, term59047.getClass(), "feverCount", -1734283788);
        setIntField(term59047, term59047.getClass(), "totalHiScore", -553895569);
        setIntField(term59047, term59047.getClass(), "totalEasyHighScore", 1574271133);
        setIntField(term59047, term59047.getClass(), "totalBasicHighScore", -320820030);
        setIntField(term59047, term59047.getClass(), "totalAdvancedHighScore", 1564533277);
        setIntField(term59047, term59047.getClass(), "totalExpertHighScore", 457118315);
        setIntField(term59047, term59047.getClass(), "totalMasterHighScore", -1741727092);
        setIntField(term59047, term59047.getClass(), "totalReMasterHighScore", 1927550284);
        setIntField(term59047, term59047.getClass(), "totalHighSync", -454951597);
        setIntField(term59047, term59047.getClass(), "totalEasySync", -992070416);
        setIntField(term59047, term59047.getClass(), "totalBasicSync", 1959596117);
        setIntField(term59047, term59047.getClass(), "totalAdvancedSync", 298481274);
        setIntField(term59047, term59047.getClass(), "totalExpertSync", -82602322);
        setIntField(term59047, term59047.getClass(), "totalMasterSync", 201191489);
        setIntField(term59047, term59047.getClass(), "totalReMasterSync", 1003344868);
        setIntField(term59047, term59047.getClass(), "playerRating", 699428605);
        setIntField(term59047, term59047.getClass(), "highestRating", -984536386);
        setIntField(term59047, term59047.getClass(), "rankAuthTailId", -394673031);
        setField(term59047, term59047.getClass(), "eventWatchedDate", "MxUSQqhNse");
        setField(term59047, term59047.getClass(), "webLimitDate", "skwxdosvQV");
        setIntField(term59047, term59047.getClass(), "challengeTrackPhase", -2114266331);
        setIntField(term59047, term59047.getClass(), "firstPlayBits", 1060512544);
        setField(term59047, term59047.getClass(), "lastPlayDate", "DBYTggnCkD");
        setIntField(term59047, term59047.getClass(), "lastPlaceId", 733910191);
        setField(term59047, term59047.getClass(), "lastPlaceName", "RyXrJxJQiY");
        setIntField(term59047, term59047.getClass(), "lastRegionId", -1299247390);
        setField(term59047, term59047.getClass(), "lastRegionName", "JfnQeTdzWs");
        setField(term59047, term59047.getClass(), "lastClientId", "HGhGqMiMOk");
        setField(term59047, term59047.getClass(), "lastCountryCode", "VtTzFdKpZI");
        setIntField(term59047, term59047.getClass(), "eventPoint", 901132234);
        setIntField(term59047, term59047.getClass(), "totalLv", -205835456);
        setIntField(term59047, term59047.getClass(), "lastLoginBonusDay", 889992615);
        setIntField(term59047, term59047.getClass(), "lastSurvivalBonusDay", 1184212871);
        setIntField(term59047, term59047.getClass(), "loginBonusLv", 1318633291);
        setField(term59045, term59045.getClass(), "user", term59047);
        setIntField(term59045, term59045.getClass(), "soudEffect", 163521915);
        setIntField(term59045, term59045.getClass(), "mirrorMode", 208383602);
        setIntField(term59045, term59045.getClass(), "guideSpeed", -936623097);
        setIntField(term59045, term59045.getClass(), "bgInfo", -1148000466);
        setIntField(term59045, term59045.getClass(), "brightness", 1299330727);
        setIntField(term59045, term59045.getClass(), "isStarRot", 1541672801);
        setIntField(term59045, term59045.getClass(), "breakSe", -1723354196);
        setIntField(term59045, term59045.getClass(), "slideSe", -19725944);
        setIntField(term59045, term59045.getClass(), "hardJudge", 432916102);
        setIntField(term59045, term59045.getClass(), "isTagJump", -1059151250);
        setIntField(term59045, term59045.getClass(), "breakSeVol", 150030523);
        setIntField(term59045, term59045.getClass(), "slideSeVol", -1729514045);
        setIntField(term59045, term59045.getClass(), "isUpperDisp", 72012599);
        setIntField(term59045, term59045.getClass(), "trackSkip", 1119073188);
        setIntField(term59045, term59045.getClass(), "optionMode", -1116601587);
        setIntField(term59045, term59045.getClass(), "simpleOptionParam", -1646521952);
        setIntField(term59045, term59045.getClass(), "adjustTiming", 532690926);
        setIntField(term59045, term59045.getClass(), "dispTiming", 1569782717);
        setIntField(term59045, term59045.getClass(), "timingPos", -479375394);
        setIntField(term59045, term59045.getClass(), "ansVol", 2068819583);
        setIntField(term59045, term59045.getClass(), "noteVol", 1499046631);
        setIntField(term59045, term59045.getClass(), "dmgVol", -846622452);
        setIntField(term59045, term59045.getClass(), "appealFlame", -1069059356);
        setIntField(term59045, term59045.getClass(), "isFeverDisp", -2030213410);
        setIntField(term59045, term59045.getClass(), "dispJudge", -63736169);
        setIntField(term59045, term59045.getClass(), "judgePos", 1480163997);
        setIntField(term59045, term59045.getClass(), "ratingGuard", -949949277);
        setIntField(term59045, term59045.getClass(), "selectChara", -1805950945);
        setIntField(term59045, term59045.getClass(), "sortType", 674695717);
        setIntField(term59045, term59045.getClass(), "filterGenre", 1298497946);
        setIntField(term59045, term59045.getClass(), "filterLevel", -1334742529);
        setIntField(term59045, term59045.getClass(), "filterRank", -935891827);
        setIntField(term59045, term59045.getClass(), "filterVersion", 1922432280);
        setIntField(term59045, term59045.getClass(), "filterRec", -358531856);
        setIntField(term59045, term59045.getClass(), "filterFullCombo", 249710866);
        setIntField(term59045, term59045.getClass(), "filterAllPerfect", -1526265440);
        setIntField(term59045, term59045.getClass(), "filterDifficulty", 1627034192);
        setIntField(term59045, term59045.getClass(), "filterFullSync", -1316138191);
        setIntField(term59045, term59045.getClass(), "filterReMaster", 1739661119);
        setIntField(term59045, term59045.getClass(), "filterMaxFever", -616399232);
        setIntField(term59045, term59045.getClass(), "finalSelectId", -1754380742);
        setIntField(term59045, term59045.getClass(), "finalSelectCategory", -1377304901);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDispJudge", argTypes, term59045, args);
    }

};


