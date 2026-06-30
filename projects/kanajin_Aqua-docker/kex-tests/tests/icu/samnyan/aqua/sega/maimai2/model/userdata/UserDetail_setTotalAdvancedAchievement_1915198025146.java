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
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserDetail_setTotalAdvancedAchievement_1915198025146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4312891;
     Object term4313246;

    public UserDetail_setTotalAdvancedAchievement_1915198025146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4312895 = new Long(8037116802229597692L);
        Integer term4312958 = new Integer(-1909045622);
        Integer term4312960 = new Integer(-390781407);
        Integer term4312962 = new Integer(-1039337265);
        ArrayList term4312956 = new ArrayList();
        ((ArrayList) term4312956).add(term4312958);
        ((ArrayList) term4312956).add(term4312960);
        ((ArrayList) term4312956).add(term4312962);
        Integer term4312968 = new Integer(-685914213);
        Integer term4312970 = new Integer(1920458051);
        Integer term4312972 = new Integer(-1153940656);
        Integer term4312974 = new Integer(963396922);
        Integer term4312976 = new Integer(-1975824255);
        ArrayList term4312966 = new ArrayList();
        ((ArrayList) term4312966).add(term4312968);
        ((ArrayList) term4312966).add(term4312970);
        ((ArrayList) term4312966).add(term4312972);
        ((ArrayList) term4312966).add(term4312974);
        ((ArrayList) term4312966).add(term4312976);
        term4312891 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4312893 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4312909 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4312910 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4312914 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4312919 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4312920 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4312924 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4312891, term4312891.getClass(), "id", 5792333390562678774L);
        setLongField(term4312893, term4312893.getClass(), "id", 6073777930808196565L);
        setField(term4312893, term4312893.getClass(), "extId", term4312895);
        setField(term4312893, term4312893.getClass(), "luid", "SIqrIIrLbj");
        setIntField(term4312910, term4312910.getClass(), "year", 2016);
        setShortField(term4312910, term4312910.getClass(), "month", (short) 7);
        setShortField(term4312910, term4312910.getClass(), "day", (short) 21);
        setField(term4312909, term4312909.getClass(), "date", term4312910);
        setByteField(term4312914, term4312914.getClass(), "hour", (byte) 15);
        setByteField(term4312914, term4312914.getClass(), "minute", (byte) 2);
        setByteField(term4312914, term4312914.getClass(), "second", (byte) 42);
        setIntField(term4312914, term4312914.getClass(), "nano", 547832198);
        setField(term4312909, term4312909.getClass(), "time", term4312914);
        setField(term4312893, term4312893.getClass(), "registerTime", term4312909);
        setIntField(term4312920, term4312920.getClass(), "year", 2020);
        setShortField(term4312920, term4312920.getClass(), "month", (short) 9);
        setShortField(term4312920, term4312920.getClass(), "day", (short) 7);
        setField(term4312919, term4312919.getClass(), "date", term4312920);
        setByteField(term4312924, term4312924.getClass(), "hour", (byte) 10);
        setByteField(term4312924, term4312924.getClass(), "minute", (byte) 15);
        setByteField(term4312924, term4312924.getClass(), "second", (byte) 6);
        setIntField(term4312924, term4312924.getClass(), "nano", 442964423);
        setField(term4312919, term4312919.getClass(), "time", term4312924);
        setField(term4312893, term4312893.getClass(), "accessTime", term4312919);
        setField(term4312891, term4312891.getClass(), "card", term4312893);
        setField(term4312891, term4312891.getClass(), "userName", "fCdCiXgXqd");
        setIntField(term4312891, term4312891.getClass(), "isNetMember", -1956406404);
        setIntField(term4312891, term4312891.getClass(), "iconId", -1956964632);
        setIntField(term4312891, term4312891.getClass(), "plateId", -1936414261);
        setIntField(term4312891, term4312891.getClass(), "titleId", 741633268);
        setIntField(term4312891, term4312891.getClass(), "partnerId", -1155514678);
        setIntField(term4312891, term4312891.getClass(), "frameId", 191203072);
        setIntField(term4312891, term4312891.getClass(), "selectMapId", 661335285);
        setIntField(term4312891, term4312891.getClass(), "totalAwake", -577236150);
        setIntField(term4312891, term4312891.getClass(), "gradeRating", 3312404);
        setIntField(term4312891, term4312891.getClass(), "musicRating", -38925923);
        setIntField(term4312891, term4312891.getClass(), "playerRating", 360443358);
        setIntField(term4312891, term4312891.getClass(), "highestRating", 678082498);
        setIntField(term4312891, term4312891.getClass(), "gradeRank", -1724288937);
        setIntField(term4312891, term4312891.getClass(), "classRank", 166791340);
        setIntField(term4312891, term4312891.getClass(), "courseRank", -836714482);
        setField(term4312891, term4312891.getClass(), "charaSlot", term4312956);
        setField(term4312891, term4312891.getClass(), "charaLockSlot", term4312966);
        setLongField(term4312891, term4312891.getClass(), "contentBit", 5759562596836400292L);
        setIntField(term4312891, term4312891.getClass(), "playCount", -1109223301);
        setField(term4312891, term4312891.getClass(), "eventWatchedDate", "UjNmVkJfQy");
        setField(term4312891, term4312891.getClass(), "lastGameId", "MvYEmrJAyl");
        setField(term4312891, term4312891.getClass(), "lastRomVersion", "TpsxhKewwT");
        setField(term4312891, term4312891.getClass(), "lastDataVersion", "xVPorTQyzw");
        setField(term4312891, term4312891.getClass(), "lastLoginDate", "SveTaOZwAo");
        setField(term4312891, term4312891.getClass(), "lastPlayDate", "MuzySgwqWF");
        setIntField(term4312891, term4312891.getClass(), "lastPlayCredit", 267750049);
        setIntField(term4312891, term4312891.getClass(), "lastPlayMode", 206752391);
        setIntField(term4312891, term4312891.getClass(), "lastPlaceId", -581718984);
        setField(term4312891, term4312891.getClass(), "lastPlaceName", "aBiVGjSYmX");
        setIntField(term4312891, term4312891.getClass(), "lastAllNetId", -308048875);
        setIntField(term4312891, term4312891.getClass(), "lastRegionId", 1254681299);
        setField(term4312891, term4312891.getClass(), "lastRegionName", "ltYmBFwXVL");
        setField(term4312891, term4312891.getClass(), "lastClientId", "cKUVgyYBPx");
        setField(term4312891, term4312891.getClass(), "lastCountryCode", "dlRfJkVWVd");
        setIntField(term4312891, term4312891.getClass(), "lastSelectEMoney", 1675101542);
        setIntField(term4312891, term4312891.getClass(), "lastSelectTicket", 678424734);
        setIntField(term4312891, term4312891.getClass(), "lastSelectCourse", 1719010366);
        setIntField(term4312891, term4312891.getClass(), "lastCountCourse", -1083955288);
        setField(term4312891, term4312891.getClass(), "firstGameId", "ykdbUoVEeL");
        setField(term4312891, term4312891.getClass(), "firstRomVersion", "sobovRxefR");
        setField(term4312891, term4312891.getClass(), "firstDataVersion", "ZBPAVpZMdv");
        setField(term4312891, term4312891.getClass(), "firstPlayDate", "AzuLBGEPOA");
        setField(term4312891, term4312891.getClass(), "compatibleCmVersion", "HRLTNYgZjx");
        setField(term4312891, term4312891.getClass(), "dailyBonusDate", "sgxttyMgMP");
        setField(term4312891, term4312891.getClass(), "dailyCourseBonusDate", "hMQEQwDuqI");
        setField(term4312891, term4312891.getClass(), "lastPairLoginDate", "uGXeykgIHS");
        setField(term4312891, term4312891.getClass(), "lastTrialPlayDate", "iYxZBJmYEk");
        setIntField(term4312891, term4312891.getClass(), "playVsCount", 722449941);
        setIntField(term4312891, term4312891.getClass(), "playSyncCount", -1420287053);
        setIntField(term4312891, term4312891.getClass(), "winCount", 701703565);
        setIntField(term4312891, term4312891.getClass(), "helpCount", -767231243);
        setIntField(term4312891, term4312891.getClass(), "comboCount", -1795740185);
        setLongField(term4312891, term4312891.getClass(), "totalDeluxscore", -1486976333436156651L);
        setLongField(term4312891, term4312891.getClass(), "totalBasicDeluxscore", 3364230876488311849L);
        setLongField(term4312891, term4312891.getClass(), "totalAdvancedDeluxscore", -5818239596162044015L);
        setLongField(term4312891, term4312891.getClass(), "totalExpertDeluxscore", 7542746089356511934L);
        setLongField(term4312891, term4312891.getClass(), "totalMasterDeluxscore", -2742939582656915831L);
        setLongField(term4312891, term4312891.getClass(), "totalReMasterDeluxscore", 3211533478792197021L);
        setIntField(term4312891, term4312891.getClass(), "totalSync", 1594449153);
        setIntField(term4312891, term4312891.getClass(), "totalBasicSync", 1501169806);
        setIntField(term4312891, term4312891.getClass(), "totalAdvancedSync", -836047054);
        setIntField(term4312891, term4312891.getClass(), "totalExpertSync", -1958966294);
        setIntField(term4312891, term4312891.getClass(), "totalMasterSync", 683509837);
        setIntField(term4312891, term4312891.getClass(), "totalReMasterSync", -1125156835);
        setLongField(term4312891, term4312891.getClass(), "totalAchievement", -7369007240452726777L);
        setLongField(term4312891, term4312891.getClass(), "totalBasicAchievement", 6346544753003303583L);
        setLongField(term4312891, term4312891.getClass(), "totalAdvancedAchievement", -7335764252688278753L);
        setLongField(term4312891, term4312891.getClass(), "totalExpertAchievement", 1533848606244908070L);
        setLongField(term4312891, term4312891.getClass(), "totalMasterAchievement", -2335811253559927688L);
        setLongField(term4312891, term4312891.getClass(), "totalReMasterAchievement", -5143547487297425604L);
        setLongField(term4312891, term4312891.getClass(), "playerOldRating", 8698339108524613386L);
        setLongField(term4312891, term4312891.getClass(), "playerNewRating", 8487392114078928380L);
        setIntField(term4312891, term4312891.getClass(), "banState", -840244936);
        setLongField(term4312891, term4312891.getClass(), "dateTime", 4007779050294291752L);
        term4313246 = new Long(-2477241760529909712L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4313246;
        callMethod(klass, "setTotalAdvancedAchievement", argTypes, term4312891, args);
    }

};


