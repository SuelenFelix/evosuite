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

public class UserUdemae_setMaxRate_44573293822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107806;
     Object term108169;

    public UserUdemae_setMaxRate_44573293822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term107812 = new Long(4502292577098212311L);
        Integer term107875 = new Integer(-1476037190);
        Integer term107877 = new Integer(-718204437);
        ArrayList term107873 = new ArrayList();
        ((ArrayList) term107873).add(term107875);
        ((ArrayList) term107873).add(term107877);
        Integer term107883 = new Integer(468974358);
        ArrayList term107881 = new ArrayList();
        ((ArrayList) term107881).add(term107883);
        term107806 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term107808 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term107810 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term107826 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term107827 = newInstance(Class.forName("java.time.LocalDate"));
        Object term107831 = newInstance(Class.forName("java.time.LocalTime"));
        Object term107836 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term107837 = newInstance(Class.forName("java.time.LocalDate"));
        Object term107841 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term107806, term107806.getClass(), "id", 1982970791443207752L);
        setLongField(term107808, term107808.getClass(), "id", 3439989480249101943L);
        setLongField(term107810, term107810.getClass(), "id", -7959316538142185407L);
        setField(term107810, term107810.getClass(), "extId", term107812);
        setField(term107810, term107810.getClass(), "luid", "mBAKehIGeW");
        setIntField(term107827, term107827.getClass(), "year", 2026);
        setShortField(term107827, term107827.getClass(), "month", (short) 7);
        setShortField(term107827, term107827.getClass(), "day", (short) 18);
        setField(term107826, term107826.getClass(), "date", term107827);
        setByteField(term107831, term107831.getClass(), "hour", (byte) 14);
        setByteField(term107831, term107831.getClass(), "minute", (byte) 29);
        setByteField(term107831, term107831.getClass(), "second", (byte) 53);
        setIntField(term107831, term107831.getClass(), "nano", 285756900);
        setField(term107826, term107826.getClass(), "time", term107831);
        setField(term107810, term107810.getClass(), "registerTime", term107826);
        setIntField(term107837, term107837.getClass(), "year", 2012);
        setShortField(term107837, term107837.getClass(), "month", (short) 2);
        setShortField(term107837, term107837.getClass(), "day", (short) 2);
        setField(term107836, term107836.getClass(), "date", term107837);
        setByteField(term107841, term107841.getClass(), "hour", (byte) 4);
        setByteField(term107841, term107841.getClass(), "minute", (byte) 19);
        setByteField(term107841, term107841.getClass(), "second", (byte) 58);
        setIntField(term107841, term107841.getClass(), "nano", 550709112);
        setField(term107836, term107836.getClass(), "time", term107841);
        setField(term107810, term107810.getClass(), "accessTime", term107836);
        setField(term107808, term107808.getClass(), "card", term107810);
        setField(term107808, term107808.getClass(), "userName", "tmiPUgRXrn");
        setIntField(term107808, term107808.getClass(), "isNetMember", -1076430581);
        setIntField(term107808, term107808.getClass(), "iconId", 1009467504);
        setIntField(term107808, term107808.getClass(), "plateId", -140520015);
        setIntField(term107808, term107808.getClass(), "titleId", -1112538327);
        setIntField(term107808, term107808.getClass(), "partnerId", 834878229);
        setIntField(term107808, term107808.getClass(), "frameId", 602457171);
        setIntField(term107808, term107808.getClass(), "selectMapId", -625958026);
        setIntField(term107808, term107808.getClass(), "totalAwake", 1365173968);
        setIntField(term107808, term107808.getClass(), "gradeRating", -58269650);
        setIntField(term107808, term107808.getClass(), "musicRating", -1473226766);
        setIntField(term107808, term107808.getClass(), "playerRating", 675408622);
        setIntField(term107808, term107808.getClass(), "highestRating", 1010137030);
        setIntField(term107808, term107808.getClass(), "gradeRank", -1889642100);
        setIntField(term107808, term107808.getClass(), "classRank", 2145169938);
        setIntField(term107808, term107808.getClass(), "courseRank", 200649815);
        setField(term107808, term107808.getClass(), "charaSlot", term107873);
        setField(term107808, term107808.getClass(), "charaLockSlot", term107881);
        setLongField(term107808, term107808.getClass(), "contentBit", 7180761268865120390L);
        setIntField(term107808, term107808.getClass(), "playCount", -825109684);
        setField(term107808, term107808.getClass(), "eventWatchedDate", "VuZmwqnade");
        setField(term107808, term107808.getClass(), "lastGameId", "ohZrjboUnX");
        setField(term107808, term107808.getClass(), "lastRomVersion", "rwlrpQuNrG");
        setField(term107808, term107808.getClass(), "lastDataVersion", "fctYGLXetS");
        setField(term107808, term107808.getClass(), "lastLoginDate", "UPbgrEUWQD");
        setField(term107808, term107808.getClass(), "lastPlayDate", "HABnTZidNp");
        setIntField(term107808, term107808.getClass(), "lastPlayCredit", -908737984);
        setIntField(term107808, term107808.getClass(), "lastPlayMode", -1108486320);
        setIntField(term107808, term107808.getClass(), "lastPlaceId", -1175116960);
        setField(term107808, term107808.getClass(), "lastPlaceName", "qXysRdBrsg");
        setIntField(term107808, term107808.getClass(), "lastAllNetId", 1090620326);
        setIntField(term107808, term107808.getClass(), "lastRegionId", 1832573352);
        setField(term107808, term107808.getClass(), "lastRegionName", "hbtKoWkZLU");
        setField(term107808, term107808.getClass(), "lastClientId", "VCWjXeMQGX");
        setField(term107808, term107808.getClass(), "lastCountryCode", "KzrkBfSzqK");
        setIntField(term107808, term107808.getClass(), "lastSelectEMoney", 17102219);
        setIntField(term107808, term107808.getClass(), "lastSelectTicket", -436664138);
        setIntField(term107808, term107808.getClass(), "lastSelectCourse", -1751086046);
        setIntField(term107808, term107808.getClass(), "lastCountCourse", -384847577);
        setField(term107808, term107808.getClass(), "firstGameId", "cFNqeNRwhB");
        setField(term107808, term107808.getClass(), "firstRomVersion", "TQJASDuFUN");
        setField(term107808, term107808.getClass(), "firstDataVersion", "mOILNTkENv");
        setField(term107808, term107808.getClass(), "firstPlayDate", "xgjvpKAqFv");
        setField(term107808, term107808.getClass(), "compatibleCmVersion", "RspkCWCAFM");
        setField(term107808, term107808.getClass(), "dailyBonusDate", "zAkmDkobmH");
        setField(term107808, term107808.getClass(), "dailyCourseBonusDate", "FASdrZqBfN");
        setField(term107808, term107808.getClass(), "lastPairLoginDate", "YNwqJgOcWq");
        setField(term107808, term107808.getClass(), "lastTrialPlayDate", "tUcoJjDoJV");
        setIntField(term107808, term107808.getClass(), "playVsCount", -1036512897);
        setIntField(term107808, term107808.getClass(), "playSyncCount", -862201634);
        setIntField(term107808, term107808.getClass(), "winCount", -1414284967);
        setIntField(term107808, term107808.getClass(), "helpCount", 68026648);
        setIntField(term107808, term107808.getClass(), "comboCount", 851471025);
        setLongField(term107808, term107808.getClass(), "totalDeluxscore", 610952698138243145L);
        setLongField(term107808, term107808.getClass(), "totalBasicDeluxscore", -8975810343836354386L);
        setLongField(term107808, term107808.getClass(), "totalAdvancedDeluxscore", -4837495843996953019L);
        setLongField(term107808, term107808.getClass(), "totalExpertDeluxscore", -4035391635091594438L);
        setLongField(term107808, term107808.getClass(), "totalMasterDeluxscore", 4081339751421418606L);
        setLongField(term107808, term107808.getClass(), "totalReMasterDeluxscore", -5669989120629087357L);
        setIntField(term107808, term107808.getClass(), "totalSync", 310981701);
        setIntField(term107808, term107808.getClass(), "totalBasicSync", -1403596364);
        setIntField(term107808, term107808.getClass(), "totalAdvancedSync", 1473665279);
        setIntField(term107808, term107808.getClass(), "totalExpertSync", -758072942);
        setIntField(term107808, term107808.getClass(), "totalMasterSync", -88429419);
        setIntField(term107808, term107808.getClass(), "totalReMasterSync", -125218254);
        setLongField(term107808, term107808.getClass(), "totalAchievement", -8530393515143116712L);
        setLongField(term107808, term107808.getClass(), "totalBasicAchievement", 4695281402868299412L);
        setLongField(term107808, term107808.getClass(), "totalAdvancedAchievement", -2959985673430542289L);
        setLongField(term107808, term107808.getClass(), "totalExpertAchievement", -8908499017977435119L);
        setLongField(term107808, term107808.getClass(), "totalMasterAchievement", -953055683184375740L);
        setLongField(term107808, term107808.getClass(), "totalReMasterAchievement", -5426612898117103276L);
        setLongField(term107808, term107808.getClass(), "playerOldRating", -1712562533510140729L);
        setLongField(term107808, term107808.getClass(), "playerNewRating", 5075787894187682520L);
        setIntField(term107808, term107808.getClass(), "banState", -10117375);
        setLongField(term107808, term107808.getClass(), "dateTime", -3151283560134614058L);
        setField(term107806, term107806.getClass(), "user", term107808);
        setIntField(term107806, term107806.getClass(), "rate", 1628351455);
        setIntField(term107806, term107806.getClass(), "maxRate", -417098935);
        setIntField(term107806, term107806.getClass(), "classValue", 207512423);
        setIntField(term107806, term107806.getClass(), "maxClassValue", -1692495211);
        setIntField(term107806, term107806.getClass(), "totalWinNum", -1275247802);
        setIntField(term107806, term107806.getClass(), "totalLoseNum", -214786685);
        setIntField(term107806, term107806.getClass(), "maxWinNum", -1563422009);
        setIntField(term107806, term107806.getClass(), "maxLoseNum", 1071400572);
        setIntField(term107806, term107806.getClass(), "winNum", 593230414);
        setIntField(term107806, term107806.getClass(), "loseNum", 111767836);
        setIntField(term107806, term107806.getClass(), "npcTotalWinNum", -894018524);
        setIntField(term107806, term107806.getClass(), "npcTotalLoseNum", -1805793810);
        setIntField(term107806, term107806.getClass(), "npcMaxWinNum", 693687159);
        setIntField(term107806, term107806.getClass(), "npcMaxLoseNum", -1632145668);
        setIntField(term107806, term107806.getClass(), "npcWinNum", -161036428);
        setIntField(term107806, term107806.getClass(), "npcLoseNum", 1219123477);
        term108169 = new Integer(11646624);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term108169;
        callMethod(klass, "setMaxRate", argTypes, term107806, args);
    }

};


