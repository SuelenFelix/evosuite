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

public class UserDetail_setCard_43993754578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4273730;
     Object term4274075;

    public UserDetail_setCard_43993754578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4273734 = new Long(6748970300109104263L);
        Integer term4273797 = new Integer(-1299754463);
        Integer term4273799 = new Integer(1383683097);
        Integer term4273801 = new Integer(1395150060);
        ArrayList term4273795 = new ArrayList();
        ((ArrayList) term4273795).add(term4273797);
        ((ArrayList) term4273795).add(term4273799);
        ((ArrayList) term4273795).add(term4273801);
        ArrayList term4273805 = new ArrayList();
        term4273730 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4273732 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4273748 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4273749 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4273753 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4273758 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4273759 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4273763 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4273730, term4273730.getClass(), "id", -1546906296737528869L);
        setLongField(term4273732, term4273732.getClass(), "id", -8500037573465529018L);
        setField(term4273732, term4273732.getClass(), "extId", term4273734);
        setField(term4273732, term4273732.getClass(), "luid", "ESdqnvyoZR");
        setIntField(term4273749, term4273749.getClass(), "year", 2018);
        setShortField(term4273749, term4273749.getClass(), "month", (short) 1);
        setShortField(term4273749, term4273749.getClass(), "day", (short) 16);
        setField(term4273748, term4273748.getClass(), "date", term4273749);
        setByteField(term4273753, term4273753.getClass(), "hour", (byte) 21);
        setByteField(term4273753, term4273753.getClass(), "minute", (byte) 23);
        setByteField(term4273753, term4273753.getClass(), "second", (byte) 58);
        setIntField(term4273753, term4273753.getClass(), "nano", 875302689);
        setField(term4273748, term4273748.getClass(), "time", term4273753);
        setField(term4273732, term4273732.getClass(), "registerTime", term4273748);
        setIntField(term4273759, term4273759.getClass(), "year", 2018);
        setShortField(term4273759, term4273759.getClass(), "month", (short) 9);
        setShortField(term4273759, term4273759.getClass(), "day", (short) 22);
        setField(term4273758, term4273758.getClass(), "date", term4273759);
        setByteField(term4273763, term4273763.getClass(), "hour", (byte) 11);
        setByteField(term4273763, term4273763.getClass(), "minute", (byte) 36);
        setByteField(term4273763, term4273763.getClass(), "second", (byte) 57);
        setIntField(term4273763, term4273763.getClass(), "nano", 840093725);
        setField(term4273758, term4273758.getClass(), "time", term4273763);
        setField(term4273732, term4273732.getClass(), "accessTime", term4273758);
        setField(term4273730, term4273730.getClass(), "card", term4273732);
        setField(term4273730, term4273730.getClass(), "userName", "PXLgcIgHSz");
        setIntField(term4273730, term4273730.getClass(), "isNetMember", 1957596151);
        setIntField(term4273730, term4273730.getClass(), "iconId", -1708453054);
        setIntField(term4273730, term4273730.getClass(), "plateId", 639067472);
        setIntField(term4273730, term4273730.getClass(), "titleId", 1647139609);
        setIntField(term4273730, term4273730.getClass(), "partnerId", 1038623486);
        setIntField(term4273730, term4273730.getClass(), "frameId", -1006456530);
        setIntField(term4273730, term4273730.getClass(), "selectMapId", 1537002700);
        setIntField(term4273730, term4273730.getClass(), "totalAwake", -937229014);
        setIntField(term4273730, term4273730.getClass(), "gradeRating", -1369806093);
        setIntField(term4273730, term4273730.getClass(), "musicRating", 2119005908);
        setIntField(term4273730, term4273730.getClass(), "playerRating", -541779049);
        setIntField(term4273730, term4273730.getClass(), "highestRating", -1842318406);
        setIntField(term4273730, term4273730.getClass(), "gradeRank", 1159826709);
        setIntField(term4273730, term4273730.getClass(), "classRank", 431143756);
        setIntField(term4273730, term4273730.getClass(), "courseRank", 620973908);
        setField(term4273730, term4273730.getClass(), "charaSlot", term4273795);
        setField(term4273730, term4273730.getClass(), "charaLockSlot", term4273805);
        setLongField(term4273730, term4273730.getClass(), "contentBit", -4655255126572954595L);
        setIntField(term4273730, term4273730.getClass(), "playCount", -1189424041);
        setField(term4273730, term4273730.getClass(), "eventWatchedDate", "mzvjtRSaYS");
        setField(term4273730, term4273730.getClass(), "lastGameId", "eqhrrslWcN");
        setField(term4273730, term4273730.getClass(), "lastRomVersion", "GUMnjfUKqg");
        setField(term4273730, term4273730.getClass(), "lastDataVersion", "GQEdNARhQm");
        setField(term4273730, term4273730.getClass(), "lastLoginDate", "GEMMpSOtoN");
        setField(term4273730, term4273730.getClass(), "lastPlayDate", "SDHCDQoeIl");
        setIntField(term4273730, term4273730.getClass(), "lastPlayCredit", 2077580928);
        setIntField(term4273730, term4273730.getClass(), "lastPlayMode", -591312318);
        setIntField(term4273730, term4273730.getClass(), "lastPlaceId", -1380822057);
        setField(term4273730, term4273730.getClass(), "lastPlaceName", "RqxSxtLvjm");
        setIntField(term4273730, term4273730.getClass(), "lastAllNetId", 1549526392);
        setIntField(term4273730, term4273730.getClass(), "lastRegionId", 569662826);
        setField(term4273730, term4273730.getClass(), "lastRegionName", "BFMZAOjrqB");
        setField(term4273730, term4273730.getClass(), "lastClientId", "YGLFXYIVwV");
        setField(term4273730, term4273730.getClass(), "lastCountryCode", "RuscDyhNDs");
        setIntField(term4273730, term4273730.getClass(), "lastSelectEMoney", -2101849624);
        setIntField(term4273730, term4273730.getClass(), "lastSelectTicket", -2118415352);
        setIntField(term4273730, term4273730.getClass(), "lastSelectCourse", 1733760905);
        setIntField(term4273730, term4273730.getClass(), "lastCountCourse", 1185595049);
        setField(term4273730, term4273730.getClass(), "firstGameId", "ahyCOLmGsn");
        setField(term4273730, term4273730.getClass(), "firstRomVersion", "iWBeHXShmX");
        setField(term4273730, term4273730.getClass(), "firstDataVersion", "xXKnvOGYwK");
        setField(term4273730, term4273730.getClass(), "firstPlayDate", "oUaQztDqnR");
        setField(term4273730, term4273730.getClass(), "compatibleCmVersion", "TZLdTVeEpR");
        setField(term4273730, term4273730.getClass(), "dailyBonusDate", "PFItjmPctX");
        setField(term4273730, term4273730.getClass(), "dailyCourseBonusDate", "yoqtIiTjlI");
        setField(term4273730, term4273730.getClass(), "lastPairLoginDate", "ZoMNoVWPQa");
        setField(term4273730, term4273730.getClass(), "lastTrialPlayDate", "nEMkZDMhTL");
        setIntField(term4273730, term4273730.getClass(), "playVsCount", -1994605522);
        setIntField(term4273730, term4273730.getClass(), "playSyncCount", -1181580019);
        setIntField(term4273730, term4273730.getClass(), "winCount", 1016539974);
        setIntField(term4273730, term4273730.getClass(), "helpCount", 1270763384);
        setIntField(term4273730, term4273730.getClass(), "comboCount", 1135503152);
        setLongField(term4273730, term4273730.getClass(), "totalDeluxscore", -2405951667201814073L);
        setLongField(term4273730, term4273730.getClass(), "totalBasicDeluxscore", -5718490193901434090L);
        setLongField(term4273730, term4273730.getClass(), "totalAdvancedDeluxscore", -1832633557530317457L);
        setLongField(term4273730, term4273730.getClass(), "totalExpertDeluxscore", 6133230247651817740L);
        setLongField(term4273730, term4273730.getClass(), "totalMasterDeluxscore", -7882004335622780976L);
        setLongField(term4273730, term4273730.getClass(), "totalReMasterDeluxscore", -8439471968898190785L);
        setIntField(term4273730, term4273730.getClass(), "totalSync", -248105049);
        setIntField(term4273730, term4273730.getClass(), "totalBasicSync", 890691915);
        setIntField(term4273730, term4273730.getClass(), "totalAdvancedSync", -1716506759);
        setIntField(term4273730, term4273730.getClass(), "totalExpertSync", -812388112);
        setIntField(term4273730, term4273730.getClass(), "totalMasterSync", 214596572);
        setIntField(term4273730, term4273730.getClass(), "totalReMasterSync", 111972076);
        setLongField(term4273730, term4273730.getClass(), "totalAchievement", 8185894133670197408L);
        setLongField(term4273730, term4273730.getClass(), "totalBasicAchievement", 7429367086585271374L);
        setLongField(term4273730, term4273730.getClass(), "totalAdvancedAchievement", 7837096071352030655L);
        setLongField(term4273730, term4273730.getClass(), "totalExpertAchievement", 5558793355650010584L);
        setLongField(term4273730, term4273730.getClass(), "totalMasterAchievement", 6077557769918612856L);
        setLongField(term4273730, term4273730.getClass(), "totalReMasterAchievement", 5051630749360850022L);
        setLongField(term4273730, term4273730.getClass(), "playerOldRating", -6481710847846452986L);
        setLongField(term4273730, term4273730.getClass(), "playerNewRating", -7390415972149971833L);
        setIntField(term4273730, term4273730.getClass(), "banState", -290347267);
        setLongField(term4273730, term4273730.getClass(), "dateTime", 8642584375748500314L);
        Long term4274077 = new Long(-8294594230521407691L);
        term4274075 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4274091 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4274092 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4274096 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4274101 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4274102 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4274106 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4274075, term4274075.getClass(), "id", 986799111160066108L);
        setField(term4274075, term4274075.getClass(), "extId", term4274077);
        setField(term4274075, term4274075.getClass(), "luid", "ygmqFIoIIg");
        setIntField(term4274092, term4274092.getClass(), "year", 2026);
        setShortField(term4274092, term4274092.getClass(), "month", (short) 7);
        setShortField(term4274092, term4274092.getClass(), "day", (short) 9);
        setField(term4274091, term4274091.getClass(), "date", term4274092);
        setByteField(term4274096, term4274096.getClass(), "hour", (byte) 22);
        setByteField(term4274096, term4274096.getClass(), "minute", (byte) 31);
        setByteField(term4274096, term4274096.getClass(), "second", (byte) 0);
        setIntField(term4274096, term4274096.getClass(), "nano", 549693781);
        setField(term4274091, term4274091.getClass(), "time", term4274096);
        setField(term4274075, term4274075.getClass(), "registerTime", term4274091);
        setIntField(term4274102, term4274102.getClass(), "year", 2015);
        setShortField(term4274102, term4274102.getClass(), "month", (short) 7);
        setShortField(term4274102, term4274102.getClass(), "day", (short) 19);
        setField(term4274101, term4274101.getClass(), "date", term4274102);
        setByteField(term4274106, term4274106.getClass(), "hour", (byte) 21);
        setByteField(term4274106, term4274106.getClass(), "minute", (byte) 56);
        setByteField(term4274106, term4274106.getClass(), "second", (byte) 31);
        setIntField(term4274106, term4274106.getClass(), "nano", 545446985);
        setField(term4274101, term4274101.getClass(), "time", term4274106);
        setField(term4274075, term4274075.getClass(), "accessTime", term4274101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.general.model.Card");
        Object[] args = new Object[1];
        args[0] = term4274075;
        callMethod(klass, "setCard", argTypes, term4273730, args);
    }

};


