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

public class UserDetail_setTotalAdvancedDeluxscore_1643689350134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271914;
     Object term272269;

    public UserDetail_setTotalAdvancedDeluxscore_1643689350134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term271918 = new Long(206360660645917003L);
        Integer term271981 = new Integer(-315809486);
        Integer term271983 = new Integer(-1846398473);
        Integer term271985 = new Integer(-11976264);
        ArrayList term271979 = new ArrayList();
        ((ArrayList) term271979).add(term271981);
        ((ArrayList) term271979).add(term271983);
        ((ArrayList) term271979).add(term271985);
        Integer term271991 = new Integer(1655201167);
        Integer term271993 = new Integer(-613873747);
        Integer term271995 = new Integer(1141630209);
        Integer term271997 = new Integer(-1809659280);
        Integer term271999 = new Integer(2076646471);
        ArrayList term271989 = new ArrayList();
        ((ArrayList) term271989).add(term271991);
        ((ArrayList) term271989).add(term271993);
        ((ArrayList) term271989).add(term271995);
        ((ArrayList) term271989).add(term271997);
        ((ArrayList) term271989).add(term271999);
        term271914 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term271916 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term271932 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term271933 = newInstance(Class.forName("java.time.LocalDate"));
        Object term271937 = newInstance(Class.forName("java.time.LocalTime"));
        Object term271942 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term271943 = newInstance(Class.forName("java.time.LocalDate"));
        Object term271947 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term271914, term271914.getClass(), "id", -5936646621425957877L);
        setLongField(term271916, term271916.getClass(), "id", -5902615999714169341L);
        setField(term271916, term271916.getClass(), "extId", term271918);
        setField(term271916, term271916.getClass(), "luid", "DbAALmmBfw");
        setIntField(term271933, term271933.getClass(), "year", 2022);
        setShortField(term271933, term271933.getClass(), "month", (short) 3);
        setShortField(term271933, term271933.getClass(), "day", (short) 7);
        setField(term271932, term271932.getClass(), "date", term271933);
        setByteField(term271937, term271937.getClass(), "hour", (byte) 12);
        setByteField(term271937, term271937.getClass(), "minute", (byte) 16);
        setByteField(term271937, term271937.getClass(), "second", (byte) 2);
        setIntField(term271937, term271937.getClass(), "nano", 451612574);
        setField(term271932, term271932.getClass(), "time", term271937);
        setField(term271916, term271916.getClass(), "registerTime", term271932);
        setIntField(term271943, term271943.getClass(), "year", 2024);
        setShortField(term271943, term271943.getClass(), "month", (short) 11);
        setShortField(term271943, term271943.getClass(), "day", (short) 20);
        setField(term271942, term271942.getClass(), "date", term271943);
        setByteField(term271947, term271947.getClass(), "hour", (byte) 8);
        setByteField(term271947, term271947.getClass(), "minute", (byte) 8);
        setByteField(term271947, term271947.getClass(), "second", (byte) 34);
        setIntField(term271947, term271947.getClass(), "nano", 291120784);
        setField(term271942, term271942.getClass(), "time", term271947);
        setField(term271916, term271916.getClass(), "accessTime", term271942);
        setField(term271914, term271914.getClass(), "card", term271916);
        setField(term271914, term271914.getClass(), "userName", "iMsKpObxTr");
        setIntField(term271914, term271914.getClass(), "isNetMember", -246462081);
        setIntField(term271914, term271914.getClass(), "iconId", -746964918);
        setIntField(term271914, term271914.getClass(), "plateId", 783386884);
        setIntField(term271914, term271914.getClass(), "titleId", -329396039);
        setIntField(term271914, term271914.getClass(), "partnerId", 1420650543);
        setIntField(term271914, term271914.getClass(), "frameId", 2087127939);
        setIntField(term271914, term271914.getClass(), "selectMapId", 2107341831);
        setIntField(term271914, term271914.getClass(), "totalAwake", 2030659493);
        setIntField(term271914, term271914.getClass(), "gradeRating", 1854736876);
        setIntField(term271914, term271914.getClass(), "musicRating", 1658130558);
        setIntField(term271914, term271914.getClass(), "playerRating", -1415526463);
        setIntField(term271914, term271914.getClass(), "highestRating", 935603895);
        setIntField(term271914, term271914.getClass(), "gradeRank", 941821636);
        setIntField(term271914, term271914.getClass(), "classRank", -2067380232);
        setIntField(term271914, term271914.getClass(), "courseRank", -654617012);
        setField(term271914, term271914.getClass(), "charaSlot", term271979);
        setField(term271914, term271914.getClass(), "charaLockSlot", term271989);
        setLongField(term271914, term271914.getClass(), "contentBit", 518333083454643553L);
        setIntField(term271914, term271914.getClass(), "playCount", -1036820640);
        setField(term271914, term271914.getClass(), "eventWatchedDate", "aIYplUbvHO");
        setField(term271914, term271914.getClass(), "lastGameId", "JkaZHJDhYZ");
        setField(term271914, term271914.getClass(), "lastRomVersion", "roZerEuiZa");
        setField(term271914, term271914.getClass(), "lastDataVersion", "COZVMMcYKc");
        setField(term271914, term271914.getClass(), "lastLoginDate", "gaGndEorGU");
        setField(term271914, term271914.getClass(), "lastPlayDate", "OfFpMTyLVK");
        setIntField(term271914, term271914.getClass(), "lastPlayCredit", -168102957);
        setIntField(term271914, term271914.getClass(), "lastPlayMode", -407557094);
        setIntField(term271914, term271914.getClass(), "lastPlaceId", -1046077462);
        setField(term271914, term271914.getClass(), "lastPlaceName", "WqeYNMSjhf");
        setIntField(term271914, term271914.getClass(), "lastAllNetId", 1750872206);
        setIntField(term271914, term271914.getClass(), "lastRegionId", 1580510219);
        setField(term271914, term271914.getClass(), "lastRegionName", "yeKFEzsyvy");
        setField(term271914, term271914.getClass(), "lastClientId", "QdKvoTHPsd");
        setField(term271914, term271914.getClass(), "lastCountryCode", "aglgSCaSUZ");
        setIntField(term271914, term271914.getClass(), "lastSelectEMoney", 1046090734);
        setIntField(term271914, term271914.getClass(), "lastSelectTicket", -256722068);
        setIntField(term271914, term271914.getClass(), "lastSelectCourse", -1073993407);
        setIntField(term271914, term271914.getClass(), "lastCountCourse", 1942012215);
        setField(term271914, term271914.getClass(), "firstGameId", "CBcAPJulAJ");
        setField(term271914, term271914.getClass(), "firstRomVersion", "OvhWHNceRd");
        setField(term271914, term271914.getClass(), "firstDataVersion", "HklBHhsDkb");
        setField(term271914, term271914.getClass(), "firstPlayDate", "ZUfzXzppnP");
        setField(term271914, term271914.getClass(), "compatibleCmVersion", "JArWBUFihn");
        setField(term271914, term271914.getClass(), "dailyBonusDate", "mxKkHWbIdc");
        setField(term271914, term271914.getClass(), "dailyCourseBonusDate", "DXZXekQqdI");
        setField(term271914, term271914.getClass(), "lastPairLoginDate", "tShkCaETwQ");
        setField(term271914, term271914.getClass(), "lastTrialPlayDate", "wxocsXiNGF");
        setIntField(term271914, term271914.getClass(), "playVsCount", 782162447);
        setIntField(term271914, term271914.getClass(), "playSyncCount", 918360278);
        setIntField(term271914, term271914.getClass(), "winCount", -310671267);
        setIntField(term271914, term271914.getClass(), "helpCount", -296812228);
        setIntField(term271914, term271914.getClass(), "comboCount", -1264993632);
        setLongField(term271914, term271914.getClass(), "totalDeluxscore", -7084809245801237956L);
        setLongField(term271914, term271914.getClass(), "totalBasicDeluxscore", -7315402021859748064L);
        setLongField(term271914, term271914.getClass(), "totalAdvancedDeluxscore", -52073785978030619L);
        setLongField(term271914, term271914.getClass(), "totalExpertDeluxscore", 341769498416662394L);
        setLongField(term271914, term271914.getClass(), "totalMasterDeluxscore", -129663404187844313L);
        setLongField(term271914, term271914.getClass(), "totalReMasterDeluxscore", 291007137479912402L);
        setIntField(term271914, term271914.getClass(), "totalSync", 1729434179);
        setIntField(term271914, term271914.getClass(), "totalBasicSync", -721562174);
        setIntField(term271914, term271914.getClass(), "totalAdvancedSync", 388250530);
        setIntField(term271914, term271914.getClass(), "totalExpertSync", 1602460798);
        setIntField(term271914, term271914.getClass(), "totalMasterSync", 642817798);
        setIntField(term271914, term271914.getClass(), "totalReMasterSync", -1111363431);
        setLongField(term271914, term271914.getClass(), "totalAchievement", 1903639732323149385L);
        setLongField(term271914, term271914.getClass(), "totalBasicAchievement", -607694195018645086L);
        setLongField(term271914, term271914.getClass(), "totalAdvancedAchievement", 6394436593172946736L);
        setLongField(term271914, term271914.getClass(), "totalExpertAchievement", -38585185946580577L);
        setLongField(term271914, term271914.getClass(), "totalMasterAchievement", 3129782637325614889L);
        setLongField(term271914, term271914.getClass(), "totalReMasterAchievement", 28241254527473946L);
        setLongField(term271914, term271914.getClass(), "playerOldRating", -9036688444500837146L);
        setLongField(term271914, term271914.getClass(), "playerNewRating", -1328183611339776600L);
        setIntField(term271914, term271914.getClass(), "banState", -1286614190);
        setLongField(term271914, term271914.getClass(), "dateTime", 9053861292642867398L);
        term272269 = new Long(-5539318748501739771L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term272269;
        callMethod(klass, "setTotalAdvancedDeluxscore", argTypes, term271914, args);
    }

};


