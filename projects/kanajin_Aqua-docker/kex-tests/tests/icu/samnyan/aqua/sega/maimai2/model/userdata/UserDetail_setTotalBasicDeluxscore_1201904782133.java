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

public class UserDetail_setTotalBasicDeluxscore_1201904782133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271349;
     Object term271702;

    public UserDetail_setTotalBasicDeluxscore_1201904782133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term271353 = new Long(6542357174275680335L);
        Integer term271416 = new Integer(1315068409);
        Integer term271418 = new Integer(1002887761);
        Integer term271420 = new Integer(38995637);
        Integer term271422 = new Integer(-2106212589);
        Integer term271424 = new Integer(1881486751);
        Integer term271426 = new Integer(-92679624);
        Integer term271428 = new Integer(935287448);
        ArrayList term271414 = new ArrayList();
        ((ArrayList) term271414).add(term271416);
        ((ArrayList) term271414).add(term271418);
        ((ArrayList) term271414).add(term271420);
        ((ArrayList) term271414).add(term271422);
        ((ArrayList) term271414).add(term271424);
        ((ArrayList) term271414).add(term271426);
        ((ArrayList) term271414).add(term271428);
        ArrayList term271432 = new ArrayList();
        term271349 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term271351 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term271367 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term271368 = newInstance(Class.forName("java.time.LocalDate"));
        Object term271372 = newInstance(Class.forName("java.time.LocalTime"));
        Object term271377 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term271378 = newInstance(Class.forName("java.time.LocalDate"));
        Object term271382 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term271349, term271349.getClass(), "id", 4825868220822925944L);
        setLongField(term271351, term271351.getClass(), "id", -3881729848758411938L);
        setField(term271351, term271351.getClass(), "extId", term271353);
        setField(term271351, term271351.getClass(), "luid", "sBVtXchAVo");
        setIntField(term271368, term271368.getClass(), "year", 2013);
        setShortField(term271368, term271368.getClass(), "month", (short) 5);
        setShortField(term271368, term271368.getClass(), "day", (short) 23);
        setField(term271367, term271367.getClass(), "date", term271368);
        setByteField(term271372, term271372.getClass(), "hour", (byte) 17);
        setByteField(term271372, term271372.getClass(), "minute", (byte) 43);
        setByteField(term271372, term271372.getClass(), "second", (byte) 25);
        setIntField(term271372, term271372.getClass(), "nano", 472658100);
        setField(term271367, term271367.getClass(), "time", term271372);
        setField(term271351, term271351.getClass(), "registerTime", term271367);
        setIntField(term271378, term271378.getClass(), "year", 2026);
        setShortField(term271378, term271378.getClass(), "month", (short) 8);
        setShortField(term271378, term271378.getClass(), "day", (short) 30);
        setField(term271377, term271377.getClass(), "date", term271378);
        setByteField(term271382, term271382.getClass(), "hour", (byte) 23);
        setByteField(term271382, term271382.getClass(), "minute", (byte) 9);
        setByteField(term271382, term271382.getClass(), "second", (byte) 53);
        setIntField(term271382, term271382.getClass(), "nano", 748186544);
        setField(term271377, term271377.getClass(), "time", term271382);
        setField(term271351, term271351.getClass(), "accessTime", term271377);
        setField(term271349, term271349.getClass(), "card", term271351);
        setField(term271349, term271349.getClass(), "userName", "iQgpBjoGXJ");
        setIntField(term271349, term271349.getClass(), "isNetMember", 1670532643);
        setIntField(term271349, term271349.getClass(), "iconId", 1132888529);
        setIntField(term271349, term271349.getClass(), "plateId", -749019689);
        setIntField(term271349, term271349.getClass(), "titleId", 10308038);
        setIntField(term271349, term271349.getClass(), "partnerId", 1806892057);
        setIntField(term271349, term271349.getClass(), "frameId", 753991973);
        setIntField(term271349, term271349.getClass(), "selectMapId", -1799585006);
        setIntField(term271349, term271349.getClass(), "totalAwake", -570035943);
        setIntField(term271349, term271349.getClass(), "gradeRating", 1887980610);
        setIntField(term271349, term271349.getClass(), "musicRating", -856907689);
        setIntField(term271349, term271349.getClass(), "playerRating", -1114722762);
        setIntField(term271349, term271349.getClass(), "highestRating", -1313611523);
        setIntField(term271349, term271349.getClass(), "gradeRank", -602904585);
        setIntField(term271349, term271349.getClass(), "classRank", 1876360979);
        setIntField(term271349, term271349.getClass(), "courseRank", -34256286);
        setField(term271349, term271349.getClass(), "charaSlot", term271414);
        setField(term271349, term271349.getClass(), "charaLockSlot", term271432);
        setLongField(term271349, term271349.getClass(), "contentBit", -3671015242217876413L);
        setIntField(term271349, term271349.getClass(), "playCount", -423891359);
        setField(term271349, term271349.getClass(), "eventWatchedDate", "mWztTjhUcj");
        setField(term271349, term271349.getClass(), "lastGameId", "nBCsrSCNym");
        setField(term271349, term271349.getClass(), "lastRomVersion", "yWwxzvskUK");
        setField(term271349, term271349.getClass(), "lastDataVersion", "DpghyDxPRQ");
        setField(term271349, term271349.getClass(), "lastLoginDate", "dejAqujyZr");
        setField(term271349, term271349.getClass(), "lastPlayDate", "YOOpOJUVhi");
        setIntField(term271349, term271349.getClass(), "lastPlayCredit", 763976967);
        setIntField(term271349, term271349.getClass(), "lastPlayMode", 1595562615);
        setIntField(term271349, term271349.getClass(), "lastPlaceId", 1496157000);
        setField(term271349, term271349.getClass(), "lastPlaceName", "BzYCBybylB");
        setIntField(term271349, term271349.getClass(), "lastAllNetId", 1444788766);
        setIntField(term271349, term271349.getClass(), "lastRegionId", -2011306040);
        setField(term271349, term271349.getClass(), "lastRegionName", "KGmEuVckVx");
        setField(term271349, term271349.getClass(), "lastClientId", "JIqJWTPJSn");
        setField(term271349, term271349.getClass(), "lastCountryCode", "gnxtJXVkUK");
        setIntField(term271349, term271349.getClass(), "lastSelectEMoney", -2135060594);
        setIntField(term271349, term271349.getClass(), "lastSelectTicket", 1104254825);
        setIntField(term271349, term271349.getClass(), "lastSelectCourse", 443408660);
        setIntField(term271349, term271349.getClass(), "lastCountCourse", 1389120111);
        setField(term271349, term271349.getClass(), "firstGameId", "lposbQqAUU");
        setField(term271349, term271349.getClass(), "firstRomVersion", "CZZYeaxqjs");
        setField(term271349, term271349.getClass(), "firstDataVersion", "KaNkKUHQsw");
        setField(term271349, term271349.getClass(), "firstPlayDate", "LCbzYYPHVk");
        setField(term271349, term271349.getClass(), "compatibleCmVersion", "KbJoSNqLbc");
        setField(term271349, term271349.getClass(), "dailyBonusDate", "XizyspPIEi");
        setField(term271349, term271349.getClass(), "dailyCourseBonusDate", "JKuMejdhzA");
        setField(term271349, term271349.getClass(), "lastPairLoginDate", "suLlbdYAIy");
        setField(term271349, term271349.getClass(), "lastTrialPlayDate", "wDDbneJdEB");
        setIntField(term271349, term271349.getClass(), "playVsCount", 731070998);
        setIntField(term271349, term271349.getClass(), "playSyncCount", 57680258);
        setIntField(term271349, term271349.getClass(), "winCount", -936342894);
        setIntField(term271349, term271349.getClass(), "helpCount", -1894595167);
        setIntField(term271349, term271349.getClass(), "comboCount", -2089931895);
        setLongField(term271349, term271349.getClass(), "totalDeluxscore", -7403875112607892632L);
        setLongField(term271349, term271349.getClass(), "totalBasicDeluxscore", 6004229380816697659L);
        setLongField(term271349, term271349.getClass(), "totalAdvancedDeluxscore", 697717243328118977L);
        setLongField(term271349, term271349.getClass(), "totalExpertDeluxscore", -620800790472302388L);
        setLongField(term271349, term271349.getClass(), "totalMasterDeluxscore", -5743137778796207192L);
        setLongField(term271349, term271349.getClass(), "totalReMasterDeluxscore", 8311249784166045461L);
        setIntField(term271349, term271349.getClass(), "totalSync", 1400874310);
        setIntField(term271349, term271349.getClass(), "totalBasicSync", -1142687493);
        setIntField(term271349, term271349.getClass(), "totalAdvancedSync", 546473545);
        setIntField(term271349, term271349.getClass(), "totalExpertSync", 1922881115);
        setIntField(term271349, term271349.getClass(), "totalMasterSync", 1341930316);
        setIntField(term271349, term271349.getClass(), "totalReMasterSync", 1284571301);
        setLongField(term271349, term271349.getClass(), "totalAchievement", -3608650075786159411L);
        setLongField(term271349, term271349.getClass(), "totalBasicAchievement", -2336970893136419858L);
        setLongField(term271349, term271349.getClass(), "totalAdvancedAchievement", 3903864941757730291L);
        setLongField(term271349, term271349.getClass(), "totalExpertAchievement", 4235374749079135788L);
        setLongField(term271349, term271349.getClass(), "totalMasterAchievement", 3428151801295957201L);
        setLongField(term271349, term271349.getClass(), "totalReMasterAchievement", 1745833591384612643L);
        setLongField(term271349, term271349.getClass(), "playerOldRating", -6956663159478267847L);
        setLongField(term271349, term271349.getClass(), "playerNewRating", -9087747609396940180L);
        setIntField(term271349, term271349.getClass(), "banState", 1905466539);
        setLongField(term271349, term271349.getClass(), "dateTime", 1761494664699464060L);
        term271702 = new Long(5908588410184932839L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term271702;
        callMethod(klass, "setTotalBasicDeluxscore", argTypes, term271349, args);
    }

};


