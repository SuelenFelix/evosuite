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

public class UserDetail_setIsNetMember_185211010380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4274926;
     Object term4275279;

    public UserDetail_setIsNetMember_185211010380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4274930 = new Long(-1995356765968597169L);
        Integer term4274993 = new Integer(-1780432495);
        Integer term4274995 = new Integer(428202681);
        Integer term4274997 = new Integer(1573860785);
        Integer term4274999 = new Integer(-774422538);
        Integer term4275001 = new Integer(1066017141);
        ArrayList term4274991 = new ArrayList();
        ((ArrayList) term4274991).add(term4274993);
        ((ArrayList) term4274991).add(term4274995);
        ((ArrayList) term4274991).add(term4274997);
        ((ArrayList) term4274991).add(term4274999);
        ((ArrayList) term4274991).add(term4275001);
        Integer term4275007 = new Integer(-338312520);
        Integer term4275009 = new Integer(-1944265950);
        ArrayList term4275005 = new ArrayList();
        ((ArrayList) term4275005).add(term4275007);
        ((ArrayList) term4275005).add(term4275009);
        term4274926 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4274928 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4274944 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4274945 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4274949 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4274954 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4274955 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4274959 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4274926, term4274926.getClass(), "id", -2862593717225664635L);
        setLongField(term4274928, term4274928.getClass(), "id", -3048622483254040659L);
        setField(term4274928, term4274928.getClass(), "extId", term4274930);
        setField(term4274928, term4274928.getClass(), "luid", "bVvDChDIjo");
        setIntField(term4274945, term4274945.getClass(), "year", 2019);
        setShortField(term4274945, term4274945.getClass(), "month", (short) 1);
        setShortField(term4274945, term4274945.getClass(), "day", (short) 23);
        setField(term4274944, term4274944.getClass(), "date", term4274945);
        setByteField(term4274949, term4274949.getClass(), "hour", (byte) 13);
        setByteField(term4274949, term4274949.getClass(), "minute", (byte) 50);
        setByteField(term4274949, term4274949.getClass(), "second", (byte) 49);
        setIntField(term4274949, term4274949.getClass(), "nano", 392799075);
        setField(term4274944, term4274944.getClass(), "time", term4274949);
        setField(term4274928, term4274928.getClass(), "registerTime", term4274944);
        setIntField(term4274955, term4274955.getClass(), "year", 2011);
        setShortField(term4274955, term4274955.getClass(), "month", (short) 7);
        setShortField(term4274955, term4274955.getClass(), "day", (short) 26);
        setField(term4274954, term4274954.getClass(), "date", term4274955);
        setByteField(term4274959, term4274959.getClass(), "hour", (byte) 12);
        setByteField(term4274959, term4274959.getClass(), "minute", (byte) 47);
        setByteField(term4274959, term4274959.getClass(), "second", (byte) 34);
        setIntField(term4274959, term4274959.getClass(), "nano", 391471382);
        setField(term4274954, term4274954.getClass(), "time", term4274959);
        setField(term4274928, term4274928.getClass(), "accessTime", term4274954);
        setField(term4274926, term4274926.getClass(), "card", term4274928);
        setField(term4274926, term4274926.getClass(), "userName", "ISwAPNnMmK");
        setIntField(term4274926, term4274926.getClass(), "isNetMember", 49325538);
        setIntField(term4274926, term4274926.getClass(), "iconId", 1391613973);
        setIntField(term4274926, term4274926.getClass(), "plateId", -473117858);
        setIntField(term4274926, term4274926.getClass(), "titleId", 1542303691);
        setIntField(term4274926, term4274926.getClass(), "partnerId", -411760142);
        setIntField(term4274926, term4274926.getClass(), "frameId", -1856400988);
        setIntField(term4274926, term4274926.getClass(), "selectMapId", -2087768834);
        setIntField(term4274926, term4274926.getClass(), "totalAwake", -1166139261);
        setIntField(term4274926, term4274926.getClass(), "gradeRating", -1345535372);
        setIntField(term4274926, term4274926.getClass(), "musicRating", -2123281012);
        setIntField(term4274926, term4274926.getClass(), "playerRating", 1483831362);
        setIntField(term4274926, term4274926.getClass(), "highestRating", 1773700021);
        setIntField(term4274926, term4274926.getClass(), "gradeRank", 1565612245);
        setIntField(term4274926, term4274926.getClass(), "classRank", -1730676112);
        setIntField(term4274926, term4274926.getClass(), "courseRank", -1122970074);
        setField(term4274926, term4274926.getClass(), "charaSlot", term4274991);
        setField(term4274926, term4274926.getClass(), "charaLockSlot", term4275005);
        setLongField(term4274926, term4274926.getClass(), "contentBit", -166625073498831705L);
        setIntField(term4274926, term4274926.getClass(), "playCount", -893251933);
        setField(term4274926, term4274926.getClass(), "eventWatchedDate", "ubXFLbALoD");
        setField(term4274926, term4274926.getClass(), "lastGameId", "dcuOcwbjJG");
        setField(term4274926, term4274926.getClass(), "lastRomVersion", "mYranDSoMB");
        setField(term4274926, term4274926.getClass(), "lastDataVersion", "XtkrxOXcum");
        setField(term4274926, term4274926.getClass(), "lastLoginDate", "vdvVOoxrUS");
        setField(term4274926, term4274926.getClass(), "lastPlayDate", "ZjcfrACwcm");
        setIntField(term4274926, term4274926.getClass(), "lastPlayCredit", 1087628541);
        setIntField(term4274926, term4274926.getClass(), "lastPlayMode", 692618879);
        setIntField(term4274926, term4274926.getClass(), "lastPlaceId", -1300453816);
        setField(term4274926, term4274926.getClass(), "lastPlaceName", "QptxwXUsjS");
        setIntField(term4274926, term4274926.getClass(), "lastAllNetId", -916206593);
        setIntField(term4274926, term4274926.getClass(), "lastRegionId", 1622692532);
        setField(term4274926, term4274926.getClass(), "lastRegionName", "CmwPKtzrCB");
        setField(term4274926, term4274926.getClass(), "lastClientId", "cTwOXFUGbJ");
        setField(term4274926, term4274926.getClass(), "lastCountryCode", "NgwdlSuLXj");
        setIntField(term4274926, term4274926.getClass(), "lastSelectEMoney", 180273931);
        setIntField(term4274926, term4274926.getClass(), "lastSelectTicket", 664526064);
        setIntField(term4274926, term4274926.getClass(), "lastSelectCourse", 2019244957);
        setIntField(term4274926, term4274926.getClass(), "lastCountCourse", -927655615);
        setField(term4274926, term4274926.getClass(), "firstGameId", "UQcjdSSjSj");
        setField(term4274926, term4274926.getClass(), "firstRomVersion", "CdBuINKcpM");
        setField(term4274926, term4274926.getClass(), "firstDataVersion", "twtaLPTfSm");
        setField(term4274926, term4274926.getClass(), "firstPlayDate", "uOViVmcSjq");
        setField(term4274926, term4274926.getClass(), "compatibleCmVersion", "GpeoFXTzDe");
        setField(term4274926, term4274926.getClass(), "dailyBonusDate", "DpPOYoulGx");
        setField(term4274926, term4274926.getClass(), "dailyCourseBonusDate", "wtdPGMpivz");
        setField(term4274926, term4274926.getClass(), "lastPairLoginDate", "xUwQROtRng");
        setField(term4274926, term4274926.getClass(), "lastTrialPlayDate", "uiqyiiCSIP");
        setIntField(term4274926, term4274926.getClass(), "playVsCount", 1380314456);
        setIntField(term4274926, term4274926.getClass(), "playSyncCount", 1501281616);
        setIntField(term4274926, term4274926.getClass(), "winCount", 2095626602);
        setIntField(term4274926, term4274926.getClass(), "helpCount", -958117548);
        setIntField(term4274926, term4274926.getClass(), "comboCount", 719745206);
        setLongField(term4274926, term4274926.getClass(), "totalDeluxscore", -2304764250090035840L);
        setLongField(term4274926, term4274926.getClass(), "totalBasicDeluxscore", 7472067745550555302L);
        setLongField(term4274926, term4274926.getClass(), "totalAdvancedDeluxscore", -5987037411990138906L);
        setLongField(term4274926, term4274926.getClass(), "totalExpertDeluxscore", -1965608913691602425L);
        setLongField(term4274926, term4274926.getClass(), "totalMasterDeluxscore", -2716486864889237307L);
        setLongField(term4274926, term4274926.getClass(), "totalReMasterDeluxscore", 2473886114146954744L);
        setIntField(term4274926, term4274926.getClass(), "totalSync", 257520652);
        setIntField(term4274926, term4274926.getClass(), "totalBasicSync", 694738844);
        setIntField(term4274926, term4274926.getClass(), "totalAdvancedSync", -1388505819);
        setIntField(term4274926, term4274926.getClass(), "totalExpertSync", 535115218);
        setIntField(term4274926, term4274926.getClass(), "totalMasterSync", 306992635);
        setIntField(term4274926, term4274926.getClass(), "totalReMasterSync", 971331626);
        setLongField(term4274926, term4274926.getClass(), "totalAchievement", 8006985100911376679L);
        setLongField(term4274926, term4274926.getClass(), "totalBasicAchievement", -3686622770089036071L);
        setLongField(term4274926, term4274926.getClass(), "totalAdvancedAchievement", 3189875944537138529L);
        setLongField(term4274926, term4274926.getClass(), "totalExpertAchievement", -50228833483620611L);
        setLongField(term4274926, term4274926.getClass(), "totalMasterAchievement", -2064922882461237385L);
        setLongField(term4274926, term4274926.getClass(), "totalReMasterAchievement", -4168797621677014095L);
        setLongField(term4274926, term4274926.getClass(), "playerOldRating", -3137469169386855490L);
        setLongField(term4274926, term4274926.getClass(), "playerNewRating", -5662392024789517188L);
        setIntField(term4274926, term4274926.getClass(), "banState", -430229796);
        setLongField(term4274926, term4274926.getClass(), "dateTime", 3530294218234522563L);
        term4275279 = new Integer(936907592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4275279;
        callMethod(klass, "setIsNetMember", argTypes, term4274926, args);
    }

};


