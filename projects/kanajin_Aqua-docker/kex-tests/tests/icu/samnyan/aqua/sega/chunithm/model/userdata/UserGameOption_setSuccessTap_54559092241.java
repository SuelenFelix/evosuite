package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserGameOption_setSuccessTap_54559092241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67627;
     Object term67927;

    public UserGameOption_setSuccessTap_54559092241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term67633 = new Long(2297097306706899827L);
        term67627 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term67629 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term67631 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term67647 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67648 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67652 = newInstance(Class.forName("java.time.LocalTime"));
        Object term67657 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67658 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67662 = newInstance(Class.forName("java.time.LocalTime"));
        Object term67679 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67680 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67684 = newInstance(Class.forName("java.time.LocalTime"));
        Object term67740 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67741 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67745 = newInstance(Class.forName("java.time.LocalTime"));
        Object term67788 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67789 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67793 = newInstance(Class.forName("java.time.LocalTime"));
        Object term67834 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67835 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67839 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term67627, term67627.getClass(), "id", 1118770099037757943L);
        setLongField(term67629, term67629.getClass(), "id", 8084091396945491294L);
        setLongField(term67631, term67631.getClass(), "id", -4010221274821200437L);
        setField(term67631, term67631.getClass(), "extId", term67633);
        setField(term67631, term67631.getClass(), "luid", "JhszTkUWCg");
        setIntField(term67648, term67648.getClass(), "year", 2018);
        setShortField(term67648, term67648.getClass(), "month", (short) 7);
        setShortField(term67648, term67648.getClass(), "day", (short) 9);
        setField(term67647, term67647.getClass(), "date", term67648);
        setByteField(term67652, term67652.getClass(), "hour", (byte) 23);
        setByteField(term67652, term67652.getClass(), "minute", (byte) 14);
        setByteField(term67652, term67652.getClass(), "second", (byte) 46);
        setIntField(term67652, term67652.getClass(), "nano", 735911690);
        setField(term67647, term67647.getClass(), "time", term67652);
        setField(term67631, term67631.getClass(), "registerTime", term67647);
        setIntField(term67658, term67658.getClass(), "year", 2013);
        setShortField(term67658, term67658.getClass(), "month", (short) 3);
        setShortField(term67658, term67658.getClass(), "day", (short) 22);
        setField(term67657, term67657.getClass(), "date", term67658);
        setByteField(term67662, term67662.getClass(), "hour", (byte) 5);
        setByteField(term67662, term67662.getClass(), "minute", (byte) 34);
        setByteField(term67662, term67662.getClass(), "second", (byte) 39);
        setIntField(term67662, term67662.getClass(), "nano", 3203168);
        setField(term67657, term67657.getClass(), "time", term67662);
        setField(term67631, term67631.getClass(), "accessTime", term67657);
        setField(term67629, term67629.getClass(), "card", term67631);
        setField(term67629, term67629.getClass(), "userName", "gfNPCeiULY");
        setIntField(term67680, term67680.getClass(), "year", 2016);
        setShortField(term67680, term67680.getClass(), "month", (short) 10);
        setShortField(term67680, term67680.getClass(), "day", (short) 4);
        setField(term67679, term67679.getClass(), "date", term67680);
        setByteField(term67684, term67684.getClass(), "hour", (byte) 21);
        setByteField(term67684, term67684.getClass(), "minute", (byte) 48);
        setByteField(term67684, term67684.getClass(), "second", (byte) 47);
        setIntField(term67684, term67684.getClass(), "nano", 98983875);
        setField(term67679, term67679.getClass(), "time", term67684);
        setField(term67629, term67629.getClass(), "lastLoginDate", term67679);
        setBooleanField(term67629, term67629.getClass(), "isWebJoin", false);
        setField(term67629, term67629.getClass(), "webLimitDate", "aUJLXfcWME");
        setIntField(term67629, term67629.getClass(), "level", -1117910274);
        setIntField(term67629, term67629.getClass(), "reincarnationNum", 759727183);
        setField(term67629, term67629.getClass(), "exp", "ixeIpUaVug");
        setLongField(term67629, term67629.getClass(), "point", 802806007271882853L);
        setLongField(term67629, term67629.getClass(), "totalPoint", -687030958964015701L);
        setIntField(term67629, term67629.getClass(), "playCount", 383595991);
        setIntField(term67629, term67629.getClass(), "multiPlayCount", 1736367900);
        setIntField(term67629, term67629.getClass(), "multiWinCount", -1181229958);
        setIntField(term67629, term67629.getClass(), "requestResCount", -341744470);
        setIntField(term67629, term67629.getClass(), "acceptResCount", -1112768944);
        setIntField(term67629, term67629.getClass(), "successResCount", -1300523076);
        setIntField(term67629, term67629.getClass(), "playerRating", -1136236336);
        setIntField(term67629, term67629.getClass(), "highestRating", 935191824);
        setIntField(term67629, term67629.getClass(), "nameplateId", 290423749);
        setIntField(term67629, term67629.getClass(), "frameId", -2055991020);
        setIntField(term67629, term67629.getClass(), "characterId", 2087954544);
        setIntField(term67629, term67629.getClass(), "trophyId", 885858505);
        setIntField(term67629, term67629.getClass(), "playedTutorialBit", -178058161);
        setIntField(term67629, term67629.getClass(), "firstTutorialCancelNum", -1275142809);
        setIntField(term67629, term67629.getClass(), "masterTutorialCancelNum", 1175936070);
        setIntField(term67629, term67629.getClass(), "totalRepertoireCount", -479776378);
        setIntField(term67629, term67629.getClass(), "totalMapNum", 947385214);
        setLongField(term67629, term67629.getClass(), "totalHiScore", -6658692066502742692L);
        setLongField(term67629, term67629.getClass(), "totalBasicHighScore", 7505187196596103566L);
        setLongField(term67629, term67629.getClass(), "totalAdvancedHighScore", 3827525335107462030L);
        setLongField(term67629, term67629.getClass(), "totalExpertHighScore", -6895327543559831172L);
        setLongField(term67629, term67629.getClass(), "totalMasterHighScore", 475216242691154379L);
        setIntField(term67741, term67741.getClass(), "year", 2027);
        setShortField(term67741, term67741.getClass(), "month", (short) 1);
        setShortField(term67741, term67741.getClass(), "day", (short) 18);
        setField(term67740, term67740.getClass(), "date", term67741);
        setByteField(term67745, term67745.getClass(), "hour", (byte) 14);
        setByteField(term67745, term67745.getClass(), "minute", (byte) 46);
        setByteField(term67745, term67745.getClass(), "second", (byte) 5);
        setIntField(term67745, term67745.getClass(), "nano", 748048450);
        setField(term67740, term67740.getClass(), "time", term67745);
        setField(term67629, term67629.getClass(), "eventWatchedDate", term67740);
        setIntField(term67629, term67629.getClass(), "friendCount", -76877870);
        setBooleanField(term67629, term67629.getClass(), "isMaimai", false);
        setField(term67629, term67629.getClass(), "firstGameId", "TELyWFMBJv");
        setField(term67629, term67629.getClass(), "firstRomVersion", "bIqbgRdzpB");
        setField(term67629, term67629.getClass(), "firstDataVersion", "FIUbHJmAEj");
        setIntField(term67789, term67789.getClass(), "year", 2021);
        setShortField(term67789, term67789.getClass(), "month", (short) 9);
        setShortField(term67789, term67789.getClass(), "day", (short) 27);
        setField(term67788, term67788.getClass(), "date", term67789);
        setByteField(term67793, term67793.getClass(), "hour", (byte) 20);
        setByteField(term67793, term67793.getClass(), "minute", (byte) 43);
        setByteField(term67793, term67793.getClass(), "second", (byte) 41);
        setIntField(term67793, term67793.getClass(), "nano", 5544728);
        setField(term67788, term67788.getClass(), "time", term67793);
        setField(term67629, term67629.getClass(), "firstPlayDate", term67788);
        setField(term67629, term67629.getClass(), "lastGameId", "mJrFDaDdyY");
        setField(term67629, term67629.getClass(), "lastRomVersion", "HqyBQNuLnz");
        setField(term67629, term67629.getClass(), "lastDataVersion", "xWkZKbrvmX");
        setIntField(term67835, term67835.getClass(), "year", 2028);
        setShortField(term67835, term67835.getClass(), "month", (short) 1);
        setShortField(term67835, term67835.getClass(), "day", (short) 21);
        setField(term67834, term67834.getClass(), "date", term67835);
        setByteField(term67839, term67839.getClass(), "hour", (byte) 22);
        setByteField(term67839, term67839.getClass(), "minute", (byte) 51);
        setByteField(term67839, term67839.getClass(), "second", (byte) 58);
        setIntField(term67839, term67839.getClass(), "nano", 921867240);
        setField(term67834, term67834.getClass(), "time", term67839);
        setField(term67629, term67629.getClass(), "lastPlayDate", term67834);
        setIntField(term67629, term67629.getClass(), "lastPlaceId", 2104799551);
        setField(term67629, term67629.getClass(), "lastPlaceName", "PTEWoxLNqQ");
        setField(term67629, term67629.getClass(), "lastRegionId", "XiAUBffMZP");
        setField(term67629, term67629.getClass(), "lastRegionName", "pkfsHvqODq");
        setField(term67629, term67629.getClass(), "lastAllNetId", "OoRBUdwown");
        setField(term67629, term67629.getClass(), "lastClientId", "lSidZunNtu");
        setField(term67627, term67627.getClass(), "user", term67629);
        setIntField(term67627, term67627.getClass(), "bgInfo", 1728341653);
        setIntField(term67627, term67627.getClass(), "fieldColor", 1063150462);
        setIntField(term67627, term67627.getClass(), "guideSound", 1817004190);
        setIntField(term67627, term67627.getClass(), "soundEffect", -1901062134);
        setIntField(term67627, term67627.getClass(), "guideLine", -1990968496);
        setIntField(term67627, term67627.getClass(), "speed", -578225035);
        setIntField(term67627, term67627.getClass(), "optionSet", -1437822250);
        setIntField(term67627, term67627.getClass(), "matching", -1551608541);
        setIntField(term67627, term67627.getClass(), "judgePos", 6865110);
        setIntField(term67627, term67627.getClass(), "rating", -1066365393);
        setIntField(term67627, term67627.getClass(), "judgeJustice", -1718581479);
        setIntField(term67627, term67627.getClass(), "judgeAttack", -2115367668);
        setIntField(term67627, term67627.getClass(), "headphone", 180514557);
        setIntField(term67627, term67627.getClass(), "playerLevel", -1220065283);
        setIntField(term67627, term67627.getClass(), "successTap", -1052497999);
        setIntField(term67627, term67627.getClass(), "successExTap", 972378333);
        setIntField(term67627, term67627.getClass(), "successSlideHold", -2070703994);
        setIntField(term67627, term67627.getClass(), "successAir", 735347417);
        setIntField(term67627, term67627.getClass(), "successFlick", -906548765);
        setIntField(term67627, term67627.getClass(), "successSkill", 1801514751);
        setIntField(term67627, term67627.getClass(), "successTapTimbre", 458342034);
        setIntField(term67627, term67627.getClass(), "privacy", 859867598);
        term67927 = new Integer(781983880);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term67927;
        callMethod(klass, "setSuccessTap", argTypes, term67627, args);
    }

};


