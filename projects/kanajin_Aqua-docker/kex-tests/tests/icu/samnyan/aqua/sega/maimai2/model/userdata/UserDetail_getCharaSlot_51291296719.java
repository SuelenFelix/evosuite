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

public class UserDetail_getCharaSlot_51291296719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205837;

    public UserDetail_getCharaSlot_51291296719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term205841 = new Long(-278716491237139968L);
        ArrayList term205902 = new ArrayList();
        Integer term205908 = new Integer(647226080);
        Integer term205910 = new Integer(-1031047832);
        ArrayList term205906 = new ArrayList();
        ((ArrayList) term205906).add(term205908);
        ((ArrayList) term205906).add(term205910);
        term205837 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term205839 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term205855 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term205856 = newInstance(Class.forName("java.time.LocalDate"));
        Object term205860 = newInstance(Class.forName("java.time.LocalTime"));
        Object term205865 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term205866 = newInstance(Class.forName("java.time.LocalDate"));
        Object term205870 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term205837, term205837.getClass(), "id", -7350170920841451487L);
        setLongField(term205839, term205839.getClass(), "id", 2653221362782722700L);
        setField(term205839, term205839.getClass(), "extId", term205841);
        setField(term205839, term205839.getClass(), "luid", "tgIsmIybmg");
        setIntField(term205856, term205856.getClass(), "year", 2021);
        setShortField(term205856, term205856.getClass(), "month", (short) 9);
        setShortField(term205856, term205856.getClass(), "day", (short) 27);
        setField(term205855, term205855.getClass(), "date", term205856);
        setByteField(term205860, term205860.getClass(), "hour", (byte) 20);
        setByteField(term205860, term205860.getClass(), "minute", (byte) 43);
        setByteField(term205860, term205860.getClass(), "second", (byte) 41);
        setIntField(term205860, term205860.getClass(), "nano", 5544728);
        setField(term205855, term205855.getClass(), "time", term205860);
        setField(term205839, term205839.getClass(), "registerTime", term205855);
        setIntField(term205866, term205866.getClass(), "year", 2028);
        setShortField(term205866, term205866.getClass(), "month", (short) 1);
        setShortField(term205866, term205866.getClass(), "day", (short) 21);
        setField(term205865, term205865.getClass(), "date", term205866);
        setByteField(term205870, term205870.getClass(), "hour", (byte) 22);
        setByteField(term205870, term205870.getClass(), "minute", (byte) 51);
        setByteField(term205870, term205870.getClass(), "second", (byte) 58);
        setIntField(term205870, term205870.getClass(), "nano", 921867240);
        setField(term205865, term205865.getClass(), "time", term205870);
        setField(term205839, term205839.getClass(), "accessTime", term205865);
        setField(term205837, term205837.getClass(), "card", term205839);
        setField(term205837, term205837.getClass(), "userName", "SGouavfRbI");
        setIntField(term205837, term205837.getClass(), "isNetMember", -1587831293);
        setIntField(term205837, term205837.getClass(), "iconId", 139569150);
        setIntField(term205837, term205837.getClass(), "plateId", -1587632260);
        setIntField(term205837, term205837.getClass(), "titleId", 1221611988);
        setIntField(term205837, term205837.getClass(), "partnerId", 425460974);
        setIntField(term205837, term205837.getClass(), "frameId", -405289097);
        setIntField(term205837, term205837.getClass(), "selectMapId", -1702410002);
        setIntField(term205837, term205837.getClass(), "totalAwake", 1231954187);
        setIntField(term205837, term205837.getClass(), "gradeRating", 804645296);
        setIntField(term205837, term205837.getClass(), "musicRating", -1460116142);
        setIntField(term205837, term205837.getClass(), "playerRating", -17478491);
        setIntField(term205837, term205837.getClass(), "highestRating", -1929569879);
        setIntField(term205837, term205837.getClass(), "gradeRank", 474343023);
        setIntField(term205837, term205837.getClass(), "classRank", -1990377854);
        setIntField(term205837, term205837.getClass(), "courseRank", -1737041392);
        setField(term205837, term205837.getClass(), "charaSlot", term205902);
        setField(term205837, term205837.getClass(), "charaLockSlot", term205906);
        setLongField(term205837, term205837.getClass(), "contentBit", 6652481091992514132L);
        setIntField(term205837, term205837.getClass(), "playCount", 1664920870);
        setField(term205837, term205837.getClass(), "eventWatchedDate", "LHFmqVBPET");
        setField(term205837, term205837.getClass(), "lastGameId", "rLCUYvtbhV");
        setField(term205837, term205837.getClass(), "lastRomVersion", "jwsYMUZPuH");
        setField(term205837, term205837.getClass(), "lastDataVersion", "pvxICSHUwi");
        setField(term205837, term205837.getClass(), "lastLoginDate", "xBSvBKOUMw");
        setField(term205837, term205837.getClass(), "lastPlayDate", "AYiDtYzilr");
        setIntField(term205837, term205837.getClass(), "lastPlayCredit", 921567349);
        setIntField(term205837, term205837.getClass(), "lastPlayMode", 495324354);
        setIntField(term205837, term205837.getClass(), "lastPlaceId", 974817743);
        setField(term205837, term205837.getClass(), "lastPlaceName", "xiWHeKwudx");
        setIntField(term205837, term205837.getClass(), "lastAllNetId", 1644746758);
        setIntField(term205837, term205837.getClass(), "lastRegionId", -2021487528);
        setField(term205837, term205837.getClass(), "lastRegionName", "zohFMDNrFP");
        setField(term205837, term205837.getClass(), "lastClientId", "qHTRvVYigw");
        setField(term205837, term205837.getClass(), "lastCountryCode", "StTRztbwRa");
        setIntField(term205837, term205837.getClass(), "lastSelectEMoney", -431095319);
        setIntField(term205837, term205837.getClass(), "lastSelectTicket", -532520843);
        setIntField(term205837, term205837.getClass(), "lastSelectCourse", 1063976778);
        setIntField(term205837, term205837.getClass(), "lastCountCourse", -2086752166);
        setField(term205837, term205837.getClass(), "firstGameId", "yaHTLuJhNN");
        setField(term205837, term205837.getClass(), "firstRomVersion", "pukRdYaTyv");
        setField(term205837, term205837.getClass(), "firstDataVersion", "dZYivHUDDz");
        setField(term205837, term205837.getClass(), "firstPlayDate", "fFYUYuwUNT");
        setField(term205837, term205837.getClass(), "compatibleCmVersion", "rBiTyuMdrX");
        setField(term205837, term205837.getClass(), "dailyBonusDate", "GmjmDmQirY");
        setField(term205837, term205837.getClass(), "dailyCourseBonusDate", "ESLJSsMCwE");
        setField(term205837, term205837.getClass(), "lastPairLoginDate", "gRWTBdvpbA");
        setField(term205837, term205837.getClass(), "lastTrialPlayDate", "DCtDNafJTJ");
        setIntField(term205837, term205837.getClass(), "playVsCount", 100476034);
        setIntField(term205837, term205837.getClass(), "playSyncCount", 312816015);
        setIntField(term205837, term205837.getClass(), "winCount", -1965641431);
        setIntField(term205837, term205837.getClass(), "helpCount", 1087645970);
        setIntField(term205837, term205837.getClass(), "comboCount", 1832542619);
        setLongField(term205837, term205837.getClass(), "totalDeluxscore", 4242596542523572996L);
        setLongField(term205837, term205837.getClass(), "totalBasicDeluxscore", -1690749449533511258L);
        setLongField(term205837, term205837.getClass(), "totalAdvancedDeluxscore", -5250062924107433697L);
        setLongField(term205837, term205837.getClass(), "totalExpertDeluxscore", 635644609290288134L);
        setLongField(term205837, term205837.getClass(), "totalMasterDeluxscore", -5274409301562307821L);
        setLongField(term205837, term205837.getClass(), "totalReMasterDeluxscore", 5110037979366866852L);
        setIntField(term205837, term205837.getClass(), "totalSync", -892031259);
        setIntField(term205837, term205837.getClass(), "totalBasicSync", 1353006335);
        setIntField(term205837, term205837.getClass(), "totalAdvancedSync", -943705013);
        setIntField(term205837, term205837.getClass(), "totalExpertSync", 1210869725);
        setIntField(term205837, term205837.getClass(), "totalMasterSync", -1098995713);
        setIntField(term205837, term205837.getClass(), "totalReMasterSync", 1553880710);
        setLongField(term205837, term205837.getClass(), "totalAchievement", -8966055938077762580L);
        setLongField(term205837, term205837.getClass(), "totalBasicAchievement", -8363385849514417481L);
        setLongField(term205837, term205837.getClass(), "totalAdvancedAchievement", -9100238855755190537L);
        setLongField(term205837, term205837.getClass(), "totalExpertAchievement", -5901098675314427014L);
        setLongField(term205837, term205837.getClass(), "totalMasterAchievement", 6591121743024407908L);
        setLongField(term205837, term205837.getClass(), "totalReMasterAchievement", 5289337114081695862L);
        setLongField(term205837, term205837.getClass(), "playerOldRating", -3554506527130308058L);
        setLongField(term205837, term205837.getClass(), "playerNewRating", 3843626765557027078L);
        setIntField(term205837, term205837.getClass(), "banState", -1228290517);
        setLongField(term205837, term205837.getClass(), "dateTime", -526295297238874082L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharaSlot", argTypes, term205837, args);
    }

};


