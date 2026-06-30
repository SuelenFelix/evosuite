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

public class UserDetail_getGradeRank_35946993115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4238005;

    public UserDetail_getGradeRank_35946993115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4238009 = new Long(2212942126645094920L);
        Integer term4238072 = new Integer(-1016726676);
        Integer term4238074 = new Integer(375593728);
        Integer term4238076 = new Integer(-1684773948);
        ArrayList term4238070 = new ArrayList();
        ((ArrayList) term4238070).add(term4238072);
        ((ArrayList) term4238070).add(term4238074);
        ((ArrayList) term4238070).add(term4238076);
        Integer term4238082 = new Integer(-902905305);
        Integer term4238084 = new Integer(-800651098);
        ArrayList term4238080 = new ArrayList();
        ((ArrayList) term4238080).add(term4238082);
        ((ArrayList) term4238080).add(term4238084);
        term4238005 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4238007 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4238023 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4238024 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4238028 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4238033 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4238034 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4238038 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4238005, term4238005.getClass(), "id", 6925417703182363669L);
        setLongField(term4238007, term4238007.getClass(), "id", 6980810398972769712L);
        setField(term4238007, term4238007.getClass(), "extId", term4238009);
        setField(term4238007, term4238007.getClass(), "luid", "wWCWTjQZoK");
        setIntField(term4238024, term4238024.getClass(), "year", 2017);
        setShortField(term4238024, term4238024.getClass(), "month", (short) 8);
        setShortField(term4238024, term4238024.getClass(), "day", (short) 15);
        setField(term4238023, term4238023.getClass(), "date", term4238024);
        setByteField(term4238028, term4238028.getClass(), "hour", (byte) 13);
        setByteField(term4238028, term4238028.getClass(), "minute", (byte) 14);
        setByteField(term4238028, term4238028.getClass(), "second", (byte) 32);
        setIntField(term4238028, term4238028.getClass(), "nano", 909754915);
        setField(term4238023, term4238023.getClass(), "time", term4238028);
        setField(term4238007, term4238007.getClass(), "registerTime", term4238023);
        setIntField(term4238034, term4238034.getClass(), "year", 2026);
        setShortField(term4238034, term4238034.getClass(), "month", (short) 5);
        setShortField(term4238034, term4238034.getClass(), "day", (short) 6);
        setField(term4238033, term4238033.getClass(), "date", term4238034);
        setByteField(term4238038, term4238038.getClass(), "hour", (byte) 18);
        setByteField(term4238038, term4238038.getClass(), "minute", (byte) 30);
        setByteField(term4238038, term4238038.getClass(), "second", (byte) 55);
        setIntField(term4238038, term4238038.getClass(), "nano", 666230624);
        setField(term4238033, term4238033.getClass(), "time", term4238038);
        setField(term4238007, term4238007.getClass(), "accessTime", term4238033);
        setField(term4238005, term4238005.getClass(), "card", term4238007);
        setField(term4238005, term4238005.getClass(), "userName", "bQzOqCUztZ");
        setIntField(term4238005, term4238005.getClass(), "isNetMember", -1820158111);
        setIntField(term4238005, term4238005.getClass(), "iconId", 877971647);
        setIntField(term4238005, term4238005.getClass(), "plateId", 36983384);
        setIntField(term4238005, term4238005.getClass(), "titleId", 1119509928);
        setIntField(term4238005, term4238005.getClass(), "partnerId", -1626052587);
        setIntField(term4238005, term4238005.getClass(), "frameId", -1615008280);
        setIntField(term4238005, term4238005.getClass(), "selectMapId", -1437723164);
        setIntField(term4238005, term4238005.getClass(), "totalAwake", 237848908);
        setIntField(term4238005, term4238005.getClass(), "gradeRating", -360799051);
        setIntField(term4238005, term4238005.getClass(), "musicRating", 433004156);
        setIntField(term4238005, term4238005.getClass(), "playerRating", 1808929551);
        setIntField(term4238005, term4238005.getClass(), "highestRating", -1689945760);
        setIntField(term4238005, term4238005.getClass(), "gradeRank", 1179923508);
        setIntField(term4238005, term4238005.getClass(), "classRank", 1904133919);
        setIntField(term4238005, term4238005.getClass(), "courseRank", -1657146364);
        setField(term4238005, term4238005.getClass(), "charaSlot", term4238070);
        setField(term4238005, term4238005.getClass(), "charaLockSlot", term4238080);
        setLongField(term4238005, term4238005.getClass(), "contentBit", 2074068595724060063L);
        setIntField(term4238005, term4238005.getClass(), "playCount", 839273621);
        setField(term4238005, term4238005.getClass(), "eventWatchedDate", "WqMNyLOyoc");
        setField(term4238005, term4238005.getClass(), "lastGameId", "qvsdlRajar");
        setField(term4238005, term4238005.getClass(), "lastRomVersion", "wKQVxNWMnO");
        setField(term4238005, term4238005.getClass(), "lastDataVersion", "RsVKiZPoiv");
        setField(term4238005, term4238005.getClass(), "lastLoginDate", "IoEYjmHtSR");
        setField(term4238005, term4238005.getClass(), "lastPlayDate", "aaTQFswEUh");
        setIntField(term4238005, term4238005.getClass(), "lastPlayCredit", 1480658538);
        setIntField(term4238005, term4238005.getClass(), "lastPlayMode", 357190248);
        setIntField(term4238005, term4238005.getClass(), "lastPlaceId", -425174456);
        setField(term4238005, term4238005.getClass(), "lastPlaceName", "btmmrbQYOW");
        setIntField(term4238005, term4238005.getClass(), "lastAllNetId", 1499832866);
        setIntField(term4238005, term4238005.getClass(), "lastRegionId", 1616911179);
        setField(term4238005, term4238005.getClass(), "lastRegionName", "phExrWFggm");
        setField(term4238005, term4238005.getClass(), "lastClientId", "TFnqDplBZl");
        setField(term4238005, term4238005.getClass(), "lastCountryCode", "AILHMWkoFO");
        setIntField(term4238005, term4238005.getClass(), "lastSelectEMoney", 457425416);
        setIntField(term4238005, term4238005.getClass(), "lastSelectTicket", -799444213);
        setIntField(term4238005, term4238005.getClass(), "lastSelectCourse", 938375551);
        setIntField(term4238005, term4238005.getClass(), "lastCountCourse", -1162653349);
        setField(term4238005, term4238005.getClass(), "firstGameId", "HbZGsYmcJI");
        setField(term4238005, term4238005.getClass(), "firstRomVersion", "YLNUpfuhWb");
        setField(term4238005, term4238005.getClass(), "firstDataVersion", "xqnldtuywJ");
        setField(term4238005, term4238005.getClass(), "firstPlayDate", "SXOCvOUDWS");
        setField(term4238005, term4238005.getClass(), "compatibleCmVersion", "AFmaMAVaxX");
        setField(term4238005, term4238005.getClass(), "dailyBonusDate", "Ojjdxdyfuo");
        setField(term4238005, term4238005.getClass(), "dailyCourseBonusDate", "cSaMGdyLNw");
        setField(term4238005, term4238005.getClass(), "lastPairLoginDate", "CYODLxFiGO");
        setField(term4238005, term4238005.getClass(), "lastTrialPlayDate", "DnyZLYMvlX");
        setIntField(term4238005, term4238005.getClass(), "playVsCount", -142463438);
        setIntField(term4238005, term4238005.getClass(), "playSyncCount", -1986528064);
        setIntField(term4238005, term4238005.getClass(), "winCount", -377009556);
        setIntField(term4238005, term4238005.getClass(), "helpCount", 861587297);
        setIntField(term4238005, term4238005.getClass(), "comboCount", 996914999);
        setLongField(term4238005, term4238005.getClass(), "totalDeluxscore", 4885867308145902805L);
        setLongField(term4238005, term4238005.getClass(), "totalBasicDeluxscore", 2197272729448609497L);
        setLongField(term4238005, term4238005.getClass(), "totalAdvancedDeluxscore", 4042149954312276189L);
        setLongField(term4238005, term4238005.getClass(), "totalExpertDeluxscore", 556303534309349849L);
        setLongField(term4238005, term4238005.getClass(), "totalMasterDeluxscore", 448765677680378204L);
        setLongField(term4238005, term4238005.getClass(), "totalReMasterDeluxscore", 747300228794005238L);
        setIntField(term4238005, term4238005.getClass(), "totalSync", -846949905);
        setIntField(term4238005, term4238005.getClass(), "totalBasicSync", -923313864);
        setIntField(term4238005, term4238005.getClass(), "totalAdvancedSync", -994136742);
        setIntField(term4238005, term4238005.getClass(), "totalExpertSync", 1546642799);
        setIntField(term4238005, term4238005.getClass(), "totalMasterSync", 1904627017);
        setIntField(term4238005, term4238005.getClass(), "totalReMasterSync", -474576065);
        setLongField(term4238005, term4238005.getClass(), "totalAchievement", -254444094342409631L);
        setLongField(term4238005, term4238005.getClass(), "totalBasicAchievement", -7860408433679581997L);
        setLongField(term4238005, term4238005.getClass(), "totalAdvancedAchievement", -6206622824399149536L);
        setLongField(term4238005, term4238005.getClass(), "totalExpertAchievement", 711108872235283611L);
        setLongField(term4238005, term4238005.getClass(), "totalMasterAchievement", 3324694814541300944L);
        setLongField(term4238005, term4238005.getClass(), "totalReMasterAchievement", 8779327001546700429L);
        setLongField(term4238005, term4238005.getClass(), "playerOldRating", 6475243780268623574L);
        setLongField(term4238005, term4238005.getClass(), "playerNewRating", -6038463262540799301L);
        setIntField(term4238005, term4238005.getClass(), "banState", 28008624);
        setLongField(term4238005, term4238005.getClass(), "dateTime", -3131917247938542301L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGradeRank", argTypes, term4238005, args);
    }

};


