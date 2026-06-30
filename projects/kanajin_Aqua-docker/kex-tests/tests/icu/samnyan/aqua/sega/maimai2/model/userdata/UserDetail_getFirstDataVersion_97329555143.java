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

public class UserDetail_getFirstDataVersion_97329555143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4253907;

    public UserDetail_getFirstDataVersion_97329555143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4253911 = new Long(-1484157229223168601L);
        Integer term4253974 = new Integer(1121498523);
        ArrayList term4253972 = new ArrayList();
        ((ArrayList) term4253972).add(term4253974);
        ArrayList term4253978 = new ArrayList();
        term4253907 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4253909 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4253925 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4253926 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4253930 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4253935 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4253936 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4253940 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4253907, term4253907.getClass(), "id", 9174477011723572323L);
        setLongField(term4253909, term4253909.getClass(), "id", -9083516006163123839L);
        setField(term4253909, term4253909.getClass(), "extId", term4253911);
        setField(term4253909, term4253909.getClass(), "luid", "EhrokyTrZU");
        setIntField(term4253926, term4253926.getClass(), "year", 2028);
        setShortField(term4253926, term4253926.getClass(), "month", (short) 12);
        setShortField(term4253926, term4253926.getClass(), "day", (short) 13);
        setField(term4253925, term4253925.getClass(), "date", term4253926);
        setByteField(term4253930, term4253930.getClass(), "hour", (byte) 12);
        setByteField(term4253930, term4253930.getClass(), "minute", (byte) 9);
        setByteField(term4253930, term4253930.getClass(), "second", (byte) 28);
        setIntField(term4253930, term4253930.getClass(), "nano", 63723377);
        setField(term4253925, term4253925.getClass(), "time", term4253930);
        setField(term4253909, term4253909.getClass(), "registerTime", term4253925);
        setIntField(term4253936, term4253936.getClass(), "year", 2025);
        setShortField(term4253936, term4253936.getClass(), "month", (short) 2);
        setShortField(term4253936, term4253936.getClass(), "day", (short) 18);
        setField(term4253935, term4253935.getClass(), "date", term4253936);
        setByteField(term4253940, term4253940.getClass(), "hour", (byte) 8);
        setByteField(term4253940, term4253940.getClass(), "minute", (byte) 22);
        setByteField(term4253940, term4253940.getClass(), "second", (byte) 28);
        setIntField(term4253940, term4253940.getClass(), "nano", 682744409);
        setField(term4253935, term4253935.getClass(), "time", term4253940);
        setField(term4253909, term4253909.getClass(), "accessTime", term4253935);
        setField(term4253907, term4253907.getClass(), "card", term4253909);
        setField(term4253907, term4253907.getClass(), "userName", "sboHVmOVNg");
        setIntField(term4253907, term4253907.getClass(), "isNetMember", 25330088);
        setIntField(term4253907, term4253907.getClass(), "iconId", -1444825825);
        setIntField(term4253907, term4253907.getClass(), "plateId", -1997683709);
        setIntField(term4253907, term4253907.getClass(), "titleId", -979408859);
        setIntField(term4253907, term4253907.getClass(), "partnerId", 1948044879);
        setIntField(term4253907, term4253907.getClass(), "frameId", 1111470624);
        setIntField(term4253907, term4253907.getClass(), "selectMapId", -881817798);
        setIntField(term4253907, term4253907.getClass(), "totalAwake", 669768900);
        setIntField(term4253907, term4253907.getClass(), "gradeRating", 1433369462);
        setIntField(term4253907, term4253907.getClass(), "musicRating", 847879869);
        setIntField(term4253907, term4253907.getClass(), "playerRating", -1702293276);
        setIntField(term4253907, term4253907.getClass(), "highestRating", -2120316394);
        setIntField(term4253907, term4253907.getClass(), "gradeRank", -1051653921);
        setIntField(term4253907, term4253907.getClass(), "classRank", -1767609498);
        setIntField(term4253907, term4253907.getClass(), "courseRank", -1727337804);
        setField(term4253907, term4253907.getClass(), "charaSlot", term4253972);
        setField(term4253907, term4253907.getClass(), "charaLockSlot", term4253978);
        setLongField(term4253907, term4253907.getClass(), "contentBit", -8487463666093675479L);
        setIntField(term4253907, term4253907.getClass(), "playCount", -445124066);
        setField(term4253907, term4253907.getClass(), "eventWatchedDate", "VTnsqSOpSJ");
        setField(term4253907, term4253907.getClass(), "lastGameId", "qDtzUFgjAg");
        setField(term4253907, term4253907.getClass(), "lastRomVersion", "HtdyoRSXTy");
        setField(term4253907, term4253907.getClass(), "lastDataVersion", "VpfAFCiPBs");
        setField(term4253907, term4253907.getClass(), "lastLoginDate", "tAXvLGTTYW");
        setField(term4253907, term4253907.getClass(), "lastPlayDate", "ZQOrCdENQe");
        setIntField(term4253907, term4253907.getClass(), "lastPlayCredit", 1995270802);
        setIntField(term4253907, term4253907.getClass(), "lastPlayMode", -1681197905);
        setIntField(term4253907, term4253907.getClass(), "lastPlaceId", -1600590221);
        setField(term4253907, term4253907.getClass(), "lastPlaceName", "kPYbnoSfaT");
        setIntField(term4253907, term4253907.getClass(), "lastAllNetId", 2139604840);
        setIntField(term4253907, term4253907.getClass(), "lastRegionId", -1030667827);
        setField(term4253907, term4253907.getClass(), "lastRegionName", "sqYqghrlzo");
        setField(term4253907, term4253907.getClass(), "lastClientId", "ZhHmNHVWuj");
        setField(term4253907, term4253907.getClass(), "lastCountryCode", "MicFTMBXpC");
        setIntField(term4253907, term4253907.getClass(), "lastSelectEMoney", -1171227856);
        setIntField(term4253907, term4253907.getClass(), "lastSelectTicket", -2118571504);
        setIntField(term4253907, term4253907.getClass(), "lastSelectCourse", -687930991);
        setIntField(term4253907, term4253907.getClass(), "lastCountCourse", -1539624648);
        setField(term4253907, term4253907.getClass(), "firstGameId", "ILxyGxvzRF");
        setField(term4253907, term4253907.getClass(), "firstRomVersion", "mYiVVvqIET");
        setField(term4253907, term4253907.getClass(), "firstDataVersion", "RjNXcHvCOC");
        setField(term4253907, term4253907.getClass(), "firstPlayDate", "PTBHGRjvLJ");
        setField(term4253907, term4253907.getClass(), "compatibleCmVersion", "UBXRLWDVBr");
        setField(term4253907, term4253907.getClass(), "dailyBonusDate", "FZqNwdnrCu");
        setField(term4253907, term4253907.getClass(), "dailyCourseBonusDate", "MvXygCsrbS");
        setField(term4253907, term4253907.getClass(), "lastPairLoginDate", "ONNJGFAkyv");
        setField(term4253907, term4253907.getClass(), "lastTrialPlayDate", "wAlUbpvlSR");
        setIntField(term4253907, term4253907.getClass(), "playVsCount", 1786262956);
        setIntField(term4253907, term4253907.getClass(), "playSyncCount", -1506119430);
        setIntField(term4253907, term4253907.getClass(), "winCount", 91239948);
        setIntField(term4253907, term4253907.getClass(), "helpCount", -227426212);
        setIntField(term4253907, term4253907.getClass(), "comboCount", 1813078389);
        setLongField(term4253907, term4253907.getClass(), "totalDeluxscore", 894931806090559870L);
        setLongField(term4253907, term4253907.getClass(), "totalBasicDeluxscore", 9090356373503445964L);
        setLongField(term4253907, term4253907.getClass(), "totalAdvancedDeluxscore", 4952675214228620537L);
        setLongField(term4253907, term4253907.getClass(), "totalExpertDeluxscore", 4964585291062939064L);
        setLongField(term4253907, term4253907.getClass(), "totalMasterDeluxscore", -48159605123119821L);
        setLongField(term4253907, term4253907.getClass(), "totalReMasterDeluxscore", 2206784742889392396L);
        setIntField(term4253907, term4253907.getClass(), "totalSync", -1856950606);
        setIntField(term4253907, term4253907.getClass(), "totalBasicSync", -1598670558);
        setIntField(term4253907, term4253907.getClass(), "totalAdvancedSync", 231703126);
        setIntField(term4253907, term4253907.getClass(), "totalExpertSync", -392596210);
        setIntField(term4253907, term4253907.getClass(), "totalMasterSync", 286674587);
        setIntField(term4253907, term4253907.getClass(), "totalReMasterSync", 1639271226);
        setLongField(term4253907, term4253907.getClass(), "totalAchievement", -3129816986321126436L);
        setLongField(term4253907, term4253907.getClass(), "totalBasicAchievement", -1947108076910067552L);
        setLongField(term4253907, term4253907.getClass(), "totalAdvancedAchievement", 3433269325691929524L);
        setLongField(term4253907, term4253907.getClass(), "totalExpertAchievement", 4456953149268524617L);
        setLongField(term4253907, term4253907.getClass(), "totalMasterAchievement", 6469852134405402485L);
        setLongField(term4253907, term4253907.getClass(), "totalReMasterAchievement", -8592774150382215589L);
        setLongField(term4253907, term4253907.getClass(), "playerOldRating", 1380188962735303408L);
        setLongField(term4253907, term4253907.getClass(), "playerNewRating", 7748806900092751726L);
        setIntField(term4253907, term4253907.getClass(), "banState", 580809671);
        setLongField(term4253907, term4253907.getClass(), "dateTime", 9168865217946618486L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstDataVersion", argTypes, term4253907, args);
    }

};


