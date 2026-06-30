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

public class UserDetail_getLastPlayMode_209234209130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212044;

    public UserDetail_getLastPlayMode_209234209130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term212048 = new Long(-8306611953768020559L);
        Integer term212111 = new Integer(-547325184);
        Integer term212113 = new Integer(1470261214);
        Integer term212115 = new Integer(1402619496);
        ArrayList term212109 = new ArrayList();
        ((ArrayList) term212109).add(term212111);
        ((ArrayList) term212109).add(term212113);
        ((ArrayList) term212109).add(term212115);
        Integer term212121 = new Integer(1253501512);
        Integer term212123 = new Integer(594655877);
        Integer term212125 = new Integer(281155455);
        Integer term212127 = new Integer(85079003);
        Integer term212129 = new Integer(-2010823131);
        Integer term212131 = new Integer(-1368198865);
        Integer term212133 = new Integer(-14635574);
        ArrayList term212119 = new ArrayList();
        ((ArrayList) term212119).add(term212121);
        ((ArrayList) term212119).add(term212123);
        ((ArrayList) term212119).add(term212125);
        ((ArrayList) term212119).add(term212127);
        ((ArrayList) term212119).add(term212129);
        ((ArrayList) term212119).add(term212131);
        ((ArrayList) term212119).add(term212133);
        term212044 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term212046 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term212062 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term212063 = newInstance(Class.forName("java.time.LocalDate"));
        Object term212067 = newInstance(Class.forName("java.time.LocalTime"));
        Object term212072 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term212073 = newInstance(Class.forName("java.time.LocalDate"));
        Object term212077 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term212044, term212044.getClass(), "id", -8684145874664265954L);
        setLongField(term212046, term212046.getClass(), "id", 6184486464044924915L);
        setField(term212046, term212046.getClass(), "extId", term212048);
        setField(term212046, term212046.getClass(), "luid", "JeoRsvMLJu");
        setIntField(term212063, term212063.getClass(), "year", 2027);
        setShortField(term212063, term212063.getClass(), "month", (short) 2);
        setShortField(term212063, term212063.getClass(), "day", (short) 11);
        setField(term212062, term212062.getClass(), "date", term212063);
        setByteField(term212067, term212067.getClass(), "hour", (byte) 8);
        setByteField(term212067, term212067.getClass(), "minute", (byte) 5);
        setByteField(term212067, term212067.getClass(), "second", (byte) 22);
        setIntField(term212067, term212067.getClass(), "nano", 32017661);
        setField(term212062, term212062.getClass(), "time", term212067);
        setField(term212046, term212046.getClass(), "registerTime", term212062);
        setIntField(term212073, term212073.getClass(), "year", 2025);
        setShortField(term212073, term212073.getClass(), "month", (short) 9);
        setShortField(term212073, term212073.getClass(), "day", (short) 24);
        setField(term212072, term212072.getClass(), "date", term212073);
        setByteField(term212077, term212077.getClass(), "hour", (byte) 4);
        setByteField(term212077, term212077.getClass(), "minute", (byte) 49);
        setByteField(term212077, term212077.getClass(), "second", (byte) 51);
        setIntField(term212077, term212077.getClass(), "nano", 103885357);
        setField(term212072, term212072.getClass(), "time", term212077);
        setField(term212046, term212046.getClass(), "accessTime", term212072);
        setField(term212044, term212044.getClass(), "card", term212046);
        setField(term212044, term212044.getClass(), "userName", "NqFbjpqVyg");
        setIntField(term212044, term212044.getClass(), "isNetMember", -743128849);
        setIntField(term212044, term212044.getClass(), "iconId", 2106293234);
        setIntField(term212044, term212044.getClass(), "plateId", -1923952746);
        setIntField(term212044, term212044.getClass(), "titleId", -148556232);
        setIntField(term212044, term212044.getClass(), "partnerId", 1463939393);
        setIntField(term212044, term212044.getClass(), "frameId", 1437316718);
        setIntField(term212044, term212044.getClass(), "selectMapId", -1967495289);
        setIntField(term212044, term212044.getClass(), "totalAwake", 359190711);
        setIntField(term212044, term212044.getClass(), "gradeRating", 440478914);
        setIntField(term212044, term212044.getClass(), "musicRating", -2057546484);
        setIntField(term212044, term212044.getClass(), "playerRating", -506584220);
        setIntField(term212044, term212044.getClass(), "highestRating", 1245589816);
        setIntField(term212044, term212044.getClass(), "gradeRank", -1631923422);
        setIntField(term212044, term212044.getClass(), "classRank", -139570037);
        setIntField(term212044, term212044.getClass(), "courseRank", -2107792262);
        setField(term212044, term212044.getClass(), "charaSlot", term212109);
        setField(term212044, term212044.getClass(), "charaLockSlot", term212119);
        setLongField(term212044, term212044.getClass(), "contentBit", 118121846535536532L);
        setIntField(term212044, term212044.getClass(), "playCount", -1575358689);
        setField(term212044, term212044.getClass(), "eventWatchedDate", "hijcLDmzdk");
        setField(term212044, term212044.getClass(), "lastGameId", "UYyogsENOg");
        setField(term212044, term212044.getClass(), "lastRomVersion", "NDsTwzxgnZ");
        setField(term212044, term212044.getClass(), "lastDataVersion", "GZCtzcvbAL");
        setField(term212044, term212044.getClass(), "lastLoginDate", "wyOTuvqxiR");
        setField(term212044, term212044.getClass(), "lastPlayDate", "xMLjisTCEc");
        setIntField(term212044, term212044.getClass(), "lastPlayCredit", -1187736992);
        setIntField(term212044, term212044.getClass(), "lastPlayMode", 1979137255);
        setIntField(term212044, term212044.getClass(), "lastPlaceId", 761578264);
        setField(term212044, term212044.getClass(), "lastPlaceName", "nGnUuIuxio");
        setIntField(term212044, term212044.getClass(), "lastAllNetId", -44684070);
        setIntField(term212044, term212044.getClass(), "lastRegionId", 1156887680);
        setField(term212044, term212044.getClass(), "lastRegionName", "jBEIwVuxjq");
        setField(term212044, term212044.getClass(), "lastClientId", "KQpsxSLFZN");
        setField(term212044, term212044.getClass(), "lastCountryCode", "BNJVoYwjAZ");
        setIntField(term212044, term212044.getClass(), "lastSelectEMoney", -1707544833);
        setIntField(term212044, term212044.getClass(), "lastSelectTicket", -1188072095);
        setIntField(term212044, term212044.getClass(), "lastSelectCourse", -129083358);
        setIntField(term212044, term212044.getClass(), "lastCountCourse", 490738811);
        setField(term212044, term212044.getClass(), "firstGameId", "lVfKFsFBWA");
        setField(term212044, term212044.getClass(), "firstRomVersion", "VdFBFoszPe");
        setField(term212044, term212044.getClass(), "firstDataVersion", "rvwSslhUVa");
        setField(term212044, term212044.getClass(), "firstPlayDate", "EZOoIMIpbM");
        setField(term212044, term212044.getClass(), "compatibleCmVersion", "GhqMKYSXsr");
        setField(term212044, term212044.getClass(), "dailyBonusDate", "ingAwvtJee");
        setField(term212044, term212044.getClass(), "dailyCourseBonusDate", "vWDwaLjhUo");
        setField(term212044, term212044.getClass(), "lastPairLoginDate", "LtqQluOtgh");
        setField(term212044, term212044.getClass(), "lastTrialPlayDate", "FCowYViZtk");
        setIntField(term212044, term212044.getClass(), "playVsCount", 25569400);
        setIntField(term212044, term212044.getClass(), "playSyncCount", 584372068);
        setIntField(term212044, term212044.getClass(), "winCount", 1228941953);
        setIntField(term212044, term212044.getClass(), "helpCount", 776859255);
        setIntField(term212044, term212044.getClass(), "comboCount", -1731141151);
        setLongField(term212044, term212044.getClass(), "totalDeluxscore", 5879904684522357083L);
        setLongField(term212044, term212044.getClass(), "totalBasicDeluxscore", -5691889245806551277L);
        setLongField(term212044, term212044.getClass(), "totalAdvancedDeluxscore", -6512389011040053178L);
        setLongField(term212044, term212044.getClass(), "totalExpertDeluxscore", 2334977869221007279L);
        setLongField(term212044, term212044.getClass(), "totalMasterDeluxscore", -2975258849885931140L);
        setLongField(term212044, term212044.getClass(), "totalReMasterDeluxscore", -6003717814161098421L);
        setIntField(term212044, term212044.getClass(), "totalSync", -1411813271);
        setIntField(term212044, term212044.getClass(), "totalBasicSync", -300044781);
        setIntField(term212044, term212044.getClass(), "totalAdvancedSync", 78380856);
        setIntField(term212044, term212044.getClass(), "totalExpertSync", 901638935);
        setIntField(term212044, term212044.getClass(), "totalMasterSync", -285544051);
        setIntField(term212044, term212044.getClass(), "totalReMasterSync", 351554192);
        setLongField(term212044, term212044.getClass(), "totalAchievement", -3020253339404333814L);
        setLongField(term212044, term212044.getClass(), "totalBasicAchievement", -6839370691097851368L);
        setLongField(term212044, term212044.getClass(), "totalAdvancedAchievement", 2413473793515484262L);
        setLongField(term212044, term212044.getClass(), "totalExpertAchievement", 3186712876103459676L);
        setLongField(term212044, term212044.getClass(), "totalMasterAchievement", 2148631260120813269L);
        setLongField(term212044, term212044.getClass(), "totalReMasterAchievement", 1440382768463203956L);
        setLongField(term212044, term212044.getClass(), "playerOldRating", -9211601132420767727L);
        setLongField(term212044, term212044.getClass(), "playerNewRating", 3544417781644525084L);
        setIntField(term212044, term212044.getClass(), "banState", -830429483);
        setLongField(term212044, term212044.getClass(), "dateTime", -683827499199595227L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastPlayMode", argTypes, term212044, args);
    }

};


