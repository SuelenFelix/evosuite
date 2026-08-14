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
     Object term278726;
     Object term279073;

    public UserDetail_setTotalAdvancedAchievement_1915198025146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term278730 = new Long(-143609946830350439L);
        ArrayList term278791 = new ArrayList();
        Integer term278797 = new Integer(394881188);
        Integer term278799 = new Integer(2114133243);
        Integer term278801 = new Integer(-1108430202);
        Integer term278803 = new Integer(972569482);
        ArrayList term278795 = new ArrayList();
        ((ArrayList) term278795).add(term278797);
        ((ArrayList) term278795).add(term278799);
        ((ArrayList) term278795).add(term278801);
        ((ArrayList) term278795).add(term278803);
        term278726 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term278728 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term278744 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term278745 = newInstance(Class.forName("java.time.LocalDate"));
        Object term278749 = newInstance(Class.forName("java.time.LocalTime"));
        Object term278754 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term278755 = newInstance(Class.forName("java.time.LocalDate"));
        Object term278759 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term278726, term278726.getClass(), "id", 4891224521937823114L);
        setLongField(term278728, term278728.getClass(), "id", 8363078945328010417L);
        setField(term278728, term278728.getClass(), "extId", term278730);
        setField(term278728, term278728.getClass(), "luid", "TpLdjLzfnM");
        setIntField(term278745, term278745.getClass(), "year", 2011);
        setShortField(term278745, term278745.getClass(), "month", (short) 7);
        setShortField(term278745, term278745.getClass(), "day", (short) 18);
        setField(term278744, term278744.getClass(), "date", term278745);
        setByteField(term278749, term278749.getClass(), "hour", (byte) 1);
        setByteField(term278749, term278749.getClass(), "minute", (byte) 38);
        setByteField(term278749, term278749.getClass(), "second", (byte) 1);
        setIntField(term278749, term278749.getClass(), "nano", 146335870);
        setField(term278744, term278744.getClass(), "time", term278749);
        setField(term278728, term278728.getClass(), "registerTime", term278744);
        setIntField(term278755, term278755.getClass(), "year", 2020);
        setShortField(term278755, term278755.getClass(), "month", (short) 5);
        setShortField(term278755, term278755.getClass(), "day", (short) 30);
        setField(term278754, term278754.getClass(), "date", term278755);
        setByteField(term278759, term278759.getClass(), "hour", (byte) 9);
        setByteField(term278759, term278759.getClass(), "minute", (byte) 45);
        setByteField(term278759, term278759.getClass(), "second", (byte) 37);
        setIntField(term278759, term278759.getClass(), "nano", 806796729);
        setField(term278754, term278754.getClass(), "time", term278759);
        setField(term278728, term278728.getClass(), "accessTime", term278754);
        setField(term278726, term278726.getClass(), "card", term278728);
        setField(term278726, term278726.getClass(), "userName", "bhoYUUtgsQ");
        setIntField(term278726, term278726.getClass(), "isNetMember", -1552402754);
        setIntField(term278726, term278726.getClass(), "iconId", -1957867547);
        setIntField(term278726, term278726.getClass(), "plateId", -518122142);
        setIntField(term278726, term278726.getClass(), "titleId", -310579253);
        setIntField(term278726, term278726.getClass(), "partnerId", -1183783029);
        setIntField(term278726, term278726.getClass(), "frameId", -564323577);
        setIntField(term278726, term278726.getClass(), "selectMapId", -85068771);
        setIntField(term278726, term278726.getClass(), "totalAwake", 456587803);
        setIntField(term278726, term278726.getClass(), "gradeRating", -576741867);
        setIntField(term278726, term278726.getClass(), "musicRating", -1491604415);
        setIntField(term278726, term278726.getClass(), "playerRating", 240084685);
        setIntField(term278726, term278726.getClass(), "highestRating", 1069708027);
        setIntField(term278726, term278726.getClass(), "gradeRank", -1319422191);
        setIntField(term278726, term278726.getClass(), "classRank", 1782477169);
        setIntField(term278726, term278726.getClass(), "courseRank", 547849357);
        setField(term278726, term278726.getClass(), "charaSlot", term278791);
        setField(term278726, term278726.getClass(), "charaLockSlot", term278795);
        setLongField(term278726, term278726.getClass(), "contentBit", 2019985972335610249L);
        setIntField(term278726, term278726.getClass(), "playCount", 2045299937);
        setField(term278726, term278726.getClass(), "eventWatchedDate", "XcBhxrFdvV");
        setField(term278726, term278726.getClass(), "lastGameId", "wtDJOIcmRf");
        setField(term278726, term278726.getClass(), "lastRomVersion", "BMrbKMgdYV");
        setField(term278726, term278726.getClass(), "lastDataVersion", "kXDyYBqBoz");
        setField(term278726, term278726.getClass(), "lastLoginDate", "JhMXaownHd");
        setField(term278726, term278726.getClass(), "lastPlayDate", "iExZeOzVen");
        setIntField(term278726, term278726.getClass(), "lastPlayCredit", 2019732254);
        setIntField(term278726, term278726.getClass(), "lastPlayMode", 2070720689);
        setIntField(term278726, term278726.getClass(), "lastPlaceId", 301858314);
        setField(term278726, term278726.getClass(), "lastPlaceName", "BTUQGyWEFZ");
        setIntField(term278726, term278726.getClass(), "lastAllNetId", 2044006369);
        setIntField(term278726, term278726.getClass(), "lastRegionId", 1371388714);
        setField(term278726, term278726.getClass(), "lastRegionName", "QAdZYMdOjK");
        setField(term278726, term278726.getClass(), "lastClientId", "YPIxYibaKU");
        setField(term278726, term278726.getClass(), "lastCountryCode", "hAGyPTyoNh");
        setIntField(term278726, term278726.getClass(), "lastSelectEMoney", -1277868307);
        setIntField(term278726, term278726.getClass(), "lastSelectTicket", -1386235254);
        setIntField(term278726, term278726.getClass(), "lastSelectCourse", 1272073315);
        setIntField(term278726, term278726.getClass(), "lastCountCourse", 2077327123);
        setField(term278726, term278726.getClass(), "firstGameId", "WIEdirzVjc");
        setField(term278726, term278726.getClass(), "firstRomVersion", "jbzOackPUQ");
        setField(term278726, term278726.getClass(), "firstDataVersion", "FvZbKfGFpg");
        setField(term278726, term278726.getClass(), "firstPlayDate", "aCCYVNLwaa");
        setField(term278726, term278726.getClass(), "compatibleCmVersion", "dZtrEEgcVE");
        setField(term278726, term278726.getClass(), "dailyBonusDate", "qryyzrqVdu");
        setField(term278726, term278726.getClass(), "dailyCourseBonusDate", "VmGukvnUdX");
        setField(term278726, term278726.getClass(), "lastPairLoginDate", "XfKldJGWHB");
        setField(term278726, term278726.getClass(), "lastTrialPlayDate", "SqsYjPVugJ");
        setIntField(term278726, term278726.getClass(), "playVsCount", -1638302794);
        setIntField(term278726, term278726.getClass(), "playSyncCount", 811581744);
        setIntField(term278726, term278726.getClass(), "winCount", -562952939);
        setIntField(term278726, term278726.getClass(), "helpCount", 987544209);
        setIntField(term278726, term278726.getClass(), "comboCount", 1223573076);
        setLongField(term278726, term278726.getClass(), "totalDeluxscore", 7450713490061541958L);
        setLongField(term278726, term278726.getClass(), "totalBasicDeluxscore", 4019507640794494449L);
        setLongField(term278726, term278726.getClass(), "totalAdvancedDeluxscore", -730002490862139184L);
        setLongField(term278726, term278726.getClass(), "totalExpertDeluxscore", 3335675525712891071L);
        setLongField(term278726, term278726.getClass(), "totalMasterDeluxscore", 3482630997171130718L);
        setLongField(term278726, term278726.getClass(), "totalReMasterDeluxscore", -8733510534715183550L);
        setIntField(term278726, term278726.getClass(), "totalSync", -723062147);
        setIntField(term278726, term278726.getClass(), "totalBasicSync", -832912350);
        setIntField(term278726, term278726.getClass(), "totalAdvancedSync", -571859886);
        setIntField(term278726, term278726.getClass(), "totalExpertSync", 1907056673);
        setIntField(term278726, term278726.getClass(), "totalMasterSync", 1283937818);
        setIntField(term278726, term278726.getClass(), "totalReMasterSync", 1766739875);
        setLongField(term278726, term278726.getClass(), "totalAchievement", -6442380849992605292L);
        setLongField(term278726, term278726.getClass(), "totalBasicAchievement", 4850537158694643641L);
        setLongField(term278726, term278726.getClass(), "totalAdvancedAchievement", -827581536732109578L);
        setLongField(term278726, term278726.getClass(), "totalExpertAchievement", 4849643423571290170L);
        setLongField(term278726, term278726.getClass(), "totalMasterAchievement", 3937558159475230310L);
        setLongField(term278726, term278726.getClass(), "totalReMasterAchievement", -8976583421723090988L);
        setLongField(term278726, term278726.getClass(), "playerOldRating", 4802807409428979179L);
        setLongField(term278726, term278726.getClass(), "playerNewRating", 8418266337024797944L);
        setIntField(term278726, term278726.getClass(), "banState", -1903899802);
        setLongField(term278726, term278726.getClass(), "dateTime", 8486924245894084275L);
        term279073 = new Long(-7394461219278324716L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term279073;
        callMethod(klass, "setTotalAdvancedAchievement", argTypes, term278726, args);
    }

};


