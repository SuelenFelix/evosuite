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

public class UserUdemae_getNpcLoseNum_210675869218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104897;

    public UserUdemae_getNpcLoseNum_210675869218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term104903 = new Long(-8471550651709805183L);
        Integer term104966 = new Integer(-1673157821);
        Integer term104968 = new Integer(1217804703);
        Integer term104970 = new Integer(-1981494102);
        ArrayList term104964 = new ArrayList();
        ((ArrayList) term104964).add(term104966);
        ((ArrayList) term104964).add(term104968);
        ((ArrayList) term104964).add(term104970);
        Integer term104976 = new Integer(-2064148945);
        Integer term104978 = new Integer(494400151);
        Integer term104980 = new Integer(1588058685);
        Integer term104982 = new Integer(1677707412);
        Integer term104984 = new Integer(-297367861);
        Integer term104986 = new Integer(-1133541490);
        Integer term104988 = new Integer(942412391);
        Integer term104990 = new Integer(751596480);
        Integer term104992 = new Integer(1971485144);
        ArrayList term104974 = new ArrayList();
        ((ArrayList) term104974).add(term104976);
        ((ArrayList) term104974).add(term104978);
        ((ArrayList) term104974).add(term104980);
        ((ArrayList) term104974).add(term104982);
        ((ArrayList) term104974).add(term104984);
        ((ArrayList) term104974).add(term104986);
        ((ArrayList) term104974).add(term104988);
        ((ArrayList) term104974).add(term104990);
        ((ArrayList) term104974).add(term104992);
        term104897 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term104899 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term104901 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term104917 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term104918 = newInstance(Class.forName("java.time.LocalDate"));
        Object term104922 = newInstance(Class.forName("java.time.LocalTime"));
        Object term104927 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term104928 = newInstance(Class.forName("java.time.LocalDate"));
        Object term104932 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term104897, term104897.getClass(), "id", 3092320965130533188L);
        setLongField(term104899, term104899.getClass(), "id", -1170031023592641016L);
        setLongField(term104901, term104901.getClass(), "id", -4256671127039800048L);
        setField(term104901, term104901.getClass(), "extId", term104903);
        setField(term104901, term104901.getClass(), "luid", "gFKwlpZWQn");
        setIntField(term104918, term104918.getClass(), "year", 2023);
        setShortField(term104918, term104918.getClass(), "month", (short) 4);
        setShortField(term104918, term104918.getClass(), "day", (short) 10);
        setField(term104917, term104917.getClass(), "date", term104918);
        setByteField(term104922, term104922.getClass(), "hour", (byte) 19);
        setByteField(term104922, term104922.getClass(), "minute", (byte) 34);
        setByteField(term104922, term104922.getClass(), "second", (byte) 41);
        setIntField(term104922, term104922.getClass(), "nano", 911888376);
        setField(term104917, term104917.getClass(), "time", term104922);
        setField(term104901, term104901.getClass(), "registerTime", term104917);
        setIntField(term104928, term104928.getClass(), "year", 2014);
        setShortField(term104928, term104928.getClass(), "month", (short) 2);
        setShortField(term104928, term104928.getClass(), "day", (short) 5);
        setField(term104927, term104927.getClass(), "date", term104928);
        setByteField(term104932, term104932.getClass(), "hour", (byte) 14);
        setByteField(term104932, term104932.getClass(), "minute", (byte) 2);
        setByteField(term104932, term104932.getClass(), "second", (byte) 4);
        setIntField(term104932, term104932.getClass(), "nano", 458277660);
        setField(term104927, term104927.getClass(), "time", term104932);
        setField(term104901, term104901.getClass(), "accessTime", term104927);
        setField(term104899, term104899.getClass(), "card", term104901);
        setField(term104899, term104899.getClass(), "userName", "zkXBYRvjpo");
        setIntField(term104899, term104899.getClass(), "isNetMember", -1172188590);
        setIntField(term104899, term104899.getClass(), "iconId", 1811271159);
        setIntField(term104899, term104899.getClass(), "plateId", 534169620);
        setIntField(term104899, term104899.getClass(), "titleId", 1011698169);
        setIntField(term104899, term104899.getClass(), "partnerId", -1031068823);
        setIntField(term104899, term104899.getClass(), "frameId", -1229282495);
        setIntField(term104899, term104899.getClass(), "selectMapId", 58488326);
        setIntField(term104899, term104899.getClass(), "totalAwake", -1178011877);
        setIntField(term104899, term104899.getClass(), "gradeRating", 1744976454);
        setIntField(term104899, term104899.getClass(), "musicRating", -501735949);
        setIntField(term104899, term104899.getClass(), "playerRating", 1633315544);
        setIntField(term104899, term104899.getClass(), "highestRating", 1699846026);
        setIntField(term104899, term104899.getClass(), "gradeRank", -1144234812);
        setIntField(term104899, term104899.getClass(), "classRank", -2144123201);
        setIntField(term104899, term104899.getClass(), "courseRank", 1436840858);
        setField(term104899, term104899.getClass(), "charaSlot", term104964);
        setField(term104899, term104899.getClass(), "charaLockSlot", term104974);
        setLongField(term104899, term104899.getClass(), "contentBit", 4963001669659818161L);
        setIntField(term104899, term104899.getClass(), "playCount", -2146939628);
        setField(term104899, term104899.getClass(), "eventWatchedDate", "nmebweybpn");
        setField(term104899, term104899.getClass(), "lastGameId", "rRiUyNVzoJ");
        setField(term104899, term104899.getClass(), "lastRomVersion", "IpeZajjVYM");
        setField(term104899, term104899.getClass(), "lastDataVersion", "ZZMugYyPLU");
        setField(term104899, term104899.getClass(), "lastLoginDate", "UknzoUqzIv");
        setField(term104899, term104899.getClass(), "lastPlayDate", "xctmTnBQin");
        setIntField(term104899, term104899.getClass(), "lastPlayCredit", -1735999292);
        setIntField(term104899, term104899.getClass(), "lastPlayMode", 1978300005);
        setIntField(term104899, term104899.getClass(), "lastPlaceId", -495461794);
        setField(term104899, term104899.getClass(), "lastPlaceName", "MsvgumOnks");
        setIntField(term104899, term104899.getClass(), "lastAllNetId", 1179148135);
        setIntField(term104899, term104899.getClass(), "lastRegionId", 1856832248);
        setField(term104899, term104899.getClass(), "lastRegionName", "YMoZutGBzR");
        setField(term104899, term104899.getClass(), "lastClientId", "BsupMZxOfn");
        setField(term104899, term104899.getClass(), "lastCountryCode", "KWWTEtQZKa");
        setIntField(term104899, term104899.getClass(), "lastSelectEMoney", 1112040940);
        setIntField(term104899, term104899.getClass(), "lastSelectTicket", -1289327826);
        setIntField(term104899, term104899.getClass(), "lastSelectCourse", -1510240264);
        setIntField(term104899, term104899.getClass(), "lastCountCourse", -1206929666);
        setField(term104899, term104899.getClass(), "firstGameId", "QRoYxbbXBu");
        setField(term104899, term104899.getClass(), "firstRomVersion", "gGVmBWDOsX");
        setField(term104899, term104899.getClass(), "firstDataVersion", "NktLacflHU");
        setField(term104899, term104899.getClass(), "firstPlayDate", "evgfwrURFw");
        setField(term104899, term104899.getClass(), "compatibleCmVersion", "fFCtsKLEIk");
        setField(term104899, term104899.getClass(), "dailyBonusDate", "VJiRAWIpQj");
        setField(term104899, term104899.getClass(), "dailyCourseBonusDate", "LurvjUHtJk");
        setField(term104899, term104899.getClass(), "lastPairLoginDate", "OBilYfBQsT");
        setField(term104899, term104899.getClass(), "lastTrialPlayDate", "iNsUMLKPwV");
        setIntField(term104899, term104899.getClass(), "playVsCount", -673087697);
        setIntField(term104899, term104899.getClass(), "playSyncCount", 821580864);
        setIntField(term104899, term104899.getClass(), "winCount", 210061350);
        setIntField(term104899, term104899.getClass(), "helpCount", -1315216208);
        setIntField(term104899, term104899.getClass(), "comboCount", -543739494);
        setLongField(term104899, term104899.getClass(), "totalDeluxscore", 2968855634918029589L);
        setLongField(term104899, term104899.getClass(), "totalBasicDeluxscore", 4747433622332782753L);
        setLongField(term104899, term104899.getClass(), "totalAdvancedDeluxscore", -2410843304256238512L);
        setLongField(term104899, term104899.getClass(), "totalExpertDeluxscore", 529795251759909859L);
        setLongField(term104899, term104899.getClass(), "totalMasterDeluxscore", 5093227115352597520L);
        setLongField(term104899, term104899.getClass(), "totalReMasterDeluxscore", 1676643367165787423L);
        setIntField(term104899, term104899.getClass(), "totalSync", -1959832217);
        setIntField(term104899, term104899.getClass(), "totalBasicSync", 61867422);
        setIntField(term104899, term104899.getClass(), "totalAdvancedSync", 536970938);
        setIntField(term104899, term104899.getClass(), "totalExpertSync", 1370836789);
        setIntField(term104899, term104899.getClass(), "totalMasterSync", -2117537075);
        setIntField(term104899, term104899.getClass(), "totalReMasterSync", -707090176);
        setLongField(term104899, term104899.getClass(), "totalAchievement", -2189506306600248684L);
        setLongField(term104899, term104899.getClass(), "totalBasicAchievement", -1860737589067248426L);
        setLongField(term104899, term104899.getClass(), "totalAdvancedAchievement", -5623728246411068431L);
        setLongField(term104899, term104899.getClass(), "totalExpertAchievement", -1482512839344698645L);
        setLongField(term104899, term104899.getClass(), "totalMasterAchievement", 5220887092676977977L);
        setLongField(term104899, term104899.getClass(), "totalReMasterAchievement", -738697333147106204L);
        setLongField(term104899, term104899.getClass(), "playerOldRating", 4762222530088432089L);
        setLongField(term104899, term104899.getClass(), "playerNewRating", 1112619626486434161L);
        setIntField(term104899, term104899.getClass(), "banState", -1562747284);
        setLongField(term104899, term104899.getClass(), "dateTime", 518071851793374019L);
        setField(term104897, term104897.getClass(), "user", term104899);
        setIntField(term104897, term104897.getClass(), "rate", 1595520482);
        setIntField(term104897, term104897.getClass(), "maxRate", 1344577247);
        setIntField(term104897, term104897.getClass(), "classValue", 89754306);
        setIntField(term104897, term104897.getClass(), "maxClassValue", -1141919536);
        setIntField(term104897, term104897.getClass(), "totalWinNum", 1482082530);
        setIntField(term104897, term104897.getClass(), "totalLoseNum", -1920069753);
        setIntField(term104897, term104897.getClass(), "maxWinNum", -740722091);
        setIntField(term104897, term104897.getClass(), "maxLoseNum", -758267649);
        setIntField(term104897, term104897.getClass(), "winNum", 281378461);
        setIntField(term104897, term104897.getClass(), "loseNum", 1023095456);
        setIntField(term104897, term104897.getClass(), "npcTotalWinNum", -1831793787);
        setIntField(term104897, term104897.getClass(), "npcTotalLoseNum", 1354308528);
        setIntField(term104897, term104897.getClass(), "npcMaxWinNum", -1618737502);
        setIntField(term104897, term104897.getClass(), "npcMaxLoseNum", 1179678118);
        setIntField(term104897, term104897.getClass(), "npcWinNum", -806431195);
        setIntField(term104897, term104897.getClass(), "npcLoseNum", 2080180241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNpcLoseNum", argTypes, term104897, args);
    }

};


