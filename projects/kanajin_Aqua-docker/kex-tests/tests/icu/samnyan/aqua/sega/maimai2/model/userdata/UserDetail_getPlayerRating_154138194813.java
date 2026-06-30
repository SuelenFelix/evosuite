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

public class UserDetail_getPlayerRating_154138194813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4236873;

    public UserDetail_getPlayerRating_154138194813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4236877 = new Long(-6290696433519340064L);
        Integer term4236940 = new Integer(-1444871975);
        ArrayList term4236938 = new ArrayList();
        ((ArrayList) term4236938).add(term4236940);
        Integer term4236946 = new Integer(16937693);
        Integer term4236948 = new Integer(449328397);
        Integer term4236950 = new Integer(2141163970);
        ArrayList term4236944 = new ArrayList();
        ((ArrayList) term4236944).add(term4236946);
        ((ArrayList) term4236944).add(term4236948);
        ((ArrayList) term4236944).add(term4236950);
        term4236873 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4236875 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4236891 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4236892 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4236896 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4236901 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4236902 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4236906 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4236873, term4236873.getClass(), "id", -1012826854658705705L);
        setLongField(term4236875, term4236875.getClass(), "id", -6091738047867420476L);
        setField(term4236875, term4236875.getClass(), "extId", term4236877);
        setField(term4236875, term4236875.getClass(), "luid", "HTocpTZPzB");
        setIntField(term4236892, term4236892.getClass(), "year", 2025);
        setShortField(term4236892, term4236892.getClass(), "month", (short) 6);
        setShortField(term4236892, term4236892.getClass(), "day", (short) 2);
        setField(term4236891, term4236891.getClass(), "date", term4236892);
        setByteField(term4236896, term4236896.getClass(), "hour", (byte) 17);
        setByteField(term4236896, term4236896.getClass(), "minute", (byte) 6);
        setByteField(term4236896, term4236896.getClass(), "second", (byte) 49);
        setIntField(term4236896, term4236896.getClass(), "nano", 350024186);
        setField(term4236891, term4236891.getClass(), "time", term4236896);
        setField(term4236875, term4236875.getClass(), "registerTime", term4236891);
        setIntField(term4236902, term4236902.getClass(), "year", 2016);
        setShortField(term4236902, term4236902.getClass(), "month", (short) 4);
        setShortField(term4236902, term4236902.getClass(), "day", (short) 13);
        setField(term4236901, term4236901.getClass(), "date", term4236902);
        setByteField(term4236906, term4236906.getClass(), "hour", (byte) 7);
        setByteField(term4236906, term4236906.getClass(), "minute", (byte) 1);
        setByteField(term4236906, term4236906.getClass(), "second", (byte) 29);
        setIntField(term4236906, term4236906.getClass(), "nano", 547257704);
        setField(term4236901, term4236901.getClass(), "time", term4236906);
        setField(term4236875, term4236875.getClass(), "accessTime", term4236901);
        setField(term4236873, term4236873.getClass(), "card", term4236875);
        setField(term4236873, term4236873.getClass(), "userName", "MVrklJYiqI");
        setIntField(term4236873, term4236873.getClass(), "isNetMember", -762192945);
        setIntField(term4236873, term4236873.getClass(), "iconId", -917715491);
        setIntField(term4236873, term4236873.getClass(), "plateId", -2122391951);
        setIntField(term4236873, term4236873.getClass(), "titleId", 1021815086);
        setIntField(term4236873, term4236873.getClass(), "partnerId", -1136622176);
        setIntField(term4236873, term4236873.getClass(), "frameId", 1729852956);
        setIntField(term4236873, term4236873.getClass(), "selectMapId", 705124193);
        setIntField(term4236873, term4236873.getClass(), "totalAwake", 728678205);
        setIntField(term4236873, term4236873.getClass(), "gradeRating", 2077569912);
        setIntField(term4236873, term4236873.getClass(), "musicRating", -1497464048);
        setIntField(term4236873, term4236873.getClass(), "playerRating", 1684190567);
        setIntField(term4236873, term4236873.getClass(), "highestRating", -439188792);
        setIntField(term4236873, term4236873.getClass(), "gradeRank", 294938555);
        setIntField(term4236873, term4236873.getClass(), "classRank", -1254824735);
        setIntField(term4236873, term4236873.getClass(), "courseRank", 150589933);
        setField(term4236873, term4236873.getClass(), "charaSlot", term4236938);
        setField(term4236873, term4236873.getClass(), "charaLockSlot", term4236944);
        setLongField(term4236873, term4236873.getClass(), "contentBit", -3624179625703887934L);
        setIntField(term4236873, term4236873.getClass(), "playCount", 771344171);
        setField(term4236873, term4236873.getClass(), "eventWatchedDate", "nylVvXPjKC");
        setField(term4236873, term4236873.getClass(), "lastGameId", "BzZBsmbaWY");
        setField(term4236873, term4236873.getClass(), "lastRomVersion", "fPrSrnfDxa");
        setField(term4236873, term4236873.getClass(), "lastDataVersion", "WpJPyYpvBY");
        setField(term4236873, term4236873.getClass(), "lastLoginDate", "yoIUeslHQb");
        setField(term4236873, term4236873.getClass(), "lastPlayDate", "KqMmJwYNtT");
        setIntField(term4236873, term4236873.getClass(), "lastPlayCredit", -1044316313);
        setIntField(term4236873, term4236873.getClass(), "lastPlayMode", 1588228137);
        setIntField(term4236873, term4236873.getClass(), "lastPlaceId", 1326110047);
        setField(term4236873, term4236873.getClass(), "lastPlaceName", "kdxcAcPGmQ");
        setIntField(term4236873, term4236873.getClass(), "lastAllNetId", 946230771);
        setIntField(term4236873, term4236873.getClass(), "lastRegionId", 602486448);
        setField(term4236873, term4236873.getClass(), "lastRegionName", "uobeGsAUfd");
        setField(term4236873, term4236873.getClass(), "lastClientId", "TtZZmonkLh");
        setField(term4236873, term4236873.getClass(), "lastCountryCode", "ygGHuWMdgT");
        setIntField(term4236873, term4236873.getClass(), "lastSelectEMoney", 1422901502);
        setIntField(term4236873, term4236873.getClass(), "lastSelectTicket", -588390438);
        setIntField(term4236873, term4236873.getClass(), "lastSelectCourse", -420316292);
        setIntField(term4236873, term4236873.getClass(), "lastCountCourse", 1361502923);
        setField(term4236873, term4236873.getClass(), "firstGameId", "mEnwyJpkeh");
        setField(term4236873, term4236873.getClass(), "firstRomVersion", "FfooPQNgQR");
        setField(term4236873, term4236873.getClass(), "firstDataVersion", "jfMzpoeJRV");
        setField(term4236873, term4236873.getClass(), "firstPlayDate", "fSeprDjJiL");
        setField(term4236873, term4236873.getClass(), "compatibleCmVersion", "BLvBZKEgui");
        setField(term4236873, term4236873.getClass(), "dailyBonusDate", "hTCReozcIn");
        setField(term4236873, term4236873.getClass(), "dailyCourseBonusDate", "GgHEkNrFed");
        setField(term4236873, term4236873.getClass(), "lastPairLoginDate", "xTreCMoArt");
        setField(term4236873, term4236873.getClass(), "lastTrialPlayDate", "vWYGJAvvHD");
        setIntField(term4236873, term4236873.getClass(), "playVsCount", -1147710930);
        setIntField(term4236873, term4236873.getClass(), "playSyncCount", 36636963);
        setIntField(term4236873, term4236873.getClass(), "winCount", 1858615771);
        setIntField(term4236873, term4236873.getClass(), "helpCount", 1212740874);
        setIntField(term4236873, term4236873.getClass(), "comboCount", 1226196172);
        setLongField(term4236873, term4236873.getClass(), "totalDeluxscore", 5397828847534467053L);
        setLongField(term4236873, term4236873.getClass(), "totalBasicDeluxscore", -7750412376608951053L);
        setLongField(term4236873, term4236873.getClass(), "totalAdvancedDeluxscore", -4139430832839609351L);
        setLongField(term4236873, term4236873.getClass(), "totalExpertDeluxscore", 7842395815256968543L);
        setLongField(term4236873, term4236873.getClass(), "totalMasterDeluxscore", -7289114963070969052L);
        setLongField(term4236873, term4236873.getClass(), "totalReMasterDeluxscore", -2941177414802400076L);
        setIntField(term4236873, term4236873.getClass(), "totalSync", -1556878374);
        setIntField(term4236873, term4236873.getClass(), "totalBasicSync", -723630594);
        setIntField(term4236873, term4236873.getClass(), "totalAdvancedSync", -810968280);
        setIntField(term4236873, term4236873.getClass(), "totalExpertSync", 1949015019);
        setIntField(term4236873, term4236873.getClass(), "totalMasterSync", 1725050862);
        setIntField(term4236873, term4236873.getClass(), "totalReMasterSync", -765119726);
        setLongField(term4236873, term4236873.getClass(), "totalAchievement", -8771995254629939357L);
        setLongField(term4236873, term4236873.getClass(), "totalBasicAchievement", 8823207568464469733L);
        setLongField(term4236873, term4236873.getClass(), "totalAdvancedAchievement", 5878699767399822212L);
        setLongField(term4236873, term4236873.getClass(), "totalExpertAchievement", 9133002077620273125L);
        setLongField(term4236873, term4236873.getClass(), "totalMasterAchievement", 1026566034357040787L);
        setLongField(term4236873, term4236873.getClass(), "totalReMasterAchievement", -7218832338892574798L);
        setLongField(term4236873, term4236873.getClass(), "playerOldRating", 4978258080096739711L);
        setLongField(term4236873, term4236873.getClass(), "playerNewRating", 949126136986579604L);
        setIntField(term4236873, term4236873.getClass(), "banState", -2066378522);
        setLongField(term4236873, term4236873.getClass(), "dateTime", 4384568163416412926L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRating", argTypes, term4236873, args);
    }

};


