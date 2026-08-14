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

public class UserDetail_setLastGameId_332473282100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252228;

    public UserDetail_setLastGameId_332473282100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term252232 = new Long(1634166935474035772L);
        Integer term252295 = new Integer(1525193088);
        Integer term252297 = new Integer(1734906845);
        Integer term252299 = new Integer(678776902);
        ArrayList term252293 = new ArrayList();
        ((ArrayList) term252293).add(term252295);
        ((ArrayList) term252293).add(term252297);
        ((ArrayList) term252293).add(term252299);
        Integer term252305 = new Integer(-1148076813);
        Integer term252307 = new Integer(1450586432);
        Integer term252309 = new Integer(1726648633);
        Integer term252311 = new Integer(859999867);
        Integer term252313 = new Integer(469845570);
        Integer term252315 = new Integer(1192737321);
        Integer term252317 = new Integer(827191651);
        Integer term252319 = new Integer(-432140549);
        ArrayList term252303 = new ArrayList();
        ((ArrayList) term252303).add(term252305);
        ((ArrayList) term252303).add(term252307);
        ((ArrayList) term252303).add(term252309);
        ((ArrayList) term252303).add(term252311);
        ((ArrayList) term252303).add(term252313);
        ((ArrayList) term252303).add(term252315);
        ((ArrayList) term252303).add(term252317);
        ((ArrayList) term252303).add(term252319);
        term252228 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term252230 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term252246 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term252247 = newInstance(Class.forName("java.time.LocalDate"));
        Object term252251 = newInstance(Class.forName("java.time.LocalTime"));
        Object term252256 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term252257 = newInstance(Class.forName("java.time.LocalDate"));
        Object term252261 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term252228, term252228.getClass(), "id", -7416386404507621943L);
        setLongField(term252230, term252230.getClass(), "id", 6841962136577220802L);
        setField(term252230, term252230.getClass(), "extId", term252232);
        setField(term252230, term252230.getClass(), "luid", "OvMjignBZh");
        setIntField(term252247, term252247.getClass(), "year", 2019);
        setShortField(term252247, term252247.getClass(), "month", (short) 5);
        setShortField(term252247, term252247.getClass(), "day", (short) 2);
        setField(term252246, term252246.getClass(), "date", term252247);
        setByteField(term252251, term252251.getClass(), "hour", (byte) 7);
        setByteField(term252251, term252251.getClass(), "minute", (byte) 38);
        setByteField(term252251, term252251.getClass(), "second", (byte) 2);
        setIntField(term252251, term252251.getClass(), "nano", 148685302);
        setField(term252246, term252246.getClass(), "time", term252251);
        setField(term252230, term252230.getClass(), "registerTime", term252246);
        setIntField(term252257, term252257.getClass(), "year", 2019);
        setShortField(term252257, term252257.getClass(), "month", (short) 4);
        setShortField(term252257, term252257.getClass(), "day", (short) 21);
        setField(term252256, term252256.getClass(), "date", term252257);
        setByteField(term252261, term252261.getClass(), "hour", (byte) 5);
        setByteField(term252261, term252261.getClass(), "minute", (byte) 35);
        setByteField(term252261, term252261.getClass(), "second", (byte) 51);
        setIntField(term252261, term252261.getClass(), "nano", 345346848);
        setField(term252256, term252256.getClass(), "time", term252261);
        setField(term252230, term252230.getClass(), "accessTime", term252256);
        setField(term252228, term252228.getClass(), "card", term252230);
        setField(term252228, term252228.getClass(), "userName", "XKohfOxQpG");
        setIntField(term252228, term252228.getClass(), "isNetMember", -738160808);
        setIntField(term252228, term252228.getClass(), "iconId", 248369090);
        setIntField(term252228, term252228.getClass(), "plateId", -1445735932);
        setIntField(term252228, term252228.getClass(), "titleId", 521137445);
        setIntField(term252228, term252228.getClass(), "partnerId", -698809679);
        setIntField(term252228, term252228.getClass(), "frameId", -1066054710);
        setIntField(term252228, term252228.getClass(), "selectMapId", -1311716907);
        setIntField(term252228, term252228.getClass(), "totalAwake", -1776759655);
        setIntField(term252228, term252228.getClass(), "gradeRating", 315412021);
        setIntField(term252228, term252228.getClass(), "musicRating", 544921843);
        setIntField(term252228, term252228.getClass(), "playerRating", 1897901411);
        setIntField(term252228, term252228.getClass(), "highestRating", 569452386);
        setIntField(term252228, term252228.getClass(), "gradeRank", -480603898);
        setIntField(term252228, term252228.getClass(), "classRank", 307838643);
        setIntField(term252228, term252228.getClass(), "courseRank", -1377791183);
        setField(term252228, term252228.getClass(), "charaSlot", term252293);
        setField(term252228, term252228.getClass(), "charaLockSlot", term252303);
        setLongField(term252228, term252228.getClass(), "contentBit", -6347575027212604857L);
        setIntField(term252228, term252228.getClass(), "playCount", -629472657);
        setField(term252228, term252228.getClass(), "eventWatchedDate", "vaEqtdWGqW");
        setField(term252228, term252228.getClass(), "lastGameId", "cSMVydOyqb");
        setField(term252228, term252228.getClass(), "lastRomVersion", "MkvQrFcRTd");
        setField(term252228, term252228.getClass(), "lastDataVersion", "QCnYapvzyp");
        setField(term252228, term252228.getClass(), "lastLoginDate", "rvxLjNrfDV");
        setField(term252228, term252228.getClass(), "lastPlayDate", "TZWChNggbR");
        setIntField(term252228, term252228.getClass(), "lastPlayCredit", -1226697699);
        setIntField(term252228, term252228.getClass(), "lastPlayMode", 64839447);
        setIntField(term252228, term252228.getClass(), "lastPlaceId", 1212689906);
        setField(term252228, term252228.getClass(), "lastPlaceName", "BdVKUioRZB");
        setIntField(term252228, term252228.getClass(), "lastAllNetId", 1216809365);
        setIntField(term252228, term252228.getClass(), "lastRegionId", 1688807312);
        setField(term252228, term252228.getClass(), "lastRegionName", "KmcVYqMyAn");
        setField(term252228, term252228.getClass(), "lastClientId", "nnmhGenvZB");
        setField(term252228, term252228.getClass(), "lastCountryCode", "WAqAYqgwuP");
        setIntField(term252228, term252228.getClass(), "lastSelectEMoney", -835484494);
        setIntField(term252228, term252228.getClass(), "lastSelectTicket", 1984116081);
        setIntField(term252228, term252228.getClass(), "lastSelectCourse", 81072289);
        setIntField(term252228, term252228.getClass(), "lastCountCourse", -1443196905);
        setField(term252228, term252228.getClass(), "firstGameId", "kwMgnfULWA");
        setField(term252228, term252228.getClass(), "firstRomVersion", "JNvqAwFwOT");
        setField(term252228, term252228.getClass(), "firstDataVersion", "UiwUKKcPGt");
        setField(term252228, term252228.getClass(), "firstPlayDate", "gJQaBkFONi");
        setField(term252228, term252228.getClass(), "compatibleCmVersion", "hvCurjbKKA");
        setField(term252228, term252228.getClass(), "dailyBonusDate", "KPDBuTWYxh");
        setField(term252228, term252228.getClass(), "dailyCourseBonusDate", "hHasDCgpXm");
        setField(term252228, term252228.getClass(), "lastPairLoginDate", "YIGgyxbBJX");
        setField(term252228, term252228.getClass(), "lastTrialPlayDate", "yXWvbiyfBN");
        setIntField(term252228, term252228.getClass(), "playVsCount", 1772559314);
        setIntField(term252228, term252228.getClass(), "playSyncCount", 1617754544);
        setIntField(term252228, term252228.getClass(), "winCount", -227339856);
        setIntField(term252228, term252228.getClass(), "helpCount", -1433941812);
        setIntField(term252228, term252228.getClass(), "comboCount", 67652341);
        setLongField(term252228, term252228.getClass(), "totalDeluxscore", -2325020265033292088L);
        setLongField(term252228, term252228.getClass(), "totalBasicDeluxscore", -6630743207492953325L);
        setLongField(term252228, term252228.getClass(), "totalAdvancedDeluxscore", -6277213159543702841L);
        setLongField(term252228, term252228.getClass(), "totalExpertDeluxscore", 4893527838103621524L);
        setLongField(term252228, term252228.getClass(), "totalMasterDeluxscore", -8867694454559442882L);
        setLongField(term252228, term252228.getClass(), "totalReMasterDeluxscore", -735360352712319882L);
        setIntField(term252228, term252228.getClass(), "totalSync", 356090964);
        setIntField(term252228, term252228.getClass(), "totalBasicSync", 568147133);
        setIntField(term252228, term252228.getClass(), "totalAdvancedSync", 662609201);
        setIntField(term252228, term252228.getClass(), "totalExpertSync", 1357782651);
        setIntField(term252228, term252228.getClass(), "totalMasterSync", -1974080449);
        setIntField(term252228, term252228.getClass(), "totalReMasterSync", 1163324538);
        setLongField(term252228, term252228.getClass(), "totalAchievement", 5806821943863171841L);
        setLongField(term252228, term252228.getClass(), "totalBasicAchievement", 257486956344867281L);
        setLongField(term252228, term252228.getClass(), "totalAdvancedAchievement", 7155033259525442548L);
        setLongField(term252228, term252228.getClass(), "totalExpertAchievement", 6710360885169776521L);
        setLongField(term252228, term252228.getClass(), "totalMasterAchievement", -6751519781665769962L);
        setLongField(term252228, term252228.getClass(), "totalReMasterAchievement", 2098980172229358583L);
        setLongField(term252228, term252228.getClass(), "playerOldRating", 4396288976419366849L);
        setLongField(term252228, term252228.getClass(), "playerNewRating", 3239334513384409288L);
        setIntField(term252228, term252228.getClass(), "banState", -2133860489);
        setLongField(term252228, term252228.getClass(), "dateTime", 1244433545363375151L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pzjAIwjtmM";
        callMethod(klass, "setLastGameId", argTypes, term252228, args);
    }

};


