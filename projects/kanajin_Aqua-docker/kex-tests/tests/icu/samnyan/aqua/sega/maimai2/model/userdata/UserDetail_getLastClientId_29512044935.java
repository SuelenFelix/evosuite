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

public class UserDetail_getLastClientId_29512044935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215379;

    public UserDetail_getLastClientId_29512044935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term215383 = new Long(8073378116544724166L);
        Integer term215446 = new Integer(-924154861);
        Integer term215448 = new Integer(-1878694006);
        Integer term215450 = new Integer(1950167487);
        Integer term215452 = new Integer(1031826708);
        Integer term215454 = new Integer(-735726273);
        ArrayList term215444 = new ArrayList();
        ((ArrayList) term215444).add(term215446);
        ((ArrayList) term215444).add(term215448);
        ((ArrayList) term215444).add(term215450);
        ((ArrayList) term215444).add(term215452);
        ((ArrayList) term215444).add(term215454);
        Integer term215460 = new Integer(1618278091);
        Integer term215462 = new Integer(-548967985);
        Integer term215464 = new Integer(-1923425156);
        Integer term215466 = new Integer(1237861885);
        ArrayList term215458 = new ArrayList();
        ((ArrayList) term215458).add(term215460);
        ((ArrayList) term215458).add(term215462);
        ((ArrayList) term215458).add(term215464);
        ((ArrayList) term215458).add(term215466);
        term215379 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term215381 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term215397 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term215398 = newInstance(Class.forName("java.time.LocalDate"));
        Object term215402 = newInstance(Class.forName("java.time.LocalTime"));
        Object term215407 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term215408 = newInstance(Class.forName("java.time.LocalDate"));
        Object term215412 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term215379, term215379.getClass(), "id", 4166553518909175990L);
        setLongField(term215381, term215381.getClass(), "id", 1654276301502617595L);
        setField(term215381, term215381.getClass(), "extId", term215383);
        setField(term215381, term215381.getClass(), "luid", "ezaECgtjZY");
        setIntField(term215398, term215398.getClass(), "year", 2029);
        setShortField(term215398, term215398.getClass(), "month", (short) 9);
        setShortField(term215398, term215398.getClass(), "day", (short) 28);
        setField(term215397, term215397.getClass(), "date", term215398);
        setByteField(term215402, term215402.getClass(), "hour", (byte) 23);
        setByteField(term215402, term215402.getClass(), "minute", (byte) 32);
        setByteField(term215402, term215402.getClass(), "second", (byte) 19);
        setIntField(term215402, term215402.getClass(), "nano", 974262271);
        setField(term215397, term215397.getClass(), "time", term215402);
        setField(term215381, term215381.getClass(), "registerTime", term215397);
        setIntField(term215408, term215408.getClass(), "year", 2022);
        setShortField(term215408, term215408.getClass(), "month", (short) 2);
        setShortField(term215408, term215408.getClass(), "day", (short) 27);
        setField(term215407, term215407.getClass(), "date", term215408);
        setByteField(term215412, term215412.getClass(), "hour", (byte) 8);
        setByteField(term215412, term215412.getClass(), "minute", (byte) 19);
        setByteField(term215412, term215412.getClass(), "second", (byte) 13);
        setIntField(term215412, term215412.getClass(), "nano", 625027479);
        setField(term215407, term215407.getClass(), "time", term215412);
        setField(term215381, term215381.getClass(), "accessTime", term215407);
        setField(term215379, term215379.getClass(), "card", term215381);
        setField(term215379, term215379.getClass(), "userName", "qlaCsDxgmf");
        setIntField(term215379, term215379.getClass(), "isNetMember", -222476680);
        setIntField(term215379, term215379.getClass(), "iconId", 714687545);
        setIntField(term215379, term215379.getClass(), "plateId", 1817543699);
        setIntField(term215379, term215379.getClass(), "titleId", 2115962141);
        setIntField(term215379, term215379.getClass(), "partnerId", -1497536978);
        setIntField(term215379, term215379.getClass(), "frameId", -777356780);
        setIntField(term215379, term215379.getClass(), "selectMapId", -433755466);
        setIntField(term215379, term215379.getClass(), "totalAwake", -662989137);
        setIntField(term215379, term215379.getClass(), "gradeRating", 1085222473);
        setIntField(term215379, term215379.getClass(), "musicRating", -1985615907);
        setIntField(term215379, term215379.getClass(), "playerRating", -670282000);
        setIntField(term215379, term215379.getClass(), "highestRating", -1243215597);
        setIntField(term215379, term215379.getClass(), "gradeRank", 739285728);
        setIntField(term215379, term215379.getClass(), "classRank", 895363317);
        setIntField(term215379, term215379.getClass(), "courseRank", -756616553);
        setField(term215379, term215379.getClass(), "charaSlot", term215444);
        setField(term215379, term215379.getClass(), "charaLockSlot", term215458);
        setLongField(term215379, term215379.getClass(), "contentBit", 8338369120556895460L);
        setIntField(term215379, term215379.getClass(), "playCount", -1861007560);
        setField(term215379, term215379.getClass(), "eventWatchedDate", "wxLOExZiQg");
        setField(term215379, term215379.getClass(), "lastGameId", "KqiIkkKUPx");
        setField(term215379, term215379.getClass(), "lastRomVersion", "GdKZQFSXLD");
        setField(term215379, term215379.getClass(), "lastDataVersion", "HFgSxxkaqY");
        setField(term215379, term215379.getClass(), "lastLoginDate", "YELYGfUdgT");
        setField(term215379, term215379.getClass(), "lastPlayDate", "uIuHcWMIiJ");
        setIntField(term215379, term215379.getClass(), "lastPlayCredit", 1071844053);
        setIntField(term215379, term215379.getClass(), "lastPlayMode", -602779235);
        setIntField(term215379, term215379.getClass(), "lastPlaceId", 4825650);
        setField(term215379, term215379.getClass(), "lastPlaceName", "yATyJhRInt");
        setIntField(term215379, term215379.getClass(), "lastAllNetId", -460932057);
        setIntField(term215379, term215379.getClass(), "lastRegionId", 1553110893);
        setField(term215379, term215379.getClass(), "lastRegionName", "TlmrfudqaW");
        setField(term215379, term215379.getClass(), "lastClientId", "gnpzTNFhwY");
        setField(term215379, term215379.getClass(), "lastCountryCode", "EcCtjFVSMK");
        setIntField(term215379, term215379.getClass(), "lastSelectEMoney", -770887424);
        setIntField(term215379, term215379.getClass(), "lastSelectTicket", -682694487);
        setIntField(term215379, term215379.getClass(), "lastSelectCourse", -1644654932);
        setIntField(term215379, term215379.getClass(), "lastCountCourse", -1690119901);
        setField(term215379, term215379.getClass(), "firstGameId", "DnpLIBKoLA");
        setField(term215379, term215379.getClass(), "firstRomVersion", "pfqWEoZXtC");
        setField(term215379, term215379.getClass(), "firstDataVersion", "SYKGoNqmJY");
        setField(term215379, term215379.getClass(), "firstPlayDate", "JLWTgXgipC");
        setField(term215379, term215379.getClass(), "compatibleCmVersion", "BdOiaBIODS");
        setField(term215379, term215379.getClass(), "dailyBonusDate", "UgDKJGfVSS");
        setField(term215379, term215379.getClass(), "dailyCourseBonusDate", "aUgfYtTQAR");
        setField(term215379, term215379.getClass(), "lastPairLoginDate", "qhvZoEnETl");
        setField(term215379, term215379.getClass(), "lastTrialPlayDate", "ltJbkkWjjz");
        setIntField(term215379, term215379.getClass(), "playVsCount", -1184354442);
        setIntField(term215379, term215379.getClass(), "playSyncCount", 1643203131);
        setIntField(term215379, term215379.getClass(), "winCount", 879850300);
        setIntField(term215379, term215379.getClass(), "helpCount", -328600136);
        setIntField(term215379, term215379.getClass(), "comboCount", -1356378874);
        setLongField(term215379, term215379.getClass(), "totalDeluxscore", 7154184307925982828L);
        setLongField(term215379, term215379.getClass(), "totalBasicDeluxscore", -5207730813547288172L);
        setLongField(term215379, term215379.getClass(), "totalAdvancedDeluxscore", -510937684670985529L);
        setLongField(term215379, term215379.getClass(), "totalExpertDeluxscore", 1192407558484496588L);
        setLongField(term215379, term215379.getClass(), "totalMasterDeluxscore", 8625975904896496353L);
        setLongField(term215379, term215379.getClass(), "totalReMasterDeluxscore", 6135307896569200631L);
        setIntField(term215379, term215379.getClass(), "totalSync", -1303299405);
        setIntField(term215379, term215379.getClass(), "totalBasicSync", -2110310382);
        setIntField(term215379, term215379.getClass(), "totalAdvancedSync", -794758258);
        setIntField(term215379, term215379.getClass(), "totalExpertSync", -935853011);
        setIntField(term215379, term215379.getClass(), "totalMasterSync", 531088094);
        setIntField(term215379, term215379.getClass(), "totalReMasterSync", -676106342);
        setLongField(term215379, term215379.getClass(), "totalAchievement", 1031054677094806315L);
        setLongField(term215379, term215379.getClass(), "totalBasicAchievement", -3656817367531185688L);
        setLongField(term215379, term215379.getClass(), "totalAdvancedAchievement", -3765180286128614822L);
        setLongField(term215379, term215379.getClass(), "totalExpertAchievement", 6084086533039418654L);
        setLongField(term215379, term215379.getClass(), "totalMasterAchievement", -8794861785844729014L);
        setLongField(term215379, term215379.getClass(), "totalReMasterAchievement", 3452505587260283465L);
        setLongField(term215379, term215379.getClass(), "playerOldRating", 2873446169751400735L);
        setLongField(term215379, term215379.getClass(), "playerNewRating", -5415998181117845748L);
        setIntField(term215379, term215379.getClass(), "banState", 1847578166);
        setLongField(term215379, term215379.getClass(), "dateTime", -2073927328205299283L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastClientId", argTypes, term215379, args);
    }

};


