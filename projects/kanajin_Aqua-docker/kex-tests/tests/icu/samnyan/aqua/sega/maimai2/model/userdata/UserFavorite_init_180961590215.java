package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.LinkedList;

public class UserFavorite_init_180961590215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term572619;
     Object term572621;
     Object term572966;
     Object term572968;
     Object term572970;

    public UserFavorite_init_180961590215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term572619 = new Long(2726834685824927951L);
        Long term572625 = new Long(6338971839666144092L);
        ArrayList term572686 = new ArrayList();
        Integer term572692 = new Integer(2078039172);
        Integer term572694 = new Integer(810570789);
        Integer term572696 = new Integer(1688150689);
        ArrayList term572690 = new ArrayList();
        ((ArrayList) term572690).add(term572692);
        ((ArrayList) term572690).add(term572694);
        ((ArrayList) term572690).add(term572696);
        term572621 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term572623 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term572639 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term572640 = newInstance(Class.forName("java.time.LocalDate"));
        Object term572644 = newInstance(Class.forName("java.time.LocalTime"));
        Object term572649 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term572650 = newInstance(Class.forName("java.time.LocalDate"));
        Object term572654 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term572621, term572621.getClass(), "id", 76484417501653868L);
        setLongField(term572623, term572623.getClass(), "id", 2813981036023049759L);
        setField(term572623, term572623.getClass(), "extId", term572625);
        setField(term572623, term572623.getClass(), "luid", "NZLZaDCZEm");
        setIntField(term572640, term572640.getClass(), "year", 2029);
        setShortField(term572640, term572640.getClass(), "month", (short) 7);
        setShortField(term572640, term572640.getClass(), "day", (short) 29);
        setField(term572639, term572639.getClass(), "date", term572640);
        setByteField(term572644, term572644.getClass(), "hour", (byte) 11);
        setByteField(term572644, term572644.getClass(), "minute", (byte) 41);
        setByteField(term572644, term572644.getClass(), "second", (byte) 26);
        setIntField(term572644, term572644.getClass(), "nano", 286115016);
        setField(term572639, term572639.getClass(), "time", term572644);
        setField(term572623, term572623.getClass(), "registerTime", term572639);
        setIntField(term572650, term572650.getClass(), "year", 2027);
        setShortField(term572650, term572650.getClass(), "month", (short) 7);
        setShortField(term572650, term572650.getClass(), "day", (short) 16);
        setField(term572649, term572649.getClass(), "date", term572650);
        setByteField(term572654, term572654.getClass(), "hour", (byte) 9);
        setByteField(term572654, term572654.getClass(), "minute", (byte) 44);
        setByteField(term572654, term572654.getClass(), "second", (byte) 22);
        setIntField(term572654, term572654.getClass(), "nano", 468962417);
        setField(term572649, term572649.getClass(), "time", term572654);
        setField(term572623, term572623.getClass(), "accessTime", term572649);
        setField(term572621, term572621.getClass(), "card", term572623);
        setField(term572621, term572621.getClass(), "userName", "PkxjRBHyfs");
        setIntField(term572621, term572621.getClass(), "isNetMember", -573335530);
        setIntField(term572621, term572621.getClass(), "iconId", 2081139066);
        setIntField(term572621, term572621.getClass(), "plateId", -1956987610);
        setIntField(term572621, term572621.getClass(), "titleId", 1353225606);
        setIntField(term572621, term572621.getClass(), "partnerId", -1578414650);
        setIntField(term572621, term572621.getClass(), "frameId", 374932530);
        setIntField(term572621, term572621.getClass(), "selectMapId", 141559171);
        setIntField(term572621, term572621.getClass(), "totalAwake", -493176836);
        setIntField(term572621, term572621.getClass(), "gradeRating", 2128659569);
        setIntField(term572621, term572621.getClass(), "musicRating", 1342441476);
        setIntField(term572621, term572621.getClass(), "playerRating", 1264327486);
        setIntField(term572621, term572621.getClass(), "highestRating", -948558262);
        setIntField(term572621, term572621.getClass(), "gradeRank", 316061589);
        setIntField(term572621, term572621.getClass(), "classRank", 428230551);
        setIntField(term572621, term572621.getClass(), "courseRank", 963007766);
        setField(term572621, term572621.getClass(), "charaSlot", term572686);
        setField(term572621, term572621.getClass(), "charaLockSlot", term572690);
        setLongField(term572621, term572621.getClass(), "contentBit", -7501704328949394275L);
        setIntField(term572621, term572621.getClass(), "playCount", 1746541915);
        setField(term572621, term572621.getClass(), "eventWatchedDate", "KjsScVxnHe");
        setField(term572621, term572621.getClass(), "lastGameId", "xQDuikmhAo");
        setField(term572621, term572621.getClass(), "lastRomVersion", "yAccDYveLV");
        setField(term572621, term572621.getClass(), "lastDataVersion", "ZymGZrmrDY");
        setField(term572621, term572621.getClass(), "lastLoginDate", "cllvFpXsQr");
        setField(term572621, term572621.getClass(), "lastPlayDate", "ZYVicJzFiN");
        setIntField(term572621, term572621.getClass(), "lastPlayCredit", -2015055437);
        setIntField(term572621, term572621.getClass(), "lastPlayMode", -165380343);
        setIntField(term572621, term572621.getClass(), "lastPlaceId", -450033610);
        setField(term572621, term572621.getClass(), "lastPlaceName", "TOqpzzQbai");
        setIntField(term572621, term572621.getClass(), "lastAllNetId", 1330671540);
        setIntField(term572621, term572621.getClass(), "lastRegionId", -1940336078);
        setField(term572621, term572621.getClass(), "lastRegionName", "VBNykXCQRl");
        setField(term572621, term572621.getClass(), "lastClientId", "QhXlQEGrfM");
        setField(term572621, term572621.getClass(), "lastCountryCode", "mmuQngTLyr");
        setIntField(term572621, term572621.getClass(), "lastSelectEMoney", -303387135);
        setIntField(term572621, term572621.getClass(), "lastSelectTicket", 2027592378);
        setIntField(term572621, term572621.getClass(), "lastSelectCourse", 448331685);
        setIntField(term572621, term572621.getClass(), "lastCountCourse", 917867908);
        setField(term572621, term572621.getClass(), "firstGameId", "ddICHKWbaj");
        setField(term572621, term572621.getClass(), "firstRomVersion", "hOGKJkXbWP");
        setField(term572621, term572621.getClass(), "firstDataVersion", "pzzpZofZfz");
        setField(term572621, term572621.getClass(), "firstPlayDate", "BRShPOrlXe");
        setField(term572621, term572621.getClass(), "compatibleCmVersion", "SwHoFnkfPq");
        setField(term572621, term572621.getClass(), "dailyBonusDate", "ygqDtSWVUM");
        setField(term572621, term572621.getClass(), "dailyCourseBonusDate", "HyvmFAUmbf");
        setField(term572621, term572621.getClass(), "lastPairLoginDate", "YyxFnKvkOz");
        setField(term572621, term572621.getClass(), "lastTrialPlayDate", "PmkvufhBAH");
        setIntField(term572621, term572621.getClass(), "playVsCount", -192463100);
        setIntField(term572621, term572621.getClass(), "playSyncCount", 3848816);
        setIntField(term572621, term572621.getClass(), "winCount", 162932923);
        setIntField(term572621, term572621.getClass(), "helpCount", 369675143);
        setIntField(term572621, term572621.getClass(), "comboCount", -538914808);
        setLongField(term572621, term572621.getClass(), "totalDeluxscore", -1862287599972723874L);
        setLongField(term572621, term572621.getClass(), "totalBasicDeluxscore", 5455901053790918405L);
        setLongField(term572621, term572621.getClass(), "totalAdvancedDeluxscore", 728535483800831313L);
        setLongField(term572621, term572621.getClass(), "totalExpertDeluxscore", -7364597479036161736L);
        setLongField(term572621, term572621.getClass(), "totalMasterDeluxscore", -8971366308191274973L);
        setLongField(term572621, term572621.getClass(), "totalReMasterDeluxscore", -201892873466629017L);
        setIntField(term572621, term572621.getClass(), "totalSync", 958774242);
        setIntField(term572621, term572621.getClass(), "totalBasicSync", 1110559864);
        setIntField(term572621, term572621.getClass(), "totalAdvancedSync", 1361840173);
        setIntField(term572621, term572621.getClass(), "totalExpertSync", -1561890746);
        setIntField(term572621, term572621.getClass(), "totalMasterSync", 1939105172);
        setIntField(term572621, term572621.getClass(), "totalReMasterSync", 1549399621);
        setLongField(term572621, term572621.getClass(), "totalAchievement", 5118815659580289382L);
        setLongField(term572621, term572621.getClass(), "totalBasicAchievement", -9056453039237797881L);
        setLongField(term572621, term572621.getClass(), "totalAdvancedAchievement", 669511012571860571L);
        setLongField(term572621, term572621.getClass(), "totalExpertAchievement", -7409118491348368461L);
        setLongField(term572621, term572621.getClass(), "totalMasterAchievement", 4429504259417123441L);
        setLongField(term572621, term572621.getClass(), "totalReMasterAchievement", 2103410491232330577L);
        setLongField(term572621, term572621.getClass(), "playerOldRating", -7002771484169573877L);
        setLongField(term572621, term572621.getClass(), "playerNewRating", -5918446075587503756L);
        setIntField(term572621, term572621.getClass(), "banState", 1582520926);
        setLongField(term572621, term572621.getClass(), "dateTime", 7206404451853495686L);
        term572966 = new Long(-4639458998334438399L);
        term572968 = new Integer(131819348);
        term572970 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFavorite");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        argTypes[2] = long.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.util.List");
        Object[] args = new Object[5];
        args[0] = term572619;
        args[1] = term572621;
        args[2] = term572966;
        args[3] = term572968;
        args[4] = term572970;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


