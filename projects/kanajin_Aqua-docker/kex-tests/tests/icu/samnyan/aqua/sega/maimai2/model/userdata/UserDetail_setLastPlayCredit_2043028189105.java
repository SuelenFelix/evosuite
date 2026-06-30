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

public class UserDetail_setLastPlayCredit_2043028189105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4289298;
     Object term4289649;

    public UserDetail_setLastPlayCredit_2043028189105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4289302 = new Long(-8600281105080826389L);
        Integer term4289365 = new Integer(-2102777765);
        Integer term4289367 = new Integer(994126300);
        Integer term4289369 = new Integer(-1753144993);
        Integer term4289371 = new Integer(-829086350);
        ArrayList term4289363 = new ArrayList();
        ((ArrayList) term4289363).add(term4289365);
        ((ArrayList) term4289363).add(term4289367);
        ((ArrayList) term4289363).add(term4289369);
        ((ArrayList) term4289363).add(term4289371);
        Integer term4289377 = new Integer(1784256355);
        Integer term4289379 = new Integer(1725956287);
        ArrayList term4289375 = new ArrayList();
        ((ArrayList) term4289375).add(term4289377);
        ((ArrayList) term4289375).add(term4289379);
        term4289298 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4289300 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4289316 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4289317 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4289321 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4289326 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4289327 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4289331 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4289298, term4289298.getClass(), "id", 1083285056505674636L);
        setLongField(term4289300, term4289300.getClass(), "id", 4074454836889971556L);
        setField(term4289300, term4289300.getClass(), "extId", term4289302);
        setField(term4289300, term4289300.getClass(), "luid", "RYNGZvQiRt");
        setIntField(term4289317, term4289317.getClass(), "year", 2020);
        setShortField(term4289317, term4289317.getClass(), "month", (short) 11);
        setShortField(term4289317, term4289317.getClass(), "day", (short) 16);
        setField(term4289316, term4289316.getClass(), "date", term4289317);
        setByteField(term4289321, term4289321.getClass(), "hour", (byte) 18);
        setByteField(term4289321, term4289321.getClass(), "minute", (byte) 52);
        setByteField(term4289321, term4289321.getClass(), "second", (byte) 54);
        setIntField(term4289321, term4289321.getClass(), "nano", 672680583);
        setField(term4289316, term4289316.getClass(), "time", term4289321);
        setField(term4289300, term4289300.getClass(), "registerTime", term4289316);
        setIntField(term4289327, term4289327.getClass(), "year", 2021);
        setShortField(term4289327, term4289327.getClass(), "month", (short) 10);
        setShortField(term4289327, term4289327.getClass(), "day", (short) 14);
        setField(term4289326, term4289326.getClass(), "date", term4289327);
        setByteField(term4289331, term4289331.getClass(), "hour", (byte) 1);
        setByteField(term4289331, term4289331.getClass(), "minute", (byte) 36);
        setByteField(term4289331, term4289331.getClass(), "second", (byte) 14);
        setIntField(term4289331, term4289331.getClass(), "nano", 573770158);
        setField(term4289326, term4289326.getClass(), "time", term4289331);
        setField(term4289300, term4289300.getClass(), "accessTime", term4289326);
        setField(term4289298, term4289298.getClass(), "card", term4289300);
        setField(term4289298, term4289298.getClass(), "userName", "PzsZJeSxGX");
        setIntField(term4289298, term4289298.getClass(), "isNetMember", -751827764);
        setIntField(term4289298, term4289298.getClass(), "iconId", -513034951);
        setIntField(term4289298, term4289298.getClass(), "plateId", 1045794456);
        setIntField(term4289298, term4289298.getClass(), "titleId", 1392795628);
        setIntField(term4289298, term4289298.getClass(), "partnerId", 334307742);
        setIntField(term4289298, term4289298.getClass(), "frameId", -1460600170);
        setIntField(term4289298, term4289298.getClass(), "selectMapId", 1003817642);
        setIntField(term4289298, term4289298.getClass(), "totalAwake", 331953495);
        setIntField(term4289298, term4289298.getClass(), "gradeRating", 689338060);
        setIntField(term4289298, term4289298.getClass(), "musicRating", 1616217913);
        setIntField(term4289298, term4289298.getClass(), "playerRating", -1506628925);
        setIntField(term4289298, term4289298.getClass(), "highestRating", -1920825127);
        setIntField(term4289298, term4289298.getClass(), "gradeRank", -591066004);
        setIntField(term4289298, term4289298.getClass(), "classRank", -715747905);
        setIntField(term4289298, term4289298.getClass(), "courseRank", -1509740816);
        setField(term4289298, term4289298.getClass(), "charaSlot", term4289363);
        setField(term4289298, term4289298.getClass(), "charaLockSlot", term4289375);
        setLongField(term4289298, term4289298.getClass(), "contentBit", 240409562714960646L);
        setIntField(term4289298, term4289298.getClass(), "playCount", -1769498211);
        setField(term4289298, term4289298.getClass(), "eventWatchedDate", "TLjTftyaem");
        setField(term4289298, term4289298.getClass(), "lastGameId", "bqBpqHdAtD");
        setField(term4289298, term4289298.getClass(), "lastRomVersion", "ZGmSEiiytc");
        setField(term4289298, term4289298.getClass(), "lastDataVersion", "UsLvFTPBVe");
        setField(term4289298, term4289298.getClass(), "lastLoginDate", "ESFirDDuZA");
        setField(term4289298, term4289298.getClass(), "lastPlayDate", "yaDKLcVjNF");
        setIntField(term4289298, term4289298.getClass(), "lastPlayCredit", -129518655);
        setIntField(term4289298, term4289298.getClass(), "lastPlayMode", 1239029461);
        setIntField(term4289298, term4289298.getClass(), "lastPlaceId", -1690405460);
        setField(term4289298, term4289298.getClass(), "lastPlaceName", "PfiBIUuSIe");
        setIntField(term4289298, term4289298.getClass(), "lastAllNetId", -199821836);
        setIntField(term4289298, term4289298.getClass(), "lastRegionId", -1392711544);
        setField(term4289298, term4289298.getClass(), "lastRegionName", "RuZEVuWoCq");
        setField(term4289298, term4289298.getClass(), "lastClientId", "tWXvXtWnTb");
        setField(term4289298, term4289298.getClass(), "lastCountryCode", "oDrXbxPAMp");
        setIntField(term4289298, term4289298.getClass(), "lastSelectEMoney", 1788166654);
        setIntField(term4289298, term4289298.getClass(), "lastSelectTicket", 820653901);
        setIntField(term4289298, term4289298.getClass(), "lastSelectCourse", 506403778);
        setIntField(term4289298, term4289298.getClass(), "lastCountCourse", 735638417);
        setField(term4289298, term4289298.getClass(), "firstGameId", "okFzEkcSSv");
        setField(term4289298, term4289298.getClass(), "firstRomVersion", "GPQTEOSzcu");
        setField(term4289298, term4289298.getClass(), "firstDataVersion", "xTkIgGHoze");
        setField(term4289298, term4289298.getClass(), "firstPlayDate", "NQxLSovZeE");
        setField(term4289298, term4289298.getClass(), "compatibleCmVersion", "TIsWnyVKGc");
        setField(term4289298, term4289298.getClass(), "dailyBonusDate", "MqoHRjbVHv");
        setField(term4289298, term4289298.getClass(), "dailyCourseBonusDate", "CYDnmXPJrI");
        setField(term4289298, term4289298.getClass(), "lastPairLoginDate", "bOxPbhCsdk");
        setField(term4289298, term4289298.getClass(), "lastTrialPlayDate", "NYfNzByOpJ");
        setIntField(term4289298, term4289298.getClass(), "playVsCount", -1901461869);
        setIntField(term4289298, term4289298.getClass(), "playSyncCount", -940059456);
        setIntField(term4289298, term4289298.getClass(), "winCount", -1314505960);
        setIntField(term4289298, term4289298.getClass(), "helpCount", 965943952);
        setIntField(term4289298, term4289298.getClass(), "comboCount", -1098888949);
        setLongField(term4289298, term4289298.getClass(), "totalDeluxscore", 5791873308101692479L);
        setLongField(term4289298, term4289298.getClass(), "totalBasicDeluxscore", 1187219434108130053L);
        setLongField(term4289298, term4289298.getClass(), "totalAdvancedDeluxscore", 5712639227131742563L);
        setLongField(term4289298, term4289298.getClass(), "totalExpertDeluxscore", -892098629846879798L);
        setLongField(term4289298, term4289298.getClass(), "totalMasterDeluxscore", 7874796266418135333L);
        setLongField(term4289298, term4289298.getClass(), "totalReMasterDeluxscore", 3907027481451301987L);
        setIntField(term4289298, term4289298.getClass(), "totalSync", 25089400);
        setIntField(term4289298, term4289298.getClass(), "totalBasicSync", -2060910814);
        setIntField(term4289298, term4289298.getClass(), "totalAdvancedSync", -238147276);
        setIntField(term4289298, term4289298.getClass(), "totalExpertSync", -375424900);
        setIntField(term4289298, term4289298.getClass(), "totalMasterSync", -711511901);
        setIntField(term4289298, term4289298.getClass(), "totalReMasterSync", 501383491);
        setLongField(term4289298, term4289298.getClass(), "totalAchievement", -6422434182015016621L);
        setLongField(term4289298, term4289298.getClass(), "totalBasicAchievement", 8803621322993811723L);
        setLongField(term4289298, term4289298.getClass(), "totalAdvancedAchievement", 2437120536853725744L);
        setLongField(term4289298, term4289298.getClass(), "totalExpertAchievement", 6970015356438580176L);
        setLongField(term4289298, term4289298.getClass(), "totalMasterAchievement", -3364810296711778884L);
        setLongField(term4289298, term4289298.getClass(), "totalReMasterAchievement", 5408971888119097718L);
        setLongField(term4289298, term4289298.getClass(), "playerOldRating", -3096312344197646537L);
        setLongField(term4289298, term4289298.getClass(), "playerNewRating", 4806824827622589595L);
        setIntField(term4289298, term4289298.getClass(), "banState", -1271070855);
        setLongField(term4289298, term4289298.getClass(), "dateTime", -6973614791591983384L);
        term4289649 = new Integer(-862953374);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4289649;
        callMethod(klass, "setLastPlayCredit", argTypes, term4289298, args);
    }

};


