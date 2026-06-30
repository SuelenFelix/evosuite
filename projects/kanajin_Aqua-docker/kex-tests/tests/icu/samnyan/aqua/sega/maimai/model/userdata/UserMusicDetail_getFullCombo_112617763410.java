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

public class UserMusicDetail_getFullCombo_112617763410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182677;

    public UserMusicDetail_getFullCombo_112617763410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term182683 = new Long(-5967061076297699457L);
        term182677 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail"));
        Object term182679 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term182681 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term182697 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term182698 = newInstance(Class.forName("java.time.LocalDate"));
        Object term182702 = newInstance(Class.forName("java.time.LocalTime"));
        Object term182707 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term182708 = newInstance(Class.forName("java.time.LocalDate"));
        Object term182712 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term182677, term182677.getClass(), "id", 3988621885328354087L);
        setLongField(term182679, term182679.getClass(), "id", -8785640072434283607L);
        setLongField(term182681, term182681.getClass(), "id", -3745055287608698860L);
        setField(term182681, term182681.getClass(), "extId", term182683);
        setField(term182681, term182681.getClass(), "luid", "bbKtLbiXSm");
        setIntField(term182698, term182698.getClass(), "year", 2027);
        setShortField(term182698, term182698.getClass(), "month", (short) 7);
        setShortField(term182698, term182698.getClass(), "day", (short) 1);
        setField(term182697, term182697.getClass(), "date", term182698);
        setByteField(term182702, term182702.getClass(), "hour", (byte) 4);
        setByteField(term182702, term182702.getClass(), "minute", (byte) 33);
        setByteField(term182702, term182702.getClass(), "second", (byte) 13);
        setIntField(term182702, term182702.getClass(), "nano", 724808977);
        setField(term182697, term182697.getClass(), "time", term182702);
        setField(term182681, term182681.getClass(), "registerTime", term182697);
        setIntField(term182708, term182708.getClass(), "year", 2025);
        setShortField(term182708, term182708.getClass(), "month", (short) 9);
        setShortField(term182708, term182708.getClass(), "day", (short) 18);
        setField(term182707, term182707.getClass(), "date", term182708);
        setByteField(term182712, term182712.getClass(), "hour", (byte) 19);
        setByteField(term182712, term182712.getClass(), "minute", (byte) 22);
        setByteField(term182712, term182712.getClass(), "second", (byte) 53);
        setIntField(term182712, term182712.getClass(), "nano", 683362814);
        setField(term182707, term182707.getClass(), "time", term182712);
        setField(term182681, term182681.getClass(), "accessTime", term182707);
        setField(term182679, term182679.getClass(), "card", term182681);
        setIntField(term182679, term182679.getClass(), "lastDataVersion", -1783894396);
        setField(term182679, term182679.getClass(), "userName", "AYcehuoFwZ");
        setIntField(term182679, term182679.getClass(), "point", 1987866455);
        setIntField(term182679, term182679.getClass(), "totalPoint", 169960707);
        setIntField(term182679, term182679.getClass(), "iconId", 696223765);
        setIntField(term182679, term182679.getClass(), "nameplateId", -1576119321);
        setIntField(term182679, term182679.getClass(), "frameId", 2102071103);
        setIntField(term182679, term182679.getClass(), "trophyId", -588406565);
        setIntField(term182679, term182679.getClass(), "playCount", -278354410);
        setIntField(term182679, term182679.getClass(), "playVsCount", 1989057696);
        setIntField(term182679, term182679.getClass(), "playSyncCount", 1178448950);
        setIntField(term182679, term182679.getClass(), "winCount", -1160980727);
        setIntField(term182679, term182679.getClass(), "helpCount", -1136464198);
        setIntField(term182679, term182679.getClass(), "comboCount", -1841691474);
        setIntField(term182679, term182679.getClass(), "feverCount", 861826506);
        setIntField(term182679, term182679.getClass(), "totalHiScore", -182317006);
        setIntField(term182679, term182679.getClass(), "totalEasyHighScore", -556152767);
        setIntField(term182679, term182679.getClass(), "totalBasicHighScore", -861993138);
        setIntField(term182679, term182679.getClass(), "totalAdvancedHighScore", -42719606);
        setIntField(term182679, term182679.getClass(), "totalExpertHighScore", -1289505790);
        setIntField(term182679, term182679.getClass(), "totalMasterHighScore", -1686865683);
        setIntField(term182679, term182679.getClass(), "totalReMasterHighScore", 1657564317);
        setIntField(term182679, term182679.getClass(), "totalHighSync", 772590298);
        setIntField(term182679, term182679.getClass(), "totalEasySync", -1434416781);
        setIntField(term182679, term182679.getClass(), "totalBasicSync", 1057250297);
        setIntField(term182679, term182679.getClass(), "totalAdvancedSync", 243338625);
        setIntField(term182679, term182679.getClass(), "totalExpertSync", 922913031);
        setIntField(term182679, term182679.getClass(), "totalMasterSync", 1159591759);
        setIntField(term182679, term182679.getClass(), "totalReMasterSync", 281866697);
        setIntField(term182679, term182679.getClass(), "playerRating", -247893558);
        setIntField(term182679, term182679.getClass(), "highestRating", -997425509);
        setIntField(term182679, term182679.getClass(), "rankAuthTailId", 794511603);
        setField(term182679, term182679.getClass(), "eventWatchedDate", "MkKeGpajFk");
        setField(term182679, term182679.getClass(), "webLimitDate", "JhIjEseRRP");
        setIntField(term182679, term182679.getClass(), "challengeTrackPhase", -1316995230);
        setIntField(term182679, term182679.getClass(), "firstPlayBits", 670477459);
        setField(term182679, term182679.getClass(), "lastPlayDate", "qlzeNoUsis");
        setIntField(term182679, term182679.getClass(), "lastPlaceId", 924608241);
        setField(term182679, term182679.getClass(), "lastPlaceName", "yzmxcgrHQF");
        setIntField(term182679, term182679.getClass(), "lastRegionId", -1363281067);
        setField(term182679, term182679.getClass(), "lastRegionName", "XCCRJOWaYi");
        setField(term182679, term182679.getClass(), "lastClientId", "LGjjIEeXNn");
        setField(term182679, term182679.getClass(), "lastCountryCode", "gxjxaNDCjb");
        setIntField(term182679, term182679.getClass(), "eventPoint", 1199386907);
        setIntField(term182679, term182679.getClass(), "totalLv", -999548178);
        setIntField(term182679, term182679.getClass(), "lastLoginBonusDay", -867164405);
        setIntField(term182679, term182679.getClass(), "lastSurvivalBonusDay", 1822905927);
        setIntField(term182679, term182679.getClass(), "loginBonusLv", 948237461);
        setField(term182677, term182677.getClass(), "user", term182679);
        setIntField(term182677, term182677.getClass(), "musicId", 1391978687);
        setIntField(term182677, term182677.getClass(), "level", 727126690);
        setIntField(term182677, term182677.getClass(), "playCount", 1140053500);
        setIntField(term182677, term182677.getClass(), "scoreMax", -1390969369);
        setIntField(term182677, term182677.getClass(), "syncRateMax", -861634584);
        setBooleanField(term182677, term182677.getClass(), "isAllPerfect", false);
        setIntField(term182677, term182677.getClass(), "isAllPerfectPlus", 1721296510);
        setIntField(term182677, term182677.getClass(), "fullCombo", -1888933685);
        setIntField(term182677, term182677.getClass(), "maxFever", -1342788578);
        setIntField(term182677, term182677.getClass(), "achievement", 128927142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFullCombo", argTypes, term182677, args);
    }

};


