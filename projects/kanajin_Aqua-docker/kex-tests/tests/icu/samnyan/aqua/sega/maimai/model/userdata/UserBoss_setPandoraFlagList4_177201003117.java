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

public class UserBoss_setPandoraFlagList4_177201003117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93879;
     Object term94063;

    public UserBoss_setPandoraFlagList4_177201003117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term93885 = new Long(8512025621149521819L);
        term93879 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        Object term93881 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term93883 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term93899 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term93900 = newInstance(Class.forName("java.time.LocalDate"));
        Object term93904 = newInstance(Class.forName("java.time.LocalTime"));
        Object term93909 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term93910 = newInstance(Class.forName("java.time.LocalDate"));
        Object term93914 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term93879, term93879.getClass(), "id", 9219442829218784847L);
        setLongField(term93881, term93881.getClass(), "id", 5153056225441125523L);
        setLongField(term93883, term93883.getClass(), "id", 8082286259336326914L);
        setField(term93883, term93883.getClass(), "extId", term93885);
        setField(term93883, term93883.getClass(), "luid", "SfWiFjkLGW");
        setIntField(term93900, term93900.getClass(), "year", 2011);
        setShortField(term93900, term93900.getClass(), "month", (short) 10);
        setShortField(term93900, term93900.getClass(), "day", (short) 26);
        setField(term93899, term93899.getClass(), "date", term93900);
        setByteField(term93904, term93904.getClass(), "hour", (byte) 19);
        setByteField(term93904, term93904.getClass(), "minute", (byte) 15);
        setByteField(term93904, term93904.getClass(), "second", (byte) 28);
        setIntField(term93904, term93904.getClass(), "nano", 465029232);
        setField(term93899, term93899.getClass(), "time", term93904);
        setField(term93883, term93883.getClass(), "registerTime", term93899);
        setIntField(term93910, term93910.getClass(), "year", 2027);
        setShortField(term93910, term93910.getClass(), "month", (short) 2);
        setShortField(term93910, term93910.getClass(), "day", (short) 22);
        setField(term93909, term93909.getClass(), "date", term93910);
        setByteField(term93914, term93914.getClass(), "hour", (byte) 4);
        setByteField(term93914, term93914.getClass(), "minute", (byte) 59);
        setByteField(term93914, term93914.getClass(), "second", (byte) 50);
        setIntField(term93914, term93914.getClass(), "nano", 80562715);
        setField(term93909, term93909.getClass(), "time", term93914);
        setField(term93883, term93883.getClass(), "accessTime", term93909);
        setField(term93881, term93881.getClass(), "card", term93883);
        setIntField(term93881, term93881.getClass(), "lastDataVersion", 913561629);
        setField(term93881, term93881.getClass(), "userName", "urBahuOkUQ");
        setIntField(term93881, term93881.getClass(), "point", -82780836);
        setIntField(term93881, term93881.getClass(), "totalPoint", -1538850204);
        setIntField(term93881, term93881.getClass(), "iconId", -2037783207);
        setIntField(term93881, term93881.getClass(), "nameplateId", 799731049);
        setIntField(term93881, term93881.getClass(), "frameId", 1446415915);
        setIntField(term93881, term93881.getClass(), "trophyId", 1616695923);
        setIntField(term93881, term93881.getClass(), "playCount", -1952633376);
        setIntField(term93881, term93881.getClass(), "playVsCount", -2077418776);
        setIntField(term93881, term93881.getClass(), "playSyncCount", 1888684596);
        setIntField(term93881, term93881.getClass(), "winCount", 1391968678);
        setIntField(term93881, term93881.getClass(), "helpCount", -573573198);
        setIntField(term93881, term93881.getClass(), "comboCount", -721584808);
        setIntField(term93881, term93881.getClass(), "feverCount", 2146307582);
        setIntField(term93881, term93881.getClass(), "totalHiScore", 816418778);
        setIntField(term93881, term93881.getClass(), "totalEasyHighScore", -1343139679);
        setIntField(term93881, term93881.getClass(), "totalBasicHighScore", -1422276108);
        setIntField(term93881, term93881.getClass(), "totalAdvancedHighScore", 629145097);
        setIntField(term93881, term93881.getClass(), "totalExpertHighScore", -1038526476);
        setIntField(term93881, term93881.getClass(), "totalMasterHighScore", -1620249948);
        setIntField(term93881, term93881.getClass(), "totalReMasterHighScore", 407409382);
        setIntField(term93881, term93881.getClass(), "totalHighSync", -434813900);
        setIntField(term93881, term93881.getClass(), "totalEasySync", -1591071874);
        setIntField(term93881, term93881.getClass(), "totalBasicSync", -1309509159);
        setIntField(term93881, term93881.getClass(), "totalAdvancedSync", 876797689);
        setIntField(term93881, term93881.getClass(), "totalExpertSync", -851468449);
        setIntField(term93881, term93881.getClass(), "totalMasterSync", -1514712203);
        setIntField(term93881, term93881.getClass(), "totalReMasterSync", 1598781132);
        setIntField(term93881, term93881.getClass(), "playerRating", 1899169938);
        setIntField(term93881, term93881.getClass(), "highestRating", 2086291792);
        setIntField(term93881, term93881.getClass(), "rankAuthTailId", -1433187744);
        setField(term93881, term93881.getClass(), "eventWatchedDate", "zHcZrTMdOT");
        setField(term93881, term93881.getClass(), "webLimitDate", "zIAIXHeKXt");
        setIntField(term93881, term93881.getClass(), "challengeTrackPhase", 1762255097);
        setIntField(term93881, term93881.getClass(), "firstPlayBits", 888018912);
        setField(term93881, term93881.getClass(), "lastPlayDate", "fVkSkOqFEO");
        setIntField(term93881, term93881.getClass(), "lastPlaceId", 856692442);
        setField(term93881, term93881.getClass(), "lastPlaceName", "DLfgyAqDDu");
        setIntField(term93881, term93881.getClass(), "lastRegionId", -2001484892);
        setField(term93881, term93881.getClass(), "lastRegionName", "ryuQaXtwNj");
        setField(term93881, term93881.getClass(), "lastClientId", "OutjKNDSgR");
        setField(term93881, term93881.getClass(), "lastCountryCode", "brfLLGXcwA");
        setIntField(term93881, term93881.getClass(), "eventPoint", -196301425);
        setIntField(term93881, term93881.getClass(), "totalLv", 1709968466);
        setIntField(term93881, term93881.getClass(), "lastLoginBonusDay", 1751184955);
        setIntField(term93881, term93881.getClass(), "lastSurvivalBonusDay", 1782993942);
        setIntField(term93881, term93881.getClass(), "loginBonusLv", 963677814);
        setField(term93879, term93879.getClass(), "user", term93881);
        setLongField(term93879, term93879.getClass(), "pandoraFlagList0", 1093716108786896379L);
        setLongField(term93879, term93879.getClass(), "pandoraFlagList1", 3917904228139004931L);
        setLongField(term93879, term93879.getClass(), "pandoraFlagList2", -2746162973618820048L);
        setLongField(term93879, term93879.getClass(), "pandoraFlagList3", -5466267958566655205L);
        setLongField(term93879, term93879.getClass(), "pandoraFlagList4", 4066162530086558234L);
        setLongField(term93879, term93879.getClass(), "pandoraFlagList5", -1519007571673072893L);
        setLongField(term93879, term93879.getClass(), "pandoraFlagList6", -2965107112757796135L);
        setLongField(term93879, term93879.getClass(), "emblemFlagList", 8628710602325472259L);
        term94063 = new Long(-6397802456253967096L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term94063;
        callMethod(klass, "setPandoraFlagList4", argTypes, term93879, args);
    }

};


