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

public class UserDetail_getLastClientId_29512044936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215434;

    public UserDetail_getLastClientId_29512044936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term215438 = new Long(8073378116544724166L);
        Integer term215501 = new Integer(-924154861);
        Integer term215503 = new Integer(-1878694006);
        Integer term215505 = new Integer(1950167487);
        Integer term215507 = new Integer(1031826708);
        Integer term215509 = new Integer(-735726273);
        ArrayList term215499 = new ArrayList();
        ((ArrayList) term215499).add(term215501);
        ((ArrayList) term215499).add(term215503);
        ((ArrayList) term215499).add(term215505);
        ((ArrayList) term215499).add(term215507);
        ((ArrayList) term215499).add(term215509);
        Integer term215515 = new Integer(1618278091);
        Integer term215517 = new Integer(-548967985);
        Integer term215519 = new Integer(-1923425156);
        Integer term215521 = new Integer(1237861885);
        ArrayList term215513 = new ArrayList();
        ((ArrayList) term215513).add(term215515);
        ((ArrayList) term215513).add(term215517);
        ((ArrayList) term215513).add(term215519);
        ((ArrayList) term215513).add(term215521);
        term215434 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term215436 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term215452 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term215453 = newInstance(Class.forName("java.time.LocalDate"));
        Object term215457 = newInstance(Class.forName("java.time.LocalTime"));
        Object term215462 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term215463 = newInstance(Class.forName("java.time.LocalDate"));
        Object term215467 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term215434, term215434.getClass(), "id", 4166553518909175990L);
        setLongField(term215436, term215436.getClass(), "id", 1654276301502617595L);
        setField(term215436, term215436.getClass(), "extId", term215438);
        setField(term215436, term215436.getClass(), "luid", "ezaECgtjZY");
        setIntField(term215453, term215453.getClass(), "year", 2029);
        setShortField(term215453, term215453.getClass(), "month", (short) 9);
        setShortField(term215453, term215453.getClass(), "day", (short) 28);
        setField(term215452, term215452.getClass(), "date", term215453);
        setByteField(term215457, term215457.getClass(), "hour", (byte) 23);
        setByteField(term215457, term215457.getClass(), "minute", (byte) 32);
        setByteField(term215457, term215457.getClass(), "second", (byte) 19);
        setIntField(term215457, term215457.getClass(), "nano", 974262271);
        setField(term215452, term215452.getClass(), "time", term215457);
        setField(term215436, term215436.getClass(), "registerTime", term215452);
        setIntField(term215463, term215463.getClass(), "year", 2022);
        setShortField(term215463, term215463.getClass(), "month", (short) 2);
        setShortField(term215463, term215463.getClass(), "day", (short) 27);
        setField(term215462, term215462.getClass(), "date", term215463);
        setByteField(term215467, term215467.getClass(), "hour", (byte) 8);
        setByteField(term215467, term215467.getClass(), "minute", (byte) 19);
        setByteField(term215467, term215467.getClass(), "second", (byte) 13);
        setIntField(term215467, term215467.getClass(), "nano", 625027479);
        setField(term215462, term215462.getClass(), "time", term215467);
        setField(term215436, term215436.getClass(), "accessTime", term215462);
        setField(term215434, term215434.getClass(), "card", term215436);
        setField(term215434, term215434.getClass(), "userName", "qlaCsDxgmf");
        setIntField(term215434, term215434.getClass(), "isNetMember", -222476680);
        setIntField(term215434, term215434.getClass(), "iconId", 714687545);
        setIntField(term215434, term215434.getClass(), "plateId", 1817543699);
        setIntField(term215434, term215434.getClass(), "titleId", 2115962141);
        setIntField(term215434, term215434.getClass(), "partnerId", -1497536978);
        setIntField(term215434, term215434.getClass(), "frameId", -777356780);
        setIntField(term215434, term215434.getClass(), "selectMapId", -433755466);
        setIntField(term215434, term215434.getClass(), "totalAwake", -662989137);
        setIntField(term215434, term215434.getClass(), "gradeRating", 1085222473);
        setIntField(term215434, term215434.getClass(), "musicRating", -1985615907);
        setIntField(term215434, term215434.getClass(), "playerRating", -670282000);
        setIntField(term215434, term215434.getClass(), "highestRating", -1243215597);
        setIntField(term215434, term215434.getClass(), "gradeRank", 739285728);
        setIntField(term215434, term215434.getClass(), "classRank", 895363317);
        setIntField(term215434, term215434.getClass(), "courseRank", -756616553);
        setField(term215434, term215434.getClass(), "charaSlot", term215499);
        setField(term215434, term215434.getClass(), "charaLockSlot", term215513);
        setLongField(term215434, term215434.getClass(), "contentBit", 8338369120556895460L);
        setIntField(term215434, term215434.getClass(), "playCount", -1861007560);
        setField(term215434, term215434.getClass(), "eventWatchedDate", "wxLOExZiQg");
        setField(term215434, term215434.getClass(), "lastGameId", "KqiIkkKUPx");
        setField(term215434, term215434.getClass(), "lastRomVersion", "GdKZQFSXLD");
        setField(term215434, term215434.getClass(), "lastDataVersion", "HFgSxxkaqY");
        setField(term215434, term215434.getClass(), "lastLoginDate", "YELYGfUdgT");
        setField(term215434, term215434.getClass(), "lastPlayDate", "uIuHcWMIiJ");
        setIntField(term215434, term215434.getClass(), "lastPlayCredit", 1071844053);
        setIntField(term215434, term215434.getClass(), "lastPlayMode", -602779235);
        setIntField(term215434, term215434.getClass(), "lastPlaceId", 4825650);
        setField(term215434, term215434.getClass(), "lastPlaceName", "yATyJhRInt");
        setIntField(term215434, term215434.getClass(), "lastAllNetId", -460932057);
        setIntField(term215434, term215434.getClass(), "lastRegionId", 1553110893);
        setField(term215434, term215434.getClass(), "lastRegionName", "TlmrfudqaW");
        setField(term215434, term215434.getClass(), "lastClientId", "gnpzTNFhwY");
        setField(term215434, term215434.getClass(), "lastCountryCode", "EcCtjFVSMK");
        setIntField(term215434, term215434.getClass(), "lastSelectEMoney", -770887424);
        setIntField(term215434, term215434.getClass(), "lastSelectTicket", -682694487);
        setIntField(term215434, term215434.getClass(), "lastSelectCourse", -1644654932);
        setIntField(term215434, term215434.getClass(), "lastCountCourse", -1690119901);
        setField(term215434, term215434.getClass(), "firstGameId", "DnpLIBKoLA");
        setField(term215434, term215434.getClass(), "firstRomVersion", "pfqWEoZXtC");
        setField(term215434, term215434.getClass(), "firstDataVersion", "SYKGoNqmJY");
        setField(term215434, term215434.getClass(), "firstPlayDate", "JLWTgXgipC");
        setField(term215434, term215434.getClass(), "compatibleCmVersion", "BdOiaBIODS");
        setField(term215434, term215434.getClass(), "dailyBonusDate", "UgDKJGfVSS");
        setField(term215434, term215434.getClass(), "dailyCourseBonusDate", "aUgfYtTQAR");
        setField(term215434, term215434.getClass(), "lastPairLoginDate", "qhvZoEnETl");
        setField(term215434, term215434.getClass(), "lastTrialPlayDate", "ltJbkkWjjz");
        setIntField(term215434, term215434.getClass(), "playVsCount", -1184354442);
        setIntField(term215434, term215434.getClass(), "playSyncCount", 1643203131);
        setIntField(term215434, term215434.getClass(), "winCount", 879850300);
        setIntField(term215434, term215434.getClass(), "helpCount", -328600136);
        setIntField(term215434, term215434.getClass(), "comboCount", -1356378874);
        setLongField(term215434, term215434.getClass(), "totalDeluxscore", 7154184307925982828L);
        setLongField(term215434, term215434.getClass(), "totalBasicDeluxscore", -5207730813547288172L);
        setLongField(term215434, term215434.getClass(), "totalAdvancedDeluxscore", -510937684670985529L);
        setLongField(term215434, term215434.getClass(), "totalExpertDeluxscore", 1192407558484496588L);
        setLongField(term215434, term215434.getClass(), "totalMasterDeluxscore", 8625975904896496353L);
        setLongField(term215434, term215434.getClass(), "totalReMasterDeluxscore", 6135307896569200631L);
        setIntField(term215434, term215434.getClass(), "totalSync", -1303299405);
        setIntField(term215434, term215434.getClass(), "totalBasicSync", -2110310382);
        setIntField(term215434, term215434.getClass(), "totalAdvancedSync", -794758258);
        setIntField(term215434, term215434.getClass(), "totalExpertSync", -935853011);
        setIntField(term215434, term215434.getClass(), "totalMasterSync", 531088094);
        setIntField(term215434, term215434.getClass(), "totalReMasterSync", -676106342);
        setLongField(term215434, term215434.getClass(), "totalAchievement", 1031054677094806315L);
        setLongField(term215434, term215434.getClass(), "totalBasicAchievement", -3656817367531185688L);
        setLongField(term215434, term215434.getClass(), "totalAdvancedAchievement", -3765180286128614822L);
        setLongField(term215434, term215434.getClass(), "totalExpertAchievement", 6084086533039418654L);
        setLongField(term215434, term215434.getClass(), "totalMasterAchievement", -8794861785844729014L);
        setLongField(term215434, term215434.getClass(), "totalReMasterAchievement", 3452505587260283465L);
        setLongField(term215434, term215434.getClass(), "playerOldRating", 2873446169751400735L);
        setLongField(term215434, term215434.getClass(), "playerNewRating", -5415998181117845748L);
        setIntField(term215434, term215434.getClass(), "banState", 1847578166);
        setLongField(term215434, term215434.getClass(), "dateTime", -2073927328205299283L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastClientId", argTypes, term215434, args);
    }

};


