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

public class UserDetail_setTotalAdvancedDeluxscore_1643689350135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271969;
     Object term272324;

    public UserDetail_setTotalAdvancedDeluxscore_1643689350135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term271973 = new Long(206360660645917003L);
        Integer term272036 = new Integer(-315809486);
        Integer term272038 = new Integer(-1846398473);
        Integer term272040 = new Integer(-11976264);
        ArrayList term272034 = new ArrayList();
        ((ArrayList) term272034).add(term272036);
        ((ArrayList) term272034).add(term272038);
        ((ArrayList) term272034).add(term272040);
        Integer term272046 = new Integer(1655201167);
        Integer term272048 = new Integer(-613873747);
        Integer term272050 = new Integer(1141630209);
        Integer term272052 = new Integer(-1809659280);
        Integer term272054 = new Integer(2076646471);
        ArrayList term272044 = new ArrayList();
        ((ArrayList) term272044).add(term272046);
        ((ArrayList) term272044).add(term272048);
        ((ArrayList) term272044).add(term272050);
        ((ArrayList) term272044).add(term272052);
        ((ArrayList) term272044).add(term272054);
        term271969 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term271971 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term271987 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term271988 = newInstance(Class.forName("java.time.LocalDate"));
        Object term271992 = newInstance(Class.forName("java.time.LocalTime"));
        Object term271997 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term271998 = newInstance(Class.forName("java.time.LocalDate"));
        Object term272002 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term271969, term271969.getClass(), "id", -5936646621425957877L);
        setLongField(term271971, term271971.getClass(), "id", -5902615999714169341L);
        setField(term271971, term271971.getClass(), "extId", term271973);
        setField(term271971, term271971.getClass(), "luid", "DbAALmmBfw");
        setIntField(term271988, term271988.getClass(), "year", 2022);
        setShortField(term271988, term271988.getClass(), "month", (short) 3);
        setShortField(term271988, term271988.getClass(), "day", (short) 7);
        setField(term271987, term271987.getClass(), "date", term271988);
        setByteField(term271992, term271992.getClass(), "hour", (byte) 12);
        setByteField(term271992, term271992.getClass(), "minute", (byte) 16);
        setByteField(term271992, term271992.getClass(), "second", (byte) 2);
        setIntField(term271992, term271992.getClass(), "nano", 451612574);
        setField(term271987, term271987.getClass(), "time", term271992);
        setField(term271971, term271971.getClass(), "registerTime", term271987);
        setIntField(term271998, term271998.getClass(), "year", 2024);
        setShortField(term271998, term271998.getClass(), "month", (short) 11);
        setShortField(term271998, term271998.getClass(), "day", (short) 20);
        setField(term271997, term271997.getClass(), "date", term271998);
        setByteField(term272002, term272002.getClass(), "hour", (byte) 8);
        setByteField(term272002, term272002.getClass(), "minute", (byte) 8);
        setByteField(term272002, term272002.getClass(), "second", (byte) 34);
        setIntField(term272002, term272002.getClass(), "nano", 291120784);
        setField(term271997, term271997.getClass(), "time", term272002);
        setField(term271971, term271971.getClass(), "accessTime", term271997);
        setField(term271969, term271969.getClass(), "card", term271971);
        setField(term271969, term271969.getClass(), "userName", "iMsKpObxTr");
        setIntField(term271969, term271969.getClass(), "isNetMember", -246462081);
        setIntField(term271969, term271969.getClass(), "iconId", -746964918);
        setIntField(term271969, term271969.getClass(), "plateId", 783386884);
        setIntField(term271969, term271969.getClass(), "titleId", -329396039);
        setIntField(term271969, term271969.getClass(), "partnerId", 1420650543);
        setIntField(term271969, term271969.getClass(), "frameId", 2087127939);
        setIntField(term271969, term271969.getClass(), "selectMapId", 2107341831);
        setIntField(term271969, term271969.getClass(), "totalAwake", 2030659493);
        setIntField(term271969, term271969.getClass(), "gradeRating", 1854736876);
        setIntField(term271969, term271969.getClass(), "musicRating", 1658130558);
        setIntField(term271969, term271969.getClass(), "playerRating", -1415526463);
        setIntField(term271969, term271969.getClass(), "highestRating", 935603895);
        setIntField(term271969, term271969.getClass(), "gradeRank", 941821636);
        setIntField(term271969, term271969.getClass(), "classRank", -2067380232);
        setIntField(term271969, term271969.getClass(), "courseRank", -654617012);
        setField(term271969, term271969.getClass(), "charaSlot", term272034);
        setField(term271969, term271969.getClass(), "charaLockSlot", term272044);
        setLongField(term271969, term271969.getClass(), "contentBit", 518333083454643553L);
        setIntField(term271969, term271969.getClass(), "playCount", -1036820640);
        setField(term271969, term271969.getClass(), "eventWatchedDate", "aIYplUbvHO");
        setField(term271969, term271969.getClass(), "lastGameId", "JkaZHJDhYZ");
        setField(term271969, term271969.getClass(), "lastRomVersion", "roZerEuiZa");
        setField(term271969, term271969.getClass(), "lastDataVersion", "COZVMMcYKc");
        setField(term271969, term271969.getClass(), "lastLoginDate", "gaGndEorGU");
        setField(term271969, term271969.getClass(), "lastPlayDate", "OfFpMTyLVK");
        setIntField(term271969, term271969.getClass(), "lastPlayCredit", -168102957);
        setIntField(term271969, term271969.getClass(), "lastPlayMode", -407557094);
        setIntField(term271969, term271969.getClass(), "lastPlaceId", -1046077462);
        setField(term271969, term271969.getClass(), "lastPlaceName", "WqeYNMSjhf");
        setIntField(term271969, term271969.getClass(), "lastAllNetId", 1750872206);
        setIntField(term271969, term271969.getClass(), "lastRegionId", 1580510219);
        setField(term271969, term271969.getClass(), "lastRegionName", "yeKFEzsyvy");
        setField(term271969, term271969.getClass(), "lastClientId", "QdKvoTHPsd");
        setField(term271969, term271969.getClass(), "lastCountryCode", "aglgSCaSUZ");
        setIntField(term271969, term271969.getClass(), "lastSelectEMoney", 1046090734);
        setIntField(term271969, term271969.getClass(), "lastSelectTicket", -256722068);
        setIntField(term271969, term271969.getClass(), "lastSelectCourse", -1073993407);
        setIntField(term271969, term271969.getClass(), "lastCountCourse", 1942012215);
        setField(term271969, term271969.getClass(), "firstGameId", "CBcAPJulAJ");
        setField(term271969, term271969.getClass(), "firstRomVersion", "OvhWHNceRd");
        setField(term271969, term271969.getClass(), "firstDataVersion", "HklBHhsDkb");
        setField(term271969, term271969.getClass(), "firstPlayDate", "ZUfzXzppnP");
        setField(term271969, term271969.getClass(), "compatibleCmVersion", "JArWBUFihn");
        setField(term271969, term271969.getClass(), "dailyBonusDate", "mxKkHWbIdc");
        setField(term271969, term271969.getClass(), "dailyCourseBonusDate", "DXZXekQqdI");
        setField(term271969, term271969.getClass(), "lastPairLoginDate", "tShkCaETwQ");
        setField(term271969, term271969.getClass(), "lastTrialPlayDate", "wxocsXiNGF");
        setIntField(term271969, term271969.getClass(), "playVsCount", 782162447);
        setIntField(term271969, term271969.getClass(), "playSyncCount", 918360278);
        setIntField(term271969, term271969.getClass(), "winCount", -310671267);
        setIntField(term271969, term271969.getClass(), "helpCount", -296812228);
        setIntField(term271969, term271969.getClass(), "comboCount", -1264993632);
        setLongField(term271969, term271969.getClass(), "totalDeluxscore", -7084809245801237956L);
        setLongField(term271969, term271969.getClass(), "totalBasicDeluxscore", -7315402021859748064L);
        setLongField(term271969, term271969.getClass(), "totalAdvancedDeluxscore", -52073785978030619L);
        setLongField(term271969, term271969.getClass(), "totalExpertDeluxscore", 341769498416662394L);
        setLongField(term271969, term271969.getClass(), "totalMasterDeluxscore", -129663404187844313L);
        setLongField(term271969, term271969.getClass(), "totalReMasterDeluxscore", 291007137479912402L);
        setIntField(term271969, term271969.getClass(), "totalSync", 1729434179);
        setIntField(term271969, term271969.getClass(), "totalBasicSync", -721562174);
        setIntField(term271969, term271969.getClass(), "totalAdvancedSync", 388250530);
        setIntField(term271969, term271969.getClass(), "totalExpertSync", 1602460798);
        setIntField(term271969, term271969.getClass(), "totalMasterSync", 642817798);
        setIntField(term271969, term271969.getClass(), "totalReMasterSync", -1111363431);
        setLongField(term271969, term271969.getClass(), "totalAchievement", 1903639732323149385L);
        setLongField(term271969, term271969.getClass(), "totalBasicAchievement", -607694195018645086L);
        setLongField(term271969, term271969.getClass(), "totalAdvancedAchievement", 6394436593172946736L);
        setLongField(term271969, term271969.getClass(), "totalExpertAchievement", -38585185946580577L);
        setLongField(term271969, term271969.getClass(), "totalMasterAchievement", 3129782637325614889L);
        setLongField(term271969, term271969.getClass(), "totalReMasterAchievement", 28241254527473946L);
        setLongField(term271969, term271969.getClass(), "playerOldRating", -9036688444500837146L);
        setLongField(term271969, term271969.getClass(), "playerNewRating", -1328183611339776600L);
        setIntField(term271969, term271969.getClass(), "banState", -1286614190);
        setLongField(term271969, term271969.getClass(), "dateTime", 9053861292642867398L);
        term272324 = new Long(-5539318748501739771L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term272324;
        callMethod(klass, "setTotalAdvancedDeluxscore", argTypes, term271969, args);
    }

};


