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

public class UserItem_equals_25487912413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40929;
     Object term41286;

    public UserItem_equals_25487912413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term40935 = new Long(2443640364875054177L);
        ArrayList term40996 = new ArrayList();
        Integer term41002 = new Integer(-687282231);
        Integer term41004 = new Integer(1200440315);
        Integer term41006 = new Integer(40571662);
        Integer term41008 = new Integer(1863910269);
        Integer term41010 = new Integer(864645689);
        Integer term41012 = new Integer(279384872);
        ArrayList term41000 = new ArrayList();
        ((ArrayList) term41000).add(term41002);
        ((ArrayList) term41000).add(term41004);
        ((ArrayList) term41000).add(term41006);
        ((ArrayList) term41000).add(term41008);
        ((ArrayList) term41000).add(term41010);
        ((ArrayList) term41000).add(term41012);
        term40929 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem"));
        Object term40931 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term40933 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term40949 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40950 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40954 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40959 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40960 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40964 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term40929, term40929.getClass(), "id", -8538252445590221089L);
        setLongField(term40931, term40931.getClass(), "id", -6690821836959514088L);
        setLongField(term40933, term40933.getClass(), "id", 5914687538634916345L);
        setField(term40933, term40933.getClass(), "extId", term40935);
        setField(term40933, term40933.getClass(), "luid", "bqKksqtAdT");
        setIntField(term40950, term40950.getClass(), "year", 2016);
        setShortField(term40950, term40950.getClass(), "month", (short) 4);
        setShortField(term40950, term40950.getClass(), "day", (short) 18);
        setField(term40949, term40949.getClass(), "date", term40950);
        setByteField(term40954, term40954.getClass(), "hour", (byte) 15);
        setByteField(term40954, term40954.getClass(), "minute", (byte) 56);
        setByteField(term40954, term40954.getClass(), "second", (byte) 45);
        setIntField(term40954, term40954.getClass(), "nano", 248103350);
        setField(term40949, term40949.getClass(), "time", term40954);
        setField(term40933, term40933.getClass(), "registerTime", term40949);
        setIntField(term40960, term40960.getClass(), "year", 2028);
        setShortField(term40960, term40960.getClass(), "month", (short) 3);
        setShortField(term40960, term40960.getClass(), "day", (short) 25);
        setField(term40959, term40959.getClass(), "date", term40960);
        setByteField(term40964, term40964.getClass(), "hour", (byte) 6);
        setByteField(term40964, term40964.getClass(), "minute", (byte) 9);
        setByteField(term40964, term40964.getClass(), "second", (byte) 35);
        setIntField(term40964, term40964.getClass(), "nano", 744453524);
        setField(term40959, term40959.getClass(), "time", term40964);
        setField(term40933, term40933.getClass(), "accessTime", term40959);
        setField(term40931, term40931.getClass(), "card", term40933);
        setField(term40931, term40931.getClass(), "userName", "jAIAdEmULK");
        setIntField(term40931, term40931.getClass(), "isNetMember", -531060561);
        setIntField(term40931, term40931.getClass(), "iconId", -1974107061);
        setIntField(term40931, term40931.getClass(), "plateId", -1806271948);
        setIntField(term40931, term40931.getClass(), "titleId", 1708731871);
        setIntField(term40931, term40931.getClass(), "partnerId", 1855866160);
        setIntField(term40931, term40931.getClass(), "frameId", -1463148153);
        setIntField(term40931, term40931.getClass(), "selectMapId", -121679722);
        setIntField(term40931, term40931.getClass(), "totalAwake", -1283714004);
        setIntField(term40931, term40931.getClass(), "gradeRating", -1085038483);
        setIntField(term40931, term40931.getClass(), "musicRating", 1089796055);
        setIntField(term40931, term40931.getClass(), "playerRating", -456321892);
        setIntField(term40931, term40931.getClass(), "highestRating", 1803068346);
        setIntField(term40931, term40931.getClass(), "gradeRank", 1598485572);
        setIntField(term40931, term40931.getClass(), "classRank", 1328348146);
        setIntField(term40931, term40931.getClass(), "courseRank", 835037846);
        setField(term40931, term40931.getClass(), "charaSlot", term40996);
        setField(term40931, term40931.getClass(), "charaLockSlot", term41000);
        setLongField(term40931, term40931.getClass(), "contentBit", -1596611740124054468L);
        setIntField(term40931, term40931.getClass(), "playCount", 1151852495);
        setField(term40931, term40931.getClass(), "eventWatchedDate", "EuAshkmbna");
        setField(term40931, term40931.getClass(), "lastGameId", "JwQlbBbGJR");
        setField(term40931, term40931.getClass(), "lastRomVersion", "HdWLwfVsAM");
        setField(term40931, term40931.getClass(), "lastDataVersion", "SxeKEdHXSl");
        setField(term40931, term40931.getClass(), "lastLoginDate", "BCAlJpNjIX");
        setField(term40931, term40931.getClass(), "lastPlayDate", "PKClfBAwUr");
        setIntField(term40931, term40931.getClass(), "lastPlayCredit", -1258846135);
        setIntField(term40931, term40931.getClass(), "lastPlayMode", -2113882456);
        setIntField(term40931, term40931.getClass(), "lastPlaceId", 913224981);
        setField(term40931, term40931.getClass(), "lastPlaceName", "JqbKrmVEMy");
        setIntField(term40931, term40931.getClass(), "lastAllNetId", -2064677239);
        setIntField(term40931, term40931.getClass(), "lastRegionId", 584068841);
        setField(term40931, term40931.getClass(), "lastRegionName", "VygCEWaefB");
        setField(term40931, term40931.getClass(), "lastClientId", "PqhYfEyDDA");
        setField(term40931, term40931.getClass(), "lastCountryCode", "fSLHLeuNoa");
        setIntField(term40931, term40931.getClass(), "lastSelectEMoney", -289675978);
        setIntField(term40931, term40931.getClass(), "lastSelectTicket", 1466847406);
        setIntField(term40931, term40931.getClass(), "lastSelectCourse", 1943280473);
        setIntField(term40931, term40931.getClass(), "lastCountCourse", 1068101842);
        setField(term40931, term40931.getClass(), "firstGameId", "IwgPFurObw");
        setField(term40931, term40931.getClass(), "firstRomVersion", "WLaHlrYQyz");
        setField(term40931, term40931.getClass(), "firstDataVersion", "CaeIUTuUFo");
        setField(term40931, term40931.getClass(), "firstPlayDate", "rzoDGjHkzG");
        setField(term40931, term40931.getClass(), "compatibleCmVersion", "NsphHxYiuC");
        setField(term40931, term40931.getClass(), "dailyBonusDate", "XYJztkznbY");
        setField(term40931, term40931.getClass(), "dailyCourseBonusDate", "NeTiWVoyjZ");
        setField(term40931, term40931.getClass(), "lastPairLoginDate", "CGeclMyIOP");
        setField(term40931, term40931.getClass(), "lastTrialPlayDate", "yyWOYvIBsp");
        setIntField(term40931, term40931.getClass(), "playVsCount", 1060522715);
        setIntField(term40931, term40931.getClass(), "playSyncCount", -451590147);
        setIntField(term40931, term40931.getClass(), "winCount", -537090894);
        setIntField(term40931, term40931.getClass(), "helpCount", 105089682);
        setIntField(term40931, term40931.getClass(), "comboCount", 1304790955);
        setLongField(term40931, term40931.getClass(), "totalDeluxscore", -7304801244306393588L);
        setLongField(term40931, term40931.getClass(), "totalBasicDeluxscore", 1676018795123486151L);
        setLongField(term40931, term40931.getClass(), "totalAdvancedDeluxscore", 8578275227150470673L);
        setLongField(term40931, term40931.getClass(), "totalExpertDeluxscore", -2637969624924642017L);
        setLongField(term40931, term40931.getClass(), "totalMasterDeluxscore", 1486119760230388070L);
        setLongField(term40931, term40931.getClass(), "totalReMasterDeluxscore", 8298987863520566549L);
        setIntField(term40931, term40931.getClass(), "totalSync", -1412824084);
        setIntField(term40931, term40931.getClass(), "totalBasicSync", 659034364);
        setIntField(term40931, term40931.getClass(), "totalAdvancedSync", 671129726);
        setIntField(term40931, term40931.getClass(), "totalExpertSync", -1217066846);
        setIntField(term40931, term40931.getClass(), "totalMasterSync", 570145845);
        setIntField(term40931, term40931.getClass(), "totalReMasterSync", 1990162126);
        setLongField(term40931, term40931.getClass(), "totalAchievement", 4361302085818491893L);
        setLongField(term40931, term40931.getClass(), "totalBasicAchievement", -2025074482272457806L);
        setLongField(term40931, term40931.getClass(), "totalAdvancedAchievement", -5564465000971559787L);
        setLongField(term40931, term40931.getClass(), "totalExpertAchievement", -6320896470659278539L);
        setLongField(term40931, term40931.getClass(), "totalMasterAchievement", 1357834364621364655L);
        setLongField(term40931, term40931.getClass(), "totalReMasterAchievement", 5242528388479853404L);
        setLongField(term40931, term40931.getClass(), "playerOldRating", -9094760859641883612L);
        setLongField(term40931, term40931.getClass(), "playerNewRating", 1789068809283154146L);
        setIntField(term40931, term40931.getClass(), "banState", 1728957652);
        setLongField(term40931, term40931.getClass(), "dateTime", -6776970214701629330L);
        setField(term40929, term40929.getClass(), "user", term40931);
        setIntField(term40929, term40929.getClass(), "itemKind", -482056965);
        setIntField(term40929, term40929.getClass(), "itemId", 1727638564);
        setIntField(term40929, term40929.getClass(), "stock", 1102029917);
        setBooleanField(term40929, term40929.getClass(), "isValid", true);
        term41286 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term41286;
        callMethod(klass, "equals", argTypes, term40929, args);
    }

};


