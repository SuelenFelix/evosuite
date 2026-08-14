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

public class UserDetail_getCharaSlot_51291296718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205782;

    public UserDetail_getCharaSlot_51291296718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term205786 = new Long(-278716491237139968L);
        ArrayList term205847 = new ArrayList();
        Integer term205853 = new Integer(647226080);
        Integer term205855 = new Integer(-1031047832);
        ArrayList term205851 = new ArrayList();
        ((ArrayList) term205851).add(term205853);
        ((ArrayList) term205851).add(term205855);
        term205782 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term205784 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term205800 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term205801 = newInstance(Class.forName("java.time.LocalDate"));
        Object term205805 = newInstance(Class.forName("java.time.LocalTime"));
        Object term205810 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term205811 = newInstance(Class.forName("java.time.LocalDate"));
        Object term205815 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term205782, term205782.getClass(), "id", -7350170920841451487L);
        setLongField(term205784, term205784.getClass(), "id", 2653221362782722700L);
        setField(term205784, term205784.getClass(), "extId", term205786);
        setField(term205784, term205784.getClass(), "luid", "tgIsmIybmg");
        setIntField(term205801, term205801.getClass(), "year", 2021);
        setShortField(term205801, term205801.getClass(), "month", (short) 9);
        setShortField(term205801, term205801.getClass(), "day", (short) 27);
        setField(term205800, term205800.getClass(), "date", term205801);
        setByteField(term205805, term205805.getClass(), "hour", (byte) 20);
        setByteField(term205805, term205805.getClass(), "minute", (byte) 43);
        setByteField(term205805, term205805.getClass(), "second", (byte) 41);
        setIntField(term205805, term205805.getClass(), "nano", 5544728);
        setField(term205800, term205800.getClass(), "time", term205805);
        setField(term205784, term205784.getClass(), "registerTime", term205800);
        setIntField(term205811, term205811.getClass(), "year", 2028);
        setShortField(term205811, term205811.getClass(), "month", (short) 1);
        setShortField(term205811, term205811.getClass(), "day", (short) 21);
        setField(term205810, term205810.getClass(), "date", term205811);
        setByteField(term205815, term205815.getClass(), "hour", (byte) 22);
        setByteField(term205815, term205815.getClass(), "minute", (byte) 51);
        setByteField(term205815, term205815.getClass(), "second", (byte) 58);
        setIntField(term205815, term205815.getClass(), "nano", 921867240);
        setField(term205810, term205810.getClass(), "time", term205815);
        setField(term205784, term205784.getClass(), "accessTime", term205810);
        setField(term205782, term205782.getClass(), "card", term205784);
        setField(term205782, term205782.getClass(), "userName", "SGouavfRbI");
        setIntField(term205782, term205782.getClass(), "isNetMember", -1587831293);
        setIntField(term205782, term205782.getClass(), "iconId", 139569150);
        setIntField(term205782, term205782.getClass(), "plateId", -1587632260);
        setIntField(term205782, term205782.getClass(), "titleId", 1221611988);
        setIntField(term205782, term205782.getClass(), "partnerId", 425460974);
        setIntField(term205782, term205782.getClass(), "frameId", -405289097);
        setIntField(term205782, term205782.getClass(), "selectMapId", -1702410002);
        setIntField(term205782, term205782.getClass(), "totalAwake", 1231954187);
        setIntField(term205782, term205782.getClass(), "gradeRating", 804645296);
        setIntField(term205782, term205782.getClass(), "musicRating", -1460116142);
        setIntField(term205782, term205782.getClass(), "playerRating", -17478491);
        setIntField(term205782, term205782.getClass(), "highestRating", -1929569879);
        setIntField(term205782, term205782.getClass(), "gradeRank", 474343023);
        setIntField(term205782, term205782.getClass(), "classRank", -1990377854);
        setIntField(term205782, term205782.getClass(), "courseRank", -1737041392);
        setField(term205782, term205782.getClass(), "charaSlot", term205847);
        setField(term205782, term205782.getClass(), "charaLockSlot", term205851);
        setLongField(term205782, term205782.getClass(), "contentBit", 6652481091992514132L);
        setIntField(term205782, term205782.getClass(), "playCount", 1664920870);
        setField(term205782, term205782.getClass(), "eventWatchedDate", "LHFmqVBPET");
        setField(term205782, term205782.getClass(), "lastGameId", "rLCUYvtbhV");
        setField(term205782, term205782.getClass(), "lastRomVersion", "jwsYMUZPuH");
        setField(term205782, term205782.getClass(), "lastDataVersion", "pvxICSHUwi");
        setField(term205782, term205782.getClass(), "lastLoginDate", "xBSvBKOUMw");
        setField(term205782, term205782.getClass(), "lastPlayDate", "AYiDtYzilr");
        setIntField(term205782, term205782.getClass(), "lastPlayCredit", 921567349);
        setIntField(term205782, term205782.getClass(), "lastPlayMode", 495324354);
        setIntField(term205782, term205782.getClass(), "lastPlaceId", 974817743);
        setField(term205782, term205782.getClass(), "lastPlaceName", "xiWHeKwudx");
        setIntField(term205782, term205782.getClass(), "lastAllNetId", 1644746758);
        setIntField(term205782, term205782.getClass(), "lastRegionId", -2021487528);
        setField(term205782, term205782.getClass(), "lastRegionName", "zohFMDNrFP");
        setField(term205782, term205782.getClass(), "lastClientId", "qHTRvVYigw");
        setField(term205782, term205782.getClass(), "lastCountryCode", "StTRztbwRa");
        setIntField(term205782, term205782.getClass(), "lastSelectEMoney", -431095319);
        setIntField(term205782, term205782.getClass(), "lastSelectTicket", -532520843);
        setIntField(term205782, term205782.getClass(), "lastSelectCourse", 1063976778);
        setIntField(term205782, term205782.getClass(), "lastCountCourse", -2086752166);
        setField(term205782, term205782.getClass(), "firstGameId", "yaHTLuJhNN");
        setField(term205782, term205782.getClass(), "firstRomVersion", "pukRdYaTyv");
        setField(term205782, term205782.getClass(), "firstDataVersion", "dZYivHUDDz");
        setField(term205782, term205782.getClass(), "firstPlayDate", "fFYUYuwUNT");
        setField(term205782, term205782.getClass(), "compatibleCmVersion", "rBiTyuMdrX");
        setField(term205782, term205782.getClass(), "dailyBonusDate", "GmjmDmQirY");
        setField(term205782, term205782.getClass(), "dailyCourseBonusDate", "ESLJSsMCwE");
        setField(term205782, term205782.getClass(), "lastPairLoginDate", "gRWTBdvpbA");
        setField(term205782, term205782.getClass(), "lastTrialPlayDate", "DCtDNafJTJ");
        setIntField(term205782, term205782.getClass(), "playVsCount", 100476034);
        setIntField(term205782, term205782.getClass(), "playSyncCount", 312816015);
        setIntField(term205782, term205782.getClass(), "winCount", -1965641431);
        setIntField(term205782, term205782.getClass(), "helpCount", 1087645970);
        setIntField(term205782, term205782.getClass(), "comboCount", 1832542619);
        setLongField(term205782, term205782.getClass(), "totalDeluxscore", 4242596542523572996L);
        setLongField(term205782, term205782.getClass(), "totalBasicDeluxscore", -1690749449533511258L);
        setLongField(term205782, term205782.getClass(), "totalAdvancedDeluxscore", -5250062924107433697L);
        setLongField(term205782, term205782.getClass(), "totalExpertDeluxscore", 635644609290288134L);
        setLongField(term205782, term205782.getClass(), "totalMasterDeluxscore", -5274409301562307821L);
        setLongField(term205782, term205782.getClass(), "totalReMasterDeluxscore", 5110037979366866852L);
        setIntField(term205782, term205782.getClass(), "totalSync", -892031259);
        setIntField(term205782, term205782.getClass(), "totalBasicSync", 1353006335);
        setIntField(term205782, term205782.getClass(), "totalAdvancedSync", -943705013);
        setIntField(term205782, term205782.getClass(), "totalExpertSync", 1210869725);
        setIntField(term205782, term205782.getClass(), "totalMasterSync", -1098995713);
        setIntField(term205782, term205782.getClass(), "totalReMasterSync", 1553880710);
        setLongField(term205782, term205782.getClass(), "totalAchievement", -8966055938077762580L);
        setLongField(term205782, term205782.getClass(), "totalBasicAchievement", -8363385849514417481L);
        setLongField(term205782, term205782.getClass(), "totalAdvancedAchievement", -9100238855755190537L);
        setLongField(term205782, term205782.getClass(), "totalExpertAchievement", -5901098675314427014L);
        setLongField(term205782, term205782.getClass(), "totalMasterAchievement", 6591121743024407908L);
        setLongField(term205782, term205782.getClass(), "totalReMasterAchievement", 5289337114081695862L);
        setLongField(term205782, term205782.getClass(), "playerOldRating", -3554506527130308058L);
        setLongField(term205782, term205782.getClass(), "playerNewRating", 3843626765557027078L);
        setIntField(term205782, term205782.getClass(), "banState", -1228290517);
        setLongField(term205782, term205782.getClass(), "dateTime", -526295297238874082L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharaSlot", argTypes, term205782, args);
    }

};


