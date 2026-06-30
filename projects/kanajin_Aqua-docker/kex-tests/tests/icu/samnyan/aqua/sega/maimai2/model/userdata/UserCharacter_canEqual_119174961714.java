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

public class UserCharacter_canEqual_119174961714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193137;
     Object term193504;

    public UserCharacter_canEqual_119174961714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term193143 = new Long(4525924047960478347L);
        Integer term193206 = new Integer(-1754638525);
        Integer term193208 = new Integer(-1058018356);
        Integer term193210 = new Integer(-618930598);
        Integer term193212 = new Integer(-1912835189);
        Integer term193214 = new Integer(1508089655);
        Integer term193216 = new Integer(1344738281);
        Integer term193218 = new Integer(2137586016);
        Integer term193220 = new Integer(718944255);
        ArrayList term193204 = new ArrayList();
        ((ArrayList) term193204).add(term193206);
        ((ArrayList) term193204).add(term193208);
        ((ArrayList) term193204).add(term193210);
        ((ArrayList) term193204).add(term193212);
        ((ArrayList) term193204).add(term193214);
        ((ArrayList) term193204).add(term193216);
        ((ArrayList) term193204).add(term193218);
        ((ArrayList) term193204).add(term193220);
        Integer term193226 = new Integer(-255278880);
        Integer term193228 = new Integer(978936508);
        Integer term193230 = new Integer(-782282859);
        ArrayList term193224 = new ArrayList();
        ((ArrayList) term193224).add(term193226);
        ((ArrayList) term193224).add(term193228);
        ((ArrayList) term193224).add(term193230);
        term193137 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter"));
        Object term193139 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term193141 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term193157 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term193158 = newInstance(Class.forName("java.time.LocalDate"));
        Object term193162 = newInstance(Class.forName("java.time.LocalTime"));
        Object term193167 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term193168 = newInstance(Class.forName("java.time.LocalDate"));
        Object term193172 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term193137, term193137.getClass(), "id", 389739423857694314L);
        setLongField(term193139, term193139.getClass(), "id", 1380164438427854364L);
        setLongField(term193141, term193141.getClass(), "id", -6362522706978971268L);
        setField(term193141, term193141.getClass(), "extId", term193143);
        setField(term193141, term193141.getClass(), "luid", "LFDnNsBZdo");
        setIntField(term193158, term193158.getClass(), "year", 2029);
        setShortField(term193158, term193158.getClass(), "month", (short) 11);
        setShortField(term193158, term193158.getClass(), "day", (short) 25);
        setField(term193157, term193157.getClass(), "date", term193158);
        setByteField(term193162, term193162.getClass(), "hour", (byte) 14);
        setByteField(term193162, term193162.getClass(), "minute", (byte) 49);
        setByteField(term193162, term193162.getClass(), "second", (byte) 17);
        setIntField(term193162, term193162.getClass(), "nano", 699722589);
        setField(term193157, term193157.getClass(), "time", term193162);
        setField(term193141, term193141.getClass(), "registerTime", term193157);
        setIntField(term193168, term193168.getClass(), "year", 2026);
        setShortField(term193168, term193168.getClass(), "month", (short) 10);
        setShortField(term193168, term193168.getClass(), "day", (short) 4);
        setField(term193167, term193167.getClass(), "date", term193168);
        setByteField(term193172, term193172.getClass(), "hour", (byte) 6);
        setByteField(term193172, term193172.getClass(), "minute", (byte) 41);
        setByteField(term193172, term193172.getClass(), "second", (byte) 50);
        setIntField(term193172, term193172.getClass(), "nano", 414376807);
        setField(term193167, term193167.getClass(), "time", term193172);
        setField(term193141, term193141.getClass(), "accessTime", term193167);
        setField(term193139, term193139.getClass(), "card", term193141);
        setField(term193139, term193139.getClass(), "userName", "prSWHcndlk");
        setIntField(term193139, term193139.getClass(), "isNetMember", -1474933209);
        setIntField(term193139, term193139.getClass(), "iconId", 257817118);
        setIntField(term193139, term193139.getClass(), "plateId", 2037455054);
        setIntField(term193139, term193139.getClass(), "titleId", -2037705033);
        setIntField(term193139, term193139.getClass(), "partnerId", 673019945);
        setIntField(term193139, term193139.getClass(), "frameId", -1161638748);
        setIntField(term193139, term193139.getClass(), "selectMapId", 2056200144);
        setIntField(term193139, term193139.getClass(), "totalAwake", -1167348988);
        setIntField(term193139, term193139.getClass(), "gradeRating", 426804739);
        setIntField(term193139, term193139.getClass(), "musicRating", -2012164979);
        setIntField(term193139, term193139.getClass(), "playerRating", -786030720);
        setIntField(term193139, term193139.getClass(), "highestRating", -1294339480);
        setIntField(term193139, term193139.getClass(), "gradeRank", -858509937);
        setIntField(term193139, term193139.getClass(), "classRank", -1249437874);
        setIntField(term193139, term193139.getClass(), "courseRank", 721993587);
        setField(term193139, term193139.getClass(), "charaSlot", term193204);
        setField(term193139, term193139.getClass(), "charaLockSlot", term193224);
        setLongField(term193139, term193139.getClass(), "contentBit", -2522674076029091825L);
        setIntField(term193139, term193139.getClass(), "playCount", -2115303175);
        setField(term193139, term193139.getClass(), "eventWatchedDate", "jikicdaZoQ");
        setField(term193139, term193139.getClass(), "lastGameId", "UjlZvHchZX");
        setField(term193139, term193139.getClass(), "lastRomVersion", "ZoGOphtbMj");
        setField(term193139, term193139.getClass(), "lastDataVersion", "FxtuMMZTnJ");
        setField(term193139, term193139.getClass(), "lastLoginDate", "xqcrleZqqU");
        setField(term193139, term193139.getClass(), "lastPlayDate", "GZfyTlJvPo");
        setIntField(term193139, term193139.getClass(), "lastPlayCredit", 958435482);
        setIntField(term193139, term193139.getClass(), "lastPlayMode", -1013016284);
        setIntField(term193139, term193139.getClass(), "lastPlaceId", 2102415180);
        setField(term193139, term193139.getClass(), "lastPlaceName", "ErykqtSHSR");
        setIntField(term193139, term193139.getClass(), "lastAllNetId", 448122027);
        setIntField(term193139, term193139.getClass(), "lastRegionId", -1936645212);
        setField(term193139, term193139.getClass(), "lastRegionName", "cYBIjKvbtm");
        setField(term193139, term193139.getClass(), "lastClientId", "BEvLYxGdKf");
        setField(term193139, term193139.getClass(), "lastCountryCode", "ANkSSVQejl");
        setIntField(term193139, term193139.getClass(), "lastSelectEMoney", -770480497);
        setIntField(term193139, term193139.getClass(), "lastSelectTicket", 379983129);
        setIntField(term193139, term193139.getClass(), "lastSelectCourse", -215542299);
        setIntField(term193139, term193139.getClass(), "lastCountCourse", 1063632099);
        setField(term193139, term193139.getClass(), "firstGameId", "UiDKxqVkSN");
        setField(term193139, term193139.getClass(), "firstRomVersion", "vxFZtlwdRB");
        setField(term193139, term193139.getClass(), "firstDataVersion", "gwRYIIqrRr");
        setField(term193139, term193139.getClass(), "firstPlayDate", "aBvLuPbJPh");
        setField(term193139, term193139.getClass(), "compatibleCmVersion", "TvrcwGmIbL");
        setField(term193139, term193139.getClass(), "dailyBonusDate", "CLEwlxHcqT");
        setField(term193139, term193139.getClass(), "dailyCourseBonusDate", "ITYLKPXKxL");
        setField(term193139, term193139.getClass(), "lastPairLoginDate", "AZimImfppv");
        setField(term193139, term193139.getClass(), "lastTrialPlayDate", "oTKpImhTKa");
        setIntField(term193139, term193139.getClass(), "playVsCount", -1851410176);
        setIntField(term193139, term193139.getClass(), "playSyncCount", -9921028);
        setIntField(term193139, term193139.getClass(), "winCount", 159933777);
        setIntField(term193139, term193139.getClass(), "helpCount", -2049503346);
        setIntField(term193139, term193139.getClass(), "comboCount", 178356944);
        setLongField(term193139, term193139.getClass(), "totalDeluxscore", 6514661041339380792L);
        setLongField(term193139, term193139.getClass(), "totalBasicDeluxscore", 1630517848186010052L);
        setLongField(term193139, term193139.getClass(), "totalAdvancedDeluxscore", -1577738122228170388L);
        setLongField(term193139, term193139.getClass(), "totalExpertDeluxscore", -2947529743135344514L);
        setLongField(term193139, term193139.getClass(), "totalMasterDeluxscore", -2237065568332618745L);
        setLongField(term193139, term193139.getClass(), "totalReMasterDeluxscore", -5825087959656031943L);
        setIntField(term193139, term193139.getClass(), "totalSync", 1296233741);
        setIntField(term193139, term193139.getClass(), "totalBasicSync", -1453122829);
        setIntField(term193139, term193139.getClass(), "totalAdvancedSync", 1723930455);
        setIntField(term193139, term193139.getClass(), "totalExpertSync", -172568972);
        setIntField(term193139, term193139.getClass(), "totalMasterSync", 952493182);
        setIntField(term193139, term193139.getClass(), "totalReMasterSync", -1820882307);
        setLongField(term193139, term193139.getClass(), "totalAchievement", 8941286771740170460L);
        setLongField(term193139, term193139.getClass(), "totalBasicAchievement", 7962515123506514446L);
        setLongField(term193139, term193139.getClass(), "totalAdvancedAchievement", -930420705295888219L);
        setLongField(term193139, term193139.getClass(), "totalExpertAchievement", 7690162881822430684L);
        setLongField(term193139, term193139.getClass(), "totalMasterAchievement", -4703984451566281143L);
        setLongField(term193139, term193139.getClass(), "totalReMasterAchievement", 7061398109330753060L);
        setLongField(term193139, term193139.getClass(), "playerOldRating", -6015122649143491231L);
        setLongField(term193139, term193139.getClass(), "playerNewRating", 1515578634841292597L);
        setIntField(term193139, term193139.getClass(), "banState", 1368012856);
        setLongField(term193139, term193139.getClass(), "dateTime", -8712808583689900808L);
        setField(term193137, term193137.getClass(), "user", term193139);
        setIntField(term193137, term193137.getClass(), "characterId", 1989958895);
        setIntField(term193137, term193137.getClass(), "level", 1509008640);
        setIntField(term193137, term193137.getClass(), "awakening", -534740768);
        setIntField(term193137, term193137.getClass(), "useCount", 1760958066);
        term193504 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term193504;
        callMethod(klass, "canEqual", argTypes, term193137, args);
    }

};


