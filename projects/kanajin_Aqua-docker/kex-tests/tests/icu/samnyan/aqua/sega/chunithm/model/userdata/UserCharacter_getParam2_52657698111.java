package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserCharacter_getParam2_52657698111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112841;

    public UserCharacter_getParam2_52657698111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term112847 = new Long(-1145146470850585022L);
        term112841 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter"));
        Object term112843 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term112845 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term112861 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112862 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112866 = newInstance(Class.forName("java.time.LocalTime"));
        Object term112871 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112872 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112876 = newInstance(Class.forName("java.time.LocalTime"));
        Object term112893 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112894 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112898 = newInstance(Class.forName("java.time.LocalTime"));
        Object term112954 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term112955 = newInstance(Class.forName("java.time.LocalDate"));
        Object term112959 = newInstance(Class.forName("java.time.LocalTime"));
        Object term113002 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term113003 = newInstance(Class.forName("java.time.LocalDate"));
        Object term113007 = newInstance(Class.forName("java.time.LocalTime"));
        Object term113048 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term113049 = newInstance(Class.forName("java.time.LocalDate"));
        Object term113053 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term112841, term112841.getClass(), "id", 1617580635228094061L);
        setLongField(term112843, term112843.getClass(), "id", 1814900684861511674L);
        setLongField(term112845, term112845.getClass(), "id", 5234836956955605304L);
        setField(term112845, term112845.getClass(), "extId", term112847);
        setField(term112845, term112845.getClass(), "luid", "XiytdmxGYa");
        setIntField(term112862, term112862.getClass(), "year", 2024);
        setShortField(term112862, term112862.getClass(), "month", (short) 5);
        setShortField(term112862, term112862.getClass(), "day", (short) 16);
        setField(term112861, term112861.getClass(), "date", term112862);
        setByteField(term112866, term112866.getClass(), "hour", (byte) 12);
        setByteField(term112866, term112866.getClass(), "minute", (byte) 27);
        setByteField(term112866, term112866.getClass(), "second", (byte) 12);
        setIntField(term112866, term112866.getClass(), "nano", 36169190);
        setField(term112861, term112861.getClass(), "time", term112866);
        setField(term112845, term112845.getClass(), "registerTime", term112861);
        setIntField(term112872, term112872.getClass(), "year", 2016);
        setShortField(term112872, term112872.getClass(), "month", (short) 12);
        setShortField(term112872, term112872.getClass(), "day", (short) 12);
        setField(term112871, term112871.getClass(), "date", term112872);
        setByteField(term112876, term112876.getClass(), "hour", (byte) 8);
        setByteField(term112876, term112876.getClass(), "minute", (byte) 56);
        setByteField(term112876, term112876.getClass(), "second", (byte) 11);
        setIntField(term112876, term112876.getClass(), "nano", 369122424);
        setField(term112871, term112871.getClass(), "time", term112876);
        setField(term112845, term112845.getClass(), "accessTime", term112871);
        setField(term112843, term112843.getClass(), "card", term112845);
        setField(term112843, term112843.getClass(), "userName", "xuWbTDWaJN");
        setIntField(term112894, term112894.getClass(), "year", 2023);
        setShortField(term112894, term112894.getClass(), "month", (short) 1);
        setShortField(term112894, term112894.getClass(), "day", (short) 29);
        setField(term112893, term112893.getClass(), "date", term112894);
        setByteField(term112898, term112898.getClass(), "hour", (byte) 20);
        setByteField(term112898, term112898.getClass(), "minute", (byte) 44);
        setByteField(term112898, term112898.getClass(), "second", (byte) 51);
        setIntField(term112898, term112898.getClass(), "nano", 702242021);
        setField(term112893, term112893.getClass(), "time", term112898);
        setField(term112843, term112843.getClass(), "lastLoginDate", term112893);
        setBooleanField(term112843, term112843.getClass(), "isWebJoin", false);
        setField(term112843, term112843.getClass(), "webLimitDate", "LvZCXbeNaa");
        setIntField(term112843, term112843.getClass(), "level", -294800497);
        setIntField(term112843, term112843.getClass(), "reincarnationNum", 979334169);
        setField(term112843, term112843.getClass(), "exp", "CaxKtuZUJI");
        setLongField(term112843, term112843.getClass(), "point", -3576853629648013478L);
        setLongField(term112843, term112843.getClass(), "totalPoint", 3816599890845966921L);
        setIntField(term112843, term112843.getClass(), "playCount", 840412156);
        setIntField(term112843, term112843.getClass(), "multiPlayCount", 788624942);
        setIntField(term112843, term112843.getClass(), "multiWinCount", -1174113610);
        setIntField(term112843, term112843.getClass(), "requestResCount", -438676054);
        setIntField(term112843, term112843.getClass(), "acceptResCount", -1032395364);
        setIntField(term112843, term112843.getClass(), "successResCount", -552556865);
        setIntField(term112843, term112843.getClass(), "playerRating", -1908071026);
        setIntField(term112843, term112843.getClass(), "highestRating", 737590127);
        setIntField(term112843, term112843.getClass(), "nameplateId", 1091000908);
        setIntField(term112843, term112843.getClass(), "frameId", 417959197);
        setIntField(term112843, term112843.getClass(), "characterId", 736672515);
        setIntField(term112843, term112843.getClass(), "trophyId", 1093266289);
        setIntField(term112843, term112843.getClass(), "playedTutorialBit", -1407865478);
        setIntField(term112843, term112843.getClass(), "firstTutorialCancelNum", 1207025764);
        setIntField(term112843, term112843.getClass(), "masterTutorialCancelNum", -220584965);
        setIntField(term112843, term112843.getClass(), "totalRepertoireCount", -1579060613);
        setIntField(term112843, term112843.getClass(), "totalMapNum", -975355295);
        setLongField(term112843, term112843.getClass(), "totalHiScore", 792163591827266376L);
        setLongField(term112843, term112843.getClass(), "totalBasicHighScore", -4750734247445918143L);
        setLongField(term112843, term112843.getClass(), "totalAdvancedHighScore", -6408813588921610323L);
        setLongField(term112843, term112843.getClass(), "totalExpertHighScore", 3457189632555792192L);
        setLongField(term112843, term112843.getClass(), "totalMasterHighScore", 9010920462347251642L);
        setIntField(term112955, term112955.getClass(), "year", 2022);
        setShortField(term112955, term112955.getClass(), "month", (short) 10);
        setShortField(term112955, term112955.getClass(), "day", (short) 20);
        setField(term112954, term112954.getClass(), "date", term112955);
        setByteField(term112959, term112959.getClass(), "hour", (byte) 5);
        setByteField(term112959, term112959.getClass(), "minute", (byte) 59);
        setByteField(term112959, term112959.getClass(), "second", (byte) 46);
        setIntField(term112959, term112959.getClass(), "nano", 530355310);
        setField(term112954, term112954.getClass(), "time", term112959);
        setField(term112843, term112843.getClass(), "eventWatchedDate", term112954);
        setIntField(term112843, term112843.getClass(), "friendCount", 2023713138);
        setBooleanField(term112843, term112843.getClass(), "isMaimai", false);
        setField(term112843, term112843.getClass(), "firstGameId", "wokzuoOQRu");
        setField(term112843, term112843.getClass(), "firstRomVersion", "jIVcJcAtbp");
        setField(term112843, term112843.getClass(), "firstDataVersion", "eugajHLhOv");
        setIntField(term113003, term113003.getClass(), "year", 2023);
        setShortField(term113003, term113003.getClass(), "month", (short) 4);
        setShortField(term113003, term113003.getClass(), "day", (short) 27);
        setField(term113002, term113002.getClass(), "date", term113003);
        setByteField(term113007, term113007.getClass(), "hour", (byte) 8);
        setByteField(term113007, term113007.getClass(), "minute", (byte) 20);
        setByteField(term113007, term113007.getClass(), "second", (byte) 4);
        setIntField(term113007, term113007.getClass(), "nano", 953803286);
        setField(term113002, term113002.getClass(), "time", term113007);
        setField(term112843, term112843.getClass(), "firstPlayDate", term113002);
        setField(term112843, term112843.getClass(), "lastGameId", "sCSkTLnMUp");
        setField(term112843, term112843.getClass(), "lastRomVersion", "MGfUFAWSlA");
        setField(term112843, term112843.getClass(), "lastDataVersion", "eCRXbBPOdv");
        setIntField(term113049, term113049.getClass(), "year", 2013);
        setShortField(term113049, term113049.getClass(), "month", (short) 11);
        setShortField(term113049, term113049.getClass(), "day", (short) 9);
        setField(term113048, term113048.getClass(), "date", term113049);
        setByteField(term113053, term113053.getClass(), "hour", (byte) 22);
        setByteField(term113053, term113053.getClass(), "minute", (byte) 35);
        setByteField(term113053, term113053.getClass(), "second", (byte) 26);
        setIntField(term113053, term113053.getClass(), "nano", 558003682);
        setField(term113048, term113048.getClass(), "time", term113053);
        setField(term112843, term112843.getClass(), "lastPlayDate", term113048);
        setIntField(term112843, term112843.getClass(), "lastPlaceId", -1417229054);
        setField(term112843, term112843.getClass(), "lastPlaceName", "eNcuSzCfin");
        setField(term112843, term112843.getClass(), "lastRegionId", "lujQENuAbC");
        setField(term112843, term112843.getClass(), "lastRegionName", "qkbmnArlda");
        setField(term112843, term112843.getClass(), "lastAllNetId", "yvOcemZnPj");
        setField(term112843, term112843.getClass(), "lastClientId", "xAxPUWaeyn");
        setField(term112841, term112841.getClass(), "user", term112843);
        setIntField(term112841, term112841.getClass(), "characterId", 1916815084);
        setIntField(term112841, term112841.getClass(), "playCount", -1194686394);
        setIntField(term112841, term112841.getClass(), "level", 1);
        setIntField(term112841, term112841.getClass(), "skillId", 535352285);
        setIntField(term112841, term112841.getClass(), "friendshipExp", -427127256);
        setBooleanField(term112841, term112841.getClass(), "isValid", true);
        setBooleanField(term112841, term112841.getClass(), "isNewMark", true);
        setIntField(term112841, term112841.getClass(), "param1", -1844788019);
        setIntField(term112841, term112841.getClass(), "param2", 1373587197);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParam2", argTypes, term112841, args);
    }

};


