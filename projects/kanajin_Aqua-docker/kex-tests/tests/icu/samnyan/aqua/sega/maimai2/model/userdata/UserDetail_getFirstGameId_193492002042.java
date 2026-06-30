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

public class UserDetail_getFirstGameId_193492002042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218824;

    public UserDetail_getFirstGameId_193492002042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term218828 = new Long(-7400951017937830861L);
        Integer term218891 = new Integer(766065097);
        Integer term218893 = new Integer(1703658250);
        Integer term218895 = new Integer(-942615253);
        Integer term218897 = new Integer(1642227506);
        Integer term218899 = new Integer(-1930855861);
        ArrayList term218889 = new ArrayList();
        ((ArrayList) term218889).add(term218891);
        ((ArrayList) term218889).add(term218893);
        ((ArrayList) term218889).add(term218895);
        ((ArrayList) term218889).add(term218897);
        ((ArrayList) term218889).add(term218899);
        Integer term218905 = new Integer(-59278290);
        Integer term218907 = new Integer(862799975);
        Integer term218909 = new Integer(785517219);
        Integer term218911 = new Integer(-96163747);
        Integer term218913 = new Integer(1191473962);
        Integer term218915 = new Integer(110101710);
        Integer term218917 = new Integer(1819101781);
        Integer term218919 = new Integer(-1430157795);
        Integer term218921 = new Integer(-1943692500);
        ArrayList term218903 = new ArrayList();
        ((ArrayList) term218903).add(term218905);
        ((ArrayList) term218903).add(term218907);
        ((ArrayList) term218903).add(term218909);
        ((ArrayList) term218903).add(term218911);
        ((ArrayList) term218903).add(term218913);
        ((ArrayList) term218903).add(term218915);
        ((ArrayList) term218903).add(term218917);
        ((ArrayList) term218903).add(term218919);
        ((ArrayList) term218903).add(term218921);
        term218824 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term218826 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term218842 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term218843 = newInstance(Class.forName("java.time.LocalDate"));
        Object term218847 = newInstance(Class.forName("java.time.LocalTime"));
        Object term218852 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term218853 = newInstance(Class.forName("java.time.LocalDate"));
        Object term218857 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term218824, term218824.getClass(), "id", -8205078520192460425L);
        setLongField(term218826, term218826.getClass(), "id", -4758441834857567910L);
        setField(term218826, term218826.getClass(), "extId", term218828);
        setField(term218826, term218826.getClass(), "luid", "JCYJNAVVoj");
        setIntField(term218843, term218843.getClass(), "year", 2012);
        setShortField(term218843, term218843.getClass(), "month", (short) 3);
        setShortField(term218843, term218843.getClass(), "day", (short) 6);
        setField(term218842, term218842.getClass(), "date", term218843);
        setByteField(term218847, term218847.getClass(), "hour", (byte) 8);
        setByteField(term218847, term218847.getClass(), "minute", (byte) 53);
        setByteField(term218847, term218847.getClass(), "second", (byte) 27);
        setIntField(term218847, term218847.getClass(), "nano", 49638302);
        setField(term218842, term218842.getClass(), "time", term218847);
        setField(term218826, term218826.getClass(), "registerTime", term218842);
        setIntField(term218853, term218853.getClass(), "year", 2026);
        setShortField(term218853, term218853.getClass(), "month", (short) 5);
        setShortField(term218853, term218853.getClass(), "day", (short) 4);
        setField(term218852, term218852.getClass(), "date", term218853);
        setByteField(term218857, term218857.getClass(), "hour", (byte) 4);
        setByteField(term218857, term218857.getClass(), "minute", (byte) 39);
        setByteField(term218857, term218857.getClass(), "second", (byte) 57);
        setIntField(term218857, term218857.getClass(), "nano", 807455541);
        setField(term218852, term218852.getClass(), "time", term218857);
        setField(term218826, term218826.getClass(), "accessTime", term218852);
        setField(term218824, term218824.getClass(), "card", term218826);
        setField(term218824, term218824.getClass(), "userName", "JyRqiqkXBI");
        setIntField(term218824, term218824.getClass(), "isNetMember", 1517451081);
        setIntField(term218824, term218824.getClass(), "iconId", -1020317108);
        setIntField(term218824, term218824.getClass(), "plateId", 450923402);
        setIntField(term218824, term218824.getClass(), "titleId", -346441975);
        setIntField(term218824, term218824.getClass(), "partnerId", -252504773);
        setIntField(term218824, term218824.getClass(), "frameId", 1683059400);
        setIntField(term218824, term218824.getClass(), "selectMapId", 1519559286);
        setIntField(term218824, term218824.getClass(), "totalAwake", 1885237730);
        setIntField(term218824, term218824.getClass(), "gradeRating", 261995675);
        setIntField(term218824, term218824.getClass(), "musicRating", 1400945112);
        setIntField(term218824, term218824.getClass(), "playerRating", -1431100559);
        setIntField(term218824, term218824.getClass(), "highestRating", 2093909511);
        setIntField(term218824, term218824.getClass(), "gradeRank", -1440780852);
        setIntField(term218824, term218824.getClass(), "classRank", -256492547);
        setIntField(term218824, term218824.getClass(), "courseRank", -1893302330);
        setField(term218824, term218824.getClass(), "charaSlot", term218889);
        setField(term218824, term218824.getClass(), "charaLockSlot", term218903);
        setLongField(term218824, term218824.getClass(), "contentBit", 773046857634653088L);
        setIntField(term218824, term218824.getClass(), "playCount", 1177746134);
        setField(term218824, term218824.getClass(), "eventWatchedDate", "xnOzJJiZgt");
        setField(term218824, term218824.getClass(), "lastGameId", "EXIPfIZBES");
        setField(term218824, term218824.getClass(), "lastRomVersion", "tWnoHUlqUU");
        setField(term218824, term218824.getClass(), "lastDataVersion", "hbuDLhVkTE");
        setField(term218824, term218824.getClass(), "lastLoginDate", "gKKImQZJPQ");
        setField(term218824, term218824.getClass(), "lastPlayDate", "jZFSoRfUbm");
        setIntField(term218824, term218824.getClass(), "lastPlayCredit", 1076828616);
        setIntField(term218824, term218824.getClass(), "lastPlayMode", -621733040);
        setIntField(term218824, term218824.getClass(), "lastPlaceId", -1031608080);
        setField(term218824, term218824.getClass(), "lastPlaceName", "xownqtBHHL");
        setIntField(term218824, term218824.getClass(), "lastAllNetId", -1516023185);
        setIntField(term218824, term218824.getClass(), "lastRegionId", -1813690212);
        setField(term218824, term218824.getClass(), "lastRegionName", "skprvHzjjg");
        setField(term218824, term218824.getClass(), "lastClientId", "OEhrSgqRGn");
        setField(term218824, term218824.getClass(), "lastCountryCode", "fpnyXuhrlN");
        setIntField(term218824, term218824.getClass(), "lastSelectEMoney", 1577352938);
        setIntField(term218824, term218824.getClass(), "lastSelectTicket", 1745100327);
        setIntField(term218824, term218824.getClass(), "lastSelectCourse", 1136069052);
        setIntField(term218824, term218824.getClass(), "lastCountCourse", -733793514);
        setField(term218824, term218824.getClass(), "firstGameId", "ciFNeIqDbW");
        setField(term218824, term218824.getClass(), "firstRomVersion", "WNyBDbLYTY");
        setField(term218824, term218824.getClass(), "firstDataVersion", "TUffiPUBII");
        setField(term218824, term218824.getClass(), "firstPlayDate", "vomUfvYKsJ");
        setField(term218824, term218824.getClass(), "compatibleCmVersion", "SinQYbRmbu");
        setField(term218824, term218824.getClass(), "dailyBonusDate", "CWmrUlxrpJ");
        setField(term218824, term218824.getClass(), "dailyCourseBonusDate", "mxSEuGIieQ");
        setField(term218824, term218824.getClass(), "lastPairLoginDate", "VcvqNZLjvf");
        setField(term218824, term218824.getClass(), "lastTrialPlayDate", "safjQtmzWl");
        setIntField(term218824, term218824.getClass(), "playVsCount", -1188742010);
        setIntField(term218824, term218824.getClass(), "playSyncCount", -143261890);
        setIntField(term218824, term218824.getClass(), "winCount", -20933455);
        setIntField(term218824, term218824.getClass(), "helpCount", -1448787013);
        setIntField(term218824, term218824.getClass(), "comboCount", -998901659);
        setLongField(term218824, term218824.getClass(), "totalDeluxscore", 4916035217158779841L);
        setLongField(term218824, term218824.getClass(), "totalBasicDeluxscore", -5556690534119878819L);
        setLongField(term218824, term218824.getClass(), "totalAdvancedDeluxscore", 2712697079953235002L);
        setLongField(term218824, term218824.getClass(), "totalExpertDeluxscore", 3539218699832186677L);
        setLongField(term218824, term218824.getClass(), "totalMasterDeluxscore", 2007181337265009846L);
        setLongField(term218824, term218824.getClass(), "totalReMasterDeluxscore", 7585912269663848364L);
        setIntField(term218824, term218824.getClass(), "totalSync", -1128990548);
        setIntField(term218824, term218824.getClass(), "totalBasicSync", -1878697260);
        setIntField(term218824, term218824.getClass(), "totalAdvancedSync", 489173758);
        setIntField(term218824, term218824.getClass(), "totalExpertSync", 1717231473);
        setIntField(term218824, term218824.getClass(), "totalMasterSync", -692019993);
        setIntField(term218824, term218824.getClass(), "totalReMasterSync", 232421375);
        setLongField(term218824, term218824.getClass(), "totalAchievement", -473264001124726243L);
        setLongField(term218824, term218824.getClass(), "totalBasicAchievement", 6760936648872508104L);
        setLongField(term218824, term218824.getClass(), "totalAdvancedAchievement", 1902439295569540465L);
        setLongField(term218824, term218824.getClass(), "totalExpertAchievement", 8266816764113733584L);
        setLongField(term218824, term218824.getClass(), "totalMasterAchievement", 5959106241680890675L);
        setLongField(term218824, term218824.getClass(), "totalReMasterAchievement", -1958562832213922986L);
        setLongField(term218824, term218824.getClass(), "playerOldRating", 1570467111691681029L);
        setLongField(term218824, term218824.getClass(), "playerNewRating", 8801339843761859448L);
        setIntField(term218824, term218824.getClass(), "banState", -2134429009);
        setLongField(term218824, term218824.getClass(), "dateTime", -3729917382497386096L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstGameId", argTypes, term218824, args);
    }

};


