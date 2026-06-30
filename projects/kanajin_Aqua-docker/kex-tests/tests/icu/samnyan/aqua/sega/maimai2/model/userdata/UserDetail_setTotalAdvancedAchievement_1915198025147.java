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

public class UserDetail_setTotalAdvancedAchievement_1915198025147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278781;
     Object term279128;

    public UserDetail_setTotalAdvancedAchievement_1915198025147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term278785 = new Long(-143609946830350439L);
        ArrayList term278846 = new ArrayList();
        Integer term278852 = new Integer(394881188);
        Integer term278854 = new Integer(2114133243);
        Integer term278856 = new Integer(-1108430202);
        Integer term278858 = new Integer(972569482);
        ArrayList term278850 = new ArrayList();
        ((ArrayList) term278850).add(term278852);
        ((ArrayList) term278850).add(term278854);
        ((ArrayList) term278850).add(term278856);
        ((ArrayList) term278850).add(term278858);
        term278781 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term278783 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term278799 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term278800 = newInstance(Class.forName("java.time.LocalDate"));
        Object term278804 = newInstance(Class.forName("java.time.LocalTime"));
        Object term278809 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term278810 = newInstance(Class.forName("java.time.LocalDate"));
        Object term278814 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term278781, term278781.getClass(), "id", 4891224521937823114L);
        setLongField(term278783, term278783.getClass(), "id", 8363078945328010417L);
        setField(term278783, term278783.getClass(), "extId", term278785);
        setField(term278783, term278783.getClass(), "luid", "TpLdjLzfnM");
        setIntField(term278800, term278800.getClass(), "year", 2011);
        setShortField(term278800, term278800.getClass(), "month", (short) 7);
        setShortField(term278800, term278800.getClass(), "day", (short) 18);
        setField(term278799, term278799.getClass(), "date", term278800);
        setByteField(term278804, term278804.getClass(), "hour", (byte) 1);
        setByteField(term278804, term278804.getClass(), "minute", (byte) 38);
        setByteField(term278804, term278804.getClass(), "second", (byte) 1);
        setIntField(term278804, term278804.getClass(), "nano", 146335870);
        setField(term278799, term278799.getClass(), "time", term278804);
        setField(term278783, term278783.getClass(), "registerTime", term278799);
        setIntField(term278810, term278810.getClass(), "year", 2020);
        setShortField(term278810, term278810.getClass(), "month", (short) 5);
        setShortField(term278810, term278810.getClass(), "day", (short) 30);
        setField(term278809, term278809.getClass(), "date", term278810);
        setByteField(term278814, term278814.getClass(), "hour", (byte) 9);
        setByteField(term278814, term278814.getClass(), "minute", (byte) 45);
        setByteField(term278814, term278814.getClass(), "second", (byte) 37);
        setIntField(term278814, term278814.getClass(), "nano", 806796729);
        setField(term278809, term278809.getClass(), "time", term278814);
        setField(term278783, term278783.getClass(), "accessTime", term278809);
        setField(term278781, term278781.getClass(), "card", term278783);
        setField(term278781, term278781.getClass(), "userName", "bhoYUUtgsQ");
        setIntField(term278781, term278781.getClass(), "isNetMember", -1552402754);
        setIntField(term278781, term278781.getClass(), "iconId", -1957867547);
        setIntField(term278781, term278781.getClass(), "plateId", -518122142);
        setIntField(term278781, term278781.getClass(), "titleId", -310579253);
        setIntField(term278781, term278781.getClass(), "partnerId", -1183783029);
        setIntField(term278781, term278781.getClass(), "frameId", -564323577);
        setIntField(term278781, term278781.getClass(), "selectMapId", -85068771);
        setIntField(term278781, term278781.getClass(), "totalAwake", 456587803);
        setIntField(term278781, term278781.getClass(), "gradeRating", -576741867);
        setIntField(term278781, term278781.getClass(), "musicRating", -1491604415);
        setIntField(term278781, term278781.getClass(), "playerRating", 240084685);
        setIntField(term278781, term278781.getClass(), "highestRating", 1069708027);
        setIntField(term278781, term278781.getClass(), "gradeRank", -1319422191);
        setIntField(term278781, term278781.getClass(), "classRank", 1782477169);
        setIntField(term278781, term278781.getClass(), "courseRank", 547849357);
        setField(term278781, term278781.getClass(), "charaSlot", term278846);
        setField(term278781, term278781.getClass(), "charaLockSlot", term278850);
        setLongField(term278781, term278781.getClass(), "contentBit", 2019985972335610249L);
        setIntField(term278781, term278781.getClass(), "playCount", 2045299937);
        setField(term278781, term278781.getClass(), "eventWatchedDate", "XcBhxrFdvV");
        setField(term278781, term278781.getClass(), "lastGameId", "wtDJOIcmRf");
        setField(term278781, term278781.getClass(), "lastRomVersion", "BMrbKMgdYV");
        setField(term278781, term278781.getClass(), "lastDataVersion", "kXDyYBqBoz");
        setField(term278781, term278781.getClass(), "lastLoginDate", "JhMXaownHd");
        setField(term278781, term278781.getClass(), "lastPlayDate", "iExZeOzVen");
        setIntField(term278781, term278781.getClass(), "lastPlayCredit", 2019732254);
        setIntField(term278781, term278781.getClass(), "lastPlayMode", 2070720689);
        setIntField(term278781, term278781.getClass(), "lastPlaceId", 301858314);
        setField(term278781, term278781.getClass(), "lastPlaceName", "BTUQGyWEFZ");
        setIntField(term278781, term278781.getClass(), "lastAllNetId", 2044006369);
        setIntField(term278781, term278781.getClass(), "lastRegionId", 1371388714);
        setField(term278781, term278781.getClass(), "lastRegionName", "QAdZYMdOjK");
        setField(term278781, term278781.getClass(), "lastClientId", "YPIxYibaKU");
        setField(term278781, term278781.getClass(), "lastCountryCode", "hAGyPTyoNh");
        setIntField(term278781, term278781.getClass(), "lastSelectEMoney", -1277868307);
        setIntField(term278781, term278781.getClass(), "lastSelectTicket", -1386235254);
        setIntField(term278781, term278781.getClass(), "lastSelectCourse", 1272073315);
        setIntField(term278781, term278781.getClass(), "lastCountCourse", 2077327123);
        setField(term278781, term278781.getClass(), "firstGameId", "WIEdirzVjc");
        setField(term278781, term278781.getClass(), "firstRomVersion", "jbzOackPUQ");
        setField(term278781, term278781.getClass(), "firstDataVersion", "FvZbKfGFpg");
        setField(term278781, term278781.getClass(), "firstPlayDate", "aCCYVNLwaa");
        setField(term278781, term278781.getClass(), "compatibleCmVersion", "dZtrEEgcVE");
        setField(term278781, term278781.getClass(), "dailyBonusDate", "qryyzrqVdu");
        setField(term278781, term278781.getClass(), "dailyCourseBonusDate", "VmGukvnUdX");
        setField(term278781, term278781.getClass(), "lastPairLoginDate", "XfKldJGWHB");
        setField(term278781, term278781.getClass(), "lastTrialPlayDate", "SqsYjPVugJ");
        setIntField(term278781, term278781.getClass(), "playVsCount", -1638302794);
        setIntField(term278781, term278781.getClass(), "playSyncCount", 811581744);
        setIntField(term278781, term278781.getClass(), "winCount", -562952939);
        setIntField(term278781, term278781.getClass(), "helpCount", 987544209);
        setIntField(term278781, term278781.getClass(), "comboCount", 1223573076);
        setLongField(term278781, term278781.getClass(), "totalDeluxscore", 7450713490061541958L);
        setLongField(term278781, term278781.getClass(), "totalBasicDeluxscore", 4019507640794494449L);
        setLongField(term278781, term278781.getClass(), "totalAdvancedDeluxscore", -730002490862139184L);
        setLongField(term278781, term278781.getClass(), "totalExpertDeluxscore", 3335675525712891071L);
        setLongField(term278781, term278781.getClass(), "totalMasterDeluxscore", 3482630997171130718L);
        setLongField(term278781, term278781.getClass(), "totalReMasterDeluxscore", -8733510534715183550L);
        setIntField(term278781, term278781.getClass(), "totalSync", -723062147);
        setIntField(term278781, term278781.getClass(), "totalBasicSync", -832912350);
        setIntField(term278781, term278781.getClass(), "totalAdvancedSync", -571859886);
        setIntField(term278781, term278781.getClass(), "totalExpertSync", 1907056673);
        setIntField(term278781, term278781.getClass(), "totalMasterSync", 1283937818);
        setIntField(term278781, term278781.getClass(), "totalReMasterSync", 1766739875);
        setLongField(term278781, term278781.getClass(), "totalAchievement", -6442380849992605292L);
        setLongField(term278781, term278781.getClass(), "totalBasicAchievement", 4850537158694643641L);
        setLongField(term278781, term278781.getClass(), "totalAdvancedAchievement", -827581536732109578L);
        setLongField(term278781, term278781.getClass(), "totalExpertAchievement", 4849643423571290170L);
        setLongField(term278781, term278781.getClass(), "totalMasterAchievement", 3937558159475230310L);
        setLongField(term278781, term278781.getClass(), "totalReMasterAchievement", -8976583421723090988L);
        setLongField(term278781, term278781.getClass(), "playerOldRating", 4802807409428979179L);
        setLongField(term278781, term278781.getClass(), "playerNewRating", 8418266337024797944L);
        setIntField(term278781, term278781.getClass(), "banState", -1903899802);
        setLongField(term278781, term278781.getClass(), "dateTime", 8486924245894084275L);
        term279128 = new Long(-7394461219278324716L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term279128;
        callMethod(klass, "setTotalAdvancedAchievement", argTypes, term278781, args);
    }

};


