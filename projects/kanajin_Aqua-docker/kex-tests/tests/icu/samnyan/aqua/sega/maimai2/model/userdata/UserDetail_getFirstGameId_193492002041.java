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

public class UserDetail_getFirstGameId_193492002041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218769;

    public UserDetail_getFirstGameId_193492002041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term218773 = new Long(-7400951017937830861L);
        Integer term218836 = new Integer(766065097);
        Integer term218838 = new Integer(1703658250);
        Integer term218840 = new Integer(-942615253);
        Integer term218842 = new Integer(1642227506);
        Integer term218844 = new Integer(-1930855861);
        ArrayList term218834 = new ArrayList();
        ((ArrayList) term218834).add(term218836);
        ((ArrayList) term218834).add(term218838);
        ((ArrayList) term218834).add(term218840);
        ((ArrayList) term218834).add(term218842);
        ((ArrayList) term218834).add(term218844);
        Integer term218850 = new Integer(-59278290);
        Integer term218852 = new Integer(862799975);
        Integer term218854 = new Integer(785517219);
        Integer term218856 = new Integer(-96163747);
        Integer term218858 = new Integer(1191473962);
        Integer term218860 = new Integer(110101710);
        Integer term218862 = new Integer(1819101781);
        Integer term218864 = new Integer(-1430157795);
        Integer term218866 = new Integer(-1943692500);
        ArrayList term218848 = new ArrayList();
        ((ArrayList) term218848).add(term218850);
        ((ArrayList) term218848).add(term218852);
        ((ArrayList) term218848).add(term218854);
        ((ArrayList) term218848).add(term218856);
        ((ArrayList) term218848).add(term218858);
        ((ArrayList) term218848).add(term218860);
        ((ArrayList) term218848).add(term218862);
        ((ArrayList) term218848).add(term218864);
        ((ArrayList) term218848).add(term218866);
        term218769 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term218771 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term218787 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term218788 = newInstance(Class.forName("java.time.LocalDate"));
        Object term218792 = newInstance(Class.forName("java.time.LocalTime"));
        Object term218797 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term218798 = newInstance(Class.forName("java.time.LocalDate"));
        Object term218802 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term218769, term218769.getClass(), "id", -8205078520192460425L);
        setLongField(term218771, term218771.getClass(), "id", -4758441834857567910L);
        setField(term218771, term218771.getClass(), "extId", term218773);
        setField(term218771, term218771.getClass(), "luid", "JCYJNAVVoj");
        setIntField(term218788, term218788.getClass(), "year", 2012);
        setShortField(term218788, term218788.getClass(), "month", (short) 3);
        setShortField(term218788, term218788.getClass(), "day", (short) 6);
        setField(term218787, term218787.getClass(), "date", term218788);
        setByteField(term218792, term218792.getClass(), "hour", (byte) 8);
        setByteField(term218792, term218792.getClass(), "minute", (byte) 53);
        setByteField(term218792, term218792.getClass(), "second", (byte) 27);
        setIntField(term218792, term218792.getClass(), "nano", 49638302);
        setField(term218787, term218787.getClass(), "time", term218792);
        setField(term218771, term218771.getClass(), "registerTime", term218787);
        setIntField(term218798, term218798.getClass(), "year", 2026);
        setShortField(term218798, term218798.getClass(), "month", (short) 5);
        setShortField(term218798, term218798.getClass(), "day", (short) 4);
        setField(term218797, term218797.getClass(), "date", term218798);
        setByteField(term218802, term218802.getClass(), "hour", (byte) 4);
        setByteField(term218802, term218802.getClass(), "minute", (byte) 39);
        setByteField(term218802, term218802.getClass(), "second", (byte) 57);
        setIntField(term218802, term218802.getClass(), "nano", 807455541);
        setField(term218797, term218797.getClass(), "time", term218802);
        setField(term218771, term218771.getClass(), "accessTime", term218797);
        setField(term218769, term218769.getClass(), "card", term218771);
        setField(term218769, term218769.getClass(), "userName", "JyRqiqkXBI");
        setIntField(term218769, term218769.getClass(), "isNetMember", 1517451081);
        setIntField(term218769, term218769.getClass(), "iconId", -1020317108);
        setIntField(term218769, term218769.getClass(), "plateId", 450923402);
        setIntField(term218769, term218769.getClass(), "titleId", -346441975);
        setIntField(term218769, term218769.getClass(), "partnerId", -252504773);
        setIntField(term218769, term218769.getClass(), "frameId", 1683059400);
        setIntField(term218769, term218769.getClass(), "selectMapId", 1519559286);
        setIntField(term218769, term218769.getClass(), "totalAwake", 1885237730);
        setIntField(term218769, term218769.getClass(), "gradeRating", 261995675);
        setIntField(term218769, term218769.getClass(), "musicRating", 1400945112);
        setIntField(term218769, term218769.getClass(), "playerRating", -1431100559);
        setIntField(term218769, term218769.getClass(), "highestRating", 2093909511);
        setIntField(term218769, term218769.getClass(), "gradeRank", -1440780852);
        setIntField(term218769, term218769.getClass(), "classRank", -256492547);
        setIntField(term218769, term218769.getClass(), "courseRank", -1893302330);
        setField(term218769, term218769.getClass(), "charaSlot", term218834);
        setField(term218769, term218769.getClass(), "charaLockSlot", term218848);
        setLongField(term218769, term218769.getClass(), "contentBit", 773046857634653088L);
        setIntField(term218769, term218769.getClass(), "playCount", 1177746134);
        setField(term218769, term218769.getClass(), "eventWatchedDate", "xnOzJJiZgt");
        setField(term218769, term218769.getClass(), "lastGameId", "EXIPfIZBES");
        setField(term218769, term218769.getClass(), "lastRomVersion", "tWnoHUlqUU");
        setField(term218769, term218769.getClass(), "lastDataVersion", "hbuDLhVkTE");
        setField(term218769, term218769.getClass(), "lastLoginDate", "gKKImQZJPQ");
        setField(term218769, term218769.getClass(), "lastPlayDate", "jZFSoRfUbm");
        setIntField(term218769, term218769.getClass(), "lastPlayCredit", 1076828616);
        setIntField(term218769, term218769.getClass(), "lastPlayMode", -621733040);
        setIntField(term218769, term218769.getClass(), "lastPlaceId", -1031608080);
        setField(term218769, term218769.getClass(), "lastPlaceName", "xownqtBHHL");
        setIntField(term218769, term218769.getClass(), "lastAllNetId", -1516023185);
        setIntField(term218769, term218769.getClass(), "lastRegionId", -1813690212);
        setField(term218769, term218769.getClass(), "lastRegionName", "skprvHzjjg");
        setField(term218769, term218769.getClass(), "lastClientId", "OEhrSgqRGn");
        setField(term218769, term218769.getClass(), "lastCountryCode", "fpnyXuhrlN");
        setIntField(term218769, term218769.getClass(), "lastSelectEMoney", 1577352938);
        setIntField(term218769, term218769.getClass(), "lastSelectTicket", 1745100327);
        setIntField(term218769, term218769.getClass(), "lastSelectCourse", 1136069052);
        setIntField(term218769, term218769.getClass(), "lastCountCourse", -733793514);
        setField(term218769, term218769.getClass(), "firstGameId", "ciFNeIqDbW");
        setField(term218769, term218769.getClass(), "firstRomVersion", "WNyBDbLYTY");
        setField(term218769, term218769.getClass(), "firstDataVersion", "TUffiPUBII");
        setField(term218769, term218769.getClass(), "firstPlayDate", "vomUfvYKsJ");
        setField(term218769, term218769.getClass(), "compatibleCmVersion", "SinQYbRmbu");
        setField(term218769, term218769.getClass(), "dailyBonusDate", "CWmrUlxrpJ");
        setField(term218769, term218769.getClass(), "dailyCourseBonusDate", "mxSEuGIieQ");
        setField(term218769, term218769.getClass(), "lastPairLoginDate", "VcvqNZLjvf");
        setField(term218769, term218769.getClass(), "lastTrialPlayDate", "safjQtmzWl");
        setIntField(term218769, term218769.getClass(), "playVsCount", -1188742010);
        setIntField(term218769, term218769.getClass(), "playSyncCount", -143261890);
        setIntField(term218769, term218769.getClass(), "winCount", -20933455);
        setIntField(term218769, term218769.getClass(), "helpCount", -1448787013);
        setIntField(term218769, term218769.getClass(), "comboCount", -998901659);
        setLongField(term218769, term218769.getClass(), "totalDeluxscore", 4916035217158779841L);
        setLongField(term218769, term218769.getClass(), "totalBasicDeluxscore", -5556690534119878819L);
        setLongField(term218769, term218769.getClass(), "totalAdvancedDeluxscore", 2712697079953235002L);
        setLongField(term218769, term218769.getClass(), "totalExpertDeluxscore", 3539218699832186677L);
        setLongField(term218769, term218769.getClass(), "totalMasterDeluxscore", 2007181337265009846L);
        setLongField(term218769, term218769.getClass(), "totalReMasterDeluxscore", 7585912269663848364L);
        setIntField(term218769, term218769.getClass(), "totalSync", -1128990548);
        setIntField(term218769, term218769.getClass(), "totalBasicSync", -1878697260);
        setIntField(term218769, term218769.getClass(), "totalAdvancedSync", 489173758);
        setIntField(term218769, term218769.getClass(), "totalExpertSync", 1717231473);
        setIntField(term218769, term218769.getClass(), "totalMasterSync", -692019993);
        setIntField(term218769, term218769.getClass(), "totalReMasterSync", 232421375);
        setLongField(term218769, term218769.getClass(), "totalAchievement", -473264001124726243L);
        setLongField(term218769, term218769.getClass(), "totalBasicAchievement", 6760936648872508104L);
        setLongField(term218769, term218769.getClass(), "totalAdvancedAchievement", 1902439295569540465L);
        setLongField(term218769, term218769.getClass(), "totalExpertAchievement", 8266816764113733584L);
        setLongField(term218769, term218769.getClass(), "totalMasterAchievement", 5959106241680890675L);
        setLongField(term218769, term218769.getClass(), "totalReMasterAchievement", -1958562832213922986L);
        setLongField(term218769, term218769.getClass(), "playerOldRating", 1570467111691681029L);
        setLongField(term218769, term218769.getClass(), "playerNewRating", 8801339843761859448L);
        setIntField(term218769, term218769.getClass(), "banState", -2134429009);
        setLongField(term218769, term218769.getClass(), "dateTime", -3729917382497386096L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstGameId", argTypes, term218769, args);
    }

};


