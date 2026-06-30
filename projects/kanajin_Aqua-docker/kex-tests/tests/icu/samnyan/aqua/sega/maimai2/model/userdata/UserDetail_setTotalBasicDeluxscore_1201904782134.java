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

public class UserDetail_setTotalBasicDeluxscore_1201904782134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271404;
     Object term271757;

    public UserDetail_setTotalBasicDeluxscore_1201904782134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term271408 = new Long(6542357174275680335L);
        Integer term271471 = new Integer(1315068409);
        Integer term271473 = new Integer(1002887761);
        Integer term271475 = new Integer(38995637);
        Integer term271477 = new Integer(-2106212589);
        Integer term271479 = new Integer(1881486751);
        Integer term271481 = new Integer(-92679624);
        Integer term271483 = new Integer(935287448);
        ArrayList term271469 = new ArrayList();
        ((ArrayList) term271469).add(term271471);
        ((ArrayList) term271469).add(term271473);
        ((ArrayList) term271469).add(term271475);
        ((ArrayList) term271469).add(term271477);
        ((ArrayList) term271469).add(term271479);
        ((ArrayList) term271469).add(term271481);
        ((ArrayList) term271469).add(term271483);
        ArrayList term271487 = new ArrayList();
        term271404 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term271406 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term271422 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term271423 = newInstance(Class.forName("java.time.LocalDate"));
        Object term271427 = newInstance(Class.forName("java.time.LocalTime"));
        Object term271432 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term271433 = newInstance(Class.forName("java.time.LocalDate"));
        Object term271437 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term271404, term271404.getClass(), "id", 4825868220822925944L);
        setLongField(term271406, term271406.getClass(), "id", -3881729848758411938L);
        setField(term271406, term271406.getClass(), "extId", term271408);
        setField(term271406, term271406.getClass(), "luid", "sBVtXchAVo");
        setIntField(term271423, term271423.getClass(), "year", 2013);
        setShortField(term271423, term271423.getClass(), "month", (short) 5);
        setShortField(term271423, term271423.getClass(), "day", (short) 23);
        setField(term271422, term271422.getClass(), "date", term271423);
        setByteField(term271427, term271427.getClass(), "hour", (byte) 17);
        setByteField(term271427, term271427.getClass(), "minute", (byte) 43);
        setByteField(term271427, term271427.getClass(), "second", (byte) 25);
        setIntField(term271427, term271427.getClass(), "nano", 472658100);
        setField(term271422, term271422.getClass(), "time", term271427);
        setField(term271406, term271406.getClass(), "registerTime", term271422);
        setIntField(term271433, term271433.getClass(), "year", 2026);
        setShortField(term271433, term271433.getClass(), "month", (short) 8);
        setShortField(term271433, term271433.getClass(), "day", (short) 30);
        setField(term271432, term271432.getClass(), "date", term271433);
        setByteField(term271437, term271437.getClass(), "hour", (byte) 23);
        setByteField(term271437, term271437.getClass(), "minute", (byte) 9);
        setByteField(term271437, term271437.getClass(), "second", (byte) 53);
        setIntField(term271437, term271437.getClass(), "nano", 748186544);
        setField(term271432, term271432.getClass(), "time", term271437);
        setField(term271406, term271406.getClass(), "accessTime", term271432);
        setField(term271404, term271404.getClass(), "card", term271406);
        setField(term271404, term271404.getClass(), "userName", "iQgpBjoGXJ");
        setIntField(term271404, term271404.getClass(), "isNetMember", 1670532643);
        setIntField(term271404, term271404.getClass(), "iconId", 1132888529);
        setIntField(term271404, term271404.getClass(), "plateId", -749019689);
        setIntField(term271404, term271404.getClass(), "titleId", 10308038);
        setIntField(term271404, term271404.getClass(), "partnerId", 1806892057);
        setIntField(term271404, term271404.getClass(), "frameId", 753991973);
        setIntField(term271404, term271404.getClass(), "selectMapId", -1799585006);
        setIntField(term271404, term271404.getClass(), "totalAwake", -570035943);
        setIntField(term271404, term271404.getClass(), "gradeRating", 1887980610);
        setIntField(term271404, term271404.getClass(), "musicRating", -856907689);
        setIntField(term271404, term271404.getClass(), "playerRating", -1114722762);
        setIntField(term271404, term271404.getClass(), "highestRating", -1313611523);
        setIntField(term271404, term271404.getClass(), "gradeRank", -602904585);
        setIntField(term271404, term271404.getClass(), "classRank", 1876360979);
        setIntField(term271404, term271404.getClass(), "courseRank", -34256286);
        setField(term271404, term271404.getClass(), "charaSlot", term271469);
        setField(term271404, term271404.getClass(), "charaLockSlot", term271487);
        setLongField(term271404, term271404.getClass(), "contentBit", -3671015242217876413L);
        setIntField(term271404, term271404.getClass(), "playCount", -423891359);
        setField(term271404, term271404.getClass(), "eventWatchedDate", "mWztTjhUcj");
        setField(term271404, term271404.getClass(), "lastGameId", "nBCsrSCNym");
        setField(term271404, term271404.getClass(), "lastRomVersion", "yWwxzvskUK");
        setField(term271404, term271404.getClass(), "lastDataVersion", "DpghyDxPRQ");
        setField(term271404, term271404.getClass(), "lastLoginDate", "dejAqujyZr");
        setField(term271404, term271404.getClass(), "lastPlayDate", "YOOpOJUVhi");
        setIntField(term271404, term271404.getClass(), "lastPlayCredit", 763976967);
        setIntField(term271404, term271404.getClass(), "lastPlayMode", 1595562615);
        setIntField(term271404, term271404.getClass(), "lastPlaceId", 1496157000);
        setField(term271404, term271404.getClass(), "lastPlaceName", "BzYCBybylB");
        setIntField(term271404, term271404.getClass(), "lastAllNetId", 1444788766);
        setIntField(term271404, term271404.getClass(), "lastRegionId", -2011306040);
        setField(term271404, term271404.getClass(), "lastRegionName", "KGmEuVckVx");
        setField(term271404, term271404.getClass(), "lastClientId", "JIqJWTPJSn");
        setField(term271404, term271404.getClass(), "lastCountryCode", "gnxtJXVkUK");
        setIntField(term271404, term271404.getClass(), "lastSelectEMoney", -2135060594);
        setIntField(term271404, term271404.getClass(), "lastSelectTicket", 1104254825);
        setIntField(term271404, term271404.getClass(), "lastSelectCourse", 443408660);
        setIntField(term271404, term271404.getClass(), "lastCountCourse", 1389120111);
        setField(term271404, term271404.getClass(), "firstGameId", "lposbQqAUU");
        setField(term271404, term271404.getClass(), "firstRomVersion", "CZZYeaxqjs");
        setField(term271404, term271404.getClass(), "firstDataVersion", "KaNkKUHQsw");
        setField(term271404, term271404.getClass(), "firstPlayDate", "LCbzYYPHVk");
        setField(term271404, term271404.getClass(), "compatibleCmVersion", "KbJoSNqLbc");
        setField(term271404, term271404.getClass(), "dailyBonusDate", "XizyspPIEi");
        setField(term271404, term271404.getClass(), "dailyCourseBonusDate", "JKuMejdhzA");
        setField(term271404, term271404.getClass(), "lastPairLoginDate", "suLlbdYAIy");
        setField(term271404, term271404.getClass(), "lastTrialPlayDate", "wDDbneJdEB");
        setIntField(term271404, term271404.getClass(), "playVsCount", 731070998);
        setIntField(term271404, term271404.getClass(), "playSyncCount", 57680258);
        setIntField(term271404, term271404.getClass(), "winCount", -936342894);
        setIntField(term271404, term271404.getClass(), "helpCount", -1894595167);
        setIntField(term271404, term271404.getClass(), "comboCount", -2089931895);
        setLongField(term271404, term271404.getClass(), "totalDeluxscore", -7403875112607892632L);
        setLongField(term271404, term271404.getClass(), "totalBasicDeluxscore", 6004229380816697659L);
        setLongField(term271404, term271404.getClass(), "totalAdvancedDeluxscore", 697717243328118977L);
        setLongField(term271404, term271404.getClass(), "totalExpertDeluxscore", -620800790472302388L);
        setLongField(term271404, term271404.getClass(), "totalMasterDeluxscore", -5743137778796207192L);
        setLongField(term271404, term271404.getClass(), "totalReMasterDeluxscore", 8311249784166045461L);
        setIntField(term271404, term271404.getClass(), "totalSync", 1400874310);
        setIntField(term271404, term271404.getClass(), "totalBasicSync", -1142687493);
        setIntField(term271404, term271404.getClass(), "totalAdvancedSync", 546473545);
        setIntField(term271404, term271404.getClass(), "totalExpertSync", 1922881115);
        setIntField(term271404, term271404.getClass(), "totalMasterSync", 1341930316);
        setIntField(term271404, term271404.getClass(), "totalReMasterSync", 1284571301);
        setLongField(term271404, term271404.getClass(), "totalAchievement", -3608650075786159411L);
        setLongField(term271404, term271404.getClass(), "totalBasicAchievement", -2336970893136419858L);
        setLongField(term271404, term271404.getClass(), "totalAdvancedAchievement", 3903864941757730291L);
        setLongField(term271404, term271404.getClass(), "totalExpertAchievement", 4235374749079135788L);
        setLongField(term271404, term271404.getClass(), "totalMasterAchievement", 3428151801295957201L);
        setLongField(term271404, term271404.getClass(), "totalReMasterAchievement", 1745833591384612643L);
        setLongField(term271404, term271404.getClass(), "playerOldRating", -6956663159478267847L);
        setLongField(term271404, term271404.getClass(), "playerNewRating", -9087747609396940180L);
        setIntField(term271404, term271404.getClass(), "banState", 1905466539);
        setLongField(term271404, term271404.getClass(), "dateTime", 1761494664699464060L);
        term271757 = new Long(5908588410184932839L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term271757;
        callMethod(klass, "setTotalBasicDeluxscore", argTypes, term271404, args);
    }

};


