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

public class UserDetail_setLastClientId_699220375112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4293337;

    public UserDetail_setLastClientId_699220375112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4293341 = new Long(-5567998152506692170L);
        Integer term4293404 = new Integer(2091257387);
        Integer term4293406 = new Integer(1262385462);
        ArrayList term4293402 = new ArrayList();
        ((ArrayList) term4293402).add(term4293404);
        ((ArrayList) term4293402).add(term4293406);
        Integer term4293412 = new Integer(146198205);
        Integer term4293414 = new Integer(1811207533);
        Integer term4293416 = new Integer(-1241224611);
        Integer term4293418 = new Integer(1661530764);
        ArrayList term4293410 = new ArrayList();
        ((ArrayList) term4293410).add(term4293412);
        ((ArrayList) term4293410).add(term4293414);
        ((ArrayList) term4293410).add(term4293416);
        ((ArrayList) term4293410).add(term4293418);
        term4293337 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4293339 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4293355 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4293356 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4293360 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4293365 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4293366 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4293370 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4293337, term4293337.getClass(), "id", -862792163277548865L);
        setLongField(term4293339, term4293339.getClass(), "id", 7254870726107975837L);
        setField(term4293339, term4293339.getClass(), "extId", term4293341);
        setField(term4293339, term4293339.getClass(), "luid", "EJvcMTKHhA");
        setIntField(term4293356, term4293356.getClass(), "year", 2027);
        setShortField(term4293356, term4293356.getClass(), "month", (short) 6);
        setShortField(term4293356, term4293356.getClass(), "day", (short) 8);
        setField(term4293355, term4293355.getClass(), "date", term4293356);
        setByteField(term4293360, term4293360.getClass(), "hour", (byte) 15);
        setByteField(term4293360, term4293360.getClass(), "minute", (byte) 10);
        setByteField(term4293360, term4293360.getClass(), "second", (byte) 35);
        setIntField(term4293360, term4293360.getClass(), "nano", 497952532);
        setField(term4293355, term4293355.getClass(), "time", term4293360);
        setField(term4293339, term4293339.getClass(), "registerTime", term4293355);
        setIntField(term4293366, term4293366.getClass(), "year", 2026);
        setShortField(term4293366, term4293366.getClass(), "month", (short) 4);
        setShortField(term4293366, term4293366.getClass(), "day", (short) 27);
        setField(term4293365, term4293365.getClass(), "date", term4293366);
        setByteField(term4293370, term4293370.getClass(), "hour", (byte) 3);
        setByteField(term4293370, term4293370.getClass(), "minute", (byte) 1);
        setByteField(term4293370, term4293370.getClass(), "second", (byte) 38);
        setIntField(term4293370, term4293370.getClass(), "nano", 73283831);
        setField(term4293365, term4293365.getClass(), "time", term4293370);
        setField(term4293339, term4293339.getClass(), "accessTime", term4293365);
        setField(term4293337, term4293337.getClass(), "card", term4293339);
        setField(term4293337, term4293337.getClass(), "userName", "yAUKhLisDQ");
        setIntField(term4293337, term4293337.getClass(), "isNetMember", 916831887);
        setIntField(term4293337, term4293337.getClass(), "iconId", 1860587251);
        setIntField(term4293337, term4293337.getClass(), "plateId", 2098042949);
        setIntField(term4293337, term4293337.getClass(), "titleId", 1559829941);
        setIntField(term4293337, term4293337.getClass(), "partnerId", -562336205);
        setIntField(term4293337, term4293337.getClass(), "frameId", 1406178809);
        setIntField(term4293337, term4293337.getClass(), "selectMapId", -1751519709);
        setIntField(term4293337, term4293337.getClass(), "totalAwake", 1246010987);
        setIntField(term4293337, term4293337.getClass(), "gradeRating", -510264839);
        setIntField(term4293337, term4293337.getClass(), "musicRating", 1469939192);
        setIntField(term4293337, term4293337.getClass(), "playerRating", 1973178179);
        setIntField(term4293337, term4293337.getClass(), "highestRating", 1729560006);
        setIntField(term4293337, term4293337.getClass(), "gradeRank", -113576083);
        setIntField(term4293337, term4293337.getClass(), "classRank", -782695422);
        setIntField(term4293337, term4293337.getClass(), "courseRank", 1961239119);
        setField(term4293337, term4293337.getClass(), "charaSlot", term4293402);
        setField(term4293337, term4293337.getClass(), "charaLockSlot", term4293410);
        setLongField(term4293337, term4293337.getClass(), "contentBit", 9016787142035824537L);
        setIntField(term4293337, term4293337.getClass(), "playCount", -1011402313);
        setField(term4293337, term4293337.getClass(), "eventWatchedDate", "BdjbhxwSBi");
        setField(term4293337, term4293337.getClass(), "lastGameId", "ykrpLIThBi");
        setField(term4293337, term4293337.getClass(), "lastRomVersion", "vYWvDpcrEF");
        setField(term4293337, term4293337.getClass(), "lastDataVersion", "noimEuRrXS");
        setField(term4293337, term4293337.getClass(), "lastLoginDate", "wNZYKJoxzy");
        setField(term4293337, term4293337.getClass(), "lastPlayDate", "tPRmxXwBAF");
        setIntField(term4293337, term4293337.getClass(), "lastPlayCredit", 1057723953);
        setIntField(term4293337, term4293337.getClass(), "lastPlayMode", -1461567998);
        setIntField(term4293337, term4293337.getClass(), "lastPlaceId", -195581055);
        setField(term4293337, term4293337.getClass(), "lastPlaceName", "zkuyXtLhzY");
        setIntField(term4293337, term4293337.getClass(), "lastAllNetId", 1947333475);
        setIntField(term4293337, term4293337.getClass(), "lastRegionId", 1889642440);
        setField(term4293337, term4293337.getClass(), "lastRegionName", "vQdPrVosPO");
        setField(term4293337, term4293337.getClass(), "lastClientId", "NvtUwDDdNG");
        setField(term4293337, term4293337.getClass(), "lastCountryCode", "JRcASUbGpG");
        setIntField(term4293337, term4293337.getClass(), "lastSelectEMoney", 1161832446);
        setIntField(term4293337, term4293337.getClass(), "lastSelectTicket", 823560862);
        setIntField(term4293337, term4293337.getClass(), "lastSelectCourse", 1778796547);
        setIntField(term4293337, term4293337.getClass(), "lastCountCourse", -1756049231);
        setField(term4293337, term4293337.getClass(), "firstGameId", "TPLnPQUuZy");
        setField(term4293337, term4293337.getClass(), "firstRomVersion", "YwlwxDnRjd");
        setField(term4293337, term4293337.getClass(), "firstDataVersion", "FXYYPalvoQ");
        setField(term4293337, term4293337.getClass(), "firstPlayDate", "xmixJdlzVT");
        setField(term4293337, term4293337.getClass(), "compatibleCmVersion", "VUjaHZuKDv");
        setField(term4293337, term4293337.getClass(), "dailyBonusDate", "SqPJDMXQEh");
        setField(term4293337, term4293337.getClass(), "dailyCourseBonusDate", "AgTqfoCetO");
        setField(term4293337, term4293337.getClass(), "lastPairLoginDate", "kkBcnNzSuL");
        setField(term4293337, term4293337.getClass(), "lastTrialPlayDate", "fVoNRZkyQQ");
        setIntField(term4293337, term4293337.getClass(), "playVsCount", -1138785893);
        setIntField(term4293337, term4293337.getClass(), "playSyncCount", 1104782370);
        setIntField(term4293337, term4293337.getClass(), "winCount", -1137912821);
        setIntField(term4293337, term4293337.getClass(), "helpCount", 351876791);
        setIntField(term4293337, term4293337.getClass(), "comboCount", 487751654);
        setLongField(term4293337, term4293337.getClass(), "totalDeluxscore", -3183529114436445026L);
        setLongField(term4293337, term4293337.getClass(), "totalBasicDeluxscore", 5585560662395260092L);
        setLongField(term4293337, term4293337.getClass(), "totalAdvancedDeluxscore", 8856587131883835400L);
        setLongField(term4293337, term4293337.getClass(), "totalExpertDeluxscore", 3477307194070981331L);
        setLongField(term4293337, term4293337.getClass(), "totalMasterDeluxscore", 4028699813372899347L);
        setLongField(term4293337, term4293337.getClass(), "totalReMasterDeluxscore", 4355420287848879666L);
        setIntField(term4293337, term4293337.getClass(), "totalSync", 862841276);
        setIntField(term4293337, term4293337.getClass(), "totalBasicSync", 2036941966);
        setIntField(term4293337, term4293337.getClass(), "totalAdvancedSync", 1101676679);
        setIntField(term4293337, term4293337.getClass(), "totalExpertSync", -1116514479);
        setIntField(term4293337, term4293337.getClass(), "totalMasterSync", -1814383108);
        setIntField(term4293337, term4293337.getClass(), "totalReMasterSync", 867769056);
        setLongField(term4293337, term4293337.getClass(), "totalAchievement", 3301472207286306726L);
        setLongField(term4293337, term4293337.getClass(), "totalBasicAchievement", 51730512369631991L);
        setLongField(term4293337, term4293337.getClass(), "totalAdvancedAchievement", 2257610568659413534L);
        setLongField(term4293337, term4293337.getClass(), "totalExpertAchievement", -7657619679671998613L);
        setLongField(term4293337, term4293337.getClass(), "totalMasterAchievement", 1104379372365536845L);
        setLongField(term4293337, term4293337.getClass(), "totalReMasterAchievement", 264036827298666669L);
        setLongField(term4293337, term4293337.getClass(), "playerOldRating", 965443180469630404L);
        setLongField(term4293337, term4293337.getClass(), "playerNewRating", 5339353807059479953L);
        setIntField(term4293337, term4293337.getClass(), "banState", -590792061);
        setLongField(term4293337, term4293337.getClass(), "dateTime", 8875150902477034581L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uihqrgPqZv";
        callMethod(klass, "setLastClientId", argTypes, term4293337, args);
    }

};


