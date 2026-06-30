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

public class UserDetail_getTotalMasterAchievement_91534381571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4269765;

    public UserDetail_getTotalMasterAchievement_91534381571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4269769 = new Long(-6241115025902069929L);
        Integer term4269832 = new Integer(2093268279);
        Integer term4269834 = new Integer(-197188292);
        Integer term4269836 = new Integer(1982258363);
        Integer term4269838 = new Integer(-2134281126);
        Integer term4269840 = new Integer(-1023001269);
        Integer term4269842 = new Integer(2123871728);
        Integer term4269844 = new Integer(687921602);
        Integer term4269846 = new Integer(-848859060);
        ArrayList term4269830 = new ArrayList();
        ((ArrayList) term4269830).add(term4269832);
        ((ArrayList) term4269830).add(term4269834);
        ((ArrayList) term4269830).add(term4269836);
        ((ArrayList) term4269830).add(term4269838);
        ((ArrayList) term4269830).add(term4269840);
        ((ArrayList) term4269830).add(term4269842);
        ((ArrayList) term4269830).add(term4269844);
        ((ArrayList) term4269830).add(term4269846);
        Integer term4269852 = new Integer(276568220);
        Integer term4269854 = new Integer(-434766528);
        Integer term4269856 = new Integer(1954430952);
        Integer term4269858 = new Integer(1603606390);
        Integer term4269860 = new Integer(-234709686);
        Integer term4269862 = new Integer(-550885989);
        Integer term4269864 = new Integer(1661591466);
        Integer term4269866 = new Integer(-375409691);
        ArrayList term4269850 = new ArrayList();
        ((ArrayList) term4269850).add(term4269852);
        ((ArrayList) term4269850).add(term4269854);
        ((ArrayList) term4269850).add(term4269856);
        ((ArrayList) term4269850).add(term4269858);
        ((ArrayList) term4269850).add(term4269860);
        ((ArrayList) term4269850).add(term4269862);
        ((ArrayList) term4269850).add(term4269864);
        ((ArrayList) term4269850).add(term4269866);
        term4269765 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4269767 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4269783 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4269784 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4269788 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4269793 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4269794 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4269798 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4269765, term4269765.getClass(), "id", -4168369764699496129L);
        setLongField(term4269767, term4269767.getClass(), "id", 6596354911254658285L);
        setField(term4269767, term4269767.getClass(), "extId", term4269769);
        setField(term4269767, term4269767.getClass(), "luid", "KvcwCjCfBO");
        setIntField(term4269784, term4269784.getClass(), "year", 2012);
        setShortField(term4269784, term4269784.getClass(), "month", (short) 11);
        setShortField(term4269784, term4269784.getClass(), "day", (short) 24);
        setField(term4269783, term4269783.getClass(), "date", term4269784);
        setByteField(term4269788, term4269788.getClass(), "hour", (byte) 7);
        setByteField(term4269788, term4269788.getClass(), "minute", (byte) 31);
        setByteField(term4269788, term4269788.getClass(), "second", (byte) 36);
        setIntField(term4269788, term4269788.getClass(), "nano", 318694841);
        setField(term4269783, term4269783.getClass(), "time", term4269788);
        setField(term4269767, term4269767.getClass(), "registerTime", term4269783);
        setIntField(term4269794, term4269794.getClass(), "year", 2014);
        setShortField(term4269794, term4269794.getClass(), "month", (short) 6);
        setShortField(term4269794, term4269794.getClass(), "day", (short) 30);
        setField(term4269793, term4269793.getClass(), "date", term4269794);
        setByteField(term4269798, term4269798.getClass(), "hour", (byte) 4);
        setByteField(term4269798, term4269798.getClass(), "minute", (byte) 26);
        setByteField(term4269798, term4269798.getClass(), "second", (byte) 29);
        setIntField(term4269798, term4269798.getClass(), "nano", 423749586);
        setField(term4269793, term4269793.getClass(), "time", term4269798);
        setField(term4269767, term4269767.getClass(), "accessTime", term4269793);
        setField(term4269765, term4269765.getClass(), "card", term4269767);
        setField(term4269765, term4269765.getClass(), "userName", "XWlXZZJoPN");
        setIntField(term4269765, term4269765.getClass(), "isNetMember", 2134795171);
        setIntField(term4269765, term4269765.getClass(), "iconId", -832918821);
        setIntField(term4269765, term4269765.getClass(), "plateId", 747130345);
        setIntField(term4269765, term4269765.getClass(), "titleId", 372508176);
        setIntField(term4269765, term4269765.getClass(), "partnerId", 1130276099);
        setIntField(term4269765, term4269765.getClass(), "frameId", 768874600);
        setIntField(term4269765, term4269765.getClass(), "selectMapId", 14799926);
        setIntField(term4269765, term4269765.getClass(), "totalAwake", -1882839592);
        setIntField(term4269765, term4269765.getClass(), "gradeRating", 810328447);
        setIntField(term4269765, term4269765.getClass(), "musicRating", -1008002255);
        setIntField(term4269765, term4269765.getClass(), "playerRating", -933764073);
        setIntField(term4269765, term4269765.getClass(), "highestRating", 1442589732);
        setIntField(term4269765, term4269765.getClass(), "gradeRank", -944946944);
        setIntField(term4269765, term4269765.getClass(), "classRank", -163191238);
        setIntField(term4269765, term4269765.getClass(), "courseRank", -1868548040);
        setField(term4269765, term4269765.getClass(), "charaSlot", term4269830);
        setField(term4269765, term4269765.getClass(), "charaLockSlot", term4269850);
        setLongField(term4269765, term4269765.getClass(), "contentBit", 2564585537727370022L);
        setIntField(term4269765, term4269765.getClass(), "playCount", 1853662373);
        setField(term4269765, term4269765.getClass(), "eventWatchedDate", "YCAEzCheta");
        setField(term4269765, term4269765.getClass(), "lastGameId", "FcuypsvDqH");
        setField(term4269765, term4269765.getClass(), "lastRomVersion", "mZHfytwyHq");
        setField(term4269765, term4269765.getClass(), "lastDataVersion", "zQkObtJFTq");
        setField(term4269765, term4269765.getClass(), "lastLoginDate", "LVryfVWqIH");
        setField(term4269765, term4269765.getClass(), "lastPlayDate", "uDxKlEPtUG");
        setIntField(term4269765, term4269765.getClass(), "lastPlayCredit", -691772339);
        setIntField(term4269765, term4269765.getClass(), "lastPlayMode", 2015508243);
        setIntField(term4269765, term4269765.getClass(), "lastPlaceId", -300591269);
        setField(term4269765, term4269765.getClass(), "lastPlaceName", "jmrYVDMkir");
        setIntField(term4269765, term4269765.getClass(), "lastAllNetId", -1747485211);
        setIntField(term4269765, term4269765.getClass(), "lastRegionId", 2078165956);
        setField(term4269765, term4269765.getClass(), "lastRegionName", "KlInWjkjEA");
        setField(term4269765, term4269765.getClass(), "lastClientId", "LPJZySotRK");
        setField(term4269765, term4269765.getClass(), "lastCountryCode", "sDSAJgwbPz");
        setIntField(term4269765, term4269765.getClass(), "lastSelectEMoney", 275499136);
        setIntField(term4269765, term4269765.getClass(), "lastSelectTicket", 1702149155);
        setIntField(term4269765, term4269765.getClass(), "lastSelectCourse", -1229621620);
        setIntField(term4269765, term4269765.getClass(), "lastCountCourse", -228838074);
        setField(term4269765, term4269765.getClass(), "firstGameId", "vkwxTUwlCt");
        setField(term4269765, term4269765.getClass(), "firstRomVersion", "zQGcEPggat");
        setField(term4269765, term4269765.getClass(), "firstDataVersion", "qkthoTiFYR");
        setField(term4269765, term4269765.getClass(), "firstPlayDate", "zUbLKHcEFy");
        setField(term4269765, term4269765.getClass(), "compatibleCmVersion", "IeYfQomwMy");
        setField(term4269765, term4269765.getClass(), "dailyBonusDate", "ddwjOiJQyz");
        setField(term4269765, term4269765.getClass(), "dailyCourseBonusDate", "VRkTogDmwT");
        setField(term4269765, term4269765.getClass(), "lastPairLoginDate", "zRoLxJxMgk");
        setField(term4269765, term4269765.getClass(), "lastTrialPlayDate", "ZUTJuXrsga");
        setIntField(term4269765, term4269765.getClass(), "playVsCount", 99928924);
        setIntField(term4269765, term4269765.getClass(), "playSyncCount", 1723278896);
        setIntField(term4269765, term4269765.getClass(), "winCount", 322607838);
        setIntField(term4269765, term4269765.getClass(), "helpCount", 1612211571);
        setIntField(term4269765, term4269765.getClass(), "comboCount", 121801145);
        setLongField(term4269765, term4269765.getClass(), "totalDeluxscore", -7016742367201138463L);
        setLongField(term4269765, term4269765.getClass(), "totalBasicDeluxscore", 7034953805025062682L);
        setLongField(term4269765, term4269765.getClass(), "totalAdvancedDeluxscore", -5504568501473316207L);
        setLongField(term4269765, term4269765.getClass(), "totalExpertDeluxscore", -801893254965433314L);
        setLongField(term4269765, term4269765.getClass(), "totalMasterDeluxscore", -666520796476685523L);
        setLongField(term4269765, term4269765.getClass(), "totalReMasterDeluxscore", -2219221099826294696L);
        setIntField(term4269765, term4269765.getClass(), "totalSync", 1995729003);
        setIntField(term4269765, term4269765.getClass(), "totalBasicSync", -405498233);
        setIntField(term4269765, term4269765.getClass(), "totalAdvancedSync", 1499795479);
        setIntField(term4269765, term4269765.getClass(), "totalExpertSync", 1172215884);
        setIntField(term4269765, term4269765.getClass(), "totalMasterSync", 75843746);
        setIntField(term4269765, term4269765.getClass(), "totalReMasterSync", -1762271590);
        setLongField(term4269765, term4269765.getClass(), "totalAchievement", 8294575928549696579L);
        setLongField(term4269765, term4269765.getClass(), "totalBasicAchievement", -5714284877156002023L);
        setLongField(term4269765, term4269765.getClass(), "totalAdvancedAchievement", -6564655806489985180L);
        setLongField(term4269765, term4269765.getClass(), "totalExpertAchievement", -1275065917720710374L);
        setLongField(term4269765, term4269765.getClass(), "totalMasterAchievement", -1303851367211977720L);
        setLongField(term4269765, term4269765.getClass(), "totalReMasterAchievement", -9159064898001932024L);
        setLongField(term4269765, term4269765.getClass(), "playerOldRating", 6577317891372279726L);
        setLongField(term4269765, term4269765.getClass(), "playerNewRating", -4067611809919091133L);
        setIntField(term4269765, term4269765.getClass(), "banState", 489477091);
        setLongField(term4269765, term4269765.getClass(), "dateTime", -186106361331715001L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMasterAchievement", argTypes, term4269765, args);
    }

};


