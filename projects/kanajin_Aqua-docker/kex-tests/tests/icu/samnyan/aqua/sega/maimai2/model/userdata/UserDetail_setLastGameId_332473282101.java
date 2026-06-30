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

public class UserDetail_setLastGameId_332473282101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252283;

    public UserDetail_setLastGameId_332473282101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term252287 = new Long(1634166935474035772L);
        Integer term252350 = new Integer(1525193088);
        Integer term252352 = new Integer(1734906845);
        Integer term252354 = new Integer(678776902);
        ArrayList term252348 = new ArrayList();
        ((ArrayList) term252348).add(term252350);
        ((ArrayList) term252348).add(term252352);
        ((ArrayList) term252348).add(term252354);
        Integer term252360 = new Integer(-1148076813);
        Integer term252362 = new Integer(1450586432);
        Integer term252364 = new Integer(1726648633);
        Integer term252366 = new Integer(859999867);
        Integer term252368 = new Integer(469845570);
        Integer term252370 = new Integer(1192737321);
        Integer term252372 = new Integer(827191651);
        Integer term252374 = new Integer(-432140549);
        ArrayList term252358 = new ArrayList();
        ((ArrayList) term252358).add(term252360);
        ((ArrayList) term252358).add(term252362);
        ((ArrayList) term252358).add(term252364);
        ((ArrayList) term252358).add(term252366);
        ((ArrayList) term252358).add(term252368);
        ((ArrayList) term252358).add(term252370);
        ((ArrayList) term252358).add(term252372);
        ((ArrayList) term252358).add(term252374);
        term252283 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term252285 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term252301 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term252302 = newInstance(Class.forName("java.time.LocalDate"));
        Object term252306 = newInstance(Class.forName("java.time.LocalTime"));
        Object term252311 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term252312 = newInstance(Class.forName("java.time.LocalDate"));
        Object term252316 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term252283, term252283.getClass(), "id", -7416386404507621943L);
        setLongField(term252285, term252285.getClass(), "id", 6841962136577220802L);
        setField(term252285, term252285.getClass(), "extId", term252287);
        setField(term252285, term252285.getClass(), "luid", "OvMjignBZh");
        setIntField(term252302, term252302.getClass(), "year", 2019);
        setShortField(term252302, term252302.getClass(), "month", (short) 5);
        setShortField(term252302, term252302.getClass(), "day", (short) 2);
        setField(term252301, term252301.getClass(), "date", term252302);
        setByteField(term252306, term252306.getClass(), "hour", (byte) 7);
        setByteField(term252306, term252306.getClass(), "minute", (byte) 38);
        setByteField(term252306, term252306.getClass(), "second", (byte) 2);
        setIntField(term252306, term252306.getClass(), "nano", 148685302);
        setField(term252301, term252301.getClass(), "time", term252306);
        setField(term252285, term252285.getClass(), "registerTime", term252301);
        setIntField(term252312, term252312.getClass(), "year", 2019);
        setShortField(term252312, term252312.getClass(), "month", (short) 4);
        setShortField(term252312, term252312.getClass(), "day", (short) 21);
        setField(term252311, term252311.getClass(), "date", term252312);
        setByteField(term252316, term252316.getClass(), "hour", (byte) 5);
        setByteField(term252316, term252316.getClass(), "minute", (byte) 35);
        setByteField(term252316, term252316.getClass(), "second", (byte) 51);
        setIntField(term252316, term252316.getClass(), "nano", 345346848);
        setField(term252311, term252311.getClass(), "time", term252316);
        setField(term252285, term252285.getClass(), "accessTime", term252311);
        setField(term252283, term252283.getClass(), "card", term252285);
        setField(term252283, term252283.getClass(), "userName", "XKohfOxQpG");
        setIntField(term252283, term252283.getClass(), "isNetMember", -738160808);
        setIntField(term252283, term252283.getClass(), "iconId", 248369090);
        setIntField(term252283, term252283.getClass(), "plateId", -1445735932);
        setIntField(term252283, term252283.getClass(), "titleId", 521137445);
        setIntField(term252283, term252283.getClass(), "partnerId", -698809679);
        setIntField(term252283, term252283.getClass(), "frameId", -1066054710);
        setIntField(term252283, term252283.getClass(), "selectMapId", -1311716907);
        setIntField(term252283, term252283.getClass(), "totalAwake", -1776759655);
        setIntField(term252283, term252283.getClass(), "gradeRating", 315412021);
        setIntField(term252283, term252283.getClass(), "musicRating", 544921843);
        setIntField(term252283, term252283.getClass(), "playerRating", 1897901411);
        setIntField(term252283, term252283.getClass(), "highestRating", 569452386);
        setIntField(term252283, term252283.getClass(), "gradeRank", -480603898);
        setIntField(term252283, term252283.getClass(), "classRank", 307838643);
        setIntField(term252283, term252283.getClass(), "courseRank", -1377791183);
        setField(term252283, term252283.getClass(), "charaSlot", term252348);
        setField(term252283, term252283.getClass(), "charaLockSlot", term252358);
        setLongField(term252283, term252283.getClass(), "contentBit", -6347575027212604857L);
        setIntField(term252283, term252283.getClass(), "playCount", -629472657);
        setField(term252283, term252283.getClass(), "eventWatchedDate", "vaEqtdWGqW");
        setField(term252283, term252283.getClass(), "lastGameId", "cSMVydOyqb");
        setField(term252283, term252283.getClass(), "lastRomVersion", "MkvQrFcRTd");
        setField(term252283, term252283.getClass(), "lastDataVersion", "QCnYapvzyp");
        setField(term252283, term252283.getClass(), "lastLoginDate", "rvxLjNrfDV");
        setField(term252283, term252283.getClass(), "lastPlayDate", "TZWChNggbR");
        setIntField(term252283, term252283.getClass(), "lastPlayCredit", -1226697699);
        setIntField(term252283, term252283.getClass(), "lastPlayMode", 64839447);
        setIntField(term252283, term252283.getClass(), "lastPlaceId", 1212689906);
        setField(term252283, term252283.getClass(), "lastPlaceName", "BdVKUioRZB");
        setIntField(term252283, term252283.getClass(), "lastAllNetId", 1216809365);
        setIntField(term252283, term252283.getClass(), "lastRegionId", 1688807312);
        setField(term252283, term252283.getClass(), "lastRegionName", "KmcVYqMyAn");
        setField(term252283, term252283.getClass(), "lastClientId", "nnmhGenvZB");
        setField(term252283, term252283.getClass(), "lastCountryCode", "WAqAYqgwuP");
        setIntField(term252283, term252283.getClass(), "lastSelectEMoney", -835484494);
        setIntField(term252283, term252283.getClass(), "lastSelectTicket", 1984116081);
        setIntField(term252283, term252283.getClass(), "lastSelectCourse", 81072289);
        setIntField(term252283, term252283.getClass(), "lastCountCourse", -1443196905);
        setField(term252283, term252283.getClass(), "firstGameId", "kwMgnfULWA");
        setField(term252283, term252283.getClass(), "firstRomVersion", "JNvqAwFwOT");
        setField(term252283, term252283.getClass(), "firstDataVersion", "UiwUKKcPGt");
        setField(term252283, term252283.getClass(), "firstPlayDate", "gJQaBkFONi");
        setField(term252283, term252283.getClass(), "compatibleCmVersion", "hvCurjbKKA");
        setField(term252283, term252283.getClass(), "dailyBonusDate", "KPDBuTWYxh");
        setField(term252283, term252283.getClass(), "dailyCourseBonusDate", "hHasDCgpXm");
        setField(term252283, term252283.getClass(), "lastPairLoginDate", "YIGgyxbBJX");
        setField(term252283, term252283.getClass(), "lastTrialPlayDate", "yXWvbiyfBN");
        setIntField(term252283, term252283.getClass(), "playVsCount", 1772559314);
        setIntField(term252283, term252283.getClass(), "playSyncCount", 1617754544);
        setIntField(term252283, term252283.getClass(), "winCount", -227339856);
        setIntField(term252283, term252283.getClass(), "helpCount", -1433941812);
        setIntField(term252283, term252283.getClass(), "comboCount", 67652341);
        setLongField(term252283, term252283.getClass(), "totalDeluxscore", -2325020265033292088L);
        setLongField(term252283, term252283.getClass(), "totalBasicDeluxscore", -6630743207492953325L);
        setLongField(term252283, term252283.getClass(), "totalAdvancedDeluxscore", -6277213159543702841L);
        setLongField(term252283, term252283.getClass(), "totalExpertDeluxscore", 4893527838103621524L);
        setLongField(term252283, term252283.getClass(), "totalMasterDeluxscore", -8867694454559442882L);
        setLongField(term252283, term252283.getClass(), "totalReMasterDeluxscore", -735360352712319882L);
        setIntField(term252283, term252283.getClass(), "totalSync", 356090964);
        setIntField(term252283, term252283.getClass(), "totalBasicSync", 568147133);
        setIntField(term252283, term252283.getClass(), "totalAdvancedSync", 662609201);
        setIntField(term252283, term252283.getClass(), "totalExpertSync", 1357782651);
        setIntField(term252283, term252283.getClass(), "totalMasterSync", -1974080449);
        setIntField(term252283, term252283.getClass(), "totalReMasterSync", 1163324538);
        setLongField(term252283, term252283.getClass(), "totalAchievement", 5806821943863171841L);
        setLongField(term252283, term252283.getClass(), "totalBasicAchievement", 257486956344867281L);
        setLongField(term252283, term252283.getClass(), "totalAdvancedAchievement", 7155033259525442548L);
        setLongField(term252283, term252283.getClass(), "totalExpertAchievement", 6710360885169776521L);
        setLongField(term252283, term252283.getClass(), "totalMasterAchievement", -6751519781665769962L);
        setLongField(term252283, term252283.getClass(), "totalReMasterAchievement", 2098980172229358583L);
        setLongField(term252283, term252283.getClass(), "playerOldRating", 4396288976419366849L);
        setLongField(term252283, term252283.getClass(), "playerNewRating", 3239334513384409288L);
        setIntField(term252283, term252283.getClass(), "banState", -2133860489);
        setLongField(term252283, term252283.getClass(), "dateTime", 1244433545363375151L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pzjAIwjtmM";
        callMethod(klass, "setLastGameId", argTypes, term252283, args);
    }

};


