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

public class UserDetail_setEventWatchedDate_102827017999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4285774;

    public UserDetail_setEventWatchedDate_102827017999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4285778 = new Long(5437696365924758973L);
        Integer term4285841 = new Integer(994094102);
        Integer term4285843 = new Integer(-1536607529);
        Integer term4285845 = new Integer(2103296701);
        Integer term4285847 = new Integer(56957852);
        Integer term4285849 = new Integer(1777669010);
        ArrayList term4285839 = new ArrayList();
        ((ArrayList) term4285839).add(term4285841);
        ((ArrayList) term4285839).add(term4285843);
        ((ArrayList) term4285839).add(term4285845);
        ((ArrayList) term4285839).add(term4285847);
        ((ArrayList) term4285839).add(term4285849);
        ArrayList term4285853 = new ArrayList();
        term4285774 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4285776 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4285792 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4285793 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4285797 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4285802 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4285803 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4285807 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4285774, term4285774.getClass(), "id", -8112736166403386850L);
        setLongField(term4285776, term4285776.getClass(), "id", -1006214911028260231L);
        setField(term4285776, term4285776.getClass(), "extId", term4285778);
        setField(term4285776, term4285776.getClass(), "luid", "ANQOTNQKFT");
        setIntField(term4285793, term4285793.getClass(), "year", 2016);
        setShortField(term4285793, term4285793.getClass(), "month", (short) 4);
        setShortField(term4285793, term4285793.getClass(), "day", (short) 4);
        setField(term4285792, term4285792.getClass(), "date", term4285793);
        setByteField(term4285797, term4285797.getClass(), "hour", (byte) 4);
        setByteField(term4285797, term4285797.getClass(), "minute", (byte) 1);
        setByteField(term4285797, term4285797.getClass(), "second", (byte) 40);
        setIntField(term4285797, term4285797.getClass(), "nano", 371832869);
        setField(term4285792, term4285792.getClass(), "time", term4285797);
        setField(term4285776, term4285776.getClass(), "registerTime", term4285792);
        setIntField(term4285803, term4285803.getClass(), "year", 2012);
        setShortField(term4285803, term4285803.getClass(), "month", (short) 4);
        setShortField(term4285803, term4285803.getClass(), "day", (short) 1);
        setField(term4285802, term4285802.getClass(), "date", term4285803);
        setByteField(term4285807, term4285807.getClass(), "hour", (byte) 14);
        setByteField(term4285807, term4285807.getClass(), "minute", (byte) 56);
        setByteField(term4285807, term4285807.getClass(), "second", (byte) 42);
        setIntField(term4285807, term4285807.getClass(), "nano", 332755114);
        setField(term4285802, term4285802.getClass(), "time", term4285807);
        setField(term4285776, term4285776.getClass(), "accessTime", term4285802);
        setField(term4285774, term4285774.getClass(), "card", term4285776);
        setField(term4285774, term4285774.getClass(), "userName", "RRWZnlmbKT");
        setIntField(term4285774, term4285774.getClass(), "isNetMember", 1933481496);
        setIntField(term4285774, term4285774.getClass(), "iconId", 1778697824);
        setIntField(term4285774, term4285774.getClass(), "plateId", 1919175758);
        setIntField(term4285774, term4285774.getClass(), "titleId", 638023009);
        setIntField(term4285774, term4285774.getClass(), "partnerId", 1641801141);
        setIntField(term4285774, term4285774.getClass(), "frameId", 192283282);
        setIntField(term4285774, term4285774.getClass(), "selectMapId", -487419072);
        setIntField(term4285774, term4285774.getClass(), "totalAwake", 2071508655);
        setIntField(term4285774, term4285774.getClass(), "gradeRating", 1422793934);
        setIntField(term4285774, term4285774.getClass(), "musicRating", -398974030);
        setIntField(term4285774, term4285774.getClass(), "playerRating", -1241850332);
        setIntField(term4285774, term4285774.getClass(), "highestRating", 215808649);
        setIntField(term4285774, term4285774.getClass(), "gradeRank", 607541548);
        setIntField(term4285774, term4285774.getClass(), "classRank", 1695771931);
        setIntField(term4285774, term4285774.getClass(), "courseRank", 516404100);
        setField(term4285774, term4285774.getClass(), "charaSlot", term4285839);
        setField(term4285774, term4285774.getClass(), "charaLockSlot", term4285853);
        setLongField(term4285774, term4285774.getClass(), "contentBit", 4178750701549411253L);
        setIntField(term4285774, term4285774.getClass(), "playCount", -1386287583);
        setField(term4285774, term4285774.getClass(), "eventWatchedDate", "MBtwXawGdF");
        setField(term4285774, term4285774.getClass(), "lastGameId", "cmmZOuNmIN");
        setField(term4285774, term4285774.getClass(), "lastRomVersion", "aoHawyoauU");
        setField(term4285774, term4285774.getClass(), "lastDataVersion", "yMRxJvAoXt");
        setField(term4285774, term4285774.getClass(), "lastLoginDate", "drBHkfFOKH");
        setField(term4285774, term4285774.getClass(), "lastPlayDate", "WwIzjwCWZs");
        setIntField(term4285774, term4285774.getClass(), "lastPlayCredit", -2128693087);
        setIntField(term4285774, term4285774.getClass(), "lastPlayMode", -1544666512);
        setIntField(term4285774, term4285774.getClass(), "lastPlaceId", 1332547337);
        setField(term4285774, term4285774.getClass(), "lastPlaceName", "brkgHxqQZK");
        setIntField(term4285774, term4285774.getClass(), "lastAllNetId", 1067410329);
        setIntField(term4285774, term4285774.getClass(), "lastRegionId", -138574209);
        setField(term4285774, term4285774.getClass(), "lastRegionName", "ZPqGzMCeob");
        setField(term4285774, term4285774.getClass(), "lastClientId", "yzjsgZsLEA");
        setField(term4285774, term4285774.getClass(), "lastCountryCode", "iwzGhXKpYE");
        setIntField(term4285774, term4285774.getClass(), "lastSelectEMoney", 1412282887);
        setIntField(term4285774, term4285774.getClass(), "lastSelectTicket", -1583575539);
        setIntField(term4285774, term4285774.getClass(), "lastSelectCourse", 680084749);
        setIntField(term4285774, term4285774.getClass(), "lastCountCourse", -1078375346);
        setField(term4285774, term4285774.getClass(), "firstGameId", "UAXQJJUINF");
        setField(term4285774, term4285774.getClass(), "firstRomVersion", "XgdAKlslzg");
        setField(term4285774, term4285774.getClass(), "firstDataVersion", "JRTJpEAzlQ");
        setField(term4285774, term4285774.getClass(), "firstPlayDate", "ffbWbRmNSQ");
        setField(term4285774, term4285774.getClass(), "compatibleCmVersion", "rSvxeilmSS");
        setField(term4285774, term4285774.getClass(), "dailyBonusDate", "bmCEzhlAuG");
        setField(term4285774, term4285774.getClass(), "dailyCourseBonusDate", "FGDYcgUBct");
        setField(term4285774, term4285774.getClass(), "lastPairLoginDate", "iIyErDmWXR");
        setField(term4285774, term4285774.getClass(), "lastTrialPlayDate", "dKIZnOECjk");
        setIntField(term4285774, term4285774.getClass(), "playVsCount", 77754755);
        setIntField(term4285774, term4285774.getClass(), "playSyncCount", 2125943150);
        setIntField(term4285774, term4285774.getClass(), "winCount", 927151063);
        setIntField(term4285774, term4285774.getClass(), "helpCount", 1573960120);
        setIntField(term4285774, term4285774.getClass(), "comboCount", 1062963394);
        setLongField(term4285774, term4285774.getClass(), "totalDeluxscore", 3279241147613342514L);
        setLongField(term4285774, term4285774.getClass(), "totalBasicDeluxscore", 1092221796670125896L);
        setLongField(term4285774, term4285774.getClass(), "totalAdvancedDeluxscore", 9149793349230960244L);
        setLongField(term4285774, term4285774.getClass(), "totalExpertDeluxscore", 8779338890079512711L);
        setLongField(term4285774, term4285774.getClass(), "totalMasterDeluxscore", 1779953106478085189L);
        setLongField(term4285774, term4285774.getClass(), "totalReMasterDeluxscore", 580201945911244303L);
        setIntField(term4285774, term4285774.getClass(), "totalSync", -935614299);
        setIntField(term4285774, term4285774.getClass(), "totalBasicSync", -1308272627);
        setIntField(term4285774, term4285774.getClass(), "totalAdvancedSync", -117139512);
        setIntField(term4285774, term4285774.getClass(), "totalExpertSync", -923539718);
        setIntField(term4285774, term4285774.getClass(), "totalMasterSync", 754571798);
        setIntField(term4285774, term4285774.getClass(), "totalReMasterSync", -1895947186);
        setLongField(term4285774, term4285774.getClass(), "totalAchievement", -6465946637436280697L);
        setLongField(term4285774, term4285774.getClass(), "totalBasicAchievement", 1399946073426378327L);
        setLongField(term4285774, term4285774.getClass(), "totalAdvancedAchievement", -2309795493311005571L);
        setLongField(term4285774, term4285774.getClass(), "totalExpertAchievement", -6954577144626809137L);
        setLongField(term4285774, term4285774.getClass(), "totalMasterAchievement", 950034508357784718L);
        setLongField(term4285774, term4285774.getClass(), "totalReMasterAchievement", -4251777766226052794L);
        setLongField(term4285774, term4285774.getClass(), "playerOldRating", -2278842468375703991L);
        setLongField(term4285774, term4285774.getClass(), "playerNewRating", -2108854323680328821L);
        setIntField(term4285774, term4285774.getClass(), "banState", -1936639149);
        setLongField(term4285774, term4285774.getClass(), "dateTime", -9163251943210308951L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iceBsUhvzp";
        callMethod(klass, "setEventWatchedDate", argTypes, term4285774, args);
    }

};


